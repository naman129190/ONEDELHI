package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class kw0 extends InputStream {
    @mj1("POOL")

    /* renamed from: a */
    public static final Queue<kw0> f15086a = oq4.m24018f(0);

    /* renamed from: a */
    public IOException f15087a;

    /* renamed from: a */
    public InputStream f15088a;

    /* renamed from: a */
    public static void m20054a() {
        synchronized (f15086a) {
            while (true) {
                Queue<kw0> queue = f15086a;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    @mr2
    /* renamed from: c */
    public static kw0 m20055c(@mr2 InputStream inputStream) {
        kw0 poll;
        Queue<kw0> queue = f15086a;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new kw0();
        }
        poll.mo19207d(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f15088a.available();
    }

    @ts2
    /* renamed from: b */
    public IOException mo19205b() {
        return this.f15087a;
    }

    public void close() throws IOException {
        this.f15088a.close();
    }

    /* renamed from: d */
    public void mo19207d(@mr2 InputStream inputStream) {
        this.f15088a = inputStream;
    }

    public void mark(int i) {
        this.f15088a.mark(i);
    }

    public boolean markSupported() {
        return this.f15088a.markSupported();
    }

    public int read() throws IOException {
        try {
            return this.f15088a.read();
        } catch (IOException e) {
            this.f15087a = e;
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f15088a.read(bArr);
        } catch (IOException e) {
            this.f15087a = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f15088a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f15087a = e;
            throw e;
        }
    }

    public void release() {
        this.f15087a = null;
        this.f15088a = null;
        Queue<kw0> queue = f15086a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f15088a.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f15088a.skip(j);
        } catch (IOException e) {
            this.f15087a = e;
            throw e;
        }
    }
}
