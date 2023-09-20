package com.onedelhi.secure;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

@sj3(26)
public final class a71 implements pb1, ComponentCallbacks2 {
    /* renamed from: a */
    public void mo12809a(Activity activity) {
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}
