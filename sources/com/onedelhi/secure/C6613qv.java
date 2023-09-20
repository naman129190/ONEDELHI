package com.onedelhi.secure;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/qv;", "", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.qv */
public abstract class C6613qv {

    /* renamed from: a */
    public static final C6614a f34367a = new C6614a((wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/qv$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lcom/onedelhi/secure/qv;", "a", "", "Ljava/security/cert/X509Certificate;", "caCerts", "b", "([Ljava/security/cert/X509Certificate;)Lcom/onedelhi/secure/qv;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qv$a */
    public static final class C6614a {
        public C6614a() {
        }

        public /* synthetic */ C6614a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final C6613qv mo43731a(@vr2 X509TrustManager x509TrustManager) {
            jt1.m53777p(x509TrustManager, "trustManager");
            return k23.f31087a.mo39034g().mo39020d(x509TrustManager);
        }

        @vr2
        /* renamed from: b */
        public final C6613qv mo43732b(@vr2 X509Certificate... x509CertificateArr) {
            jt1.m53777p(x509CertificateArr, "caCerts");
            return new C7493zj(new C4776ck((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }

    @vr2
    /* renamed from: a */
    public abstract List<Certificate> mo43140a(@vr2 List<? extends Certificate> list, @vr2 String str) throws SSLPeerUnverifiedException;
}
