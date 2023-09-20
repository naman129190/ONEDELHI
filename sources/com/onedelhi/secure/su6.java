package com.onedelhi.secure;

import java.util.ListIterator;

public final class su6 implements ListIterator {

    /* renamed from: a */
    public final /* synthetic */ uu6 f20521a;

    /* renamed from: a */
    public final ListIterator f20522a;

    /* renamed from: n */
    public final /* synthetic */ int f20523n;

    public su6(uu6 uu6, int i) {
        this.f20521a = uu6;
        this.f20523n = i;
        this.f20522a = uu6.f21528a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f20522a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f20522a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f20522a.next();
    }

    public final int nextIndex() {
        return this.f20522a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f20522a.previous();
    }

    public final int previousIndex() {
        return this.f20522a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
