package com.onedelhi.secure;

import android.os.Bundle;
import android.text.TextUtils;

public final /* synthetic */ class gf6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f12556a;

    /* renamed from: a */
    public final /* synthetic */ ri6 f12557a;

    /* renamed from: b */
    public final /* synthetic */ long f12558b;

    public /* synthetic */ gf6(ri6 ri6, Bundle bundle, long j) {
        this.f12557a = ri6;
        this.f12556a = bundle;
        this.f12558b = j;
    }

    public final void run() {
        ri6 ri6 = this.f12557a;
        Bundle bundle = this.f12556a;
        long j = this.f12558b;
        if (TextUtils.isEmpty(ri6.f11205a.mo27860B().mo27796t())) {
            ri6.mo23880F(bundle, 0, j);
        } else {
            ri6.f11205a.mo15136e().mo12732x().mo25379a("Using developer consent only; google app id found");
        }
    }
}
