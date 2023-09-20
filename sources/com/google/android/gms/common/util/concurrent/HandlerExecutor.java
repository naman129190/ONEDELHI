package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.zh6;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(@mr2 Looper looper) {
        this.zza = new zh6(looper);
    }

    public final void execute(@mr2 Runnable runnable) {
        this.zza.post(runnable);
    }
}
