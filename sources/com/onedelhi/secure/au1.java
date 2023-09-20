package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/au1;", "Lcom/onedelhi/secure/au;", "", "cause", "Lcom/onedelhi/secure/un4;", "a", "", "toString", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class au1 extends C4592au {
    @vr2

    /* renamed from: a */
    public final ec1<Throwable, un4> f26000a;

    public au1(@vr2 ec1<? super Throwable, un4> ec1) {
        this.f26000a = ec1;
    }

    /* renamed from: X */
    public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
        mo31185a((Throwable) obj);
        return un4.f36206a;
    }

    /* renamed from: a */
    public void mo31185a(@ss2 Throwable th) {
        this.f26000a.mo17094X(th);
    }

    @vr2
    public String toString() {
        return "InvokeOnCancel[" + if0.m52224a(this.f26000a) + '@' + if0.m52225b(this) + ']';
    }
}
