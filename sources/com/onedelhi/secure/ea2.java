package com.onedelhi.secure;

import com.onedelhi.secure.fq0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\"\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005\u001a\"\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "longNs", "Lcom/onedelhi/secure/fq0;", "duration", "b", "(JJ)J", "durationNs", "a", "(JJJ)J", "c", "valueNs", "originNs", "d", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class ea2 {
    /* renamed from: a */
    public static final long m46190a(long j, long j2, long j3) {
        if (!fq0.m48274k0(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: b */
    public static final long m46191b(long j, long j2) {
        long V = fq0.m48255V(j2);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m46190a(j, j2, V);
        }
        if ((1 | (V - 1)) == Long.MAX_VALUE) {
            return m46192c(j, j2);
        }
        long j3 = j + V;
        return ((j ^ j3) & (V ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* renamed from: c */
    public static final long m46192c(long j, long j2) {
        long w = fq0.m48292w(j2, 2);
        return ((fq0.m48255V(w) - 1) | 1) == Long.MAX_VALUE ? (long) (((double) j) + fq0.m48291v0(j2, lq0.NANOSECONDS)) : m46191b(m46191b(j, w), w);
    }

    /* renamed from: d */
    public static final long m46193d(long j, long j2) {
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return fq0.m48238E0(iq0.m52557n0(j2, lq0.DAYS));
        }
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            long j4 = (long) 1000000;
            long j5 = (j % j4) - (j2 % j4);
            fq0.C5299a aVar = fq0.f28620a;
            return fq0.m48279o0(iq0.m52557n0((j / j4) - (j2 / j4), lq0.MILLISECONDS), iq0.m52557n0(j5, lq0.NANOSECONDS));
        }
        fq0.C5299a aVar2 = fq0.f28620a;
        return iq0.m52557n0(j3, lq0.NANOSECONDS);
    }
}
