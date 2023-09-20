package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u001d\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u001d\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a \u0010\r\u001a\u00020\u000b*\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\r\u0010\u0016\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\b\u001a\f\u0010\u001b\u001a\u00020\u0000*\u00020\u001aH\u0007\u001a \u0010\u001e\u001a\u00020\u0000*\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0007\u001a \u0010\u001f\u001a\u00020\u001a*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0007\u001a\f\u0010!\u001a\u00020\u0000*\u00020 H\u0007\u001a*\u0010#\u001a\u00020\u0000*\u00020 2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007\u001a\f\u0010$\u001a\u00020 *\u00020\u0000H\u0007\u001a*\u0010%\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007\u001a\r\u0010&\u001a\u00020\u001a*\u00020\u0000H\b\u001a3\u0010)\u001a\u00020\u001a*\u00020\u00002\u0006\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\b\u001a,\u0010-\u001a\u00020\u0000*\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b-\u0010.\u001a4\u00101\u001a\u00020\u0000*\u00020/2\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b1\u00102\u001a4\u00105\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u0002032\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b5\u00106\u001a6\u00107\u001a\u00020\u0000*\u00020\u00002\b\u00104\u001a\u0004\u0018\u0001032\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b7\u00106\u001a<\u00108\u001a\u00020\u0000*\u00020/2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b8\u00109\u001a>\u0010:\u001a\u00020\u0000*\u00020/2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\b¢\u0006\u0004\b:\u00109\u001a\"\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000?*\u00020;2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u0003\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\b\u001a\u001d\u0010B\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\b\u001a\u001c\u0010D\u001a\u00020\u000b*\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010E\u001a\u00020\u000b*\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u001c\u0010G\u001a\u00020\u000b*\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a)\u0010M\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010L\u001a\u00020KH\b\u001a\u0019\u0010N\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\b\u001a!\u0010O\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\b\u001a\u0011\u0010P\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 H\b\u001a\u0011\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001aH\b\u001a!\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\b\u001a!\u0010V\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\b\u001a\u0011\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\b\u001a\u0011\u0010\\\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\b\u001a\u0015\u0010^\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u0003H\b\u001a\u0015\u0010_\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u0003H\b\u001a\u001d\u0010a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010`\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\b\u001a\u001c\u0010b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0015\u0010d\u001a\u00020\u000b*\u00020\u00002\u0006\u0010c\u001a\u00020;H\b\u001a\u0015\u0010e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010[\u001a\u00020WH\b\u001a\u0019\u0010f\u001a\u00020\u000b*\u0004\u0018\u00010;2\b\u0010\n\u001a\u0004\u0018\u00010;H\u0004\u001a \u0010g\u001a\u00020\u000b*\u0004\u0018\u00010;2\b\u0010\n\u001a\u0004\u0018\u00010;2\u0006\u0010\f\u001a\u00020\u000bH\u0007\u001a\r\u0010h\u001a\u00020\u0000*\u00020\u0000H\b\u001a\n\u0010i\u001a\u00020\u000b*\u00020;\u001a\u001d\u0010k\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u0003H\b\u001a4\u0010n\u001a\u00020\u000b*\u00020;2\u0006\u0010l\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020;2\u0006\u0010m\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a4\u0010o\u001a\u00020\u000b*\u00020\u00002\u0006\u0010l\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0015\u0010p\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\b\u001a\u0015\u0010q\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\b\u001a\u0015\u0010r\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\b\u001a\u0015\u0010s\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\b\u001a\u0017\u0010t\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010L\u001a\u00020KH\b\u001a\u0017\u0010v\u001a\u00020<*\u00020\u00002\b\b\u0002\u0010u\u001a\u00020\u0003H\b\u001a\f\u0010w\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010x\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0007\u001a\f\u0010y\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010z\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0007\u001a\u0012\u0010|\u001a\u00020\u0000*\u00020;2\u0006\u0010{\u001a\u00020\u0003\"'\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00000}j\b\u0012\u0004\u0012\u00020\u0000`~*\u00020/8F¢\u0006\u0007\u001a\u0005\b\u0010\u0001¨\u0006\u0001"}, d2 = {"", "", "ch", "", "fromIndex", "X1", "str", "Y1", "Z1", "a2", "other", "", "ignoreCase", "K1", "oldChar", "newChar", "h2", "oldValue", "newValue", "i2", "l2", "m2", "I2", "K2", "E2", "V1", "", "t1", "startIndex", "endIndex", "u1", "A2", "", "C1", "throwOnInvalidSequence", "D1", "F1", "G1", "z2", "destination", "destinationOffset", "B2", "", "", "args", "P1", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "format", "M1", "(Lcom/onedelhi/secure/x44;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "O1", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "R1", "N1", "(Lcom/onedelhi/secure/x44;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Q1", "", "Ljava/util/regex/Pattern;", "regex", "limit", "", "p2", "v2", "w2", "prefix", "s2", "r2", "suffix", "I1", "bytes", "offset", "length", "Ljava/nio/charset/Charset;", "charset", "h1", "i1", "g1", "f1", "chars", "j1", "k1", "", "codePoints", "l1", "Ljava/lang/StringBuffer;", "stringBuffer", "d1", "Ljava/lang/StringBuilder;", "stringBuilder", "e1", "index", "o1", "p1", "beginIndex", "q1", "r1", "charSequence", "y1", "z1", "w1", "x1", "T1", "U1", "codePointOffset", "b2", "thisOffset", "otherOffset", "c2", "d2", "F2", "W1", "J2", "L2", "x2", "flags", "G2", "m1", "n1", "A1", "B1", "n", "g2", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "S1", "(Lcom/onedelhi/secure/x44;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class t54 extends s54 {
    @zj0(warningSince = "1.5")
    @vr2
    @xj0(message = "Use replaceFirstChar instead.", replaceWith = @oi3(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    /* renamed from: A1 */
    public static final String m65390A1(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        jt1.m53776o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: A2 */
    public static final char[] m65391A2(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        C6809t0.f35278a.mo44669a(i, i2, str.length());
        char[] cArr = new char[(i2 - i)];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    @vr2
    @xj0(message = "Use replaceFirstChar instead.", replaceWith = @oi3(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ib2
    @zj0(warningSince = "1.5")
    /* renamed from: B1 */
    public static final String m65392B1(@vr2 String str, @vr2 Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        jt1.m53776o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @xq1
    /* renamed from: B2 */
    public static final char[] m65393B2(String str, char[] cArr, int i, int i2, int i3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(cArr, FirebaseAnalytics.C4305d.f24996z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: C1 */
    public static final String m65394C1(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "<this>");
        return new String(bArr, C5604hx.f29888a);
    }

    /* renamed from: C2 */
    public static /* synthetic */ char[] m65395C2(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m65391A2(str, i, i2);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: D1 */
    public static final String m65396D1(@vr2 byte[] bArr, int i, int i2, boolean z) {
        jt1.m53777p(bArr, "<this>");
        C6809t0.f35278a.mo44669a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, C5604hx.f29888a);
        }
        String charBuffer = C5604hx.f29888a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        jt1.m53776o(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    /* renamed from: D2 */
    public static /* synthetic */ char[] m65397D2(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        jt1.m53777p(str, "<this>");
        jt1.m53777p(cArr, FirebaseAnalytics.C4305d.f24996z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    /* renamed from: E1 */
    public static /* synthetic */ String m65398E1(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m65396D1(bArr, i, i2, z);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use lowercase() instead.", replaceWith = @oi3(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* renamed from: E2 */
    public static final String m65399E2(String str) {
        jt1.m53777p(str, "<this>");
        String lowerCase = str.toLowerCase();
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: F1 */
    public static final byte[] m65400F1(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        byte[] bytes = str.getBytes(C5604hx.f29888a);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use lowercase() instead.", replaceWith = @oi3(expression = "lowercase(locale)", imports = {}))
    /* renamed from: F2 */
    public static final String m65401F2(String str, Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        String lowerCase = str.toLowerCase(locale);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: G1 */
    public static final byte[] m65402G1(@vr2 String str, int i, int i2, boolean z) {
        jt1.m53777p(str, "<this>");
        C6809t0.f35278a.mo44669a(i, i2, str.length());
        if (!z) {
            String substring = str.substring(i, i2);
            jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C5604hx.f29888a;
            jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = C5604hx.f29888a.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            jt1.m53774m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                jt1.m53776o(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @xq1
    /* renamed from: G2 */
    public static final Pattern m65403G2(String str, int i) {
        jt1.m53777p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        jt1.m53776o(compile, "compile(this, flags)");
        return compile;
    }

    /* renamed from: H1 */
    public static /* synthetic */ byte[] m65404H1(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m65402G1(str, i, i2, z);
    }

    /* renamed from: H2 */
    public static /* synthetic */ Pattern m65405H2(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        jt1.m53777p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        jt1.m53776o(compile, "compile(this, flags)");
        return compile;
    }

    /* renamed from: I1 */
    public static final boolean m65406I1(@vr2 String str, @vr2 String str2, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m65432d2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use uppercase() instead.", replaceWith = @oi3(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* renamed from: I2 */
    public static final String m65407I2(String str) {
        jt1.m53777p(str, "<this>");
        String upperCase = str.toUpperCase();
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    /* renamed from: J1 */
    public static /* synthetic */ boolean m65408J1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m65406I1(str, str2, z);
    }

    @xq1
    @zj0(warningSince = "1.5")
    @xj0(message = "Use uppercase() instead.", replaceWith = @oi3(expression = "uppercase(locale)", imports = {}))
    /* renamed from: J2 */
    public static final String m65409J2(String str, Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        String upperCase = str.toUpperCase(locale);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* renamed from: K1 */
    public static final boolean m65410K1(@ss2 String str, @ss2 String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: K2 */
    public static final String m65411K2(String str) {
        jt1.m53777p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    /* renamed from: L1 */
    public static /* synthetic */ boolean m65412L1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m65410K1(str, str2, z);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: L2 */
    public static final String m65413L2(String str, Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        String upperCase = str.toUpperCase(locale);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @xq1
    /* renamed from: M1 */
    public static final String m65414M1(x44 x44, String str, Object... objArr) {
        jt1.m53777p(x44, "<this>");
        jt1.m53777p(str, "format");
        jt1.m53777p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(format, *args)");
        return format;
    }

    @xq1
    @zj0(hiddenSince = "1.4")
    @xj0(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    /* renamed from: N1 */
    public static final /* synthetic */ String m65415N1(x44 x44, Locale locale, String str, Object... objArr) {
        jt1.m53777p(x44, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        jt1.m53777p(str, "format");
        jt1.m53777p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(locale, format, *args)");
        return format;
    }

    @xq1
    @zj0(hiddenSince = "1.4")
    @xj0(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    /* renamed from: O1 */
    public static final /* synthetic */ String m65416O1(String str, Locale locale, Object... objArr) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        jt1.m53777p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(locale, this, *args)");
        return format;
    }

    @xq1
    /* renamed from: P1 */
    public static final String m65417P1(String str, Object... objArr) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(this, *args)");
        return format;
    }

    @gz3(version = "1.4")
    @xq1
    @uw1(name = "formatNullable")
    /* renamed from: Q1 */
    public static final String m65418Q1(x44 x44, Locale locale, String str, Object... objArr) {
        jt1.m53777p(x44, "<this>");
        jt1.m53777p(str, "format");
        jt1.m53777p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(locale, format, *args)");
        return format;
    }

    @gz3(version = "1.4")
    @xq1
    @uw1(name = "formatNullable")
    /* renamed from: R1 */
    public static final String m65419R1(String str, Locale locale, Object... objArr) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        jt1.m53776o(format, "format(locale, this, *args)");
        return format;
    }

    @vr2
    /* renamed from: S1 */
    public static final Comparator<String> m65420S1(@vr2 x44 x44) {
        jt1.m53777p(x44, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        jt1.m53776o(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @xq1
    /* renamed from: T1 */
    public static final String m65421T1(String str) {
        jt1.m53777p(str, "<this>");
        String intern = str.intern();
        jt1.m53776o(intern, "this as java.lang.String).intern()");
        return intern;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m65422U1(@com.onedelhi.secure.vr2 java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            com.onedelhi.secure.is1 r0 = com.onedelhi.secure.u54.m66639h3(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            com.onedelhi.secure.ds1 r3 = (com.onedelhi.secure.ds1) r3
            int r3 = r3.mo19249b()
            char r3 = r4.charAt(r3)
            boolean r3 = com.onedelhi.secure.C5327fx.m48556r(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t54.m65422U1(java.lang.CharSequence):boolean");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: V1 */
    public static final String m65423V1(String str) {
        jt1.m53777p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: W1 */
    public static final String m65424W1(String str, Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        String lowerCase = str.toLowerCase(locale);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @xq1
    /* renamed from: X1 */
    public static final int m65425X1(String str, char c, int i) {
        jt1.m53777p(str, "<this>");
        return str.indexOf(c, i);
    }

    @xq1
    /* renamed from: Y1 */
    public static final int m65426Y1(String str, String str2, int i) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "str");
        return str.indexOf(str2, i);
    }

    @xq1
    /* renamed from: Z1 */
    public static final int m65427Z1(String str, char c, int i) {
        jt1.m53777p(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @xq1
    /* renamed from: a2 */
    public static final int m65428a2(String str, String str2, int i) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    @xq1
    /* renamed from: b2 */
    public static final int m65429b2(String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    /* renamed from: c2 */
    public static final boolean m65430c2(@vr2 CharSequence charSequence, int i, @vr2 CharSequence charSequence2, int i2, int i3, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "other");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return u54.m66619a4(charSequence, i, charSequence2, i2, i3, z);
        }
        return m65432d2((String) charSequence, i, (String) charSequence2, i2, i3, z);
    }

    @xq1
    /* renamed from: d1 */
    public static final String m65431d1(StringBuffer stringBuffer) {
        jt1.m53777p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    /* renamed from: d2 */
    public static final boolean m65432d2(@vr2 String str, int i, @vr2 String str2, int i2, int i3, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    @xq1
    /* renamed from: e1 */
    public static final String m65433e1(StringBuilder sb) {
        jt1.m53777p(sb, "stringBuilder");
        return new String(sb);
    }

    /* renamed from: e2 */
    public static /* synthetic */ boolean m65434e2(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        return m65430c2(charSequence, i, charSequence2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    @xq1
    /* renamed from: f1 */
    public static final String m65435f1(byte[] bArr) {
        jt1.m53777p(bArr, "bytes");
        return new String(bArr, C5604hx.f29888a);
    }

    /* renamed from: f2 */
    public static /* synthetic */ boolean m65436f2(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m65432d2(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    @xq1
    /* renamed from: g1 */
    public static final String m65437g1(byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "bytes");
        return new String(bArr, i, i2, C5604hx.f29888a);
    }

    @vr2
    /* renamed from: g2 */
    public static final String m65438g2(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                ds1 o = new is1(1, i).iterator();
                while (o.hasNext()) {
                    o.mo19249b();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                jt1.m53776o(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    @xq1
    /* renamed from: h1 */
    public static final String m65439h1(byte[] bArr, int i, int i2, Charset charset) {
        jt1.m53777p(bArr, "bytes");
        jt1.m53777p(charset, "charset");
        return new String(bArr, i, i2, charset);
    }

    @vr2
    /* renamed from: h2 */
    public static final String m65440h2(@vr2 String str, char c, char c2, boolean z) {
        String sb;
        String str2;
        jt1.m53777p(str, "<this>");
        if (!z) {
            sb = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (C5453gx.m49972J(charAt, c, z)) {
                    charAt = c2;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        jt1.m53776o(sb, str2);
        return sb;
    }

    @xq1
    /* renamed from: i1 */
    public static final String m65441i1(byte[] bArr, Charset charset) {
        jt1.m53777p(bArr, "bytes");
        jt1.m53777p(charset, "charset");
        return new String(bArr, charset);
    }

    @vr2
    /* renamed from: i2 */
    public static final String m65442i2(@vr2 String str, @vr2 String str2, @vr2 String str3, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "oldValue");
        jt1.m53777p(str3, "newValue");
        int i = 0;
        int n3 = u54.m66657n3(str, str2, 0, z);
        if (n3 < 0) {
            return str;
        }
        int length = str2.length();
        int n = df3.m45198n(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, n3);
                sb.append(str3);
                i = n3 + length;
                if (n3 >= str.length() || (n3 = u54.m66657n3(str, str2, n3 + n, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    jt1.m53776o(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, n3);
                sb.append(str3);
                i = n3 + length;
                break;
            } while ((n3 = u54.m66657n3(str, str2, n3 + n, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            jt1.m53776o(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    @xq1
    /* renamed from: j1 */
    public static final String m65443j1(char[] cArr) {
        jt1.m53777p(cArr, "chars");
        return new String(cArr);
    }

    /* renamed from: j2 */
    public static /* synthetic */ String m65444j2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m65440h2(str, c, c2, z);
    }

    @xq1
    /* renamed from: k1 */
    public static final String m65445k1(char[] cArr, int i, int i2) {
        jt1.m53777p(cArr, "chars");
        return new String(cArr, i, i2);
    }

    /* renamed from: k2 */
    public static /* synthetic */ String m65446k2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m65442i2(str, str2, str3, z);
    }

    @xq1
    /* renamed from: l1 */
    public static final String m65447l1(int[] iArr, int i, int i2) {
        jt1.m53777p(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @vr2
    /* renamed from: l2 */
    public static final String m65448l2(@vr2 String str, char c, char c2, boolean z) {
        jt1.m53777p(str, "<this>");
        int q3 = u54.m66666q3(str, c, 0, z, 2, (Object) null);
        return q3 < 0 ? str : u54.m66555I4(str, q3, q3 + 1, String.valueOf(c2)).toString();
    }

    @zj0(warningSince = "1.5")
    @vr2
    @xj0(message = "Use replaceFirstChar instead.", replaceWith = @oi3(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    /* renamed from: m1 */
    public static final String m65449m1(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        Locale locale = Locale.getDefault();
        jt1.m53776o(locale, "getDefault()");
        return m65451n1(str, locale);
    }

    @vr2
    /* renamed from: m2 */
    public static final String m65450m2(@vr2 String str, @vr2 String str2, @vr2 String str3, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "oldValue");
        jt1.m53777p(str3, "newValue");
        int r3 = u54.m66669r3(str, str2, 0, z, 2, (Object) null);
        return r3 < 0 ? str : u54.m66555I4(str, r3, str2.length() + r3, str3).toString();
    }

    @vr2
    @xj0(message = "Use replaceFirstChar instead.", replaceWith = @oi3(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ib2
    @zj0(warningSince = "1.5")
    /* renamed from: n1 */
    public static final String m65451n1(@vr2 String str, @vr2 Locale locale) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(locale, C2889mv.f16373r);
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        jt1.m53776o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: n2 */
    public static /* synthetic */ String m65452n2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m65448l2(str, c, c2, z);
    }

    @xq1
    /* renamed from: o1 */
    public static final int m65453o1(String str, int i) {
        jt1.m53777p(str, "<this>");
        return str.codePointAt(i);
    }

    /* renamed from: o2 */
    public static /* synthetic */ String m65454o2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m65450m2(str, str2, str3, z);
    }

    @xq1
    /* renamed from: p1 */
    public static final int m65455p1(String str, int i) {
        jt1.m53777p(str, "<this>");
        return str.codePointBefore(i);
    }

    @vr2
    /* renamed from: p2 */
    public static final List<String> m65456p2(@vr2 CharSequence charSequence, @vr2 Pattern pattern, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(pattern, "regex");
        u54.m66568M4(i);
        if (i == 0) {
            i = -1;
        }
        String[] split = pattern.split(charSequence, i);
        jt1.m53776o(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return C7458za.m72983t(split);
    }

    @xq1
    /* renamed from: q1 */
    public static final int m65457q1(String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        return str.codePointCount(i, i2);
    }

    /* renamed from: q2 */
    public static /* synthetic */ List m65458q2(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m65456p2(charSequence, pattern, i);
    }

    /* renamed from: r1 */
    public static final int m65459r1(@vr2 String str, @vr2 String str2, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "other");
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    /* renamed from: r2 */
    public static final boolean m65460r2(@vr2 String str, @vr2 String str2, int i, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m65432d2(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: s1 */
    public static /* synthetic */ int m65461s1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m65459r1(str, str2, z);
    }

    /* renamed from: s2 */
    public static final boolean m65462s2(@vr2 String str, @vr2 String str2, boolean z) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m65432d2(str, 0, str2, 0, str2.length(), z);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: t1 */
    public static final String m65463t1(@vr2 char[] cArr) {
        jt1.m53777p(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: t2 */
    public static /* synthetic */ boolean m65464t2(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m65460r2(str, str2, i, z);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @vr2
    /* renamed from: u1 */
    public static final String m65465u1(@vr2 char[] cArr, int i, int i2) {
        jt1.m53777p(cArr, "<this>");
        C6809t0.f35278a.mo44669a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: u2 */
    public static /* synthetic */ boolean m65466u2(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m65462s2(str, str2, z);
    }

    /* renamed from: v1 */
    public static /* synthetic */ String m65467v1(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return m65465u1(cArr, i, i2);
    }

    @xq1
    /* renamed from: v2 */
    public static final String m65468v2(String str, int i) {
        jt1.m53777p(str, "<this>");
        String substring = str.substring(i);
        jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @gz3(version = "1.5")
    /* renamed from: w1 */
    public static final boolean m65469w1(@ss2 CharSequence charSequence, @ss2 CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? u54.m66609X2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @xq1
    /* renamed from: w2 */
    public static final String m65470w2(String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        String substring = str.substring(i, i2);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @gz3(version = "1.5")
    /* renamed from: x1 */
    public static final boolean m65471x1(@ss2 CharSequence charSequence, @ss2 CharSequence charSequence2, boolean z) {
        return z ? u54.m66606W2(charSequence, charSequence2) : m65469w1(charSequence, charSequence2);
    }

    @xq1
    /* renamed from: x2 */
    public static final byte[] m65472x2(String str, Charset charset) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @xq1
    /* renamed from: y1 */
    public static final boolean m65473y1(String str, CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    /* renamed from: y2 */
    public static /* synthetic */ byte[] m65474y2(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C5604hx.f29888a;
        }
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        jt1.m53776o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @xq1
    /* renamed from: z1 */
    public static final boolean m65475z1(String str, StringBuffer stringBuffer) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @xq1
    /* renamed from: z2 */
    public static final char[] m65476z2(String str) {
        jt1.m53777p(str, "<this>");
        char[] charArray = str.toCharArray();
        jt1.m53776o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }
}
