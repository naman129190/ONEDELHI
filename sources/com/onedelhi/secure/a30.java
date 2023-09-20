package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a30<T> {

    /* renamed from: a */
    public final int f25728a;

    /* renamed from: a */
    public final n30<T> f25729a;

    /* renamed from: a */
    public final String f25730a;

    /* renamed from: a */
    public final Set<z83<? super T>> f25731a;

    /* renamed from: b */
    public final int f25732b;

    /* renamed from: b */
    public final Set<rj0> f25733b;

    /* renamed from: c */
    public final Set<Class<?>> f25734c;

    /* renamed from: com.onedelhi.secure.a30$b */
    public static class C4470b<T> {

        /* renamed from: a */
        public int f25735a;

        /* renamed from: a */
        public n30<T> f25736a;

        /* renamed from: a */
        public String f25737a;

        /* renamed from: a */
        public final Set<z83<? super T>> f25738a;

        /* renamed from: b */
        public int f25739b;

        /* renamed from: b */
        public final Set<rj0> f25740b;

        /* renamed from: c */
        public final Set<Class<?>> f25741c;

        @SafeVarargs
        public C4470b(z83<T> z83, z83<? super T>... z83Arr) {
            this.f25737a = null;
            HashSet hashSet = new HashSet();
            this.f25738a = hashSet;
            this.f25740b = new HashSet();
            this.f25735a = 0;
            this.f25739b = 0;
            this.f25741c = new HashSet();
            i43.m51839c(z83, "Null interface");
            hashSet.add(z83);
            for (z83<? super T> c : z83Arr) {
                i43.m51839c(c, "Null interface");
            }
            Collections.addAll(this.f25738a, z83Arr);
        }

        @SafeVarargs
        public C4470b(Class<T> cls, Class<? super T>... clsArr) {
            this.f25737a = null;
            HashSet hashSet = new HashSet();
            this.f25738a = hashSet;
            this.f25740b = new HashSet();
            this.f25735a = 0;
            this.f25739b = 0;
            this.f25741c = new HashSet();
            i43.m51839c(cls, "Null interface");
            hashSet.add(z83.m72650b(cls));
            for (Class<? super T> cls2 : clsArr) {
                i43.m51839c(cls2, "Null interface");
                this.f25738a.add(z83.m72650b(cls2));
            }
        }

        @C7277xt
        /* renamed from: b */
        public C4470b<T> mo30433b(rj0 rj0) {
            i43.m51839c(rj0, "Null dependency");
            mo30442k(rj0.mo43913d());
            this.f25740b.add(rj0);
            return this;
        }

        @C7277xt
        /* renamed from: c */
        public C4470b<T> mo30434c() {
            return mo30441j(1);
        }

        /* renamed from: d */
        public a30<T> mo30435d() {
            i43.m51840d(this.f25736a != null, "Missing required property: factory.");
            return new a30(this.f25737a, new HashSet(this.f25738a), new HashSet(this.f25740b), this.f25735a, this.f25739b, this.f25736a, this.f25741c);
        }

        @C7277xt
        /* renamed from: e */
        public C4470b<T> mo30436e() {
            return mo30441j(2);
        }

        @C7277xt
        /* renamed from: f */
        public C4470b<T> mo30437f(n30<T> n30) {
            this.f25736a = (n30) i43.m51839c(n30, "Null factory");
            return this;
        }

        @C7277xt
        /* renamed from: g */
        public final C4470b<T> mo30438g() {
            this.f25739b = 1;
            return this;
        }

        /* renamed from: h */
        public C4470b<T> mo30439h(@mr2 String str) {
            this.f25737a = str;
            return this;
        }

        @C7277xt
        /* renamed from: i */
        public C4470b<T> mo30440i(Class<?> cls) {
            this.f25741c.add(cls);
            return this;
        }

        @C7277xt
        /* renamed from: j */
        public final C4470b<T> mo30441j(int i) {
            i43.m51840d(this.f25735a == 0, "Instantiation type has already been set.");
            this.f25735a = i;
            return this;
        }

        /* renamed from: k */
        public final void mo30442k(z83<?> z83) {
            i43.m51837a(!this.f25738a.contains(z83), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public a30(@ts2 String str, Set<z83<? super T>> set, Set<rj0> set2, int i, int i2, n30<T> n30, Set<Class<?>> set3) {
        this.f25730a = str;
        this.f25731a = Collections.unmodifiableSet(set);
        this.f25733b = Collections.unmodifiableSet(set2);
        this.f25728a = i;
        this.f25732b = i2;
        this.f25729a = n30;
        this.f25734c = Collections.unmodifiableSet(set3);
    }

    /* renamed from: A */
    public static /* synthetic */ Object m36003A(Object obj, g30 g30) {
        return obj;
    }

    @Deprecated
    /* renamed from: B */
    public static <T> a30<T> m36004B(Class<T> cls, T t) {
        return m36014h(cls).mo30437f(new w20(t)).mo30435d();
    }

    @SafeVarargs
    /* renamed from: C */
    public static <T> a30<T> m36005C(T t, z83<T> z83, z83<? super T>... z83Arr) {
        return m36013g(z83, z83Arr).mo30437f(new y20(t)).mo30435d();
    }

    @SafeVarargs
    /* renamed from: D */
    public static <T> a30<T> m36006D(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m36015i(cls, clsArr).mo30437f(new x20(t)).mo30435d();
    }

    /* renamed from: f */
    public static <T> C4470b<T> m36012f(z83<T> z83) {
        return new C4470b<>((z83) z83, new z83[0]);
    }

    @SafeVarargs
    /* renamed from: g */
    public static <T> C4470b<T> m36013g(z83<T> z83, z83<? super T>... z83Arr) {
        return new C4470b<>((z83) z83, (z83[]) z83Arr);
    }

    /* renamed from: h */
    public static <T> C4470b<T> m36014h(Class<T> cls) {
        return new C4470b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: i */
    public static <T> C4470b<T> m36015i(Class<T> cls, Class<? super T>... clsArr) {
        return new C4470b<>((Class) cls, (Class[]) clsArr);
    }

    /* renamed from: o */
    public static <T> a30<T> m36016o(T t, z83<T> z83) {
        return m36018q(z83).mo30437f(new v20(t)).mo30435d();
    }

    /* renamed from: p */
    public static <T> a30<T> m36017p(T t, Class<T> cls) {
        return m36019r(cls).mo30437f(new u20(t)).mo30435d();
    }

    /* renamed from: q */
    public static <T> C4470b<T> m36018q(z83<T> z83) {
        return m36012f(z83).mo30438g();
    }

    /* renamed from: r */
    public static <T> C4470b<T> m36019r(Class<T> cls) {
        return m36014h(cls).mo30438g();
    }

    /* renamed from: w */
    public static /* synthetic */ Object m36020w(Object obj, g30 g30) {
        return obj;
    }

    /* renamed from: x */
    public static /* synthetic */ Object m36021x(Object obj, g30 g30) {
        return obj;
    }

    /* renamed from: y */
    public static /* synthetic */ Object m36022y(Object obj, g30 g30) {
        return obj;
    }

    /* renamed from: z */
    public static /* synthetic */ Object m36023z(Object obj, g30 g30) {
        return obj;
    }

    /* renamed from: E */
    public a30<T> mo30422E(n30<T> n30) {
        return new a30(this.f25730a, this.f25731a, this.f25733b, this.f25728a, this.f25732b, n30, this.f25734c);
    }

    /* renamed from: j */
    public Set<rj0> mo30423j() {
        return this.f25733b;
    }

    /* renamed from: k */
    public n30<T> mo30424k() {
        return this.f25729a;
    }

    @ts2
    /* renamed from: l */
    public String mo30425l() {
        return this.f25730a;
    }

    /* renamed from: m */
    public Set<z83<? super T>> mo30426m() {
        return this.f25731a;
    }

    /* renamed from: n */
    public Set<Class<?>> mo30427n() {
        return this.f25734c;
    }

    /* renamed from: s */
    public boolean mo30428s() {
        return this.f25728a == 1;
    }

    /* renamed from: t */
    public boolean mo30429t() {
        return this.f25728a == 2;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f25731a.toArray()) + ">{" + this.f25728a + ", type=" + this.f25732b + ", deps=" + Arrays.toString(this.f25733b.toArray()) + "}";
    }

    /* renamed from: u */
    public boolean mo30431u() {
        return this.f25728a == 0;
    }

    /* renamed from: v */
    public boolean mo30432v() {
        return this.f25732b == 0;
    }
}
