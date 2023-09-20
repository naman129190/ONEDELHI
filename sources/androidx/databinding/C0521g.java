package androidx.databinding;

import androidx.databinding.C0523i;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: androidx.databinding.g */
public class C0521g<T> extends ArrayList<T> implements C0523i<T> {

    /* renamed from: a */
    public transient C0514d f3440a = new C0514d();

    /* renamed from: N0 */
    public void mo3999N0(C0523i.C0524a aVar) {
        if (this.f3440a == null) {
            this.f3440a = new C0514d();
        }
        this.f3440a.mo3974a(aVar);
    }

    /* renamed from: Y */
    public void mo4000Y(C0523i.C0524a aVar) {
        C0514d dVar = this.f3440a;
        if (dVar != null) {
            dVar.mo3987m(aVar);
        }
    }

    public void add(int i, T t) {
        super.add(i, t);
        mo4005b(i, 1);
    }

    public boolean add(T t) {
        super.add(t);
        mo4005b(size() - 1, 1);
        return true;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            mo4005b(i, collection.size());
        }
        return addAll;
    }

    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            mo4005b(size, size() - size);
        }
        return addAll;
    }

    /* renamed from: b */
    public final void mo4005b(int i, int i2) {
        C0514d dVar = this.f3440a;
        if (dVar != null) {
            dVar.mo3993t(this, i, i2);
        }
    }

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            mo4007e(0, size);
        }
    }

    /* renamed from: e */
    public final void mo4007e(int i, int i2) {
        C0514d dVar = this.f3440a;
        if (dVar != null) {
            dVar.mo3995v(this, i, i2);
        }
    }

    public T remove(int i) {
        T remove = super.remove(i);
        mo4007e(i, 1);
        return remove;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        mo4007e(i, i2 - i);
    }

    public T set(int i, T t) {
        T t2 = super.set(i, t);
        C0514d dVar = this.f3440a;
        if (dVar != null) {
            dVar.mo3992s(this, i, 1);
        }
        return t2;
    }
}
