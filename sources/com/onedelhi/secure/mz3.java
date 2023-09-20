package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class mz3 extends InputStream {

    /* renamed from: a */
    public final C4477aa f32319a;

    /* renamed from: a */
    public final h44 f32320a;

    /* renamed from: a */
    public final C5853jx f32321a;

    /* renamed from: a */
    public C7375ym f32322a;

    /* renamed from: a */
    public final zp1 f32323a;

    /* renamed from: a */
    public IOException f32324a;

    /* renamed from: a */
    public InputStream f32325a;

    /* renamed from: a */
    public final byte[] f32326a;

    /* renamed from: b */
    public final boolean f32327b;

    /* renamed from: c */
    public boolean f32328c;

    /* renamed from: n */
    public final int f32329n;

    public mz3(InputStream inputStream) throws IOException {
        this(inputStream, -1);
    }

    public mz3(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    public mz3(InputStream inputStream, int i, C4477aa aaVar) throws IOException {
        this(inputStream, i, true, aaVar);
    }

    public mz3(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C4477aa.m36107b());
    }

    public mz3(InputStream inputStream, int i, boolean z, C4477aa aaVar) throws IOException {
        this(inputStream, i, z, m57772d(inputStream), aaVar);
    }

    public mz3(InputStream inputStream, int i, boolean z, byte[] bArr, C4477aa aaVar) throws IOException {
        this.f32322a = null;
        this.f32323a = new zp1();
        this.f32328c = false;
        this.f32324a = null;
        this.f32326a = new byte[1];
        this.f32319a = aaVar;
        this.f32325a = inputStream;
        this.f32329n = i;
        this.f32327b = z;
        h44 e = jg0.m53343e(bArr);
        this.f32320a = e;
        this.f32321a = C5853jx.m53873b(e.f29453a);
    }

    public mz3(InputStream inputStream, C4477aa aaVar) throws IOException {
        this(inputStream, -1, aaVar);
    }

    /* renamed from: d */
    public static byte[] m57772d(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        return bArr;
    }

    /* renamed from: a */
    public void mo40878a(boolean z) throws IOException {
        if (this.f32325a != null) {
            C7375ym ymVar = this.f32322a;
            if (ymVar != null) {
                ymVar.close();
                this.f32322a = null;
            }
            if (z) {
                try {
                    this.f32325a.close();
                } catch (Throwable th) {
                    this.f32325a = null;
                    throw th;
                }
            }
            this.f32325a = null;
        }
    }

    public int available() throws IOException {
        if (this.f32325a != null) {
            IOException iOException = this.f32324a;
            if (iOException == null) {
                C7375ym ymVar = this.f32322a;
                if (ymVar == null) {
                    return 0;
                }
                return ymVar.available();
            }
            throw iOException;
        }
        throw new bz4("Stream closed");
    }

    /* renamed from: b */
    public String mo40880b() {
        return this.f32321a.mo38917c();
    }

    /* renamed from: c */
    public int mo40881c() {
        return this.f32320a.f29453a;
    }

    public void close() throws IOException {
        mo40878a(true);
    }

    /* renamed from: g */
    public final void mo40883g() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f32325a).readFully(bArr);
        h44 d = jg0.m53342d(bArr);
        if (!jg0.m53340b(this.f32320a, d) || this.f32323a.mo46815c() != d.f29454a) {
            throw new s90("XZ Stream Footer does not match Stream Header");
        }
    }

    public int read() throws IOException {
        if (read(this.f32326a, 0, 1) == -1) {
            return -1;
        }
        return this.f32326a[0] & 255;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|(2:27|48)(1:49)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054 A[Catch:{ IOException -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[Catch:{ IOException -> 0x0079 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r18, int r19, int r20) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            if (r19 < 0) goto L_0x008a
            if (r20 < 0) goto L_0x008a
            int r2 = r19 + r20
            if (r2 < 0) goto L_0x008a
            int r3 = r0.length
            if (r2 > r3) goto L_0x008a
            r2 = 0
            if (r20 != 0) goto L_0x0013
            return r2
        L_0x0013:
            java.io.InputStream r3 = r1.f32325a
            if (r3 == 0) goto L_0x0082
            java.io.IOException r3 = r1.f32324a
            if (r3 != 0) goto L_0x0081
            boolean r3 = r1.f32328c
            r4 = -1
            if (r3 == 0) goto L_0x0021
            return r4
        L_0x0021:
            r2 = r19
            r3 = r20
            r5 = 0
        L_0x0026:
            if (r3 <= 0) goto L_0x0080
            com.onedelhi.secure.ym r6 = r1.f32322a     // Catch:{ IOException -> 0x0079 }
            if (r6 != 0) goto L_0x0056
            com.onedelhi.secure.ym r6 = new com.onedelhi.secure.ym     // Catch:{ aq1 -> 0x0045 }
            java.io.InputStream r8 = r1.f32325a     // Catch:{ aq1 -> 0x0045 }
            com.onedelhi.secure.jx r9 = r1.f32321a     // Catch:{ aq1 -> 0x0045 }
            boolean r10 = r1.f32327b     // Catch:{ aq1 -> 0x0045 }
            int r11 = r1.f32329n     // Catch:{ aq1 -> 0x0045 }
            r12 = -1
            r14 = -1
            com.onedelhi.secure.aa r7 = r1.f32319a     // Catch:{ aq1 -> 0x0045 }
            r16 = r7
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ aq1 -> 0x0045 }
            r1.f32322a = r6     // Catch:{ aq1 -> 0x0045 }
            goto L_0x0056
        L_0x0045:
            com.onedelhi.secure.zp1 r0 = r1.f32323a     // Catch:{ IOException -> 0x0079 }
            java.io.InputStream r2 = r1.f32325a     // Catch:{ IOException -> 0x0079 }
            r0.mo48423f(r2)     // Catch:{ IOException -> 0x0079 }
            r17.mo40883g()     // Catch:{ IOException -> 0x0079 }
            r0 = 1
            r1.f32328c = r0     // Catch:{ IOException -> 0x0079 }
            if (r5 <= 0) goto L_0x0055
            r4 = r5
        L_0x0055:
            return r4
        L_0x0056:
            com.onedelhi.secure.ym r6 = r1.f32322a     // Catch:{ IOException -> 0x0079 }
            int r6 = r6.read(r0, r2, r3)     // Catch:{ IOException -> 0x0079 }
            if (r6 <= 0) goto L_0x0062
            int r5 = r5 + r6
            int r2 = r2 + r6
            int r3 = r3 - r6
            goto L_0x0026
        L_0x0062:
            if (r6 != r4) goto L_0x0026
            com.onedelhi.secure.zp1 r6 = r1.f32323a     // Catch:{ IOException -> 0x0079 }
            com.onedelhi.secure.ym r7 = r1.f32322a     // Catch:{ IOException -> 0x0079 }
            long r7 = r7.mo47858b()     // Catch:{ IOException -> 0x0079 }
            com.onedelhi.secure.ym r9 = r1.f32322a     // Catch:{ IOException -> 0x0079 }
            long r9 = r9.mo47856a()     // Catch:{ IOException -> 0x0079 }
            r6.mo46813a(r7, r9)     // Catch:{ IOException -> 0x0079 }
            r6 = 0
            r1.f32322a = r6     // Catch:{ IOException -> 0x0079 }
            goto L_0x0026
        L_0x0079:
            r0 = move-exception
            r1.f32324a = r0
            if (r5 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            return r5
        L_0x0081:
            throw r3
        L_0x0082:
            com.onedelhi.secure.bz4 r0 = new com.onedelhi.secure.bz4
            java.lang.String r2 = "Stream closed"
            r0.<init>(r2)
            throw r0
        L_0x008a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mz3.read(byte[], int, int):int");
    }
}
