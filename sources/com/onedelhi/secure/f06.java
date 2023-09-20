package com.onedelhi.secure;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class f06 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f11784a = new Object[0];

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15671b(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15673e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15674f() {
        throw null;
    }

    /* renamed from: g */
    public r06 mo15675g() {
        throw null;
    }

    /* renamed from: i */
    public abstract z06 iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo15678j();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: k */
    public Object[] mo15679k() {
        throw null;
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f11784a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = mo15679k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo15674f(), mo15673e(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo15671b(objArr, 0);
        return objArr;
    }
}
