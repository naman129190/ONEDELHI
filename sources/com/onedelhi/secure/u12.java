package com.onedelhi.secure;

public class u12<T> implements b73<T> {

    /* renamed from: b */
    public static final Object f35930b = new Object();

    /* renamed from: a */
    public volatile b73<T> f35931a;

    /* renamed from: a */
    public volatile Object f35932a = f35930b;

    public u12(b73<T> b73) {
        this.f35931a = b73;
    }

    public u12(T t) {
        this.f35932a = t;
    }

    @hw4
    /* renamed from: a */
    public boolean mo45362a() {
        return this.f35932a != f35930b;
    }

    public T get() {
        T t = this.f35932a;
        T t2 = f35930b;
        if (t == t2) {
            synchronized (this) {
                t = this.f35932a;
                if (t == t2) {
                    t = this.f35931a.get();
                    this.f35932a = t;
                    this.f35931a = null;
                }
            }
        }
        return t;
    }
}
