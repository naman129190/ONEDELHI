package com.onedelhi.secure;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface c15 extends IInterface {

    /* renamed from: com.onedelhi.secure.c15$a */
    public static abstract class C4722a extends Binder implements c15 {

        /* renamed from: b */
        public static final /* synthetic */ int f26614b = 0;

        /* renamed from: com.onedelhi.secure.c15$a$a */
        public static class C4723a implements c15 {

            /* renamed from: a */
            public IBinder f26615a;

            public C4723a(IBinder iBinder) {
                this.f26615a = iBinder;
            }

            /* renamed from: W4 */
            public String mo32211W4(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.phonepe.app.external.sdksupport.MerchantBridge");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f26615a.transact(1, obtain, obtain2, 0)) {
                        int i = C4722a.f26614b;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f26615a;
            }
        }
    }

    /* renamed from: W4 */
    String mo32211W4(String str, String str2, String str3) throws RemoteException;
}
