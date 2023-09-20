package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

public final class ox0 extends FilterInputStream {

    /* renamed from: a */
    public static final byte[] f18171a;

    /* renamed from: o */
    public static final int f18172o = 2;

    /* renamed from: p */
    public static final int f18173p;

    /* renamed from: q */
    public static final int f18174q;

    /* renamed from: a */
    public final byte f18175a;

    /* renamed from: n */
    public int f18176n;

    static {
        byte[] bArr = {-1, mx0.f16785s, 0, m10.C2800f.f15783a, 69, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f18171a = bArr;
        int length = bArr.length;
        f18173p = length;
        f18174q = length + 2;
    }

    public ox0(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f18175a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2 = this.f18176n;
        int read = (i2 < 2 || i2 > (i = f18174q)) ? super.read() : i2 == i ? this.f18175a : f18171a[i2 - 2] & 255;
        if (read != -1) {
            this.f18176n++;
        }
        return read;
    }

    public int read(@mr2 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f18176n;
        int i5 = f18174q;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f18175a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f18171a, this.f18176n - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f18176n += i3;
        }
        return i3;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f18176n = (int) (((long) this.f18176n) + skip);
        }
        return skip;
    }
}
