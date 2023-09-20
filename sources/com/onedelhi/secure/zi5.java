package com.onedelhi.secure;

import java.util.Iterator;

public final class zi5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ hj5 f23733a;

    /* renamed from: a */
    public final Iterator f23734a;

    public zi5(hj5 hj5) {
        this.f23733a = hj5;
        this.f23734a = hj5.f13145a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f23734a.next();
    }

    public final boolean hasNext() {
        return this.f23734a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
