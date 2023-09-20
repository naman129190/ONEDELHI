package com.onedelhi.secure;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u001c\u0010\u0017\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"", "Lcom/onedelhi/secure/al4;", "Lcom/onedelhi/secure/bl4;", "e", "(Ljava/util/Collection;)[B", "Lcom/onedelhi/secure/il4;", "Lcom/onedelhi/secure/nl4;", "f", "(Ljava/util/Collection;)[I", "Lcom/onedelhi/secure/tl4;", "Lcom/onedelhi/secure/ul4;", "g", "(Ljava/util/Collection;)[J", "Lcom/onedelhi/secure/xm4;", "Lcom/onedelhi/secure/ym4;", "h", "(Ljava/util/Collection;)[S", "", "b", "(Ljava/lang/Iterable;)I", "c", "(Ljava/lang/Iterable;)J", "a", "d", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/UCollectionsKt")
public class fl4 {
    @uw1(name = "sumOfUByte")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: a */
    public static final int m48094a(@vr2 Iterable<al4> iterable) {
        jt1.m53777p(iterable, "<this>");
        int i = 0;
        for (al4 p0 : iterable) {
            i = il4.m52435s(i + il4.m52435s(p0.mo30974p0() & 255));
        }
        return i;
    }

    @uw1(name = "sumOfUInt")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: b */
    public static final int m48095b(@vr2 Iterable<il4> iterable) {
        jt1.m53777p(iterable, "<this>");
        int i = 0;
        for (il4 r0 : iterable) {
            i = il4.m52435s(i + r0.mo38158r0());
        }
        return i;
    }

    @uw1(name = "sumOfULong")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: c */
    public static final long m48096c(@vr2 Iterable<tl4> iterable) {
        jt1.m53777p(iterable, "<this>");
        long j = 0;
        for (tl4 r0 : iterable) {
            j = tl4.m66012s(j + r0.mo45180r0());
        }
        return j;
    }

    @uw1(name = "sumOfUShort")
    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: d */
    public static final int m48097d(@vr2 Iterable<xm4> iterable) {
        jt1.m53777p(iterable, "<this>");
        int i = 0;
        for (xm4 p0 : iterable) {
            i = il4.m52435s(i + il4.m52435s(p0.mo47362p0() & xm4.f37547c));
        }
        return i;
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: e */
    public static final byte[] m48098e(@vr2 Collection<al4> collection) {
        jt1.m53777p(collection, "<this>");
        byte[] g = bl4.m40151g(collection.size());
        int i = 0;
        for (al4 p0 : collection) {
            bl4.m40163z(g, i, p0.mo30974p0());
            i++;
        }
        return g;
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: f */
    public static final int[] m48099f(@vr2 Collection<il4> collection) {
        jt1.m53777p(collection, "<this>");
        int[] g = nl4.m58202g(collection.size());
        int i = 0;
        for (il4 r0 : collection) {
            nl4.m58214z(g, i, r0.mo38158r0());
            i++;
        }
        return g;
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: g */
    public static final long[] m48100g(@vr2 Collection<tl4> collection) {
        jt1.m53777p(collection, "<this>");
        long[] g = ul4.m67110g(collection.size());
        int i = 0;
        for (tl4 r0 : collection) {
            ul4.m67122z(g, i, r0.mo45180r0());
            i++;
        }
        return g;
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: h */
    public static final short[] m48101h(@vr2 Collection<xm4> collection) {
        jt1.m53777p(collection, "<this>");
        short[] g = ym4.m71894g(collection.size());
        int i = 0;
        for (xm4 p0 : collection) {
            ym4.m71906z(g, i, p0.mo47362p0());
            i++;
        }
        return g;
    }
}
