package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

public final class k45 extends k35 implements IInterface {
    public k45(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: j8 */
    public final void mo18895j8(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    /* renamed from: k8 */
    public final void mo18896k8(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, iAccountAccessor);
        zaa.writeInt(i);
        u35.m29071c(zaa, z);
        zac(9, zaa);
    }

    /* renamed from: l8 */
    public final void mo18897l8(s45 s45, g45 g45) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29072d(zaa, s45);
        u35.m29073e(zaa, g45);
        zac(12, zaa);
    }
}
