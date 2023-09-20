package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class oi5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ wi5 f17982a;

    /* renamed from: n */
    public int f17983n = 0;

    public oi5(wi5 wi5) {
        this.f17982a = wi5;
    }

    public final boolean hasNext() {
        return this.f17983n < this.f17982a.f22135b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f17983n;
        wi5 wi5 = this.f17982a;
        if (i < wi5.f22135b.length()) {
            String i2 = wi5.f22135b;
            this.f17983n = i + 1;
            return new wi5(String.valueOf(i2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
