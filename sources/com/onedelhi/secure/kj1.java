package com.onedelhi.secure;

import java.io.IOException;
import okhttp3.ResponseBody;

public final class kj1<T> implements q80<ResponseBody, T> {

    /* renamed from: a */
    public final cj4<T> f31234a;

    /* renamed from: a */
    public final fj1 f31235a;

    public kj1(fj1 fj1, cj4<T> cj4) {
        this.f31235a = fj1;
        this.f31234a = cj4;
    }

    /* renamed from: b */
    public T mo33915a(ResponseBody responseBody) throws IOException {
        xv1 v = this.f31235a.mo36020v(responseBody.charStream());
        try {
            T e = this.f31234a.mo30144e(v);
            if (v.mo36944q0() == fw1.END_DOCUMENT) {
                return e;
            }
            throw new qv1("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
