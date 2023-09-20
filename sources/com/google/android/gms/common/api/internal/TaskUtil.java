package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;

@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@mr2 Status status, @mr2 x94<Void> x94) {
        setResultOrApiException(status, (Object) null, x94);
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@mr2 Status status, @ts2 ResultT resultt, @mr2 x94<ResultT> x94) {
        if (status.isSuccess()) {
            x94.mo26837c(resultt);
        } else {
            x94.mo26836b(ApiExceptionUtil.fromStatus(status));
        }
    }

    @mr2
    @KeepForSdk
    @Deprecated
    public static w94<Void> toVoidTaskThatFailsOnFalse(@mr2 w94<Boolean> w94) {
        return w94.mo17581m(new zacx());
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@mr2 Status status, @ts2 ResultT resultt, @mr2 x94<ResultT> x94) {
        return status.isSuccess() ? x94.mo26839e(resultt) : x94.mo26838d(ApiExceptionUtil.fromStatus(status));
    }
}
