package com.onedelhi.secure;

import android.os.Looper;

public class pq4 {
    /* renamed from: a */
    public static void m61624a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
