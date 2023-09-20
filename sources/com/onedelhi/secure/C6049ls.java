package com.onedelhi.secure;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.onedelhi.secure.ls */
public final class C6049ls extends az2 {

    /* renamed from: a */
    public static final Pattern f31813a = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: a */
    public static final long[] f31814a = {bw0.f9994b, pr3.f18684a, 3600000, jg3.f30769e, 1000};

    /* renamed from: b */
    public static final Pattern f31815b = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: a */
    public final double f31816a;

    /* renamed from: a */
    public final long f31817a;

    /* renamed from: a */
    public final String f31818a;

    /* renamed from: a */
    public final boolean f31819a;

    /* renamed from: a */
    public final String[] f31820a;

    /* renamed from: b */
    public final double f31821b;

    /* renamed from: b */
    public final long f31822b;

    /* renamed from: b */
    public final String f31823b;

    /* renamed from: b */
    public final boolean f31824b;

    /* renamed from: c */
    public final String f31825c;

    /* renamed from: d */
    public final String f31826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6049ls(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(bz2.CALENDAR);
        this.f31818a = str;
        try {
            long s = m56453s(str2);
            this.f31817a = s;
            if (str3 == null) {
                long u = m56455u(str4);
                this.f31822b = u < 0 ? -1 : s + u;
            } else {
                try {
                    this.f31822b = m56453s(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z = true;
            this.f31819a = str2.length() == 8;
            this.f31824b = (str3 == null || str3.length() != 8) ? false : z;
            this.f31823b = str5;
            this.f31825c = str6;
            this.f31820a = strArr;
            this.f31826d = str7;
            this.f31816a = d;
            this.f31821b = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: e */
    public static String m56452e(boolean z, long j) {
        if (j < 0) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j));
    }

    /* renamed from: s */
    public static long m56453s(String str) throws ParseException {
        if (!f31815b.matcher(str).matches()) {
            throw new ParseException(str, 0);
        } else if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } else if (str.length() != 16 || str.charAt(15) != 'Z') {
            return m56454t(str);
        } else {
            long t = m56454t(str.substring(0, 15));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long j = t + ((long) gregorianCalendar.get(15));
            gregorianCalendar.setTime(new Date(j));
            return j + ((long) gregorianCalendar.get(16));
        }
    }

    /* renamed from: t */
    public static long m56454t(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    /* renamed from: u */
    public static long m56455u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1;
        }
        Matcher matcher = f31813a.matcher(charSequence);
        if (!matcher.matches()) {
            return -1;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f31814a;
            if (i >= jArr.length) {
                return j;
            }
            int i2 = i + 1;
            String group = matcher.group(i2);
            if (group != null) {
                j += jArr[i] * ((long) Integer.parseInt(group));
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(100);
        az2.m39207c(this.f31818a, sb);
        az2.m39207c(m56452e(this.f31819a, this.f31817a), sb);
        az2.m39207c(m56452e(this.f31824b, this.f31822b), sb);
        az2.m39207c(this.f31823b, sb);
        az2.m39207c(this.f31825c, sb);
        az2.m39208d(this.f31820a, sb);
        az2.m39207c(this.f31826d, sb);
        return sb.toString();
    }

    /* renamed from: f */
    public String[] mo40256f() {
        return this.f31820a;
    }

    /* renamed from: g */
    public String mo40257g() {
        return this.f31826d;
    }

    @Deprecated
    /* renamed from: h */
    public Date mo40258h() {
        if (this.f31822b < 0) {
            return null;
        }
        return new Date(this.f31822b);
    }

    /* renamed from: i */
    public long mo40259i() {
        return this.f31822b;
    }

    /* renamed from: j */
    public double mo40260j() {
        return this.f31816a;
    }

    /* renamed from: k */
    public String mo40261k() {
        return this.f31823b;
    }

    /* renamed from: l */
    public double mo40262l() {
        return this.f31821b;
    }

    /* renamed from: m */
    public String mo40263m() {
        return this.f31825c;
    }

    @Deprecated
    /* renamed from: n */
    public Date mo40264n() {
        return new Date(this.f31817a);
    }

    /* renamed from: o */
    public long mo40265o() {
        return this.f31817a;
    }

    /* renamed from: p */
    public String mo40266p() {
        return this.f31818a;
    }

    /* renamed from: q */
    public boolean mo40267q() {
        return this.f31824b;
    }

    /* renamed from: r */
    public boolean mo40268r() {
        return this.f31819a;
    }
}
