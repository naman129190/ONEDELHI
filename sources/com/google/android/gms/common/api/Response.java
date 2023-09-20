package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;

public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public Response(@mr2 T t) {
        this.zza = t;
    }

    @mr2
    public T getResult() {
        return this.zza;
    }

    public void setResult(@mr2 T t) {
        this.zza = t;
    }
}
