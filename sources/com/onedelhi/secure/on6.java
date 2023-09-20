package com.onedelhi.secure;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class on6 implements Iterable, Serializable {

    /* renamed from: a */
    public static final on6 f18031a = new pm6(zq6.f23858a);

    /* renamed from: a */
    public static final tm6 f18032a = new tm6((rm6) null);

    /* renamed from: a */
    public static final Comparator f18033a = new fm6();

    /* renamed from: n */
    public int f18034n = 0;

    static {
        int i = tl6.f20961a;
    }

    /* renamed from: n */
    public static int m23918n(int i, int i2, int i3) {
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

    /* renamed from: r */
    public static on6 m23919r(byte[] bArr, int i, int i2) {
        m23918n(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new pm6(bArr2);
    }

    /* renamed from: b */
    public abstract byte mo18484b(int i);

    /* renamed from: e */
    public abstract byte mo18485e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo18486f();

    /* renamed from: g */
    public abstract int mo22025g(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f18034n;
        if (i == 0) {
            int f = mo18486f();
            i = mo22025g(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.f18034n = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract on6 mo22027i(int i, int i2);

    public final /* synthetic */ Iterator iterator() {
        return new dm6(this);
    }

    /* renamed from: j */
    public abstract String mo22029j(Charset charset);

    /* renamed from: k */
    public abstract void mo22030k(bm6 bm6) throws IOException;

    /* renamed from: l */
    public abstract boolean mo22031l();

    /* renamed from: o */
    public final int mo22032o() {
        return this.f18034n;
    }

    /* renamed from: s */
    public final String mo22033s(Charset charset) {
        return mo18486f() == 0 ? "" : mo22029j(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo18486f());
        objArr[2] = mo18486f() <= 50 ? nu6.m23196a(this) : nu6.m23196a(mo22027i(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
