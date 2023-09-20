package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.i72;

public final /* synthetic */ class u72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f35993a;

    /* renamed from: a */
    public final /* synthetic */ i72.C2414l f35994a;

    /* renamed from: b */
    public final /* synthetic */ String f35995b;

    /* renamed from: n */
    public final /* synthetic */ int f35996n;

    public /* synthetic */ u72(i72.C2414l lVar, String str, int i, Bundle bundle) {
        this.f35994a = lVar;
        this.f35995b = str;
        this.f35996n = i;
        this.f35993a = bundle;
    }

    public final void run() {
        this.f35994a.m17311m(this.f35995b, this.f35996n, this.f35993a);
    }
}
