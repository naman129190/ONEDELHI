package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lcom/onedelhi/secure/sb4;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lcom/onedelhi/secure/sb4;", "", "e", "(Ljava/lang/ThreadLocal;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/un4;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class tb4 {
    @vr2
    /* renamed from: a */
    public static final <T> sb4<T> m65557a(@vr2 ThreadLocal<T> threadLocal, T t) {
        return new vb4(t, threadLocal);
    }

    /* renamed from: b */
    public static /* synthetic */ sb4 m65558b(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return m65557a(threadLocal, obj);
    }

    @ss2
    /* renamed from: c */
    public static final Object m65559c(@vr2 ThreadLocal<?> threadLocal, @vr2 b80<? super un4> b80) {
        if (b80.mo31187f().get(new xb4(threadLocal)) != null) {
            return un4.f36206a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + b80.mo31187f()).toString());
    }

    /* renamed from: d */
    public static final Object m65560d(ThreadLocal<?> threadLocal, b80<? super un4> b80) {
        uq1.m67404e(3);
        throw null;
    }

    @ss2
    /* renamed from: e */
    public static final Object m65561e(@vr2 ThreadLocal<?> threadLocal, @vr2 b80<? super Boolean> b80) {
        return C7377yn.m71912a(b80.mo31187f().get(new xb4(threadLocal)) != null);
    }

    /* renamed from: f */
    public static final Object m65562f(ThreadLocal<?> threadLocal, b80<? super Boolean> b80) {
        uq1.m67404e(3);
        throw null;
    }
}
