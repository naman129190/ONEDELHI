package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class sy6 extends fl5 implements k07 {
    public sy6() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo15048a();
        parcel2.writeNoException();
        return true;
    }
}
