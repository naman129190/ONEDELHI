package com.onedelhi.secure;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class i36 implements Iterable, Serializable {

    /* renamed from: a */
    public static final f36 f13475a = new f36((c36) null);

    /* renamed from: a */
    public static final i36 f13476a = new z26(t56.f20659a);

    /* renamed from: a */
    public static final Comparator f13477a = new k16();

    /* renamed from: n */
    public int f13478n = 0;

    static {
        int i = q06.f18847a;
    }

    /* renamed from: l */
    public static int m17165l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: o */
    public static i36 m17166o(byte[] bArr, int i, int i2) {
        m17165l(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new z26(bArr2);
    }

    /* renamed from: r */
    public static i36 m17167r(String str) {
        return new z26(str.getBytes(t56.f20660b));
    }

    /* renamed from: b */
    public abstract byte mo17547b(int i);

    /* renamed from: e */
    public abstract byte mo17548e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo17550f();

    /* renamed from: g */
    public abstract int mo17551g(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f13478n;
        if (i == 0) {
            int f = mo17550f();
            i = mo17551g(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.f13478n = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract i36 mo17553i(int i, int i2);

    public final /* synthetic */ Iterator iterator() {
        return new g16(this);
    }

    /* renamed from: j */
    public abstract String mo17555j(Charset charset);

    /* renamed from: k */
    public abstract boolean mo17556k();

    /* renamed from: n */
    public final int mo17557n() {
        return this.f13478n;
    }

    /* renamed from: s */
    public final String mo17558s(Charset charset) {
        return mo17550f() == 0 ? "" : mo17555j(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo17550f());
        objArr[2] = mo17550f() <= 50 ? fd6.m14890a(this) : fd6.m14890a(mo17553i(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
