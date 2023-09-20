package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicLong;

public class na4 implements C2106ez {

    /* renamed from: a */
    public final AtomicLong f17259a;

    public na4(long j) {
        this.f17259a = new AtomicLong(j);
    }

    /* renamed from: a */
    public long mo15656a() {
        return this.f17259a.get();
    }

    /* renamed from: b */
    public void mo21025b(long j) {
        if (j >= 0) {
            this.f17259a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    /* renamed from: c */
    public void mo21026c() {
        mo21025b(1);
    }
}
