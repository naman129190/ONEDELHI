package com.onedelhi.secure;

import android.util.Base64;
import com.onedelhi.secure.g15;
import java.util.HashMap;
import java.util.Map;
import jmjou.C7600b;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONArray;
import org.json.JSONObject;

public class zz4 implements C7606e {

    /* renamed from: a */
    public g15 f38517a;

    /* renamed from: a */
    public q15 f38518a;

    /* renamed from: a */
    public C7528b f38519a;

    /* renamed from: a */
    public C7601c f38520a;

    /* renamed from: com.onedelhi.secure.zz4$a */
    public class C7527a implements g15.C5355a {

        /* renamed from: a */
        public final /* synthetic */ t25 f38521a;

        /* renamed from: a */
        public final /* synthetic */ String f38523a;

        /* renamed from: a */
        public final /* synthetic */ JSONObject f38524a;

        public C7527a(String str, JSONObject jSONObject, t25 t25) {
            this.f38523a = str;
            this.f38524a = jSONObject;
            this.f38521a = t25;
        }

        /* renamed from: a */
        public void mo36534a(Map<String, String> map) {
            zz4.this.f38518a.mo43082a(this.f38523a, map, this.f38524a.toString(), this.f38521a, false);
        }
    }

    /* renamed from: com.onedelhi.secure.zz4$b */
    public static class C7528b extends C7600b {
        /* renamed from: a */
        public String mo31298a() {
            return "1bca992e-c98b-4ab7-a789-737ec20fd436";
        }
    }

    /* renamed from: a */
    public void mo48477a(u25 u25) {
        Class cls = y15.class;
        if (((y15) this.f38520a.mo48873i(cls)).f37762a.mo48862b().getBoolean("event_batching_event_ingestion_enabled", true) && ((y15) this.f38520a.mo48873i(cls)).f37762a.mo48862b().getBoolean("event_batching_enabled", true)) {
            mo48479c(u25);
        } else if (((y15) this.f38520a.mo48873i(cls)).f37762a.mo48862b().getBoolean("event_batching_event_ingestion_enabled", true)) {
            this.f38520a.getClass();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(u25.toJsonObject());
            if (jSONArray.length() != 0) {
                String jSONArray2 = jSONArray.toString();
                mo48480d(jSONArray2, new tz4(this, jSONArray2));
            }
        }
    }

    /* renamed from: b */
    public u25 mo48478b(String str) {
        m05.m56774e("AnalyticsManager", String.format("preparing event with name : {%s}", new Object[]{str}));
        u25 u25 = (u25) this.f38520a.mo48873i(u25.class);
        u25.put("eventName", str);
        return u25;
    }

    /* renamed from: c */
    public final void mo48479c(u25 u25) {
        if (u25 != null) {
            C7528b bVar = this.f38519a;
            String jsonString = u25.toJsonString();
            String string = bVar.mo48862b().getString("1bca992e", (String) null);
            if (string != null) {
                m05.m56770a("AnalyticsManager", "events for previous sessions are available in db");
                jsonString = string + "@%#" + jsonString;
                m05.m56774e("AnalyticsManager", String.format("event json string = {%s} .", new Object[]{jsonString}));
            }
            m05.m56770a("AnalyticsManager", "saving events in local db ...");
            bVar.mo48862b().edit().putString("1bca992e", jsonString).apply();
        }
    }

    /* renamed from: d */
    public final void mo48480d(String str, t25 t25) {
        this.f38520a.getClass();
        HashMap hashMap = new HashMap();
        try {
            e35 e35 = (e35) this.f38520a.mo48873i(e35.class);
            e35.put("events", e35.getObjectFactory().mo48868d(str));
            e35.put("sdkContext", ((w15) this.f38520a.mo48873i(w15.class)).toJsonObject());
            e35.put("merchantId", (String) this.f38520a.mo48872h("com.phonepe.android.sdk.MerchantId"));
            e35.put("transactionId", (String) this.f38520a.mo48872h("transactionId"));
            String jsonString = e35.toJsonString();
            jsonString.replace("\n", "");
            String encodeToString = Base64.encodeToString(jsonString.getBytes("UTF-8"), 2);
            String e = l05.m55201e(this.f38520a, "/apis/v2/sdk/event", encodeToString);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request", encodeToString);
            m05.m56772c("AnalyticsManager", e35.toJsonString());
            hashMap.put("X-SDK-CHECKSUM", e);
            boolean i = l05.m55205i((Boolean) this.f38520a.mo48872h("com.phonepe.android.sdk.isUAT"));
            this.f38517a.mo36532m(hashMap, new C7527a(d35.m44668a(i).f27213b + "/apis/v2/sdk/event", jSONObject, t25));
        } catch (Exception e2) {
            m05.m56773d("AnalyticsManager", e2.getMessage(), e2);
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f38520a = cVar;
        this.f38519a = (C7528b) cVar.mo48873i(C7528b.class);
        this.f38517a = (g15) this.f38520a.mo48873i(g15.class);
        this.f38518a = (uz4) cVar.mo48873i(uz4.class);
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
