package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class l13 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.l13$a */
    public static class C2685a {
        @pn0
        /* renamed from: a */
        public static int m20152a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @pn0
        /* renamed from: b */
        public static int m20153b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.l13$b */
    public @interface C2686b {
    }

    @SuppressLint({"UniqueConstants"})
    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.l13$c */
    public @interface C2687c {
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static int m20150a(@mr2 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C2685a.m20152a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m20151b(@mr2 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C2685a.m20153b(permissionInfo) : permissionInfo.protectionLevel & -16;
    }
}
