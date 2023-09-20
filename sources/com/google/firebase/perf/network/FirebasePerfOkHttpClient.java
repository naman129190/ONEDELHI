package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.oo2;
import com.onedelhi.secure.po2;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.vr1;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    public static void m35123a(Response response, oo2 oo2, long j, long j2) throws IOException {
        Request request = response.request();
        if (request != null) {
            oo2.mo41925C(request.url().url().toString());
            oo2.mo41937p(request.method());
            if (request.body() != null) {
                long contentLength = request.body().contentLength();
                if (contentLength != -1) {
                    oo2.mo41942u(contentLength);
                }
            }
            ResponseBody body = response.body();
            if (body != null) {
                long contentLength2 = body.contentLength();
                if (contentLength2 != -1) {
                    oo2.mo41945x(contentLength2);
                }
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    oo2.mo41944w(contentType.toString());
                }
            }
            oo2.mo41938q(response.code());
            oo2.mo41943v(j);
            oo2.mo41947z(j2);
            oo2.mo41927b();
        }
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        qe4 qe4 = new qe4();
        Callback callback2 = callback;
        call.enqueue(new vr1(callback2, li4.m55636l(), qe4, qe4.mo43511e()));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        oo2 c = oo2.m59581c(li4.m55636l());
        qe4 qe4 = new qe4();
        long e = qe4.mo43511e();
        try {
            Response execute = call.execute();
            m35123a(execute, c, e, qe4.mo43508c());
            return execute;
        } catch (IOException e2) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    c.mo41925C(url.url().toString());
                }
                if (request.method() != null) {
                    c.mo41937p(request.method());
                }
            }
            c.mo41943v(e);
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e2;
        }
    }
}
