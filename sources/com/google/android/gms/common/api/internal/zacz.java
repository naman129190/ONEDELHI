package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.h55;

final class zacz extends h55 {
    public final /* synthetic */ zada zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacz(zada zada, Looper looper) {
        super(looper);
        this.zaa = zada;
    }

    public final void handleMessage(Message message) {
        Status zaa2;
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.zaa.zae) {
                zada zada = (zada) Preconditions.checkNotNull(this.zaa.zab);
                if (pendingResult == null) {
                    zaa2 = new Status(13, "Transform returned null");
                } else if (pendingResult instanceof zacp) {
                    zaa2 = ((zacp) pendingResult).zaa();
                } else {
                    zada.zai(pendingResult);
                }
                zada.zaj(zaa2);
            }
        } else if (i != 1) {
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
