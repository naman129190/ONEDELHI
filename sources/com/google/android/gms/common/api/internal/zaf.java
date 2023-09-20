package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

public final class zaf extends zad {
    public final zaci zab;

    public zaf(zaci zaci, x94 x94) {
        super(3, x94);
        this.zab = zaci;
    }

    public final boolean zaa(zabq zabq) {
        return this.zab.zaa.zab();
    }

    @ts2
    public final Feature[] zab(zabq zabq) {
        return this.zab.zaa.getRequiredFeatures();
    }

    public final void zac(zabq zabq) throws RemoteException {
        this.zab.zaa.registerListener(zabq.zaf(), this.zaa);
        ListenerHolder.ListenerKey listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zabq.zah().put(listenerKey, this.zab);
        }
    }

    public final /* bridge */ /* synthetic */ void zag(@mr2 zaad zaad, boolean z) {
    }
}
