package com.delhitransport.onedelhi.networking;

import com.onedelhi.secure.pj0;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.delhitransport.onedelhi.networking.b */
public final /* synthetic */ class C1336b implements Interceptor {

    /* renamed from: a */
    public static final /* synthetic */ C1336b f7079a = new C1336b();

    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(pj0.m61166a(-122074867799879L), ApiClient.getApiKey().replace(pj0.m61166a(-122061982897991L), pj0.m61166a(-122070572832583L))).build());
    }
}
