package com.onedelhi.secure;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class uj2 {

    /* renamed from: a */
    public final C3042oa<sl2, List<Class<?>>> f21407a = new C3042oa<>();

    /* renamed from: a */
    public final AtomicReference<sl2> f21408a = new AtomicReference<>();

    /* renamed from: a */
    public void mo25641a() {
        synchronized (this.f21407a) {
            this.f21407a.clear();
        }
    }

    @ts2
    /* renamed from: b */
    public List<Class<?>> mo25642b(@mr2 Class<?> cls, @mr2 Class<?> cls2, @mr2 Class<?> cls3) {
        List<Class<?>> list;
        sl2 andSet = this.f21408a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new sl2(cls, cls2, cls3);
        } else {
            andSet.mo24477b(cls, cls2, cls3);
        }
        synchronized (this.f21407a) {
            list = this.f21407a.get(andSet);
        }
        this.f21408a.set(andSet);
        return list;
    }

    /* renamed from: c */
    public void mo25643c(@mr2 Class<?> cls, @mr2 Class<?> cls2, @mr2 Class<?> cls3, @mr2 List<Class<?>> list) {
        synchronized (this.f21407a) {
            this.f21407a.put(new sl2(cls, cls2, cls3), list);
        }
    }
}
