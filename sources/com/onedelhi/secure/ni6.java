package com.onedelhi.secure;

import android.net.Uri;

public final class ni6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Uri f17448a;

    /* renamed from: a */
    public final /* synthetic */ pi6 f17449a;

    /* renamed from: b */
    public final /* synthetic */ String f17450b;

    /* renamed from: b */
    public final /* synthetic */ boolean f17451b;

    /* renamed from: c */
    public final /* synthetic */ String f17452c;

    public ni6(pi6 pi6, boolean z, Uri uri, String str, String str2) {
        this.f17449a = pi6;
        this.f17451b = z;
        this.f17448a = uri;
        this.f17450b = str;
        this.f17452c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[SYNTHETIC, Splitter:B:32:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb A[Catch:{ RuntimeException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ RuntimeException -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            com.onedelhi.secure.pi6 r2 = r1.f17449a
            boolean r0 = r1.f17451b
            android.net.Uri r3 = r1.f17448a
            java.lang.String r4 = r1.f17450b
            java.lang.String r5 = r1.f17452c
            com.onedelhi.secure.ri6 r6 = r2.f18553a
            r6.mo15139h()
            com.onedelhi.secure.ri6 r6 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r6 = r6.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.gr6 r6 = r6.mo27871N()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.d07.m12872c()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ri6 r7 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r7 = r7.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ce5 r7 = r7.mo27891z()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.k36 r8 = com.onedelhi.secure.n36.f17088v0     // Catch:{ RuntimeException -> 0x0190 }
            r9 = 0
            boolean r7 = r7.mo14110B(r9, r8)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "_cis"
            java.lang.String r14 = "utm_source"
            java.lang.String r15 = "utm_campaign"
            java.lang.String r9 = "gclid"
            if (r10 == 0) goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x009f
        L_0x003f:
            boolean r10 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "utm_id"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "dclid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "srsltid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r7 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r7 = 1
            goto L_0x008a
        L_0x007c:
            com.onedelhi.secure.za6 r6 = r6.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.a56 r6 = r6.mo15136e()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.u46 r6 = r6.mo12725q()     // Catch:{ RuntimeException -> 0x0190 }
            r6.mo25379a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x003d
        L_0x008a:
            java.lang.String r10 = "https://google.com/search?"
            java.lang.String r10 = r10.concat(r5)     // Catch:{ RuntimeException -> 0x0190 }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r6 = r6.mo16894v0(r10, r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r6 == 0) goto L_0x009f
            java.lang.String r7 = "referrer"
            r6.putString(r13, r7)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x009f:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x00f5
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.gr6 r0 = r0.mo27871N()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.d07.m12872c()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ri6 r10 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r10 = r10.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ce5 r10 = r10.mo27891z()     // Catch:{ RuntimeException -> 0x0190 }
            r1 = 0
            boolean r8 = r10.mo14110B(r1, r8)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r0 = r0.mo16894v0(r3, r8)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = "intent"
            r0.putString(r13, r1)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r1 = r0.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 != 0) goto L_0x00e9
            if (r6 == 0) goto L_0x00e9
            boolean r1 = r6.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "_cer"
            java.lang.String r3 = "gclid=%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ RuntimeException -> 0x0190 }
            r8 = 0
            java.lang.String r13 = r6.getString(r9)     // Catch:{ RuntimeException -> 0x0190 }
            r10[r8] = r13     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r3 = java.lang.String.format(r3, r10)     // Catch:{ RuntimeException -> 0x0190 }
            r0.putString(r1, r3)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00e9:
            com.onedelhi.secure.ri6 r1 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo23910u(r4, r7, r0)     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ri6 r1 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.s17 r1 = r1.f19889a     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo24168a(r4, r0)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00f5:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00fd
            goto L_0x017f
        L_0x00fd:
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.u46 r0 = r0.mo12725q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "Activity created with referrer"
            r0.mo25380b(r1, r5)     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.k36 r1 = com.onedelhi.secure.n36.f17046a0     // Catch:{ RuntimeException -> 0x0190 }
            r3 = 0
            boolean r0 = r0.mo14110B(r3, r1)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "_ldl"
            java.lang.String r3 = "auto"
            if (r0 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x0132
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo23910u(r4, r7, r6)     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.s17 r0 = r0.f19889a     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo24168a(r4, r6)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x0143
        L_0x0132:
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.u46 r0 = r0.mo12725q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo25380b(r4, r5)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x0143:
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r5 = 0
            r0.mo23885K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x014b:
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
        L_0x0173:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x017f
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r0.mo23885K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x017f:
            return
        L_0x0180:
            com.onedelhi.secure.ri6 r0 = r2.f18553a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ RuntimeException -> 0x0190 }
            com.onedelhi.secure.u46 r0 = r0.mo12725q()     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo25379a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x0190:
            r0 = move-exception
            com.onedelhi.secure.ri6 r1 = r2.f18553a
            com.onedelhi.secure.za6 r1 = r1.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12726r()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.mo25380b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ni6.run():void");
    }
}
