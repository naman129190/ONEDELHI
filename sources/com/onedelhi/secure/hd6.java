package com.onedelhi.secure;

public abstract class hd6 extends ed6 {

    /* renamed from: a */
    public boolean f13061a;

    public hd6(za6 za6) {
        super(za6);
        this.f11205a.mo27878i();
    }

    /* renamed from: i */
    public void mo16877i() {
    }

    /* renamed from: j */
    public abstract boolean mo12724j();

    /* renamed from: k */
    public final void mo17201k() {
        if (!mo17204n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo17202l() {
        if (this.f13061a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo12724j()) {
            this.f11205a.mo27876g();
            this.f13061a = true;
        }
    }

    /* renamed from: m */
    public final void mo17203m() {
        if (!this.f13061a) {
            mo16877i();
            this.f11205a.mo27876g();
            this.f13061a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: n */
    public final boolean mo17204n() {
        return this.f13061a;
    }
}
