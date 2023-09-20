package com.onedelhi.secure;

import com.onedelhi.secure.m10;

public final class nf6 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m22782a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m22786e(b2) || (((b << m10.C2800f.f15783a) + (b2 + 112)) >> 30) != 0 || m22786e(b3) || m22786e(b4)) {
            throw t66.m28135b();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & iq4.f30423a) << 12) | ((b3 & iq4.f30423a) << 6) | (b4 & iq4.f30423a);
        cArr[i] = (char) ((b5 >>> 10) + iq4.f30426b);
        cArr[i + 1] = (char) ((b5 & 1023) + iq4.f30427c);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m22783b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m22786e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m22786e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & iq4.f30423a) << 6) | (b3 & iq4.f30423a));
                return;
            }
        }
        throw t66.m28135b();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m22784c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m22786e(b2)) {
            throw t66.m28135b();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & iq4.f30423a));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m22785d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m22786e(byte b) {
        return b > -65;
    }
}
