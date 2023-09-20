package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
public class jw0 extends InputStream {

    /* renamed from: a */
    public static final Queue<jw0> f14577a = oq4.m24018f(0);

    /* renamed from: a */
    public IOException f14578a;

    /* renamed from: a */
    public InputStream f14579a;

    /* renamed from: a */
    public static void m19217a() {
        while (true) {
            Queue<jw0> queue = f14577a;
            if (!queue.isEmpty()) {
                queue.remove();
            } else {
                return;
            }
        }
    }

    @mr2
    /* renamed from: c */
    public static jw0 m19218c(@mr2 InputStream inputStream) {
        jw0 poll;
        Queue<jw0> queue = f14577a;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new jw0();
        }
        poll.mo18690d(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f14579a.available();
    }

    @ts2
    /* renamed from: b */
    public IOException mo18688b() {
        return this.f14578a;
    }

    public void close() throws IOException {
        this.f14579a.close();
    }

    /* renamed from: d */
    public void mo18690d(@mr2 InputStream inputStream) {
        this.f14579a = inputStream;
    }

    public void mark(int i) {
        this.f14579a.mark(i);
    }

    public boolean markSupported() {
        return this.f14579a.markSupported();
    }

    public int read() {
        try {
            return this.f14579a.read();
        } catch (IOException e) {
            this.f14578a = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f14579a.read(bArr);
        } catch (IOException e) {
            this.f14578a = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f14579a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f14578a = e;
            return -1;
        }
    }

    public void release() {
        this.f14578a = null;
        this.f14579a = null;
        Queue<jw0> queue = f14577a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f14579a.reset();
    }

    public long skip(long j) {
        try {
            return this.f14579a.skip(j);
        } catch (IOException e) {
            this.f14578a = e;
            return 0;
        }
    }
}
