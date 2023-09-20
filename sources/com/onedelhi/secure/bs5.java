package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class bs5 extends fl5 implements gx5 {
    public bs5() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo12970F();
        } else if (i != 2) {
            return false;
        } else {
            mo12971a();
        }
        parcel2.writeNoException();
        return true;
    }
}
