package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

@bc2
@TargetApi(14)
@VisibleForTesting
public final class pi6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ ri6 f18553a;

    public pi6(ri6 ri6) {
        this.f18553a = ri6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ RuntimeException -> 0x00bb, all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[Catch:{ RuntimeException -> 0x00bb, all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3 A[Catch:{ RuntimeException -> 0x00bb, all -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.onedelhi.secure.ri6 r0 = r8.f18553a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r1 = "onActivityCreated"
            r0.mo25379a(r1)     // Catch:{ RuntimeException -> 0x00bb }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 != 0) goto L_0x0023
        L_0x0017:
            com.onedelhi.secure.ri6 r0 = r8.f18553a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.vj6 r0 = r0.mo27868K()
            r0.mo26151y(r9, r10)
            return
        L_0x0023:
            com.onedelhi.secure.uw6.m29665c()     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.ri6 r1 = r8.f18553a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.za6 r1 = r1.f11205a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.ce5 r1 = r1.mo27891z()     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.k36 r2 = com.onedelhi.secure.n36.f17021F0     // Catch:{ RuntimeException -> 0x00bb }
            r3 = 0
            boolean r1 = r1.mo14110B(r3, r2)     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 != 0) goto L_0x003d
            android.net.Uri r3 = r0.getData()     // Catch:{ RuntimeException -> 0x00bb }
        L_0x003b:
            r4 = r3
            goto L_0x0063
        L_0x003d:
            android.net.Uri r1 = r0.getData()     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 == 0) goto L_0x004c
            boolean r2 = r1.isHierarchical()     // Catch:{ RuntimeException -> 0x00bb }
            if (r2 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = r1
            goto L_0x0063
        L_0x004c:
            android.os.Bundle r1 = r0.getExtras()     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 == 0) goto L_0x003b
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ RuntimeException -> 0x00bb }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x00bb }
            if (r2 != 0) goto L_0x003b
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00bb }
            goto L_0x003b
        L_0x0063:
            if (r4 == 0) goto L_0x0017
            boolean r1 = r4.isHierarchical()     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 != 0) goto L_0x006c
            goto L_0x0017
        L_0x006c:
            com.onedelhi.secure.ri6 r1 = r8.f18553a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.za6 r1 = r1.f11205a     // Catch:{ RuntimeException -> 0x00bb }
            r1.mo27871N()     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00bb }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            java.lang.String r0 = "auto"
            goto L_0x0097
        L_0x0095:
            java.lang.String r0 = "gs"
        L_0x0097:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch:{ RuntimeException -> 0x00bb }
            if (r10 != 0) goto L_0x00a3
            r0 = 1
            r3 = 1
            goto L_0x00a5
        L_0x00a3:
            r0 = 0
            r3 = 0
        L_0x00a5:
            com.onedelhi.secure.ri6 r0 = r8.f18553a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()     // Catch:{ RuntimeException -> 0x00bb }
            com.onedelhi.secure.ni6 r7 = new com.onedelhi.secure.ni6     // Catch:{ RuntimeException -> 0x00bb }
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x00bb }
            r0.mo23065z(r7)     // Catch:{ RuntimeException -> 0x00bb }
            goto L_0x0017
        L_0x00b9:
            r0 = move-exception
            goto L_0x00cf
        L_0x00bb:
            r0 = move-exception
            com.onedelhi.secure.ri6 r1 = r8.f18553a     // Catch:{ all -> 0x00b9 }
            com.onedelhi.secure.za6 r1 = r1.f11205a     // Catch:{ all -> 0x00b9 }
            com.onedelhi.secure.a56 r1 = r1.mo15136e()     // Catch:{ all -> 0x00b9 }
            com.onedelhi.secure.u46 r1 = r1.mo12726r()     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.mo25380b(r2, r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x0017
        L_0x00cf:
            com.onedelhi.secure.ri6 r1 = r8.f18553a
            com.onedelhi.secure.za6 r1 = r1.f11205a
            com.onedelhi.secure.vj6 r1 = r1.mo27868K()
            r1.mo26151y(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pi6.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f18553a.f11205a.mo27868K().mo26152z(activity);
    }

    @bc2
    public final void onActivityPaused(Activity activity) {
        this.f18553a.f11205a.mo27868K().mo26139A(activity);
        no6 M = this.f18553a.f11205a.mo27870M();
        M.f11205a.mo15135d().mo23065z(new zn6(M, M.f11205a.mo15133a().elapsedRealtime()));
    }

    @bc2
    public final void onActivityResumed(Activity activity) {
        no6 M = this.f18553a.f11205a.mo27870M();
        M.f11205a.mo15135d().mo23065z(new xn6(M, M.f11205a.mo15133a().elapsedRealtime()));
        this.f18553a.f11205a.mo27868K().mo26140B(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f18553a.f11205a.mo27868K().mo26141C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
