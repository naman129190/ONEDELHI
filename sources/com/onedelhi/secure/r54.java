package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\r\u0010\u000b\u001a\u00020\n*\u00020\u0003H\b\u001a\u0016\u0010\f\u001a\u00020\n*\u0004\u0018\u00010\u0003H\b¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\b\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\r\u0010\u0010\u001a\u00020\u0005*\u00020\u0003H\b\u001a\u0015\u0010\u0011\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0003H\b\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\u0003H\b\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\r\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\b\u001a\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0003H\b\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0018*\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\u0003H\b\u001a\u0015\u0010 \u001a\u00020\u001e*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u000e\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u0003H\u0007\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\r\u0010$\u001a\u00020#*\u00020\u0003H\b\u001a\u0015\u0010'\u001a\u00020#*\u00020\u00032\u0006\u0010&\u001a\u00020%H\b\u001a\u000e\u0010(\u001a\u0004\u0018\u00010#*\u00020\u0003H\u0007\u001a\u0016\u0010)\u001a\u0004\u0018\u00010#*\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0007\u001a4\u0010.\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u00020\u00032\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000,H\b¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"", "", "radix", "", "Q0", "", "T0", "R0", "", "S0", "", "C0", "D0", "(Ljava/lang/String;)Z", "E0", "F0", "O0", "P0", "K0", "L0", "M0", "N0", "", "I0", "", "G0", "J0", "(Ljava/lang/String;)Ljava/lang/Float;", "H0", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "y0", "z0", "A0", "B0", "Ljava/math/BigDecimal;", "u0", "Ljava/math/MathContext;", "mathContext", "v0", "w0", "x0", "T", "str", "Lkotlin/Function1;", "parse", "t0", "(Ljava/lang/String;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class r54 extends q54 {
    @gz3(version = "1.2")
    @ss2
    /* renamed from: A0 */
    public static final BigInteger m63392A0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return m63393B0(str, 10);
    }

    @gz3(version = "1.2")
    @ss2
    /* renamed from: B0 */
    public static final BigInteger m63393B0(@vr2 String str, int i) {
        jt1.m53777p(str, "<this>");
        C5327fx.m48539a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (C5327fx.m48540b(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (C5327fx.m48540b(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, C5327fx.m48539a(i));
    }

    @gz3(version = "1.4")
    @xq1
    @uw1(name = "toBooleanNullable")
    /* renamed from: D0 */
    public static final boolean m63395D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @xq1
    /* renamed from: E0 */
    public static final byte m63396E0(String str) {
        jt1.m53777p(str, "<this>");
        return Byte.parseByte(str);
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: F0 */
    public static final byte m63397F0(String str, int i) {
        jt1.m53777p(str, "<this>");
        return Byte.parseByte(str, C5327fx.m48539a(i));
    }

    @xq1
    /* renamed from: G0 */
    public static final double m63398G0(String str) {
        jt1.m53777p(str, "<this>");
        return Double.parseDouble(str);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: H0 */
    public static final Double m63399H0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        try {
            if (ks3.f31418a.mo35379k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @xq1
    /* renamed from: I0 */
    public static final float m63400I0(String str) {
        jt1.m53777p(str, "<this>");
        return Float.parseFloat(str);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: J0 */
    public static final Float m63401J0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        try {
            if (ks3.f31418a.mo35379k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @xq1
    /* renamed from: K0 */
    public static final int m63402K0(String str) {
        jt1.m53777p(str, "<this>");
        return Integer.parseInt(str);
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: L0 */
    public static final int m63403L0(String str, int i) {
        jt1.m53777p(str, "<this>");
        return Integer.parseInt(str, C5327fx.m48539a(i));
    }

    @xq1
    /* renamed from: M0 */
    public static final long m63404M0(String str) {
        jt1.m53777p(str, "<this>");
        return Long.parseLong(str);
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: N0 */
    public static final long m63405N0(String str, int i) {
        jt1.m53777p(str, "<this>");
        return Long.parseLong(str, C5327fx.m48539a(i));
    }

    @xq1
    /* renamed from: O0 */
    public static final short m63406O0(String str) {
        jt1.m53777p(str, "<this>");
        return Short.parseShort(str);
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: P0 */
    public static final short m63407P0(String str, int i) {
        jt1.m53777p(str, "<this>");
        return Short.parseShort(str, C5327fx.m48539a(i));
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: Q0 */
    public static final String m63408Q0(byte b, int i) {
        String num = Integer.toString(b, C5327fx.m48539a(C5327fx.m48539a(i)));
        jt1.m53776o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: R0 */
    public static final String m63409R0(int i, int i2) {
        String num = Integer.toString(i, C5327fx.m48539a(i2));
        jt1.m53776o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: S0 */
    public static final String m63410S0(long j, int i) {
        String l = Long.toString(j, C5327fx.m48539a(i));
        jt1.m53776o(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: T0 */
    public static final String m63411T0(short s, int i) {
        String num = Integer.toString(s, C5327fx.m48539a(C5327fx.m48539a(i)));
        jt1.m53776o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    /* renamed from: t0 */
    public static final <T> T m63412t0(String str, ec1<? super String, ? extends T> ec1) {
        try {
            if (ks3.f31418a.mo35379k(str)) {
                return ec1.mo17094X(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: u0 */
    public static final BigDecimal m63413u0(String str) {
        jt1.m53777p(str, "<this>");
        return new BigDecimal(str);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: v0 */
    public static final BigDecimal m63414v0(String str, MathContext mathContext) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @gz3(version = "1.2")
    @ss2
    /* renamed from: w0 */
    public static final BigDecimal m63415w0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        try {
            if (ks3.f31418a.mo35379k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @gz3(version = "1.2")
    @ss2
    /* renamed from: x0 */
    public static final BigDecimal m63416x0(@vr2 String str, @vr2 MathContext mathContext) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(mathContext, "mathContext");
        try {
            if (ks3.f31418a.mo35379k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: y0 */
    public static final BigInteger m63417y0(String str) {
        jt1.m53777p(str, "<this>");
        return new BigInteger(str);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: z0 */
    public static final BigInteger m63418z0(String str, int i) {
        jt1.m53777p(str, "<this>");
        return new BigInteger(str, C5327fx.m48539a(i));
    }
}
