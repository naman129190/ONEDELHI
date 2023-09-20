package com.onedelhi.secure;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class qv0<T> {
    /* renamed from: d */
    public static <T> qv0<T> m26187d(int i, T t) {
        return new C3601tg(Integer.valueOf(i), t, d53.DEFAULT);
    }

    /* renamed from: e */
    public static <T> qv0<T> m26188e(T t) {
        return new C3601tg((Integer) null, t, d53.DEFAULT);
    }

    /* renamed from: f */
    public static <T> qv0<T> m26189f(int i, T t) {
        return new C3601tg(Integer.valueOf(i), t, d53.VERY_LOW);
    }

    /* renamed from: g */
    public static <T> qv0<T> m26190g(T t) {
        return new C3601tg((Integer) null, t, d53.VERY_LOW);
    }

    /* renamed from: h */
    public static <T> qv0<T> m26191h(int i, T t) {
        return new C3601tg(Integer.valueOf(i), t, d53.HIGHEST);
    }

    /* renamed from: i */
    public static <T> qv0<T> m26192i(T t) {
        return new C3601tg((Integer) null, t, d53.HIGHEST);
    }

    @ts2
    /* renamed from: a */
    public abstract Integer mo23457a();

    /* renamed from: b */
    public abstract T mo23458b();

    /* renamed from: c */
    public abstract d53 mo23459c();
}
