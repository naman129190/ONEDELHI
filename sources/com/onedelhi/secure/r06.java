package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class r06 extends f06 implements List, RandomAccess {

    /* renamed from: a */
    public static final d16 f19526a = new j06(v06.f21630a, 0);

    /* renamed from: n */
    public static r06 m26251n(Object[] objArr, int i) {
        return i == 0 ? v06.f21630a : new v06(objArr, i);
    }

    /* renamed from: o */
    public static r06 m26252o(Collection collection) {
        if (collection instanceof f06) {
            r06 g = ((f06) collection).mo15675g();
            if (!g.mo15678j()) {
                return g;
            }
            Object[] array = g.toArray();
            return m26251n(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i = 0;
        while (i < length) {
            if (array2[i] != null) {
                i++;
            } else {
                throw new NullPointerException("at index " + i);
            }
        }
        return m26251n(array2, length);
    }

    /* renamed from: r */
    public static r06 m26253r() {
        return v06.f21630a;
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo15671b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (pz5.m25230a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!pz5.m25230a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public final r06 mo15675g() {
        return this;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final z06 mo15676i() {
        return listIterator(0);
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public r06 subList(int i, int i2) {
        tz5.m29035c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? v06.f21630a : new n06(this, i, i3);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public final d16 listIterator(int i) {
        tz5.m29034b(i, size(), FirebaseAnalytics.C4305d.f24955X);
        return isEmpty() ? f19526a : new j06(this, i);
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
