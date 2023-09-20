package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.cl5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sr5;

public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends cl5 implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @mr2
        public static IAccountAccessor asInterface(@mr2 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzw(iBinder);
        }

        public final boolean zza(int i, @mr2 Parcel parcel, @mr2 Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account zzb = zzb();
            parcel2.writeNoException();
            sr5.m27804d(parcel2, zzb);
            return true;
        }
    }

    @mr2
    Account zzb() throws RemoteException;
}
