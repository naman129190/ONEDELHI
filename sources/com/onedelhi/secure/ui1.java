package com.onedelhi.secure;

import com.onedelhi.secure.C6723rz;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ui1<T extends C6723rz> implements C6088m4<T> {

    /* renamed from: a */
    public static final int f36137a = 100;

    /* renamed from: a */
    public final Set<T> f36138a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public static long m67047a(long j, double d, double d2) {
        return (long) ((((double) j) * Math.floor(d)) + Math.floor(d2));
    }

    /* renamed from: b */
    public Collection<T> mo39419b() {
        return this.f36138a;
    }

    /* renamed from: c */
    public void mo39420c(T t) {
        this.f36138a.add(t);
    }

    /* renamed from: d */
    public void mo39421d(T t) {
        this.f36138a.remove(t);
    }

    /* renamed from: e */
    public void mo39422e() {
        this.f36138a.clear();
    }

    /* renamed from: f */
    public Set<? extends C6622qz<T>> mo39423f(double d) {
        long j;
        long ceil = (long) Math.ceil((Math.pow(2.0d, d) * 256.0d) / 100.0d);
        q14 q14 = new q14((double) ceil);
        HashSet hashSet = new HashSet();
        ga2 ga2 = new ga2();
        synchronized (this.f36138a) {
            for (T t : this.f36138a) {
                u23 b = q14.mo43081b(t.mo44116a());
                long a = m67047a(ceil, b.f36408a, b.f36409b);
                m34 m34 = (m34) ga2.mo16417h(a);
                if (m34 == null) {
                    j = ceil;
                    m34 = new m34(q14.mo43080a(new v23(Math.floor(b.f36408a) + 0.5d, Math.floor(b.f36409b) + 0.5d)));
                    ga2.mo16423n(a, m34);
                    hashSet.add(m34);
                } else {
                    j = ceil;
                }
                m34.mo40476d(t);
                ceil = j;
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    public void mo39424g(Collection<T> collection) {
        this.f36138a.addAll(collection);
    }
}
