package com.onedelhi.secure;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@sj3(22)
public class p64 {

    /* renamed from: a */
    public static Method f18406a;

    @sj3(29)
    /* renamed from: com.onedelhi.secure.p64$a */
    public static class C3128a {
        @pn0
        /* renamed from: a */
        public static int m24518a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    /* renamed from: a */
    public static int m24517a(int i) {
        Method declaredMethod;
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return C3128a.m24518a(i);
        }
        try {
            if (f18406a == null) {
                if (i2 >= 26) {
                    declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", new Class[]{Integer.TYPE});
                } else {
                    declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotId", new Class[]{Integer.TYPE});
                }
                f18406a = declaredMethod;
                f18406a.setAccessible(true);
            }
            Integer num = (Integer) f18406a.invoke((Object) null, new Object[]{Integer.valueOf(i)});
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
