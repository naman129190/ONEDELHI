package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public final class qr1 extends OutputStream {

    /* renamed from: a */
    public oo2 f34334a;

    /* renamed from: a */
    public final qe4 f34335a;

    /* renamed from: a */
    public final OutputStream f34336a;

    /* renamed from: b */
    public long f34337b = -1;

    public qr1(OutputStream outputStream, oo2 oo2, qe4 qe4) {
        this.f34336a = outputStream;
        this.f34334a = oo2;
        this.f34335a = qe4;
    }

    public void close() throws IOException {
        long j = this.f34337b;
        if (j != -1) {
            this.f34334a.mo41942u(j);
        }
        this.f34334a.mo41946y(this.f34335a.mo43508c());
        try {
            this.f34336a.close();
        } catch (IOException e) {
            this.f34334a.mo41947z(this.f34335a.mo43508c());
            po2.m61530d(this.f34334a);
            throw e;
        }
    }

    public void flush() throws IOException {
        try {
            this.f34336a.flush();
        } catch (IOException e) {
            this.f34334a.mo41947z(this.f34335a.mo43508c());
            po2.m61530d(this.f34334a);
            throw e;
        }
    }

    public void write(int i) throws IOException {
        try {
            this.f34336a.write(i);
            long j = this.f34337b + 1;
            this.f34337b = j;
            this.f34334a.mo41942u(j);
        } catch (IOException e) {
            this.f34334a.mo41947z(this.f34335a.mo43508c());
            po2.m61530d(this.f34334a);
            throw e;
        }
    }

    public void write(byte[] bArr) throws IOException {
        try {
            this.f34336a.write(bArr);
            long length = this.f34337b + ((long) bArr.length);
            this.f34337b = length;
            this.f34334a.mo41942u(length);
        } catch (IOException e) {
            this.f34334a.mo41947z(this.f34335a.mo43508c());
            po2.m61530d(this.f34334a);
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f34336a.write(bArr, i, i2);
            long j = this.f34337b + ((long) i2);
            this.f34337b = j;
            this.f34334a.mo41942u(j);
        } catch (IOException e) {
            this.f34334a.mo41947z(this.f34335a.mo43508c());
            po2.m61530d(this.f34334a);
            throw e;
        }
    }
}
