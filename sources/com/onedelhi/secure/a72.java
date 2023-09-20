package com.onedelhi.secure;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class a72 {

    /* renamed from: a */
    public static final String f8869a = "mockLocation";
    @ts2

    /* renamed from: a */
    public static Method f8870a = null;

    /* renamed from: b */
    public static final String f8871b = "verticalAccuracy";

    /* renamed from: c */
    public static final String f8872c = "speedAccuracy";

    /* renamed from: d */
    public static final String f8873d = "bearingAccuracy";

    @sj3(17)
    /* renamed from: com.onedelhi.secure.a72$a */
    public static class C1663a {
        @pn0
        /* renamed from: a */
        public static long m10887a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @sj3(18)
    /* renamed from: com.onedelhi.secure.a72$b */
    public static class C1664b {
        @pn0
        /* renamed from: a */
        public static boolean m10888a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.a72$c */
    public static class C1665c {
        @pn0
        /* renamed from: a */
        public static float m10889a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @pn0
        /* renamed from: b */
        public static float m10890b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @pn0
        /* renamed from: c */
        public static float m10891c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @pn0
        /* renamed from: d */
        public static boolean m10892d(Location location) {
            return location.hasBearingAccuracy();
        }

        @pn0
        /* renamed from: e */
        public static boolean m10893e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @pn0
        /* renamed from: f */
        public static boolean m10894f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @pn0
        /* renamed from: g */
        public static void m10895g(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @pn0
        /* renamed from: h */
        public static void m10896h(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @pn0
        /* renamed from: i */
        public static void m10897i(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* renamed from: a */
    public static float m10873a(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10889a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f8873d, 0.0f);
    }

    /* renamed from: b */
    public static long m10874b(@mr2 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(C1663a.m10887a(location));
    }

    /* renamed from: c */
    public static long m10875c(@mr2 Location location) {
        return C1663a.m10887a(location);
    }

    /* renamed from: d */
    public static Method m10876d() throws NoSuchMethodException {
        if (f8870a == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
            f8870a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f8870a;
    }

    /* renamed from: e */
    public static float m10877e(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10890b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f8872c, 0.0f);
    }

    /* renamed from: f */
    public static float m10878f(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10891c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    /* renamed from: g */
    public static boolean m10879g(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10892d(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(f8873d);
    }

    /* renamed from: h */
    public static boolean m10880h(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10893e(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(f8872c);
    }

    /* renamed from: i */
    public static boolean m10881i(@mr2 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1665c.m10894f(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("verticalAccuracy");
    }

    /* renamed from: j */
    public static boolean m10882j(@mr2 Location location) {
        return C1664b.m10888a(location);
    }

    /* renamed from: k */
    public static void m10883k(@mr2 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1665c.m10895g(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(f8873d, f);
    }

    /* renamed from: l */
    public static void m10884l(@mr2 Location location, boolean z) {
        try {
            m10876d().invoke(location, new Object[]{Boolean.valueOf(z)});
        } catch (NoSuchMethodException e) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e);
            throw noSuchMethodError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: m */
    public static void m10885m(@mr2 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1665c.m10896h(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(f8872c, f);
    }

    /* renamed from: n */
    public static void m10886n(@mr2 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1665c.m10897i(location, f);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat("verticalAccuracy", f);
    }
}
