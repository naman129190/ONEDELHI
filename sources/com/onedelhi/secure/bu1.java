package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/bu1;", "Lcom/onedelhi/secure/tu1;", "", "cause", "Lcom/onedelhi/secure/un4;", "a1", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class bu1 extends tu1 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26534a = AtomicIntegerFieldUpdater.newUpdater(bu1.class, "_invoked");
    @vr2
    private volatile /* synthetic */ int _invoked = 0;
    @vr2

    /* renamed from: a */
    public final ec1<Throwable, un4> f26535a;

    public bu1(@vr2 ec1<? super Throwable, un4> ec1) {
        this.f26535a = ec1;
    }

    /* renamed from: X */
    public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
        mo32031a1((Throwable) obj);
        return un4.f36206a;
    }

    /* renamed from: a1 */
    public void mo32031a1(@ss2 Throwable th) {
        if (f26534a.compareAndSet(this, 0, 1)) {
            this.f26535a.mo17094X(th);
        }
    }
}
