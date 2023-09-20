package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/rb;", "", "Lcom/onedelhi/secure/vb;", "op", "c", "failure", "Lcom/onedelhi/secure/un4;", "a", "atomicOp", "Lcom/onedelhi/secure/vb;", "b", "()Lcom/onedelhi/secure/vb;", "d", "(Lcom/onedelhi/secure/vb;)V", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.rb */
public abstract class C6656rb {

    /* renamed from: a */
    public C7022vb<?> f34548a;

    /* renamed from: a */
    public abstract void mo31079a(@vr2 C7022vb<?> vbVar, @ss2 Object obj);

    @vr2
    /* renamed from: b */
    public final C7022vb<?> mo43833b() {
        C7022vb<?> vbVar = this.f34548a;
        if (vbVar != null) {
            return vbVar;
        }
        jt1.m53761S("atomicOp");
        return null;
    }

    @ss2
    /* renamed from: c */
    public abstract Object mo31080c(@vr2 C7022vb<?> vbVar);

    /* renamed from: d */
    public final void mo43834d(@vr2 C7022vb<?> vbVar) {
        this.f34548a = vbVar;
    }
}
