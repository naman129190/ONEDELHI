package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class o02 extends InputStream {

    /* renamed from: o */
    public static final int f32855o = 4096;

    /* renamed from: p */
    public static final int f32856p = 2147483632;

    /* renamed from: q */
    public static final int f32857q = 65536;

    /* renamed from: a */
    public final C4477aa f32858a;

    /* renamed from: a */
    public j02 f32859a;

    /* renamed from: a */
    public s02 f32860a;

    /* renamed from: a */
    public te3 f32861a;

    /* renamed from: a */
    public DataInputStream f32862a;

    /* renamed from: a */
    public IOException f32863a;

    /* renamed from: a */
    public final byte[] f32864a;

    /* renamed from: b */
    public boolean f32865b;

    /* renamed from: c */
    public boolean f32866c;

    /* renamed from: d */
    public boolean f32867d;

    /* renamed from: e */
    public boolean f32868e;

    /* renamed from: n */
    public int f32869n;

    public o02(InputStream inputStream, int i) {
        this(inputStream, i, (byte[]) null);
    }

    public o02(InputStream inputStream, int i, byte[] bArr) {
        this(inputStream, i, bArr, C4477aa.m36107b());
    }

    public o02(InputStream inputStream, int i, byte[] bArr, C4477aa aaVar) {
        this.f32869n = 0;
        this.f32865b = false;
        this.f32866c = true;
        this.f32867d = true;
        this.f32868e = false;
        this.f32863a = null;
        this.f32864a = new byte[1];
        Objects.requireNonNull(inputStream);
        this.f32858a = aaVar;
        this.f32862a = new DataInputStream(inputStream);
        this.f32861a = new te3(65536, aaVar);
        this.f32859a = new j02(m58881c(i), bArr, aaVar);
        if (bArr != null && bArr.length > 0) {
            this.f32866c = false;
        }
    }

    /* renamed from: c */
    public static int m58881c(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & -16;
        }
        throw new IllegalArgumentException("Unsupported dictionary size " + i);
    }

    /* renamed from: d */
    public static int m58882d(int i) {
        return (m58881c(i) / 1024) + 104;
    }

    /* renamed from: a */
    public final void mo41505a() throws IOException {
        int readUnsignedByte = this.f32862a.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f32868e = true;
            mo41509g();
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f32867d = true;
            this.f32866c = false;
            this.f32859a.mo38378k();
        } else if (this.f32866c) {
            throw new s90();
        }
        if (readUnsignedByte >= 128) {
            this.f32865b = true;
            int i = (readUnsignedByte & 31) << 16;
            this.f32869n = i;
            this.f32869n = i + this.f32862a.readUnsignedShort() + 1;
            int readUnsignedShort = this.f32862a.readUnsignedShort() + 1;
            if (readUnsignedByte >= 192) {
                this.f32867d = false;
                mo41507b();
            } else if (this.f32867d) {
                throw new s90();
            } else if (readUnsignedByte >= 160) {
                this.f32860a.mo43775b();
            }
            this.f32861a.mo44975h(this.f32862a, readUnsignedShort);
        } else if (readUnsignedByte <= 2) {
            this.f32865b = false;
            this.f32869n = this.f32862a.readUnsignedShort() + 1;
        } else {
            throw new s90();
        }
    }

    public int available() throws IOException {
        DataInputStream dataInputStream = this.f32862a;
        if (dataInputStream != null) {
            IOException iOException = this.f32863a;
            if (iOException == null) {
                return this.f32865b ? this.f32869n : Math.min(this.f32869n, dataInputStream.available());
            }
            throw iOException;
        }
        throw new bz4("Stream closed");
    }

    /* renamed from: b */
    public final void mo41507b() throws IOException {
        int readUnsignedByte = this.f32862a.readUnsignedByte();
        if (readUnsignedByte <= 224) {
            int i = readUnsignedByte / 45;
            int i2 = readUnsignedByte - ((i * 9) * 5);
            int i3 = i2 / 9;
            int i4 = i2 - (i3 * 9);
            if (i4 + i3 <= 4) {
                this.f32860a = new s02(this.f32859a, this.f32861a, i4, i3, i);
                return;
            }
            throw new s90();
        }
        throw new s90();
    }

    public void close() throws IOException {
        if (this.f32862a != null) {
            mo41509g();
            try {
                this.f32862a.close();
            } finally {
                this.f32862a = null;
            }
        }
    }

    /* renamed from: g */
    public final void mo41509g() {
        j02 j02 = this.f32859a;
        if (j02 != null) {
            j02.mo38374g(this.f32858a);
            this.f32859a = null;
            this.f32861a.mo44976i(this.f32858a);
            this.f32861a = null;
        }
    }

    public int read() throws IOException {
        if (read(this.f32864a, 0, 1) == -1) {
            return -1;
        }
        return this.f32864a[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f32862a != null) {
            IOException iOException = this.f32863a;
            if (iOException != null) {
                throw iOException;
            } else if (this.f32868e) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f32869n == 0) {
                            mo41505a();
                            if (this.f32868e) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int min = Math.min(this.f32869n, i2);
                        if (!this.f32865b) {
                            this.f32859a.mo38368a(this.f32862a, min);
                        } else {
                            this.f32859a.mo38379l(min);
                            this.f32860a.mo44128e();
                        }
                        int b = this.f32859a.mo38369b(bArr, i);
                        i += b;
                        i2 -= b;
                        i4 += b;
                        int i5 = this.f32869n - b;
                        this.f32869n = i5;
                        if (i5 == 0) {
                            if (!this.f32861a.mo44974g() || this.f32859a.mo38372e()) {
                                throw new s90();
                            }
                        }
                    } catch (IOException e) {
                        this.f32863a = e;
                        throw e;
                    }
                }
                return i4;
            }
        } else {
            throw new bz4("Stream closed");
        }
    }
}
