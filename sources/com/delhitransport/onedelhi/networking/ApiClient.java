package com.delhitransport.onedelhi.networking;

import com.onedelhi.secure.am3;
import com.onedelhi.secure.ij1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.pm1;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class ApiClient {

    /* renamed from: a */
    public static final am3 f7050a;

    /* renamed from: a */
    public static final pm1 f7051a;

    /* renamed from: a */
    public static final String f7052a = pj0.m61166a(-122117817472839L);

    /* renamed from: a */
    public static final OkHttpClient.Builder f7053a;

    /* renamed from: b */
    public static final am3 f7054b;

    /* renamed from: b */
    public static final String f7055b = pj0.m61166a(-122272436295495L);

    /* renamed from: b */
    public static final OkHttpClient.Builder f7056b;

    /* renamed from: c */
    public static final am3 f7057c;

    /* renamed from: c */
    public static final String f7058c = pj0.m61166a(-122439940020039L);

    /* renamed from: c */
    public static final OkHttpClient.Builder f7059c;

    /* renamed from: d */
    public static final am3 f7060d;

    /* renamed from: d */
    public static final String f7061d = pj0.m61166a(-122620328646471L);

    /* renamed from: d */
    public static final OkHttpClient.Builder f7062d;

    /* renamed from: e */
    public static final am3 f7063e;

    /* renamed from: e */
    public static final String f7064e = pj0.m61166a(-122749177665351L);

    /* renamed from: e */
    public static final OkHttpClient.Builder f7065e;

    /* renamed from: f */
    public static final am3 f7066f;

    /* renamed from: f */
    public static final String f7067f = pj0.m61166a(-122886616618823L);

    /* renamed from: f */
    public static final OkHttpClient.Builder f7068f;

    /* renamed from: g */
    public static final am3 f7069g;

    /* renamed from: g */
    public static final String f7070g = pj0.m61166a(-123006875703111L);

    /* renamed from: g */
    public static final OkHttpClient.Builder f7071g;

    /* renamed from: h */
    public static final am3 f7072h;

    /* renamed from: h */
    public static final String f7073h = pj0.m61166a(-123161494525767L);

    /* renamed from: h */
    public static final OkHttpClient.Builder f7074h;

    /* renamed from: i */
    public static final am3 f7075i;

    /* renamed from: i */
    public static final String f7076i = pj0.m61166a(-123316113348423L);

    /* renamed from: i */
    public static final OkHttpClient.Builder f7077i;

    /* renamed from: com.delhitransport.onedelhi.networking.ApiClient$a */
    public class C1334a implements Interceptor {
        @mr2
        public Response intercept(@mr2 Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().addHeader(pj0.m61166a(-121855824467783L), ApiClient.getEVApiKey().replace(pj0.m61166a(-121842939565895L), pj0.m61166a(-121851529500487L))).build());
        }
    }

    static {
        pm1 g = new pm1().mo42822g(pm1.C6462a.NONE);
        f7051a = g;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectTimeout = builder.readTimeout(60, timeUnit).connectTimeout(60, timeUnit);
        f7053a = connectTimeout;
        f7050a = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-123479322105671L)).mo31036j(connectTimeout.build()).mo31032f();
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().readTimeout(60, timeUnit).connectTimeout(60, timeUnit).retryOnConnectionFailure(true).addInterceptor(g).addInterceptor(C1336b.f7079a);
        f7056b = addInterceptor;
        f7054b = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-123659710732103L)).mo31036j(new OkHttpClient()).mo31036j(addInterceptor.build()).mo31032f();
        OkHttpClient.Builder addInterceptor2 = new OkHttpClient.Builder().readTimeout(60, timeUnit).connectTimeout(60, timeUnit).retryOnConnectionFailure(true).addInterceptor(new C1334a()).addInterceptor(g);
        f7059c = addInterceptor2;
        f7057c = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-123814329554759L)).mo31036j(addInterceptor2.build()).mo31032f();
        OkHttpClient.Builder connectTimeout2 = new OkHttpClient.Builder().readTimeout(60, timeUnit).addInterceptor(g).connectTimeout(60, timeUnit);
        f7062d = connectTimeout2;
        f7060d = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-123943178573639L)).mo31036j(connectTimeout2.build()).mo31032f();
        OkHttpClient.Builder connectTimeout3 = new OkHttpClient.Builder().readTimeout(60, timeUnit).addInterceptor(g).connectTimeout(60, timeUnit);
        f7065e = connectTimeout3;
        f7063e = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-124080617527111L)).mo31036j(connectTimeout3.build()).mo31032f();
        OkHttpClient.Builder retryOnConnectionFailure = new OkHttpClient.Builder().readTimeout(60, timeUnit).connectTimeout(60, timeUnit).addInterceptor(g).retryOnConnectionFailure(true);
        f7068f = retryOnConnectionFailure;
        f7066f = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-124235236349767L)).mo31036j(retryOnConnectionFailure.build()).mo31032f();
        OkHttpClient.Builder addInterceptor3 = new OkHttpClient.Builder().readTimeout(60, timeUnit).connectTimeout(60, timeUnit).retryOnConnectionFailure(true).addNetworkInterceptor(g).addInterceptor(C1337c.f7080a);
        f7071g = addInterceptor3;
        f7069g = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-124355495434055L)).mo31036j(addInterceptor3.build()).mo31032f();
        OkHttpClient.Builder addInterceptor4 = new OkHttpClient.Builder().readTimeout(60, timeUnit).connectTimeout(60, timeUnit).retryOnConnectionFailure(true).addNetworkInterceptor(g).addInterceptor(C1335a.f7078a);
        f7074h = addInterceptor4;
        f7072h = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-124522999158599L)).mo31036j(addInterceptor4.build()).mo31032f();
        OkHttpClient.Builder connectTimeout4 = new OkHttpClient.Builder().addNetworkInterceptor(g).readTimeout(60, timeUnit).connectTimeout(60, timeUnit);
        f7077i = connectTimeout4;
        f7075i = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-124677617981255L)).mo31036j(connectTimeout4.build()).mo31032f();
        System.loadLibrary(pj0.m61166a(-124840826738503L));
    }

    /* renamed from: d */
    public static <S> S m8523d(Class<S> cls) {
        return f7050a.mo31016g(cls);
    }

    /* renamed from: e */
    public static <S> S m8524e(Class<S> cls) {
        return f7075i.mo31016g(cls);
    }

    /* renamed from: f */
    public static <S> S m8525f(Class<S> cls) {
        return f7057c.mo31016g(cls);
    }

    /* renamed from: g */
    public static <S> S m8526g(Class<S> cls) {
        return f7069g.mo31016g(cls);
    }

    public static native String getApiKey();

    public static native String getEVApiKey();

    public static native String getFreshdeskApiKey();

    public static native String getOtpToken();

    /* renamed from: h */
    public static <S> S m8527h(Class<S> cls) {
        return f7066f.mo31016g(cls);
    }

    /* renamed from: i */
    public static <S> S m8528i(Class<S> cls) {
        return f7060d.mo31016g(cls);
    }

    /* renamed from: j */
    public static <S> S m8529j(Class<S> cls) {
        return f7063e.mo31016g(cls);
    }

    /* renamed from: k */
    public static <S> S m8530k(Class<S> cls) {
        return f7072h.mo31016g(cls);
    }

    /* renamed from: l */
    public static <S> S m8531l(Class<S> cls) {
        return f7054b.mo31016g(cls);
    }

    /* renamed from: o */
    public static /* synthetic */ Response m8534o(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        String a = pj0.m61166a(-121898774140743L);
        return chain.proceed(newBuilder.addHeader(a, pj0.m61166a(-121958903682887L) + getOtpToken()).build());
    }
}
