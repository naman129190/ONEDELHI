package com.onedelhi.secure;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public interface rn1 extends IInterface {

    /* renamed from: a */
    public static final int f19944a = 1;

    /* renamed from: a */
    public static final String f19945a = "com.google.android.gms.iid.IMessengerCompat";

    /* renamed from: com.onedelhi.secure.rn1$a */
    public static class C3426a extends Binder implements rn1 {
        /* renamed from: J1 */
        public void mo23959J1(@mr2 Message message) throws RemoteException {
            throw null;
        }

        @mr2
        public IBinder asBinder() {
            throw null;
        }

        public boolean onTransact(int i, @mr2 Parcel parcel, @ts2 Parcel parcel2, int i2) throws RemoteException {
            throw null;
        }
    }

    /* renamed from: com.onedelhi.secure.rn1$b */
    public static class C3427b implements rn1 {

        /* renamed from: a */
        public final IBinder f19946a;

        public C3427b(@mr2 IBinder iBinder) {
            this.f19946a = iBinder;
        }

        /* renamed from: J1 */
        public void mo23959J1(@mr2 Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(rn1.f19945a);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f19946a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @mr2
        public IBinder asBinder() {
            return this.f19946a;
        }
    }

    /* renamed from: J1 */
    void mo23959J1(@mr2 Message message) throws RemoteException;
}
