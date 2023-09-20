package com.onedelhi.secure;

public final class hz3<T> implements a73<T> {

    /* renamed from: a */
    public static final /* synthetic */ boolean f29983a = false;

    /* renamed from: b */
    public static final Object f29984b = new Object();

    /* renamed from: a */
    public volatile a73<T> f29985a;

    /* renamed from: a */
    public volatile Object f29986a = f29984b;

    public hz3(a73<T> a73) {
        this.f29985a = a73;
    }

    /* renamed from: a */
    public static <P extends a73<T>, T> a73<T> m51316a(P p) {
        return ((p instanceof hz3) || (p instanceof eo0)) ? p : new hz3((a73) j43.m52914b(p));
    }

    public T get() {
        T t = this.f29986a;
        if (t != f29984b) {
            return t;
        }
        a73<T> a73 = this.f29985a;
        if (a73 == null) {
            return this.f29986a;
        }
        T t2 = a73.get();
        this.f29986a = t2;
        this.f29985a = null;
        return t2;
    }
}
