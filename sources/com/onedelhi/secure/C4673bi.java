package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.bi */
public class C4673bi extends C7491zh implements h31 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f26348a = false;

    /* renamed from: a */
    public final C4767ci f26349a;

    /* renamed from: a */
    public final byte[] f26350a;

    /* renamed from: g */
    public final long f26351g;

    public C4673bi(C4767ci ciVar, long j) {
        int j2 = ciVar.mo32378j();
        if (j2 == 0) {
            this.f26350a = new byte[0];
        } else {
            this.f26350a = new byte[4];
            for (int i = 0; i < 4; i++) {
                this.f26350a[i] = (byte) (j2 >>> (i * 8));
            }
        }
        this.f26351g = j;
        this.f26349a = (C4767ci) ciVar.clone();
    }

    /* renamed from: b */
    public boolean mo31742b() {
        return false;
    }

    /* renamed from: e */
    public long mo31743e() {
        return this.f26351g;
    }

    /* renamed from: g */
    public q31 mo31744g(q31 q31, C4477aa aaVar) {
        return this.f26349a.mo37824i(q31, aaVar);
    }

    /* renamed from: i */
    public byte[] mo31745i() {
        return this.f26350a;
    }
}
