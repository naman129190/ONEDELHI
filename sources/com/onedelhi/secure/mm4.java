package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a*\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0004\u001a*\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a*\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a*\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/il4;", "a", "b", "c", "(III)I", "Lcom/onedelhi/secure/tl4;", "(JJJ)J", "start", "end", "", "step", "d", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class mm4 {
    /* renamed from: a */
    public static final int m57422a(int i, int i2, int i3) {
        int e = mo4.m57479e(i, i3);
        int e2 = mo4.m57479e(i2, i3);
        int c = mo4.m57477c(e, e2);
        int s = il4.m52435s(e - e2);
        return c >= 0 ? s : il4.m52435s(s + i3);
    }

    /* renamed from: b */
    public static final long m57423b(long j, long j2, long j3) {
        long i = mo4.m57483i(j, j3);
        long i2 = mo4.m57483i(j2, j3);
        int g = mo4.m57481g(i, i2);
        long s = tl4.m66012s(i - i2);
        return g >= 0 ? s : tl4.m66012s(s + j3);
    }

    @gz3(version = "1.3")
    @z73
    /* renamed from: c */
    public static final long m57424c(long j, long j2, long j3) {
        long b;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (mo4.m57481g(j, j2) >= 0) {
                return j2;
            }
            b = j2 - m57423b(j2, j, tl4.m66012s(j3));
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (mo4.m57481g(j, j2) <= 0) {
            return j2;
        } else {
            b = j2 + m57423b(j, j2, tl4.m66012s(-j3));
        }
        return tl4.m66012s(b);
    }

    @gz3(version = "1.3")
    @z73
    /* renamed from: d */
    public static final int m57425d(int i, int i2, int i3) {
        int a;
        if (i3 > 0) {
            if (mo4.m57477c(i, i2) >= 0) {
                return i2;
            }
            a = i2 - m57422a(i2, i, il4.m52435s(i3));
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (mo4.m57477c(i, i2) <= 0) {
            return i2;
        } else {
            a = i2 + m57422a(i, i2, il4.m52435s(-i3));
        }
        return il4.m52435s(a);
    }
}
