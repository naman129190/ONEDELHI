package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0007\u001c\u001e\u0019\u001a\u0016\u0014&B)\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0018\u0010*\u001a\u00020#*\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020#*\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\u0002008\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006="}, d2 = {"Lcom/onedelhi/secure/am1;", "Lcom/onedelhi/secure/rw0;", "Lcom/onedelhi/secure/oz3;", "w", "z", "", "length", "Lcom/onedelhi/secure/x04;", "y", "Lokhttp3/HttpUrl;", "url", "x", "A", "Lcom/onedelhi/secure/oa1;", "timeout", "Lcom/onedelhi/secure/un4;", "s", "Lokhttp3/Request;", "request", "contentLength", "f", "cancel", "e", "Lokhttp3/Response;", "response", "c", "d", "Lokhttp3/Headers;", "a", "i", "b", "headers", "", "requestLine", "C", "", "expectContinue", "Lokhttp3/Response$Builder;", "g", "B", "u", "(Lokhttp3/Response;)Z", "isChunked", "t", "(Lokhttp3/Request;)Z", "v", "()Z", "isClosed", "Lcom/onedelhi/secure/eg3;", "connection", "Lcom/onedelhi/secure/eg3;", "h", "()Lcom/onedelhi/secure/eg3;", "Lokhttp3/OkHttpClient;", "client", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/so;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lcom/onedelhi/secure/eg3;Lcom/onedelhi/secure/to;Lcom/onedelhi/secure/so;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class am1 implements rw0 {

    /* renamed from: a */
    public static final long f25889a = -1;

    /* renamed from: a */
    public static final C4569d f25890a = new C4569d((wg0) null);

    /* renamed from: c */
    public static final int f25891c = 0;

    /* renamed from: d */
    public static final int f25892d = 1;

    /* renamed from: e */
    public static final int f25893e = 2;

    /* renamed from: f */
    public static final int f25894f = 3;

    /* renamed from: g */
    public static final int f25895g = 4;

    /* renamed from: h */
    public static final int f25896h = 5;

    /* renamed from: i */
    public static final int f25897i = 6;
    @vr2

    /* renamed from: a */
    public final eg3 f25898a;

    /* renamed from: a */
    public final C6785so f25899a;

    /* renamed from: a */
    public final C6893to f25900a;

    /* renamed from: a */
    public final xk1 f25901a;

    /* renamed from: a */
    public Headers f25902a;

    /* renamed from: a */
    public final OkHttpClient f25903a;

    /* renamed from: b */
    public int f25904b;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/am1$a;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "c", "Lcom/onedelhi/secure/oa1;", "Lcom/onedelhi/secure/oa1;", "b", "()Lcom/onedelhi/secure/oa1;", "", "closed", "Z", "a", "()Z", "d", "(Z)V", "<init>", "(Lcom/onedelhi/secure/am1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$a */
    public abstract class C4566a implements x04 {
        @vr2

        /* renamed from: a */
        public final oa1 f25906a;

        /* renamed from: b */
        public boolean f25907b;

        public C4566a() {
            this.f25906a = new oa1(am1.this.f25900a.timeout());
        }

        /* renamed from: a */
        public final boolean mo30998a() {
            return this.f25907b;
        }

        @vr2
        /* renamed from: b */
        public final oa1 mo30999b() {
            return this.f25906a;
        }

        /* renamed from: c */
        public final void mo31000c() {
            if (am1.this.f25904b != 6) {
                if (am1.this.f25904b == 5) {
                    am1.this.mo30990s(this.f25906a);
                    am1.this.f25904b = 6;
                    return;
                }
                throw new IllegalStateException("state: " + am1.this.f25904b);
            }
        }

        /* renamed from: d */
        public final void mo31001d(boolean z) {
            this.f25907b = z;
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            try {
                return am1.this.f25900a.read(noVar, j);
            } catch (IOException e) {
                am1.this.mo30988h().mo35241C();
                mo31000c();
                throw e;
            }
        }

        @vr2
        public me4 timeout() {
            return this.f25906a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/am1$b;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "<init>", "(Lcom/onedelhi/secure/am1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$b */
    public final class C4567b implements oz3 {

        /* renamed from: a */
        public final oa1 f25909a;

        /* renamed from: b */
        public boolean f25910b;

        public C4567b() {
            this.f25909a = new oa1(am1.this.f25899a.timeout());
        }

        public synchronized void close() {
            if (!this.f25910b) {
                this.f25910b = true;
                am1.this.f25899a.mo41279n("0\r\n\r\n");
                am1.this.mo30990s(this.f25909a);
                am1.this.f25904b = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f25910b) {
                am1.this.f25899a.flush();
            }
        }

        @vr2
        public me4 timeout() {
            return this.f25909a;
        }

        public void write(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "source");
            if (!(!this.f25910b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                am1.this.f25899a.mo41261e1(j);
                am1.this.f25899a.mo41279n("\r\n");
                am1.this.f25899a.write(noVar, j);
                am1.this.f25899a.mo41279n("\r\n");
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/am1$c;", "Lcom/onedelhi/secure/am1$a;", "Lcom/onedelhi/secure/am1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "g", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lcom/onedelhi/secure/am1;Lokhttp3/HttpUrl;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$c */
    public final class C4568c extends C4566a {

        /* renamed from: a */
        public final HttpUrl f25911a;

        /* renamed from: b */
        public long f25912b = -1;

        /* renamed from: b */
        public final /* synthetic */ am1 f25913b;

        /* renamed from: c */
        public boolean f25914c = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4568c(@vr2 am1 am1, HttpUrl httpUrl) {
            super();
            jt1.m53777p(httpUrl, ImagesContract.URL);
            this.f25913b = am1;
            this.f25911a = httpUrl;
        }

        public void close() {
            if (!mo30998a()) {
                if (this.f25914c && !nq4.m58720t(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f25913b.mo30988h().mo35241C();
                    mo31000c();
                }
                mo31001d(true);
            }
        }

        /* renamed from: g */
        public final void mo31009g() {
            if (this.f25912b != -1) {
                this.f25913b.f25900a.mo31699r2();
            }
            try {
                this.f25912b = this.f25913b.f25900a.mo31709s2();
                String r2 = this.f25913b.f25900a.mo31699r2();
                if (r2 != null) {
                    String obj = u54.m66544E5(r2).toString();
                    if (this.f25912b >= 0) {
                        if (!(obj.length() > 0) || t54.m65466u2(obj, ";", false, 2, (Object) null)) {
                            if (this.f25912b == 0) {
                                this.f25914c = false;
                                am1 am1 = this.f25913b;
                                am1.f25902a = am1.f25901a.mo47342b();
                                OkHttpClient k = this.f25913b.f25903a;
                                jt1.m53774m(k);
                                CookieJar cookieJar = k.cookieJar();
                                HttpUrl httpUrl = this.f25911a;
                                Headers p = this.f25913b.f25902a;
                                jt1.m53774m(p);
                                om1.m59478g(cookieJar, httpUrl, p);
                                mo31000c();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f25912b + obj + tk4.f35693a);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ mo30998a())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f25914c) {
                return -1;
            } else {
                long j2 = this.f25912b;
                if (j2 == 0 || j2 == -1) {
                    mo31009g();
                    if (!this.f25914c) {
                        return -1;
                    }
                }
                long read = super.read(noVar, Math.min(j, this.f25912b));
                if (read != -1) {
                    this.f25912b -= read;
                    return read;
                }
                this.f25913b.mo30988h().mo35241C();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo31000c();
                throw protocolException;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/am1$d;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$d */
    public static final class C4569d {
        public C4569d() {
        }

        public /* synthetic */ C4569d(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/am1$e;", "Lcom/onedelhi/secure/am1$a;", "Lcom/onedelhi/secure/am1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "bytesRemaining", "<init>", "(Lcom/onedelhi/secure/am1;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$e */
    public final class C4570e extends C4566a {

        /* renamed from: b */
        public long f25915b;

        public C4570e(long j) {
            super();
            this.f25915b = j;
            if (j == 0) {
                mo31000c();
            }
        }

        public void close() {
            if (!mo30998a()) {
                if (this.f25915b != 0 && !nq4.m58720t(this, 100, TimeUnit.MILLISECONDS)) {
                    am1.this.mo30988h().mo35241C();
                    mo31000c();
                }
                mo31001d(true);
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ mo30998a()) {
                long j2 = this.f25915b;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(noVar, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.f25915b - read;
                    this.f25915b = j3;
                    if (j3 == 0) {
                        mo31000c();
                    }
                    return read;
                }
                am1.this.mo30988h().mo35241C();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo31000c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/am1$f;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "<init>", "(Lcom/onedelhi/secure/am1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$f */
    public final class C4571f implements oz3 {

        /* renamed from: a */
        public final oa1 f25918a;

        /* renamed from: b */
        public boolean f25919b;

        public C4571f() {
            this.f25918a = new oa1(am1.this.f25899a.timeout());
        }

        public void close() {
            if (!this.f25919b) {
                this.f25919b = true;
                am1.this.mo30990s(this.f25918a);
                am1.this.f25904b = 3;
            }
        }

        public void flush() {
            if (!this.f25919b) {
                am1.this.f25899a.flush();
            }
        }

        @vr2
        public me4 timeout() {
            return this.f25918a;
        }

        public void write(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "source");
            if (!this.f25919b) {
                nq4.m58709k(noVar.mo41244V0(), 0, j);
                am1.this.f25899a.write(noVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/am1$g;", "Lcom/onedelhi/secure/am1$a;", "Lcom/onedelhi/secure/am1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "<init>", "(Lcom/onedelhi/secure/am1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.am1$g */
    public final class C4572g extends C4566a {

        /* renamed from: c */
        public boolean f25921c;

        public C4572g() {
            super();
        }

        public void close() {
            if (!mo30998a()) {
                if (!this.f25921c) {
                    mo31000c();
                }
                mo31001d(true);
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!mo30998a())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f25921c) {
                return -1;
            } else {
                long read = super.read(noVar, j);
                if (read != -1) {
                    return read;
                }
                this.f25921c = true;
                mo31000c();
                return -1;
            }
        }
    }

    public am1(@ss2 OkHttpClient okHttpClient, @vr2 eg3 eg3, @vr2 C6893to toVar, @vr2 C6785so soVar) {
        jt1.m53777p(eg3, dm1.f27486a);
        jt1.m53777p(toVar, "source");
        jt1.m53777p(soVar, "sink");
        this.f25903a = okHttpClient;
        this.f25898a = eg3;
        this.f25900a = toVar;
        this.f25899a = soVar;
        this.f25901a = new xk1(toVar);
    }

    /* renamed from: A */
    public final x04 mo30977A() {
        if (this.f25904b == 4) {
            this.f25904b = 5;
            mo30988h().mo35241C();
            return new C4572g();
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }

    /* renamed from: B */
    public final void mo30978B(@vr2 Response response) {
        jt1.m53777p(response, "response");
        long x = nq4.m58724x(response);
        if (x != -1) {
            x04 y = mo30996y(x);
            nq4.m58683U(y, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            y.close();
        }
    }

    /* renamed from: C */
    public final void mo30979C(@vr2 Headers headers, @vr2 String str) {
        jt1.m53777p(headers, "headers");
        jt1.m53777p(str, "requestLine");
        if (this.f25904b == 0) {
            this.f25899a.mo41279n(str).mo41279n("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.f25899a.mo41279n(headers.name(i)).mo41279n(": ").mo41279n(headers.value(i)).mo41279n("\r\n");
            }
            this.f25899a.mo41279n("\r\n");
            this.f25904b = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }

    @vr2
    /* renamed from: a */
    public Headers mo30980a() {
        if (this.f25904b == 6) {
            Headers headers = this.f25902a;
            return headers != null ? headers : nq4.f32731a;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    /* renamed from: b */
    public void mo30981b() {
        this.f25899a.flush();
    }

    /* renamed from: c */
    public long mo30982c(@vr2 Response response) {
        jt1.m53777p(response, "response");
        if (!om1.m59474c(response)) {
            return 0;
        }
        if (mo30992u(response)) {
            return -1;
        }
        return nq4.m58724x(response);
    }

    public void cancel() {
        mo30988h().mo35249g();
    }

    @vr2
    /* renamed from: d */
    public x04 mo30984d(@vr2 Response response) {
        long x;
        jt1.m53777p(response, "response");
        if (!om1.m59474c(response)) {
            x = 0;
        } else if (mo30992u(response)) {
            return mo30995x(response.request().url());
        } else {
            x = nq4.m58724x(response);
            if (x == -1) {
                return mo30977A();
            }
        }
        return mo30996y(x);
    }

    /* renamed from: e */
    public void mo30985e(@vr2 Request request) {
        jt1.m53777p(request, "request");
        dj3 dj3 = dj3.f27476a;
        Proxy.Type type = mo30988h().route().proxy().type();
        jt1.m53776o(type, "connection.route().proxy.type()");
        mo30979C(request.headers(), dj3.mo34475a(request, type));
    }

    @vr2
    /* renamed from: f */
    public oz3 mo30986f(@vr2 Request request, long j) {
        jt1.m53777p(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (mo30991t(request)) {
            return mo30994w();
        } else {
            if (j != -1) {
                return mo30997z();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @ss2
    /* renamed from: g */
    public Response.Builder mo30987g(boolean z) {
        int i = this.f25904b;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                r34 b = r34.f34483a.mo43806b(this.f25901a.mo47343c());
                Response.Builder headers = new Response.Builder().protocol(b.f34490a).code(b.f34488a).message(b.f34489a).headers(this.f25901a.mo47342b());
                if (z && b.f34488a == 100) {
                    return null;
                }
                if (b.f34488a == 100) {
                    this.f25904b = 3;
                    return headers;
                }
                this.f25904b = 4;
                return headers;
            } catch (EOFException e) {
                String redact = mo30988h().route().address().url().redact();
                throw new IOException("unexpected end of stream on " + redact, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f25904b).toString());
        }
    }

    @vr2
    /* renamed from: h */
    public eg3 mo30988h() {
        return this.f25898a;
    }

    /* renamed from: i */
    public void mo30989i() {
        this.f25899a.flush();
    }

    /* renamed from: s */
    public final void mo30990s(oa1 oa1) {
        me4 l = oa1.mo41627l();
        oa1.mo41628m(me4.f32090a);
        l.mo40554a();
        l.mo40555b();
    }

    /* renamed from: t */
    public final boolean mo30991t(Request request) {
        return t54.m65410K1("chunked", request.header("Transfer-Encoding"), true);
    }

    /* renamed from: u */
    public final boolean mo30992u(Response response) {
        return t54.m65410K1("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    /* renamed from: v */
    public final boolean mo30993v() {
        return this.f25904b == 6;
    }

    /* renamed from: w */
    public final oz3 mo30994w() {
        boolean z = true;
        if (this.f25904b != 1) {
            z = false;
        }
        if (z) {
            this.f25904b = 2;
            return new C4567b();
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }

    /* renamed from: x */
    public final x04 mo30995x(HttpUrl httpUrl) {
        if (this.f25904b == 4) {
            this.f25904b = 5;
            return new C4568c(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }

    /* renamed from: y */
    public final x04 mo30996y(long j) {
        if (this.f25904b == 4) {
            this.f25904b = 5;
            return new C4570e(j);
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }

    /* renamed from: z */
    public final oz3 mo30997z() {
        boolean z = true;
        if (this.f25904b != 1) {
            z = false;
        }
        if (z) {
            this.f25904b = 2;
            return new C4571f();
        }
        throw new IllegalStateException(("state: " + this.f25904b).toString());
    }
}
