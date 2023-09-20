package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.jr1;
import com.onedelhi.secure.kf4;
import com.onedelhi.secure.p41;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.vh3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class h41 {

    /* renamed from: a */
    public static final int f29419a = 32768;

    /* renamed from: a */
    public static final String f29420a = "firebaseinstallations.googleapis.com";

    /* renamed from: a */
    public static final Charset f29421a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static final Pattern f29422a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    public static final int f29423b = 32769;

    /* renamed from: b */
    public static final String f29424b = "projects/%s/installations";

    /* renamed from: c */
    public static final int f29425c = 32770;

    /* renamed from: c */
    public static final String f29426c = "projects/%s/installations/%s/authTokens:generate";

    /* renamed from: d */
    public static final int f29427d = 32771;

    /* renamed from: d */
    public static final String f29428d = "projects/%s/installations/%s";

    /* renamed from: e */
    public static final int f29429e = 10000;

    /* renamed from: e */
    public static final String f29430e = "v1";

    /* renamed from: f */
    public static final int f29431f = 1;

    /* renamed from: f */
    public static final String f29432f = "FIS_v2";

    /* renamed from: g */
    public static final String f29433g = "Content-Type";

    /* renamed from: h */
    public static final String f29434h = "Accept";

    /* renamed from: i */
    public static final String f29435i = "application/json";

    /* renamed from: j */
    public static final String f29436j = "Content-Encoding";

    /* renamed from: k */
    public static final String f29437k = "gzip";

    /* renamed from: l */
    public static final String f29438l = "Cache-Control";

    /* renamed from: m */
    public static final String f29439m = "no-cache";

    /* renamed from: n */
    public static final String f29440n = "fire-installations-id";

    /* renamed from: o */
    public static final String f29441o = "x-firebase-client";

    /* renamed from: p */
    public static final String f29442p = "X-Android-Package";

    /* renamed from: q */
    public static final String f29443q = "X-Android-Cert";

    /* renamed from: r */
    public static final String f29444r = "x-goog-fis-android-iid-migration-auth";

    /* renamed from: s */
    public static final String f29445s = "x-goog-api-key";

    /* renamed from: t */
    public static final String f29446t = "a:";

    /* renamed from: u */
    public static final String f29447u = "Firebase-Installations";
    @VisibleForTesting

    /* renamed from: v */
    public static final String f29448v = "Invalid Expiration Timestamp.";

    /* renamed from: a */
    public final Context f29449a;

    /* renamed from: a */
    public final b73<al1> f29450a;

    /* renamed from: a */
    public final cj3 f29451a = new cj3();

    /* renamed from: a */
    public boolean f29452a;

    public h41(@mr2 Context context, @mr2 b73<al1> b73) {
        this.f29449a = context;
        this.f29450a = b73;
    }

    /* renamed from: a */
    public static String m50205a(@ts2 String str, @mr2 String str2, @mr2 String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m50206b(@ts2 String str, @mr2 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(vh3.C7051b.f36556L, str2);
            jSONObject.put("authVersion", f29432f);
            jSONObject.put(vh3.C7051b.f36564T, "a:17.1.3");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m50207c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(vh3.C7051b.f36564T, "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public static byte[] m50208i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: j */
    public static boolean m50209j(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: k */
    public static void m50210k() {
        Log.e(f29447u, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: l */
    public static void m50211l(HttpURLConnection httpURLConnection, @ts2 String str, @mr2 String str2, @mr2 String str3) {
        String p = m50213p(httpURLConnection);
        if (!TextUtils.isEmpty(p)) {
            Log.w(f29447u, p);
            Log.w(f29447u, m50205a(str, str2, str3));
        }
    }

    @VisibleForTesting
    /* renamed from: n */
    public static long m50212n(String str) {
        Preconditions.checkArgument(f29422a.matcher(str).matches(), f29448v);
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @com.onedelhi.secure.ts2
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m50213p(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f29421a
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h41.m50213p(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: t */
    public static void m50214t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @mr2
    /* renamed from: d */
    public jr1 mo37175d(@mr2 String str, @ts2 String str2, @mr2 String str3, @mr2 String str4, @ts2 String str5) throws p41 {
        jr1 o;
        if (this.f29451a.mo32401b()) {
            int i = 0;
            URL h = mo37179h(String.format(f29424b, new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(f29423b);
                HttpURLConnection m = mo37180m(h, str);
                try {
                    m.setRequestMethod(q51.C6513a.f34002v);
                    m.setDoOutput(true);
                    if (str5 != null) {
                        m.addRequestProperty(f29444r, str5);
                    }
                    mo37183r(m, str2, str4);
                    int responseCode = m.getResponseCode();
                    this.f29451a.mo32403f(responseCode);
                    if (m50209j(responseCode)) {
                        o = mo37181o(m);
                    } else {
                        m50211l(m, str4, str, str3);
                        if (responseCode == 429) {
                            throw new p41("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", p41.C6364a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m50210k();
                            o = jr1.m53698a().mo38823e(jr1.C5843b.BAD_CONFIG).mo38819a();
                        } else {
                            m.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return o;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
        }
        throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
    }

    @mr2
    /* renamed from: e */
    public void mo37176e(@mr2 String str, @mr2 String str2, @mr2 String str3, @mr2 String str4) throws p41 {
        int i = 0;
        URL h = mo37179h(String.format(f29428d, new Object[]{str3, str2}));
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(f29425c);
            HttpURLConnection m = mo37180m(h, str);
            try {
                m.setRequestMethod(q51.C6513a.f34003w);
                m.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = m.getResponseCode();
                if (!(responseCode == 200 || responseCode == 401)) {
                    if (responseCode != 404) {
                        m50211l(m, (String) null, str, str3);
                        if (responseCode == 429) {
                            continue;
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m50210k();
                            throw new p41("Bad config while trying to delete FID", p41.C6364a.BAD_CONFIG);
                        }
                        i++;
                        m.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th) {
                m.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
    }

    @mr2
    /* renamed from: f */
    public kf4 mo37177f(@mr2 String str, @mr2 String str2, @mr2 String str3, @mr2 String str4) throws p41 {
        kf4 q;
        kf4.C5898a b;
        if (this.f29451a.mo32401b()) {
            int i = 0;
            URL h = mo37179h(String.format(f29426c, new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(f29427d);
                HttpURLConnection m = mo37180m(h, str);
                try {
                    m.setRequestMethod(q51.C6513a.f34002v);
                    m.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m.setDoOutput(true);
                    mo37184s(m);
                    int responseCode = m.getResponseCode();
                    this.f29451a.mo32403f(responseCode);
                    if (m50209j(responseCode)) {
                        q = mo37182q(m);
                    } else {
                        m50211l(m, (String) null, str, str3);
                        if (responseCode == 401) {
                            b = kf4.m54387a().mo39239b(kf4.C5899b.AUTH_ERROR);
                        } else if (responseCode == 404) {
                            b = kf4.m54387a().mo39239b(kf4.C5899b.AUTH_ERROR);
                        } else if (responseCode == 429) {
                            throw new p41("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", p41.C6364a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m50210k();
                            b = kf4.m54387a().mo39239b(kf4.C5899b.BAD_CONFIG);
                        } else {
                            m.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                        q = b.mo39238a();
                    }
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return q;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
        }
        throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
    }

    /* renamed from: g */
    public final String mo37178g() {
        try {
            Context context = this.f29449a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f29449a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f29449a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: h */
    public final URL mo37179h(String str) throws p41 {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{f29420a, f29430e, str}));
        } catch (MalformedURLException e) {
            throw new p41(e.getMessage(), p41.C6364a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    public final HttpURLConnection mo37180m(URL url, String str) throws p41 {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty(f29438l, f29439m);
            httpURLConnection.addRequestProperty("X-Android-Package", this.f29449a.getPackageName());
            al1 al1 = this.f29450a.get();
            if (al1 != null) {
                try {
                    httpURLConnection.addRequestProperty(f29441o, (String) ha4.m16566a(al1.mo30968a()));
                } catch (ExecutionException e) {
                    e = e;
                } catch (InterruptedException e2) {
                    e = e2;
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", mo37178g());
            httpURLConnection.addRequestProperty(f29445s, str);
            return httpURLConnection;
            Log.w("ContentValues", "Failed to get heartbeats header", e);
            httpURLConnection.addRequestProperty("X-Android-Cert", mo37178g());
            httpURLConnection.addRequestProperty(f29445s, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
        }
    }

    /* renamed from: o */
    public final jr1 mo37181o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f29421a));
        kf4.C5898a a = kf4.m54387a();
        jr1.C5842a a2 = jr1.m53698a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo38824f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo38821c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo38822d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo39240c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo39241d(m50212n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo38820b(a.mo39238a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo38823e(jr1.C5843b.OK).mo38819a();
    }

    /* renamed from: q */
    public final kf4 mo37182q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f29421a));
        kf4.C5898a a = kf4.m54387a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo39240c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo39241d(m50212n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo39239b(kf4.C5899b.OK).mo39238a();
    }

    /* renamed from: r */
    public final void mo37183r(HttpURLConnection httpURLConnection, @ts2 String str, @mr2 String str2) throws IOException {
        m50214t(httpURLConnection, m50208i(m50206b(str, str2)));
    }

    /* renamed from: s */
    public final void mo37184s(HttpURLConnection httpURLConnection) throws IOException {
        m50214t(httpURLConnection, m50208i(m50207c()));
    }
}
