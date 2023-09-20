package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/jo4;", "T", "Lcom/onedelhi/secure/w12;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "N1", "", "toString", "", "a", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lcom/onedelhi/secure/cc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class jo4<T> implements w12<T>, Serializable {
    @ss2

    /* renamed from: a */
    public cc1<? extends T> f30892a;
    @ss2

    /* renamed from: a */
    public Object f30893a = bm4.f26441a;

    public jo4(@vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "initializer");
        this.f30892a = cc1;
    }

    /* renamed from: N1 */
    public boolean mo14855N1() {
        return this.f30893a != bm4.f26441a;
    }

    /* renamed from: a */
    public final Object mo38803a() {
        return new lq1(getValue());
    }

    public T getValue() {
        if (this.f30893a == bm4.f26441a) {
            cc1<? extends T> cc1 = this.f30892a;
            jt1.m53774m(cc1);
            this.f30893a = cc1.invoke();
            this.f30892a = null;
        }
        return this.f30893a;
    }

    @vr2
    public String toString() {
        return mo14855N1() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
