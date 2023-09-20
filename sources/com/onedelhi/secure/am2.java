package com.onedelhi.secure;

import com.onedelhi.secure.lh3;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.rj2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class am2 {

    /* renamed from: a */
    public static final rj2<Object, Object> f9406a = new C1720a();

    /* renamed from: b */
    public static final C1722c f9407b = new C1722c();

    /* renamed from: a */
    public final C1722c f9408a;

    /* renamed from: a */
    public final n33.C2922a<List<Throwable>> f9409a;

    /* renamed from: a */
    public final List<C1721b<?, ?>> f9410a;

    /* renamed from: a */
    public final Set<C1721b<?, ?>> f9411a;

    /* renamed from: com.onedelhi.secure.am2$a */
    public static class C1720a implements rj2<Object, Object> {
        @ts2
        /* renamed from: a */
        public rj2.C3418a<Object> mo13191a(@mr2 Object obj, int i, int i2, @mr2 zw2 zw2) {
            return null;
        }

        /* renamed from: b */
        public boolean mo13192b(@mr2 Object obj) {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.am2$b */
    public static class C1721b<Model, Data> {

        /* renamed from: a */
        public final sj2<? extends Model, ? extends Data> f9412a;

        /* renamed from: a */
        public final Class<Model> f9413a;

        /* renamed from: b */
        public final Class<Data> f9414b;

        public C1721b(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
            this.f9413a = cls;
            this.f9414b = cls2;
            this.f9412a = sj2;
        }

        /* renamed from: a */
        public boolean mo13193a(@mr2 Class<?> cls) {
            return this.f9413a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo13194b(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
            return mo13193a(cls) && this.f9414b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.onedelhi.secure.am2$c */
    public static class C1722c {
        @mr2
        /* renamed from: a */
        public <Model, Data> zl2<Model, Data> mo13195a(@mr2 List<rj2<Model, Data>> list, @mr2 n33.C2922a<List<Throwable>> aVar) {
            return new zl2<>(list, aVar);
        }
    }

    public am2(@mr2 n33.C2922a<List<Throwable>> aVar) {
        this(aVar, f9407b);
    }

    @hw4
    public am2(@mr2 n33.C2922a<List<Throwable>> aVar, @mr2 C1722c cVar) {
        this.f9410a = new ArrayList();
        this.f9411a = new HashSet();
        this.f9409a = aVar;
        this.f9408a = cVar;
    }

    @mr2
    /* renamed from: f */
    public static <Model, Data> rj2<Model, Data> m11294f() {
        return f9406a;
    }

    /* renamed from: a */
    public final <Model, Data> void mo13181a(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2, boolean z) {
        C1721b bVar = new C1721b(cls, cls2, sj2);
        List<C1721b<?, ?>> list = this.f9410a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo13182b(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        mo13181a(cls, cls2, sj2, true);
    }

    @mr2
    /* renamed from: c */
    public final <Model, Data> rj2<Model, Data> mo13183c(@mr2 C1721b<?, ?> bVar) {
        return (rj2) g43.m15509d(bVar.f9412a.mo14017c(this));
    }

    @mr2
    /* renamed from: d */
    public synchronized <Model, Data> rj2<Model, Data> mo13184d(@mr2 Class<Model> cls, @mr2 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1721b next : this.f9410a) {
                if (this.f9411a.contains(next)) {
                    z = true;
                } else if (next.mo13194b(cls, cls2)) {
                    this.f9411a.add(next);
                    arrayList.add(mo13183c(next));
                    this.f9411a.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f9408a.mo13195a(arrayList, this.f9409a);
            } else if (arrayList.size() == 1) {
                return (rj2) arrayList.get(0);
            } else if (z) {
                return m11294f();
            } else {
                throw new lh3.C2744c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f9411a.clear();
            throw th;
        }
    }

    @mr2
    /* renamed from: e */
    public synchronized <Model> List<rj2<Model, ?>> mo13185e(@mr2 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1721b next : this.f9410a) {
                if (!this.f9411a.contains(next)) {
                    if (next.mo13193a(cls)) {
                        this.f9411a.add(next);
                        arrayList.add(mo13183c(next));
                        this.f9411a.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f9411a.clear();
            throw th;
        }
        return arrayList;
    }

    @mr2
    /* renamed from: g */
    public synchronized List<Class<?>> mo13186g(@mr2 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1721b next : this.f9410a) {
            if (!arrayList.contains(next.f9414b) && next.mo13193a(cls)) {
                arrayList.add(next.f9414b);
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: h */
    public final <Model, Data> sj2<Model, Data> mo13187h(@mr2 C1721b<?, ?> bVar) {
        return bVar.f9412a;
    }

    /* renamed from: i */
    public synchronized <Model, Data> void mo13188i(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        mo13181a(cls, cls2, sj2, false);
    }

    @mr2
    /* renamed from: j */
    public synchronized <Model, Data> List<sj2<? extends Model, ? extends Data>> mo13189j(@mr2 Class<Model> cls, @mr2 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C1721b<?, ?>> it = this.f9410a.iterator();
        while (it.hasNext()) {
            C1721b next = it.next();
            if (next.mo13194b(cls, cls2)) {
                it.remove();
                arrayList.add(mo13187h(next));
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: k */
    public synchronized <Model, Data> List<sj2<? extends Model, ? extends Data>> mo13190k(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        List<sj2<? extends Model, ? extends Data>> j;
        j = mo13189j(cls, cls2);
        mo13182b(cls, cls2, sj2);
        return j;
    }
}
