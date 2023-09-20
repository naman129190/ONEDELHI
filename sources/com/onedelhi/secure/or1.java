package com.onedelhi.secure;

public final class or1<T> implements lz0<T>, x12<T> {

    /* renamed from: a */
    public static final or1<Object> f18082a = new or1<>((Object) null);

    /* renamed from: a */
    public final T f18083a;

    public or1(T t) {
        this.f18083a = t;
    }

    /* renamed from: a */
    public static <T> lz0<T> m24043a(T t) {
        return new or1(h43.m16476c(t, "instance cannot be null"));
    }

    /* renamed from: b */
    public static <T> lz0<T> m24044b(T t) {
        return t == null ? m24045c() : new or1(t);
    }

    /* renamed from: c */
    public static <T> or1<T> m24045c() {
        return f18082a;
    }

    public T get() {
        return this.f18083a;
    }
}
