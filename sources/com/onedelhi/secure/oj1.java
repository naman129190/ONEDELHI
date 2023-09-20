package com.onedelhi.secure;

public class oj1 extends gx4 {
    public oj1(o60 o60) {
        super(o60);
        o60.f17750a.mo13816f();
        o60.f17746a.mo13816f();
        this.f12810b = ((nj1) o60).mo21322m2();
    }

    /* renamed from: a */
    public void mo13813a(sj0 sj0) {
        wj0 wj0 = this.f12808a;
        if (wj0.f22150b && !wj0.f22152c) {
            this.f12808a.mo14196e((int) ((((float) wj0.f22149b.get(0).f22148b) * ((nj1) this.f12807a).mo21326q2()) + 0.5f));
        }
    }

    /* renamed from: d */
    public void mo13814d() {
        gx4 gx4;
        wj0 wj0;
        wj0 wj02;
        nj1 nj1 = (nj1) this.f12807a;
        int n2 = nj1.mo21323n2();
        int p2 = nj1.mo21325p2();
        nj1.mo21326q2();
        if (nj1.mo21322m2() == 1) {
            wj0 wj03 = this.f12808a;
            if (n2 != -1) {
                wj03.f22149b.add(this.f12807a.f17749a.f17750a.f12808a);
                this.f12807a.f17749a.f17750a.f12808a.f22146a.add(this.f12808a);
                wj02 = this.f12808a;
            } else if (p2 != -1) {
                wj03.f22149b.add(this.f12807a.f17749a.f17750a.f12811b);
                this.f12807a.f17749a.f17750a.f12811b.f22146a.add(this.f12808a);
                wj02 = this.f12808a;
                n2 = -p2;
            } else {
                wj03.f22147a = true;
                wj03.f22149b.add(this.f12807a.f17749a.f17750a.f12811b);
                this.f12807a.f17749a.f17750a.f12811b.f22146a.add(this.f12808a);
                mo21959u(this.f12807a.f17750a.f12808a);
                gx4 = this.f12807a.f17750a;
            }
            wj02.f22141a = n2;
            mo21959u(this.f12807a.f17750a.f12808a);
            gx4 = this.f12807a.f17750a;
        } else {
            wj0 wj04 = this.f12808a;
            if (n2 != -1) {
                wj04.f22149b.add(this.f12807a.f17749a.f17746a.f12808a);
                this.f12807a.f17749a.f17746a.f12808a.f22146a.add(this.f12808a);
                wj0 = this.f12808a;
            } else if (p2 != -1) {
                wj04.f22149b.add(this.f12807a.f17749a.f17746a.f12811b);
                this.f12807a.f17749a.f17746a.f12811b.f22146a.add(this.f12808a);
                wj0 = this.f12808a;
                n2 = -p2;
            } else {
                wj04.f22147a = true;
                wj04.f22149b.add(this.f12807a.f17749a.f17746a.f12811b);
                this.f12807a.f17749a.f17746a.f12811b.f22146a.add(this.f12808a);
                mo21959u(this.f12807a.f17746a.f12808a);
                gx4 = this.f12807a.f17746a;
            }
            wj0.f22141a = n2;
            mo21959u(this.f12807a.f17746a.f12808a);
            gx4 = this.f12807a.f17746a;
        }
        mo21959u(gx4.f12811b);
    }

    /* renamed from: e */
    public void mo13815e() {
        if (((nj1) this.f12807a).mo21322m2() == 1) {
            this.f12807a.mo21702f2(this.f12808a.f22148b);
        } else {
            this.f12807a.mo21705g2(this.f12808a.f22148b);
        }
    }

    /* renamed from: f */
    public void mo13816f() {
        this.f12808a.mo26585c();
    }

    /* renamed from: n */
    public void mo13817n() {
        this.f12808a.f22152c = false;
        this.f12811b.f22152c = false;
    }

    /* renamed from: p */
    public boolean mo13818p() {
        return false;
    }

    /* renamed from: u */
    public final void mo21959u(wj0 wj0) {
        this.f12808a.f22146a.add(wj0);
        wj0.f22149b.add(this.f12808a);
    }
}
