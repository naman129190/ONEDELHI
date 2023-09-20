package com.onedelhi.secure;

import android.database.ContentObserver;
import android.os.Handler;

public final class ws5 extends ContentObserver {
    public ws5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        bt5.f9969a.set(true);
    }
}
