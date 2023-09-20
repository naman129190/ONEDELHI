package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

public final class zag extends zac {
    private final TaskApiCall zaa;
    private final x94 zab;
    private final StatusExceptionMapper zad;

    public zag(int i, TaskApiCall taskApiCall, x94 x94, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zab = x94;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final boolean zaa(zabq zabq) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @ts2
    public final Feature[] zab(zabq zabq) {
        return this.zaa.zab();
    }

    public final void zad(@mr2 Status status) {
        this.zab.mo26838d(this.zad.getException(status));
    }

    public final void zae(@mr2 Exception exc) {
        this.zab.mo26838d(exc);
    }

    public final void zaf(zabq zabq) throws DeadObjectException {
        try {
            this.zaa.doExecute(zabq.zaf(), this.zab);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zad(zai.zah(e2));
        } catch (RuntimeException e3) {
            this.zab.mo26838d(e3);
        }
    }

    public final void zag(@mr2 zaad zaad, boolean z) {
        zaad.zad(this.zab, z);
    }
}
