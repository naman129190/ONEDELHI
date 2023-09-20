package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

public class c73 {

    /* renamed from: a */
    public static final GoogleApiAvailabilityLight f10181a = GoogleApiAvailabilityLight.getInstance();

    /* renamed from: a */
    public static final Object f10182a = new Object();
    @mr2

    /* renamed from: a */
    public static final String f10183a = "GmsCore_OpenSSL";
    @mj1("ProviderInstaller.lock")

    /* renamed from: a */
    public static Method f10184a = null;
    @mj1("ProviderInstaller.lock")

    /* renamed from: b */
    public static Method f10185b = null;

    /* renamed from: com.onedelhi.secure.c73$a */
    public interface C1861a {
        /* renamed from: a */
        void mo14051a();

        /* renamed from: b */
        void mo14052b(int i, @ts2 Intent intent);
    }

    /* renamed from: a */
    public static void m12376a(@mr2 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.checkNotNull(context, "Context must not be null");
        f10181a.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (f10182a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m8891e(context, DynamiteModule.f7394e, "com.google.android.gms.providerinstaller.dynamite").mo10407b();
            } catch (DynamiteModule.C1414a e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext != null) {
                    try {
                        if (f10185b == null) {
                            Class cls = Long.TYPE;
                            f10185b = m12379d(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f10185b.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                    }
                }
                if (remoteContext != null) {
                    m12380e(remoteContext, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else {
                m12380e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    public static void m12377b(@mr2 Context context, @mr2 C1861a aVar) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(aVar, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new ma5(context, aVar).execute(new Void[0]);
    }

    /* renamed from: d */
    public static Method m12379d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @mj1("ProviderInstaller.lock")
    /* renamed from: e */
    public static void m12380e(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f10184a == null) {
                f10184a = m12379d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f10184a.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
