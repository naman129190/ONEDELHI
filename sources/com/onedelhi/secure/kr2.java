package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.C6723rz;
import com.onedelhi.secure.a33;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class kr2<T extends C6723rz> implements C6088m4<T> {

    /* renamed from: a */
    public static final int f31407a = 100;

    /* renamed from: a */
    public static final q14 f31408a = new q14(1.0d);

    /* renamed from: a */
    public final a33<C5935b<T>> f31409a = new a33(0.0d, 1.0d, 0.0d, 1.0d);

    /* renamed from: a */
    public final Collection<C5935b<T>> f31410a = new ArrayList();

    /* renamed from: com.onedelhi.secure.kr2$b */
    public static class C5935b<T extends C6723rz> implements a33.C4471a, C6622qz<T> {

        /* renamed from: a */
        public final LatLng f31411a;

        /* renamed from: a */
        public final T f31412a;

        /* renamed from: a */
        public final v23 f31413a;

        /* renamed from: a */
        public Set<T> f31414a;

        public C5935b(T t) {
            this.f31412a = t;
            LatLng a = t.mo44116a();
            this.f31411a = a;
            this.f31413a = kr2.f31408a.mo43081b(a);
            this.f31414a = Collections.singleton(t);
        }

        /* renamed from: a */
        public LatLng mo39427a() {
            return this.f31411a;
        }

        /* renamed from: c */
        public int mo39429c() {
            return 1;
        }

        /* renamed from: d */
        public v23 mo30451d() {
            return this.f31413a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5935b)) {
                return false;
            }
            return ((C5935b) obj).f31412a.equals(this.f31412a);
        }

        /* renamed from: f */
        public Set<T> mo39428b() {
            return this.f31414a;
        }

        public int hashCode() {
            return this.f31412a.hashCode();
        }
    }

    /* renamed from: b */
    public Collection<T> mo39419b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f31409a) {
            for (C5935b<T> e : this.f31410a) {
                arrayList.add(e.f31412a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo39420c(T t) {
        C5935b bVar = new C5935b(t);
        synchronized (this.f31409a) {
            this.f31410a.add(bVar);
            this.f31409a.mo30443a(bVar);
        }
    }

    /* renamed from: d */
    public void mo39421d(T t) {
        C5935b bVar = new C5935b(t);
        synchronized (this.f31409a) {
            this.f31410a.remove(bVar);
            this.f31409a.mo30447e(bVar);
        }
    }

    /* renamed from: e */
    public void mo39422e() {
        synchronized (this.f31409a) {
            this.f31410a.clear();
            this.f31409a.mo30444b();
        }
    }

    /* renamed from: f */
    public Set<? extends C6622qz<T>> mo39423f(double d) {
        double pow = (100.0d / Math.pow(2.0d, (double) ((int) d))) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f31409a) {
            for (C5935b next : this.f31410a) {
                if (!hashSet.contains(next)) {
                    Collection<C5935b<T>> f = this.f31409a.mo30448f(mo39425h(next.mo30451d(), pow));
                    if (f.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        m34 m34 = new m34(next.f31412a.mo44116a());
                        hashSet2.add(m34);
                        for (C5935b next2 : f) {
                            Double d2 = (Double) hashMap.get(next2);
                            double d3 = pow;
                            double i = mo39426i(next2.mo30451d(), next.mo30451d());
                            if (d2 != null) {
                                if (d2.doubleValue() < i) {
                                    pow = d3;
                                } else {
                                    ((m34) hashMap2.get(next2)).mo40477e(next2.f31412a);
                                }
                            }
                            hashMap.put(next2, Double.valueOf(i));
                            m34.mo40476d(next2.f31412a);
                            hashMap2.put(next2, m34);
                            pow = d3;
                        }
                        hashSet.addAll(f);
                        pow = pow;
                    }
                }
            }
        }
        return hashSet2;
    }

    /* renamed from: g */
    public void mo39424g(Collection<T> collection) {
        for (T c : collection) {
            mo39420c(c);
        }
    }

    /* renamed from: h */
    public final C7273xn mo39425h(v23 v23, double d) {
        double d2 = d / 2.0d;
        double d3 = v23.f36408a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = v23.f36409b;
        return new C7273xn(d4, d5, d6 - d2, d6 + d2);
    }

    /* renamed from: i */
    public final double mo39426i(v23 v23, v23 v232) {
        double d = v23.f36408a;
        double d2 = v232.f36408a;
        double d3 = (d - d2) * (d - d2);
        double d4 = v23.f36409b;
        double d5 = v232.f36409b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }
}
