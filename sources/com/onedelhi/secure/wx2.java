package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

public final class wx2 {
    @hl3({hl3.C2354a.LIBRARY})

    /* renamed from: a */
    public static final String f22358a = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f22359b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @sj3(30)
    /* renamed from: com.onedelhi.secure.wx2$a */
    public static class C3880a {
        /* renamed from: a */
        public static boolean m31171a(@mr2 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.wx2$b */
    public @interface C3881b {
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: a */
    public static boolean m31168a(@mr2 PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 30;
        boolean z2 = i >= 23 && i < 30;
        boolean z3 = m31169b(packageManager) != null;
        if (!z) {
            return z2 && z3;
        }
        return true;
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: b */
    public static String m31169b(@mr2 PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(f22359b).setData(Uri.fromParts("package", "com.example", (String) null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @mr2
    /* renamed from: c */
    public static m42<Integer> m31170c(@mr2 Context context) {
        int i;
        bk3 G = bk3.m11940G();
        if (!yp4.m32589a(context)) {
            G.mo13747B(0);
            Log.e(f22358a, "User is in locked direct boot mode");
            return G;
        } else if (!m31168a(context.getPackageManager())) {
            G.mo13747B(1);
            return G;
        } else {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i2 < 30) {
                G.mo13747B(0);
                Log.e(f22358a, "Target SDK version below API 30");
                return G;
            }
            int i3 = Build.VERSION.SDK_INT;
            int i4 = 4;
            if (i3 >= 31) {
                if (C3880a.m31171a(context)) {
                    if (i2 >= 31) {
                        i4 = 5;
                    }
                    i = Integer.valueOf(i4);
                } else {
                    i = 2;
                }
                G.mo13747B(i);
                return G;
            } else if (i3 == 30) {
                if (!C3880a.m31171a(context)) {
                    i4 = 2;
                }
                G.mo13747B(Integer.valueOf(i4));
                return G;
            } else {
                ro4 ro4 = new ro4(context);
                G.mo17486l(new vx2(ro4), Executors.newSingleThreadExecutor());
                ro4.mo23972a(G);
                return G;
            }
        }
    }
}
