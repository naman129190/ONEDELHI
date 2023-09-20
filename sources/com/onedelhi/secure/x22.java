package com.onedelhi.secure;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0703j;
import java.util.concurrent.atomic.AtomicBoolean;

public class x22 {

    /* renamed from: a */
    public static AtomicBoolean f22394a = new AtomicBoolean(false);

    @hw4
    /* renamed from: com.onedelhi.secure.x22$a */
    public static class C3891a extends ft0 {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0703j.m4831g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m31243a(Context context) {
        if (!f22394a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C3891a());
        }
    }
}
