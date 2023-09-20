package com.onedelhi.secure;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ku2 {

    /* renamed from: a */
    public CopyOnWriteArrayList<C2365hu> f15076a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public boolean f15077a;

    public ku2(boolean z) {
        this.f15077a = z;
    }

    /* renamed from: a */
    public void mo19196a(@mr2 C2365hu huVar) {
        this.f15076a.add(huVar);
    }

    @bc2
    /* renamed from: b */
    public abstract void mo4640b();

    @bc2
    /* renamed from: c */
    public final boolean mo19197c() {
        return this.f15077a;
    }

    @bc2
    /* renamed from: d */
    public final void mo19198d() {
        Iterator<C2365hu> it = this.f15076a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    public void mo19199e(@mr2 C2365hu huVar) {
        this.f15076a.remove(huVar);
    }

    @bc2
    /* renamed from: f */
    public final void mo19200f(boolean z) {
        this.f15077a = z;
    }
}
