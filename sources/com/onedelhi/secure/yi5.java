package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class yi5 extends fl5 implements gj5 {
    public yi5() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        lb5 k8 = k67.m19509k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        boolean V0 = mo16449V0(k8);
        parcel2.writeNoException();
        vr5.m30280d(parcel2, V0);
        return true;
    }
}
