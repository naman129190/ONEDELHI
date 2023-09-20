package com.onedelhi.secure;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@ShowFirstParty
public class fq6 {

    /* renamed from: a */
    public static final int f12270a = 1;

    /* renamed from: a */
    public static final ComponentName f12271a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: a */
    public static final Logger f12272a = wx5.m31172a("GoogleAuthUtil");

    /* renamed from: a */
    public static final String f12273a = "com.google";
    @ShowFirstParty

    /* renamed from: a */
    public static final String[] f12274a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    public static final int f12275b = 2;
    @ShowFirstParty

    /* renamed from: b */
    public static final String f12276b = "com.google.work";

    /* renamed from: c */
    public static final int f12277c = 3;

    /* renamed from: c */
    public static final String f12278c = "suppressProgressScreen";

    /* renamed from: d */
    public static final int f12279d = 4;
    @ShowFirstParty
    @SuppressLint({"InlinedApi"})

    /* renamed from: d */
    public static final String f12280d = "androidPackageName";

    /* renamed from: a */
    public static void m15219a(Context context, String str) throws rh1, IOException {
        m15233o(context, str, 0);
    }

    /* renamed from: b */
    public static List<C2290h2> m15220b(Context context, int i, String str) throws rh1, IOException {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        m15239u(context, 8400000);
        C2393i2 i2Var = new C2393i2();
        i2Var.mo17508N2(str);
        i2Var.mo17509O2(i);
        iy5.m18042e(context);
        if (og6.m23762d() && m15243y(context)) {
            try {
                C2469j2 j2Var = (C2469j2) m15237s(ge6.m15808a(context).mo20240m(i2Var), "account change events retrieval");
                m15238t(j2Var);
                return j2Var.mo18089K2();
            } catch (ApiException e) {
                m15240v(e, "account change events retrieval");
            }
        }
        return (List) m15236r(context, f12271a, new ai6(i2Var), 0);
    }

    /* renamed from: c */
    public static String m15221c(Context context, String str) throws rh1, IOException {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        m15239u(context, 8400000);
        return m15225g(context, str, "^^_account_id_^^", new Bundle());
    }

    /* renamed from: d */
    public static String m15222d(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, rh1 {
        return m15223e(context, account, str, new Bundle());
    }

    /* renamed from: e */
    public static String m15223e(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, rh1 {
        m15242x(account);
        return m15229k(context, account, str, bundle).zza();
    }

    @Deprecated
    /* renamed from: f */
    public static String m15224f(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, rh1 {
        return m15222d(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    /* renamed from: g */
    public static String m15225g(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, rh1 {
        return m15223e(context, new Account(str, "com.google"), str2, bundle);
    }

    @wj3("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: h */
    public static void m15226h(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    @ShowFirstParty
    @TargetApi(23)
    /* renamed from: i */
    public static Bundle m15227i(Context context, Account account) throws rh1, IOException {
        Preconditions.checkNotNull(context);
        m15242x(account);
        m15239u(context, 8400000);
        iy5.m18042e(context);
        if (og6.m23763e() && m15243y(context)) {
            try {
                Bundle bundle = (Bundle) m15237s(ge6.m15808a(context).mo20236S(account), "account removal");
                m15238t(bundle);
                return bundle;
            } catch (ApiException e) {
                m15240v(e, "account removal");
            }
        }
        return (Bundle) m15236r(context, f12271a, new oa6(account), 0);
    }

    @TargetApi(26)
    /* renamed from: j */
    public static Boolean m15228j(Context context) throws rh1, IOException {
        Preconditions.checkNotNull(context);
        m15239u(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        iy5.m18042e(context);
        if (og6.m23763e() && m15243y(context)) {
            try {
                Bundle bundle = (Bundle) m15237s(ge6.m15808a(context).mo20239i(str), "google accounts access request");
                String string = bundle.getString(h60.f29526u);
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                jr5 a = jr5.m18774a(string);
                if (jr5.SUCCESS.equals(a)) {
                    return Boolean.TRUE;
                }
                if (jr5.m18775b(a)) {
                    Logger logger = f12272a;
                    String valueOf = String.valueOf(a);
                    logger.mo10174w("isUserRecoverableError status: " + valueOf, new Object[0]);
                    throw new UserRecoverableAuthException(string, intent);
                }
                throw new rh1(string);
            } catch (ApiException e) {
                m15240v(e, "google accounts access request");
            }
        }
        return (Boolean) m15236r(context, f12271a, new tk6(str), 0);
    }

    /* renamed from: k */
    public static TokenData m15229k(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, rh1 {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        m15242x(account);
        m15239u(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m15241w(context, bundle2);
        iy5.m18042e(context);
        if (og6.m23763e() && m15243y(context)) {
            try {
                Bundle bundle3 = (Bundle) m15237s(ge6.m15808a(context).mo20237c(account, str, bundle2), "token retrieval");
                m15238t(bundle3);
                return m15235q(bundle3);
            } catch (ApiException e) {
                m15240v(e, "token retrieval");
            }
        }
        return (TokenData) m15236r(context, f12271a, new q66(account, str, bundle2), 0);
    }

    /* renamed from: l */
    public static /* synthetic */ TokenData m15230l(Account account, String str, Bundle bundle, IBinder iBinder) throws RemoteException, IOException, rh1 {
        Bundle a7 = r26.m26276k8(iBinder).mo20978a7(account, str, bundle);
        if (a7 != null) {
            return m15235q(a7);
        }
        throw new IOException("Service call returned null");
    }

    @ShowFirstParty
    /* renamed from: o */
    public static void m15233o(Context context, String str, long j) throws rh1, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        m15239u(context, 8400000);
        Bundle bundle = new Bundle();
        m15241w(context, bundle);
        iy5.m18042e(context);
        if (og6.m23763e() && m15243y(context)) {
            ma6 a = ge6.m15808a(context);
            zq5 zq5 = new zq5();
            zq5.mo28066K2(str);
            try {
                m15237s(a.mo20238f(zq5), "clear token");
                return;
            } catch (ApiException e) {
                m15240v(e, "clear token");
            }
        }
        m15236r(context, f12271a, new je6(str, bundle), 0);
    }

    /* renamed from: p */
    public static void m15234p(Intent intent) {
        if (intent != null) {
            try {
                Intent.parseUri(intent.toUri(1), 1);
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }
        } else {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
    }

    /* renamed from: q */
    public static TokenData m15235q(Bundle bundle) throws rh1, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString(h60.f29526u);
        Preconditions.checkNotNull(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        jr5 a = jr5.m18774a(string);
        if (jr5.m18775b(a)) {
            f12272a.mo10174w("isUserRecoverableError status: ".concat(String.valueOf(a)), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        } else if (jr5.NETWORK_ERROR.equals(a) || jr5.SERVICE_UNAVAILABLE.equals(a) || jr5.INTNERNAL_ERROR.equals(a) || jr5.AUTH_SECURITY_ERROR.equals(a) || jr5.ACCOUNT_NOT_PRESENT.equals(a)) {
            throw new IOException(string);
        } else {
            throw new rh1(string);
        }
    }

    /* renamed from: r */
    public static Object m15236r(Context context, ComponentName componentName, mn6 mn6, long j) throws IOException, rh1 {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor instance = GmsClientSupervisor.getInstance(context);
        try {
            if (instance.bindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil")) {
                try {
                    Object a = mn6.mo13110a(blockingServiceConnection.getService());
                    instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil");
                    return a;
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil");
                    throw th;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", new Object[]{e2.getMessage()}));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    /* renamed from: s */
    public static Object m15237s(w94 w94, String str) throws IOException, ApiException {
        try {
            return ha4.m16566a(w94);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            f12272a.mo10174w(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            f12272a.mo10174w(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            f12272a.mo10174w(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    /* renamed from: t */
    public static Object m15238t(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f12272a.mo10174w("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    /* renamed from: u */
    public static void m15239u(Context context, int i) throws rh1 {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new uh1(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesIncorrectManifestValueException | GooglePlayServicesNotAvailableException e2) {
            throw new rh1(e2.getMessage(), e2);
        }
    }

    /* renamed from: v */
    public static void m15240v(ApiException apiException, String str) {
        f12272a.mo10174w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(apiException));
    }

    /* renamed from: w */
    public static void m15241w(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f12280d;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* renamed from: x */
    public static void m15242x(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f12274a;
            int i = 0;
            while (i < 3) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    /* renamed from: y */
    public static boolean m15243y(Context context) {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        List<String> m = og6.m23761b().mo19551m();
        String str = context.getApplicationInfo().packageName;
        for (String equals : m) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
