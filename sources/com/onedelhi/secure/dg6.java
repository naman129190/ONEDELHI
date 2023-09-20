package com.onedelhi.secure;

public final class dg6 {

    /* renamed from: a */
    public static volatile si6 f10736a = si6.m27657c();

    /* renamed from: a */
    public static final Object f10737a = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13106a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r0, r5)
            return r1
        L_0x001d:
            com.onedelhi.secure.si6 r6 = f10736a
            boolean r6 = r6.mo19081b()
            if (r6 == 0) goto L_0x0032
        L_0x0025:
            com.onedelhi.secure.si6 r5 = f10736a
            java.lang.Object r5 = r5.mo19080a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0032:
            java.lang.Object r6 = f10737a
            monitor-enter(r6)
            com.onedelhi.secure.si6 r0 = f10736a     // Catch:{ all -> 0x0094 }
            boolean r0 = r0.mo19081b()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x004b
            com.onedelhi.secure.si6 r5 = f10736a     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r5.mo19080a()     // Catch:{ all -> 0x0094 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0094 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            return r5
        L_0x004b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0094 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0077
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            r4 = 29
            if (r3 >= r4) goto L_0x0065
            r3 = 0
            goto L_0x0067
        L_0x0065:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0067:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0094 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0088
        L_0x0077:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0088 }
            int r5 = r5.flags     // Catch:{ all -> 0x0094 }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0094 }
            com.onedelhi.secure.si6 r5 = com.onedelhi.secure.si6.m27658d(r5)     // Catch:{ all -> 0x0094 }
            f10736a = r5     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0025
        L_0x0094:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dg6.m13106a(android.content.Context, android.net.Uri):boolean");
    }
}
