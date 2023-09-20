package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public class u90 extends C5456gz {

    /* renamed from: b */
    public long f36014b = 0;

    public u90(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public long mo45541a() {
        return this.f36014b;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            long j = this.f36014b;
            if (j >= 0) {
                this.f36014b = j + 1;
            }
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.f36014b;
            if (j >= 0) {
                this.f36014b = j + ((long) read);
            }
        }
        return read;
    }
}
