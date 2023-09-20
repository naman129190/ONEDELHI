package com.onedelhi.secure;

public final class pi4 implements lz0<ni4> {

    /* renamed from: a */
    public final a73<C2106ez> f18543a;

    /* renamed from: b */
    public final a73<C2106ez> f18544b;

    /* renamed from: c */
    public final a73<or3> f18545c;

    /* renamed from: d */
    public final a73<fp4> f18546d;

    /* renamed from: e */
    public final a73<gy4> f18547e;

    public pi4(a73<C2106ez> a73, a73<C2106ez> a732, a73<or3> a733, a73<fp4> a734, a73<gy4> a735) {
        this.f18543a = a73;
        this.f18544b = a732;
        this.f18545c = a733;
        this.f18546d = a734;
        this.f18547e = a735;
    }

    /* renamed from: a */
    public static pi4 m24727a(a73<C2106ez> a73, a73<C2106ez> a732, a73<or3> a733, a73<fp4> a734, a73<gy4> a735) {
        return new pi4(a73, a732, a733, a734, a735);
    }

    /* renamed from: c */
    public static ni4 m24728c(C2106ez ezVar, C2106ez ezVar2, or3 or3, fp4 fp4, gy4 gy4) {
        return new ni4(ezVar, ezVar2, or3, fp4, gy4);
    }

    /* renamed from: b */
    public ni4 get() {
        return m24728c(this.f18543a.get(), this.f18544b.get(), this.f18545c.get(), this.f18546d.get(), this.f18547e.get());
    }
}
