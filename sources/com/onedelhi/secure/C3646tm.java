package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.tm */
public final class C3646tm {

    /* renamed from: a */
    public static final float f20962a = 15.0f;

    /* renamed from: b */
    public static final float f20963b = 0.5f;

    /* renamed from: a */
    public static int m28813a(int i, int i2, float f) {
        C1992dt b = C1992dt.m13291b(i);
        C1992dt b2 = C1992dt.m13291b(i2);
        float n = b.mo14838n();
        float h = b.mo14832h();
        float i3 = b.mo14833i();
        return C1992dt.m13295f(n + ((b2.mo14838n() - n) * f), h + ((b2.mo14832h() - h) * f), i3 + ((b2.mo14833i() - i3) * f)).mo14836l();
    }

    /* renamed from: b */
    public static int m28814b(int i, int i2, float f) {
        return rk1.m26836b(C1992dt.m13291b(m28813a(i, i2, f)).mo14835k(), C1992dt.m13291b(i).mo14834j(), q10.m25246l(i)).mo23926m();
    }

    /* renamed from: c */
    public static int m28815c(int i, int i2) {
        rk1 c = rk1.m26837c(i);
        rk1 c2 = rk1.m26837c(i2);
        return rk1.m26836b(of2.m23738d(c.mo23920g() + (Math.min(of2.m23736b(c.mo23920g(), c2.mo23920g()) * 0.5f, 15.0f) * m28816d(c.mo23920g(), c2.mo23920g()))), c.mo23919f(), c.mo23921h()).mo23926m();
    }

    /* renamed from: d */
    public static float m28816d(float f, float f2) {
        float f3 = f2 - f;
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        float abs3 = Math.abs(f5);
        return (abs > abs2 || abs > abs3) ? (abs2 > abs || abs2 > abs3) ? ((double) f5) >= 0.0d ? 1.0f : -1.0f : ((double) f4) >= 0.0d ? 1.0f : -1.0f : ((double) f3) >= 0.0d ? 1.0f : -1.0f;
    }
}
