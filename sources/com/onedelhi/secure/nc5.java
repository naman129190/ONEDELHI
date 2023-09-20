package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class nc5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f17318a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f17319b;

    public nc5(ld5 ld5, Iterator it, Iterator it2) {
        this.f17318a = it;
        this.f17319b = it2;
    }

    public final boolean hasNext() {
        if (this.f17318a.hasNext()) {
            return true;
        }
        return this.f17319b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f17318a.hasNext()) {
            return new wi5(((Integer) this.f17318a.next()).toString());
        }
        if (this.f17319b.hasNext()) {
            return new wi5((String) this.f17319b.next());
        }
        throw new NoSuchElementException();
    }
}
