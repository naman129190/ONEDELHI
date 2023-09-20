package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class n55 implements IInterface {

    /* renamed from: a */
    public final IBinder f17106a;

    /* renamed from: b */
    public final String f17107b;

    public n55(IBinder iBinder, String str) {
        this.f17106a = iBinder;
        this.f17107b = str;
    }

    public final IBinder asBinder() {
        return this.f17106a;
    }

    /* renamed from: j8 */
    public final Parcel mo20867j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17107b);
        return obtain;
    }

    /* renamed from: k8 */
    public final void mo20868k8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17106a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
