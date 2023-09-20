package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ey2;
import com.onedelhi.secure.h41;
import com.onedelhi.secure.id2;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.qm1;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t54;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.xj0;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, mo38105d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class Request {
    @ss2
    private final RequestBody body;
    @vr2
    private final Headers headers;
    private CacheControl lazyCacheControl;
    @vr2
    private final String method;
    @vr2
    private final Map<Class<?>, Object> tags;
    @vr2
    private final HttpUrl url;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, mo38105d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", "value", "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static class Builder {
        @ss2
        private RequestBody body;
        @vr2
        private Headers.Builder headers;
        @vr2
        private String method;
        @vr2
        private Map<Class<?>, Object> tags;
        @ss2
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(@vr2 Request request) {
            jt1.m53777p(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp().isEmpty() ? new LinkedHashMap<>() : id2.m52106J0(request.getTags$okhttp());
            this.headers = request.headers().newBuilder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = nq4.f32732a;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @vr2
        public Builder addHeader(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @vr2
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, nq4.m58698e0(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @vr2
        public Builder cacheControl(@vr2 CacheControl cacheControl) {
            jt1.m53777p(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader(h41.f29438l) : header(h41.f29438l, cacheControl2);
        }

        @vw1
        @vr2
        public final Builder delete() {
            return delete$default(this, (RequestBody) null, 1, (Object) null);
        }

        @vw1
        @vr2
        public Builder delete(@ss2 RequestBody requestBody) {
            return method(q51.C6513a.f34003w, requestBody);
        }

        @vr2
        public Builder get() {
            return method("GET", (RequestBody) null);
        }

        @ss2
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @vr2
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @vr2
        public final String getMethod$okhttp() {
            return this.method;
        }

        @vr2
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @ss2
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @vr2
        public Builder head() {
            return method(q51.C6513a.f34004x, (RequestBody) null);
        }

        @vr2
        public Builder header(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        @vr2
        public Builder headers(@vr2 Headers headers2) {
            jt1.m53777p(headers2, "headers");
            this.headers = headers2.newBuilder();
            return this;
        }

        @vr2
        public Builder method(@vr2 String str, @ss2 RequestBody requestBody) {
            jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (!(true ^ qm1.m63084e(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!qm1.m63083b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @vr2
        public Builder patch(@vr2 RequestBody requestBody) {
            jt1.m53777p(requestBody, "body");
            return method(q51.C6513a.f34005y, requestBody);
        }

        @vr2
        public Builder post(@vr2 RequestBody requestBody) {
            jt1.m53777p(requestBody, "body");
            return method(q51.C6513a.f34002v, requestBody);
        }

        @vr2
        public Builder put(@vr2 RequestBody requestBody) {
            jt1.m53777p(requestBody, "body");
            return method(q51.C6513a.f34001u, requestBody);
        }

        @vr2
        public Builder removeHeader(@vr2 String str) {
            jt1.m53777p(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@ss2 RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@vr2 Headers.Builder builder) {
            jt1.m53777p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@vr2 String str) {
            jt1.m53777p(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@vr2 Map<Class<?>, Object> map) {
            jt1.m53777p(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@ss2 HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @vr2
        public <T> Builder tag(@vr2 Class<? super T> cls, @ss2 T t) {
            jt1.m53777p(cls, "type");
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                Object cast = cls.cast(t);
                jt1.m53774m(cast);
                map.put(cls, cast);
            }
            return this;
        }

        @vr2
        public Builder tag(@ss2 Object obj) {
            return tag(Object.class, obj);
        }

        @vr2
        public Builder url(@vr2 String str) {
            StringBuilder sb;
            int i;
            jt1.m53777p(str, ImagesContract.URL);
            if (t54.m65462s2(str, "ws:", true)) {
                sb = new StringBuilder();
                sb.append("http:");
                i = 3;
            } else {
                if (t54.m65462s2(str, "wss:", true)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i = 4;
                }
                return url(HttpUrl.Companion.get(str));
            }
            String substring = str.substring(i);
            jt1.m53776o(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            str = sb.toString();
            return url(HttpUrl.Companion.get(str));
        }

        @vr2
        public Builder url(@vr2 URL url2) {
            jt1.m53777p(url2, ImagesContract.URL);
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url3 = url2.toString();
            jt1.m53776o(url3, "url.toString()");
            return url(companion.get(url3));
        }

        @vr2
        public Builder url(@vr2 HttpUrl httpUrl) {
            jt1.m53777p(httpUrl, ImagesContract.URL);
            this.url = httpUrl;
            return this;
        }
    }

    public Request(@vr2 HttpUrl httpUrl, @vr2 String str, @vr2 Headers headers2, @ss2 RequestBody requestBody, @vr2 Map<Class<?>, ? extends Object> map) {
        jt1.m53777p(httpUrl, ImagesContract.URL);
        jt1.m53777p(str, FirebaseAnalytics.C4305d.f24992v);
        jt1.m53777p(headers2, "headers");
        jt1.m53777p(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers2;
        this.body = requestBody;
        this.tags = map;
    }

    @uw1(name = "-deprecated_body")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "body", imports = {}))
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m74859deprecated_body() {
        return this.body;
    }

    @uw1(name = "-deprecated_cacheControl")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m74860deprecated_cacheControl() {
        return cacheControl();
    }

    @uw1(name = "-deprecated_headers")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "headers", imports = {}))
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m74861deprecated_headers() {
        return this.headers;
    }

    @uw1(name = "-deprecated_method")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "method", imports = {}))
    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m74862deprecated_method() {
        return this.method;
    }

    @uw1(name = "-deprecated_url")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "url", imports = {}))
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m74863deprecated_url() {
        return this.url;
    }

    @uw1(name = "body")
    @ss2
    public final RequestBody body() {
        return this.body;
    }

    @uw1(name = "cacheControl")
    @vr2
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @vr2
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @ss2
    public final String header(@vr2 String str) {
        jt1.m53777p(str, "name");
        return this.headers.get(str);
    }

    @vr2
    public final List<String> headers(@vr2 String str) {
        jt1.m53777p(str, "name");
        return this.headers.values(str);
    }

    @uw1(name = "headers")
    @vr2
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @uw1(name = "method")
    @vr2
    public final String method() {
        return this.method;
    }

    @vr2
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @ss2
    public final Object tag() {
        return tag(Object.class);
    }

    @ss2
    public final <T> T tag(@vr2 Class<? extends T> cls) {
        jt1.m53777p(cls, "type");
        return cls.cast(this.tags.get(cls));
    }

    @vr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    s00.m64055X();
                }
                ey2 ey2 = (ey2) next;
                String str = (String) ey2.mo35665a();
                String str2 = (String) ey2.mo35666b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @uw1(name = "url")
    @vr2
    public final HttpUrl url() {
        return this.url;
    }
}
