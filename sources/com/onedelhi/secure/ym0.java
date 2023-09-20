package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

public final class ym0 {

    /* renamed from: a */
    public static final int f23215a = 3840;

    /* renamed from: b */
    public static final int f23216b = 2160;

    @sj3(17)
    /* renamed from: com.onedelhi.secure.ym0$a */
    public static class C4007a {
        /* renamed from: a */
        public static void m32487a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.ym0$b */
    public static class C4008b {
        @mr2
        /* renamed from: a */
        public static C4009c m32488a(@mr2 Context context, @mr2 Display display) {
            Display.Mode mode = display.getMode();
            Point a = ym0.m32477a(context, display);
            return (a == null || m32491d(mode, a)) ? new C4009c(mode, true) : new C4009c(mode, a);
        }

        @mr2
        @SuppressLint({"ArrayReturn"})
        /* renamed from: b */
        public static C4009c[] m32489b(@mr2 Context context, @mr2 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            C4009c[] cVarArr = new C4009c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a = ym0.m32477a(context, display);
            if (a == null || m32491d(mode, a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    cVarArr[i] = new C4009c(supportedModes[i], m32492e(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    cVarArr[i2] = m32492e(supportedModes[i2], mode) ? new C4009c(supportedModes[i2], a) : new C4009c(supportedModes[i2], false);
                }
            }
            return cVarArr;
        }

        /* renamed from: c */
        public static boolean m32490c(@mr2 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public static boolean m32491d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        /* renamed from: e */
        public static boolean m32492e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    /* renamed from: com.onedelhi.secure.ym0$c */
    public static final class C4009c {

        /* renamed from: a */
        public final Point f23217a;

        /* renamed from: a */
        public final Display.Mode f23218a;

        /* renamed from: a */
        public final boolean f23219a;

        @sj3(23)
        /* renamed from: com.onedelhi.secure.ym0$c$a */
        public static class C4010a {
            @pn0
            /* renamed from: a */
            public static int m32497a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @pn0
            /* renamed from: b */
            public static int m32498b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public C4009c(@mr2 Point point) {
            k43.m19456m(point, "physicalSize == null");
            this.f23217a = point;
            this.f23218a = null;
            this.f23219a = true;
        }

        @sj3(23)
        public C4009c(@mr2 Display.Mode mode, @mr2 Point point) {
            k43.m19456m(mode, "mode == null, can't wrap a null reference");
            k43.m19456m(point, "physicalSize == null");
            this.f23217a = point;
            this.f23218a = mode;
            this.f23219a = true;
        }

        @sj3(23)
        public C4009c(@mr2 Display.Mode mode, boolean z) {
            k43.m19456m(mode, "mode == null, can't wrap a null reference");
            this.f23217a = new Point(C4010a.m32498b(mode), C4010a.m32497a(mode));
            this.f23218a = mode;
            this.f23219a = z;
        }

        /* renamed from: a */
        public int mo27580a() {
            return this.f23217a.y;
        }

        /* renamed from: b */
        public int mo27581b() {
            return this.f23217a.x;
        }

        @Deprecated
        /* renamed from: c */
        public boolean mo27582c() {
            return this.f23219a;
        }

        @sj3(23)
        @ts2
        /* renamed from: d */
        public Display.Mode mo27583d() {
            return this.f23218a;
        }
    }

    /* renamed from: a */
    public static Point m32477a(@mr2 Context context, @mr2 Display display) {
        Point j = m32486j(Build.VERSION.SDK_INT < 28 ? "sys.display-size" : "vendor.display-size", display);
        if (j != null) {
            return j;
        }
        if (!m32483g(context) || !m32482f(display)) {
            return null;
        }
        return new Point(f23215a, f23216b);
    }

    @mr2
    /* renamed from: b */
    public static Point m32478b(@mr2 Context context, @mr2 Display display) {
        Point a = m32477a(context, display);
        if (a != null) {
            return a;
        }
        Point point = new Point();
        C4007a.m32487a(display, point);
        return point;
    }

    @mr2
    /* renamed from: c */
    public static C4009c m32479c(@mr2 Context context, @mr2 Display display) {
        return Build.VERSION.SDK_INT >= 23 ? C4008b.m32488a(context, display) : new C4009c(m32478b(context, display));
    }

    @mr2
    @SuppressLint({"ArrayReturn"})
    /* renamed from: d */
    public static C4009c[] m32480d(@mr2 Context context, @mr2 Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4008b.m32489b(context, display);
        }
        return new C4009c[]{m32479c(context, display)};
    }

    @ts2
    /* renamed from: e */
    public static String m32481e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m32482f(@mr2 Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4008b.m32490c(display);
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m32483g(@mr2 Context context) {
        return m32484h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    /* renamed from: h */
    public static boolean m32484h(@mr2 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: i */
    public static Point m32485i(@mr2 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @ts2
    /* renamed from: j */
    public static Point m32486j(@mr2 String str, @mr2 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e = m32481e(str);
        if (!TextUtils.isEmpty(e) && e != null) {
            try {
                return m32485i(e);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
