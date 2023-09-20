package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import com.onedelhi.secure.x50;

public class vg0 implements y50 {

    /* renamed from: a */
    public static final String f21756a = "ConnectivityMonitor";

    /* renamed from: b */
    public static final String f21757b = "android.permission.ACCESS_NETWORK_STATE";

    @mr2
    /* renamed from: a */
    public x50 mo26050a(@mr2 Context context, @mr2 x50.C3899a aVar) {
        boolean z = r70.m26348a(context, f21757b) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new ug0(context, aVar) : new ns2();
    }
}
