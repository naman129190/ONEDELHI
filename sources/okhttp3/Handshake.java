package okhttp3;

import com.onedelhi.secure.a10;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.cc1;
import com.onedelhi.secure.i22;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t00;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.w12;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u0014\u0010\rR\u0018\u0010#\u001a\u00020\u001c*\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8GX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "", "hashCode", "", "toString", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "peerCertificates$delegate", "Lcom/onedelhi/secure/w12;", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lcom/onedelhi/secure/cc1;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Handshake {
    public static final Companion Companion = new Companion((wg0) null);
    @vr2
    private final CipherSuite cipherSuite;
    @vr2
    private final List<Certificate> localCertificates;
    @vr2
    private final w12 peerCertificates$delegate;
    @vr2
    private final TlsVersion tlsVersion;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, mo38105d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? nq4.m58726z((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : s00.m64037F();
        }

        @uw1(name = "-deprecated_get")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "sslSession.handshake()", imports = {}))
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m74794deprecated_get(@vr2 SSLSession sSLSession) throws IOException {
            jt1.m53777p(sSLSession, "sslSession");
            return get(sSLSession);
        }

        @zw1
        @uw1(name = "get")
        @vr2
        public final Handshake get(@vr2 SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            jt1.m53777p(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!jt1.m53768g("NONE", protocol)) {
                    TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                    try {
                        list = toImmutableList(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = s00.m64037F();
                    }
                    return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        @zw1
        @vr2
        public final Handshake get(@vr2 TlsVersion tlsVersion, @vr2 CipherSuite cipherSuite, @vr2 List<? extends Certificate> list, @vr2 List<? extends Certificate> list2) {
            jt1.m53777p(tlsVersion, "tlsVersion");
            jt1.m53777p(cipherSuite, "cipherSuite");
            jt1.m53777p(list, "peerCertificates");
            jt1.m53777p(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, nq4.m58696d0(list2), new Handshake$Companion$get$1(nq4.m58696d0(list)));
        }
    }

    public Handshake(@vr2 TlsVersion tlsVersion2, @vr2 CipherSuite cipherSuite2, @vr2 List<? extends Certificate> list, @vr2 cc1<? extends List<? extends Certificate>> cc1) {
        jt1.m53777p(tlsVersion2, "tlsVersion");
        jt1.m53777p(cipherSuite2, "cipherSuite");
        jt1.m53777p(list, "localCertificates");
        jt1.m53777p(cc1, "peerCertificatesFn");
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        this.peerCertificates$delegate = i22.m51739a(new Handshake$peerCertificates$2(cc1));
    }

    @zw1
    @uw1(name = "get")
    @vr2
    public static final Handshake get(@vr2 SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    @zw1
    @vr2
    public static final Handshake get(@vr2 TlsVersion tlsVersion2, @vr2 CipherSuite cipherSuite2, @vr2 List<? extends Certificate> list, @vr2 List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        jt1.m53776o(type, "type");
        return type;
    }

    @uw1(name = "-deprecated_cipherSuite")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "cipherSuite", imports = {}))
    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m74788deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @uw1(name = "-deprecated_localCertificates")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "localCertificates", imports = {}))
    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m74789deprecated_localCertificates() {
        return this.localCertificates;
    }

    @uw1(name = "-deprecated_localPrincipal")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "localPrincipal", imports = {}))
    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m74790deprecated_localPrincipal() {
        return localPrincipal();
    }

    @uw1(name = "-deprecated_peerCertificates")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "peerCertificates", imports = {}))
    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m74791deprecated_peerCertificates() {
        return peerCertificates();
    }

    @uw1(name = "-deprecated_peerPrincipal")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "peerPrincipal", imports = {}))
    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m74792deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @uw1(name = "-deprecated_tlsVersion")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "tlsVersion", imports = {}))
    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m74793deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @uw1(name = "cipherSuite")
    @vr2
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.tlsVersion == this.tlsVersion && jt1.m53768g(handshake.cipherSuite, this.cipherSuite) && jt1.m53768g(handshake.peerCertificates(), peerCertificates()) && jt1.m53768g(handshake.localCertificates, this.localCertificates);
        }
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @uw1(name = "localCertificates")
    @vr2
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @uw1(name = "localPrincipal")
    @ss2
    public final Principal localPrincipal() {
        Object B2 = a10.m35691B2(this.localCertificates);
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @uw1(name = "peerCertificates")
    @vr2
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @uw1(name = "peerPrincipal")
    @ss2
    public final Principal peerPrincipal() {
        Object B2 = a10.m35691B2(peerCertificates());
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @uw1(name = "tlsVersion")
    @vr2
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @vr2
    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(t00.m65073Z(peerCertificates, 10));
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(t00.m65073Z(list, 10));
        for (Certificate name2 : list) {
            arrayList2.add(getName(name2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
