package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class ch5 extends fl5 implements kh5 {
    public ch5() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo16037a();
        parcel2.writeNoException();
        return true;
    }
}
