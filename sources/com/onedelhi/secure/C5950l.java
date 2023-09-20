package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\r\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\f\u001a\u0015\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\b2\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0019\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\b\u001a\u0019\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0000H\b\u001a0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000\u001a\f\u0010\u001b\u001a\u00020\u0019*\u00020\bH\u0000\u001a\f\u0010\u001c\u001a\u00020\u0019*\u00020\u0000H\u0000¨\u0006\u001d"}, d2 = {"", "size", "offset", "byteCount", "Lcom/onedelhi/secure/un4;", "e", "", "j", "", "h", "i", "", "other", "l", "k", "a", "b", "c", "g", "f", "", "aOffset", "bOffset", "", "d", "", "m", "n", "o", "okio"}, k = 2, mv = {1, 4, 0})
@uw1(name = "-Util")
/* renamed from: com.onedelhi.secure.l */
public final class C5950l {
    /* renamed from: a */
    public static final int m55165a(byte b, int i) {
        return b & i;
    }

    /* renamed from: b */
    public static final long m55166b(byte b, long j) {
        return ((long) b) & j;
    }

    /* renamed from: c */
    public static final long m55167c(int i, long j) {
        return ((long) i) & j;
    }

    /* renamed from: d */
    public static final boolean m55168d(@vr2 byte[] bArr, int i, @vr2 byte[] bArr2, int i2, int i3) {
        jt1.m53777p(bArr, "a");
        jt1.m53777p(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static final void m55169e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: f */
    public static final long m55170f(int i, long j) {
        return Math.min((long) i, j);
    }

    /* renamed from: g */
    public static final long m55171g(long j, int i) {
        return Math.min(j, (long) i);
    }

    /* renamed from: h */
    public static final int m55172h(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: i */
    public static final long m55173i(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: j */
    public static final short m55174j(short s) {
        short s2 = s & xm4.f37547c;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: k */
    public static final int m55175k(byte b, int i) {
        return b << i;
    }

    /* renamed from: l */
    public static final int m55176l(byte b, int i) {
        return b >> i;
    }

    @vr2
    /* renamed from: m */
    public static final String m55177m(byte b) {
        return new String(new char[]{C5445gr.m49680I()[(b >> 4) & 15], C5445gr.m49680I()[b & 15]});
    }

    @vr2
    /* renamed from: n */
    public static final String m55178n(int i) {
        if (i == 0) {
            return qa0.f34045b;
        }
        int i2 = 0;
        char[] cArr = {C5445gr.m49680I()[(i >> 28) & 15], C5445gr.m49680I()[(i >> 24) & 15], C5445gr.m49680I()[(i >> 20) & 15], C5445gr.m49680I()[(i >> 16) & 15], C5445gr.m49680I()[(i >> 12) & 15], C5445gr.m49680I()[(i >> 8) & 15], C5445gr.m49680I()[(i >> 4) & 15], C5445gr.m49680I()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }

    @vr2
    /* renamed from: o */
    public static final String m55179o(long j) {
        if (j == 0) {
            return qa0.f34045b;
        }
        int i = 0;
        char[] cArr = {C5445gr.m49680I()[(int) ((j >> 60) & 15)], C5445gr.m49680I()[(int) ((j >> 56) & 15)], C5445gr.m49680I()[(int) ((j >> 52) & 15)], C5445gr.m49680I()[(int) ((j >> 48) & 15)], C5445gr.m49680I()[(int) ((j >> 44) & 15)], C5445gr.m49680I()[(int) ((j >> 40) & 15)], C5445gr.m49680I()[(int) ((j >> 36) & 15)], C5445gr.m49680I()[(int) ((j >> 32) & 15)], C5445gr.m49680I()[(int) ((j >> 28) & 15)], C5445gr.m49680I()[(int) ((j >> 24) & 15)], C5445gr.m49680I()[(int) ((j >> 20) & 15)], C5445gr.m49680I()[(int) ((j >> 16) & 15)], C5445gr.m49680I()[(int) ((j >> 12) & 15)], C5445gr.m49680I()[(int) ((j >> 8) & 15)], C5445gr.m49680I()[(int) ((j >> 4) & 15)], C5445gr.m49680I()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return new String(cArr, i, 16 - i);
    }
}
