package com.onedelhi.secure;

import android.os.Build;
import android.os.UserManager;

public final class ne6 {
    @mj1("DirectBootUtils.class")

    /* renamed from: a */
    public static UserManager f17339a;

    /* renamed from: a */
    public static volatile boolean f17340a = (!m22719b());

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r8 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22718a(android.content.Context r8) {
        /*
            boolean r0 = m22719b()
            r1 = 0
            if (r0 == 0) goto L_0x005e
            boolean r0 = f17340a
            if (r0 == 0) goto L_0x000c
            goto L_0x005e
        L_0x000c:
            java.lang.Class<com.onedelhi.secure.ne6> r0 = com.onedelhi.secure.ne6.class
            monitor-enter(r0)
            boolean r2 = f17340a     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x0015:
            r2 = 1
            r3 = 1
        L_0x0017:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L_0x004e
            android.os.UserManager r4 = f17339a     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x0029
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r8.getSystemService(r4)     // Catch:{ all -> 0x005b }
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch:{ all -> 0x005b }
            f17339a = r4     // Catch:{ all -> 0x005b }
        L_0x0029:
            android.os.UserManager r4 = f17339a     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x002f
            r8 = 1
            goto L_0x0053
        L_0x002f:
            boolean r6 = r4.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0041 }
            if (r6 != 0) goto L_0x003f
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0041 }
            boolean r8 = r4.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0041 }
            if (r8 != 0) goto L_0x004e
        L_0x003f:
            r8 = 1
            goto L_0x004f
        L_0x0041:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch:{ all -> 0x005b }
            f17339a = r5     // Catch:{ all -> 0x005b }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x004e:
            r8 = 0
        L_0x004f:
            if (r8 == 0) goto L_0x0053
            f17339a = r5     // Catch:{ all -> 0x005b }
        L_0x0053:
            if (r8 == 0) goto L_0x0057
            f17340a = r2     // Catch:{ all -> 0x005b }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            if (r8 != 0) goto L_0x005e
            return r2
        L_0x005b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r8
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ne6.m22718a(android.content.Context):boolean");
    }

    @C3196px(api = 24)
    /* renamed from: b */
    public static boolean m22719b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
