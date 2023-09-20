package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class z36 extends f66 {

    /* renamed from: a */
    public int f23448a;

    /* renamed from: a */
    public long f23449a;

    /* renamed from: a */
    public String f23450a;

    /* renamed from: a */
    public List f23451a;

    /* renamed from: b */
    public int f23452b;

    /* renamed from: b */
    public final long f23453b;

    /* renamed from: b */
    public String f23454b;

    /* renamed from: c */
    public long f23455c = 0;

    /* renamed from: c */
    public String f23456c;

    /* renamed from: d */
    public String f23457d;

    /* renamed from: e */
    public String f23458e;

    /* renamed from: f */
    public String f23459f;

    /* renamed from: g */
    public String f23460g;

    /* renamed from: h */
    public String f23461h;

    /* renamed from: i */
    public String f23462i = null;

    public z36(za6 za6, long j) {
        super(za6);
        this.f23453b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141 A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142 A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014b A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0173 A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0203  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @com.onedelhi.secure.ly4
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15848l() {
        /*
            r11 = this;
            com.onedelhi.secure.za6 r0 = r11.f11205a
            android.content.Context r0 = r0.mo15137f()
            java.lang.String r0 = r0.getPackageName()
            com.onedelhi.secure.za6 r1 = r11.f11205a
            android.content.Context r1 = r1.mo15137f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.onedelhi.secure.za6 r7 = r11.f11205a
            com.onedelhi.secure.a56 r7 = r7.mo15136e()
            com.onedelhi.secure.u46 r7 = r7.mo12726r()
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo25380b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.onedelhi.secure.za6 r7 = r11.f11205a
            com.onedelhi.secure.a56 r7 = r7.mo15136e()
            com.onedelhi.secure.u46 r7 = r7.mo12726r()
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo25380b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r4
        L_0x005b:
            com.onedelhi.secure.za6 r7 = r11.f11205a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo15137f()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.onedelhi.secure.za6 r8 = r11.f11205a
            com.onedelhi.secure.a56 r8 = r8.mo15136e()
            com.onedelhi.secure.u46 r8 = r8.mo12726r()
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo25381c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.f23450a = r0
            r11.f23456c = r6
            r11.f23454b = r2
            r11.f23448a = r3
            r11.f23457d = r8
            r2 = 0
            r11.f23449a = r2
            com.onedelhi.secure.za6 r2 = r11.f11205a
            java.lang.String r2 = r2.mo27872O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c5
            com.onedelhi.secure.za6 r2 = r11.f11205a
            java.lang.String r2 = r2.mo27873P()
            java.lang.String r3 = "am"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c5
            r2 = 1
            goto L_0x00c6
        L_0x00c5:
            r2 = 0
        L_0x00c6:
            com.onedelhi.secure.za6 r3 = r11.f11205a
            int r3 = r3.mo27889x()
            com.onedelhi.secure.za6 r6 = r11.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            switch(r3) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0106;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00dc;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            com.onedelhi.secure.u46 r6 = r6.mo12729u()
            java.lang.String r7 = "App measurement disabled due to denied storage consent"
            goto L_0x0113
        L_0x00dc:
            com.onedelhi.secure.u46 r6 = r6.mo12729u()
            java.lang.String r7 = "App measurement disabled via the global data collection setting"
            goto L_0x0113
        L_0x00e3:
            com.onedelhi.secure.u46 r6 = r6.mo12732x()
            java.lang.String r7 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0113
        L_0x00ea:
            com.onedelhi.secure.u46 r6 = r6.mo12730v()
            java.lang.String r7 = "App measurement disabled via the init parameters"
            goto L_0x0113
        L_0x00f1:
            com.onedelhi.secure.u46 r6 = r6.mo12729u()
            java.lang.String r7 = "App measurement disabled via the manifest"
            goto L_0x0113
        L_0x00f8:
            com.onedelhi.secure.u46 r6 = r6.mo12729u()
            java.lang.String r7 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0113
        L_0x00ff:
            com.onedelhi.secure.u46 r6 = r6.mo12730v()
            java.lang.String r7 = "App measurement deactivated via the init parameters"
            goto L_0x0113
        L_0x0106:
            com.onedelhi.secure.u46 r6 = r6.mo12729u()
            java.lang.String r7 = "App measurement deactivated via the manifest"
            goto L_0x0113
        L_0x010d:
            com.onedelhi.secure.u46 r6 = r6.mo12730v()
            java.lang.String r7 = "App measurement collection enabled"
        L_0x0113:
            r6.mo25379a(r7)
            r11.f23459f = r4
            r11.f23460g = r4
            com.onedelhi.secure.za6 r6 = r11.f11205a
            r6.mo15134c()
            if (r2 == 0) goto L_0x0129
            com.onedelhi.secure.za6 r2 = r11.f11205a
            java.lang.String r2 = r2.mo27872O()
            r11.f23460g = r2
        L_0x0129:
            com.onedelhi.secure.za6 r2 = r11.f11205a     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.Context r2 = r2.mo15137f()     // Catch:{ IllegalStateException -> 0x0192 }
            com.onedelhi.secure.za6 r6 = r11.f11205a     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r6 = r6.mo27875R()     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r7 = "google_app_id"
            java.lang.String r2 = com.onedelhi.secure.dj6.m13169c(r2, r7, r6)     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r6 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r4 = r2
        L_0x0143:
            r11.f23459f = r4     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r2 != 0) goto L_0x0171
            com.onedelhi.secure.za6 r2 = r11.f11205a     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.Context r2 = r2.mo15137f()     // Catch:{ IllegalStateException -> 0x0192 }
            com.onedelhi.secure.za6 r4 = r11.f11205a     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r4 = r4.mo27875R()     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.res.Resources r6 = r2.getResources()     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r7 != 0) goto L_0x0165
            goto L_0x0169
        L_0x0165:
            java.lang.String r4 = com.onedelhi.secure.e96.m13645a(r2)     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x0169:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.onedelhi.secure.e96.m13646b(r2, r6, r4)     // Catch:{ IllegalStateException -> 0x0192 }
            r11.f23460g = r2     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x0171:
            if (r3 != 0) goto L_0x01a6
            com.onedelhi.secure.za6 r2 = r11.f11205a     // Catch:{ IllegalStateException -> 0x0192 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ IllegalStateException -> 0x0192 }
            com.onedelhi.secure.u46 r2 = r2.mo12730v()     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f23450a     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r6 = r11.f23459f     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r6 == 0) goto L_0x018c
            java.lang.String r6 = r11.f23460g     // Catch:{ IllegalStateException -> 0x0192 }
            goto L_0x018e
        L_0x018c:
            java.lang.String r6 = r11.f23459f     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x018e:
            r2.mo25381c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x0192 }
            goto L_0x01a6
        L_0x0192:
            r2 = move-exception
            com.onedelhi.secure.za6 r3 = r11.f11205a
            com.onedelhi.secure.a56 r3 = r3.mo15136e()
            com.onedelhi.secure.u46 r3 = r3.mo12726r()
            java.lang.Object r0 = com.onedelhi.secure.a56.m10802z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo25381c(r4, r0, r2)
        L_0x01a6:
            r0 = 0
            r11.f23451a = r0
            com.onedelhi.secure.za6 r0 = r11.f11205a
            r0.mo15134c()
            com.onedelhi.secure.za6 r0 = r11.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo14132y(r2)
            if (r0 != 0) goto L_0x01bd
            goto L_0x01f2
        L_0x01bd:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01d3
            com.onedelhi.secure.za6 r0 = r11.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12732x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo25379a(r2)
            goto L_0x01f4
        L_0x01d3:
            java.util.Iterator r2 = r0.iterator()
        L_0x01d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.onedelhi.secure.za6 r4 = r11.f11205a
            com.onedelhi.secure.gr6 r4 = r4.mo27871N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo16867R(r6, r3)
            if (r3 != 0) goto L_0x01d7
            goto L_0x01f4
        L_0x01f2:
            r11.f23451a = r0
        L_0x01f4:
            if (r1 == 0) goto L_0x0203
            com.onedelhi.secure.za6 r0 = r11.f11205a
            android.content.Context r0 = r0.mo15137f()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r11.f23452b = r0
            return
        L_0x0203:
            r11.f23452b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z36.mo15848l():void");
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return true;
    }

    @ly4
    /* renamed from: o */
    public final int mo27791o() {
        mo15845i();
        return this.f23452b;
    }

    @ly4
    /* renamed from: p */
    public final int mo27792p() {
        mo15845i();
        return this.f23448a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b5  */
    @com.onedelhi.secure.ly4
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.uy6 mo27793q(java.lang.String r41) {
        /*
            r40 = this;
            r1 = r40
            r40.mo15139h()
            com.onedelhi.secure.uy6 r36 = new com.onedelhi.secure.uy6
            java.lang.String r3 = r40.mo27795s()
            java.lang.String r4 = r40.mo27796t()
            r40.mo15845i()
            java.lang.String r5 = r1.f23454b
            r40.mo15845i()
            int r0 = r1.f23448a
            long r6 = (long) r0
            r40.mo15845i()
            java.lang.String r0 = r1.f23456c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r8 = r1.f23456c
            com.onedelhi.secure.za6 r0 = r1.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            r0.mo14124q()
            r40.mo15845i()
            r40.mo15139h()
            long r9 = r1.f23449a
            r11 = 0
            r2 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.onedelhi.secure.za6 r0 = r1.f11205a
            com.onedelhi.secure.gr6 r9 = r0.mo27871N()
            com.onedelhi.secure.za6 r0 = r1.f11205a
            android.content.Context r0 = r0.mo15137f()
            com.onedelhi.secure.za6 r10 = r1.f11205a
            android.content.Context r10 = r10.mo15137f()
            java.lang.String r10 = r10.getPackageName()
            r9.mo15139h()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.onedelhi.secure.gr6.m16185t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.onedelhi.secure.za6 r0 = r9.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12726r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo25379a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo16872W(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.onedelhi.secure.za6 r10 = r9.f11205a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo15137f()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.onedelhi.secure.gr6.m16184s0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.onedelhi.secure.za6 r0 = r9.f11205a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo25379a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.onedelhi.secure.za6 r9 = r9.f11205a
            com.onedelhi.secure.a56 r9 = r9.mo15136e()
            com.onedelhi.secure.u46 r9 = r9.mo12726r()
            java.lang.String r10 = "Package name not found"
            r9.mo25380b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f23449a = r9
        L_0x00d0:
            r13 = r9
            com.onedelhi.secure.za6 r0 = r1.f11205a
            boolean r0 = r0.mo27884o()
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.q76 r9 = r9.mo27864F()
            boolean r9 = r9.f18955c
            r10 = 1
            r15 = r9 ^ 1
            r40.mo15139h()
            com.onedelhi.secure.za6 r9 = r1.f11205a
            boolean r9 = r9.mo27884o()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0175
        L_0x00f2:
            com.onedelhi.secure.e17.m13492c()
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.ce5 r9 = r9.mo27891z()
            com.onedelhi.secure.k36 r12 = com.onedelhi.secure.n36.f17050c0
            boolean r9 = r9.mo14110B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.a56 r9 = r9.mo15136e()
            com.onedelhi.secure.u46 r9 = r9.mo12730v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo25379a(r12)
            goto L_0x00ee
        L_0x0113:
            com.onedelhi.secure.za6 r9 = r1.f11205a     // Catch:{ ClassNotFoundException -> 0x0173 }
            android.content.Context r9 = r9.mo15137f()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0173 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.String r12 = "getInstance"
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0164 }
            java.lang.Class<android.content.Context> r19 = android.content.Context.class
            r11[r2] = r19     // Catch:{ Exception -> 0x0164 }
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r12, r11)     // Catch:{ Exception -> 0x0164 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0164 }
            com.onedelhi.secure.za6 r10 = r1.f11205a     // Catch:{ Exception -> 0x0164 }
            android.content.Context r10 = r10.mo15137f()     // Catch:{ Exception -> 0x0164 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0164 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0164 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0173
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0175
        L_0x0157:
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.a56 r9 = r9.mo15136e()
            com.onedelhi.secure.u46 r9 = r9.mo12732x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            goto L_0x0170
        L_0x0164:
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.a56 r9 = r9.mo15136e()
            com.onedelhi.secure.u46 r9 = r9.mo12733y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
        L_0x0170:
            r9.mo25379a(r10)
        L_0x0173:
            r20 = 0
        L_0x0175:
            com.onedelhi.secure.za6 r9 = r1.f11205a
            com.onedelhi.secure.q76 r10 = r9.mo27864F()
            com.onedelhi.secure.e76 r10 = r10.f18943a
            long r10 = r10.mo15075a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x018d
            long r9 = r9.f23551b
            r12 = r3
            r22 = r9
            goto L_0x0196
        L_0x018d:
            r12 = r3
            long r2 = r9.f23551b
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0196:
            r40.mo15845i()
            int r11 = r1.f23452b
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.ce5 r2 = r2.mo27891z()
            boolean r24 = r2.mo14109A()
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.q76 r2 = r2.mo27864F()
            r2.mo15139h()
            android.content.SharedPreferences r2 = r2.mo22924o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r40.mo15845i()
            java.lang.String r3 = r1.f23460g
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.ce5 r2 = r2.mo27891z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo14127t(r9)
            if (r2 != 0) goto L_0x01cf
            r26 = 0
            goto L_0x01db
        L_0x01cf:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01db:
            long r9 = r1.f23453b
            java.util.List r2 = r1.f23451a
            r19 = r2
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.q76 r2 = r2.mo27864F()
            com.onedelhi.secure.ye5 r2 = r2.mo22926q()
            java.lang.String r30 = r2.mo27436h()
            java.lang.String r2 = r1.f23458e
            if (r2 != 0) goto L_0x01ff
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            java.lang.String r2 = r2.mo16886q()
            r1.f23458e = r2
        L_0x01ff:
            java.lang.String r2 = r1.f23458e
            com.onedelhi.secure.xz6.m31807c()
            r27 = r2
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.ce5 r2 = r2.mo27891z()
            r28 = r3
            com.onedelhi.secure.k36 r3 = com.onedelhi.secure.n36.f17072n0
            r31 = r9
            r9 = 0
            boolean r2 = r2.mo14110B(r9, r3)
            if (r2 == 0) goto L_0x0250
            r40.mo15139h()
            long r2 = r1.f23455c
            r9 = 0
            int r16 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x0225
            goto L_0x0244
        L_0x0225:
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.google.android.gms.common.util.Clock r2 = r2.mo15133a()
            long r2 = r2.currentTimeMillis()
            long r9 = r1.f23455c
            long r2 = r2 - r9
            java.lang.String r9 = r1.f23461h
            if (r9 == 0) goto L_0x0244
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r29 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r29 <= 0) goto L_0x0244
            java.lang.String r2 = r1.f23462i
            if (r2 != 0) goto L_0x0244
            r40.mo27798v()
        L_0x0244:
            java.lang.String r2 = r1.f23461h
            if (r2 != 0) goto L_0x024b
            r40.mo27798v()
        L_0x024b:
            java.lang.String r2 = r1.f23461h
            r33 = r2
            goto L_0x0252
        L_0x0250:
            r33 = 0
        L_0x0252:
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.ce5 r2 = r2.mo27891z()
            com.onedelhi.secure.za6 r3 = r2.f11205a
            java.lang.String r3 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r2 = r2.mo14127t(r3)
            if (r2 != 0) goto L_0x0265
            r34 = 0
            goto L_0x026b
        L_0x0265:
            boolean r2 = r2.booleanValue()
            r34 = r2
        L_0x026b:
            com.onedelhi.secure.ky6.m20117c()
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.ce5 r2 = r2.mo27891z()
            com.onedelhi.secure.k36 r3 = com.onedelhi.secure.n36.f17017D0
            r9 = 0
            boolean r2 = r2.mo14110B(r9, r3)
            if (r2 == 0) goto L_0x02b5
            com.onedelhi.secure.za6 r2 = r1.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            java.lang.String r3 = r40.mo27795s()
            com.onedelhi.secure.za6 r9 = r2.f11205a     // Catch:{ NameNotFoundException -> 0x029b }
            android.content.Context r9 = r9.mo15137f()     // Catch:{ NameNotFoundException -> 0x029b }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch:{ NameNotFoundException -> 0x029b }
            r10 = 0
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r3, r10)     // Catch:{ NameNotFoundException -> 0x029c }
            if (r9 == 0) goto L_0x02b0
            int r2 = r9.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x029c }
            goto L_0x02b1
        L_0x029b:
            r10 = 0
        L_0x029c:
            com.onedelhi.secure.za6 r9 = r2.f11205a
            r9.mo15137f()
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12726r()
            java.lang.String r9 = "PackageManager failed to find running app: app_id"
            r2.mo25380b(r9, r3)
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            long r2 = (long) r2
            r37 = r2
            goto L_0x02b7
        L_0x02b5:
            r37 = 0
        L_0x02b7:
            r9 = 76003(0x128e3, double:3.75505E-319)
            r17 = 0
            r29 = 0
            r35 = r19
            r39 = r27
            r2 = r36
            r27 = r28
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r41
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r27
            r25 = r26
            r26 = r31
            r28 = r35
            r31 = r39
            r32 = r33
            r33 = r34
            r34 = r37
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (boolean) r33, (long) r34)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z36.mo27793q(java.lang.String):com.onedelhi.secure.uy6");
    }

    @ly4
    /* renamed from: r */
    public final String mo27794r() {
        mo15845i();
        return this.f23460g;
    }

    @ly4
    /* renamed from: s */
    public final String mo27795s() {
        mo15845i();
        Preconditions.checkNotNull(this.f23450a);
        return this.f23450a;
    }

    @ly4
    /* renamed from: t */
    public final String mo27796t() {
        mo15139h();
        mo15845i();
        Preconditions.checkNotNull(this.f23459f);
        return this.f23459f;
    }

    @ly4
    /* renamed from: u */
    public final List mo27797u() {
        return this.f23451a;
    }

    @ly4
    /* renamed from: v */
    public final void mo27798v() {
        String str;
        mo15139h();
        if (!this.f11205a.mo27864F().mo22926q().mo27438i(ne5.ANALYTICS_STORAGE)) {
            this.f11205a.mo15136e().mo12725q().mo25379a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f11205a.mo27871N().mo16892u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        u46 q = this.f11205a.mo15136e().mo12725q();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        q.mo25379a(String.format("Resetting session stitching token to %s", objArr));
        this.f23461h = str;
        this.f23455c = this.f11205a.mo15133a().currentTimeMillis();
    }

    /* renamed from: w */
    public final boolean mo27799w(String str) {
        String str2 = this.f23462i;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f23462i = str;
        return z;
    }
}
