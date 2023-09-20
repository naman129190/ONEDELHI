package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@mr2 String str, @mr2 LifecycleCallback lifecycleCallback);

    @KeepForSdk
    @ts2
    <T extends LifecycleCallback> T getCallbackOrNull(@mr2 String str, @mr2 Class<T> cls);

    @KeepForSdk
    @ts2
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@mr2 Intent intent, int i);
}
