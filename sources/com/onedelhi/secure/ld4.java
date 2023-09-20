package com.onedelhi.secure;

import android.util.SparseArray;
import java.lang.reflect.Array;

public class ld4<T> {

    /* renamed from: a */
    public final int f15296a;

    /* renamed from: a */
    public final SparseArray<C2732a<T>> f15297a = new SparseArray<>(10);

    /* renamed from: a */
    public C2732a<T> f15298a;

    /* renamed from: com.onedelhi.secure.ld4$a */
    public static class C2732a<T> {

        /* renamed from: a */
        public int f15299a;

        /* renamed from: a */
        public C2732a<T> f15300a;

        /* renamed from: a */
        public final T[] f15301a;

        /* renamed from: b */
        public int f15302b;

        public C2732a(Class<T> cls, int i) {
            this.f15301a = (Object[]) Array.newInstance(cls, i);
        }

        /* renamed from: a */
        public boolean mo19449a(int i) {
            int i2 = this.f15299a;
            return i2 <= i && i < i2 + this.f15302b;
        }

        /* renamed from: b */
        public T mo19450b(int i) {
            return this.f15301a[i - this.f15299a];
        }
    }

    public ld4(int i) {
        this.f15296a = i;
    }

    /* renamed from: a */
    public C2732a<T> mo19443a(C2732a<T> aVar) {
        int indexOfKey = this.f15297a.indexOfKey(aVar.f15299a);
        if (indexOfKey < 0) {
            this.f15297a.put(aVar.f15299a, aVar);
            return null;
        }
        C2732a<T> valueAt = this.f15297a.valueAt(indexOfKey);
        this.f15297a.setValueAt(indexOfKey, aVar);
        if (this.f15298a == valueAt) {
            this.f15298a = aVar;
        }
        return valueAt;
    }

    /* renamed from: b */
    public void mo19444b() {
        this.f15297a.clear();
    }

    /* renamed from: c */
    public C2732a<T> mo19445c(int i) {
        if (i < 0 || i >= this.f15297a.size()) {
            return null;
        }
        return this.f15297a.valueAt(i);
    }

    /* renamed from: d */
    public T mo19446d(int i) {
        C2732a<T> aVar = this.f15298a;
        if (aVar == null || !aVar.mo19449a(i)) {
            int indexOfKey = this.f15297a.indexOfKey(i - (i % this.f15296a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f15298a = this.f15297a.valueAt(indexOfKey);
        }
        return this.f15298a.mo19450b(i);
    }

    /* renamed from: e */
    public C2732a<T> mo19447e(int i) {
        C2732a<T> aVar = this.f15297a.get(i);
        if (this.f15298a == aVar) {
            this.f15298a = null;
        }
        this.f15297a.delete(i);
        return aVar;
    }

    /* renamed from: f */
    public int mo19448f() {
        return this.f15297a.size();
    }
}
