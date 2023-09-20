package com.onedelhi.secure;

import com.delhitransport.onedelhi.receivers.MyApplication;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.onedelhi.secure.w7 */
public final /* synthetic */ class C7143w7 implements Interceptor {

    /* renamed from: a */
    public static final /* synthetic */ C7143w7 f36912a = new C7143w7();

    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(pj0.m61166a(-87208323290951L), MyApplication.m8704c()).addHeader(pj0.m61166a(-87234093094727L), pj0.m61166a(-87281337734983L)).addHeader(pj0.m61166a(-87401596819271L), MyApplication.m8702a()).addHeader(pj0.m61166a(-87461726361415L), MyApplication.m8703b()).build());
    }
}
