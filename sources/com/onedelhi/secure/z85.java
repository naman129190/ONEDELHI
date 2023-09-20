package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class z85 extends n55 implements IInterface {
    public z85(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: l8 */
    public final void mo27840l8(x85 x85, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, x85);
        b75.m11659c(j8, googleSignInOptions);
        mo20868k8(103, j8);
    }

    /* renamed from: m8 */
    public final void mo27841m8(x85 x85, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, x85);
        b75.m11659c(j8, googleSignInOptions);
        mo20868k8(102, j8);
    }

    /* renamed from: n8 */
    public final void mo27842n8(x85 x85, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, x85);
        b75.m11659c(j8, googleSignInOptions);
        mo20868k8(101, j8);
    }
}
