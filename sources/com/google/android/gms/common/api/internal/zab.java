package com.google.android.gms.common.api.internal;

import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.hw4;
import java.lang.ref.WeakReference;

public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @hw4(otherwise = 2)
    public zab(zaa zaa2) {
        this.zaa = new WeakReference(zaa2);
    }

    @C7277xt
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaa2 = (zaa) this.zaa.get();
        if (zaa2 != null) {
            zaa2.zac(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
