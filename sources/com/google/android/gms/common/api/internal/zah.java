package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

public final class zah extends zad {
    public final ListenerHolder.ListenerKey zab;

    public zah(ListenerHolder.ListenerKey listenerKey, x94 x94) {
        super(4, x94);
        this.zab = listenerKey;
    }

    public final boolean zaa(zabq zabq) {
        zaci zaci = (zaci) zabq.zah().get(this.zab);
        return zaci != null && zaci.zaa.zab();
    }

    @ts2
    public final Feature[] zab(zabq zabq) {
        zaci zaci = (zaci) zabq.zah().get(this.zab);
        if (zaci == null) {
            return null;
        }
        return zaci.zaa.getRequiredFeatures();
    }

    public final void zac(zabq zabq) throws RemoteException {
        zaci zaci = (zaci) zabq.zah().remove(this.zab);
        if (zaci != null) {
            zaci.zab.unregisterListener(zabq.zaf(), this.zaa);
            zaci.zaa.clearListener();
            return;
        }
        this.zaa.mo26839e(Boolean.FALSE);
    }

    public final /* bridge */ /* synthetic */ void zag(@mr2 zaad zaad, boolean z) {
    }
}
