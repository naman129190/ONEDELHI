package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class k22<T> implements b73<Set<T>> {

    /* renamed from: a */
    public volatile Set<b73<T>> f31084a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public volatile Set<T> f31085b = null;

    public k22(Collection<b73<T>> collection) {
        this.f31084a.addAll(collection);
    }

    /* renamed from: b */
    public static k22<?> m54018b(Collection<b73<?>> collection) {
        return new k22<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void mo39016a(b73<T> b73) {
        Set set;
        T t;
        if (this.f31085b == null) {
            set = this.f31084a;
            t = b73;
        } else {
            set = this.f31085b;
            t = b73.get();
        }
        set.add(t);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f31085b == null) {
            synchronized (this) {
                if (this.f31085b == null) {
                    this.f31085b = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo39018d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f31085b);
    }

    /* renamed from: d */
    public final synchronized void mo39018d() {
        for (b73<T> b73 : this.f31084a) {
            this.f31085b.add(b73.get());
        }
        this.f31084a = null;
    }
}
