package com.onedelhi.secure;

import android.util.Log;
import com.bumptech.glide.C1182c;
import com.onedelhi.secure.im0;
import com.onedelhi.secure.mz0;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.qf0;
import com.onedelhi.secure.rg2;
import com.onedelhi.secure.su0;
import java.util.Map;
import java.util.concurrent.Executor;

public class nu0 implements pu0, rg2.C3415a, su0.C3544a {

    /* renamed from: a */
    public static final int f17571a = 150;

    /* renamed from: a */
    public static final String f17572a = "Engine";

    /* renamed from: a */
    public static final boolean f17573a = Log.isLoggable(f17572a, 2);

    /* renamed from: a */
    public final dv1 f17574a;

    /* renamed from: a */
    public final C3010a f17575a;

    /* renamed from: a */
    public final C3012b f17576a;

    /* renamed from: a */
    public final C3014c f17577a;

    /* renamed from: a */
    public final rg2 f17578a;

    /* renamed from: a */
    public final ru0 f17579a;

    /* renamed from: a */
    public final uk3 f17580a;

    /* renamed from: a */
    public final C3824w2 f17581a;

    @hw4
    /* renamed from: com.onedelhi.secure.nu0$a */
    public static class C3010a {

        /* renamed from: a */
        public int f17582a;

        /* renamed from: a */
        public final n33.C2922a<qf0<?>> f17583a = mz0.m22232e(150, new C3011a());

        /* renamed from: a */
        public final qf0.C3298e f17584a;

        /* renamed from: com.onedelhi.secure.nu0$a$a */
        public class C3011a implements mz0.C2906d<qf0<?>> {
            public C3011a() {
            }

            /* renamed from: b */
            public qf0<?> mo20814a() {
                C3010a aVar = C3010a.this;
                return new qf0<>(aVar.f17584a, aVar.f17583a);
            }
        }

        public C3010a(qf0.C3298e eVar) {
            this.f17584a = eVar;
        }

        /* renamed from: a */
        public <R> qf0<R> mo21486a(C1182c cVar, Object obj, qu0 qu0, ky1 ky1, int i, int i2, Class<?> cls, Class<R> cls2, f53 f53, km0 km0, Map<Class<?>, sg4<?>> map, boolean z, boolean z2, boolean z3, zw2 zw2, qf0.C3295b<R> bVar) {
            qf0 qf0 = (qf0) g43.m15509d(this.f17583a.mo20818b());
            int i3 = this.f17582a;
            int i4 = i3;
            this.f17582a = i3 + 1;
            return qf0.mo23138y(cVar, obj, qu0, ky1, i, i2, cls, cls2, f53, km0, map, z, z2, z3, zw2, bVar, i4);
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.nu0$b */
    public static class C3012b {

        /* renamed from: a */
        public final n33.C2922a<ou0<?>> f17586a = mz0.m22232e(150, new C3013a());

        /* renamed from: a */
        public final pu0 f17587a;

        /* renamed from: a */
        public final su0.C3544a f17588a;

        /* renamed from: a */
        public final zg1 f17589a;

        /* renamed from: b */
        public final zg1 f17590b;

        /* renamed from: c */
        public final zg1 f17591c;

        /* renamed from: d */
        public final zg1 f17592d;

        /* renamed from: com.onedelhi.secure.nu0$b$a */
        public class C3013a implements mz0.C2906d<ou0<?>> {
            public C3013a() {
            }

            /* renamed from: b */
            public ou0<?> mo20814a() {
                C3012b bVar = C3012b.this;
                return new ou0(bVar.f17589a, bVar.f17590b, bVar.f17591c, bVar.f17592d, bVar.f17587a, bVar.f17588a, bVar.f17586a);
            }
        }

        public C3012b(zg1 zg1, zg1 zg12, zg1 zg13, zg1 zg14, pu0 pu0, su0.C3544a aVar) {
            this.f17589a = zg1;
            this.f17590b = zg12;
            this.f17591c = zg13;
            this.f17592d = zg14;
            this.f17587a = pu0;
            this.f17588a = aVar;
        }

        /* renamed from: a */
        public <R> ou0<R> mo21488a(ky1 ky1, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((ou0) g43.m15509d(this.f17586a.mo20818b())).mo22074l(ky1, z, z2, z3, z4);
        }

        @hw4
        /* renamed from: b */
        public void mo21489b() {
            cx0.m12786c(this.f17589a);
            cx0.m12786c(this.f17590b);
            cx0.m12786c(this.f17591c);
            cx0.m12786c(this.f17592d);
        }
    }

    /* renamed from: com.onedelhi.secure.nu0$c */
    public static class C3014c implements qf0.C3298e {

        /* renamed from: a */
        public final im0.C2452a f17594a;

        /* renamed from: a */
        public volatile im0 f17595a;

        public C3014c(im0.C2452a aVar) {
            this.f17594a = aVar;
        }

        /* renamed from: a */
        public im0 mo21491a() {
            if (this.f17595a == null) {
                synchronized (this) {
                    if (this.f17595a == null) {
                        this.f17595a = this.f17594a.mo17849a();
                    }
                    if (this.f17595a == null) {
                        this.f17595a = new jm0();
                    }
                }
            }
            return this.f17595a;
        }

        @hw4
        /* renamed from: b */
        public synchronized void mo21492b() {
            if (this.f17595a != null) {
                this.f17595a.clear();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.nu0$d */
    public class C3015d {

        /* renamed from: a */
        public final gk3 f17596a;

        /* renamed from: a */
        public final ou0<?> f17598a;

        public C3015d(gk3 gk3, ou0<?> ou0) {
            this.f17596a = gk3;
            this.f17598a = ou0;
        }

        /* renamed from: a */
        public void mo21493a() {
            synchronized (nu0.this) {
                this.f17598a.mo22081s(this.f17596a);
            }
        }
    }

    @hw4
    public nu0(rg2 rg2, im0.C2452a aVar, zg1 zg1, zg1 zg12, zg1 zg13, zg1 zg14, dv1 dv1, ru0 ru0, C3824w2 w2Var, C3012b bVar, C3010a aVar2, uk3 uk3, boolean z) {
        this.f17578a = rg2;
        im0.C2452a aVar3 = aVar;
        C3014c cVar = new C3014c(aVar);
        this.f17577a = cVar;
        C3824w2 w2Var2 = w2Var == null ? new C3824w2(z) : w2Var;
        this.f17581a = w2Var2;
        w2Var2.mo26429g(this);
        this.f17579a = ru0 == null ? new ru0() : ru0;
        this.f17574a = dv1 == null ? new dv1() : dv1;
        this.f17576a = bVar == null ? new C3012b(zg1, zg12, zg13, zg14, this, this) : bVar;
        this.f17575a = aVar2 == null ? new C3010a(cVar) : aVar2;
        this.f17580a = uk3 == null ? new uk3() : uk3;
        rg2.mo22374h(this);
    }

    public nu0(rg2 rg2, im0.C2452a aVar, zg1 zg1, zg1 zg12, zg1 zg13, zg1 zg14, boolean z) {
        this(rg2, aVar, zg1, zg12, zg13, zg14, (dv1) null, (ru0) null, (C3824w2) null, (C3012b) null, (C3010a) null, (uk3) null, z);
    }

    /* renamed from: k */
    public static void m23172k(String str, long j, ky1 ky1) {
        Log.v(f17572a, str + " in " + j92.m18213a(j) + "ms, key: " + ky1);
    }

    /* renamed from: a */
    public void mo21473a(ky1 ky1, su0<?> su0) {
        this.f17581a.mo26426d(ky1);
        if (su0.mo24549f()) {
            this.f17578a.mo22372d(ky1, su0);
        } else {
            this.f17580a.mo25654a(su0, false);
        }
    }

    /* renamed from: b */
    public synchronized void mo21474b(ou0<?> ou0, ky1 ky1) {
        this.f17574a.mo14890e(ky1, ou0);
    }

    /* renamed from: c */
    public synchronized void mo21475c(ou0<?> ou0, ky1 ky1, su0<?> su0) {
        if (su0 != null) {
            if (su0.mo24549f()) {
                this.f17581a.mo26423a(ky1, su0);
            }
        }
        this.f17574a.mo14890e(ky1, ou0);
    }

    /* renamed from: d */
    public void mo21476d(@mr2 ck3<?> ck3) {
        this.f17580a.mo25654a(ck3, true);
    }

    /* renamed from: e */
    public void mo21477e() {
        this.f17577a.mo21491a().clear();
    }

    /* renamed from: f */
    public final su0<?> mo21478f(ky1 ky1) {
        ck3<?> g = this.f17578a.mo22373g(ky1);
        if (g == null) {
            return null;
        }
        return g instanceof su0 ? (su0) g : new su0<>(g, true, true, ky1, this);
    }

    /* renamed from: g */
    public <R> C3015d mo21479g(C1182c cVar, Object obj, ky1 ky1, int i, int i2, Class<?> cls, Class<R> cls2, f53 f53, km0 km0, Map<Class<?>, sg4<?>> map, boolean z, boolean z2, zw2 zw2, boolean z3, boolean z4, boolean z5, boolean z6, gk3 gk3, Executor executor) {
        long b = f17573a ? j92.m18214b() : 0;
        qu0 a = this.f17579a.mo24086a(obj, ky1, i, i2, map, cls, cls2, zw2);
        synchronized (this) {
            su0<?> j = mo21482j(a, z3, b);
            if (j == null) {
                C3015d n = mo21485n(cVar, obj, ky1, i, i2, cls, cls2, f53, km0, map, z, z2, zw2, z3, z4, z5, z6, gk3, executor, a, b);
                return n;
            }
            gk3.mo16694c(j, vd0.MEMORY_CACHE, false);
            return null;
        }
    }

    @ts2
    /* renamed from: h */
    public final su0<?> mo21480h(ky1 ky1) {
        su0<?> e = this.f17581a.mo26427e(ky1);
        if (e != null) {
            e.mo24547b();
        }
        return e;
    }

    /* renamed from: i */
    public final su0<?> mo21481i(ky1 ky1) {
        su0<?> f = mo21478f(ky1);
        if (f != null) {
            f.mo24547b();
            this.f17581a.mo26423a(ky1, f);
        }
        return f;
    }

    @ts2
    /* renamed from: j */
    public final su0<?> mo21482j(qu0 qu0, boolean z, long j) {
        if (!z) {
            return null;
        }
        su0<?> h = mo21480h(qu0);
        if (h != null) {
            if (f17573a) {
                m23172k("Loaded resource from active resources", j, qu0);
            }
            return h;
        }
        su0<?> i = mo21481i(qu0);
        if (i == null) {
            return null;
        }
        if (f17573a) {
            m23172k("Loaded resource from cache", j, qu0);
        }
        return i;
    }

    /* renamed from: l */
    public void mo21483l(ck3<?> ck3) {
        if (ck3 instanceof su0) {
            ((su0) ck3).mo24550g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @hw4
    /* renamed from: m */
    public void mo21484m() {
        this.f17576a.mo21489b();
        this.f17577a.mo21492b();
        this.f17581a.mo26430h();
    }

    /* renamed from: n */
    public final <R> C3015d mo21485n(C1182c cVar, Object obj, ky1 ky1, int i, int i2, Class<?> cls, Class<R> cls2, f53 f53, km0 km0, Map<Class<?>, sg4<?>> map, boolean z, boolean z2, zw2 zw2, boolean z3, boolean z4, boolean z5, boolean z6, gk3 gk3, Executor executor, qu0 qu0, long j) {
        gk3 gk32 = gk3;
        Executor executor2 = executor;
        qu0 qu02 = qu0;
        long j2 = j;
        ou0<?> a = this.f17574a.mo14886a(qu02, z6);
        if (a != null) {
            a.mo22067e(gk32, executor2);
            if (f17573a) {
                m23172k("Added to existing load", j2, qu02);
            }
            return new C3015d(gk32, a);
        }
        ou0 a2 = this.f17576a.mo21488a(qu0, z3, z4, z5, z6);
        ou0 ou0 = a2;
        qu0 qu03 = qu02;
        qf0<R> a3 = this.f17575a.mo21486a(cVar, obj, qu0, ky1, i, i2, cls, cls2, f53, km0, map, z, z2, z6, zw2, a2);
        this.f17574a.mo14889d(qu03, ou0);
        ou0 ou02 = ou0;
        qu0 qu04 = qu03;
        gk3 gk33 = gk3;
        ou02.mo22067e(gk33, executor);
        ou02.mo22082t(a3);
        if (f17573a) {
            m23172k("Started new load", j, qu04);
        }
        return new C3015d(gk33, ou02);
    }
}
