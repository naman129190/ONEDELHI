package com.onedelhi.secure;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016¨\u00062"}, d2 = {"Lcom/onedelhi/secure/k23;", "", "", "i", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "Lcom/onedelhi/secure/ax1;", "protocols", "Lcom/onedelhi/secure/un4;", "f", "c", "j", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "g", "message", "level", "", "t", "m", "", "l", "closer", "k", "stackTrace", "o", "trustManager", "Lcom/onedelhi/secure/qv;", "d", "Lcom/onedelhi/secure/xi4;", "e", "q", "toString", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public class k23 {

    /* renamed from: a */
    public static final int f31086a = 4;

    /* renamed from: a */
    public static final C5870a f31087a;

    /* renamed from: a */
    public static volatile k23 f31088a = null;

    /* renamed from: a */
    public static final Logger f31089a = Logger.getLogger(OkHttpClient.class.getName());

    /* renamed from: b */
    public static final int f31090b = 5;

    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/k23$a;", "", "Lcom/onedelhi/secure/k23;", "g", "platform", "Lcom/onedelhi/secure/un4;", "l", "", "Lokhttp3/Protocol;", "protocols", "", "b", "", "c", "f", "d", "e", "", "h", "()Z", "isAndroid", "j", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lcom/onedelhi/secure/k23;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.k23$a */
    public static final class C5870a {
        public C5870a() {
        }

        public /* synthetic */ C5870a(wg0 wg0) {
            this();
        }

        /* renamed from: m */
        public static /* synthetic */ void m54042m(C5870a aVar, k23 k23, int i, Object obj) {
            if ((i & 1) != 0) {
                k23 = aVar.mo39033f();
            }
            aVar.mo39039l(k23);
        }

        @vr2
        /* renamed from: b */
        public final List<String> mo39029b(@vr2 List<? extends Protocol> list) {
            jt1.m53777p(list, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(t00.m65073Z(arrayList, 10));
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        @vr2
        /* renamed from: c */
        public final byte[] mo39030c(@vr2 List<? extends Protocol> list) {
            jt1.m53777p(list, "protocols");
            C6205no noVar = new C6205no();
            for (String next : mo39029b(list)) {
                noVar.mo41230L0(next.length());
                noVar.mo41279n(next);
            }
            return noVar.mo31713u2();
        }

        /* renamed from: d */
        public final k23 mo39031d() {
            C6749s5.f34916a.mo44202b();
            k23 a = C5967l5.f31564a.mo39674a();
            if (a != null) {
                return a;
            }
            k23 a2 = C7306y5.f37800a.mo47588a();
            jt1.m53774m(a2);
            return a2;
        }

        /* renamed from: e */
        public final k23 mo39032e() {
            bw2 a;
            C6976un a2;
            b60 c;
            if (mo39037j() && (c = b60.f26176a.mo31429c()) != null) {
                return c;
            }
            if (mo39036i() && (a2 = C6976un.f36202a.mo45774a()) != null) {
                return a2;
            }
            if (mo39038k() && (a = bw2.f26554a.mo32179a()) != null) {
                return a;
            }
            pu1 a3 = pu1.f33780a.mo42919a();
            if (a3 != null) {
                return a3;
            }
            k23 a4 = ou1.f33177a.mo41968a();
            return a4 != null ? a4 : new k23();
        }

        /* renamed from: f */
        public final k23 mo39033f() {
            return mo39035h() ? mo39031d() : mo39032e();
        }

        @zw1
        @vr2
        /* renamed from: g */
        public final k23 mo39034g() {
            return k23.f31088a;
        }

        /* renamed from: h */
        public final boolean mo39035h() {
            return jt1.m53768g("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean mo39036i() {
            Provider provider = Security.getProviders()[0];
            jt1.m53776o(provider, "Security.getProviders()[0]");
            return jt1.m53768g("BC", provider.getName());
        }

        /* renamed from: j */
        public final boolean mo39037j() {
            Provider provider = Security.getProviders()[0];
            jt1.m53776o(provider, "Security.getProviders()[0]");
            return jt1.m53768g("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        public final boolean mo39038k() {
            Provider provider = Security.getProviders()[0];
            jt1.m53776o(provider, "Security.getProviders()[0]");
            return jt1.m53768g("OpenJSSE", provider.getName());
        }

        /* renamed from: l */
        public final void mo39039l(@vr2 k23 k23) {
            jt1.m53777p(k23, "platform");
            k23.f31088a = k23;
        }
    }

    static {
        C5870a aVar = new C5870a((wg0) null);
        f31087a = aVar;
        f31088a = aVar.mo39033f();
    }

    @zw1
    @vr2
    /* renamed from: h */
    public static final k23 m54024h() {
        return f31087a.mo39034g();
    }

    /* renamed from: n */
    public static /* synthetic */ void m54025n(k23 k23, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            k23.mo39026m(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: c */
    public void mo39019c(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
    }

    @vr2
    /* renamed from: d */
    public C6613qv mo39020d(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        return new C7493zj(mo39021e(x509TrustManager));
    }

    @vr2
    /* renamed from: e */
    public xi4 mo39021e(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        jt1.m53776o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C4776ck((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: f */
    public void mo31422f(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<Protocol> list) {
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
    }

    /* renamed from: g */
    public void mo39022g(@vr2 Socket socket, @vr2 InetSocketAddress inetSocketAddress, int i) throws IOException {
        jt1.m53777p(socket, "socket");
        jt1.m53777p(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    @vr2
    /* renamed from: i */
    public final String mo39023i() {
        return "OkHttp";
    }

    @ss2
    /* renamed from: j */
    public String mo31423j(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        return null;
    }

    @ss2
    /* renamed from: k */
    public Object mo39024k(@vr2 String str) {
        jt1.m53777p(str, "closer");
        if (f31089a.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo39025l(@vr2 String str) {
        jt1.m53777p(str, "hostname");
        return true;
    }

    /* renamed from: m */
    public void mo39026m(@vr2 String str, int i, @ss2 Throwable th) {
        jt1.m53777p(str, "message");
        f31089a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: o */
    public void mo39027o(@vr2 String str, @ss2 Object obj) {
        jt1.m53777p(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo39026m(str, 5, (Throwable) obj);
    }

    @vr2
    /* renamed from: p */
    public SSLContext mo31424p() {
        SSLContext instance = SSLContext.getInstance("TLS");
        jt1.m53776o(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    @vr2
    /* renamed from: q */
    public SSLSocketFactory mo31425q(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        try {
            SSLContext p = mo31424p();
            p.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = p.getSocketFactory();
            jt1.m53776o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @vr2
    /* renamed from: r */
    public X509TrustManager mo31426r() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        jt1.m53776o(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        jt1.m53774m(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        jt1.m53776o(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @ss2
    /* renamed from: s */
    public X509TrustManager mo31427s(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            jt1.m53776o(cls, "sslContextClass");
            Object R = nq4.m58680R(sSLSocketFactory, cls, "context");
            if (R != null) {
                return (X509TrustManager) nq4.m58680R(R, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!(!jt1.m53768g(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException"))) {
                return null;
            }
            throw e;
        }
    }

    @vr2
    public String toString() {
        String simpleName = getClass().getSimpleName();
        jt1.m53776o(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
