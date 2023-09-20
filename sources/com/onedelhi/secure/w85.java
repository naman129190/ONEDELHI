package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class w85 extends t65 implements y85 {
    public w85() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            b75.m11658b(parcel);
            mo15878k2((Status) b75.m11657a(parcel, Status.CREATOR), (Credential) b75.m11657a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            b75.m11658b(parcel);
            mo14070m0((Status) b75.m11657a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            b75.m11658b(parcel);
            mo15877T6((Status) b75.m11657a(parcel, Status.CREATOR), readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
