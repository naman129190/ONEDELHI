package com.onedelhi.secure;

import java.util.ListIterator;

public final class pe6 implements ListIterator {

    /* renamed from: a */
    public final /* synthetic */ ve6 f18496a;

    /* renamed from: a */
    public final ListIterator f18497a;

    /* renamed from: n */
    public final /* synthetic */ int f18498n;

    public pe6(ve6 ve6, int i) {
        this.f18496a = ve6;
        this.f18498n = i;
        this.f18497a = ve6.f21741a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f18497a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f18497a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f18497a.next();
    }

    public final int nextIndex() {
        return this.f18497a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f18497a.previous();
    }

    public final int previousIndex() {
        return this.f18497a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
