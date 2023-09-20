package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class bb5 extends fl5 implements pb5 {
    public bb5() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo22377a();
        } else if (i != 2) {
            return false;
        } else {
            g07 k8 = oy6.m24281k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            mo22378l7(k8);
        }
        parcel2.writeNoException();
        return true;
    }
}
