package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ht5 extends yo5 implements pt5 {
    public ht5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: W6 */
    public final void mo17408W6(Bundle bundle) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        mo27656l8(1, j8);
    }
}
