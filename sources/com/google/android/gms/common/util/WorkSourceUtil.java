package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    @mj1("WorkSourceUtil.class")
    private static Boolean zzj = null;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x001a }
            r6[r3] = r7     // Catch:{ Exception -> 0x001a }
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch:{ Exception -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r6 = 2
            if (r5 == 0) goto L_0x0033
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0033 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0033 }
            r7[r3] = r8     // Catch:{ Exception -> 0x0033 }
            r7[r2] = r0     // Catch:{ Exception -> 0x0033 }
            java.lang.reflect.Method r1 = r5.getMethod(r1, r7)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            zzc = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            zzd = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0053 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0053 }
            r7[r3] = r8     // Catch:{ Exception -> 0x0053 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            zze = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r1 == 0) goto L_0x006b
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006b }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006b }
            r7[r3] = r8     // Catch:{ Exception -> 0x006b }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            zzf = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L_0x0087
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0088
        L_0x0081:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L_0x0087:
            r1 = r4
        L_0x0088:
            zzg = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r7 = "addNode"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00a5 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a5 }
            r6[r3] = r8     // Catch:{ Exception -> 0x00a5 }
            r6[r2] = r0     // Catch:{ Exception -> 0x00a5 }
            java.lang.reflect.Method r0 = r1.getMethod(r7, r6)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        L_0x00ab:
            r0 = r4
        L_0x00ac:
            zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L_0x00c2
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00c2 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00c2 }
            r0.setAccessible(r2)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c3
        L_0x00c2:
            r0 = r4
        L_0x00c3:
            zzi = r0
            zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@mr2 WorkSource workSource, int i, @mr2 String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = zzb;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    @mr2
    @KeepForSdk
    public static WorkSource fromPackage(@mr2 Context context, @mr2 String str) {
        String str2;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                str2 = "Could not get applicationInfo from package: ";
                Log.e("WorkSourceUtil", str2.concat(str));
                return null;
            }
            int i = applicationInfo.uid;
            WorkSource workSource = new WorkSource();
            add(workSource, i, str);
            return workSource;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    @com.onedelhi.secure.mr2
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@com.onedelhi.secure.mr2 android.content.Context r9, @com.onedelhi.secure.mr2 java.lang.String r10, @com.onedelhi.secure.mr2 java.lang.String r11) {
        /*
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r9 == 0) goto L_0x006e
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            if (r2 == 0) goto L_0x006e
            if (r11 == 0) goto L_0x006e
            if (r10 != 0) goto L_0x0010
            goto L_0x006e
        L_0x0010:
            r2 = -1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch:{ NameNotFoundException -> 0x0022 }
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r3)     // Catch:{ NameNotFoundException -> 0x0022 }
            if (r9 != 0) goto L_0x001f
            java.lang.String r9 = "Could not get applicationInfo from package: "
            goto L_0x0024
        L_0x001f:
            int r2 = r9.uid
            goto L_0x002b
        L_0x0022:
            java.lang.String r9 = "Could not find package: "
        L_0x0024:
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r1, r9)
        L_0x002b:
            if (r2 >= 0) goto L_0x002e
            return r0
        L_0x002e:
            android.os.WorkSource r9 = new android.os.WorkSource
            r9.<init>()
            java.lang.reflect.Method r0 = zzg
            if (r0 == 0) goto L_0x006a
            java.lang.reflect.Method r4 = zzh
            if (r4 != 0) goto L_0x003c
            goto L_0x006a
        L_0x003c:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r0 = r0.invoke(r9, r5)     // Catch:{ Exception -> 0x0063 }
            int r5 = zza     // Catch:{ Exception -> 0x0063 }
            r6 = 1
            r7 = 2
            if (r2 == r5) goto L_0x0055
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0063 }
            r8[r3] = r2     // Catch:{ Exception -> 0x0063 }
            r8[r6] = r10     // Catch:{ Exception -> 0x0063 }
            r4.invoke(r0, r8)     // Catch:{ Exception -> 0x0063 }
        L_0x0055:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0063 }
            r10[r3] = r2     // Catch:{ Exception -> 0x0063 }
            r10[r6] = r11     // Catch:{ Exception -> 0x0063 }
            r4.invoke(r0, r10)     // Catch:{ Exception -> 0x0063 }
            goto L_0x006d
        L_0x0063:
            r10 = move-exception
            java.lang.String r11 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r11, r10)
            goto L_0x006d
        L_0x006a:
            add(r9, r2, r10)
        L_0x006d:
            return r9
        L_0x006e:
            java.lang.String r9 = "Unexpected null arguments"
            android.util.Log.w(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @KeepForSdk
    public static int get(@mr2 WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @mr2
    @KeepForSdk
    public static String getName(@mr2 WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    @mr2
    @KeepForSdk
    public static List<String> getNames(@mr2 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@mr2 Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (r70.m26348a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzj = valueOf;
            boolean booleanValue2 = valueOf.booleanValue();
            return booleanValue2;
        }
    }

    @KeepForSdk
    public static boolean isEmpty(@mr2 WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@mr2 WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
