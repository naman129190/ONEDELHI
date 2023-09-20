package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityCallback;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.RequestCallback;

public final /* synthetic */ class w13 implements RequestCallback {

    /* renamed from: a */
    public final /* synthetic */ CheckPhonePeAvailabilityCallback f36834a;

    public /* synthetic */ w13(CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        this.f36834a = checkPhonePeAvailabilityCallback;
    }

    public final void onResponse(String str) {
        PhonePe.irjuc(this.f36834a, str);
    }
}
