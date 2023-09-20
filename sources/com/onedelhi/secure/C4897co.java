package com.onedelhi.secure;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/co;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "Lokhttp3/Cookie;", "cookies", "", "a", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.co */
public final class C4897co implements Interceptor {

    /* renamed from: a */
    public final CookieJar f27007a;

    public C4897co(@vr2 CookieJar cookieJar) {
        jt1.m53777p(cookieJar, "cookieJar");
        this.f27007a = cookieJar;
    }

    /* renamed from: a */
    public final String mo33892a(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                s00.m64055X();
            }
            Cookie cookie = (Cookie) next;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
            i = i2;
        }
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        ResponseBody body;
        jt1.m53777p(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body2 = request.body();
        if (body2 != null) {
            MediaType contentType = body2.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", String.valueOf(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        boolean z = false;
        if (request.header("Host") == null) {
            newBuilder.header("Host", nq4.m58694c0(request.url(), false, 1, (Object) null));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header(C2889mv.f16355b) == null && request.header("Range") == null) {
            newBuilder.header(C2889mv.f16355b, "gzip");
            z = true;
        }
        List<Cookie> loadForRequest = this.f27007a.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header("Cookie", mo33892a(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", nq4.f32736b);
        }
        Response proceed = chain.proceed(newBuilder.build());
        om1.m59478g(this.f27007a, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z && t54.m65410K1("gzip", Response.header$default(proceed, "Content-Encoding", (String) null, 2, (Object) null), true) && om1.m59474c(proceed) && (body = proceed.body()) != null) {
            tj1 tj1 = new tj1(body.source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new ig3(Response.header$default(proceed, "Content-Type", (String) null, 2, (Object) null), -1, gu2.m49835d(tj1)));
        }
        return request2.build();
    }
}
