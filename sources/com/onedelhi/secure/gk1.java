package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gk1 {

    /* renamed from: a */
    public static volatile gk1 f12616a = null;

    /* renamed from: a */
    public static final File f12617a = new File("/proc/self/fd");

    /* renamed from: a */
    public static final String f12618a = "HardwareConfig";

    /* renamed from: c */
    public static final boolean f12619c;
    @hw4

    /* renamed from: d */
    public static final int f12620d = 128;

    /* renamed from: d */
    public static final boolean f12621d;

    /* renamed from: e */
    public static final int f12622e = 0;

    /* renamed from: f */
    public static final int f12623f = 50;

    /* renamed from: g */
    public static final int f12624g = 700;

    /* renamed from: h */
    public static final int f12625h = 20000;

    /* renamed from: i */
    public static final int f12626i = -1;

    /* renamed from: j */
    public static volatile int f12627j = -1;

    /* renamed from: a */
    public final int f12628a;

    /* renamed from: a */
    public final AtomicBoolean f12629a = new AtomicBoolean(false);

    /* renamed from: a */
    public final boolean f12630a = m15889h();

    /* renamed from: b */
    public final int f12631b;
    @mj1("this")

    /* renamed from: b */
    public boolean f12632b = true;
    @mj1("this")

    /* renamed from: c */
    public int f12633c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f12619c = i < 29;
        if (i < 26) {
            z = false;
        }
        f12621d = z;
    }

    @hw4
    public gk1() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12628a = f12625h;
            this.f12631b = 0;
            return;
        }
        this.f12628a = 700;
        this.f12631b = 128;
    }

    /* renamed from: d */
    public static gk1 m15888d() {
        if (f12616a == null) {
            synchronized (gk1.class) {
                if (f12616a == null) {
                    f12616a = new gk1();
                }
            }
        }
        return f12616a;
    }

    /* renamed from: h */
    public static boolean m15889h() {
        return !m15890i() && !m15891j();
    }

    /* renamed from: i */
    public static boolean m15890i() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m15891j() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: a */
    public boolean mo16685a() {
        oq4.m24014b();
        return !this.f12629a.get();
    }

    /* renamed from: b */
    public final boolean mo16686b() {
        return f12619c && !this.f12629a.get();
    }

    /* renamed from: c */
    public void mo16687c() {
        oq4.m24014b();
        this.f12629a.set(false);
    }

    /* renamed from: e */
    public final int mo16688e() {
        return f12627j != -1 ? f12627j : this.f12628a;
    }

    /* renamed from: f */
    public final synchronized boolean mo16689f() {
        boolean z = true;
        int i = this.f12633c + 1;
        this.f12633c = i;
        if (i >= 50) {
            this.f12633c = 0;
            int length = f12617a.list().length;
            long e = (long) mo16688e();
            if (((long) length) >= e) {
                z = false;
            }
            this.f12632b = z;
            if (!z && Log.isLoggable(oo0.f18037a, 5)) {
                Log.w(oo0.f18037a, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + e);
            }
        }
        return this.f12632b;
    }

    /* renamed from: g */
    public boolean mo16690g(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable(f12618a, 2)) {
                Log.v(f12618a, "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f12630a) {
            if (Log.isLoggable(f12618a, 2)) {
                Log.v(f12618a, "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f12621d) {
            if (Log.isLoggable(f12618a, 2)) {
                Log.v(f12618a, "Hardware config disallowed by sdk");
            }
            return false;
        } else if (mo16686b()) {
            if (Log.isLoggable(f12618a, 2)) {
                Log.v(f12618a, "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable(f12618a, 2)) {
                Log.v(f12618a, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.f12631b;
            if (i < i3) {
                if (Log.isLoggable(f12618a, 2)) {
                    Log.v(f12618a, "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable(f12618a, 2)) {
                    Log.v(f12618a, "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (mo16689f()) {
                return true;
            } else {
                if (Log.isLoggable(f12618a, 2)) {
                    Log.v(f12618a, "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    @TargetApi(26)
    /* renamed from: k */
    public boolean mo16691k(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean g = mo16690g(i, i2, z, z2);
        if (g) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return g;
    }

    /* renamed from: l */
    public void mo16692l() {
        oq4.m24014b();
        this.f12629a.set(true);
    }
}
