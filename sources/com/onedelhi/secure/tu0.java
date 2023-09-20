package com.onedelhi.secure;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;

public final /* synthetic */ class tu0 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ Intent f35787a;

    /* renamed from: a */
    public final /* synthetic */ EnhancedIntentService f35788a;

    public /* synthetic */ tu0(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f35788a = enhancedIntentService;
        this.f35787a = intent;
    }

    public final void onComplete(w94 w94) {
        this.f35788a.m34647h(this.f35787a, w94);
    }
}
