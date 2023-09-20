package com.onedelhi.secure;

public final class iz3<T> implements a73<T> {

    /* renamed from: a */
    public static final /* synthetic */ boolean f13962a = false;

    /* renamed from: b */
    public static final Object f13963b = new Object();

    /* renamed from: a */
    public volatile a73<T> f13964a;

    /* renamed from: a */
    public volatile Object f13965a = f13963b;

    public iz3(a73<T> a73) {
        this.f13964a = a73;
    }

    /* renamed from: a */
    public static <P extends a73<T>, T> a73<T> m18054a(P p) {
        return ((p instanceof iz3) || (p instanceof fo0)) ? p : new iz3((a73) h43.m16475b(p));
    }

    public T get() {
        T t = this.f13965a;
        if (t != f13963b) {
            return t;
        }
        a73<T> a73 = this.f13964a;
        if (a73 == null) {
            return this.f13965a;
        }
        T t2 = a73.get();
        this.f13965a = t2;
        this.f13964a = null;
        return t2;
    }
}
