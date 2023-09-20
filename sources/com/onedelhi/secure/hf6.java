package com.onedelhi.secure;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class hf6 {

    /* renamed from: a */
    public final Unsafe f13067a;

    public hf6(Unsafe unsafe) {
        this.f13067a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo13677a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo13678b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo13679c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo13680d(Object obj, long j, double d);

    /* renamed from: e */
    public abstract void mo13681e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract boolean mo13682f(Object obj, long j);

    /* renamed from: g */
    public final int mo17247g(Class cls) {
        return this.f13067a.arrayBaseOffset(cls);
    }

    /* renamed from: h */
    public final int mo17248h(Class cls) {
        return this.f13067a.arrayIndexScale(cls);
    }

    /* renamed from: i */
    public final int mo17249i(Object obj, long j) {
        return this.f13067a.getInt(obj, j);
    }

    /* renamed from: j */
    public final long mo17250j(Object obj, long j) {
        return this.f13067a.getLong(obj, j);
    }

    /* renamed from: k */
    public final long mo17251k(Field field) {
        return this.f13067a.objectFieldOffset(field);
    }

    /* renamed from: l */
    public final Object mo17252l(Object obj, long j) {
        return this.f13067a.getObject(obj, j);
    }

    /* renamed from: m */
    public final void mo17253m(Object obj, long j, int i) {
        this.f13067a.putInt(obj, j, i);
    }

    /* renamed from: n */
    public final void mo17254n(Object obj, long j, long j2) {
        this.f13067a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final void mo17255o(Object obj, long j, Object obj2) {
        this.f13067a.putObject(obj, j, obj2);
    }
}
