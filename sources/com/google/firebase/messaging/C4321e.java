package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.ei2;
import com.onedelhi.secure.fi2;
import com.onedelhi.secure.gi2;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hu0;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n41;
import com.onedelhi.secure.qv0;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.yh4;
import com.onedelhi.secure.yz1;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.messaging.e */
public class C4321e {

    /* renamed from: a */
    public static final String f25156a = "Firebase";

    /* renamed from: b */
    public static final String f25157b = "notification";

    /* renamed from: c */
    public static final String f25158c = "com.google.firebase.messaging";

    /* renamed from: d */
    public static final String f25159d = "export_to_big_query";

    /* renamed from: e */
    public static final String f25160e = "delivery_metrics_exported_to_big_query_enabled";

    @hw4
    /* renamed from: A */
    public static void m34755A(String str, Bundle bundle) {
        try {
            w31.m68755p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m34764d(bundle);
            if (d != null) {
                bundle2.putString(C4311b.C4317f.f25148r, d);
            }
            String e = m34765e(bundle);
            if (e != null) {
                bundle2.putString(C4311b.C4317f.f25137g, e);
            }
            String i = m34769i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m34767g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString(C4311b.C4317f.f25140j, g);
            }
            String r = m34778r(bundle);
            if (r != null) {
                bundle2.putString(C4311b.C4317f.f25135e, r);
            }
            String l = m34772l(bundle);
            if (l != null) {
                try {
                    bundle2.putInt(C4311b.C4317f.f25138h, Integer.parseInt(l));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String t = m34780t(bundle);
            if (t != null) {
                try {
                    bundle2.putInt(C4311b.C4317f.f25139i, Integer.parseInt(t));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String n = m34774n(bundle);
            if (C4311b.C4317f.f25143m.equals(str) || C4311b.C4317f.f25146p.equals(str)) {
                bundle2.putString(C4311b.C4317f.f25141k, n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            C4623b5 b5Var = (C4623b5) w31.m68755p().mo46526l(C4623b5.class);
            if (b5Var != null) {
                b5Var.mo31397a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: B */
    public static void m34756B(boolean z) {
        w31.m68755p().mo46527n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(f25159d, z).apply();
    }

    /* renamed from: C */
    public static void m34757C(Bundle bundle) {
        if (bundle != null) {
            if (mm0.f16219f.equals(bundle.getString(C4311b.C4312a.f25073g))) {
                C4623b5 b5Var = (C4623b5) w31.m68755p().mo46526l(C4623b5.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (b5Var != null) {
                    String string = bundle.getString(C4311b.C4312a.f25069c);
                    b5Var.mo31401d("fcm", C4311b.C4317f.f25147q, string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", f25156a);
                    bundle2.putString("medium", f25157b);
                    bundle2.putString("campaign", string);
                    b5Var.mo31397a("fcm", C4311b.C4317f.f25142l, bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    /* renamed from: D */
    public static boolean m34758D(Intent intent) {
        if (intent == null || m34781u(intent)) {
            return false;
        }
        return m34761a();
    }

    /* renamed from: E */
    public static boolean m34759E(Intent intent) {
        if (intent == null || m34781u(intent)) {
            return false;
        }
        return m34760F(intent.getExtras());
    }

    /* renamed from: F */
    public static boolean m34760F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return mm0.f16219f.equals(bundle.getString(C4311b.C4312a.f25068b));
    }

    /* renamed from: a */
    public static boolean m34761a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            w31.m68755p();
            Context n = w31.m68755p().mo46527n();
            SharedPreferences sharedPreferences = n.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f25159d)) {
                return sharedPreferences.getBoolean(f25159d, false);
            }
            try {
                PackageManager packageManager = n.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(n.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f25160e))) {
                    return applicationInfo.metaData.getBoolean(f25160e, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static fi2 m34762b(fi2.C5272b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        fi2.C5271a j = fi2.m47890q().mo35991p(m34779s(extras)).mo35982g(bVar).mo35983h(m34766f(extras)).mo35986k(m34775o()).mo35989n(fi2.C5274d.ANDROID).mo35985j(m34773m(extras));
        String h = m34768h(extras);
        if (h != null) {
            j.mo35984i(h);
        }
        String r = m34778r(extras);
        if (r != null) {
            j.mo35990o(r);
        }
        String c = m34763c(extras);
        if (c != null) {
            j.mo35980e(c);
        }
        String i = m34769i(extras);
        if (i != null) {
            j.mo35977b(i);
        }
        String e = m34765e(extras);
        if (e != null) {
            j.mo35981f(e);
        }
        long q = m34777q(extras);
        if (q > 0) {
            j.mo35988m(q);
        }
        return j.mo35976a();
    }

    @ts2
    /* renamed from: c */
    public static String m34763c(Bundle bundle) {
        return bundle.getString(C4311b.C4315d.f25115e);
    }

    @ts2
    /* renamed from: d */
    public static String m34764d(Bundle bundle) {
        return bundle.getString(C4311b.C4312a.f25069c);
    }

    @ts2
    /* renamed from: e */
    public static String m34765e(Bundle bundle) {
        return bundle.getString(C4311b.C4312a.f25070d);
    }

    @mr2
    /* renamed from: f */
    public static String m34766f(Bundle bundle) {
        String string = bundle.getString(C4311b.C4315d.f25117g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) ha4.m16566a(n41.m57861w(w31.m68755p()).mo40943d());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @ts2
    /* renamed from: g */
    public static String m34767g(Bundle bundle) {
        return bundle.getString(C4311b.C4312a.f25076j);
    }

    @ts2
    /* renamed from: h */
    public static String m34768h(Bundle bundle) {
        String string = bundle.getString(C4311b.C4315d.f25118h);
        return string == null ? bundle.getString(C4311b.C4315d.f25116f) : string;
    }

    @ts2
    /* renamed from: i */
    public static String m34769i(Bundle bundle) {
        return bundle.getString(C4311b.C4312a.f25075i);
    }

    @mr2
    /* renamed from: j */
    public static int m34770j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return yz1.f38147i.equals(str) ? 2 : 0;
    }

    /* renamed from: k */
    public static int m34771k(Bundle bundle) {
        int p = m34776p(bundle);
        if (p == 2) {
            return 5;
        }
        return p == 1 ? 10 : 0;
    }

    @ts2
    /* renamed from: l */
    public static String m34772l(Bundle bundle) {
        return bundle.getString(C4311b.C4312a.f25071e);
    }

    @mr2
    /* renamed from: m */
    public static fi2.C5273c m34773m(Bundle bundle) {
        return (bundle == null || !C4322f.m34790v(bundle)) ? fi2.C5273c.DATA_MESSAGE : fi2.C5273c.DISPLAY_NOTIFICATION;
    }

    @mr2
    /* renamed from: n */
    public static String m34774n(Bundle bundle) {
        return (bundle == null || !C4322f.m34790v(bundle)) ? C4311b.C4317f.C4318a.f25149a : C4311b.C4317f.C4318a.f25150b;
    }

    @mr2
    /* renamed from: o */
    public static String m34775o() {
        return w31.m68755p().mo46527n().getPackageName();
    }

    @mr2
    /* renamed from: p */
    public static int m34776p(Bundle bundle) {
        String string = bundle.getString(C4311b.C4315d.f25122l);
        if (string == null) {
            if (mm0.f16219f.equals(bundle.getString(C4311b.C4315d.f25124n))) {
                return 2;
            }
            string = bundle.getString(C4311b.C4315d.f25123m);
        }
        return m34770j(string);
    }

    @ts2
    /* renamed from: q */
    public static long m34777q(Bundle bundle) {
        if (bundle.containsKey(C4311b.C4315d.f25126p)) {
            try {
                return Long.parseLong(bundle.getString(C4311b.C4315d.f25126p));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        w31 p = w31.m68755p();
        String m = p.mo46529s().mo37195m();
        if (m != null) {
            try {
                return Long.parseLong(m);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String j = p.mo46529s().mo37192j();
        if (!j.startsWith("1:")) {
            try {
                return Long.parseLong(j);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = j.split(ar4.f25981a);
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    @ts2
    /* renamed from: r */
    public static String m34778r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @mr2
    /* renamed from: s */
    public static int m34779s(Bundle bundle) {
        Object obj = bundle.get(C4311b.C4315d.f25119i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @ts2
    /* renamed from: t */
    public static String m34780t(Bundle bundle) {
        if (bundle.containsKey(C4311b.C4312a.f25072f)) {
            return bundle.getString(C4311b.C4312a.f25072f);
        }
        return null;
    }

    /* renamed from: u */
    public static boolean m34781u(Intent intent) {
        return FirebaseMessagingService.f25047d.equals(intent.getAction());
    }

    /* renamed from: v */
    public static void m34782v(Intent intent) {
        m34755A(C4311b.C4317f.f25145o, intent.getExtras());
    }

    /* renamed from: w */
    public static void m34783w(Intent intent) {
        m34755A(C4311b.C4317f.f25146p, intent.getExtras());
    }

    /* renamed from: x */
    public static void m34784x(Bundle bundle) {
        m34757C(bundle);
        m34755A(C4311b.C4317f.f25144n, bundle);
    }

    /* renamed from: y */
    public static void m34785y(Intent intent) {
        if (m34759E(intent)) {
            m34755A(C4311b.C4317f.f25143m, intent.getExtras());
        }
        if (m34758D(intent)) {
            m34786z(fi2.C5272b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m34656A());
        }
    }

    /* renamed from: z */
    public static void m34786z(fi2.C5272b bVar, Intent intent, @ts2 yh4 yh4) {
        if (yh4 == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        fi2 b = m34762b(bVar, intent);
        if (b != null) {
            try {
                yh4.mo27493a(C4311b.C4313b.f25077a, gi2.class, hu0.m16939b("proto"), ei2.f27949a).mo13726a(qv0.m26188e(gi2.m49506d().mo36750b(b).mo36749a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }
}
