package com.onedelhi.secure;

public final class fo6 {

    /* renamed from: a */
    public do6 f12248a;

    /* renamed from: a */
    public final /* synthetic */ no6 f12249a;

    public fo6(no6 no6) {
        this.f12249a = no6;
    }

    @ly4
    /* renamed from: a */
    public final void mo16129a(long j) {
        this.f12248a = new do6(this, this.f12249a.f11205a.mo15133a().currentTimeMillis(), j);
        this.f12249a.f17505a.postDelayed(this.f12248a, 2000);
    }

    @ly4
    /* renamed from: b */
    public final void mo16130b() {
        this.f12249a.mo15139h();
        do6 do6 = this.f12248a;
        if (do6 != null) {
            this.f12249a.f17505a.removeCallbacks(do6);
        }
        this.f12249a.f11205a.mo27864F().f18954c.mo27237a(false);
    }
}
