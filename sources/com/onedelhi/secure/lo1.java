package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class lo1 implements ir1 {

    /* renamed from: a */
    public static final Pattern f31744a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: c */
    public static final String f31745c = "0.0";

    /* renamed from: d */
    public static final String f31746d = "crashlytics.advertising.id";

    /* renamed from: e */
    public static final String f31747e = "crashlytics.installation.id";

    /* renamed from: f */
    public static final String f31748f = "firebase.installation.id";

    /* renamed from: g */
    public static final String f31749g = "crashlytics.installation.id";

    /* renamed from: h */
    public static final String f31750h = "SYN_";

    /* renamed from: i */
    public static final String f31751i = Pattern.quote("/");

    /* renamed from: a */
    public final Context f31752a;

    /* renamed from: a */
    public final ld0 f31753a;

    /* renamed from: a */
    public final lr1 f31754a;

    /* renamed from: a */
    public final o41 f31755a;

    /* renamed from: a */
    public final String f31756a;

    /* renamed from: b */
    public String f31757b;

    public lo1(Context context, String str, o41 o41, ld0 ld0) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f31752a = context;
            this.f31756a = str;
            this.f31755a = o41;
            this.f31753a = ld0;
            this.f31754a = new lr1();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: c */
    public static String m56286c() {
        return f31750h + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m56287e(String str) {
        if (str == null) {
            return null;
        }
        return f31744a.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m56288k(String str) {
        return str != null && str.startsWith(f31750h);
    }

    @mr2
    /* renamed from: a */
    public synchronized String mo38197a() {
        String l;
        String str = this.f31757b;
        if (str != null) {
            return str;
        }
        o92.m59120f().mo41621k("Determining Crashlytics installation ID...");
        SharedPreferences t = u10.m66373t(this.f31752a);
        String string = t.getString(f31748f, (String) null);
        o92 f = o92.m59120f();
        f.mo41621k("Cached Firebase Installation ID: " + string);
        if (this.f31753a.mo39785d()) {
            String d = mo40145d();
            o92 f2 = o92.m59120f();
            f2.mo41621k("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? m56286c() : string;
            }
            l = d.equals(string) ? mo40151l(t) : mo40144b(d, t);
        } else {
            l = m56288k(string) ? mo40151l(t) : mo40144b(m56286c(), t);
        }
        this.f31757b = l;
        if (this.f31757b == null) {
            o92.m59120f().mo41623m("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f31757b = mo40144b(m56286c(), t);
        }
        o92 f3 = o92.m59120f();
        f3.mo41621k("Crashlytics installation ID: " + this.f31757b);
        return this.f31757b;
    }

    @mr2
    /* renamed from: b */
    public final synchronized String mo40144b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m56287e(UUID.randomUUID().toString());
        o92 f = o92.m59120f();
        f.mo41621k("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString(f31748f, str).apply();
        return e;
    }

    @ts2
    /* renamed from: d */
    public final String mo40145d() {
        try {
            return (String) zq4.m74242f(this.f31755a.mo40943d());
        } catch (Exception e) {
            o92.m59120f().mo41624n("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo40146f() {
        return this.f31756a;
    }

    /* renamed from: g */
    public String mo40147g() {
        return this.f31754a.mo40216a(this.f31752a);
    }

    /* renamed from: h */
    public String mo40148h() {
        return String.format(Locale.US, "%s/%s", new Object[]{mo40152m(Build.MANUFACTURER), mo40152m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo40149i() {
        return mo40152m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo40150j() {
        return mo40152m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String mo40151l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    public final String mo40152m(String str) {
        return str.replaceAll(f31751i, "");
    }
}
