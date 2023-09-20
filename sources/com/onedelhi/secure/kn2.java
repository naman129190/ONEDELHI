package com.onedelhi.secure;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public final class kn2 {

    /* renamed from: a */
    public static final String f15036a = "NavUtils";

    /* renamed from: b */
    public static final String f15037b = "android.support.PARENT_ACTIVITY";

    @sj3(16)
    /* renamed from: com.onedelhi.secure.kn2$a */
    public static class C2654a {
        @pn0
        /* renamed from: a */
        public static Intent m19952a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @pn0
        /* renamed from: b */
        public static boolean m19953b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @pn0
        /* renamed from: c */
        public static boolean m19954c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @ts2
    /* renamed from: a */
    public static Intent m19944a(@mr2 Activity activity) {
        Intent a = C2654a.m19952a(activity);
        if (a != null) {
            return a;
        }
        String d = m19947d(activity);
        if (d == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d);
        try {
            return m19948e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f15036a, "getParentActivityIntent: bad parentActivityName '" + d + "' in manifest");
            return null;
        }
    }

    @ts2
    /* renamed from: b */
    public static Intent m19945b(@mr2 Context context, @mr2 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e = m19948e(context, componentName);
        if (e == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e);
        return m19948e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @ts2
    /* renamed from: c */
    public static Intent m19946c(@mr2 Context context, @mr2 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e = m19948e(context, new ComponentName(context, cls));
        if (e == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e);
        return m19948e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @ts2
    /* renamed from: d */
    public static String m19947d(@mr2 Activity activity) {
        try {
            return m19948e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @ts2
    /* renamed from: e */
    public static String m19948e(@mr2 Context context, @mr2 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f15037b)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: f */
    public static void m19949f(@mr2 Activity activity) {
        Intent a = m19944a(activity);
        if (a != null) {
            m19950g(activity, a);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    /* renamed from: g */
    public static void m19950g(@mr2 Activity activity, @mr2 Intent intent) {
        C2654a.m19953b(activity, intent);
    }

    /* renamed from: h */
    public static boolean m19951h(@mr2 Activity activity, @mr2 Intent intent) {
        return C2654a.m19954c(activity, intent);
    }
}
