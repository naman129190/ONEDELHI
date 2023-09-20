package com.onedelhi.secure;

import android.os.Bundle;
import android.text.TextUtils;

public final class ah6 implements er6 {

    /* renamed from: a */
    public final /* synthetic */ ri6 f9066a;

    public ah6(ri6 ri6) {
        this.f9066a = ri6;
    }

    /* renamed from: a */
    public final void mo13092a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f9066a.mo23909t(bf0.f26274c, "_err", bundle, str);
        } else {
            this.f9066a.mo23907r(bf0.f26274c, "_err", bundle);
        }
    }
}
