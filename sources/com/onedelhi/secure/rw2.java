package com.onedelhi.secure;

import java.util.NoSuchElementException;
import java.util.Objects;

public final class rw2<T> {

    /* renamed from: a */
    public final T f34761a;

    public rw2() {
        this.f34761a = null;
    }

    public rw2(T t) {
        Objects.requireNonNull(t, "value for optional is empty.");
        this.f34761a = t;
    }

    /* renamed from: a */
    public static <T> rw2<T> m63941a() {
        return new rw2<>();
    }

    /* renamed from: b */
    public static <T> rw2<T> m63942b(T t) {
        return t == null ? m63941a() : m63943e(t);
    }

    /* renamed from: e */
    public static <T> rw2<T> m63943e(T t) {
        return new rw2<>(t);
    }

    /* renamed from: c */
    public T mo44067c() {
        T t = this.f34761a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean mo44068d() {
        return this.f34761a != null;
    }
}
