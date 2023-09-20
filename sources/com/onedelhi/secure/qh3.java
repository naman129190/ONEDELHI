package com.onedelhi.secure;

import com.onedelhi.secure.C5301fr;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0002D\u0005B5\b\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u00103\u001a\u0004\u0018\u00010\b\u0012\u0006\u00109\u001a\u00020\u0002\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\u0006\u0010?\u001a\u00020\u0002¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\bJ \u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<¨\u0006E"}, d2 = {"Lcom/onedelhi/secure/qh3;", "", "", "upstreamSize", "Lcom/onedelhi/secure/un4;", "b", "Lcom/onedelhi/secure/fr;", "m", "Lcom/onedelhi/secure/x04;", "n", "prefix", "metadataSize", "u", "v", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "k", "()Ljava/lang/Thread;", "t", "(Ljava/lang/Thread;)V", "Lcom/onedelhi/secure/no;", "upstreamBuffer", "Lcom/onedelhi/secure/no;", "i", "()Lcom/onedelhi/secure/no;", "", "complete", "Z", "e", "()Z", "o", "(Z)V", "buffer", "c", "", "sourceCount", "I", "g", "()I", "q", "(I)V", "l", "isClosed", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "f", "()Ljava/io/RandomAccessFile;", "p", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lcom/onedelhi/secure/x04;", "h", "()Lcom/onedelhi/secure/x04;", "r", "(Lcom/onedelhi/secure/x04;)V", "upstreamPos", "J", "j", "()J", "s", "(J)V", "bufferMaxSize", "d", "metadata", "<init>", "(Ljava/io/RandomAccessFile;Lcom/onedelhi/secure/x04;JLcom/onedelhi/secure/fr;J)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class qh3 {

    /* renamed from: a */
    public static final C6574a f34232a = new C6574a((wg0) null);

    /* renamed from: b */
    public static final int f34233b = 1;
    @rw1
    @vr2

    /* renamed from: b */
    public static final C5301fr f34234b;

    /* renamed from: c */
    public static final int f34235c = 2;

    /* renamed from: c */
    public static final long f34236c = 32;
    @rw1
    @vr2

    /* renamed from: c */
    public static final C5301fr f34237c;

    /* renamed from: a */
    public int f34238a;

    /* renamed from: a */
    public long f34239a;

    /* renamed from: a */
    public final C5301fr f34240a;
    @vr2

    /* renamed from: a */
    public final C6205no f34241a;
    @ss2

    /* renamed from: a */
    public x04 f34242a;
    @ss2

    /* renamed from: a */
    public RandomAccessFile f34243a;
    @ss2

    /* renamed from: a */
    public Thread f34244a;

    /* renamed from: a */
    public boolean f34245a;

    /* renamed from: b */
    public final long f34246b;
    @vr2

    /* renamed from: b */
    public final C6205no f34247b;

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/qh3$a;", "", "Ljava/io/File;", "file", "Lcom/onedelhi/secure/x04;", "upstream", "Lcom/onedelhi/secure/fr;", "metadata", "", "bufferMaxSize", "Lcom/onedelhi/secure/qh3;", "a", "b", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lcom/onedelhi/secure/fr;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qh3$a */
    public static final class C6574a {
        public C6574a() {
        }

        public /* synthetic */ C6574a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final qh3 mo43555a(@vr2 File file, @vr2 x04 x04, @vr2 C5301fr frVar, long j) throws IOException {
            jt1.m53777p(file, "file");
            jt1.m53777p(x04, "upstream");
            jt1.m53777p(frVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            qh3 qh3 = new qh3(randomAccessFile, x04, 0, frVar, j, (wg0) null);
            randomAccessFile.setLength(0);
            qh3.mo43553u(qh3.f34237c, -1, -1);
            return qh3;
        }

        @vr2
        /* renamed from: b */
        public final qh3 mo43556b(@vr2 File file) throws IOException {
            jt1.m53777p(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            jt1.m53776o(channel, "randomAccessFile.channel");
            p21 p21 = new p21(channel);
            C6205no noVar = new C6205no();
            p21.mo42355a(0, noVar, 32);
            C5301fr frVar = qh3.f34234b;
            if (!(!jt1.m53768g(noVar.mo31672I((long) frVar.mo36274j0()), frVar))) {
                long readLong = noVar.readLong();
                long readLong2 = noVar.readLong();
                C6205no noVar2 = new C6205no();
                p21.mo42355a(readLong + 32, noVar2, readLong2);
                return new qh3(randomAccessFile, (x04) null, readLong, noVar2.mo31697r0(), 0, (wg0) null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/qh3$b;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "<init>", "(Lcom/onedelhi/secure/qh3;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qh3$b */
    public final class C6575b implements x04 {

        /* renamed from: a */
        public final me4 f34248a = new me4();

        /* renamed from: a */
        public p21 f34249a;

        /* renamed from: b */
        public long f34251b;

        public C6575b() {
            RandomAccessFile f = qh3.this.mo43538f();
            jt1.m53774m(f);
            FileChannel channel = f.getChannel();
            jt1.m53776o(channel, "file!!.channel");
            this.f34249a = new p21(channel);
        }

        public void close() throws IOException {
            if (this.f34249a != null) {
                RandomAccessFile randomAccessFile = null;
                this.f34249a = null;
                synchronized (qh3.this) {
                    qh3 qh3 = qh3.this;
                    qh3.mo43549q(qh3.mo43539g() - 1);
                    if (qh3.this.mo43539g() == 0) {
                        RandomAccessFile f = qh3.this.mo43538f();
                        qh3.this.mo43548p((RandomAccessFile) null);
                        randomAccessFile = f;
                    }
                    un4 un4 = un4.f36206a;
                }
                if (randomAccessFile != null) {
                    nq4.m58711l(randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            if (r4 != 2) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
            r10 = java.lang.Math.min(r2, r1.f34250a.mo43542j() - r1.f34251b);
            r2 = r1.f34249a;
            com.onedelhi.secure.jt1.m53774m(r2);
            r2.mo42355a(r1.f34251b + 32, r20, r10);
            r1.f34251b += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = r1.f34250a.mo43540h();
            com.onedelhi.secure.jt1.m53774m(r0);
            r14 = r0.read(r1.f34250a.mo43541i(), r1.f34250a.mo43536d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
            if (r14 != -1) goto L_0x00f3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
            r0 = r1.f34250a;
            r0.mo43534b(r0.mo43542j());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
            r2 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r1.f34250a.mo43552t((java.lang.Thread) null);
            r0 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
            if (r0 == null) goto L_0x00e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
            r0.notifyAll();
            r0 = com.onedelhi.secure.un4.f36206a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r11 = java.lang.Math.min(r14, r2);
            r1.f34250a.mo43541i().mo41278m(r20, 0, r11);
            r1.f34251b += r11;
            r13 = r1.f34249a;
            com.onedelhi.secure.jt1.m53774m(r13);
            r4 = r14;
            r13.mo42356b(r1.f34250a.mo43542j() + 32, r1.f34250a.mo43541i().clone(), r4);
            r2 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r1.f34250a.mo43535c().write(r1.f34250a.mo43541i(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
            if (r1.f34250a.mo43535c().mo41244V0() <= r1.f34250a.mo43536d()) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
            r1.f34250a.mo43535c().mo31670F1(r1.f34250a.mo43535c().mo41244V0() - r1.f34250a.mo43536d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
            r0 = r1.f34250a;
            r0.mo43551s(r0.mo43542j() + r4);
            r0 = com.onedelhi.secure.un4.f36206a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            r2 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.f34250a.mo43552t((java.lang.Thread) null);
            r0 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
            if (r0 == null) goto L_0x0186;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
            return r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
            monitor-enter(r1.f34250a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            r1.f34250a.mo43552t((java.lang.Thread) null);
            r3 = r1.f34250a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
            if (r3 == null) goto L_0x01a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a9, code lost:
            r3.notifyAll();
            r3 = com.onedelhi.secure.un4.f36206a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01af, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r20, long r21) throws java.io.IOException {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                com.onedelhi.secure.jt1.m53777p(r5, r0)
                com.onedelhi.secure.p21 r0 = r1.f34249a
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x01b6
                com.onedelhi.secure.qh3 r8 = com.onedelhi.secure.qh3.this
                monitor-enter(r8)
            L_0x0018:
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                long r6 = r0.mo43542j()     // Catch:{ all -> 0x01b3 }
                long r9 = r1.f34251b     // Catch:{ all -> 0x01b3 }
                r0 = 2
                r11 = -1
                int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x0065
                com.onedelhi.secure.qh3 r4 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                long r6 = r4.mo43542j()     // Catch:{ all -> 0x01b3 }
                com.onedelhi.secure.qh3 r4 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                com.onedelhi.secure.no r4 = r4.mo43535c()     // Catch:{ all -> 0x01b3 }
                long r9 = r4.mo41244V0()     // Catch:{ all -> 0x01b3 }
                long r6 = r6 - r9
                long r9 = r1.f34251b     // Catch:{ all -> 0x01b3 }
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x0040
                r4 = 2
                goto L_0x0088
            L_0x0040:
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                long r9 = r0.mo43542j()     // Catch:{ all -> 0x01b3 }
                long r11 = r1.f34251b     // Catch:{ all -> 0x01b3 }
                long r9 = r9 - r11
                long r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01b3 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                com.onedelhi.secure.no r2 = r0.mo43535c()     // Catch:{ all -> 0x01b3 }
                long r3 = r1.f34251b     // Catch:{ all -> 0x01b3 }
                long r6 = r3 - r6
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo41278m(r3, r4, r6)     // Catch:{ all -> 0x01b3 }
                long r2 = r1.f34251b     // Catch:{ all -> 0x01b3 }
                long r2 = r2 + r9
                r1.f34251b = r2     // Catch:{ all -> 0x01b3 }
                monitor-exit(r8)
                return r9
            L_0x0065:
                com.onedelhi.secure.qh3 r6 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                boolean r6 = r6.mo43537e()     // Catch:{ all -> 0x01b3 }
                if (r6 == 0) goto L_0x006f
                monitor-exit(r8)
                return r11
            L_0x006f:
                com.onedelhi.secure.qh3 r6 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r6 = r6.mo43543k()     // Catch:{ all -> 0x01b3 }
                if (r6 == 0) goto L_0x007f
                com.onedelhi.secure.me4 r0 = r1.f34248a     // Catch:{ all -> 0x01b3 }
                com.onedelhi.secure.qh3 r6 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                r0.mo40564k(r6)     // Catch:{ all -> 0x01b3 }
                goto L_0x0018
            L_0x007f:
                com.onedelhi.secure.qh3 r6 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01b3 }
                r6.mo43552t(r7)     // Catch:{ all -> 0x01b3 }
            L_0x0088:
                monitor-exit(r8)
                r8 = 32
                if (r4 != r0) goto L_0x00ae
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this
                long r6 = r0.mo43542j()
                long r10 = r1.f34251b
                long r6 = r6 - r10
                long r10 = java.lang.Math.min(r2, r6)
                com.onedelhi.secure.p21 r2 = r1.f34249a
                com.onedelhi.secure.jt1.m53774m(r2)
                long r3 = r1.f34251b
                long r3 = r3 + r8
                r5 = r20
                r6 = r10
                r2.mo42355a(r3, r5, r6)
                long r2 = r1.f34251b
                long r2 = r2 + r10
                r1.f34251b = r2
                return r10
            L_0x00ae:
                r10 = 0
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.x04 r0 = r0.mo43540h()     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.jt1.m53774m(r0)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r4 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.no r4 = r4.mo43541i()     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r6 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                long r6 = r6.mo43536d()     // Catch:{ all -> 0x0194 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x0194 }
                int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r0 != 0) goto L_0x00f3
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.mo43542j()     // Catch:{ all -> 0x0194 }
                r0.mo43534b(r2)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r2 = com.onedelhi.secure.qh3.this
                monitor-enter(r2)
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x00f0 }
                r0.mo43552t(r10)     // Catch:{ all -> 0x00f0 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x00f0 }
                if (r0 == 0) goto L_0x00e8
                r0.notifyAll()     // Catch:{ all -> 0x00f0 }
                com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r2)
                return r11
            L_0x00e8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00f0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f3:
                long r11 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.no r2 = r0.mo43541i()     // Catch:{ all -> 0x0194 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r11
                r2.mo41278m(r3, r4, r6)     // Catch:{ all -> 0x0194 }
                long r2 = r1.f34251b     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r11
                r1.f34251b = r2     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.p21 r13 = r1.f34249a     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.jt1.m53774m(r13)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.mo43542j()     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r8
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.no r0 = r0.mo43541i()     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.no r16 = r0.clone()     // Catch:{ all -> 0x0194 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.mo42356b(r14, r16, r17)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r2 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0194 }
                monitor-enter(r2)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.no r0 = r0.mo43535c()     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.qh3 r3 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.no r3 = r3.mo43541i()     // Catch:{ all -> 0x0191 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.no r0 = r0.mo43535c()     // Catch:{ all -> 0x0191 }
                long r6 = r0.mo41244V0()     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                long r8 = r0.mo43536d()     // Catch:{ all -> 0x0191 }
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x0168
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.no r0 = r0.mo43535c()     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.qh3 r3 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.no r3 = r3.mo43535c()     // Catch:{ all -> 0x0191 }
                long r6 = r3.mo41244V0()     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.qh3 r3 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                long r8 = r3.mo43536d()     // Catch:{ all -> 0x0191 }
                long r6 = r6 - r8
                r0.mo31670F1(r6)     // Catch:{ all -> 0x0191 }
            L_0x0168:
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x0191 }
                long r6 = r0.mo43542j()     // Catch:{ all -> 0x0191 }
                long r6 = r6 + r4
                r0.mo43551s(r6)     // Catch:{ all -> 0x0191 }
                com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0191 }
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                com.onedelhi.secure.qh3 r2 = com.onedelhi.secure.qh3.this
                monitor-enter(r2)
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x018e }
                r0.mo43552t(r10)     // Catch:{ all -> 0x018e }
                com.onedelhi.secure.qh3 r0 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0186
                r0.notifyAll()     // Catch:{ all -> 0x018e }
                monitor-exit(r2)
                return r11
            L_0x0186:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018e }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x018e }
                throw r0     // Catch:{ all -> 0x018e }
            L_0x018e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0191:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                throw r0     // Catch:{ all -> 0x0194 }
            L_0x0194:
                r0 = move-exception
                com.onedelhi.secure.qh3 r2 = com.onedelhi.secure.qh3.this
                monitor-enter(r2)
                com.onedelhi.secure.qh3 r3 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b0 }
                r3.mo43552t(r10)     // Catch:{ all -> 0x01b0 }
                com.onedelhi.secure.qh3 r3 = com.onedelhi.secure.qh3.this     // Catch:{ all -> 0x01b0 }
                if (r3 != 0) goto L_0x01a9
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01b0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01b0 }
                throw r0     // Catch:{ all -> 0x01b0 }
            L_0x01a9:
                r3.notifyAll()     // Catch:{ all -> 0x01b0 }
                com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x01b0 }
                monitor-exit(r2)
                throw r0
            L_0x01b0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01b3:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x01b6:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qh3.C6575b.read(com.onedelhi.secure.no, long):long");
        }

        @vr2
        public me4 timeout() {
            return this.f34248a;
        }
    }

    static {
        C5301fr.C5302a aVar = C5301fr.f28633a;
        f34234b = aVar.mo36296l("OkHttp cache v1\n");
        f34237c = aVar.mo36296l("OkHttp DIRTY :(\n");
    }

    public qh3(RandomAccessFile randomAccessFile, x04 x04, long j, C5301fr frVar, long j2) {
        this.f34243a = randomAccessFile;
        this.f34242a = x04;
        this.f34239a = j;
        this.f34240a = frVar;
        this.f34246b = j2;
        this.f34241a = new C6205no();
        this.f34245a = this.f34242a == null;
        this.f34247b = new C6205no();
    }

    public /* synthetic */ qh3(RandomAccessFile randomAccessFile, x04 x04, long j, C5301fr frVar, long j2, wg0 wg0) {
        this(randomAccessFile, x04, j, frVar, j2);
    }

    /* renamed from: b */
    public final void mo43534b(long j) throws IOException {
        mo43554v(j);
        RandomAccessFile randomAccessFile = this.f34243a;
        jt1.m53774m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        mo43553u(f34234b, j, (long) this.f34240a.mo36274j0());
        RandomAccessFile randomAccessFile2 = this.f34243a;
        jt1.m53774m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f34245a = true;
            un4 un4 = un4.f36206a;
        }
        x04 x04 = this.f34242a;
        if (x04 != null) {
            nq4.m58711l(x04);
        }
        this.f34242a = null;
    }

    @vr2
    /* renamed from: c */
    public final C6205no mo43535c() {
        return this.f34247b;
    }

    /* renamed from: d */
    public final long mo43536d() {
        return this.f34246b;
    }

    /* renamed from: e */
    public final boolean mo43537e() {
        return this.f34245a;
    }

    @ss2
    /* renamed from: f */
    public final RandomAccessFile mo43538f() {
        return this.f34243a;
    }

    /* renamed from: g */
    public final int mo43539g() {
        return this.f34238a;
    }

    @ss2
    /* renamed from: h */
    public final x04 mo43540h() {
        return this.f34242a;
    }

    @vr2
    /* renamed from: i */
    public final C6205no mo43541i() {
        return this.f34241a;
    }

    /* renamed from: j */
    public final long mo43542j() {
        return this.f34239a;
    }

    @ss2
    /* renamed from: k */
    public final Thread mo43543k() {
        return this.f34244a;
    }

    /* renamed from: l */
    public final boolean mo43544l() {
        return this.f34243a == null;
    }

    @vr2
    /* renamed from: m */
    public final C5301fr mo43545m() {
        return this.f34240a;
    }

    @ss2
    /* renamed from: n */
    public final x04 mo43546n() {
        synchronized (this) {
            if (this.f34243a == null) {
                return null;
            }
            this.f34238a++;
            return new C6575b();
        }
    }

    /* renamed from: o */
    public final void mo43547o(boolean z) {
        this.f34245a = z;
    }

    /* renamed from: p */
    public final void mo43548p(@ss2 RandomAccessFile randomAccessFile) {
        this.f34243a = randomAccessFile;
    }

    /* renamed from: q */
    public final void mo43549q(int i) {
        this.f34238a = i;
    }

    /* renamed from: r */
    public final void mo43550r(@ss2 x04 x04) {
        this.f34242a = x04;
    }

    /* renamed from: s */
    public final void mo43551s(long j) {
        this.f34239a = j;
    }

    /* renamed from: t */
    public final void mo43552t(@ss2 Thread thread) {
        this.f34244a = thread;
    }

    /* renamed from: u */
    public final void mo43553u(C5301fr frVar, long j, long j2) throws IOException {
        C6205no noVar = new C6205no();
        noVar.mo41287s(frVar);
        noVar.mo41292v(j);
        noVar.mo41292v(j2);
        if (noVar.mo41244V0() == 32) {
            RandomAccessFile randomAccessFile = this.f34243a;
            jt1.m53774m(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            jt1.m53776o(channel, "file!!.channel");
            new p21(channel).mo42356b(0, noVar, 32);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: v */
    public final void mo43554v(long j) throws IOException {
        C6205no noVar = new C6205no();
        noVar.mo41287s(this.f34240a);
        RandomAccessFile randomAccessFile = this.f34243a;
        jt1.m53774m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        jt1.m53776o(channel, "file!!.channel");
        new p21(channel).mo42356b(32 + j, noVar, (long) this.f34240a.mo36274j0());
    }
}
