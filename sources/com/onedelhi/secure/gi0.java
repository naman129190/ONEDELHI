package com.onedelhi.secure;

public final class gi0<T> implements kz0<T> {

    /* renamed from: a */
    public a73<T> f29200a;

    /* renamed from: b */
    public static <T> void m49502b(a73<T> a73, a73<T> a732) {
        j43.m52914b(a732);
        gi0 gi0 = (gi0) a73;
        if (gi0.f29200a == null) {
            gi0.f29200a = a732;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public a73<T> mo36743a() {
        return (a73) j43.m52914b(this.f29200a);
    }

    @Deprecated
    /* renamed from: c */
    public void mo36744c(a73<T> a73) {
        m49502b(this, a73);
    }

    public T get() {
        a73<T> a73 = this.f29200a;
        if (a73 != null) {
            return a73.get();
        }
        throw new IllegalStateException();
    }
}
