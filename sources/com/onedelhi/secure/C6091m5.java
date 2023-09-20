package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.onedelhi.secure.s04;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@SuppressLint({"NewApi"})
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/m5;", "Lcom/onedelhi/secure/s04;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "f", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
@e84
/* renamed from: com.onedelhi.secure.m5 */
public final class C6091m5 implements s04 {

    /* renamed from: a */
    public static final C6092a f32015a = new C6092a((wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/m5$a;", "", "Lcom/onedelhi/secure/s04;", "a", "", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    @e84
    /* renamed from: com.onedelhi.secure.m5$a */
    public static final class C6092a {
        public C6092a() {
        }

        public /* synthetic */ C6092a(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: a */
        public final s04 mo40489a() {
            if (mo40490b()) {
                return new C6091m5();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo40490b() {
            return k23.f31087a.mo39035h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: a */
    public boolean mo31411a() {
        return f32015a.mo40490b();
    }

    /* renamed from: b */
    public boolean mo31412b(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @ss2
    /* renamed from: c */
    public X509TrustManager mo31413c(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64087b(this, sSLSocketFactory);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo31414d(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list) {
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            jt1.m53776o(sSLParameters, "sslParameters");
            Object[] array = k23.f31087a.mo39029b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* renamed from: e */
    public boolean mo31415e(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64086a(this, sSLSocketFactory);
    }

    @SuppressLint({"NewApi"})
    @ss2
    /* renamed from: f */
    public String mo31416f(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }
}
