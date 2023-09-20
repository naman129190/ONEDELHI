package com.onedelhi.secure;

import java.io.InputStream;

public class m02 extends l02 implements g31 {

    /* renamed from: a */
    public int f31965a;

    public m02(byte[] bArr) throws no4 {
        if (bArr.length != 1 || (bArr[0] & 255) > 37) {
            throw new no4("Unsupported LZMA2 properties");
        }
        byte b = (bArr[0] & 1) | 2;
        this.f31965a = b;
        this.f31965a = b << ((bArr[0] >>> 1) + 11);
    }

    /* renamed from: d */
    public int mo30928d() {
        return o02.m58882d(this.f31965a);
    }

    /* renamed from: h */
    public InputStream mo30929h(InputStream inputStream, C4477aa aaVar) {
        return new o02(inputStream, this.f31965a, (byte[]) null, aaVar);
    }
}
