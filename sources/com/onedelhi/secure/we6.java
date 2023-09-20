package com.onedelhi.secure;

import android.database.ContentObserver;
import android.os.Handler;

public final class we6 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ ze6 f22095a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public we6(ze6 ze6, Handler handler) {
        super((Handler) null);
        this.f22095a = ze6;
    }

    public final void onChange(boolean z) {
        this.f22095a.mo27961f();
    }
}
