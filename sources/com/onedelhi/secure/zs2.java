package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0003H\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0003H\b\u001a\r\u0010\n\u001a\u00020\t*\u00020\u0000H\b\u001a\r\u0010\u000b\u001a\u00020\t*\u00020\u0000H\b\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\f2\u0006\u0010\r\u001a\u00020\tH\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0003H\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0003H\b\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\r\u001a\u00020\u000fH\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u000fH\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u000fH\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u000fH\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u000fH\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u000fH\b\u001a\u0015\u0010\u001a\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\b\u001a\r\u0010\u001c\u001a\u00020\u000f*\u00020\tH\b\u001a\r\u0010\u001d\u001a\u00020\u000f*\u00020\tH\b\u001a\r\u0010\u001e\u001a\u00020\u000f*\u00020\tH\b\u001a\r\u0010\u001f\u001a\u00020\t*\u00020\tH\b\u001a\r\u0010 \u001a\u00020\t*\u00020\tH\b\u001a\u0015\u0010!\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000fH\b\u001a\u0015\u0010\"\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000fH\b¨\u0006#"}, d2 = {"", "", "F0", "", "G0", "D0", "E0", "B0", "C0", "", "Q0", "S0", "Lkotlin/Double$Companion;", "bits", "z0", "", "P0", "R0", "Lkotlin/Float$Companion;", "A0", "v0", "t0", "x0", "L0", "N0", "bitCount", "H0", "J0", "w0", "u0", "y0", "M0", "O0", "I0", "K0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/NumbersKt")
public class zs2 extends ys2 {
    @gz3(version = "1.2")
    @xq1
    /* renamed from: A0 */
    public static final float m74253A0(x71 x71, int i) {
        jt1.m53777p(x71, "<this>");
        return Float.intBitsToFloat(i);
    }

    @xq1
    /* renamed from: B0 */
    public static final boolean m74254B0(double d) {
        return !Double.isInfinite(d) && !Double.isNaN(d);
    }

    @xq1
    /* renamed from: C0 */
    public static final boolean m74255C0(float f) {
        return !Float.isInfinite(f) && !Float.isNaN(f);
    }

    @xq1
    /* renamed from: D0 */
    public static final boolean m74256D0(double d) {
        return Double.isInfinite(d);
    }

    @xq1
    /* renamed from: E0 */
    public static final boolean m74257E0(float f) {
        return Float.isInfinite(f);
    }

    @xq1
    /* renamed from: F0 */
    public static final boolean m74258F0(double d) {
        return Double.isNaN(d);
    }

    @xq1
    /* renamed from: G0 */
    public static final boolean m74259G0(float f) {
        return Float.isNaN(f);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: H0 */
    public static final int m74260H0(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: I0 */
    public static final long m74261I0(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: J0 */
    public static final int m74262J0(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: K0 */
    public static final long m74263K0(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: L0 */
    public static final int m74264L0(int i) {
        return Integer.highestOneBit(i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: M0 */
    public static final long m74265M0(long j) {
        return Long.highestOneBit(j);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: N0 */
    public static final int m74266N0(int i) {
        return Integer.lowestOneBit(i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: O0 */
    public static final long m74267O0(long j) {
        return Long.lowestOneBit(j);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: P0 */
    public static final int m74268P0(float f) {
        return Float.floatToIntBits(f);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: Q0 */
    public static final long m74269Q0(double d) {
        return Double.doubleToLongBits(d);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: R0 */
    public static final int m74270R0(float f) {
        return Float.floatToRawIntBits(f);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: S0 */
    public static final long m74271S0(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: t0 */
    public static final int m74272t0(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: u0 */
    public static final int m74273u0(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: v0 */
    public static final int m74274v0(int i) {
        return Integer.bitCount(i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: w0 */
    public static final int m74275w0(long j) {
        return Long.bitCount(j);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: x0 */
    public static final int m74276x0(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: y0 */
    public static final int m74277y0(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: z0 */
    public static final double m74278z0(go0 go0, long j) {
        jt1.m53777p(go0, "<this>");
        return Double.longBitsToDouble(j);
    }
}
