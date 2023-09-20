package com.onedelhi.secure;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.n24;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b%\u0010&J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\fH\u0016¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/y5;", "Lcom/onedelhi/secure/k23;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lcom/onedelhi/secure/un4;", "g", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lcom/onedelhi/secure/ax1;", "protocols", "f", "j", "closer", "", "k", "message", "stackTrace", "o", "", "l", "trustManager", "Lcom/onedelhi/secure/qv;", "d", "Lcom/onedelhi/secure/xi4;", "e", "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
@e84
/* renamed from: com.onedelhi.secure.y5 */
public final class C7306y5 extends k23 {

    /* renamed from: a */
    public static final C7307a f37800a = new C7307a((wg0) null);

    /* renamed from: a */
    public static final boolean f37801a;

    /* renamed from: a */
    public final C5338fz f37802a;

    /* renamed from: a */
    public final List<s04> f37803a;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/y5$a;", "", "Lcom/onedelhi/secure/k23;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.y5$a */
    public static final class C7307a {
        public C7307a() {
        }

        public /* synthetic */ C7307a(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: a */
        public final k23 mo47588a() {
            if (mo47589b()) {
                return new C7306y5();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo47589b() {
            return C7306y5.f37801a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/y5$b;", "Lcom/onedelhi/secure/xi4;", "Ljava/security/cert/X509Certificate;", "cert", "a", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "c", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.y5$b */
    public static final class C7308b implements xi4 {

        /* renamed from: a */
        public final Method f37804a;

        /* renamed from: a */
        public final X509TrustManager f37805a;

        public C7308b(@vr2 X509TrustManager x509TrustManager, @vr2 Method method) {
            jt1.m53777p(x509TrustManager, "trustManager");
            jt1.m53777p(method, "findByIssuerAndSignatureMethod");
            this.f37805a = x509TrustManager;
            this.f37804a = method;
        }

        /* renamed from: e */
        public static /* synthetic */ C7308b m71272e(C7308b bVar, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = bVar.f37805a;
            }
            if ((i & 2) != 0) {
                method = bVar.f37804a;
            }
            return bVar.mo47592d(x509TrustManager, method);
        }

        @ss2
        /* renamed from: a */
        public X509Certificate mo32411a(@vr2 X509Certificate x509Certificate) {
            jt1.m53777p(x509Certificate, "cert");
            try {
                Object invoke = this.f37804a.invoke(this.f37805a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: b */
        public final X509TrustManager mo47590b() {
            return this.f37805a;
        }

        /* renamed from: c */
        public final Method mo47591c() {
            return this.f37804a;
        }

        @vr2
        /* renamed from: d */
        public final C7308b mo47592d(@vr2 X509TrustManager x509TrustManager, @vr2 Method method) {
            jt1.m53777p(x509TrustManager, "trustManager");
            jt1.m53777p(method, "findByIssuerAndSignatureMethod");
            return new C7308b(x509TrustManager, method);
        }

        public boolean equals(@ss2 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7308b)) {
                return false;
            }
            C7308b bVar = (C7308b) obj;
            return jt1.m53768g(this.f37805a, bVar.f37805a) && jt1.m53768g(this.f37804a, bVar.f37804a);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f37805a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f37804a;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        @vr2
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f37805a + ", findByIssuerAndSignatureMethod=" + this.f37804a + pl2.f33727d;
        }
    }

    static {
        boolean z = false;
        if (k23.f31087a.mo39035h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f37801a = z;
    }

    public C7306y5() {
        List O = s00.m64046O(n24.C6165a.m57813b(n24.f32347a, (String) null, 1, (Object) null), new ci0(C4627b6.f26168a.mo31419d()), new ci0(c60.f26654a.mo32258a()), new ci0(C7060vn.f36595a.mo46205a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : O) {
            if (((s04) next).mo31411a()) {
                arrayList.add(next);
            }
        }
        this.f37803a = arrayList;
        this.f37802a = C5338fz.f28767a.mo36405a();
    }

    @vr2
    /* renamed from: d */
    public C6613qv mo39020d(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        C6506q5 a = C6506q5.f33970a.mo43143a(x509TrustManager);
        return a != null ? a : super.mo39020d(x509TrustManager);
    }

    @vr2
    /* renamed from: e */
    public xi4 mo39021e(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            jt1.m53776o(declaredMethod, FirebaseAnalytics.C4305d.f24992v);
            declaredMethod.setAccessible(true);
            return new C7308b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo39021e(x509TrustManager);
        }
    }

    /* renamed from: f */
    public void mo31422f(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<Protocol> list) {
        T t;
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        Iterator<T> it = this.f37803a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31412b(sSLSocket)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            s04.mo31414d(sSLSocket, str, list);
        }
    }

    /* renamed from: g */
    public void mo39022g(@vr2 Socket socket, @vr2 InetSocketAddress inetSocketAddress, int i) throws IOException {
        jt1.m53777p(socket, "socket");
        jt1.m53777p(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @ss2
    /* renamed from: j */
    public String mo31423j(@vr2 SSLSocket sSLSocket) {
        T t;
        jt1.m53777p(sSLSocket, "sslSocket");
        Iterator<T> it = this.f37803a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31412b(sSLSocket)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            return s04.mo31416f(sSLSocket);
        }
        return null;
    }

    @ss2
    /* renamed from: k */
    public Object mo39024k(@vr2 String str) {
        jt1.m53777p(str, "closer");
        return this.f37802a.mo36403a(str);
    }

    /* renamed from: l */
    public boolean mo39025l(@vr2 String str) {
        jt1.m53777p(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        jt1.m53776o(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    /* renamed from: o */
    public void mo39027o(@vr2 String str, @ss2 Object obj) {
        jt1.m53777p(str, "message");
        if (!this.f37802a.mo36404b(obj)) {
            k23.m54025n(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }

    @ss2
    /* renamed from: s */
    public X509TrustManager mo31427s(@vr2 SSLSocketFactory sSLSocketFactory) {
        T t;
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f37803a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31415e(sSLSocketFactory)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            return s04.mo31413c(sSLSocketFactory);
        }
        return null;
    }
}
