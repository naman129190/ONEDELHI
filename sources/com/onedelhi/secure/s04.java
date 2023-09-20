package com.onedelhi.secure;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/s04;", "", "", "a", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "c", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "e", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "d", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface s04 {

    @ii2(mo38103bv = {1, 0, 3}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.s04$a */
    public static final class C6732a {
        /* renamed from: a */
        public static boolean m64086a(@vr2 s04 s04, @vr2 SSLSocketFactory sSLSocketFactory) {
            jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        @ss2
        /* renamed from: b */
        public static X509TrustManager m64087b(@vr2 s04 s04, @vr2 SSLSocketFactory sSLSocketFactory) {
            jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    /* renamed from: a */
    boolean mo31411a();

    /* renamed from: b */
    boolean mo31412b(@vr2 SSLSocket sSLSocket);

    @ss2
    /* renamed from: c */
    X509TrustManager mo31413c(@vr2 SSLSocketFactory sSLSocketFactory);

    /* renamed from: d */
    void mo31414d(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list);

    /* renamed from: e */
    boolean mo31415e(@vr2 SSLSocketFactory sSLSocketFactory);

    @ss2
    /* renamed from: f */
    String mo31416f(@vr2 SSLSocket sSLSocket);
}
