package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;

public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(@mr2 ResultCallbacks<? super R> resultCallbacks);

    @mr2
    public abstract <S extends Result> TransformedResult<S> then(@mr2 ResultTransform<? super R, ? extends S> resultTransform);
}
