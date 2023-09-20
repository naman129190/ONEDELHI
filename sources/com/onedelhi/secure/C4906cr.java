package com.onedelhi.secure;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.onedelhi.secure.cr */
public final class C4906cr {

    /* renamed from: a */
    public static final int f27040a = 8192;

    /* renamed from: b */
    public static final int f27041b = 2147483639;

    /* renamed from: c */
    public static final int f27042c = 20;

    /* renamed from: com.onedelhi.secure.cr$a */
    public static final class C4907a extends FilterInputStream {

        /* renamed from: b */
        public long f27043b;

        /* renamed from: c */
        public long f27044c = -1;

        public C4907a(InputStream inputStream, long j) {
            super(inputStream);
            this.f27043b = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f27043b);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f27044c = this.f27043b;
        }

        public int read() throws IOException {
            if (this.f27043b == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f27043b--;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f27043b;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f27043b -= (long) read;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f27044c != -1) {
                this.in.reset();
                this.f27043b = this.f27044c;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f27043b));
            this.f27043b -= skip;
            return skip;
        }
    }

    /* renamed from: a */
    public static byte[] m44228a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m44229b() {
        return new byte[8192];
    }

    /* renamed from: c */
    public static InputStream m44230c(InputStream inputStream, long j) {
        return new C4907a(inputStream, j);
    }

    /* renamed from: d */
    public static int m44231d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static byte[] m44232e(InputStream inputStream) throws IOException {
        return m44233f(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: f */
    public static byte[] m44233f(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m44228a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = m44231d(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m44228a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
