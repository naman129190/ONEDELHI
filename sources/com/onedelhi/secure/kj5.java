package com.onedelhi.secure;

import java.util.NoSuchElementException;

public final class kj5 extends qk5 {

    /* renamed from: a */
    public final /* synthetic */ Object f14910a;

    /* renamed from: b */
    public boolean f14911b;

    public kj5(Object obj) {
        this.f14910a = obj;
    }

    public final boolean hasNext() {
        return !this.f14911b;
    }

    public final Object next() {
        if (!this.f14911b) {
            this.f14911b = true;
            return this.f14910a;
        }
        throw new NoSuchElementException();
    }
}
