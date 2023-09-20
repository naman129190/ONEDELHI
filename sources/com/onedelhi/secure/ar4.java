package com.onedelhi.secure;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class ar4 {

    /* renamed from: a */
    public static final long f25979a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: a */
    public static ar4 f25980a = null;

    /* renamed from: a */
    public static final String f25981a = ":";

    /* renamed from: a */
    public static final Pattern f25982a = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: a */
    public final C4939cz f25983a;

    public ar4(C4939cz czVar) {
        this.f25983a = czVar;
    }

    /* renamed from: c */
    public static ar4 m39019c() {
        return m39020d(w84.m69228a());
    }

    /* renamed from: d */
    public static ar4 m39020d(C4939cz czVar) {
        if (f25980a == null) {
            f25980a = new ar4(czVar);
        }
        return f25980a;
    }

    /* renamed from: g */
    public static boolean m39021g(@ts2 String str) {
        return f25982a.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m39022h(@ts2 String str) {
        return str.contains(f25981a);
    }

    /* renamed from: a */
    public long mo31118a() {
        return this.f25983a.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo31119b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo31118a());
    }

    /* renamed from: e */
    public long mo31120e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo31121f(@mr2 r13 r13) {
        return TextUtils.isEmpty(r13.mo35941b()) || r13.mo35948h() + r13.mo35942c() < mo31119b() + f25979a;
    }
}
