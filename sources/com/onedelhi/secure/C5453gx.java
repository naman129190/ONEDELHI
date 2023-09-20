package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\f\u0010\t\u001a\u00020\u0000*\u00020\u0001H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0007\u001a\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH\n\u001a\u001c\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u0000¨\u0006\u0013"}, d2 = {"", "", "F", "radix", "G", "H", "(C)Ljava/lang/Integer;", "I", "(CI)Ljava/lang/Integer;", "D", "E", "", "N", "other", "M", "", "ignoreCase", "J", "L", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/CharsKt")
/* renamed from: com.onedelhi.secure.gx */
public class C5453gx extends C5327fx {
    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    /* renamed from: D */
    public static final char m49966D(int i) {
        if (new is1(0, 9).mo38213s(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException("Int " + i + " is not a decimal digit");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    /* renamed from: E */
    public static final char m49967E(int i, int i2) {
        if (!new is1(2, 36).mo38213s(i2)) {
            throw new IllegalArgumentException("Invalid radix: " + i2 + ". Valid radix values are in range 2..36");
        } else if (i < 0 || i >= i2) {
            throw new IllegalArgumentException("Digit " + i + " does not represent a valid digit in radix " + i2);
        } else {
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - 10);
        }
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    /* renamed from: F */
    public static final int m49968F(char c) {
        int b = C5327fx.m48540b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    /* renamed from: G */
    public static final int m49969G(char c, int i) {
        Integer I = m49971I(c, i);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @ss2
    /* renamed from: H */
    public static final Integer m49970H(char c) {
        Integer valueOf = Integer.valueOf(C5327fx.m48540b(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @ss2
    /* renamed from: I */
    public static final Integer m49971I(char c, int i) {
        C5327fx.m48539a(i);
        Integer valueOf = Integer.valueOf(C5327fx.m48540b(c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: J */
    public static final boolean m49972J(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m49973K(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m49972J(c, c2, z);
    }

    /* renamed from: L */
    public static final boolean m49974L(char c) {
        return new C7280xw(55296, 57343).mo47420s(c);
    }

    @xq1
    /* renamed from: M */
    public static final String m49975M(char c, String str) {
        jt1.m53777p(str, "other");
        return c + str;
    }

    @gz3(version = "1.5")
    @vr2
    /* renamed from: N */
    public static final String m49976N(char c) {
        return lz4.m56668a(c);
    }
}
