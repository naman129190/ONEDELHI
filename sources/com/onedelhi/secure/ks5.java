package com.onedelhi.secure;

import android.os.Build;
import android.util.Log;

public final class ks5 extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
            return px5.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return px5.class;
    }
}
