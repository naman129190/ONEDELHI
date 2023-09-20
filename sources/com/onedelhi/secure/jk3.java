package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jk3 {

    /* renamed from: a */
    public final List<String> f14210a = new ArrayList();

    /* renamed from: a */
    public final Map<String, List<C2525a<?, ?>>> f14211a = new HashMap();

    /* renamed from: com.onedelhi.secure.jk3$a */
    public static class C2525a<T, R> {

        /* renamed from: a */
        public final ik3<T, R> f14212a;

        /* renamed from: a */
        public final Class<T> f14213a;

        /* renamed from: b */
        public final Class<R> f14214b;

        public C2525a(@mr2 Class<T> cls, @mr2 Class<R> cls2, ik3<T, R> ik3) {
            this.f14213a = cls;
            this.f14214b = cls2;
            this.f14212a = ik3;
        }

        /* renamed from: a */
        public boolean mo18464a(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
            return this.f14213a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f14214b);
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void mo18458a(@mr2 String str, @mr2 ik3<T, R> ik3, @mr2 Class<T> cls, @mr2 Class<R> cls2) {
        mo18460c(str).add(new C2525a(cls, cls2, ik3));
    }

    @mr2
    /* renamed from: b */
    public synchronized <T, R> List<ik3<T, R>> mo18459b(@mr2 Class<T> cls, @mr2 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14210a) {
            List<C2525a> list = this.f14211a.get(str);
            if (list != null) {
                for (C2525a aVar : list) {
                    if (aVar.mo18464a(cls, cls2)) {
                        arrayList.add(aVar.f14212a);
                    }
                }
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: c */
    public final synchronized List<C2525a<?, ?>> mo18460c(@mr2 String str) {
        List<C2525a<?, ?>> list;
        if (!this.f14210a.contains(str)) {
            this.f14210a.add(str);
        }
        list = this.f14211a.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f14211a.put(str, list);
        }
        return list;
    }

    @mr2
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo18461d(@mr2 Class<T> cls, @mr2 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14210a) {
            List<C2525a> list = this.f14211a.get(str);
            if (list != null) {
                for (C2525a aVar : list) {
                    if (aVar.mo18464a(cls, cls2) && !arrayList.contains(aVar.f14214b)) {
                        arrayList.add(aVar.f14214b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized <T, R> void mo18462e(@mr2 String str, @mr2 ik3<T, R> ik3, @mr2 Class<T> cls, @mr2 Class<R> cls2) {
        mo18460c(str).add(0, new C2525a(cls, cls2, ik3));
    }

    /* renamed from: f */
    public synchronized void mo18463f(@mr2 List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f14210a);
        this.f14210a.clear();
        for (String add : list) {
            this.f14210a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f14210a.add(str);
            }
        }
    }
}
