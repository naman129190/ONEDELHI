package com.onedelhi.secure;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/l60;", "T", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "<init>", "(Lcom/onedelhi/secure/zt3;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class l60<T> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final AtomicReference<zt3<T>> f31568a;

    public l60(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "sequence");
        this.f31568a = new AtomicReference<>(zt3);
    }

    @vr2
    public Iterator<T> iterator() {
        zt3 andSet = this.f31568a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
