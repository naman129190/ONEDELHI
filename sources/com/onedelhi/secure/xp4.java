package com.onedelhi.secure;

import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@sj3(17)
public class xp4 {
    @ts2

    /* renamed from: a */
    public static Constructor<UserHandle> f22702a;
    @ts2

    /* renamed from: a */
    public static Method f22703a;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.xp4$a */
    public static class C3940a {
        private C3940a() {
        }

        @mr2
        /* renamed from: a */
        public static UserHandle m31621a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    /* renamed from: a */
    public static Method m31618a() throws NoSuchMethodException {
        if (f22703a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[]{Integer.TYPE});
            f22703a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f22703a;
    }

    /* renamed from: b */
    public static Constructor<UserHandle> m31619b() throws NoSuchMethodException {
        if (f22702a == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(new Class[]{Integer.TYPE});
            f22702a = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f22702a;
    }

    @mr2
    /* renamed from: c */
    public static UserHandle m31620c(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3940a.m31621a(i);
        }
        try {
            Method a = m31618a();
            Object[] objArr = {Integer.valueOf(i)};
            return m31619b().newInstance(new Object[]{(Integer) a.invoke((Object) null, objArr)});
        } catch (NoSuchMethodException e) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e);
            throw noSuchMethodError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (InstantiationException e3) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e3);
            throw instantiationError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
