package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R!\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/onedelhi/secure/mc2;", "V", "", "Lcom/onedelhi/secure/a1;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "Lcom/onedelhi/secure/un4;", "clear", "", "iterator", "remove", "removeAll", "retainAll", "Lcom/onedelhi/secure/ic2;", "backing", "Lcom/onedelhi/secure/ic2;", "f", "()Lcom/onedelhi/secure/ic2;", "", "b", "()I", "size", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class mc2<V> extends C4463a1<V> implements Collection<V>, ox1 {
    @vr2

    /* renamed from: a */
    public final ic2<?, V> f32074a;

    public mc2(@vr2 ic2<?, V> ic2) {
        jt1.m53777p(ic2, "backing");
        this.f32074a = ic2;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@vr2 Collection<? extends V> collection) {
        jt1.m53777p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo30404b() {
        return this.f32074a.size();
    }

    public void clear() {
        this.f32074a.clear();
    }

    public boolean contains(Object obj) {
        return this.f32074a.containsValue(obj);
    }

    @vr2
    /* renamed from: f */
    public final ic2<?, V> mo40531f() {
        return this.f32074a;
    }

    public boolean isEmpty() {
        return this.f32074a.isEmpty();
    }

    @vr2
    public Iterator<V> iterator() {
        return this.f32074a.mo37963Q();
    }

    public boolean remove(Object obj) {
        return this.f32074a.mo37962P(obj);
    }

    public boolean removeAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f32074a.mo37977n();
        return super.removeAll(collection);
    }

    public boolean retainAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f32074a.mo37977n();
        return super.retainAll(collection);
    }
}
