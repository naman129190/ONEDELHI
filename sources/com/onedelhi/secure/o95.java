package com.onedelhi.secure;

import android.os.Handler;
import android.os.SystemClock;
import com.phonepe.intent.sdk.api.PhonePe;
import org.json.JSONArray;

public final class o95 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Handler f32951a;

    /* renamed from: a */
    public final /* synthetic */ Long f32952a;

    /* renamed from: b */
    public final /* synthetic */ long f32953b;

    /* renamed from: b */
    public final /* synthetic */ Long f32954b;

    /* renamed from: c */
    public final /* synthetic */ Long f32955c;

    public o95(long j, Long l, Long l2, Handler handler, Long l3) {
        this.f32953b = j;
        this.f32952a = l;
        this.f32954b = l2;
        this.f32951a = handler;
        this.f32955c = l3;
    }

    public void run() {
        long j = this.f32953b;
        Long l = this.f32952a;
        jt1.m53776o(l, "timeoutMs");
        long longValue = l.longValue();
        Long l2 = this.f32954b;
        jt1.m53776o(l2, "batchSize");
        long longValue2 = l2.longValue();
        Handler handler = this.f32951a;
        Long l3 = this.f32955c;
        jt1.m53776o(l3, "delayMs");
        long longValue3 = l3.longValue();
        if (SystemClock.elapsedRealtime() - j <= longValue) {
            zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
            String string = zz4.f38519a.mo48862b().getString("1bca992e", (String) null);
            if (string == null) {
                m05.m56770a("AnalyticsManager", "event database is empty");
            } else {
                zz4.f38519a.mo48863c();
                String[] split = string.split("@%#");
                int i = 0;
                m05.m56772c("events", String.format("persisted {%d} events in previous sessions are fetched", new Object[]{Integer.valueOf(split.length)}));
                zz4.f38520a.getClass();
                JSONArray jSONArray = new JSONArray();
                if (((long) split.length) >= longValue2) {
                    int length = split.length;
                    while (i < length) {
                        u25 b = u25.m66421b(zz4.f38520a, split[i]);
                        if (b == null || ((long) jSONArray.length()) >= longValue2) {
                            zz4.mo48479c(b);
                        } else {
                            jSONArray.put(b.toJsonObject());
                        }
                        i++;
                    }
                } else if (split.length > 0) {
                    int length2 = split.length;
                    while (i < length2) {
                        u25 b2 = u25.m66421b(zz4.f38520a, split[i]);
                        if (b2 != null) {
                            jSONArray.put(b2.toJsonObject());
                        }
                        i++;
                    }
                }
                if (jSONArray.length() > 0) {
                    String jSONArray2 = jSONArray.toString();
                    zz4.mo48480d(jSONArray2, new e15(zz4, jSONArray2));
                }
            }
            handler.postDelayed(this, longValue3);
            return;
        }
        m05.m56772c("events", "timedout");
        handler.removeCallbacks(this);
    }
}
