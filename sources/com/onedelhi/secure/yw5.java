package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class yw5 extends dl5 implements x16 {
    public yw5() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    /* renamed from: j8 */
    public final boolean mo14788j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z = false;
        if (i == 1) {
            int i3 = tr5.f21115a;
            int readInt = parcel.readInt();
            tr5.m28930c(parcel);
            if (readInt != 0) {
                z = true;
            }
            mo14490m4(z);
        } else if (i != 2) {
            return false;
        } else {
            tr5.m28930c(parcel);
            mo14489Z((Status) tr5.m28928a(parcel, Status.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
