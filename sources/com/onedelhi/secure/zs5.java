package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.onedelhi.secure.ed2;

public final class zs5 {
    @SuppressLint({"StaticFieldLeak"})
    @ts2

    /* renamed from: a */
    public static Context f23875a = null;

    /* renamed from: a */
    public static c66 f23876a = null;

    /* renamed from: a */
    public static final String f23877a = "zs5";

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.c66 m33393a(android.content.Context r3, @com.onedelhi.secure.ts2 com.onedelhi.secure.ed2.C2056a r4) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r0 = f23877a
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
            com.onedelhi.secure.c66 r1 = f23876a
            if (r1 != 0) goto L_0x0084
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r3, r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m33395c(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Object r0 = m33396d(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x0056
        L_0x0042:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.onedelhi.secure.c66
            if (r2 == 0) goto L_0x0050
            r0 = r1
            com.onedelhi.secure.c66 r0 = (com.onedelhi.secure.c66) r0
            goto L_0x0056
        L_0x0050:
            com.onedelhi.secure.e26 r1 = new com.onedelhi.secure.e26
            r1.<init>(r0)
            r0 = r1
        L_0x0056:
            f23876a = r0
            android.content.Context r3 = m33395c(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            r3.getClass()     // Catch:{ RemoteException -> 0x006f }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x006f }
            com.onedelhi.secure.tn1 r3 = com.onedelhi.secure.nt2.m23166l8(r3)     // Catch:{ RemoteException -> 0x006f }
            int r4 = com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ RemoteException -> 0x006f }
            r0.mo14024b7(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            com.onedelhi.secure.c66 r3 = f23876a
            return r3
        L_0x006f:
            r3 = move-exception
            com.onedelhi.secure.qo3 r4 = new com.onedelhi.secure.qo3
            r4.<init>(r3)
            throw r4
        L_0x0076:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x007e:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r1)
            throw r3
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zs5.m33393a(android.content.Context, com.onedelhi.secure.ed2$a):com.onedelhi.secure.c66");
    }

    /* renamed from: b */
    public static Context m33394b(Exception exc, Context context) {
        Log.e(f23877a, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    @ts2
    /* renamed from: c */
    public static Context m33395c(Context context, @ts2 ed2.C2056a aVar) {
        String str;
        Context context2;
        Context context3 = f23875a;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.m8891e(context, DynamiteModule.f7378a, str).mo10407b();
            f23875a = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.m8891e(context, DynamiteModule.f7378a, str).mo10407b();
        } catch (Exception e) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f23877a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.m8891e(context, DynamiteModule.f7378a, "com.google.android.gms.maps_dynamite").mo10407b();
                } catch (Exception e2) {
                    context2 = m33394b(e2, context);
                }
            } else {
                context2 = m33394b(e, context);
            }
        }
        f23875a = context2;
        return context2;
    }

    /* renamed from: d */
    public static Object m33396d(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        }
    }
}
