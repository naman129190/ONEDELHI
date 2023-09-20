package com.onedelhi.secure;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class kn4 extends q31 {

    /* renamed from: a */
    public final C4477aa f31261a;

    /* renamed from: a */
    public q31 f31262a;

    /* renamed from: a */
    public final DataOutputStream f31263a;

    /* renamed from: a */
    public IOException f31264a = null;

    /* renamed from: a */
    public final byte[] f31265a;

    /* renamed from: b */
    public boolean f31266b = true;

    /* renamed from: b */
    public final byte[] f31267b = new byte[1];

    /* renamed from: c */
    public boolean f31268c = false;

    /* renamed from: n */
    public int f31269n = 0;

    public kn4(q31 q31, C4477aa aaVar) {
        Objects.requireNonNull(q31);
        this.f31262a = q31;
        this.f31263a = new DataOutputStream(q31);
        this.f31261a = aaVar;
        this.f31265a = aaVar.mo30487a(65536, false);
    }

    /* renamed from: b */
    public static int m54599b() {
        return 70;
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f31268c) {
            mo39344d();
            try {
                this.f31262a.mo31274a();
            } catch (IOException e) {
                this.f31264a = e;
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final void mo39342c() throws IOException {
        this.f31263a.writeByte(this.f31266b ? 1 : 2);
        this.f31263a.writeShort(this.f31269n - 1);
        this.f31263a.write(this.f31265a, 0, this.f31269n);
        this.f31269n = 0;
        this.f31266b = false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            com.onedelhi.secure.q31 r0 = r2.f31262a
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.f31268c
            if (r0 != 0) goto L_0x000b
            r2.mo39344d()     // Catch:{ IOException -> 0x000b }
        L_0x000b:
            com.onedelhi.secure.q31 r0 = r2.f31262a     // Catch:{ IOException -> 0x0011 }
            r0.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r0 = move-exception
            java.io.IOException r1 = r2.f31264a
            if (r1 != 0) goto L_0x0018
            r2.f31264a = r0
        L_0x0018:
            r0 = 0
            r2.f31262a = r0
        L_0x001b:
            java.io.IOException r0 = r2.f31264a
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kn4.close():void");
    }

    /* renamed from: d */
    public final void mo39344d() throws IOException {
        IOException iOException = this.f31264a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f31268c) {
            try {
                if (this.f31269n > 0) {
                    mo39342c();
                }
                this.f31262a.write(0);
                this.f31268c = true;
                this.f31261a.mo30489e(this.f31265a);
            } catch (IOException e) {
                this.f31264a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    public void flush() throws IOException {
        IOException iOException = this.f31264a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f31268c) {
            try {
                if (this.f31269n > 0) {
                    mo39342c();
                }
                this.f31262a.flush();
            } catch (IOException e) {
                this.f31264a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f31267b;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f31264a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f31268c) {
            while (i2 > 0) {
                try {
                    int min = Math.min(65536 - this.f31269n, i2);
                    System.arraycopy(bArr, i, this.f31265a, this.f31269n, min);
                    i2 -= min;
                    int i4 = this.f31269n + min;
                    this.f31269n = i4;
                    if (i4 == 65536) {
                        mo39342c();
                    }
                } catch (IOException e) {
                    this.f31264a = e;
                    throw e;
                }
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }
}
