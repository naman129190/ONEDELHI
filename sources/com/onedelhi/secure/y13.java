package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.RequestCallback;
import com.phonepe.intent.sdk.api.UserValidityCallback;

public final /* synthetic */ class y13 implements RequestCallback {

    /* renamed from: a */
    public final /* synthetic */ UserValidityCallback f37760a;

    /* renamed from: a */
    public final /* synthetic */ boolean f37761a;

    public /* synthetic */ y13(UserValidityCallback userValidityCallback, boolean z) {
        this.f37760a = userValidityCallback;
        this.f37761a = z;
    }

    public final void onResponse(String str) {
        PhonePe.irjuc(this.f37760a, this.f37761a, str);
    }
}
