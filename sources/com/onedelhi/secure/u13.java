package com.onedelhi.secure;

public final class u13 {

    /* renamed from: a */
    public final float f35933a;

    /* renamed from: b */
    public final float f35934b;

    /* renamed from: c */
    public final float f35935c;

    /* renamed from: d */
    public final float f35936d;

    /* renamed from: e */
    public final float f35937e;

    /* renamed from: f */
    public final float f35938f;

    /* renamed from: g */
    public final float f35939g;

    /* renamed from: h */
    public final float f35940h;

    /* renamed from: i */
    public final float f35941i;

    public u13(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f35933a = f;
        this.f35934b = f4;
        this.f35935c = f7;
        this.f35936d = f2;
        this.f35937e = f5;
        this.f35938f = f8;
        this.f35939g = f3;
        this.f35940h = f6;
        this.f35941i = f9;
    }

    /* renamed from: b */
    public static u13 m66383b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m66385d(f9, f10, f11, f12, f13, f14, f15, f16).mo45364e(m66384c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static u13 m66384c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m66385d(f, f2, f3, f4, f5, f6, f7, f8).mo45363a();
    }

    /* renamed from: d */
    public static u13 m66385d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new u13(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new u13((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    public u13 mo45363a() {
        float f = this.f35937e;
        float f2 = this.f35941i;
        float f3 = this.f35938f;
        float f4 = this.f35940h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f35939g;
        float f7 = this.f35936d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f35935c;
        float f11 = this.f35934b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f35933a;
        return new u13(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    public u13 mo45364e(u13 u13) {
        u13 u132 = u13;
        float f = this.f35933a;
        float f2 = u132.f35933a;
        float f3 = this.f35936d;
        float f4 = u132.f35934b;
        float f5 = this.f35939g;
        float f6 = u132.f35935c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = u132.f35936d;
        float f9 = u132.f35937e;
        float f10 = u132.f35938f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = u132.f35939g;
        float f13 = u132.f35940h;
        float f14 = u132.f35941i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f35934b;
        float f17 = f15;
        float f18 = this.f35937e;
        float f19 = f11;
        float f20 = this.f35940h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f35935c;
        float f24 = this.f35938f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f35941i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new u13(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo45365f(float[] fArr) {
        float[] fArr2 = fArr;
        float f = this.f35933a;
        float f2 = this.f35934b;
        float f3 = this.f35935c;
        float f4 = this.f35936d;
        float f5 = this.f35937e;
        float f6 = this.f35938f;
        float f7 = this.f35939g;
        float f8 = this.f35940h;
        float f9 = this.f35941i;
        int length = fArr2.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    /* renamed from: g */
    public void mo45366g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.f35935c * f) + (this.f35938f * f2) + this.f35941i;
            fArr[i] = (((this.f35933a * f) + (this.f35936d * f2)) + this.f35939g) / f3;
            fArr2[i] = (((this.f35934b * f) + (this.f35937e * f2)) + this.f35940h) / f3;
        }
    }
}
