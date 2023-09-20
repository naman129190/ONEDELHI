package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

public class pm4 {

    /* renamed from: a */
    public static String[] f33740a;

    /* renamed from: a */
    public static boolean m61454a(@mr2 URI uri, @mr2 Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C7012v5.m67717e().mo46000a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f33740a == null) {
            f33740a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f33740a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
