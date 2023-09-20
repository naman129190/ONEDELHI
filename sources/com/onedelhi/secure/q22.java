package com.onedelhi.secure;

import java.io.OutputStream;

public final class q22 extends OutputStream {

    /* renamed from: b */
    public long f33958b = 0;

    /* renamed from: a */
    public long mo43095a() {
        return this.f33958b;
    }

    public void write(int i) {
        this.f33958b++;
    }

    public void write(byte[] bArr) {
        this.f33958b += (long) bArr.length;
    }

    public void write(@mr2 byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f33958b += (long) i2;
    }
}
