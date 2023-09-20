package com.onedelhi.secure;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\nB\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/qq3;", "T", "Lcom/onedelhi/secure/w12;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "N1", "", "toString", "", "a", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lcom/onedelhi/secure/cc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class qq3<T> implements w12<T>, Serializable {
    @vr2

    /* renamed from: a */
    public static final C6594a f34323a = new C6594a((wg0) null);

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater<qq3<?>, Object> f34324a = AtomicReferenceFieldUpdater.newUpdater(qq3.class, Object.class, "a");
    @ss2

    /* renamed from: a */
    public volatile cc1<? extends T> f34325a;
    @ss2

    /* renamed from: a */
    public volatile Object f34326a;
    @vr2

    /* renamed from: b */
    public final Object f34327b;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/qq3$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lcom/onedelhi/secure/qq3;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.qq3$a */
    public static final class C6594a {
        public C6594a() {
        }

        public /* synthetic */ C6594a(wg0 wg0) {
            this();
        }
    }

    public qq3(@vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "initializer");
        this.f34325a = cc1;
        bm4 bm4 = bm4.f26441a;
        this.f34326a = bm4;
        this.f34327b = bm4;
    }

    /* renamed from: N1 */
    public boolean mo14855N1() {
        return this.f34326a != bm4.f26441a;
    }

    /* renamed from: a */
    public final Object mo43688a() {
        return new lq1(getValue());
    }

    public T getValue() {
        T t = this.f34326a;
        T t2 = bm4.f26441a;
        if (t != t2) {
            return t;
        }
        cc1<? extends T> cc1 = this.f34325a;
        if (cc1 != null) {
            T invoke = cc1.invoke();
            if (C5759j1.m52871a(f34324a, this, t2, invoke)) {
                this.f34325a = null;
                return invoke;
            }
        }
        return this.f34326a;
    }

    @vr2
    public String toString() {
        return mo14855N1() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
