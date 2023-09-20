package com.onedelhi.secure;

import com.onedelhi.secure.lh3;
import com.onedelhi.secure.n33;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tj2 {

    /* renamed from: a */
    public final am2 f20950a;

    /* renamed from: a */
    public final C3637a f20951a;

    /* renamed from: com.onedelhi.secure.tj2$a */
    public static class C3637a {

        /* renamed from: a */
        public final Map<Class<?>, C3638a<?>> f20952a = new HashMap();

        /* renamed from: com.onedelhi.secure.tj2$a$a */
        public static class C3638a<Model> {

            /* renamed from: a */
            public final List<rj2<Model, ?>> f20953a;

            public C3638a(List<rj2<Model, ?>> list) {
                this.f20953a = list;
            }
        }

        /* renamed from: a */
        public void mo25221a() {
            this.f20952a.clear();
        }

        @ts2
        /* renamed from: b */
        public <Model> List<rj2<Model, ?>> mo25222b(Class<Model> cls) {
            C3638a aVar = this.f20952a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f20953a;
        }

        /* renamed from: c */
        public <Model> void mo25223c(Class<Model> cls, List<rj2<Model, ?>> list) {
            if (this.f20952a.put(cls, new C3638a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public tj2(@mr2 am2 am2) {
        this.f20951a = new C3637a();
        this.f20950a = am2;
    }

    public tj2(@mr2 n33.C2922a<List<Throwable>> aVar) {
        this(new am2(aVar));
    }

    @mr2
    /* renamed from: c */
    public static <A> Class<A> m28785c(@mr2 A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo25212a(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        this.f20950a.mo13182b(cls, cls2, sj2);
        this.f20951a.mo25221a();
    }

    /* renamed from: b */
    public synchronized <Model, Data> rj2<Model, Data> mo25213b(@mr2 Class<Model> cls, @mr2 Class<Data> cls2) {
        return this.f20950a.mo13184d(cls, cls2);
    }

    @mr2
    /* renamed from: d */
    public synchronized List<Class<?>> mo25214d(@mr2 Class<?> cls) {
        return this.f20950a.mo13186g(cls);
    }

    @mr2
    /* renamed from: e */
    public <A> List<rj2<A, ?>> mo25215e(@mr2 A a) {
        List f = mo25216f(m28785c(a));
        if (!f.isEmpty()) {
            int size = f.size();
            List<rj2<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                rj2 rj2 = (rj2) f.get(i);
                if (rj2.mo13192b(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(rj2);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new lh3.C2744c(a, f);
        }
        throw new lh3.C2744c(a);
    }

    @mr2
    /* renamed from: f */
    public final synchronized <A> List<rj2<A, ?>> mo25216f(@mr2 Class<A> cls) {
        List<rj2<A, ?>> b;
        b = this.f20951a.mo25222b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f20950a.mo13185e(cls));
            this.f20951a.mo25223c(cls, b);
        }
        return b;
    }

    /* renamed from: g */
    public synchronized <Model, Data> void mo25217g(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        this.f20950a.mo13188i(cls, cls2, sj2);
        this.f20951a.mo25221a();
    }

    /* renamed from: h */
    public synchronized <Model, Data> void mo25218h(@mr2 Class<Model> cls, @mr2 Class<Data> cls2) {
        mo25220j(this.f20950a.mo13189j(cls, cls2));
        this.f20951a.mo25221a();
    }

    /* renamed from: i */
    public synchronized <Model, Data> void mo25219i(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        mo25220j(this.f20950a.mo13190k(cls, cls2, sj2));
        this.f20951a.mo25221a();
    }

    /* renamed from: j */
    public final <Model, Data> void mo25220j(@mr2 List<sj2<? extends Model, ? extends Data>> list) {
        for (sj2<? extends Model, ? extends Data> b : list) {
            b.mo14016b();
        }
    }
}
