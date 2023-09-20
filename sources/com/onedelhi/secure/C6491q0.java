package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.q0 */
public abstract class C6491q0 {

    /* renamed from: a */
    public final de1 f33857a;

    /* renamed from: a */
    public final C6014ll f33858a;

    public C6491q0(C6014ll llVar) {
        this.f33858a = llVar;
        this.f33857a = new de1(llVar);
    }

    /* renamed from: a */
    public static C6491q0 m61792a(C6014ll llVar) {
        if (llVar.mo39930h(1)) {
            return new C6724s(llVar);
        }
        if (!llVar.mo39930h(2)) {
            return new C6368p7(llVar);
        }
        int g = de1.m45003g(llVar, 1, 4);
        if (g == 4) {
            return new C6071m(llVar);
        }
        if (g == 5) {
            return new C6160n(llVar);
        }
        int g2 = de1.m45003g(llVar, 1, 5);
        if (g2 == 12) {
            return new C6237o(llVar);
        }
        if (g2 == 13) {
            return new C6353p(llVar);
        }
        switch (de1.m45003g(llVar, 1, 7)) {
            case 56:
                return new C6490q(llVar, "310", "11");
            case 57:
                return new C6490q(llVar, "320", "11");
            case 58:
                return new C6490q(llVar, "310", "13");
            case 59:
                return new C6490q(llVar, "320", "13");
            case 60:
                return new C6490q(llVar, "310", "15");
            case 61:
                return new C6490q(llVar, "320", "15");
            case 62:
                return new C6490q(llVar, "310", "17");
            case 63:
                return new C6490q(llVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(llVar)));
        }
    }

    /* renamed from: b */
    public final de1 mo42995b() {
        return this.f33857a;
    }

    /* renamed from: c */
    public final C6014ll mo42996c() {
        return this.f33858a;
    }

    /* renamed from: d */
    public abstract String mo41503d() throws tr2, ha1;
}
