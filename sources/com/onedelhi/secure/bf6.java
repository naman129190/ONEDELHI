package com.onedelhi.secure;

import sun.misc.Unsafe;

public final class bf6 extends hf6 {
    public bf6(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo13677a(Object obj, long j) {
        return Double.longBitsToDouble(mo17250j(obj, j));
    }

    /* renamed from: b */
    public final float mo13678b(Object obj, long j) {
        return Float.intBitsToFloat(mo17249i(obj, j));
    }

    /* renamed from: c */
    public final void mo13679c(Object obj, long j, boolean z) {
        if (kf6.f14890d) {
            kf6.m19753i(obj, j, z);
        } else {
            kf6.m19754j(obj, j, z);
        }
    }

    /* renamed from: d */
    public final void mo13680d(Object obj, long j, double d) {
        mo17254n(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: e */
    public final void mo13681e(Object obj, long j, float f) {
        mo17253m(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final boolean mo13682f(Object obj, long j) {
        return kf6.f14890d ? kf6.m19761q(obj, j) : kf6.m19762r(obj, j);
    }
}
