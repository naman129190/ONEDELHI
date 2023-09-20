package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class gi5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ wi5 f12600a;

    /* renamed from: n */
    public int f12601n = 0;

    public gi5(wi5 wi5) {
        this.f12600a = wi5;
    }

    public final boolean hasNext() {
        return this.f12601n < this.f12600a.f22135b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f12601n;
        if (i < this.f12600a.f22135b.length()) {
            this.f12601n = i + 1;
            return new wi5(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
