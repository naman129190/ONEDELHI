package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class y95 implements IInterface {

    /* renamed from: a */
    public final IBinder f22942a;

    /* renamed from: b */
    public final String f22943b;

    public y95(IBinder iBinder, String str) {
        this.f22942a = iBinder;
        this.f22943b = str;
    }

    public final IBinder asBinder() {
        return this.f22942a;
    }

    /* renamed from: j8 */
    public final Parcel mo27248j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f22943b);
        return obtain;
    }

    /* renamed from: k8 */
    public final void mo27249k8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f22942a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
