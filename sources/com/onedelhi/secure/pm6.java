package com.onedelhi.secure;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

public class pm6 extends nm6 {

    /* renamed from: a */
    public final byte[] f18618a;

    public pm6(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f18618a = bArr;
    }

    /* renamed from: b */
    public byte mo18484b(int i) {
        return this.f18618a[i];
    }

    /* renamed from: e */
    public byte mo18485e(int i) {
        return this.f18618a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on6) || mo18486f() != ((on6) obj).mo18486f()) {
            return false;
        }
        if (mo18486f() == 0) {
            return true;
        }
        if (!(obj instanceof pm6)) {
            return obj.equals(this);
        }
        pm6 pm6 = (pm6) obj;
        int o = mo22032o();
        int o2 = pm6.mo22032o();
        if (o != 0 && o2 != 0 && o != o2) {
            return false;
        }
        int f = mo18486f();
        if (f > pm6.mo18486f()) {
            int f2 = mo18486f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= pm6.mo18486f()) {
            byte[] bArr = this.f18618a;
            byte[] bArr2 = pm6.f18618a;
            pm6.mo18487t();
            int i = 0;
            int i2 = 0;
            while (i < f) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int f3 = pm6.mo18486f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo18486f() {
        return this.f18618a.length;
    }

    /* renamed from: g */
    public final int mo22025g(int i, int i2, int i3) {
        return zq6.m33323b(i, this.f18618a, 0, i3);
    }

    /* renamed from: i */
    public final on6 mo22027i(int i, int i2) {
        int n = on6.m23918n(0, i2, mo18486f());
        return n == 0 ? on6.f18031a : new jm6(this.f18618a, 0, n);
    }

    /* renamed from: j */
    public final String mo22029j(Charset charset) {
        return new String(this.f18618a, 0, mo18486f(), charset);
    }

    /* renamed from: k */
    public final void mo22030k(bm6 bm6) throws IOException {
        ((yn6) bm6).mo27648B(this.f18618a, 0, mo18486f());
    }

    /* renamed from: l */
    public final boolean mo22031l() {
        return ev6.m14404e(this.f18618a, 0, mo18486f());
    }

    /* renamed from: t */
    public int mo18487t() {
        return 0;
    }
}
