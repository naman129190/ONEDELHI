package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.qt */
public class C6596qt {

    /* renamed from: a */
    public int f34351a = -1;

    /* renamed from: a */
    public C6597a f34352a = C6597a.AUTO;

    /* renamed from: a */
    public boolean f34353a = false;

    /* renamed from: b */
    public boolean f34354b = false;

    /* renamed from: c */
    public boolean f34355c = false;

    /* renamed from: d */
    public boolean f34356d = true;

    /* renamed from: e */
    public boolean f34357e = false;

    /* renamed from: f */
    public boolean f34358f = false;

    /* renamed from: g */
    public boolean f34359g = false;

    /* renamed from: com.onedelhi.secure.qt$a */
    public enum C6597a {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    /* renamed from: a */
    public C6597a mo43703a() {
        return this.f34352a;
    }

    /* renamed from: b */
    public int mo43704b() {
        return this.f34351a;
    }

    /* renamed from: c */
    public boolean mo43705c() {
        return this.f34356d;
    }

    /* renamed from: d */
    public boolean mo43706d() {
        return this.f34359g;
    }

    /* renamed from: e */
    public boolean mo43707e() {
        return this.f34354b;
    }

    /* renamed from: f */
    public boolean mo43708f() {
        return this.f34357e;
    }

    /* renamed from: g */
    public boolean mo43709g() {
        return this.f34358f;
    }

    /* renamed from: h */
    public boolean mo43710h() {
        return this.f34355c;
    }

    /* renamed from: i */
    public boolean mo43711i() {
        return this.f34353a;
    }

    /* renamed from: j */
    public void mo43712j(boolean z) {
        this.f34356d = z;
        this.f34352a = (!z || !this.f34357e) ? z ? C6597a.AUTO : null : C6597a.CONTINUOUS;
    }

    /* renamed from: k */
    public void mo43713k(boolean z) {
        this.f34359g = z;
    }

    /* renamed from: l */
    public void mo43714l(boolean z) {
        this.f34354b = z;
    }

    /* renamed from: m */
    public void mo43715m(boolean z) {
        this.f34357e = z;
        this.f34352a = z ? C6597a.CONTINUOUS : this.f34356d ? C6597a.AUTO : null;
    }

    /* renamed from: n */
    public void mo43716n(boolean z) {
        this.f34358f = z;
    }

    /* renamed from: o */
    public void mo43717o(C6597a aVar) {
        this.f34352a = aVar;
    }

    /* renamed from: p */
    public void mo43718p(boolean z) {
        this.f34355c = z;
    }

    /* renamed from: q */
    public void mo43719q(int i) {
        this.f34351a = i;
    }

    /* renamed from: r */
    public void mo43720r(boolean z) {
        this.f34353a = z;
    }
}
