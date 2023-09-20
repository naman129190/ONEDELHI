package com.onedelhi.secure;

import com.onedelhi.secure.s04;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/ci0;", "Lcom/onedelhi/secure/s04;", "", "a", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "d", "f", "g", "Lcom/onedelhi/secure/ci0$a;", "socketAdapterFactory", "<init>", "(Lcom/onedelhi/secure/ci0$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ci0 implements s04 {

    /* renamed from: a */
    public final C4768a f26758a;

    /* renamed from: a */
    public s04 f26759a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/ci0$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lcom/onedelhi/secure/s04;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ci0$a */
    public interface C4768a {
        /* renamed from: b */
        boolean mo31420b(@vr2 SSLSocket sSLSocket);

        @vr2
        /* renamed from: c */
        s04 mo31421c(@vr2 SSLSocket sSLSocket);
    }

    public ci0(@vr2 C4768a aVar) {
        jt1.m53777p(aVar, "socketAdapterFactory");
        this.f26758a = aVar;
    }

    /* renamed from: a */
    public boolean mo31411a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo31412b(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        return this.f26758a.mo31420b(sSLSocket);
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
        s04 g = mo32380g(sSLSocket);
        if (g != null) {
            g.mo31414d(sSLSocket, str, list);
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
        s04 g = mo32380g(sSLSocket);
        if (g != null) {
            return g.mo31416f(sSLSocket);
        }
        return null;
    }

    /* renamed from: g */
    public final synchronized s04 mo32380g(SSLSocket sSLSocket) {
        if (this.f26759a == null && this.f26758a.mo31420b(sSLSocket)) {
            this.f26759a = this.f26758a.mo31421c(sSLSocket);
        }
        return this.f26759a;
    }
}
