package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\t\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\nH\b\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\n2\u0006\u0010\r\u001a\u00020\fH\b\u001a\r\u0010\u0010\u001a\u00020\u0000*\u00020\u000fH\b\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\b\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\u0012H\b\u001a\u0015\u0010\u0014\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\b\u001a\r\u0010\u0016\u001a\u00020\u0000*\u00020\u0015H\b\u001a\u0015\u0010\u0017\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\b¨\u0006\u0018"}, d2 = {"Ljava/math/BigDecimal;", "other", "e", "d", "g", "b", "f", "p", "c", "a", "", "l", "Ljava/math/MathContext;", "mathContext", "m", "", "n", "o", "", "j", "k", "", "h", "i", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/NumbersKt")
public class ws2 {
    @gz3(version = "1.2")
    @xq1
    /* renamed from: a */
    public static final BigDecimal m69618a(BigDecimal bigDecimal) {
        jt1.m53777p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        jt1.m53776o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @xq1
    /* renamed from: b */
    public static final BigDecimal m69619b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        jt1.m53777p(bigDecimal, "<this>");
        jt1.m53777p(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        jt1.m53776o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: c */
    public static final BigDecimal m69620c(BigDecimal bigDecimal) {
        jt1.m53777p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        jt1.m53776o(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @xq1
    /* renamed from: d */
    public static final BigDecimal m69621d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        jt1.m53777p(bigDecimal, "<this>");
        jt1.m53777p(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        jt1.m53776o(subtract, "this.subtract(other)");
        return subtract;
    }

    @xq1
    /* renamed from: e */
    public static final BigDecimal m69622e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        jt1.m53777p(bigDecimal, "<this>");
        jt1.m53777p(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        jt1.m53776o(add, "this.add(other)");
        return add;
    }

    @xq1
    /* renamed from: f */
    public static final BigDecimal m69623f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        jt1.m53777p(bigDecimal, "<this>");
        jt1.m53777p(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        jt1.m53776o(remainder, "this.remainder(other)");
        return remainder;
    }

    @xq1
    /* renamed from: g */
    public static final BigDecimal m69624g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        jt1.m53777p(bigDecimal, "<this>");
        jt1.m53777p(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        jt1.m53776o(multiply, "this.multiply(other)");
        return multiply;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: h */
    public static final BigDecimal m69625h(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: i */
    public static final BigDecimal m69626i(double d, MathContext mathContext) {
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: j */
    public static final BigDecimal m69627j(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: k */
    public static final BigDecimal m69628k(float f, MathContext mathContext) {
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: l */
    public static final BigDecimal m69629l(int i) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: m */
    public static final BigDecimal m69630m(int i, MathContext mathContext) {
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: n */
    public static final BigDecimal m69631n(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: o */
    public static final BigDecimal m69632o(long j, MathContext mathContext) {
        jt1.m53777p(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @xq1
    /* renamed from: p */
    public static final BigDecimal m69633p(BigDecimal bigDecimal) {
        jt1.m53777p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        jt1.m53776o(negate, "this.negate()");
        return negate;
    }
}
