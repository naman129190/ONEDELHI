package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class w50 {

    /* renamed from: a */
    public static final int f22046a = 1;

    /* renamed from: b */
    public static final int f22047b = 2;

    /* renamed from: c */
    public static final int f22048c = 3;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.w50$a */
    public static class C3830a {
        @wj3("android.permission.ACCESS_NETWORK_STATE")
        @pn0
        /* renamed from: a */
        public static boolean m30649a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.w50$b */
    public static class C3831b {
        @pn0
        /* renamed from: a */
        public static int m30650a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.w50$c */
    public @interface C3832c {
    }

    @wj3("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    @ts2
    /* renamed from: a */
    public static NetworkInfo m30646a(@mr2 ConnectivityManager connectivityManager, @mr2 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    /* renamed from: b */
    public static int m30647b(@mr2 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3831b.m30650a(connectivityManager);
        }
        return 3;
    }

    @wj3("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: c */
    public static boolean m30648c(@mr2 ConnectivityManager connectivityManager) {
        return C3830a.m30649a(connectivityManager);
    }
}
