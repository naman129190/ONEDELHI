package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\r\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/xb4;", "Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/vb4;", "Ljava/lang/ThreadLocal;", "threadLocal", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@z73
public final class xb4 implements b90.C4636c<vb4<?>> {
    @vr2

    /* renamed from: a */
    public final ThreadLocal<?> f37377a;

    public xb4(@vr2 ThreadLocal<?> threadLocal) {
        this.f37377a = threadLocal;
    }

    /* renamed from: c */
    public static /* synthetic */ xb4 m70120c(xb4 xb4, ThreadLocal<?> threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = xb4.f37377a;
        }
        return xb4.mo47123b(threadLocal);
    }

    /* renamed from: a */
    public final ThreadLocal<?> mo47122a() {
        return this.f37377a;
    }

    @vr2
    /* renamed from: b */
    public final xb4 mo47123b(@vr2 ThreadLocal<?> threadLocal) {
        return new xb4(threadLocal);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xb4) && jt1.m53768g(this.f37377a, ((xb4) obj).f37377a);
    }

    public int hashCode() {
        return this.f37377a.hashCode();
    }

    @vr2
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f37377a + ')';
    }
}
