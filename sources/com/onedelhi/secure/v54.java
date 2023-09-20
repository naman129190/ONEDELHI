package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\b\u001a=\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000e\u001a1\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0013\u001a+\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, d2 = {"", "", "index", "", "W5", "Ljava/util/SortedSet;", "f6", "X5", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", "R", "Lkotlin/Function1;", "selector", "Y5", "(Ljava/lang/CharSequence;Lcom/onedelhi/secure/ec1;)Ljava/lang/Character;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Z5", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "a6", "b6", "c6", "Ljava/math/BigDecimal;", "d6", "(Ljava/lang/CharSequence;Lcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "e6", "(Ljava/lang/CharSequence;Lcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class v54 extends u54 {
    @xq1
    /* renamed from: W5 */
    public static final char m67739W5(CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    /* renamed from: Y5 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m67741Y5(CharSequence charSequence, ec1<? super Character, ? extends R> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int i3 = u54.m66642i3(charSequence);
        if (i3 != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(Character.valueOf(charAt));
            ds1 o = new is1(1, i3).iterator();
            while (o.hasNext()) {
                char charAt2 = charSequence.charAt(o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* renamed from: Z5 */
    public static final /* synthetic */ Character m67742Z5(CharSequence charSequence, Comparator comparator) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(comparator, "comparator");
        return w54.m68915R7(charSequence, comparator);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    /* renamed from: b6 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m67744b6(CharSequence charSequence, ec1<? super Character, ? extends R> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int i3 = u54.m66642i3(charSequence);
        if (i3 != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(Character.valueOf(charAt));
            ds1 o = new is1(1, i3).iterator();
            while (o.hasNext()) {
                char charAt2 = charSequence.charAt(o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* renamed from: c6 */
    public static final /* synthetic */ Character m67745c6(CharSequence charSequence, Comparator comparator) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(comparator, "comparator");
        return w54.m68957f8(charSequence, comparator);
    }

    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: d6 */
    public static final BigDecimal m67746d6(CharSequence charSequence, ec1<? super Character, ? extends BigDecimal> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(Character.valueOf(charSequence.charAt(i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: e6 */
    public static final BigInteger m67747e6(CharSequence charSequence, ec1<? super Character, ? extends BigInteger> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(Character.valueOf(charSequence.charAt(i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @vr2
    /* renamed from: f6 */
    public static final SortedSet<Character> m67748f6(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return (SortedSet) w54.m68955e9(charSequence, new TreeSet());
    }
}
