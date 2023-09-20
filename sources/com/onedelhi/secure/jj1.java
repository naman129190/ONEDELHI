package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public final class jj1<T> implements q80<T, RequestBody> {

    /* renamed from: a */
    public static final Charset f30840a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static final MediaType f30841a = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a */
    public final cj4<T> f30842a;

    /* renamed from: a */
    public final fj1 f30843a;

    public jj1(fj1 fj1, cj4<T> cj4) {
        this.f30843a = fj1;
        this.f30842a = cj4;
    }

    /* renamed from: b */
    public RequestBody mo33915a(T t) throws IOException {
        C6205no noVar = new C6205no();
        lw1 w = this.f30843a.mo36021w(new OutputStreamWriter(noVar.mo41223F(), f30840a));
        this.f30842a.mo30145i(w, t);
        w.close();
        return RequestBody.create(f30841a, noVar.mo31697r0());
    }
}
