package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.vr */
public class C3805vr extends Exception {

    /* renamed from: b */
    public final String f21914b;

    /* renamed from: c */
    public final String f21915c;

    /* renamed from: n */
    public final int f21916n;

    public C3805vr(String str, C3336qr qrVar) {
        int i;
        this.f21914b = str;
        if (qrVar != null) {
            this.f21915c = qrVar.mo23413o();
            i = qrVar.mo23411l();
        } else {
            this.f21915c = dv0.f10947b;
            i = 0;
        }
        this.f21916n = i;
    }

    /* renamed from: a */
    public String mo26196a() {
        return this.f21914b + " (" + this.f21915c + " at line " + this.f21916n + pl2.f33727d;
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + mo26196a();
    }
}
