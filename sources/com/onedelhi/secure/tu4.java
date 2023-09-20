package com.onedelhi.secure;

import com.onedelhi.secure.av4;

public class tu4<R> implements kh4<R> {

    /* renamed from: a */
    public final av4.C1736a f21135a;

    /* renamed from: a */
    public av4<R> f21136a;

    public tu4(av4.C1736a aVar) {
        this.f21135a = aVar;
    }

    /* renamed from: a */
    public jh4<R> mo16140a(vd0 vd0, boolean z) {
        if (vd0 == vd0.MEMORY_CACHE || !z) {
            return fr2.m15244b();
        }
        if (this.f21136a == null) {
            this.f21136a = new av4<>(this.f21135a);
        }
        return this.f21136a;
    }
}
