package com.onedelhi.secure;

import java.util.Calendar;
import java.util.TimeZone;

public class ee4 {

    /* renamed from: a */
    public static final ee4 f11209a = new ee4((Long) null, (TimeZone) null);
    @ts2

    /* renamed from: a */
    public final Long f11210a;
    @ts2

    /* renamed from: a */
    public final TimeZone f11211a;

    public ee4(@ts2 Long l, @ts2 TimeZone timeZone) {
        this.f11210a = l;
        this.f11211a = timeZone;
    }

    /* renamed from: a */
    public static ee4 m13712a(long j) {
        return new ee4(Long.valueOf(j), (TimeZone) null);
    }

    /* renamed from: b */
    public static ee4 m13713b(long j, @ts2 TimeZone timeZone) {
        return new ee4(Long.valueOf(j), timeZone);
    }

    /* renamed from: e */
    public static ee4 m13714e() {
        return f11209a;
    }

    /* renamed from: c */
    public Calendar mo15142c() {
        return mo15143d(this.f11211a);
    }

    /* renamed from: d */
    public Calendar mo15143d(@ts2 TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f11210a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
