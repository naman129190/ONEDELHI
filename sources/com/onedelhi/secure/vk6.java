package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class vk6 extends uj6 implements List, RandomAccess {

    /* renamed from: a */
    public static final ll6 f21850a = new yj6(dl6.f10859a, 0);

    /* renamed from: n */
    public static final /* synthetic */ int f21851n = 0;

    /* renamed from: k */
    public static vk6 m30218k(Object[] objArr, int i) {
        return i == 0 ? dl6.f10859a : new dl6(objArr, i);
    }

    /* renamed from: l */
    public static vk6 m30219l(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        bl6.m11948b(objArr, 2);
        return m30218k(objArr, 2);
    }

    /* renamed from: n */
    public static vk6 m30220n(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {bf0.f26274c, FirebaseMessaging.f25020d, "am"};
        bl6.m11948b(objArr, 3);
        return m30218k(objArr, 3);
    }

    /* renamed from: o */
    public static vk6 m30221o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        bl6.m11948b(objArr, 7);
        return m30218k(objArr, 7);
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
    public int mo14790b(Object[] objArr, int i) {
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
                        if (qi6.m25771a(get(i), list.get(i))) {
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
                            if (!qi6.m25771a(it.next(), it2.next())) {
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

    /* renamed from: g */
    public final jl6 mo16060g() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
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

    /* renamed from: j */
    public vk6 subList(int i, int i2) {
        ui6.m29379c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? dl6.f10859a : new ak6(this, i, i3);
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

    /* renamed from: r */
    public final ll6 listIterator(int i) {
        ui6.m29378b(i, size(), FirebaseAnalytics.C4305d.f24955X);
        return isEmpty() ? f21850a : new yj6(this, i);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
