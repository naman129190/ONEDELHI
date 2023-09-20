package com.delhitransport.onedelhi.networking.data_download;

import android.content.Context;
import java.io.File;

public class DownloadZipExtractor implements Runnable {
    public String DB_PATH;
    public String ZIP_PATH;
    public Context context;
    public File file;
    public String link;

    public DownloadZipExtractor(String str, File file2, String str2, String str3, Context context2) {
        this.link = str;
        this.file = file2;
        this.ZIP_PATH = str2;
        this.DB_PATH = str3;
        this.context = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r8.link     // Catch:{ Exception -> 0x007b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x007b }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x007b }
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ Exception -> 0x007b }
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ Exception -> 0x007b }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x007b }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x007b }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ Exception -> 0x007b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x007b }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x007b }
            java.io.File r3 = r8.file     // Catch:{ Exception -> 0x007b }
            r1.<init>(r3)     // Catch:{ Exception -> 0x007b }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x007b }
            r4 = 1024(0x400, float:1.435E-42)
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x007b }
            byte[] r1 = new byte[r4]     // Catch:{ Exception -> 0x007b }
        L_0x002d:
            r5 = 0
            int r6 = r2.read(r1, r5, r4)     // Catch:{ Exception -> 0x007b }
            if (r6 < 0) goto L_0x0038
            r3.write(r1, r5, r6)     // Catch:{ Exception -> 0x007b }
            goto L_0x002d
        L_0x0038:
            r3.close()     // Catch:{ Exception -> 0x007b }
            r2.close()     // Catch:{ Exception -> 0x007b }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r2.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r8.ZIP_PATH     // Catch:{ Exception -> 0x007b }
            r2.append(r3)     // Catch:{ Exception -> 0x007b }
            r3 = -125755654772551(0xffff8da03ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x007b }
            r2.append(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x007b }
            com.onedelhi.secure.iz4 r0 = new com.onedelhi.secure.iz4     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            java.lang.String r3 = r8.DB_PATH     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            android.content.Context r3 = r8.context     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            r1.delete()
            goto L_0x0084
        L_0x006f:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x0085
        L_0x0074:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x007c
        L_0x0079:
            r1 = move-exception
            goto L_0x0085
        L_0x007b:
            r1 = move-exception
        L_0x007c:
            r1.printStackTrace()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0084
            r0.delete()
        L_0x0084:
            return
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.delete()
        L_0x008a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.networking.data_download.DownloadZipExtractor.run():void");
    }
}
