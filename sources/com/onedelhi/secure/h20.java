package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lcom/onedelhi/secure/f20;", "Lcom/onedelhi/secure/nl3;", "result", "", "d", "(Lcom/onedelhi/secure/f20;Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/ru1;", "parent", "a", "value", "b", "(Ljava/lang/Object;)Lcom/onedelhi/secure/f20;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h20 {
    @vr2
    /* renamed from: a */
    public static final <T> f20<T> m50165a(@ss2 ru1 ru1) {
        return new g20(ru1);
    }

    @vr2
    /* renamed from: b */
    public static final <T> f20<T> m50166b(T t) {
        g20 g20 = new g20((ru1) null);
        g20.mo35715l0(t);
        return g20;
    }

    /* renamed from: c */
    public static /* synthetic */ f20 m50167c(ru1 ru1, int i, Object obj) {
        if ((i & 1) != 0) {
            ru1 = null;
        }
        return m50165a(ru1);
    }

    /* renamed from: d */
    public static final <T> boolean m50168d(@vr2 f20<T> f20, @vr2 Object obj) {
        Throwable e = nl3.m58190e(obj);
        return e == null ? f20.mo35715l0(obj) : f20.mo35714g(e);
    }
}
