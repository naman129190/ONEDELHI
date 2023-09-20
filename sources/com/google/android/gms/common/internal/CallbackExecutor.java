package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import java.util.concurrent.ExecutorService;

@KeepForSdk
public final class CallbackExecutor {
    private CallbackExecutor() {
    }

    @mr2
    @KeepForSdk
    public static ExecutorService executorService() {
        return zzj.zza;
    }
}
