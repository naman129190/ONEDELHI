package com.onedelhi.secure;

import com.onedelhi.secure.r34;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/dm1;", "Lcom/onedelhi/secure/rw0;", "Lokhttp3/Request;", "request", "", "contentLength", "Lcom/onedelhi/secure/oz3;", "f", "Lcom/onedelhi/secure/un4;", "e", "i", "b", "", "expectContinue", "Lokhttp3/Response$Builder;", "g", "Lokhttp3/Response;", "response", "c", "Lcom/onedelhi/secure/x04;", "d", "Lokhttp3/Headers;", "a", "cancel", "Lcom/onedelhi/secure/eg3;", "connection", "Lcom/onedelhi/secure/eg3;", "h", "()Lcom/onedelhi/secure/eg3;", "Lokhttp3/OkHttpClient;", "client", "Lcom/onedelhi/secure/hg3;", "chain", "Lcom/onedelhi/secure/cm1;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;Lcom/onedelhi/secure/eg3;Lcom/onedelhi/secure/hg3;Lcom/onedelhi/secure/cm1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class dm1 implements rw0 {

    /* renamed from: a */
    public static final C5032a f27485a = new C5032a((wg0) null);

    /* renamed from: a */
    public static final String f27486a = "connection";

    /* renamed from: a */
    public static final List<String> f27487a = nq4.m58726z(f27486a, f27488b, f27490c, f27491d, f27493f, f27492e, f27494g, f27495h, sk1.f35122b, sk1.f35124c, sk1.f35126d, sk1.f35128e);

    /* renamed from: b */
    public static final String f27488b = "host";

    /* renamed from: b */
    public static final List<String> f27489b = nq4.m58726z(f27486a, f27488b, f27490c, f27491d, f27493f, f27492e, f27494g, f27495h);

    /* renamed from: c */
    public static final String f27490c = "keep-alive";

    /* renamed from: d */
    public static final String f27491d = "proxy-connection";

    /* renamed from: e */
    public static final String f27492e = "transfer-encoding";

    /* renamed from: f */
    public static final String f27493f = "te";

    /* renamed from: g */
    public static final String f27494g = "encoding";

    /* renamed from: h */
    public static final String f27495h = "upgrade";

    /* renamed from: a */
    public final cm1 f27496a;
    @vr2

    /* renamed from: a */
    public final eg3 f27497a;

    /* renamed from: a */
    public volatile fm1 f27498a;

    /* renamed from: a */
    public final hg3 f27499a;

    /* renamed from: a */
    public final Protocol f27500a;

    /* renamed from: a */
    public volatile boolean f27501a;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/dm1$a;", "", "Lokhttp3/Request;", "request", "", "Lcom/onedelhi/secure/sk1;", "a", "Lokhttp3/Headers;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Response$Builder;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.dm1$a */
    public static final class C5032a {
        public C5032a() {
        }

        public /* synthetic */ C5032a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final List<sk1> mo34498a(@vr2 Request request) {
            jt1.m53777p(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new sk1(sk1.f35127e, request.method()));
            arrayList.add(new sk1(sk1.f35129f, dj3.f27476a.mo34477c(request.url())));
            String header = request.header("Host");
            if (header != null) {
                arrayList.add(new sk1(sk1.f35131h, header));
            }
            arrayList.add(new sk1(sk1.f35130g, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                Locale locale = Locale.US;
                jt1.m53776o(locale, "Locale.US");
                Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = name.toLowerCase(locale);
                jt1.m53776o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!dm1.f27487a.contains(lowerCase) || (jt1.m53768g(lowerCase, dm1.f27493f) && jt1.m53768g(headers.value(i), "trailers"))) {
                    arrayList.add(new sk1(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        @vr2
        /* renamed from: b */
        public final Response.Builder mo34499b(@vr2 Headers headers, @vr2 Protocol protocol) {
            jt1.m53777p(headers, "headerBlock");
            jt1.m53777p(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            r34 r34 = null;
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (jt1.m53768g(name, sk1.f35121a)) {
                    r34.C6635a aVar = r34.f34483a;
                    r34 = aVar.mo43806b("HTTP/1.1 " + value);
                } else if (!dm1.f27489b.contains(name)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            if (r34 != null) {
                return new Response.Builder().protocol(protocol).code(r34.f34488a).message(r34.f34489a).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public dm1(@vr2 OkHttpClient okHttpClient, @vr2 eg3 eg3, @vr2 hg3 hg3, @vr2 cm1 cm1) {
        jt1.m53777p(okHttpClient, "client");
        jt1.m53777p(eg3, f27486a);
        jt1.m53777p(hg3, "chain");
        jt1.m53777p(cm1, "http2Connection");
        this.f27497a = eg3;
        this.f27499a = hg3;
        this.f27496a = cm1;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f27500a = !protocols.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    @vr2
    /* renamed from: a */
    public Headers mo30980a() {
        fm1 fm1 = this.f27498a;
        jt1.m53774m(fm1);
        return fm1.mo36084I();
    }

    /* renamed from: b */
    public void mo30981b() {
        fm1 fm1 = this.f27498a;
        jt1.m53774m(fm1);
        fm1.mo36102o().close();
    }

    /* renamed from: c */
    public long mo30982c(@vr2 Response response) {
        jt1.m53777p(response, "response");
        if (!om1.m59474c(response)) {
            return 0;
        }
        return nq4.m58724x(response);
    }

    public void cancel() {
        this.f27501a = true;
        fm1 fm1 = this.f27498a;
        if (fm1 != null) {
            fm1.mo36093f(hv0.CANCEL);
        }
    }

    @vr2
    /* renamed from: d */
    public x04 mo30984d(@vr2 Response response) {
        jt1.m53777p(response, "response");
        fm1 fm1 = this.f27498a;
        jt1.m53774m(fm1);
        return fm1.mo36105r();
    }

    /* renamed from: e */
    public void mo30985e(@vr2 Request request) {
        jt1.m53777p(request, "request");
        if (this.f27498a == null) {
            this.f27498a = this.f27496a.mo33827h1(f27485a.mo34498a(request), request.body() != null);
            if (!this.f27501a) {
                fm1 fm1 = this.f27498a;
                jt1.m53774m(fm1);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                fm1.mo36111x().mo40562i((long) this.f27499a.mo37316f(), timeUnit);
                fm1 fm12 = this.f27498a;
                jt1.m53774m(fm12);
                fm12.mo36087L().mo40562i((long) this.f27499a.mo37318h(), timeUnit);
                return;
            }
            fm1 fm13 = this.f27498a;
            jt1.m53774m(fm13);
            fm13.mo36093f(hv0.CANCEL);
            throw new IOException("Canceled");
        }
    }

    @vr2
    /* renamed from: f */
    public oz3 mo30986f(@vr2 Request request, long j) {
        jt1.m53777p(request, "request");
        fm1 fm1 = this.f27498a;
        jt1.m53774m(fm1);
        return fm1.mo36102o();
    }

    @ss2
    /* renamed from: g */
    public Response.Builder mo30987g(boolean z) {
        fm1 fm1 = this.f27498a;
        jt1.m53774m(fm1);
        Response.Builder b = f27485a.mo34499b(fm1.mo36083H(), this.f27500a);
        if (!z || b.getCode$okhttp() != 100) {
            return b;
        }
        return null;
    }

    @vr2
    /* renamed from: h */
    public eg3 mo30988h() {
        return this.f27497a;
    }

    /* renamed from: i */
    public void mo30989i() {
        this.f27496a.flush();
    }
}
