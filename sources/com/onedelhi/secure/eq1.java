package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/eq1;", "T", "", "Lcom/onedelhi/secure/cq1;", "", "hasNext", "a", "iterator", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class eq1<T> implements Iterator<cq1<? extends T>>, nx1 {
    @vr2

    /* renamed from: a */
    public final Iterator<T> f28033a;

    /* renamed from: n */
    public int f28034n;

    public eq1(@vr2 Iterator<? extends T> it) {
        jt1.m53777p(it, "iterator");
        this.f28033a = it;
    }

    @vr2
    /* renamed from: a */
    public final cq1<T> next() {
        int i = this.f28034n;
        this.f28034n = i + 1;
        if (i < 0) {
            s00.m64055X();
        }
        return new cq1<>(i, this.f28033a.next());
    }

    public final boolean hasNext() {
        return this.f28033a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
