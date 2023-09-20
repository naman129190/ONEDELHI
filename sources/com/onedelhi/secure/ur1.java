package com.onedelhi.secure;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class ur1<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final oo2 f36235a;

    /* renamed from: a */
    public final qe4 f36236a;

    /* renamed from: a */
    public final ResponseHandler<? extends T> f36237a;

    public ur1(ResponseHandler<? extends T> responseHandler, qe4 qe4, oo2 oo2) {
        this.f36237a = responseHandler;
        this.f36236a = qe4;
        this.f36235a = oo2;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f36235a.mo41947z(this.f36236a.mo43508c());
        this.f36235a.mo41938q(httpResponse.getStatusLine().getStatusCode());
        Long a = po2.m61527a(httpResponse);
        if (a != null) {
            this.f36235a.mo41945x(a.longValue());
        }
        String b = po2.m61528b(httpResponse);
        if (b != null) {
            this.f36235a.mo41944w(b);
        }
        this.f36235a.mo41927b();
        return this.f36237a.handleResponse(httpResponse);
    }
}
