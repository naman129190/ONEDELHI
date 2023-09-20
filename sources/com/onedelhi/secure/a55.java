package com.onedelhi.secure;

import android.os.Build;

public final class a55 {
    @C3196px(api = 33, codename = "Tiramisu")
    /* renamed from: a */
    public static boolean m10794a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
