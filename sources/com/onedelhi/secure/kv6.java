package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class kv6 implements ue6 {

    /* renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService f15084a;

    /* renamed from: a */
    public final bu5 f15085a;

    public kv6(AppMeasurementDynamiteService appMeasurementDynamiteService, bu5 bu5) {
        this.f15084a = appMeasurementDynamiteService;
        this.f15085a = bu5;
    }

    /* renamed from: a */
    public final void mo10735a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f15085a.mo13820n3(str, str2, bundle, j);
        } catch (RemoteException e) {
            za6 za6 = this.f15084a.f7589a;
            if (za6 != null) {
                za6.mo15136e().mo12731w().mo25380b("Event interceptor threw exception", e);
            }
        }
    }
}
