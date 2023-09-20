package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/wr2;", "", "T", "Lcom/onedelhi/secure/tf3;", "thisRef", "Lcom/onedelhi/secure/ay1;", "property", "a", "(Ljava/lang/Object;Lcom/onedelhi/secure/ay1;)Ljava/lang/Object;", "value", "Lcom/onedelhi/secure/un4;", "b", "(Ljava/lang/Object;Lcom/onedelhi/secure/ay1;Ljava/lang/Object;)V", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class wr2<T> implements tf3<Object, T> {
    @ss2

    /* renamed from: a */
    public T f37103a;

    @vr2
    /* renamed from: a */
    public T mo43890a(@ss2 Object obj, @vr2 ay1<?> ay1) {
        jt1.m53777p(ay1, "property");
        T t = this.f37103a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + ay1.getName() + " should be initialized before get.");
    }

    /* renamed from: b */
    public void mo44977b(@ss2 Object obj, @vr2 ay1<?> ay1, @vr2 T t) {
        jt1.m53777p(ay1, "property");
        jt1.m53777p(t, "value");
        this.f37103a = t;
    }
}
