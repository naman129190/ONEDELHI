package com.onedelhi.secure;

public final class ag6 {

    /* renamed from: a */
    public static volatile si6 f9051a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0159 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[Catch:{ RuntimeException -> 0x0068, all -> 0x016d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161 A[Catch:{ RuntimeException -> 0x0068, all -> 0x016d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.si6 m11154a(android.content.Context r14) {
        /*
            java.lang.Class<com.onedelhi.secure.ag6> r0 = com.onedelhi.secure.ag6.class
            monitor-enter(r0)
            com.onedelhi.secure.si6 r1 = f9051a     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0172
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0174 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0174 }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0174 }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.onedelhi.secure.si6 r14 = com.onedelhi.secure.si6.m27657c()     // Catch:{ all -> 0x0174 }
        L_0x0030:
            r1 = r14
            goto L_0x016a
        L_0x0033:
            boolean r1 = com.onedelhi.secure.ne6.m22719b()     // Catch:{ all -> 0x0174 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0043
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0174 }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0174 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x016d }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x016d }
            if (r4 == 0) goto L_0x0063
            com.onedelhi.secure.si6 r3 = com.onedelhi.secure.si6.m27658d(r3)     // Catch:{ all -> 0x016d }
            goto L_0x0071
        L_0x0063:
            com.onedelhi.secure.si6 r3 = com.onedelhi.secure.si6.m27657c()     // Catch:{ all -> 0x016d }
            goto L_0x0071
        L_0x0068:
            r3 = move-exception
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x016d }
            goto L_0x0063
        L_0x0071:
            boolean r4 = r3.mo19081b()     // Catch:{ all -> 0x016d }
            if (r4 == 0) goto L_0x0161
            java.lang.Object r3 = r3.mo19080a()     // Catch:{ all -> 0x016d }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x016d }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x015a }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x015a }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x015a }
            r6.<init>(r3)     // Catch:{ IOException -> 0x015a }
            r5.<init>(r6)     // Catch:{ IOException -> 0x015a }
            r4.<init>(r5)     // Catch:{ IOException -> 0x015a }
            r5 = 1
            com.onedelhi.secure.ty3 r6 = new com.onedelhi.secure.ty3     // Catch:{ all -> 0x013e }
            r6.<init>()     // Catch:{ all -> 0x013e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x013e }
            r7.<init>()     // Catch:{ all -> 0x013e }
        L_0x0097:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x013e }
            if (r8 == 0) goto L_0x010b
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x013e }
            int r11 = r9.length     // Catch:{ all -> 0x013e }
            if (r11 == r10) goto L_0x00be
            java.lang.String r9 = "HermeticFileOverrides"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r10.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r11 = "Invalid: "
            r10.append(r11)     // Catch:{ all -> 0x013e }
            r10.append(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x013e }
            android.util.Log.e(r9, r8)     // Catch:{ all -> 0x013e }
            goto L_0x0097
        L_0x00be:
            r8 = r9[r2]     // Catch:{ all -> 0x013e }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x013e }
            r10.<init>(r8)     // Catch:{ all -> 0x013e }
            r8 = r9[r5]     // Catch:{ all -> 0x013e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x013e }
            r11.<init>(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x013e }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x013e }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x013e }
            if (r12 != 0) goto L_0x00f3
            r9 = r9[r11]     // Catch:{ all -> 0x013e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x013e }
            r11.<init>(r9)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x013e }
            int r9 = r12.length()     // Catch:{ all -> 0x013e }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00f0
            if (r12 != r11) goto L_0x00f3
        L_0x00f0:
            r7.put(r11, r12)     // Catch:{ all -> 0x013e }
        L_0x00f3:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x013e }
            if (r9 != 0) goto L_0x0101
            com.onedelhi.secure.ty3 r9 = new com.onedelhi.secure.ty3     // Catch:{ all -> 0x013e }
            r9.<init>()     // Catch:{ all -> 0x013e }
            r6.put(r10, r9)     // Catch:{ all -> 0x013e }
        L_0x0101:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x013e }
            com.onedelhi.secure.ty3 r9 = (com.onedelhi.secure.ty3) r9     // Catch:{ all -> 0x013e }
            r9.put(r8, r12)     // Catch:{ all -> 0x013e }
            goto L_0x0097
        L_0x010b:
            java.lang.String r7 = "HermeticFileOverrides"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013e }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r8.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "Parsed "
            r8.append(r9)     // Catch:{ all -> 0x013e }
            r8.append(r3)     // Catch:{ all -> 0x013e }
            java.lang.String r3 = " for Android package "
            r8.append(r3)     // Catch:{ all -> 0x013e }
            r8.append(r14)     // Catch:{ all -> 0x013e }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x013e }
            android.util.Log.w(r7, r14)     // Catch:{ all -> 0x013e }
            com.onedelhi.secure.ff6 r14 = new com.onedelhi.secure.ff6     // Catch:{ all -> 0x013e }
            r14.<init>(r6)     // Catch:{ all -> 0x013e }
            r4.close()     // Catch:{ IOException -> 0x015a }
            com.onedelhi.secure.si6 r14 = com.onedelhi.secure.si6.m27658d(r14)     // Catch:{ all -> 0x016d }
            goto L_0x0165
        L_0x013e:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x0143 }
            goto L_0x0159
        L_0x0143:
            r3 = move-exception
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0159 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r2] = r8     // Catch:{ Exception -> 0x0159 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0159 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0159 }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            throw r14     // Catch:{ IOException -> 0x015a }
        L_0x015a:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x016d }
            r2.<init>(r14)     // Catch:{ all -> 0x016d }
            throw r2     // Catch:{ all -> 0x016d }
        L_0x0161:
            com.onedelhi.secure.si6 r14 = com.onedelhi.secure.si6.m27657c()     // Catch:{ all -> 0x016d }
        L_0x0165:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0174 }
            goto L_0x0030
        L_0x016a:
            f9051a = r1     // Catch:{ all -> 0x0174 }
            goto L_0x0172
        L_0x016d:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0174 }
            throw r14     // Catch:{ all -> 0x0174 }
        L_0x0172:
            monitor-exit(r0)     // Catch:{ all -> 0x0174 }
            return r1
        L_0x0174:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0174 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ag6.m11154a(android.content.Context):com.onedelhi.secure.si6");
    }
}
