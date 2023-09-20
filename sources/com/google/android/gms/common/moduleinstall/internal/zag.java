package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.onedelhi.secure.p35;
import com.onedelhi.secure.u35;

public abstract class zag extends p35 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        u35.m29070b(parcel);
        zab((ModuleInstallStatusUpdate) u35.m29069a(parcel, ModuleInstallStatusUpdate.CREATOR));
        return true;
    }
}
