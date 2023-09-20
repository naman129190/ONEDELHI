package com.onedelhi.secure;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/ku1;", "Lokhttp3/Authenticator;", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "Ljava/net/Proxy;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Dns;", "dns", "Ljava/net/InetAddress;", "a", "defaultDns", "<init>", "(Lokhttp3/Dns;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ku1 implements Authenticator {

    /* renamed from: a */
    public final Dns f31435a;

    public ku1() {
        this((Dns) null, 1, (wg0) null);
    }

    public ku1(@vr2 Dns dns) {
        jt1.m53777p(dns, "defaultDns");
        this.f31435a = dns;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku1(Dns dns, int i, wg0 wg0) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }

    /* renamed from: a */
    public final InetAddress mo39514a(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && ju1.f30942a[type.ordinal()] == 1) {
            return (InetAddress) a10.m35918w2(dns.lookup(httpUrl.host()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        jt1.m53776o(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    @ss2
    public Request authenticate(@ss2 Route route, @vr2 Response response) throws IOException {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthentication;
        Address address;
        jt1.m53777p(response, "response");
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge next : challenges) {
            if (t54.m65410K1("Basic", next.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.f31435a;
                }
                if (z) {
                    SocketAddress address2 = proxy.address();
                    Objects.requireNonNull(address2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                    String hostName = inetSocketAddress.getHostName();
                    jt1.m53776o(proxy, "proxy");
                    passwordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, mo39514a(proxy, url, dns), inetSocketAddress.getPort(), url.scheme(), next.realm(), next.scheme(), url.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.host();
                    jt1.m53776o(proxy, "proxy");
                    passwordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, mo39514a(proxy, url, dns), url.port(), url.scheme(), next.realm(), next.scheme(), url.url(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    jt1.m53776o(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    jt1.m53776o(password, "auth.password");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), next.charset())).build();
                }
            }
        }
        return null;
    }
}
