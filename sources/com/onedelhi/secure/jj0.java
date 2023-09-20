package com.onedelhi.secure;

import java.io.InputStream;

public class jj0 extends hj0 implements g31 {

    /* renamed from: a */
    public final int f30839a;

    public jj0(byte[] bArr) throws no4 {
        if (bArr.length == 1) {
            this.f30839a = (bArr[0] & 255) + 1;
            return;
        }
        throw new no4("Unsupported Delta filter properties");
    }

    /* renamed from: d */
    public int mo30928d() {
        return 1;
    }

    /* renamed from: h */
    public InputStream mo30929h(InputStream inputStream, C4477aa aaVar) {
        return new mj0(inputStream, this.f30839a);
    }
}
