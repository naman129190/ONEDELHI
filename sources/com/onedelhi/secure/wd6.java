package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class wd6 extends fl5 implements nh6 {
    public wd6() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        tn1 tn1;
        if (i == 1) {
            lb5 k8 = k67.m19509k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            tn1 = mo13420N7(k8);
        } else if (i != 2) {
            return false;
        } else {
            lb5 k82 = k67.m19509k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            tn1 = mo13421S6(k82);
        }
        parcel2.writeNoException();
        vr5.m30283g(parcel2, tn1);
        return true;
    }
}
