package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.appcompat.widget.C0358b;
import com.onedelhi.secure.ak4;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class u10 {

    /* renamed from: a */
    public static final int f35893a = 1073741824;

    /* renamed from: a */
    public static final long f35894a = -1;

    /* renamed from: a */
    public static final String f35895a = "SHA-1";

    /* renamed from: a */
    public static final char[] f35896a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final int f35897b = 1048576;

    /* renamed from: b */
    public static long f35898b = -1;

    /* renamed from: b */
    public static final String f35899b = "goldfish";

    /* renamed from: c */
    public static final int f35900c = 1024;

    /* renamed from: c */
    public static final String f35901c = "ranchu";

    /* renamed from: d */
    public static final int f35902d = 1;

    /* renamed from: d */
    public static final String f35903d = "sdk";

    /* renamed from: e */
    public static final int f35904e = 2;

    /* renamed from: e */
    public static final String f35905e = "com.google.firebase.crashlytics";

    /* renamed from: f */
    public static final int f35906f = 4;

    /* renamed from: f */
    public static final String f35907f = "com.crashlytics.prefs";

    /* renamed from: g */
    public static final int f35908g = 8;

    /* renamed from: g */
    public static final String f35909g = "com.google.firebase.crashlytics.mapping_file_id";

    /* renamed from: h */
    public static final int f35910h = 16;

    /* renamed from: h */
    public static final String f35911h = "com.crashlytics.android.build_id";

    /* renamed from: i */
    public static final int f35912i = 32;

    /* renamed from: i */
    public static final String f35913i = "com.google.firebase.crashlytics.build_ids_lib";

    /* renamed from: j */
    public static final String f35914j = "com.google.firebase.crashlytics.build_ids_arch";

    /* renamed from: k */
    public static final String f35915k = "com.google.firebase.crashlytics.build_ids_build_id";

    /* renamed from: com.onedelhi.secure.u10$a */
    public enum C6917a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: a */
        public static final Map<String, C6917a> f35917a = null;

        /* access modifiers changed from: public */
        static {
            C6917a aVar;
            C6917a aVar2;
            C6917a aVar3;
            C6917a aVar4;
            HashMap hashMap = new HashMap(4);
            f35917a = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        /* renamed from: a */
        public static C6917a m66380a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                o92.m59120f().mo41621k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C6917a aVar = f35917a.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    /* renamed from: A */
    public static boolean m66346A() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: B */
    public static boolean m66347B() {
        if (!Build.PRODUCT.contains(f35903d)) {
            String str = Build.HARDWARE;
            return str.contains(f35899b) || str.contains(f35901c);
        }
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m66348C(Context context) {
        return false;
    }

    /* renamed from: D */
    public static boolean m66349D() {
        boolean B = m66347B();
        String str = Build.TAGS;
        if ((!B && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !B && new File("/system/xbin/su").exists();
    }

    /* renamed from: E */
    public static boolean m66350E(@ts2 String str, @ts2 String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: F */
    public static String m66351F(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: G */
    public static String m66352G(String str) {
        return m66376w(str, f35895a);
    }

    /* renamed from: H */
    public static String m66353H(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m66354a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(C0358b.f1779e)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m66355b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m66356c(Context context) {
        if (!m66357d(context, vg0.f21757b)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: d */
    public static boolean m66357d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m66358e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                o92.m59120f().mo41616e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m66359f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static long m66360g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m66361h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m66352G(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m66362i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m66358e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            com.onedelhi.secure.o92 r3 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo41616e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m66358e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u10.m66362i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m66363j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C0358b.f1779e)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m66364k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int s = m66372s(context, str, "bool");
            if (s > 0) {
                return resources.getBoolean(s);
            }
            int s2 = m66372s(context, str, ak4.C1709b.f9167e);
            if (s2 > 0) {
                return Boolean.parseBoolean(context.getString(s2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static List<C7275xp> m66365l(Context context) {
        ArrayList arrayList = new ArrayList();
        int s = m66372s(context, f35913i, "array");
        int s2 = m66372s(context, f35914j, "array");
        int s3 = m66372s(context, f35915k, "array");
        if (s == 0 || s2 == 0 || s3 == 0) {
            o92.m59120f().mo41613b(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3)}));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(s);
        String[] stringArray2 = context.getResources().getStringArray(s2);
        String[] stringArray3 = context.getResources().getStringArray(s3);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            for (int i = 0; i < stringArray3.length; i++) {
                arrayList.add(new C7275xp(stringArray[i], stringArray2[i], stringArray3[i]));
            }
            return arrayList;
        }
        o92.m59120f().mo41613b(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)}));
        return arrayList;
    }

    /* renamed from: m */
    public static int m66366m() {
        return C6917a.m66380a().ordinal();
    }

    /* renamed from: n */
    public static int m66367n() {
        boolean B = m66347B();
        if (m66349D()) {
            B |= true;
        }
        return m66346A() ? B | true ? 1 : 0 : B ? 1 : 0;
    }

    /* renamed from: o */
    public static SharedPreferences m66368o(Context context) {
        return context.getSharedPreferences(f35907f, 0);
    }

    /* renamed from: p */
    public static String m66369p(Context context) {
        int s = m66372s(context, f35909g, ak4.C1709b.f9167e);
        if (s == 0) {
            s = m66372s(context, f35911h, ak4.C1709b.f9167e);
        }
        if (s != 0) {
            return context.getResources().getString(s);
        }
        return null;
    }

    /* renamed from: q */
    public static boolean m66370q(Context context) {
        return !m66347B() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    /* renamed from: r */
    public static String m66371r(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: s */
    public static int m66372s(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m66371r(context));
    }

    /* renamed from: t */
    public static SharedPreferences m66373t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: u */
    public static String m66374u(Context context, String str) {
        int s = m66372s(context, str, ak4.C1709b.f9167e);
        return s > 0 ? context.getString(s) : "";
    }

    /* renamed from: v */
    public static synchronized long m66375v() {
        long j;
        synchronized (u10.class) {
            if (f35898b == -1) {
                long j2 = 0;
                String i = m66362i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m66360g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m66360g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m66360g(upperCase, "GB", 1073741824);
                        } else {
                            o92 f = o92.m59120f();
                            f.mo41623m("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        o92 f2 = o92.m59120f();
                        f2.mo41616e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f35898b = j2;
            }
            j = f35898b;
        }
        return j;
    }

    /* renamed from: w */
    public static String m66376w(String str, String str2) {
        return m66377x(str.getBytes(), str2);
    }

    /* renamed from: x */
    public static String m66377x(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m66378y(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            o92 f = o92.m59120f();
            f.mo41616e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: y */
    public static String m66378y(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f35896a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: z */
    public static boolean m66379z(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
