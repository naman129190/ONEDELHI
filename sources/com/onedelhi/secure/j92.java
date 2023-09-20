package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.os.SystemClock;

public final class j92 {

    /* renamed from: a */
    public static final double f14042a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m18213a(long j) {
        return ((double) (m18214b() - j)) * f14042a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m18214b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
