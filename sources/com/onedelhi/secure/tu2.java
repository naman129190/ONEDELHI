package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicInteger;

public final class tu2 {

    /* renamed from: a */
    public final AtomicInteger f35789a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f35790b = new AtomicInteger();

    /* renamed from: a */
    public int mo45311a() {
        return this.f35790b.get();
    }

    /* renamed from: b */
    public int mo45312b() {
        return this.f35789a.get();
    }

    /* renamed from: c */
    public void mo45313c() {
        this.f35790b.getAndIncrement();
    }

    /* renamed from: d */
    public void mo45314d() {
        this.f35789a.getAndIncrement();
    }

    /* renamed from: e */
    public void mo45315e() {
        this.f35790b.set(0);
    }
}
