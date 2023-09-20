package com.onedelhi.secure;

public final class k00 {

    /* renamed from: f */
    public static final int f31019f = -1;

    /* renamed from: a */
    public final int f31020a;

    /* renamed from: b */
    public final int f31021b;

    /* renamed from: c */
    public final int f31022c;

    /* renamed from: d */
    public final int f31023d;

    /* renamed from: e */
    public int f31024e = -1;

    public k00(int i, int i2, int i3, int i4) {
        this.f31020a = i;
        this.f31021b = i2;
        this.f31022c = i3;
        this.f31023d = i4;
    }

    /* renamed from: a */
    public int mo38955a() {
        return this.f31022c;
    }

    /* renamed from: b */
    public int mo38956b() {
        return this.f31021b;
    }

    /* renamed from: c */
    public int mo38957c() {
        return this.f31024e;
    }

    /* renamed from: d */
    public int mo38958d() {
        return this.f31020a;
    }

    /* renamed from: e */
    public int mo38959e() {
        return this.f31023d;
    }

    /* renamed from: f */
    public int mo38960f() {
        return this.f31021b - this.f31020a;
    }

    /* renamed from: g */
    public boolean mo38961g() {
        return mo38962h(this.f31024e);
    }

    /* renamed from: h */
    public boolean mo38962h(int i) {
        return i != -1 && this.f31022c == (i % 3) * 3;
    }

    /* renamed from: i */
    public void mo38963i(int i) {
        this.f31024e = i;
    }

    /* renamed from: j */
    public void mo38964j() {
        this.f31024e = ((this.f31023d / 30) * 3) + (this.f31022c / 3);
    }

    public String toString() {
        return this.f31024e + to1.f35743f + this.f31023d;
    }
}
