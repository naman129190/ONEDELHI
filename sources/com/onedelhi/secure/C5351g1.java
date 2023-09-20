package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.onedelhi.secure.g1 */
public abstract class C5351g1<E> extends AbstractList<E> implements vs1.C7095k<E> {

    /* renamed from: n */
    public static final int f28854n = 10;

    /* renamed from: b */
    public boolean f28855b = true;

    /* renamed from: Q0 */
    public final void mo36496Q0() {
        this.f28855b = false;
    }

    public void add(int i, E e) {
        mo36498b();
        super.add(i, e);
    }

    public boolean add(E e) {
        mo36498b();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo36498b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo36498b();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public void mo36498b() {
        if (!this.f28855b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo36498b();
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

    /* renamed from: p */
    public boolean mo36500p() {
        return this.f28855b;
    }

    public E remove(int i) {
        mo36498b();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo36498b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo36498b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo36498b();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo36498b();
        return super.set(i, e);
    }
}
