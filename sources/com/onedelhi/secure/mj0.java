package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class mj0 extends InputStream {

    /* renamed from: n */
    public static final int f32166n = 1;

    /* renamed from: o */
    public static final int f32167o = 256;

    /* renamed from: a */
    public final ij0 f32168a;

    /* renamed from: a */
    public IOException f32169a = null;

    /* renamed from: a */
    public InputStream f32170a;

    /* renamed from: a */
    public final byte[] f32171a = new byte[1];

    public mj0(InputStream inputStream, int i) {
        Objects.requireNonNull(inputStream);
        this.f32170a = inputStream;
        this.f32168a = new ij0(i);
    }

    public int available() throws IOException {
        InputStream inputStream = this.f32170a;
        if (inputStream != null) {
            IOException iOException = this.f32169a;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new bz4("Stream closed");
    }

    public void close() throws IOException {
        InputStream inputStream = this.f32170a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f32170a = null;
            }
        }
    }

    public int read() throws IOException {
        if (read(this.f32171a, 0, 1) == -1) {
            return -1;
        }
        return this.f32171a[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f32170a;
        if (inputStream != null) {
            IOException iOException = this.f32169a;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    this.f32168a.mo38114a(bArr, i, read);
                    return read;
                } catch (IOException e) {
                    this.f32169a = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        } else {
            throw new bz4("Stream closed");
        }
    }
}
