package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class la4 {

    /* renamed from: a */
    public static Method f15273a;

    /* renamed from: b */
    public static Method f15274b;

    @sj3(23)
    /* renamed from: com.onedelhi.secure.la4$a */
    public static class C2712a {
        @SuppressLint({"MissingPermission"})
        @wj3("android.permission.READ_PHONE_STATE")
        @pn0
        @ts2
        /* renamed from: a */
        public static String m20425a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.la4$b */
    public static class C2713b {
        @SuppressLint({"MissingPermission"})
        @wj3("android.permission.READ_PHONE_STATE")
        @pn0
        @ts2
        /* renamed from: a */
        public static String m20426a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.la4$c */
    public static class C2714c {
        @pn0
        /* renamed from: a */
        public static int m20427a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @wj3("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    @ts2
    /* renamed from: a */
    public static String m20423a(@mr2 TelephonyManager telephonyManager) {
        int b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return C2713b.m20426a(telephonyManager);
        }
        if (i < 22 || (b = m20424b(telephonyManager)) == Integer.MAX_VALUE || b == -1) {
            return telephonyManager.getDeviceId();
        }
        int a = p64.m24517a(b);
        if (i >= 23) {
            return C2712a.m20425a(telephonyManager, a);
        }
        try {
            if (f15273a == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceId", new Class[]{Integer.TYPE});
                f15273a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (String) f15273a.invoke(telephonyManager, new Object[]{Integer.valueOf(a)});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: b */
    public static int m20424b(@mr2 TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C2714c.m20427a(telephonyManager);
        }
        if (i < 22) {
            return Integer.MAX_VALUE;
        }
        try {
            if (f15274b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f15274b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f15274b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
