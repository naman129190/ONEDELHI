package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.yg3;
import com.onedelhi.secure.yw4;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005/-+30BA\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010G\u001a\u00020\r\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010J\u001a\u00020\u000f\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010L\u001a\u00020\u000f¢\u0006\u0004\bM\u0010NJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#J\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010'\u001a\u00020\bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0006H\u0016J\u000e\u00105\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00106\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001bH\u0016J \u00108\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001b2\u0006\u00107\u001a\u00020\u000fJ\u000f\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000bH\u0000¢\u0006\u0004\b;\u0010<J\u001c\u0010?\u001a\u00020\u000b2\n\u00100\u001a\u00060=j\u0002`>2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u001a\u0010A\u001a\u00020@8\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006O"}, d2 = {"Lcom/onedelhi/secure/jg3;", "Lokhttp3/WebSocket;", "Lcom/onedelhi/secure/yw4$a;", "Lcom/onedelhi/secure/ww4;", "", "s", "Lcom/onedelhi/secure/fr;", "data", "", "formatOpcode", "z", "Lcom/onedelhi/secure/un4;", "y", "Lokhttp3/Request;", "request", "", "queueSize", "cancel", "Lokhttp3/OkHttpClient;", "client", "o", "Lokhttp3/Response;", "response", "Lcom/onedelhi/secure/qw0;", "exchange", "m", "(Lokhttp3/Response;Lcom/onedelhi/secure/qw0;)V", "", "name", "Lcom/onedelhi/secure/jg3$d;", "streams", "r", "t", "v", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "l", "B", "A", "w", "x", "text", "c", "bytes", "b", "payload", "a", "e", "code", "reason", "d", "send", "u", "close", "cancelAfterCloseMillis", "n", "C", "()Z", "D", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "q", "()Lokhttp3/WebSocketListener;", "Lcom/onedelhi/secure/fa4;", "taskRunner", "originalRequest", "Ljava/util/Random;", "random", "pingIntervalMillis", "extensions", "minimumDeflateSize", "<init>", "(Lcom/onedelhi/secure/fa4;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLcom/onedelhi/secure/ww4;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class jg3 implements WebSocket, yw4.C7396a {

    /* renamed from: a */
    public static final C5816b f30766a = new C5816b((wg0) null);

    /* renamed from: a */
    public static final List<Protocol> f30767a = r00.m63300l(Protocol.HTTP_1_1);

    /* renamed from: d */
    public static final long f30768d = 16777216;

    /* renamed from: e */
    public static final long f30769e = 60000;

    /* renamed from: f */
    public static final long f30770f = 1024;

    /* renamed from: a */
    public int f30771a = -1;

    /* renamed from: a */
    public long f30772a;

    /* renamed from: a */
    public ea4 f30773a;

    /* renamed from: a */
    public C5818d f30774a;

    /* renamed from: a */
    public v94 f30775a;

    /* renamed from: a */
    public ww4 f30776a;

    /* renamed from: a */
    public yw4 f30777a;

    /* renamed from: a */
    public zw4 f30778a;

    /* renamed from: a */
    public final String f30779a;

    /* renamed from: a */
    public final ArrayDeque<C5301fr> f30780a = new ArrayDeque<>();

    /* renamed from: a */
    public final Random f30781a;

    /* renamed from: a */
    public Call f30782a;

    /* renamed from: a */
    public final Request f30783a;
    @vr2

    /* renamed from: a */
    public final WebSocketListener f30784a;

    /* renamed from: a */
    public boolean f30785a;

    /* renamed from: b */
    public int f30786b;

    /* renamed from: b */
    public final long f30787b;

    /* renamed from: b */
    public String f30788b;

    /* renamed from: b */
    public final ArrayDeque<Object> f30789b = new ArrayDeque<>();

    /* renamed from: b */
    public boolean f30790b;

    /* renamed from: c */
    public int f30791c;

    /* renamed from: c */
    public long f30792c;

    /* renamed from: c */
    public String f30793c;

    /* renamed from: c */
    public boolean f30794c;

    /* renamed from: d */
    public int f30795d;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/jg3$a;", "", "", "code", "I", "b", "()I", "Lcom/onedelhi/secure/fr;", "reason", "Lcom/onedelhi/secure/fr;", "c", "()Lcom/onedelhi/secure/fr;", "", "cancelAfterCloseMillis", "J", "a", "()J", "<init>", "(ILcom/onedelhi/secure/fr;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$a */
    public static final class C5815a {

        /* renamed from: a */
        public final int f30796a;

        /* renamed from: a */
        public final long f30797a;
        @ss2

        /* renamed from: a */
        public final C5301fr f30798a;

        public C5815a(int i, @ss2 C5301fr frVar, long j) {
            this.f30796a = i;
            this.f30798a = frVar;
            this.f30797a = j;
        }

        /* renamed from: a */
        public final long mo38663a() {
            return this.f30797a;
        }

        /* renamed from: b */
        public final int mo38664b() {
            return this.f30796a;
        }

        @ss2
        /* renamed from: c */
        public final C5301fr mo38665c() {
            return this.f30798a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/jg3$b;", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lokhttp3/Protocol;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$b */
    public static final class C5816b {
        public C5816b() {
        }

        public /* synthetic */ C5816b(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/jg3$c;", "", "", "formatOpcode", "I", "b", "()I", "Lcom/onedelhi/secure/fr;", "data", "Lcom/onedelhi/secure/fr;", "a", "()Lcom/onedelhi/secure/fr;", "<init>", "(ILcom/onedelhi/secure/fr;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$c */
    public static final class C5817c {

        /* renamed from: a */
        public final int f30799a;
        @vr2

        /* renamed from: a */
        public final C5301fr f30800a;

        public C5817c(int i, @vr2 C5301fr frVar) {
            jt1.m53777p(frVar, C4311b.C4317f.C4318a.f25149a);
            this.f30799a = i;
            this.f30800a = frVar;
        }

        @vr2
        /* renamed from: a */
        public final C5301fr mo38666a() {
            return this.f30800a;
        }

        /* renamed from: b */
        public final int mo38667b() {
            return this.f30799a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/jg3$d;", "Ljava/io/Closeable;", "", "client", "Z", "a", "()Z", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/to;", "c", "()Lcom/onedelhi/secure/to;", "Lcom/onedelhi/secure/so;", "sink", "Lcom/onedelhi/secure/so;", "b", "()Lcom/onedelhi/secure/so;", "<init>", "(ZLcom/onedelhi/secure/to;Lcom/onedelhi/secure/so;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$d */
    public static abstract class C5818d implements Closeable {
        @vr2

        /* renamed from: a */
        public final C6785so f30801a;
        @vr2

        /* renamed from: a */
        public final C6893to f30802a;

        /* renamed from: b */
        public final boolean f30803b;

        public C5818d(boolean z, @vr2 C6893to toVar, @vr2 C6785so soVar) {
            jt1.m53777p(toVar, "source");
            jt1.m53777p(soVar, "sink");
            this.f30803b = z;
            this.f30802a = toVar;
            this.f30801a = soVar;
        }

        /* renamed from: a */
        public final boolean mo38668a() {
            return this.f30803b;
        }

        @vr2
        /* renamed from: b */
        public final C6785so mo38669b() {
            return this.f30801a;
        }

        @vr2
        /* renamed from: c */
        public final C6893to mo38670c() {
            return this.f30802a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/jg3$e;", "Lcom/onedelhi/secure/v94;", "", "f", "<init>", "(Lcom/onedelhi/secure/jg3;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$e */
    public final class C5819e extends v94 {
        public C5819e() {
            super(jg3.this.f30788b + " writer", false, 2, (wg0) null);
        }

        /* renamed from: f */
        public long mo33844f() {
            try {
                return jg3.this.mo38635C() ? 0 : -1;
            } catch (IOException e) {
                jg3.this.mo38648p(e, (Response) null);
                return -1;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/onedelhi/secure/jg3$f", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Lcom/onedelhi/secure/un4;", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$f */
    public static final class C5820f implements Callback {

        /* renamed from: a */
        public final /* synthetic */ jg3 f30805a;

        /* renamed from: a */
        public final /* synthetic */ Request f30806a;

        public C5820f(jg3 jg3, Request request) {
            this.f30805a = jg3;
            this.f30806a = request;
        }

        public void onFailure(@vr2 Call call, @vr2 IOException iOException) {
            jt1.m53777p(call, es2.f11366Q);
            jt1.m53777p(iOException, "e");
            this.f30805a.mo38648p(iOException, (Response) null);
        }

        public void onResponse(@vr2 Call call, @vr2 Response response) {
            jt1.m53777p(call, es2.f11366Q);
            jt1.m53777p(response, "response");
            qw0 exchange = response.exchange();
            try {
                this.f30805a.mo38645m(response, exchange);
                jt1.m53774m(exchange);
                C5818d m = exchange.mo43747m();
                ww4 a = ww4.f37153a.mo46914a(response.headers());
                this.f30805a.f30776a = a;
                if (!this.f30805a.mo38653s(a)) {
                    synchronized (this.f30805a) {
                        this.f30805a.f30789b.clear();
                        this.f30805a.close(b33.f9639k, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.f30805a.mo38651r(nq4.f32729a + " WebSocket " + this.f30806a.url().redact(), m);
                    this.f30805a.mo38649q().onOpen(this.f30805a, response);
                    this.f30805a.mo38656t();
                } catch (Exception e) {
                    this.f30805a.mo38648p(e, (Response) null);
                }
            } catch (IOException e2) {
                if (exchange != null) {
                    exchange.mo43756v();
                }
                this.f30805a.mo38648p(e2, response);
                nq4.m58711l(response);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$g */
    public static final class C5821g extends v94 {

        /* renamed from: a */
        public final /* synthetic */ C5818d f30807a;

        /* renamed from: a */
        public final /* synthetic */ jg3 f30808a;

        /* renamed from: a */
        public final /* synthetic */ ww4 f30809a;

        /* renamed from: b */
        public final /* synthetic */ long f30810b;

        /* renamed from: b */
        public final /* synthetic */ String f30811b;

        /* renamed from: c */
        public final /* synthetic */ String f30812c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5821g(String str, String str2, long j, jg3 jg3, String str3, C5818d dVar, ww4 ww4) {
            super(str2, false, 2, (wg0) null);
            this.f30811b = str;
            this.f30810b = j;
            this.f30808a = jg3;
            this.f30812c = str3;
            this.f30807a = dVar;
            this.f30809a = ww4;
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f30808a.mo38636D();
            return this.f30810b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.jg3$h */
    public static final class C5822h extends v94 {

        /* renamed from: a */
        public final /* synthetic */ C5301fr f30813a;

        /* renamed from: a */
        public final /* synthetic */ jg3 f30814a;

        /* renamed from: a */
        public final /* synthetic */ yg3.C7355f f30815a;

        /* renamed from: a */
        public final /* synthetic */ yg3.C7357h f30816a;

        /* renamed from: a */
        public final /* synthetic */ zw4 f30817a;

        /* renamed from: b */
        public final /* synthetic */ yg3.C7357h f30818b;

        /* renamed from: b */
        public final /* synthetic */ String f30819b;

        /* renamed from: b */
        public final /* synthetic */ boolean f30820b;

        /* renamed from: c */
        public final /* synthetic */ yg3.C7357h f30821c;

        /* renamed from: d */
        public final /* synthetic */ yg3.C7357h f30822d;

        /* renamed from: e */
        public final /* synthetic */ yg3.C7357h f30823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5822h(String str, boolean z, String str2, boolean z2, jg3 jg3, zw4 zw4, C5301fr frVar, yg3.C7357h hVar, yg3.C7355f fVar, yg3.C7357h hVar2, yg3.C7357h hVar3, yg3.C7357h hVar4, yg3.C7357h hVar5) {
            super(str2, z2);
            this.f30819b = str;
            this.f30820b = z;
            this.f30814a = jg3;
            this.f30817a = zw4;
            this.f30813a = frVar;
            this.f30816a = hVar;
            this.f30815a = fVar;
            this.f30818b = hVar2;
            this.f30821c = hVar3;
            this.f30822d = hVar4;
            this.f30823e = hVar5;
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f30814a.cancel();
            return -1;
        }
    }

    public jg3(@vr2 fa4 fa4, @vr2 Request request, @vr2 WebSocketListener webSocketListener, @vr2 Random random, long j, @ss2 ww4 ww4, long j2) {
        jt1.m53777p(fa4, "taskRunner");
        jt1.m53777p(request, "originalRequest");
        jt1.m53777p(webSocketListener, "listener");
        jt1.m53777p(random, "random");
        this.f30783a = request;
        this.f30784a = webSocketListener;
        this.f30781a = random;
        this.f30787b = j;
        this.f30776a = ww4;
        this.f30792c = j2;
        this.f30773a = fa4.mo35812j();
        if (jt1.m53768g("GET", request.method())) {
            C5301fr.C5302a aVar = C5301fr.f28633a;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            un4 un4 = un4.f36206a;
            this.f30779a = C5301fr.C5302a.m48446p(aVar, bArr, 0, 0, 3, (Object) null).mo31169g();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + request.method()).toString());
    }

    /* renamed from: A */
    public final synchronized int mo38633A() {
        return this.f30786b;
    }

    /* renamed from: B */
    public final void mo38634B() throws InterruptedException {
        this.f30773a.mo35005u();
        this.f30773a.mo34997l().await(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        if (r3 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.onedelhi.secure.jt1.m53774m(r21);
        r21.mo48461l(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        r1 = r21;
        r0 = r0.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010c, code lost:
        if ((r0 instanceof com.onedelhi.secure.jg3.C5817c) == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        r0 = (com.onedelhi.secure.jg3.C5817c) r0;
        com.onedelhi.secure.jt1.m53774m(r1);
        r1.mo48459g(r0.mo38667b(), r0.mo38666a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        monitor-enter(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r15.f30772a -= (long) r0.mo38666a().mo36274j0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        monitor-exit(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013b, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        if ((r0 instanceof com.onedelhi.secure.jg3.C5815a) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0142, code lost:
        r0 = (com.onedelhi.secure.jg3.C5815a) r0;
        com.onedelhi.secure.jt1.m53774m(r1);
        r1.mo48456c(r0.mo38664b(), r0.mo38665c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        if (((com.onedelhi.secure.jg3.C5818d) r1.f37912a) == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015a, code lost:
        r0 = r15.f30784a;
        r2 = r26.f37910n;
        r3 = (java.lang.String) r25.f37912a;
        com.onedelhi.secure.jt1.m53774m(r3);
        r0.onClosed(r15, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        r1 = (com.onedelhi.secure.jg3.C5818d) r1.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        if (r1 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        r1 = (com.onedelhi.secure.yw4) r23.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        if (r1 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0181, code lost:
        r1 = (com.onedelhi.secure.zw4) r22.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0187, code lost:
        if (r1 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0189, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018e, code lost:
        r3 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b0, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b6, code lost:
        r1 = (com.onedelhi.secure.jg3.C5818d) r1.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ba, code lost:
        if (r1 != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r1 = (com.onedelhi.secure.yw4) r2.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c3, code lost:
        if (r1 != null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c5, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c8, code lost:
        r1 = (com.onedelhi.secure.zw4) r3.f37912a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cc, code lost:
        if (r1 != null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
        com.onedelhi.secure.nq4.m58711l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo38635C() throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            com.onedelhi.secure.yg3$h r0 = new com.onedelhi.secure.yg3$h
            r0.<init>()
            r1 = 0
            r0.f37912a = r1
            com.onedelhi.secure.yg3$f r14 = new com.onedelhi.secure.yg3$f
            r14.<init>()
            r2 = -1
            r14.f37910n = r2
            com.onedelhi.secure.yg3$h r13 = new com.onedelhi.secure.yg3$h
            r13.<init>()
            r13.f37912a = r1
            com.onedelhi.secure.yg3$h r12 = new com.onedelhi.secure.yg3$h
            r12.<init>()
            r12.f37912a = r1
            com.onedelhi.secure.yg3$h r11 = new com.onedelhi.secure.yg3$h
            r11.<init>()
            r11.f37912a = r1
            com.onedelhi.secure.yg3$h r10 = new com.onedelhi.secure.yg3$h
            r10.<init>()
            r10.f37912a = r1
            monitor-enter(r27)
            boolean r3 = r15.f30790b     // Catch:{ all -> 0x01d2 }
            r4 = 0
            if (r3 == 0) goto L_0x0036
            monitor-exit(r27)
            return r4
        L_0x0036:
            com.onedelhi.secure.zw4 r9 = r15.f30778a     // Catch:{ all -> 0x01d2 }
            java.util.ArrayDeque<com.onedelhi.secure.fr> r3 = r15.f30780a     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01d2 }
            r8 = r3
            com.onedelhi.secure.fr r8 = (com.onedelhi.secure.C5301fr) r8     // Catch:{ all -> 0x01d2 }
            if (r8 != 0) goto L_0x00e6
            java.util.ArrayDeque<java.lang.Object> r3 = r15.f30789b     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01d2 }
            r0.f37912a = r3     // Catch:{ all -> 0x01d2 }
            boolean r5 = r3 instanceof com.onedelhi.secure.jg3.C5815a     // Catch:{ all -> 0x01d2 }
            if (r5 == 0) goto L_0x00d4
            int r3 = r15.f30771a     // Catch:{ all -> 0x01d2 }
            r14.f37910n = r3     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r15.f30793c     // Catch:{ all -> 0x01d2 }
            r13.f37912a = r4     // Catch:{ all -> 0x01d2 }
            if (r3 == r2) goto L_0x0072
            com.onedelhi.secure.jg3$d r2 = r15.f30774a     // Catch:{ all -> 0x01d2 }
            r12.f37912a = r2     // Catch:{ all -> 0x01d2 }
            r15.f30774a = r1     // Catch:{ all -> 0x01d2 }
            com.onedelhi.secure.yw4 r2 = r15.f30777a     // Catch:{ all -> 0x01d2 }
            r11.f37912a = r2     // Catch:{ all -> 0x01d2 }
            r15.f30777a = r1     // Catch:{ all -> 0x01d2 }
            com.onedelhi.secure.zw4 r2 = r15.f30778a     // Catch:{ all -> 0x01d2 }
            r10.f37912a = r2     // Catch:{ all -> 0x01d2 }
            r15.f30778a = r1     // Catch:{ all -> 0x01d2 }
            com.onedelhi.secure.ea4 r1 = r15.f30773a     // Catch:{ all -> 0x01d2 }
            r1.mo35005u()     // Catch:{ all -> 0x01d2 }
            goto L_0x00e6
        L_0x0072:
            T r1 = r0.f37912a     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x00cc
            com.onedelhi.secure.jg3$a r1 = (com.onedelhi.secure.jg3.C5815a) r1     // Catch:{ all -> 0x01d2 }
            long r1 = r1.mo38663a()     // Catch:{ all -> 0x01d2 }
            com.onedelhi.secure.ea4 r7 = r15.f30773a     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r3.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r15.f30788b     // Catch:{ all -> 0x01d2 }
            r3.append(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = " cancel"
            r3.append(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x01d2 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01d2 }
            long r5 = r3.toNanos(r1)     // Catch:{ all -> 0x01d2 }
            r16 = 1
            com.onedelhi.secure.jg3$h r3 = new com.onedelhi.secure.jg3$h     // Catch:{ all -> 0x01d2 }
            r1 = r3
            r2 = r4
            r17 = r3
            r3 = r16
            r18 = r5
            r5 = r16
            r6 = r27
            r20 = r7
            r7 = r9
            r16 = r8
            r21 = r9
            r9 = r0
            r22 = r10
            r10 = r14
            r23 = r11
            r11 = r13
            r24 = r12
            r25 = r13
            r13 = r23
            r26 = r14
            r14 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01d2 }
            r4 = r17
            r2 = r18
            r1 = r20
            r1.mo34998m(r4, r2)     // Catch:{ all -> 0x01d2 }
            goto L_0x00f4
        L_0x00cc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch:{ all -> 0x01d2 }
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x00d4:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            if (r3 != 0) goto L_0x00f4
            monitor-exit(r27)
            return r4
        L_0x00e6:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
        L_0x00f4:
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x01d2 }
            monitor-exit(r27)
            r3 = r16
            if (r3 == 0) goto L_0x0106
            com.onedelhi.secure.jt1.m53774m(r21)     // Catch:{ all -> 0x01af }
            r1 = r21
            r1.mo48461l(r3)     // Catch:{ all -> 0x01af }
        L_0x0103:
            r1 = r24
            goto L_0x016c
        L_0x0106:
            r1 = r21
            T r0 = r0.f37912a     // Catch:{ all -> 0x01af }
            boolean r2 = r0 instanceof com.onedelhi.secure.jg3.C5817c     // Catch:{ all -> 0x01af }
            if (r2 == 0) goto L_0x013c
            if (r0 == 0) goto L_0x0134
            com.onedelhi.secure.jg3$c r0 = (com.onedelhi.secure.jg3.C5817c) r0     // Catch:{ all -> 0x01af }
            com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x01af }
            int r2 = r0.mo38667b()     // Catch:{ all -> 0x01af }
            com.onedelhi.secure.fr r3 = r0.mo38666a()     // Catch:{ all -> 0x01af }
            r1.mo48459g(r2, r3)     // Catch:{ all -> 0x01af }
            monitor-enter(r27)     // Catch:{ all -> 0x01af }
            long r1 = r15.f30772a     // Catch:{ all -> 0x0131 }
            com.onedelhi.secure.fr r0 = r0.mo38666a()     // Catch:{ all -> 0x0131 }
            int r0 = r0.mo36274j0()     // Catch:{ all -> 0x0131 }
            long r3 = (long) r0     // Catch:{ all -> 0x0131 }
            long r1 = r1 - r3
            r15.f30772a = r1     // Catch:{ all -> 0x0131 }
            monitor-exit(r27)     // Catch:{ all -> 0x01af }
            goto L_0x0103
        L_0x0131:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x0134:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01af }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r0.<init>(r1)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x013c:
            boolean r2 = r0 instanceof com.onedelhi.secure.jg3.C5815a     // Catch:{ all -> 0x01af }
            if (r2 == 0) goto L_0x01a1
            if (r0 == 0) goto L_0x0193
            com.onedelhi.secure.jg3$a r0 = (com.onedelhi.secure.jg3.C5815a) r0     // Catch:{ all -> 0x01af }
            com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x01af }
            int r2 = r0.mo38664b()     // Catch:{ all -> 0x01af }
            com.onedelhi.secure.fr r0 = r0.mo38665c()     // Catch:{ all -> 0x01af }
            r1.mo48456c(r2, r0)     // Catch:{ all -> 0x01af }
            r1 = r24
            T r0 = r1.f37912a     // Catch:{ all -> 0x018d }
            com.onedelhi.secure.jg3$d r0 = (com.onedelhi.secure.jg3.C5818d) r0     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x016c
            okhttp3.WebSocketListener r0 = r15.f30784a     // Catch:{ all -> 0x018d }
            r2 = r26
            int r2 = r2.f37910n     // Catch:{ all -> 0x018d }
            r3 = r25
            T r3 = r3.f37912a     // Catch:{ all -> 0x018d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x018d }
            com.onedelhi.secure.jt1.m53774m(r3)     // Catch:{ all -> 0x018d }
            r0.onClosed(r15, r2, r3)     // Catch:{ all -> 0x018d }
        L_0x016c:
            r0 = 1
            T r1 = r1.f37912a
            com.onedelhi.secure.jg3$d r1 = (com.onedelhi.secure.jg3.C5818d) r1
            if (r1 == 0) goto L_0x0176
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x0176:
            r2 = r23
            T r1 = r2.f37912a
            com.onedelhi.secure.yw4 r1 = (com.onedelhi.secure.yw4) r1
            if (r1 == 0) goto L_0x0181
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x0181:
            r3 = r22
            T r1 = r3.f37912a
            com.onedelhi.secure.zw4 r1 = (com.onedelhi.secure.zw4) r1
            if (r1 == 0) goto L_0x018c
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x018c:
            return r0
        L_0x018d:
            r0 = move-exception
            r3 = r22
            r2 = r23
            goto L_0x01b6
        L_0x0193:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01ad }
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r4)     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01a1:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x01ad }
            r0.<init>()     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r0 = move-exception
            goto L_0x01b6
        L_0x01af:
            r0 = move-exception
            r3 = r22
            r2 = r23
            r1 = r24
        L_0x01b6:
            T r1 = r1.f37912a
            com.onedelhi.secure.jg3$d r1 = (com.onedelhi.secure.jg3.C5818d) r1
            if (r1 == 0) goto L_0x01bf
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x01bf:
            T r1 = r2.f37912a
            com.onedelhi.secure.yw4 r1 = (com.onedelhi.secure.yw4) r1
            if (r1 == 0) goto L_0x01c8
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x01c8:
            T r1 = r3.f37912a
            com.onedelhi.secure.zw4 r1 = (com.onedelhi.secure.zw4) r1
            if (r1 == 0) goto L_0x01d1
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x01d1:
            throw r0
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38635C():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r1 == -1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        mo38648p(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f30787b + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.mo48460h(com.onedelhi.secure.C5301fr.f28634a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        mo38648p(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38636D() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f30790b     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            com.onedelhi.secure.zw4 r0 = r7.f30778a     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            boolean r1 = r7.f30794c     // Catch:{ all -> 0x0059 }
            r2 = -1
            if (r1 == 0) goto L_0x0013
            int r1 = r7.f30786b     // Catch:{ all -> 0x0059 }
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            int r3 = r7.f30786b     // Catch:{ all -> 0x0059 }
            r4 = 1
            int r3 = r3 + r4
            r7.f30786b = r3     // Catch:{ all -> 0x0059 }
            r7.f30794c = r4     // Catch:{ all -> 0x0059 }
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004c
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f30787b
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.mo38648p(r0, r3)
            return
        L_0x004c:
            com.onedelhi.secure.fr r1 = com.onedelhi.secure.C5301fr.f28634a     // Catch:{ IOException -> 0x0052 }
            r0.mo48460h(r1)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r7.mo38648p(r0, r3)
        L_0x0056:
            return
        L_0x0057:
            monitor-exit(r7)
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38636D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo38637a(@com.onedelhi.secure.vr2 com.onedelhi.secure.C5301fr r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            com.onedelhi.secure.jt1.m53777p(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.f30790b     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.f30785a     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f30789b     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<com.onedelhi.secure.fr> r0 = r1.f30780a     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.mo38661y()     // Catch:{ all -> 0x0029 }
            int r2 = r1.f30791c     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.f30791c = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38637a(com.onedelhi.secure.fr):void");
    }

    /* renamed from: b */
    public void mo38638b(@vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, "bytes");
        this.f30784a.onMessage((WebSocket) this, frVar);
    }

    /* renamed from: c */
    public void mo38639c(@vr2 String str) throws IOException {
        jt1.m53777p(str, "text");
        this.f30784a.onMessage((WebSocket) this, str);
    }

    public void cancel() {
        Call call = this.f30782a;
        jt1.m53774m(call);
        call.cancel();
    }

    public boolean close(int i, @ss2 String str) {
        return mo38646n(i, str, f30769e);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.onedelhi.secure.jg3$d, com.onedelhi.secure.zw4, com.onedelhi.secure.yw4] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38642d(int r5, @com.onedelhi.secure.vr2 java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            com.onedelhi.secure.jt1.m53777p(r6, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r3 == 0) goto L_0x007d
            monitor-enter(r4)
            int r3 = r4.f30771a     // Catch:{ all -> 0x007a }
            if (r3 != r2) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x006e
            r4.f30771a = r5     // Catch:{ all -> 0x007a }
            r4.f30793c = r6     // Catch:{ all -> 0x007a }
            boolean r0 = r4.f30785a     // Catch:{ all -> 0x007a }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            java.util.ArrayDeque<java.lang.Object> r0 = r4.f30789b     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x003c
            com.onedelhi.secure.jg3$d r0 = r4.f30774a     // Catch:{ all -> 0x007a }
            r4.f30774a = r1     // Catch:{ all -> 0x007a }
            com.onedelhi.secure.yw4 r2 = r4.f30777a     // Catch:{ all -> 0x007a }
            r4.f30777a = r1     // Catch:{ all -> 0x007a }
            com.onedelhi.secure.zw4 r3 = r4.f30778a     // Catch:{ all -> 0x007a }
            r4.f30778a = r1     // Catch:{ all -> 0x007a }
            com.onedelhi.secure.ea4 r1 = r4.f30773a     // Catch:{ all -> 0x007a }
            r1.mo35005u()     // Catch:{ all -> 0x007a }
            r1 = r0
            goto L_0x003e
        L_0x003c:
            r2 = r1
            r3 = r2
        L_0x003e:
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x007a }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.f30784a     // Catch:{ all -> 0x005d }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x004d
            okhttp3.WebSocketListener r0 = r4.f30784a     // Catch:{ all -> 0x005d }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x005d }
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            com.onedelhi.secure.nq4.m58711l(r2)
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            com.onedelhi.secure.nq4.m58711l(r3)
        L_0x005c:
            return
        L_0x005d:
            r5 = move-exception
            if (r1 == 0) goto L_0x0063
            com.onedelhi.secure.nq4.m58711l(r1)
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            com.onedelhi.secure.nq4.m58711l(r2)
        L_0x0068:
            if (r3 == 0) goto L_0x006d
            com.onedelhi.secure.nq4.m58711l(r3)
        L_0x006d:
            throw r5
        L_0x006e:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007a }
            r6.<init>(r5)     // Catch:{ all -> 0x007a }
            throw r6     // Catch:{ all -> 0x007a }
        L_0x007a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x007d:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38642d(int, java.lang.String):void");
    }

    /* renamed from: e */
    public synchronized void mo38643e(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "payload");
        this.f30795d++;
        this.f30794c = false;
    }

    /* renamed from: l */
    public final void mo38644l(long j, @vr2 TimeUnit timeUnit) throws InterruptedException {
        jt1.m53777p(timeUnit, "timeUnit");
        this.f30773a.mo34997l().await(j, timeUnit);
    }

    /* renamed from: m */
    public final void mo38645m(@vr2 Response response, @ss2 qw0 qw0) throws IOException {
        jt1.m53777p(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (t54.m65410K1("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (t54.m65410K1("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C5301fr.C5302a aVar = C5301fr.f28633a;
                    String g = aVar.mo36296l(this.f30779a + xw4.f37656a).mo36271g0().mo31169g();
                    if (!jt1.m53768g(g, header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + g + "' but was '" + header$default3 + '\'');
                    } else if (qw0 == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo38646n(int r9, @com.onedelhi.secure.ss2 java.lang.String r10, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.onedelhi.secure.xw4 r0 = com.onedelhi.secure.xw4.f37655a     // Catch:{ all -> 0x0059 }
            r0.mo47428d(r9)     // Catch:{ all -> 0x0059 }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x003d
            com.onedelhi.secure.fr$a r0 = com.onedelhi.secure.C5301fr.f28633a     // Catch:{ all -> 0x0059 }
            com.onedelhi.secure.fr r0 = r0.mo36296l(r10)     // Catch:{ all -> 0x0059 }
            int r3 = r0.mo36274j0()     // Catch:{ all -> 0x0059 }
            long r3 = (long) r3     // Catch:{ all -> 0x0059 }
            r5 = 123(0x7b, double:6.1E-322)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "reason.size() > 123: "
            r9.append(r11)     // Catch:{ all -> 0x0059 }
            r9.append(r10)     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            r10.<init>(r9)     // Catch:{ all -> 0x0059 }
            throw r10     // Catch:{ all -> 0x0059 }
        L_0x003d:
            boolean r10 = r8.f30790b     // Catch:{ all -> 0x0059 }
            if (r10 != 0) goto L_0x0057
            boolean r10 = r8.f30785a     // Catch:{ all -> 0x0059 }
            if (r10 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            r8.f30785a = r2     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque<java.lang.Object> r10 = r8.f30789b     // Catch:{ all -> 0x0059 }
            com.onedelhi.secure.jg3$a r1 = new com.onedelhi.secure.jg3$a     // Catch:{ all -> 0x0059 }
            r1.<init>(r9, r0, r11)     // Catch:{ all -> 0x0059 }
            r10.add(r1)     // Catch:{ all -> 0x0059 }
            r8.mo38661y()     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            return r2
        L_0x0057:
            monitor-exit(r8)
            return r1
        L_0x0059:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38646n(int, java.lang.String, long):boolean");
    }

    /* renamed from: o */
    public final void mo38647o(@vr2 OkHttpClient okHttpClient) {
        jt1.m53777p(okHttpClient, "client");
        if (this.f30783a.header(ww4.f37154a) != null) {
            mo38648p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (Response) null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(f30767a).build();
        Request build2 = this.f30783a.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f30779a).header("Sec-WebSocket-Version", "13").header(ww4.f37154a, "permessage-deflate").build();
        dg3 dg3 = new dg3(build, build2, true);
        this.f30782a = dg3;
        jt1.m53774m(dg3);
        dg3.enqueue(new C5820f(this, build2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.f30784a.onFailure(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        com.onedelhi.secure.nq4.m58711l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        com.onedelhi.secure.nq4.m58711l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        com.onedelhi.secure.nq4.m58711l(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38648p(@com.onedelhi.secure.vr2 java.lang.Exception r5, @com.onedelhi.secure.ss2 okhttp3.Response r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f30790b     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.f30790b = r0     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.jg3$d r0 = r4.f30774a     // Catch:{ all -> 0x004a }
            r1 = 0
            r4.f30774a = r1     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.yw4 r2 = r4.f30777a     // Catch:{ all -> 0x004a }
            r4.f30777a = r1     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.zw4 r3 = r4.f30778a     // Catch:{ all -> 0x004a }
            r4.f30778a = r1     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.ea4 r1 = r4.f30773a     // Catch:{ all -> 0x004a }
            r1.mo35005u()     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.f30784a     // Catch:{ all -> 0x0039 }
            r1.onFailure(r4, r5, r6)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            com.onedelhi.secure.nq4.m58711l(r0)
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            com.onedelhi.secure.nq4.m58711l(r2)
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            com.onedelhi.secure.nq4.m58711l(r3)
        L_0x0038:
            return
        L_0x0039:
            r5 = move-exception
            if (r0 == 0) goto L_0x003f
            com.onedelhi.secure.nq4.m58711l(r0)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            com.onedelhi.secure.nq4.m58711l(r2)
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            com.onedelhi.secure.nq4.m58711l(r3)
        L_0x0049:
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38648p(java.lang.Exception, okhttp3.Response):void");
    }

    @vr2
    /* renamed from: q */
    public final WebSocketListener mo38649q() {
        return this.f30784a;
    }

    public synchronized long queueSize() {
        return this.f30772a;
    }

    /* renamed from: r */
    public final void mo38651r(@vr2 String str, @vr2 C5818d dVar) throws IOException {
        String str2 = str;
        C5818d dVar2 = dVar;
        jt1.m53777p(str2, "name");
        jt1.m53777p(dVar2, "streams");
        ww4 ww4 = this.f30776a;
        jt1.m53774m(ww4);
        synchronized (this) {
            this.f30788b = str2;
            this.f30774a = dVar2;
            this.f30778a = new zw4(dVar.mo38668a(), dVar.mo38669b(), this.f30781a, ww4.f37156a, ww4.mo46912i(dVar.mo38668a()), this.f30792c);
            this.f30775a = new C5819e();
            long j = this.f30787b;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                ea4 ea4 = this.f30773a;
                String str3 = str2 + " ping";
                C5821g gVar = r1;
                C5821g gVar2 = new C5821g(str3, str3, nanos, this, str, dVar, ww4);
                ea4.mo34998m(gVar, nanos);
            }
            if (!this.f30789b.isEmpty()) {
                mo38661y();
            }
            un4 un4 = un4.f36206a;
        }
        this.f30777a = new yw4(dVar.mo38668a(), dVar.mo38670c(), this, ww4.f37156a, ww4.mo46912i(!dVar.mo38668a()));
    }

    @vr2
    public Request request() {
        return this.f30783a;
    }

    /* renamed from: s */
    public final boolean mo38653s(ww4 ww4) {
        if (ww4.f37160d || ww4.f37155a != null) {
            return false;
        }
        Integer num = ww4.f37157b;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        return 8 <= intValue && 15 >= intValue;
    }

    public boolean send(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "bytes");
        return mo38662z(frVar, 2);
    }

    public boolean send(@vr2 String str) {
        jt1.m53777p(str, "text");
        return mo38662z(C5301fr.f28633a.mo36296l(str), 1);
    }

    /* renamed from: t */
    public final void mo38656t() throws IOException {
        while (this.f30771a == -1) {
            yw4 yw4 = this.f30777a;
            jt1.m53774m(yw4);
            yw4.mo48030b();
        }
    }

    /* renamed from: u */
    public final synchronized boolean mo38657u(@vr2 C5301fr frVar) {
        boolean z;
        jt1.m53777p(frVar, "payload");
        if (!this.f30790b) {
            if (!this.f30785a || !this.f30789b.isEmpty()) {
                this.f30780a.add(frVar);
                mo38661y();
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: v */
    public final boolean mo38658v() throws IOException {
        try {
            yw4 yw4 = this.f30777a;
            jt1.m53774m(yw4);
            yw4.mo48030b();
            return this.f30771a == -1;
        } catch (Exception e) {
            mo38648p(e, (Response) null);
            return false;
        }
    }

    /* renamed from: w */
    public final synchronized int mo38659w() {
        return this.f30791c;
    }

    /* renamed from: x */
    public final synchronized int mo38660x() {
        return this.f30795d;
    }

    /* renamed from: y */
    public final void mo38661y() {
        if (!nq4.f32734a || Thread.holdsLock(this)) {
            v94 v94 = this.f30775a;
            if (v94 != null) {
                ea4.m46227o(this.f30773a, v94, 0, 2, (Object) null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo38662z(com.onedelhi.secure.C5301fr r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f30790b     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f30785a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f30772a     // Catch:{ all -> 0x003e }
            int r0 = r7.mo36274j0()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f30772a     // Catch:{ all -> 0x003e }
            int r2 = r7.mo36274j0()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f30772a = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f30789b     // Catch:{ all -> 0x003e }
            com.onedelhi.secure.jg3$c r1 = new com.onedelhi.secure.jg3$c     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.mo38661y()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jg3.mo38662z(com.onedelhi.secure.fr, int):boolean");
    }
}
