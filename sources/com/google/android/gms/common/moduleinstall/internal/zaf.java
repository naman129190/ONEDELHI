package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.onedelhi.secure.k35;
import com.onedelhi.secure.u35;

public final class zaf extends k35 implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zae, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, zae);
        u35.m29072d(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(zae zae, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, zae);
        u35.m29072d(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(zae zae, ApiFeatureRequest apiFeatureRequest, zah zah) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, zae);
        u35.m29072d(zaa, apiFeatureRequest);
        u35.m29073e(zaa, zah);
        zac(2, zaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, iStatusCallback);
        u35.m29072d(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zah) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, iStatusCallback);
        u35.m29073e(zaa, zah);
        zac(6, zaa);
    }
}
