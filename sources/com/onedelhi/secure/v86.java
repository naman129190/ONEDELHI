package com.onedelhi.secure;

import java.util.List;

public final class v86 implements h07 {

    /* renamed from: a */
    public final /* synthetic */ b96 f21713a;

    public v86(b96 b96) {
        this.f21713a = b96;
    }

    /* renamed from: a */
    public final void mo17036a(int i, String str, List list, boolean z, boolean z2) {
        u46 u46;
        int i2 = i - 1;
        if (i2 == 0) {
            u46 = this.f21713a.f11205a.mo15136e().mo12725q();
        } else if (i2 == 1) {
            a56 e = this.f21713a.f11205a.mo15136e();
            u46 = z ? e.mo12728t() : !z2 ? e.mo12727s() : e.mo12726r();
        } else if (i2 == 3) {
            u46 = this.f21713a.f11205a.mo15136e().mo12730v();
        } else if (i2 != 4) {
            u46 = this.f21713a.f11205a.mo15136e().mo12729u();
        } else {
            a56 e2 = this.f21713a.f11205a.mo15136e();
            u46 = z ? e2.mo12733y() : !z2 ? e2.mo12732x() : e2.mo12731w();
        }
        int size = list.size();
        if (size == 1) {
            u46.mo25380b(str, list.get(0));
        } else if (size == 2) {
            u46.mo25381c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u46.mo25379a(str);
        } else {
            u46.mo25382d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
