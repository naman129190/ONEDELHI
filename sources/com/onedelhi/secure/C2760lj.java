package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.lj */
public abstract class C2760lj<K, A> {

    /* renamed from: a */
    public float f15423a = 0.0f;
    @ts2

    /* renamed from: a */
    public hb2<A> f15424a;

    /* renamed from: a */
    public final C2764d<K> f15425a;
    @ts2

    /* renamed from: a */
    public A f15426a = null;

    /* renamed from: a */
    public final List<C2762b> f15427a = new ArrayList(1);

    /* renamed from: a */
    public boolean f15428a = false;

    /* renamed from: b */
    public float f15429b = -1.0f;

    /* renamed from: c */
    public float f15430c = -1.0f;

    /* renamed from: com.onedelhi.secure.lj$b */
    public interface C2762b {
        /* renamed from: c */
        void mo14992c();
    }

    /* renamed from: com.onedelhi.secure.lj$c */
    public static final class C2763c<T> implements C2764d<T> {
        public C2763c() {
        }

        /* renamed from: a */
        public float mo19646a() {
            return 0.0f;
        }

        /* renamed from: b */
        public float mo19647b() {
            return 1.0f;
        }

        /* renamed from: c */
        public boolean mo19648c(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: d */
        public boolean mo19649d(float f) {
            return false;
        }

        /* renamed from: e */
        public ez1<T> mo19650e() {
            throw new IllegalStateException("not implemented");
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.lj$d */
    public interface C2764d<T> {
        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: a */
        float mo19646a();

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: b */
        float mo19647b();

        /* renamed from: c */
        boolean mo19648c(float f);

        /* renamed from: d */
        boolean mo19649d(float f);

        /* renamed from: e */
        ez1<T> mo19650e();

        boolean isEmpty();
    }

    /* renamed from: com.onedelhi.secure.lj$e */
    public static final class C2765e<T> implements C2764d<T> {

        /* renamed from: a */
        public float f15431a = -1.0f;
        @mr2

        /* renamed from: a */
        public ez1<T> f15432a;

        /* renamed from: a */
        public final List<? extends ez1<T>> f15433a;

        /* renamed from: b */
        public ez1<T> f15434b = null;

        public C2765e(List<? extends ez1<T>> list) {
            this.f15433a = list;
            this.f15432a = mo19652f(0.0f);
        }

        /* renamed from: a */
        public float mo19646a() {
            return ((ez1) this.f15433a.get(0)).mo15662e();
        }

        /* renamed from: b */
        public float mo19647b() {
            List<? extends ez1<T>> list = this.f15433a;
            return ((ez1) list.get(list.size() - 1)).mo15659b();
        }

        /* renamed from: c */
        public boolean mo19648c(float f) {
            ez1<T> ez1 = this.f15434b;
            ez1<T> ez12 = this.f15432a;
            if (ez1 == ez12 && this.f15431a == f) {
                return true;
            }
            this.f15434b = ez12;
            this.f15431a = f;
            return false;
        }

        /* renamed from: d */
        public boolean mo19649d(float f) {
            if (this.f15432a.mo15658a(f)) {
                return !this.f15432a.mo15665h();
            }
            this.f15432a = mo19652f(f);
            return true;
        }

        @mr2
        /* renamed from: e */
        public ez1<T> mo19650e() {
            return this.f15432a;
        }

        /* renamed from: f */
        public final ez1<T> mo19652f(float f) {
            List<? extends ez1<T>> list = this.f15433a;
            ez1<T> ez1 = (ez1) list.get(list.size() - 1);
            if (f >= ez1.mo15662e()) {
                return ez1;
            }
            for (int size = this.f15433a.size() - 2; size >= 1; size--) {
                ez1<T> ez12 = (ez1) this.f15433a.get(size);
                if (this.f15432a != ez12 && ez12.mo15658a(f)) {
                    return ez12;
                }
            }
            return (ez1) this.f15433a.get(0);
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.lj$f */
    public static final class C2766f<T> implements C2764d<T> {

        /* renamed from: a */
        public float f15435a = -1.0f;
        @mr2

        /* renamed from: a */
        public final ez1<T> f15436a;

        public C2766f(List<? extends ez1<T>> list) {
            this.f15436a = (ez1) list.get(0);
        }

        /* renamed from: a */
        public float mo19646a() {
            return this.f15436a.mo15662e();
        }

        /* renamed from: b */
        public float mo19647b() {
            return this.f15436a.mo15659b();
        }

        /* renamed from: c */
        public boolean mo19648c(float f) {
            if (this.f15435a == f) {
                return true;
            }
            this.f15435a = f;
            return false;
        }

        /* renamed from: d */
        public boolean mo19649d(float f) {
            return !this.f15436a.mo15665h();
        }

        /* renamed from: e */
        public ez1<T> mo19650e() {
            return this.f15436a;
        }

        public boolean isEmpty() {
            return false;
        }
    }

    public C2760lj(List<? extends ez1<K>> list) {
        this.f15425a = m20738n(list);
    }

    /* renamed from: n */
    public static <T> C2764d<T> m20738n(List<? extends ez1<T>> list) {
        return list.isEmpty() ? new C2763c() : list.size() == 1 ? new C2766f(list) : new C2765e(list);
    }

    /* renamed from: a */
    public void mo19638a(C2762b bVar) {
        this.f15427a.add(bVar);
    }

    /* renamed from: b */
    public ez1<K> mo19639b() {
        h02.m16420a("BaseKeyframeAnimation#getCurrentKeyframe");
        ez1<K> e = this.f15425a.mo19650e();
        h02.m16421b("BaseKeyframeAnimation#getCurrentKeyframe");
        return e;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: c */
    public float mo15564c() {
        if (this.f15430c == -1.0f) {
            this.f15430c = this.f15425a.mo19647b();
        }
        return this.f15430c;
    }

    /* renamed from: d */
    public float mo19640d() {
        ez1 b = mo19639b();
        if (b.mo15665h()) {
            return 0.0f;
        }
        return b.f11772a.getInterpolation(mo19641e());
    }

    /* renamed from: e */
    public float mo19641e() {
        if (this.f15428a) {
            return 0.0f;
        }
        ez1 b = mo19639b();
        if (b.mo15665h()) {
            return 0.0f;
        }
        return (this.f15423a - b.mo15662e()) / (b.mo15659b() - b.mo15662e());
    }

    /* renamed from: f */
    public float mo19642f() {
        return this.f15423a;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: g */
    public final float mo19643g() {
        if (this.f15429b == -1.0f) {
            this.f15429b = this.f15425a.mo19646a();
        }
        return this.f15429b;
    }

    /* renamed from: h */
    public A mo15565h() {
        float d = mo19640d();
        if (this.f15424a == null && this.f15425a.mo19648c(d)) {
            return this.f15426a;
        }
        A i = mo14089i(mo19639b(), d);
        this.f15426a = i;
        return i;
    }

    /* renamed from: i */
    public abstract A mo14089i(ez1<K> ez1, float f);

    /* renamed from: j */
    public void mo15566j() {
        for (int i = 0; i < this.f15427a.size(); i++) {
            this.f15427a.get(i).mo14992c();
        }
    }

    /* renamed from: k */
    public void mo19644k() {
        this.f15428a = true;
    }

    /* renamed from: l */
    public void mo15567l(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (!this.f15425a.isEmpty()) {
            if (f < mo19643g()) {
                f = mo19643g();
            } else if (f > mo15564c()) {
                f = mo15564c();
            }
            if (f != this.f15423a) {
                this.f15423a = f;
                if (this.f15425a.mo19649d(f)) {
                    mo15566j();
                }
            }
        }
    }

    /* renamed from: m */
    public void mo19645m(@ts2 hb2<A> hb2) {
        hb2<A> hb22 = this.f15424a;
        if (hb22 != null) {
            hb22.mo17181c((C2760lj<?, ?>) null);
        }
        this.f15424a = hb2;
        if (hb2 != null) {
            hb2.mo17181c(this);
        }
    }
}
