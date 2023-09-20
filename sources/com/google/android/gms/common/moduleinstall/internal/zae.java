package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.ts2;

public interface zae extends IInterface {
    void zab(Status status) throws RemoteException;

    void zac(Status status, @ts2 ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    void zad(Status status, @ts2 ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void zae(Status status, @ts2 ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
