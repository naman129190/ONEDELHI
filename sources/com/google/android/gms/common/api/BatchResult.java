package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {
    private final Status zaa;
    private final PendingResult[] zab;

    public BatchResult(Status status, PendingResult[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }

    @mr2
    public Status getStatus() {
        return this.zaa;
    }

    @mr2
    public <R extends Result> R take(@mr2 BatchResultToken<R> batchResultToken) {
        Preconditions.checkArgument(batchResultToken.mId < this.zab.length, "The result token does not belong to this batch");
        return this.zab[batchResultToken.mId].await(0, TimeUnit.MILLISECONDS);
    }
}
