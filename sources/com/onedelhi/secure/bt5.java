package com.onedelhi.secure;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class bt5 {

    /* renamed from: a */
    public static final Uri f9966a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: a */
    public static Object f9967a;

    /* renamed from: a */
    public static HashMap f9968a;

    /* renamed from: a */
    public static final AtomicBoolean f9969a = new AtomicBoolean();

    /* renamed from: a */
    public static final Pattern f9970a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: a */
    public static boolean f9971a;

    /* renamed from: a */
    public static final String[] f9972a = new String[0];

    /* renamed from: b */
    public static final Uri f9973b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: b */
    public static final HashMap f9974b = new HashMap();

    /* renamed from: b */
    public static final Pattern f9975b = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: c */
    public static final HashMap f9976c = new HashMap();

    /* renamed from: d */
    public static final HashMap f9977d = new HashMap();

    /* renamed from: e */
    public static final HashMap f9978e = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r11 = r11.query(f9966a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r12}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r11 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r11.moveToFirst() != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        m12066c(r0, r12, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13 = r11.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r13 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r13.equals((java.lang.Object) null) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        m12066c(r0, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12064a(android.content.ContentResolver r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.Class<com.onedelhi.secure.bt5> r13 = com.onedelhi.secure.bt5.class
            monitor-enter(r13)
            java.util.HashMap r0 = f9968a     // Catch:{ all -> 0x00ab }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicBoolean r0 = f9969a     // Catch:{ all -> 0x00ab }
            r0.set(r2)     // Catch:{ all -> 0x00ab }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            f9968a = r0     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            f9967a = r0     // Catch:{ all -> 0x00ab }
            f9971a = r2     // Catch:{ all -> 0x00ab }
            android.net.Uri r0 = f9966a     // Catch:{ all -> 0x00ab }
            com.onedelhi.secure.ws5 r4 = new com.onedelhi.secure.ws5     // Catch:{ all -> 0x00ab }
            r4.<init>(r3)     // Catch:{ all -> 0x00ab }
            r11.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00ab }
            goto L_0x0054
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r0 = f9969a     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0054
            java.util.HashMap r0 = f9968a     // Catch:{ all -> 0x00ab }
            r0.clear()     // Catch:{ all -> 0x00ab }
            java.util.HashMap r0 = f9974b     // Catch:{ all -> 0x00ab }
            r0.clear()     // Catch:{ all -> 0x00ab }
            java.util.HashMap r0 = f9976c     // Catch:{ all -> 0x00ab }
            r0.clear()     // Catch:{ all -> 0x00ab }
            java.util.HashMap r0 = f9977d     // Catch:{ all -> 0x00ab }
            r0.clear()     // Catch:{ all -> 0x00ab }
            java.util.HashMap r0 = f9978e     // Catch:{ all -> 0x00ab }
            r0.clear()     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            f9967a = r0     // Catch:{ all -> 0x00ab }
            f9971a = r2     // Catch:{ all -> 0x00ab }
        L_0x0054:
            java.lang.Object r0 = f9967a     // Catch:{ all -> 0x00ab }
            java.util.HashMap r4 = f9968a     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.containsKey(r12)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap r11 = f9968a     // Catch:{ all -> 0x00ab }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x00ab }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00ab }
            if (r11 != 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = r11
        L_0x006a:
            monitor-exit(r13)     // Catch:{ all -> 0x00ab }
            return r3
        L_0x006c:
            java.lang.String[] r4 = f9972a     // Catch:{ all -> 0x00ab }
            int r4 = r4.length     // Catch:{ all -> 0x00ab }
            monitor-exit(r13)     // Catch:{ all -> 0x00ab }
            android.net.Uri r6 = f9966a
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r12
            r7 = 0
            r8 = 0
            r10 = 0
            r5 = r11
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x0081
            return r3
        L_0x0081:
            boolean r13 = r11.moveToFirst()     // Catch:{ all -> 0x00a6 }
            if (r13 != 0) goto L_0x008e
            m12066c(r0, r12, r3)     // Catch:{ all -> 0x00a6 }
            r11.close()
            return r3
        L_0x008e:
            java.lang.String r13 = r11.getString(r1)     // Catch:{ all -> 0x00a6 }
            if (r13 == 0) goto L_0x009b
            boolean r1 = r13.equals(r3)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x009b
            r13 = r3
        L_0x009b:
            m12066c(r0, r12, r13)     // Catch:{ all -> 0x00a6 }
            if (r13 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r3 = r13
        L_0x00a2:
            r11.close()
            return r3
        L_0x00a6:
            r12 = move-exception
            r11.close()
            throw r12
        L_0x00ab:
            r11 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00ab }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bt5.m12064a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static void m12066c(Object obj, String str, String str2) {
        synchronized (bt5.class) {
            if (obj == f9967a) {
                f9968a.put(str, str2);
            }
        }
    }
}
