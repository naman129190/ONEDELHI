package com.onedelhi.secure;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0000H\b\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\r\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\b\u001a\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0015\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0000H\b\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u001a\u001a\u00020\u0000*\u00020\u0000H\b\u001a\u0014\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u001d\u001a\u00020\u0001*\u00020\u0000H\b\u001a\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0000\u001a\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0001\"\u0015\u0010&\u001a\u00020#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0015\u0010*\u001a\u00020'*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"", "", "e", "l", "m", "f", "i", "h", "j", "k", "r", "q", "o", "z", "C", "", "A", "Ljava/util/Locale;", "locale", "B", "x", "u", "s", "t", "p", "y", "w", "v", "g", "n", "char", "", "radix", "b", "a", "Lcom/onedelhi/secure/pw;", "c", "(C)Lcom/onedelhi/secure/pw;", "category", "Lcom/onedelhi/secure/tw;", "d", "(C)Lcom/onedelhi/secure/tw;", "directionality", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/CharsKt")
/* renamed from: com.onedelhi.secure.fx */
public class C5327fx {
    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: A */
    public static final String m48536A(char c) {
        String valueOf = String.valueOf(c);
        jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: B */
    public static final String m48537B(char c, @vr2 Locale locale) {
        jt1.m53777p(locale, C2889mv.f16373r);
        String valueOf = String.valueOf(c);
        jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: C */
    public static final char m48538C(char c) {
        return Character.toUpperCase(c);
    }

    @z73
    /* renamed from: a */
    public static final int m48539a(int i) {
        if (new is1(2, 36).mo38213s(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new is1(2, 36));
    }

    /* renamed from: b */
    public static final int m48540b(char c, int i) {
        return Character.digit(c, i);
    }

    @vr2
    /* renamed from: c */
    public static final C6480pw m48541c(char c) {
        return C6480pw.f33800a.mo42932a(Character.getType(c));
    }

    @vr2
    /* renamed from: d */
    public static final C6901tw m48542d(char c) {
        return C6901tw.f35809a.mo45326b(Character.getDirectionality(c));
    }

    @xq1
    /* renamed from: e */
    public static final boolean m48543e(char c) {
        return Character.isDefined(c);
    }

    @xq1
    /* renamed from: f */
    public static final boolean m48544f(char c) {
        return Character.isDigit(c);
    }

    @xq1
    /* renamed from: g */
    public static final boolean m48545g(char c) {
        return Character.isHighSurrogate(c);
    }

    @xq1
    /* renamed from: h */
    public static final boolean m48546h(char c) {
        return Character.isISOControl(c);
    }

    @xq1
    /* renamed from: i */
    public static final boolean m48547i(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @xq1
    /* renamed from: j */
    public static final boolean m48548j(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @xq1
    /* renamed from: k */
    public static final boolean m48549k(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @xq1
    /* renamed from: l */
    public static final boolean m48550l(char c) {
        return Character.isLetter(c);
    }

    @xq1
    /* renamed from: m */
    public static final boolean m48551m(char c) {
        return Character.isLetterOrDigit(c);
    }

    @xq1
    /* renamed from: n */
    public static final boolean m48552n(char c) {
        return Character.isLowSurrogate(c);
    }

    @xq1
    /* renamed from: o */
    public static final boolean m48553o(char c) {
        return Character.isLowerCase(c);
    }

    @xq1
    /* renamed from: p */
    public static final boolean m48554p(char c) {
        return Character.isTitleCase(c);
    }

    @xq1
    /* renamed from: q */
    public static final boolean m48555q(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: r */
    public static final boolean m48556r(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: s */
    public static final String m48557s(char c) {
        String valueOf = String.valueOf(c);
        jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: t */
    public static final String m48558t(char c, @vr2 Locale locale) {
        jt1.m53777p(locale, C2889mv.f16373r);
        String valueOf = String.valueOf(c);
        jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: u */
    public static final char m48559u(char c) {
        return Character.toLowerCase(c);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: v */
    public static final String m48560v(char c, @vr2 Locale locale) {
        jt1.m53777p(locale, C2889mv.f16373r);
        String B = m48537B(c, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c);
            jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !jt1.m53768g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return B;
        } else {
            char charAt = B.charAt(0);
            jt1.m53775n(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
            jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: w */
    public static final char m48561w(char c) {
        return Character.toTitleCase(c);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use lowercaseChar() instead.", replaceWith = @oi3(expression = "lowercaseChar()", imports = {}))
    /* renamed from: x */
    public static final char m48562x(char c) {
        return Character.toLowerCase(c);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use titlecaseChar() instead.", replaceWith = @oi3(expression = "titlecaseChar()", imports = {}))
    /* renamed from: y */
    public static final char m48563y(char c) {
        return Character.toTitleCase(c);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use uppercaseChar() instead.", replaceWith = @oi3(expression = "uppercaseChar()", imports = {}))
    /* renamed from: z */
    public static final char m48564z(char c) {
        return Character.toUpperCase(c);
    }
}
