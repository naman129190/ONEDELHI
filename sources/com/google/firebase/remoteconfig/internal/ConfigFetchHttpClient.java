package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.internal.C4367b;
import com.google.firebase.remoteconfig.internal.C4370c;
import com.onedelhi.secure.C5052dp;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.n61;
import com.onedelhi.secure.o61;
import com.onedelhi.secure.p61;
import com.onedelhi.secure.s61;
import com.onedelhi.secure.ux2;
import com.onedelhi.secure.vh3;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: a */
    public static final Pattern f25303a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: e */
    public static final String f25304e = "X-Goog-Api-Key";

    /* renamed from: f */
    public static final String f25305f = "ETag";

    /* renamed from: g */
    public static final String f25306g = "If-None-Match";

    /* renamed from: h */
    public static final String f25307h = "X-Android-Package";

    /* renamed from: i */
    public static final String f25308i = "X-Android-Cert";

    /* renamed from: j */
    public static final String f25309j = "X-Google-GFE-Can-Retry";

    /* renamed from: k */
    public static final String f25310k = "X-Goog-Firebase-Installations-Auth";

    /* renamed from: l */
    public static final String f25311l = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: a */
    public final long f25312a;

    /* renamed from: a */
    public final Context f25313a;

    /* renamed from: a */
    public final String f25314a;

    /* renamed from: b */
    public final long f25315b;

    /* renamed from: b */
    public final String f25316b;

    /* renamed from: c */
    public final String f25317c;

    /* renamed from: d */
    public final String f25318d;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f25313a = context;
        this.f25314a = str;
        this.f25316b = str2;
        this.f25317c = m35137f(str);
        this.f25318d = str3;
        this.f25312a = j;
        this.f25315b = j2;
    }

    /* renamed from: e */
    public static C4367b m35136e(JSONObject jSONObject, Date date) throws o61 {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            C4367b.C4369b e = C4367b.m35165j().mo30037e(date);
            String str = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(vh3.C7052c.f36567W);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e = e.mo30035c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(vh3.C7052c.f36568X);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e = e.mo30036d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(vh3.C7052c.f36569Y);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e = e.mo30038f(jSONObject3);
            }
            if (jSONObject.has(vh3.C7052c.f36571a0)) {
                str = jSONObject.getString(vh3.C7052c.f36571a0);
            }
            if (str != null) {
                e.mo30039g(Long.parseLong(str));
            }
            return e.mo30033a();
        } catch (JSONException e2) {
            throw new o61("Fetch failed: fetch response could not be parsed.", (Throwable) e2);
        }
    }

    /* renamed from: f */
    public static String m35137f(String str) {
        Matcher matcher = f25303a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo30001a(JSONObject jSONObject) {
        try {
            return !jSONObject.get(vh3.C7052c.f36570Z).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final String mo30002b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f25311l, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: c */
    public final JSONObject mo30003c(String str, String str2, Map<String, String> map, Long l) throws o61 {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(vh3.C7051b.f36554J, str);
            hashMap.put(vh3.C7051b.f36555K, str2);
            hashMap.put(vh3.C7051b.f36556L, this.f25314a);
            Locale locale = this.f25313a.getResources().getConfiguration().locale;
            hashMap.put(vh3.C7051b.f36557M, locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put(vh3.C7051b.f36558N, locale.toLanguageTag());
            hashMap.put(vh3.C7051b.f36559O, Integer.toString(i));
            hashMap.put(vh3.C7051b.f36560P, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f25313a.getPackageManager().getPackageInfo(this.f25313a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put(vh3.C7051b.f36562R, Long.toString(ux2.m29671c(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(vh3.C7051b.f36563S, this.f25313a.getPackageName());
            hashMap.put(vh3.C7051b.f36564T, C5052dp.f27587c);
            hashMap.put(vh3.C7051b.f36565U, new JSONObject(map));
            if (l != null) {
                hashMap.put(vh3.C7051b.f36566V, mo30002b(l.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new o61("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: d */
    public HttpURLConnection mo30004d() throws p61 {
        try {
            return (HttpURLConnection) new URL(mo30008i(this.f25317c, this.f25318d)).openConnection();
        } catch (IOException e) {
            throw new p61(e.getMessage());
        }
    }

    @Keep
    public C4370c.C4371a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws p61 {
        mo30014o(httpURLConnection, str3, str2, map2);
        try {
            mo30013n(httpURLConnection, mo30003c(str, str2, map, l).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField(f25305f);
                JSONObject h = mo30007h(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                C4367b e = m35136e(h, date);
                return !mo30001a(h) ? C4370c.C4371a.m35210a(date, e) : C4370c.C4371a.m35211b(e, headerField);
            }
            throw new s61(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e2) {
            throw new o61("The client had an error while calling the backend!", e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @hw4
    /* renamed from: g */
    public long mo30006g() {
        return this.f25312a;
    }

    /* renamed from: h */
    public final JSONObject mo30007h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    /* renamed from: i */
    public final String mo30008i(String str, String str2) {
        return String.format(vh3.f36550a, new Object[]{str, str2});
    }

    /* renamed from: j */
    public final String mo30009j() {
        try {
            Context context = this.f25313a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(n61.f32430b, "Could not get fingerprint hash for package: " + this.f25313a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(n61.f32430b, "No such package: " + this.f25313a.getPackageName(), e);
            return null;
        }
    }

    @hw4
    /* renamed from: k */
    public long mo30010k() {
        return this.f25315b;
    }

    /* renamed from: l */
    public final void mo30011l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f25316b);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f25313a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", mo30009j());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: m */
    public final void mo30012m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: n */
    public final void mo30013n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: o */
    public final void mo30014o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f25312a));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f25315b));
        httpURLConnection.setRequestProperty(f25306g, str);
        mo30011l(httpURLConnection, str2);
        mo30012m(httpURLConnection, map);
    }
}
