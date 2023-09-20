package okhttp3;

import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.m51;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.xj0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b(J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0007¢\u0006\u0002\b)J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0002J\u0015\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0000H\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0005H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b2J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0002\b3J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b4J\r\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\b5J\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b6J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b7J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0003H\u0016J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u0010\u001a\u00020\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\"R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'¨\u0006;"}, mo38105d2 = {"Lokhttp3/Address;", "", "uriHost", "", "uriPort", "", "dns", "Lokhttp3/Dns;", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "proxyAuthenticator", "Lokhttp3/Authenticator;", "proxy", "Ljava/net/Proxy;", "protocols", "", "Lokhttp3/Protocol;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "proxySelector", "Ljava/net/ProxySelector;", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "()Lokhttp3/CertificatePinner;", "()Ljava/util/List;", "()Lokhttp3/Dns;", "()Ljavax/net/ssl/HostnameVerifier;", "()Ljava/net/Proxy;", "()Lokhttp3/Authenticator;", "()Ljava/net/ProxySelector;", "()Ljavax/net/SocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "url", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "-deprecated_certificatePinner", "-deprecated_connectionSpecs", "-deprecated_dns", "equals", "", "other", "equalsNonHost", "that", "equalsNonHost$okhttp", "hashCode", "-deprecated_hostnameVerifier", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "toString", "-deprecated_url", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class Address {
    @ss2
    private final CertificatePinner certificatePinner;
    @vr2
    private final List<ConnectionSpec> connectionSpecs;
    @vr2
    private final Dns dns;
    @ss2
    private final HostnameVerifier hostnameVerifier;
    @vr2
    private final List<Protocol> protocols;
    @ss2
    private final Proxy proxy;
    @vr2
    private final Authenticator proxyAuthenticator;
    @vr2
    private final ProxySelector proxySelector;
    @vr2
    private final SocketFactory socketFactory;
    @ss2
    private final SSLSocketFactory sslSocketFactory;
    @vr2
    private final HttpUrl url;

    public Address(@vr2 String str, int i, @vr2 Dns dns2, @vr2 SocketFactory socketFactory2, @ss2 SSLSocketFactory sSLSocketFactory, @ss2 HostnameVerifier hostnameVerifier2, @ss2 CertificatePinner certificatePinner2, @vr2 Authenticator authenticator, @ss2 Proxy proxy2, @vr2 List<? extends Protocol> list, @vr2 List<ConnectionSpec> list2, @vr2 ProxySelector proxySelector2) {
        jt1.m53777p(str, "uriHost");
        jt1.m53777p(dns2, "dns");
        jt1.m53777p(socketFactory2, "socketFactory");
        jt1.m53777p(authenticator, "proxyAuthenticator");
        jt1.m53777p(list, "protocols");
        jt1.m53777p(list2, "connectionSpecs");
        jt1.m53777p(proxySelector2, "proxySelector");
        this.dns = dns2;
        this.socketFactory = socketFactory2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier2;
        this.certificatePinner = certificatePinner2;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy2;
        this.proxySelector = proxySelector2;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? m51.f32019b : m51.f32018a).host(str).port(i).build();
        this.protocols = nq4.m58696d0(list);
        this.connectionSpecs = nq4.m58696d0(list2);
    }

    @uw1(name = "-deprecated_certificatePinner")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "certificatePinner", imports = {}))
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m74747deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @uw1(name = "-deprecated_connectionSpecs")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m74748deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @uw1(name = "-deprecated_dns")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m74749deprecated_dns() {
        return this.dns;
    }

    @uw1(name = "-deprecated_hostnameVerifier")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "hostnameVerifier", imports = {}))
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m74750deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @uw1(name = "-deprecated_protocols")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m74751deprecated_protocols() {
        return this.protocols;
    }

    @uw1(name = "-deprecated_proxy")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m74752deprecated_proxy() {
        return this.proxy;
    }

    @uw1(name = "-deprecated_proxyAuthenticator")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m74753deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @uw1(name = "-deprecated_proxySelector")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m74754deprecated_proxySelector() {
        return this.proxySelector;
    }

    @uw1(name = "-deprecated_socketFactory")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m74755deprecated_socketFactory() {
        return this.socketFactory;
    }

    @uw1(name = "-deprecated_sslSocketFactory")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "sslSocketFactory", imports = {}))
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m74756deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @uw1(name = "-deprecated_url")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "url", imports = {}))
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m74757deprecated_url() {
        return this.url;
    }

    @uw1(name = "certificatePinner")
    @ss2
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @uw1(name = "connectionSpecs")
    @vr2
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @uw1(name = "dns")
    @vr2
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return jt1.m53768g(this.url, address.url) && equalsNonHost$okhttp(address);
        }
    }

    public final boolean equalsNonHost$okhttp(@vr2 Address address) {
        jt1.m53777p(address, "that");
        return jt1.m53768g(this.dns, address.dns) && jt1.m53768g(this.proxyAuthenticator, address.proxyAuthenticator) && jt1.m53768g(this.protocols, address.protocols) && jt1.m53768g(this.connectionSpecs, address.connectionSpecs) && jt1.m53768g(this.proxySelector, address.proxySelector) && jt1.m53768g(this.proxy, address.proxy) && jt1.m53768g(this.sslSocketFactory, address.sslSocketFactory) && jt1.m53768g(this.hostnameVerifier, address.hostnameVerifier) && jt1.m53768g(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @uw1(name = "hostnameVerifier")
    @ss2
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
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

    @uw1(name = "socketFactory")
    @vr2
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @uw1(name = "sslSocketFactory")
    @ss2
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @vr2
    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }

    @uw1(name = "url")
    @vr2
    public final HttpUrl url() {
        return this.url;
    }
}
