package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/l5;", "Lcom/onedelhi/secure/k23;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "f", "j", "", "l", "trustManager", "Lcom/onedelhi/secure/qv;", "d", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
@e84
/* renamed from: com.onedelhi.secure.l5 */
public final class C5967l5 extends k23 {

    /* renamed from: a */
    public static final C5968a f31564a = new C5968a((wg0) null);

    /* renamed from: a */
    public static final boolean f31565a = (k23.f31087a.mo39035h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: a */
    public final List<s04> f31566a;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/l5$a;", "", "Lcom/onedelhi/secure/k23;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.l5$a */
    public static final class C5968a {
        public C5968a() {
        }

        public /* synthetic */ C5968a(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: a */
        public final k23 mo39674a() {
            if (mo39675b()) {
                return new C5967l5();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo39675b() {
            return C5967l5.f31565a;
        }
    }

    public C5967l5() {
        List O = s00.m64046O(C6091m5.f32015a.mo40489a(), new ci0(C4627b6.f26168a.mo31419d()), new ci0(c60.f26654a.mo32258a()), new ci0(C7060vn.f36595a.mo46205a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : O) {
            if (((s04) next).mo31411a()) {
                arrayList.add(next);
            }
        }
        this.f31566a = arrayList;
    }

    @vr2
    /* renamed from: d */
    public C6613qv mo39020d(@vr2 X509TrustManager x509TrustManager) {
        jt1.m53777p(x509TrustManager, "trustManager");
        C6506q5 a = C6506q5.f33970a.mo43143a(x509TrustManager);
        return a != null ? a : super.mo39020d(x509TrustManager);
    }

    /* renamed from: f */
    public void mo31422f(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list) {
        T t;
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        Iterator<T> it = this.f31566a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31412b(sSLSocket)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            s04.mo31414d(sSLSocket, str, list);
        }
    }

    @ss2
    /* renamed from: j */
    public String mo31423j(@vr2 SSLSocket sSLSocket) {
        T t;
        jt1.m53777p(sSLSocket, "sslSocket");
        Iterator<T> it = this.f31566a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31412b(sSLSocket)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            return s04.mo31416f(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    public boolean mo39025l(@vr2 String str) {
        jt1.m53777p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @ss2
    /* renamed from: s */
    public X509TrustManager mo31427s(@vr2 SSLSocketFactory sSLSocketFactory) {
        T t;
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f31566a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((s04) t).mo31415e(sSLSocketFactory)) {
                break;
            }
        }
        s04 s04 = (s04) t;
        if (s04 != null) {
            return s04.mo31413c(sSLSocketFactory);
        }
        return null;
    }
}
