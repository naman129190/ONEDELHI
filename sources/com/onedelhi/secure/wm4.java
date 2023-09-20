package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u001c\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/il4;", "b", "(Lcom/onedelhi/secure/zt3;)I", "Lcom/onedelhi/secure/tl4;", "c", "(Lcom/onedelhi/secure/zt3;)J", "Lcom/onedelhi/secure/al4;", "a", "Lcom/onedelhi/secure/xm4;", "d", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/USequencesKt")
public class wm4 {
    @uw1(name = "sumOfUByte")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: a */
    public static final int m69491a(@vr2 zt3<al4> zt3) {
        jt1.m53777p(zt3, "<this>");
        int i = 0;
        for (al4 p0 : zt3) {
            i = il4.m52435s(i + il4.m52435s(p0.mo30974p0() & 255));
        }
        return i;
    }

    @uw1(name = "sumOfUInt")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: b */
    public static final int m69492b(@vr2 zt3<il4> zt3) {
        jt1.m53777p(zt3, "<this>");
        int i = 0;
        for (il4 r0 : zt3) {
            i = il4.m52435s(i + r0.mo38158r0());
        }
        return i;
    }

    @uw1(name = "sumOfULong")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: c */
    public static final long m69493c(@vr2 zt3<tl4> zt3) {
        jt1.m53777p(zt3, "<this>");
        long j = 0;
        for (tl4 r0 : zt3) {
            j = tl4.m66012s(j + r0.mo45180r0());
        }
        return j;
    }

    @uw1(name = "sumOfUShort")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: d */
    public static final int m69494d(@vr2 zt3<xm4> zt3) {
        jt1.m53777p(zt3, "<this>");
        int i = 0;
        for (xm4 p0 : zt3) {
            i = il4.m52435s(i + il4.m52435s(p0.mo47362p0() & xm4.f37547c));
        }
        return i;
    }
}
