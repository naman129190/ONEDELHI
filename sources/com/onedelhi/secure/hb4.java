package com.onedelhi.secure;

import android.text.TextUtils;
import java.util.Locale;

public final class hb4 {

    /* renamed from: a */
    public static final String f13027a = "Arab";

    /* renamed from: a */
    public static final Locale f13028a = new Locale("", "");

    /* renamed from: b */
    public static final String f13029b = "Hebr";

    @sj3(17)
    /* renamed from: com.onedelhi.secure.hb4$a */
    public static class C2325a {
        @pn0
        /* renamed from: a */
        public static int m16620a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m16617a(@mr2 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m16618b(@ts2 Locale locale) {
        return C2325a.m16620a(locale);
    }

    @mr2
    /* renamed from: c */
    public static String m16619c(@mr2 String str) {
        return TextUtils.htmlEncode(str);
    }
}
