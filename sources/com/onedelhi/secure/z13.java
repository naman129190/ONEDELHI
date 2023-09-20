package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.ShowPhonePeCallback;
import com.phonepe.intent.sdk.api.UserValidityCallback;

public final /* synthetic */ class z13 implements ShowPhonePeCallback {

    /* renamed from: a */
    public final /* synthetic */ UserValidityCallback f38195a;

    /* renamed from: a */
    public final /* synthetic */ String f38196a;

    public /* synthetic */ z13(String str, UserValidityCallback userValidityCallback) {
        this.f38196a = str;
        this.f38195a = userValidityCallback;
    }

    public final void onResponse(boolean z) {
        PhonePe.irjuc(this.f38196a, this.f38195a, z);
    }
}
