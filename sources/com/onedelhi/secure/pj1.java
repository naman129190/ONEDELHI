package com.onedelhi.secure;

public class pj1 implements jz0, zg3 {

    /* renamed from: a */
    public float f18561a = 0.0f;

    /* renamed from: a */
    public int f18562a;

    /* renamed from: a */
    public nj1 f18563a;

    /* renamed from: a */
    public final z24 f18564a;

    /* renamed from: a */
    public Object f18565a;

    /* renamed from: b */
    public int f18566b = -1;

    /* renamed from: c */
    public int f18567c = -1;

    public pj1(z24 z24) {
        this.f18564a = z24;
    }

    /* renamed from: a */
    public o60 mo18814a() {
        if (this.f18563a == null) {
            this.f18563a = new nj1();
        }
        return this.f18563a;
    }

    public void apply() {
        this.f18563a.mo21317B2(this.f18562a);
        int i = this.f18566b;
        if (i != -1) {
            this.f18563a.mo21333w2(i);
            return;
        }
        int i2 = this.f18567c;
        if (i2 != -1) {
            this.f18563a.mo21334x2(i2);
        } else {
            this.f18563a.mo21335y2(this.f18561a);
        }
    }

    /* renamed from: b */
    public void mo20908b(Object obj) {
        this.f18565a = obj;
    }

    /* renamed from: c */
    public void mo20909c(o60 o60) {
        this.f18563a = o60 instanceof nj1 ? (nj1) o60 : null;
    }

    /* renamed from: d */
    public jz0 mo20910d() {
        return null;
    }

    /* renamed from: e */
    public pj1 mo22460e(Object obj) {
        this.f18566b = -1;
        this.f18567c = this.f18564a.mo27767f(obj);
        this.f18561a = 0.0f;
        return this;
    }

    /* renamed from: f */
    public int mo22461f() {
        return this.f18562a;
    }

    /* renamed from: g */
    public pj1 mo22462g(float f) {
        this.f18566b = -1;
        this.f18567c = -1;
        this.f18561a = f;
        return this;
    }

    public Object getKey() {
        return this.f18565a;
    }

    /* renamed from: h */
    public void mo22463h(int i) {
        this.f18562a = i;
    }

    /* renamed from: i */
    public pj1 mo22464i(Object obj) {
        this.f18566b = this.f18564a.mo27767f(obj);
        this.f18567c = -1;
        this.f18561a = 0.0f;
        return this;
    }
}
