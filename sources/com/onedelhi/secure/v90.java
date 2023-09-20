package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public class v90 extends q31 {

    /* renamed from: a */
    public final OutputStream f36457a;

    /* renamed from: b */
    public long f36458b = 0;

    public v90(OutputStream outputStream) {
        this.f36457a = outputStream;
    }

    /* renamed from: b */
    public long mo46029b() {
        return this.f36458b;
    }

    public void close() throws IOException {
        this.f36457a.close();
    }

    public void flush() throws IOException {
        this.f36457a.flush();
    }

    public void write(int i) throws IOException {
        this.f36457a.write(i);
        long j = this.f36458b;
        if (j >= 0) {
            this.f36458b = j + 1;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f36457a.write(bArr, i, i2);
        long j = this.f36458b;
        if (j >= 0) {
            this.f36458b = j + ((long) i2);
        }
    }
}
