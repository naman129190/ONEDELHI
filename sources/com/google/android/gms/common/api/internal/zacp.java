package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.onedelhi.secure.mr2;
import java.util.concurrent.TimeUnit;

public final class zacp<R extends Result> extends PendingResult<R> {
    private final Status zaa;

    public zacp(Status status) {
        Preconditions.checkNotNull(status, "Status must not be null");
        Preconditions.checkArgument(!status.isSuccess(), "Status must not be success");
        this.zaa = status;
    }

    public final void addStatusListener(@mr2 PendingResult.StatusListener statusListener) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @mr2
    public final R await() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @mr2
    public final R await(long j, @mr2 TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public final void cancel() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public final boolean isCanceled() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public final void setResultCallback(@mr2 ResultCallback<? super R> resultCallback) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public final void setResultCallback(@mr2 ResultCallback<? super R> resultCallback, long j, @mr2 TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @ShowFirstParty
    @mr2
    public final <S extends Result> TransformedResult<S> then(@mr2 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @mr2
    public final Status zaa() {
        return this.zaa;
    }
}
