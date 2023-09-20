package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class lp6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f15524a;

    /* renamed from: a */
    public final /* synthetic */ gq6 f15525a;

    /* renamed from: b */
    public final /* synthetic */ String f15526b;

    /* renamed from: c */
    public final /* synthetic */ String f15527c = "_err";

    public lp6(gq6 gq6, String str, String str2, Bundle bundle) {
        this.f15525a = gq6;
        this.f15526b = str;
        this.f15524a = bundle;
    }

    public final void run() {
        this.f15525a.f12720a.mo23387k((xj5) Preconditions.checkNotNull(this.f15525a.f12720a.mo23382h0().mo16899y0(this.f15526b, this.f15527c, this.f15524a, bf0.f26274c, this.f15525a.f12720a.mo15133a().currentTimeMillis(), false, true)), this.f15526b);
    }
}
