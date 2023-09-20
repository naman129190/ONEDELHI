package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class xn5 extends fl5 implements do5 {
    public xn5() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        he5 k8 = wd5.m30795k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo14800B5(k8);
        parcel2.writeNoException();
        return true;
    }
}
