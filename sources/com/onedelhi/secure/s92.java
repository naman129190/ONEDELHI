package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.pm1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u000201H\u0016¨\u0006C"}, d2 = {"Lcom/onedelhi/secure/s92;", "Lokhttp3/EventListener;", "", "message", "Lcom/onedelhi/secure/un4;", "a", "Lokhttp3/Call;", "call", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Lcom/onedelhi/secure/pm1$b;", "logger", "<init>", "(Lcom/onedelhi/secure/pm1$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class s92 extends EventListener {

    /* renamed from: a */
    public long f34939a;

    /* renamed from: a */
    public final pm1.C6463b f34940a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/s92$a;", "Lokhttp3/EventListener$Factory;", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "create", "Lcom/onedelhi/secure/pm1$b;", "logger", "<init>", "(Lcom/onedelhi/secure/pm1$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.s92$a */
    public static class C6751a implements EventListener.Factory {

        /* renamed from: a */
        public final pm1.C6463b f34941a;

        @vw1
        public C6751a() {
            this((pm1.C6463b) null, 1, (wg0) null);
        }

        @vw1
        public C6751a(@vr2 pm1.C6463b bVar) {
            jt1.m53777p(bVar, "logger");
            this.f34941a = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C6751a(pm1.C6463b bVar, int i, wg0 wg0) {
            this((i & 1) != 0 ? pm1.C6463b.f33737a : bVar);
        }

        @vr2
        public EventListener create(@vr2 Call call) {
            jt1.m53777p(call, es2.f11366Q);
            return new s92(this.f34941a, (wg0) null);
        }
    }

    public s92(pm1.C6463b bVar) {
        this.f34940a = bVar;
    }

    public /* synthetic */ s92(pm1.C6463b bVar, wg0 wg0) {
        this(bVar);
    }

    /* renamed from: a */
    public final void mo44226a(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f34939a);
        pm1.C6463b bVar = this.f34940a;
        bVar.mo42823a('[' + millis + " ms] " + str);
    }

    public void cacheConditionalHit(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "cachedResponse");
        mo44226a("cacheConditionalHit: " + response);
    }

    public void cacheHit(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
        mo44226a("cacheHit: " + response);
    }

    public void cacheMiss(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("cacheMiss");
    }

    public void callEnd(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("callEnd");
    }

    public void callFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
        mo44226a("callFailed: " + iOException);
    }

    public void callStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        this.f34939a = System.nanoTime();
        mo44226a("callStart: " + call.request());
    }

    public void canceled(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("canceled");
    }

    public void connectEnd(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy, @ss2 Protocol protocol) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
        mo44226a("connectEnd: " + protocol);
    }

    public void connectFailed(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy, @ss2 Protocol protocol, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
        jt1.m53777p(iOException, "ioe");
        mo44226a("connectFailed: " + protocol + ' ' + iOException);
    }

    public void connectStart(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
        mo44226a("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    public void connectionAcquired(@vr2 Call call, @vr2 Connection connection) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(connection, dm1.f27486a);
        mo44226a("connectionAcquired: " + connection);
    }

    public void connectionReleased(@vr2 Call call, @vr2 Connection connection) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(connection, dm1.f27486a);
        mo44226a("connectionReleased");
    }

    public void dnsEnd(@vr2 Call call, @vr2 String str, @vr2 List<? extends InetAddress> list) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(str, "domainName");
        jt1.m53777p(list, "inetAddressList");
        mo44226a("dnsEnd: " + list);
    }

    public void dnsStart(@vr2 Call call, @vr2 String str) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(str, "domainName");
        mo44226a("dnsStart: " + str);
    }

    public void proxySelectEnd(@vr2 Call call, @vr2 HttpUrl httpUrl, @vr2 List<? extends Proxy> list) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(httpUrl, ImagesContract.URL);
        jt1.m53777p(list, "proxies");
        mo44226a("proxySelectEnd: " + list);
    }

    public void proxySelectStart(@vr2 Call call, @vr2 HttpUrl httpUrl) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(httpUrl, ImagesContract.URL);
        mo44226a("proxySelectStart: " + httpUrl);
    }

    public void requestBodyEnd(@vr2 Call call, long j) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("requestBodyEnd: byteCount=" + j);
    }

    public void requestBodyStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("requestBodyStart");
    }

    public void requestFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
        mo44226a("requestFailed: " + iOException);
    }

    public void requestHeadersEnd(@vr2 Call call, @vr2 Request request) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(request, "request");
        mo44226a("requestHeadersEnd");
    }

    public void requestHeadersStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("requestHeadersStart");
    }

    public void responseBodyEnd(@vr2 Call call, long j) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("responseBodyEnd: byteCount=" + j);
    }

    public void responseBodyStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("responseBodyStart");
    }

    public void responseFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
        mo44226a("responseFailed: " + iOException);
    }

    public void responseHeadersEnd(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
        mo44226a("responseHeadersEnd: " + response);
    }

    public void responseHeadersStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("responseHeadersStart");
    }

    public void satisfactionFailure(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
        mo44226a("satisfactionFailure: " + response);
    }

    public void secureConnectEnd(@vr2 Call call, @ss2 Handshake handshake) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("secureConnectEnd: " + handshake);
    }

    public void secureConnectStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
        mo44226a("secureConnectStart");
    }
}
