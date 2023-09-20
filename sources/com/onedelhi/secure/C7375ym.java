package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.ym */
public class C7375ym extends InputStream {

    /* renamed from: d */
    public static final /* synthetic */ boolean f37999d = false;

    /* renamed from: a */
    public final C5853jx f38000a;

    /* renamed from: a */
    public final u90 f38001a;

    /* renamed from: a */
    public final DataInputStream f38002a;

    /* renamed from: a */
    public InputStream f38003a;

    /* renamed from: a */
    public final byte[] f38004a = new byte[1];

    /* renamed from: b */
    public long f38005b = -1;

    /* renamed from: b */
    public final boolean f38006b;

    /* renamed from: c */
    public long f38007c = -1;

    /* renamed from: c */
    public boolean f38008c = false;

    /* renamed from: d */
    public long f38009d;

    /* renamed from: e */
    public long f38010e = 0;

    /* renamed from: n */
    public final int f38011n;

    static {
        Class<C7375ym> cls = C7375ym.class;
    }

    public C7375ym(InputStream inputStream, C5853jx jxVar, boolean z, int i, long j, long j2, C4477aa aaVar) throws IOException, aq1 {
        String str;
        InputStream inputStream2 = inputStream;
        int i2 = i;
        long j3 = j2;
        this.f38000a = jxVar;
        this.f38006b = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream2);
        this.f38002a = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        if (bArr[0] != 0) {
            int i3 = ((bArr[0] & 255) + 1) * 4;
            this.f38011n = i3;
            dataInputStream.readFully(bArr, 1, i3 - 1);
            if (!jg0.m53345g(bArr, 0, i3 - 4, i3 - 4)) {
                throw new s90("XZ Block Header is corrupt");
            } else if ((bArr[1] & 60) == 0) {
                int i4 = (bArr[1] & 3) + 1;
                long[] jArr = new long[i4];
                byte[][] bArr2 = new byte[i4][];
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i3 - 6);
                try {
                    this.f38009d = (9223372036854775804L - ((long) i3)) - ((long) jxVar.mo38918d());
                    if ((bArr[1] & m10.C2804j.f15814a) != 0) {
                        long f = jg0.m53344f(byteArrayInputStream);
                        this.f38007c = f;
                        str = "XZ Block Header is corrupt";
                        if (f != 0) {
                            try {
                                if (f <= this.f38009d) {
                                    this.f38009d = f;
                                }
                            } catch (IOException unused) {
                                throw new s90(str);
                            }
                        }
                        throw new s90();
                    }
                    Object obj = "XZ Block Header is corrupt";
                    if ((bArr[1] & C7276xq.f37586a) != 0) {
                        this.f38005b = jg0.m53344f(byteArrayInputStream);
                    }
                    int i5 = 0;
                    while (i5 < i4) {
                        jArr[i5] = jg0.m53344f(byteArrayInputStream);
                        long f2 = jg0.m53344f(byteArrayInputStream);
                        if (f2 <= ((long) byteArrayInputStream.available())) {
                            bArr2[i5] = new byte[((int) f2)];
                            byteArrayInputStream.read(bArr2[i5]);
                            i5++;
                        } else {
                            throw new s90();
                        }
                    }
                    int available = byteArrayInputStream.available();
                    while (available > 0) {
                        if (byteArrayInputStream.read() == 0) {
                            available--;
                        } else {
                            throw new no4("Unsupported options in XZ Block Header");
                        }
                    }
                    if (j != -1) {
                        long d = (long) (this.f38011n + jxVar.mo38918d());
                        if (d < j) {
                            long j4 = j - d;
                            if (j4 <= this.f38009d) {
                                long j5 = this.f38007c;
                                if (j5 == -1 || j5 == j4) {
                                    long j6 = this.f38005b;
                                    if (j6 == -1 || j6 == j3) {
                                        this.f38009d = j4;
                                        this.f38007c = j4;
                                        this.f38005b = j3;
                                    } else {
                                        throw new s90("XZ Index does not match a Block Header");
                                    }
                                }
                            }
                            throw new s90("XZ Index does not match a Block Header");
                        }
                        throw new s90("XZ Index does not match a Block Header");
                    }
                    g31[] g31Arr = new g31[i4];
                    for (int i6 = 0; i6 < i4; i6++) {
                        if (jArr[i6] == 33) {
                            g31Arr[i6] = new m02(bArr2[i6]);
                        } else if (jArr[i6] == 3) {
                            g31Arr[i6] = new jj0(bArr2[i6]);
                        } else if (C7491zh.m73208j(jArr[i6])) {
                            g31Arr[i6] = new C4558ai(jArr[i6], bArr2[i6]);
                        } else {
                            throw new no4("Unknown Filter ID " + jArr[i6]);
                        }
                    }
                    hf3.m50489a(g31Arr);
                    if (i2 >= 0) {
                        int i7 = 0;
                        for (int i8 = 0; i8 < i4; i8++) {
                            i7 += g31Arr[i8].mo30928d();
                        }
                        if (i7 > i2) {
                            throw new xg2(i7, i2);
                        }
                    }
                    u90 u90 = new u90(inputStream2);
                    this.f38001a = u90;
                    this.f38003a = u90;
                    for (int i9 = i4 - 1; i9 >= 0; i9--) {
                        this.f38003a = g31Arr[i9].mo30929h(this.f38003a, aaVar);
                    }
                } catch (IOException unused2) {
                    str = "XZ Block Header is corrupt";
                    throw new s90(str);
                }
            } else {
                throw new no4("Unsupported options in XZ Block Header");
            }
        } else {
            throw new aq1();
        }
    }

    /* renamed from: a */
    public long mo47856a() {
        return this.f38010e;
    }

    public int available() throws IOException {
        return this.f38003a.available();
    }

    /* renamed from: b */
    public long mo47858b() {
        return ((long) this.f38011n) + this.f38001a.mo45541a() + ((long) this.f38000a.mo38918d());
    }

    /* renamed from: c */
    public final void mo47859c() throws IOException {
        long a = this.f38001a.mo45541a();
        long j = this.f38007c;
        if (j == -1 || j == a) {
            long j2 = this.f38005b;
            if (j2 == -1 || j2 == this.f38010e) {
                while (true) {
                    long j3 = 1 + a;
                    if ((a & 3) == 0) {
                        byte[] bArr = new byte[this.f38000a.mo38918d()];
                        this.f38002a.readFully(bArr);
                        if (this.f38006b && !Arrays.equals(this.f38000a.mo31122a(), bArr)) {
                            throw new s90("Integrity check (" + this.f38000a.mo38917c() + ") does not match");
                        }
                        return;
                    } else if (this.f38002a.readUnsignedByte() == 0) {
                        a = j3;
                    } else {
                        throw new s90();
                    }
                }
            }
        }
        throw new s90();
    }

    public void close() {
        try {
            this.f38003a.close();
        } catch (IOException unused) {
        }
        this.f38003a = null;
    }

    public int read() throws IOException {
        if (read(this.f38004a, 0, 1) == -1) {
            return -1;
        }
        return this.f38004a[0] & 255;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r0 == -1) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f38008c
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.io.InputStream r0 = r8.f38003a
            int r0 = r0.read(r9, r10, r11)
            r2 = 1
            if (r0 <= 0) goto L_0x005d
            boolean r3 = r8.f38006b
            if (r3 == 0) goto L_0x0018
            com.onedelhi.secure.jx r3 = r8.f38000a
            r3.mo31123f(r9, r10, r0)
        L_0x0018:
            long r9 = r8.f38010e
            long r3 = (long) r0
            long r9 = r9 + r3
            r8.f38010e = r9
            com.onedelhi.secure.u90 r9 = r8.f38001a
            long r9 = r9.mo45541a()
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0057
            long r5 = r8.f38009d
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0057
            long r9 = r8.f38010e
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0057
            long r3 = r8.f38005b
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0042
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0057
        L_0x0042:
            if (r0 < r11) goto L_0x0048
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0064
        L_0x0048:
            java.io.InputStream r9 = r8.f38003a
            int r9 = r9.read()
            if (r9 != r1) goto L_0x0051
            goto L_0x005f
        L_0x0051:
            com.onedelhi.secure.s90 r9 = new com.onedelhi.secure.s90
            r9.<init>()
            throw r9
        L_0x0057:
            com.onedelhi.secure.s90 r9 = new com.onedelhi.secure.s90
            r9.<init>()
            throw r9
        L_0x005d:
            if (r0 != r1) goto L_0x0064
        L_0x005f:
            r8.mo47859c()
            r8.f38008c = r2
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7375ym.read(byte[], int, int):int");
    }
}
