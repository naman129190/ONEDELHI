package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public abstract class v56 extends dl5 implements t96 {
    public v56() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    /* renamed from: j8 */
    public final boolean mo14788j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList b = tr5.m28929b(parcel);
            tr5.m28930c(parcel);
            mo24787S0(b);
        } else if (i != 2) {
            return false;
        } else {
            tr5.m28930c(parcel);
            mo24788Z((Status) tr5.m28928a(parcel, Status.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
