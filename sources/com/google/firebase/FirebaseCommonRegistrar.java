package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.a41;
import com.onedelhi.secure.b41;
import com.onedelhi.secure.bf0;
import com.onedelhi.secure.gh0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.vh0;
import com.onedelhi.secure.y31;
import com.onedelhi.secure.z31;
import com.onedelhi.secure.zz1;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final String f24878a = "fire-android";

    /* renamed from: b */
    public static final String f24879b = "fire-core";

    /* renamed from: c */
    public static final String f24880c = "device-name";

    /* renamed from: d */
    public static final String f24881d = "device-model";

    /* renamed from: e */
    public static final String f24882e = "device-brand";

    /* renamed from: f */
    public static final String f24883f = "android-target-sdk";

    /* renamed from: g */
    public static final String f24884g = "android-min-sdk";

    /* renamed from: h */
    public static final String f24885h = "android-platform";

    /* renamed from: i */
    public static final String f24886i = "android-installer";

    /* renamed from: j */
    public static final String f24887j = "kotlin";

    /* renamed from: e */
    public static /* synthetic */ String m34598e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m34599f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: g */
    public static /* synthetic */ String m34600g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : bf0.f26274c;
    }

    /* renamed from: h */
    public static /* synthetic */ String m34601h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m34602i(installerPackageName) : "";
    }

    /* renamed from: i */
    public static String m34602i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<a30<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vh0.m68082b());
        arrayList.add(gh0.m49478g());
        arrayList.add(u22.m66409b(f24878a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(u22.m66409b(f24879b, "20.3.1"));
        arrayList.add(u22.m66409b(f24880c, m34602i(Build.PRODUCT)));
        arrayList.add(u22.m66409b(f24881d, m34602i(Build.DEVICE)));
        arrayList.add(u22.m66409b(f24882e, m34602i(Build.BRAND)));
        arrayList.add(u22.m66410c(f24883f, z31.f38200a));
        arrayList.add(u22.m66410c(f24884g, a41.f25753a));
        arrayList.add(u22.m66410c(f24885h, b41.f26140a));
        arrayList.add(u22.m66410c(f24886i, y31.f37781a));
        String a = zz1.m74409a();
        if (a != null) {
            arrayList.add(u22.m66409b(f24887j, a));
        }
        return arrayList;
    }
}
