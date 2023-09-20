package com.paytm.pgsdk;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.common.internal.ImagesContract;

public class IntentServicePreNotification extends IntentService {
    public IntentServicePreNotification() {
        super("IntentServicePreNotification");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48487a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.lang.Object r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r6)     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.io.InputStream r0 = r6.getInputStream()     // Catch:{ Exception -> 0x002e }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x002e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002e }
            int r0 = r1.read()     // Catch:{ Exception -> 0x002e }
        L_0x001f:
            r2 = -1
            if (r0 == r2) goto L_0x003e
            char r0 = (char) r0     // Catch:{ Exception -> 0x002e }
            int r2 = r1.read()     // Catch:{ Exception -> 0x002e }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ Exception -> 0x002e }
            r3.print(r0)     // Catch:{ Exception -> 0x002e }
            r0 = r2
            goto L_0x001f
        L_0x002e:
            r0 = move-exception
            goto L_0x0039
        L_0x0030:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x0043
        L_0x0035:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0039:
            r0.printStackTrace()     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0041
        L_0x003e:
            r6.disconnect()
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
        L_0x0043:
            if (r6 == 0) goto L_0x0048
            r6.disconnect()
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.IntentServicePreNotification.mo48487a(java.lang.String):void");
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            mo48487a(intent.getExtras().getString(ImagesContract.URL));
        }
    }
}
