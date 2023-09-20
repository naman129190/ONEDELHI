package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import okhttp3.HttpUrl;

public class br4 {

    /* renamed from: a */
    public static Boolean f26520a;

    /* renamed from: a */
    public static int m40320a(@mr2 byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 4 && i < bArr.length) {
            i2 |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static void m40321b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static boolean m40322c(@mr2 Context context) {
        Boolean bool = f26520a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f26520a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C7012v5 e2 = C7012v5.m67717e();
            e2.mo46000a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public static int m40323d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static String m40324e(@mr2 String str) {
        HttpUrl parse = HttpUrl.parse(str);
        return parse != null ? parse.newBuilder().username("").password("").query((String) null).fragment((String) null).toString() : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r0 = r3.lastIndexOf(47, r4 - 1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m40325f(java.lang.String r3, int r4) {
        /*
            int r0 = r3.length()
            if (r0 > r4) goto L_0x0007
            return r3
        L_0x0007:
            char r0 = r3.charAt(r4)
            r1 = 47
            r2 = 0
            if (r0 != r1) goto L_0x0015
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        L_0x0015:
            okhttp3.HttpUrl r0 = okhttp3.HttpUrl.parse(r3)
            if (r0 != 0) goto L_0x0020
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        L_0x0020:
            java.lang.String r0 = r0.encodedPath()
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0037
            int r0 = r4 + -1
            int r0 = r3.lastIndexOf(r1, r0)
            if (r0 < 0) goto L_0x0037
            java.lang.String r3 = r3.substring(r2, r0)
            return r3
        L_0x0037:
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.br4.m40325f(java.lang.String, int):java.lang.String");
    }
}
