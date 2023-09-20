package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.onedelhi.secure.C4142zy;
import com.onedelhi.secure.e92;
import com.onedelhi.secure.jo2;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.z82;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.onedelhi.secure.mv */
public final class C2889mv implements wh4 {

    /* renamed from: a */
    public static final String f16353a = "CctTransportBackend";

    /* renamed from: b */
    public static final int f16354b = 30000;

    /* renamed from: b */
    public static final String f16355b = "Accept-Encoding";

    /* renamed from: c */
    public static final int f16356c = 130000;

    /* renamed from: c */
    public static final String f16357c = "Content-Encoding";

    /* renamed from: d */
    public static final int f16358d = -1;

    /* renamed from: d */
    public static final String f16359d = "gzip";

    /* renamed from: e */
    public static final String f16360e = "Content-Type";

    /* renamed from: f */
    public static final String f16361f = "X-Goog-Api-Key";

    /* renamed from: g */
    public static final String f16362g = "application/json";
    @hw4

    /* renamed from: h */
    public static final String f16363h = "net-type";
    @hw4

    /* renamed from: i */
    public static final String f16364i = "mobile-subtype";

    /* renamed from: j */
    public static final String f16365j = "sdk-version";

    /* renamed from: k */
    public static final String f16366k = "model";

    /* renamed from: l */
    public static final String f16367l = "hardware";

    /* renamed from: m */
    public static final String f16368m = "device";

    /* renamed from: n */
    public static final String f16369n = "product";

    /* renamed from: o */
    public static final String f16370o = "os-uild";

    /* renamed from: p */
    public static final String f16371p = "manufacturer";

    /* renamed from: q */
    public static final String f16372q = "fingerprint";

    /* renamed from: r */
    public static final String f16373r = "locale";

    /* renamed from: s */
    public static final String f16374s = "country";

    /* renamed from: t */
    public static final String f16375t = "mcc_mnc";

    /* renamed from: u */
    public static final String f16376u = "tz-offset";

    /* renamed from: v */
    public static final String f16377v = "application_build";

    /* renamed from: a */
    public final int f16378a;

    /* renamed from: a */
    public final Context f16379a;

    /* renamed from: a */
    public final ConnectivityManager f16380a;

    /* renamed from: a */
    public final C2106ez f16381a;

    /* renamed from: a */
    public final od0 f16382a;

    /* renamed from: a */
    public final URL f16383a;

    /* renamed from: b */
    public final C2106ez f16384b;

    /* renamed from: com.onedelhi.secure.mv$a */
    public static final class C2890a {

        /* renamed from: a */
        public final C1982dk f16385a;
        @ts2

        /* renamed from: a */
        public final String f16386a;

        /* renamed from: a */
        public final URL f16387a;

        public C2890a(URL url, C1982dk dkVar, @ts2 String str) {
            this.f16387a = url;
            this.f16385a = dkVar;
            this.f16386a = str;
        }

        /* renamed from: a */
        public C2890a mo20680a(URL url) {
            return new C2890a(url, this.f16385a, this.f16386a);
        }
    }

    /* renamed from: com.onedelhi.secure.mv$b */
    public static final class C2891b {

        /* renamed from: a */
        public final int f16388a;

        /* renamed from: a */
        public final long f16389a;
        @ts2

        /* renamed from: a */
        public final URL f16390a;

        public C2891b(int i, @ts2 URL url, long j) {
            this.f16388a = i;
            this.f16390a = url;
            this.f16389a = j;
        }
    }

    public C2889mv(Context context, C2106ez ezVar, C2106ez ezVar2) {
        this(context, ezVar, ezVar2, f16356c);
    }

    public C2889mv(Context context, C2106ez ezVar, C2106ez ezVar2, int i) {
        this.f16382a = C1982dk.m13171b();
        this.f16379a = context;
        this.f16380a = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16383a = m22028n(C3002nr.f17547d);
        this.f16381a = ezVar2;
        this.f16384b = ezVar;
        this.f16378a = i;
    }

    /* renamed from: f */
    public static int m22021f(NetworkInfo networkInfo) {
        jo2.C2535b bVar;
        if (networkInfo == null) {
            bVar = jo2.C2535b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = jo2.C2535b.COMBINED;
            } else if (jo2.C2535b.m18715a(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.mo18522b();
    }

    /* renamed from: g */
    public static int m22022g(NetworkInfo networkInfo) {
        return networkInfo == null ? jo2.C2536c.NONE.mo18523b() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m22023h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            r92.m26532f(f16353a, "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m22024j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @hw4
    /* renamed from: k */
    public static long m22025k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* renamed from: l */
    public static /* synthetic */ C2890a m22026l(C2890a aVar, C2891b bVar) {
        URL url = bVar.f16390a;
        if (url == null) {
            return null;
        }
        r92.m26529c(f16353a, "Following redirect to: %s", url);
        return aVar.mo20680a(bVar.f16390a);
    }

    /* renamed from: m */
    public static InputStream m22027m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m22028n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C2758li mo20676a(C2631ki kiVar) {
        C1982dk i = mo20679i(kiVar);
        URL url = this.f16383a;
        String str = null;
        if (kiVar.mo19071d() != null) {
            try {
                C3002nr f = C3002nr.m23136f(kiVar.mo19071d());
                if (f.mo21448g() != null) {
                    str = f.mo21448g();
                }
                if (f.mo21449h() != null) {
                    url = m22028n(f.mo21449h());
                }
            } catch (IllegalArgumentException unused) {
                return C2758li.m20708a();
            }
        }
        try {
            C2891b bVar = (C2891b) zl3.m33244a(5, new C2890a(url, i, str), new C5941kv(this), C6058lv.f31850a);
            int i2 = bVar.f16388a;
            if (i2 == 200) {
                return C2758li.m20710e(bVar.f16389a);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    return i2 == 400 ? C2758li.m20709d() : C2758li.m20708a();
                }
            }
            return C2758li.m20711f();
        } catch (IOException e) {
            r92.m26532f(f16353a, "Could not make request to the backend", e);
            return C2758li.m20711f();
        }
    }

    /* renamed from: b */
    public uv0 mo20677b(uv0 uv0) {
        NetworkInfo activeNetworkInfo = this.f16380a.getActiveNetworkInfo();
        return uv0.mo25747n().mo25748a(f16365j, Build.VERSION.SDK_INT).mo25750c(f16366k, Build.MODEL).mo25750c(f16367l, Build.HARDWARE).mo25750c(f16368m, Build.DEVICE).mo25750c(f16369n, Build.PRODUCT).mo25750c(f16370o, Build.ID).mo25750c(f16371p, Build.MANUFACTURER).mo25750c(f16372q, Build.FINGERPRINT).mo25749b(f16376u, m22025k()).mo25748a(f16363h, m22022g(activeNetworkInfo)).mo25748a(f16364i, m22021f(activeNetworkInfo)).mo25750c(f16374s, Locale.getDefault().getCountry()).mo25750c(f16373r, Locale.getDefault().getLanguage()).mo25750c(f16375t, m22024j(this.f16379a).getSimOperator()).mo25750c(f16377v, Integer.toString(m22023h(this.f16379a))).mo25589d();
    }

    /* renamed from: e */
    public final C2891b mo20678e(C2890a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        r92.m26534h(f16353a, "Making request to: %s", aVar.f16387a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f16387a.openConnection();
        httpURLConnection.setConnectTimeout(f16354b);
        httpURLConnection.setReadTimeout(this.f16378a);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(q51.C6513a.f34002v);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.9"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(f16355b, "gzip");
        String str = aVar.f16386a;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f16382a.mo39526a(aVar.f16385a, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                r92.m26534h(f16353a, "Status Code: %d", Integer.valueOf(responseCode));
                r92.m26529c(f16353a, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                r92.m26529c(f16353a, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C2891b(responseCode, new URL(httpURLConnection.getHeaderField(en1.f11293c)), 0);
                }
                if (responseCode != 200) {
                    return new C2891b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m22027m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C2891b bVar = new C2891b(responseCode, (URL) null, f92.m14835b(new BufferedReader(new InputStreamReader(m))).mo14141c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            r92.m26532f(f16353a, "Couldn't open connection, returning with 500", e);
            return new C2891b(500, (URL) null, 0);
        } catch (iu0 | IOException e2) {
            r92.m26532f(f16353a, "Couldn't encode request, returning with 400", e2);
            return new C2891b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: i */
    public final C1982dk mo20679i(C2631ki kiVar) {
        z82.C4049a aVar;
        HashMap hashMap = new HashMap();
        for (uv0 next : kiVar.mo19070c()) {
            String l = next.mo25586l();
            if (!hashMap.containsKey(l)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(l, arrayList);
            } else {
                ((List) hashMap.get(l)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            uv0 uv0 = (uv0) ((List) entry.getValue()).get(0);
            e92.C2036a b = e92.m13627a().mo13701f(y83.DEFAULT).mo13702g(this.f16384b.mo15656a()).mo13703h(this.f16381a.mo15656a()).mo13697b(C4142zy.m33531a().mo24894c(C4142zy.C4144b.ANDROID_FIREBASE).mo24893b(C3365r5.m26316a().mo22439m(Integer.valueOf(uv0.mo25742g(f16365j))).mo22436j(uv0.mo25741b(f16366k)).mo22432f(uv0.mo25741b(f16367l)).mo22430d(uv0.mo25741b(f16368m)).mo22438l(uv0.mo25741b(f16369n)).mo22437k(uv0.mo25741b(f16370o)).mo22434h(uv0.mo25741b(f16371p)).mo22431e(uv0.mo25741b(f16372q)).mo22429c(uv0.mo25741b(f16374s)).mo22433g(uv0.mo25741b(f16373r)).mo22435i(uv0.mo25741b(f16375t)).mo22428b(uv0.mo25741b(f16377v)).mo22427a()).mo24892a());
            try {
                b.mo15089i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo15090j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (uv0 uv02 : (List) entry.getValue()) {
                xt0 e = uv02.mo25582e();
                hu0 b2 = e.mo27088b();
                if (b2.equals(hu0.m16939b("proto"))) {
                    aVar = z82.m32914j(e.mo27087a());
                } else if (b2.equals(hu0.m16939b("json"))) {
                    aVar = z82.m32913i(new String(e.mo27087a(), Charset.forName("UTF-8")));
                } else {
                    r92.m26535i(f16353a, "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo13078c(uv02.mo25584f()).mo13079d(uv02.mo25587m()).mo13083h(uv02.mo25743h(f16376u)).mo13080e(jo2.m18709a().mo14653c(jo2.C2536c.m18717a(uv02.mo25742g(f16363h))).mo14652b(jo2.C2535b.m18715a(uv02.mo25742g(f16364i))).mo14651a());
                if (uv02.mo25581d() != null) {
                    aVar.mo13077b(uv02.mo25581d());
                }
                arrayList3.add(aVar.mo13076a());
            }
            b.mo13698c(arrayList3);
            arrayList2.add(b.mo13696a());
        }
        return C1982dk.m13170a(arrayList2);
    }
}
