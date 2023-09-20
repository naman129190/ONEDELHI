package com.onedelhi.secure;

import sun.misc.Unsafe;

public final class wu6 extends yu6 {
    public wu6(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo26699a(Object obj, long j) {
        return Double.longBitsToDouble(this.f23341a.getLong(obj, j));
    }

    /* renamed from: b */
    public final float mo26700b(Object obj, long j) {
        return Float.intBitsToFloat(this.f23341a.getInt(obj, j));
    }

    /* renamed from: c */
    public final void mo26701c(Object obj, long j, boolean z) {
        if (zu6.f23907d) {
            zu6.m33457d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zu6.m33458e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo26702d(Object obj, long j, byte b) {
        if (zu6.f23907d) {
            zu6.m33457d(obj, j, b);
        } else {
            zu6.m33458e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo26703e(Object obj, long j, double d) {
        this.f23341a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo26704f(Object obj, long j, float f) {
        this.f23341a.putInt(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo26705g(Object obj, long j) {
        return zu6.f23907d ? zu6.m33478y(obj, j) : zu6.m33479z(obj, j);
    }
}
