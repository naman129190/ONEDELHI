package com.delhitransport.onedelhi.networking;

import com.onedelhi.secure.pj0;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.delhitransport.onedelhi.networking.c */
public final /* synthetic */ class C1337c implements Interceptor {

    /* renamed from: a */
    public static final /* synthetic */ C1337c f7080a = new C1337c();

    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(pj0.m61166a(-122001853355847L), Credentials.basic(ApiClient.getFreshdeskApiKey(), pj0.m61166a(-121993263421255L))).build());
    }
}
