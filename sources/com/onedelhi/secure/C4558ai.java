package com.onedelhi.secure;

import java.io.InputStream;

/* renamed from: com.onedelhi.secure.ai */
public class C4558ai extends C7491zh implements g31 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f25854a = false;

    /* renamed from: a */
    public final int f25855a;

    /* renamed from: g */
    public final long f25856g;

    public C4558ai(long j, byte[] bArr) throws no4 {
        this.f25856g = j;
        if (bArr.length == 0) {
            this.f25855a = 0;
        } else if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f25855a = i;
        } else {
            throw new no4("Unsupported BCJ filter properties");
        }
    }

    /* renamed from: d */
    public int mo30928d() {
        return yy3.m72387a();
    }

    /* renamed from: h */
    public InputStream mo30929h(InputStream inputStream, C4477aa aaVar) {
        long j = this.f25856g;
        return new yy3(inputStream, j == 4 ? new xy4(false, this.f25855a) : j == 5 ? new w33(false, this.f25855a) : j == 6 ? new in1(false, this.f25855a) : j == 7 ? new C6992v(false, this.f25855a) : j == 8 ? new C7214x(false, this.f25855a) : j == 9 ? new xo3(false, this.f25855a) : null);
    }
}
