package com.onedelhi.secure;

import com.onedelhi.secure.am3;
import com.onedelhi.secure.pm1;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* renamed from: com.onedelhi.secure.x7 */
public class C3901x7 {

    /* renamed from: a */
    public static final am3 f22454a;

    /* renamed from: a */
    public static pm1 f22455a = new pm1().mo42822g(pm1.C6462a.BODY);

    /* renamed from: a */
    public static final String f22456a = pj0.m61166a(-87517560936263L);

    /* renamed from: a */
    public static final OkHttpClient.Builder f22457a;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectTimeout = builder.readTimeout(60, timeUnit).addInterceptor(f22455a).addInterceptor(C7143w7.f36912a).connectTimeout(60, timeUnit);
        f22457a = connectTimeout;
        f22454a = new am3.C4574b().mo31028b(ij1.m52310f()).mo31029c(pj0.m61166a(-87620640151367L)).mo31036j(connectTimeout.build()).mo31032f();
    }

    /* renamed from: b */
    public static <S> S m31309b(Class<S> cls) {
        return f22454a.mo31016g(cls);
    }
}
