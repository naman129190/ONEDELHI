package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

public class ji2 {

    /* renamed from: c */
    public static final int f30825c = 0;

    /* renamed from: c */
    public static final String f30826c = "com.google.android.c2dm.permission.SEND";

    /* renamed from: d */
    public static final int f30827d = 1;

    /* renamed from: d */
    public static final String f30828d = "com.google.android.gms";

    /* renamed from: e */
    public static final int f30829e = 2;

    /* renamed from: e */
    public static final String f30830e = "com.google.iid.TOKEN_REQUEST";

    /* renamed from: f */
    public static final String f30831f = "com.google.android.c2dm.intent.REGISTER";
    @mj1("this")

    /* renamed from: a */
    public int f30832a;

    /* renamed from: a */
    public final Context f30833a;
    @mj1("this")

    /* renamed from: a */
    public String f30834a;
    @mj1("this")

    /* renamed from: b */
    public int f30835b = 0;
    @mj1("this")

    /* renamed from: b */
    public String f30836b;

    public ji2(Context context) {
        this.f30833a = context;
    }

    /* renamed from: c */
    public static String m53387c(w31 w31) {
        String m = w31.mo46529s().mo37195m();
        if (m != null) {
            return m;
        }
        String j = w31.mo46529s().mo37192j();
        if (!j.startsWith("1:")) {
            return j;
        }
        String[] split = j.split(ar4.f25981a);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String mo38672a() {
        if (this.f30834a == null) {
            mo38678h();
        }
        return this.f30834a;
    }

    /* renamed from: b */
    public synchronized String mo38673b() {
        if (this.f30836b == null) {
            mo38678h();
        }
        return this.f30836b;
    }

    /* renamed from: d */
    public synchronized int mo38674d() {
        PackageInfo f;
        if (this.f30832a == 0 && (f = mo38676f("com.google.android.gms")) != null) {
            this.f30832a = f.versionCode;
        }
        return this.f30832a;
    }

    /* renamed from: e */
    public synchronized int mo38675e() {
        int i = this.f30835b;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f30833a.getPackageManager();
        if (packageManager.checkPermission(f30826c, "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent(f30831f);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f30835b = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(f30830e);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.f30835b = 2;
            } else {
                this.f30835b = 1;
            }
            return this.f30835b;
        }
        this.f30835b = 2;
        return 2;
    }

    /* renamed from: f */
    public final PackageInfo mo38676f(String str) {
        try {
            return this.f30833a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo38677g() {
        return mo38675e() != 0;
    }

    /* renamed from: h */
    public final synchronized void mo38678h() {
        PackageInfo f = mo38676f(this.f30833a.getPackageName());
        if (f != null) {
            this.f30834a = Integer.toString(f.versionCode);
            this.f30836b = f.versionName;
        }
    }
}
