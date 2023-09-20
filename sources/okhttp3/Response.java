package okhttp3;

import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.C6893to;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.om1;
import com.onedelhi.secure.qw0;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.xj0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001RB}\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010!\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u00107\u001a\u00020\u001f\u0012\u0006\u00109\u001a\u00020\u001f\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007J\u000f\u0010\u0018\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fJ\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010'\u001a\u00020&J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010,\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010)J\u0011\u0010.\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b-\u0010)J\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0017J\u000f\u00104\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00106J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u000eH\u0016R\u0018\u0010=\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\b\t\u0010\bR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u001b8\u0007¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\b%\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\b*\u0010)R\u0019\u0010,\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b,\u0010F\u001a\u0004\b,\u0010)R\u0019\u0010.\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\b.\u0010)R\u0017\u00107\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\b7\u00106R\u0017\u00109\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b9\u0010G\u001a\u0004\b9\u00106R\u0011\u0010I\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b4\u00103R\u001c\u0010M\u001a\u0004\u0018\u00010L8\u0001X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010O¨\u0006S"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", "", "-deprecated_code", "()I", "code", "", "-deprecated_message", "()Ljava/lang/String;", "message", "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", "name", "", "headers", "defaultValue", "header", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "", "byteCount", "Lokhttp3/ResponseBody;", "peekBody", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response$Builder;", "newBuilder", "-deprecated_networkResponse", "()Lokhttp3/Response;", "networkResponse", "-deprecated_cacheResponse", "cacheResponse", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Challenge;", "challenges", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", "receivedResponseAtMillis", "Lcom/onedelhi/secure/un4;", "close", "toString", "lazyCacheControl", "Lokhttp3/CacheControl;", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", "I", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "J", "", "isSuccessful", "()Z", "isRedirect", "Lcom/onedelhi/secure/qw0;", "exchange", "Lcom/onedelhi/secure/qw0;", "()Lcom/onedelhi/secure/qw0;", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLcom/onedelhi/secure/qw0;)V", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Response implements Closeable {
    @ss2
    private final ResponseBody body;
    @ss2
    private final Response cacheResponse;
    private final int code;
    @ss2
    private final qw0 exchange;
    @ss2
    private final Handshake handshake;
    @vr2
    private final Headers headers;
    private CacheControl lazyCacheControl;
    @vr2
    private final String message;
    @ss2
    private final Response networkResponse;
    @ss2
    private final Response priorResponse;
    @vr2
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    @vr2
    private final Request request;
    private final long sentRequestAtMillis;

    @Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b_\u0010`B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b_\u0010NJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010%\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0017\u001a\u00020?8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u001f\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010WR$\u0010Z\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010#¨\u0006a"}, d2 = {"Lokhttp3/Response$Builder;", "", "", "name", "Lokhttp3/Response;", "response", "Lcom/onedelhi/secure/un4;", "checkSupportResponse", "checkPriorResponse", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "code", "message", "Lokhttp3/Handshake;", "handshake", "value", "header", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lcom/onedelhi/secure/qw0;", "deferredTrailers", "initExchange$okhttp", "(Lcom/onedelhi/secure/qw0;)V", "initExchange", "build", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lcom/onedelhi/secure/qw0;", "getExchange$okhttp", "()Lcom/onedelhi/secure/qw0;", "setExchange$okhttp", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class Builder {
        @ss2
        private ResponseBody body;
        @ss2
        private Response cacheResponse;
        private int code;
        @ss2
        private qw0 exchange;
        @ss2
        private Handshake handshake;
        @vr2
        private Headers.Builder headers;
        @ss2
        private String message;
        @ss2
        private Response networkResponse;
        @ss2
        private Response priorResponse;
        @ss2
        private Protocol protocol;
        private long receivedResponseAtMillis;
        @ss2
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(@vr2 Response response) {
            jt1.m53777p(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                boolean z = true;
                if (response.body() == null) {
                    if (response.networkResponse() == null) {
                        if (response.cacheResponse() == null) {
                            if (response.priorResponse() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @vr2
        public Builder addHeader(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @vr2
        public Builder body(@ss2 ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @vr2
        public Response build() {
            int i = this.code;
            if (i >= 0) {
                Request request2 = this.request;
                if (request2 != null) {
                    Protocol protocol2 = this.protocol;
                    if (protocol2 != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request2, protocol2, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @vr2
        public Builder cacheResponse(@ss2 Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @vr2
        public Builder code(int i) {
            this.code = i;
            return this;
        }

        @ss2
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @ss2
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @ss2
        public final qw0 getExchange$okhttp() {
            return this.exchange;
        }

        @ss2
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @vr2
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @ss2
        public final String getMessage$okhttp() {
            return this.message;
        }

        @ss2
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @ss2
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @ss2
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @ss2
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @vr2
        public Builder handshake(@ss2 Handshake handshake2) {
            this.handshake = handshake2;
            return this;
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

        public final void initExchange$okhttp(@vr2 qw0 qw0) {
            jt1.m53777p(qw0, "deferredTrailers");
            this.exchange = qw0;
        }

        @vr2
        public Builder message(@vr2 String str) {
            jt1.m53777p(str, "message");
            this.message = str;
            return this;
        }

        @vr2
        public Builder networkResponse(@ss2 Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @vr2
        public Builder priorResponse(@ss2 Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @vr2
        public Builder protocol(@vr2 Protocol protocol2) {
            jt1.m53777p(protocol2, "protocol");
            this.protocol = protocol2;
            return this;
        }

        @vr2
        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        @vr2
        public Builder removeHeader(@vr2 String str) {
            jt1.m53777p(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        @vr2
        public Builder request(@vr2 Request request2) {
            jt1.m53777p(request2, "request");
            this.request = request2;
            return this;
        }

        @vr2
        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(@ss2 ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@ss2 Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(@ss2 qw0 qw0) {
            this.exchange = qw0;
        }

        public final void setHandshake$okhttp(@ss2 Handshake handshake2) {
            this.handshake = handshake2;
        }

        public final void setHeaders$okhttp(@vr2 Headers.Builder builder) {
            jt1.m53777p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@ss2 String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@ss2 Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@ss2 Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@ss2 Protocol protocol2) {
            this.protocol = protocol2;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(@ss2 Request request2) {
            this.request = request2;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }
    }

    public Response(@vr2 Request request2, @vr2 Protocol protocol2, @vr2 String str, int i, @ss2 Handshake handshake2, @vr2 Headers headers2, @ss2 ResponseBody responseBody, @ss2 Response response, @ss2 Response response2, @ss2 Response response3, long j, long j2, @ss2 qw0 qw0) {
        jt1.m53777p(request2, "request");
        jt1.m53777p(protocol2, "protocol");
        jt1.m53777p(str, "message");
        jt1.m53777p(headers2, "headers");
        this.request = request2;
        this.protocol = protocol2;
        this.message = str;
        this.code = i;
        this.handshake = handshake2;
        this.headers = headers2;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = qw0;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @uw1(name = "-deprecated_body")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "body", imports = {}))
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m74864deprecated_body() {
        return this.body;
    }

    @uw1(name = "-deprecated_cacheControl")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m74865deprecated_cacheControl() {
        return cacheControl();
    }

    @uw1(name = "-deprecated_cacheResponse")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cacheResponse", imports = {}))
    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final Response m74866deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @uw1(name = "-deprecated_code")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "code", imports = {}))
    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m74867deprecated_code() {
        return this.code;
    }

    @uw1(name = "-deprecated_handshake")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "handshake", imports = {}))
    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m74868deprecated_handshake() {
        return this.handshake;
    }

    @uw1(name = "-deprecated_headers")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "headers", imports = {}))
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m74869deprecated_headers() {
        return this.headers;
    }

    @uw1(name = "-deprecated_message")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "message", imports = {}))
    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m74870deprecated_message() {
        return this.message;
    }

    @uw1(name = "-deprecated_networkResponse")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "networkResponse", imports = {}))
    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final Response m74871deprecated_networkResponse() {
        return this.networkResponse;
    }

    @uw1(name = "-deprecated_priorResponse")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "priorResponse", imports = {}))
    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final Response m74872deprecated_priorResponse() {
        return this.priorResponse;
    }

    @uw1(name = "-deprecated_protocol")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "protocol", imports = {}))
    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m74873deprecated_protocol() {
        return this.protocol;
    }

    @uw1(name = "-deprecated_receivedResponseAtMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "receivedResponseAtMillis", imports = {}))
    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m74874deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @uw1(name = "-deprecated_request")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "request", imports = {}))
    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m74875deprecated_request() {
        return this.request;
    }

    @uw1(name = "-deprecated_sentRequestAtMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "sentRequestAtMillis", imports = {}))
    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m74876deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @uw1(name = "body")
    @ss2
    public final ResponseBody body() {
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

    @uw1(name = "cacheResponse")
    @ss2
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @vr2
    public final List<Challenge> challenges() {
        String str;
        Headers headers2 = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return s00.m64037F();
        } else {
            str = "Proxy-Authenticate";
        }
        return om1.m59473b(headers2, str);
    }

    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    @uw1(name = "code")
    public final int code() {
        return this.code;
    }

    @uw1(name = "exchange")
    @ss2
    public final qw0 exchange() {
        return this.exchange;
    }

    @uw1(name = "handshake")
    @ss2
    public final Handshake handshake() {
        return this.handshake;
    }

    @vw1
    @ss2
    public final String header(@vr2 String str) {
        return header$default(this, str, (String) null, 2, (Object) null);
    }

    @vw1
    @ss2
    public final String header(@vr2 String str, @ss2 String str2) {
        jt1.m53777p(str, "name");
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
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

    public final boolean isRedirect() {
        int i = this.code;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    @uw1(name = "message")
    @vr2
    public final String message() {
        return this.message;
    }

    @uw1(name = "networkResponse")
    @ss2
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @vr2
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @vr2
    public final ResponseBody peekBody(long j) throws IOException {
        ResponseBody responseBody = this.body;
        jt1.m53774m(responseBody);
        C6893to t = responseBody.source().mo31710t();
        C6205no noVar = new C6205no();
        t.mo31677T(j);
        noVar.mo41240R1(t, Math.min(j, t.mo31682e().mo41244V0()));
        return ResponseBody.Companion.create((C6893to) noVar, this.body.contentType(), noVar.mo41244V0());
    }

    @uw1(name = "priorResponse")
    @ss2
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @uw1(name = "protocol")
    @vr2
    public final Protocol protocol() {
        return this.protocol;
    }

    @uw1(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @uw1(name = "request")
    @vr2
    public final Request request() {
        return this.request;
    }

    @uw1(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @vr2
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @vr2
    public final Headers trailers() throws IOException {
        qw0 qw0 = this.exchange;
        if (qw0 != null) {
            return qw0.mo43755u();
        }
        throw new IllegalStateException("trailers not available".toString());
    }
}
