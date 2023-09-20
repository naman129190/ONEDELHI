package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.onedelhi.secure.gq */
public final class C2267gq {

    @sj3(18)
    /* renamed from: com.onedelhi.secure.gq$a */
    public static class C2268a {
        @pn0
        /* renamed from: a */
        public static IBinder m16045a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @pn0
        /* renamed from: b */
        public static void m16046b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: com.onedelhi.secure.gq$b */
    public static class C2269b {

        /* renamed from: a */
        public static final String f12702a = "BundleCompatBaseImpl";

        /* renamed from: a */
        public static Method f12703a;

        /* renamed from: a */
        public static boolean f12704a;

        /* renamed from: b */
        public static Method f12705b;

        /* renamed from: b */
        public static boolean f12706b;

        /* renamed from: a */
        public static IBinder m16047a(Bundle bundle, String str) {
            if (!f12704a) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f12703a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(f12702a, "Failed to retrieve getIBinder method", e);
                }
                f12704a = true;
            }
            Method method2 = f12703a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(f12702a, "Failed to invoke getIBinder via reflection", e2);
                    f12703a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m16048b(Bundle bundle, String str, IBinder iBinder) {
            if (!f12706b) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f12705b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(f12702a, "Failed to retrieve putIBinder method", e);
                }
                f12706b = true;
            }
            Method method2 = f12705b;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(f12702a, "Failed to invoke putIBinder via reflection", e2);
                    f12705b = null;
                }
            }
        }
    }

    @ts2
    /* renamed from: a */
    public static IBinder m16043a(@mr2 Bundle bundle, @ts2 String str) {
        return C2268a.m16045a(bundle, str);
    }

    /* renamed from: b */
    public static void m16044b(@mr2 Bundle bundle, @ts2 String str, @ts2 IBinder iBinder) {
        C2268a.m16046b(bundle, str, iBinder);
    }
}
