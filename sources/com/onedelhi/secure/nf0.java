package com.onedelhi.secure;

import com.bumptech.glide.C1182c;
import com.onedelhi.secure.lh3;
import com.onedelhi.secure.qf0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class nf0<Transcode> {

    /* renamed from: a */
    public int f17387a;

    /* renamed from: a */
    public C1182c f17388a;

    /* renamed from: a */
    public f53 f17389a;

    /* renamed from: a */
    public km0 f17390a;

    /* renamed from: a */
    public ky1 f17391a;

    /* renamed from: a */
    public qf0.C3298e f17392a;

    /* renamed from: a */
    public zw2 f17393a;

    /* renamed from: a */
    public Class<?> f17394a;

    /* renamed from: a */
    public Object f17395a;

    /* renamed from: a */
    public final List<rj2.C3418a<?>> f17396a = new ArrayList();

    /* renamed from: a */
    public Map<Class<?>, sg4<?>> f17397a;

    /* renamed from: a */
    public boolean f17398a;

    /* renamed from: b */
    public int f17399b;

    /* renamed from: b */
    public Class<Transcode> f17400b;

    /* renamed from: b */
    public final List<ky1> f17401b = new ArrayList();

    /* renamed from: b */
    public boolean f17402b;

    /* renamed from: c */
    public boolean f17403c;

    /* renamed from: d */
    public boolean f17404d;

    /* renamed from: a */
    public void mo21206a() {
        this.f17388a = null;
        this.f17395a = null;
        this.f17391a = null;
        this.f17394a = null;
        this.f17400b = null;
        this.f17393a = null;
        this.f17389a = null;
        this.f17397a = null;
        this.f17390a = null;
        this.f17396a.clear();
        this.f17398a = false;
        this.f17401b.clear();
        this.f17402b = false;
    }

    /* renamed from: b */
    public C3131pa mo21207b() {
        return this.f17388a.mo7494b();
    }

    /* renamed from: c */
    public List<ky1> mo21208c() {
        if (!this.f17402b) {
            this.f17402b = true;
            this.f17401b.clear();
            List<rj2.C3418a<?>> g = mo21212g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                rj2.C3418a aVar = g.get(i);
                if (!this.f17401b.contains(aVar.f19899a)) {
                    this.f17401b.add(aVar.f19899a);
                }
                for (int i2 = 0; i2 < aVar.f19901a.size(); i2++) {
                    if (!this.f17401b.contains(aVar.f19901a.get(i2))) {
                        this.f17401b.add(aVar.f19901a.get(i2));
                    }
                }
            }
        }
        return this.f17401b;
    }

    /* renamed from: d */
    public im0 mo21209d() {
        return this.f17392a.mo21491a();
    }

    /* renamed from: e */
    public km0 mo21210e() {
        return this.f17390a;
    }

    /* renamed from: f */
    public int mo21211f() {
        return this.f17399b;
    }

    /* renamed from: g */
    public List<rj2.C3418a<?>> mo21212g() {
        if (!this.f17398a) {
            this.f17398a = true;
            this.f17396a.clear();
            List i = this.f17388a.mo7501i().mo19560i(this.f17395a);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                rj2.C3418a a = ((rj2) i.get(i2)).mo13191a(this.f17395a, this.f17387a, this.f17399b, this.f17393a);
                if (a != null) {
                    this.f17396a.add(a);
                }
            }
        }
        return this.f17396a;
    }

    /* renamed from: h */
    public <Data> g62<Data, ?, Transcode> mo21213h(Class<Data> cls) {
        return this.f17388a.mo7501i().mo19559h(cls, this.f17394a, this.f17400b);
    }

    /* renamed from: i */
    public Class<?> mo21214i() {
        return this.f17395a.getClass();
    }

    /* renamed from: j */
    public List<rj2<File, ?>> mo21215j(File file) throws lh3.C2744c {
        return this.f17388a.mo7501i().mo19560i(file);
    }

    /* renamed from: k */
    public zw2 mo21216k() {
        return this.f17393a;
    }

    /* renamed from: l */
    public f53 mo21217l() {
        return this.f17389a;
    }

    /* renamed from: m */
    public List<Class<?>> mo21218m() {
        return this.f17388a.mo7501i().mo19561j(this.f17395a.getClass(), this.f17394a, this.f17400b);
    }

    /* renamed from: n */
    public <Z> nk3<Z> mo21219n(ck3<Z> ck3) {
        return this.f17388a.mo7501i().mo19562k(ck3);
    }

    /* renamed from: o */
    public ky1 mo21220o() {
        return this.f17391a;
    }

    /* renamed from: p */
    public <X> cu0<X> mo21221p(X x) throws lh3.C2746e {
        return this.f17388a.mo7501i().mo19564m(x);
    }

    /* renamed from: q */
    public Class<?> mo21222q() {
        return this.f17400b;
    }

    /* renamed from: r */
    public <Z> sg4<Z> mo21223r(Class<Z> cls) {
        sg4<Z> sg4 = this.f17397a.get(cls);
        if (sg4 == null) {
            Iterator<Map.Entry<Class<?>, sg4<?>>> it = this.f17397a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    sg4 = (sg4) next.getValue();
                    break;
                }
            }
        }
        if (sg4 != null) {
            return sg4;
        }
        if (!this.f17397a.isEmpty() || !this.f17403c) {
            return zn4.m33294c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: s */
    public int mo21224s() {
        return this.f17387a;
    }

    /* renamed from: t */
    public boolean mo21225t(Class<?> cls) {
        return mo21213h(cls) != null;
    }

    /* renamed from: u */
    public <R> void mo21226u(C1182c cVar, Object obj, ky1 ky1, int i, int i2, km0 km0, Class<?> cls, Class<R> cls2, f53 f53, zw2 zw2, Map<Class<?>, sg4<?>> map, boolean z, boolean z2, qf0.C3298e eVar) {
        this.f17388a = cVar;
        this.f17395a = obj;
        this.f17391a = ky1;
        this.f17387a = i;
        this.f17399b = i2;
        this.f17390a = km0;
        this.f17394a = cls;
        this.f17392a = eVar;
        this.f17400b = cls2;
        this.f17389a = f53;
        this.f17393a = zw2;
        this.f17397a = map;
        this.f17403c = z;
        this.f17404d = z2;
    }

    /* renamed from: v */
    public boolean mo21227v(ck3<?> ck3) {
        return this.f17388a.mo7501i().mo19565n(ck3);
    }

    /* renamed from: w */
    public boolean mo21228w() {
        return this.f17404d;
    }

    /* renamed from: x */
    public boolean mo21229x(ky1 ky1) {
        List<rj2.C3418a<?>> g = mo21212g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f19899a.equals(ky1)) {
                return true;
            }
        }
        return false;
    }
}
