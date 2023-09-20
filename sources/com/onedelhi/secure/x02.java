package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

public class x02 extends q31 {

    /* renamed from: a */
    public final C4477aa f37292a;

    /* renamed from: a */
    public k02 f37293a;

    /* renamed from: a */
    public t02 f37294a;

    /* renamed from: a */
    public final xe3 f37295a;

    /* renamed from: a */
    public IOException f37296a;

    /* renamed from: a */
    public OutputStream f37297a;

    /* renamed from: a */
    public final byte[] f37298a;

    /* renamed from: b */
    public final long f37299b;

    /* renamed from: b */
    public final boolean f37300b;

    /* renamed from: c */
    public long f37301c;

    /* renamed from: c */
    public boolean f37302c;

    /* renamed from: n */
    public final int f37303n;

    public x02(OutputStream outputStream, p02 p02, long j) throws IOException {
        this(outputStream, p02, j, C4477aa.m36107b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x02(OutputStream outputStream, p02 p02, long j, C4477aa aaVar) throws IOException {
        this(outputStream, p02, true, j == -1, j, aaVar);
    }

    public x02(OutputStream outputStream, p02 p02, boolean z) throws IOException {
        this(outputStream, p02, z, C4477aa.m36107b());
    }

    public x02(OutputStream outputStream, p02 p02, boolean z, C4477aa aaVar) throws IOException {
        this(outputStream, p02, false, z, -1, aaVar);
    }

    public x02(OutputStream outputStream, p02 p02, boolean z, boolean z2, long j, C4477aa aaVar) throws IOException {
        OutputStream outputStream2 = outputStream;
        long j2 = j;
        this.f37301c = 0;
        this.f37302c = false;
        this.f37296a = null;
        this.f37298a = new byte[1];
        Objects.requireNonNull(outputStream);
        if (j2 >= -1) {
            this.f37300b = z2;
            this.f37299b = j2;
            C4477aa aaVar2 = aaVar;
            this.f37292a = aaVar2;
            this.f37297a = outputStream2;
            xe3 xe3 = new xe3(outputStream2);
            this.f37295a = xe3;
            int k = p02.mo42328k();
            int i = k;
            t02 n = t02.m65079n(xe3, p02.mo42329l(), p02.mo42330m(), p02.mo42334q(), p02.mo42332o(), k, 0, p02.mo42333p(), p02.mo42331n(), p02.mo42327j(), aaVar2);
            this.f37294a = n;
            this.f37293a = n.mo44701o();
            byte[] r = p02.mo42335r();
            if (r != null && r.length > 0) {
                if (!z) {
                    this.f37293a.mo38981v(i, r);
                } else {
                    throw new no4("Preset dictionary cannot be used in .lzma files (try a raw LZMA stream instead)");
                }
            }
            int q = (((p02.mo42334q() * 5) + p02.mo42330m()) * 9) + p02.mo42329l();
            this.f37303n = q;
            if (z) {
                outputStream2.write(q);
                int i2 = i;
                for (int i3 = 0; i3 < 4; i3++) {
                    outputStream2.write(i2 & 255);
                    i2 >>>= 8;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    outputStream2.write(((int) (j2 >>> (i4 * 8))) & 255);
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid expected input size (less than -1)");
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f37302c) {
            IOException iOException = this.f37296a;
            if (iOException == null) {
                try {
                    long j = this.f37299b;
                    if (j != -1) {
                        if (j != this.f37301c) {
                            throw new bz4("Expected uncompressed size (" + this.f37299b + ") doesn't equal " + "the number of bytes written to the stream (" + this.f37301c + pl2.f33727d);
                        }
                    }
                    this.f37293a.mo38979t();
                    this.f37294a.mo44692d();
                    if (this.f37300b) {
                        this.f37294a.mo44695g();
                    }
                    this.f37295a.mo46132f();
                    this.f37302c = true;
                    this.f37294a.mo44710y(this.f37292a);
                    this.f37294a = null;
                    this.f37293a = null;
                } catch (IOException e) {
                    this.f37296a = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        }
    }

    /* renamed from: b */
    public int mo46975b() {
        return this.f37303n;
    }

    /* renamed from: c */
    public long mo46976c() {
        return this.f37301c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            java.io.OutputStream r0 = r2.f37297a
            if (r0 == 0) goto L_0x0017
            r2.mo31274a()     // Catch:{ IOException -> 0x0007 }
        L_0x0007:
            java.io.OutputStream r0 = r2.f37297a     // Catch:{ IOException -> 0x000d }
            r0.close()     // Catch:{ IOException -> 0x000d }
            goto L_0x0014
        L_0x000d:
            r0 = move-exception
            java.io.IOException r1 = r2.f37296a
            if (r1 != 0) goto L_0x0014
            r2.f37296a = r0
        L_0x0014:
            r0 = 0
            r2.f37297a = r0
        L_0x0017:
            java.io.IOException r0 = r2.f37296a
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x02.close():void");
    }

    public void flush() throws IOException {
        throw new bz4("LZMAOutputStream does not support flushing");
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f37298a;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f37296a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f37302c) {
            long j = this.f37299b;
            if (j == -1 || j - this.f37301c >= ((long) i2)) {
                this.f37301c += (long) i2;
                while (i2 > 0) {
                    try {
                        int b = this.f37293a.mo38967b(bArr, i, i2);
                        i += b;
                        i2 -= b;
                        this.f37294a.mo44692d();
                    } catch (IOException e) {
                        this.f37296a = e;
                        throw e;
                    }
                }
                return;
            }
            throw new bz4("Expected uncompressed input size (" + this.f37299b + " bytes) was exceeded");
        } else {
            throw new bz4("Stream finished or closed");
        }
    }
}
