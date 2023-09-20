package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.AvailabilityCheckRequest;
import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityCallback;
import com.phonepe.intent.sdk.api.PhonePe;

public final /* synthetic */ class v13 implements CheckPhonePeAvailabilityCallback {

    /* renamed from: a */
    public final /* synthetic */ AvailabilityCheckRequest f36400a;

    /* renamed from: a */
    public final /* synthetic */ CheckPhonePeAvailabilityCallback f36401a;

    public /* synthetic */ v13(AvailabilityCheckRequest availabilityCheckRequest, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        this.f36400a = availabilityCheckRequest;
        this.f36401a = checkPhonePeAvailabilityCallback;
    }

    public final void onResponse(boolean z, String str) {
        PhonePe.irjuc(this.f36400a, this.f36401a, z, str);
    }
}
