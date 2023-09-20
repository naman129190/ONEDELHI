package com.onedelhi.secure;

import com.onedelhi.secure.ci0;
import com.onedelhi.secure.s04;
import com.onedelhi.secure.vh3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/b6;", "Lcom/onedelhi/secure/s04;", "", "a", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "d", "f", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.b6 */
public class C4627b6 implements s04 {

    /* renamed from: a */
    public static final C4628a f26168a;
    @vr2

    /* renamed from: a */
    public static final ci0.C4768a f26169a;

    /* renamed from: a */
    public final Class<? super SSLSocket> f26170a;

    /* renamed from: a */
    public final Method f26171a;

    /* renamed from: b */
    public final Method f26172b;

    /* renamed from: c */
    public final Method f26173c;

    /* renamed from: d */
    public final Method f26174d;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006H\u0002R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/b6$a;", "", "", "packageName", "Lcom/onedelhi/secure/ci0$a;", "c", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lcom/onedelhi/secure/b6;", "b", "playProviderFactory", "Lcom/onedelhi/secure/ci0$a;", "d", "()Lcom/onedelhi/secure/ci0$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.b6$a */
    public static final class C4628a {

        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/onedelhi/secure/b6$a$a", "Lcom/onedelhi/secure/ci0$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lcom/onedelhi/secure/s04;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.b6$a$a */
        public static final class C4629a implements ci0.C4768a {

            /* renamed from: a */
            public final /* synthetic */ String f26175a;

            public C4629a(String str) {
                this.f26175a = str;
            }

            /* renamed from: b */
            public boolean mo31420b(@vr2 SSLSocket sSLSocket) {
                jt1.m53777p(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                jt1.m53776o(name, "sslSocket.javaClass.name");
                return t54.m65466u2(name, this.f26175a + '.', false, 2, (Object) null);
            }

            @vr2
            /* renamed from: c */
            public s04 mo31421c(@vr2 SSLSocket sSLSocket) {
                jt1.m53777p(sSLSocket, "sslSocket");
                return C4627b6.f26168a.mo31417b(sSLSocket.getClass());
            }
        }

        public C4628a() {
        }

        public /* synthetic */ C4628a(wg0 wg0) {
            this();
        }

        /* renamed from: b */
        public final C4627b6 mo31417b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!jt1.m53768g(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            jt1.m53774m(cls2);
            return new C4627b6(cls2);
        }

        @vr2
        /* renamed from: c */
        public final ci0.C4768a mo31418c(@vr2 String str) {
            jt1.m53777p(str, vh3.C7051b.f36563S);
            return new C4629a(str);
        }

        @vr2
        /* renamed from: d */
        public final ci0.C4768a mo31419d() {
            return C4627b6.f26169a;
        }
    }

    static {
        C4628a aVar = new C4628a((wg0) null);
        f26168a = aVar;
        f26169a = aVar.mo31418c("com.google.android.gms.org.conscrypt");
    }

    public C4627b6(@vr2 Class<? super SSLSocket> cls) {
        jt1.m53777p(cls, "sslSocketClass");
        this.f26170a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        jt1.m53776o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f26171a = declaredMethod;
        this.f26172b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f26173c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f26174d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo31411a() {
        return C7306y5.f37800a.mo47589b();
    }

    /* renamed from: b */
    public boolean mo31412b(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        return this.f26170a.isInstance(sSLSocket);
    }

    @ss2
    /* renamed from: c */
    public X509TrustManager mo31413c(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64087b(this, sSLSocketFactory);
    }

    /* renamed from: d */
    public void mo31414d(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list) {
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        if (mo31412b(sSLSocket)) {
            try {
                this.f26171a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f26172b.invoke(sSLSocket, new Object[]{str});
                }
                this.f26174d.invoke(sSLSocket, new Object[]{k23.f31087a.mo39030c(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo31415e(@vr2 SSLSocketFactory sSLSocketFactory) {
        jt1.m53777p(sSLSocketFactory, "sslSocketFactory");
        return s04.C6732a.m64086a(this, sSLSocketFactory);
    }

    @ss2
    /* renamed from: f */
    public String mo31416f(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        if (!mo31412b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f26173c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            jt1.m53776o(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (jt1.m53768g(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }
}
