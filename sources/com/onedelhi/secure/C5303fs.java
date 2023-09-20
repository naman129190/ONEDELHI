package com.onedelhi.secure;

import com.onedelhi.secure.C5561hs;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/fs;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lcom/onedelhi/secure/gs;", "cacheRequest", "response", "a", "Lokhttp3/Cache;", "cache", "Lokhttp3/Cache;", "b", "()Lokhttp3/Cache;", "<init>", "(Lokhttp3/Cache;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.fs */
public final class C5303fs implements Interceptor {

    /* renamed from: a */
    public static final C5304a f28640a = new C5304a((wg0) null);
    @ss2

    /* renamed from: a */
    public final Cache f28641a;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/fs$a;", "", "Lokhttp3/Response;", "response", "f", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fs$a */
    public static final class C5304a {
        public C5304a() {
        }

        public /* synthetic */ C5304a(wg0 wg0) {
            this();
        }

        /* renamed from: c */
        public final Headers mo36303c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!t54.m65410K1("Warning", name, true) || !t54.m65466u2(value, mm0.f16219f, false, 2, (Object) null)) && (mo36304d(name) || !mo36305e(name) || headers2.get(name) == null)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!mo36304d(name2) && mo36305e(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final boolean mo36304d(String str) {
            return t54.m65410K1("Content-Length", str, true) || t54.m65410K1("Content-Encoding", str, true) || t54.m65410K1("Content-Type", str, true);
        }

        /* renamed from: e */
        public final boolean mo36305e(String str) {
            return !t54.m65410K1("Connection", str, true) && !t54.m65410K1("Keep-Alive", str, true) && !t54.m65410K1("Proxy-Authenticate", str, true) && !t54.m65410K1("Proxy-Authorization", str, true) && !t54.m65410K1("TE", str, true) && !t54.m65410K1("Trailers", str, true) && !t54.m65410K1("Transfer-Encoding", str, true) && !t54.m65410K1("Upgrade", str, true);
        }

        /* renamed from: f */
        public final Response mo36306f(Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body((ResponseBody) null).build() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/onedelhi/secure/fs$b", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fs$b */
    public static final class C5305b implements x04 {

        /* renamed from: a */
        public final /* synthetic */ C5446gs f28642a;

        /* renamed from: a */
        public final /* synthetic */ C6785so f28643a;

        /* renamed from: a */
        public final /* synthetic */ C6893to f28644a;

        /* renamed from: b */
        public boolean f28645b;

        public C5305b(C6893to toVar, C5446gs gsVar, C6785so soVar) {
            this.f28644a = toVar;
            this.f28642a = gsVar;
            this.f28643a = soVar;
        }

        public void close() throws IOException {
            if (!this.f28645b && !nq4.m58720t(this, 100, TimeUnit.MILLISECONDS)) {
                this.f28645b = true;
                this.f28642a.abort();
            }
            this.f28644a.close();
        }

        public long read(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "sink");
            try {
                long read = this.f28644a.read(noVar, j);
                if (read == -1) {
                    if (!this.f28645b) {
                        this.f28645b = true;
                        this.f28643a.close();
                    }
                    return -1;
                }
                noVar.mo41278m(this.f28643a.mo31682e(), noVar.mo41244V0() - read, read);
                this.f28643a.mo41296y2();
                return read;
            } catch (IOException e) {
                if (!this.f28645b) {
                    this.f28645b = true;
                    this.f28642a.abort();
                }
                throw e;
            }
        }

        @vr2
        public me4 timeout() {
            return this.f28644a.timeout();
        }
    }

    public C5303fs(@ss2 Cache cache) {
        this.f28641a = cache;
    }

    /* renamed from: a */
    public final Response mo36301a(C5446gs gsVar, Response response) throws IOException {
        if (gsVar == null) {
            return response;
        }
        oz3 body = gsVar.body();
        ResponseBody body2 = response.body();
        jt1.m53774m(body2);
        C5305b bVar = new C5305b(body2.source(), gsVar, gu2.m49834c(body));
        return response.newBuilder().body(new ig3(Response.header$default(response, "Content-Type", (String) null, 2, (Object) null), response.body().contentLength(), gu2.m49835d(bVar))).build();
    }

    @ss2
    /* renamed from: b */
    public final Cache mo36302b() {
        return this.f28641a;
    }

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        EventListener eventListener;
        ResponseBody body;
        ResponseBody body2;
        jt1.m53777p(chain, "chain");
        Call call = chain.call();
        Cache cache = this.f28641a;
        dg3 dg3 = null;
        Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        C5561hs b = new C5561hs.C5563b(System.currentTimeMillis(), chain.request(), response).mo37522b();
        Request b2 = b.mo37519b();
        Response a = b.mo37518a();
        Cache cache2 = this.f28641a;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(b);
        }
        if (call instanceof dg3) {
            dg3 = call;
        }
        dg3 dg32 = dg3;
        if (dg32 == null || (eventListener = dg32.mo34434m()) == null) {
            eventListener = EventListener.NONE;
        }
        if (!(response == null || a != null || (body2 = response.body()) == null)) {
            nq4.m58711l(body2);
        }
        if (b2 == null && a == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(nq4.f32733a).sentRequestAtMillis(-1).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        } else if (b2 == null) {
            jt1.m53774m(a);
            Response build2 = a.newBuilder().cacheResponse(f28640a.mo36306f(a)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        } else {
            if (a != null) {
                eventListener.cacheConditionalHit(call, a);
            } else if (this.f28641a != null) {
                eventListener.cacheMiss(call);
            }
            try {
                Response proceed = chain.proceed(b2);
                if (!(proceed != null || response == null || body == null)) {
                }
                if (a != null) {
                    if (proceed == null || proceed.code() != 304) {
                        ResponseBody body3 = a.body();
                        if (body3 != null) {
                            nq4.m58711l(body3);
                        }
                    } else {
                        Response.Builder newBuilder = a.newBuilder();
                        C5304a aVar = f28640a;
                        Response build3 = newBuilder.headers(aVar.mo36303c(a.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(aVar.mo36306f(a)).networkResponse(aVar.mo36306f(proceed)).build();
                        ResponseBody body4 = proceed.body();
                        jt1.m53774m(body4);
                        body4.close();
                        Cache cache3 = this.f28641a;
                        jt1.m53774m(cache3);
                        cache3.trackConditionalCacheHit$okhttp();
                        this.f28641a.update$okhttp(a, build3);
                        eventListener.cacheHit(call, build3);
                        return build3;
                    }
                }
                jt1.m53774m(proceed);
                Response.Builder newBuilder2 = proceed.newBuilder();
                C5304a aVar2 = f28640a;
                Response build4 = newBuilder2.cacheResponse(aVar2.mo36306f(a)).networkResponse(aVar2.mo36306f(proceed)).build();
                if (this.f28641a != null) {
                    if (om1.m59474c(build4) && C5561hs.f29763a.mo37520a(build4, b2)) {
                        Response a2 = mo36301a(this.f28641a.put$okhttp(build4), build4);
                        if (a != null) {
                            eventListener.cacheMiss(call);
                        }
                        return a2;
                    } else if (qm1.f34314a.mo43680a(b2.method())) {
                        try {
                            this.f28641a.remove$okhttp(b2);
                        } catch (IOException unused) {
                        }
                    }
                }
                return build4;
            } finally {
                if (!(response == null || (body = response.body()) == null)) {
                    nq4.m58711l(body);
                }
            }
        }
    }
}
