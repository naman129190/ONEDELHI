package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@ShowFirstParty
@KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    @KeepForSdk
    /* renamed from: d */
    public static boolean m9195d(@mr2 Context context, @ts2 Intent intent) {
        if (intent == null) {
            return false;
        }
        return WakefulBroadcastReceiver.m4719b(intent);
    }
}
