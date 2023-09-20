package com.onedelhi.secure;

import java.io.IOException;

public class oj0 extends q31 {

    /* renamed from: n */
    public static final int f33039n = 4096;

    /* renamed from: a */
    public final kj0 f33040a;

    /* renamed from: a */
    public q31 f33041a;

    /* renamed from: a */
    public IOException f33042a = null;

    /* renamed from: a */
    public final byte[] f33043a = new byte[4096];

    /* renamed from: b */
    public boolean f33044b = false;

    /* renamed from: b */
    public final byte[] f33045b = new byte[1];

    public oj0(q31 q31, nj0 nj0) {
        this.f33041a = q31;
        this.f33040a = new kj0(nj0.mo41076j());
    }

    /* renamed from: b */
    public static int m59421b() {
        return 5;
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f33044b) {
            IOException iOException = this.f33042a;
            if (iOException == null) {
                try {
                    this.f33041a.mo31274a();
                    this.f33044b = true;
                } catch (IOException e) {
                    this.f33042a = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        }
    }

    public void close() throws IOException {
        q31 q31 = this.f33041a;
        if (q31 != null) {
            try {
                q31.close();
            } catch (IOException e) {
                if (this.f33042a == null) {
                    this.f33042a = e;
                }
            }
            this.f33041a = null;
        }
        IOException iOException = this.f33042a;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void flush() throws IOException {
        IOException iOException = this.f33042a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f33044b) {
            try {
                this.f33041a.flush();
            } catch (IOException e) {
                this.f33042a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f33045b;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f33042a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f33044b) {
            while (i2 > 4096) {
                try {
                    this.f33040a.mo39266a(bArr, i, 4096, this.f33043a);
                    this.f33041a.write(this.f33043a);
                    i += 4096;
                    i2 -= 4096;
                } catch (IOException e) {
                    this.f33042a = e;
                    throw e;
                }
            }
            this.f33040a.mo39266a(bArr, i, i2, this.f33043a);
            this.f33041a.write(this.f33043a, 0, i2);
        } else {
            throw new bz4("Stream finished");
        }
    }
}
