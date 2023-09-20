package com.paytm.pgsdk;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.common.internal.ImagesContract;

public class IntentServicePostNotification extends IntentService {
    public IntentServicePostNotification() {
        super("IntentServicePostNotification");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48485a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            java.lang.Object r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r6)     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x003c, all -> 0x0037 }
            java.io.InputStream r0 = r6.getInputStream()     // Catch:{ Exception -> 0x0035 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0035 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0035 }
            int r0 = r1.read()     // Catch:{ Exception -> 0x0035 }
        L_0x0026:
            r2 = -1
            if (r0 == r2) goto L_0x0045
            char r0 = (char) r0     // Catch:{ Exception -> 0x0035 }
            int r2 = r1.read()     // Catch:{ Exception -> 0x0035 }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ Exception -> 0x0035 }
            r3.print(r0)     // Catch:{ Exception -> 0x0035 }
            r0 = r2
            goto L_0x0026
        L_0x0035:
            r0 = move-exception
            goto L_0x0040
        L_0x0037:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x004a
        L_0x003c:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0040:
            r0.printStackTrace()     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0048
        L_0x0045:
            r6.disconnect()
        L_0x0048:
            return
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            if (r6 == 0) goto L_0x004f
            r6.disconnect()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.IntentServicePostNotification.mo48485a(java.lang.String):void");
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            mo48485a(intent.getExtras().getString(ImagesContract.URL));
        }
    }
}
