package com.onedelhi.secure;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class mx6 extends el5 implements ez6 {
    public mx6() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ur5.m29548b(parcel);
        mo15668Z6((Status) ur5.m29547a(parcel, Status.CREATOR), (Location) ur5.m29547a(parcel, Location.CREATOR));
        return true;
    }
}
