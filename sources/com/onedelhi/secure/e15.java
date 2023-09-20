package com.onedelhi.secure;

import org.json.JSONArray;
import org.json.JSONException;

public class e15 implements t25 {

    /* renamed from: a */
    public final /* synthetic */ zz4 f27668a;

    /* renamed from: b */
    public final /* synthetic */ String f27669b;

    public e15(zz4 zz4, String str) {
        this.f27668a = zz4;
        this.f27669b = str;
    }

    /* renamed from: c */
    public void mo30383c(int i, String str) {
        m05.m56771b("AnalyticsManager", String.format("Failed to inject events!!!, count = {%d},responseCode = {%d}, response = {%s} for payload = {%s}", new Object[]{Integer.valueOf(this.f27668a.f38520a.mo48868d(this.f27669b).length()), Integer.valueOf(i), str, this.f27669b}));
        zz4 zz4 = this.f27668a;
        JSONArray d = zz4.f38520a.mo48868d(this.f27669b);
        for (int i2 = 0; i2 < d.length(); i2++) {
            try {
                zz4.mo48479c(u25.m66421b(zz4.f38520a, d.get(i2).toString()));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: h */
    public void mo30387h(String str) {
        m05.m56774e("AnalyticsManager", String.format("events!!! ingestion succeeded. count = {%d}, payload = {%s}", new Object[]{Integer.valueOf(this.f27668a.f38520a.mo48868d(this.f27669b).length()), this.f27669b}));
    }
}
