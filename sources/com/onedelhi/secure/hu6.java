package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Map;

public final class hu6 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ lu6 f13258a;

    /* renamed from: a */
    public Iterator f13259a;

    /* renamed from: b */
    public boolean f13260b;

    /* renamed from: n */
    public int f13261n = -1;

    public /* synthetic */ hu6(lu6 lu6, gu6 gu6) {
        this.f13258a = lu6;
    }

    /* renamed from: a */
    public final Iterator mo17414a() {
        if (this.f13259a == null) {
            this.f13259a = this.f13258a.f15634a.entrySet().iterator();
        }
        return this.f13259a;
    }

    public final boolean hasNext() {
        if (this.f13261n + 1 >= this.f13258a.f15633a.size()) {
            return !this.f13258a.f15634a.isEmpty() && mo17414a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f13260b = true;
        int i = this.f13261n + 1;
        this.f13261n = i;
        return (Map.Entry) (i < this.f13258a.f15633a.size() ? this.f13258a.f15633a.get(this.f13261n) : mo17414a().next());
    }

    public final void remove() {
        if (this.f13260b) {
            this.f13260b = false;
            this.f13258a.mo19916r();
            if (this.f13261n < this.f13258a.f15633a.size()) {
                lu6 lu6 = this.f13258a;
                int i = this.f13261n;
                this.f13261n = i - 1;
                Object unused = lu6.mo19913p(i);
                return;
            }
            mo17414a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
