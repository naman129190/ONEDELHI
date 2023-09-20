package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public final class pr1 extends InputStream {

    /* renamed from: a */
    public final oo2 f33758a;

    /* renamed from: a */
    public final qe4 f33759a;

    /* renamed from: a */
    public final InputStream f33760a;

    /* renamed from: b */
    public long f33761b = -1;

    /* renamed from: c */
    public long f33762c;

    /* renamed from: d */
    public long f33763d = -1;

    public pr1(InputStream inputStream, oo2 oo2, qe4 qe4) {
        this.f33759a = qe4;
        this.f33760a = inputStream;
        this.f33758a = oo2;
        this.f33762c = oo2.mo41930f();
    }

    public int available() throws IOException {
        try {
            return this.f33760a.available();
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public void close() throws IOException {
        long c = this.f33759a.mo43508c();
        if (this.f33763d == -1) {
            this.f33763d = c;
        }
        try {
            this.f33760a.close();
            long j = this.f33761b;
            if (j != -1) {
                this.f33758a.mo41945x(j);
            }
            long j2 = this.f33762c;
            if (j2 != -1) {
                this.f33758a.mo41924B(j2);
            }
            this.f33758a.mo41947z(this.f33763d);
            this.f33758a.mo41927b();
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public void mark(int i) {
        this.f33760a.mark(i);
    }

    public boolean markSupported() {
        return this.f33760a.markSupported();
    }

    public int read() throws IOException {
        try {
            int read = this.f33760a.read();
            long c = this.f33759a.mo43508c();
            if (this.f33762c == -1) {
                this.f33762c = c;
            }
            if (read == -1 && this.f33763d == -1) {
                this.f33763d = c;
                this.f33758a.mo41947z(c);
                this.f33758a.mo41927b();
            } else {
                long j = this.f33761b + 1;
                this.f33761b = j;
                this.f33758a.mo41945x(j);
            }
            return read;
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f33760a.read(bArr);
            long c = this.f33759a.mo43508c();
            if (this.f33762c == -1) {
                this.f33762c = c;
            }
            if (read == -1 && this.f33763d == -1) {
                this.f33763d = c;
                this.f33758a.mo41947z(c);
                this.f33758a.mo41927b();
            } else {
                long j = this.f33761b + ((long) read);
                this.f33761b = j;
                this.f33758a.mo41945x(j);
            }
            return read;
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f33760a.read(bArr, i, i2);
            long c = this.f33759a.mo43508c();
            if (this.f33762c == -1) {
                this.f33762c = c;
            }
            if (read == -1 && this.f33763d == -1) {
                this.f33763d = c;
                this.f33758a.mo41947z(c);
                this.f33758a.mo41927b();
            } else {
                long j = this.f33761b + ((long) read);
                this.f33761b = j;
                this.f33758a.mo41945x(j);
            }
            return read;
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public void reset() throws IOException {
        try {
            this.f33760a.reset();
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }

    public long skip(long j) throws IOException {
        try {
            long skip = this.f33760a.skip(j);
            long c = this.f33759a.mo43508c();
            if (this.f33762c == -1) {
                this.f33762c = c;
            }
            if (skip == -1 && this.f33763d == -1) {
                this.f33763d = c;
                this.f33758a.mo41947z(c);
            } else {
                long j2 = this.f33761b + skip;
                this.f33761b = j2;
                this.f33758a.mo41945x(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f33758a.mo41947z(this.f33759a.mo43508c());
            po2.m61530d(this.f33758a);
            throw e;
        }
    }
}
