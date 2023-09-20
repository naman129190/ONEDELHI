package com.onedelhi.secure;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class fu2<T> implements C6595qs<T> {

    /* renamed from: a */
    public final q80<ResponseBody, T> f28650a;

    /* renamed from: a */
    public final yi3 f28651a;
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    public Throwable f28652a;

    /* renamed from: a */
    public final Call.Factory f28653a;
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    public Call f28654a;

    /* renamed from: a */
    public final Object[] f28655a;

    /* renamed from: b */
    public volatile boolean f28656b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f28657c;

    /* renamed from: com.onedelhi.secure.fu2$a */
    public class C5308a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ C7181ws f28659a;

        public C5308a(C7181ws wsVar) {
            this.f28659a = wsVar;
        }

        /* renamed from: a */
        public final void mo36316a(Throwable th) {
            try {
                this.f28659a.mo8646a(fu2.this, th);
            } catch (Throwable th2) {
                er4.m47232s(th2);
                th2.printStackTrace();
            }
        }

        public void onFailure(Call call, IOException iOException) {
            mo36316a(iOException);
        }

        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f28659a.mo8647b(fu2.this, fu2.this.mo36315d(response));
                } catch (Throwable th) {
                    er4.m47232s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                er4.m47232s(th2);
                mo36316a(th2);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fu2$b */
    public static final class C5309b extends ResponseBody {

        /* renamed from: a */
        public final C6893to f28660a;
        @Nullable

        /* renamed from: a */
        public IOException f28661a;

        /* renamed from: a */
        public final ResponseBody f28662a;

        /* renamed from: com.onedelhi.secure.fu2$b$a */
        public class C5310a extends na1 {
            public C5310a(x04 x04) {
                super(x04);
            }

            public long read(C6205no noVar, long j) throws IOException {
                try {
                    return super.read(noVar, j);
                } catch (IOException e) {
                    C5309b.this.f28661a = e;
                    throw e;
                }
            }
        }

        public C5309b(ResponseBody responseBody) {
            this.f28662a = responseBody;
            this.f28660a = gu2.m49835d(new C5310a(responseBody.source()));
        }

        /* renamed from: a */
        public void mo36319a() throws IOException {
            IOException iOException = this.f28661a;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f28662a.close();
        }

        public long contentLength() {
            return this.f28662a.contentLength();
        }

        public MediaType contentType() {
            return this.f28662a.contentType();
        }

        public C6893to source() {
            return this.f28660a;
        }
    }

    /* renamed from: com.onedelhi.secure.fu2$c */
    public static final class C5311c extends ResponseBody {
        @Nullable

        /* renamed from: a */
        public final MediaType f28664a;

        /* renamed from: b */
        public final long f28665b;

        public C5311c(@Nullable MediaType mediaType, long j) {
            this.f28664a = mediaType;
            this.f28665b = j;
        }

        public long contentLength() {
            return this.f28665b;
        }

        public MediaType contentType() {
            return this.f28664a;
        }

        public C6893to source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public fu2(yi3 yi3, Object[] objArr, Call.Factory factory, q80<ResponseBody, T> q80) {
        this.f28651a = yi3;
        this.f28655a = objArr;
        this.f28653a = factory;
        this.f28650a = q80;
    }

    /* renamed from: Yb */
    public el3<T> mo14264Yb() throws IOException {
        Call c;
        synchronized (this) {
            if (!this.f28657c) {
                this.f28657c = true;
                c = mo36313c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f28656b) {
            c.cancel();
        }
        return mo36315d(FirebasePerfOkHttpClient.execute(c));
    }

    /* renamed from: a */
    public fu2<T> clone() {
        return new fu2<>(this.f28651a, this.f28655a, this.f28653a, this.f28650a);
    }

    /* renamed from: b */
    public final Call mo36312b() throws IOException {
        Call newCall = this.f28653a.newCall(this.f28651a.mo47821a(this.f28655a));
        Objects.requireNonNull(newCall, "Call.Factory returned null.");
        return newCall;
    }

    @GuardedBy("this")
    /* renamed from: c */
    public final Call mo36313c() throws IOException {
        Call call = this.f28654a;
        if (call != null) {
            return call;
        }
        Throwable th = this.f28652a;
        if (th == null) {
            try {
                Call b = mo36312b();
                this.f28654a = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                er4.m47232s(e);
                this.f28652a = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public void cancel() {
        Call call;
        this.f28656b = true;
        synchronized (this) {
            call = this.f28654a;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* renamed from: d */
    public el3<T> mo36315d(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C5311c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return el3.m47003d(er4.m47214a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return el3.m47007m(null, build);
        } else {
            C5309b bVar = new C5309b(body);
            try {
                return el3.m47007m(this.f28650a.mo33915a(bVar), build);
            } catch (RuntimeException e) {
                bVar.mo36319a();
                throw e;
            }
        }
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.f28656b) {
            return true;
        }
        synchronized (this) {
            Call call = this.f28654a;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.f28657c;
    }

    /* renamed from: jh */
    public void mo14269jh(C7181ws<T> wsVar) {
        Call call;
        Throwable th;
        Objects.requireNonNull(wsVar, "callback == null");
        synchronized (this) {
            if (!this.f28657c) {
                this.f28657c = true;
                call = this.f28654a;
                th = this.f28652a;
                if (call == null && th == null) {
                    try {
                        Call b = mo36312b();
                        this.f28654a = b;
                        call = b;
                    } catch (Throwable th2) {
                        th = th2;
                        er4.m47232s(th);
                        this.f28652a = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            wsVar.mo8646a(this, th);
            return;
        }
        if (this.f28656b) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new C5308a(wsVar));
    }

    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo36313c().request();
    }

    public synchronized me4 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return mo36313c().timeout();
    }
}
