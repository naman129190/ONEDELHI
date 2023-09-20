package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¨\u0006 "}, d2 = {"", "currentTimeMillis", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "f", "cookie", "", "forObsoleteRfc2965", "e", "Lokhttp3/Headers$Builder;", "builder", "line", "a", "name", "value", "b", "Lokhttp3/Cache;", "cache", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "d", "Lokhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lcom/onedelhi/secure/un4;", "c", "okhttp"}, k = 2, mv = {1, 4, 0})
@uw1(name = "Internal")
public final class ws1 {
    @vr2
    /* renamed from: a */
    public static final Headers.Builder m69612a(@vr2 Headers.Builder builder, @vr2 String str) {
        jt1.m53777p(builder, "builder");
        jt1.m53777p(str, "line");
        return builder.addLenient$okhttp(str);
    }

    @vr2
    /* renamed from: b */
    public static final Headers.Builder m69613b(@vr2 Headers.Builder builder, @vr2 String str, @vr2 String str2) {
        jt1.m53777p(builder, "builder");
        jt1.m53777p(str, "name");
        jt1.m53777p(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }

    /* renamed from: c */
    public static final void m69614c(@vr2 ConnectionSpec connectionSpec, @vr2 SSLSocket sSLSocket, boolean z) {
        jt1.m53777p(connectionSpec, "connectionSpec");
        jt1.m53777p(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    @ss2
    /* renamed from: d */
    public static final Response m69615d(@vr2 Cache cache, @vr2 Request request) {
        jt1.m53777p(cache, "cache");
        jt1.m53777p(request, "request");
        return cache.get$okhttp(request);
    }

    @vr2
    /* renamed from: e */
    public static final String m69616e(@vr2 Cookie cookie, boolean z) {
        jt1.m53777p(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    @ss2
    /* renamed from: f */
    public static final Cookie m69617f(long j, @vr2 HttpUrl httpUrl, @vr2 String str) {
        jt1.m53777p(httpUrl, ImagesContract.URL);
        jt1.m53777p(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }
}
