package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.compress.utils.CharsetNames;

public final class zq6 {

    /* renamed from: a */
    public static final wn6 f23855a;

    /* renamed from: a */
    public static final ByteBuffer f23856a;

    /* renamed from: a */
    public static final Charset f23857a = Charset.forName(CharsetNames.US_ASCII);

    /* renamed from: a */
    public static final byte[] f23858a;

    /* renamed from: b */
    public static final Charset f23859b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f23860c = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f23858a = bArr;
        f23856a = ByteBuffer.wrap(bArr);
        int i = wn6.f22226b;
        sn6 sn6 = new sn6(bArr, 0, 0, false, (qn6) null);
        try {
            sn6.mo24504c(0);
            f23855a = sn6;
        } catch (dr6 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m33322a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m33323b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m33324c(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: d */
    public static String m33325d(byte[] bArr) {
        return new String(bArr, f23859b);
    }
}
