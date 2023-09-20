package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public class r31 extends q31 {

    /* renamed from: a */
    public OutputStream f34482a;

    public r31(OutputStream outputStream) {
        this.f34482a = outputStream;
    }

    public void close() throws IOException {
        this.f34482a.close();
    }

    public void flush() throws IOException {
        this.f34482a.flush();
    }

    public void write(int i) throws IOException {
        this.f34482a.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this.f34482a.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f34482a.write(bArr, i, i2);
    }
}
