package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

public final class jo6 {
    @VisibleForTesting

    /* renamed from: a */
    public long f14359a;

    /* renamed from: a */
    public final /* synthetic */ no6 f14360a;

    /* renamed from: a */
    public final th5 f14361a;
    @VisibleForTesting

    /* renamed from: b */
    public long f14362b;

    public jo6(no6 no6) {
        this.f14360a = no6;
        this.f14361a = new ho6(this, no6.f11205a);
        long elapsedRealtime = no6.f11205a.mo15133a().elapsedRealtime();
        this.f14359a = elapsedRealtime;
        this.f14362b = elapsedRealtime;
    }

    /* renamed from: a */
    public final void mo18530a() {
        this.f14361a.mo25025b();
        this.f14359a = 0;
        this.f14362b = 0;
    }

    @ly4
    /* renamed from: b */
    public final void mo18531b(long j) {
        this.f14361a.mo25025b();
    }

    @ly4
    /* renamed from: c */
    public final void mo18532c(long j) {
        this.f14360a.mo15139h();
        this.f14361a.mo25025b();
        this.f14359a = j;
        this.f14362b = j;
    }

    @ly4
    /* renamed from: d */
    public final boolean mo18533d(boolean z, boolean z2, long j) {
        this.f14360a.mo15139h();
        this.f14360a.mo15845i();
        sx6.m28019c();
        if (!this.f14360a.f11205a.mo27891z().mo14110B((String) null, n36.f17056f0) || this.f14360a.f11205a.mo27884o()) {
            this.f14360a.f11205a.mo27864F().f18956d.mo15076b(this.f14360a.f11205a.mo15133a().currentTimeMillis());
        }
        long j2 = j - this.f14359a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f14362b;
                this.f14362b = j;
            }
            this.f14360a.f11205a.mo15136e().mo12730v().mo25380b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            gr6.m16187y(this.f14360a.f11205a.mo27868K().mo26149s(!this.f14360a.f11205a.mo27891z().mo14112D()), bundle, true);
            if (!z2) {
                this.f14360a.f11205a.mo27866I().mo23910u(bf0.f26274c, "_e", bundle);
            }
            this.f14359a = j;
            this.f14361a.mo25025b();
            this.f14361a.mo25026d(3600000);
            return true;
        }
        this.f14360a.f11205a.mo15136e().mo12730v().mo25380b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
