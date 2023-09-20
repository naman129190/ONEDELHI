package com.onedelhi.secure;

import com.onedelhi.secure.cm1;
import com.onedelhi.secure.jg3;
import com.onedelhi.secure.q51;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0017\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010:\u001a\u00020\u001b¢\u0006\u0004\bs\u0010tJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010!\u001a\u0004\u0018\u00010 H\u0016J'\u0010K\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0004\bK\u0010LJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016J\b\u0010T\u001a\u00020SH\u0016R\"\u0010U\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R#\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0a0`8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bg\u0010O\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020\u001d8@X\u0004¢\u0006\u0006\u001a\u0004\bl\u0010XR\u0017\u0010o\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lcom/onedelhi/secure/eg3;", "Lcom/onedelhi/secure/cm1$d;", "Lokhttp3/Connection;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "Lcom/onedelhi/secure/un4;", "m", "k", "Lcom/onedelhi/secure/v50;", "connectionSpecSelector", "pingIntervalMillis", "p", "H", "l", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "n", "o", "", "Lokhttp3/Route;", "candidates", "", "D", "I", "Lokhttp3/Handshake;", "handshake", "h", "C", "()V", "B", "v", "connectionRetryEnabled", "i", "Lokhttp3/Address;", "address", "routes", "w", "(Lokhttp3/Address;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "Lcom/onedelhi/secure/hg3;", "chain", "Lcom/onedelhi/secure/rw0;", "z", "(Lokhttp3/OkHttpClient;Lcom/onedelhi/secure/hg3;)Lcom/onedelhi/secure/rw0;", "Lcom/onedelhi/secure/qw0;", "exchange", "Lcom/onedelhi/secure/jg3$d;", "A", "(Lcom/onedelhi/secure/qw0;)Lcom/onedelhi/secure/jg3$d;", "route", "g", "Ljava/net/Socket;", "socket", "doExtensiveChecks", "x", "Lcom/onedelhi/secure/fm1;", "stream", "b", "Lcom/onedelhi/secure/cm1;", "connection", "Lcom/onedelhi/secure/kv3;", "settings", "a", "failedRoute", "Ljava/io/IOException;", "failure", "j", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "Lcom/onedelhi/secure/dg3;", "e", "J", "(Lcom/onedelhi/secure/dg3;Ljava/io/IOException;)V", "Lokhttp3/Protocol;", "protocol", "", "toString", "noNewExchanges", "Z", "t", "()Z", "F", "(Z)V", "routeFailureCount", "u", "()I", "G", "(I)V", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "q", "()Ljava/util/List;", "", "idleAtNs", "s", "()J", "E", "(J)V", "y", "isMultiplexed", "Lcom/onedelhi/secure/gg3;", "connectionPool", "Lcom/onedelhi/secure/gg3;", "r", "()Lcom/onedelhi/secure/gg3;", "<init>", "(Lcom/onedelhi/secure/gg3;Lokhttp3/Route;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class eg3 extends cm1.C4880d implements Connection {

    /* renamed from: a */
    public static final C5138a f27896a = new C5138a((wg0) null);

    /* renamed from: a */
    public static final String f27897a = "throw with null exception";

    /* renamed from: b */
    public static final long f27898b = 10000000000L;

    /* renamed from: e */
    public static final int f27899e = 21;

    /* renamed from: a */
    public int f27900a;

    /* renamed from: a */
    public long f27901a = Long.MAX_VALUE;

    /* renamed from: a */
    public cm1 f27902a;
    @vr2

    /* renamed from: a */
    public final gg3 f27903a;

    /* renamed from: a */
    public C6785so f27904a;

    /* renamed from: a */
    public C6893to f27905a;

    /* renamed from: a */
    public Socket f27906a;
    @vr2

    /* renamed from: a */
    public final List<Reference<dg3>> f27907a = new ArrayList();

    /* renamed from: a */
    public Handshake f27908a;

    /* renamed from: a */
    public Protocol f27909a;

    /* renamed from: a */
    public final Route f27910a;

    /* renamed from: a */
    public boolean f27911a;

    /* renamed from: b */
    public int f27912b;

    /* renamed from: b */
    public Socket f27913b;

    /* renamed from: b */
    public boolean f27914b;

    /* renamed from: c */
    public int f27915c;

    /* renamed from: d */
    public int f27916d = 1;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/eg3$a;", "", "Lcom/onedelhi/secure/gg3;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lcom/onedelhi/secure/eg3;", "a", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.eg3$a */
    public static final class C5138a {
        public C5138a() {
        }

        public /* synthetic */ C5138a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final eg3 mo35274a(@vr2 gg3 gg3, @vr2 Route route, @vr2 Socket socket, long j) {
            jt1.m53777p(gg3, "connectionPool");
            jt1.m53777p(route, "route");
            jt1.m53777p(socket, "socket");
            eg3 eg3 = new eg3(gg3, route);
            eg3.f27913b = socket;
            eg3.mo35243E(j);
            return eg3;
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo38105d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.eg3$b */
    public static final class C5139b extends d12 implements cc1<List<? extends Certificate>> {

        /* renamed from: a */
        public final /* synthetic */ Address f27917a;

        /* renamed from: a */
        public final /* synthetic */ CertificatePinner f27918a;

        /* renamed from: a */
        public final /* synthetic */ Handshake f27919a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5139b(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.f27918a = certificatePinner;
            this.f27919a = handshake;
            this.f27917a = address;
        }

        @vr2
        public final List<Certificate> invoke() {
            C6613qv certificateChainCleaner$okhttp = this.f27918a.getCertificateChainCleaner$okhttp();
            jt1.m53774m(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.mo43140a(this.f27919a.peerCertificates(), this.f27917a.url().host());
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo38105d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.eg3$c */
    public static final class C5140c extends d12 implements cc1<List<? extends X509Certificate>> {

        /* renamed from: a */
        public final /* synthetic */ eg3 f27920a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5140c(eg3 eg3) {
            super(0);
            this.f27920a = eg3;
        }

        @vr2
        public final List<X509Certificate> invoke() {
            Handshake c = this.f27920a.f27908a;
            jt1.m53774m(c);
            List<Certificate> peerCertificates = c.peerCertificates();
            ArrayList arrayList = new ArrayList(t00.m65073Z(peerCertificates, 10));
            for (Certificate certificate : peerCertificates) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/eg3$d", "Lcom/onedelhi/secure/jg3$d;", "Lcom/onedelhi/secure/un4;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.eg3$d */
    public static final class C5141d extends jg3.C5818d {

        /* renamed from: a */
        public final /* synthetic */ qw0 f27921a;

        /* renamed from: b */
        public final /* synthetic */ C6785so f27922b;

        /* renamed from: b */
        public final /* synthetic */ C6893to f27923b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5141d(qw0 qw0, C6893to toVar, C6785so soVar, boolean z, C6893to toVar2, C6785so soVar2) {
            super(z, toVar2, soVar2);
            this.f27921a = qw0;
            this.f27923b = toVar;
            this.f27922b = soVar;
        }

        public void close() {
            this.f27921a.mo43735a(-1, true, true, null);
        }
    }

    public eg3(@vr2 gg3 gg3, @vr2 Route route) {
        jt1.m53777p(gg3, "connectionPool");
        jt1.m53777p(route, "route");
        this.f27903a = gg3;
        this.f27910a = route;
    }

    @vr2
    /* renamed from: A */
    public final jg3.C5818d mo35239A(@vr2 qw0 qw0) throws SocketException {
        jt1.m53777p(qw0, "exchange");
        Socket socket = this.f27913b;
        jt1.m53774m(socket);
        C6893to toVar = this.f27905a;
        jt1.m53774m(toVar);
        C6785so soVar = this.f27904a;
        jt1.m53774m(soVar);
        socket.setSoTimeout(0);
        mo35241C();
        return new C5141d(qw0, toVar, soVar, true, toVar, soVar);
    }

    /* renamed from: B */
    public final synchronized void mo35240B() {
        this.f27914b = true;
    }

    /* renamed from: C */
    public final synchronized void mo35241C() {
        this.f27911a = true;
    }

    /* renamed from: D */
    public final boolean mo35242D(List<Route> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.proxy().type() == Proxy.Type.DIRECT && this.f27910a.proxy().type() == Proxy.Type.DIRECT && jt1.m53768g(this.f27910a.socketAddress(), route.socketAddress())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo35243E(long j) {
        this.f27901a = j;
    }

    /* renamed from: F */
    public final void mo35244F(boolean z) {
        this.f27911a = z;
    }

    /* renamed from: G */
    public final void mo35245G(int i) {
        this.f27900a = i;
    }

    /* renamed from: H */
    public final void mo35246H(int i) throws IOException {
        Socket socket = this.f27913b;
        jt1.m53774m(socket);
        C6893to toVar = this.f27905a;
        jt1.m53774m(toVar);
        C6785so soVar = this.f27904a;
        jt1.m53774m(soVar);
        socket.setSoTimeout(0);
        cm1 a = new cm1.C4878b(true, fa4.f28227a).mo33869y(socket, this.f27910a.address().url().host(), toVar, soVar).mo33855k(this).mo33856l(i).mo33845a();
        this.f27902a = a;
        this.f27916d = cm1.f26891a.mo33870a().mo39534f();
        cm1.m44015U1(a, false, (fa4) null, 3, (Object) null);
    }

    /* renamed from: I */
    public final boolean mo35247I(HttpUrl httpUrl) {
        Handshake handshake;
        if (!nq4.f32734a || Thread.holdsLock(this)) {
            HttpUrl url = this.f27910a.address().url();
            if (httpUrl.port() != url.port()) {
                return false;
            }
            if (jt1.m53768g(httpUrl.host(), url.host())) {
                return true;
            }
            if (this.f27914b || (handshake = this.f27908a) == null) {
                return false;
            }
            jt1.m53774m(handshake);
            return mo35250h(httpUrl, handshake);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: J */
    public final synchronized void mo35248J(@vr2 dg3 dg3, @ss2 IOException iOException) {
        int i;
        jt1.m53777p(dg3, es2.f11366Q);
        if (iOException instanceof k44) {
            if (((k44) iOException).f31102a == hv0.REFUSED_STREAM) {
                int i2 = this.f27915c + 1;
                this.f27915c = i2;
                if (i2 > 1) {
                    this.f27911a = true;
                    i = this.f27900a;
                }
            } else if (((k44) iOException).f31102a != hv0.CANCEL || !dg3.isCanceled()) {
                this.f27911a = true;
                i = this.f27900a;
            }
        } else if (!mo35272y() || (iOException instanceof u50)) {
            this.f27911a = true;
            if (this.f27912b == 0) {
                if (iOException != null) {
                    mo35253j(dg3.mo34431j(), this.f27910a, iOException);
                }
                i = this.f27900a;
            }
        }
        this.f27900a = i + 1;
    }

    /* renamed from: a */
    public synchronized void mo33871a(@vr2 cm1 cm1, @vr2 kv3 kv3) {
        jt1.m53777p(cm1, dm1.f27486a);
        jt1.m53777p(kv3, uh3.f36123f);
        this.f27916d = kv3.mo39534f();
    }

    /* renamed from: b */
    public void mo33872b(@vr2 fm1 fm1) throws IOException {
        jt1.m53777p(fm1, "stream");
        fm1.mo36091d(hv0.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: g */
    public final void mo35249g() {
        Socket socket = this.f27906a;
        if (socket != null) {
            nq4.m58714n(socket);
        }
    }

    /* renamed from: h */
    public final boolean mo35250h(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            eu2 eu2 = eu2.f28100a;
            String host = httpUrl.host();
            Certificate certificate = peerCertificates.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (eu2.mo35638e(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    @ss2
    public Handshake handshake() {
        return this.f27908a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35252i(int r17, int r18, int r19, int r20, boolean r21, @com.onedelhi.secure.vr2 okhttp3.Call r22, @com.onedelhi.secure.vr2 okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            com.onedelhi.secure.jt1.m53777p(r8, r0)
            java.lang.String r0 = "eventListener"
            com.onedelhi.secure.jt1.m53777p(r9, r0)
            okhttp3.Protocol r0 = r7.f27909a
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015a
            okhttp3.Route r0 = r7.f27910a
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            com.onedelhi.secure.v50 r11 = new com.onedelhi.secure.v50
            r11.<init>(r0)
            okhttp3.Route r1 = r7.f27910a
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x0086
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            okhttp3.Route r0 = r7.f27910a
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            com.onedelhi.secure.k23$a r1 = com.onedelhi.secure.k23.f31087a
            com.onedelhi.secure.k23 r1 = r1.mo39034g()
            boolean r1 = r1.mo39025l(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            com.onedelhi.secure.rn3 r1 = new com.onedelhi.secure.rn3
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            com.onedelhi.secure.rn3 r0 = new com.onedelhi.secure.rn3
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            okhttp3.Route r0 = r7.f27910a
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014d
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            okhttp3.Route r0 = r7.f27910a     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.mo35256m(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.f27906a     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.mo35254k(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.mo35259p(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r0 = r7.f27910a     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r1 = r7.f27910a     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Protocol r2 = r7.f27909a     // Catch:{ IOException -> 0x00f9 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            okhttp3.Route r0 = r7.f27910a
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.f27906a
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            com.onedelhi.secure.rn3 r0 = new com.onedelhi.secure.rn3
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.f27901a = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.f27913b
            if (r1 == 0) goto L_0x010b
            com.onedelhi.secure.nq4.m58714n(r1)
        L_0x010b:
            java.net.Socket r1 = r7.f27906a
            if (r1 == 0) goto L_0x0112
            com.onedelhi.secure.nq4.m58714n(r1)
        L_0x0112:
            r7.f27913b = r12
            r7.f27906a = r12
            r7.f27905a = r12
            r7.f27904a = r12
            r7.f27908a = r12
            r7.f27909a = r12
            r7.f27902a = r12
            r7.f27916d = r10
            okhttp3.Route r1 = r7.f27910a
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.f27910a
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x013f
            com.onedelhi.secure.rn3 r13 = new com.onedelhi.secure.rn3
            r13.<init>(r0)
            goto L_0x0142
        L_0x013f:
            r13.mo43958a(r0)
        L_0x0142:
            if (r21 == 0) goto L_0x014c
            boolean r0 = r11.mo46013b(r0)
            if (r0 == 0) goto L_0x014c
            goto L_0x009a
        L_0x014c:
            throw r13
        L_0x014d:
            com.onedelhi.secure.rn3 r0 = new com.onedelhi.secure.rn3
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eg3.mo35252i(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    /* renamed from: j */
    public final void mo35253j(@vr2 OkHttpClient okHttpClient, @vr2 Route route, @vr2 IOException iOException) {
        jt1.m53777p(okHttpClient, "client");
        jt1.m53777p(route, "failedRoute");
        jt1.m53777p(iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().mo42831b(route);
    }

    /* renamed from: k */
    public final void mo35254k(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        int i3;
        Proxy proxy = this.f27910a.proxy();
        Address address = this.f27910a.address();
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = fg3.f28443a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = address.socketFactory().createSocket();
            jt1.m53774m(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f27906a = socket;
        eventListener.connectStart(call, this.f27910a.socketAddress(), proxy);
        socket.setSoTimeout(i2);
        try {
            k23.f31087a.mo39034g().mo39022g(socket, this.f27910a.socketAddress(), i);
            try {
                this.f27905a = gu2.m49835d(gu2.m49845n(socket));
                this.f27904a = gu2.m49834c(gu2.m49840i(socket));
            } catch (NullPointerException e) {
                if (jt1.m53768g(e.getMessage(), f27897a)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f27910a.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35255l(com.onedelhi.secure.v50 r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.f27910a
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x017f }
            java.net.Socket r3 = r10.f27906a     // Catch:{ all -> 0x017f }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x017f }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x017f }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ all -> 0x017f }
            int r5 = r5.port()     // Catch:{ all -> 0x017f }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0177
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x017f }
            okhttp3.ConnectionSpec r11 = r11.mo46012a(r1)     // Catch:{ all -> 0x0174 }
            boolean r3 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0174 }
            if (r3 == 0) goto L_0x0048
            com.onedelhi.secure.k23$a r3 = com.onedelhi.secure.k23.f31087a     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.k23 r3 = r3.mo39034g()     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0174 }
            java.util.List r5 = r0.protocols()     // Catch:{ all -> 0x0174 }
            r3.mo31422f(r1, r4, r5)     // Catch:{ all -> 0x0174 }
        L_0x0048:
            r1.startHandshake()     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0174 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "sslSocketSession"
            com.onedelhi.secure.jt1.m53776o(r3, r5)     // Catch:{ all -> 0x0174 }
            okhttp3.Handshake r4 = r4.get(r3)     // Catch:{ all -> 0x0174 }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.jt1.m53774m(r5)     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r7.host()     // Catch:{ all -> 0x0174 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0174 }
            if (r3 != 0) goto L_0x0108
            java.util.List r11 = r4.peerCertificates()     // Catch:{ all -> 0x0174 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0174 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00e4
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0174 }
            if (r11 != 0) goto L_0x0089
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x0174 }
            throw r11     // Catch:{ all -> 0x0174 }
        L_0x0089:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r4.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.pin(r11)     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "cert.subjectDN"
            com.onedelhi.secure.jt1.m53776o(r0, r5)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0174 }
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.eu2 r0 = com.onedelhi.secure.eu2.f28100a     // Catch:{ all -> 0x0174 }
            java.util.List r11 = r0.mo35634a(r11)     // Catch:{ all -> 0x0174 }
            r4.append(r11)     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = com.onedelhi.secure.m54.m56950r(r11, r2, r6, r2)     // Catch:{ all -> 0x0174 }
            r3.<init>(r11)     // Catch:{ all -> 0x0174 }
            throw r3     // Catch:{ all -> 0x0174 }
        L_0x00e4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0174 }
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0174 }
            r11.<init>(r0)     // Catch:{ all -> 0x0174 }
            throw r11     // Catch:{ all -> 0x0174 }
        L_0x0108:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.jt1.m53774m(r3)     // Catch:{ all -> 0x0174 }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x0174 }
            okhttp3.TlsVersion r6 = r4.tlsVersion()     // Catch:{ all -> 0x0174 }
            okhttp3.CipherSuite r7 = r4.cipherSuite()     // Catch:{ all -> 0x0174 }
            java.util.List r8 = r4.localCertificates()     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.eg3$b r9 = new com.onedelhi.secure.eg3$b     // Catch:{ all -> 0x0174 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0174 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0174 }
            r10.f27908a = r5     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.eg3$c r4 = new com.onedelhi.secure.eg3$c     // Catch:{ all -> 0x0174 }
            r4.<init>(r10)     // Catch:{ all -> 0x0174 }
            r3.check$okhttp(r0, r4)     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0174 }
            if (r11 == 0) goto L_0x0147
            com.onedelhi.secure.k23$a r11 = com.onedelhi.secure.k23.f31087a     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.k23 r11 = r11.mo39034g()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = r11.mo31423j(r1)     // Catch:{ all -> 0x0174 }
        L_0x0147:
            r10.f27913b = r1     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.x04 r11 = com.onedelhi.secure.gu2.m49845n(r1)     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.to r11 = com.onedelhi.secure.gu2.m49835d(r11)     // Catch:{ all -> 0x0174 }
            r10.f27905a = r11     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.oz3 r11 = com.onedelhi.secure.gu2.m49840i(r1)     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.so r11 = com.onedelhi.secure.gu2.m49834c(r11)     // Catch:{ all -> 0x0174 }
            r10.f27904a = r11     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x0166
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x0174 }
            okhttp3.Protocol r11 = r11.get(r2)     // Catch:{ all -> 0x0174 }
            goto L_0x0168
        L_0x0166:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x0174 }
        L_0x0168:
            r10.f27909a = r11     // Catch:{ all -> 0x0174 }
            com.onedelhi.secure.k23$a r11 = com.onedelhi.secure.k23.f31087a
            com.onedelhi.secure.k23 r11 = r11.mo39034g()
            r11.mo39019c(r1)
            return
        L_0x0174:
            r11 = move-exception
            r2 = r1
            goto L_0x0180
        L_0x0177:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x017f }
            throw r11     // Catch:{ all -> 0x017f }
        L_0x017f:
            r11 = move-exception
        L_0x0180:
            if (r2 == 0) goto L_0x018b
            com.onedelhi.secure.k23$a r0 = com.onedelhi.secure.k23.f31087a
            com.onedelhi.secure.k23 r0 = r0.mo39034g()
            r0.mo39019c(r2)
        L_0x018b:
            if (r2 == 0) goto L_0x0190
            com.onedelhi.secure.nq4.m58714n(r2)
        L_0x0190:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eg3.mo35255l(com.onedelhi.secure.v50):void");
    }

    /* renamed from: m */
    public final void mo35256m(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request o = mo35258o();
        HttpUrl url = o.url();
        int i4 = 0;
        while (i4 < 21) {
            mo35254k(i, i2, call, eventListener);
            o = mo35257n(i2, i3, o, url);
            if (o != null) {
                Socket socket = this.f27906a;
                if (socket != null) {
                    nq4.m58714n(socket);
                }
                this.f27906a = null;
                this.f27904a = null;
                this.f27905a = null;
                eventListener.connectEnd(call, this.f27910a.socketAddress(), this.f27910a.proxy(), (Protocol) null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    public final Request mo35257n(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + nq4.m58692b0(httpUrl, true) + " HTTP/1.1";
        while (true) {
            C6893to toVar = this.f27905a;
            jt1.m53774m(toVar);
            C6785so soVar = this.f27904a;
            jt1.m53774m(soVar);
            am1 am1 = new am1((OkHttpClient) null, this, toVar, soVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            toVar.timeout().mo40562i((long) i, timeUnit);
            soVar.timeout().mo40562i((long) i2, timeUnit);
            am1.mo30979C(request.headers(), str);
            am1.mo30981b();
            Response.Builder g = am1.mo30987g(false);
            jt1.m53774m(g);
            Response build = g.request(request).build();
            am1.mo30978B(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.f27910a.address().proxyAuthenticator().authenticate(this.f27910a, build);
                    if (authenticate == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (t54.m65410K1("close", Response.header$default(build, "Connection", (String) null, 2, (Object) null), true)) {
                        return authenticate;
                    } else {
                        request = authenticate;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else if (toVar.mo31682e().mo31685f2() && soVar.mo31682e().mo31685f2()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: o */
    public final Request mo35258o() throws IOException {
        Request build = new Request.Builder().url(this.f27910a.address().url()).method(q51.C6513a.f33999B, (RequestBody) null).header("Host", nq4.m58692b0(this.f27910a.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", nq4.f32736b).build();
        Request authenticate = this.f27910a.address().proxyAuthenticator().authenticate(this.f27910a, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(nq4.f32733a).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate != null ? authenticate : build;
    }

    /* renamed from: p */
    public final void mo35259p(v50 v50, int i, Call call, EventListener eventListener) throws IOException {
        if (this.f27910a.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.f27910a.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.f27913b = this.f27906a;
                this.f27909a = protocol;
                mo35246H(i);
                return;
            }
            this.f27913b = this.f27906a;
            this.f27909a = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        mo35255l(v50);
        eventListener.secureConnectEnd(call, this.f27908a);
        if (this.f27909a == Protocol.HTTP_2) {
            mo35246H(i);
        }
    }

    @vr2
    public Protocol protocol() {
        Protocol protocol = this.f27909a;
        jt1.m53774m(protocol);
        return protocol;
    }

    @vr2
    /* renamed from: q */
    public final List<Reference<dg3>> mo35261q() {
        return this.f27907a;
    }

    @vr2
    /* renamed from: r */
    public final gg3 mo35262r() {
        return this.f27903a;
    }

    @vr2
    public Route route() {
        return this.f27910a;
    }

    /* renamed from: s */
    public final long mo35264s() {
        return this.f27901a;
    }

    @vr2
    public Socket socket() {
        Socket socket = this.f27913b;
        jt1.m53774m(socket);
        return socket;
    }

    /* renamed from: t */
    public final boolean mo35266t() {
        return this.f27911a;
    }

    @vr2
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f27910a.address().url().host());
        sb.append(':');
        sb.append(this.f27910a.address().url().port());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f27910a.proxy());
        sb.append(" hostAddress=");
        sb.append(this.f27910a.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f27908a;
        if (handshake == null || (obj = handshake.cipherSuite()) == null) {
            obj = tk0.f20956o;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f27909a);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final int mo35268u() {
        return this.f27900a;
    }

    /* renamed from: v */
    public final synchronized void mo35269v() {
        this.f27912b++;
    }

    /* renamed from: w */
    public final boolean mo35270w(@vr2 Address address, @ss2 List<Route> list) {
        jt1.m53777p(address, "address");
        if (nq4.f32734a && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (this.f27907a.size() >= this.f27916d || this.f27911a || !this.f27910a.address().equalsNonHost$okhttp(address)) {
            return false;
        } else {
            if (jt1.m53768g(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.f27902a == null || list == null || !mo35242D(list) || address.hostnameVerifier() != eu2.f28100a || !mo35247I(address.url())) {
                return false;
            }
            try {
                CertificatePinner certificatePinner = address.certificatePinner();
                jt1.m53774m(certificatePinner);
                String host = address.url().host();
                Handshake handshake = handshake();
                jt1.m53774m(handshake);
                certificatePinner.check(host, (List<? extends Certificate>) handshake.peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    /* renamed from: x */
    public final boolean mo35271x(boolean z) {
        long j;
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f27906a;
            jt1.m53774m(socket);
            Socket socket2 = this.f27913b;
            jt1.m53774m(socket2);
            C6893to toVar = this.f27905a;
            jt1.m53774m(toVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            cm1 cm1 = this.f27902a;
            if (cm1 != null) {
                return cm1.mo33819c1(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f27901a;
            }
            if (j < f27898b || !z) {
                return true;
            }
            return nq4.m58673K(socket2, toVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: y */
    public final boolean mo35272y() {
        return this.f27902a != null;
    }

    @vr2
    /* renamed from: z */
    public final rw0 mo35273z(@vr2 OkHttpClient okHttpClient, @vr2 hg3 hg3) throws SocketException {
        jt1.m53777p(okHttpClient, "client");
        jt1.m53777p(hg3, "chain");
        Socket socket = this.f27913b;
        jt1.m53774m(socket);
        C6893to toVar = this.f27905a;
        jt1.m53774m(toVar);
        C6785so soVar = this.f27904a;
        jt1.m53774m(soVar);
        cm1 cm1 = this.f27902a;
        if (cm1 != null) {
            return new dm1(okHttpClient, this, hg3, cm1);
        }
        socket.setSoTimeout(hg3.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        toVar.timeout().mo40562i((long) hg3.mo37316f(), timeUnit);
        soVar.timeout().mo40562i((long) hg3.mo37318h(), timeUnit);
        return new am1(okHttpClient, this, toVar, soVar);
    }
}
