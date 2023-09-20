package com.onedelhi.secure;

import com.onedelhi.secure.wl1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003!\b\u0005B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J(\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\""}, d2 = {"Lcom/onedelhi/secure/em1;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/em1$c;", "handler", "Lcom/onedelhi/secure/un4;", "c", "", "requireSettings", "b", "close", "", "length", "flags", "streamId", "l", "padding", "", "Lcom/onedelhi/secure/sk1;", "h", "d", "q", "p", "E", "H", "A", "m", "g", "K", "Lcom/onedelhi/secure/to;", "source", "client", "<init>", "(Lcom/onedelhi/secure/to;Z)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class em1 implements Closeable {

    /* renamed from: a */
    public static final C5163a f27996a = new C5163a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final Logger f27997a;

    /* renamed from: a */
    public final C5164b f27998a;

    /* renamed from: a */
    public final C6893to f27999a;

    /* renamed from: a */
    public final wl1.C7171a f28000a;

    /* renamed from: b */
    public final boolean f28001b;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/em1$a;", "", "", "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.em1$a */
    public static final class C5163a {
        public C5163a() {
        }

        public /* synthetic */ C5163a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final Logger mo35491a() {
            return em1.f27997a;
        }

        /* renamed from: b */
        public final int mo35492b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006#"}, d2 = {"Lcom/onedelhi/secure/em1$b;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "h", "", "length", "I", "c", "()I", "p", "(I)V", "flags", "a", "l", "streamId", "g", "A", "left", "b", "m", "padding", "d", "q", "Lcom/onedelhi/secure/to;", "source", "<init>", "(Lcom/onedelhi/secure/to;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.em1$b */
    public static final class C5164b implements x04 {

        /* renamed from: a */
        public final C6893to f28002a;

        /* renamed from: n */
        public int f28003n;

        /* renamed from: o */
        public int f28004o;

        /* renamed from: p */
        public int f28005p;

        /* renamed from: q */
        public int f28006q;

        /* renamed from: r */
        public int f28007r;

        public C5164b(@vr2 C6893to toVar) {
            jt1.m53777p(toVar, "source");
            this.f28002a = toVar;
        }

        /* renamed from: A */
        public final void mo35493A(int i) {
            this.f28005p = i;
        }

        /* renamed from: a */
        public final int mo35494a() {
            return this.f28004o;
        }

        /* renamed from: b */
        public final int mo35495b() {
            return this.f28006q;
        }

        /* renamed from: c */
        public final int mo35496c() {
            return this.f28003n;
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public final int mo35497d() {
            return this.f28007r;
        }

        /* renamed from: g */
        public final int mo35498g() {
            return this.f28005p;
        }

        /* renamed from: h */
        public final void mo35499h() throws IOException {
            int i = this.f28005p;
            int S = nq4.m58681S(this.f28002a);
            this.f28006q = S;
            this.f28003n = S;
            int b = nq4.m58691b(this.f28002a.readByte(), 255);
            this.f28004o = nq4.m58691b(this.f28002a.readByte(), 255);
            C5163a aVar = em1.f27996a;
            if (aVar.mo35491a().isLoggable(Level.FINE)) {
                aVar.mo35491a().fine(bm1.f26418a.mo31951c(true, this.f28005p, this.f28003n, b, this.f28004o));
            }
            int readInt = this.f28002a.readInt() & Integer.MAX_VALUE;
            this.f28005p = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: l */
        public final void mo35500l(int i) {
            this.f28004o = i;
        }

        /* renamed from: m */
        public final void mo35501m(int i) {
            this.f28006q = i;
        }

        /* renamed from: p */
        public final void mo35502p(int i) {
            this.f28003n = i;
        }

        /* renamed from: q */
        public final void mo35503q(int i) {
            this.f28007r = i;
        }

        public long read(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "sink");
            while (true) {
                int i = this.f28006q;
                if (i == 0) {
                    this.f28002a.mo31670F1((long) this.f28007r);
                    this.f28007r = 0;
                    if ((this.f28004o & 4) != 0) {
                        return -1;
                    }
                    mo35499h();
                } else {
                    long read = this.f28002a.read(noVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f28006q -= (int) read;
                    return read;
                }
            }
        }

        @vr2
        public me4 timeout() {
            return this.f28002a.timeout();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J8\u00100\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H&¨\u00061"}, d2 = {"Lcom/onedelhi/secure/em1$c;", "", "", "inFinished", "", "streamId", "Lcom/onedelhi/secure/to;", "source", "length", "Lcom/onedelhi/secure/un4;", "b", "associatedStreamId", "", "Lcom/onedelhi/secure/sk1;", "headerBlock", "n", "Lcom/onedelhi/secure/hv0;", "errorCode", "j", "clearPrevious", "Lcom/onedelhi/secure/kv3;", "settings", "l", "d", "ack", "payload1", "payload2", "f", "lastGoodStreamId", "Lcom/onedelhi/secure/fr;", "debugData", "i", "", "windowSizeIncrement", "q", "streamDependency", "weight", "exclusive", "e", "promisedStreamId", "requestHeaders", "a", "", "origin", "protocol", "host", "port", "maxAge", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.em1$c */
    public interface C5165c {
        /* renamed from: a */
        void mo33873a(int i, int i2, @vr2 List<sk1> list) throws IOException;

        /* renamed from: b */
        void mo33874b(boolean z, int i, @vr2 C6893to toVar, int i2) throws IOException;

        /* renamed from: c */
        void mo33875c(int i, @vr2 String str, @vr2 C5301fr frVar, @vr2 String str2, int i2, long j);

        /* renamed from: d */
        void mo33876d();

        /* renamed from: e */
        void mo33877e(int i, int i2, int i3, boolean z);

        /* renamed from: f */
        void mo33878f(boolean z, int i, int i2);

        /* renamed from: i */
        void mo33879i(int i, @vr2 hv0 hv0, @vr2 C5301fr frVar);

        /* renamed from: j */
        void mo33880j(int i, @vr2 hv0 hv0);

        /* renamed from: l */
        void mo33881l(boolean z, @vr2 kv3 kv3);

        /* renamed from: n */
        void mo33882n(boolean z, int i, int i2, @vr2 List<sk1> list);

        /* renamed from: q */
        void mo33883q(int i, long j);
    }

    static {
        Logger logger = Logger.getLogger(bm1.class.getName());
        jt1.m53776o(logger, "Logger.getLogger(Http2::class.java.name)");
        f27997a = logger;
    }

    public em1(@vr2 C6893to toVar, boolean z) {
        jt1.m53777p(toVar, "source");
        this.f27999a = toVar;
        this.f28001b = z;
        C5164b bVar = new C5164b(toVar);
        this.f27998a = bVar;
        this.f28000a = new wl1.C7171a(bVar, 4096, 0, 4, (wg0) null);
    }

    /* renamed from: A */
    public final void mo35477A(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int b = (i2 & 8) != 0 ? nq4.m58691b(this.f27999a.readByte(), 255) : 0;
            cVar.mo33873a(i3, this.f27999a.readInt() & Integer.MAX_VALUE, mo35486h(f27996a.mo35492b(i - 4, i2, b), b, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: E */
    public final void mo35478E(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f27999a.readInt();
            hv0 a = hv0.f29859a.mo37574a(readInt);
            if (a != null) {
                cVar.mo33880j(i3, a);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: H */
    public final void mo35479H(C5165c cVar, int i, int i2, int i3) throws IOException {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo33876d();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            kv3 kv3 = new kv3();
            gs1 e1 = df3.m45173e1(df3.m45236z1(0, i), 6);
            int j = e1.mo36871j();
            int l = e1.mo36872l();
            int n = e1.mo36873n();
            if (n < 0 ? j >= l : j <= l) {
                while (true) {
                    int c = nq4.m58693c(this.f27999a.readShort(), 65535);
                    readInt = this.f27999a.readInt();
                    if (c != 2) {
                        if (c == 3) {
                            c = 4;
                        } else if (c == 4) {
                            c = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (c == 5 && (readInt < 16384 || readInt > 16777215)) {
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    kv3.mo39539k(c, readInt);
                    if (j == l) {
                        break;
                    }
                    j += n;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.mo33881l(false, kv3);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
    }

    /* renamed from: K */
    public final void mo35480K(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long d = nq4.m58695d(this.f27999a.readInt(), 2147483647L);
            if (d != 0) {
                cVar.mo33883q(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    /* renamed from: b */
    public final boolean mo35481b(boolean z, @vr2 C5165c cVar) throws IOException {
        jt1.m53777p(cVar, "handler");
        try {
            this.f27999a.mo31694o(9);
            int S = nq4.m58681S(this.f27999a);
            if (S <= 16384) {
                int b = nq4.m58691b(this.f27999a.readByte(), 255);
                int b2 = nq4.m58691b(this.f27999a.readByte(), 255);
                int readInt = this.f27999a.readInt() & Integer.MAX_VALUE;
                Logger logger = f27997a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(bm1.f26418a.mo31951c(true, readInt, S, b, b2));
                }
                if (!z || b == 4) {
                    switch (b) {
                        case 0:
                            mo35484d(cVar, S, b2, readInt);
                            return true;
                        case 1:
                            mo35487l(cVar, S, b2, readInt);
                            return true;
                        case 2:
                            mo35490q(cVar, S, b2, readInt);
                            return true;
                        case 3:
                            mo35478E(cVar, S, b2, readInt);
                            return true;
                        case 4:
                            mo35479H(cVar, S, b2, readInt);
                            return true;
                        case 5:
                            mo35477A(cVar, S, b2, readInt);
                            return true;
                        case 6:
                            mo35488m(cVar, S, b2, readInt);
                            return true;
                        case 7:
                            mo35485g(cVar, S, b2, readInt);
                            return true;
                        case 8:
                            mo35480K(cVar, S, b2, readInt);
                            return true;
                        default:
                            this.f27999a.mo31670F1((long) S);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + bm1.f26418a.mo31950b(b));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + S);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo35482c(@vr2 C5165c cVar) throws IOException {
        jt1.m53777p(cVar, "handler");
        if (!this.f28001b) {
            C6893to toVar = this.f27999a;
            C5301fr frVar = bm1.f26419a;
            C5301fr I = toVar.mo31672I((long) frVar.mo36274j0());
            Logger logger = f27997a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(nq4.m58722v("<< CONNECTION " + I.mo31159D(), new Object[0]));
            }
            if (!jt1.m53768g(frVar, I)) {
                throw new IOException("Expected a connection header but was " + I.mo36280u0());
            }
        } else if (!mo35481b(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public void close() throws IOException {
        this.f27999a.close();
    }

    /* renamed from: d */
    public final void mo35484d(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = nq4.m58691b(this.f27999a.readByte(), 255);
                }
                cVar.mo33874b(z2, i3, this.f27999a, f27996a.mo35492b(i, i2, i4));
                this.f27999a.mo31670F1((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: g */
    public final void mo35485g(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f27999a.readInt();
            int readInt2 = this.f27999a.readInt();
            int i4 = i - 8;
            hv0 a = hv0.f29859a.mo37574a(readInt2);
            if (a != null) {
                C5301fr frVar = C5301fr.f28634a;
                if (i4 > 0) {
                    frVar = this.f27999a.mo31672I((long) i4);
                }
                cVar.mo33879i(readInt, a, frVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: h */
    public final List<sk1> mo35486h(int i, int i2, int i3, int i4) throws IOException {
        this.f27998a.mo35501m(i);
        C5164b bVar = this.f27998a;
        bVar.mo35502p(bVar.mo35495b());
        this.f27998a.mo35503q(i2);
        this.f27998a.mo35500l(i3);
        this.f27998a.mo35493A(i4);
        this.f28000a.mo46782l();
        return this.f28000a.mo46775e();
    }

    /* renamed from: l */
    public final void mo35487l(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = nq4.m58691b(this.f27999a.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                mo35489p(cVar, i3);
                i -= 5;
            }
            cVar.mo33882n(z, i3, -1, mo35486h(f27996a.mo35492b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: m */
    public final void mo35488m(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f27999a.readInt();
            int readInt2 = this.f27999a.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo33878f(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: p */
    public final void mo35489p(C5165c cVar, int i) throws IOException {
        int readInt = this.f27999a.readInt();
        cVar.mo33877e(i, readInt & Integer.MAX_VALUE, nq4.m58691b(this.f27999a.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    /* renamed from: q */
    public final void mo35490q(C5165c cVar, int i, int i2, int i3) throws IOException {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            mo35489p(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }
}
