package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;

@KeepForSdk
public class PendingResultUtil {
    private static final zas zaa = new zao();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        @ts2
        T convert(@mr2 R r);
    }

    @mr2
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> w94<T> toResponseTask(@mr2 PendingResult<R> pendingResult, @mr2 T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @mr2
    @KeepForSdk
    public static <R extends Result, T> w94<T> toTask(@mr2 PendingResult<R> pendingResult, @mr2 ResultConverter<R, T> resultConverter) {
        zas zas = zaa;
        x94 x94 = new x94();
        pendingResult.addStatusListener(new zap(pendingResult, x94, resultConverter, zas));
        return x94.mo26835a();
    }

    @mr2
    @KeepForSdk
    public static <R extends Result> w94<Void> toVoidTask(@mr2 PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}
