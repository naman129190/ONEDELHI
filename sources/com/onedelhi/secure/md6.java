package com.onedelhi.secure;

import android.database.ContentObserver;
import android.os.Handler;

public final class md6 extends ContentObserver {
    public md6(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        ke6.f14873a.set(true);
    }
}
