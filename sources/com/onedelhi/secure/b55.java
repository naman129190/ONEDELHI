package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class b55 extends r70 {
    @ts2
    @Deprecated
    /* renamed from: v */
    public static Intent m11574v(Context context, @ts2 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!a55.m10794a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != a55.m10794a() ? 0 : 2);
    }
}
