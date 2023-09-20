package com.onedelhi.secure;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0002Z[B\u001f\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020\u0013\u0012\u0006\u0010T\u001a\u00020\u0016¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u000f\u0010\u001e\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0016J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J;\u0010-\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b/\u0010\u0007J\u0011\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\u0002J\u0017\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0016H\u0000¢\u0006\u0004\b5\u00106J\u0006\u00107\u001a\u00020\u0016J\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010?\u001a\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010@\u001a\u0004\bA\u0010BR(\u0010C\u001a\u0004\u0018\u00010$2\b\u0010?\u001a\u0004\u0018\u00010$8\u0000@BX\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010@\u001a\u0004\bH\u0010B\"\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010P\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010T\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/onedelhi/secure/dg3;", "Lokhttp3/Call;", "Lcom/onedelhi/secure/un4;", "e", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "A", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "g", "", "B", "Lcom/onedelhi/secure/pb;", "y", "f", "Lokhttp3/Request;", "request", "cancel", "", "isCanceled", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "enqueue", "isExecuted", "q", "()Lokhttp3/Response;", "newExchangeFinder", "h", "Lcom/onedelhi/secure/hg3;", "chain", "Lcom/onedelhi/secure/qw0;", "r", "(Lcom/onedelhi/secure/hg3;)Lcom/onedelhi/secure/qw0;", "Lcom/onedelhi/secure/eg3;", "connection", "c", "exchange", "requestDone", "responseDone", "s", "(Lcom/onedelhi/secure/qw0;ZZLjava/io/IOException;)Ljava/io/IOException;", "t", "Ljava/net/Socket;", "v", "()Ljava/net/Socket;", "z", "closeExchange", "i", "(Z)V", "w", "u", "()Ljava/lang/String;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "m", "()Lokhttp3/EventListener;", "<set-?>", "Lcom/onedelhi/secure/eg3;", "k", "()Lcom/onedelhi/secure/eg3;", "interceptorScopedExchange", "Lcom/onedelhi/secure/qw0;", "o", "()Lcom/onedelhi/secure/qw0;", "connectionToCancel", "l", "x", "(Lcom/onedelhi/secure/eg3;)V", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "j", "()Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "p", "()Lokhttp3/Request;", "forWebSocket", "Z", "n", "()Z", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class dg3 implements Call {

    /* renamed from: a */
    public final C5027c f27427a;
    @ss2

    /* renamed from: a */
    public eg3 f27428a;

    /* renamed from: a */
    public final gg3 f27429a;
    @ss2

    /* renamed from: a */
    public qw0 f27430a;

    /* renamed from: a */
    public sw0 f27431a;

    /* renamed from: a */
    public Object f27432a;

    /* renamed from: a */
    public final AtomicBoolean f27433a = new AtomicBoolean();
    @vr2

    /* renamed from: a */
    public final EventListener f27434a;
    @vr2

    /* renamed from: a */
    public final OkHttpClient f27435a;
    @vr2

    /* renamed from: a */
    public final Request f27436a;
    @ss2

    /* renamed from: b */
    public volatile eg3 f27437b;

    /* renamed from: b */
    public volatile qw0 f27438b;

    /* renamed from: b */
    public boolean f27439b;

    /* renamed from: c */
    public boolean f27440c;

    /* renamed from: d */
    public boolean f27441d;

    /* renamed from: e */
    public boolean f27442e = true;

    /* renamed from: f */
    public volatile boolean f27443f;

    /* renamed from: g */
    public final boolean f27444g;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/onedelhi/secure/dg3$a;", "Ljava/lang/Runnable;", "Lcom/onedelhi/secure/dg3;", "other", "Lcom/onedelhi/secure/un4;", "f", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "d", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "e", "()Lokhttp3/Request;", "request", "b", "()Lcom/onedelhi/secure/dg3;", "call", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lcom/onedelhi/secure/dg3;Lokhttp3/Callback;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.dg3$a */
    public final class C5025a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ dg3 f27445a;
        @vr2

        /* renamed from: a */
        public volatile AtomicInteger f27446a = new AtomicInteger(0);

        /* renamed from: a */
        public final Callback f27447a;

        public C5025a(@vr2 dg3 dg3, Callback callback) {
            jt1.m53777p(callback, "responseCallback");
            this.f27445a = dg3;
            this.f27447a = callback;
        }

        /* renamed from: a */
        public final void mo34450a(@vr2 ExecutorService executorService) {
            jt1.m53777p(executorService, "executorService");
            Dispatcher dispatcher = this.f27445a.mo34431j().dispatcher();
            if (!nq4.f32734a || !Thread.holdsLock(dispatcher)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f27445a.mo34442t(interruptedIOException);
                    this.f27447a.onFailure(this.f27445a, interruptedIOException);
                    this.f27445a.mo34431j().dispatcher().finished$okhttp(this);
                } catch (Throwable th) {
                    this.f27445a.mo34431j().dispatcher().finished$okhttp(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                jt1.m53776o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
        }

        @vr2
        /* renamed from: b */
        public final dg3 mo34451b() {
            return this.f27445a;
        }

        @vr2
        /* renamed from: c */
        public final AtomicInteger mo34452c() {
            return this.f27446a;
        }

        @vr2
        /* renamed from: d */
        public final String mo34453d() {
            return this.f27445a.mo34437p().url().host();
        }

        @vr2
        /* renamed from: e */
        public final Request mo34454e() {
            return this.f27445a.mo34437p();
        }

        /* renamed from: f */
        public final void mo34455f(@vr2 C5025a aVar) {
            jt1.m53777p(aVar, "other");
            this.f27446a = aVar.f27446a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                com.onedelhi.secure.dg3 r1 = r6.f27445a
                java.lang.String r1 = r1.mo34444u()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                com.onedelhi.secure.jt1.m53776o(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                com.onedelhi.secure.dg3 r3 = r6.f27445a     // Catch:{ all -> 0x00c9 }
                com.onedelhi.secure.dg3$c r3 = r3.f27427a     // Catch:{ all -> 0x00c9 }
                r3.mo42497v()     // Catch:{ all -> 0x00c9 }
                com.onedelhi.secure.dg3 r3 = r6.f27445a     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                okhttp3.Response r0 = r3.mo34438q()     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                r3 = 1
                okhttp3.Callback r4 = r6.f27447a     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                com.onedelhi.secure.dg3 r5 = r6.f27445a     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                com.onedelhi.secure.dg3 r0 = r6.f27445a     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r0 = r0.mo34431j()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00c9 }
            L_0x0049:
                r0.finished$okhttp((com.onedelhi.secure.dg3.C5025a) r6)     // Catch:{ all -> 0x00c9 }
                goto L_0x00b7
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x0081
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                com.onedelhi.secure.dg3 r4 = r6.f27445a     // Catch:{ all -> 0x007c }
                r4.cancel()     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x007b
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                r4.append(r0)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r3.<init>(r4)     // Catch:{ all -> 0x007c }
                com.onedelhi.secure.pw0.m61687a(r3, r0)     // Catch:{ all -> 0x007c }
                okhttp3.Callback r4 = r6.f27447a     // Catch:{ all -> 0x007c }
                com.onedelhi.secure.dg3 r5 = r6.f27445a     // Catch:{ all -> 0x007c }
                r4.onFailure(r5, r3)     // Catch:{ all -> 0x007c }
            L_0x007b:
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                goto L_0x00bb
            L_0x007e:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x00a5
                com.onedelhi.secure.k23$a r3 = com.onedelhi.secure.k23.f31087a     // Catch:{ all -> 0x007c }
                com.onedelhi.secure.k23 r3 = r3.mo39034g()     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                com.onedelhi.secure.dg3 r5 = r6.f27445a     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.mo34417B()     // Catch:{ all -> 0x007c }
                r4.append(r5)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r5 = 4
                r3.mo39026m(r4, r5, r0)     // Catch:{ all -> 0x007c }
                goto L_0x00ac
            L_0x00a5:
                okhttp3.Callback r3 = r6.f27447a     // Catch:{ all -> 0x007c }
                com.onedelhi.secure.dg3 r4 = r6.f27445a     // Catch:{ all -> 0x007c }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x007c }
            L_0x00ac:
                com.onedelhi.secure.dg3 r0 = r6.f27445a     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r0 = r0.mo34431j()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00c9 }
                goto L_0x0049
            L_0x00b7:
                r1.setName(r2)
                return
            L_0x00bb:
                com.onedelhi.secure.dg3 r3 = r6.f27445a     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r3 = r3.mo34431j()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r3 = r3.dispatcher()     // Catch:{ all -> 0x00c9 }
                r3.finished$okhttp((com.onedelhi.secure.dg3.C5025a) r6)     // Catch:{ all -> 0x00c9 }
                throw r0     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dg3.C5025a.run():void");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/dg3$b;", "Ljava/lang/ref/WeakReference;", "Lcom/onedelhi/secure/dg3;", "", "callStackTrace", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "referent", "<init>", "(Lcom/onedelhi/secure/dg3;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.dg3$b */
    public static final class C5026b extends WeakReference<dg3> {
        @ss2

        /* renamed from: a */
        public final Object f27448a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5026b(@vr2 dg3 dg3, @ss2 Object obj) {
            super(dg3);
            jt1.m53777p(dg3, "referent");
            this.f27448a = obj;
        }

        @ss2
        /* renamed from: a */
        public final Object mo34457a() {
            return this.f27448a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/dg3$c", "Lcom/onedelhi/secure/pb;", "Lcom/onedelhi/secure/un4;", "B", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.dg3$c */
    public static final class C5027c extends C6418pb {

        /* renamed from: a */
        public final /* synthetic */ dg3 f27449a;

        public C5027c(dg3 dg3) {
            this.f27449a = dg3;
        }

        /* renamed from: B */
        public void mo34458B() {
            this.f27449a.cancel();
        }
    }

    public dg3(@vr2 OkHttpClient okHttpClient, @vr2 Request request, boolean z) {
        jt1.m53777p(okHttpClient, "client");
        jt1.m53777p(request, "originalRequest");
        this.f27435a = okHttpClient;
        this.f27436a = request;
        this.f27444g = z;
        this.f27429a = okHttpClient.connectionPool().getDelegate$okhttp();
        this.f27434a = okHttpClient.eventListenerFactory().create(this);
        C5027c cVar = new C5027c(this);
        cVar.mo40562i((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        un4 un4 = un4.f36206a;
        this.f27427a = cVar;
    }

    /* renamed from: A */
    public final <E extends IOException> E mo34416A(E e) {
        if (this.f27439b || !this.f27427a.mo42498w()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* renamed from: B */
    public final String mo34417B() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f27444g ? "web socket" : es2.f11366Q);
        sb.append(" to ");
        sb.append(mo34444u());
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo34418c(@vr2 eg3 eg3) {
        jt1.m53777p(eg3, dm1.f27486a);
        if (!nq4.f32734a || Thread.holdsLock(eg3)) {
            if (this.f27428a == null) {
                this.f27428a = eg3;
                eg3.mo35261q().add(new C5026b(this, this.f27432a));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(eg3);
        throw new AssertionError(sb.toString());
    }

    public void cancel() {
        if (!this.f27443f) {
            this.f27443f = true;
            qw0 qw0 = this.f27438b;
            if (qw0 != null) {
                qw0.mo43736b();
            }
            eg3 eg3 = this.f27437b;
            if (eg3 != null) {
                eg3.mo35249g();
            }
            this.f27434a.canceled(this);
        }
    }

    /* renamed from: d */
    public final <E extends IOException> E mo34421d(E e) {
        Socket v;
        boolean z = nq4.f32734a;
        if (!z || !Thread.holdsLock(this)) {
            eg3 eg3 = this.f27428a;
            if (eg3 != null) {
                if (!z || !Thread.holdsLock(eg3)) {
                    synchronized (eg3) {
                        v = mo34445v();
                    }
                    if (this.f27428a == null) {
                        if (v != null) {
                            nq4.m58714n(v);
                        }
                        this.f27434a.connectionReleased(this, eg3);
                    } else {
                        if (!(v == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    jt1.m53776o(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(eg3);
                    throw new AssertionError(sb.toString());
                }
            }
            E A = mo34416A(e);
            if (e != null) {
                EventListener eventListener = this.f27434a;
                jt1.m53774m(A);
                eventListener.callFailed(this, A);
            } else {
                this.f27434a.callEnd(this);
            }
            return A;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        jt1.m53776o(currentThread2, "Thread.currentThread()");
        sb2.append(currentThread2.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: e */
    public final void mo34422e() {
        this.f27432a = k23.f31087a.mo39034g().mo39024k("response.body().close()");
        this.f27434a.callStart(this);
    }

    public void enqueue(@vr2 Callback callback) {
        jt1.m53777p(callback, "responseCallback");
        if (this.f27433a.compareAndSet(false, true)) {
            mo34422e();
            this.f27435a.dispatcher().enqueue$okhttp(new C5025a(this, callback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @vr2
    public Response execute() {
        if (this.f27433a.compareAndSet(false, true)) {
            this.f27427a.mo42497v();
            mo34422e();
            try {
                this.f27435a.dispatcher().executed$okhttp(this);
                return mo34438q();
            } finally {
                this.f27435a.dispatcher().finished$okhttp(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    @vr2
    /* renamed from: f */
    public dg3 clone() {
        return new dg3(this.f27435a, this.f27436a, this.f27444g);
    }

    /* renamed from: g */
    public final Address mo34426g(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.f27435a.sslSocketFactory();
            hostnameVerifier = this.f27435a.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.f27435a.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.f27435a.dns(), this.f27435a.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.f27435a.proxyAuthenticator(), this.f27435a.proxy(), this.f27435a.protocols(), this.f27435a.connectionSpecs(), this.f27435a.proxySelector());
    }

    /* renamed from: h */
    public final void mo34427h(@vr2 Request request, boolean z) {
        jt1.m53777p(request, "request");
        if (this.f27430a == null) {
            synchronized (this) {
                if (!(!this.f27441d)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f27440c) {
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f27431a = new sw0(this.f27429a, mo34426g(request.url()), this, this.f27434a);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public final void mo34428i(boolean z) {
        qw0 qw0;
        synchronized (this) {
            if (this.f27442e) {
                un4 un4 = un4.f36206a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (qw0 = this.f27438b) != null) {
            qw0.mo43738d();
        }
        this.f27430a = null;
    }

    public boolean isCanceled() {
        return this.f27443f;
    }

    public boolean isExecuted() {
        return this.f27433a.get();
    }

    @vr2
    /* renamed from: j */
    public final OkHttpClient mo34431j() {
        return this.f27435a;
    }

    @ss2
    /* renamed from: k */
    public final eg3 mo34432k() {
        return this.f27428a;
    }

    @ss2
    /* renamed from: l */
    public final eg3 mo34433l() {
        return this.f27437b;
    }

    @vr2
    /* renamed from: m */
    public final EventListener mo34434m() {
        return this.f27434a;
    }

    /* renamed from: n */
    public final boolean mo34435n() {
        return this.f27444g;
    }

    @ss2
    /* renamed from: o */
    public final qw0 mo34436o() {
        return this.f27430a;
    }

    @vr2
    /* renamed from: p */
    public final Request mo34437p() {
        return this.f27436a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    @com.onedelhi.secure.vr2
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response mo34438q() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r10.f27435a
            java.util.List r0 = r0.interceptors()
            com.onedelhi.secure.x00.m69813p0(r2, r0)
            com.onedelhi.secure.em3 r0 = new com.onedelhi.secure.em3
            okhttp3.OkHttpClient r1 = r10.f27435a
            r0.<init>(r1)
            r2.add(r0)
            com.onedelhi.secure.co r0 = new com.onedelhi.secure.co
            okhttp3.OkHttpClient r1 = r10.f27435a
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            com.onedelhi.secure.fs r0 = new com.onedelhi.secure.fs
            okhttp3.OkHttpClient r1 = r10.f27435a
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            com.onedelhi.secure.s50 r0 = com.onedelhi.secure.s50.f34919a
            r2.add(r0)
            boolean r0 = r10.f27444g
            if (r0 != 0) goto L_0x0046
            okhttp3.OkHttpClient r0 = r10.f27435a
            java.util.List r0 = r0.networkInterceptors()
            com.onedelhi.secure.x00.m69813p0(r2, r0)
        L_0x0046:
            com.onedelhi.secure.ts r0 = new com.onedelhi.secure.ts
            boolean r1 = r10.f27444g
            r0.<init>(r1)
            r2.add(r0)
            com.onedelhi.secure.hg3 r9 = new com.onedelhi.secure.hg3
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r10.f27436a
            okhttp3.OkHttpClient r0 = r10.f27435a
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r10.f27435a
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r10.f27435a
            int r8 = r0.writeTimeoutMillis()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r10.f27436a     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            okhttp3.Response r2 = r9.proceed(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r3 = r10.isCanceled()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x007f
            r10.mo34442t(r1)
            return r2
        L_0x007f:
            com.onedelhi.secure.nq4.m58711l(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            throw r2     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.mo34442t(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x009c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r10.mo34442t(r1)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dg3.mo34438q():okhttp3.Response");
    }

    @vr2
    /* renamed from: r */
    public final qw0 mo34439r(@vr2 hg3 hg3) {
        jt1.m53777p(hg3, "chain");
        synchronized (this) {
            if (!this.f27442e) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f27441d)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f27440c) {
                un4 un4 = un4.f36206a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        sw0 sw0 = this.f27431a;
        jt1.m53774m(sw0);
        qw0 qw0 = new qw0(this, this.f27434a, sw0, sw0.mo44573a(this.f27435a, hg3));
        this.f27430a = qw0;
        this.f27438b = qw0;
        synchronized (this) {
            this.f27440c = true;
            this.f27441d = true;
        }
        if (!this.f27443f) {
            return qw0;
        }
        throw new IOException("Canceled");
    }

    @vr2
    public Request request() {
        return this.f27436a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003e A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[Catch:{ all -> 0x0019 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo34441s(@com.onedelhi.secure.vr2 com.onedelhi.secure.qw0 r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.qw0 r0 = r2.f27438b
            boolean r3 = com.onedelhi.secure.jt1.m53768g(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f27440c     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005a
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f27441d     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f27440c = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f27441d = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f27440c     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f27441d     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f27441d     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f27442e     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            r2.f27438b = r3
            com.onedelhi.secure.eg3 r3 = r2.f27428a
            if (r3 == 0) goto L_0x0052
            r3.mo35269v()
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.IOException r3 = r2.mo34421d(r6)
            return r3
        L_0x0059:
            return r6
        L_0x005a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dg3.mo34441s(com.onedelhi.secure.qw0, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @ss2
    /* renamed from: t */
    public final IOException mo34442t(@ss2 IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f27442e) {
                this.f27442e = false;
                if (!this.f27440c && !this.f27441d) {
                    z = true;
                }
            }
            un4 un4 = un4.f36206a;
        }
        return z ? mo34421d(iOException) : iOException;
    }

    @vr2
    /* renamed from: u */
    public final String mo34444u() {
        return this.f27436a.url().redact();
    }

    @ss2
    /* renamed from: v */
    public final Socket mo34445v() {
        eg3 eg3 = this.f27428a;
        jt1.m53774m(eg3);
        if (!nq4.f32734a || Thread.holdsLock(eg3)) {
            List<Reference<dg3>> q = eg3.mo35261q();
            Iterator<Reference<dg3>> it = q.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (jt1.m53768g((dg3) it.next().get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                q.remove(i);
                this.f27428a = null;
                if (q.isEmpty()) {
                    eg3.mo35243E(System.nanoTime());
                    if (this.f27429a.mo36734c(eg3)) {
                        return eg3.socket();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(eg3);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: w */
    public final boolean mo34446w() {
        sw0 sw0 = this.f27431a;
        jt1.m53774m(sw0);
        return sw0.mo44577e();
    }

    /* renamed from: x */
    public final void mo34447x(@ss2 eg3 eg3) {
        this.f27437b = eg3;
    }

    @vr2
    /* renamed from: y */
    public C6418pb timeout() {
        return this.f27427a;
    }

    /* renamed from: z */
    public final void mo34449z() {
        if (!this.f27439b) {
            this.f27439b = true;
            this.f27427a.mo42498w();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
