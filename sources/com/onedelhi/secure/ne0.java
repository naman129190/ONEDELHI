package com.onedelhi.secure;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ne0 {
    /* renamed from: a */
    public static fy2<String, String> m22705a(@ts2 Long l, @ts2 Long l2) {
        return m22706b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    public static fy2<String, String> m22706b(@ts2 Long l, @ts2 Long l2, @ts2 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return fy2.m15425a(null, null);
        }
        if (l == null) {
            return fy2.m15425a(null, m22708d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return fy2.m15425a(m22708d(l.longValue(), simpleDateFormat), null);
        }
        Calendar t = fq4.m15211t();
        Calendar v = fq4.m15213v();
        v.setTimeInMillis(l.longValue());
        Calendar v2 = fq4.m15213v();
        v2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat == null) {
            return v.get(1) == v2.get(1) ? v.get(1) == t.get(1) ? fy2.m15425a(m22710f(l.longValue(), Locale.getDefault()), m22710f(l2.longValue(), Locale.getDefault())) : fy2.m15425a(m22710f(l.longValue(), Locale.getDefault()), m22715k(l2.longValue(), Locale.getDefault())) : fy2.m15425a(m22715k(l.longValue(), Locale.getDefault()), m22715k(l2.longValue(), Locale.getDefault()));
        }
        return fy2.m15425a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
    }

    /* renamed from: c */
    public static String m22707c(long j) {
        return m22708d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    public static String m22708d(long j, @ts2 SimpleDateFormat simpleDateFormat) {
        Calendar t = fq4.m15211t();
        Calendar v = fq4.m15213v();
        v.setTimeInMillis(j);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : t.get(1) == v.get(1) ? m22709e(j) : m22714j(j);
    }

    /* renamed from: e */
    public static String m22709e(long j) {
        return m22710f(j, Locale.getDefault());
    }

    /* renamed from: f */
    public static String m22710f(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? fq4.m15194c(locale).format(new Date(j)) : fq4.m15204m(locale).format(new Date(j));
    }

    /* renamed from: g */
    public static String m22711g(long j) {
        return m22712h(j, Locale.getDefault());
    }

    /* renamed from: h */
    public static String m22712h(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? fq4.m15195d(locale).format(new Date(j)) : fq4.m15200i(locale).format(new Date(j));
    }

    /* renamed from: i */
    public static String m22713i(long j) {
        return DateUtils.formatDateTime((Context) null, j, 8228);
    }

    /* renamed from: j */
    public static String m22714j(long j) {
        return m22715k(j, Locale.getDefault());
    }

    /* renamed from: k */
    public static String m22715k(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? fq4.m15215x(locale).format(new Date(j)) : fq4.m15202k(locale).format(new Date(j));
    }

    /* renamed from: l */
    public static String m22716l(long j) {
        return m22717m(j, Locale.getDefault());
    }

    /* renamed from: m */
    public static String m22717m(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? fq4.m15216y(locale).format(new Date(j)) : fq4.m15200i(locale).format(new Date(j));
    }
}
