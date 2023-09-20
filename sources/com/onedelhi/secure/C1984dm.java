package com.onedelhi.secure;

import android.graphics.Bitmap;

/* renamed from: com.onedelhi.secure.dm */
public class C1984dm implements nk3<Bitmap> {

    /* renamed from: a */
    public static final ow2<Integer> f10862a = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: a */
    public static final String f10863a = "BitmapEncoder";

    /* renamed from: b */
    public static final ow2<Bitmap.CompressFormat> f10864b = ow2.m24134f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @ts2

    /* renamed from: a */
    public final C3131pa f10865a;

    @Deprecated
    public C1984dm() {
        this.f10865a = null;
    }

    public C1984dm(@mr2 C3131pa paVar) {
        this.f10865a = paVar;
    }

    @mr2
    /* renamed from: a */
    public vt0 mo14793a(@mr2 zw2 zw2) {
        return vt0.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:38|39)|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[SYNTHETIC, Splitter:B:38:0x00bc] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14384b(@com.onedelhi.secure.mr2 com.onedelhi.secure.ck3<android.graphics.Bitmap> r9, @com.onedelhi.secure.mr2 java.io.File r10, @com.onedelhi.secure.mr2 com.onedelhi.secure.zw2 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.mo14795d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.onedelhi.secure.eh1.m13755d(r4, r2, r3, r1)
            long r2 = com.onedelhi.secure.j92.m18214b()     // Catch:{ all -> 0x00c0 }
            com.onedelhi.secure.ow2<java.lang.Integer> r4 = f10862a     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r11.mo28148c(r4)     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c0 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c0 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0059 }
            com.onedelhi.secure.pa r10 = r8.f10865a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            com.onedelhi.secure.ro r10 = new com.onedelhi.secure.ro     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            com.onedelhi.secure.pa r6 = r8.f10865a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0059 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0069
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00ba
        L_0x0054:
            r10 = move-exception
            r6 = r7
            goto L_0x005a
        L_0x0057:
            r9 = move-exception
            goto L_0x00ba
        L_0x0059:
            r10 = move-exception
        L_0x005a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x0057 }
        L_0x0066:
            if (r6 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0069:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c0 }
            if (r10 == 0) goto L_0x00b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r10.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            int r1 = com.onedelhi.secure.oq4.m24020h(r9)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            double r1 = com.onedelhi.secure.j92.m18213a(r2)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            com.onedelhi.secure.ow2<android.graphics.Bitmap$CompressFormat> r1 = f10864b     // Catch:{ all -> 0x00c0 }
            java.lang.Object r11 = r11.mo28148c(r1)     // Catch:{ all -> 0x00c0 }
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c0 }
            r10.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c0 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c0 }
        L_0x00b6:
            com.onedelhi.secure.eh1.m13756e()
            return r5
        L_0x00ba:
            if (r6 == 0) goto L_0x00bf
            r6.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            com.onedelhi.secure.eh1.m13756e()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1984dm.mo14384b(com.onedelhi.secure.ck3, java.io.File, com.onedelhi.secure.zw2):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat mo14795d(Bitmap bitmap, zw2 zw2) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) zw2.mo28148c(f10864b);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
