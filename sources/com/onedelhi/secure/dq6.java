package com.onedelhi.secure;

public final class dq6 extends kn6 {

    /* renamed from: a */
    public final char f10886a;

    public dq6(char c) {
        this.f10886a = c;
    }

    /* renamed from: a */
    public final boolean mo13822a(char c) {
        return c == this.f10886a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f10886a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
