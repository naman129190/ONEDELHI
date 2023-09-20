package com.onedelhi.secure;

import android.os.Handler;
import android.os.SystemClock;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;

public final class a25 {
    @zw1
    /* renamed from: a */
    public static final void m36002a() {
        boolean z;
        try {
            y15 y15 = (y15) PhonePe.getObjectFactory().mo48873i(y15.class);
            boolean z2 = y15.f37762a.mo48862b().getBoolean("event_batching_enabled", true);
            try {
                z = l05.m55205i((Boolean) PhonePe.getObjectFactory().mo48872h("SDK_INIT_SUCCESS"));
            } catch (PhonePeInitException e) {
                m05.m56773d("Utils", e.getMessage(), e);
                z = false;
            }
            if (!z && z2) {
                m05.m56772c("events", "event ingestion init");
                Handler handler = new Handler();
                Long valueOf = Long.valueOf(y15.f37762a.mo48862b().getLong("event_batching_delay_ms", jg3.f30769e));
                Long valueOf2 = Long.valueOf(y15.f37762a.mo48862b().getLong("event_batching_timeout_ms", 480000));
                Long valueOf3 = Long.valueOf(y15.f37762a.mo48862b().getLong("event_batching_batch_size", 6));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                jt1.m53776o(valueOf, "delayMs");
                handler.postDelayed(new o95(elapsedRealtime + valueOf.longValue(), valueOf2, valueOf3, handler, valueOf), valueOf.longValue());
            }
        } catch (Exception unused) {
        }
    }
}
