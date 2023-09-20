package com.onedelhi.secure;

import com.onedelhi.secure.wj0;

public class ll1 extends gx4 {
    public ll1(o60 o60) {
        super(o60);
    }

    /* renamed from: a */
    public void mo13813a(sj0 sj0) {
        C2063ej ejVar = (C2063ej) this.f12807a;
        int p2 = ejVar.mo15205p2();
        int i = 0;
        int i2 = -1;
        for (wj0 wj0 : this.f12808a.f22149b) {
            int i3 = wj0.f22148b;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (p2 == 0 || p2 == 2) {
            this.f12808a.mo14196e(i2 + ejVar.mo15206q2());
        } else {
            this.f12808a.mo14196e(i + ejVar.mo15206q2());
        }
    }

    /* renamed from: d */
    public void mo13814d() {
        gx4 gx4;
        o60 o60 = this.f12807a;
        if (o60 instanceof C2063ej) {
            this.f12808a.f22147a = true;
            C2063ej ejVar = (C2063ej) o60;
            int p2 = ejVar.mo15205p2();
            boolean o2 = ejVar.mo15204o2();
            int i = 0;
            if (p2 == 0) {
                this.f12808a.f22145a = wj0.C3842a.LEFT;
                while (i < ejVar.f16180n0) {
                    o60 o602 = ejVar.f16179c[i];
                    if (o2 || o602.mo21720l0() != 8) {
                        wj0 wj0 = o602.f17750a.f12808a;
                        wj0.f22146a.add(this.f12808a);
                        this.f12808a.f22149b.add(wj0);
                    }
                    i++;
                }
            } else if (p2 != 1) {
                if (p2 == 2) {
                    this.f12808a.f22145a = wj0.C3842a.TOP;
                    while (i < ejVar.f16180n0) {
                        o60 o603 = ejVar.f16179c[i];
                        if (o2 || o603.mo21720l0() != 8) {
                            wj0 wj02 = o603.f17746a.f12808a;
                            wj02.f22146a.add(this.f12808a);
                            this.f12808a.f22149b.add(wj02);
                        }
                        i++;
                    }
                } else if (p2 == 3) {
                    this.f12808a.f22145a = wj0.C3842a.BOTTOM;
                    while (i < ejVar.f16180n0) {
                        o60 o604 = ejVar.f16179c[i];
                        if (o2 || o604.mo21720l0() != 8) {
                            wj0 wj03 = o604.f17746a.f12811b;
                            wj03.f22146a.add(this.f12808a);
                            this.f12808a.f22149b.add(wj03);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                mo19673u(this.f12807a.f17746a.f12808a);
                gx4 = this.f12807a.f17746a;
                mo19673u(gx4.f12811b);
            } else {
                this.f12808a.f22145a = wj0.C3842a.RIGHT;
                while (i < ejVar.f16180n0) {
                    o60 o605 = ejVar.f16179c[i];
                    if (o2 || o605.mo21720l0() != 8) {
                        wj0 wj04 = o605.f17750a.f12811b;
                        wj04.f22146a.add(this.f12808a);
                        this.f12808a.f22149b.add(wj04);
                    }
                    i++;
                }
            }
            mo19673u(this.f12807a.f17750a.f12808a);
            gx4 = this.f12807a.f17750a;
            mo19673u(gx4.f12811b);
        }
    }

    /* renamed from: e */
    public void mo13815e() {
        o60 o60 = this.f12807a;
        if (o60 instanceof C2063ej) {
            int p2 = ((C2063ej) o60).mo15205p2();
            if (p2 == 0 || p2 == 1) {
                this.f12807a.mo21702f2(this.f12808a.f22148b);
            } else {
                this.f12807a.mo21705g2(this.f12808a.f22148b);
            }
        }
    }

    /* renamed from: f */
    public void mo13816f() {
        this.f12805a = null;
        this.f12808a.mo26585c();
    }

    /* renamed from: n */
    public void mo13817n() {
        this.f12808a.f22152c = false;
    }

    /* renamed from: p */
    public boolean mo13818p() {
        return false;
    }

    /* renamed from: u */
    public final void mo19673u(wj0 wj0) {
        this.f12808a.f22146a.add(wj0);
        wj0.f22149b.add(this.f12808a);
    }
}
