package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class qy6 extends el5 implements i07 {
    public qy6() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: k8 */
    public static i07 m26241k8(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof i07 ? (i07) queryLocalInterface : new yw6(iBinder);
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ur5.m29548b(parcel);
            mo15618c2((LocationResult) ur5.m29547a(parcel, LocationResult.CREATOR));
        } else if (i == 2) {
            ur5.m29548b(parcel);
            mo15622r4((LocationAvailability) ur5.m29547a(parcel, LocationAvailability.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo15619f6();
        }
        return true;
    }
}
