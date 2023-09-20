package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.cl5;
import com.onedelhi.secure.sr5;

public abstract class zzac extends cl5 implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            sr5.m27802b(parcel);
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) sr5.m27801a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            sr5.m27802b(parcel);
            zzb(parcel.readInt(), (Bundle) sr5.m27801a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            sr5.m27802b(parcel);
            zzc(parcel.readInt(), parcel.readStrongBinder(), (zzk) sr5.m27801a(parcel, zzk.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
