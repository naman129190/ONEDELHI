package com.google.android.gms.common.api.internal;

import com.onedelhi.secure.ly4;

abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw zab;

    public /* synthetic */ zaav(zaaw zaaw, zaau zaau) {
        this.zab = zaaw;
    }

    @ly4
    public final void run() {
        this.zab.zab.lock();
        try {
            if (!Thread.interrupted()) {
                zaa();
            }
        } catch (RuntimeException e) {
            this.zab.zaa.zam(e);
        } catch (Throwable th) {
            this.zab.zab.unlock();
            throw th;
        }
        this.zab.zab.unlock();
    }

    @ly4
    public abstract void zaa();
}
