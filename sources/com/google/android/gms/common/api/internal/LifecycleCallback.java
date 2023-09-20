package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
    @mr2
    @KeepForSdk
    public final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@mr2 LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @mr2
    @KeepForSdk
    public static LifecycleFragment getFragment(@mr2 Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @mr2
    @KeepForSdk
    public static LifecycleFragment getFragment(@mr2 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @mr2
    @KeepForSdk
    public static LifecycleFragment getFragment(@mr2 LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zzb.zzc(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @bc2
    @KeepForSdk
    public void dump(@mr2 String str, @mr2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @mr2 String[] strArr) {
    }

    @mr2
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @bc2
    @KeepForSdk
    public void onActivityResult(int i, int i2, @mr2 Intent intent) {
    }

    @bc2
    @KeepForSdk
    public void onCreate(@ts2 Bundle bundle) {
    }

    @bc2
    @KeepForSdk
    public void onDestroy() {
    }

    @bc2
    @KeepForSdk
    public void onResume() {
    }

    @bc2
    @KeepForSdk
    public void onSaveInstanceState(@mr2 Bundle bundle) {
    }

    @bc2
    @KeepForSdk
    public void onStart() {
    }

    @bc2
    @KeepForSdk
    public void onStop() {
    }
}
