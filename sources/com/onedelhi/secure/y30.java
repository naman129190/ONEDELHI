package com.onedelhi.secure;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class y30 implements g30, o30 {

    /* renamed from: a */
    public static final b73<Set<Object>> f37769a = v30.f36419a;

    /* renamed from: a */
    public final s30 f37770a;

    /* renamed from: a */
    public final sv0 f37771a;

    /* renamed from: a */
    public final List<b73<ComponentRegistrar>> f37772a;

    /* renamed from: a */
    public final Map<a30<?>, b73<?>> f37773a;

    /* renamed from: a */
    public final AtomicReference<Boolean> f37774a;

    /* renamed from: b */
    public final Map<z83<?>, b73<?>> f37775b;

    /* renamed from: c */
    public final Map<z83<?>, k22<?>> f37776c;

    /* renamed from: com.onedelhi.secure.y30$b */
    public static final class C7301b {

        /* renamed from: a */
        public s30 f37777a = s30.f34905a;

        /* renamed from: a */
        public final List<b73<ComponentRegistrar>> f37778a = new ArrayList();

        /* renamed from: a */
        public final Executor f37779a;

        /* renamed from: b */
        public final List<a30<?>> f37780b = new ArrayList();

        public C7301b(Executor executor) {
            this.f37779a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m71195f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @C7277xt
        /* renamed from: b */
        public C7301b mo47566b(a30<?> a30) {
            this.f37780b.add(a30);
            return this;
        }

        @C7277xt
        /* renamed from: c */
        public C7301b mo47567c(ComponentRegistrar componentRegistrar) {
            this.f37778a.add(new z30(componentRegistrar));
            return this;
        }

        @C7277xt
        /* renamed from: d */
        public C7301b mo47568d(Collection<b73<ComponentRegistrar>> collection) {
            this.f37778a.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public y30 mo47569e() {
            return new y30(this.f37779a, this.f37778a, this.f37780b, this.f37777a);
        }

        @C7277xt
        /* renamed from: g */
        public C7301b mo47570g(s30 s30) {
            this.f37777a = s30;
            return this;
        }
    }

    public y30(Executor executor, Iterable<b73<ComponentRegistrar>> iterable, Collection<a30<?>> collection, s30 s30) {
        this.f37773a = new HashMap();
        this.f37775b = new HashMap();
        this.f37776c = new HashMap();
        this.f37774a = new AtomicReference<>();
        sv0 sv0 = new sv0(executor);
        this.f37771a = sv0;
        this.f37770a = s30;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a30.m36006D(sv0, sv0.class, n64.class, a83.class));
        arrayList.add(a30.m36006D(this, o30.class, new Class[0]));
        for (a30 next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f37772a = m71169v(iterable);
        mo47561q(arrayList);
    }

    @Deprecated
    public y30(Executor executor, Iterable<ComponentRegistrar> iterable, a30<?>... a30Arr) {
        this(executor, m71163E(iterable), Arrays.asList(a30Arr), s30.f34905a);
    }

    /* renamed from: E */
    public static Iterable<b73<ComponentRegistrar>> m71163E(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ComponentRegistrar t30 : iterable) {
            arrayList.add(new t30(t30));
        }
        return arrayList;
    }

    /* renamed from: p */
    public static C7301b m71168p(Executor executor) {
        return new C7301b(executor);
    }

    /* renamed from: v */
    public static <T> List<T> m71169v(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Object m71170w(a30 a30) {
        return a30.mo30424k().mo32374a(new jl3(a30, this));
    }

    /* renamed from: z */
    public static /* synthetic */ ComponentRegistrar m71173z(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* renamed from: A */
    public final void mo47557A() {
        Boolean bool = this.f37774a.get();
        if (bool != null) {
            mo47562r(this.f37773a, bool.booleanValue());
        }
    }

    /* renamed from: B */
    public final void mo47558B() {
        Map map;
        z83<?> d;
        Object e;
        for (a30 next : this.f37773a.keySet()) {
            Iterator<rj0> it = next.mo30423j().iterator();
            while (true) {
                if (it.hasNext()) {
                    rj0 next2 = it.next();
                    if (next2.mo43918h() && !this.f37776c.containsKey(next2.mo43913d())) {
                        map = this.f37776c;
                        d = next2.mo43913d();
                        e = k22.m54018b(Collections.emptySet());
                    } else if (this.f37775b.containsKey(next2.mo43913d())) {
                        continue;
                    } else if (next2.mo43917g()) {
                        throw new ij2(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo43913d()}));
                    } else if (!next2.mo43918h()) {
                        map = this.f37775b;
                        d = next2.mo43913d();
                        e = xw2.m70894e();
                    }
                    map.put(d, e);
                }
            }
        }
    }

    /* renamed from: C */
    public final List<Runnable> mo47559C(List<a30<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (a30 next : list) {
            if (next.mo30432v()) {
                b73 b73 = this.f37773a.get(next);
                for (z83 z83 : next.mo30426m()) {
                    if (!this.f37775b.containsKey(z83)) {
                        this.f37775b.put(z83, b73);
                    } else {
                        arrayList.add(new x30((xw2) this.f37775b.get(z83), b73));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public final List<Runnable> mo47560D() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f37773a.entrySet()) {
            a30 a30 = (a30) next.getKey();
            if (!a30.mo30432v()) {
                b73 b73 = (b73) next.getValue();
                for (z83 z83 : a30.mo30426m()) {
                    if (!hashMap.containsKey(z83)) {
                        hashMap.put(z83, new HashSet());
                    }
                    ((Set) hashMap.get(z83)).add(b73);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f37776c.containsKey(entry.getKey())) {
                this.f37776c.put((z83) entry.getKey(), k22.m54018b((Collection) entry.getValue()));
            } else {
                k22 k22 = this.f37776c.get(entry.getKey());
                for (b73 w30 : (Set) entry.getValue()) {
                    arrayList.add(new w30(k22, w30));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ b73 mo36545a(Class cls) {
        return f30.m47548g(this, cls);
    }

    /* renamed from: b */
    public /* synthetic */ Object mo36546b(Class cls) {
        return f30.m47543b(this, cls);
    }

    /* renamed from: c */
    public /* synthetic */ Object mo36547c(z83 z83) {
        return f30.m47542a(this, z83);
    }

    /* renamed from: d */
    public synchronized <T> b73<Set<T>> mo36548d(z83<T> z83) {
        k22 k22 = this.f37776c.get(z83);
        if (k22 != null) {
            return k22;
        }
        return f37769a;
    }

    /* renamed from: e */
    public void mo41514e() {
        synchronized (this) {
            if (!this.f37772a.isEmpty()) {
                mo47561q(new ArrayList());
            }
        }
    }

    /* renamed from: f */
    public /* synthetic */ b73 mo36549f(Class cls) {
        return f30.m47545d(this, cls);
    }

    /* renamed from: g */
    public synchronized <T> b73<T> mo36550g(z83<T> z83) {
        i43.m51839c(z83, "Null interface requested.");
        return this.f37775b.get(z83);
    }

    /* renamed from: h */
    public /* synthetic */ Set mo36551h(Class cls) {
        return f30.m47547f(this, cls);
    }

    /* renamed from: i */
    public /* synthetic */ xh0 mo36552i(Class cls) {
        return f30.m47544c(this, cls);
    }

    /* renamed from: j */
    public /* synthetic */ Set mo36553j(z83 z83) {
        return f30.m47546e(this, z83);
    }

    /* renamed from: k */
    public <T> xh0<T> mo36554k(z83<T> z83) {
        b73<T> g = mo36550g(z83);
        return g == null ? xw2.m70894e() : g instanceof xw2 ? (xw2) g : xw2.m70898i(g);
    }

    /* renamed from: q */
    public final void mo47561q(List<a30<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<b73<ComponentRegistrar>> it = this.f37772a.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f37770a.mo43099a(componentRegistrar));
                        it.remove();
                    }
                } catch (ot1 e) {
                    it.remove();
                    Log.w(m30.f31981a, "Invalid component registrar.", e);
                }
            }
            if (this.f37773a.isEmpty()) {
                uc0.m66932a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f37773a.keySet());
                arrayList2.addAll(list);
                uc0.m66932a(arrayList2);
            }
            for (a30 next : list) {
                this.f37773a.put(next, new u12(new u30(this, next)));
            }
            arrayList.addAll(mo47559C(list));
            arrayList.addAll(mo47560D());
            mo47558B();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        mo47557A();
    }

    /* renamed from: r */
    public final void mo47562r(Map<a30<?>, b73<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            a30 a30 = (a30) next.getKey();
            b73 b73 = (b73) next.getValue();
            if (a30.mo30428s() || (a30.mo30429t() && z)) {
                b73.get();
            }
        }
        this.f37771a.mo44553f();
    }

    @hw4
    /* renamed from: s */
    public Collection<a30<?>> mo47563s() {
        return this.f37773a.keySet();
    }

    @hw4
    @hl3({hl3.C2354a.TESTS})
    /* renamed from: t */
    public void mo47564t() {
        for (b73<?> b73 : this.f37773a.values()) {
            b73.get();
        }
    }

    /* renamed from: u */
    public void mo47565u(boolean z) {
        HashMap hashMap;
        if (this.f37774a.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f37773a);
            }
            mo47562r(hashMap, z);
        }
    }
}
