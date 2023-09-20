package com.onedelhi.secure;

import java.io.IOException;

public abstract class in5 {

    /* renamed from: a */
    public static final in5 f13768a = new wm5("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    public static final in5 f13769b = new wm5("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    public static final in5 f13770c = new cn5("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    public static final in5 f13771d = new cn5("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    public static final in5 f13772e = new qm5("base16()", "0123456789ABCDEF");

    /* renamed from: c */
    public static in5 m17708c() {
        return f13772e;
    }

    /* renamed from: a */
    public abstract void mo14281a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract int mo14282b(int i);

    /* renamed from: d */
    public final String mo17871d(byte[] bArr, int i, int i2) {
        pg5.m24697e(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo14282b(i2));
        try {
            mo14281a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
