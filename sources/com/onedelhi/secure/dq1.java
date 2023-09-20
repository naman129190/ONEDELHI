package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/dq1;", "T", "", "Lcom/onedelhi/secure/cq1;", "", "iterator", "Lkotlin/Function0;", "iteratorFactory", "<init>", "(Lcom/onedelhi/secure/cc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class dq1<T> implements Iterable<cq1<? extends T>>, nx1 {
    @vr2

    /* renamed from: a */
    public final cc1<Iterator<T>> f27593a;

    public dq1(@vr2 cc1<? extends Iterator<? extends T>> cc1) {
        jt1.m53777p(cc1, "iteratorFactory");
        this.f27593a = cc1;
    }

    @vr2
    public Iterator<cq1<T>> iterator() {
        return new eq1(this.f27593a.invoke());
    }
}
