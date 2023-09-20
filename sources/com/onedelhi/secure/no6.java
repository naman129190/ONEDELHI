package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;

public final class no6 extends f66 {

    /* renamed from: a */
    public Handler f17505a;

    /* renamed from: a */
    public final fo6 f17506a = new fo6(this);

    /* renamed from: a */
    public final jo6 f17507a = new jo6(this);

    /* renamed from: a */
    public final lo6 f17508a = new lo6(this);

    public no6(za6 za6) {
        super(za6);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m23078q(no6 no6, long j) {
        no6.mo15139h();
        no6.mo21389s();
        no6.f11205a.mo15136e().mo12730v().mo25380b("Activity paused, time", Long.valueOf(j));
        no6.f17506a.mo16129a(j);
        if (no6.f11205a.mo27891z().mo14112D()) {
            no6.f17507a.mo18531b(j);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m23079r(no6 no6, long j) {
        no6.mo15139h();
        no6.mo21389s();
        no6.f11205a.mo15136e().mo12730v().mo25380b("Activity resumed, time", Long.valueOf(j));
        if (no6.f11205a.mo27891z().mo14112D() || no6.f11205a.mo27864F().f18954c.mo27238b()) {
            no6.f17507a.mo18532c(j);
        }
        no6.f17506a.mo16130b();
        lo6 lo6 = no6.f17508a;
        lo6.f15523a.mo15139h();
        if (lo6.f15523a.f11205a.mo27884o()) {
            lo6.mo19746b(lo6.f15523a.f11205a.mo15133a().currentTimeMillis(), false);
        }
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return false;
    }

    @ly4
    /* renamed from: s */
    public final void mo21389s() {
        mo15139h();
        if (this.f17505a == null) {
            this.f17505a = new gr5(Looper.getMainLooper());
        }
    }
}
