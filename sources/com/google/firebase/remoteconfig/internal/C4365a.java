package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.C4370c;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.i50;
import com.onedelhi.secure.j50;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.n61;
import com.onedelhi.secure.o61;
import com.onedelhi.secure.p40;
import com.onedelhi.secure.p61;
import com.onedelhi.secure.s61;
import com.onedelhi.secure.u40;
import com.onedelhi.secure.w94;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.remoteconfig.internal.a */
public class C4365a {

    /* renamed from: a */
    public static final int f25319a = 3;

    /* renamed from: a */
    public static final String f25320a = "latestTemplateVersionNumber";

    /* renamed from: b */
    public static final String f25321b = "featureDisabled";

    /* renamed from: a */
    public final C4370c f25322a;

    /* renamed from: a */
    public final j50 f25323a;

    /* renamed from: a */
    public final u40 f25324a;

    /* renamed from: a */
    public final HttpURLConnection f25325a;

    /* renamed from: a */
    public final Random f25326a = new Random();
    @mj1("this")

    /* renamed from: a */
    public final Set<j50> f25327a;

    /* renamed from: a */
    public final ScheduledExecutorService f25328a;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a */
    public class C4366a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f25330b;

        /* renamed from: n */
        public final /* synthetic */ int f25331n;

        public C4366a(int i, long j) {
            this.f25331n = i;
            this.f25330b = j;
        }

        public void run() {
            C4365a.this.mo30017d(this.f25331n, this.f25330b);
        }
    }

    public C4365a(HttpURLConnection httpURLConnection, C4370c cVar, u40 u40, Set<j50> set, j50 j50, ScheduledExecutorService scheduledExecutorService) {
        this.f25325a = httpURLConnection;
        this.f25322a = cVar;
        this.f25324a = u40;
        this.f25327a = set;
        this.f25323a = j50;
        this.f25328a = scheduledExecutorService;
    }

    /* renamed from: e */
    public static Boolean m35152e(C4370c.C4371a aVar, long j) {
        boolean z = false;
        if (aVar.mo30061e() != null) {
            if (aVar.mo30061e().mo30031i() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (aVar.mo30063g() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ w94 m35153h(w94 w94, w94 w942, long j, int i, w94 w943) throws Exception {
        if (!w94.mo17590v()) {
            return ha4.m16571f(new o61("Failed to auto-fetch config update.", (Throwable) w94.mo17585q()));
        }
        if (!w942.mo17590v()) {
            return ha4.m16571f(new o61("Failed to get activated config for auto-fetch", (Throwable) w942.mo17585q()));
        }
        C4370c.C4371a aVar = (C4370c.C4371a) w94.mo17586r();
        C4367b bVar = (C4367b) w942.mo17586r();
        if (!m35152e(aVar, j).booleanValue()) {
            Log.d(n61.f32430b, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            mo30015b(i, j);
            return ha4.m16572g(null);
        } else if (aVar.mo30061e() == null) {
            Log.d(n61.f32430b, "The fetch succeeded, but the backend had no updates.");
            return ha4.m16572g(null);
        } else {
            if (bVar == null) {
                bVar = C4367b.m35165j().mo30033a();
            }
            Set<String> e = bVar.mo30025e(aVar.mo30061e());
            if (e.isEmpty()) {
                Log.d(n61.f32430b, "Config was fetched, but no params changed.");
                return ha4.m16572g(null);
            }
            mo30016c(i50.m51842a(e));
            return ha4.m16572g(null);
        }
    }

    /* renamed from: b */
    public final void mo30015b(int i, long j) {
        if (i == 0) {
            mo30022k(new s61("Unable to fetch the latest version of the template.", p61.C6367a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f25328a.schedule(new C4366a(i, j), (long) this.f25326a.nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: c */
    public final synchronized void mo30016c(i50 i50) {
        for (j50 a : this.f25327a) {
            a.mo30117a(i50);
        }
    }

    @hw4
    /* renamed from: d */
    public synchronized w94<Void> mo30017d(int i, long j) {
        int i2;
        w94<C4370c.C4371a> n;
        w94<C4367b> f;
        i2 = i - 1;
        n = this.f25322a.mo30052n(C4370c.C4373b.REALTIME, 3 - i2);
        f = this.f25324a.mo45384f();
        return ha4.m16576k(n, f).mo17584p(this.f25328a, new p40(this, n, f, j, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r5.has(f25321b) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getBoolean(f25321b) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r9.f25323a.mo30118b(new com.onedelhi.secure.s61("The server is temporarily unavailable. Try again in a few minutes.", com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (mo30019g() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5.has(f25320a) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r6 = r9.f25322a.mo30057s();
        r4 = r5.getLong(f25320a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r4 <= r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        mo30015b(3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30018f(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L_0x0012:
            r4 = r3
        L_0x0013:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L_0x0095
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = r9.mo30021j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x0013
        L_0x003b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007b }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x007b }
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x005b
            boolean r4 = r5.getBoolean(r1)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x005b
            com.onedelhi.secure.j50 r4 = r9.f25323a     // Catch:{ JSONException -> 0x007b }
            com.onedelhi.secure.s61 r5 = new com.onedelhi.secure.s61     // Catch:{ JSONException -> 0x007b }
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.onedelhi.secure.p61$a r7 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x007b }
            r5.<init>((java.lang.String) r6, (com.onedelhi.secure.p61.C6367a) r7)     // Catch:{ JSONException -> 0x007b }
            r4.mo30118b(r5)     // Catch:{ JSONException -> 0x007b }
            goto L_0x0095
        L_0x005b:
            boolean r4 = r9.mo30019g()     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x0062
            goto L_0x0095
        L_0x0062:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x0012
            com.google.firebase.remoteconfig.internal.c r4 = r9.f25322a     // Catch:{ JSONException -> 0x007b }
            long r6 = r4.mo30057s()     // Catch:{ JSONException -> 0x007b }
            long r4 = r5.getLong(r0)     // Catch:{ JSONException -> 0x007b }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0012
            r6 = 3
            r9.mo30015b(r6, r4)     // Catch:{ JSONException -> 0x007b }
            goto L_0x0012
        L_0x007b:
            r4 = move-exception
            com.onedelhi.secure.o61 r5 = new com.onedelhi.secure.o61
            java.lang.Throwable r6 = r4.getCause()
            com.onedelhi.secure.p61$a r7 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.mo30022k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L_0x0012
        L_0x0095:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C4365a.mo30018f(java.io.InputStream):void");
    }

    /* renamed from: g */
    public final synchronized boolean mo30019g() {
        return this.f25327a.isEmpty();
    }

    @hw4
    /* renamed from: i */
    public void mo30020i() {
        HttpURLConnection httpURLConnection = this.f25325a;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                mo30018f(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d(n61.f32430b, "Stream was cancelled due to an exception. Retrying the connection...", e);
            } catch (Throwable th) {
                this.f25325a.disconnect();
                throw th;
            }
            this.f25325a.disconnect();
        }
    }

    /* renamed from: j */
    public final String mo30021j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: k */
    public final synchronized void mo30022k(p61 p61) {
        for (j50 b : this.f25327a) {
            b.mo30118b(p61);
        }
    }
}
