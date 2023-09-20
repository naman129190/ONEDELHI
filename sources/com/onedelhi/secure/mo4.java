package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0001\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0001\u001a\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0000H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "v1", "v2", "c", "", "g", "Lcom/onedelhi/secure/il4;", "d", "(II)I", "e", "Lcom/onedelhi/secure/tl4;", "h", "(JJ)J", "i", "", "v", "a", "(D)I", "b", "(D)J", "f", "j", "", "k", "base", "l", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "UnsignedKt")
public final class mo4 {
    @z73
    /* renamed from: a */
    public static final int m57475a(double d) {
        if (Double.isNaN(d) || d <= m57480f(0)) {
            return 0;
        }
        if (d >= m57480f(-1)) {
            return -1;
        }
        return il4.m52435s(d <= 2.147483647E9d ? (int) d : il4.m52435s((int) (d - ((double) Integer.MAX_VALUE))) + il4.m52435s(Integer.MAX_VALUE));
    }

    @z73
    /* renamed from: b */
    public static final long m57476b(double d) {
        if (Double.isNaN(d) || d <= m57484j(0)) {
            return 0;
        }
        if (d >= m57484j(-1)) {
            return -1;
        }
        return tl4.m66012s(d < 9.223372036854776E18d ? (long) d : tl4.m66012s((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @z73
    /* renamed from: c */
    public static final int m57477c(int i, int i2) {
        return jt1.m53781t(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @z73
    /* renamed from: d */
    public static final int m57478d(int i, int i2) {
        return il4.m52435s((int) ((((long) i) & ZipConstants.ZIP64_MAGIC) / (((long) i2) & ZipConstants.ZIP64_MAGIC)));
    }

    @z73
    /* renamed from: e */
    public static final int m57479e(int i, int i2) {
        return il4.m52435s((int) ((((long) i) & ZipConstants.ZIP64_MAGIC) % (((long) i2) & ZipConstants.ZIP64_MAGIC)));
    }

    @z73
    /* renamed from: f */
    public static final double m57480f(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    @z73
    /* renamed from: g */
    public static final int m57481g(long j, long j2) {
        return jt1.m53782u(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @z73
    /* renamed from: h */
    public static final long m57482h(long j, long j2) {
        if (j2 < 0) {
            return m57481g(j, j2) < 0 ? tl4.m66012s(0) : tl4.m66012s(1);
        }
        if (j >= 0) {
            return tl4.m66012s(j / j2);
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (m57481g(tl4.m66012s(j - (j3 * j2)), tl4.m66012s(j2)) < 0) {
            i = 0;
        }
        return tl4.m66012s(j3 + ((long) i));
    }

    @z73
    /* renamed from: i */
    public static final long m57483i(long j, long j2) {
        long j3;
        if (j2 < 0) {
            return m57481g(j, j2) < 0 ? j : tl4.m66012s(j - j2);
        }
        if (j >= 0) {
            j3 = j % j2;
        } else {
            long j4 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (m57481g(tl4.m66012s(j4), tl4.m66012s(j2)) < 0) {
                j2 = 0;
            }
            j3 = j4 - j2;
        }
        return tl4.m66012s(j3);
    }

    @z73
    /* renamed from: j */
    public static final double m57484j(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    @vr2
    /* renamed from: k */
    public static final String m57485k(long j) {
        return m57486l(j, 10);
    }

    @vr2
    /* renamed from: l */
    public static final String m57486l(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C5327fx.m48539a(i));
            jt1.m53776o(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, C5327fx.m48539a(i));
        jt1.m53776o(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, C5327fx.m48539a(i));
        jt1.m53776o(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
