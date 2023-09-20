package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.onedelhi.secure.ro */
public final class C3428ro extends OutputStream {

    /* renamed from: a */
    public C3131pa f19949a;
    @mr2

    /* renamed from: a */
    public final OutputStream f19950a;

    /* renamed from: a */
    public byte[] f19951a;

    /* renamed from: n */
    public int f19952n;

    public C3428ro(@mr2 OutputStream outputStream, @mr2 C3131pa paVar) {
        this(outputStream, paVar, 65536);
    }

    @hw4
    public C3428ro(@mr2 OutputStream outputStream, C3131pa paVar, int i) {
        this.f19950a = outputStream;
        this.f19949a = paVar;
        this.f19951a = (byte[]) paVar.mo18216d(i, byte[].class);
    }

    /* renamed from: a */
    public final void mo23964a() throws IOException {
        int i = this.f19952n;
        if (i > 0) {
            this.f19950a.write(this.f19951a, 0, i);
            this.f19952n = 0;
        }
    }

    /* renamed from: b */
    public final void mo23965b() throws IOException {
        if (this.f19952n == this.f19951a.length) {
            mo23964a();
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f19950a.close();
            release();
        } catch (Throwable th) {
            this.f19950a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        mo23964a();
        this.f19950a.flush();
    }

    public final void release() {
        byte[] bArr = this.f19951a;
        if (bArr != null) {
            this.f19949a.mo18218f(bArr);
            this.f19951a = null;
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f19951a;
        int i2 = this.f19952n;
        this.f19952n = i2 + 1;
        bArr[i2] = (byte) i;
        mo23965b();
    }

    public void write(@mr2 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(@mr2 byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f19952n;
            if (i6 != 0 || i4 < this.f19951a.length) {
                int min = Math.min(i4, this.f19951a.length - i6);
                System.arraycopy(bArr, i5, this.f19951a, this.f19952n, min);
                this.f19952n += min;
                i3 += min;
                mo23965b();
            } else {
                this.f19950a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
