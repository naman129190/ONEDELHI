package com.onedelhi.secure;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class jb2 implements C3131pa {

    /* renamed from: d */
    public static final int f14054d = 4194304;
    @hw4

    /* renamed from: e */
    public static final int f14055e = 8;

    /* renamed from: f */
    public static final int f14056f = 2;

    /* renamed from: a */
    public final C2485b f14057a;

    /* renamed from: a */
    public final yi1<C2484a, Object> f14058a;

    /* renamed from: a */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f14059a;

    /* renamed from: b */
    public final int f14060b;

    /* renamed from: b */
    public final Map<Class<?>, C3769v9<?>> f14061b;

    /* renamed from: c */
    public int f14062c;

    /* renamed from: com.onedelhi.secure.jb2$a */
    public static final class C2484a implements k33 {

        /* renamed from: a */
        public int f14063a;

        /* renamed from: a */
        public final C2485b f14064a;

        /* renamed from: a */
        public Class<?> f14065a;

        public C2484a(C2485b bVar) {
            this.f14064a = bVar;
        }

        /* renamed from: a */
        public void mo14602a() {
            this.f14064a.mo19086c(this);
        }

        /* renamed from: b */
        public void mo18231b(int i, Class<?> cls) {
            this.f14063a = i;
            this.f14065a = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2484a)) {
                return false;
            }
            C2484a aVar = (C2484a) obj;
            return this.f14063a == aVar.f14063a && this.f14065a == aVar.f14065a;
        }

        public int hashCode() {
            int i = this.f14063a * 31;
            Class<?> cls = this.f14065a;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f14063a + "array=" + this.f14065a + '}';
        }
    }

    /* renamed from: com.onedelhi.secure.jb2$b */
    public static final class C2485b extends C2634kj<C2484a> {
        /* renamed from: d */
        public C2484a mo14607a() {
            return new C2484a(this);
        }

        /* renamed from: e */
        public C2484a mo18236e(int i, Class<?> cls) {
            C2484a aVar = (C2484a) mo19085b();
            aVar.mo18231b(i, cls);
            return aVar;
        }
    }

    @hw4
    public jb2() {
        this.f14058a = new yi1<>();
        this.f14057a = new C2485b();
        this.f14059a = new HashMap();
        this.f14061b = new HashMap();
        this.f14060b = 4194304;
    }

    public jb2(int i) {
        this.f14058a = new yi1<>();
        this.f14057a = new C2485b();
        this.f14059a = new HashMap();
        this.f14061b = new HashMap();
        this.f14060b = i;
    }

    /* renamed from: a */
    public synchronized void mo18213a(int i) {
        if (i >= 40) {
            try {
                mo18214b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo18221i(this.f14060b / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo18214b() {
        mo18221i(0);
    }

    @Deprecated
    /* renamed from: c */
    public <T> void mo18215c(T t, Class<T> cls) {
        mo18218f(t);
    }

    /* renamed from: d */
    public synchronized <T> T mo18216d(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = mo18227o(cls).ceilingKey(Integer.valueOf(i));
        return mo18226n(mo18230r(i, ceilingKey) ? this.f14057a.mo18236e(ceilingKey.intValue(), cls) : this.f14057a.mo18236e(i, cls), cls);
    }

    /* renamed from: e */
    public synchronized <T> T mo18217e(int i, Class<T> cls) {
        return mo18226n(this.f14057a.mo18236e(i, cls), cls);
    }

    /* renamed from: f */
    public synchronized <T> void mo18218f(T t) {
        Class<?> cls = t.getClass();
        C3769v9<?> k = mo18223k(cls);
        int a = k.mo19750a(t);
        int b = k.mo19751b() * a;
        if (mo18229q(b)) {
            C2484a e = this.f14057a.mo18236e(a, cls);
            this.f14058a.mo27503d(e, t);
            NavigableMap<Integer, Integer> o = mo18227o(cls);
            Integer num = (Integer) o.get(Integer.valueOf(e.f14063a));
            Integer valueOf = Integer.valueOf(e.f14063a);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            o.put(valueOf, Integer.valueOf(i));
            this.f14062c += b;
            mo18220h();
        }
    }

    /* renamed from: g */
    public final void mo18219g(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> o = mo18227o(cls);
        Integer num = (Integer) o.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                o.remove(valueOf);
            } else {
                o.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
    }

    /* renamed from: h */
    public final void mo18220h() {
        mo18221i(this.f14060b);
    }

    /* renamed from: i */
    public final void mo18221i(int i) {
        while (this.f14062c > i) {
            Object f = this.f14058a.mo27504f();
            g43.m15509d(f);
            C3769v9 j = mo18222j(f);
            this.f14062c -= j.mo19750a(f) * j.mo19751b();
            mo18219g(j.mo19750a(f), f.getClass());
            if (Log.isLoggable(j.mo19749O(), 2)) {
                Log.v(j.mo19749O(), "evicted: " + j.mo19750a(f));
            }
        }
    }

    /* renamed from: j */
    public final <T> C3769v9<T> mo18222j(T t) {
        return mo18223k(t.getClass());
    }

    /* renamed from: k */
    public final <T> C3769v9<T> mo18223k(Class<T> cls) {
        C3769v9<T> v9Var = this.f14061b.get(cls);
        if (v9Var == null) {
            if (cls.equals(int[].class)) {
                v9Var = new ms1();
            } else if (cls.equals(byte[].class)) {
                v9Var = new C2771lq();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f14061b.put(cls, v9Var);
        }
        return v9Var;
    }

    @ts2
    /* renamed from: l */
    public final <T> T mo18224l(C2484a aVar) {
        return this.f14058a.mo27500a(aVar);
    }

    /* renamed from: m */
    public int mo18225m() {
        int i = 0;
        for (Class next : this.f14059a.keySet()) {
            for (Integer num : this.f14059a.get(next).keySet()) {
                i += num.intValue() * ((Integer) this.f14059a.get(next).get(num)).intValue() * mo18223k(next).mo19751b();
            }
        }
        return i;
    }

    /* renamed from: n */
    public final <T> T mo18226n(C2484a aVar, Class<T> cls) {
        C3769v9<T> k = mo18223k(cls);
        T l = mo18224l(aVar);
        if (l != null) {
            this.f14062c -= k.mo19750a(l) * k.mo19751b();
            mo18219g(k.mo19750a(l), cls);
        }
        if (l != null) {
            return l;
        }
        if (Log.isLoggable(k.mo19749O(), 2)) {
            Log.v(k.mo19749O(), "Allocated " + aVar.f14063a + " bytes");
        }
        return k.mo19752c(aVar.f14063a);
    }

    /* renamed from: o */
    public final NavigableMap<Integer, Integer> mo18227o(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f14059a.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14059a.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: p */
    public final boolean mo18228p() {
        int i = this.f14062c;
        return i == 0 || this.f14060b / i >= 2;
    }

    /* renamed from: q */
    public final boolean mo18229q(int i) {
        return i <= this.f14060b / 2;
    }

    /* renamed from: r */
    public final boolean mo18230r(int i, Integer num) {
        return num != null && (mo18228p() || num.intValue() <= i * 8);
    }
}
