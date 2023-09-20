package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public abstract class tk5 extends fl5 implements hm5 {
    public tk5() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        tn1 j8 = tn1.C3647a.m28820j8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo17349C3(j8);
        parcel2.writeNoException();
        return true;
    }
}
