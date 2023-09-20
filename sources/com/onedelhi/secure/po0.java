package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0003¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/po0;", "Lcom/onedelhi/secure/b90;", "R", "initial", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b90$b;", "operation", "fold", "(Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "minusKey", "context", "plus", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lcom/onedelhi/secure/b90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class po0 implements b90 {

    /* renamed from: a */
    public final /* synthetic */ b90 f33747a;
    @rw1
    @vr2

    /* renamed from: a */
    public final Throwable f33748a;

    public po0(@vr2 Throwable th, @vr2 b90 b90) {
        this.f33748a = th;
        this.f33747a = b90;
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        return this.f33747a.fold(r, sc1);
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        return this.f33747a.get(cVar);
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        return this.f33747a.minusKey(cVar);
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        return this.f33747a.plus(b90);
    }
}
