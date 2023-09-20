package okhttp3;

import com.onedelhi.secure.C6613qv;
import com.onedelhi.secure.a10;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.dg3;
import com.onedelhi.secure.ec1;
import com.onedelhi.secure.eu2;
import com.onedelhi.secure.fa4;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jg3;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.k23;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.pn3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.ww4;
import com.onedelhi.secure.x00;
import com.onedelhi.secure.xj0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u0001\u0010\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010%J\u000f\u0010.\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010%J\u000f\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0011\u00106\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b4\u00105J\u000f\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010>\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010B\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020'H\u0007¢\u0006\u0004\bC\u0010)J\u000f\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010L\u001a\u00020IH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u0018H\u0007¢\u0006\u0004\bN\u0010\u001bJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u0018H\u0007¢\u0006\u0004\bQ\u0010\u001bJ\u000f\u0010V\u001a\u00020SH\u0007¢\u0006\u0004\bT\u0010UJ\u000f\u0010Z\u001a\u00020WH\u0007¢\u0006\u0004\bX\u0010YJ\u000f\u0010^\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]J\u000f\u0010`\u001a\u00020[H\u0007¢\u0006\u0004\b_\u0010]J\u000f\u0010b\u001a\u00020[H\u0007¢\u0006\u0004\ba\u0010]J\u000f\u0010d\u001a\u00020[H\u0007¢\u0006\u0004\bc\u0010]J\u000f\u0010f\u001a\u00020[H\u0007¢\u0006\u0004\be\u0010]R\u0017\u0010\u0013\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148G¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001e\u0010i\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001f8G¢\u0006\f\n\u0004\b\"\u0010j\u001a\u0004\b\"\u0010!R\u0017\u0010&\u001a\u00020#8G¢\u0006\f\n\u0004\b&\u0010k\u001a\u0004\b&\u0010%R\u0017\u0010*\u001a\u00020'8G¢\u0006\f\n\u0004\b*\u0010l\u001a\u0004\b*\u0010)R\u0017\u0010,\u001a\u00020#8G¢\u0006\f\n\u0004\b,\u0010k\u001a\u0004\b,\u0010%R\u0017\u0010.\u001a\u00020#8G¢\u0006\f\n\u0004\b.\u0010k\u001a\u0004\b.\u0010%R\u0017\u00102\u001a\u00020/8G¢\u0006\f\n\u0004\b2\u0010m\u001a\u0004\b2\u00101R\u0019\u00106\u001a\u0004\u0018\u0001038G¢\u0006\f\n\u0004\b6\u0010n\u001a\u0004\b6\u00105R\u0017\u0010:\u001a\u0002078G¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\b:\u00109R\u0019\u0010>\u001a\u0004\u0018\u00010;8G¢\u0006\f\n\u0004\b>\u0010p\u001a\u0004\b>\u0010=R\u0017\u0010B\u001a\u00020?8G¢\u0006\f\n\u0004\bB\u0010q\u001a\u0004\bB\u0010AR\u0017\u0010D\u001a\u00020'8G¢\u0006\f\n\u0004\bD\u0010l\u001a\u0004\bD\u0010)R\u0017\u0010H\u001a\u00020E8G¢\u0006\f\n\u0004\bH\u0010r\u001a\u0004\bH\u0010GR\u0016\u0010s\u001a\u0004\u0018\u00010I8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0019\u0010v\u001a\u0004\u0018\u00010u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bv\u0010xR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u00188G¢\u0006\f\n\u0004\bO\u0010i\u001a\u0004\bO\u0010\u001bR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u00188G¢\u0006\f\n\u0004\bR\u0010i\u001a\u0004\bR\u0010\u001bR\u0017\u0010V\u001a\u00020S8G¢\u0006\f\n\u0004\bV\u0010y\u001a\u0004\bV\u0010UR\u0017\u0010Z\u001a\u00020W8G¢\u0006\f\n\u0004\bZ\u0010z\u001a\u0004\bZ\u0010YR\u0017\u0010^\u001a\u00020[8G¢\u0006\f\n\u0004\b^\u0010{\u001a\u0004\b^\u0010]R\u0017\u0010`\u001a\u00020[8G¢\u0006\f\n\u0004\b`\u0010{\u001a\u0004\b`\u0010]R\u0017\u0010b\u001a\u00020[8G¢\u0006\f\n\u0004\bb\u0010{\u001a\u0004\bb\u0010]R\u0017\u0010d\u001a\u00020[8G¢\u0006\f\n\u0004\bd\u0010{\u001a\u0004\bd\u0010]R\u0017\u0010f\u001a\u00020[8G¢\u0006\f\n\u0004\bf\u0010{\u001a\u0004\bf\u0010]R\u0017\u0010}\u001a\u00020|8G¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b}\u0010R\u0011\u0010L\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bL\u0010KR\u001f\u0010\u0001\u001a\u0005\u0018\u00010\u00018G¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lcom/onedelhi/secure/un4;", "verifyClientState", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "Lokhttp3/OkHttpClient$Builder;", "newBuilder", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/EventListener$Factory;", "Z", "Lokhttp3/Authenticator;", "Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "Lokhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lcom/onedelhi/secure/qv;", "certificateChainCleaner", "Lcom/onedelhi/secure/qv;", "()Lcom/onedelhi/secure/qv;", "Lcom/onedelhi/secure/pn3;", "routeDatabase", "Lcom/onedelhi/secure/pn3;", "getRouteDatabase", "()Lcom/onedelhi/secure/pn3;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((wg0) null);
    /* access modifiers changed from: private */
    @vr2
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = nq4.m58726z(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    /* access modifiers changed from: private */
    @vr2
    public static final List<Protocol> DEFAULT_PROTOCOLS = nq4.m58726z(Protocol.HTTP_2, Protocol.HTTP_1_1);
    @vr2
    private final Authenticator authenticator;
    @ss2
    private final Cache cache;
    private final int callTimeoutMillis;
    @ss2
    private final C6613qv certificateChainCleaner;
    @vr2
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    @vr2
    private final ConnectionPool connectionPool;
    @vr2
    private final List<ConnectionSpec> connectionSpecs;
    @vr2
    private final CookieJar cookieJar;
    @vr2
    private final Dispatcher dispatcher;
    @vr2
    private final Dns dns;
    @vr2
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    @vr2
    private final HostnameVerifier hostnameVerifier;
    @vr2
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    @vr2
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    @vr2
    private final List<Protocol> protocols;
    @ss2
    private final Proxy proxy;
    @vr2
    private final Authenticator proxyAuthenticator;
    @vr2
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    @vr2
    private final pn3 routeDatabase;
    @vr2
    private final SocketFactory socketFactory;
    /* access modifiers changed from: private */
    public final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    @ss2
    private final X509TrustManager x509TrustManager;

    @Metadata(bv = {}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001B\u0014\b\u0010\u0012\u0007\u0010Ë\u0001\u001a\u00020J¢\u0006\u0006\bÉ\u0001\u0010Ì\u0001J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\n\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\u0015\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0007J\u0016\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0014\u00105\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020403J\u0014\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020603J\u000e\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:J\u0016\u0010@\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010C\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010D\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010E\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020<J\u0006\u0010K\u001a\u00020JR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bY\u0010XR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010_\u001a\u0004\bi\u0010a\"\u0004\bj\u0010cR\"\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010_\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u000e¢\u0006\u0013\n\u0004\b)\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R)\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b+\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R$\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\b,\u0010d\u001a\u0005\b\u0001\u0010f\"\u0005\b\u0001\u0010hR'\u0010.\u001a\u00020-8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u0001018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b5\u0010V\u001a\u0005\b\u0001\u0010X\"\u0006\b\u0001\u0010\u0001R+\u00107\u001a\b\u0012\u0004\u0012\u000206038\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b7\u0010V\u001a\u0005\b\u0001\u0010X\"\u0006\b\u0001\u0010\u0001R'\u00109\u001a\u0002088\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0001\u001a\u0006\b\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b;\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R(\u0010@\u001a\u00030¨\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b@\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010­\u0001R(\u0010C\u001a\u00030¨\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bC\u0010©\u0001\u001a\u0006\b®\u0001\u0010«\u0001\"\u0006\b¯\u0001\u0010­\u0001R(\u0010D\u001a\u00030¨\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bD\u0010©\u0001\u001a\u0006\b°\u0001\u0010«\u0001\"\u0006\b±\u0001\u0010­\u0001R(\u0010E\u001a\u00030¨\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bE\u0010©\u0001\u001a\u0006\b²\u0001\u0010«\u0001\"\u0006\b³\u0001\u0010­\u0001R(\u0010G\u001a\u00030¨\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bG\u0010©\u0001\u001a\u0006\b´\u0001\u0010«\u0001\"\u0006\bµ\u0001\u0010­\u0001R'\u0010I\u001a\u00020<8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bI\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R,\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R,\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006Í\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "interceptors", "interceptor", "addInterceptor", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lcom/onedelhi/secure/iy2;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lcom/onedelhi/secure/ec1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "authenticator", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "proxySelector", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "Ljava/time/Duration;", "duration", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "Lokhttp3/OkHttpClient;", "build", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "()Ljava/util/List;", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lcom/onedelhi/secure/qv;", "certificateChainCleaner", "Lcom/onedelhi/secure/qv;", "getCertificateChainCleaner$okhttp", "()Lcom/onedelhi/secure/qv;", "setCertificateChainCleaner$okhttp", "(Lcom/onedelhi/secure/qv;)V", "Lcom/onedelhi/secure/pn3;", "routeDatabase", "Lcom/onedelhi/secure/pn3;", "getRouteDatabase$okhttp", "()Lcom/onedelhi/secure/pn3;", "setRouteDatabase$okhttp", "(Lcom/onedelhi/secure/pn3;)V", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        @vr2
        private Authenticator authenticator;
        @ss2
        private Cache cache;
        private int callTimeout;
        @ss2
        private C6613qv certificateChainCleaner;
        @vr2
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        @vr2
        private ConnectionPool connectionPool;
        @vr2
        private List<ConnectionSpec> connectionSpecs;
        @vr2
        private CookieJar cookieJar;
        @vr2
        private Dispatcher dispatcher;
        @vr2
        private Dns dns;
        @vr2
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        @vr2
        private HostnameVerifier hostnameVerifier;
        @vr2
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        @vr2
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        @vr2
        private List<? extends Protocol> protocols;
        @ss2
        private Proxy proxy;
        @vr2
        private Authenticator proxyAuthenticator;
        @ss2
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        @ss2
        private pn3 routeDatabase;
        @vr2
        private SocketFactory socketFactory;
        @ss2
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        @ss2
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = nq4.m58697e(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator2 = Authenticator.NONE;
            this.authenticator = authenticator2;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator2;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            jt1.m53776o(socketFactory2, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory2;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = eu2.f28100a;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(@vr2 OkHttpClient okHttpClient) {
            this();
            jt1.m53777p(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            x00.m69813p0(this.interceptors, okHttpClient.interceptors());
            x00.m69813p0(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        @uw1(name = "-addInterceptor")
        @vr2
        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m74857addInterceptor(@vr2 ec1<? super Interceptor.Chain, Response> ec1) {
            jt1.m53777p(ec1, "block");
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$2(ec1));
        }

        @uw1(name = "-addNetworkInterceptor")
        @vr2
        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m74858addNetworkInterceptor(@vr2 ec1<? super Interceptor.Chain, Response> ec1) {
            jt1.m53777p(ec1, "block");
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$2(ec1));
        }

        @vr2
        public final Builder addInterceptor(@vr2 Interceptor interceptor) {
            jt1.m53777p(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @vr2
        public final Builder addNetworkInterceptor(@vr2 Interceptor interceptor) {
            jt1.m53777p(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @vr2
        public final Builder authenticator(@vr2 Authenticator authenticator2) {
            jt1.m53777p(authenticator2, "authenticator");
            this.authenticator = authenticator2;
            return this;
        }

        @vr2
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @vr2
        public final Builder cache(@ss2 Cache cache2) {
            this.cache = cache2;
            return this;
        }

        @vr2
        public final Builder callTimeout(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            this.callTimeout = nq4.m58707j("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder callTimeout(@vr2 Duration duration) {
            jt1.m53777p(duration, ak4.C1715h.f9299b);
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @vr2
        public final Builder certificatePinner(@vr2 CertificatePinner certificatePinner2) {
            jt1.m53777p(certificatePinner2, "certificatePinner");
            if (!jt1.m53768g(certificatePinner2, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner2;
            return this;
        }

        @vr2
        public final Builder connectTimeout(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            this.connectTimeout = nq4.m58707j("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder connectTimeout(@vr2 Duration duration) {
            jt1.m53777p(duration, ak4.C1715h.f9299b);
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @vr2
        public final Builder connectionPool(@vr2 ConnectionPool connectionPool2) {
            jt1.m53777p(connectionPool2, "connectionPool");
            this.connectionPool = connectionPool2;
            return this;
        }

        @vr2
        public final Builder connectionSpecs(@vr2 List<ConnectionSpec> list) {
            jt1.m53777p(list, "connectionSpecs");
            if (!jt1.m53768g(list, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = nq4.m58696d0(list);
            return this;
        }

        @vr2
        public final Builder cookieJar(@vr2 CookieJar cookieJar2) {
            jt1.m53777p(cookieJar2, "cookieJar");
            this.cookieJar = cookieJar2;
            return this;
        }

        @vr2
        public final Builder dispatcher(@vr2 Dispatcher dispatcher2) {
            jt1.m53777p(dispatcher2, "dispatcher");
            this.dispatcher = dispatcher2;
            return this;
        }

        @vr2
        public final Builder dns(@vr2 Dns dns2) {
            jt1.m53777p(dns2, "dns");
            if (!jt1.m53768g(dns2, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns2;
            return this;
        }

        @vr2
        public final Builder eventListener(@vr2 EventListener eventListener) {
            jt1.m53777p(eventListener, "eventListener");
            this.eventListenerFactory = nq4.m58697e(eventListener);
            return this;
        }

        @vr2
        public final Builder eventListenerFactory(@vr2 EventListener.Factory factory) {
            jt1.m53777p(factory, "eventListenerFactory");
            this.eventListenerFactory = factory;
            return this;
        }

        @vr2
        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        @vr2
        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        @vr2
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @ss2
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @ss2
        public final C6613qv getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @vr2
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @vr2
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @vr2
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @vr2
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @vr2
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @vr2
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @vr2
        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @vr2
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @vr2
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @vr2
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @vr2
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @ss2
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @vr2
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @ss2
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @ss2
        public final pn3 getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @vr2
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @ss2
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @ss2
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @vr2
        public final Builder hostnameVerifier(@vr2 HostnameVerifier hostnameVerifier2) {
            jt1.m53777p(hostnameVerifier2, "hostnameVerifier");
            if (!jt1.m53768g(hostnameVerifier2, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier2;
            return this;
        }

        @vr2
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @vr2
        public final Builder minWebSocketMessageToCompress(long j) {
            if (j >= 0) {
                this.minWebSocketMessageToCompress = j;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j).toString());
        }

        @vr2
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @vr2
        public final Builder pingInterval(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            this.pingInterval = nq4.m58707j("interval", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder pingInterval(@vr2 Duration duration) {
            jt1.m53777p(duration, ak4.C1715h.f9299b);
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @vr2
        public final Builder protocols(@vr2 List<? extends Protocol> list) {
            jt1.m53777p(list, "protocols");
            List<T> T5 = a10.m35784T5(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z = false;
            if (T5.contains(protocol) || T5.contains(Protocol.HTTP_1_1)) {
                if (!T5.contains(protocol) || T5.size() <= 1) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + T5).toString());
                } else if (!(!T5.contains(Protocol.HTTP_1_0))) {
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + T5).toString());
                } else if (!T5.contains((Object) null)) {
                    T5.remove(Protocol.SPDY_3);
                    if (!jt1.m53768g(T5, this.protocols)) {
                        this.routeDatabase = null;
                    }
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(T5);
                    jt1.m53776o(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                    this.protocols = unmodifiableList;
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + T5).toString());
            }
        }

        @vr2
        public final Builder proxy(@ss2 Proxy proxy2) {
            if (!jt1.m53768g(proxy2, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy2;
            return this;
        }

        @vr2
        public final Builder proxyAuthenticator(@vr2 Authenticator authenticator2) {
            jt1.m53777p(authenticator2, "proxyAuthenticator");
            if (!jt1.m53768g(authenticator2, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator2;
            return this;
        }

        @vr2
        public final Builder proxySelector(@vr2 ProxySelector proxySelector2) {
            jt1.m53777p(proxySelector2, "proxySelector");
            if (!jt1.m53768g(proxySelector2, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector2;
            return this;
        }

        @vr2
        public final Builder readTimeout(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            this.readTimeout = nq4.m58707j("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder readTimeout(@vr2 Duration duration) {
            jt1.m53777p(duration, ak4.C1715h.f9299b);
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @vr2
        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@vr2 Authenticator authenticator2) {
            jt1.m53777p(authenticator2, "<set-?>");
            this.authenticator = authenticator2;
        }

        public final void setCache$okhttp(@ss2 Cache cache2) {
            this.cache = cache2;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(@ss2 C6613qv qvVar) {
            this.certificateChainCleaner = qvVar;
        }

        public final void setCertificatePinner$okhttp(@vr2 CertificatePinner certificatePinner2) {
            jt1.m53777p(certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(@vr2 ConnectionPool connectionPool2) {
            jt1.m53777p(connectionPool2, "<set-?>");
            this.connectionPool = connectionPool2;
        }

        public final void setConnectionSpecs$okhttp(@vr2 List<ConnectionSpec> list) {
            jt1.m53777p(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@vr2 CookieJar cookieJar2) {
            jt1.m53777p(cookieJar2, "<set-?>");
            this.cookieJar = cookieJar2;
        }

        public final void setDispatcher$okhttp(@vr2 Dispatcher dispatcher2) {
            jt1.m53777p(dispatcher2, "<set-?>");
            this.dispatcher = dispatcher2;
        }

        public final void setDns$okhttp(@vr2 Dns dns2) {
            jt1.m53777p(dns2, "<set-?>");
            this.dns = dns2;
        }

        public final void setEventListenerFactory$okhttp(@vr2 EventListener.Factory factory) {
            jt1.m53777p(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(@vr2 HostnameVerifier hostnameVerifier2) {
            jt1.m53777p(hostnameVerifier2, "<set-?>");
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(@vr2 List<? extends Protocol> list) {
            jt1.m53777p(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(@ss2 Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final void setProxyAuthenticator$okhttp(@vr2 Authenticator authenticator2) {
            jt1.m53777p(authenticator2, "<set-?>");
            this.proxyAuthenticator = authenticator2;
        }

        public final void setProxySelector$okhttp(@ss2 ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(@ss2 pn3 pn3) {
            this.routeDatabase = pn3;
        }

        public final void setSocketFactory$okhttp(@vr2 SocketFactory socketFactory2) {
            jt1.m53777p(socketFactory2, "<set-?>");
            this.socketFactory = socketFactory2;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@ss2 SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(@ss2 X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @vr2
        public final Builder socketFactory(@vr2 SocketFactory socketFactory2) {
            jt1.m53777p(socketFactory2, "socketFactory");
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                if (!jt1.m53768g(socketFactory2, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory2;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final Builder sslSocketFactory(@vr2 SSLSocketFactory sSLSocketFactory) {
            jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
            if (!jt1.m53768g(sSLSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            k23.C5870a aVar = k23.f31087a;
            X509TrustManager s = aVar.mo39034g().mo31427s(sSLSocketFactory);
            if (s != null) {
                this.x509TrustManagerOrNull = s;
                k23 g = aVar.mo39034g();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                jt1.m53774m(x509TrustManager);
                this.certificateChainCleaner = g.mo39020d(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + aVar.mo39034g() + ", " + "sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        @vr2
        public final Builder sslSocketFactory(@vr2 SSLSocketFactory sSLSocketFactory, @vr2 X509TrustManager x509TrustManager) {
            jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
            jt1.m53777p(x509TrustManager, "trustManager");
            if ((!jt1.m53768g(sSLSocketFactory, this.sslSocketFactoryOrNull)) || (!jt1.m53768g(x509TrustManager, this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = C6613qv.f34367a.mo43731a(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        @vr2
        public final Builder writeTimeout(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            this.writeTimeout = nq4.m58707j("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder writeTimeout(@vr2 Duration duration) {
            jt1.m53777p(duration, ak4.C1715h.f9299b);
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, mo38105d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        @vr2
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @vr2
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        if (r0 != null) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttpClient(@com.onedelhi.secure.vr2 okhttp3.OkHttpClient.Builder r4) {
        /*
            r3 = this;
            java.lang.String r0 = "builder"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            r3.<init>()
            okhttp3.Dispatcher r0 = r4.getDispatcher$okhttp()
            r3.dispatcher = r0
            okhttp3.ConnectionPool r0 = r4.getConnectionPool$okhttp()
            r3.connectionPool = r0
            java.util.List r0 = r4.getInterceptors$okhttp()
            java.util.List r0 = com.onedelhi.secure.nq4.m58696d0(r0)
            r3.interceptors = r0
            java.util.List r0 = r4.getNetworkInterceptors$okhttp()
            java.util.List r0 = com.onedelhi.secure.nq4.m58696d0(r0)
            r3.networkInterceptors = r0
            okhttp3.EventListener$Factory r0 = r4.getEventListenerFactory$okhttp()
            r3.eventListenerFactory = r0
            boolean r0 = r4.getRetryOnConnectionFailure$okhttp()
            r3.retryOnConnectionFailure = r0
            okhttp3.Authenticator r0 = r4.getAuthenticator$okhttp()
            r3.authenticator = r0
            boolean r0 = r4.getFollowRedirects$okhttp()
            r3.followRedirects = r0
            boolean r0 = r4.getFollowSslRedirects$okhttp()
            r3.followSslRedirects = r0
            okhttp3.CookieJar r0 = r4.getCookieJar$okhttp()
            r3.cookieJar = r0
            okhttp3.Cache r0 = r4.getCache$okhttp()
            r3.cache = r0
            okhttp3.Dns r0 = r4.getDns$okhttp()
            r3.dns = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            r3.proxy = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            com.onedelhi.secure.ps2 r0 = com.onedelhi.secure.ps2.f33765a
            goto L_0x0074
        L_0x0067:
            java.net.ProxySelector r0 = r4.getProxySelector$okhttp()
            if (r0 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x0072:
            if (r0 == 0) goto L_0x0064
        L_0x0074:
            r3.proxySelector = r0
            okhttp3.Authenticator r0 = r4.getProxyAuthenticator$okhttp()
            r3.proxyAuthenticator = r0
            javax.net.SocketFactory r0 = r4.getSocketFactory$okhttp()
            r3.socketFactory = r0
            java.util.List r0 = r4.getConnectionSpecs$okhttp()
            r3.connectionSpecs = r0
            java.util.List r1 = r4.getProtocols$okhttp()
            r3.protocols = r1
            javax.net.ssl.HostnameVerifier r1 = r4.getHostnameVerifier$okhttp()
            r3.hostnameVerifier = r1
            int r1 = r4.getCallTimeout$okhttp()
            r3.callTimeoutMillis = r1
            int r1 = r4.getConnectTimeout$okhttp()
            r3.connectTimeoutMillis = r1
            int r1 = r4.getReadTimeout$okhttp()
            r3.readTimeoutMillis = r1
            int r1 = r4.getWriteTimeout$okhttp()
            r3.writeTimeoutMillis = r1
            int r1 = r4.getPingInterval$okhttp()
            r3.pingIntervalMillis = r1
            long r1 = r4.getMinWebSocketMessageToCompress$okhttp()
            r3.minWebSocketMessageToCompress = r1
            com.onedelhi.secure.pn3 r1 = r4.getRouteDatabase$okhttp()
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            com.onedelhi.secure.pn3 r1 = new com.onedelhi.secure.pn3
            r1.<init>()
        L_0x00c4:
            r3.routeDatabase = r1
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L_0x00d2
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00d2
            goto L_0x00e9
        L_0x00d2:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e9
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L_0x00d6
            r2 = 0
        L_0x00e9:
            if (r2 == 0) goto L_0x00f7
            r4 = 0
            r3.sslSocketFactoryOrNull = r4
            r3.certificateChainCleaner = r4
            r3.x509TrustManager = r4
            okhttp3.CertificatePinner r4 = okhttp3.CertificatePinner.DEFAULT
        L_0x00f4:
            r3.certificatePinner = r4
            goto L_0x0146
        L_0x00f7:
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            if (r0 == 0) goto L_0x0116
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            r3.sslSocketFactoryOrNull = r0
            com.onedelhi.secure.qv r0 = r4.getCertificateChainCleaner$okhttp()
            com.onedelhi.secure.jt1.m53774m(r0)
            r3.certificateChainCleaner = r0
            javax.net.ssl.X509TrustManager r1 = r4.getX509TrustManagerOrNull$okhttp()
            com.onedelhi.secure.jt1.m53774m(r1)
            r3.x509TrustManager = r1
            goto L_0x013a
        L_0x0116:
            com.onedelhi.secure.k23$a r0 = com.onedelhi.secure.k23.f31087a
            com.onedelhi.secure.k23 r1 = r0.mo39034g()
            javax.net.ssl.X509TrustManager r1 = r1.mo31426r()
            r3.x509TrustManager = r1
            com.onedelhi.secure.k23 r0 = r0.mo39034g()
            com.onedelhi.secure.jt1.m53774m(r1)
            javax.net.ssl.SSLSocketFactory r0 = r0.mo31425q(r1)
            r3.sslSocketFactoryOrNull = r0
            com.onedelhi.secure.qv$a r0 = com.onedelhi.secure.C6613qv.f34367a
            com.onedelhi.secure.jt1.m53774m(r1)
            com.onedelhi.secure.qv r0 = r0.mo43731a(r1)
            r3.certificateChainCleaner = r0
        L_0x013a:
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            com.onedelhi.secure.jt1.m53774m(r0)
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            goto L_0x00f4
        L_0x0146:
            r3.verifyClientState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void verifyClientState() {
        /*
            r4 = this;
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r0, r1)
            r2 = 0
            boolean r0 = r0.contains(r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00e1
            java.util.List<okhttp3.Interceptor> r0 = r4.networkInterceptors
            java.util.Objects.requireNonNull(r0, r1)
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00c4
            java.util.List<okhttp3.ConnectionSpec> r0 = r4.connectionSpecs
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x002b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002b
        L_0x0029:
            r0 = 1
            goto L_0x0042
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L_0x002f
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0093
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 != 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0089
            com.onedelhi.secure.qv r0 = r4.certificateChainCleaner
            if (r0 != 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x007f
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0075
            okhttp3.CertificatePinner r0 = r4.certificatePinner
            okhttp3.CertificatePinner r2 = okhttp3.CertificatePinner.DEFAULT
            boolean r0 = com.onedelhi.secure.jt1.m53768g(r0, r2)
            if (r0 == 0) goto L_0x006b
            goto L_0x009f
        L_0x006b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 == 0) goto L_0x00b8
            com.onedelhi.secure.qv r0 = r4.certificateChainCleaner
            if (r0 == 0) goto L_0x00ac
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 == 0) goto L_0x00a0
        L_0x009f:
            return
        L_0x00a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null network interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.networkInterceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.interceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.verifyClientState():void");
    }

    @uw1(name = "-deprecated_authenticator")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "authenticator", imports = {}))
    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m74831deprecated_authenticator() {
        return this.authenticator;
    }

    @uw1(name = "-deprecated_cache")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cache", imports = {}))
    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m74832deprecated_cache() {
        return this.cache;
    }

    @uw1(name = "-deprecated_callTimeoutMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "callTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m74833deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @uw1(name = "-deprecated_certificatePinner")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "certificatePinner", imports = {}))
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m74834deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @uw1(name = "-deprecated_connectTimeoutMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "connectTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m74835deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @uw1(name = "-deprecated_connectionPool")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "connectionPool", imports = {}))
    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m74836deprecated_connectionPool() {
        return this.connectionPool;
    }

    @uw1(name = "-deprecated_connectionSpecs")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m74837deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @uw1(name = "-deprecated_cookieJar")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cookieJar", imports = {}))
    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m74838deprecated_cookieJar() {
        return this.cookieJar;
    }

    @uw1(name = "-deprecated_dispatcher")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "dispatcher", imports = {}))
    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m74839deprecated_dispatcher() {
        return this.dispatcher;
    }

    @uw1(name = "-deprecated_dns")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m74840deprecated_dns() {
        return this.dns;
    }

    @uw1(name = "-deprecated_eventListenerFactory")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "eventListenerFactory", imports = {}))
    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m74841deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @uw1(name = "-deprecated_followRedirects")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "followRedirects", imports = {}))
    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m74842deprecated_followRedirects() {
        return this.followRedirects;
    }

    @uw1(name = "-deprecated_followSslRedirects")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "followSslRedirects", imports = {}))
    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m74843deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @uw1(name = "-deprecated_hostnameVerifier")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "hostnameVerifier", imports = {}))
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m74844deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @uw1(name = "-deprecated_interceptors")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "interceptors", imports = {}))
    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m74845deprecated_interceptors() {
        return this.interceptors;
    }

    @uw1(name = "-deprecated_networkInterceptors")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "networkInterceptors", imports = {}))
    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m74846deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @uw1(name = "-deprecated_pingIntervalMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "pingIntervalMillis", imports = {}))
    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m74847deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @uw1(name = "-deprecated_protocols")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m74848deprecated_protocols() {
        return this.protocols;
    }

    @uw1(name = "-deprecated_proxy")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m74849deprecated_proxy() {
        return this.proxy;
    }

    @uw1(name = "-deprecated_proxyAuthenticator")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m74850deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @uw1(name = "-deprecated_proxySelector")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m74851deprecated_proxySelector() {
        return this.proxySelector;
    }

    @uw1(name = "-deprecated_readTimeoutMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "readTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m74852deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @uw1(name = "-deprecated_retryOnConnectionFailure")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "retryOnConnectionFailure", imports = {}))
    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m74853deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @uw1(name = "-deprecated_socketFactory")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m74854deprecated_socketFactory() {
        return this.socketFactory;
    }

    @uw1(name = "-deprecated_sslSocketFactory")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "sslSocketFactory", imports = {}))
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m74855deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @uw1(name = "-deprecated_writeTimeoutMillis")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "writeTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m74856deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @uw1(name = "authenticator")
    @vr2
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @uw1(name = "cache")
    @ss2
    public final Cache cache() {
        return this.cache;
    }

    @uw1(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @uw1(name = "certificateChainCleaner")
    @ss2
    public final C6613qv certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @uw1(name = "certificatePinner")
    @vr2
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @vr2
    public Object clone() {
        return super.clone();
    }

    @uw1(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @uw1(name = "connectionPool")
    @vr2
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @uw1(name = "connectionSpecs")
    @vr2
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @uw1(name = "cookieJar")
    @vr2
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @uw1(name = "dispatcher")
    @vr2
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @uw1(name = "dns")
    @vr2
    public final Dns dns() {
        return this.dns;
    }

    @uw1(name = "eventListenerFactory")
    @vr2
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @uw1(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @uw1(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @vr2
    public final pn3 getRouteDatabase() {
        return this.routeDatabase;
    }

    @uw1(name = "hostnameVerifier")
    @vr2
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @uw1(name = "interceptors")
    @vr2
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @uw1(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @uw1(name = "networkInterceptors")
    @vr2
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @vr2
    public Builder newBuilder() {
        return new Builder(this);
    }

    @vr2
    public Call newCall(@vr2 Request request) {
        jt1.m53777p(request, "request");
        return new dg3(this, request, false);
    }

    @vr2
    public WebSocket newWebSocket(@vr2 Request request, @vr2 WebSocketListener webSocketListener) {
        jt1.m53777p(request, "request");
        jt1.m53777p(webSocketListener, "listener");
        jg3 jg3 = new jg3(fa4.f28227a, request, webSocketListener, new Random(), (long) this.pingIntervalMillis, (ww4) null, this.minWebSocketMessageToCompress);
        jg3.mo38647o(this);
        return jg3;
    }

    @uw1(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @uw1(name = "protocols")
    @vr2
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @uw1(name = "proxy")
    @ss2
    public final Proxy proxy() {
        return this.proxy;
    }

    @uw1(name = "proxyAuthenticator")
    @vr2
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @uw1(name = "proxySelector")
    @vr2
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @uw1(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @uw1(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @uw1(name = "socketFactory")
    @vr2
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @uw1(name = "sslSocketFactory")
    @vr2
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @uw1(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @uw1(name = "x509TrustManager")
    @ss2
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }
}
