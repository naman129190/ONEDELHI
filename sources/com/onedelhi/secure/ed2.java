package com.onedelhi.secure;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

public final class ed2 {
    @GuardedBy("MapsInitializer.class")

    /* renamed from: a */
    public static C2056a f11198a = C2056a.LEGACY;

    /* renamed from: a */
    public static final String f11199a = "ed2";
    @GuardedBy("MapsInitializer.class")

    /* renamed from: a */
    public static boolean f11200a = false;

    /* renamed from: com.onedelhi.secure.ed2$a */
    public enum C2056a {
        LEGACY,
        LATEST
    }

    /* renamed from: a */
    public static synchronized int m13700a(@mr2 Context context) {
        int b;
        synchronized (ed2.class) {
            b = m13701b(context, (C2056a) null, (xu2) null);
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m13701b(@com.onedelhi.secure.mr2 android.content.Context r5, @com.onedelhi.secure.ts2 com.onedelhi.secure.ed2.C2056a r6, @com.onedelhi.secure.ts2 com.onedelhi.secure.xu2 r7) {
        /*
            java.lang.Class<com.onedelhi.secure.ed2> r0 = com.onedelhi.secure.ed2.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = f11199a     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = f11200a     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x0025
            if (r7 == 0) goto L_0x0023
            com.onedelhi.secure.ed2$a r5 = f11198a     // Catch:{ all -> 0x0089 }
            r7.mo27114a(r5)     // Catch:{ all -> 0x0089 }
        L_0x0023:
            monitor-exit(r0)
            return r2
        L_0x0025:
            com.onedelhi.secure.c66 r1 = com.onedelhi.secure.zs5.m33393a(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0084 }
            com.onedelhi.secure.ln1 r3 = r1.mo14022O5()     // Catch:{ RemoteException -> 0x007d }
            com.onedelhi.secure.C3743ut.m29578l(r3)     // Catch:{ RemoteException -> 0x007d }
            com.onedelhi.secure.ih6 r3 = r1.mo14026k1()     // Catch:{ RemoteException -> 0x007d }
            com.onedelhi.secure.C3858wl.m30945h(r3)     // Catch:{ RemoteException -> 0x007d }
            r3 = 1
            f11200a = r3     // Catch:{ all -> 0x0089 }
            r4 = 2
            if (r6 == 0) goto L_0x0048
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x0049
            if (r6 == r3) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r3 = 2
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            int r6 = r1.mo14028o()     // Catch:{ RemoteException -> 0x005b }
            if (r6 != r4) goto L_0x0053
            com.onedelhi.secure.ed2$a r6 = com.onedelhi.secure.ed2.C2056a.LATEST     // Catch:{ RemoteException -> 0x005b }
            f11198a = r6     // Catch:{ RemoteException -> 0x005b }
        L_0x0053:
            com.onedelhi.secure.tn1 r5 = com.onedelhi.secure.nt2.m23166l8(r5)     // Catch:{ RemoteException -> 0x005b }
            r1.mo14021N5(r5, r3)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r5 = move-exception
            java.lang.String r6 = f11199a     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0089 }
        L_0x0063:
            java.lang.String r5 = f11199a     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "loadedRenderer: "
            com.onedelhi.secure.ed2$a r1 = f11198a     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.concat(r1)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x007b
            com.onedelhi.secure.ed2$a r5 = f11198a     // Catch:{ all -> 0x0089 }
            r7.mo27114a(r5)     // Catch:{ all -> 0x0089 }
        L_0x007b:
            monitor-exit(r0)
            return r2
        L_0x007d:
            r5 = move-exception
            com.onedelhi.secure.qo3 r6 = new com.onedelhi.secure.qo3     // Catch:{ all -> 0x0089 }
            r6.<init>(r5)     // Catch:{ all -> 0x0089 }
            throw r6     // Catch:{ all -> 0x0089 }
        L_0x0084:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return r5
        L_0x0089:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ed2.m13701b(android.content.Context, com.onedelhi.secure.ed2$a, com.onedelhi.secure.xu2):int");
    }
}
