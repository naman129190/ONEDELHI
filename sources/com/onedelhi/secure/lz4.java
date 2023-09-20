package com.onedelhi.secure;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class lz4 {
    @vr2
    /* renamed from: a */
    public static final String m56668a(char c) {
        String valueOf = String.valueOf(c);
        jt1.m53775n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        jt1.m53776o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        jt1.m53775n(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
        jt1.m53775n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        jt1.m53776o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
