package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;

public class m95 {

    /* renamed from: a */
    public String f32066a;

    /* renamed from: b */
    public String f32067b;

    /* renamed from: c */
    public String f32068c;

    /* renamed from: d */
    public String f32069d;

    /* renamed from: e */
    public String f32070e;

    /* renamed from: a */
    public static m95 m57004a(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            m05.m56771b("IntentResponse", "intent is null or empty");
            return null;
        }
        m95 m95 = new m95();
        Bundle extras = intent.getExtras();
        m95.f32066a = extras.getString("response");
        m95.f32067b = extras.getString(q13.f33945g);
        m95.f32070e = extras.getString("responseCode");
        m95.f32069d = extras.getString("txnId");
        m95.f32068c = extras.getString("txnRef");
        m05.m56772c("IntentResponse", String.format("IntentResponse = {%s}", new Object[]{m95.toString()}));
        return m95;
    }

    public String toString() {
        return "response:" + this.f32066a + " :: status:" + this.f32067b + " :: txnRef: " + this.f32068c + " :: txnId" + this.f32069d + " :: responseCode" + this.f32070e;
    }
}
