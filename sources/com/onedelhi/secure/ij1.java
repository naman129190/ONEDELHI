package com.onedelhi.secure;

import com.onedelhi.secure.q80;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class ij1 extends q80.C6515a {

    /* renamed from: a */
    public final fj1 f30343a;

    public ij1(fj1 fj1) {
        this.f30343a = fj1;
    }

    /* renamed from: f */
    public static ij1 m52310f() {
        return m52311g(new fj1());
    }

    /* renamed from: g */
    public static ij1 m52311g(fj1 fj1) {
        Objects.requireNonNull(fj1, "gson == null");
        return new ij1(fj1);
    }

    /* renamed from: c */
    public q80<?, RequestBody> mo33913c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, am3 am3) {
        return new jj1(this.f30343a, this.f30343a.mo36014p(tj4.get(type)));
    }

    /* renamed from: d */
    public q80<ResponseBody, ?> mo33914d(Type type, Annotation[] annotationArr, am3 am3) {
        return new kj1(this.f30343a, this.f30343a.mo36014p(tj4.get(type)));
    }
}
