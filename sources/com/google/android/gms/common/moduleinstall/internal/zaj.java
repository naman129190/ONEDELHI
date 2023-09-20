package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.onedelhi.secure.x94;

public final /* synthetic */ class zaj implements RemoteCall {
    public final /* synthetic */ zay zaa;
    public final /* synthetic */ zaab zab;

    public /* synthetic */ zaj(zay zay, zaab zaab) {
        this.zaa = zay;
        this.zab = zaab;
    }

    public final void accept(Object obj, Object obj2) {
        zay zay = this.zaa;
        zaab zaab = this.zab;
        ((zaf) ((zaz) obj).getService()).zai(new zav(zay, (x94) obj2), zaab);
    }
}
