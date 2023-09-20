package com.onedelhi.secure;

import android.os.Build;
import com.onedelhi.secure.hl3;
import java.util.Locale;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class fc2 {

    /* renamed from: a */
    public static final String f28255a = "lge";

    /* renamed from: b */
    public static final String f28256b = "samsung";

    /* renamed from: c */
    public static final String f28257c = "meizu";

    /* renamed from: a */
    public static boolean m47740a() {
        return m47741b() || m47743d();
    }

    /* renamed from: b */
    public static boolean m47741b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f28255a);
    }

    /* renamed from: c */
    public static boolean m47742c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f28257c);
    }

    /* renamed from: d */
    public static boolean m47743d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f28256b);
    }
}
