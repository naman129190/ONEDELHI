package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class cn6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ vp6 f10434a;

    /* renamed from: a */
    public final /* synthetic */ w94 f10435a;

    public cn6(vp6 vp6, w94 w94) {
        this.f10434a = vp6;
        this.f10435a = w94;
    }

    public final void run() {
        synchronized (this.f10434a.f21910a) {
            vp6 vp6 = this.f10434a;
            if (vp6.f21909a != null) {
                vp6.f21909a.mo7919c((Exception) Preconditions.checkNotNull(this.f10435a.mo17585q()));
            }
        }
    }
}
