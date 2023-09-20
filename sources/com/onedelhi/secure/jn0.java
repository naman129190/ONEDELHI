package com.onedelhi.secure;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/jn0;", "T", "K", "Lcom/onedelhi/secure/s0;", "Lcom/onedelhi/secure/un4;", "a", "", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Ljava/util/Iterator;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class jn0<T, K> extends C6725s0<T> {
    @vr2

    /* renamed from: a */
    public final ec1<T, K> f30871a;
    @vr2

    /* renamed from: a */
    public final HashSet<K> f30872a = new HashSet<>();
    @vr2

    /* renamed from: a */
    public final Iterator<T> f30873a;

    public jn0(@vr2 Iterator<? extends T> it, @vr2 ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(it, "source");
        jt1.m53777p(ec1, "keySelector");
        this.f30873a = it;
        this.f30871a = ec1;
    }

    /* renamed from: a */
    public void mo38786a() {
        while (this.f30873a.hasNext()) {
            T next = this.f30873a.next();
            if (this.f30872a.add(this.f30871a.mo17094X(next))) {
                mo44121d(next);
                return;
            }
        }
        mo44120b();
    }
}
