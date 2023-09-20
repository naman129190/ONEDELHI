package com.onedelhi.secure;

import com.onedelhi.secure.n33;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zl2<Model, Data> implements rj2<Model, Data> {

    /* renamed from: a */
    public final n33.C2922a<List<Throwable>> f23804a;

    /* renamed from: a */
    public final List<rj2<Model, Data>> f23805a;

    /* renamed from: com.onedelhi.secure.zl2$a */
    public static class C4114a<Data> implements pd0<Data>, pd0.C3144a<Data> {

        /* renamed from: a */
        public f53 f23806a;

        /* renamed from: a */
        public final n33.C2922a<List<Throwable>> f23807a;

        /* renamed from: a */
        public pd0.C3144a<? super Data> f23808a;

        /* renamed from: a */
        public final List<pd0<Data>> f23809a;
        @ts2

        /* renamed from: b */
        public List<Throwable> f23810b;

        /* renamed from: b */
        public boolean f23811b;

        /* renamed from: n */
        public int f23812n = 0;

        public C4114a(@mr2 List<pd0<Data>> list, @mr2 n33.C2922a<List<Throwable>> aVar) {
            this.f23807a = aVar;
            g43.m15508c(list);
            this.f23809a = list;
        }

        @mr2
        /* renamed from: a */
        public Class<Data> mo14075a() {
            return this.f23809a.get(0).mo14075a();
        }

        /* renamed from: b */
        public void mo14569b() {
            List<Throwable> list = this.f23810b;
            if (list != null) {
                this.f23807a.mo20817a(list);
            }
            this.f23810b = null;
            for (pd0<Data> b : this.f23809a) {
                b.mo14569b();
            }
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super Data> aVar) {
            this.f23806a = f53;
            this.f23808a = aVar;
            this.f23810b = this.f23807a.mo20818b();
            this.f23809a.get(this.f23812n).mo14570c(f53, this);
            if (this.f23811b) {
                cancel();
            }
        }

        public void cancel() {
            this.f23811b = true;
            for (pd0<Data> cancel : this.f23809a) {
                cancel.cancel();
            }
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return this.f23809a.get(0).mo14572d();
        }

        /* renamed from: e */
        public void mo13892e(@mr2 Exception exc) {
            ((List) g43.m15509d(this.f23810b)).add(exc);
            mo28039g();
        }

        /* renamed from: f */
        public void mo13893f(@ts2 Data data) {
            if (data != null) {
                this.f23808a.mo13893f(data);
            } else {
                mo28039g();
            }
        }

        /* renamed from: g */
        public final void mo28039g() {
            if (!this.f23811b) {
                if (this.f23812n < this.f23809a.size() - 1) {
                    this.f23812n++;
                    mo14570c(this.f23806a, this.f23808a);
                    return;
                }
                g43.m15509d(this.f23810b);
                this.f23808a.mo13892e(new yg1("Fetch failed", (List<Throwable>) new ArrayList(this.f23810b)));
            }
        }
    }

    public zl2(@mr2 List<rj2<Model, Data>> list, @mr2 n33.C2922a<List<Throwable>> aVar) {
        this.f23805a = list;
        this.f23804a = aVar;
    }

    /* renamed from: a */
    public rj2.C3418a<Data> mo13191a(@mr2 Model model, int i, int i2, @mr2 zw2 zw2) {
        rj2.C3418a a;
        int size = this.f23805a.size();
        ArrayList arrayList = new ArrayList(size);
        ky1 ky1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            rj2 rj2 = this.f23805a.get(i3);
            if (rj2.mo13192b(model) && (a = rj2.mo13191a(model, i, i2, zw2)) != null) {
                ky1 = a.f19899a;
                arrayList.add(a.f19900a);
            }
        }
        if (arrayList.isEmpty() || ky1 == null) {
            return null;
        }
        return new rj2.C3418a<>(ky1, new C4114a(arrayList, this.f23804a));
    }

    /* renamed from: b */
    public boolean mo13192b(@mr2 Model model) {
        for (rj2<Model, Data> b : this.f23805a) {
            if (b.mo13192b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f23805a.toArray()) + '}';
    }
}
