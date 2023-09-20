package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.compress.utils.CharsetNames;

public final class t56 {

    /* renamed from: a */
    public static final u36 f20656a;

    /* renamed from: a */
    public static final ByteBuffer f20657a;

    /* renamed from: a */
    public static final Charset f20658a = Charset.forName(CharsetNames.US_ASCII);

    /* renamed from: a */
    public static final byte[] f20659a;

    /* renamed from: b */
    public static final Charset f20660b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f20661c = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f20659a = bArr;
        f20657a = ByteBuffer.wrap(bArr);
        int i = u36.f21210b;
        o36 o36 = new o36(bArr, 0, 0, false, (l36) null);
        try {
            o36.mo21595c(0);
            f20656a = o36;
        } catch (t66 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m28109a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m28110b(byte[] bArr) {
        int length = bArr.length;
        int d = m28112d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m28111c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m28112d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m28113e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    public static Object m28114f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static Object m28115g(Object obj, Object obj2) {
        return ((i96) obj).mo15050b().mo14967ai((i96) obj2).mo15901l3();
    }

    /* renamed from: h */
    public static String m28116h(byte[] bArr) {
        return new String(bArr, f20660b);
    }

    /* renamed from: i */
    public static boolean m28117i(byte[] bArr) {
        return wf6.m30811c(bArr);
    }
}
