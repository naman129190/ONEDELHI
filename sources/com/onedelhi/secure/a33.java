package com.onedelhi.secure;

import com.onedelhi.secure.a33.C4471a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class a33<T extends C4471a> {

    /* renamed from: b */
    public static final int f25742b = 50;

    /* renamed from: c */
    public static final int f25743c = 40;

    /* renamed from: a */
    public final int f25744a;

    /* renamed from: a */
    public final C7273xn f25745a;

    /* renamed from: a */
    public List<T> f25746a;

    /* renamed from: b */
    public List<a33<T>> f25747b;

    /* renamed from: com.onedelhi.secure.a33$a */
    public interface C4471a {
        /* renamed from: d */
        v23 mo30451d();
    }

    public a33(double d, double d2, double d3, double d4) {
        this(new C7273xn(d, d2, d3, d4));
    }

    public a33(double d, double d2, double d3, double d4, int i) {
        this(new C7273xn(d, d2, d3, d4), i);
    }

    public a33(C7273xn xnVar) {
        this(xnVar, 0);
    }

    public a33(C7273xn xnVar, int i) {
        this.f25747b = null;
        this.f25745a = xnVar;
        this.f25744a = i;
    }

    /* renamed from: a */
    public void mo30443a(T t) {
        v23 d = t.mo30451d();
        if (this.f25745a.mo47365a(d.f36408a, d.f36409b)) {
            mo30445c(d.f36408a, d.f36409b, t);
        }
    }

    /* renamed from: b */
    public void mo30444b() {
        this.f25747b = null;
        List<T> list = this.f25746a;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: c */
    public final void mo30445c(double d, double d2, T t) {
        List<a33<T>> list = this.f25747b;
        if (list != null) {
            C7273xn xnVar = this.f25745a;
            int i = (d2 > xnVar.f37556f ? 1 : (d2 == xnVar.f37556f ? 0 : -1));
            int i2 = (d > xnVar.f37555e ? 1 : (d == xnVar.f37555e ? 0 : -1));
            list.get(i < 0 ? i2 < 0 ? 0 : 1 : i2 < 0 ? 2 : 3).mo30445c(d, d2, t);
            return;
        }
        if (this.f25746a == null) {
            this.f25746a = new ArrayList();
        }
        this.f25746a.add(t);
        if (this.f25746a.size() > 50 && this.f25744a < 40) {
            mo30450h();
        }
    }

    /* renamed from: d */
    public final boolean mo30446d(double d, double d2, T t) {
        List<a33<T>> list = this.f25747b;
        if (list == null) {
            return this.f25746a.remove(t);
        }
        C7273xn xnVar = this.f25745a;
        int i = (d2 > xnVar.f37556f ? 1 : (d2 == xnVar.f37556f ? 0 : -1));
        int i2 = (d > xnVar.f37555e ? 1 : (d == xnVar.f37555e ? 0 : -1));
        return i < 0 ? i2 < 0 ? list.get(0).mo30446d(d, d2, t) : list.get(1).mo30446d(d, d2, t) : i2 < 0 ? list.get(2).mo30446d(d, d2, t) : list.get(3).mo30446d(d, d2, t);
    }

    /* renamed from: e */
    public boolean mo30447e(T t) {
        v23 d = t.mo30451d();
        if (!this.f25745a.mo47365a(d.f36408a, d.f36409b)) {
            return false;
        }
        return mo30446d(d.f36408a, d.f36409b, t);
    }

    /* renamed from: f */
    public Collection<T> mo30448f(C7273xn xnVar) {
        ArrayList arrayList = new ArrayList();
        mo30449g(xnVar, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public final void mo30449g(C7273xn xnVar, Collection<T> collection) {
        if (this.f25745a.mo47369e(xnVar)) {
            List<a33<T>> list = this.f25747b;
            if (list != null) {
                for (a33<T> g : list) {
                    g.mo30449g(xnVar, collection);
                }
            } else if (this.f25746a == null) {
            } else {
                if (xnVar.mo47366b(this.f25745a)) {
                    collection.addAll(this.f25746a);
                    return;
                }
                for (T t : this.f25746a) {
                    if (xnVar.mo47367c(t.mo30451d())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo30450h() {
        ArrayList arrayList = new ArrayList(4);
        this.f25747b = arrayList;
        C7273xn xnVar = this.f25745a;
        arrayList.add(new a33(xnVar.f37551a, xnVar.f37555e, xnVar.f37552b, xnVar.f37556f, this.f25744a + 1));
        List<a33<T>> list = this.f25747b;
        C7273xn xnVar2 = this.f25745a;
        list.add(new a33(xnVar2.f37555e, xnVar2.f37553c, xnVar2.f37552b, xnVar2.f37556f, this.f25744a + 1));
        List<a33<T>> list2 = this.f25747b;
        C7273xn xnVar3 = this.f25745a;
        list2.add(new a33(xnVar3.f37551a, xnVar3.f37555e, xnVar3.f37556f, xnVar3.f37554d, this.f25744a + 1));
        List<a33<T>> list3 = this.f25747b;
        C7273xn xnVar4 = this.f25745a;
        list3.add(new a33(xnVar4.f37555e, xnVar4.f37553c, xnVar4.f37556f, xnVar4.f37554d, this.f25744a + 1));
        List<T> list4 = this.f25746a;
        this.f25746a = null;
        for (T t : list4) {
            mo30445c(t.mo30451d().f36408a, t.mo30451d().f36409b, t);
        }
    }
}
