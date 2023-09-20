package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.ak4;

public final class e96 {
    /* renamed from: a */
    public static String m13645a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C1410R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @ts2
    /* renamed from: b */
    public static final String m13646b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, ak4.C1709b.f9167e, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
