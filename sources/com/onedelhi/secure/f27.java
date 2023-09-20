package com.onedelhi.secure;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class f27 extends el5 implements w27 {
    public f27() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: k8 */
    public static w27 m14580k8(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof w27 ? (w27) queryLocalInterface : new o17(iBinder);
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ur5.m29548b(parcel);
            mo21562c0((Location) ur5.m29547a(parcel, Location.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo21563x();
        }
        return true;
    }
}
