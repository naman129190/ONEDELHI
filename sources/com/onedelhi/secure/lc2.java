package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/lc2;", "E", "", "Lcom/onedelhi/secure/d1;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/un4;", "clear", "add", "", "elements", "addAll", "remove", "", "iterator", "removeAll", "retainAll", "", "b", "()I", "size", "Lcom/onedelhi/secure/ic2;", "backing", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class lc2<E> extends C4945d1<E> implements Set<E>, yx1 {
    @vr2

    /* renamed from: a */
    public final ic2<E, ?> f31613a;

    public lc2(@vr2 ic2<E, ?> ic2) {
        jt1.m53777p(ic2, "backing");
        this.f31613a = ic2;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo32169b() {
        return this.f31613a.size();
    }

    public void clear() {
        this.f31613a.clear();
    }

    public boolean contains(Object obj) {
        return this.f31613a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f31613a.isEmpty();
    }

    @vr2
    public Iterator<E> iterator() {
        return this.f31613a.mo37953F();
    }

    public boolean remove(Object obj) {
        return this.f31613a.mo37960N(obj) >= 0;
    }

    public boolean removeAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f31613a.mo37977n();
        return super.removeAll(collection);
    }

    public boolean retainAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f31613a.mo37977n();
        return super.retainAll(collection);
    }
}
