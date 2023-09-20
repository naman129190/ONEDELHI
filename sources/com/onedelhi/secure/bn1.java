package com.onedelhi.secure;

import com.onedelhi.secure.er4;
import com.onedelhi.secure.q51;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

public abstract class bn1<ResponseT, ReturnT> extends qu3<ReturnT> {

    /* renamed from: a */
    public final q80<ResponseBody, ResponseT> f26444a;

    /* renamed from: a */
    public final yi3 f26445a;

    /* renamed from: a */
    public final Call.Factory f26446a;

    /* renamed from: com.onedelhi.secure.bn1$a */
    public static final class C4684a<ResponseT, ReturnT> extends bn1<ResponseT, ReturnT> {

        /* renamed from: a */
        public final C6708rs<ResponseT, ReturnT> f26447a;

        public C4684a(yi3 yi3, Call.Factory factory, q80<ResponseBody, ResponseT> q80, C6708rs<ResponseT, ReturnT> rsVar) {
            super(yi3, factory, q80);
            this.f26447a = rsVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.onedelhi.secure.qs, com.onedelhi.secure.qs<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo31955c(com.onedelhi.secure.C6595qs<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                com.onedelhi.secure.rs<ResponseT, ReturnT> r2 = r0.f26447a
                java.lang.Object r1 = r2.mo14260a(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bn1.C4684a.mo31955c(com.onedelhi.secure.qs, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: com.onedelhi.secure.bn1$b */
    public static final class C4685b<ResponseT> extends bn1<ResponseT, Object> {

        /* renamed from: a */
        public final C6708rs<ResponseT, C6595qs<ResponseT>> f26448a;

        /* renamed from: a */
        public final boolean f26449a;

        public C4685b(yi3 yi3, Call.Factory factory, q80<ResponseBody, ResponseT> q80, C6708rs<ResponseT, C6595qs<ResponseT>> rsVar, boolean z) {
            super(yi3, factory, q80);
            this.f26448a = rsVar;
            this.f26449a = z;
        }

        /* renamed from: c */
        public Object mo31955c(C6595qs<ResponseT> qsVar, Object[] objArr) {
            C6595qs qsVar2 = (C6595qs) this.f26448a.mo14260a(qsVar);
            b80 b80 = objArr[objArr.length - 1];
            try {
                return this.f26449a ? a02.m35644b(qsVar2, b80) : a02.m35643a(qsVar2, b80);
            } catch (Exception e) {
                return a02.m35647e(e, b80);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.bn1$c */
    public static final class C4686c<ResponseT> extends bn1<ResponseT, Object> {

        /* renamed from: a */
        public final C6708rs<ResponseT, C6595qs<ResponseT>> f26450a;

        public C4686c(yi3 yi3, Call.Factory factory, q80<ResponseBody, ResponseT> q80, C6708rs<ResponseT, C6595qs<ResponseT>> rsVar) {
            super(yi3, factory, q80);
            this.f26450a = rsVar;
        }

        /* renamed from: c */
        public Object mo31955c(C6595qs<ResponseT> qsVar, Object[] objArr) {
            C6595qs qsVar2 = (C6595qs) this.f26450a.mo14260a(qsVar);
            b80 b80 = objArr[objArr.length - 1];
            try {
                return a02.m35645c(qsVar2, b80);
            } catch (Exception e) {
                return a02.m35647e(e, b80);
            }
        }
    }

    public bn1(yi3 yi3, Call.Factory factory, q80<ResponseBody, ResponseT> q80) {
        this.f26445a = yi3;
        this.f26446a = factory;
        this.f26444a = q80;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> C6708rs<ResponseT, ReturnT> m40174d(am3 am3, Method method, Type type, Annotation[] annotationArr) {
        try {
            return am3.mo31011b(type, annotationArr);
        } catch (RuntimeException e) {
            throw er4.m47227n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> q80<ResponseBody, ResponseT> m40175e(am3 am3, Method method, Type type) {
        try {
            return am3.mo31023n(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw er4.m47227n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> bn1<ResponseT, ReturnT> m40176f(am3 am3, Method method, yi3 yi3) {
        Type type;
        boolean z;
        Class<el3> cls = el3.class;
        boolean z2 = yi3.f37948d;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = er4.m47219f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (er4.m47221h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = er4.m47220g(0, (ParameterizedType) f);
                z = true;
            }
            type = new er4.C5187b((Type) null, C6595qs.class, f);
            annotations = xz3.m70984a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C6708rs d = m40174d(am3, method, type, annotations);
        Type b = d.mo14261b();
        if (b == Response.class) {
            throw er4.m47226m(method, "'" + er4.m47221h(b).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (b == cls) {
            throw er4.m47226m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!yi3.f37938a.equals(q51.C6513a.f34004x) || Void.class.equals(b)) {
            q80 e = m40175e(am3, method, b);
            Call.Factory factory = am3.f25925a;
            return !z2 ? new C4684a(yi3, factory, e, d) : z ? new C4686c(yi3, factory, e, d) : new C4685b(yi3, factory, e, d, false);
        } else {
            throw er4.m47226m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    @Nullable
    /* renamed from: a */
    public final ReturnT mo31954a(Object[] objArr) {
        return mo31955c(new fu2(this.f26445a, objArr, this.f26446a, this.f26444a), objArr);
    }

    @Nullable
    /* renamed from: c */
    public abstract ReturnT mo31955c(C6595qs<ResponseT> qsVar, Object[] objArr);
}
