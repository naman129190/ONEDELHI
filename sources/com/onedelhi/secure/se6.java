package com.onedelhi.secure;

import java.util.Iterator;

public final class se6 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ ve6 f20323a;

    /* renamed from: a */
    public final Iterator f20324a;

    public se6(ve6 ve6) {
        this.f20323a = ve6;
        this.f20324a = ve6.f21741a.iterator();
    }

    public final boolean hasNext() {
        return this.f20324a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f20324a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
