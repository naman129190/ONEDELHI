package com.onedelhi.secure;

import java.util.Iterator;

public final class tu6 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ uu6 f21139a;

    /* renamed from: a */
    public final Iterator f21140a;

    public tu6(uu6 uu6) {
        this.f21139a = uu6;
        this.f21140a = uu6.f21528a.iterator();
    }

    public final boolean hasNext() {
        return this.f21140a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f21140a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
