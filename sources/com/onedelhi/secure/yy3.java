package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class yy3 extends InputStream {

    /* renamed from: c */
    public static final /* synthetic */ boolean f38106c = false;

    /* renamed from: q */
    public static final int f38107q = 4096;

    /* renamed from: a */
    public final xy3 f38108a;

    /* renamed from: a */
    public IOException f38109a = null;

    /* renamed from: a */
    public InputStream f38110a;

    /* renamed from: a */
    public final byte[] f38111a = new byte[4096];

    /* renamed from: b */
    public boolean f38112b = false;

    /* renamed from: b */
    public final byte[] f38113b = new byte[1];

    /* renamed from: n */
    public int f38114n = 0;

    /* renamed from: o */
    public int f38115o = 0;

    /* renamed from: p */
    public int f38116p = 0;

    static {
        Class<yy3> cls = yy3.class;
    }

    public yy3(InputStream inputStream, xy3 xy3) {
        Objects.requireNonNull(inputStream);
        this.f38110a = inputStream;
        this.f38108a = xy3;
    }

    /* renamed from: a */
    public static int m72387a() {
        return 5;
    }

    public int available() throws IOException {
        if (this.f38110a != null) {
            IOException iOException = this.f38109a;
            if (iOException == null) {
                return this.f38115o;
            }
            throw iOException;
        }
        throw new bz4("Stream closed");
    }

    public void close() throws IOException {
        InputStream inputStream = this.f38110a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f38110a = null;
            }
        }
    }

    public int read() throws IOException {
        if (read(this.f38113b, 0, 1) == -1) {
            return -1;
        }
        return this.f38113b[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f38110a != null) {
                IOException iOException = this.f38109a;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.f38115o, i2);
                            System.arraycopy(this.f38111a, this.f38114n, bArr, i, min);
                            int i5 = this.f38114n + min;
                            this.f38114n = i5;
                            int i6 = this.f38115o - min;
                            this.f38115o = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.f38116p;
                            if (i5 + i6 + i7 == 4096) {
                                byte[] bArr2 = this.f38111a;
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.f38114n = 0;
                            }
                            if (i2 == 0) {
                                break;
                            } else if (this.f38112b) {
                                break;
                            } else {
                                int i8 = this.f38114n;
                                int i9 = this.f38115o;
                                int i10 = this.f38116p;
                                int read = this.f38110a.read(this.f38111a, i8 + i9 + i10, 4096 - ((i8 + i9) + i10));
                                if (read == -1) {
                                    this.f38112b = true;
                                    this.f38115o = this.f38116p;
                                    this.f38116p = 0;
                                } else {
                                    int i11 = this.f38116p + read;
                                    this.f38116p = i11;
                                    int a = this.f38108a.mo38163a(this.f38111a, this.f38114n, i11);
                                    this.f38115o = a;
                                    this.f38116p -= a;
                                }
                            }
                        } catch (IOException e) {
                            this.f38109a = e;
                            throw e;
                        }
                    }
                    if (i4 > 0) {
                        return i4;
                    }
                    return -1;
                }
                throw iOException;
            }
            throw new bz4("Stream closed");
        }
    }
}
