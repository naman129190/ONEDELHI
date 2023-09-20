package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipInputStream;

public class mo2 {

    /* renamed from: a */
    public final Context f16261a;
    @ts2

    /* renamed from: a */
    public final io2 f16262a;

    /* renamed from: a */
    public final String f16263a;

    public mo2(Context context, String str, @ts2 String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f16261a = applicationContext;
        this.f16263a = str;
        if (str2 == null) {
            this.f16262a = null;
        } else {
            this.f16262a = new io2(applicationContext);
        }
    }

    /* renamed from: e */
    public static eb2<la2> m21824e(Context context, String str, @ts2 String str2) {
        return new mo2(context, str, str2).mo20540d();
    }

    @ts2
    @ly4
    /* renamed from: a */
    public final la2 mo20537a() {
        fy2<m21, InputStream> b;
        io2 io2 = this.f16262a;
        if (io2 == null || (b = io2.mo17889b(this.f16263a)) == null) {
            return null;
        }
        m21 m21 = (m21) b.f12385a;
        InputStream inputStream = (InputStream) b.f12386b;
        eb2<la2> B = m21 == m21.ZIP ? na2.m22535B(new ZipInputStream(inputStream), this.f16263a) : na2.m22550k(inputStream, this.f16263a);
        if (B.mo15104b() != null) {
            return B.mo15104b();
        }
        return null;
    }

    @ly4
    /* renamed from: b */
    public final eb2<la2> mo20538b() {
        try {
            return mo20539c();
        } catch (IOException e) {
            return new eb2<>((Throwable) e);
        }
    }

    @ly4
    /* renamed from: c */
    public final eb2<la2> mo20539c() throws IOException {
        p92.m24540a("Fetching " + this.f16263a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f16263a).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    eb2<la2> g = mo20542g(httpURLConnection);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(g.mo15104b() != null);
                    p92.m24540a(sb.toString());
                    httpURLConnection.disconnect();
                    return g;
                }
            }
            String f = mo20541f(httpURLConnection);
            return new eb2<>((Throwable) new IllegalArgumentException("Unable to fetch " + this.f16263a + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + f));
        } catch (Exception e) {
            return new eb2<>((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @ly4
    /* renamed from: d */
    public eb2<la2> mo20540d() {
        la2 a = mo20537a();
        if (a != null) {
            return new eb2<>(a);
        }
        p92.m24540a("Animation for " + this.f16263a + " not found in cache. Fetching from network.");
        return mo20538b();
    }

    /* renamed from: f */
    public final String mo20541f(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @ts2
    /* renamed from: g */
    public final eb2<la2> mo20542g(HttpURLConnection httpURLConnection) throws IOException {
        eb2<la2> eb2;
        m21 m21;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            p92.m24540a("Handling zip response.");
            m21 = m21.ZIP;
            io2 io2 = this.f16262a;
            eb2 = io2 == null ? na2.m22535B(new ZipInputStream(httpURLConnection.getInputStream()), (String) null) : na2.m22535B(new ZipInputStream(new FileInputStream(io2.mo17893g(this.f16263a, httpURLConnection.getInputStream(), m21))), this.f16263a);
        } else {
            p92.m24540a("Received json response.");
            m21 = m21.JSON;
            io2 io22 = this.f16262a;
            eb2 = io22 == null ? na2.m22550k(httpURLConnection.getInputStream(), (String) null) : na2.m22550k(new FileInputStream(new File(io22.mo17893g(this.f16263a, httpURLConnection.getInputStream(), m21).getAbsolutePath())), this.f16263a);
        }
        if (!(this.f16262a == null || eb2.mo15104b() == null)) {
            this.f16262a.mo17892f(this.f16263a, m21);
        }
        return eb2;
    }
}
