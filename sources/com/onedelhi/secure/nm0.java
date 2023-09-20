package com.onedelhi.secure;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004QRSTB9\b\u0000\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010L\u001a\u00020G\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010-\u001a\u00020\u0016\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u0016J#\u0010\u001d\u001a\u00020\u00032\n\u0010\u001b\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010\"\u001a\u00020\u000b2\n\u0010!\u001a\u00060 R\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020\u0003H\u0016J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0003J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0014R\u00020\u00000*R*\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00168F@FX\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060 R\u00020\u0000038\u0000X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u00108\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0000X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006U"}, d2 = {"Lcom/onedelhi/secure/nm0;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcom/onedelhi/secure/un4;", "Q0", "Lcom/onedelhi/secure/so;", "O0", "", "line", "R0", "P0", "", "N0", "X", "c1", "key", "p1", "M0", "S0", "()V", "Lcom/onedelhi/secure/nm0$g;", "o0", "", "expectedSequenceNumber", "Lcom/onedelhi/secure/nm0$a;", "e0", "i1", "editor", "success", "Y", "(Lcom/onedelhi/secure/nm0$a;Z)V", "V0", "Lcom/onedelhi/secure/nm0$b;", "entry", "b1", "(Lcom/onedelhi/secure/nm0$b;)Z", "flush", "isClosed", "close", "l1", "Z", "l0", "", "j1", "value", "maxSize", "J", "F0", "()J", "h1", "(J)V", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "C0", "()Ljava/util/LinkedHashMap;", "closed", "p0", "()Z", "f1", "(Z)V", "Lcom/onedelhi/secure/u21;", "fileSystem", "Lcom/onedelhi/secure/u21;", "u0", "()Lcom/onedelhi/secure/u21;", "Ljava/io/File;", "directory", "Ljava/io/File;", "q0", "()Ljava/io/File;", "", "valueCount", "I", "G0", "()I", "appVersion", "Lcom/onedelhi/secure/fa4;", "taskRunner", "<init>", "(Lcom/onedelhi/secure/u21;Ljava/io/File;IIJLcom/onedelhi/secure/fa4;)V", "f", "a", "b", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class nm0 implements Closeable, Flushable {
    @rw1
    @vr2

    /* renamed from: a */
    public static final eh3 f32581a = new eh3("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public static final C6201f f32582a = new C6201f((wg0) null);
    @rw1
    @vr2

    /* renamed from: b */
    public static final String f32583b = mm0.f16214b;
    @rw1
    @vr2

    /* renamed from: c */
    public static final String f32584c = mm0.f16215c;
    @rw1
    @vr2

    /* renamed from: d */
    public static final String f32585d = mm0.f16216d;
    @rw1

    /* renamed from: e */
    public static final long f32586e = -1;
    @rw1
    @vr2

    /* renamed from: e */
    public static final String f32587e = mm0.f16218e;
    @rw1
    @vr2

    /* renamed from: f */
    public static final String f32588f = mm0.f16219f;
    @rw1
    @vr2

    /* renamed from: g */
    public static final String f32589g = mm0.f16220g;
    @rw1
    @vr2

    /* renamed from: h */
    public static final String f32590h = mm0.f16221h;
    @rw1
    @vr2

    /* renamed from: i */
    public static final String f32591i = mm0.f16222i;
    @rw1
    @vr2

    /* renamed from: j */
    public static final String f32592j = mm0.f16223j;

    /* renamed from: a */
    public final ea4 f32593a;

    /* renamed from: a */
    public final C6198c f32594a;

    /* renamed from: a */
    public C6785so f32595a;
    @vr2

    /* renamed from: a */
    public final u21 f32596a;

    /* renamed from: a */
    public final File f32597a;
    @vr2

    /* renamed from: a */
    public final LinkedHashMap<String, C6196b> f32598a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    public long f32599b;

    /* renamed from: b */
    public final File f32600b;

    /* renamed from: b */
    public boolean f32601b;

    /* renamed from: c */
    public long f32602c;

    /* renamed from: c */
    public final File f32603c;

    /* renamed from: c */
    public boolean f32604c;

    /* renamed from: d */
    public long f32605d;
    @vr2

    /* renamed from: d */
    public final File f32606d;

    /* renamed from: d */
    public boolean f32607d;

    /* renamed from: e */
    public boolean f32608e;

    /* renamed from: f */
    public boolean f32609f;

    /* renamed from: g */
    public boolean f32610g;

    /* renamed from: n */
    public int f32611n;

    /* renamed from: o */
    public final int f32612o;

    /* renamed from: p */
    public final int f32613p;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0014\u001a\u00060\u0012R\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00060\u0012R\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/nm0$a;", "", "Lcom/onedelhi/secure/un4;", "c", "()V", "", "index", "Lcom/onedelhi/secure/x04;", "g", "Lcom/onedelhi/secure/oz3;", "f", "b", "a", "", "written", "[Z", "e", "()[Z", "Lcom/onedelhi/secure/nm0$b;", "Lcom/onedelhi/secure/nm0;", "entry", "Lcom/onedelhi/secure/nm0$b;", "d", "()Lcom/onedelhi/secure/nm0$b;", "<init>", "(Lcom/onedelhi/secure/nm0;Lcom/onedelhi/secure/nm0$b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$a */
    public final class C6194a {
        @vr2

        /* renamed from: a */
        public final C6196b f32614a;

        /* renamed from: a */
        public final /* synthetic */ nm0 f32615a;

        /* renamed from: a */
        public boolean f32616a;
        @ss2

        /* renamed from: a */
        public final boolean[] f32617a;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/IOException;", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.nm0$a$a */
        public static final class C6195a extends d12 implements ec1<IOException, un4> {

            /* renamed from: a */
            public final /* synthetic */ C6194a f32618a;

            /* renamed from: n */
            public final /* synthetic */ int f32619n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6195a(C6194a aVar, int i) {
                super(1);
                this.f32618a = aVar;
                this.f32619n = i;
            }

            /* renamed from: X */
            public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
                mo41176a((IOException) obj);
                return un4.f36206a;
            }

            /* renamed from: a */
            public final void mo41176a(@vr2 IOException iOException) {
                jt1.m53777p(iOException, "it");
                synchronized (this.f32618a.f32615a) {
                    this.f32618a.mo41171c();
                    un4 un4 = un4.f36206a;
                }
            }
        }

        public C6194a(@vr2 nm0 nm0, C6196b bVar) {
            jt1.m53777p(bVar, wh0.f36995a);
            this.f32615a = nm0;
            this.f32614a = bVar;
            this.f32617a = bVar.mo41183g() ? null : new boolean[nm0.mo41139G0()];
        }

        /* renamed from: a */
        public final void mo41169a() throws IOException {
            synchronized (this.f32615a) {
                if (!this.f32616a) {
                    if (jt1.m53768g(this.f32614a.mo41178b(), this)) {
                        this.f32615a.mo41149Y(this, false);
                    }
                    this.f32616a = true;
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: b */
        public final void mo41170b() throws IOException {
            synchronized (this.f32615a) {
                if (!this.f32616a) {
                    if (jt1.m53768g(this.f32614a.mo41178b(), this)) {
                        this.f32615a.mo41149Y(this, true);
                    }
                    this.f32616a = true;
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: c */
        public final void mo41171c() {
            if (!jt1.m53768g(this.f32614a.mo41178b(), this)) {
                return;
            }
            if (this.f32615a.f32604c) {
                this.f32615a.mo41149Y(this, false);
            } else {
                this.f32614a.mo41193q(true);
            }
        }

        @vr2
        /* renamed from: d */
        public final C6196b mo41172d() {
            return this.f32614a;
        }

        @ss2
        /* renamed from: e */
        public final boolean[] mo41173e() {
            return this.f32617a;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = com.onedelhi.secure.gu2.m49833b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
        @com.onedelhi.secure.vr2
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.onedelhi.secure.oz3 mo41174f(int r5) {
            /*
                r4 = this;
                com.onedelhi.secure.nm0 r0 = r4.f32615a
                monitor-enter(r0)
                boolean r1 = r4.f32616a     // Catch:{ all -> 0x005f }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0053
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x005f }
                com.onedelhi.secure.nm0$a r1 = r1.mo41178b()     // Catch:{ all -> 0x005f }
                boolean r1 = com.onedelhi.secure.jt1.m53768g(r1, r4)     // Catch:{ all -> 0x005f }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                com.onedelhi.secure.oz3 r5 = com.onedelhi.secure.gu2.m49833b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x001c:
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x005f }
                boolean r1 = r1.mo41183g()     // Catch:{ all -> 0x005f }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r4.f32617a     // Catch:{ all -> 0x005f }
                com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x005f }
                r1[r5] = r2     // Catch:{ all -> 0x005f }
            L_0x002b:
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x005f }
                java.util.List r1 = r1.mo41179c()     // Catch:{ all -> 0x005f }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x005f }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005f }
                com.onedelhi.secure.nm0 r2 = r4.f32615a     // Catch:{ FileNotFoundException -> 0x004d }
                com.onedelhi.secure.u21 r2 = r2.mo41168u0()     // Catch:{ FileNotFoundException -> 0x004d }
                com.onedelhi.secure.oz3 r1 = r2.mo45371e(r1)     // Catch:{ FileNotFoundException -> 0x004d }
                com.onedelhi.secure.f01 r2 = new com.onedelhi.secure.f01     // Catch:{ all -> 0x005f }
                com.onedelhi.secure.nm0$a$a r3 = new com.onedelhi.secure.nm0$a$a     // Catch:{ all -> 0x005f }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r2
            L_0x004d:
                com.onedelhi.secure.oz3 r5 = com.onedelhi.secure.gu2.m49833b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x0053:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005f }
                r1.<init>(r5)     // Catch:{ all -> 0x005f }
                throw r1     // Catch:{ all -> 0x005f }
            L_0x005f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.C6194a.mo41174f(int):com.onedelhi.secure.oz3");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            return null;
         */
        @com.onedelhi.secure.ss2
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.onedelhi.secure.x04 mo41175g(int r5) {
            /*
                r4 = this;
                com.onedelhi.secure.nm0 r0 = r4.f32615a
                monitor-enter(r0)
                boolean r1 = r4.f32616a     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0043
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x004f }
                boolean r1 = r1.mo41183g()     // Catch:{ all -> 0x004f }
                r2 = 0
                if (r1 == 0) goto L_0x0041
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x004f }
                com.onedelhi.secure.nm0$a r1 = r1.mo41178b()     // Catch:{ all -> 0x004f }
                boolean r1 = com.onedelhi.secure.jt1.m53768g(r1, r4)     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0041
                com.onedelhi.secure.nm0$b r1 = r4.f32614a     // Catch:{ all -> 0x004f }
                boolean r1 = r1.mo41185i()     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0029
                goto L_0x0041
            L_0x0029:
                com.onedelhi.secure.nm0 r1 = r4.f32615a     // Catch:{ FileNotFoundException -> 0x003f }
                com.onedelhi.secure.u21 r1 = r1.mo41168u0()     // Catch:{ FileNotFoundException -> 0x003f }
                com.onedelhi.secure.nm0$b r3 = r4.f32614a     // Catch:{ FileNotFoundException -> 0x003f }
                java.util.List r3 = r3.mo41177a()     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x003f }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x003f }
                com.onedelhi.secure.x04 r2 = r1.mo45374h(r5)     // Catch:{ FileNotFoundException -> 0x003f }
            L_0x003f:
                monitor-exit(r0)
                return r2
            L_0x0041:
                monitor-exit(r0)
                return r2
            L_0x0043:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004f }
                r1.<init>(r5)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.C6194a.mo41175g(int):com.onedelhi.secure.x04");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010A\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0018\u00010\fR\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010$\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R(\u0010.\u001a\b\u0018\u00010-R\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/onedelhi/secure/nm0$b;", "", "", "", "strings", "Lcom/onedelhi/secure/un4;", "m", "(Ljava/util/List;)V", "Lcom/onedelhi/secure/so;", "writer", "s", "(Lcom/onedelhi/secure/so;)V", "Lcom/onedelhi/secure/nm0$g;", "Lcom/onedelhi/secure/nm0;", "r", "()Lcom/onedelhi/secure/nm0$g;", "", "j", "", "index", "Lcom/onedelhi/secure/x04;", "k", "", "lengths", "[J", "e", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "a", "()Ljava/util/List;", "dirtyFiles", "c", "", "readable", "Z", "g", "()Z", "o", "(Z)V", "zombie", "i", "q", "Lcom/onedelhi/secure/nm0$a;", "currentEditor", "Lcom/onedelhi/secure/nm0$a;", "b", "()Lcom/onedelhi/secure/nm0$a;", "l", "(Lcom/onedelhi/secure/nm0$a;)V", "lockingSourceCount", "I", "f", "()I", "n", "(I)V", "", "sequenceNumber", "J", "h", "()J", "p", "(J)V", "key", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Lcom/onedelhi/secure/nm0;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$b */
    public final class C6196b {

        /* renamed from: a */
        public int f32620a;

        /* renamed from: a */
        public long f32621a;
        @ss2

        /* renamed from: a */
        public C6194a f32622a;

        /* renamed from: a */
        public final /* synthetic */ nm0 f32623a;
        @vr2

        /* renamed from: a */
        public final String f32624a;
        @vr2

        /* renamed from: a */
        public final List<File> f32625a = new ArrayList();

        /* renamed from: a */
        public boolean f32626a;
        @vr2

        /* renamed from: a */
        public final long[] f32627a;
        @vr2

        /* renamed from: b */
        public final List<File> f32628b = new ArrayList();

        /* renamed from: b */
        public boolean f32629b;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/nm0$b$a", "Lcom/onedelhi/secure/na1;", "Lcom/onedelhi/secure/un4;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.nm0$b$a */
        public static final class C6197a extends na1 {

            /* renamed from: a */
            public final /* synthetic */ C6196b f32630a;

            /* renamed from: a */
            public final /* synthetic */ x04 f32631a;

            /* renamed from: b */
            public boolean f32632b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6197a(C6196b bVar, x04 x04, x04 x042) {
                super(x042);
                this.f32630a = bVar;
                this.f32631a = x04;
            }

            public void close() {
                super.close();
                if (!this.f32632b) {
                    this.f32632b = true;
                    synchronized (this.f32630a.f32623a) {
                        C6196b bVar = this.f32630a;
                        bVar.mo41190n(bVar.mo41182f() - 1);
                        if (this.f32630a.mo41182f() == 0 && this.f32630a.mo41185i()) {
                            C6196b bVar2 = this.f32630a;
                            bVar2.f32623a.mo41151b1(bVar2);
                        }
                        un4 un4 = un4.f36206a;
                    }
                }
            }
        }

        public C6196b(@vr2 nm0 nm0, String str) {
            jt1.m53777p(str, "key");
            this.f32623a = nm0;
            this.f32624a = str;
            this.f32627a = new long[nm0.mo41139G0()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int G0 = nm0.mo41139G0();
            for (int i = 0; i < G0; i++) {
                sb.append(i);
                this.f32625a.add(new File(nm0.mo41167q0(), sb.toString()));
                sb.append(".tmp");
                this.f32628b.add(new File(nm0.mo41167q0(), sb.toString()));
                sb.setLength(length);
            }
        }

        @vr2
        /* renamed from: a */
        public final List<File> mo41177a() {
            return this.f32625a;
        }

        @ss2
        /* renamed from: b */
        public final C6194a mo41178b() {
            return this.f32622a;
        }

        @vr2
        /* renamed from: c */
        public final List<File> mo41179c() {
            return this.f32628b;
        }

        @vr2
        /* renamed from: d */
        public final String mo41180d() {
            return this.f32624a;
        }

        @vr2
        /* renamed from: e */
        public final long[] mo41181e() {
            return this.f32627a;
        }

        /* renamed from: f */
        public final int mo41182f() {
            return this.f32620a;
        }

        /* renamed from: g */
        public final boolean mo41183g() {
            return this.f32626a;
        }

        /* renamed from: h */
        public final long mo41184h() {
            return this.f32621a;
        }

        /* renamed from: i */
        public final boolean mo41185i() {
            return this.f32629b;
        }

        /* renamed from: j */
        public final Void mo41186j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        /* renamed from: k */
        public final x04 mo41187k(int i) {
            x04 h = this.f32623a.mo41168u0().mo45374h(this.f32625a.get(i));
            if (this.f32623a.f32604c) {
                return h;
            }
            this.f32620a++;
            return new C6197a(this, h, h);
        }

        /* renamed from: l */
        public final void mo41188l(@ss2 C6194a aVar) {
            this.f32622a = aVar;
        }

        /* renamed from: m */
        public final void mo41189m(@vr2 List<String> list) throws IOException {
            jt1.m53777p(list, "strings");
            if (list.size() == this.f32623a.mo41139G0()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.f32627a[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    mo41186j(list);
                    throw new b02();
                }
            } else {
                mo41186j(list);
                throw new b02();
            }
        }

        /* renamed from: n */
        public final void mo41190n(int i) {
            this.f32620a = i;
        }

        /* renamed from: o */
        public final void mo41191o(boolean z) {
            this.f32626a = z;
        }

        /* renamed from: p */
        public final void mo41192p(long j) {
            this.f32621a = j;
        }

        /* renamed from: q */
        public final void mo41193q(boolean z) {
            this.f32629b = z;
        }

        @ss2
        /* renamed from: r */
        public final C6202g mo41194r() {
            nm0 nm0 = this.f32623a;
            if (nq4.f32734a && !Thread.holdsLock(nm0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                jt1.m53776o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(nm0);
                throw new AssertionError(sb.toString());
            } else if (!this.f32626a) {
                return null;
            } else {
                if (!this.f32623a.f32604c && (this.f32622a != null || this.f32629b)) {
                    return null;
                }
                ArrayList<x04> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.f32627a.clone();
                try {
                    int G0 = this.f32623a.mo41139G0();
                    for (int i = 0; i < G0; i++) {
                        arrayList.add(mo41187k(i));
                    }
                    return new C6202g(this.f32623a, this.f32624a, this.f32621a, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (x04 l : arrayList) {
                        nq4.m58711l(l);
                    }
                    try {
                        this.f32623a.mo41151b1(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        /* renamed from: s */
        public final void mo41195s(@vr2 C6785so soVar) throws IOException {
            jt1.m53777p(soVar, "writer");
            for (long S1 : this.f32627a) {
                soVar.mo41230L0(32).mo41242S1(S1);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/nm0$c", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$c */
    public static final class C6198c extends v94 {

        /* renamed from: a */
        public final /* synthetic */ nm0 f32633a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6198c(nm0 nm0, String str) {
            super(str, false, 2, (wg0) null);
            this.f32633a = nm0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            com.onedelhi.secure.nm0.m58222H(r6.f32633a, true);
            com.onedelhi.secure.nm0.m58221E(r6.f32633a, com.onedelhi.secure.gu2.m49834c(com.onedelhi.secure.gu2.m49833b()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo33844f() {
            /*
                r6 = this;
                com.onedelhi.secure.nm0 r0 = r6.f32633a
                monitor-enter(r0)
                com.onedelhi.secure.nm0 r1 = r6.f32633a     // Catch:{ all -> 0x004c }
                boolean r1 = r1.f32607d     // Catch:{ all -> 0x004c }
                r2 = -1
                if (r1 == 0) goto L_0x004a
                com.onedelhi.secure.nm0 r1 = r6.f32633a     // Catch:{ all -> 0x004c }
                boolean r1 = r1.mo41165p0()     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0016
                goto L_0x004a
            L_0x0016:
                r1 = 1
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ IOException -> 0x001d }
                r4.mo41163l1()     // Catch:{ IOException -> 0x001d }
                goto L_0x0022
            L_0x001d:
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ all -> 0x004c }
                r4.f32609f = r1     // Catch:{ all -> 0x004c }
            L_0x0022:
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ IOException -> 0x0036 }
                boolean r4 = r4.mo41141N0()     // Catch:{ IOException -> 0x0036 }
                if (r4 == 0) goto L_0x0048
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ IOException -> 0x0036 }
                r4.mo41146S0()     // Catch:{ IOException -> 0x0036 }
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ IOException -> 0x0036 }
                r5 = 0
                r4.f32611n = r5     // Catch:{ IOException -> 0x0036 }
                goto L_0x0048
            L_0x0036:
                com.onedelhi.secure.nm0 r4 = r6.f32633a     // Catch:{ all -> 0x004c }
                r4.f32610g = r1     // Catch:{ all -> 0x004c }
                com.onedelhi.secure.nm0 r1 = r6.f32633a     // Catch:{ all -> 0x004c }
                com.onedelhi.secure.oz3 r4 = com.onedelhi.secure.gu2.m49833b()     // Catch:{ all -> 0x004c }
                com.onedelhi.secure.so r4 = com.onedelhi.secure.gu2.m49834c(r4)     // Catch:{ all -> 0x004c }
                r1.f32595a = r4     // Catch:{ all -> 0x004c }
            L_0x0048:
                monitor-exit(r0)
                return r2
            L_0x004a:
                monitor-exit(r0)
                return r2
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.C6198c.mo33844f():long");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$d */
    public static final class C6199d extends d12 implements ec1<IOException, un4> {

        /* renamed from: a */
        public final /* synthetic */ nm0 f32634a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6199d(nm0 nm0) {
            super(1);
            this.f32634a = nm0;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo41196a((IOException) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo41196a(@vr2 IOException iOException) {
            jt1.m53777p(iOException, "it");
            nm0 nm0 = this.f32634a;
            if (!nq4.f32734a || Thread.holdsLock(nm0)) {
                this.f32634a.f32601b = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(nm0);
            throw new AssertionError(sb.toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\r\u0010\u0006\u001a\u00060\u0002R\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/onedelhi/secure/nm0$e", "", "Lcom/onedelhi/secure/nm0$g;", "Lcom/onedelhi/secure/nm0;", "", "hasNext", "a", "Lcom/onedelhi/secure/un4;", "remove", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$e */
    public static final class C6200e implements Iterator<C6202g>, qx1 {

        /* renamed from: a */
        public C6202g f32635a;

        /* renamed from: a */
        public final /* synthetic */ nm0 f32636a;

        /* renamed from: a */
        public final Iterator<C6196b> f32637a;

        /* renamed from: b */
        public C6202g f32638b;

        public C6200e(nm0 nm0) {
            this.f32636a = nm0;
            Iterator<C6196b> it = new ArrayList(nm0.mo41137C0().values()).iterator();
            jt1.m53776o(it, "ArrayList(lruEntries.values).iterator()");
            this.f32637a = it;
        }

        @vr2
        /* renamed from: a */
        public C6202g next() {
            if (hasNext()) {
                C6202g gVar = this.f32635a;
                this.f32638b = gVar;
                this.f32635a = null;
                jt1.m53774m(gVar);
                return gVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            C6202g r;
            if (this.f32635a != null) {
                return true;
            }
            synchronized (this.f32636a) {
                if (this.f32636a.mo41165p0()) {
                    return false;
                }
                while (this.f32637a.hasNext()) {
                    C6196b next = this.f32637a.next();
                    if (next != null && (r = next.mo41194r()) != null) {
                        this.f32635a = r;
                        return true;
                    }
                }
                un4 un4 = un4.f36206a;
                return false;
            }
        }

        public void remove() {
            C6202g gVar = this.f32638b;
            if (gVar != null) {
                try {
                    this.f32636a.mo41147V0(gVar.mo41205d());
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f32638b = null;
                    throw th;
                }
                this.f32638b = null;
                return;
            }
            throw new IllegalStateException("remove() before next()".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006XD¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/nm0$f;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lcom/onedelhi/secure/eh3;", "LEGAL_KEY_PATTERN", "Lcom/onedelhi/secure/eh3;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$f */
    public static final class C6201f {
        public C6201f() {
        }

        public /* synthetic */ C6201f(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/nm0$g;", "Ljava/io/Closeable;", "", "d", "Lcom/onedelhi/secure/nm0$a;", "Lcom/onedelhi/secure/nm0;", "a", "", "index", "Lcom/onedelhi/secure/x04;", "c", "", "b", "Lcom/onedelhi/secure/un4;", "close", "key", "sequenceNumber", "", "sources", "", "lengths", "<init>", "(Lcom/onedelhi/secure/nm0;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nm0$g */
    public final class C6202g implements Closeable {

        /* renamed from: a */
        public final /* synthetic */ nm0 f32639a;

        /* renamed from: a */
        public final List<x04> f32640a;

        /* renamed from: a */
        public final long[] f32641a;

        /* renamed from: b */
        public final long f32642b;

        /* renamed from: b */
        public final String f32643b;

        public C6202g(@vr2 nm0 nm0, String str, @vr2 long j, @vr2 List<? extends x04> list, long[] jArr) {
            jt1.m53777p(str, "key");
            jt1.m53777p(list, "sources");
            jt1.m53777p(jArr, "lengths");
            this.f32639a = nm0;
            this.f32643b = str;
            this.f32642b = j;
            this.f32640a = list;
            this.f32641a = jArr;
        }

        @ss2
        /* renamed from: a */
        public final C6194a mo41201a() throws IOException {
            return this.f32639a.mo41155e0(this.f32643b, this.f32642b);
        }

        /* renamed from: b */
        public final long mo41202b(int i) {
            return this.f32641a[i];
        }

        @vr2
        /* renamed from: c */
        public final x04 mo41203c(int i) {
            return this.f32640a.get(i);
        }

        public void close() {
            for (x04 l : this.f32640a) {
                nq4.m58711l(l);
            }
        }

        @vr2
        /* renamed from: d */
        public final String mo41205d() {
            return this.f32643b;
        }
    }

    public nm0(@vr2 u21 u21, @vr2 File file, int i, int i2, long j, @vr2 fa4 fa4) {
        jt1.m53777p(u21, "fileSystem");
        jt1.m53777p(file, "directory");
        jt1.m53777p(fa4, "taskRunner");
        this.f32596a = u21;
        this.f32606d = file;
        this.f32612o = i;
        this.f32613p = i2;
        this.f32599b = j;
        boolean z = false;
        this.f32593a = fa4.mo35812j();
        this.f32594a = new C6198c(this, nq4.f32729a + " Cache");
        if (j > 0) {
            if (i2 > 0 ? true : z) {
                this.f32597a = new File(file, f32583b);
                this.f32600b = new File(file, f32584c);
                this.f32603c = new File(file, f32585d);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: j0 */
    public static /* synthetic */ C6194a m58231j0(nm0 nm0, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = f32586e;
        }
        return nm0.mo41155e0(str, j);
    }

    @vr2
    /* renamed from: C0 */
    public final LinkedHashMap<String, C6196b> mo41137C0() {
        return this.f32598a;
    }

    /* renamed from: F0 */
    public final synchronized long mo41138F0() {
        return this.f32599b;
    }

    /* renamed from: G0 */
    public final int mo41139G0() {
        return this.f32613p;
    }

    /* renamed from: M0 */
    public final synchronized void mo41140M0() throws IOException {
        if (nq4.f32734a) {
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                jt1.m53776o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        if (!this.f32607d) {
            if (this.f32596a.mo45369c(this.f32603c)) {
                if (this.f32596a.mo45369c(this.f32597a)) {
                    this.f32596a.mo45368b(this.f32603c);
                } else {
                    this.f32596a.mo45372f(this.f32603c, this.f32597a);
                }
            }
            this.f32604c = nq4.m58672J(this.f32596a, this.f32603c);
            if (this.f32596a.mo45369c(this.f32597a)) {
                try {
                    mo41144Q0();
                    mo41143P0();
                    this.f32607d = true;
                    return;
                } catch (IOException e) {
                    k23 g = k23.f31087a.mo39034g();
                    g.mo39026m("DiskLruCache " + this.f32606d + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    mo41150Z();
                    this.f32608e = false;
                } catch (Throwable th) {
                    this.f32608e = false;
                    throw th;
                }
            }
            mo41146S0();
            this.f32607d = true;
        }
    }

    /* renamed from: N0 */
    public final boolean mo41141N0() {
        int i = this.f32611n;
        return i >= 2000 && i >= this.f32598a.size();
    }

    /* renamed from: O0 */
    public final C6785so mo41142O0() throws FileNotFoundException {
        return gu2.m49834c(new f01(this.f32596a.mo45367a(this.f32597a), new C6199d(this)));
    }

    /* renamed from: P0 */
    public final void mo41143P0() throws IOException {
        this.f32596a.mo45368b(this.f32600b);
        Iterator<C6196b> it = this.f32598a.values().iterator();
        while (it.hasNext()) {
            C6196b next = it.next();
            jt1.m53776o(next, "i.next()");
            C6196b bVar = next;
            int i = 0;
            if (bVar.mo41178b() == null) {
                int i2 = this.f32613p;
                while (i < i2) {
                    this.f32602c += bVar.mo41181e()[i];
                    i++;
                }
            } else {
                bVar.mo41188l((C6194a) null);
                int i3 = this.f32613p;
                while (i < i3) {
                    this.f32596a.mo45368b(bVar.mo41177a().get(i));
                    this.f32596a.mo45368b(bVar.mo41179c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f32611n = r7 - r9.f32598a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo31685f2() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        mo41146S0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.f32595a = mo41142O0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = com.onedelhi.secure.un4.f36206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41144Q0() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.onedelhi.secure.u21 r1 = r9.f32596a
            java.io.File r2 = r9.f32597a
            com.onedelhi.secure.x04 r1 = r1.mo45374h(r2)
            com.onedelhi.secure.to r1 = com.onedelhi.secure.gu2.m49835d(r1)
            java.lang.String r2 = r1.mo31699r2()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo31699r2()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo31699r2()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo31699r2()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo31699r2()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = f32587e     // Catch:{ all -> 0x00b2 }
            boolean r7 = com.onedelhi.secure.jt1.m53768g(r7, r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = f32588f     // Catch:{ all -> 0x00b2 }
            boolean r7 = com.onedelhi.secure.jt1.m53768g(r7, r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.f32612o     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = com.onedelhi.secure.jt1.m53768g(r7, r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.f32613p     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = com.onedelhi.secure.jt1.m53768g(r4, r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.mo31699r2()     // Catch:{ EOFException -> 0x0064 }
            r9.mo41145R0(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r0 = r9.f32598a     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.f32611n = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo31685f2()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.mo41146S0()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            com.onedelhi.secure.so r0 = r9.mo41142O0()     // Catch:{ all -> 0x00b2 }
            r9.f32595a = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            com.onedelhi.secure.C5630hz.m51313a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41144Q0():void");
    }

    /* renamed from: R0 */
    public final void mo41145R0(String str) throws IOException {
        String str2;
        String str3 = str;
        int q3 = u54.m66666q3(str, ' ', 0, false, 6, (Object) null);
        if (q3 != -1) {
            int i = q3 + 1;
            int q32 = u54.m66666q3(str, ' ', i, false, 4, (Object) null);
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            if (q32 == -1) {
                str2 = str3.substring(i);
                jt1.m53776o(str2, "(this as java.lang.String).substring(startIndex)");
                String str4 = f32591i;
                if (q3 == str4.length() && t54.m65466u2(str3, str4, false, 2, (Object) null)) {
                    this.f32598a.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i, q32);
                jt1.m53776o(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            C6196b bVar = this.f32598a.get(str2);
            if (bVar == null) {
                bVar = new C6196b(this, str2);
                this.f32598a.put(str2, bVar);
            }
            if (q32 != -1) {
                String str5 = f32589g;
                if (q3 == str5.length() && t54.m65466u2(str3, str5, false, 2, (Object) null)) {
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                    String substring = str3.substring(q32 + 1);
                    jt1.m53776o(substring, "(this as java.lang.String).substring(startIndex)");
                    List S4 = u54.m66592S4(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    bVar.mo41191o(true);
                    bVar.mo41188l((C6194a) null);
                    bVar.mo41189m(S4);
                    return;
                }
            }
            if (q32 == -1) {
                String str6 = f32590h;
                if (q3 == str6.length() && t54.m65466u2(str3, str6, false, 2, (Object) null)) {
                    bVar.mo41188l(new C6194a(this, bVar));
                    return;
                }
            }
            if (q32 == -1) {
                String str7 = f32592j;
                if (q3 == str7.length() && t54.m65466u2(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        throw r2;
     */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41146S0() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.onedelhi.secure.so r0 = r7.f32595a     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c2 }
        L_0x0008:
            com.onedelhi.secure.u21 r0 = r7.f32596a     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.f32600b     // Catch:{ all -> 0x00c2 }
            com.onedelhi.secure.oz3 r0 = r0.mo45371e(r1)     // Catch:{ all -> 0x00c2 }
            com.onedelhi.secure.so r0 = com.onedelhi.secure.gu2.m49834c(r0)     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r2 = f32587e     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r2 = r0.mo41279n(r2)     // Catch:{ all -> 0x00bb }
            r3 = 10
            r2.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = f32588f     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r2 = r0.mo41279n(r2)     // Catch:{ all -> 0x00bb }
            r2.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            int r2 = r7.f32612o     // Catch:{ all -> 0x00bb }
            long r4 = (long) r2     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r2 = r0.mo41242S1(r4)     // Catch:{ all -> 0x00bb }
            r2.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            int r2 = r7.f32613p     // Catch:{ all -> 0x00bb }
            long r4 = (long) r2     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r2 = r0.mo41242S1(r4)     // Catch:{ all -> 0x00bb }
            r2.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            r0.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r2 = r7.f32598a     // Catch:{ all -> 0x00bb }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bb }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.nm0$b r4 = (com.onedelhi.secure.nm0.C6196b) r4     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.nm0$a r5 = r4.mo41178b()     // Catch:{ all -> 0x00bb }
            r6 = 32
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = f32590h     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r5 = r0.mo41279n(r5)     // Catch:{ all -> 0x00bb }
            r5.mo41230L0(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r4.mo41180d()     // Catch:{ all -> 0x00bb }
            r0.mo41279n(r4)     // Catch:{ all -> 0x00bb }
        L_0x006e:
            r0.mo41230L0(r3)     // Catch:{ all -> 0x00bb }
            goto L_0x004a
        L_0x0072:
            java.lang.String r5 = f32589g     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.so r5 = r0.mo41279n(r5)     // Catch:{ all -> 0x00bb }
            r5.mo41230L0(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r4.mo41180d()     // Catch:{ all -> 0x00bb }
            r0.mo41279n(r5)     // Catch:{ all -> 0x00bb }
            r4.mo41195s(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x006e
        L_0x0086:
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00bb }
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)     // Catch:{ all -> 0x00c2 }
            com.onedelhi.secure.u21 r0 = r7.f32596a     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.f32597a     // Catch:{ all -> 0x00c2 }
            boolean r0 = r0.mo45369c(r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x009e
            com.onedelhi.secure.u21 r0 = r7.f32596a     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.f32597a     // Catch:{ all -> 0x00c2 }
            java.io.File r2 = r7.f32603c     // Catch:{ all -> 0x00c2 }
            r0.mo45372f(r1, r2)     // Catch:{ all -> 0x00c2 }
        L_0x009e:
            com.onedelhi.secure.u21 r0 = r7.f32596a     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.f32600b     // Catch:{ all -> 0x00c2 }
            java.io.File r2 = r7.f32597a     // Catch:{ all -> 0x00c2 }
            r0.mo45372f(r1, r2)     // Catch:{ all -> 0x00c2 }
            com.onedelhi.secure.u21 r0 = r7.f32596a     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.f32603c     // Catch:{ all -> 0x00c2 }
            r0.mo45368b(r1)     // Catch:{ all -> 0x00c2 }
            com.onedelhi.secure.so r0 = r7.mo41142O0()     // Catch:{ all -> 0x00c2 }
            r7.f32595a = r0     // Catch:{ all -> 0x00c2 }
            r0 = 0
            r7.f32601b = r0     // Catch:{ all -> 0x00c2 }
            r7.f32610g = r0     // Catch:{ all -> 0x00c2 }
            monitor-exit(r7)
            return
        L_0x00bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)     // Catch:{ all -> 0x00c2 }
            throw r2     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41146S0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r7;
     */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41147V0(@com.onedelhi.secure.vr2 java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            com.onedelhi.secure.jt1.m53777p(r7, r0)     // Catch:{ all -> 0x0033 }
            r6.mo41140M0()     // Catch:{ all -> 0x0033 }
            r6.mo41148X()     // Catch:{ all -> 0x0033 }
            r6.mo41166p1(r7)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r0 = r6.f32598a     // Catch:{ all -> 0x0033 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0033 }
            com.onedelhi.secure.nm0$b r7 = (com.onedelhi.secure.nm0.C6196b) r7     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r7 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            com.onedelhi.secure.jt1.m53776o(r7, r1)     // Catch:{ all -> 0x0033 }
            boolean r7 = r6.mo41151b1(r7)     // Catch:{ all -> 0x0033 }
            if (r7 == 0) goto L_0x002f
            long r1 = r6.f32602c     // Catch:{ all -> 0x0033 }
            long r3 = r6.f32599b     // Catch:{ all -> 0x0033 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            r6.f32609f = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r6)
            return r7
        L_0x0031:
            monitor-exit(r6)
            return r0
        L_0x0033:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41147V0(java.lang.String):boolean");
    }

    /* renamed from: X */
    public final synchronized void mo41148X() {
        if (!(!this.f32608e)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        return;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41149Y(@com.onedelhi.secure.vr2 com.onedelhi.secure.nm0.C6194a r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            com.onedelhi.secure.jt1.m53777p(r9, r0)     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.nm0$b r0 = r9.mo41172d()     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.nm0$a r1 = r0.mo41178b()     // Catch:{ all -> 0x0142 }
            boolean r1 = com.onedelhi.secure.jt1.m53768g(r1, r9)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0136
            r1 = 0
            if (r10 == 0) goto L_0x0061
            boolean r2 = r0.mo41183g()     // Catch:{ all -> 0x0142 }
            if (r2 != 0) goto L_0x0061
            int r2 = r8.f32613p     // Catch:{ all -> 0x0142 }
            r3 = 0
        L_0x0020:
            if (r3 >= r2) goto L_0x0061
            boolean[] r4 = r9.mo41173e()     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.jt1.m53774m(r4)     // Catch:{ all -> 0x0142 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0047
            com.onedelhi.secure.u21 r4 = r8.f32596a     // Catch:{ all -> 0x0142 }
            java.util.List r5 = r0.mo41179c()     // Catch:{ all -> 0x0142 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0142 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0142 }
            boolean r4 = r4.mo45369c(r5)     // Catch:{ all -> 0x0142 }
            if (r4 != 0) goto L_0x0044
            r9.mo41169a()     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0047:
            r9.mo41169a()     // Catch:{ all -> 0x0142 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0142 }
            r10.append(r3)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0142 }
            r9.<init>(r10)     // Catch:{ all -> 0x0142 }
            throw r9     // Catch:{ all -> 0x0142 }
        L_0x0061:
            int r9 = r8.f32613p     // Catch:{ all -> 0x0142 }
        L_0x0063:
            if (r1 >= r9) goto L_0x00af
            java.util.List r2 = r0.mo41179c()     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00a7
            boolean r3 = r0.mo41185i()     // Catch:{ all -> 0x0142 }
            if (r3 != 0) goto L_0x00a7
            com.onedelhi.secure.u21 r3 = r8.f32596a     // Catch:{ all -> 0x0142 }
            boolean r3 = r3.mo45369c(r2)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x00ac
            java.util.List r3 = r0.mo41177a()     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.u21 r4 = r8.f32596a     // Catch:{ all -> 0x0142 }
            r4.mo45372f(r2, r3)     // Catch:{ all -> 0x0142 }
            long[] r2 = r0.mo41181e()     // Catch:{ all -> 0x0142 }
            r4 = r2[r1]     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.u21 r2 = r8.f32596a     // Catch:{ all -> 0x0142 }
            long r2 = r2.mo45373g(r3)     // Catch:{ all -> 0x0142 }
            long[] r6 = r0.mo41181e()     // Catch:{ all -> 0x0142 }
            r6[r1] = r2     // Catch:{ all -> 0x0142 }
            long r6 = r8.f32602c     // Catch:{ all -> 0x0142 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f32602c = r6     // Catch:{ all -> 0x0142 }
            goto L_0x00ac
        L_0x00a7:
            com.onedelhi.secure.u21 r3 = r8.f32596a     // Catch:{ all -> 0x0142 }
            r3.mo45368b(r2)     // Catch:{ all -> 0x0142 }
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00af:
            r9 = 0
            r0.mo41188l(r9)     // Catch:{ all -> 0x0142 }
            boolean r9 = r0.mo41185i()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x00be
            r8.mo41151b1(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x00be:
            int r9 = r8.f32611n     // Catch:{ all -> 0x0142 }
            r1 = 1
            int r9 = r9 + r1
            r8.f32611n = r9     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.so r9 = r8.f32595a     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.jt1.m53774m(r9)     // Catch:{ all -> 0x0142 }
            boolean r2 = r0.mo41183g()     // Catch:{ all -> 0x0142 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00d6
            goto L_0x00f3
        L_0x00d6:
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r10 = r8.f32598a     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.mo41180d()     // Catch:{ all -> 0x0142 }
            r10.remove(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = f32591i     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.so r10 = r9.mo41279n(r10)     // Catch:{ all -> 0x0142 }
            r10.mo41230L0(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r0.mo41180d()     // Catch:{ all -> 0x0142 }
            r9.mo41279n(r10)     // Catch:{ all -> 0x0142 }
            r9.mo41230L0(r3)     // Catch:{ all -> 0x0142 }
            goto L_0x0118
        L_0x00f3:
            r0.mo41191o(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = f32589g     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.so r1 = r9.mo41279n(r1)     // Catch:{ all -> 0x0142 }
            r1.mo41230L0(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.mo41180d()     // Catch:{ all -> 0x0142 }
            r9.mo41279n(r1)     // Catch:{ all -> 0x0142 }
            r0.mo41195s(r9)     // Catch:{ all -> 0x0142 }
            r9.mo41230L0(r3)     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x0118
            long r1 = r8.f32605d     // Catch:{ all -> 0x0142 }
            r3 = 1
            long r3 = r3 + r1
            r8.f32605d = r3     // Catch:{ all -> 0x0142 }
            r0.mo41192p(r1)     // Catch:{ all -> 0x0142 }
        L_0x0118:
            r9.flush()     // Catch:{ all -> 0x0142 }
            long r9 = r8.f32602c     // Catch:{ all -> 0x0142 }
            long r0 = r8.f32599b     // Catch:{ all -> 0x0142 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0129
            boolean r9 = r8.mo41141N0()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x0134
        L_0x0129:
            com.onedelhi.secure.ea4 r0 = r8.f32593a     // Catch:{ all -> 0x0142 }
            com.onedelhi.secure.nm0$c r1 = r8.f32594a     // Catch:{ all -> 0x0142 }
            r2 = 0
            r4 = 2
            r5 = 0
            com.onedelhi.secure.ea4.m46227o(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0142 }
        L_0x0134:
            monitor-exit(r8)
            return
        L_0x0136:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0142 }
            r10.<init>(r9)     // Catch:{ all -> 0x0142 }
            throw r10     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41149Y(com.onedelhi.secure.nm0$a, boolean):void");
    }

    /* renamed from: Z */
    public final void mo41150Z() throws IOException {
        close();
        this.f32596a.mo45370d(this.f32606d);
    }

    /* renamed from: b1 */
    public final boolean mo41151b1(@vr2 C6196b bVar) throws IOException {
        C6785so soVar;
        jt1.m53777p(bVar, wh0.f36995a);
        if (!this.f32604c) {
            if (bVar.mo41182f() > 0 && (soVar = this.f32595a) != null) {
                soVar.mo41279n(f32590h);
                soVar.mo41230L0(32);
                soVar.mo41279n(bVar.mo41180d());
                soVar.mo41230L0(10);
                soVar.flush();
            }
            if (bVar.mo41182f() > 0 || bVar.mo41178b() != null) {
                bVar.mo41193q(true);
                return true;
            }
        }
        C6194a b = bVar.mo41178b();
        if (b != null) {
            b.mo41171c();
        }
        int i = this.f32613p;
        for (int i2 = 0; i2 < i; i2++) {
            this.f32596a.mo45368b(bVar.mo41177a().get(i2));
            this.f32602c -= bVar.mo41181e()[i2];
            bVar.mo41181e()[i2] = 0;
        }
        this.f32611n++;
        C6785so soVar2 = this.f32595a;
        if (soVar2 != null) {
            soVar2.mo41279n(f32591i);
            soVar2.mo41230L0(32);
            soVar2.mo41279n(bVar.mo41180d());
            soVar2.mo41230L0(10);
        }
        this.f32598a.remove(bVar.mo41180d());
        if (mo41141N0()) {
            ea4.m46227o(this.f32593a, this.f32594a, 0, 2, (Object) null);
        }
        return true;
    }

    @vw1
    @ss2
    /* renamed from: c0 */
    public final C6194a mo41152c0(@vr2 String str) throws IOException {
        return m58231j0(this, str, 0, 2, (Object) null);
    }

    /* renamed from: c1 */
    public final boolean mo41153c1() {
        for (C6196b next : this.f32598a.values()) {
            if (!next.mo41185i()) {
                jt1.m53776o(next, "toEvict");
                mo41151b1(next);
                return true;
            }
        }
        return false;
    }

    public synchronized void close() throws IOException {
        C6194a b;
        if (this.f32607d) {
            if (!this.f32608e) {
                Collection<C6196b> values = this.f32598a.values();
                jt1.m53776o(values, "lruEntries.values");
                Object[] array = values.toArray(new C6196b[0]);
                if (array != null) {
                    for (C6196b bVar : (C6196b[]) array) {
                        if (!(bVar.mo41178b() == null || (b = bVar.mo41178b()) == null)) {
                            b.mo41171c();
                        }
                    }
                    mo41163l1();
                    C6785so soVar = this.f32595a;
                    jt1.m53774m(soVar);
                    soVar.close();
                    this.f32595a = null;
                    this.f32608e = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.f32608e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    @com.onedelhi.secure.vw1
    @com.onedelhi.secure.ss2
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.onedelhi.secure.nm0.C6194a mo41155e0(@com.onedelhi.secure.vr2 java.lang.String r11, long r12) throws java.io.IOException {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "key"
            com.onedelhi.secure.jt1.m53777p(r11, r0)     // Catch:{ all -> 0x008f }
            r10.mo41140M0()     // Catch:{ all -> 0x008f }
            r10.mo41148X()     // Catch:{ all -> 0x008f }
            r10.mo41166p1(r11)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r0 = r10.f32598a     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.nm0$b r0 = (com.onedelhi.secure.nm0.C6196b) r0     // Catch:{ all -> 0x008f }
            long r1 = f32586e     // Catch:{ all -> 0x008f }
            r3 = 0
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r1 = r0.mo41184h()     // Catch:{ all -> 0x008f }
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r10)
            return r3
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            com.onedelhi.secure.nm0$a r12 = r0.mo41178b()     // Catch:{ all -> 0x008f }
            goto L_0x0032
        L_0x0031:
            r12 = r3
        L_0x0032:
            if (r12 == 0) goto L_0x0036
            monitor-exit(r10)
            return r3
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r12 = r0.mo41182f()     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x0040
            monitor-exit(r10)
            return r3
        L_0x0040:
            boolean r12 = r10.f32609f     // Catch:{ all -> 0x008f }
            if (r12 != 0) goto L_0x0082
            boolean r12 = r10.f32610g     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x0049
            goto L_0x0082
        L_0x0049:
            com.onedelhi.secure.so r12 = r10.f32595a     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.jt1.m53774m(r12)     // Catch:{ all -> 0x008f }
            java.lang.String r13 = f32590h     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.so r13 = r12.mo41279n(r13)     // Catch:{ all -> 0x008f }
            r1 = 32
            com.onedelhi.secure.so r13 = r13.mo41230L0(r1)     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.so r13 = r13.mo41279n(r11)     // Catch:{ all -> 0x008f }
            r1 = 10
            r13.mo41230L0(r1)     // Catch:{ all -> 0x008f }
            r12.flush()     // Catch:{ all -> 0x008f }
            boolean r12 = r10.f32601b     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x006c
            monitor-exit(r10)
            return r3
        L_0x006c:
            if (r0 != 0) goto L_0x0078
            com.onedelhi.secure.nm0$b r0 = new com.onedelhi.secure.nm0$b     // Catch:{ all -> 0x008f }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r12 = r10.f32598a     // Catch:{ all -> 0x008f }
            r12.put(r11, r0)     // Catch:{ all -> 0x008f }
        L_0x0078:
            com.onedelhi.secure.nm0$a r11 = new com.onedelhi.secure.nm0$a     // Catch:{ all -> 0x008f }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x008f }
            r0.mo41188l(r11)     // Catch:{ all -> 0x008f }
            monitor-exit(r10)
            return r11
        L_0x0082:
            com.onedelhi.secure.ea4 r4 = r10.f32593a     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.nm0$c r5 = r10.f32594a     // Catch:{ all -> 0x008f }
            r6 = 0
            r8 = 2
            r9 = 0
            com.onedelhi.secure.ea4.m46227o(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x008f }
            monitor-exit(r10)
            return r3
        L_0x008f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41155e0(java.lang.String, long):com.onedelhi.secure.nm0$a");
    }

    /* renamed from: f1 */
    public final void mo41156f1(boolean z) {
        this.f32608e = z;
    }

    public synchronized void flush() throws IOException {
        if (this.f32607d) {
            mo41148X();
            mo41163l1();
            C6785so soVar = this.f32595a;
            jt1.m53774m(soVar);
            soVar.flush();
        }
    }

    /* renamed from: h1 */
    public final synchronized void mo41158h1(long j) {
        this.f32599b = j;
        if (this.f32607d) {
            ea4.m46227o(this.f32593a, this.f32594a, 0, 2, (Object) null);
        }
    }

    /* renamed from: i1 */
    public final synchronized long mo41159i1() throws IOException {
        mo41140M0();
        return this.f32602c;
    }

    public final synchronized boolean isClosed() {
        return this.f32608e;
    }

    @vr2
    /* renamed from: j1 */
    public final synchronized Iterator<C6202g> mo41161j1() throws IOException {
        mo41140M0();
        return new C6200e(this);
    }

    /* renamed from: l0 */
    public final synchronized void mo41162l0() throws IOException {
        mo41140M0();
        Collection<C6196b> values = this.f32598a.values();
        jt1.m53776o(values, "lruEntries.values");
        Object[] array = values.toArray(new C6196b[0]);
        if (array != null) {
            for (C6196b bVar : (C6196b[]) array) {
                jt1.m53776o(bVar, wh0.f36995a);
                mo41151b1(bVar);
            }
            this.f32609f = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: l1 */
    public final void mo41163l1() throws IOException {
        while (this.f32602c > this.f32599b) {
            if (!mo41153c1()) {
                return;
            }
        }
        this.f32609f = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        return r0;
     */
    @com.onedelhi.secure.ss2
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.onedelhi.secure.nm0.C6202g mo41164o0(@com.onedelhi.secure.vr2 java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            com.onedelhi.secure.jt1.m53777p(r8, r0)     // Catch:{ all -> 0x005c }
            r7.mo41140M0()     // Catch:{ all -> 0x005c }
            r7.mo41148X()     // Catch:{ all -> 0x005c }
            r7.mo41166p1(r8)     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.nm0$b> r0 = r7.f32598a     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.nm0$b r0 = (com.onedelhi.secure.nm0.C6196b) r0     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = "lruEntries[key] ?: return null"
            com.onedelhi.secure.jt1.m53776o(r0, r2)     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.nm0$g r0 = r0.mo41194r()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            int r1 = r7.f32611n     // Catch:{ all -> 0x005c }
            int r1 = r1 + 1
            r7.f32611n = r1     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.so r1 = r7.f32595a     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.jt1.m53774m(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = f32592j     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.so r1 = r1.mo41279n(r2)     // Catch:{ all -> 0x005c }
            r2 = 32
            com.onedelhi.secure.so r1 = r1.mo41230L0(r2)     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.so r8 = r1.mo41279n(r8)     // Catch:{ all -> 0x005c }
            r1 = 10
            r8.mo41230L0(r1)     // Catch:{ all -> 0x005c }
            boolean r8 = r7.mo41141N0()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0056
            com.onedelhi.secure.ea4 r1 = r7.f32593a     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.nm0$c r2 = r7.f32594a     // Catch:{ all -> 0x005c }
            r3 = 0
            r5 = 2
            r6 = 0
            com.onedelhi.secure.ea4.m46227o(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x005c }
        L_0x0056:
            monitor-exit(r7)
            return r0
        L_0x0058:
            monitor-exit(r7)
            return r1
        L_0x005a:
            monitor-exit(r7)
            return r1
        L_0x005c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nm0.mo41164o0(java.lang.String):com.onedelhi.secure.nm0$g");
    }

    /* renamed from: p0 */
    public final boolean mo41165p0() {
        return this.f32608e;
    }

    /* renamed from: p1 */
    public final void mo41166p1(String str) {
        if (!f32581a.mo35379k(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + tk4.f35693a).toString());
        }
    }

    @vr2
    /* renamed from: q0 */
    public final File mo41167q0() {
        return this.f32606d;
    }

    @vr2
    /* renamed from: u0 */
    public final u21 mo41168u0() {
        return this.f32596a;
    }
}
