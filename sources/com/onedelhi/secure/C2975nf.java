package com.onedelhi.secure;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: com.onedelhi.secure.nf */
public abstract class C2975nf implements View.OnTouchListener {

    /* renamed from: a */
    public static final float f17341a = 0.0f;

    /* renamed from: b */
    public static final float f17342b = Float.MAX_VALUE;

    /* renamed from: c */
    public static final float f17343c = 0.0f;

    /* renamed from: d */
    public static final float f17344d = Float.MAX_VALUE;

    /* renamed from: e */
    public static final float f17345e = 0.2f;

    /* renamed from: f */
    public static final float f17346f = 1.0f;

    /* renamed from: p */
    public static final int f17347p = 0;

    /* renamed from: q */
    public static final int f17348q = 1;

    /* renamed from: r */
    public static final int f17349r = 2;

    /* renamed from: s */
    public static final int f17350s = 0;

    /* renamed from: t */
    public static final int f17351t = 1;

    /* renamed from: u */
    public static final int f17352u = 1;

    /* renamed from: v */
    public static final int f17353v = 315;

    /* renamed from: w */
    public static final int f17354w = 1575;

    /* renamed from: x */
    public static final int f17355x = ViewConfiguration.getTapTimeout();

    /* renamed from: y */
    public static final int f17356y = 500;

    /* renamed from: z */
    public static final int f17357z = 500;

    /* renamed from: a */
    public final View f17358a;

    /* renamed from: a */
    public final Interpolator f17359a = new AccelerateInterpolator();

    /* renamed from: a */
    public final C2976a f17360a = new C2976a();

    /* renamed from: a */
    public Runnable f17361a;

    /* renamed from: a */
    public float[] f17362a = {0.0f, 0.0f};

    /* renamed from: b */
    public boolean f17363b;

    /* renamed from: b */
    public float[] f17364b = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: c */
    public boolean f17365c;

    /* renamed from: c */
    public float[] f17366c = {0.0f, 0.0f};

    /* renamed from: d */
    public boolean f17367d;

    /* renamed from: d */
    public float[] f17368d = {0.0f, 0.0f};

    /* renamed from: e */
    public boolean f17369e;

    /* renamed from: e */
    public float[] f17370e = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: f */
    public boolean f17371f;

    /* renamed from: g */
    public boolean f17372g;

    /* renamed from: n */
    public int f17373n;

    /* renamed from: o */
    public int f17374o;

    /* renamed from: com.onedelhi.secure.nf$a */
    public static class C2976a {

        /* renamed from: a */
        public float f17375a;

        /* renamed from: a */
        public int f17376a;

        /* renamed from: a */
        public long f17377a = Long.MIN_VALUE;

        /* renamed from: b */
        public float f17378b;

        /* renamed from: b */
        public int f17379b;

        /* renamed from: b */
        public long f17380b = 0;

        /* renamed from: c */
        public float f17381c;

        /* renamed from: c */
        public int f17382c = 0;

        /* renamed from: c */
        public long f17383c = -1;

        /* renamed from: d */
        public int f17384d = 0;

        /* renamed from: e */
        public int f17385e;

        /* renamed from: a */
        public void mo21192a() {
            if (this.f17380b != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = mo21198g(mo21196e(currentAnimationTimeMillis));
                this.f17380b = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f17380b)) * g;
                this.f17382c = (int) (this.f17375a * f);
                this.f17384d = (int) (f * this.f17378b);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo21193b() {
            return this.f17382c;
        }

        /* renamed from: c */
        public int mo21194c() {
            return this.f17384d;
        }

        /* renamed from: d */
        public int mo21195d() {
            float f = this.f17375a;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float mo21196e(long j) {
            long j2 = this.f17377a;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f17383c;
            if (j3 < 0 || j < j3) {
                return C2975nf.m22720e(((float) (j - j2)) / ((float) this.f17376a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f17381c;
            return (1.0f - f) + (f * C2975nf.m22720e(((float) (j - j3)) / ((float) this.f17385e), 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int mo21197f() {
            float f = this.f17378b;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float mo21198g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean mo21199h() {
            return this.f17383c > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f17383c + ((long) this.f17385e);
        }

        /* renamed from: i */
        public void mo21200i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f17385e = C2975nf.m22721f((int) (currentAnimationTimeMillis - this.f17377a), 0, this.f17379b);
            this.f17381c = mo21196e(currentAnimationTimeMillis);
            this.f17383c = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo21201j(int i) {
            this.f17379b = i;
        }

        /* renamed from: k */
        public void mo21202k(int i) {
            this.f17376a = i;
        }

        /* renamed from: l */
        public void mo21203l(float f, float f2) {
            this.f17375a = f;
            this.f17378b = f2;
        }

        /* renamed from: m */
        public void mo21204m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f17377a = currentAnimationTimeMillis;
            this.f17383c = -1;
            this.f17380b = currentAnimationTimeMillis;
            this.f17381c = 0.5f;
            this.f17382c = 0;
            this.f17384d = 0;
        }
    }

    /* renamed from: com.onedelhi.secure.nf$b */
    public class C2977b implements Runnable {
        public C2977b() {
        }

        public void run() {
            C2975nf nfVar = C2975nf.this;
            if (nfVar.f17369e) {
                if (nfVar.f17365c) {
                    nfVar.f17365c = false;
                    nfVar.f17360a.mo21204m();
                }
                C2976a aVar = C2975nf.this.f17360a;
                if (aVar.mo21199h() || !C2975nf.this.mo21190x()) {
                    C2975nf.this.f17369e = false;
                    return;
                }
                C2975nf nfVar2 = C2975nf.this;
                if (nfVar2.f17367d) {
                    nfVar2.f17367d = false;
                    nfVar2.mo21171c();
                }
                aVar.mo21192a();
                C2975nf.this.mo18894l(aVar.mo21193b(), aVar.mo21194c());
                jt4.m18993p1(C2975nf.this.f17358a, this);
            }
        }
    }

    public C2975nf(@mr2 View view) {
        this.f17358a = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo21184r(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo21185s(f3, f3);
        mo21179n(1);
        mo21183q(Float.MAX_VALUE, Float.MAX_VALUE);
        mo21188v(0.2f, 0.2f);
        mo21189w(1.0f, 1.0f);
        mo21178m(f17355x);
        mo21187u(500);
        mo21186t(500);
    }

    /* renamed from: e */
    public static float m22720e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m22721f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo18892a(int i);

    /* renamed from: b */
    public abstract boolean mo18893b(int i);

    /* renamed from: c */
    public void mo21171c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f17358a.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float mo21172d(int i, float f, float f2, float f3) {
        float h = mo21174h(this.f17362a[i], f2, this.f17364b[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f17366c[i];
        float f5 = this.f17368d[i];
        float f6 = this.f17370e[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m22720e(h * f7, f5, f6) : -m22720e((-h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float mo21173g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f17373n;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f17369e || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    public final float mo21174h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m22720e(f * f2, 0.0f, f3);
        float g = mo21173g(f2 - f4, e) - mo21173g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f17359a.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f17359a.getInterpolation(g);
        }
        return m22720e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public boolean mo21175i() {
        return this.f17371f;
    }

    /* renamed from: j */
    public boolean mo21176j() {
        return this.f17372g;
    }

    /* renamed from: k */
    public final void mo21177k() {
        if (this.f17365c) {
            this.f17369e = false;
        } else {
            this.f17360a.mo21200i();
        }
    }

    /* renamed from: l */
    public abstract void mo18894l(int i, int i2);

    @mr2
    /* renamed from: m */
    public C2975nf mo21178m(int i) {
        this.f17374o = i;
        return this;
    }

    @mr2
    /* renamed from: n */
    public C2975nf mo21179n(int i) {
        this.f17373n = i;
        return this;
    }

    /* renamed from: o */
    public C2975nf mo21180o(boolean z) {
        if (this.f17371f && !z) {
            mo21177k();
        }
        this.f17371f = z;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f17371f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.mo21177k()
            goto L_0x0058
        L_0x001a:
            r5.f17367d = r2
            r5.f17363b = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f17358a
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo21172d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f17358a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo21172d(r2, r7, r6, r3)
            com.onedelhi.secure.nf$a r7 = r5.f17360a
            r7.mo21203l(r0, r6)
            boolean r6 = r5.f17369e
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo21190x()
            if (r6 == 0) goto L_0x0058
            r5.mo21191y()
        L_0x0058:
            boolean r6 = r5.f17372g
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f17369e
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2975nf.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C2975nf mo21182p(boolean z) {
        this.f17372g = z;
        return this;
    }

    @mr2
    /* renamed from: q */
    public C2975nf mo21183q(float f, float f2) {
        float[] fArr = this.f17364b;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @mr2
    /* renamed from: r */
    public C2975nf mo21184r(float f, float f2) {
        float[] fArr = this.f17370e;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @mr2
    /* renamed from: s */
    public C2975nf mo21185s(float f, float f2) {
        float[] fArr = this.f17368d;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @mr2
    /* renamed from: t */
    public C2975nf mo21186t(int i) {
        this.f17360a.mo21201j(i);
        return this;
    }

    @mr2
    /* renamed from: u */
    public C2975nf mo21187u(int i) {
        this.f17360a.mo21202k(i);
        return this;
    }

    @mr2
    /* renamed from: v */
    public C2975nf mo21188v(float f, float f2) {
        float[] fArr = this.f17362a;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @mr2
    /* renamed from: w */
    public C2975nf mo21189w(float f, float f2) {
        float[] fArr = this.f17366c;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: x */
    public boolean mo21190x() {
        C2976a aVar = this.f17360a;
        int f = aVar.mo21197f();
        int d = aVar.mo21195d();
        return (f != 0 && mo18893b(f)) || (d != 0 && mo18892a(d));
    }

    /* renamed from: y */
    public final void mo21191y() {
        int i;
        if (this.f17361a == null) {
            this.f17361a = new C2977b();
        }
        this.f17369e = true;
        this.f17365c = true;
        if (this.f17363b || (i = this.f17374o) <= 0) {
            this.f17361a.run();
        } else {
            jt4.m18997q1(this.f17358a, this.f17361a, (long) i);
        }
        this.f17363b = true;
    }
}
