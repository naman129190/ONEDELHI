package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.onedelhi.secure.jm */
public final class C2526jm implements Runnable {

    /* renamed from: b */
    public static final C2527a f14259b = new C2527a();
    @hw4

    /* renamed from: b */
    public static final String f14260b = "PreFillRunner";

    /* renamed from: c */
    public static final long f14261c = 32;

    /* renamed from: d */
    public static final long f14262d = 40;

    /* renamed from: e */
    public static final long f14263e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: n */
    public static final int f14264n = 4;

    /* renamed from: a */
    public final Handler f14265a;

    /* renamed from: a */
    public final a43 f14266a;

    /* renamed from: a */
    public final C2355hm f14267a;

    /* renamed from: a */
    public final C2527a f14268a;

    /* renamed from: a */
    public final rg2 f14269a;

    /* renamed from: a */
    public final Set<b43> f14270a;

    /* renamed from: b */
    public long f14271b;

    /* renamed from: b */
    public boolean f14272b;

    @hw4
    /* renamed from: com.onedelhi.secure.jm$a */
    public static class C2527a {
        /* renamed from: a */
        public long mo18481a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: com.onedelhi.secure.jm$b */
    public static final class C2528b implements ky1 {
        /* renamed from: a */
        public void mo13311a(@mr2 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public C2526jm(C2355hm hmVar, rg2 rg2, a43 a43) {
        this(hmVar, rg2, a43, f14259b, new Handler(Looper.getMainLooper()));
    }

    @hw4
    public C2526jm(C2355hm hmVar, rg2 rg2, a43 a43, C2527a aVar, Handler handler) {
        this.f14270a = new HashSet();
        this.f14271b = 40;
        this.f14267a = hmVar;
        this.f14269a = rg2;
        this.f14266a = a43;
        this.f14268a = aVar;
        this.f14265a = handler;
    }

    @hw4
    /* renamed from: a */
    public boolean mo18475a() {
        Bitmap bitmap;
        long a = this.f14268a.mo18481a();
        while (!this.f14266a.mo12703b() && !mo18479e(a)) {
            b43 c = this.f14266a.mo12704c();
            if (!this.f14270a.contains(c)) {
                this.f14270a.add(c);
                bitmap = this.f14267a.mo17346g(c.mo13401d(), c.mo13399b(), c.mo13398a());
            } else {
                bitmap = Bitmap.createBitmap(c.mo13401d(), c.mo13399b(), c.mo13398a());
            }
            int h = oq4.m24020h(bitmap);
            if (mo18477c() >= ((long) h)) {
                this.f14269a.mo22372d(new C2528b(), C2768lm.m20843f(bitmap, this.f14267a));
            } else {
                this.f14267a.mo16798c(bitmap);
            }
            if (Log.isLoggable(f14260b, 3)) {
                Log.d(f14260b, "allocated [" + c.mo13401d() + "x" + c.mo13399b() + "] " + c.mo13398a() + " size: " + h);
            }
        }
        return !this.f14272b && !this.f14266a.mo12703b();
    }

    /* renamed from: b */
    public void mo18476b() {
        this.f14272b = true;
    }

    /* renamed from: c */
    public final long mo18477c() {
        return this.f14269a.mo23853e() - this.f14269a.mo23852c();
    }

    /* renamed from: d */
    public final long mo18478d() {
        long j = this.f14271b;
        this.f14271b = Math.min(4 * j, f14263e);
        return j;
    }

    /* renamed from: e */
    public final boolean mo18479e(long j) {
        return this.f14268a.mo18481a() - j >= 32;
    }

    public void run() {
        if (mo18475a()) {
            this.f14265a.postDelayed(this, mo18478d());
        }
    }
}
