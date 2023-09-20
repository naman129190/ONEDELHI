package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.ShowPhonePeCallback;
import jmjou.C7601c;

public final /* synthetic */ class a23 implements ShowPhonePeCallback {

    /* renamed from: a */
    public final /* synthetic */ ShowPhonePeCallback f25726a;

    /* renamed from: a */
    public final /* synthetic */ C7601c f25727a;

    public /* synthetic */ a23(C7601c cVar, ShowPhonePeCallback showPhonePeCallback) {
        this.f25727a = cVar;
        this.f25726a = showPhonePeCallback;
    }

    public final void onResponse(boolean z) {
        PhonePe.irjuc(this.f25727a, this.f25726a, z);
    }
}
