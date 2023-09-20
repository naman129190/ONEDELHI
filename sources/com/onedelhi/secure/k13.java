package com.onedelhi.secure;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class k13 {

    /* renamed from: a */
    public static final int f14674a = 0;

    /* renamed from: b */
    public static final int f14675b = -1;

    /* renamed from: c */
    public static final int f14676c = -2;

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.k13$a */
    public @interface C2590a {
    }

    /* renamed from: a */
    public static int m19366a(@mr2 Context context, @mr2 String str) {
        return m19368c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* renamed from: b */
    public static int m19367b(@mr2 Context context, @mr2 String str, @ts2 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return m19368c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: c */
    public static int m19368c(@mr2 Context context, @mr2 String str, int i, int i2, @ts2 String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String f = C1865c9.m12407f(str);
        if (f == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && ot2.m24056a(context.getPackageName(), str2) ? C1865c9.m12402a(context, i2, f, str2) : C1865c9.m12406e(context, f, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: d */
    public static int m19369d(@mr2 Context context, @mr2 String str) {
        return m19368c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
