package com.onedelhi.secure;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class vr1 implements Callback {

    /* renamed from: a */
    public final long f36649a;

    /* renamed from: a */
    public final oo2 f36650a;

    /* renamed from: a */
    public final qe4 f36651a;

    /* renamed from: a */
    public final Callback f36652a;

    public vr1(Callback callback, li4 li4, qe4 qe4, long j) {
        this.f36652a = callback;
        this.f36650a = oo2.m59581c(li4);
        this.f36649a = j;
        this.f36651a = qe4;
    }

    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f36650a.mo41925C(url.url().toString());
            }
            if (request.method() != null) {
                this.f36650a.mo41937p(request.method());
            }
        }
        this.f36650a.mo41943v(this.f36649a);
        this.f36650a.mo41947z(this.f36651a.mo43508c());
        po2.m61530d(this.f36650a);
        this.f36652a.onFailure(call, iOException);
    }

    public void onResponse(Call call, Response response) throws IOException {
        Response response2 = response;
        FirebasePerfOkHttpClient.m35123a(response2, this.f36650a, this.f36649a, this.f36651a.mo43508c());
        this.f36652a.onResponse(call, response);
    }
}
