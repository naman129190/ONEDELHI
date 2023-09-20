package com.onedelhi.secure;

import com.onedelhi.secure.q80;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
public final class sw2 extends q80.C6515a {

    /* renamed from: a */
    public static final q80.C6515a f35224a = new sw2();

    @IgnoreJRERequirement
    /* renamed from: com.onedelhi.secure.sw2$a */
    public static final class C6795a<T> implements q80<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final q80<ResponseBody, T> f35225a;

        public C6795a(q80<ResponseBody, T> q80) {
            this.f35225a = q80;
        }

        /* renamed from: b */
        public Optional<T> mo33915a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f35225a.mo33915a(responseBody));
        }
    }

    @Nullable
    /* renamed from: d */
    public q80<ResponseBody, ?> mo33914d(Type type, Annotation[] annotationArr, am3 am3) {
        if (q80.C6515a.m62163b(type) != Optional.class) {
            return null;
        }
        return new C6795a(am3.mo31023n(q80.C6515a.m62162a(0, (ParameterizedType) type), annotationArr));
    }
}
