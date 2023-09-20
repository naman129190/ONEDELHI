package com.onedelhi.secure;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;

public final /* synthetic */ class uu0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f36288a;

    /* renamed from: a */
    public final /* synthetic */ EnhancedIntentService f36289a;

    /* renamed from: a */
    public final /* synthetic */ x94 f36290a;

    public /* synthetic */ uu0(EnhancedIntentService enhancedIntentService, Intent intent, x94 x94) {
        this.f36289a = enhancedIntentService;
        this.f36288a = intent;
        this.f36290a = x94;
    }

    public final void run() {
        this.f36289a.m34648i(this.f36288a, this.f36290a);
    }
}
