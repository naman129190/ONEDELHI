package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.onedelhi.secure.C5052dp;
import com.onedelhi.secure.g50;
import com.onedelhi.secure.h60;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.i50;
import com.onedelhi.secure.j50;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n61;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.p61;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.u40;
import com.onedelhi.secure.vh3;
import com.onedelhi.secure.w31;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.e */
public class C4377e {

    /* renamed from: a */
    public static final Pattern f25398a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    @hw4

    /* renamed from: a */
    public static final int[] f25399a = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b */
    public static final String f25400b = "X-Goog-Api-Key";

    /* renamed from: c */
    public static final String f25401c = "X-Android-Package";

    /* renamed from: d */
    public static final String f25402d = "X-Android-Cert";

    /* renamed from: e */
    public static final String f25403e = "X-Google-GFE-Can-Retry";

    /* renamed from: f */
    public static final String f25404f = "X-Goog-Firebase-Installations-Auth";

    /* renamed from: g */
    public static final String f25405g = "X-Accept-Response-Streaming";
    @mj1("this")

    /* renamed from: a */
    public int f25406a;

    /* renamed from: a */
    public final Context f25407a;

    /* renamed from: a */
    public final Clock f25408a;

    /* renamed from: a */
    public final C4370c f25409a;

    /* renamed from: a */
    public final C4374d f25410a;

    /* renamed from: a */
    public final o41 f25411a;

    /* renamed from: a */
    public u40 f25412a;

    /* renamed from: a */
    public final w31 f25413a;

    /* renamed from: a */
    public final String f25414a;

    /* renamed from: a */
    public final Random f25415a;
    @mj1("this")

    /* renamed from: a */
    public final Set<j50> f25416a;

    /* renamed from: a */
    public final ScheduledExecutorService f25417a;
    @mj1("this")

    /* renamed from: a */
    public boolean f25418a;

    /* renamed from: b */
    public final int f25419b = 8;
    @mj1("this")

    /* renamed from: b */
    public boolean f25420b;

    /* renamed from: c */
    public boolean f25421c;

    /* renamed from: com.google.firebase.remoteconfig.internal.e$a */
    public class C4378a implements Runnable {
        public C4378a() {
        }

        public void run() {
            C4377e.this.mo30095d();
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.e$b */
    public class C4379b implements j50 {
        public C4379b() {
        }

        /* renamed from: a */
        public void mo30117a(@mr2 i50 i50) {
        }

        /* renamed from: b */
        public void mo30118b(@mr2 p61 p61) {
            C4377e.this.mo30100i();
            C4377e.this.mo30111v(p61);
        }
    }

    public C4377e(w31 w31, o41 o41, C4370c cVar, u40 u40, Context context, String str, Set<j50> set, C4374d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f25416a = set;
        this.f25418a = false;
        this.f25417a = scheduledExecutorService;
        this.f25415a = new Random();
        this.f25406a = Math.max(8 - dVar.mo30074j().mo30089b(), 1);
        this.f25408a = DefaultClock.getInstance();
        this.f25413a = w31;
        this.f25409a = cVar;
        this.f25411a = o41;
        this.f25412a = u40;
        this.f25407a = context;
        this.f25414a = str;
        this.f25410a = dVar;
        this.f25420b = false;
        this.f25421c = false;
    }

    /* renamed from: j */
    public static String m35246j(String str) {
        Matcher matcher = f25398a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: A */
    public void mo30090A(boolean z) {
        this.f25421c = z;
    }

    /* renamed from: B */
    public final void mo30091B(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setRequestMethod(q51.C6513a.f34002v);
        byte[] bytes = mo30099h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: C */
    public synchronized C4365a mo30092C(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new C4365a(httpURLConnection2, this.f25409a, this.f25412a, this.f25416a, new C4379b(), this.f25417a);
    }

    /* renamed from: D */
    public void mo30093D() {
        mo30109t(0);
    }

    /* renamed from: E */
    public final void mo30094E(Date date) {
        int b = this.f25410a.mo30074j().mo30089b() + 1;
        this.f25410a.mo30082r(b, new Date(date.getTime() + mo30105o(b)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167  */
    @android.annotation.SuppressLint({"VisibleForTests", "DefaultLocale"})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30095d() {
        /*
            r13 = this;
            java.lang.String r0 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            boolean r1 = r13.mo30096e()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.firebase.remoteconfig.internal.d r1 = r13.f25410a
            com.google.firebase.remoteconfig.internal.d$b r1 = r1.mo30074j()
            java.util.Date r2 = new java.util.Date
            com.google.android.gms.common.util.Clock r3 = r13.f25408a
            long r3 = r3.currentTimeMillis()
            r2.<init>(r3)
            java.util.Date r1 = r1.mo30088a()
            boolean r1 = r2.before(r1)
            if (r1 == 0) goto L_0x0028
            r13.mo30113x()
            return
        L_0x0028:
            r1 = 1
            r13.mo30115z(r1)
            r2 = 0
            r3 = 403(0x193, float:5.65E-43)
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 0
            java.net.HttpURLConnection r6 = r13.mo30098g()     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            int r7 = r2.intValue()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            if (r7 != r4) goto L_0x0053
            r13.mo30112w()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            com.google.firebase.remoteconfig.internal.d r7 = r13.f25410a     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            r7.mo30076l()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            com.google.firebase.remoteconfig.internal.a r7 = r13.mo30092C(r6)     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            r7.mo30020i()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
        L_0x0053:
            r13.mo30097f(r6)
            r13.mo30115z(r5)
            int r7 = r2.intValue()
            boolean r7 = r13.mo30108r(r7)
            if (r7 == 0) goto L_0x0065
            r7 = 1
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r7 == 0) goto L_0x0076
            java.util.Date r8 = new java.util.Date
            com.google.android.gms.common.util.Clock r9 = r13.f25408a
            long r9 = r9.currentTimeMillis()
            r8.<init>(r9)
            r13.mo30094E(r8)
        L_0x0076:
            if (r7 != 0) goto L_0x00a5
            int r7 = r2.intValue()
            if (r7 != r4) goto L_0x007f
            goto L_0x00a5
        L_0x007f:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r2.intValue()
            if (r1 != r3) goto L_0x0095
            java.io.InputStream r0 = r6.getErrorStream()
            java.lang.String r0 = r13.mo30110u(r0)
        L_0x0095:
            com.onedelhi.secure.s61 r1 = new com.onedelhi.secure.s61
            int r2 = r2.intValue()
            com.onedelhi.secure.p61$a r3 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.onedelhi.secure.p61.C6367a) r3)
        L_0x00a0:
            r13.mo30111v(r1)
            goto L_0x0112
        L_0x00a5:
            r13.mo30113x()
            goto L_0x0112
        L_0x00aa:
            r7 = move-exception
            r12 = r6
            r6 = r2
            r2 = r12
            goto L_0x0114
        L_0x00b0:
            r7 = move-exception
            r12 = r6
            r6 = r2
            r2 = r12
            goto L_0x00ba
        L_0x00b5:
            r7 = move-exception
            r6 = r2
            goto L_0x0114
        L_0x00b8:
            r7 = move-exception
            r6 = r2
        L_0x00ba:
            java.lang.String r8 = "FirebaseRemoteConfig"
            java.lang.String r9 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r8, r9, r7)     // Catch:{ all -> 0x0113 }
            r13.mo30097f(r2)
            r13.mo30115z(r5)
            if (r6 == 0) goto L_0x00d6
            int r7 = r6.intValue()
            boolean r7 = r13.mo30108r(r7)
            if (r7 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r7 = 0
            goto L_0x00d7
        L_0x00d6:
            r7 = 1
        L_0x00d7:
            if (r7 == 0) goto L_0x00e7
            java.util.Date r8 = new java.util.Date
            com.google.android.gms.common.util.Clock r9 = r13.f25408a
            long r9 = r9.currentTimeMillis()
            r8.<init>(r9)
            r13.mo30094E(r8)
        L_0x00e7:
            if (r7 != 0) goto L_0x00a5
            int r7 = r6.intValue()
            if (r7 != r4) goto L_0x00f0
            goto L_0x00a5
        L_0x00f0:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r6
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r6.intValue()
            if (r1 != r3) goto L_0x0106
            java.io.InputStream r0 = r2.getErrorStream()
            java.lang.String r0 = r13.mo30110u(r0)
        L_0x0106:
            com.onedelhi.secure.s61 r1 = new com.onedelhi.secure.s61
            int r2 = r6.intValue()
            com.onedelhi.secure.p61$a r3 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.onedelhi.secure.p61.C6367a) r3)
            goto L_0x00a0
        L_0x0112:
            return
        L_0x0113:
            r7 = move-exception
        L_0x0114:
            r13.mo30097f(r2)
            r13.mo30115z(r5)
            if (r6 == 0) goto L_0x0129
            int r8 = r6.intValue()
            boolean r8 = r13.mo30108r(r8)
            if (r8 == 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r8 = 0
            goto L_0x012a
        L_0x0129:
            r8 = 1
        L_0x012a:
            if (r8 == 0) goto L_0x013a
            java.util.Date r9 = new java.util.Date
            com.google.android.gms.common.util.Clock r10 = r13.f25408a
            long r10 = r10.currentTimeMillis()
            r9.<init>(r10)
            r13.mo30094E(r9)
        L_0x013a:
            if (r8 != 0) goto L_0x0167
            int r8 = r6.intValue()
            if (r8 == r4) goto L_0x0167
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r6
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r6.intValue()
            if (r1 != r3) goto L_0x0158
            java.io.InputStream r0 = r2.getErrorStream()
            java.lang.String r0 = r13.mo30110u(r0)
        L_0x0158:
            com.onedelhi.secure.s61 r1 = new com.onedelhi.secure.s61
            int r2 = r6.intValue()
            com.onedelhi.secure.p61$a r3 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.onedelhi.secure.p61.C6367a) r3)
            r13.mo30111v(r1)
            goto L_0x016a
        L_0x0167:
            r13.mo30113x()
        L_0x016a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C4377e.mo30095d():void");
    }

    /* renamed from: e */
    public final synchronized boolean mo30096e() {
        return !this.f25416a.isEmpty() && !this.f25418a && !this.f25420b && !this.f25421c;
    }

    /* renamed from: f */
    public void mo30097f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: g */
    public HttpURLConnection mo30098g() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) mo30107q().openConnection();
        mo30114y(httpURLConnection);
        mo30091B(httpURLConnection);
        return httpURLConnection;
    }

    /* renamed from: h */
    public final JSONObject mo30099h() {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m35246j(this.f25413a.mo46529s().mo37192j()));
        hashMap.put("namespace", this.f25414a);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f25409a.mo30057s()));
        hashMap.put(vh3.C7051b.f36556L, this.f25413a.mo46529s().mo37192j());
        hashMap.put(vh3.C7051b.f36564T, C5052dp.f27587c);
        return new JSONObject(hashMap);
    }

    /* renamed from: i */
    public final synchronized void mo30100i() {
        this.f25420b = true;
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: k */
    public Date mo30101k() {
        return this.f25410a.mo30074j().mo30088a();
    }

    /* renamed from: l */
    public final String mo30102l() {
        try {
            Context context = this.f25407a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(n61.f32430b, "Could not get fingerprint hash for package: " + this.f25407a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(n61.f32430b, "No such package: " + this.f25407a.getPackageName());
            return null;
        }
    }

    /* renamed from: m */
    public final void mo30103m(HttpURLConnection httpURLConnection) {
        this.f25411a.mo40942c(false).mo17592x(this.f25417a, new g50(httpURLConnection));
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: n */
    public int mo30104n() {
        return this.f25410a.mo30074j().mo30089b();
    }

    /* renamed from: o */
    public final long mo30105o(int i) {
        int[] iArr = f25399a;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i - 1]);
        return (millis / 2) + ((long) this.f25415a.nextInt((int) millis));
    }

    /* renamed from: p */
    public final String mo30106p(String str) {
        return String.format(vh3.f36551b, new Object[]{m35246j(this.f25413a.mo46529s().mo37192j()), str});
    }

    /* renamed from: q */
    public final URL mo30107q() {
        try {
            return new URL(mo30106p(this.f25414a));
        } catch (MalformedURLException unused) {
            Log.e(n61.f32430b, "URL is malformed");
            return null;
        }
    }

    /* renamed from: r */
    public final boolean mo30108r(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30109t(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mo30096e()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f25406a     // Catch:{ all -> 0x0030 }
            if (r0 <= 0) goto L_0x001e
            int r0 = r0 + -1
            r3.f25406a = r0     // Catch:{ all -> 0x0030 }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f25417a     // Catch:{ all -> 0x0030 }
            com.google.firebase.remoteconfig.internal.e$a r1 = new com.google.firebase.remoteconfig.internal.e$a     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0030 }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        L_0x001e:
            boolean r4 = r3.f25421c     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x002e
            com.onedelhi.secure.o61 r4 = new com.onedelhi.secure.o61     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            com.onedelhi.secure.p61$a r0 = com.onedelhi.secure.p61.C6367a.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x0030 }
            r4.<init>((java.lang.String) r5, (com.onedelhi.secure.p61.C6367a) r0)     // Catch:{ all -> 0x0030 }
            r3.mo30111v(r4)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C4377e.mo30109t(long):void");
    }

    /* renamed from: u */
    public final String mo30110u(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* renamed from: v */
    public final synchronized void mo30111v(p61 p61) {
        for (j50 b : this.f25416a) {
            b.mo30118b(p61);
        }
    }

    /* renamed from: w */
    public final synchronized void mo30112w() {
        this.f25406a = 8;
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: x */
    public synchronized void mo30113x() {
        mo30109t(Math.max(0, this.f25410a.mo30074j().mo30088a().getTime() - new Date(this.f25408a.currentTimeMillis()).getTime()));
    }

    /* renamed from: y */
    public final void mo30114y(HttpURLConnection httpURLConnection) {
        mo30103m(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f25413a.mo46529s().mo37191i());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f25407a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", mo30102l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty(f25405g, h60.f29487F);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: z */
    public final synchronized void mo30115z(boolean z) {
        this.f25418a = z;
    }
}
