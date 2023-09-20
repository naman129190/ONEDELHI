package com.onedelhi.secure;

public final class li6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f15421a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15422b;

    public li6(ri6 ri6, boolean z) {
        this.f15421a = ri6;
        this.f15422b = z;
    }

    public final void run() {
        boolean o = this.f15421a.f11205a.mo27884o();
        boolean n = this.f15421a.f11205a.mo27883n();
        this.f15421a.f11205a.mo27880k(this.f15422b);
        if (n == this.f15422b) {
            this.f15421a.f11205a.mo15136e().mo12730v().mo25380b("Default data collection state already set to", Boolean.valueOf(this.f15422b));
        }
        if (this.f15421a.f11205a.mo27884o() == o || this.f15421a.f11205a.mo27884o() != this.f15421a.f11205a.mo27883n()) {
            this.f15421a.f11205a.mo15136e().mo12732x().mo25381c("Default data collection is different than actual status", Boolean.valueOf(this.f15422b), Boolean.valueOf(o));
        }
        this.f15421a.mo23890P();
    }
}
