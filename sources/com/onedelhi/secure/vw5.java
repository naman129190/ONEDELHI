package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class vw5 extends al5 implements s26 {
    public vw5() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13174j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18718f3((Status) qr5.m26139a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
