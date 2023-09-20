package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class uc0 {

    /* renamed from: com.onedelhi.secure.uc0$b */
    public static class C6949b {

        /* renamed from: a */
        public final a30<?> f36028a;

        /* renamed from: a */
        public final Set<C6949b> f36029a = new HashSet();

        /* renamed from: b */
        public final Set<C6949b> f36030b = new HashSet();

        public C6949b(a30<?> a30) {
            this.f36028a = a30;
        }

        /* renamed from: a */
        public void mo45549a(C6949b bVar) {
            this.f36029a.add(bVar);
        }

        /* renamed from: b */
        public void mo45550b(C6949b bVar) {
            this.f36030b.add(bVar);
        }

        /* renamed from: c */
        public a30<?> mo45551c() {
            return this.f36028a;
        }

        /* renamed from: d */
        public Set<C6949b> mo45552d() {
            return this.f36029a;
        }

        /* renamed from: e */
        public boolean mo45553e() {
            return this.f36029a.isEmpty();
        }

        /* renamed from: f */
        public boolean mo45554f() {
            return this.f36030b.isEmpty();
        }

        /* renamed from: g */
        public void mo45555g(C6949b bVar) {
            this.f36030b.remove(bVar);
        }
    }

    /* renamed from: com.onedelhi.secure.uc0$c */
    public static class C6950c {

        /* renamed from: a */
        public final z83<?> f36031a;

        /* renamed from: a */
        public final boolean f36032a;

        public C6950c(z83<?> z83, boolean z) {
            this.f36031a = z83;
            this.f36032a = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6950c)) {
                return false;
            }
            C6950c cVar = (C6950c) obj;
            return cVar.f36031a.equals(this.f36031a) && cVar.f36032a == this.f36032a;
        }

        public int hashCode() {
            return ((this.f36031a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f36032a).hashCode();
        }
    }

    /* renamed from: a */
    public static void m66932a(List<a30<?>> list) {
        Set<C6949b> c = m66934c(list);
        Set<C6949b> b = m66933b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C6949b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C6949b next2 : next.mo45552d()) {
                next2.mo45555g(next);
                if (next2.mo45554f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C6949b next3 : c) {
                if (!next3.mo45554f() && !next3.mo45553e()) {
                    arrayList.add(next3.mo45551c());
                }
            }
            throw new tj0(arrayList);
        }
    }

    /* renamed from: b */
    public static Set<C6949b> m66933b(Set<C6949b> set) {
        HashSet hashSet = new HashSet();
        for (C6949b next : set) {
            if (next.mo45554f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C6949b> m66934c(List<a30<?>> list) {
        Set<C6949b> set;
        HashMap hashMap = new HashMap(list.size());
        for (a30 next : list) {
            C6949b bVar = new C6949b(next);
            Iterator it = next.mo30426m().iterator();
            while (true) {
                if (it.hasNext()) {
                    z83 z83 = (z83) it.next();
                    C6950c cVar = new C6950c(z83, !next.mo30432v());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f36032a) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{z83}));
                    }
                }
            }
        }
        for (Set<C6949b> it2 : hashMap.values()) {
            for (C6949b bVar2 : it2) {
                for (rj0 next2 : bVar2.mo45551c().mo30423j()) {
                    if (next2.mo43916f() && (set = (Set) hashMap.get(new C6950c(next2.mo43913d(), next2.mo43918h()))) != null) {
                        for (C6949b bVar3 : set) {
                            bVar2.mo45549a(bVar3);
                            bVar3.mo45550b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
