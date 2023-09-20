package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0007\u001a\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¨\u0006\u0019"}, d2 = {"", "seed", "Lcom/onedelhi/secure/me3;", "a", "", "b", "Lcom/onedelhi/secure/is1;", "range", "h", "Lcom/onedelhi/secure/da2;", "i", "value", "g", "bitCount", "j", "from", "until", "Lcom/onedelhi/secure/un4;", "e", "f", "", "d", "", "", "c", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class pe3 {
    @gz3(version = "1.3")
    @vr2
    /* renamed from: a */
    public static final me3 m60967a(int i) {
        return new fz4(i, i >> 31);
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: b */
    public static final me3 m60968b(long j) {
        return new fz4((int) j, (int) (j >> 32));
    }

    @vr2
    /* renamed from: c */
    public static final String m60969c(@vr2 Object obj, @vr2 Object obj2) {
        jt1.m53777p(obj, "from");
        jt1.m53777p(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: d */
    public static final void m60970d(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(m60969c(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: e */
    public static final void m60971e(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m60969c(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: f */
    public static final void m60972f(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(m60969c(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* renamed from: g */
    public static final int m60973g(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @gz3(version = "1.3")
    /* renamed from: h */
    public static final int m60974h(@vr2 me3 me3, @vr2 is1 is1) {
        jt1.m53777p(me3, "<this>");
        jt1.m53777p(is1, "range");
        if (!is1.isEmpty()) {
            return is1.mo36872l() < Integer.MAX_VALUE ? me3.mo40549n(is1.mo36871j(), is1.mo36872l() + 1) : is1.mo36871j() > Integer.MIN_VALUE ? me3.mo40549n(is1.mo36871j() - 1, is1.mo36872l()) + 1 : me3.mo35703l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + is1);
    }

    @gz3(version = "1.3")
    /* renamed from: i */
    public static final long m60975i(@vr2 me3 me3, @vr2 da2 da2) {
        jt1.m53777p(me3, "<this>");
        jt1.m53777p(da2, "range");
        if (!da2.isEmpty()) {
            int i = (da2.mo31544l() > Long.MAX_VALUE ? 1 : (da2.mo31544l() == Long.MAX_VALUE ? 0 : -1));
            long j = da2.mo31543j();
            return i < 0 ? me3.mo40551q(j, da2.mo31544l() + 1) : j > Long.MIN_VALUE ? me3.mo40551q(da2.mo31543j() - 1, da2.mo31544l()) + 1 : me3.mo35705o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + da2);
    }

    /* renamed from: j */
    public static final int m60976j(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
