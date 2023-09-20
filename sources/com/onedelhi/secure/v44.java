package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class v44 implements Closeable {

    /* renamed from: a */
    public static final byte f21655a = 13;

    /* renamed from: b */
    public static final byte f21656b = 10;

    /* renamed from: a */
    public final InputStream f21657a;

    /* renamed from: a */
    public final Charset f21658a;

    /* renamed from: a */
    public byte[] f21659a;

    /* renamed from: n */
    public int f21660n;

    /* renamed from: o */
    public int f21661o;

    /* renamed from: com.onedelhi.secure.v44$a */
    public class C3765a extends ByteArrayOutputStream {
        public C3765a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, v44.this.f21658a.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public v44(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(rq4.f20084a)) {
            this.f21657a = inputStream;
            this.f21658a = charset;
            this.f21659a = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public v44(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void mo25848b() throws IOException {
        InputStream inputStream = this.f21657a;
        byte[] bArr = this.f21659a;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f21660n = 0;
            this.f21661o = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo25849c() {
        return this.f21661o == -1;
    }

    public void close() throws IOException {
        synchronized (this.f21657a) {
            if (this.f21659a != null) {
                this.f21659a = null;
                this.f21657a.close();
            }
        }
    }

    /* renamed from: d */
    public String mo25851d() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f21657a) {
            if (this.f21659a != null) {
                if (this.f21660n >= this.f21661o) {
                    mo25848b();
                }
                for (int i3 = this.f21660n; i3 != this.f21661o; i3++) {
                    byte[] bArr2 = this.f21659a;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f21660n;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f21658a.name());
                                this.f21660n = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f21658a.name());
                        this.f21660n = i3 + 1;
                        return str2;
                    }
                }
                C3765a aVar = new C3765a((this.f21661o - this.f21660n) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f21659a;
                    int i5 = this.f21660n;
                    aVar.write(bArr3, i5, this.f21661o - i5);
                    this.f21661o = -1;
                    mo25848b();
                    i = this.f21660n;
                    while (true) {
                        if (i != this.f21661o) {
                            bArr = this.f21659a;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f21660n;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f21660n = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
