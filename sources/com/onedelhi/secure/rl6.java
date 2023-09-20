package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class rl6 extends AbstractList implements xq6 {

    /* renamed from: b */
    public boolean f19924b;

    public rl6(boolean z) {
        this.f19924b = z;
    }

    /* renamed from: a */
    public final void mo23934a() {
        if (this.f19924b) {
            this.f19924b = false;
        }
    }

    public void add(int i, Object obj) {
        mo23935b();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        mo23935b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo23935b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo23935b();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo23935b() {
        if (!this.f19924b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final boolean mo23936c() {
        return this.f19924b;
    }

    public void clear() {
        mo23935b();
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
        mo23935b();
        return super.remove(i);
    }

    public final boolean remove(Object obj) {
        mo23935b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo23935b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo23935b();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo23935b();
        return super.set(i, obj);
    }
}
