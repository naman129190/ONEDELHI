package com.onedelhi.secure;

import com.onedelhi.secure.wj0;

public class cl0 extends wj0 {

    /* renamed from: d */
    public int f10315d;

    public cl0(gx4 gx4) {
        super(gx4);
        this.f22145a = gx4 instanceof ul1 ? wj0.C3842a.HORIZONTAL_DIMENSION : wj0.C3842a.VERTICAL_DIMENSION;
    }

    /* renamed from: e */
    public void mo14196e(int i) {
        if (!this.f22152c) {
            this.f22152c = true;
            this.f22148b = i;
            for (sj0 next : this.f22146a) {
                next.mo13813a(next);
            }
        }
    }
}
