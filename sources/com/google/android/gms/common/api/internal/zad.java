package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.x94;

abstract class zad extends zac {
    public final x94 zaa;

    public zad(int i, x94 x94) {
        super(i);
        this.zaa = x94;
    }

    public abstract void zac(zabq zabq) throws RemoteException;

    public final void zad(@mr2 Status status) {
        this.zaa.mo26838d(new ApiException(status));
    }

    public final void zae(@mr2 Exception exc) {
        this.zaa.mo26838d(exc);
    }

    public final void zaf(zabq zabq) throws DeadObjectException {
        try {
            zac(zabq);
        } catch (DeadObjectException e) {
            zad(zai.zah(e));
            throw e;
        } catch (RemoteException e2) {
            zad(zai.zah(e2));
        } catch (RuntimeException e3) {
            this.zaa.mo26838d(e3);
        }
    }

    public void zag(@mr2 zaad zaad, boolean z) {
    }
}
