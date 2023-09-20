package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\b\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/wb4;", "", "Lcom/onedelhi/secure/vv0;", "a", "()Lcom/onedelhi/secure/vv0;", "Lcom/onedelhi/secure/un4;", "c", "()V", "eventLoop", "d", "(Lcom/onedelhi/secure/vv0;)V", "b", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class wb4 {
    @vr2

    /* renamed from: a */
    public static final wb4 f36943a = new wb4();
    @vr2

    /* renamed from: a */
    public static final ThreadLocal<vv0> f36944a = new ThreadLocal<>();

    @ss2
    /* renamed from: a */
    public final vv0 mo46667a() {
        return f36944a.get();
    }

    @vr2
    /* renamed from: b */
    public final vv0 mo46668b() {
        ThreadLocal<vv0> threadLocal = f36944a;
        vv0 vv0 = threadLocal.get();
        if (vv0 != null) {
            return vv0;
        }
        vv0 a = yv0.m72252a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo46669c() {
        f36944a.set((Object) null);
    }

    /* renamed from: d */
    public final void mo46670d(@vr2 vv0 vv0) {
        f36944a.set(vv0);
    }
}
