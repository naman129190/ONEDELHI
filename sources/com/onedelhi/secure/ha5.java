package com.onedelhi.secure;

public final class ha5 {
    /* renamed from: a */
    public static byte m16582a(@ts2 Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    @ts2
    /* renamed from: b */
    public static Boolean m16583b(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
