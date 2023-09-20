package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class w02 extends InputStream {

    /* renamed from: c */
    public static final /* synthetic */ boolean f36791c = false;

    /* renamed from: n */
    public static final int f36792n = 2147483632;

    /* renamed from: a */
    public C4477aa f36793a;

    /* renamed from: a */
    public j02 f36794a;

    /* renamed from: a */
    public s02 f36795a;

    /* renamed from: a */
    public ue3 f36796a;

    /* renamed from: a */
    public IOException f36797a;

    /* renamed from: a */
    public InputStream f36798a;

    /* renamed from: a */
    public final byte[] f36799a;

    /* renamed from: b */
    public long f36800b;

    /* renamed from: b */
    public boolean f36801b;

    static {
        Class<w02> cls = w02.class;
    }

    public w02(InputStream inputStream) throws IOException {
        this(inputStream, -1);
    }

    public w02(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, C4477aa.m36107b());
    }

    public w02(InputStream inputStream, int i, C4477aa aaVar) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte readByte = dataInputStream.readByte();
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 |= dataInputStream.readUnsignedByte() << (i3 * 8);
        }
        long j = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            j |= ((long) dataInputStream.readUnsignedByte()) << (i4 * 8);
        }
        int b = m68664b(i2, readByte);
        if (i == -1 || b <= i) {
            mo46457d(inputStream, j, readByte, i2, (byte[]) null, aaVar);
            return;
        }
        throw new xg2(b, i);
    }

    public w02(InputStream inputStream, long j, byte b, int i) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        mo46457d(inputStream, j, b, i, (byte[]) null, C4477aa.m36107b());
    }

    public w02(InputStream inputStream, long j, byte b, int i, byte[] bArr) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        mo46457d(inputStream, j, b, i, bArr, C4477aa.m36107b());
    }

    public w02(InputStream inputStream, long j, byte b, int i, byte[] bArr, C4477aa aaVar) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        mo46457d(inputStream, j, b, i, bArr, aaVar);
    }

    public w02(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        mo46458g(inputStream, j, i, i2, i3, i4, bArr, C4477aa.m36107b());
    }

    public w02(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr, C4477aa aaVar) throws IOException {
        this.f36801b = false;
        this.f36799a = new byte[1];
        this.f36797a = null;
        mo46458g(inputStream, j, i, i2, i3, i4, bArr, aaVar);
    }

    public w02(InputStream inputStream, C4477aa aaVar) throws IOException {
        this(inputStream, -1, aaVar);
    }

    /* renamed from: a */
    public static int m68663a(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & -16;
    }

    /* renamed from: b */
    public static int m68664b(int i, byte b) throws no4, s90 {
        if (i < 0 || i > 2147483632) {
            throw new no4("LZMA dictionary is too big for this implementation");
        }
        byte b2 = b & 255;
        if (b2 <= 224) {
            int i2 = b2 % 45;
            int i3 = i2 / 9;
            return m68665c(i, i2 - (i3 * 9), i3);
        }
        throw new s90("Invalid LZMA properties byte");
    }

    /* renamed from: c */
    public static int m68665c(int i, int i2, int i3) {
        if (i2 >= 0 && i2 <= 8 && i3 >= 0 && i3 <= 4) {
            return (m68663a(i) / 1024) + 10 + ((1536 << (i2 + i3)) / 1024);
        }
        throw new IllegalArgumentException("Invalid lc or lp");
    }

    public void close() throws IOException {
        if (this.f36798a != null) {
            mo46459h();
            try {
                this.f36798a.close();
            } finally {
                this.f36798a = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo46457d(InputStream inputStream, long j, byte b, int i, byte[] bArr, C4477aa aaVar) throws IOException {
        int i2 = i;
        if (j >= -1) {
            byte b2 = b & 255;
            if (b2 <= 224) {
                int i3 = b2 / 45;
                int i4 = b2 - ((i3 * 9) * 5);
                int i5 = i4 / 9;
                int i6 = i4 - (i5 * 9);
                if (i2 < 0 || i2 > 2147483632) {
                    throw new no4("LZMA dictionary is too big for this implementation");
                }
                mo46458g(inputStream, j, i6, i5, i3, i, bArr, aaVar);
                return;
            }
            throw new s90("Invalid LZMA properties byte");
        }
        throw new no4("Uncompressed size is too big");
    }

    /* renamed from: g */
    public final void mo46458g(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr, C4477aa aaVar) throws IOException {
        InputStream inputStream2 = inputStream;
        long j2 = j;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        C4477aa aaVar2 = aaVar;
        if (j2 < -1 || i5 < 0 || i5 > 8 || i6 < 0 || i6 > 4 || i7 < 0 || i7 > 4) {
            throw new IllegalArgumentException();
        }
        this.f36798a = inputStream2;
        this.f36793a = aaVar2;
        int a = m68663a(i4);
        if (j2 >= 0 && ((long) a) > j2) {
            a = m68663a((int) j2);
        }
        this.f36794a = new j02(m68663a(a), bArr, aaVar2);
        ue3 ue3 = new ue3(inputStream);
        this.f36796a = ue3;
        this.f36795a = new s02(this.f36794a, ue3, i, i2, i3);
        this.f36800b = j2;
    }

    /* renamed from: h */
    public final void mo46459h() {
        j02 j02 = this.f36794a;
        if (j02 != null) {
            j02.mo38374g(this.f36793a);
            this.f36794a = null;
        }
    }

    public int read() throws IOException {
        if (read(this.f36799a, 0, 1) == -1) {
            return -1;
        }
        return this.f36799a[0] & 255;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 < 0) goto L_0x009d
            if (r14 < 0) goto L_0x009d
            int r0 = r13 + r14
            if (r0 < 0) goto L_0x009d
            int r1 = r12.length
            if (r0 > r1) goto L_0x009d
            r0 = 0
            if (r14 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.InputStream r1 = r11.f36798a
            if (r1 == 0) goto L_0x0095
            java.io.IOException r1 = r11.f36797a
            if (r1 != 0) goto L_0x0094
            boolean r1 = r11.f36801b
            r2 = -1
            if (r1 == 0) goto L_0x001d
            return r2
        L_0x001d:
            if (r14 <= 0) goto L_0x0093
            long r3 = r11.f36800b     // Catch:{ IOException -> 0x008f }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x002e
            long r7 = (long) r14     // Catch:{ IOException -> 0x008f }
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x002e
            int r1 = (int) r3     // Catch:{ IOException -> 0x008f }
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            com.onedelhi.secure.j02 r3 = r11.f36794a     // Catch:{ IOException -> 0x008f }
            r3.mo38379l(r1)     // Catch:{ IOException -> 0x008f }
            r1 = 1
            com.onedelhi.secure.s02 r3 = r11.f36795a     // Catch:{ s90 -> 0x003b }
            r3.mo44128e()     // Catch:{ s90 -> 0x003b }
            goto L_0x0053
        L_0x003b:
            r3 = move-exception
            long r7 = r11.f36800b     // Catch:{ IOException -> 0x008f }
            r9 = -1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x008e
            com.onedelhi.secure.s02 r4 = r11.f36795a     // Catch:{ IOException -> 0x008f }
            boolean r4 = r4.mo44131h()     // Catch:{ IOException -> 0x008f }
            if (r4 == 0) goto L_0x008e
            r11.f36801b = r1     // Catch:{ IOException -> 0x008f }
            com.onedelhi.secure.ue3 r3 = r11.f36796a     // Catch:{ IOException -> 0x008f }
            r3.mo44306f()     // Catch:{ IOException -> 0x008f }
        L_0x0053:
            com.onedelhi.secure.j02 r3 = r11.f36794a     // Catch:{ IOException -> 0x008f }
            int r3 = r3.mo38369b(r12, r13)     // Catch:{ IOException -> 0x008f }
            int r13 = r13 + r3
            int r14 = r14 - r3
            int r0 = r0 + r3
            long r7 = r11.f36800b     // Catch:{ IOException -> 0x008f }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x006c
            long r3 = (long) r3     // Catch:{ IOException -> 0x008f }
            long r7 = r7 - r3
            r11.f36800b = r7     // Catch:{ IOException -> 0x008f }
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x006c
            r11.f36801b = r1     // Catch:{ IOException -> 0x008f }
        L_0x006c:
            boolean r1 = r11.f36801b     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x001d
            com.onedelhi.secure.ue3 r12 = r11.f36796a     // Catch:{ IOException -> 0x008f }
            boolean r12 = r12.mo45576g()     // Catch:{ IOException -> 0x008f }
            if (r12 == 0) goto L_0x0088
            com.onedelhi.secure.j02 r12 = r11.f36794a     // Catch:{ IOException -> 0x008f }
            boolean r12 = r12.mo38372e()     // Catch:{ IOException -> 0x008f }
            if (r12 != 0) goto L_0x0088
            r11.mo46459h()     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r2 = r0
        L_0x0087:
            return r2
        L_0x0088:
            com.onedelhi.secure.s90 r12 = new com.onedelhi.secure.s90     // Catch:{ IOException -> 0x008f }
            r12.<init>()     // Catch:{ IOException -> 0x008f }
            throw r12     // Catch:{ IOException -> 0x008f }
        L_0x008e:
            throw r3     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            r12 = move-exception
            r11.f36797a = r12
            throw r12
        L_0x0093:
            return r0
        L_0x0094:
            throw r1
        L_0x0095:
            com.onedelhi.secure.bz4 r12 = new com.onedelhi.secure.bz4
            java.lang.String r13 = "Stream closed"
            r12.<init>(r13)
            throw r12
        L_0x009d:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w02.read(byte[], int, int):int");
    }
}
