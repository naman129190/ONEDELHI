package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.fd3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class fq4 {

    /* renamed from: a */
    public static final String f12268a = "UTC";

    /* renamed from: a */
    public static AtomicReference<ee4> f12269a = new AtomicReference<>();

    /* renamed from: A */
    public static void m15191A(@ts2 ee4 ee4) {
        f12269a.set(ee4);
    }

    /* renamed from: a */
    public static long m15192a(long j) {
        Calendar v = m15213v();
        v.setTimeInMillis(j);
        return m15197f(v).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m15193b(@mr2 String str, @mr2 String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m15194c(Locale locale) {
        return m15196e("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    public static DateFormat m15195d(Locale locale) {
        return m15196e("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: e */
    public static DateFormat m15196e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m15212u());
        return instanceForSkeleton;
    }

    /* renamed from: f */
    public static Calendar m15197f(Calendar calendar) {
        Calendar w = m15214w(calendar);
        Calendar v = m15213v();
        v.set(w.get(1), w.get(2), w.get(5));
        return v;
    }

    /* renamed from: g */
    public static java.text.DateFormat m15198g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m15210s());
        return dateInstance;
    }

    /* renamed from: h */
    public static java.text.DateFormat m15199h() {
        return m15200i(Locale.getDefault());
    }

    /* renamed from: i */
    public static java.text.DateFormat m15200i(Locale locale) {
        return m15198g(0, locale);
    }

    /* renamed from: j */
    public static java.text.DateFormat m15201j() {
        return m15202k(Locale.getDefault());
    }

    /* renamed from: k */
    public static java.text.DateFormat m15202k(Locale locale) {
        return m15198g(2, locale);
    }

    /* renamed from: l */
    public static java.text.DateFormat m15203l() {
        return m15204m(Locale.getDefault());
    }

    /* renamed from: m */
    public static java.text.DateFormat m15204m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m15202k(locale);
        simpleDateFormat.applyPattern(m15217z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: n */
    public static SimpleDateFormat m15205n(String str) {
        return m15206o(str, Locale.getDefault());
    }

    /* renamed from: o */
    public static SimpleDateFormat m15206o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m15210s());
        return simpleDateFormat;
    }

    /* renamed from: p */
    public static SimpleDateFormat m15207p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m15210s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: q */
    public static String m15208q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(fd3.C2163m.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(fd3.C2163m.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(fd3.C2163m.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: r */
    public static ee4 m15209r() {
        ee4 ee4 = f12269a.get();
        return ee4 == null ? ee4.m13714e() : ee4;
    }

    /* renamed from: s */
    public static TimeZone m15210s() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: t */
    public static Calendar m15211t() {
        Calendar c = m15209r().mo15142c();
        c.set(11, 0);
        c.set(12, 0);
        c.set(13, 0);
        c.set(14, 0);
        c.setTimeZone(m15210s());
        return c;
    }

    @TargetApi(24)
    /* renamed from: u */
    public static android.icu.util.TimeZone m15212u() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: v */
    public static Calendar m15213v() {
        return m15214w((Calendar) null);
    }

    /* renamed from: w */
    public static Calendar m15214w(@ts2 Calendar calendar) {
        Calendar instance = Calendar.getInstance(m15210s());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: x */
    public static DateFormat m15215x(Locale locale) {
        return m15196e("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: y */
    public static DateFormat m15216y(Locale locale) {
        return m15196e("yMMMEd", locale);
    }

    @mr2
    /* renamed from: z */
    public static String m15217z(@mr2 String str) {
        int b = m15193b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m15193b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + vf4.f36537c;
        }
        return str.replace(str.substring(m15193b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
