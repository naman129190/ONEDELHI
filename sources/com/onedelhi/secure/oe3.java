package com.onedelhi.secure;

public class oe3 {
    /* renamed from: a */
    public static long m59367a(long j) {
        short s = (short) ((int) (j & xw4.f37660c));
        short s2 = (short) ((int) ((j >>> 16) & xw4.f37660c));
        short s3 = (short) (s2 ^ s);
        return ((((long) m59368b(s3, 10)) | (((long) ((short) (m59368b((short) (s + s2), 9) + s))) << 16)) << 16) | ((long) ((short) (((short) (m59368b(s, 13) ^ s3)) ^ (s3 << 5))));
    }

    /* renamed from: b */
    public static short m59368b(short s, int i) {
        return (short) ((s >>> (32 - i)) | (s << i));
    }

    /* renamed from: c */
    public static long m59369c(long j) {
        long j2 = (j ^ (j >>> 33)) * 7109453100751455733L;
        return ((j2 ^ (j2 >>> 28)) * -3808689974395783757L) >>> 32;
    }
}
