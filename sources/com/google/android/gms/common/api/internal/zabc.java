package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.onedelhi.secure.h55;

final class zabc extends h55 {
    public final /* synthetic */ zabe zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabe, Looper looper) {
        super(looper);
        this.zaa = zabe;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zabe.zaj(this.zaa);
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
        } else {
            zabe.zai(this.zaa);
        }
    }
}
