package com.onedelhi.secure;

public final class l31 extends sl3 {

    /* renamed from: a */
    public final int f31526a;

    /* renamed from: c */
    public final float f31527c;

    public l31(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    public l31(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f31527c = f3;
        this.f31526a = i;
    }

    /* renamed from: f */
    public boolean mo39633f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo44404d()) > f || Math.abs(f3 - mo44403c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f31527c);
        return abs <= 1.0f || abs <= this.f31527c;
    }

    /* renamed from: g */
    public l31 mo39634g(float f, float f2, float f3) {
        int i = this.f31526a;
        int i2 = i + 1;
        float c = (((float) i) * mo44403c()) + f2;
        float f4 = (float) i2;
        return new l31(c / f4, ((((float) this.f31526a) * mo44404d()) + f) / f4, ((((float) this.f31526a) * this.f31527c) + f3) / f4, i2);
    }

    /* renamed from: h */
    public int mo39635h() {
        return this.f31526a;
    }

    /* renamed from: i */
    public float mo39636i() {
        return this.f31527c;
    }
}
