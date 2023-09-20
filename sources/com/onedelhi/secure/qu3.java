package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public abstract class qu3<T> {
    /* renamed from: b */
    public static <T> qu3<T> m63191b(am3 am3, Method method) {
        yi3 b = yi3.m71785b(am3, method);
        Type genericReturnType = method.getGenericReturnType();
        if (er4.m47223j(genericReturnType)) {
            throw er4.m47226m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return bn1.m40176f(am3, method, b);
        } else {
            throw er4.m47226m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo31954a(Object[] objArr);
}
