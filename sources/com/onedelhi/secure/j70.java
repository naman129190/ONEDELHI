package com.onedelhi.secure;

import android.content.ContentProvider;
import android.content.Context;

public final class j70 {
    @mr2
    /* renamed from: a */
    public static Context m18187a(@mr2 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
