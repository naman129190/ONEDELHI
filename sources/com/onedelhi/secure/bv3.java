package com.onedelhi.secure;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001b\b\u0000\u0012\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b \u0010$J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/bv3;", "E", "", "Lcom/onedelhi/secure/d1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "f", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/un4;", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "", "g", "", "b", "()I", "size", "Lcom/onedelhi/secure/ic2;", "backing", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class bv3<E> extends C4945d1<E> implements Set<E>, Serializable, yx1 {
    @vr2

    /* renamed from: a */
    public final ic2<E, ?> f26553a;

    public bv3() {
        this(new ic2());
    }

    public bv3(int i) {
        this(new ic2(i));
    }

    public bv3(@vr2 ic2<E, ?> ic2) {
        jt1.m53777p(ic2, "backing");
        this.f26553a = ic2;
    }

    public boolean add(E e) {
        return this.f26553a.mo37973j(e) >= 0;
    }

    public boolean addAll(@vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        this.f26553a.mo37977n();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public int mo32169b() {
        return this.f26553a.size();
    }

    public void clear() {
        this.f26553a.clear();
    }

    public boolean contains(Object obj) {
        return this.f26553a.containsKey(obj);
    }

    @vr2
    /* renamed from: f */
    public final Set<E> mo32172f() {
        this.f26553a.mo37976m();
        return this;
    }

    /* renamed from: g */
    public final Object mo32173g() {
        if (this.f26553a.mo37952E()) {
            return new ku3(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean isEmpty() {
        return this.f26553a.isEmpty();
    }

    @vr2
    public Iterator<E> iterator() {
        return this.f26553a.mo37953F();
    }

    public boolean remove(Object obj) {
        return this.f26553a.mo37960N(obj) >= 0;
    }

    public boolean removeAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f26553a.mo37977n();
        return super.removeAll(collection);
    }

    public boolean retainAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        this.f26553a.mo37977n();
        return super.retainAll(collection);
    }
}
