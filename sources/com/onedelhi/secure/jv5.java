package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

public final class jv5 {

    /* renamed from: a */
    public static volatile cz5 f14575a = cz5.m12865c();

    /* renamed from: a */
    public static final Object f14576a = new Object();

    /* renamed from: a */
    public static boolean m19216a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (!f14575a.mo14444b()) {
            synchronized (f14576a) {
                if (f14575a.mo14444b()) {
                    boolean booleanValue = ((Boolean) f14575a.mo14443a()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : bi2.f26358i);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f14575a = cz5.m12866d(Boolean.valueOf(z));
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f14575a = cz5.m12866d(Boolean.valueOf(z));
            }
        }
        return ((Boolean) f14575a.mo14443a()).booleanValue();
    }
}
