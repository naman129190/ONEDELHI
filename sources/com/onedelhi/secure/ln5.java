package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class ln5 extends fl5 implements rn5 {
    public ln5() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        yc5 k8 = mc5.m21485k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo17462A4(k8);
        parcel2.writeNoException();
        return true;
    }
}
