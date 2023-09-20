package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import java.util.List;

@KeepForSdk
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @mr2
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(@mr2 Context context, @mr2 Intent intent, @mr2 String str, @mr2 String str2, @mr2 String str3, int i, @mr2 String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@mr2 Context context, @mr2 String str, @mr2 String str2, @mr2 String str3, int i, @mr2 List<String> list, boolean z, long j) {
    }

    @KeepForSdk
    public void registerEvent(@mr2 Context context, @mr2 String str, int i, @mr2 String str2, @mr2 String str3, @mr2 String str4, int i2, @mr2 List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(@mr2 Context context, @mr2 String str, int i, @mr2 String str2, @mr2 String str3, @mr2 String str4, int i2, @mr2 List<String> list, long j) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@mr2 Context context, @mr2 Intent intent) {
    }
}
