package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/kn0;", "T", "K", "Lcom/onedelhi/secure/zt3;", "", "iterator", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class kn0<T, K> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final ec1<T, K> f31259a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f31260a;

    public kn0(@vr2 zt3<? extends T> zt3, @vr2 ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(zt3, "source");
        jt1.m53777p(ec1, "keySelector");
        this.f31260a = zt3;
        this.f31259a = ec1;
    }

    @vr2
    public Iterator<T> iterator() {
        return new jn0(this.f31260a.iterator(), this.f31259a);
    }
}
