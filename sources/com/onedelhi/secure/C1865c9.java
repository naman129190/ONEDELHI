package com.onedelhi.secure;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: com.onedelhi.secure.c9 */
public final class C1865c9 {

    /* renamed from: a */
    public static final int f10198a = 0;

    /* renamed from: b */
    public static final int f10199b = 1;

    /* renamed from: c */
    public static final int f10200c = 2;

    /* renamed from: d */
    public static final int f10201d = 3;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.c9$a */
    public static class C1866a {
        @pn0
        /* renamed from: a */
        public static int m12408a(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }

        @pn0
        /* renamed from: b */
        public static int m12409b(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.c9$b */
    public static class C1867b {
        @pn0
        /* renamed from: a */
        public static <T> T m12410a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @pn0
        /* renamed from: b */
        public static int m12411b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @pn0
        /* renamed from: c */
        public static int m12412c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @pn0
        /* renamed from: d */
        public static String m12413d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.c9$c */
    public static class C1868c {
        @pn0
        /* renamed from: a */
        public static int m12414a(@ts2 AppOpsManager appOpsManager, @mr2 String str, int i, @mr2 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @mr2
        @pn0
        /* renamed from: b */
        public static String m12415b(@mr2 Context context) {
            return context.getOpPackageName();
        }

        @pn0
        @ts2
        /* renamed from: c */
        public static AppOpsManager m12416c(@mr2 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m12402a(@mr2 Context context, int i, @mr2 String str, @mr2 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m12406e(context, str, str2);
        }
        AppOpsManager c = C1868c.m12416c(context);
        int a = C1868c.m12414a(c, str, Binder.getCallingUid(), str2);
        return a != 0 ? a : C1868c.m12414a(c, str, i, C1868c.m12415b(context));
    }

    /* renamed from: b */
    public static int m12403b(@mr2 Context context, @mr2 String str, int i, @mr2 String str2) {
        return C1866a.m12408a((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    /* renamed from: c */
    public static int m12404c(@mr2 Context context, @mr2 String str, int i, @mr2 String str2) {
        return C1866a.m12409b((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    /* renamed from: d */
    public static int m12405d(@mr2 Context context, @mr2 String str, @mr2 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1867b.m12411b((AppOpsManager) C1867b.m12410a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: e */
    public static int m12406e(@mr2 Context context, @mr2 String str, @mr2 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1867b.m12412c((AppOpsManager) C1867b.m12410a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    @ts2
    /* renamed from: f */
    public static String m12407f(@mr2 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1867b.m12413d(str);
        }
        return null;
    }
}
