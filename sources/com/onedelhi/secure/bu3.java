package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@ml3
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/bu3;", "T", "", "value", "Lcom/onedelhi/secure/un4;", "h", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "iterator", "m", "(Ljava/util/Iterator;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "elements", "l", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/zt3;", "sequence", "i", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class bu3<T> {
    @ss2
    /* renamed from: h */
    public abstract Object mo31188h(T t, @vr2 b80<? super un4> b80);

    @ss2
    /* renamed from: i */
    public final Object mo32032i(@vr2 zt3<? extends T> zt3, @vr2 b80<? super un4> b80) {
        Object m = mo31190m(zt3.iterator(), b80);
        return m == mt1.m57558h() ? m : un4.f36206a;
    }

    @ss2
    /* renamed from: l */
    public final Object mo32033l(@vr2 Iterable<? extends T> iterable, @vr2 b80<? super un4> b80) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return un4.f36206a;
        }
        Object m = mo31190m(iterable.iterator(), b80);
        return m == mt1.m57558h() ? m : un4.f36206a;
    }

    @ss2
    /* renamed from: m */
    public abstract Object mo31190m(@vr2 Iterator<? extends T> it, @vr2 b80<? super un4> b80);
}
