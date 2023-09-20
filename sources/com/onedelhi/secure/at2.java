package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\b\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\nH\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\nH\b\u001a\r\u0010\r\u001a\u00020\u0001*\u00020\nH\b\u001a\r\u0010\u000e\u001a\u00020\n*\u00020\nH\b\u001a\r\u0010\u000f\u001a\u00020\n*\u00020\nH\b\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¨\u0006\u0012"}, d2 = {"", "", "V0", "T0", "X0", "d1", "f1", "bitCount", "Z0", "b1", "", "W0", "U0", "Y0", "e1", "g1", "a1", "c1", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/NumbersKt")
public class at2 extends zs2 {
    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: T0 */
    public static final int m39055T0(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: U0 */
    public static final int m39056U0(short s) {
        return Integer.numberOfLeadingZeros(s & xm4.f37547c) - 16;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: V0 */
    public static final int m39057V0(byte b) {
        return Integer.bitCount(b & 255);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: W0 */
    public static final int m39058W0(short s) {
        return Integer.bitCount(s & xm4.f37547c);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: X0 */
    public static final int m39059X0(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: Y0 */
    public static final int m39060Y0(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    /* renamed from: Z0 */
    public static final byte m39061Z0(byte b, int i) {
        byte b2 = i & 7;
        return (byte) (((b & 255) >>> (8 - b2)) | (b << b2));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    /* renamed from: a1 */
    public static final short m39062a1(short s, int i) {
        short s2 = i & 15;
        return (short) (((s & xm4.f37547c) >>> (16 - s2)) | (s << s2));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    /* renamed from: b1 */
    public static final byte m39063b1(byte b, int i) {
        byte b2 = i & 7;
        return (byte) (((b & 255) >>> b2) | (b << (8 - b2)));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    /* renamed from: c1 */
    public static final short m39064c1(short s, int i) {
        short s2 = i & 15;
        return (short) (((s & xm4.f37547c) >>> s2) | (s << (16 - s2)));
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: d1 */
    public static final byte m39065d1(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: e1 */
    public static final short m39066e1(short s) {
        return (short) Integer.highestOneBit(s & xm4.f37547c);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: f1 */
    public static final byte m39067f1(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: g1 */
    public static final short m39068g1(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
