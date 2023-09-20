package com.onedelhi.secure;

import com.onedelhi.secure.m10;

public final class av6 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m11436a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m11440e(b2) || (((b << m10.C2800f.f15783a) + (b2 + 112)) >> 30) != 0 || m11440e(b3) || m11440e(b4)) {
            throw dr6.m13274c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & iq4.f30423a) << 12) | ((b3 & iq4.f30423a) << 6) | (b4 & iq4.f30423a);
        cArr[i] = (char) ((b5 >>> 10) + iq4.f30426b);
        cArr[i + 1] = (char) ((b5 & 1023) + iq4.f30427c);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m11437b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m11440e(b2)) {
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
            if (!m11440e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & iq4.f30423a) << 6) | (b3 & iq4.f30423a));
                return;
            }
        }
        throw dr6.m13274c();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m11438c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m11440e(b2)) {
            throw dr6.m13274c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & iq4.f30423a));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m11439d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m11440e(byte b) {
        return b > -65;
    }
}
