package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class yt1 {

    /* renamed from: a */
    public final Method f38052a;

    /* renamed from: a */
    public final List<?> f38053a;

    public yt1(Method method, List<?> list) {
        this.f38052a = method;
        this.f38053a = Collections.unmodifiableList(list);
    }

    /* renamed from: c */
    public static yt1 m72082c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new yt1(method, new ArrayList(list));
    }

    /* renamed from: a */
    public List<?> mo47934a() {
        return this.f38053a;
    }

    /* renamed from: b */
    public Method mo47935b() {
        return this.f38052a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f38052a.getDeclaringClass().getName(), this.f38052a.getName(), this.f38053a});
    }
}
