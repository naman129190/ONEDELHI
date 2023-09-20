package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.onedelhi.secure.x94;
import java.util.concurrent.TimeUnit;

final class zap implements PendingResult.StatusListener {
    public final /* synthetic */ PendingResult zaa;
    public final /* synthetic */ x94 zab;
    public final /* synthetic */ PendingResultUtil.ResultConverter zac;
    public final /* synthetic */ zas zad;

    public zap(PendingResult pendingResult, x94 x94, PendingResultUtil.ResultConverter resultConverter, zas zas) {
        this.zaa = pendingResult;
        this.zab = x94;
        this.zac = resultConverter;
        this.zad = zas;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zab.mo26837c(this.zac.convert(this.zaa.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zab.mo26836b(ApiExceptionUtil.fromStatus(status));
    }
}
