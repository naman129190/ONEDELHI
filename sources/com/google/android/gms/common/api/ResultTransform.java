package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public abstract class ResultTransform<R extends Result, S extends Result> {
    @mr2
    public final PendingResult<S> createFailedResult(@mr2 Status status) {
        return new zacp(status);
    }

    @mr2
    public Status onFailure(@mr2 Status status) {
        return status;
    }

    @ts2
    @ly4
    public abstract PendingResult<S> onSuccess(@mr2 R r);
}
