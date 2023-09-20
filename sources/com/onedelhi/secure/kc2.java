package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/kc2;", "K", "V", "Lcom/onedelhi/secure/w0;", "", "", "isEmpty", "", "element", "g", "Lcom/onedelhi/secure/un4;", "clear", "j", "", "elements", "addAll", "i", "", "iterator", "containsAll", "removeAll", "retainAll", "Lcom/onedelhi/secure/ic2;", "backing", "Lcom/onedelhi/secure/ic2;", "l", "()Lcom/onedelhi/secure/ic2;", "", "b", "()I", "size", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class kc2<K, V> extends C7115w0<Map.Entry<K, V>, K, V> {
    @vr2

    /* renamed from: a */
    public final ic2<K, V> f31180a;

    public kc2(@vr2 ic2<K, V> ic2) {
        jt1.m53777p(ic2, "backing");
        this.f31180a = ic2;
    }

    public boolean addAll(@vr2 Collection<? extends Map.Entry<K, V>> collection) {
        jt1.m53777p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo32169b() {
        return this.f31180a.size();
    }

    public void clear() {
        this.f31180a.clear();
    }

    public boolean containsAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        return this.f31180a.mo37979p(collection);
    }

    /* renamed from: g */
    public boolean mo39202g(@vr2 Map.Entry<? extends K, ? extends V> entry) {
        jt1.m53777p(entry, "element");
        return this.f31180a.mo37982q(entry);
    }

    /* renamed from: i */
    public boolean mo39203i(@vr2 Map.Entry entry) {
        jt1.m53777p(entry, "element");
        return this.f31180a.mo37958L(entry);
    }

    public boolean isEmpty() {
        return this.f31180a.isEmpty();
    }

    @vr2
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f31180a.mo37989u();
    }

    /* renamed from: j */
    public boolean add(@vr2 Map.Entry<K, V> entry) {
        jt1.m53777p(entry, "element");
        throw new UnsupportedOperationException();
    }

    @vr2
    /* renamed from: l */
    public final ic2<K, V> mo39207l() {
        return this.f31180a;
    }

    public boolean removeAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f31180a.mo37977n();
        return super.removeAll(collection);
    }

    public boolean retainAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f31180a.mo37977n();
        return super.retainAll(collection);
    }
}
