package com.onedelhi.secure;

public final class gs5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lx5 f12749a;

    /* renamed from: a */
    public final /* synthetic */ w94 f12750a;

    public gs5(lx5 lx5, w94 w94) {
        this.f12749a = lx5;
        this.f12750a = w94;
    }

    public final void run() {
        if (this.f12750a.mo17588t()) {
            this.f12749a.f15662a.mo17562A();
            return;
        }
        try {
            this.f12749a.f15662a.mo17594z(this.f12749a.f15661a.then(this.f12750a));
        } catch (po3 e) {
            if (e.getCause() instanceof Exception) {
                this.f12749a.f15662a.mo17593y((Exception) e.getCause());
            } else {
                this.f12749a.f15662a.mo17593y(e);
            }
        } catch (Exception e2) {
            this.f12749a.f15662a.mo17593y(e2);
        }
    }
}
