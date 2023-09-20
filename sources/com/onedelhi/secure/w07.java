package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class w07 extends el5 implements b27 {
    public w07() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ur5.m29548b(parcel);
        mo13394J5((e82) ur5.m29547a(parcel, e82.CREATOR));
        return true;
    }
}
