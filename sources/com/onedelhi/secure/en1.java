package com.onedelhi.secure;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onedelhi.secure.pd0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class en1 implements pd0<InputStream> {
    @hw4

    /* renamed from: b */
    public static final C2068b f11291b = new C2067a();

    /* renamed from: b */
    public static final String f11292b = "HttpUrlFetcher";
    @hw4

    /* renamed from: c */
    public static final String f11293c = "Location";

    /* renamed from: o */
    public static final int f11294o = 5;
    @hw4

    /* renamed from: p */
    public static final int f11295p = -1;

    /* renamed from: a */
    public final C2068b f11296a;

    /* renamed from: a */
    public final gh1 f11297a;

    /* renamed from: a */
    public InputStream f11298a;

    /* renamed from: a */
    public HttpURLConnection f11299a;

    /* renamed from: b */
    public volatile boolean f11300b;

    /* renamed from: n */
    public final int f11301n;

    /* renamed from: com.onedelhi.secure.en1$a */
    public static class C2067a implements C2068b {
        /* renamed from: a */
        public HttpURLConnection mo15233a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* renamed from: com.onedelhi.secure.en1$b */
    public interface C2068b {
        /* renamed from: a */
        HttpURLConnection mo15233a(URL url) throws IOException;
    }

    public en1(gh1 gh1, int i) {
        this(gh1, i, f11291b);
    }

    @hw4
    public en1(gh1 gh1, int i, C2068b bVar) {
        this.f11297a = gh1;
        this.f11301n = i;
        this.f11296a = bVar;
    }

    /* renamed from: f */
    public static int m13863f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable(f11292b, 3)) {
                return -1;
            }
            Log.d(f11292b, "Failed to get a response code", e);
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m13864h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    public static boolean m13865i(int i) {
        return i / 100 == 3;
    }

    @mr2
    /* renamed from: a */
    public Class<InputStream> mo14075a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo14569b() {
        InputStream inputStream = this.f11298a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f11299a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f11299a = null;
    }

    /* renamed from: c */
    public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = j92.m18214b();
        try {
            aVar.mo13893f(mo15232j(this.f11297a.mo16581i(), 0, (URL) null, this.f11297a.mo16577e()));
            if (Log.isLoggable(f11292b, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(j92.m18213a(b));
                Log.v(f11292b, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable(f11292b, 3)) {
                Log.d(f11292b, "Failed to load data for url", e);
            }
            aVar.mo13892e(e);
            if (Log.isLoggable(f11292b, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f11292b, 2)) {
                Log.v(f11292b, "Finished http url fetcher fetch in " + j92.m18213a(b));
            }
            throw th;
        }
    }

    public void cancel() {
        this.f11300b = true;
    }

    @mr2
    /* renamed from: d */
    public vd0 mo14572d() {
        return vd0.REMOTE;
    }

    /* renamed from: e */
    public final HttpURLConnection mo15230e(URL url, Map<String, String> map) throws lm1 {
        try {
            HttpURLConnection a = this.f11296a.mo15233a(url);
            for (Map.Entry next : map.entrySet()) {
                a.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            a.setConnectTimeout(this.f11301n);
            a.setReadTimeout(this.f11301n);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new lm1("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: g */
    public final InputStream mo15231g(HttpURLConnection httpURLConnection) throws lm1 {
        InputStream inputStream;
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                inputStream = c70.m12370b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f11292b, 3)) {
                    Log.d(f11292b, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                inputStream = httpURLConnection.getInputStream();
            }
            this.f11298a = inputStream;
            return this.f11298a;
        } catch (IOException e) {
            throw new lm1("Failed to obtain InputStream", m13863f(httpURLConnection), e);
        }
    }

    /* renamed from: j */
    public final InputStream mo15232j(URL url, int i, URL url2, Map<String, String> map) throws lm1 {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new lm1("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection e = mo15230e(url, map);
            this.f11299a = e;
            try {
                e.connect();
                this.f11298a = this.f11299a.getInputStream();
                if (this.f11300b) {
                    return null;
                }
                int f = m13863f(this.f11299a);
                if (m13864h(f)) {
                    return mo15231g(this.f11299a);
                }
                if (m13865i(f)) {
                    String headerField = this.f11299a.getHeaderField(f11293c);
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo14569b();
                            return mo15232j(url3, i + 1, url, map);
                        } catch (MalformedURLException e2) {
                            throw new lm1("Bad redirect url: " + headerField, f, e2);
                        }
                    } else {
                        throw new lm1("Received empty or null redirect url", f);
                    }
                } else if (f == -1) {
                    throw new lm1(f);
                } else {
                    try {
                        throw new lm1(this.f11299a.getResponseMessage(), f);
                    } catch (IOException e3) {
                        throw new lm1("Failed to get a response message", f, e3);
                    }
                }
            } catch (IOException e4) {
                throw new lm1("Failed to connect or obtain data", m13863f(this.f11299a), e4);
            }
        } else {
            throw new lm1("Too many (> 5) redirects!", -1);
        }
    }
}
