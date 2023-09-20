package com.onedelhi.secure;

public abstract class f66 extends h26 {

    /* renamed from: a */
    public boolean f11950a;

    public f66(za6 za6) {
        super(za6);
        this.f11205a.mo27878i();
    }

    /* renamed from: i */
    public final void mo15845i() {
        if (!mo15849m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo15846j() {
        if (this.f11950a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo15779n()) {
            this.f11205a.mo27876g();
            this.f11950a = true;
        }
    }

    /* renamed from: k */
    public final void mo15847k() {
        if (!this.f11950a) {
            mo15848l();
            this.f11205a.mo27876g();
            this.f11950a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    @ly4
    /* renamed from: l */
    public void mo15848l() {
    }

    /* renamed from: m */
    public final boolean mo15849m() {
        return this.f11950a;
    }

    /* renamed from: n */
    public abstract boolean mo15779n();
}
