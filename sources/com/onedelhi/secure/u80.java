package com.onedelhi.secure;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class u80 {
    @mr2
    /* renamed from: a */
    public static String m29168a(@mr2 String str, @ts2 Boolean bool) {
        Preconditions.checkNotEmpty(str);
        String str2 = true != m29170c(bool) ? m51.f32018a : m51.f32019b;
        return str2 + "://" + str;
    }

    @mr2
    /* renamed from: b */
    public static String m29169b(@ts2 String str, @ts2 String str2, @ts2 String str3, @ts2 String str4, @ts2 Boolean bool, @ts2 Boolean bool2, @ts2 Long l) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (m29170c(bool)) {
            sb.append(";HttpOnly");
        }
        if (m29170c(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            sb.append(";Priority=null");
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            sb.append(";SameSite=null");
        }
        if (m29170c((Boolean) null)) {
            sb.append(";SameParty");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m29170c(@ts2 Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
