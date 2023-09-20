package com.onedelhi.secure;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

public final class lo6 {

    /* renamed from: a */
    public final /* synthetic */ no6 f15523a;

    public lo6(no6 no6) {
        this.f15523a = no6;
    }

    @ly4
    /* renamed from: a */
    public final void mo19745a() {
        this.f15523a.mo15139h();
        if (this.f15523a.f11205a.mo27864F().mo22931v(this.f15523a.f11205a.mo15133a().currentTimeMillis())) {
            this.f15523a.f11205a.mo27864F().f18946a.mo27237a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f15523a.f11205a.mo15136e().mo12730v().mo25379a("Detected application was in foreground");
                mo19747c(this.f15523a.f11205a.mo15133a().currentTimeMillis(), false);
            }
        }
    }

    @ly4
    /* renamed from: b */
    public final void mo19746b(long j, boolean z) {
        this.f15523a.mo15139h();
        this.f15523a.mo21389s();
        if (this.f15523a.f11205a.mo27864F().mo22931v(j)) {
            this.f15523a.f11205a.mo27864F().f18946a.mo27237a(true);
            xz6.m31807c();
            if (this.f15523a.f11205a.mo27891z().mo14110B((String) null, n36.f17072n0)) {
                this.f15523a.f11205a.mo27860B().mo27798v();
            }
        }
        this.f15523a.f11205a.mo27864F().f18956d.mo15076b(j);
        if (this.f15523a.f11205a.mo27864F().f18946a.mo27238b()) {
            mo19747c(j, z);
        }
    }

    @VisibleForTesting
    @ly4
    /* renamed from: c */
    public final void mo19747c(long j, boolean z) {
        this.f15523a.mo15139h();
        if (this.f15523a.f11205a.mo27884o()) {
            this.f15523a.f11205a.mo27864F().f18956d.mo15076b(j);
            this.f15523a.f11205a.mo15136e().mo12730v().mo25380b("Session started, time", Long.valueOf(this.f15523a.f11205a.mo15133a().elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f15523a.f11205a.mo27866I().mo23887M(bf0.f26274c, "_sid", valueOf, j);
            this.f15523a.f11205a.mo27864F().f18959e.mo15076b(valueOf.longValue());
            this.f15523a.f11205a.mo27864F().f18946a.mo27237a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f15523a.f11205a.mo27891z().mo14110B((String) null, n36.f17048b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f15523a.f11205a.mo27866I().mo23911v(bf0.f26274c, "_s", j, bundle);
            ow6.m24151c();
            if (this.f15523a.f11205a.mo27891z().mo14110B((String) null, n36.f17054e0)) {
                String a = this.f15523a.f11205a.mo27864F().f18953c.mo20989a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f15523a.f11205a.mo27866I().mo23911v(bf0.f26274c, "_ssr", j, bundle2);
                }
            }
        }
    }
}
