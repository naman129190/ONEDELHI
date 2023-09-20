package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.qd0;
import com.onedelhi.secure.rj2;
import java.util.Collections;
import java.util.List;

public class c14 implements qd0, qd0.C3289a {

    /* renamed from: b */
    public static final String f10069b = "SourceGenerator";

    /* renamed from: a */
    public hd0 f10070a;

    /* renamed from: a */
    public id0 f10071a;

    /* renamed from: a */
    public final nf0<?> f10072a;

    /* renamed from: a */
    public final qd0.C3289a f10073a;

    /* renamed from: a */
    public volatile rj2.C3418a<?> f10074a;

    /* renamed from: a */
    public Object f10075a;

    /* renamed from: n */
    public int f10076n;

    /* renamed from: com.onedelhi.secure.c14$a */
    public class C1832a implements pd0.C3144a<Object> {

        /* renamed from: a */
        public final /* synthetic */ rj2.C3418a f10078a;

        public C1832a(rj2.C3418a aVar) {
            this.f10078a = aVar;
        }

        /* renamed from: e */
        public void mo13892e(@mr2 Exception exc) {
            if (c14.this.mo13885d(this.f10078a)) {
                c14.this.mo13889h(this.f10078a, exc);
            }
        }

        /* renamed from: f */
        public void mo13893f(@ts2 Object obj) {
            if (c14.this.mo13885d(this.f10078a)) {
                c14.this.mo13887f(this.f10078a, obj);
            }
        }
    }

    public c14(nf0<?> nf0, qd0.C3289a aVar) {
        this.f10072a = nf0;
        this.f10073a = aVar;
    }

    /* renamed from: a */
    public boolean mo13881a() {
        Object obj = this.f10075a;
        if (obj != null) {
            this.f10075a = null;
            mo13882b(obj);
        }
        hd0 hd0 = this.f10070a;
        if (hd0 != null && hd0.mo13881a()) {
            return true;
        }
        this.f10070a = null;
        this.f10074a = null;
        boolean z = false;
        while (!z && mo13883c()) {
            List<rj2.C3418a<?>> g = this.f10072a.mo21212g();
            int i = this.f10076n;
            this.f10076n = i + 1;
            this.f10074a = g.get(i);
            if (this.f10074a != null && (this.f10072a.mo21210e().mo19160c(this.f10074a.f19900a.mo14572d()) || this.f10072a.mo21225t(this.f10074a.f19900a.mo14075a()))) {
                mo13890i(this.f10074a);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo13882b(Object obj) {
        long b = j92.m18214b();
        try {
            cu0<X> p = this.f10072a.mo21221p(obj);
            jd0 jd0 = new jd0(p, obj, this.f10072a.mo21216k());
            this.f10071a = new id0(this.f10074a.f19899a, this.f10072a.mo21220o());
            this.f10072a.mo21209d().mo17846b(this.f10071a, jd0);
            if (Log.isLoggable(f10069b, 2)) {
                Log.v(f10069b, "Finished encoding source to cache, key: " + this.f10071a + ", data: " + obj + ", encoder: " + p + ", duration: " + j92.m18213a(b));
            }
            this.f10074a.f19900a.mo14569b();
            this.f10070a = new hd0(Collections.singletonList(this.f10074a.f19899a), this.f10072a, this);
        } catch (Throwable th) {
            this.f10074a.f19900a.mo14569b();
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean mo13883c() {
        return this.f10076n < this.f10072a.mo21212g().size();
    }

    public void cancel() {
        rj2.C3418a<?> aVar = this.f10074a;
        if (aVar != null) {
            aVar.f19900a.cancel();
        }
    }

    /* renamed from: d */
    public boolean mo13885d(rj2.C3418a<?> aVar) {
        rj2.C3418a<?> aVar2 = this.f10074a;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: e */
    public void mo13886e(ky1 ky1, Object obj, pd0<?> pd0, vd0 vd0, ky1 ky12) {
        this.f10073a.mo13886e(ky1, obj, pd0, this.f10074a.f19900a.mo14572d(), ky1);
    }

    /* renamed from: f */
    public void mo13887f(rj2.C3418a<?> aVar, Object obj) {
        km0 e = this.f10072a.mo21210e();
        if (obj == null || !e.mo19160c(aVar.f19900a.mo14572d())) {
            qd0.C3289a aVar2 = this.f10073a;
            ky1 ky1 = aVar.f19899a;
            pd0<Data> pd0 = aVar.f19900a;
            aVar2.mo13886e(ky1, obj, pd0, pd0.mo14572d(), this.f10071a);
            return;
        }
        this.f10075a = obj;
        this.f10073a.mo13888g();
    }

    /* renamed from: g */
    public void mo13888g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public void mo13889h(rj2.C3418a<?> aVar, @mr2 Exception exc) {
        qd0.C3289a aVar2 = this.f10073a;
        id0 id0 = this.f10071a;
        pd0<Data> pd0 = aVar.f19900a;
        aVar2.mo13891l(id0, exc, pd0, pd0.mo14572d());
    }

    /* renamed from: i */
    public final void mo13890i(rj2.C3418a<?> aVar) {
        this.f10074a.f19900a.mo14570c(this.f10072a.mo21217l(), new C1832a(aVar));
    }

    /* renamed from: l */
    public void mo13891l(ky1 ky1, Exception exc, pd0<?> pd0, vd0 vd0) {
        this.f10073a.mo13891l(ky1, exc, pd0, this.f10074a.f19900a.mo14572d());
    }
}
