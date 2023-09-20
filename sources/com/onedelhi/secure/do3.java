package com.onedelhi.secure;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0019\u0003B'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/do3;", "", "", "b", "Lcom/onedelhi/secure/do3$b;", "d", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "Lcom/onedelhi/secure/un4;", "g", "c", "e", "f", "Lokhttp3/Address;", "address", "Lcom/onedelhi/secure/pn3;", "routeDatabase", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lokhttp3/Address;Lcom/onedelhi/secure/pn3;Lokhttp3/Call;Lokhttp3/EventListener;)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class do3 {

    /* renamed from: a */
    public static final C5049a f27569a = new C5049a((wg0) null);

    /* renamed from: a */
    public int f27570a;

    /* renamed from: a */
    public final pn3 f27571a;

    /* renamed from: a */
    public List<? extends Proxy> f27572a = s00.m64037F();

    /* renamed from: a */
    public final Address f27573a;

    /* renamed from: a */
    public final Call f27574a;

    /* renamed from: a */
    public final EventListener f27575a;

    /* renamed from: b */
    public List<? extends InetSocketAddress> f27576b = s00.m64037F();

    /* renamed from: c */
    public final List<Route> f27577c = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/do3$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.do3$a */
    public static final class C5049a {
        public C5049a() {
        }

        public /* synthetic */ C5049a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final String mo34601a(@vr2 InetSocketAddress inetSocketAddress) {
            String hostName;
            String str;
            jt1.m53777p(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                hostName = address.getHostAddress();
                str = "address.hostAddress";
            } else {
                hostName = inetSocketAddress.getHostName();
                str = "hostName";
            }
            jt1.m53776o(hostName, str);
            return hostName;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/do3$b;", "", "", "b", "Lokhttp3/Route;", "c", "", "routes", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.do3$b */
    public static final class C5050b {

        /* renamed from: a */
        public int f27578a;
        @vr2

        /* renamed from: a */
        public final List<Route> f27579a;

        public C5050b(@vr2 List<Route> list) {
            jt1.m53777p(list, "routes");
            this.f27579a = list;
        }

        @vr2
        /* renamed from: a */
        public final List<Route> mo34602a() {
            return this.f27579a;
        }

        /* renamed from: b */
        public final boolean mo34603b() {
            return this.f27578a < this.f27579a.size();
        }

        @vr2
        /* renamed from: c */
        public final Route mo34604c() {
            if (mo34603b()) {
                List<Route> list = this.f27579a;
                int i = this.f27578a;
                this.f27578a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo38105d2 = {"selectProxies", "", "Ljava/net/Proxy;", "invoke"}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.do3$c */
    public static final class C5051c extends d12 implements cc1<List<? extends Proxy>> {

        /* renamed from: a */
        public final /* synthetic */ do3 f27580a;

        /* renamed from: a */
        public final /* synthetic */ Proxy f27581a;

        /* renamed from: a */
        public final /* synthetic */ HttpUrl f27582a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5051c(do3 do3, Proxy proxy, HttpUrl httpUrl) {
            super(0);
            this.f27580a = do3;
            this.f27581a = proxy;
            this.f27582a = httpUrl;
        }

        @vr2
        public final List<Proxy> invoke() {
            Proxy proxy = this.f27581a;
            if (proxy != null) {
                return r00.m63300l(proxy);
            }
            URI uri = this.f27582a.uri();
            if (uri.getHost() == null) {
                return nq4.m58726z(Proxy.NO_PROXY);
            }
            List<Proxy> select = this.f27580a.f27573a.proxySelector().select(uri);
            if (!(select == null || select.isEmpty())) {
                return nq4.m58696d0(select);
            }
            return nq4.m58726z(Proxy.NO_PROXY);
        }
    }

    public do3(@vr2 Address address, @vr2 pn3 pn3, @vr2 Call call, @vr2 EventListener eventListener) {
        jt1.m53777p(address, "address");
        jt1.m53777p(pn3, "routeDatabase");
        jt1.m53777p(call, es2.f11366Q);
        jt1.m53777p(eventListener, "eventListener");
        this.f27573a = address;
        this.f27571a = pn3;
        this.f27574a = call;
        this.f27575a = eventListener;
        mo34600g(address.url(), address.proxy());
    }

    /* renamed from: b */
    public final boolean mo34595b() {
        return mo34596c() || (this.f27577c.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final boolean mo34596c() {
        return this.f27570a < this.f27572a.size();
    }

    @vr2
    /* renamed from: d */
    public final C5050b mo34597d() throws IOException {
        if (mo34595b()) {
            ArrayList arrayList = new ArrayList();
            while (mo34596c()) {
                Proxy e = mo34598e();
                for (InetSocketAddress route : this.f27576b) {
                    Route route2 = new Route(this.f27573a, e, route);
                    if (this.f27571a.mo42832c(route2)) {
                        this.f27577c.add(route2);
                    } else {
                        arrayList.add(route2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                x00.m69813p0(arrayList, this.f27577c);
                this.f27577c.clear();
            }
            return new C5050b(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public final Proxy mo34598e() throws IOException {
        if (mo34596c()) {
            List<? extends Proxy> list = this.f27572a;
            int i = this.f27570a;
            this.f27570a = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            mo34599f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f27573a.url().host() + "; exhausted proxy configurations: " + this.f27572a);
    }

    /* renamed from: f */
    public final void mo34599f(Proxy proxy) throws IOException {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f27576b = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f27573a.url().host();
            i = this.f27573a.url().port();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f27569a.mo34601a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i || 65535 < i) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f27575a.dnsStart(this.f27574a, str);
            List<InetAddress> lookup = this.f27573a.dns().lookup(str);
            if (!lookup.isEmpty()) {
                this.f27575a.dnsEnd(this.f27574a, str, lookup);
                for (InetAddress inetSocketAddress2 : lookup) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
                }
                return;
            }
            throw new UnknownHostException(this.f27573a.dns() + " returned no addresses for " + str);
        }
    }

    /* renamed from: g */
    public final void mo34600g(HttpUrl httpUrl, Proxy proxy) {
        C5051c cVar = new C5051c(this, proxy, httpUrl);
        this.f27575a.proxySelectStart(this.f27574a, httpUrl);
        List<? extends Proxy> invoke = cVar.invoke();
        this.f27572a = invoke;
        this.f27570a = 0;
        this.f27575a.proxySelectEnd(this.f27574a, httpUrl, invoke);
    }
}
