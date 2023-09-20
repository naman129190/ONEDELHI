package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/dj3;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "a", "Lokhttp3/HttpUrl;", "url", "c", "", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class dj3 {

    /* renamed from: a */
    public static final dj3 f27476a = new dj3();

    @vr2
    /* renamed from: a */
    public final String mo34475a(@vr2 Request request, @vr2 Proxy.Type type) {
        jt1.m53777p(request, "request");
        jt1.m53777p(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        dj3 dj3 = f27476a;
        boolean b = dj3.mo34476b(request, type);
        HttpUrl url = request.url();
        if (b) {
            sb.append(url);
        } else {
            sb.append(dj3.mo34477c(url));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public final boolean mo34476b(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    @vr2
    /* renamed from: c */
    public final String mo34477c(@vr2 HttpUrl httpUrl) {
        jt1.m53777p(httpUrl, ImagesContract.URL);
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        return encodedPath + '?' + encodedQuery;
    }
}
