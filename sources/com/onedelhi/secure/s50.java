package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/s50;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class s50 implements Interceptor {

    /* renamed from: a */
    public static final s50 f34919a = new s50();

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        jt1.m53777p(chain, "chain");
        hg3 hg3 = (hg3) chain;
        return hg3.m50512b(hg3, 0, hg3.mo37310c().mo34439r(hg3), (Request) null, 0, 0, 0, 61, (Object) null).proceed(hg3.mo37317g());
    }
}
