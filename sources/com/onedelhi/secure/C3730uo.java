package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.uo */
public class C3730uo {

    @uj3
    /* renamed from: com.onedelhi.secure.uo$a */
    public @interface C3731a {
    }

    @Deprecated
    @C3196px(api = 24)
    /* renamed from: a */
    public static boolean m29472a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    @C3196px(api = 25)
    /* renamed from: b */
    public static boolean m29473b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @Deprecated
    @C3196px(api = 26)
    /* renamed from: c */
    public static boolean m29474c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    @C3196px(api = 27)
    /* renamed from: d */
    public static boolean m29475d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @Deprecated
    @C3196px(api = 28)
    /* renamed from: e */
    public static boolean m29476e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @hl3({hl3.C2354a.TESTS})
    /* renamed from: f */
    public static boolean m29477f(@mr2 String str, @mr2 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    @C3196px(api = 29)
    /* renamed from: g */
    public static boolean m29478g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    @C3196px(api = 30)
    /* renamed from: h */
    public static boolean m29479h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    @C3196px(api = 31, codename = "S")
    /* renamed from: i */
    public static boolean m29480i() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && m29477f(mx0.f16693i2, Build.VERSION.CODENAME));
    }

    @C3731a
    @Deprecated
    @C3196px(api = 32, codename = "Sv2")
    /* renamed from: j */
    public static boolean m29481j() {
        int i = Build.VERSION.SDK_INT;
        return i >= 32 || (i >= 31 && m29477f("Sv2", Build.VERSION.CODENAME));
    }

    @C3731a
    @C3196px(api = 33, codename = "Tiramisu")
    /* renamed from: k */
    public static boolean m29482k() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && m29477f("Tiramisu", Build.VERSION.CODENAME));
    }

    @C3731a
    @C3196px(codename = "UpsideDownCake")
    /* renamed from: l */
    public static boolean m29483l() {
        return Build.VERSION.SDK_INT >= 33 && m29477f("UpsideDownCake", Build.VERSION.CODENAME);
    }
}
