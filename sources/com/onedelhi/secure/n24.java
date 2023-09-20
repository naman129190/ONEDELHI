package com.onedelhi.secure;

import com.onedelhi.secure.vh3;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB3\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\t0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/n24;", "Lcom/onedelhi/secure/b6;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "e", "Ljavax/net/ssl/X509TrustManager;", "c", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class n24 extends C4627b6 {

    /* renamed from: a */
    public static final C6165a f32347a = new C6165a((wg0) null);

    /* renamed from: b */
    public final Class<? super SSLSocketFactory> f32348b;

    /* renamed from: c */
    public final Class<?> f32349c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/n24$a;", "", "", "packageName", "Lcom/onedelhi/secure/s04;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.n24$a */
    public static final class C6165a {
        public C6165a() {
        }

        public /* synthetic */ C6165a(wg0 wg0) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ s04 m57813b(C6165a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.mo40902a(str);
        }

        @ss2
        /* renamed from: a */
        public final s04 mo40902a(@vr2 String str) {
            jt1.m53777p(str, vh3.C7051b.f36563S);
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                jt1.m53776o(cls3, "paramsClass");
                return new n24(cls, cls2, cls3);
            } catch (Exception e) {
                k23.f31087a.mo39034g().mo39026m("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n24(@vr2 Class<? super SSLSocket> cls, @vr2 Class<? super SSLSocketFactory> cls2, @vr2 Class<?> cls3) {
        super(cls);
        jt1.m53777p(cls, "sslSocketClass");
        jt1.m53777p(cls2, "sslSocketFactoryClass");
        jt1.m53777p(cls3, "paramClass");
        this.f32348b = cls2;
        this.f32349c = cls3;
    }

    @ss2
    /* renamed from: c */
    public X509TrustManager mo31413c(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        Object R = nq4.m58680R(sSLSocketFactory, this.f32349c, "sslParameters");
        jt1.m53774m(R);
        X509TrustManager x509TrustManager = (X509TrustManager) nq4.m58680R(R, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) nq4.m58680R(R, X509TrustManager.class, "trustManager");
    }

    /* renamed from: e */
    public boolean mo31415e(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return this.f32348b.isInstance(sSLSocketFactory);
    }
}
