package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class x55 extends n55 implements IInterface {
    public x55(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* renamed from: l8 */
    public final void mo26792l8(j95 j95, C2635kk kkVar) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, j95);
        b75.m11659c(j8, kkVar);
        mo20868k8(1, j8);
    }

    /* renamed from: m8 */
    public final void mo26793m8(q55 q55, eg1 eg1, String str) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, q55);
        b75.m11659c(j8, eg1);
        j8.writeString(str);
        mo20868k8(4, j8);
    }

    /* renamed from: n8 */
    public final void mo26794n8(s55 s55, gg1 gg1) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, s55);
        b75.m11659c(j8, gg1);
        mo20868k8(3, j8);
    }

    /* renamed from: o8 */
    public final void mo26795o8(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, iStatusCallback);
        j8.writeString(str);
        mo20868k8(2, j8);
    }
}
