package com.onedelhi.secure;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0016\u001a\u00020\u0019\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0016\u001a\u00020\u00198\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010%¨\u0006-"}, d2 = {"Lcom/onedelhi/secure/hg3;", "Lokhttp3/Interceptor$Chain;", "", "index", "Lcom/onedelhi/secure/qw0;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "a", "(ILcom/onedelhi/secure/qw0;Lokhttp3/Request;III)Lcom/onedelhi/secure/hg3;", "Lokhttp3/Connection;", "connection", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "withReadTimeout", "withWriteTimeout", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "proceed", "Lcom/onedelhi/secure/dg3;", "Lcom/onedelhi/secure/dg3;", "c", "()Lcom/onedelhi/secure/dg3;", "Lcom/onedelhi/secure/qw0;", "e", "()Lcom/onedelhi/secure/qw0;", "Lokhttp3/Request;", "g", "()Lokhttp3/Request;", "I", "d", "()I", "f", "h", "", "Lokhttp3/Interceptor;", "interceptors", "<init>", "(Lcom/onedelhi/secure/dg3;Ljava/util/List;ILcom/onedelhi/secure/qw0;Lokhttp3/Request;III)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class hg3 implements Interceptor.Chain {

    /* renamed from: a */
    public int f29608a;
    @vr2

    /* renamed from: a */
    public final dg3 f29609a;
    @ss2

    /* renamed from: a */
    public final qw0 f29610a;

    /* renamed from: a */
    public final List<Interceptor> f29611a;
    @vr2

    /* renamed from: a */
    public final Request f29612a;

    /* renamed from: b */
    public final int f29613b;

    /* renamed from: c */
    public final int f29614c;

    /* renamed from: d */
    public final int f29615d;

    /* renamed from: e */
    public final int f29616e;

    public hg3(@vr2 dg3 dg3, @vr2 List<? extends Interceptor> list, int i, @ss2 qw0 qw0, @vr2 Request request, int i2, int i3, int i4) {
        jt1.m53777p(dg3, es2.f11366Q);
        jt1.m53777p(list, "interceptors");
        jt1.m53777p(request, "request");
        this.f29609a = dg3;
        this.f29611a = list;
        this.f29613b = i;
        this.f29610a = qw0;
        this.f29612a = request;
        this.f29614c = i2;
        this.f29615d = i3;
        this.f29616e = i4;
    }

    /* renamed from: b */
    public static /* synthetic */ hg3 m50512b(hg3 hg3, int i, qw0 qw0, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hg3.f29613b;
        }
        if ((i5 & 2) != 0) {
            qw0 = hg3.f29610a;
        }
        qw0 qw02 = qw0;
        if ((i5 & 4) != 0) {
            request = hg3.f29612a;
        }
        Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = hg3.f29614c;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = hg3.f29615d;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = hg3.f29616e;
        }
        return hg3.mo37309a(i, qw02, request2, i6, i7, i4);
    }

    @vr2
    /* renamed from: a */
    public final hg3 mo37309a(int i, @ss2 qw0 qw0, @vr2 Request request, int i2, int i3, int i4) {
        jt1.m53777p(request, "request");
        return new hg3(this.f29609a, this.f29611a, i, qw0, request, i2, i3, i4);
    }

    @vr2
    /* renamed from: c */
    public final dg3 mo37310c() {
        return this.f29609a;
    }

    @vr2
    public Call call() {
        return this.f29609a;
    }

    public int connectTimeoutMillis() {
        return this.f29614c;
    }

    @ss2
    public Connection connection() {
        qw0 qw0 = this.f29610a;
        if (qw0 != null) {
            return qw0.mo43742h();
        }
        return null;
    }

    /* renamed from: d */
    public final int mo37314d() {
        return this.f29614c;
    }

    @ss2
    /* renamed from: e */
    public final qw0 mo37315e() {
        return this.f29610a;
    }

    /* renamed from: f */
    public final int mo37316f() {
        return this.f29615d;
    }

    @vr2
    /* renamed from: g */
    public final Request mo37317g() {
        return this.f29612a;
    }

    /* renamed from: h */
    public final int mo37318h() {
        return this.f29616e;
    }

    @vr2
    public Response proceed(@vr2 Request request) throws IOException {
        jt1.m53777p(request, "request");
        boolean z = false;
        if (this.f29613b < this.f29611a.size()) {
            this.f29608a++;
            qw0 qw0 = this.f29610a;
            if (qw0 != null) {
                if (qw0.mo43744j().mo44579g(request.url())) {
                    if (!(this.f29608a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f29611a.get(this.f29613b - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f29611a.get(this.f29613b - 1) + " must retain the same host and port").toString());
                }
            }
            hg3 b = m50512b(this, this.f29613b + 1, (qw0) null, request, 0, 0, 0, 58, (Object) null);
            Interceptor interceptor = this.f29611a.get(this.f29613b);
            Response intercept = interceptor.intercept(b);
            if (intercept != null) {
                if (this.f29610a != null) {
                    if (!(this.f29613b + 1 >= this.f29611a.size() || b.f29608a == 1)) {
                        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.body() != null) {
                    z = true;
                }
                if (z) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public int readTimeoutMillis() {
        return this.f29615d;
    }

    @vr2
    public Request request() {
        return this.f29612a;
    }

    @vr2
    public Interceptor.Chain withConnectTimeout(int i, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        if (this.f29610a == null) {
            return m50512b(this, 0, (qw0) null, (Request) null, nq4.m58707j("connectTimeout", (long) i, timeUnit), 0, 0, 55, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @vr2
    public Interceptor.Chain withReadTimeout(int i, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        if (this.f29610a == null) {
            return m50512b(this, 0, (qw0) null, (Request) null, 0, nq4.m58707j("readTimeout", (long) i, timeUnit), 0, 47, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @vr2
    public Interceptor.Chain withWriteTimeout(int i, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        if (this.f29610a == null) {
            return m50512b(this, 0, (qw0) null, (Request) null, 0, 0, nq4.m58707j("writeTimeout", (long) i, timeUnit), 31, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    public int writeTimeoutMillis() {
        return this.f29616e;
    }
}
