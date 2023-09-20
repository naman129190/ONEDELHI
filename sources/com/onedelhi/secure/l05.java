package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.oz4;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jmjou.C7601c;

public class l05 {
    /* renamed from: a */
    public static boolean m55197a(C7601c cVar) {
        Class cls = k15.class;
        if (cVar.mo48872h(HttpResponseCache.class.getCanonicalName()) != null) {
            m05.m56770a("Utils", "http response cache is already installed, returning...");
            return true;
        }
        try {
            m05.m56772c("Utils", "trying to setup http cache ...");
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            if (installed == null) {
                Context context = C7601c.f38776a;
                ((k15) cVar.mo48873i(cls)).getClass();
                File file = new File(context.getCacheDir(), "phonepesdkcache");
                ((k15) cVar.mo48873i(cls)).getClass();
                m05.m56772c("Utils", String.format("trying to setup http cache in dir = {%s}.", new Object[]{file}));
                HttpResponseCache.install(file, (long) 1048576);
            }
            m05.m56772c("Utils", "http response cache is installed");
            cVar.mo48875k(HttpResponseCache.class.getCanonicalName(), installed);
            return true;
        } catch (Exception e) {
            String format = String.format("IOException caught , http response cache installation failed. exception message = {%s}", new Object[]{e.getMessage()});
            m05.C6076b bVar = m05.f31968a;
            if (bVar != null) {
                bVar.mo40403b("Utils", format);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static int m55198b(@mr2 String str, @mr2 C7601c cVar) {
        cVar.getClass();
        try {
            return C7601c.f38776a.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            m05.m56771b("Utils", String.format("Exception app name not found, exception message = {%s}", new Object[]{e.getMessage()}));
            return -1;
        }
    }

    /* renamed from: c */
    public static String m55199c(C7601c cVar) {
        Class cls = k15.class;
        cVar.getClass();
        Context context = C7601c.f38776a;
        if (!m55205i((Boolean) cVar.mo48872h("com.phonepe.android.sdk.isUAT"))) {
            ((k15) cVar.mo48873i(cls)).getClass();
            return "com.phonepe.app";
        }
        ((k15) cVar.mo48873i(cls)).getClass();
        if (m55204h(context, "com.phonepe.app.preprod.internal")) {
            return "com.phonepe.app.preprod.internal";
        }
        ((k15) cVar.mo48873i(cls)).getClass();
        return "com.phonepe.app.preprod";
    }

    /* renamed from: d */
    public static String m55200d(C7601c cVar, String str) {
        try {
            m05.m56772c("Utils", String.format("trying to get application name for the package = {%s}", new Object[]{str}));
            cVar.getClass();
            PackageManager packageManager = C7601c.f38776a.getPackageManager();
            String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
            m05.m56772c("Utils", String.format("application name for package name = {%s} is {%s}", new Object[]{str, charSequence}));
            return charSequence;
        } catch (Exception e) {
            m05.m56771b("Utils", String.format("Exception app name not found, exception message = {%s}", new Object[]{e.getMessage()}));
            ((k15) cVar.mo48873i(k15.class)).getClass();
            return "application";
        }
    }

    /* renamed from: e */
    public static String m55201e(C7601c cVar, String str, String str2) {
        MessageDigest messageDigest;
        try {
            String c = cVar.mo48867c();
            if (str2 != null) {
                String str3 = str2 + str + c;
                messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            } else {
                String str4 = str + c;
                messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str4.getBytes(StandardCharsets.UTF_8));
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            m05.m56773d("Utils", e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: f */
    public static List<ResolveInfo> m55202f(C7601c cVar, Intent intent) {
        try {
            if (m55206j(intent, "Utils", "implicitIntent")) {
                cVar.mo48865a().mo42319a("Utils", "implicitIntent is null", oz4.C6352a.LOW);
                return new ArrayList();
            }
            cVar.getClass();
            return C7601c.f38776a.getPackageManager().queryIntentActivities(intent, 65536);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: g */
    public static boolean m55203g() {
        return Build.VERSION.SDK_INT <= 25;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r1.getPackageManager();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m55204h(android.content.Context r1, java.lang.String r2) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.Intent r2 = r1.getLaunchIntentForPackage(r2)
            if (r2 != 0) goto L_0x000f
            return r0
        L_0x000f:
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentActivities(r2, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l05.m55204h(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: i */
    public static boolean m55205i(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    /* renamed from: j */
    public static boolean m55206j(Object obj, String str, String str2) {
        if (obj != null) {
            return false;
        }
        m05.m56772c(str, String.format("{%s} is null or empty", new Object[]{str2}));
        return true;
    }

    /* renamed from: k */
    public static boolean m55207k(String str) {
        return str == null || str.trim().isEmpty();
    }
}
