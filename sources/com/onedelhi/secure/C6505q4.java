package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.q4 */
public final class C6505q4 extends sl3 {

    /* renamed from: c */
    public final float f33964c;

    public C6505q4(float f, float f2, float f3) {
        super(f, f2);
        this.f33964c = f3;
    }

    /* renamed from: f */
    public boolean mo43138f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo44404d()) > f || Math.abs(f3 - mo44403c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f33964c);
        return abs <= 1.0f || abs <= this.f33964c;
    }

    /* renamed from: g */
    public C6505q4 mo43139g(float f, float f2, float f3) {
        return new C6505q4((mo44403c() + f2) / 2.0f, (mo44404d() + f) / 2.0f, (this.f33964c + f3) / 2.0f);
    }
}
