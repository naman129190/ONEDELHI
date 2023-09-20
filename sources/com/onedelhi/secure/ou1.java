package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B7\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/ou1;", "Lcom/onedelhi/secure/k23;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcom/onedelhi/secure/un4;", "f", "c", "j", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ou1 extends k23 {

    /* renamed from: a */
    public static final C6305b f33177a = new C6305b((wg0) null);

    /* renamed from: a */
    public final Class<?> f33178a;

    /* renamed from: a */
    public final Method f33179a;

    /* renamed from: b */
    public final Class<?> f33180b;

    /* renamed from: b */
    public final Method f33181b;

    /* renamed from: c */
    public final Method f33182c;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/ou1$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "unsupported", "Z", "b", "()Z", "d", "(Z)V", "", "selected", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "", "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ou1$a */
    public static final class C6304a implements InvocationHandler {
        @ss2

        /* renamed from: a */
        public String f33183a;

        /* renamed from: a */
        public final List<String> f33184a;

        /* renamed from: a */
        public boolean f33185a;

        public C6304a(@vr2 List<String> list) {
            jt1.m53777p(list, "protocols");
            this.f33184a = list;
        }

        @ss2
        /* renamed from: a */
        public final String mo41963a() {
            return this.f33183a;
        }

        /* renamed from: b */
        public final boolean mo41964b() {
            return this.f33185a;
        }

        /* renamed from: c */
        public final void mo41965c(@ss2 String str) {
            this.f33183a = str;
        }

        /* renamed from: d */
        public final void mo41966d(boolean z) {
            this.f33185a = z;
        }

        @ss2
        public Object invoke(@vr2 Object obj, @vr2 Method method, @ss2 Object[] objArr) throws Throwable {
            jt1.m53777p(obj, "proxy");
            jt1.m53777p(method, FirebaseAnalytics.C4305d.f24992v);
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (jt1.m53768g(name, "supports") && jt1.m53768g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!jt1.m53768g(name, "unsupported") || !jt1.m53768g(Void.TYPE, returnType)) {
                if (jt1.m53768g(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f33184a;
                    }
                }
                if ((jt1.m53768g(name, "selectProtocol") || jt1.m53768g(name, "select")) && jt1.m53768g(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f33184a.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f33183a = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f33184a.get(0);
                    this.f33183a = str2;
                    return str2;
                } else if ((!jt1.m53768g(name, "protocolSelected") && !jt1.m53768g(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f33183a = (String) obj4;
                    return null;
                }
            } else {
                this.f33185a = true;
                return null;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/ou1$b;", "", "Lcom/onedelhi/secure/k23;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ou1$b */
    public static final class C6305b {
        public C6305b() {
        }

        public /* synthetic */ C6305b(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: a */
        public final k23 mo41968a() {
            String property = System.getProperty("java.specification.version", dv0.f10947b);
            try {
                jt1.m53776o(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                jt1.m53776o(method, "putMethod");
                jt1.m53776o(method2, "getMethod");
                jt1.m53776o(method3, "removeMethod");
                jt1.m53776o(cls3, "clientProviderClass");
                jt1.m53776o(cls4, "serverProviderClass");
                return new ou1(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public ou1(@vr2 Method method, @vr2 Method method2, @vr2 Method method3, @vr2 Class<?> cls, @vr2 Class<?> cls2) {
        jt1.m53777p(method, "putMethod");
        jt1.m53777p(method2, "getMethod");
        jt1.m53777p(method3, "removeMethod");
        jt1.m53777p(cls, "clientProviderClass");
        jt1.m53777p(cls2, "serverProviderClass");
        this.f33179a = method;
        this.f33181b = method2;
        this.f33182c = method3;
        this.f33178a = cls;
        this.f33180b = cls2;
    }

    /* renamed from: c */
    public void mo39019c(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        try {
            this.f33182c.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: f */
    public void mo31422f(@vr2 SSLSocket sSLSocket, @ss2 String str, @vr2 List<? extends Protocol> list) {
        jt1.m53777p(sSLSocket, "sslSocket");
        jt1.m53777p(list, "protocols");
        List<String> b = k23.f31087a.mo39029b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(k23.class.getClassLoader(), new Class[]{this.f33178a, this.f33180b}, new C6304a(b));
            this.f33179a.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @ss2
    /* renamed from: j */
    public String mo31423j(@vr2 SSLSocket sSLSocket) {
        jt1.m53777p(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f33181b.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C6304a aVar = (C6304a) invocationHandler;
                if (!aVar.mo41964b() && aVar.mo41963a() == null) {
                    k23.m54025n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.mo41964b()) {
                    return null;
                } else {
                    return aVar.mo41963a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
