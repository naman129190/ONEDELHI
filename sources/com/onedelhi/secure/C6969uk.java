package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.uk */
public final class C6969uk {

    /* renamed from: a */
    public C6190nl f36168a;

    /* renamed from: a */
    public final C6888tk f36169a;

    public C6969uk(C6888tk tkVar) {
        if (tkVar != null) {
            this.f36169a = tkVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C6969uk mo45633a(int i, int i2, int i3, int i4) {
        return new C6969uk(this.f36169a.mo36792a(this.f36169a.mo45169e().mo35854a(i, i2, i3, i4)));
    }

    /* renamed from: b */
    public C6190nl mo45634b() throws tr2 {
        if (this.f36168a == null) {
            this.f36168a = this.f36169a.mo36793b();
        }
        return this.f36168a;
    }

    /* renamed from: c */
    public C6014ll mo45635c(int i, C6014ll llVar) throws tr2 {
        return this.f36169a.mo37326c(i, llVar);
    }

    /* renamed from: d */
    public int mo45636d() {
        return this.f36169a.mo45168d();
    }

    /* renamed from: e */
    public int mo45637e() {
        return this.f36169a.mo45170f();
    }

    /* renamed from: f */
    public boolean mo45638f() {
        return this.f36169a.mo45169e().mo35857g();
    }

    /* renamed from: g */
    public boolean mo45639g() {
        return this.f36169a.mo45169e().mo43294h();
    }

    /* renamed from: h */
    public C6969uk mo45640h() {
        return new C6969uk(this.f36169a.mo36792a(this.f36169a.mo45169e().mo43295i()));
    }

    /* renamed from: i */
    public C6969uk mo45641i() {
        return new C6969uk(this.f36169a.mo36792a(this.f36169a.mo45169e().mo43296j()));
    }

    public String toString() {
        try {
            return mo45634b().toString();
        } catch (tr2 unused) {
            return "";
        }
    }
}
