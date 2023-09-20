package com.onedelhi.secure;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.appcompat.widget.C0358b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.messaging.C4321e;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class r70 {

    /* renamed from: a */
    public static TypedValue f19620a = null;

    /* renamed from: a */
    public static final Object f19621a = new Object();

    /* renamed from: a */
    public static final String f19622a = "ContextCompat";

    /* renamed from: b */
    public static final Object f19623b = new Object();

    @sj3(16)
    /* renamed from: com.onedelhi.secure.r70$a */
    public static class C3368a {
        @pn0
        /* renamed from: a */
        public static void m26369a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @pn0
        /* renamed from: b */
        public static void m26370b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.r70$b */
    public static class C3369b {
        @pn0
        /* renamed from: a */
        public static File[] m26371a(Context context) {
            return context.getExternalCacheDirs();
        }

        @pn0
        /* renamed from: b */
        public static File[] m26372b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @pn0
        /* renamed from: c */
        public static File[] m26373c(Context context) {
            return context.getObbDirs();
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.r70$c */
    public static class C3370c {
        @pn0
        /* renamed from: a */
        public static File m26374a(Context context) {
            return context.getCodeCacheDir();
        }

        @pn0
        /* renamed from: b */
        public static Drawable m26375b(Context context, int i) {
            return context.getDrawable(i);
        }

        @pn0
        /* renamed from: c */
        public static File m26376c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.r70$d */
    public static class C3371d {
        @pn0
        /* renamed from: a */
        public static int m26377a(Context context, int i) {
            return context.getColor(i);
        }

        @pn0
        /* renamed from: b */
        public static <T> T m26378b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @pn0
        /* renamed from: c */
        public static String m26379c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.r70$e */
    public static class C3372e {
        @pn0
        /* renamed from: a */
        public static Context m26380a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @pn0
        /* renamed from: b */
        public static File m26381b(Context context) {
            return context.getDataDir();
        }

        @pn0
        /* renamed from: c */
        public static boolean m26382c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.r70$f */
    public static class C3373f {
        @pn0
        /* renamed from: a */
        public static ComponentName m26383a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.r70$g */
    public static class C3374g {
        @pn0
        /* renamed from: a */
        public static Executor m26384a(Context context) {
            return context.getMainExecutor();
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.r70$h */
    public static class C3375h {
        @pn0
        /* renamed from: a */
        public static String m26385a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: com.onedelhi.secure.r70$i */
    public static final class C3376i {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f19624a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f19624a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, C4311b.C4317f.C4318a.f25150b);
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, C0358b.f1779e);
            hashMap.put(AlarmManager.class, es2.f11372W);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, C4321e.f25157b);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, FirebaseAnalytics.C4304c.f24920o);
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static int m26348a(@mr2 Context context, @mr2 String str) {
        ot2.m24060e(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @ts2
    /* renamed from: b */
    public static Context m26349b(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3372e.m26380a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m26350c(java.io.File r4) {
        /*
            java.lang.Object r0 = f19623b
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r70.m26350c(java.io.File):java.io.File");
    }

    @ts2
    /* renamed from: d */
    public static String m26351d(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3375h.m26385a(context);
        }
        return null;
    }

    @mr2
    /* renamed from: e */
    public static File m26352e(@mr2 Context context) {
        return C3370c.m26374a(context);
    }

    @d10
    /* renamed from: f */
    public static int m26353f(@mr2 Context context, @k10 int i) {
        return Build.VERSION.SDK_INT >= 23 ? C3371d.m26377a(context, i) : context.getResources().getColor(i);
    }

    @ts2
    /* renamed from: g */
    public static ColorStateList m26354g(@mr2 Context context, @k10 int i) {
        return zk3.m33203f(context.getResources(), i, context.getTheme());
    }

    @ts2
    /* renamed from: h */
    public static File m26355h(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3372e.m26381b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @ts2
    /* renamed from: i */
    public static Drawable m26356i(@mr2 Context context, @dp0 int i) {
        return C3370c.m26375b(context, i);
    }

    @mr2
    /* renamed from: j */
    public static File[] m26357j(@mr2 Context context) {
        return C3369b.m26371a(context);
    }

    @mr2
    /* renamed from: k */
    public static File[] m26358k(@mr2 Context context, @ts2 String str) {
        return C3369b.m26372b(context, str);
    }

    @mr2
    /* renamed from: l */
    public static Executor m26359l(@mr2 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C3374g.m26384a(context) : xw0.m31746a(new Handler(context.getMainLooper()));
    }

    @ts2
    /* renamed from: m */
    public static File m26360m(@mr2 Context context) {
        return C3370c.m26376c(context);
    }

    @mr2
    /* renamed from: n */
    public static File[] m26361n(@mr2 Context context) {
        return C3369b.m26373c(context);
    }

    @ts2
    /* renamed from: o */
    public static <T> T m26362o(@mr2 Context context, @mr2 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3371d.m26378b(context, cls);
        }
        String p = m26363p(context, cls);
        if (p != null) {
            return context.getSystemService(p);
        }
        return null;
    }

    @ts2
    /* renamed from: p */
    public static String m26363p(@mr2 Context context, @mr2 Class<?> cls) {
        return Build.VERSION.SDK_INT >= 23 ? C3371d.m26379c(context, cls) : C3376i.f19624a.get(cls);
    }

    /* renamed from: q */
    public static boolean m26364q(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3372e.m26382c(context);
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m26365r(@mr2 Context context, @mr2 Intent[] intentArr) {
        return m26366s(context, intentArr, (Bundle) null);
    }

    /* renamed from: s */
    public static boolean m26366s(@mr2 Context context, @mr2 Intent[] intentArr, @ts2 Bundle bundle) {
        C3368a.m26369a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: t */
    public static void m26367t(@mr2 Context context, @mr2 Intent intent, @ts2 Bundle bundle) {
        C3368a.m26370b(context, intent, bundle);
    }

    /* renamed from: u */
    public static void m26368u(@mr2 Context context, @mr2 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3373f.m26383a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
