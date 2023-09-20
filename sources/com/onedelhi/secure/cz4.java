package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public class cz4 extends InputStream {

    /* renamed from: a */
    public final C4477aa f27142a;

    /* renamed from: a */
    public mz3 f27143a;

    /* renamed from: a */
    public IOException f27144a;

    /* renamed from: a */
    public InputStream f27145a;

    /* renamed from: a */
    public final byte[] f27146a;

    /* renamed from: b */
    public final boolean f27147b;

    /* renamed from: c */
    public boolean f27148c;

    /* renamed from: n */
    public final int f27149n;

    public cz4(InputStream inputStream) throws IOException {
        this(inputStream, -1);
    }

    public cz4(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    public cz4(InputStream inputStream, int i, C4477aa aaVar) throws IOException {
        this(inputStream, i, true, aaVar);
    }

    public cz4(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C4477aa.m36107b());
    }

    public cz4(InputStream inputStream, int i, boolean z, C4477aa aaVar) throws IOException {
        this.f27148c = false;
        this.f27144a = null;
        this.f27146a = new byte[1];
        this.f27142a = aaVar;
        this.f27145a = inputStream;
        this.f27149n = i;
        this.f27147b = z;
        this.f27143a = new mz3(inputStream, i, z, aaVar);
    }

    public cz4(InputStream inputStream, C4477aa aaVar) throws IOException {
        this(inputStream, -1, aaVar);
    }

    /* renamed from: a */
    public void mo34027a(boolean z) throws IOException {
        if (this.f27145a != null) {
            mz3 mz3 = this.f27143a;
            if (mz3 != null) {
                mz3.mo40878a(false);
                this.f27143a = null;
            }
            if (z) {
                try {
                    this.f27145a.close();
                } catch (Throwable th) {
                    this.f27145a = null;
                    throw th;
                }
            }
            this.f27145a = null;
        }
    }

    public int available() throws IOException {
        if (this.f27145a != null) {
            IOException iOException = this.f27144a;
            if (iOException == null) {
                mz3 mz3 = this.f27143a;
                if (mz3 == null) {
                    return 0;
                }
                return mz3.available();
            }
            throw iOException;
        }
        throw new bz4("Stream closed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34029b() throws java.io.IOException {
        /*
            r8 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r8.f27145a
            r0.<init>(r1)
            r1 = 12
            byte[] r6 = new byte[r1]
        L_0x000b:
            r1 = 0
            r2 = 1
            int r3 = r0.read(r6, r1, r2)
            r4 = -1
            if (r3 != r4) goto L_0x0017
            r8.f27148c = r2
            return
        L_0x0017:
            r3 = 3
            r0.readFully(r6, r2, r3)
            byte r1 = r6[r1]
            if (r1 != 0) goto L_0x002c
            byte r1 = r6[r2]
            if (r1 != 0) goto L_0x002c
            r1 = 2
            byte r1 = r6[r1]
            if (r1 != 0) goto L_0x002c
            byte r1 = r6[r3]
            if (r1 == 0) goto L_0x000b
        L_0x002c:
            r1 = 4
            r2 = 8
            r0.readFully(r6, r1, r2)
            com.onedelhi.secure.mz3 r0 = new com.onedelhi.secure.mz3     // Catch:{ az4 -> 0x0043 }
            java.io.InputStream r3 = r8.f27145a     // Catch:{ az4 -> 0x0043 }
            int r4 = r8.f27149n     // Catch:{ az4 -> 0x0043 }
            boolean r5 = r8.f27147b     // Catch:{ az4 -> 0x0043 }
            com.onedelhi.secure.aa r7 = r8.f27142a     // Catch:{ az4 -> 0x0043 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ az4 -> 0x0043 }
            r8.f27143a = r0     // Catch:{ az4 -> 0x0043 }
            return
        L_0x0043:
            com.onedelhi.secure.s90 r0 = new com.onedelhi.secure.s90
            java.lang.String r1 = "Garbage after a valid XZ Stream"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cz4.mo34029b():void");
    }

    public void close() throws IOException {
        mo34027a(true);
    }

    public int read() throws IOException {
        if (read(this.f27146a, 0, 1) == -1) {
            return -1;
        }
        return this.f27146a[0] & 255;
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
        if (this.f27145a != null) {
            IOException iOException = this.f27144a;
            if (iOException != null) {
                throw iOException;
            } else if (this.f27148c) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f27143a == null) {
                            mo34029b();
                            if (this.f27148c) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int read = this.f27143a.read(bArr, i, i2);
                        if (read > 0) {
                            i4 += read;
                            i += read;
                            i2 -= read;
                        } else if (read == -1) {
                            this.f27143a = null;
                        }
                    } catch (IOException e) {
                        this.f27144a = e;
                        if (i4 == 0) {
                            throw e;
                        }
                    }
                }
                return i4;
            }
        } else {
            throw new bz4("Stream closed");
        }
    }
}
