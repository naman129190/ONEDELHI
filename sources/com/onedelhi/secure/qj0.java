package com.onedelhi.secure;

public class qj0 {

    /* renamed from: a */
    public static final int f34258a = 8191;

    /* renamed from: a */
    public static long m62883a(int i, String[] strArr, long j) {
        return (((long) strArr[i / f34258a].charAt(i % f34258a)) << 32) ^ oe3.m59367a(j);
    }

    /* renamed from: b */
    public static String m62884b(long j, String[] strArr) {
        long a = oe3.m59367a(oe3.m59369c(ZipConstants.ZIP64_MAGIC & j));
        long j2 = (a >>> 32) & xw4.f37660c;
        long a2 = oe3.m59367a(a);
        int i = (int) (((j >>> 32) ^ j2) ^ ((a2 >>> 16) & -65536));
        long a3 = m62883a(i, strArr, a2);
        int i2 = (int) ((a3 >>> 32) & xw4.f37660c);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            a3 = m62883a(i + i3 + 1, strArr, a3);
            cArr[i3] = (char) ((int) ((a3 >>> 32) & xw4.f37660c));
        }
        return new String(cArr);
    }
}
