package com.onedelhi.secure;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.List;

public final class sh1 extends fq6 {

    /* renamed from: e */
    public static final int f20369e = 1;
    @mr2

    /* renamed from: e */
    public static final String f20370e = "com.google";

    /* renamed from: f */
    public static final int f20371f = 2;
    @mr2

    /* renamed from: f */
    public static final String f20372f = "com.google.work";

    /* renamed from: g */
    public static final int f20373g = 3;
    @mr2

    /* renamed from: g */
    public static final String f20374g = "suppressProgressScreen";

    /* renamed from: h */
    public static final int f20375h = 4;

    @mr2
    /* renamed from: A */
    public static String m27570A(@mr2 Context context, @mr2 Account account, @mr2 String str, @mr2 Bundle bundle, @mr2 Intent intent) throws IOException, cq4, rh1 {
        fq6.m15234p(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("callback_intent", intent);
        bundle.putBoolean("handle_notification", true);
        return m27575F(context, account, str, bundle).zza();
    }

    @mr2
    /* renamed from: B */
    public static String m27571B(@mr2 Context context, @mr2 Account account, @mr2 String str, @mr2 Bundle bundle, @mr2 String str2, @mr2 Bundle bundle2) throws IOException, cq4, rh1 {
        Preconditions.checkNotEmpty(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return m27575F(context, account, str, bundle).zza();
    }

    @mr2
    @Deprecated
    /* renamed from: C */
    public static String m27572C(@mr2 Context context, @mr2 String str, @mr2 String str2, @mr2 Bundle bundle) throws IOException, cq4, rh1 {
        return m27586z(context, new Account(str, "com.google"), str2, bundle);
    }

    @mr2
    @Deprecated
    /* renamed from: D */
    public static String m27573D(@mr2 Context context, @mr2 String str, @mr2 String str2, @mr2 Bundle bundle, @mr2 Intent intent) throws IOException, cq4, rh1 {
        return m27570A(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @mr2
    @Deprecated
    /* renamed from: E */
    public static String m27574E(@mr2 Context context, @mr2 String str, @mr2 String str2, @mr2 Bundle bundle, @mr2 String str3, @mr2 Bundle bundle2) throws IOException, cq4, rh1 {
        return m27571B(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    /* renamed from: F */
    public static TokenData m27575F(Context context, Account account, String str, Bundle bundle) throws IOException, rh1 {
        try {
            TokenData k = fq6.m15229k(context, account, str, bundle);
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            return k;
        } catch (uh1 e) {
            GooglePlayServicesUtil.showErrorNotification(e.mo25621b(), context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new cq4("User intervention required. Notification has been pushed.", e);
        } catch (UserRecoverableAuthException e2) {
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new cq4("User intervention required. Notification has been pushed.", e2);
        }
    }

    /* renamed from: a */
    public static void m27576a(@mr2 Context context, @mr2 String str) throws uh1, rh1, IOException {
        fq6.m15219a(context, str);
    }

    @mr2
    /* renamed from: b */
    public static List<C2290h2> m27577b(@mr2 Context context, int i, @mr2 String str) throws rh1, IOException {
        return fq6.m15220b(context, i, str);
    }

    @mr2
    /* renamed from: c */
    public static String m27578c(@mr2 Context context, @mr2 String str) throws rh1, IOException {
        return fq6.m15221c(context, str);
    }

    @mr2
    /* renamed from: d */
    public static String m27579d(@mr2 Context context, @mr2 Account account, @mr2 String str) throws IOException, UserRecoverableAuthException, rh1 {
        return fq6.m15222d(context, account, str);
    }

    @mr2
    /* renamed from: e */
    public static String m27580e(@mr2 Context context, @mr2 Account account, @mr2 String str, @mr2 Bundle bundle) throws IOException, UserRecoverableAuthException, rh1 {
        return fq6.m15223e(context, account, str, bundle);
    }

    @mr2
    @Deprecated
    /* renamed from: f */
    public static String m27581f(@mr2 Context context, @mr2 String str, @mr2 String str2) throws IOException, UserRecoverableAuthException, rh1 {
        return fq6.m15224f(context, str, str2);
    }

    @mr2
    @Deprecated
    /* renamed from: g */
    public static String m27582g(@mr2 Context context, @mr2 String str, @mr2 String str2, @mr2 Bundle bundle) throws IOException, UserRecoverableAuthException, rh1 {
        return fq6.m15225g(context, str, str2, bundle);
    }

    @wj3("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: h */
    public static void m27583h(@mr2 Context context, @mr2 String str) {
        fq6.m15226h(context, str);
    }

    @mr2
    @TargetApi(23)
    /* renamed from: i */
    public static Bundle m27584i(@mr2 Context context, @mr2 Account account) throws rh1, IOException {
        return fq6.m15227i(context, account);
    }

    @mr2
    @TargetApi(26)
    /* renamed from: j */
    public static Boolean m27585j(@mr2 Context context) throws rh1, IOException {
        return fq6.m15228j(context);
    }

    @mr2
    /* renamed from: z */
    public static String m27586z(@mr2 Context context, @mr2 Account account, @mr2 String str, @mr2 Bundle bundle) throws IOException, cq4, rh1 {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return m27575F(context, account, str, bundle).zza();
    }
}
