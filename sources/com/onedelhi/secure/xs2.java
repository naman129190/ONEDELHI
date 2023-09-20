package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\t\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\n\u001a\u00020\u0000*\u00020\u0000H\b\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\f\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\f\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u000eH\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0013H\b\u001a\r\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\b\u001a!\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\b¨\u0006\u001b"}, d2 = {"Ljava/math/BigInteger;", "other", "x", "v", "B", "s", "y", "H", "t", "r", "u", "q", "w", "I", "", "n", "z", "A", "F", "", "G", "Ljava/math/BigDecimal;", "C", "scale", "Ljava/math/MathContext;", "mathContext", "D", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/NumbersKt")
public class xs2 extends ws2 {
    @gz3(version = "1.2")
    @xq1
    /* renamed from: A */
    public static final BigInteger m70770A(BigInteger bigInteger, int i) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i);
        jt1.m53776o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @xq1
    /* renamed from: B */
    public static final BigInteger m70771B(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        jt1.m53776o(multiply, "this.multiply(other)");
        return multiply;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: C */
    public static final BigDecimal m70772C(BigInteger bigInteger) {
        jt1.m53777p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: D */
    public static final BigDecimal m70773D(BigInteger bigInteger, int i, MathContext mathContext) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    /* renamed from: E */
    public static /* synthetic */ BigDecimal m70774E(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            jt1.m53776o(mathContext, "UNLIMITED");
        }
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: F */
    public static final BigInteger m70775F(int i) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: G */
    public static final BigInteger m70776G(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @xq1
    /* renamed from: H */
    public static final BigInteger m70777H(BigInteger bigInteger) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        jt1.m53776o(negate, "this.negate()");
        return negate;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: I */
    public static final BigInteger m70778I(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        jt1.m53776o(xor, "this.xor(other)");
        return xor;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: q */
    public static final BigInteger m70779q(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        jt1.m53776o(and, "this.and(other)");
        return and;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: r */
    public static final BigInteger m70780r(BigInteger bigInteger) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        jt1.m53776o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @xq1
    /* renamed from: s */
    public static final BigInteger m70781s(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        jt1.m53776o(divide, "this.divide(other)");
        return divide;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: t */
    public static final BigInteger m70782t(BigInteger bigInteger) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        jt1.m53776o(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: u */
    public static final BigInteger m70783u(BigInteger bigInteger) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        jt1.m53776o(not, "this.not()");
        return not;
    }

    @xq1
    /* renamed from: v */
    public static final BigInteger m70784v(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        jt1.m53776o(subtract, "this.subtract(other)");
        return subtract;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: w */
    public static final BigInteger m70785w(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        jt1.m53776o(or, "this.or(other)");
        return or;
    }

    @xq1
    /* renamed from: x */
    public static final BigInteger m70786x(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        jt1.m53776o(add, "this.add(other)");
        return add;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: y */
    public static final BigInteger m70787y(BigInteger bigInteger, BigInteger bigInteger2) {
        jt1.m53777p(bigInteger, "<this>");
        jt1.m53777p(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        jt1.m53776o(remainder, "this.remainder(other)");
        return remainder;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: z */
    public static final BigInteger m70788z(BigInteger bigInteger, int i) {
        jt1.m53777p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        jt1.m53776o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
