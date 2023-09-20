package com.onedelhi.secure;

import java.nio.charset.Charset;
import java.util.Objects;

public class z26 extends w26 {

    /* renamed from: a */
    public final byte[] f23431a;

    public z26(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f23431a = bArr;
    }

    /* renamed from: b */
    public byte mo17547b(int i) {
        return this.f23431a[i];
    }

    /* renamed from: e */
    public byte mo17548e(int i) {
        return this.f23431a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i36) || mo17550f() != ((i36) obj).mo17550f()) {
            return false;
        }
        if (mo17550f() == 0) {
            return true;
        }
        if (!(obj instanceof z26)) {
            return obj.equals(this);
        }
        z26 z26 = (z26) obj;
        int n = mo17557n();
        int n2 = z26.mo17557n();
        if (n != 0 && n2 != 0 && n != n2) {
            return false;
        }
        int f = mo17550f();
        if (f > z26.mo17550f()) {
            int f2 = mo17550f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= z26.mo17550f()) {
            byte[] bArr = this.f23431a;
            byte[] bArr2 = z26.f23431a;
            z26.mo23513t();
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
            int f3 = z26.mo17550f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo17550f() {
        return this.f23431a.length;
    }

    /* renamed from: g */
    public final int mo17551g(int i, int i2, int i3) {
        return t56.m28112d(i, this.f23431a, 0, i3);
    }

    /* renamed from: i */
    public final i36 mo17553i(int i, int i2) {
        int l = i36.m17165l(0, i2, mo17550f());
        return l == 0 ? i36.f13476a : new r16(this.f23431a, 0, l);
    }

    /* renamed from: j */
    public final String mo17555j(Charset charset) {
        return new String(this.f23431a, 0, mo17550f(), charset);
    }

    /* renamed from: k */
    public final boolean mo17556k() {
        return wf6.m30812d(this.f23431a, 0, mo17550f());
    }

    /* renamed from: t */
    public int mo23513t() {
        return 0;
    }
}
