package com.onedelhi.secure;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: com.onedelhi.secure.rs */
public interface C6708rs<R, T> {

    /* renamed from: com.onedelhi.secure.rs$a */
    public static abstract class C6709a {
        /* renamed from: b */
        public static Type m63796b(int i, ParameterizedType parameterizedType) {
            return er4.m47220g(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m63797c(Type type) {
            return er4.m47221h(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract C6708rs<?, ?> mo14257a(Type type, Annotation[] annotationArr, am3 am3);
    }

    /* renamed from: a */
    T mo14260a(C6595qs<R> qsVar);

    /* renamed from: b */
    Type mo14261b();
}
