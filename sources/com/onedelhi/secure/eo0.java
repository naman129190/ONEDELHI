package com.onedelhi.secure;

public final class eo0<T> implements a73<T>, v12<T> {

    /* renamed from: a */
    public static final /* synthetic */ boolean f28018a = false;

    /* renamed from: b */
    public static final Object f28019b = new Object();

    /* renamed from: a */
    public volatile a73<T> f28020a;

    /* renamed from: a */
    public volatile Object f28021a = f28019b;

    public eo0(a73<T> a73) {
        this.f28020a = a73;
    }

    /* renamed from: a */
    public static <P extends a73<T>, T> v12<T> m47071a(P p) {
        return p instanceof v12 ? (v12) p : new eo0((a73) j43.m52914b(p));
    }

    /* renamed from: b */
    public static <P extends a73<T>, T> a73<T> m47072b(P p) {
        j43.m52914b(p);
        return p instanceof eo0 ? p : new eo0(p);
    }

    /* renamed from: c */
    public static Object m47073c(Object obj, Object obj2) {
        if (!(obj != f28019b && !(obj instanceof pg2)) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f28021a;
        T t2 = f28019b;
        if (t == t2) {
            synchronized (this) {
                t = this.f28021a;
                if (t == t2) {
                    t = this.f28020a.get();
                    this.f28021a = m47073c(this.f28021a, t);
                    this.f28020a = null;
                }
            }
        }
        return t;
    }
}
