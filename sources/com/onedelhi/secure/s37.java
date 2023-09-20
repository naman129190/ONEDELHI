package com.onedelhi.secure;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class s37 extends LifecycleCallback {

    /* renamed from: a */
    public final List f20196a = new ArrayList();

    public s37(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    /* renamed from: a */
    public static s37 m27241a(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        s37 s37 = (s37) fragment.getCallbackOrNull("TaskOnStopCallback", s37.class);
        return s37 == null ? new s37(fragment) : s37;
    }

    /* renamed from: b */
    public final void mo24190b(vy6 vy6) {
        synchronized (this.f20196a) {
            this.f20196a.add(new WeakReference(vy6));
        }
    }

    @bc2
    public final void onStop() {
        synchronized (this.f20196a) {
            for (WeakReference weakReference : this.f20196a) {
                vy6 vy6 = (vy6) weakReference.get();
                if (vy6 != null) {
                    vy6.mo13015F();
                }
            }
            this.f20196a.clear();
        }
    }
}
