package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
@Deprecated
public class StatsUtils {
    @mr2
    @KeepForSdk
    public static String getEventKey(@mr2 PowerManager.WakeLock wakeLock, @mr2 String str) {
        String valueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
