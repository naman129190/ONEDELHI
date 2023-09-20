package com.onedelhi.secure;

import java.util.NoSuchElementException;

public final class zk6 extends jl6 {

    /* renamed from: a */
    public final /* synthetic */ Object f23802a;

    /* renamed from: b */
    public boolean f23803b;

    public zk6(Object obj) {
        this.f23802a = obj;
    }

    public final boolean hasNext() {
        return !this.f23803b;
    }

    public final Object next() {
        if (!this.f23803b) {
            this.f23803b = true;
            return this.f23802a;
        }
        throw new NoSuchElementException();
    }
}
