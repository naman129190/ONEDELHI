package com.onedelhi.secure;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class yp4 {

    @sj3(24)
    /* renamed from: com.onedelhi.secure.yp4$a */
    public static class C4019a {
        @pn0
        /* renamed from: a */
        public static boolean m32590a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m32589a(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4019a.m32590a(context);
        }
        return true;
    }
}
