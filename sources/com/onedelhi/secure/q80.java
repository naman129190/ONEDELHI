package com.onedelhi.secure;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public interface q80<F, T> {

    /* renamed from: com.onedelhi.secure.q80$a */
    public static abstract class C6515a {
        /* renamed from: a */
        public static Type m62162a(int i, ParameterizedType parameterizedType) {
            return er4.m47220g(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m62163b(Type type) {
            return er4.m47221h(type);
        }

        @Nullable
        /* renamed from: c */
        public q80<?, RequestBody> mo33913c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, am3 am3) {
            return null;
        }

        @Nullable
        /* renamed from: d */
        public q80<ResponseBody, ?> mo33914d(Type type, Annotation[] annotationArr, am3 am3) {
            return null;
        }

        @Nullable
        /* renamed from: e */
        public q80<?, String> mo43172e(Type type, Annotation[] annotationArr, am3 am3) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    T mo33915a(F f) throws IOException;
}
