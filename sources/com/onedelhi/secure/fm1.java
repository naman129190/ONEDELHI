package com.onedelhi.secure;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004+',\u001cB3\b\u0000\u0012\u0006\u0010\\\u001a\u00020 \u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bd\u0010eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010'\u001a\u00020\u0010H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010(J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b-\u0010(R*\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b/\u0010-\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00104\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b4\u0010-\u001a\u0004\b5\u00101\"\u0004\b6\u00103R*\u00107\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u00101\"\u0004\b9\u00103R*\u0010:\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b:\u0010-\u001a\u0004\b;\u00101\"\u0004\b<\u00103R\u001e\u0010\u001f\u001a\u00060=R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010>\u001a\u0004\b?\u0010@R\u001e\u0010B\u001a\u00060AR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001e\u0010G\u001a\u00060FR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001e\u0010K\u001a\u00060FR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010[\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0017\u0010\\\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\\\u0010\n\u001a\u0004\b]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/onedelhi/secure/fm1;", "", "Lcom/onedelhi/secure/hv0;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/Headers;", "H", "I", "", "Lcom/onedelhi/secure/sk1;", "responseHeaders", "outFinished", "flushHeaders", "Lcom/onedelhi/secure/un4;", "K", "trailers", "g", "Lcom/onedelhi/secure/me4;", "x", "L", "Lcom/onedelhi/secure/x04;", "q", "Lcom/onedelhi/secure/oz3;", "o", "rstStatusCode", "d", "f", "Lcom/onedelhi/secure/to;", "source", "", "length", "y", "headers", "inFinished", "z", "A", "b", "()V", "", "delta", "a", "c", "J", "<set-?>", "readBytesTotal", "m", "()J", "E", "(J)V", "readBytesAcknowledged", "l", "D", "writeBytesTotal", "t", "G", "writeBytesMaximum", "s", "F", "Lcom/onedelhi/secure/fm1$c;", "Lcom/onedelhi/secure/fm1$c;", "r", "()Lcom/onedelhi/secure/fm1$c;", "Lcom/onedelhi/secure/fm1$b;", "sink", "Lcom/onedelhi/secure/fm1$b;", "p", "()Lcom/onedelhi/secure/fm1$b;", "Lcom/onedelhi/secure/fm1$d;", "readTimeout", "Lcom/onedelhi/secure/fm1$d;", "n", "()Lcom/onedelhi/secure/fm1$d;", "writeTimeout", "u", "Lcom/onedelhi/secure/hv0;", "i", "()Lcom/onedelhi/secure/hv0;", "B", "(Lcom/onedelhi/secure/hv0;)V", "Ljava/io/IOException;", "j", "()Ljava/io/IOException;", "C", "(Ljava/io/IOException;)V", "w", "()Z", "isOpen", "v", "isLocallyInitiated", "id", "k", "()I", "Lcom/onedelhi/secure/cm1;", "connection", "Lcom/onedelhi/secure/cm1;", "h", "()Lcom/onedelhi/secure/cm1;", "<init>", "(ILcom/onedelhi/secure/cm1;ZZLokhttp3/Headers;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class fm1 {

    /* renamed from: a */
    public static final C5288a f28569a = new C5288a((wg0) null);

    /* renamed from: e */
    public static final long f28570e = 16384;

    /* renamed from: a */
    public final int f28571a;

    /* renamed from: a */
    public long f28572a;
    @vr2

    /* renamed from: a */
    public final cm1 f28573a;
    @vr2

    /* renamed from: a */
    public final C5289b f28574a;
    @vr2

    /* renamed from: a */
    public final C5290c f28575a;
    @vr2

    /* renamed from: a */
    public final C5291d f28576a = new C5291d();
    @ss2

    /* renamed from: a */
    public hv0 f28577a;
    @ss2

    /* renamed from: a */
    public IOException f28578a;

    /* renamed from: a */
    public final ArrayDeque<Headers> f28579a;

    /* renamed from: a */
    public boolean f28580a;

    /* renamed from: b */
    public long f28581b;
    @vr2

    /* renamed from: b */
    public final C5291d f28582b = new C5291d();

    /* renamed from: c */
    public long f28583c;

    /* renamed from: d */
    public long f28584d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/fm1$a;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fm1$a */
    public static final class C5288a {
        public C5288a() {
        }

        public /* synthetic */ C5288a(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/fm1$b;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "Lcom/onedelhi/secure/me4;", "timeout", "close", "", "outFinishedOnLastFrame", "a", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "d", "()Lokhttp3/Headers;", "l", "(Lokhttp3/Headers;)V", "closed", "Z", "b", "()Z", "g", "(Z)V", "finished", "c", "h", "<init>", "(Lcom/onedelhi/secure/fm1;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fm1$b */
    public final class C5289b implements oz3 {

        /* renamed from: a */
        public final C6205no f28586a;
        @ss2

        /* renamed from: a */
        public Headers f28587a;

        /* renamed from: b */
        public boolean f28588b;

        /* renamed from: c */
        public boolean f28589c;

        public C5289b(boolean z) {
            this.f28589c = z;
            this.f28586a = new C6205no();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C5289b(fm1 fm1, boolean z, int i, wg0 wg0) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void mo36114a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (fm1.this) {
                fm1.this.mo36108u().mo42497v();
                while (fm1.this.mo36107t() >= fm1.this.mo36106s() && !this.f28589c && !this.f28588b && fm1.this.mo36096i() == null) {
                    try {
                        fm1.this.mo36085J();
                    } catch (Throwable th) {
                        fm1.this.mo36108u().mo36131D();
                        throw th;
                    }
                }
                fm1.this.mo36108u().mo36131D();
                fm1.this.mo36090c();
                min = Math.min(fm1.this.mo36106s() - fm1.this.mo36107t(), this.f28586a.mo41244V0());
                fm1 fm1 = fm1.this;
                fm1.mo36082G(fm1.mo36107t() + min);
                z2 = z && min == this.f28586a.mo41244V0();
                un4 un4 = un4.f36206a;
            }
            fm1.this.mo36108u().mo42497v();
            try {
                fm1.this.mo36095h().mo33816a2(fm1.this.mo36098k(), z2, this.f28586a, min);
            } finally {
                fm1.this.mo36108u().mo36131D();
            }
        }

        /* renamed from: b */
        public final boolean mo36115b() {
            return this.f28588b;
        }

        /* renamed from: c */
        public final boolean mo36116c() {
            return this.f28589c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f28585a.mo36103p().f28589c != false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f28586a.mo41244V0() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f28587a == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.f28586a.mo41244V0() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            mo36114a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.f28585a.mo36095h();
            r2 = r10.f28585a.mo36098k();
            r4 = r10.f28587a;
            com.onedelhi.secure.jt1.m53774m(r4);
            r0.mo33818b2(r2, r1, com.onedelhi.secure.nq4.m58686X(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            if (r0 == false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
            if (r10.f28586a.mo41244V0() <= 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
            mo36114a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
            if (r1 == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
            r10.f28585a.mo36095h().mo33816a2(r10.f28585a.mo36098k(), true, (com.onedelhi.secure.C6205no) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
            r0 = r10.f28585a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            r10.f28588b = true;
            r1 = com.onedelhi.secure.un4.f36206a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
            r10.f28585a.mo36095h().flush();
            r10.f28585a.mo36089b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r10 = this;
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                boolean r1 = com.onedelhi.secure.nq4.f32734a
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                com.onedelhi.secure.jt1.m53776o(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                monitor-enter(r0)
                boolean r1 = r10.f28588b     // Catch:{ all -> 0x00da }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                com.onedelhi.secure.fm1 r1 = com.onedelhi.secure.fm1.this     // Catch:{ all -> 0x00da }
                com.onedelhi.secure.hv0 r1 = r1.mo36096i()     // Catch:{ all -> 0x00da }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00da }
                monitor-exit(r0)
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                com.onedelhi.secure.fm1$b r0 = r0.mo36103p()
                boolean r0 = r0.f28589c
                if (r0 != 0) goto L_0x00c0
                com.onedelhi.secure.no r0 = r10.f28586a
                long r4 = r0.mo41244V0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                okhttp3.Headers r4 = r10.f28587a
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009b
            L_0x0074:
                com.onedelhi.secure.no r0 = r10.f28586a
                long r4 = r0.mo41244V0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.mo36114a(r2)
                goto L_0x0074
            L_0x0082:
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                com.onedelhi.secure.cm1 r0 = r0.mo36095h()
                com.onedelhi.secure.fm1 r2 = com.onedelhi.secure.fm1.this
                int r2 = r2.mo36098k()
                okhttp3.Headers r4 = r10.f28587a
                com.onedelhi.secure.jt1.m53774m(r4)
                java.util.List r4 = com.onedelhi.secure.nq4.m58686X(r4)
                r0.mo33818b2(r2, r1, r4)
                goto L_0x00c0
            L_0x009b:
                if (r0 == 0) goto L_0x00ab
            L_0x009d:
                com.onedelhi.secure.no r0 = r10.f28586a
                long r0 = r0.mo41244V0()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c0
                r10.mo36114a(r3)
                goto L_0x009d
            L_0x00ab:
                if (r1 == 0) goto L_0x00c0
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                com.onedelhi.secure.cm1 r4 = r0.mo36095h()
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                int r5 = r0.mo36098k()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo33816a2(r5, r6, r7, r8)
            L_0x00c0:
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                monitor-enter(r0)
                r10.f28588b = r3     // Catch:{ all -> 0x00d7 }
                com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00d7 }
                monitor-exit(r0)
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                com.onedelhi.secure.cm1 r0 = r0.mo36095h()
                r0.flush()
                com.onedelhi.secure.fm1 r0 = com.onedelhi.secure.fm1.this
                r0.mo36089b()
                return
            L_0x00d7:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00da:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fm1.C5289b.close():void");
        }

        @ss2
        /* renamed from: d */
        public final Headers mo36117d() {
            return this.f28587a;
        }

        public void flush() throws IOException {
            fm1 fm1 = fm1.this;
            if (!nq4.f32734a || !Thread.holdsLock(fm1)) {
                synchronized (fm1.this) {
                    fm1.this.mo36090c();
                    un4 un4 = un4.f36206a;
                }
                while (this.f28586a.mo41244V0() > 0) {
                    mo36114a(false);
                    fm1.this.mo36095h().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(fm1);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: g */
        public final void mo36118g(boolean z) {
            this.f28588b = z;
        }

        /* renamed from: h */
        public final void mo36119h(boolean z) {
            this.f28589c = z;
        }

        /* renamed from: l */
        public final void mo36120l(@ss2 Headers headers) {
            this.f28587a = headers;
        }

        @vr2
        public me4 timeout() {
            return fm1.this.mo36108u();
        }

        public void write(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "source");
            fm1 fm1 = fm1.this;
            if (!nq4.f32734a || !Thread.holdsLock(fm1)) {
                this.f28586a.write(noVar, j);
                while (this.f28586a.mo41244V0() >= 16384) {
                    mo36114a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(fm1);
            throw new AssertionError(sb.toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006*"}, d2 = {"Lcom/onedelhi/secure/fm1$c;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/un4;", "h", "(Lcom/onedelhi/secure/to;J)V", "Lcom/onedelhi/secure/me4;", "timeout", "close", "q", "receiveBuffer", "Lcom/onedelhi/secure/no;", "d", "()Lcom/onedelhi/secure/no;", "readBuffer", "c", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "g", "()Lokhttp3/Headers;", "p", "(Lokhttp3/Headers;)V", "", "closed", "Z", "a", "()Z", "l", "(Z)V", "finished", "b", "m", "maxByteCount", "<init>", "(Lcom/onedelhi/secure/fm1;JZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fm1$c */
    public final class C5290c implements x04 {
        @vr2

        /* renamed from: a */
        public final C6205no f28591a = new C6205no();
        @ss2

        /* renamed from: a */
        public Headers f28592a;

        /* renamed from: b */
        public final long f28593b;
        @vr2

        /* renamed from: b */
        public final C6205no f28594b = new C6205no();

        /* renamed from: b */
        public boolean f28595b;

        /* renamed from: c */
        public boolean f28596c;

        public C5290c(long j, boolean z) {
            this.f28593b = j;
            this.f28596c = z;
        }

        /* renamed from: a */
        public final boolean mo36121a() {
            return this.f28595b;
        }

        /* renamed from: b */
        public final boolean mo36122b() {
            return this.f28596c;
        }

        @vr2
        /* renamed from: c */
        public final C6205no mo36123c() {
            return this.f28594b;
        }

        public void close() throws IOException {
            long V0;
            synchronized (fm1.this) {
                this.f28595b = true;
                V0 = this.f28594b.mo41244V0();
                this.f28594b.mo41255c();
                fm1 fm1 = fm1.this;
                if (fm1 != null) {
                    fm1.notifyAll();
                    un4 un4 = un4.f36206a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (V0 > 0) {
                mo36130q(V0);
            }
            fm1.this.mo36089b();
        }

        @vr2
        /* renamed from: d */
        public final C6205no mo36124d() {
            return this.f28591a;
        }

        @ss2
        /* renamed from: g */
        public final Headers mo36125g() {
            return this.f28592a;
        }

        /* renamed from: h */
        public final void mo36126h(@vr2 C6893to toVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            jt1.m53777p(toVar, "source");
            fm1 fm1 = fm1.this;
            if (!nq4.f32734a || !Thread.holdsLock(fm1)) {
                while (j > 0) {
                    synchronized (fm1.this) {
                        z = this.f28596c;
                        z2 = true;
                        z3 = this.f28594b.mo41244V0() + j > this.f28593b;
                        un4 un4 = un4.f36206a;
                    }
                    if (z3) {
                        toVar.mo31670F1(j);
                        fm1.this.mo36093f(hv0.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        toVar.mo31670F1(j);
                        return;
                    } else {
                        long read = toVar.read(this.f28591a, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (fm1.this) {
                                if (this.f28595b) {
                                    j2 = this.f28591a.mo41244V0();
                                    this.f28591a.mo41255c();
                                } else {
                                    if (this.f28594b.mo41244V0() != 0) {
                                        z2 = false;
                                    }
                                    this.f28594b.mo41235N(this.f28591a);
                                    if (z2) {
                                        fm1 fm12 = fm1.this;
                                        if (fm12 != null) {
                                            fm12.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                mo36130q(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(fm1);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: l */
        public final void mo36127l(boolean z) {
            this.f28595b = z;
        }

        /* renamed from: m */
        public final void mo36128m(boolean z) {
            this.f28596c = z;
        }

        /* renamed from: p */
        public final void mo36129p(@ss2 Headers headers) {
            this.f28592a = headers;
        }

        /* renamed from: q */
        public final void mo36130q(long j) {
            fm1 fm1 = fm1.this;
            if (!nq4.f32734a || !Thread.holdsLock(fm1)) {
                fm1.this.mo36095h().mo33815V1(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(fm1);
            throw new AssertionError(sb.toString());
        }

        /* JADX INFO: finally extract failed */
        public long read(@vr2 C6205no noVar, long j) throws IOException {
            Throwable th;
            long j2;
            boolean z;
            C6205no noVar2 = noVar;
            long j3 = j;
            jt1.m53777p(noVar2, "sink");
            if (j3 >= 0) {
                do {
                    th = null;
                    synchronized (fm1.this) {
                        fm1.this.mo36101n().mo42497v();
                        try {
                            if (fm1.this.mo36096i() != null) {
                                th = fm1.this.mo36097j();
                                if (th == null) {
                                    hv0 i = fm1.this.mo36096i();
                                    jt1.m53774m(i);
                                    th = new k44(i);
                                }
                            }
                            if (!this.f28595b) {
                                if (this.f28594b.mo41244V0() > 0) {
                                    C6205no noVar3 = this.f28594b;
                                    j2 = noVar3.read(noVar2, Math.min(j3, noVar3.mo41244V0()));
                                    fm1 fm1 = fm1.this;
                                    fm1.mo36080E(fm1.mo36100m() + j2);
                                    long m = fm1.this.mo36100m() - fm1.this.mo36099l();
                                    if (th == null && m >= ((long) (fm1.this.mo36095h().mo33800F0().mo39533e() / 2))) {
                                        fm1.this.mo36095h().mo33836o2(fm1.this.mo36098k(), m);
                                        fm1 fm12 = fm1.this;
                                        fm12.mo36079D(fm12.mo36100m());
                                    }
                                } else if (this.f28596c || th != null) {
                                    j2 = -1;
                                } else {
                                    fm1.this.mo36085J();
                                    j2 = -1;
                                    z = true;
                                    fm1.this.mo36101n().mo36131D();
                                    un4 un4 = un4.f36206a;
                                }
                                z = false;
                                fm1.this.mo36101n().mo36131D();
                                un4 un42 = un4.f36206a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            fm1.this.mo36101n().mo36131D();
                            throw th2;
                        }
                    }
                } while (z);
                if (j2 != -1) {
                    mo36130q(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    jt1.m53774m(th);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            }
        }

        @vr2
        public me4 timeout() {
            return fm1.this.mo36101n();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/fm1$d;", "Lcom/onedelhi/secure/pb;", "Lcom/onedelhi/secure/un4;", "B", "Ljava/io/IOException;", "cause", "x", "D", "<init>", "(Lcom/onedelhi/secure/fm1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fm1$d */
    public final class C5291d extends C6418pb {
        public C5291d() {
        }

        /* renamed from: B */
        public void mo34458B() {
            fm1.this.mo36093f(hv0.CANCEL);
            fm1.this.mo36095h().mo33795B1();
        }

        /* renamed from: D */
        public final void mo36131D() throws IOException {
            if (mo42498w()) {
                throw mo36132x((IOException) null);
            }
        }

        @vr2
        /* renamed from: x */
        public IOException mo36132x(@ss2 IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public fm1(int i, @vr2 cm1 cm1, boolean z, boolean z2, @ss2 Headers headers) {
        jt1.m53777p(cm1, dm1.f27486a);
        this.f28571a = i;
        this.f28573a = cm1;
        this.f28584d = (long) cm1.mo33801G0().mo39533e();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f28579a = arrayDeque;
        this.f28575a = new C5290c((long) cm1.mo33800F0().mo39533e(), z2);
        this.f28574a = new C5289b(z);
        if (headers != null) {
            if (!mo36109v()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo36109v()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: A */
    public final synchronized void mo36076A(@vr2 hv0 hv0) {
        jt1.m53777p(hv0, "errorCode");
        if (this.f28577a == null) {
            this.f28577a = hv0;
            notifyAll();
        }
    }

    /* renamed from: B */
    public final void mo36077B(@ss2 hv0 hv0) {
        this.f28577a = hv0;
    }

    /* renamed from: C */
    public final void mo36078C(@ss2 IOException iOException) {
        this.f28578a = iOException;
    }

    /* renamed from: D */
    public final void mo36079D(long j) {
        this.f28581b = j;
    }

    /* renamed from: E */
    public final void mo36080E(long j) {
        this.f28572a = j;
    }

    /* renamed from: F */
    public final void mo36081F(long j) {
        this.f28584d = j;
    }

    /* renamed from: G */
    public final void mo36082G(long j) {
        this.f28583c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r2.f28576a.mo36131D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @com.onedelhi.secure.vr2
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers mo36083H() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.onedelhi.secure.fm1$d r0 = r2.f28576a     // Catch:{ all -> 0x004b }
            r0.mo42497v()     // Catch:{ all -> 0x004b }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f28579a     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0016
            com.onedelhi.secure.hv0 r0 = r2.f28577a     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0016
            r2.mo36085J()     // Catch:{ all -> 0x0044 }
            goto L_0x0006
        L_0x0016:
            com.onedelhi.secure.fm1$d r0 = r2.f28576a     // Catch:{ all -> 0x004b }
            r0.mo36131D()     // Catch:{ all -> 0x004b }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f28579a     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f28579a     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "headersQueue.removeFirst()"
            com.onedelhi.secure.jt1.m53776o(r0, r1)     // Catch:{ all -> 0x004b }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f28578a     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            com.onedelhi.secure.k44 r0 = new com.onedelhi.secure.k44     // Catch:{ all -> 0x004b }
            com.onedelhi.secure.hv0 r1 = r2.f28577a     // Catch:{ all -> 0x004b }
            com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x004b }
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0044:
            r0 = move-exception
            com.onedelhi.secure.fm1$d r1 = r2.f28576a     // Catch:{ all -> 0x004b }
            r1.mo36131D()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fm1.mo36083H():okhttp3.Headers");
    }

    @vr2
    /* renamed from: I */
    public final synchronized Headers mo36084I() throws IOException {
        Headers g;
        if (this.f28575a.mo36122b() && this.f28575a.mo36124d().mo31685f2() && this.f28575a.mo36123c().mo31685f2()) {
            g = this.f28575a.mo36125g();
            if (g == null) {
                g = nq4.f32731a;
            }
        } else if (this.f28577a != null) {
            Throwable th = this.f28578a;
            if (th == null) {
                hv0 hv0 = this.f28577a;
                jt1.m53774m(hv0);
                th = new k44(hv0);
            }
            throw th;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return g;
    }

    /* renamed from: J */
    public final void mo36085J() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: K */
    public final void mo36086K(@vr2 List<sk1> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        jt1.m53777p(list, "responseHeaders");
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            synchronized (this) {
                z3 = true;
                this.f28580a = true;
                if (z) {
                    this.f28574a.mo36119h(true);
                }
                un4 un4 = un4.f36206a;
            }
            if (!z2) {
                synchronized (this.f28573a) {
                    if (this.f28573a.mo33814V0() < this.f28573a.mo33813S0()) {
                        z3 = false;
                    }
                }
                z2 = z3;
            }
            this.f28573a.mo33818b2(this.f28571a, z, list);
            if (z2) {
                this.f28573a.flush();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    @vr2
    /* renamed from: L */
    public final me4 mo36087L() {
        return this.f28582b;
    }

    /* renamed from: a */
    public final void mo36088a(long j) {
        this.f28584d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo36089b() throws IOException {
        boolean z;
        boolean w;
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f28575a.mo36122b() && this.f28575a.mo36121a() && (this.f28574a.mo36116c() || this.f28574a.mo36115b());
                w = mo36110w();
                un4 un4 = un4.f36206a;
            }
            if (z) {
                mo36091d(hv0.CANCEL, (IOException) null);
            } else if (!w) {
                this.f28573a.mo33794A1(this.f28571a);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo36090c() throws IOException {
        if (this.f28574a.mo36115b()) {
            throw new IOException("stream closed");
        } else if (this.f28574a.mo36116c()) {
            throw new IOException("stream finished");
        } else if (this.f28577a != null) {
            Throwable th = this.f28578a;
            if (th == null) {
                hv0 hv0 = this.f28577a;
                jt1.m53774m(hv0);
                th = new k44(hv0);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo36091d(@vr2 hv0 hv0, @ss2 IOException iOException) throws IOException {
        jt1.m53777p(hv0, "rstStatusCode");
        if (mo36092e(hv0, iOException)) {
            this.f28573a.mo33829i2(this.f28571a, hv0);
        }
    }

    /* renamed from: e */
    public final boolean mo36092e(hv0 hv0, IOException iOException) {
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f28577a != null) {
                    return false;
                }
                if (this.f28575a.mo36122b() && this.f28574a.mo36116c()) {
                    return false;
                }
                this.f28577a = hv0;
                this.f28578a = iOException;
                notifyAll();
                un4 un4 = un4.f36206a;
                this.f28573a.mo33794A1(this.f28571a);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: f */
    public final void mo36093f(@vr2 hv0 hv0) {
        jt1.m53777p(hv0, "errorCode");
        if (mo36092e(hv0, (IOException) null)) {
            this.f28573a.mo33832j2(this.f28571a, hv0);
        }
    }

    /* renamed from: g */
    public final void mo36094g(@vr2 Headers headers) {
        jt1.m53777p(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.f28574a.mo36116c()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.f28574a.mo36120l(headers);
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    @vr2
    /* renamed from: h */
    public final cm1 mo36095h() {
        return this.f28573a;
    }

    @ss2
    /* renamed from: i */
    public final synchronized hv0 mo36096i() {
        return this.f28577a;
    }

    @ss2
    /* renamed from: j */
    public final IOException mo36097j() {
        return this.f28578a;
    }

    /* renamed from: k */
    public final int mo36098k() {
        return this.f28571a;
    }

    /* renamed from: l */
    public final long mo36099l() {
        return this.f28581b;
    }

    /* renamed from: m */
    public final long mo36100m() {
        return this.f28572a;
    }

    @vr2
    /* renamed from: n */
    public final C5291d mo36101n() {
        return this.f28576a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    @com.onedelhi.secure.vr2
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.oz3 mo36102o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f28580a     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo36109v()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            com.onedelhi.secure.fm1$b r0 = r2.f28574a
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fm1.mo36102o():com.onedelhi.secure.oz3");
    }

    @vr2
    /* renamed from: p */
    public final C5289b mo36103p() {
        return this.f28574a;
    }

    @vr2
    /* renamed from: q */
    public final x04 mo36104q() {
        return this.f28575a;
    }

    @vr2
    /* renamed from: r */
    public final C5290c mo36105r() {
        return this.f28575a;
    }

    /* renamed from: s */
    public final long mo36106s() {
        return this.f28584d;
    }

    /* renamed from: t */
    public final long mo36107t() {
        return this.f28583c;
    }

    @vr2
    /* renamed from: u */
    public final C5291d mo36108u() {
        return this.f28582b;
    }

    /* renamed from: v */
    public final boolean mo36109v() {
        return this.f28573a.mo33835o0() == ((this.f28571a & 1) == 1);
    }

    /* renamed from: w */
    public final synchronized boolean mo36110w() {
        if (this.f28577a != null) {
            return false;
        }
        return (!this.f28575a.mo36122b() && !this.f28575a.mo36121a()) || (!this.f28574a.mo36116c() && !this.f28574a.mo36115b()) || !this.f28580a;
    }

    @vr2
    /* renamed from: x */
    public final me4 mo36111x() {
        return this.f28576a;
    }

    /* renamed from: y */
    public final void mo36112y(@vr2 C6893to toVar, int i) throws IOException {
        jt1.m53777p(toVar, "source");
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            this.f28575a.mo36126h(toVar, (long) i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36113z(@com.onedelhi.secure.vr2 okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            boolean r0 = com.onedelhi.secure.nq4.f32734a
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            com.onedelhi.secure.jt1.m53776o(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f28580a     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            com.onedelhi.secure.fm1$c r0 = r2.f28575a     // Catch:{ all -> 0x006d }
            r0.mo36129p(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.f28580a = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f28579a     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            com.onedelhi.secure.fm1$c r3 = r2.f28575a     // Catch:{ all -> 0x006d }
            r3.mo36128m(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.mo36110w()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            com.onedelhi.secure.cm1 r3 = r2.f28573a
            int r4 = r2.f28571a
            r3.mo33794A1(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fm1.mo36113z(okhttp3.Headers, boolean):void");
    }
}
