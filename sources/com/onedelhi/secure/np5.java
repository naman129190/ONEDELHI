package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class np5 extends yo5 implements xp5 {
    public np5(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: g7 */
    public final Bundle mo21417g7(Bundle bundle) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        Parcel k8 = mo27655k8(1, j8);
        Bundle bundle2 = (Bundle) ip5.m17763a(k8, Bundle.CREATOR);
        k8.recycle();
        return bundle2;
    }
}
