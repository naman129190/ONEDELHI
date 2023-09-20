package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class lt5 extends dp5 implements pt5 {
    public lt5() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: j8 */
    public final boolean mo14807j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ip5.m17765c(parcel);
        mo17408W6((Bundle) ip5.m17763a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
