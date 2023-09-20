package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.a */
public interface C0959a extends IInterface {

    /* renamed from: androidx.room.a$a */
    public static class C0960a implements C0959a {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: d3 */
        public void mo6604d3(String[] strArr) throws RemoteException {
        }
    }

    /* renamed from: androidx.room.a$b */
    public static abstract class C0961b extends Binder implements C0959a {

        /* renamed from: b */
        public static final int f5238b = 1;

        /* renamed from: b */
        public static final String f5239b = "androidx.room.IMultiInstanceInvalidationCallback";

        /* renamed from: androidx.room.a$b$a */
        public static class C0962a implements C0959a {

            /* renamed from: a */
            public static C0959a f5240a;

            /* renamed from: a */
            public IBinder f5241a;

            public C0962a(IBinder iBinder) {
                this.f5241a = iBinder;
            }

            public IBinder asBinder() {
                return this.f5241a;
            }

            /* renamed from: d3 */
            public void mo6604d3(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0961b.f5239b);
                    obtain.writeStringArray(strArr);
                    if (this.f5241a.transact(1, obtain, (Parcel) null, 1) || C0961b.m6697k8() == null) {
                        obtain.recycle();
                    } else {
                        C0961b.m6697k8().mo6604d3(strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j8 */
            public String mo6609j8() {
                return C0961b.f5239b;
            }
        }

        public C0961b() {
            attachInterface(this, f5239b);
        }

        /* renamed from: j8 */
        public static C0959a m6696j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f5239b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0959a)) ? new C0962a(iBinder) : (C0959a) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static C0959a m6697k8() {
            return C0962a.f5240a;
        }

        /* renamed from: l8 */
        public static boolean m6698l8(C0959a aVar) {
            if (C0962a.f5240a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0962a.f5240a = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f5239b);
                mo6604d3(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f5239b);
                return true;
            }
        }
    }

    /* renamed from: d3 */
    void mo6604d3(String[] strArr) throws RemoteException;
}
