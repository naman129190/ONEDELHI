package com.onedelhi.secure;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.ConnectionSpec;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/v50;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "a", "Ljava/io/IOException;", "e", "", "b", "socket", "c", "", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class v50 {

    /* renamed from: a */
    public int f36431a;

    /* renamed from: a */
    public final List<ConnectionSpec> f36432a;

    /* renamed from: a */
    public boolean f36433a;

    /* renamed from: b */
    public boolean f36434b;

    public v50(@vr2 List<ConnectionSpec> list) {
        jt1.m53777p(list, "connectionSpecs");
        this.f36432a = list;
    }

    @vr2
    /* renamed from: a */
    public final ConnectionSpec mo46012a(@vr2 SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        jt1.m53777p(sSLSocket, "sslSocket");
        int i = this.f36431a;
        int size = this.f36432a.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.f36432a.get(i);
            i++;
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.f36431a = i;
                break;
            }
        }
        if (connectionSpec != null) {
            this.f36433a = mo46014c(sSLSocket);
            connectionSpec.apply$okhttp(sSLSocket, this.f36434b);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f36434b);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f36432a);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        jt1.m53774m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        jt1.m53776o(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo46013b(@vr2 IOException iOException) {
        jt1.m53777p(iOException, "e");
        this.f36434b = true;
        return this.f36433a && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }

    /* renamed from: c */
    public final boolean mo46014c(SSLSocket sSLSocket) {
        int size = this.f36432a.size();
        for (int i = this.f36431a; i < size; i++) {
            if (this.f36432a.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
