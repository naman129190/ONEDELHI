package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.nio.ByteBuffer;

public abstract class gq4 {

    /* renamed from: a */
    public static gq4 f12718a;

    /* renamed from: com.onedelhi.secure.gq4$a */
    public static class C2274a {
        /* renamed from: a */
        public static void m16144a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (m16149f(b2) || (((b << m10.C2800f.f15783a) + (b2 + 112)) >> 30) != 0 || m16149f(b3) || m16149f(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int k = ((b & 7) << 18) | (m16154k(b2) << 12) | (m16154k(b3) << 6) | m16154k(b4);
            cArr[i] = m16148e(k);
            cArr[i + 1] = m16153j(k);
        }

        /* renamed from: b */
        public static void m16145b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: c */
        public static void m16146c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (m16149f(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m16149f(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & 15) << 12) | (m16154k(b2) << 6) | m16154k(b3));
        }

        /* renamed from: d */
        public static void m16147d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (!m16149f(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | m16154k(b2));
            } else {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
        }

        /* renamed from: e */
        public static char m16148e(int i) {
            return (char) ((i >>> 10) + iq4.f30426b);
        }

        /* renamed from: f */
        public static boolean m16149f(byte b) {
            return b > -65;
        }

        /* renamed from: g */
        public static boolean m16150g(byte b) {
            return b >= 0;
        }

        /* renamed from: h */
        public static boolean m16151h(byte b) {
            return b < -16;
        }

        /* renamed from: i */
        public static boolean m16152i(byte b) {
            return b < -32;
        }

        /* renamed from: j */
        public static char m16153j(int i) {
            return (char) ((i & 1023) + iq4.f30427c);
        }

        /* renamed from: k */
        public static int m16154k(byte b) {
            return b & iq4.f30423a;
        }
    }

    /* renamed from: com.onedelhi.secure.gq4$b */
    public static class C2275b extends IllegalArgumentException {
        public C2275b(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: d */
    public static gq4 m16139d() {
        if (f12718a == null) {
            f12718a = new mq4();
        }
        return f12718a;
    }

    /* renamed from: e */
    public static void m16140e(gq4 gq4) {
        f12718a = gq4;
    }

    /* renamed from: a */
    public abstract String mo16832a(ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: b */
    public abstract void mo16833b(CharSequence charSequence, ByteBuffer byteBuffer);

    /* renamed from: c */
    public abstract int mo16834c(CharSequence charSequence);
}
