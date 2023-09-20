package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zn5 extends u95 implements IInterface {
    public zn5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: m8 */
    public final void mo28048m8(tn5 tn5) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, tn5);
        mo25469l8(3, j8);
    }

    /* renamed from: n8 */
    public final void mo28049n8(tn5 tn5, n73 n73) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, tn5);
        pr5.m24996d(j8, n73);
        mo25469l8(1, j8);
    }
}
