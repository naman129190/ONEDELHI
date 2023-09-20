package com.onedelhi.secure;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/ts;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "forWebSocket", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.ts */
public final class C6895ts implements Interceptor {

    /* renamed from: a */
    public final boolean f35772a;

    public C6895ts(boolean z) {
        this.f35772a = z;
    }

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response.Builder builder2;
        ResponseBody responseBody;
        jt1.m53777p(chain, "chain");
        hg3 hg3 = (hg3) chain;
        qw0 e = hg3.mo37315e();
        jt1.m53774m(e);
        Request g = hg3.mo37317g();
        RequestBody body = g.body();
        long currentTimeMillis = System.currentTimeMillis();
        e.mo43757w(g);
        Long l = null;
        if (!qm1.m63083b(g.method()) || body == null) {
            e.mo43749o();
            builder = null;
            z = true;
        } else {
            if (t54.m65410K1("100-continue", g.header("Expect"), true)) {
                e.mo43740f();
                builder = e.mo43751q(true);
                e.mo43753s();
                z = false;
            } else {
                builder = null;
                z = true;
            }
            if (builder != null) {
                e.mo43749o();
                if (!e.mo43742h().mo35272y()) {
                    e.mo43748n();
                }
            } else if (body.isDuplex()) {
                e.mo43740f();
                body.writeTo(gu2.m49834c(e.mo43737c(g, true)));
            } else {
                C6785so c = gu2.m49834c(e.mo43737c(g, false));
                body.writeTo(c);
                c.close();
            }
        }
        if (body == null || !body.isDuplex()) {
            e.mo43739e();
        }
        if (builder == null) {
            builder = e.mo43751q(false);
            jt1.m53774m(builder);
            if (z) {
                e.mo43753s();
                z = false;
            }
        }
        Response build = builder.request(g).handshake(e.mo43742h().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            Response.Builder q = e.mo43751q(false);
            jt1.m53774m(q);
            if (z) {
                e.mo43753s();
            }
            build = q.request(g).handshake(e.mo43742h().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        e.mo43752r(build);
        if (!this.f35772a || code != 101) {
            builder2 = build.newBuilder();
            responseBody = e.mo43750p(build);
        } else {
            builder2 = build.newBuilder();
            responseBody = nq4.f32733a;
        }
        Response build2 = builder2.body(responseBody).build();
        if (t54.m65410K1("close", build2.request().header("Connection"), true) || t54.m65410K1("close", Response.header$default(build2, "Connection", (String) null, 2, (Object) null), true)) {
            e.mo43748n();
        }
        if (code == 204 || code == 205) {
            ResponseBody body2 = build2.body();
            if ((body2 != null ? body2.contentLength() : -1) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return build2;
    }
}
