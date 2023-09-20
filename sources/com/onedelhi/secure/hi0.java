package com.onedelhi.secure;

public final class hi0<T> implements lz0<T> {

    /* renamed from: a */
    public a73<T> f13112a;

    /* renamed from: b */
    public static <T> void m16766b(a73<T> a73, a73<T> a732) {
        h43.m16475b(a732);
        hi0 hi0 = (hi0) a73;
        if (hi0.f13112a == null) {
            hi0.f13112a = a732;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public a73<T> mo17286a() {
        return (a73) h43.m16475b(this.f13112a);
    }

    @Deprecated
    /* renamed from: c */
    public void mo17287c(a73<T> a73) {
        m16766b(this, a73);
    }

    public T get() {
        a73<T> a73 = this.f13112a;
        if (a73 != null) {
            return a73.get();
        }
        throw new IllegalStateException();
    }
}
