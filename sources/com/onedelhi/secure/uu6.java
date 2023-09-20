package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class uu6 extends AbstractList implements RandomAccess, kr6 {

    /* renamed from: a */
    public final kr6 f21528a;

    public uu6(kr6 kr6) {
        this.f21528a = kr6;
    }

    /* renamed from: X */
    public final List mo18557X() {
        return this.f21528a.mo18557X();
    }

    /* renamed from: c2 */
    public final kr6 mo18559c2() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((jr6) this.f21528a).get(i);
    }

    /* renamed from: h */
    public final void mo18563h(on6 on6) {
        throw new UnsupportedOperationException();
    }

    public final Iterator iterator() {
        return new tu6(this);
    }

    public final ListIterator listIterator(int i) {
        return new su6(this, i);
    }

    public final int size() {
        return this.f21528a.size();
    }

    /* renamed from: u0 */
    public final Object mo18565u0(int i) {
        return this.f21528a.mo18565u0(i);
    }
}
