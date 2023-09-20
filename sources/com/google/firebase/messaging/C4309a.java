package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.bi2;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.a */
public final class C4309a {

    /* renamed from: a */
    public static final int f25051a = 0;

    /* renamed from: a */
    public static final String f25052a = "com.google.firebase.messaging.default_notification_color";

    /* renamed from: a */
    public static final AtomicInteger f25053a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: b */
    public static final String f25054b = "com.google.firebase.messaging.default_notification_icon";

    /* renamed from: c */
    public static final String f25055c = "com.google.firebase.messaging.default_notification_channel_id";

    /* renamed from: d */
    public static final String f25056d = "fcm_fallback_notification_channel";

    /* renamed from: e */
    public static final String f25057e = "fcm_fallback_notification_channel_label";

    /* renamed from: f */
    public static final String f25058f = "Misc";

    /* renamed from: g */
    public static final String f25059g = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C4310a {

        /* renamed from: a */
        public final int f25060a;

        /* renamed from: a */
        public final es2.C2087g f25061a;

        /* renamed from: a */
        public final String f25062a;

        public C4310a(es2.C2087g gVar, String str, int i) {
            this.f25061a = gVar;
            this.f25062a = str;
            this.f25060a = i;
        }
    }

    @ts2
    /* renamed from: a */
    public static PendingIntent m34729a(Context context, C4322f fVar, String str, PackageManager packageManager) {
        Intent f = m34734f(str, fVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(fVar.mo29740A());
        if (m34745q(fVar)) {
            f.putExtra(C4311b.C4314c.f25082E, fVar.mo29761z());
        }
        return PendingIntent.getActivity(context, m34735g(), f, m34740l(1073741824));
    }

    @ts2
    /* renamed from: b */
    public static PendingIntent m34730b(Context context, Context context2, C4322f fVar) {
        if (!m34745q(fVar)) {
            return null;
        }
        return m34731c(context, context2, new Intent(CloudMessagingReceiver.C1408a.f7344b).putExtras(fVar.mo29761z()));
    }

    /* renamed from: c */
    public static PendingIntent m34731c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m34735g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m34740l(1073741824));
    }

    /* renamed from: d */
    public static C4310a m34732d(Context context, Context context2, C4322f fVar, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        es2.C2087g gVar = new es2.C2087g(context2, str);
        String n = fVar.mo29753n(resources, packageName, C4311b.C4314c.f25091g);
        if (!TextUtils.isEmpty(n)) {
            gVar.mo15381P(n);
        }
        String n2 = fVar.mo29753n(resources, packageName, C4311b.C4314c.f25092h);
        if (!TextUtils.isEmpty(n2)) {
            gVar.mo15380O(n2);
            gVar.mo15442z0(new es2.C2082e().mo15336A(n2));
        }
        gVar.mo15431t0(m34741m(packageManager, resources, packageName, fVar.mo29755p(C4311b.C4314c.f25093i), bundle));
        Uri n3 = m34742n(packageName, fVar, resources);
        if (n3 != null) {
            gVar.mo15438x0(n3);
        }
        gVar.mo15379N(m34729a(context, fVar, packageName, packageManager));
        PendingIntent b = m34730b(context, context2, fVar);
        if (b != null) {
            gVar.mo15386U(b);
        }
        Integer h = m34736h(context2, fVar.mo29755p(C4311b.C4314c.f25096l), bundle);
        if (h != null) {
            gVar.mo15375J(h.intValue());
        }
        gVar.mo15363D(!fVar.mo29741a(C4311b.C4314c.f25099o));
        gVar.mo15401e0(fVar.mo29741a(C4311b.C4314c.f25098n));
        String p = fVar.mo29755p(C4311b.C4314c.f25097m);
        if (p != null) {
            gVar.mo15360B0(p);
        }
        Integer m = fVar.mo29752m();
        if (m != null) {
            gVar.mo15413k0(m.intValue());
        }
        Integer r = fVar.mo29757r();
        if (r != null) {
            gVar.mo15370G0(r.intValue());
        }
        Integer l = fVar.mo29751l();
        if (l != null) {
            gVar.mo15407h0(l.intValue());
        }
        Long j = fVar.mo29749j(C4311b.C4314c.f25108x);
        if (j != null) {
            gVar.mo15427r0(true);
            gVar.mo15372H0(j.longValue());
        }
        long[] q = fVar.mo29756q();
        if (q != null) {
            gVar.mo15368F0(q);
        }
        int[] e = fVar.mo29744e();
        if (e != null) {
            gVar.mo15399d0(e[0], e[1], e[2]);
        }
        gVar.mo15385T(m34737i(fVar));
        return new C4310a(gVar, m34743o(fVar), 0);
    }

    /* renamed from: e */
    public static C4310a m34733e(Context context, C4322f fVar) {
        Bundle j = m34738j(context.getPackageManager(), context.getPackageName());
        return m34732d(context, context, fVar, m34739k(context, fVar.mo29750k(), j), j);
    }

    /* renamed from: f */
    public static Intent m34734f(String str, C4322f fVar, PackageManager packageManager) {
        String p = fVar.mo29755p(C4311b.C4314c.f25078A);
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(bi2.f26358i);
            return intent;
        }
        Uri f = fVar.mo29745f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    public static int m34735g() {
        return f25053a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m34736h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt(f25052a, 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(r70.m26353f(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    public static int m34737i(C4322f fVar) {
        boolean a = fVar.mo29741a(C4311b.C4314c.f25101q);
        if (fVar.mo29741a(C4311b.C4314c.f25102r)) {
            a |= true;
        }
        return fVar.mo29741a(C4311b.C4314c.f25103s) ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    public static Bundle m34738j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @hw4
    @TargetApi(26)
    /* renamed from: k */
    public static String m34739k(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString(f25055c);
            if (TextUtils.isEmpty(string)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel(f25056d) == null) {
                int identifier = context.getResources().getIdentifier(f25057e, ak4.C1709b.f9167e, context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str3 = f25058f;
                } else {
                    str3 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel(f25056d, str3, 3));
            }
            return f25056d;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m34740l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }

    /* renamed from: m */
    public static int m34741m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m34744p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m34744p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt(f25054b, 0);
        if (i == 0 || !m34744p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m34744p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    public static Uri m34742n(String str, C4322f fVar, Resources resources) {
        String o = fVar.mo29754o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    public static String m34743o(C4322f fVar) {
        String p = fVar.mo29755p(C4311b.C4314c.f25095k);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m34744p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m34745q(@mr2 C4322f fVar) {
        return fVar.mo29741a(C4311b.C4312a.f25068b);
    }
}
