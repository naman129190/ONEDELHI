package com.onedelhi.secure;

import java.security.NoSuchAlgorithmException;

/* renamed from: com.onedelhi.secure.jx */
public abstract class C5853jx {

    /* renamed from: a */
    public int f30993a;

    /* renamed from: a */
    public String f30994a;

    /* renamed from: b */
    public static C5853jx m53873b(int i) throws no4 {
        if (i == 0) {
            return new qr2();
        }
        if (i == 1) {
            return new C4590as();
        }
        if (i == 4) {
            return new C4908cs();
        }
        if (i == 10) {
            try {
                return new so3();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new no4("Unsupported Check ID " + i);
    }

    /* renamed from: a */
    public abstract byte[] mo31122a();

    /* renamed from: c */
    public String mo38917c() {
        return this.f30994a;
    }

    /* renamed from: d */
    public int mo38918d() {
        return this.f30993a;
    }

    /* renamed from: e */
    public void mo38919e(byte[] bArr) {
        mo31123f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public abstract void mo31123f(byte[] bArr, int i, int i2);
}
