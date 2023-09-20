package com.onedelhi.secure;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/em3;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Ljava/io/IOException;", "e", "Lcom/onedelhi/secure/dg3;", "call", "Lokhttp3/Request;", "userRequest", "", "requestSendStarted", "d", "c", "userResponse", "Lcom/onedelhi/secure/qw0;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class em3 implements Interceptor {

    /* renamed from: a */
    public static final int f28008a = 20;

    /* renamed from: a */
    public static final C5166a f28009a = new C5166a((wg0) null);

    /* renamed from: a */
    public final OkHttpClient f28010a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/em3$a;", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.em3$a */
    public static final class C5166a {
        public C5166a() {
        }

        public /* synthetic */ C5166a(wg0 wg0) {
            this();
        }
    }

    public em3(@vr2 OkHttpClient okHttpClient) {
        jt1.m53777p(okHttpClient, "client");
        this.f28010a = okHttpClient;
    }

    /* renamed from: a */
    public final Request mo35504a(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        RequestBody requestBody = null;
        if (!this.f28010a.followRedirects() || (header$default = Response.header$default(response, en1.f11293c, (String) null, 2, (Object) null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!jt1.m53768g(resolve.scheme(), response.request().url().scheme()) && !this.f28010a.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (qm1.m63083b(str)) {
            int code = response.code();
            qm1 qm1 = qm1.f34314a;
            boolean z = qm1.mo43682d(str) || code == 308 || code == 307;
            if (qm1.mo43681c(str) && code != 308 && code != 307) {
                str = "GET";
            } else if (z) {
                requestBody = response.request().body();
            }
            newBuilder.method(str, requestBody);
            if (!z) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!nq4.m58705i(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.mo43742h();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Request mo35505b(okhttp3.Response r6, com.onedelhi.secure.qw0 r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            com.onedelhi.secure.eg3 r1 = r7.mo43742h()
            if (r1 == 0) goto L_0x000e
            okhttp3.Route r1 = r1.route()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.code()
            okhttp3.Request r3 = r6.request()
            java.lang.String r3 = r3.method()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00ad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0091
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            okhttp3.OkHttpClient r1 = r5.f28010a
            boolean r1 = r1.retryOnConnectionFailure()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.code()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.mo35509f(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            okhttp3.Request r6 = r6.request()
            return r6
        L_0x006f:
            com.onedelhi.secure.jt1.m53774m(r1)
            java.net.Proxy r7 = r1.proxy()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0089
            okhttp3.OkHttpClient r7 = r5.f28010a
            okhttp3.Authenticator r7 = r7.proxyAuthenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        L_0x0089:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L_0x009e
            int r1 = r1.code()
            if (r1 != r7) goto L_0x009e
            return r0
        L_0x009e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.mo35509f(r6, r7)
            if (r7 != 0) goto L_0x00ac
            okhttp3.Request r6 = r6.request()
            return r6
        L_0x00ac:
            return r0
        L_0x00ad:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto L_0x00be
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L_0x00be
            return r0
        L_0x00be:
            if (r7 == 0) goto L_0x00d3
            boolean r1 = r7.mo43745k()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            com.onedelhi.secure.eg3 r7 = r7.mo43742h()
            r7.mo35240B()
            okhttp3.Request r6 = r6.request()
            return r6
        L_0x00d3:
            return r0
        L_0x00d4:
            okhttp3.OkHttpClient r7 = r5.f28010a
            okhttp3.Authenticator r7 = r7.authenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        L_0x00df:
            okhttp3.Request r6 = r5.mo35504a(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.em3.mo35505b(okhttp3.Response, com.onedelhi.secure.qw0):okhttp3.Request");
    }

    /* renamed from: c */
    public final boolean mo35506c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    /* renamed from: d */
    public final boolean mo35507d(IOException iOException, dg3 dg3, Request request, boolean z) {
        if (!this.f28010a.retryOnConnectionFailure()) {
            return false;
        }
        return (!z || !mo35508e(iOException, request)) && mo35506c(iOException, z) && dg3.mo34446w();
    }

    /* renamed from: e */
    public final boolean mo35508e(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int mo35509f(Response response, int i) {
        String header$default = Response.header$default(response, "Retry-After", (String) null, 2, (Object) null);
        if (header$default == null) {
            return i;
        }
        if (!new eh3("\\d+").mo35379k(header$default)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(header$default);
        jt1.m53776o(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        IOException e;
        jt1.m53777p(chain, "chain");
        hg3 hg3 = (hg3) chain;
        Request g = hg3.mo37317g();
        dg3 c = hg3.mo37310c();
        List F = s00.m64037F();
        Response response = null;
        boolean z = true;
        int i = 0;
        while (true) {
            c.mo34427h(g, z);
            try {
                if (!c.isCanceled()) {
                    Response proceed = hg3.proceed(g);
                    if (response != null) {
                        proceed = proceed.newBuilder().priorResponse(response.newBuilder().body((ResponseBody) null).build()).build();
                    }
                    response = proceed;
                    qw0 o = c.mo34436o();
                    Request b = mo35505b(response, o);
                    if (b == null) {
                        if (o != null && o.mo43746l()) {
                            c.mo34449z();
                        }
                        c.mo34428i(false);
                        return response;
                    }
                    RequestBody body = b.body();
                    if (body == null || !body.isOneShot()) {
                        ResponseBody body2 = response.body();
                        if (body2 != null) {
                            nq4.m58711l(body2);
                        }
                        i++;
                        if (i <= 20) {
                            c.mo34428i(true);
                            g = b;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                    } else {
                        c.mo34428i(false);
                        return response;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (rn3 e2) {
                if (mo35507d(e2.mo43960c(), c, g, false)) {
                    e = e2.mo43959b();
                    F = a10.m35688A4(F, e);
                    c.mo34428i(true);
                    z = false;
                } else {
                    throw nq4.m58710k0(e2.mo43959b(), F);
                }
            } catch (IOException e3) {
                e = e3;
                if (mo35507d(e, c, g, !(e instanceof u50))) {
                    F = a10.m35688A4(F, e);
                    c.mo34428i(true);
                    z = false;
                } else {
                    throw nq4.m58710k0(e, F);
                }
            } catch (Throwable th) {
                c.mo34428i(true);
                throw th;
            }
        }
    }
}
