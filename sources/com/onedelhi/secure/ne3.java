package com.onedelhi.secure;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class ne3 {

    /* renamed from: a */
    public static final byte f32490a = Byte.parseByte("01110000", 2);

    /* renamed from: a */
    public static final int f32491a = 22;

    /* renamed from: b */
    public static final byte f32492b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m58031b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m58032c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @mr2
    /* renamed from: a */
    public String mo41020a() {
        byte[] c = m58032c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f32492b & c[0]) | f32490a);
        return m58031b(c);
    }
}
