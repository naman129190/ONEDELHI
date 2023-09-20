package com.onedelhi.secure;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/ps2;", "Ljava/net/ProxySelector;", "Ljava/net/URI;", "uri", "", "Ljava/net/Proxy;", "select", "Ljava/net/SocketAddress;", "sa", "Ljava/io/IOException;", "ioe", "Lcom/onedelhi/secure/un4;", "connectFailed", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ps2 extends ProxySelector {

    /* renamed from: a */
    public static final ps2 f33765a = new ps2();

    public void connectFailed(@ss2 URI uri, @ss2 SocketAddress socketAddress, @ss2 IOException iOException) {
    }

    @vr2
    public List<Proxy> select(@ss2 URI uri) {
        if (uri != null) {
            return r00.m63300l(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
