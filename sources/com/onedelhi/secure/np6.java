package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class np6 extends el5 implements ur6 {
    public np6() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            ur5.m29548b(parcel);
            mo13288p5(readInt, createStringArray);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            ur5.m29548b(parcel);
            mo13289r3(readInt2, createStringArray2);
        } else if (i != 3) {
            return false;
        } else {
            ur5.m29548b(parcel);
            mo13287N2(parcel.readInt(), (PendingIntent) ur5.m29547a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
