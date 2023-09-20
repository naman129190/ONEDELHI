package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class ee5 extends jc5 implements List, RandomAccess {

    /* renamed from: a */
    public static final wf5 f11212a = new hd5(af5.f9046a, 0);

    /* renamed from: n */
    public static ee5 m13717n(Object[] objArr, int i) {
        return i == 0 ? af5.f9046a : new af5(objArr, i);
    }

    /* renamed from: o */
    public static ee5 m13718o(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (iterable instanceof Collection) {
            return m13719r((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return af5.f9046a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m13721t(next);
        }
        vc5 vc5 = new vc5(4);
        vc5.mo26003b(next);
        vc5.mo26004c(it);
        vc5.f13569a = true;
        return m13717n(vc5.f13570a, vc5.f13568a);
    }

    /* renamed from: r */
    public static ee5 m13719r(Collection collection) {
        if (collection instanceof jc5) {
            ee5 g = ((jc5) collection).mo15148g();
            if (!g.mo13060j()) {
                return g;
            }
            Object[] array = g.toArray();
            return m13717n(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        pe5.m24626a(array2, length);
        return m13717n(array2, length);
    }

    /* renamed from: s */
    public static ee5 m13720s() {
        return af5.f9046a;
    }

    /* renamed from: t */
    public static ee5 m13721t(Object obj) {
        Object[] objArr = {obj};
        pe5.m24626a(objArr, 1);
        return m13717n(objArr, 1);
    }

    /* renamed from: u */
    public static ee5 m13722u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        pe5.m24626a(objArr, 2);
        return m13717n(objArr, 2);
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo13056b(Object[] objArr, int i) {
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
                        if (u07.m29041a(get(i), list.get(i))) {
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
                            if (!u07.m29041a(it.next(), it2.next())) {
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
    @vq1(replacement = "this")
    /* renamed from: g */
    public final ee5 mo15148g() {
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
    public final lf5 mo15150i() {
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
    public ee5 subList(int i, int i2) {
        z17.m32800c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? af5.f9046a : new td5(this, i, i3);
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

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public final wf5 listIterator(int i) {
        z17.m32799b(i, size(), FirebaseAnalytics.C4305d.f24955X);
        return isEmpty() ? f11212a : new hd5(this, i);
    }
}
