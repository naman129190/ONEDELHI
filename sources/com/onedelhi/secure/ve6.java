package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ve6 extends AbstractList implements RandomAccess, f76 {

    /* renamed from: a */
    public final f76 f21741a;

    public ve6(f76 f76) {
        this.f21741a = f76;
    }

    /* renamed from: e0 */
    public final List mo14058e0() {
        return this.f21741a.mo14058e0();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((c76) this.f21741a).get(i);
    }

    public final Iterator iterator() {
        return new se6(this);
    }

    /* renamed from: j2 */
    public final f76 mo14060j2() {
        return this;
    }

    public final ListIterator listIterator(int i) {
        return new pe6(this, i);
    }

    public final int size() {
        return this.f21741a.size();
    }
}
