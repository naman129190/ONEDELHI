package com.onedelhi.secure;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class md2 extends FilterInputStream {

    /* renamed from: o */
    public static final int f16079o = Integer.MIN_VALUE;

    /* renamed from: p */
    public static final int f16080p = -1;

    /* renamed from: n */
    public int f16081n = Integer.MIN_VALUE;

    public md2(@mr2 InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final long mo20303a(long j) {
        int i = this.f16081n;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    public int available() throws IOException {
        int i = this.f16081n;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void mo20305b(long j) {
        int i = this.f16081n;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f16081n = (int) (((long) i) - j);
        }
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f16081n = i;
    }

    public int read() throws IOException {
        if (mo20303a(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo20305b(1);
        return read;
    }

    public int read(@mr2 byte[] bArr, int i, int i2) throws IOException {
        int a = (int) mo20303a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        mo20305b((long) read);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f16081n = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = mo20303a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        mo20305b(skip);
        return skip;
    }
}
