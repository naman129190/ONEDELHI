package com.onedelhi.secure;

import android.content.Context;

public class lr1 {

    /* renamed from: b */
    public static final String f31801b = "";

    /* renamed from: a */
    public String f31802a;

    /* renamed from: b */
    public static String m56342b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* renamed from: a */
    public synchronized String mo40216a(Context context) {
        if (this.f31802a == null) {
            this.f31802a = m56342b(context);
        }
        return "".equals(this.f31802a) ? null : this.f31802a;
    }
}
