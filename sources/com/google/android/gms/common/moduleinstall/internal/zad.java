package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.p35;
import com.onedelhi.secure.u35;

public abstract class zad extends p35 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            u35.m29070b(parcel);
            zae((Status) u35.m29069a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) u35.m29069a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i == 2) {
            u35.m29070b(parcel);
            zad((Status) u35.m29069a(parcel, Status.CREATOR), (ModuleInstallResponse) u35.m29069a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i == 3) {
            u35.m29070b(parcel);
            zac((Status) u35.m29069a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) u35.m29069a(parcel, ModuleInstallIntentResponse.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            u35.m29070b(parcel);
            zab((Status) u35.m29069a(parcel, Status.CREATOR));
        }
        return true;
    }
}
