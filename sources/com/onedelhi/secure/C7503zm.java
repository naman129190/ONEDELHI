package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.onedelhi.secure.zm */
public class C7503zm extends q31 {

    /* renamed from: a */
    public final C5853jx f38363a;

    /* renamed from: a */
    public q31 f38364a;

    /* renamed from: a */
    public final v90 f38365a;

    /* renamed from: a */
    public final OutputStream f38366a;

    /* renamed from: a */
    public final byte[] f38367a = new byte[1];

    /* renamed from: b */
    public final long f38368b;

    /* renamed from: c */
    public long f38369c = 0;

    /* renamed from: n */
    public final int f38370n;

    public C7503zm(OutputStream outputStream, h31[] h31Arr, C5853jx jxVar, C4477aa aaVar) throws IOException {
        this.f38366a = outputStream;
        this.f38363a = jxVar;
        v90 v90 = new v90(outputStream);
        this.f38365a = v90;
        this.f38364a = v90;
        for (int length = h31Arr.length - 1; length >= 0; length--) {
            this.f38364a = h31Arr[length].mo31744g(this.f38364a, aaVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(h31Arr.length - 1);
        for (int i = 0; i < h31Arr.length; i++) {
            gu0.m49828b(byteArrayOutputStream, h31Arr[i].mo31743e());
            byte[] i2 = h31Arr[i].mo31745i();
            gu0.m49828b(byteArrayOutputStream, (long) i2.length);
            byteArrayOutputStream.write(i2);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length + 4;
        this.f38370n = length2;
        if (length2 <= 1024) {
            byteArray[0] = (byte) (byteArray.length / 4);
            outputStream.write(byteArray);
            gu0.m49829c(outputStream, byteArray);
            this.f38368b = (9223372036854775804L - ((long) length2)) - ((long) jxVar.mo38918d());
            return;
        }
        throw new no4();
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        this.f38364a.mo31274a();
        mo48317d();
        for (long b = this.f38365a.mo46029b(); (3 & b) != 0; b++) {
            this.f38366a.write(0);
        }
        this.f38366a.write(this.f38363a.mo31122a());
    }

    /* renamed from: b */
    public long mo48315b() {
        return this.f38369c;
    }

    /* renamed from: c */
    public long mo48316c() {
        return ((long) this.f38370n) + this.f38365a.mo46029b() + ((long) this.f38363a.mo38918d());
    }

    /* renamed from: d */
    public final void mo48317d() throws IOException {
        long b = this.f38365a.mo46029b();
        if (b < 0 || b > this.f38368b || this.f38369c < 0) {
            throw new bz4("XZ Stream has grown too big");
        }
    }

    public void flush() throws IOException {
        this.f38364a.flush();
        mo48317d();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f38367a;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f38364a.write(bArr, i, i2);
        this.f38363a.mo31123f(bArr, i, i2);
        this.f38369c += (long) i2;
        mo48317d();
    }
}
