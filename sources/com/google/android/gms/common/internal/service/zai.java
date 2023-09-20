package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import com.onedelhi.secure.k35;
import com.onedelhi.secure.u35;

public final class zai extends k35 implements IInterface {
    public zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(TelemetryData telemetryData) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29072d(zaa, telemetryData);
        zad(1, zaa);
    }
}
