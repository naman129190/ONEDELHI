package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class uo5 extends fl5 implements zo5 {
    public uo5() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo16552K1((t44) vr5.m30277a(parcel, t44.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
