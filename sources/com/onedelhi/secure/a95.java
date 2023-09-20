package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C1403a;

public final class a95 extends n55 implements IInterface {
    public a95(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: l8 */
    public final void mo12868l8(y85 y85, r85 r85) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, y85);
        b75.m11659c(j8, r85);
        mo20868k8(3, j8);
    }

    /* renamed from: m8 */
    public final void mo12869m8(y85 y85, C1403a aVar) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, y85);
        b75.m11659c(j8, aVar);
        mo20868k8(1, j8);
    }

    /* renamed from: n8 */
    public final void mo12870n8(y85 y85, c95 c95) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, y85);
        b75.m11659c(j8, c95);
        mo20868k8(2, j8);
    }

    /* renamed from: o8 */
    public final void mo12871o8(y85 y85) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, y85);
        mo20868k8(4, j8);
    }
}
