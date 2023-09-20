package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

@ly4
public final class p56 implements Runnable {

    /* renamed from: a */
    public final g56 f18363a;

    /* renamed from: a */
    public final /* synthetic */ s56 f18364a;

    /* renamed from: a */
    public final URL f18365a;

    /* renamed from: a */
    public final Map f18366a;

    /* renamed from: a */
    public final byte[] f18367a;

    /* renamed from: b */
    public final String f18368b;

    public p56(s56 s56, String str, URL url, byte[] bArr, Map map, g56 g56) {
        this.f18364a = s56;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(g56);
        this.f18365a = url;
        this.f18367a = bArr;
        this.f18363a = g56;
        this.f18368b = str;
        this.f18366a = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3 A[SYNTHETIC, Splitter:B:43:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[SYNTHETIC, Splitter:B:65:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163 A[SYNTHETIC, Splitter:B:78:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.onedelhi.secure.s56 r1 = r14.f18364a
            r1.mo15138g()
            r1 = 0
            r2 = 0
            com.onedelhi.secure.s56 r3 = r14.f18364a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URL r4 = r14.f18365a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            if (r5 == 0) goto L_0x0114
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.onedelhi.secure.za6 r5 = r3.f11205a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5.mo27891z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3.mo27891z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.util.Map r5 = r14.f18366a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x005f
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
        L_0x0043:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            goto L_0x0043
        L_0x005f:
            byte[] r5 = r14.f18367a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x00ac
            com.onedelhi.secure.s56 r5 = r14.f18364a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.qq6 r5 = r5.f21907a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.uq6 r5 = r5.mo23380g0()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r6 = r14.f18367a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r5 = r5.mo25702O(r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.s56 r6 = r14.f18364a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.za6 r6 = r6.f11205a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.a56 r6 = r6.mo15136e()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.onedelhi.secure.u46 r6 = r6.mo12730v()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r6.mo25380b(r7, r9)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setFixedLengthStreamingMode(r8)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.connect()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r3.write(r5)     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            r3.close()     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0120
        L_0x00a7:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x015f
        L_0x00ac:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0107, all -> 0x0103 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00ef }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ed }
        L_0x00c1:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ed }
            if (r7 <= 0) goto L_0x00cb
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ed }
            goto L_0x00c1
        L_0x00cb:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
            r4.disconnect()
            com.onedelhi.secure.s56 r0 = r14.f18364a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()
            com.onedelhi.secure.m56 r1 = new com.onedelhi.secure.m56
            java.lang.String r6 = r14.f18368b
            com.onedelhi.secure.g56 r7 = r14.f18363a
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00e9:
            r0.mo23065z(r1)
            return
        L_0x00ed:
            r1 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r1 = move-exception
            r5 = r2
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0121
        L_0x00fc:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x0161
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0121
        L_0x0107:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x0161
        L_0x010c:
            r3 = move-exception
            r12 = r2
            r5 = r3
            goto L_0x0120
        L_0x0110:
            r3 = move-exception
            r12 = r2
            r10 = r3
            goto L_0x0160
        L_0x0114:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            throw r3     // Catch:{ IOException -> 0x015b, all -> 0x011c }
        L_0x011c:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x0120:
            r9 = 0
        L_0x0121:
            if (r2 == 0) goto L_0x013d
            r2.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x013d
        L_0x0127:
            r1 = move-exception
            com.onedelhi.secure.s56 r2 = r14.f18364a
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12726r()
            java.lang.String r3 = r14.f18368b
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r3)
            r2.mo25381c(r0, r3, r1)
        L_0x013d:
            if (r4 == 0) goto L_0x0142
            r4.disconnect()
        L_0x0142:
            com.onedelhi.secure.s56 r0 = r14.f18364a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()
            com.onedelhi.secure.m56 r1 = new com.onedelhi.secure.m56
            java.lang.String r7 = r14.f18368b
            com.onedelhi.secure.g56 r8 = r14.f18363a
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo23065z(r1)
            throw r5
        L_0x015b:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x015f:
            r10 = r5
        L_0x0160:
            r9 = 0
        L_0x0161:
            if (r2 == 0) goto L_0x017d
            r2.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x017d
        L_0x0167:
            r1 = move-exception
            com.onedelhi.secure.s56 r2 = r14.f18364a
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12726r()
            java.lang.String r3 = r14.f18368b
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r3)
            r2.mo25381c(r0, r3, r1)
        L_0x017d:
            if (r4 == 0) goto L_0x0182
            r4.disconnect()
        L_0x0182:
            com.onedelhi.secure.s56 r0 = r14.f18364a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()
            com.onedelhi.secure.m56 r1 = new com.onedelhi.secure.m56
            java.lang.String r7 = r14.f18368b
            com.onedelhi.secure.g56 r8 = r14.f18363a
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p56.run():void");
    }
}
