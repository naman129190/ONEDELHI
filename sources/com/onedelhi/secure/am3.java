package com.onedelhi.secure;

import com.onedelhi.secure.C4899cq;
import com.onedelhi.secure.C6708rs;
import com.onedelhi.secure.q80;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class am3 {

    /* renamed from: a */
    public final List<q80.C6515a> f25922a;

    /* renamed from: a */
    public final Map<Method, qu3<?>> f25923a = new ConcurrentHashMap();
    @Nullable

    /* renamed from: a */
    public final Executor f25924a;

    /* renamed from: a */
    public final Call.Factory f25925a;

    /* renamed from: a */
    public final HttpUrl f25926a;

    /* renamed from: a */
    public final boolean f25927a;

    /* renamed from: b */
    public final List<C6708rs.C6709a> f25928b;

    /* renamed from: com.onedelhi.secure.am3$a */
    public class C4573a implements InvocationHandler {

        /* renamed from: a */
        public final l23 f25930a = l23.m55221g();

        /* renamed from: a */
        public final /* synthetic */ Class f25931a;

        /* renamed from: a */
        public final Object[] f25932a = new Object[0];

        public C4573a(Class cls) {
            this.f25931a = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f25932a;
            }
            return this.f25930a.mo39631i(method) ? this.f25930a.mo39630h(method, this.f25931a, obj, objArr) : am3.this.mo31017h(method).mo31954a(objArr);
        }
    }

    /* renamed from: com.onedelhi.secure.am3$b */
    public static final class C4574b {

        /* renamed from: a */
        public final l23 f25933a;

        /* renamed from: a */
        public final List<q80.C6515a> f25934a;
        @Nullable

        /* renamed from: a */
        public Executor f25935a;
        @Nullable

        /* renamed from: a */
        public Call.Factory f25936a;
        @Nullable

        /* renamed from: a */
        public HttpUrl f25937a;

        /* renamed from: a */
        public boolean f25938a;

        /* renamed from: b */
        public final List<C6708rs.C6709a> f25939b;

        public C4574b() {
            this(l23.m55221g());
        }

        public C4574b(am3 am3) {
            this.f25934a = new ArrayList();
            this.f25939b = new ArrayList();
            l23 g = l23.m55221g();
            this.f25933a = g;
            this.f25936a = am3.f25925a;
            this.f25937a = am3.f25926a;
            int size = am3.f25922a.size() - g.mo39629e();
            for (int i = 1; i < size; i++) {
                this.f25934a.add(am3.f25922a.get(i));
            }
            int size2 = am3.f25928b.size() - this.f25933a.mo39626b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f25939b.add(am3.f25928b.get(i2));
            }
            this.f25935a = am3.f25924a;
            this.f25938a = am3.f25927a;
        }

        public C4574b(l23 l23) {
            this.f25934a = new ArrayList();
            this.f25939b = new ArrayList();
            this.f25933a = l23;
        }

        /* renamed from: a */
        public C4574b mo31027a(C6708rs.C6709a aVar) {
            List<C6708rs.C6709a> list = this.f25939b;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C4574b mo31028b(q80.C6515a aVar) {
            List<q80.C6515a> list = this.f25934a;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C4574b mo31029c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo31031e(HttpUrl.get(str));
        }

        /* renamed from: d */
        public C4574b mo31030d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return mo31031e(HttpUrl.get(url.toString()));
        }

        /* renamed from: e */
        public C4574b mo31031e(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f25937a = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: f */
        public am3 mo31032f() {
            if (this.f25937a != null) {
                Call.Factory factory = this.f25936a;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f25935a;
                if (executor == null) {
                    executor = this.f25933a.mo39627c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f25939b);
                arrayList.addAll(this.f25933a.mo39625a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f25934a.size() + 1 + this.f25933a.mo39629e());
                arrayList2.add(new C4899cq());
                arrayList2.addAll(this.f25934a);
                arrayList2.addAll(this.f25933a.mo39628d());
                return new am3(factory2, this.f25937a, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f25938a);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: g */
        public List<C6708rs.C6709a> mo31033g() {
            return this.f25939b;
        }

        /* renamed from: h */
        public C4574b mo31034h(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f25936a = factory;
            return this;
        }

        /* renamed from: i */
        public C4574b mo31035i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f25935a = executor;
            return this;
        }

        /* renamed from: j */
        public C4574b mo31036j(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return mo31034h(okHttpClient);
        }

        /* renamed from: k */
        public List<q80.C6515a> mo31037k() {
            return this.f25934a;
        }

        /* renamed from: l */
        public C4574b mo31038l(boolean z) {
            this.f25938a = z;
            return this;
        }
    }

    public am3(Call.Factory factory, HttpUrl httpUrl, List<q80.C6515a> list, List<C6708rs.C6709a> list2, @Nullable Executor executor, boolean z) {
        this.f25925a = factory;
        this.f25926a = httpUrl;
        this.f25922a = list;
        this.f25928b = list2;
        this.f25924a = executor;
        this.f25927a = z;
    }

    /* renamed from: a */
    public HttpUrl mo31010a() {
        return this.f25926a;
    }

    /* renamed from: b */
    public C6708rs<?, ?> mo31011b(Type type, Annotation[] annotationArr) {
        return mo31019j((C6708rs.C6709a) null, type, annotationArr);
    }

    /* renamed from: c */
    public List<C6708rs.C6709a> mo31012c() {
        return this.f25928b;
    }

    /* renamed from: d */
    public Call.Factory mo31013d() {
        return this.f25925a;
    }

    @Nullable
    /* renamed from: e */
    public Executor mo31014e() {
        return this.f25924a;
    }

    /* renamed from: f */
    public List<q80.C6515a> mo31015f() {
        return this.f25922a;
    }

    /* renamed from: g */
    public <T> T mo31016g(Class<T> cls) {
        mo31025p(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C4573a(cls));
    }

    /* renamed from: h */
    public qu3<?> mo31017h(Method method) {
        qu3<?> qu3;
        qu3<?> qu32 = this.f25923a.get(method);
        if (qu32 != null) {
            return qu32;
        }
        synchronized (this.f25923a) {
            qu3 = this.f25923a.get(method);
            if (qu3 == null) {
                qu3 = qu3.m63191b(this, method);
                this.f25923a.put(method, qu3);
            }
        }
        return qu3;
    }

    /* renamed from: i */
    public C4574b mo31018i() {
        return new C4574b(this);
    }

    /* renamed from: j */
    public C6708rs<?, ?> mo31019j(@Nullable C6708rs.C6709a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f25928b.indexOf(aVar) + 1;
        int size = this.f25928b.size();
        for (int i = indexOf; i < size; i++) {
            C6708rs<?, ?> a = this.f25928b.get(i).mo14257a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f25928b.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f25928b.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f25928b.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public <T> q80<T, RequestBody> mo31020k(@Nullable q80.C6515a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f25922a.indexOf(aVar) + 1;
        int size = this.f25922a.size();
        for (int i = indexOf; i < size; i++) {
            q80<?, RequestBody> c = this.f25922a.get(i).mo33913c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f25922a.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f25922a.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f25922a.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public <T> q80<ResponseBody, T> mo31021l(@Nullable q80.C6515a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f25922a.indexOf(aVar) + 1;
        int size = this.f25922a.size();
        for (int i = indexOf; i < size; i++) {
            q80<ResponseBody, ?> d = this.f25922a.get(i).mo33914d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f25922a.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f25922a.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f25922a.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: m */
    public <T> q80<T, RequestBody> mo31022m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo31020k((q80.C6515a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: n */
    public <T> q80<ResponseBody, T> mo31023n(Type type, Annotation[] annotationArr) {
        return mo31021l((q80.C6515a) null, type, annotationArr);
    }

    /* renamed from: o */
    public <T> q80<T, String> mo31024o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f25922a.size();
        for (int i = 0; i < size; i++) {
            q80<?, String> e = this.f25922a.get(i).mo43172e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C4899cq.C4903d.f27032a;
    }

    /* renamed from: p */
    public final void mo31025p(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f25927a) {
                l23 g = l23.m55221g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g.mo39631i(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo31017h(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
}
