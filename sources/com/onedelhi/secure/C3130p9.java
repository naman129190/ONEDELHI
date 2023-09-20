package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.onedelhi.secure.p9 */
public final class C3130p9 {

    /* renamed from: a */
    public static final String f18410a = "AppVersionSignature";

    /* renamed from: a */
    public static final ConcurrentMap<String, ky1> f18411a = new ConcurrentHashMap();

    @ts2
    /* renamed from: a */
    public static PackageInfo m24530a(@mr2 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f18410a, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @mr2
    /* renamed from: b */
    public static String m24531b(@ts2 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @mr2
    /* renamed from: c */
    public static ky1 m24532c(@mr2 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, ky1> concurrentMap = f18411a;
        ky1 ky1 = (ky1) concurrentMap.get(packageName);
        if (ky1 != null) {
            return ky1;
        }
        ky1 d = m24533d(context);
        ky1 putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    @mr2
    /* renamed from: d */
    public static ky1 m24533d(@mr2 Context context) {
        return new mt2(m24531b(m24530a(context)));
    }

    @hw4
    /* renamed from: e */
    public static void m24534e() {
        f18411a.clear();
    }
}
