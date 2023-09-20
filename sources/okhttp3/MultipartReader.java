package okhttp3;

import android.support.p000v4.media.session.PlaybackStateCompat;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.C6893to;
import com.onedelhi.secure.gu2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.me4;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.x04;
import com.onedelhi.secure.xk1;
import com.onedelhi.secure.yw2;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006!"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lcom/onedelhi/secure/un4;", "close", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/onedelhi/secure/to;", "source", "<init>", "(Lcom/onedelhi/secure/to;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion((wg0) null);
    /* access modifiers changed from: private */
    @vr2
    public static final yw2 afterBoundaryOptions;
    @vr2
    private final String boundary;
    private boolean closed;
    private final C5301fr crlfDashDashBoundary;
    /* access modifiers changed from: private */
    public PartSource currentPart;
    private final C5301fr dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    /* access modifiers changed from: private */
    public final C6893to source;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lcom/onedelhi/secure/yw2;", "afterBoundaryOptions", "Lcom/onedelhi/secure/yw2;", "getAfterBoundaryOptions", "()Lcom/onedelhi/secure/yw2;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        @vr2
        public final yw2 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/un4;", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lcom/onedelhi/secure/to;", "body", "Lcom/onedelhi/secure/to;", "()Lcom/onedelhi/secure/to;", "<init>", "(Lokhttp3/Headers;Lcom/onedelhi/secure/to;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Part implements Closeable {
        @vr2
        private final C6893to body;
        @vr2
        private final Headers headers;

        public Part(@vr2 Headers headers2, @vr2 C6893to toVar) {
            jt1.m53777p(headers2, "headers");
            jt1.m53777p(toVar, "body");
            this.headers = headers2;
            this.body = toVar;
        }

        @uw1(name = "body")
        @vr2
        public final C6893to body() {
            return this.body;
        }

        public void close() {
            this.body.close();
        }

        @uw1(name = "headers")
        @vr2
        public final Headers headers() {
            return this.headers;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/un4;", "close", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class PartSource implements x04 {
        private final me4 timeout = new me4();

        public PartSource() {
        }

        public void close() {
            if (jt1.m53768g(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            C6205no noVar2 = noVar;
            long j2 = j;
            jt1.m53777p(noVar2, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (jt1.m53768g(MultipartReader.this.currentPart, this)) {
                me4 timeout2 = MultipartReader.this.source.timeout();
                me4 me4 = this.timeout;
                long j3 = timeout2.mo40563j();
                long a = me4.f32089a.mo40565a(me4.mo40563j(), timeout2.mo40563j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout2.mo40562i(a, timeUnit);
                if (timeout2.mo40559f()) {
                    long d = timeout2.mo40557d();
                    if (me4.mo40559f()) {
                        timeout2.mo40558e(Math.min(timeout2.mo40557d(), me4.mo40557d()));
                    }
                    try {
                        long access$currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j2);
                        long read = access$currentPartBytesRemaining == 0 ? -1 : MultipartReader.this.source.read(noVar2, access$currentPartBytesRemaining);
                        timeout2.mo40562i(j3, timeUnit);
                        if (me4.mo40559f()) {
                            timeout2.mo40558e(d);
                        }
                        return read;
                    } catch (Throwable th) {
                        timeout2.mo40562i(j3, TimeUnit.NANOSECONDS);
                        if (me4.mo40559f()) {
                            timeout2.mo40558e(d);
                        }
                        throw th;
                    }
                } else {
                    if (me4.mo40559f()) {
                        timeout2.mo40558e(me4.mo40557d());
                    }
                    try {
                        long access$currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j2);
                        long read2 = access$currentPartBytesRemaining2 == 0 ? -1 : MultipartReader.this.source.read(noVar2, access$currentPartBytesRemaining2);
                        timeout2.mo40562i(j3, timeUnit);
                        if (me4.mo40559f()) {
                            timeout2.mo40554a();
                        }
                        return read2;
                    } catch (Throwable th2) {
                        timeout2.mo40562i(j3, TimeUnit.NANOSECONDS);
                        if (me4.mo40559f()) {
                            timeout2.mo40554a();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @vr2
        public me4 timeout() {
            return this.timeout;
        }
    }

    static {
        yw2.C7395a aVar = yw2.f38083a;
        C5301fr.C5302a aVar2 = C5301fr.f28633a;
        afterBoundaryOptions = aVar.mo48028d(aVar2.mo36296l("\r\n"), aVar2.mo36296l("--"), aVar2.mo36296l(" "), aVar2.mo36296l("\t"));
    }

    public MultipartReader(@vr2 C6893to toVar, @vr2 String str) throws IOException {
        jt1.m53777p(toVar, "source");
        jt1.m53777p(str, "boundary");
        this.source = toVar;
        this.boundary = str;
        this.dashDashBoundary = new C6205no().mo41279n("--").mo41279n(str).mo31697r0();
        this.crlfDashDashBoundary = new C6205no().mo41279n("\r\n--").mo41279n(str).mo31697r0();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipartReader(@com.onedelhi.secure.vr2 okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.to r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L_0x001b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L_0x001b
            r2.<init>(r0, r3)
            return
        L_0x001b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }

    /* access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo31694o((long) this.crlfDashDashBoundary.mo36274j0());
        long N1 = this.source.mo31682e().mo31675N1(this.crlfDashDashBoundary);
        if (N1 == -1) {
            N1 = (this.source.mo31682e().mo41244V0() - ((long) this.crlfDashDashBoundary.mo36274j0())) + 1;
        }
        return Math.min(j, N1);
    }

    @uw1(name = "boundary")
    @vr2
    public final String boundary() {
        return this.boundary;
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.currentPart = null;
            this.source.close();
        }
    }

    @ss2
    public final Part nextPart() throws IOException {
        C6893to toVar;
        C5301fr frVar;
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.noMoreParts) {
            return null;
        } else {
            if (this.partCount != 0 || !this.source.mo31676O(0, this.dashDashBoundary)) {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.f452t);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.mo31670F1(currentPartBytesRemaining);
                }
                toVar = this.source;
                frVar = this.crlfDashDashBoundary;
            } else {
                toVar = this.source;
                frVar = this.dashDashBoundary;
            }
            toVar.mo31670F1((long) frVar.mo36274j0());
            boolean z = false;
            while (true) {
                int m0 = this.source.mo31692m0(afterBoundaryOptions);
                if (m0 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (m0 == 0) {
                    this.partCount++;
                    Headers b = new xk1(this.source).mo47342b();
                    PartSource partSource = new PartSource();
                    this.currentPart = partSource;
                    return new Part(b, gu2.m49835d(partSource));
                } else if (m0 != 1) {
                    if (m0 == 2 || m0 == 3) {
                        z = true;
                    }
                } else if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                } else {
                    throw new ProtocolException("expected at least 1 part");
                }
            }
        }
    }
}
