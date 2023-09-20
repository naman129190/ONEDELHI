package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

public class gu1 extends InputStream {

    /* renamed from: a */
    public ByteBuffer f29317a;

    /* renamed from: a */
    public Iterator<ByteBuffer> f29318a;

    /* renamed from: a */
    public byte[] f29319a;

    /* renamed from: b */
    public long f29320b;

    /* renamed from: b */
    public boolean f29321b;

    /* renamed from: n */
    public int f29322n = 0;

    /* renamed from: o */
    public int f29323o;

    /* renamed from: p */
    public int f29324p;

    /* renamed from: q */
    public int f29325q;

    public gu1(Iterable<ByteBuffer> iterable) {
        this.f29318a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f29322n++;
        }
        this.f29323o = -1;
        if (!mo36887a()) {
            this.f29317a = vs1.f36664a;
            this.f29323o = 0;
            this.f29324p = 0;
            this.f29320b = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo36887a() {
        this.f29323o++;
        if (!this.f29318a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f29318a.next();
        this.f29317a = next;
        this.f29324p = next.position();
        if (this.f29317a.hasArray()) {
            this.f29321b = true;
            this.f29319a = this.f29317a.array();
            this.f29325q = this.f29317a.arrayOffset();
        } else {
            this.f29321b = false;
            this.f29320b = ko4.m54709k(this.f29317a);
            this.f29319a = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo36888b(int i) {
        int i2 = this.f29324p + i;
        this.f29324p = i2;
        if (i2 == this.f29317a.limit()) {
            mo36887a();
        }
    }

    public int read() throws IOException {
        if (this.f29323o == this.f29322n) {
            return -1;
        }
        byte A = (this.f29321b ? this.f29319a[this.f29324p + this.f29325q] : ko4.m54663A(((long) this.f29324p) + this.f29320b)) & 255;
        mo36888b(1);
        return A;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f29323o == this.f29322n) {
            return -1;
        }
        int limit = this.f29317a.limit();
        int i3 = this.f29324p;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f29321b) {
            System.arraycopy(this.f29319a, i3 + this.f29325q, bArr, i, i2);
        } else {
            int position = this.f29317a.position();
            this.f29317a.position(this.f29324p);
            this.f29317a.get(bArr, i, i2);
            this.f29317a.position(position);
        }
        mo36888b(i2);
        return i2;
    }
}
