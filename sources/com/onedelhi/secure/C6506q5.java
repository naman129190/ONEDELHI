package com.onedelhi.secure;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/q5;", "Lcom/onedelhi/secure/qv;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.q5 */
public final class C6506q5 extends C6613qv {

    /* renamed from: a */
    public static final C6507a f33970a = new C6507a((wg0) null);

    /* renamed from: a */
    public final X509TrustManagerExtensions f33971a;

    /* renamed from: a */
    public final X509TrustManager f33972a;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/q5$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lcom/onedelhi/secure/q5;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.q5$a */
    public static final class C6507a {
        public C6507a() {
        }

        public /* synthetic */ C6507a(wg0 wg0) {
            this();
        }

        @e84
        @ss2
        /* renamed from: a */
        public final C6506q5 mo43143a(@vr2 X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            jt1.m53777p(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C6506q5(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C6506q5(@vr2 X509TrustManager x509TrustManager, @vr2 X509TrustManagerExtensions x509TrustManagerExtensions) {
        jt1.m53777p(x509TrustManager, "trustManager");
        jt1.m53777p(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f33972a = x509TrustManager;
        this.f33971a = x509TrustManagerExtensions;
    }

    @vr2
    @e84
    /* renamed from: a */
    public List<Certificate> mo43140a(@vr2 List<? extends Certificate> list, @vr2 String str) throws SSLPeerUnverifiedException {
        jt1.m53777p(list, "chain");
        jt1.m53777p(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f33971a.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            jt1.m53776o(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof C6506q5) && ((C6506q5) obj).f33972a == this.f33972a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f33972a);
    }
}
