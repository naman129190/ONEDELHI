package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/t84;", "T", "Lcom/onedelhi/secure/w12;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "N1", "", "toString", "", "a", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "lock", "<init>", "(Lcom/onedelhi/secure/cc1;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class t84<T> implements w12<T>, Serializable {
    @ss2

    /* renamed from: a */
    public cc1<? extends T> f35513a;
    @ss2

    /* renamed from: a */
    public volatile Object f35514a;
    @vr2

    /* renamed from: b */
    public final Object f35515b;

    public t84(@vr2 cc1<? extends T> cc1, @ss2 Object obj) {
        jt1.m53777p(cc1, "initializer");
        this.f35513a = cc1;
        this.f35514a = bm4.f26441a;
        this.f35515b = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t84(cc1 cc1, Object obj, int i, wg0 wg0) {
        this(cc1, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: N1 */
    public boolean mo14855N1() {
        return this.f35514a != bm4.f26441a;
    }

    /* renamed from: a */
    public final Object mo44946a() {
        return new lq1(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this.f35514a;
        T t3 = bm4.f26441a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f35515b) {
            t = this.f35514a;
            if (t == t3) {
                cc1 cc1 = this.f35513a;
                jt1.m53774m(cc1);
                t = cc1.invoke();
                this.f35514a = t;
                this.f35513a = null;
            }
        }
        return t;
    }

    @vr2
    public String toString() {
        return mo14855N1() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
