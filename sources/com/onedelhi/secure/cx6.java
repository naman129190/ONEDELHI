package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class cx6 implements xe6 {

    /* renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService f10513a;

    /* renamed from: a */
    public final bu5 f10514a;

    public cx6(AppMeasurementDynamiteService appMeasurementDynamiteService, bu5 bu5) {
        this.f10513a = appMeasurementDynamiteService;
        this.f10514a = bu5;
    }

    /* renamed from: a */
    public final void mo10736a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10514a.mo13820n3(str, str2, bundle, j);
        } catch (RemoteException e) {
            za6 za6 = this.f10513a.f7589a;
            if (za6 != null) {
                za6.mo15136e().mo12731w().mo25380b("Event listener threw exception", e);
            }
        }
    }
}
