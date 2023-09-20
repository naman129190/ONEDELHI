package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class m06 extends AbstractList implements q56 {

    /* renamed from: b */
    public boolean f15754b = true;

    /* renamed from: a */
    public final void mo19980a() {
        this.f15754b = false;
    }

    public void add(int i, Object obj) {
        mo19981b();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        mo19981b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo19981b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo19981b();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo19981b() {
        if (!this.f15754b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final boolean mo19982c() {
        return this.f15754b;
    }

    public void clear() {
        mo19981b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        mo19981b();
        return super.remove(i);
    }

    public final boolean remove(Object obj) {
        mo19981b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo19981b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo19981b();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo19981b();
        return super.set(i, obj);
    }
}
