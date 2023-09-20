package com.onedelhi.secure;

import com.onedelhi.secure.ci0;
import com.onedelhi.secure.s04;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/vn;", "Lcom/onedelhi/secure/s04;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "f", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.vn */
public final class C7060vn implements s04 {
    @vr2

    /* renamed from: a */
    public static final ci0.C4768a f36594a = new C7061a();

    /* renamed from: a */
    public static final C7062b f36595a = new C7062b((wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/onedelhi/secure/vn$a", "Lcom/onedelhi/secure/ci0$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lcom/onedelhi/secure/s04;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.vn$a */
    public static final class C7061a implements ci0.C4768a {
        /* renamed from: b */
        public boolean mo31420b(@vr2 SSLSocket sSLSocket) {
            jt1.m53777p(sSLSocket, "sslSocket");
            return C6976un.f36202a.mo45775b() && (sSLSocket instanceof BCSSLSocket);
        }

        @vr2
        /* renamed from: c */
        public s04 mo31421c(@vr2 SSLSocket sSLSocket) {
            jt1.m53777p(sSLSocket, "sslSocket");
            return new C7060vn();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/vn$b;", "", "Lcom/onedelhi/secure/ci0$a;", "factory", "Lcom/onedelhi/secure/ci0$a;", "a", "()Lcom/onedelhi/secure/ci0$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.vn$b */
    public static final class C7062b {
        public C7062b() {
        }

        public /* synthetic */ C7062b(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final ci0.C4768a mo46205a() {
            return C7060vn.f36594a;
        }
    }

    /* renamed from: a */
    public boolean mo31411a() {
        return C6976un.f36202a.mo45775b();
    }

    /* renamed from: b */
    public boolean mo31412b(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @ss2
    /* renamed from: c */
    public X509TrustManager mo31413c(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64087b(this, sSLSocketFactory);
    }

    /* renamed from: d */
    public void mo31414d(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list) {
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        if (mo31412b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            jt1.m53776o(parameters, "sslParameters");
            Object[] array = k23.f31087a.mo39029b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    /* renamed from: e */
    public boolean mo31415e(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64086a(this, sSLSocketFactory);
    }

    @ss2
    /* renamed from: f */
    public String mo31416f(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }
}
