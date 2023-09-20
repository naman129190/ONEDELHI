package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public class dz4 extends q31 {

    /* renamed from: a */
    public final C4477aa f27653a;

    /* renamed from: a */
    public final h44 f27654a;

    /* renamed from: a */
    public final C5853jx f27655a;

    /* renamed from: a */
    public final yp1 f27656a;

    /* renamed from: a */
    public C7503zm f27657a;

    /* renamed from: a */
    public IOException f27658a;

    /* renamed from: a */
    public OutputStream f27659a;

    /* renamed from: a */
    public final byte[] f27660a;

    /* renamed from: a */
    public h31[] f27661a;

    /* renamed from: b */
    public boolean f27662b;

    /* renamed from: c */
    public boolean f27663c;

    public dz4(OutputStream outputStream, i31 i31) throws IOException {
        this(outputStream, i31, 4);
    }

    public dz4(OutputStream outputStream, i31 i31, int i) throws IOException {
        this(outputStream, new i31[]{i31}, i);
    }

    public dz4(OutputStream outputStream, i31 i31, int i, C4477aa aaVar) throws IOException {
        this(outputStream, new i31[]{i31}, i, aaVar);
    }

    public dz4(OutputStream outputStream, i31 i31, C4477aa aaVar) throws IOException {
        this(outputStream, i31, 4, aaVar);
    }

    public dz4(OutputStream outputStream, i31[] i31Arr) throws IOException {
        this(outputStream, i31Arr, 4);
    }

    public dz4(OutputStream outputStream, i31[] i31Arr, int i) throws IOException {
        this(outputStream, i31Arr, i, C4477aa.m36107b());
    }

    public dz4(OutputStream outputStream, i31[] i31Arr, int i, C4477aa aaVar) throws IOException {
        h44 h44 = new h44();
        this.f27654a = h44;
        this.f27656a = new yp1();
        this.f27657a = null;
        this.f27658a = null;
        this.f27663c = false;
        this.f27660a = new byte[1];
        this.f27653a = aaVar;
        this.f27659a = outputStream;
        mo34730l(i31Arr);
        h44.f29453a = i;
        this.f27655a = C5853jx.m53873b(i);
        mo34726d();
    }

    public dz4(OutputStream outputStream, i31[] i31Arr, C4477aa aaVar) throws IOException {
        this(outputStream, i31Arr, 4, aaVar);
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f27663c) {
            mo34728g();
            try {
                this.f27656a.mo47915f(this.f27659a);
                mo34724c();
                this.f27663c = true;
            } catch (IOException e) {
                this.f27658a = e;
                throw e;
            }
        }
    }

    /* renamed from: b */
    public final void mo34723b(byte[] bArr, int i) {
        bArr[i] = 0;
        bArr[i + 1] = (byte) this.f27654a.f29453a;
    }

    /* renamed from: c */
    public final void mo34724c() throws IOException {
        byte[] bArr = new byte[6];
        long c = (this.f27656a.mo46815c() / 4) - 1;
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) ((int) (c >>> (i * 8)));
        }
        mo34723b(bArr, 4);
        gu0.m49829c(this.f27659a, bArr);
        this.f27659a.write(bArr);
        this.f27659a.write(zy4.f38506b);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            java.io.OutputStream r0 = r2.f27659a
            if (r0 == 0) goto L_0x0017
            r2.mo31274a()     // Catch:{ IOException -> 0x0007 }
        L_0x0007:
            java.io.OutputStream r0 = r2.f27659a     // Catch:{ IOException -> 0x000d }
            r0.close()     // Catch:{ IOException -> 0x000d }
            goto L_0x0014
        L_0x000d:
            r0 = move-exception
            java.io.IOException r1 = r2.f27658a
            if (r1 != 0) goto L_0x0014
            r2.f27658a = r0
        L_0x0014:
            r0 = 0
            r2.f27659a = r0
        L_0x0017:
            java.io.IOException r0 = r2.f27658a
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dz4.close():void");
    }

    /* renamed from: d */
    public final void mo34726d() throws IOException {
        this.f27659a.write(zy4.f38504a);
        byte[] bArr = new byte[2];
        mo34723b(bArr, 0);
        this.f27659a.write(bArr);
        gu0.m49829c(this.f27659a, bArr);
    }

    public void flush() throws IOException {
        OutputStream outputStream;
        IOException iOException = this.f27658a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f27663c) {
            try {
                C7503zm zmVar = this.f27657a;
                if (zmVar == null) {
                    outputStream = this.f27659a;
                } else if (this.f27662b) {
                    zmVar.flush();
                    return;
                } else {
                    mo34728g();
                    outputStream = this.f27659a;
                }
                outputStream.flush();
            } catch (IOException e) {
                this.f27658a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    /* renamed from: g */
    public void mo34728g() throws IOException {
        IOException iOException = this.f27658a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f27663c) {
            C7503zm zmVar = this.f27657a;
            if (zmVar != null) {
                try {
                    zmVar.mo31274a();
                    this.f27656a.mo46813a(this.f27657a.mo48316c(), this.f27657a.mo48315b());
                    this.f27657a = null;
                } catch (IOException e) {
                    this.f27658a = e;
                    throw e;
                }
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    /* renamed from: h */
    public void mo34729h(i31 i31) throws bz4 {
        mo34730l(new i31[]{i31});
    }

    /* renamed from: l */
    public void mo34730l(i31[] i31Arr) throws bz4 {
        if (this.f27657a != null) {
            throw new no4("Changing filter options in the middle of a XZ Block not implemented");
        } else if (i31Arr.length < 1 || i31Arr.length > 4) {
            throw new no4("XZ filter chain must be 1-4 filters");
        } else {
            this.f27662b = true;
            h31[] h31Arr = new h31[i31Arr.length];
            for (int i = 0; i < i31Arr.length; i++) {
                h31Arr[i] = i31Arr[i].mo37820e();
                this.f27662b &= h31Arr[i].mo31742b();
            }
            hf3.m50489a(h31Arr);
            this.f27661a = h31Arr;
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f27660a;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f27658a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f27663c) {
            try {
                if (this.f27657a == null) {
                    this.f27657a = new C7503zm(this.f27659a, this.f27661a, this.f27655a, this.f27653a);
                }
                this.f27657a.write(bArr, i, i2);
            } catch (IOException e) {
                this.f27658a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }
}
