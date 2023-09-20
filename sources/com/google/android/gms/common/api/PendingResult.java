package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;
import java.util.concurrent.TimeUnit;

public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@mr2 Status status);
    }

    @KeepForSdk
    public void addStatusListener(@mr2 StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @mr2
    public abstract R await();

    @mr2
    public abstract R await(long j, @mr2 TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@mr2 ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@mr2 ResultCallback<? super R> resultCallback, long j, @mr2 TimeUnit timeUnit);

    @mr2
    public <S extends Result> TransformedResult<S> then(@mr2 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}
