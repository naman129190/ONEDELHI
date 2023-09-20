package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C0959a;

/* renamed from: androidx.room.b */
public interface C0963b extends IInterface {

    /* renamed from: androidx.room.b$a */
    public static class C0964a implements C0963b {
        /* renamed from: A7 */
        public void mo6601A7(C0959a aVar, int i) throws RemoteException {
        }

        /* renamed from: G1 */
        public void mo6602G1(int i, String[] strArr) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: x4 */
        public int mo6603x4(C0959a aVar, String str) throws RemoteException {
            return 0;
        }
    }

    /* renamed from: androidx.room.b$b */
    public static abstract class C0965b extends Binder implements C0963b {

        /* renamed from: b */
        public static final int f5242b = 1;

        /* renamed from: b */
        public static final String f5243b = "androidx.room.IMultiInstanceInvalidationService";

        /* renamed from: c */
        public static final int f5244c = 2;

        /* renamed from: d */
        public static final int f5245d = 3;

        /* renamed from: androidx.room.b$b$a */
        public static class C0966a implements C0963b {

            /* renamed from: a */
            public static C0963b f5246a;

            /* renamed from: a */
            public IBinder f5247a;

            public C0966a(IBinder iBinder) {
                this.f5247a = iBinder;
            }

            /* renamed from: A7 */
            public void mo6601A7(C0959a aVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0965b.f5243b);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeInt(i);
                    if (this.f5247a.transact(2, obtain, obtain2, 0) || C0965b.m6708k8() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0965b.m6708k8().mo6601A7(aVar, i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: G1 */
            public void mo6602G1(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0965b.f5243b);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (this.f5247a.transact(3, obtain, (Parcel) null, 1) || C0965b.m6708k8() == null) {
                        obtain.recycle();
                    } else {
                        C0965b.m6708k8().mo6602G1(i, strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5247a;
            }

            /* renamed from: j8 */
            public String mo6614j8() {
                return C0965b.f5243b;
            }

            /* renamed from: x4 */
            public int mo6603x4(C0959a aVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0965b.f5243b);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f5247a.transact(1, obtain, obtain2, 0) && C0965b.m6708k8() != null) {
                        return C0965b.m6708k8().mo6603x4(aVar, str);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0965b() {
            attachInterface(this, f5243b);
        }

        /* renamed from: j8 */
        public static C0963b m6707j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f5243b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0963b)) ? new C0966a(iBinder) : (C0963b) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static C0963b m6708k8() {
            return C0966a.f5246a;
        }

        /* renamed from: l8 */
        public static boolean m6709l8(C0963b bVar) {
            if (C0966a.f5246a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C0966a.f5246a = bVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f5243b);
                int x4 = mo6603x4(C0959a.C0961b.m6696j8(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(x4);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f5243b);
                mo6601A7(C0959a.C0961b.m6696j8(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f5243b);
                mo6602G1(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f5243b);
                return true;
            }
        }
    }

    /* renamed from: A7 */
    void mo6601A7(C0959a aVar, int i) throws RemoteException;

    /* renamed from: G1 */
    void mo6602G1(int i, String[] strArr) throws RemoteException;

    /* renamed from: x4 */
    int mo6603x4(C0959a aVar, String str) throws RemoteException;
}
