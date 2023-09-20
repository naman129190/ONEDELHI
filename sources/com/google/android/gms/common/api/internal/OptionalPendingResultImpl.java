package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import com.onedelhi.secure.mr2;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    private final BasePendingResult zaa;

    public OptionalPendingResultImpl(@mr2 PendingResult pendingResult) {
        this.zaa = (BasePendingResult) pendingResult;
    }

    public final void addStatusListener(@mr2 PendingResult.StatusListener statusListener) {
        this.zaa.addStatusListener(statusListener);
    }

    @mr2
    public final R await() {
        return this.zaa.await();
    }

    @mr2
    public final R await(long j, @mr2 TimeUnit timeUnit) {
        return this.zaa.await(j, timeUnit);
    }

    public final void cancel() {
        this.zaa.cancel();
    }

    @mr2
    public final R get() {
        if (this.zaa.isReady()) {
            return this.zaa.await(0, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    public final boolean isCanceled() {
        return this.zaa.isCanceled();
    }

    public final boolean isDone() {
        return this.zaa.isReady();
    }

    public final void setResultCallback(@mr2 ResultCallback<? super R> resultCallback) {
        this.zaa.setResultCallback(resultCallback);
    }

    public final void setResultCallback(@mr2 ResultCallback<? super R> resultCallback, long j, @mr2 TimeUnit timeUnit) {
        this.zaa.setResultCallback(resultCallback, j, timeUnit);
    }

    @mr2
    public final <S extends Result> TransformedResult<S> then(@mr2 ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zaa.then(resultTransform);
    }
}
