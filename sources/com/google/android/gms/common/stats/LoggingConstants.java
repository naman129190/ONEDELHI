package com.google.android.gms.common.stats;

import android.content.ComponentName;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public final class LoggingConstants {
    @mr2
    @KeepForSdk
    @Deprecated
    public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
    @mr2
    public static final ComponentName zza = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");

    private LoggingConstants() {
    }
}
