package com.onedelhi.secure;

public final class rk1 {

    /* renamed from: d */
    public static final float f19905d = 0.4f;

    /* renamed from: e */
    public static final float f19906e = 1.0f;

    /* renamed from: f */
    public static final float f19907f = 0.2f;

    /* renamed from: g */
    public static final float f19908g = 1.0E-9f;

    /* renamed from: h */
    public static final float f19909h = 0.01f;

    /* renamed from: a */
    public float f19910a;

    /* renamed from: b */
    public float f19911b;

    /* renamed from: c */
    public float f19912c;

    public rk1(float f, float f2, float f3) {
        mo23924k(m26838d(f, f2, f3));
    }

    /* renamed from: a */
    public static C1992dt m26835a(float f, float f2, float f3) {
        float f4 = 1000.0f;
        C1992dt dtVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int l = C1992dt.m13293d(f8, f2, f).mo14836l();
            float l2 = q10.m25246l(l);
            float abs = Math.abs(f3 - l2);
            if (abs < 0.2f) {
                C1992dt b = C1992dt.m13291b(l);
                float a = b.mo14831a(C1992dt.m13293d(b.mo14837m(), b.mo14834j(), f));
                if (a <= 1.0f && a <= f4) {
                    dtVar = b;
                    f5 = abs;
                    f4 = a;
                }
            }
            if (f5 == 0.0f && f4 < 1.0E-9f) {
                break;
            } else if (l2 < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return dtVar;
    }

    /* renamed from: b */
    public static rk1 m26836b(float f, float f2, float f3) {
        return new rk1(f, f2, f3);
    }

    /* renamed from: c */
    public static rk1 m26837c(int i) {
        C1992dt b = C1992dt.m13291b(i);
        return new rk1(b.mo14835k(), b.mo14834j(), q10.m25246l(i));
    }

    /* renamed from: d */
    public static int m26838d(float f, float f2, float f3) {
        return m26839e(f, f2, f3, yv4.f23342a);
    }

    /* renamed from: e */
    public static int m26839e(float f, float f2, float f3, yv4 yv4) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return q10.m25240f(f3);
        }
        float d = of2.m23738d(f);
        float f4 = f2;
        C1992dt dtVar = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C1992dt a = m26835a(d, f4, f3);
            if (z) {
                if (a != null) {
                    return a.mo14842r(yv4);
                }
                z = false;
            } else if (a == null) {
                f2 = f4;
            } else {
                f5 = f4;
                dtVar = a;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return dtVar == null ? q10.m25240f(f3) : dtVar.mo14842r(yv4);
    }

    /* renamed from: f */
    public float mo23919f() {
        return this.f19911b;
    }

    /* renamed from: g */
    public float mo23920g() {
        return this.f19910a;
    }

    /* renamed from: h */
    public float mo23921h() {
        return this.f19912c;
    }

    /* renamed from: i */
    public void mo23922i(float f) {
        mo23924k(m26838d(this.f19910a, f, this.f19912c));
    }

    /* renamed from: j */
    public void mo23923j(float f) {
        mo23924k(m26838d(of2.m23738d(f), this.f19911b, this.f19912c));
    }

    /* renamed from: k */
    public final void mo23924k(int i) {
        C1992dt b = C1992dt.m13291b(i);
        float l = q10.m25246l(i);
        this.f19910a = b.mo14835k();
        this.f19911b = b.mo14834j();
        this.f19912c = l;
    }

    /* renamed from: l */
    public void mo23925l(float f) {
        mo23924k(m26838d(this.f19910a, this.f19911b, f));
    }

    /* renamed from: m */
    public int mo23926m() {
        return m26838d(this.f19910a, this.f19911b, this.f19912c);
    }
}
