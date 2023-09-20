package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @mr2
    @KeepForSdk
    /* renamed from: of */
    public static final ActivityLifecycleObserver m8867of(@mr2 Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @mr2
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@mr2 Runnable runnable);
}
