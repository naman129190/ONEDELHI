package com.onedelhi.secure;

import java.util.Iterator;

public final class ag5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f9050a;

    public ag5(Iterator it) {
        this.f9050a = it;
    }

    public final boolean hasNext() {
        return this.f9050a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new wi5((String) this.f9050a.next());
    }
}
