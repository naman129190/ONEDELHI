package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class as0 {

    /* renamed from: a */
    public static final int f25985a = 128;

    /* renamed from: a */
    public static void m39029a(@mr2 Window window, boolean z) {
        m39030b(window, z, (Integer) null, (Integer) null);
    }

    /* renamed from: b */
    public static void m39030b(@mr2 Window window, boolean z, @ts2 @d10 Integer num, @ts2 @d10 Integer num2) {
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z2 = true;
        }
        if (z3 || z2) {
            int b = oe2.m23716b(window.getContext(), 16842801, -16777216);
            if (z3) {
                num = Integer.valueOf(b);
            }
            if (z2) {
                num2 = Integer.valueOf(b);
            }
        }
        lx4.m21046c(window, !z);
        int d = m39032d(window.getContext(), z);
        int c = m39031c(window.getContext(), z);
        window.setStatusBarColor(d);
        window.setNavigationBarColor(c);
        m39035g(window, m39033e(d, oe2.m23726l(num.intValue())));
        m39034f(window, m39033e(c, oe2.m23726l(num2.intValue())));
    }

    @TargetApi(21)
    /* renamed from: c */
    public static int m39031c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return p10.m24299B(oe2.m23716b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return oe2.m23716b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    /* renamed from: d */
    public static int m39032d(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return p10.m24299B(oe2.m23716b(context, 16843857, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return oe2.m23716b(context, 16843857, -16777216);
    }

    /* renamed from: e */
    public static boolean m39033e(int i, boolean z) {
        return oe2.m23726l(i) || (i == 0 && z);
    }

    /* renamed from: f */
    public static void m39034f(@mr2 Window window, boolean z) {
        lx4.m21044a(window, window.getDecorView()).mo25786h(z);
    }

    /* renamed from: g */
    public static void m39035g(@mr2 Window window, boolean z) {
        lx4.m21044a(window, window.getDecorView()).mo25787i(z);
    }
}
