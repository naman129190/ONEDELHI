package com.onedelhi.secure;

public class tz4 implements t25 {

    /* renamed from: a */
    public final /* synthetic */ zz4 f35854a;

    /* renamed from: b */
    public final /* synthetic */ String f35855b;

    public tz4(zz4 zz4, String str) {
        this.f35854a = zz4;
        this.f35855b = str;
    }

    /* renamed from: c */
    public void mo30383c(int i, String str) {
        m05.m56771b("AnalyticsManager", String.format("Failed to inject events!!!, count = {%d},responseCode = {%d}, response = {%s} for payload = {%s}", new Object[]{Integer.valueOf(this.f35854a.f38520a.mo48868d(this.f35855b).length()), Integer.valueOf(i), str, this.f35855b}));
    }

    /* renamed from: h */
    public void mo30387h(String str) {
        m05.m56774e("AnalyticsManager", String.format("events!!! ingestion succeeded. count = {%d}, payload = {%s}", new Object[]{Integer.valueOf(this.f35854a.f38520a.mo48868d(this.f35855b).length()), this.f35855b}));
    }
}
