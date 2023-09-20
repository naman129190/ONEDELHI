package com.onedelhi.secure;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class g36 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ j36 f12412a;

    public g36(j36 j36) {
        this.f12412a = j36;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f12412a.mo18132v(new m16(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f12412a.mo18132v(new d36(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f12412a.mo18132v(new u26(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f12412a.mo18132v(new s16(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        lr5 lr5 = new lr5();
        this.f12412a.mo18132v(new a36(this, activity, lr5));
        Bundle k8 = lr5.mo19765k8(50);
        if (k8 != null) {
            bundle.putAll(k8);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f12412a.mo18132v(new p16(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f12412a.mo18132v(new x26(this, activity));
    }
}
