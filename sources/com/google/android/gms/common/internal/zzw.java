package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.sr5;
import com.onedelhi.secure.x95;

public final class zzw extends x95 implements IAccountAccessor {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) sr5.m27801a(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
