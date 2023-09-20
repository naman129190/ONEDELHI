package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityInternalCallback;
import com.phonepe.intent.sdk.api.PhonePe;

public final class l95 implements t25 {

    /* renamed from: a */
    public final /* synthetic */ CheckPhonePeAvailabilityInternalCallback f31604a;

    public l95(CheckPhonePeAvailabilityInternalCallback checkPhonePeAvailabilityInternalCallback) {
        this.f31604a = checkPhonePeAvailabilityInternalCallback;
    }

    /* renamed from: c */
    public void mo30383c(int i, @vr2 String str) {
        jt1.m53777p(str, "error");
        m05.m56772c("checkAvailability", jt1.m53745C("onFailure ", str));
        this.f31604a.onFailure(false, "API_CALL_FAILED");
    }

    /* renamed from: h */
    public void mo30387h(@vr2 String str) {
        jt1.m53777p(str, "response");
        m05.m56772c("checkAvailability", jt1.m53745C("onSuccess ", str));
        vz4 vz4 = (vz4) h15.fromJsonString(str, PhonePe.getObjectFactory(), vz4.class);
        if (vz4 != null) {
            CheckPhonePeAvailabilityInternalCallback checkPhonePeAvailabilityInternalCallback = this.f31604a;
            String str2 = (String) vz4.get("code");
            if (str2 == null ? false : str2.equals("SUCCESS")) {
                StringBuilder sb = new StringBuilder();
                sb.append("availabilityCheckResponse isPaymentSupported ");
                Object obj = h15.get(vz4.mo41502a(), "available");
                jt1.m53776o(obj, "get(getData(), KEY_AVAILABLE)");
                sb.append(((Boolean) obj).booleanValue());
                sb.append(' ');
                Object obj2 = h15.get(vz4.mo41502a(), "responseCode");
                jt1.m53776o(obj2, "get(getData(), KEY_RESPONSE_CODE)");
                sb.append((String) obj2);
                m05.m56772c("checkAvailability", sb.toString());
                Object obj3 = h15.get(vz4.mo41502a(), "available");
                jt1.m53776o(obj3, "get(getData(), KEY_AVAILABLE)");
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                Object obj4 = h15.get(vz4.mo41502a(), "responseCode");
                jt1.m53776o(obj4, "get(getData(), KEY_RESPONSE_CODE)");
                checkPhonePeAvailabilityInternalCallback.onSuccess(booleanValue, (String) obj4);
            }
        }
    }
}
