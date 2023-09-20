package com.onedelhi.secure;

import com.onedelhi.secure.q80;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: com.onedelhi.secure.cq */
public final class C4899cq extends q80.C6515a {

    /* renamed from: a */
    public boolean f27028a = true;

    /* renamed from: com.onedelhi.secure.cq$a */
    public static final class C4900a implements q80<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C4900a f27029a = new C4900a();

        /* renamed from: b */
        public ResponseBody mo33915a(ResponseBody responseBody) throws IOException {
            try {
                return er4.m47214a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cq$b */
    public static final class C4901b implements q80<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C4901b f27030a = new C4901b();

        /* renamed from: b */
        public RequestBody mo33915a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: com.onedelhi.secure.cq$c */
    public static final class C4902c implements q80<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C4902c f27031a = new C4902c();

        /* renamed from: b */
        public ResponseBody mo33915a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: com.onedelhi.secure.cq$d */
    public static final class C4903d implements q80<Object, String> {

        /* renamed from: a */
        public static final C4903d f27032a = new C4903d();

        /* renamed from: b */
        public String mo33915a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.cq$e */
    public static final class C4904e implements q80<ResponseBody, un4> {

        /* renamed from: a */
        public static final C4904e f27033a = new C4904e();

        /* renamed from: b */
        public un4 mo33915a(ResponseBody responseBody) {
            responseBody.close();
            return un4.f36206a;
        }
    }

    /* renamed from: com.onedelhi.secure.cq$f */
    public static final class C4905f implements q80<ResponseBody, Void> {

        /* renamed from: a */
        public static final C4905f f27034a = new C4905f();

        /* renamed from: b */
        public Void mo33915a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public q80<?, RequestBody> mo33913c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, am3 am3) {
        if (RequestBody.class.isAssignableFrom(er4.m47221h(type))) {
            return C4901b.f27030a;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public q80<ResponseBody, ?> mo33914d(Type type, Annotation[] annotationArr, am3 am3) {
        if (type == ResponseBody.class) {
            return er4.m47225l(annotationArr, l44.class) ? C4902c.f27031a : C4900a.f27029a;
        }
        if (type == Void.class) {
            return C4905f.f27034a;
        }
        if (!this.f27028a || type != un4.class) {
            return null;
        }
        try {
            return C4904e.f27033a;
        } catch (NoClassDefFoundError unused) {
            this.f27028a = false;
            return null;
        }
    }
}
