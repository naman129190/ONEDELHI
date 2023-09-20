package com.onedelhi.secure;

import java.io.IOException;
import java.util.Objects;

public class az3 extends q31 {

    /* renamed from: c */
    public static final /* synthetic */ boolean f26058c = false;

    /* renamed from: p */
    public static final int f26059p = 4096;

    /* renamed from: a */
    public q31 f26060a;

    /* renamed from: a */
    public final xy3 f26061a;

    /* renamed from: a */
    public IOException f26062a = null;

    /* renamed from: a */
    public final byte[] f26063a = new byte[4096];

    /* renamed from: b */
    public boolean f26064b = false;

    /* renamed from: b */
    public final byte[] f26065b = new byte[1];

    /* renamed from: n */
    public int f26066n = 0;

    /* renamed from: o */
    public int f26067o = 0;

    static {
        Class<az3> cls = az3.class;
    }

    public az3(q31 q31, xy3 xy3) {
        Objects.requireNonNull(q31);
        this.f26060a = q31;
        this.f26061a = xy3;
    }

    /* renamed from: b */
    public static int m39211b() {
        return 5;
    }

    /* renamed from: a */
    public void mo31274a() throws IOException {
        if (!this.f26064b) {
            mo31275c();
            try {
                this.f26060a.mo31274a();
            } catch (IOException e) {
                this.f26062a = e;
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final void mo31275c() throws IOException {
        IOException iOException = this.f26062a;
        if (iOException == null) {
            try {
                this.f26060a.write(this.f26063a, this.f26066n, this.f26067o);
                this.f26064b = true;
            } catch (IOException e) {
                this.f26062a = e;
                throw e;
            }
        } else {
            throw iOException;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            com.onedelhi.secure.q31 r0 = r2.f26060a
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.f26064b
            if (r0 != 0) goto L_0x000b
            r2.mo31275c()     // Catch:{ IOException -> 0x000b }
        L_0x000b:
            com.onedelhi.secure.q31 r0 = r2.f26060a     // Catch:{ IOException -> 0x0011 }
            r0.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r0 = move-exception
            java.io.IOException r1 = r2.f26062a
            if (r1 != 0) goto L_0x0018
            r2.f26062a = r0
        L_0x0018:
            r0 = 0
            r2.f26060a = r0
        L_0x001b:
            java.io.IOException r0 = r2.f26062a
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.az3.close():void");
    }

    public void flush() throws IOException {
        throw new no4("Flushing is not supported");
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f26065b;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f26062a;
        if (iOException != null) {
            throw iOException;
        } else if (!this.f26064b) {
            while (i2 > 0) {
                int min = Math.min(i2, 4096 - (this.f26066n + this.f26067o));
                System.arraycopy(bArr, i, this.f26063a, this.f26066n + this.f26067o, min);
                i += min;
                i2 -= min;
                int i4 = this.f26067o + min;
                this.f26067o = i4;
                int a = this.f26061a.mo38163a(this.f26063a, this.f26066n, i4);
                this.f26067o -= a;
                try {
                    this.f26060a.write(this.f26063a, this.f26066n, a);
                    int i5 = this.f26066n + a;
                    this.f26066n = i5;
                    int i6 = this.f26067o;
                    if (i5 + i6 == 4096) {
                        byte[] bArr2 = this.f26063a;
                        System.arraycopy(bArr2, i5, bArr2, 0, i6);
                        this.f26066n = 0;
                    }
                } catch (IOException e) {
                    this.f26062a = e;
                    throw e;
                }
            }
        } else {
            throw new bz4("Stream finished or closed");
        }
    }
}
