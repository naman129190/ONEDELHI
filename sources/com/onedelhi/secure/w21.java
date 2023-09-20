package com.onedelhi.secure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u0001\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00128\u0010\u001a\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005J \u0010\r\u001a\u00020\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\""}, d2 = {"Lcom/onedelhi/secure/w21;", "Lcom/onedelhi/secure/zt3;", "Ljava/io/File;", "", "iterator", "Lkotlin/Function1;", "", "function", "j", "Lcom/onedelhi/secure/un4;", "l", "Lkotlin/Function2;", "Ljava/io/IOException;", "k", "", "depth", "i", "start", "Lcom/onedelhi/secure/y21;", "direction", "onEnter", "onLeave", "Lcom/onedelhi/secure/iy2;", "name", "f", "e", "onFail", "maxDepth", "<init>", "(Ljava/io/File;Lcom/onedelhi/secure/y21;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/sc1;I)V", "(Ljava/io/File;Lcom/onedelhi/secure/y21;)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class w21 implements zt3<File> {

    /* renamed from: a */
    public final int f36837a;
    @ss2

    /* renamed from: a */
    public final ec1<File, Boolean> f36838a;
    @ss2

    /* renamed from: a */
    public final sc1<File, IOException, un4> f36839a;
    @vr2

    /* renamed from: a */
    public final y21 f36840a;
    @vr2

    /* renamed from: a */
    public final File f36841a;
    @ss2

    /* renamed from: b */
    public final ec1<File, un4> f36842b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/w21$a;", "Lcom/onedelhi/secure/w21$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.w21$a */
    public static abstract class C7119a extends C7125c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7119a(@vr2 File file) {
            super(file);
            jt1.m53777p(file, "rootDir");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0010¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/w21$b;", "Lcom/onedelhi/secure/s0;", "Ljava/io/File;", "Lcom/onedelhi/secure/un4;", "a", "root", "Lcom/onedelhi/secure/w21$a;", "h", "i", "<init>", "(Lcom/onedelhi/secure/w21;)V", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.w21$b */
    public final class C7120b extends C6725s0<File> {
        @vr2

        /* renamed from: a */
        public final ArrayDeque<C7125c> f36844a;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/w21$b$a;", "Lcom/onedelhi/secure/w21$a;", "Ljava/io/File;", "b", "rootDir", "<init>", "(Lcom/onedelhi/secure/w21$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.w21$b$a */
        public final class C7121a extends C7119a {

            /* renamed from: a */
            public int f36845a;

            /* renamed from: a */
            public final /* synthetic */ C7120b f36846a;

            /* renamed from: a */
            public boolean f36847a;
            @ss2

            /* renamed from: a */
            public File[] f36848a;

            /* renamed from: b */
            public boolean f36849b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7121a(@vr2 C7120b bVar, File file) {
                super(file);
                jt1.m53777p(file, "rootDir");
                this.f36846a = bVar;
            }

            @ss2
            /* renamed from: b */
            public File mo46503b() {
                if (!this.f36849b && this.f36848a == null) {
                    ec1 e = w21.this.f36838a;
                    boolean z = false;
                    if (e != null && !((Boolean) e.mo17094X(mo46504a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = mo46504a().listFiles();
                    this.f36848a = listFiles;
                    if (listFiles == null) {
                        sc1 f = w21.this.f36839a;
                        if (f != null) {
                            f.mo21054h0(mo46504a(), new C7001v1(mo46504a(), (File) null, "Cannot list files in a directory", 2, (wg0) null));
                        }
                        this.f36849b = true;
                    }
                }
                File[] fileArr = this.f36848a;
                if (fileArr != null) {
                    int i = this.f36845a;
                    jt1.m53774m(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f36848a;
                        jt1.m53774m(fileArr2);
                        int i2 = this.f36845a;
                        this.f36845a = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f36847a) {
                    this.f36847a = true;
                    return mo46504a();
                }
                ec1 g = w21.this.f36842b;
                if (g != null) {
                    g.mo17094X(mo46504a());
                }
                return null;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/w21$b$b;", "Lcom/onedelhi/secure/w21$c;", "Ljava/io/File;", "b", "rootFile", "<init>", "(Lcom/onedelhi/secure/w21$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.w21$b$b */
        public final class C7122b extends C7125c {

            /* renamed from: a */
            public final /* synthetic */ C7120b f36850a;

            /* renamed from: a */
            public boolean f36851a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7122b(@vr2 C7120b bVar, File file) {
                super(file);
                jt1.m53777p(file, "rootFile");
                this.f36850a = bVar;
            }

            @ss2
            /* renamed from: b */
            public File mo46503b() {
                if (this.f36851a) {
                    return null;
                }
                this.f36851a = true;
                return mo46504a();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/w21$b$c;", "Lcom/onedelhi/secure/w21$a;", "Ljava/io/File;", "b", "rootDir", "<init>", "(Lcom/onedelhi/secure/w21$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.w21$b$c */
        public final class C7123c extends C7119a {

            /* renamed from: a */
            public int f36852a;

            /* renamed from: a */
            public final /* synthetic */ C7120b f36853a;

            /* renamed from: a */
            public boolean f36854a;
            @ss2

            /* renamed from: a */
            public File[] f36855a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7123c(@vr2 C7120b bVar, File file) {
                super(file);
                jt1.m53777p(file, "rootDir");
                this.f36853a = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            @com.onedelhi.secure.ss2
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo46503b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f36854a
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    com.onedelhi.secure.w21$b r0 = r10.f36853a
                    com.onedelhi.secure.w21 r0 = com.onedelhi.secure.w21.this
                    com.onedelhi.secure.ec1 r0 = r0.f36838a
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.mo46504a()
                    java.lang.Object r0 = r0.mo17094X(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = 1
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f36854a = r3
                    java.io.File r0 = r10.mo46504a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f36855a
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f36852a
                    com.onedelhi.secure.jt1.m53774m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    com.onedelhi.secure.w21$b r0 = r10.f36853a
                    com.onedelhi.secure.w21 r0 = com.onedelhi.secure.w21.this
                    com.onedelhi.secure.ec1 r0 = r0.f36842b
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.mo46504a()
                    r0.mo17094X(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f36855a
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.mo46504a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f36855a = r0
                    if (r0 != 0) goto L_0x007b
                    com.onedelhi.secure.w21$b r0 = r10.f36853a
                    com.onedelhi.secure.w21 r0 = com.onedelhi.secure.w21.this
                    com.onedelhi.secure.sc1 r0 = r0.f36839a
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.mo46504a()
                    com.onedelhi.secure.v1 r9 = new com.onedelhi.secure.v1
                    java.io.File r4 = r10.mo46504a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.mo21054h0(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f36855a
                    if (r0 == 0) goto L_0x0085
                    com.onedelhi.secure.jt1.m53774m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    com.onedelhi.secure.w21$b r0 = r10.f36853a
                    com.onedelhi.secure.w21 r0 = com.onedelhi.secure.w21.this
                    com.onedelhi.secure.ec1 r0 = r0.f36842b
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.mo46504a()
                    r0.mo17094X(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f36855a
                    com.onedelhi.secure.jt1.m53774m(r0)
                    int r1 = r10.f36852a
                    int r2 = r1 + 1
                    r10.f36852a = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w21.C7120b.C7123c.mo46503b():java.io.File");
            }
        }

        @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.w21$b$d */
        public /* synthetic */ class C7124d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f36856a;

            static {
                int[] iArr = new int[y21.values().length];
                iArr[y21.TOP_DOWN.ordinal()] = 1;
                iArr[y21.BOTTOM_UP.ordinal()] = 2;
                f36856a = iArr;
            }
        }

        public C7120b() {
            ArrayDeque<C7125c> arrayDeque = new ArrayDeque<>();
            this.f36844a = arrayDeque;
            if (w21.this.f36841a.isDirectory()) {
                arrayDeque.push(mo46501h(w21.this.f36841a));
            } else if (w21.this.f36841a.isFile()) {
                arrayDeque.push(new C7122b(this, w21.this.f36841a));
            } else {
                mo44120b();
            }
        }

        /* renamed from: a */
        public void mo38786a() {
            File i = mo46502i();
            if (i != null) {
                mo44121d(i);
            } else {
                mo44120b();
            }
        }

        /* renamed from: h */
        public final C7119a mo46501h(File file) {
            int i = C7124d.f36856a[w21.this.f36840a.ordinal()];
            if (i == 1) {
                return new C7123c(this, file);
            }
            if (i == 2) {
                return new C7121a(this, file);
            }
            throw new gr2();
        }

        /* renamed from: i */
        public final File mo46502i() {
            File b;
            while (true) {
                C7125c peek = this.f36844a.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.mo46503b();
                if (b == null) {
                    this.f36844a.pop();
                } else if (jt1.m53768g(b, peek.mo46504a()) || !b.isDirectory() || this.f36844a.size() >= w21.this.f36837a) {
                    return b;
                } else {
                    this.f36844a.push(mo46501h(b));
                }
            }
            return b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/w21$c;", "", "Ljava/io/File;", "b", "root", "Ljava/io/File;", "a", "()Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.w21$c */
    public static abstract class C7125c {
        @vr2

        /* renamed from: a */
        public final File f36857a;

        public C7125c(@vr2 File file) {
            jt1.m53777p(file, "root");
            this.f36857a = file;
        }

        @vr2
        /* renamed from: a */
        public final File mo46504a() {
            return this.f36857a;
        }

        @ss2
        /* renamed from: b */
        public abstract File mo46503b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w21(@vr2 File file, @vr2 y21 y21) {
        this(file, y21, (ec1) null, (ec1) null, (sc1) null, 0, 32, (wg0) null);
        jt1.m53777p(file, "start");
        jt1.m53777p(y21, "direction");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w21(File file, y21 y21, int i, wg0 wg0) {
        this(file, (i & 2) != 0 ? y21.TOP_DOWN : y21);
    }

    public w21(File file, y21 y21, ec1<? super File, Boolean> ec1, ec1<? super File, un4> ec12, sc1<? super File, ? super IOException, un4> sc1, int i) {
        this.f36841a = file;
        this.f36840a = y21;
        this.f36838a = ec1;
        this.f36842b = ec12;
        this.f36839a = sc1;
        this.f36837a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w21(File file, y21 y21, ec1 ec1, ec1 ec12, sc1 sc1, int i, int i2, wg0 wg0) {
        this(file, (i2 & 2) != 0 ? y21.TOP_DOWN : y21, ec1, ec12, sc1, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @vr2
    /* renamed from: i */
    public final w21 mo46497i(int i) {
        if (i > 0) {
            return new w21(this.f36841a, this.f36840a, this.f36838a, this.f36842b, this.f36839a, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @vr2
    public Iterator<File> iterator() {
        return new C7120b();
    }

    @vr2
    /* renamed from: j */
    public final w21 mo46498j(@vr2 ec1<? super File, Boolean> ec1) {
        jt1.m53777p(ec1, "function");
        return new w21(this.f36841a, this.f36840a, ec1, this.f36842b, this.f36839a, this.f36837a);
    }

    @vr2
    /* renamed from: k */
    public final w21 mo46499k(@vr2 sc1<? super File, ? super IOException, un4> sc1) {
        jt1.m53777p(sc1, "function");
        return new w21(this.f36841a, this.f36840a, this.f36838a, this.f36842b, sc1, this.f36837a);
    }

    @vr2
    /* renamed from: l */
    public final w21 mo46500l(@vr2 ec1<? super File, un4> ec1) {
        jt1.m53777p(ec1, "function");
        return new w21(this.f36841a, this.f36840a, this.f36838a, ec1, this.f36839a, this.f36837a);
    }
}
