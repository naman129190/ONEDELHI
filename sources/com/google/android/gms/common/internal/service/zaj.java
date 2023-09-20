package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.p35;
import com.onedelhi.secure.u35;

public abstract class zaj extends p35 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        u35.m29070b(parcel);
        zab(readInt);
        return true;
    }
}
