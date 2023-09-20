package com.onedelhi.secure;

public final class ez3 extends if4 {

    /* renamed from: a */
    public final short f28125a;

    /* renamed from: b */
    public final short f28126b;

    public ez3(if4 if4, int i, int i2) {
        super(if4);
        this.f28125a = (short) i;
        this.f28126b = (short) i2;
    }

    /* renamed from: c */
    public void mo35678c(C6014ll llVar, byte[] bArr) {
        llVar.mo39923c(this.f28125a, this.f28126b);
    }

    public String toString() {
        short s = this.f28125a;
        short s2 = this.f28126b;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f28126b)).substring(1) + tk4.f35698e;
    }
}
