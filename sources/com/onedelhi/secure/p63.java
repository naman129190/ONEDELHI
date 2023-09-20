package com.onedelhi.secure;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class p63 {

    /* renamed from: a */
    public static final p63 f33472a = new p63();

    /* renamed from: a */
    public final yr3 f33473a = new ec2();

    /* renamed from: a */
    public final ConcurrentMap<Class<?>, xr3<?>> f33474a = new ConcurrentHashMap();

    /* renamed from: a */
    public static p63 m60498a() {
        return f33472a;
    }

    /* renamed from: b */
    public int mo42378b() {
        int i = 0;
        for (xr3 xr3 : this.f33474a.values()) {
            if (xr3 instanceof bi2) {
                i += ((bi2) xr3).mo31797x();
            }
        }
        return i;
    }

    /* renamed from: c */
    public <T> boolean mo42379c(T t) {
        return mo42386j(t).mo31772h(t);
    }

    /* renamed from: d */
    public <T> void mo42380d(T t) {
        mo42386j(t).mo31774i(t);
    }

    /* renamed from: e */
    public <T> void mo42381e(T t, vf3 vf3) throws IOException {
        mo42382f(t, vf3, zy0.m74393d());
    }

    /* renamed from: f */
    public <T> void mo42382f(T t, vf3 vf3, zy0 zy0) throws IOException {
        mo42386j(t).mo31776j(t, vf3, zy0);
    }

    /* renamed from: g */
    public xr3<?> mo42383g(Class<?> cls, xr3<?> xr3) {
        vs1.m68433e(cls, "messageType");
        vs1.m68433e(xr3, "schema");
        return this.f33474a.putIfAbsent(cls, xr3);
    }

    /* renamed from: h */
    public xr3<?> mo42384h(Class<?> cls, xr3<?> xr3) {
        vs1.m68433e(cls, "messageType");
        vs1.m68433e(xr3, "schema");
        return (xr3) this.f33474a.put(cls, xr3);
    }

    /* renamed from: i */
    public <T> xr3<T> mo42385i(Class<T> cls) {
        vs1.m68433e(cls, "messageType");
        xr3<T> xr3 = (xr3) this.f33474a.get(cls);
        if (xr3 != null) {
            return xr3;
        }
        xr3<T> a = this.f33473a.mo35118a(cls);
        xr3<?> g = mo42383g(cls, a);
        return g != null ? g : a;
    }

    /* renamed from: j */
    public <T> xr3<T> mo42386j(T t) {
        return mo42385i(t.getClass());
    }

    /* renamed from: k */
    public <T> void mo42387k(T t, ty4 ty4) throws IOException {
        mo42386j(t).mo31764d(t, ty4);
    }
}
