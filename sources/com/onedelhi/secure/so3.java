package com.onedelhi.secure;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class so3 extends C5853jx {

    /* renamed from: a */
    public final MessageDigest f35156a = MessageDigest.getInstance("SHA-256");

    public so3() throws NoSuchAlgorithmException {
        this.f30993a = 32;
        this.f30994a = "SHA-256";
    }

    /* renamed from: a */
    public byte[] mo31122a() {
        byte[] digest = this.f35156a.digest();
        this.f35156a.reset();
        return digest;
    }

    /* renamed from: f */
    public void mo31123f(byte[] bArr, int i, int i2) {
        this.f35156a.update(bArr, i, i2);
    }
}
