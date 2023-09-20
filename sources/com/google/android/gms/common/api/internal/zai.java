package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;

public abstract class zai {
    public final int zac;

    public zai(int i) {
        this.zac = i;
    }

    public static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@mr2 Status status);

    public abstract void zae(@mr2 Exception exc);

    public abstract void zaf(zabq zabq) throws DeadObjectException;

    public abstract void zag(@mr2 zaad zaad, boolean z);
}
