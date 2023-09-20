package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class eq6 extends dl5 implements ls6 {
    public eq6() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo14788j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        tr5.m28930c(parcel);
        mo19882I((Status) tr5.m28928a(parcel, Status.CREATOR), (PendingIntent) tr5.m28928a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
