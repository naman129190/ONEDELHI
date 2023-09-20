package com.onedelhi.secure;

import android.database.ContentObserver;
import android.os.Handler;

public final class rt5 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ vt5 f20096a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rt5(vt5 vt5, Handler handler) {
        super((Handler) null);
        this.f20096a = vt5;
    }

    public final void onChange(boolean z) {
        this.f20096a.mo26330e();
    }
}
