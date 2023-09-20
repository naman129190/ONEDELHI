package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002R\u0014\u0010\u0018\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/pt0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "element", "f", "", "elements", "containsAll", "", "iterator", "i", "g", "()I", "size", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class pt0 implements Set, Serializable, nx1 {
    @vr2

    /* renamed from: a */
    public static final pt0 f33768a = new pt0();

    /* renamed from: b */
    public static final long f33769b = 3406603774387020532L;

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo42901b(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo42906f((Void) obj);
    }

    public boolean containsAll(@vr2 Collection collection) {
        jt1.m53777p(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    /* renamed from: f */
    public boolean mo42906f(@vr2 Void voidR) {
        jt1.m53777p(voidR, "element");
        return false;
    }

    /* renamed from: g */
    public int mo42907g() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo42909i() {
        return f33768a;
    }

    public boolean isEmpty() {
        return true;
    }

    @vr2
    public Iterator iterator() {
        return it0.f30457a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo42907g();
    }

    public Object[] toArray() {
        return o00.m58878a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        jt1.m53777p(tArr, "array");
        return o00.m58879b(this, tArr);
    }

    @vr2
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
