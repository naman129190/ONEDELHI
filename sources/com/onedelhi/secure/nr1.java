package com.onedelhi.secure;

public final class nr1<T> implements kz0<T>, v12<T> {

    /* renamed from: a */
    public static final nr1<Object> f32741a = new nr1<>((Object) null);

    /* renamed from: a */
    public final T f32742a;

    public nr1(T t) {
        this.f32742a = t;
    }

    /* renamed from: a */
    public static <T> kz0<T> m58727a(T t) {
        return new nr1(j43.m52915c(t, "instance cannot be null"));
    }

    /* renamed from: b */
    public static <T> kz0<T> m58728b(T t) {
        return t == null ? m58729c() : new nr1(t);
    }

    /* renamed from: c */
    public static <T> nr1<T> m58729c() {
        return f32741a;
    }

    public T get() {
        return this.f32742a;
    }
}
