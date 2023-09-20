package com.google.android.gms.common.api.internal;

import com.onedelhi.secure.w45;

final class zacr implements Runnable {
    public final /* synthetic */ w45 zaa;
    public final /* synthetic */ zact zab;

    public zacr(zact zact, w45 w45) {
        this.zab = zact;
        this.zaa = w45;
    }

    public final void run() {
        zact.zad(this.zab, this.zaa);
    }
}
