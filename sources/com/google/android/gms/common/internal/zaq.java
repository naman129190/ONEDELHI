package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zaq implements PendingResultUtil.ResultConverter {
    public final /* synthetic */ Response zaa;

    public zaq(Response response) {
        this.zaa = response;
    }

    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }
}
