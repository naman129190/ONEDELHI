package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.RequestCallback;
import com.phonepe.intent.sdk.api.ShowPhonePeCallback;

public final /* synthetic */ class x13 implements RequestCallback {

    /* renamed from: a */
    public final /* synthetic */ ShowPhonePeCallback f37308a;

    public /* synthetic */ x13(ShowPhonePeCallback showPhonePeCallback) {
        this.f37308a = showPhonePeCallback;
    }

    public final void onResponse(String str) {
        PhonePe.irjuc(this.f37308a, str);
    }
}
