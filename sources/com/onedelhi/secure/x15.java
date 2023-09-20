package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import java.util.HashMap;
import java.util.Map;
import jmjou.C7601c;
import org.json.JSONObject;

public final class x15 implements t25 {

    /* renamed from: a */
    public final /* synthetic */ C7601c f37309a;

    public x15(C7601c cVar) {
        this.f37309a = cVar;
    }

    /* renamed from: c */
    public void mo30383c(int i, @vr2 String str) {
        jt1.m53777p(str, "error");
        m05.m56772c("checkAvailability", jt1.m53745C("onFailure ", str));
    }

    /* renamed from: h */
    public void mo30387h(@vr2 String str) {
        JSONObject a;
        jt1.m53777p(str, "response");
        m05.m56772c("checkAvailability", jt1.m53745C("onSuccess ", str));
        r05 r05 = (r05) h15.fromJsonString(str, this.f37309a, r05.class);
        if (r05 != null) {
            C7601c cVar = this.f37309a;
            String str2 = (String) r05.get("code");
            if (str2 == null ? false : str2.equals("SUCCESS")) {
                m05.m56772c("checkAvailability", jt1.m53745C("data ", r05.mo41502a()));
                y15 y15 = (y15) cVar.mo48873i(y15.class);
                if (y15 != null && (a = r05.mo41502a()) != null) {
                    try {
                        if (a.has("sdkStartupConfig")) {
                            JSONObject jSONObject = a.getJSONObject("sdkStartupConfig");
                            if (jSONObject.has("availabilityCheck")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("availabilityCheck");
                                if (jSONObject2.has("enabled")) {
                                    y15.f37762a.mo48862b().edit().putBoolean("availability_check_enabled", jSONObject2.getBoolean("enabled")).apply();
                                }
                                if (jSONObject2.has("timeoutMs")) {
                                    Long valueOf = Long.valueOf(jSONObject2.getLong("timeoutMs"));
                                    y15.f37762a.mo48862b().edit().putLong("availability_check_timeout_ms", valueOf.longValue()).apply();
                                }
                            }
                            if (jSONObject.has("eventBatching")) {
                                JSONObject jSONObject3 = jSONObject.getJSONObject("eventBatching");
                                if (jSONObject3.has("enabled")) {
                                    y15.f37762a.mo48862b().edit().putBoolean("event_batching_enabled", jSONObject3.getBoolean("enabled")).apply();
                                }
                                if (jSONObject3.has("eventIngestionEnabled")) {
                                    y15.f37762a.mo48862b().edit().putBoolean("event_batching_event_ingestion_enabled", jSONObject3.getBoolean("eventIngestionEnabled")).apply();
                                }
                                if (jSONObject3.has("timeoutMs")) {
                                    Long valueOf2 = Long.valueOf(jSONObject3.getLong("timeoutMs"));
                                    y15.f37762a.mo48862b().edit().putLong("event_batching_timeout_ms", valueOf2.longValue()).apply();
                                }
                                if (jSONObject3.has("delayMs")) {
                                    Long valueOf3 = Long.valueOf(jSONObject3.getLong("delayMs"));
                                    y15.f37762a.mo48862b().edit().putLong("event_batching_delay_ms", valueOf3.longValue()).apply();
                                }
                                if (jSONObject3.has("batchSize")) {
                                    Long valueOf4 = Long.valueOf(jSONObject3.getLong("batchSize"));
                                    y15.f37762a.mo48862b().edit().putLong("event_batching_batch_size", valueOf4.longValue()).apply();
                                }
                            }
                            y15.f37763a.mo48875k("configSynced", Boolean.TRUE);
                        }
                    } catch (Exception e) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("error", e.getLocalizedMessage());
                        jt1.m53777p("SDK_SYNC_CONFIG_STORE_FAILED", "eventName");
                        zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
                        u25 b = zz4.mo48478b("SDK_SYNC_CONFIG_STORE_FAILED");
                        for (Map.Entry entry : hashMap.entrySet()) {
                            b.mo45379a((String) entry.getKey(), entry.getValue());
                        }
                        zz4.mo48477a(b);
                        m05.m56773d("IntentSDKConfig", e.getMessage(), e);
                    }
                }
            }
        }
    }
}
