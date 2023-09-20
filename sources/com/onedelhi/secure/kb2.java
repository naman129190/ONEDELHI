package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class kb2 implements C2355hm {

    /* renamed from: a */
    public static final Bitmap.Config f14802a = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public static final String f14803a = "LruBitmapPool";

    /* renamed from: a */
    public int f14804a;

    /* renamed from: a */
    public final long f14805a;

    /* renamed from: a */
    public final C2613a f14806a;

    /* renamed from: a */
    public final ob2 f14807a;

    /* renamed from: a */
    public final Set<Bitmap.Config> f14808a;

    /* renamed from: b */
    public int f14809b;

    /* renamed from: b */
    public long f14810b;

    /* renamed from: c */
    public int f14811c;

    /* renamed from: c */
    public long f14812c;

    /* renamed from: d */
    public int f14813d;

    /* renamed from: com.onedelhi.secure.kb2$a */
    public interface C2613a {
        /* renamed from: a */
        void mo18979a(Bitmap bitmap);

        /* renamed from: b */
        void mo18980b(Bitmap bitmap);
    }

    /* renamed from: com.onedelhi.secure.kb2$b */
    public static final class C2614b implements C2613a {
        /* renamed from: a */
        public void mo18979a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo18980b(Bitmap bitmap) {
        }
    }

    /* renamed from: com.onedelhi.secure.kb2$c */
    public static class C2615c implements C2613a {

        /* renamed from: a */
        public final Set<Bitmap> f14814a = Collections.synchronizedSet(new HashSet());

        /* renamed from: a */
        public void mo18979a(Bitmap bitmap) {
            if (this.f14814a.contains(bitmap)) {
                this.f14814a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        /* renamed from: b */
        public void mo18980b(Bitmap bitmap) {
            if (!this.f14814a.contains(bitmap)) {
                this.f14814a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    public kb2(long j) {
        this(j, m19600p(), m19599o());
    }

    public kb2(long j, ob2 ob2, Set<Bitmap.Config> set) {
        this.f14805a = j;
        this.f14810b = j;
        this.f14807a = ob2;
        this.f14808a = set;
        this.f14806a = new C2614b();
    }

    public kb2(long j, Set<Bitmap.Config> set) {
        this(j, m19600p(), set);
    }

    @TargetApi(26)
    /* renamed from: h */
    public static void m19597h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @mr2
    /* renamed from: i */
    public static Bitmap m19598i(int i, int i2, @ts2 Bitmap.Config config) {
        if (config == null) {
            config = f14802a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: o */
    public static Set<Bitmap.Config> m19599o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: p */
    public static ob2 m19600p() {
        return new rz3();
    }

    @TargetApi(19)
    /* renamed from: s */
    public static void m19601s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: u */
    public static void m19602u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m19601s(bitmap);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo17341a(int i) {
        if (Log.isLoggable(f14803a, 3)) {
            Log.d(f14803a, "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo17342b();
        } else if (i >= 20 || i == 15) {
            mo18978v(mo17344e() / 2);
        }
    }

    /* renamed from: b */
    public void mo17342b() {
        if (Log.isLoggable(f14803a, 3)) {
            Log.d(f14803a, "clearMemory");
        }
        mo18978v(0);
    }

    /* renamed from: c */
    public synchronized void mo16798c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f14807a.mo14599e(bitmap)) <= this.f14810b) {
                        if (this.f14808a.contains(bitmap.getConfig())) {
                            int e = this.f14807a.mo14599e(bitmap);
                            this.f14807a.mo14597c(bitmap);
                            this.f14806a.mo18980b(bitmap);
                            this.f14811c++;
                            this.f14812c += (long) e;
                            if (Log.isLoggable(f14803a, 2)) {
                                Log.v(f14803a, "Put bitmap in pool=" + this.f14807a.mo14596b(bitmap));
                            }
                            mo18970j();
                            mo18972l();
                            return;
                        }
                    }
                    if (Log.isLoggable(f14803a, 2)) {
                        Log.v(f14803a, "Reject bitmap from pool, bitmap: " + this.f14807a.mo14596b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f14808a.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @mr2
    /* renamed from: d */
    public Bitmap mo17343d(int i, int i2, Bitmap.Config config) {
        Bitmap q = mo18975q(i, i2, config);
        if (q == null) {
            return m19598i(i, i2, config);
        }
        q.eraseColor(0);
        return q;
    }

    /* renamed from: e */
    public long mo17344e() {
        return this.f14810b;
    }

    /* renamed from: f */
    public synchronized void mo17345f(float f) {
        this.f14810b = (long) Math.round(((float) this.f14805a) * f);
        mo18972l();
    }

    @mr2
    /* renamed from: g */
    public Bitmap mo17346g(int i, int i2, Bitmap.Config config) {
        Bitmap q = mo18975q(i, i2, config);
        return q == null ? m19598i(i, i2, config) : q;
    }

    /* renamed from: j */
    public final void mo18970j() {
        if (Log.isLoggable(f14803a, 2)) {
            mo18971k();
        }
    }

    /* renamed from: k */
    public final void mo18971k() {
        Log.v(f14803a, "Hits=" + this.f14804a + ", misses=" + this.f14809b + ", puts=" + this.f14811c + ", evictions=" + this.f14813d + ", currentSize=" + this.f14812c + ", maxSize=" + this.f14810b + "\nStrategy=" + this.f14807a);
    }

    /* renamed from: l */
    public final void mo18972l() {
        mo18978v(this.f14810b);
    }

    /* renamed from: m */
    public long mo18973m() {
        return (long) this.f14813d;
    }

    /* renamed from: n */
    public long mo18974n() {
        return this.f14812c;
    }

    @ts2
    /* renamed from: q */
    public final synchronized Bitmap mo18975q(int i, int i2, @ts2 Bitmap.Config config) {
        Bitmap d;
        m19597h(config);
        d = this.f14807a.mo14598d(i, i2, config != null ? config : f14802a);
        if (d == null) {
            if (Log.isLoggable(f14803a, 3)) {
                Log.d(f14803a, "Missing bitmap=" + this.f14807a.mo14595a(i, i2, config));
            }
            this.f14809b++;
        } else {
            this.f14804a++;
            this.f14812c -= (long) this.f14807a.mo14599e(d);
            this.f14806a.mo18979a(d);
            m19602u(d);
        }
        if (Log.isLoggable(f14803a, 2)) {
            Log.v(f14803a, "Get bitmap=" + this.f14807a.mo14595a(i, i2, config));
        }
        mo18970j();
        return d;
    }

    /* renamed from: r */
    public long mo18976r() {
        return (long) this.f14804a;
    }

    /* renamed from: t */
    public long mo18977t() {
        return (long) this.f14809b;
    }

    /* renamed from: v */
    public final synchronized void mo18978v(long j) {
        while (this.f14812c > j) {
            Bitmap f = this.f14807a.mo14600f();
            if (f == null) {
                if (Log.isLoggable(f14803a, 5)) {
                    Log.w(f14803a, "Size mismatch, resetting");
                    mo18971k();
                }
                this.f14812c = 0;
                return;
            }
            this.f14806a.mo18979a(f);
            this.f14812c -= (long) this.f14807a.mo14599e(f);
            this.f14813d++;
            if (Log.isLoggable(f14803a, 3)) {
                Log.d(f14803a, "Evicting bitmap=" + this.f14807a.mo14596b(f));
            }
            mo18970j();
            f.recycle();
        }
    }
}
