package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.dm1;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006B"}, d2 = {"Lokhttp3/EventListener;", "", "Lokhttp3/Call;", "call", "Lcom/onedelhi/secure/un4;", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "Lcom/onedelhi/secure/ax1;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class EventListener {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo38105d2 = {"Lokhttp3/EventListener$Companion;", "", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo38105d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public interface Factory {
        @vr2
        EventListener create(@vr2 Call call);
    }

    public void cacheConditionalHit(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "cachedResponse");
    }

    public void cacheHit(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
    }

    public void cacheMiss(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void callEnd(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void callFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
    }

    public void callStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void canceled(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void connectEnd(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy, @ss2 Protocol protocol) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
    }

    public void connectFailed(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy, @ss2 Protocol protocol, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
        jt1.m53777p(iOException, "ioe");
    }

    public void connectStart(@vr2 Call call, @vr2 InetSocketAddress inetSocketAddress, @vr2 Proxy proxy) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(inetSocketAddress, "inetSocketAddress");
        jt1.m53777p(proxy, "proxy");
    }

    public void connectionAcquired(@vr2 Call call, @vr2 Connection connection) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(connection, dm1.f27486a);
    }

    public void connectionReleased(@vr2 Call call, @vr2 Connection connection) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(connection, dm1.f27486a);
    }

    public void dnsEnd(@vr2 Call call, @vr2 String str, @vr2 List<InetAddress> list) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(str, "domainName");
        jt1.m53777p(list, "inetAddressList");
    }

    public void dnsStart(@vr2 Call call, @vr2 String str) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(str, "domainName");
    }

    public void proxySelectEnd(@vr2 Call call, @vr2 HttpUrl httpUrl, @vr2 List<Proxy> list) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(httpUrl, ImagesContract.URL);
        jt1.m53777p(list, "proxies");
    }

    public void proxySelectStart(@vr2 Call call, @vr2 HttpUrl httpUrl) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(httpUrl, ImagesContract.URL);
    }

    public void requestBodyEnd(@vr2 Call call, long j) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void requestBodyStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void requestFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
    }

    public void requestHeadersEnd(@vr2 Call call, @vr2 Request request) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(request, "request");
    }

    public void requestHeadersStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void responseBodyEnd(@vr2 Call call, long j) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void responseBodyStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void responseFailed(@vr2 Call call, @vr2 IOException iOException) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(iOException, "ioe");
    }

    public void responseHeadersEnd(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
    }

    public void responseHeadersStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void satisfactionFailure(@vr2 Call call, @vr2 Response response) {
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(response, "response");
    }

    public void secureConnectEnd(@vr2 Call call, @ss2 Handshake handshake) {
        jt1.m53777p(call, es2.f11366Q);
    }

    public void secureConnectStart(@vr2 Call call) {
        jt1.m53777p(call, es2.f11366Q);
    }
}
