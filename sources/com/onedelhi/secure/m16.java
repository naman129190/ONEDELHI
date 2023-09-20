package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class m16 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f15870a;

    /* renamed from: a */
    public final /* synthetic */ Bundle f15871a;

    /* renamed from: a */
    public final /* synthetic */ g36 f15872a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m16(g36 g36, Bundle bundle, Activity activity) {
        super(g36.f12412a, true);
        this.f15872a = g36;
        this.f15871a = bundle;
        this.f15870a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        Bundle bundle;
        if (this.f15871a != null) {
            bundle = new Bundle();
            if (this.f15871a.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f15871a.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((dt5) Preconditions.checkNotNull(this.f15872a.f12412a.f14000a)).onActivityCreated(nt2.m23166l8(this.f15870a), bundle, this.f8561c);
    }
}
