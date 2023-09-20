package com.onedelhi.secure;

import com.onedelhi.secure.jg3;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002#\u001bB'\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J9\u0010#\u001a\u00028\u0000\"\n\b\u0000\u0010\u001e*\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0004J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u001dH\u0002R$\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0000@BX\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+R\u001a\u00104\u001a\u0002038\u0000X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0000X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/onedelhi/secure/qw0;", "", "Lokhttp3/Request;", "request", "Lcom/onedelhi/secure/un4;", "w", "", "duplex", "Lcom/onedelhi/secure/oz3;", "c", "f", "e", "s", "expectContinue", "Lokhttp3/Response$Builder;", "q", "Lokhttp3/Response;", "response", "r", "Lokhttp3/ResponseBody;", "p", "Lokhttp3/Headers;", "u", "Lcom/onedelhi/secure/jg3$d;", "m", "v", "n", "b", "d", "Ljava/io/IOException;", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "t", "<set-?>", "isDuplex", "Z", "l", "()Z", "Lcom/onedelhi/secure/eg3;", "connection", "Lcom/onedelhi/secure/eg3;", "h", "()Lcom/onedelhi/secure/eg3;", "k", "isCoalescedConnection", "Lcom/onedelhi/secure/dg3;", "call", "Lcom/onedelhi/secure/dg3;", "g", "()Lcom/onedelhi/secure/dg3;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "i", "()Lokhttp3/EventListener;", "Lcom/onedelhi/secure/sw0;", "finder", "Lcom/onedelhi/secure/sw0;", "j", "()Lcom/onedelhi/secure/sw0;", "Lcom/onedelhi/secure/rw0;", "codec", "<init>", "(Lcom/onedelhi/secure/dg3;Lokhttp3/EventListener;Lcom/onedelhi/secure/sw0;Lcom/onedelhi/secure/rw0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class qw0 {
    @vr2

    /* renamed from: a */
    public final dg3 f34373a;
    @vr2

    /* renamed from: a */
    public final eg3 f34374a;

    /* renamed from: a */
    public final rw0 f34375a;
    @vr2

    /* renamed from: a */
    public final sw0 f34376a;
    @vr2

    /* renamed from: a */
    public final EventListener f34377a;

    /* renamed from: a */
    public boolean f34378a;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J#\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u000b*\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/qw0$a;", "Lcom/onedelhi/secure/ma1;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcom/onedelhi/secure/oz3;", "delegate", "contentLength", "<init>", "(Lcom/onedelhi/secure/qw0;Lcom/onedelhi/secure/oz3;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qw0$a */
    public final class C6617a extends ma1 {

        /* renamed from: a */
        public final /* synthetic */ qw0 f34379a;

        /* renamed from: b */
        public long f34380b;

        /* renamed from: b */
        public boolean f34381b;

        /* renamed from: c */
        public final long f34382c;

        /* renamed from: c */
        public boolean f34383c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6617a(@vr2 qw0 qw0, oz3 oz3, long j) {
            super(oz3);
            jt1.m53777p(oz3, "delegate");
            this.f34379a = qw0;
            this.f34382c = j;
        }

        /* renamed from: a */
        public final <E extends IOException> E mo43758a(E e) {
            if (this.f34381b) {
                return e;
            }
            this.f34381b = true;
            return this.f34379a.mo43735a(this.f34380b, false, true, e);
        }

        public void close() throws IOException {
            if (!this.f34383c) {
                this.f34383c = true;
                long j = this.f34382c;
                if (j == -1 || this.f34380b == j) {
                    try {
                        super.close();
                        mo43758a((IOException) null);
                    } catch (IOException e) {
                        throw mo43758a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw mo43758a(e);
            }
        }

        public void write(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "source");
            if (!this.f34383c) {
                long j2 = this.f34382c;
                if (j2 == -1 || this.f34380b + j <= j2) {
                    try {
                        super.write(noVar, j);
                        this.f34380b += j;
                    } catch (IOException e) {
                        throw mo43758a(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f34382c + " bytes but received " + (this.f34380b + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/qw0$b;", "Lcom/onedelhi/secure/na1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcom/onedelhi/secure/x04;", "delegate", "contentLength", "<init>", "(Lcom/onedelhi/secure/qw0;Lcom/onedelhi/secure/x04;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qw0$b */
    public final class C6618b extends na1 {

        /* renamed from: a */
        public final /* synthetic */ qw0 f34384a;

        /* renamed from: b */
        public long f34385b;

        /* renamed from: b */
        public boolean f34386b = true;

        /* renamed from: c */
        public final long f34387c;

        /* renamed from: c */
        public boolean f34388c;

        /* renamed from: d */
        public boolean f34389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6618b(@vr2 qw0 qw0, x04 x04, long j) {
            super(x04);
            jt1.m53777p(x04, "delegate");
            this.f34384a = qw0;
            this.f34387c = j;
            if (j == 0) {
                mo43759a((IOException) null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo43759a(E e) {
            if (this.f34388c) {
                return e;
            }
            this.f34388c = true;
            if (e == null && this.f34386b) {
                this.f34386b = false;
                this.f34384a.mo43743i().responseBodyStart(this.f34384a.mo43741g());
            }
            return this.f34384a.mo43735a(this.f34385b, true, false, e);
        }

        public void close() throws IOException {
            if (!this.f34389d) {
                this.f34389d = true;
                try {
                    super.close();
                    mo43759a((IOException) null);
                } catch (IOException e) {
                    throw mo43759a(e);
                }
            }
        }

        public long read(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "sink");
            if (!this.f34389d) {
                try {
                    long read = delegate().read(noVar, j);
                    if (this.f34386b) {
                        this.f34386b = false;
                        this.f34384a.mo43743i().responseBodyStart(this.f34384a.mo43741g());
                    }
                    if (read == -1) {
                        mo43759a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f34385b + read;
                    long j3 = this.f34387c;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f34387c + " bytes but received " + j2);
                        }
                    }
                    this.f34385b = j2;
                    if (j2 == j3) {
                        mo43759a((IOException) null);
                    }
                    return read;
                } catch (IOException e) {
                    throw mo43759a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public qw0(@vr2 dg3 dg3, @vr2 EventListener eventListener, @vr2 sw0 sw0, @vr2 rw0 rw0) {
        jt1.m53777p(dg3, es2.f11366Q);
        jt1.m53777p(eventListener, "eventListener");
        jt1.m53777p(sw0, "finder");
        jt1.m53777p(rw0, "codec");
        this.f34373a = dg3;
        this.f34377a = eventListener;
        this.f34376a = sw0;
        this.f34375a = rw0;
        this.f34374a = rw0.mo30988h();
    }

    /* renamed from: a */
    public final <E extends IOException> E mo43735a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            mo43754t(e);
        }
        if (z2) {
            EventListener eventListener = this.f34377a;
            dg3 dg3 = this.f34373a;
            if (e != null) {
                eventListener.requestFailed(dg3, e);
            } else {
                eventListener.requestBodyEnd(dg3, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f34377a.responseFailed(this.f34373a, e);
            } else {
                this.f34377a.responseBodyEnd(this.f34373a, j);
            }
        }
        return this.f34373a.mo34441s(this, z2, z, e);
    }

    /* renamed from: b */
    public final void mo43736b() {
        this.f34375a.cancel();
    }

    @vr2
    /* renamed from: c */
    public final oz3 mo43737c(@vr2 Request request, boolean z) throws IOException {
        jt1.m53777p(request, "request");
        this.f34378a = z;
        RequestBody body = request.body();
        jt1.m53774m(body);
        long contentLength = body.contentLength();
        this.f34377a.requestBodyStart(this.f34373a);
        return new C6617a(this, this.f34375a.mo30986f(request, contentLength), contentLength);
    }

    /* renamed from: d */
    public final void mo43738d() {
        this.f34375a.cancel();
        this.f34373a.mo34441s(this, true, true, null);
    }

    /* renamed from: e */
    public final void mo43739e() throws IOException {
        try {
            this.f34375a.mo30981b();
        } catch (IOException e) {
            this.f34377a.requestFailed(this.f34373a, e);
            mo43754t(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void mo43740f() throws IOException {
        try {
            this.f34375a.mo30989i();
        } catch (IOException e) {
            this.f34377a.requestFailed(this.f34373a, e);
            mo43754t(e);
            throw e;
        }
    }

    @vr2
    /* renamed from: g */
    public final dg3 mo43741g() {
        return this.f34373a;
    }

    @vr2
    /* renamed from: h */
    public final eg3 mo43742h() {
        return this.f34374a;
    }

    @vr2
    /* renamed from: i */
    public final EventListener mo43743i() {
        return this.f34377a;
    }

    @vr2
    /* renamed from: j */
    public final sw0 mo43744j() {
        return this.f34376a;
    }

    /* renamed from: k */
    public final boolean mo43745k() {
        return !jt1.m53768g(this.f34376a.mo44576d().url().host(), this.f34374a.route().address().url().host());
    }

    /* renamed from: l */
    public final boolean mo43746l() {
        return this.f34378a;
    }

    @vr2
    /* renamed from: m */
    public final jg3.C5818d mo43747m() throws SocketException {
        this.f34373a.mo34449z();
        return this.f34375a.mo30988h().mo35239A(this);
    }

    /* renamed from: n */
    public final void mo43748n() {
        this.f34375a.mo30988h().mo35241C();
    }

    /* renamed from: o */
    public final void mo43749o() {
        this.f34373a.mo34441s(this, true, false, null);
    }

    @vr2
    /* renamed from: p */
    public final ResponseBody mo43750p(@vr2 Response response) throws IOException {
        jt1.m53777p(response, "response");
        try {
            String header$default = Response.header$default(response, "Content-Type", (String) null, 2, (Object) null);
            long c = this.f34375a.mo30982c(response);
            return new ig3(header$default, c, gu2.m49835d(new C6618b(this, this.f34375a.mo30984d(response), c)));
        } catch (IOException e) {
            this.f34377a.responseFailed(this.f34373a, e);
            mo43754t(e);
            throw e;
        }
    }

    @ss2
    /* renamed from: q */
    public final Response.Builder mo43751q(boolean z) throws IOException {
        try {
            Response.Builder g = this.f34375a.mo30987g(z);
            if (g != null) {
                g.initExchange$okhttp(this);
            }
            return g;
        } catch (IOException e) {
            this.f34377a.responseFailed(this.f34373a, e);
            mo43754t(e);
            throw e;
        }
    }

    /* renamed from: r */
    public final void mo43752r(@vr2 Response response) {
        jt1.m53777p(response, "response");
        this.f34377a.responseHeadersEnd(this.f34373a, response);
    }

    /* renamed from: s */
    public final void mo43753s() {
        this.f34377a.responseHeadersStart(this.f34373a);
    }

    /* renamed from: t */
    public final void mo43754t(IOException iOException) {
        this.f34376a.mo44580h(iOException);
        this.f34375a.mo30988h().mo35248J(this.f34373a, iOException);
    }

    @vr2
    /* renamed from: u */
    public final Headers mo43755u() throws IOException {
        return this.f34375a.mo30980a();
    }

    /* renamed from: v */
    public final void mo43756v() {
        mo43735a(-1, true, true, (IOException) null);
    }

    /* renamed from: w */
    public final void mo43757w(@vr2 Request request) throws IOException {
        jt1.m53777p(request, "request");
        try {
            this.f34377a.requestHeadersStart(this.f34373a);
            this.f34375a.mo30985e(request);
            this.f34377a.requestHeadersEnd(this.f34373a, request);
        } catch (IOException e) {
            this.f34377a.requestFailed(this.f34373a, e);
            mo43754t(e);
            throw e;
        }
    }
}
