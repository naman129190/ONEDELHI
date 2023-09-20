package com.onedelhi.secure;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class jl3 implements g30 {

    /* renamed from: a */
    public final g30 f30860a;

    /* renamed from: a */
    public final Set<z83<?>> f30861a;

    /* renamed from: b */
    public final Set<z83<?>> f30862b;

    /* renamed from: c */
    public final Set<z83<?>> f30863c;

    /* renamed from: d */
    public final Set<z83<?>> f30864d;

    /* renamed from: e */
    public final Set<z83<?>> f30865e;

    /* renamed from: f */
    public final Set<Class<?>> f30866f;

    /* renamed from: com.onedelhi.secure.jl3$a */
    public static class C5830a implements a83 {

        /* renamed from: a */
        public final a83 f30867a;

        /* renamed from: a */
        public final Set<Class<?>> f30868a;

        public C5830a(Set<Class<?>> set, a83 a83) {
            this.f30868a = set;
            this.f30867a = a83;
        }

        /* renamed from: b */
        public void mo30482b(pv0<?> pv0) {
            if (this.f30868a.contains(pv0.mo42922b())) {
                this.f30867a.mo30482b(pv0);
            } else {
                throw new uj0(String.format("Attempting to publish an undeclared event %s.", new Object[]{pv0}));
            }
        }
    }

    public jl3(a30<?> a30, g30 g30) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (rj0 next : a30.mo30423j()) {
            if (next.mo43916f()) {
                boolean h = next.mo43918h();
                z83<?> d = next.mo43913d();
                if (h) {
                    hashSet4.add(d);
                } else {
                    hashSet.add(d);
                }
            } else if (next.mo43914e()) {
                hashSet3.add(next.mo43913d());
            } else {
                boolean h2 = next.mo43918h();
                z83<?> d2 = next.mo43913d();
                if (h2) {
                    hashSet5.add(d2);
                } else {
                    hashSet2.add(d2);
                }
            }
        }
        if (!a30.mo30427n().isEmpty()) {
            hashSet.add(z83.m72650b(a83.class));
        }
        this.f30861a = Collections.unmodifiableSet(hashSet);
        this.f30862b = Collections.unmodifiableSet(hashSet2);
        this.f30863c = Collections.unmodifiableSet(hashSet3);
        this.f30864d = Collections.unmodifiableSet(hashSet4);
        this.f30865e = Collections.unmodifiableSet(hashSet5);
        this.f30866f = a30.mo30427n();
        this.f30860a = g30;
    }

    /* renamed from: a */
    public <T> b73<Set<T>> mo36545a(Class<T> cls) {
        return mo36548d(z83.m72650b(cls));
    }

    /* renamed from: b */
    public <T> T mo36546b(Class<T> cls) {
        if (this.f30861a.contains(z83.m72650b(cls))) {
            T b = this.f30860a.mo36546b(cls);
            return !cls.equals(a83.class) ? b : new C5830a(this.f30866f, (a83) b);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> T mo36547c(z83<T> z83) {
        if (this.f30861a.contains(z83)) {
            return this.f30860a.mo36547c(z83);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency %s.", new Object[]{z83}));
    }

    /* renamed from: d */
    public <T> b73<Set<T>> mo36548d(z83<T> z83) {
        if (this.f30865e.contains(z83)) {
            return this.f30860a.mo36548d(z83);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{z83}));
    }

    /* renamed from: f */
    public <T> b73<T> mo36549f(Class<T> cls) {
        return mo36550g(z83.m72650b(cls));
    }

    /* renamed from: g */
    public <T> b73<T> mo36550g(z83<T> z83) {
        if (this.f30862b.contains(z83)) {
            return this.f30860a.mo36550g(z83);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{z83}));
    }

    /* renamed from: h */
    public /* synthetic */ Set mo36551h(Class cls) {
        return f30.m47547f(this, cls);
    }

    /* renamed from: i */
    public <T> xh0<T> mo36552i(Class<T> cls) {
        return mo36554k(z83.m72650b(cls));
    }

    /* renamed from: j */
    public <T> Set<T> mo36553j(z83<T> z83) {
        if (this.f30864d.contains(z83)) {
            return this.f30860a.mo36553j(z83);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{z83}));
    }

    /* renamed from: k */
    public <T> xh0<T> mo36554k(z83<T> z83) {
        if (this.f30863c.contains(z83)) {
            return this.f30860a.mo36554k(z83);
        }
        throw new uj0(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{z83}));
    }
}
