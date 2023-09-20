package com.onedelhi.secure;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
@qn0("Use ImmutableList.of or another implementation")
public abstract class jc5 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f14090a = new Object[0];

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @C7277xt
    /* renamed from: b */
    public int mo13056b(Object[] objArr, int i) {
        throw null;
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo13057e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo13058f() {
        throw null;
    }

    /* renamed from: g */
    public ee5 mo15148g() {
        throw null;
    }

    /* renamed from: i */
    public abstract lf5 iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo13060j();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: k */
    public Object[] mo13061k() {
        throw null;
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    @C7277xt
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f14090a);
    }

    @C7277xt
    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = mo13061k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo13058f(), mo13057e(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo13056b(objArr, 0);
        return objArr;
    }
}
