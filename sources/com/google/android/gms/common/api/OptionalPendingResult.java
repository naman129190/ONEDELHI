package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;

public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @mr2
    public abstract R get();

    public abstract boolean isDone();
}
