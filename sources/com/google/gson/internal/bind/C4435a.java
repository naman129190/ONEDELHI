package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.a */
public final class C4435a<T> extends cj4<T> {

    /* renamed from: a */
    public final cj4<T> f25572a;

    /* renamed from: a */
    public final fj1 f25573a;

    /* renamed from: a */
    public final Type f25574a;

    public C4435a(fj1 fj1, cj4<T> cj4, Type type) {
        this.f25573a = fj1;
        this.f25572a = cj4;
        this.f25574a = type;
    }

    /* renamed from: e */
    public T mo30144e(xv1 xv1) throws IOException {
        return this.f25572a.mo30144e(xv1);
    }

    /* renamed from: i */
    public void mo30145i(lw1 lw1, T t) throws IOException {
        cj4<T> cj4 = this.f25572a;
        Type j = mo30234j(this.f25574a, t);
        if (j != this.f25574a) {
            cj4 = this.f25573a.mo36014p(tj4.get(j));
            if (cj4 instanceof ReflectiveTypeAdapterFactory.C4393b) {
                cj4<T> cj42 = this.f25572a;
                if (!(cj42 instanceof ReflectiveTypeAdapterFactory.C4393b)) {
                    cj4 = cj42;
                }
            }
        }
        cj4.mo30145i(lw1, t);
    }

    /* renamed from: j */
    public final Type mo30234j(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
