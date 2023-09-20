package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

public final class qs1 {
    @SuppressLint({"ActionValue"})

    /* renamed from: a */
    public static final String f19446a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b */
    public static final String f19447b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c */
    public static final String f19448c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})

    /* renamed from: d */
    public static final String f19449d = "android.intent.extra.TIME";

    /* renamed from: e */
    public static final String f19450e = "android.intent.category.LEANBACK_LAUNCHER";

    @sj3(15)
    /* renamed from: com.onedelhi.secure.qs1$a */
    public static class C3337a {
        @pn0
        /* renamed from: a */
        public static Intent m26148a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    @mr2
    /* renamed from: a */
    public static Intent m26146a(@mr2 Context context, @mr2 String str) {
        if (wx2.m31168a(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, (String) null));
            }
            Intent data = new Intent(wx2.f22359b).setData(Uri.fromParts("package", str, (String) null));
            return i >= 30 ? data : data.setPackage((String) k43.m19455l(wx2.m31169b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @mr2
    /* renamed from: b */
    public static Intent m26147b(@mr2 String str, @mr2 String str2) {
        return C3337a.m26148a(str, str2);
    }
}
