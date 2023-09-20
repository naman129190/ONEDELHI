package com.onedelhi.secure;

public final class fo0<T> implements a73<T>, x12<T> {

    /* renamed from: a */
    public static final /* synthetic */ boolean f12235a = false;

    /* renamed from: b */
    public static final Object f12236b = new Object();

    /* renamed from: a */
    public volatile a73<T> f12237a;

    /* renamed from: a */
    public volatile Object f12238a = f12236b;

    public fo0(a73<T> a73) {
        this.f12237a = a73;
    }

    /* renamed from: a */
    public static <P extends a73<T>, T> x12<T> m15137a(P p) {
        return p instanceof x12 ? (x12) p : new fo0((a73) h43.m16475b(p));
    }

    /* renamed from: b */
    public static <P extends a73<T>, T> a73<T> m15138b(P p) {
        h43.m16475b(p);
        return p instanceof fo0 ? p : new fo0(p);
    }

    /* renamed from: c */
    public static Object m15139c(Object obj, Object obj2) {
        if (!(obj != f12236b && !(obj instanceof qg2)) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f12238a;
        T t2 = f12236b;
        if (t == t2) {
            synchronized (this) {
                t = this.f12238a;
                if (t == t2) {
                    t = this.f12237a.get();
                    this.f12238a = m15139c(this.f12238a, t);
                    this.f12237a = null;
                }
            }
        }
        return t;
    }
}
