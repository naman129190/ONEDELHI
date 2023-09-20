package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.onedelhi.secure.bt */
public class C1804bt {
    @mr2
    /* renamed from: a */
    public static Handler m12056a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
