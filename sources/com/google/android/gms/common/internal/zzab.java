package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.sr5;
import com.onedelhi.secure.x95;

public final class zzab extends x95 implements IGmsCallbacks {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        sr5.m27803c(zza, bundle);
        zzC(1, zza);
    }

    public final void zzb(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    public final void zzc(int i, IBinder iBinder, zzk zzk) throws RemoteException {
        throw null;
    }
}
