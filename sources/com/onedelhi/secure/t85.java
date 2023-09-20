package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class t85 extends t65 implements x85 {
    public t85() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                b75.m11658b(parcel);
                mo20100e2((GoogleSignInAccount) b75.m11657a(parcel, GoogleSignInAccount.CREATOR), (Status) b75.m11657a(parcel, Status.CREATOR));
                break;
            case 102:
                b75.m11658b(parcel);
                mo20101m0((Status) b75.m11657a(parcel, Status.CREATOR));
                break;
            case 103:
                b75.m11658b(parcel);
                mo20099C5((Status) b75.m11657a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
