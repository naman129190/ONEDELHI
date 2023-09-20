package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class v95 implements IInterface {

    /* renamed from: a */
    public final IBinder f21715a;

    /* renamed from: b */
    public final String f21716b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public v95(IBinder iBinder, String str) {
        this.f21715a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f21715a;
    }

    /* renamed from: j8 */
    public final Parcel mo25910j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21716b);
        return obtain;
    }

    /* renamed from: k8 */
    public final void mo25911k8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21715a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
