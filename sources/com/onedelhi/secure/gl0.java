package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.n33;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@hl3({hl3.C2354a.f13185a})
public final class gl0<T> {

    /* renamed from: a */
    public final n33.C2922a<ArrayList<T>> f12634a = new n33.C2923b(10);

    /* renamed from: a */
    public final ty3<T, ArrayList<T>> f12635a = new ty3<>();

    /* renamed from: a */
    public final ArrayList<T> f12636a = new ArrayList<>();

    /* renamed from: a */
    public final HashSet<T> f12637a = new HashSet<>();

    /* renamed from: a */
    public void mo16696a(@mr2 T t, @mr2 T t2) {
        if (!this.f12635a.containsKey(t) || !this.f12635a.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f12635a.get(t);
        if (arrayList == null) {
            arrayList = mo16701f();
            this.f12635a.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo16697b(@mr2 T t) {
        if (!this.f12635a.containsKey(t)) {
            this.f12635a.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo16698c() {
        int size = this.f12635a.size();
        for (int i = 0; i < size; i++) {
            ArrayList q = this.f12635a.mo25352q(i);
            if (q != null) {
                mo16706k(q);
            }
        }
        this.f12635a.clear();
    }

    /* renamed from: d */
    public boolean mo16699d(@mr2 T t) {
        return this.f12635a.containsKey(t);
    }

    /* renamed from: e */
    public final void mo16700e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f12635a.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo16700e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    @mr2
    /* renamed from: f */
    public final ArrayList<T> mo16701f() {
        ArrayList<T> b = this.f12634a.mo20818b();
        return b == null ? new ArrayList<>() : b;
    }

    @ts2
    /* renamed from: g */
    public List mo16702g(@mr2 T t) {
        return this.f12635a.get(t);
    }

    @ts2
    /* renamed from: h */
    public List<T> mo16703h(@mr2 T t) {
        int size = this.f12635a.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList q = this.f12635a.mo25352q(i);
            if (q != null && q.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f12635a.mo25350m(i));
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: i */
    public ArrayList<T> mo16704i() {
        this.f12636a.clear();
        this.f12637a.clear();
        int size = this.f12635a.size();
        for (int i = 0; i < size; i++) {
            mo16700e(this.f12635a.mo25350m(i), this.f12636a, this.f12637a);
        }
        return this.f12636a;
    }

    /* renamed from: j */
    public boolean mo16705j(@mr2 T t) {
        int size = this.f12635a.size();
        for (int i = 0; i < size; i++) {
            ArrayList q = this.f12635a.mo25352q(i);
            if (q != null && q.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo16706k(@mr2 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f12634a.mo20817a(arrayList);
    }

    /* renamed from: l */
    public int mo16707l() {
        return this.f12635a.size();
    }
}
