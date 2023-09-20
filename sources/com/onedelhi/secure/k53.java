package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

public final class k53 {

    @sj3(16)
    /* renamed from: com.onedelhi.secure.k53$a */
    public static class C2599a {

        /* renamed from: a */
        public static final Object f14744a = new Object();

        /* renamed from: a */
        public static Method f14745a;

        /* renamed from: a */
        public static boolean f14746a;

        @SuppressLint({"PrivateApi"})
        /* renamed from: a */
        public static boolean m19466a(int i) {
            try {
                synchronized (f14744a) {
                    if (!f14746a) {
                        f14746a = true;
                        f14745a = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f14745a;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @sj3(17)
    /* renamed from: com.onedelhi.secure.k53$b */
    public static class C2600b {

        /* renamed from: a */
        public static final Object f14747a = new Object();

        /* renamed from: a */
        public static Method f14748a;

        /* renamed from: a */
        public static boolean f14749a;

        @SuppressLint({"DiscouragedPrivateApi"})
        /* renamed from: a */
        public static boolean m19467a(int i) {
            try {
                synchronized (f14747a) {
                    if (!f14749a) {
                        f14749a = true;
                        f14748a = UserHandle.class.getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f14748a;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.k53$c */
    public static class C2601c {
        /* renamed from: a */
        public static boolean m19468a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    /* renamed from: a */
    public static boolean m19465a(int i) {
        return Build.VERSION.SDK_INT >= 24 ? C2601c.m19468a(i) : C2600b.m19467a(i);
    }
}
