package com.onedelhi.secure;

public abstract class xo6 extends vo6 {

    /* renamed from: a */
    public boolean f22701a;

    public xo6(qq6 qq6) {
        super(qq6);
        this.f21907a.mo23395r();
    }

    /* renamed from: i */
    public final void mo27038i() {
        if (!mo27040k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo27039j() {
        if (!this.f22701a) {
            mo13582l();
            this.f21907a.mo23390m();
            this.f22701a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final boolean mo27040k() {
        return this.f22701a;
    }

    /* renamed from: l */
    public abstract boolean mo13582l();
}
