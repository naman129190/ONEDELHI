package com.onedelhi.secure;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ug3 extends FilterInputStream {

    /* renamed from: a */
    public final C3131pa f21355a;

    /* renamed from: a */
    public volatile byte[] f21356a;

    /* renamed from: n */
    public int f21357n;

    /* renamed from: o */
    public int f21358o;

    /* renamed from: p */
    public int f21359p;

    /* renamed from: q */
    public int f21360q;

    /* renamed from: com.onedelhi.secure.ug3$a */
    public static class C3706a extends IOException {

        /* renamed from: b */
        public static final long f21361b = -4338378848813561757L;

        public C3706a(String str) {
            super(str);
        }
    }

    public ug3(@mr2 InputStream inputStream, @mr2 C3131pa paVar) {
        this(inputStream, paVar, 65536);
    }

    @hw4
    public ug3(@mr2 InputStream inputStream, @mr2 C3131pa paVar, int i) {
        super(inputStream);
        this.f21359p = -1;
        this.f21355a = paVar;
        this.f21356a = (byte[]) paVar.mo18216d(i, byte[].class);
    }

    /* renamed from: c */
    public static IOException m29326c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int mo25603a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f21359p;
        if (i2 == -1 || this.f21360q - i2 >= (i = this.f21358o)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f21359p = -1;
                this.f21360q = 0;
                this.f21357n = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f21357n == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f21355a.mo18216d(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f21356a = bArr2;
            this.f21355a.mo18218f(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f21360q - this.f21359p;
        this.f21360q = i3;
        this.f21359p = 0;
        this.f21357n = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f21360q;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f21357n = i4;
        return read2;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f21356a == null || inputStream == null) {
            throw m29326c();
        }
        return (this.f21357n - this.f21360q) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo25605b() {
        this.f21358o = this.f21356a.length;
    }

    public void close() throws IOException {
        if (this.f21356a != null) {
            this.f21355a.mo18218f(this.f21356a);
            this.f21356a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f21358o = Math.max(this.f21358o, i);
        this.f21359p = this.f21360q;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f21356a     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f21360q     // Catch:{ all -> 0x003e }
            int r3 = r5.f21357n     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.mo25603a(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f21356a     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f21356a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m29326c()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f21357n     // Catch:{ all -> 0x003e }
            int r2 = r5.f21360q     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f21360q = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m29326c()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ug3.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@com.onedelhi.secure.mr2 byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f21356a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f21360q     // Catch:{ all -> 0x0090 }
            int r3 = r6.f21357n     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f21360q     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f21360q = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f21359p     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.mo25603a(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f21356a     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f21356a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m29326c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f21357n     // Catch:{ all -> 0x0090 }
            int r4 = r6.f21360q     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f21360q     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f21360q = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m29326c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m29326c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ug3.read(byte[], int, int):int");
    }

    public synchronized void release() {
        if (this.f21356a != null) {
            this.f21355a.mo18218f(this.f21356a);
            this.f21356a = null;
        }
    }

    public synchronized void reset() throws IOException {
        if (this.f21356a != null) {
            int i = this.f21359p;
            if (-1 != i) {
                this.f21360q = i;
            } else {
                throw new C3706a("Mark has been invalidated, pos: " + this.f21360q + " markLimit: " + this.f21358o);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f21356a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f21357n;
                int i2 = this.f21360q;
                if (((long) (i - i2)) >= j) {
                    this.f21360q = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f21360q = i;
                if (this.f21359p == -1 || j > ((long) this.f21358o)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f21359p = -1;
                    }
                    return j2 + skip;
                } else if (mo25603a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f21357n;
                    int i4 = this.f21360q;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f21360q = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f21360q = i3;
                    return j3;
                }
            } else {
                throw m29326c();
            }
        } else {
            throw m29326c();
        }
    }
}
