package com.onedelhi.secure;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class q02 extends q31 {

    /* renamed from: f */
    public static final /* synthetic */ boolean f33861f = false;

    /* renamed from: p */
    public static final int f33862p = 65536;

    /* renamed from: a */
    public final C4477aa f33863a;

    /* renamed from: a */
    public k02 f33864a;

    /* renamed from: a */
    public q31 f33865a;

    /* renamed from: a */
    public t02 f33866a;

    /* renamed from: a */
    public we3 f33867a;

    /* renamed from: a */
    public final DataOutputStream f33868a;

    /* renamed from: a */
    public IOException f33869a = null;

    /* renamed from: a */
    public final byte[] f33870a = new byte[1];

    /* renamed from: b */
    public boolean f33871b = true;

    /* renamed from: c */
    public boolean f33872c = true;

    /* renamed from: d */
    public boolean f33873d = true;

    /* renamed from: e */
    public boolean f33874e = false;

    /* renamed from: n */
    public final int f33875n;

    /* renamed from: o */
    public int f33876o = 0;

    static {
        Class<q02> cls = q02.class;
    }

    public q02(q31 q31, p02 p02, C4477aa aaVar) {
        C4477aa aaVar2 = aaVar;
        Objects.requireNonNull(q31);
        this.f33863a = aaVar2;
        this.f33865a = q31;
        this.f33868a = new DataOutputStream(q31);
        this.f33867a = new we3(65536, aaVar2);
        int k = p02.mo42328k();
        int i = k;
        t02 n = t02.m65079n(this.f33867a, p02.mo42329l(), p02.mo42330m(), p02.mo42334q(), p02.mo42332o(), i, m61796b(k), p02.mo42333p(), p02.mo42331n(), p02.mo42327j(), aaVar);
        this.f33866a = n;
        this.f33864a = n.mo44701o();
        byte[] r = p02.mo42335r();
        if (r != null && r.length > 0) {
            this.f33864a.mo38981v(k, r);
            this.f33871b = false;
        }
        this.f33875n = (((p02.mo42334q() * 5) + p02.mo42330m()) * 9) + p02.mo42329l();
    }

    /* renamed from: b */
    public static int m61796b(int i) {
        if (65536 > i) {
            return 65536 - i;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m61797c(p02 p02) {
        int k = p02.mo42328k();
        return t02.m65080t(p02.mo42332o(), k, m61796b(k), p02.mo42331n()) + 70;
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f33874e) {
            mo43001g();
            try {
                this.f33865a.mo31274a();
            } catch (IOException e) {
                this.f33869a = e;
                throw e;
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            com.onedelhi.secure.q31 r0 = r2.f33865a
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.f33874e
            if (r0 != 0) goto L_0x000b
            r2.mo43001g()     // Catch:{ IOException -> 0x000b }
        L_0x000b:
            com.onedelhi.secure.q31 r0 = r2.f33865a     // Catch:{ IOException -> 0x0011 }
            r0.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r0 = move-exception
            java.io.IOException r1 = r2.f33869a
            if (r1 != 0) goto L_0x0018
            r2.f33869a = r0
        L_0x0018:
            r0 = 0
            r2.f33865a = r0
        L_0x001b:
            java.io.IOException r0 = r2.f33869a
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.q02.close():void");
    }

    /* renamed from: d */
    public final void mo42999d() throws IOException {
        int f = this.f33867a.mo46132f();
        int x = this.f33866a.mo44709x();
        if (f + 2 < x) {
            mo43002h(x, f);
        } else {
            this.f33866a.mo43775b();
            x = this.f33866a.mo44709x();
            mo43003l(x);
        }
        this.f33876o -= x;
        this.f33866a.mo44711z();
        this.f33867a.mo46134l();
    }

    public void flush() throws IOException {
        IOException iOException = this.f33869a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f33874e) {
            try {
                this.f33864a.mo38980u();
                while (this.f33876o > 0) {
                    this.f33866a.mo44693e();
                    mo42999d();
                }
                this.f33865a.flush();
            } catch (IOException e) {
                this.f33869a = e;
                throw e;
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }

    /* renamed from: g */
    public final void mo43001g() throws IOException {
        IOException iOException = this.f33869a;
        if (iOException == null) {
            this.f33864a.mo38979t();
            while (this.f33876o > 0) {
                try {
                    this.f33866a.mo44693e();
                    mo42999d();
                } catch (IOException e) {
                    this.f33869a = e;
                    throw e;
                }
            }
            this.f33865a.write(0);
            this.f33874e = true;
            this.f33866a.mo44710y(this.f33863a);
            this.f33866a = null;
            this.f33864a = null;
            this.f33867a.mo46705o(this.f33863a);
            this.f33867a = null;
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo43002h(int i, int i2) throws IOException {
        int i3 = i - 1;
        this.f33868a.writeByte((this.f33873d ? this.f33871b ? 224 : 192 : this.f33872c ? 160 : 128) | (i3 >>> 16));
        this.f33868a.writeShort(i3);
        this.f33868a.writeShort(i2 - 1);
        if (this.f33873d) {
            this.f33868a.writeByte(this.f33875n);
        }
        this.f33867a.mo46706p(this.f33865a);
        this.f33873d = false;
        this.f33872c = false;
        this.f33871b = false;
    }

    /* renamed from: l */
    public final void mo43003l(int i) throws IOException {
        while (true) {
            int i2 = 1;
            if (i > 0) {
                int min = Math.min(i, 65536);
                DataOutputStream dataOutputStream = this.f33868a;
                if (!this.f33871b) {
                    i2 = 2;
                }
                dataOutputStream.writeByte(i2);
                this.f33868a.writeShort(min - 1);
                this.f33864a.mo38966a(this.f33865a, i, min);
                i -= min;
                this.f33871b = false;
            } else {
                this.f33872c = true;
                return;
            }
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f33870a;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f33869a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f33874e) {
            while (i2 > 0) {
                try {
                    int b = this.f33864a.mo38967b(bArr, i, i2);
                    i += b;
                    i2 -= b;
                    this.f33876o += b;
                    if (this.f33866a.mo44693e()) {
                        mo42999d();
                    }
                } catch (IOException e) {
                    this.f33869a = e;
                    throw e;
                }
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }
}
