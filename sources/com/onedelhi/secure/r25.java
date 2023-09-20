package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONObject;

public class r25 implements C7606e {

    /* renamed from: a */
    public b05 f34479a;

    /* renamed from: a */
    public List<String> f34480a;

    /* renamed from: a */
    public boolean mo43795a() {
        return this.f34479a.mo48862b().getBoolean("areWebLogsEnabled", false);
    }

    /* renamed from: b */
    public final int mo43796b(String str) {
        if (str.matches("DEBUG")) {
            return 0;
        }
        if (str.matches("INFO")) {
            return 1;
        }
        return str.matches("WARN") ? 2 : 3;
    }

    /* renamed from: c */
    public String mo43797c() {
        return this.f34479a.mo48862b().getString("precacheUrl", (String) null);
    }

    /* renamed from: d */
    public void mo43798d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("sdkConfig")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("sdkConfig");
                    JSONObject a = v15.m67586a(jSONObject3, "precache", false, false);
                    if (a != null) {
                        if (a.has("enabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("isPrecacheEnabled", v15.m67588c(a, "enabled", false, false)).apply();
                        }
                        this.f34479a.mo48862b().edit().putString("precacheUrl", v15.m67589d(a, ImagesContract.URL, false, false)).apply();
                    }
                    if (jSONObject3.has("cache")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("cache");
                        if (jSONObject4.has("usePrecache")) {
                            this.f34479a.mo48862b().edit().putBoolean("usePrecache", jSONObject4.getBoolean("usePrecache")).apply();
                        }
                        if (jSONObject4.has("webviewCacheEnabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("isWebViewCacheEnabled", jSONObject4.getBoolean("webviewCacheEnabled")).apply();
                        }
                        if (jSONObject4.has("fileTypes")) {
                            this.f34479a.mo48862b().edit().putString("fileTypes", jSONObject4.getJSONArray("fileTypes").toString()).apply();
                        }
                    }
                    if (jSONObject3.has("androidLogs")) {
                        JSONObject jSONObject5 = jSONObject3.getJSONObject("androidLogs");
                        if (jSONObject5.has("enabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("areAndroidLogsEnabled", jSONObject5.getBoolean("enabled")).apply();
                        }
                        if (jSONObject5.has("logLevel")) {
                            this.f34479a.mo48862b().edit().putInt("androidLogsLevel", mo43796b(jSONObject5.getString("logLevel"))).apply();
                        }
                        if (jSONObject5.has("reportingLevel")) {
                            this.f34479a.mo48862b().edit().putInt("androidLogsReportingLocation", jSONObject5.getString("reportingLevel").matches("REMOTE") ? 1 : 0).apply();
                        }
                    }
                    if (jSONObject3.has("webLogs")) {
                        JSONObject jSONObject6 = jSONObject3.getJSONObject("webLogs");
                        if (jSONObject6.has("enabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("areWebLogsEnabled", jSONObject6.getBoolean("enabled")).apply();
                        }
                        if (jSONObject6.has("logLevel")) {
                            this.f34479a.mo48862b().edit().putInt("webLogsLevel", mo43796b(jSONObject6.getString("logLevel"))).apply();
                        }
                        if (jSONObject6.has("reportingLevel")) {
                            this.f34479a.mo48862b().edit().putInt("webLogsReportingLocation", jSONObject6.getString("reportingLevel").matches("REMOTE") ? 1 : 0).apply();
                        }
                    }
                    if (jSONObject3.has("cacheMetricsReporting")) {
                        JSONObject jSONObject7 = jSONObject3.getJSONObject("cacheMetricsReporting");
                        if (jSONObject7.has("enabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("isCacheReportingEnabled", jSONObject7.getBoolean("enabled")).apply();
                        }
                    }
                    if (jSONObject3.has("sdkToAppCommunication")) {
                        JSONObject jSONObject8 = jSONObject3.getJSONObject("sdkToAppCommunication");
                        if (jSONObject8.has("showPhonePeEnabled")) {
                            this.f34479a.mo48862b().edit().putBoolean("showPhonePeEnabled", jSONObject8.getBoolean("showPhonePeEnabled")).apply();
                        }
                    }
                }
            } catch (Exception e) {
                m05.m56773d("SDKConfig", e.getMessage(), e);
            }
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f34479a = (b05) cVar.mo48873i(b05.class);
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
