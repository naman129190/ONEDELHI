package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.sn */
public class C3527sn extends bs0 implements Cloneable {

    /* renamed from: g */
    public static final float f20438g = 1.75f;

    /* renamed from: n */
    public static final int f20439n = 90;

    /* renamed from: o */
    public static final int f20440o = 180;

    /* renamed from: p */
    public static final int f20441p = 270;

    /* renamed from: q */
    public static final int f20442q = 180;

    /* renamed from: a */
    public float f20443a;

    /* renamed from: b */
    public float f20444b;

    /* renamed from: c */
    public float f20445c;

    /* renamed from: d */
    public float f20446d;

    /* renamed from: e */
    public float f20447e;

    /* renamed from: f */
    public float f20448f = -1.0f;

    public C3527sn(float f, float f2, float f3) {
        this.f20444b = f;
        this.f20443a = f2;
        mo24492j(f3);
        this.f20447e = 0.0f;
    }

    /* renamed from: b */
    public void mo24485b(float f, float f2, float f3, @mr2 fx3 fx3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = f;
        fx3 fx32 = fx3;
        float f13 = this.f20445c;
        if (f13 == 0.0f) {
            fx32.mo36348n(f12, 0.0f);
            return;
        }
        float f14 = ((this.f20444b * 2.0f) + f13) / 2.0f;
        float f15 = f3 * this.f20443a;
        float f16 = f2 + this.f20447e;
        float f17 = (this.f20446d * f3) + ((1.0f - f3) * f14);
        if (f17 / f14 >= 1.0f) {
            fx32.mo36348n(f12, 0.0f);
            return;
        }
        float f18 = this.f20448f;
        float f19 = f18 * f3;
        boolean z = f18 == -1.0f || Math.abs((f18 * 2.0f) - f13) < 0.1f;
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f17;
            f5 = 0.0f;
        }
        float f20 = f14 + f15;
        float f21 = f4 + f15;
        float sqrt = (float) Math.sqrt((double) ((f20 * f20) - (f21 * f21)));
        float f22 = f16 - sqrt;
        float f23 = f16 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f21)));
        float f24 = (90.0f - degrees) + f5;
        fx32.mo36348n(f22, 0.0f);
        float f25 = f15 * 2.0f;
        float f26 = degrees;
        fx3.mo36335a(f22 - f15, 0.0f, f22 + f15, f25, 270.0f, degrees);
        if (z) {
            f11 = f16 - f14;
            f10 = (-f14) - f4;
            f9 = f16 + f14;
            f8 = f14 - f4;
            f7 = 180.0f - f24;
            f6 = (f24 * 2.0f) - 180.0f;
        } else {
            float f27 = this.f20444b;
            float f28 = f19 * 2.0f;
            float f29 = f16 - f14;
            fx3.mo36335a(f29, -(f19 + f27), f29 + f27 + f28, f27 + f19, 180.0f - f24, ((f24 * 2.0f) - 180.0f) / 2.0f);
            f9 = f16 + f14;
            float f30 = this.f20444b;
            fx32.mo36348n(f9 - ((f30 / 2.0f) + f19), f30 + f19);
            float f31 = this.f20444b;
            f11 = f9 - (f28 + f31);
            f10 = -(f19 + f31);
            f8 = f31 + f19;
            f7 = 90.0f;
            f6 = f24 - 0.049804688f;
        }
        fx3.mo36335a(f11, f10, f9, f8, f7, f6);
        fx3.mo36335a(f23 - f15, 0.0f, f23 + f15, f25, 270.0f - f26, f26);
        fx32.mo36348n(f12, 0.0f);
    }

    /* renamed from: d */
    public float mo24486d() {
        return this.f20446d;
    }

    /* renamed from: e */
    public float mo24487e() {
        return this.f20448f;
    }

    /* renamed from: f */
    public float mo24488f() {
        return this.f20444b;
    }

    /* renamed from: g */
    public float mo24489g() {
        return this.f20443a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: h */
    public float mo24490h() {
        return this.f20445c;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: i */
    public float mo24491i() {
        return this.f20447e;
    }

    /* renamed from: j */
    public void mo24492j(@d81(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f20446d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: k */
    public void mo24493k(float f) {
        this.f20448f = f;
    }

    /* renamed from: l */
    public void mo24494l(float f) {
        this.f20444b = f;
    }

    /* renamed from: m */
    public void mo24495m(float f) {
        this.f20443a = f;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: n */
    public void mo24496n(float f) {
        this.f20445c = f;
    }

    /* renamed from: o */
    public void mo24497o(float f) {
        this.f20447e = f;
    }
}
