package com.onedelhi.secure;

import android.app.Activity;

public class o15 {
    /* renamed from: a */
    public static boolean m58890a(@mr2 Activity activity, @mr2 String str) {
        boolean z = r70.m26348a(activity, str) == 0;
        m05.m56772c("PermissionUtils", String.format("permission status {%s : %s}", new Object[]{str, Boolean.valueOf(z)}));
        return z;
    }
}
