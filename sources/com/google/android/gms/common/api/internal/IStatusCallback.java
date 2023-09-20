package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p35;
import com.onedelhi.secure.u35;

public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends p35 implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @mr2
        public static IStatusCallback asInterface(@mr2 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaby(iBinder);
        }

        public final boolean zaa(int i, @mr2 Parcel parcel, @mr2 Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            u35.m29070b(parcel);
            onResult((Status) u35.m29069a(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(@mr2 Status status) throws RemoteException;
}
