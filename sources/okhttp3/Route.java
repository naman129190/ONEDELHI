package okhttp3;

import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.xj0;
import java.net.InetSocketAddress;
import java.net.Proxy;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, mo38105d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", "hashCode", "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class Route {
    @vr2
    private final Address address;
    @vr2
    private final Proxy proxy;
    @vr2
    private final InetSocketAddress socketAddress;

    public Route(@vr2 Address address2, @vr2 Proxy proxy2, @vr2 InetSocketAddress inetSocketAddress) {
        jt1.m53777p(address2, "address");
        jt1.m53777p(proxy2, "proxy");
        jt1.m53777p(inetSocketAddress, "socketAddress");
        this.address = address2;
        this.proxy = proxy2;
        this.socketAddress = inetSocketAddress;
    }

    @uw1(name = "-deprecated_address")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "address", imports = {}))
    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m74877deprecated_address() {
        return this.address;
    }

    @uw1(name = "-deprecated_proxy")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m74878deprecated_proxy() {
        return this.proxy;
    }

    @uw1(name = "-deprecated_socketAddress")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "socketAddress", imports = {}))
    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m74879deprecated_socketAddress() {
        return this.socketAddress;
    }

    @uw1(name = "address")
    @vr2
    public final Address address() {
        return this.address;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return jt1.m53768g(route.address, this.address) && jt1.m53768g(route.proxy, this.proxy) && jt1.m53768g(route.socketAddress, this.socketAddress);
        }
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @uw1(name = "proxy")
    @vr2
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @uw1(name = "socketAddress")
    @vr2
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @vr2
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
