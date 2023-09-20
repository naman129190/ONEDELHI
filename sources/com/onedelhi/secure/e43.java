package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class e43 extends qe1<e43, C5078b> implements f43 {
    /* access modifiers changed from: private */
    public static final e43 DEFAULT_INSTANCE;
    private static volatile cz2<e43> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private vs1.C7095k<C5079c> violations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.e43$a */
    public static /* synthetic */ class C5077a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27692a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.qe1$i[] r0 = com.onedelhi.secure.qe1.C6554i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27692a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27692a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e43.C5077a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.e43$b */
    public static final class C5078b extends qe1.C6546b<e43, C5078b> implements f43 {
        public C5078b() {
            super(e43.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5078b(C5077a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5078b mo34811Gj(Iterable<? extends C5079c> iterable) {
            mo43393xj();
            ((e43) this.f34068b).mo34803mk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5078b mo34812Hj(int i, C5079c.C5080a aVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34804nk(i, (C5079c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C5078b mo34813Ij(int i, C5079c cVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34804nk(i, cVar);
            return this;
        }

        /* renamed from: Jj */
        public C5078b mo34814Jj(C5079c.C5080a aVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34805ok((C5079c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C5078b mo34815Kj(C5079c cVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34805ok(cVar);
            return this;
        }

        /* renamed from: Lj */
        public C5078b mo34816Lj() {
            mo43393xj();
            ((e43) this.f34068b).mo34806pk();
            return this;
        }

        /* renamed from: Mj */
        public C5078b mo34817Mj(int i) {
            mo43393xj();
            ((e43) this.f34068b).mo34799Jk(i);
            return this;
        }

        /* renamed from: Nj */
        public C5078b mo34818Nj(int i, C5079c.C5080a aVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34800Kk(i, (C5079c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C5078b mo34819Oj(int i, C5079c cVar) {
            mo43393xj();
            ((e43) this.f34068b).mo34800Kk(i, cVar);
            return this;
        }

        /* renamed from: Z0 */
        public List<C5079c> mo34801Z0() {
            return Collections.unmodifiableList(((e43) this.f34068b).mo34801Z0());
        }

        /* renamed from: d5 */
        public C5079c mo34802d5(int i) {
            return ((e43) this.f34068b).mo34802d5(i);
        }

        /* renamed from: z1 */
        public int mo34810z1() {
            return ((e43) this.f34068b).mo34810z1();
        }
    }

    /* renamed from: com.onedelhi.secure.e43$c */
    public static final class C5079c extends qe1<C5079c, C5080a> implements C5081d {
        /* access modifiers changed from: private */
        public static final C5079c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile cz2<C5079c> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String description_ = "";
        private String subject_ = "";
        private String type_ = "";

        /* renamed from: com.onedelhi.secure.e43$c$a */
        public static final class C5080a extends qe1.C6546b<C5079c, C5080a> implements C5081d {
            public C5080a() {
                super(C5079c.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C5080a(C5077a aVar) {
                this();
            }

            /* renamed from: Gj */
            public C5080a mo34835Gj() {
                mo43393xj();
                ((C5079c) this.f34068b).mo34831pk();
                return this;
            }

            /* renamed from: Hj */
            public C5080a mo34836Hj() {
                mo43393xj();
                ((C5079c) this.f34068b).mo34832qk();
                return this;
            }

            /* renamed from: Ij */
            public C5080a mo34837Ij() {
                mo43393xj();
                ((C5079c) this.f34068b).mo34833rk();
                return this;
            }

            /* renamed from: Jj */
            public C5080a mo34838Jj(String str) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34820Ik(str);
                return this;
            }

            /* renamed from: Kj */
            public C5080a mo34839Kj(C5173er erVar) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34821Jk(erVar);
                return this;
            }

            /* renamed from: Lj */
            public C5080a mo34840Lj(String str) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34822Kk(str);
                return this;
            }

            /* renamed from: Mj */
            public C5080a mo34841Mj(C5173er erVar) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34823Lk(erVar);
                return this;
            }

            /* renamed from: Nj */
            public C5080a mo34842Nj(String str) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34824Mk(str);
                return this;
            }

            /* renamed from: Oj */
            public C5080a mo34843Oj(C5173er erVar) {
                mo43393xj();
                ((C5079c) this.f34068b).mo34825Nk(erVar);
                return this;
            }

            /* renamed from: U0 */
            public String mo34826U0() {
                return ((C5079c) this.f34068b).mo34826U0();
            }

            /* renamed from: b */
            public C5173er mo34827b() {
                return ((C5079c) this.f34068b).mo34827b();
            }

            /* renamed from: c */
            public String mo34828c() {
                return ((C5079c) this.f34068b).mo34828c();
            }

            /* renamed from: h */
            public String mo34829h() {
                return ((C5079c) this.f34068b).mo34829h();
            }

            /* renamed from: m */
            public C5173er mo34830m() {
                return ((C5079c) this.f34068b).mo34830m();
            }

            /* renamed from: y0 */
            public C5173er mo34834y0() {
                return ((C5079c) this.f34068b).mo34834y0();
            }
        }

        static {
            C5079c cVar = new C5079c();
            DEFAULT_INSTANCE = cVar;
            qe1.m62492dk(C5079c.class, cVar);
        }

        /* renamed from: Ak */
        public static C5079c m45961Ak(g00 g00, zy0 zy0) throws IOException {
            return (C5079c) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Bk */
        public static C5079c m45962Bk(InputStream inputStream) throws IOException {
            return (C5079c) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Ck */
        public static C5079c m45963Ck(InputStream inputStream, zy0 zy0) throws IOException {
            return (C5079c) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Dk */
        public static C5079c m45964Dk(ByteBuffer byteBuffer) throws nt1 {
            return (C5079c) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Ek */
        public static C5079c m45965Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C5079c) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Fk */
        public static C5079c m45966Fk(byte[] bArr) throws nt1 {
            return (C5079c) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Gk */
        public static C5079c m45967Gk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C5079c) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Hk */
        public static cz2<C5079c> m45968Hk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: sk */
        public static C5079c m45979sk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: tk */
        public static C5080a m45980tk() {
            return (C5080a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: uk */
        public static C5080a m45981uk(C5079c cVar) {
            return (C5080a) DEFAULT_INSTANCE.mo43358gj(cVar);
        }

        /* renamed from: vk */
        public static C5079c m45982vk(InputStream inputStream) throws IOException {
            return (C5079c) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: wk */
        public static C5079c m45983wk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C5079c) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: xk */
        public static C5079c m45984xk(C5173er erVar) throws nt1 {
            return (C5079c) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: yk */
        public static C5079c m45985yk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C5079c) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: zk */
        public static C5079c m45986zk(g00 g00) throws IOException {
            return (C5079c) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ik */
        public final void mo34820Ik(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* renamed from: Jk */
        public final void mo34821Jk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.description_ = erVar.mo35543k0();
        }

        /* renamed from: Kk */
        public final void mo34822Kk(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* renamed from: Lk */
        public final void mo34823Lk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.subject_ = erVar.mo35543k0();
        }

        /* renamed from: Mk */
        public final void mo34824Mk(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* renamed from: Nk */
        public final void mo34825Nk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.type_ = erVar.mo35543k0();
        }

        /* renamed from: U0 */
        public String mo34826U0() {
            return this.subject_;
        }

        /* renamed from: b */
        public C5173er mo34827b() {
            return C5173er.m47136w(this.description_);
        }

        /* renamed from: c */
        public String mo34828c() {
            return this.description_;
        }

        /* renamed from: h */
        public String mo34829h() {
            return this.type_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C5077a.f27692a[iVar.ordinal()]) {
                case 1:
                    return new C5079c();
                case 2:
                    return new C5080a((C5077a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C5079c> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C5079c.class) {
                            cz2 = PARSER;
                            if (cz2 == null) {
                                cz2 = new qe1.C6547c<>(DEFAULT_INSTANCE);
                                PARSER = cz2;
                            }
                        }
                    }
                    return cz2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: m */
        public C5173er mo34830m() {
            return C5173er.m47136w(this.type_);
        }

        /* renamed from: pk */
        public final void mo34831pk() {
            this.description_ = m45979sk().mo34828c();
        }

        /* renamed from: qk */
        public final void mo34832qk() {
            this.subject_ = m45979sk().mo34826U0();
        }

        /* renamed from: rk */
        public final void mo34833rk() {
            this.type_ = m45979sk().mo34829h();
        }

        /* renamed from: y0 */
        public C5173er mo34834y0() {
            return C5173er.m47136w(this.subject_);
        }
    }

    /* renamed from: com.onedelhi.secure.e43$d */
    public interface C5081d extends zh2 {
        /* renamed from: U0 */
        String mo34826U0();

        /* renamed from: b */
        C5173er mo34827b();

        /* renamed from: c */
        String mo34828c();

        /* renamed from: h */
        String mo34829h();

        /* renamed from: m */
        C5173er mo34830m();

        /* renamed from: y0 */
        C5173er mo34834y0();
    }

    static {
        e43 e43 = new e43();
        DEFAULT_INSTANCE = e43;
        qe1.m62492dk(e43.class, e43);
    }

    /* renamed from: Ak */
    public static e43 m45913Ak(g00 g00) throws IOException {
        return (e43) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Bk */
    public static e43 m45914Bk(g00 g00, zy0 zy0) throws IOException {
        return (e43) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ck */
    public static e43 m45915Ck(InputStream inputStream) throws IOException {
        return (e43) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static e43 m45916Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (e43) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static e43 m45917Ek(ByteBuffer byteBuffer) throws nt1 {
        return (e43) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Fk */
    public static e43 m45918Fk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (e43) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Gk */
    public static e43 m45919Gk(byte[] bArr) throws nt1 {
        return (e43) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Hk */
    public static e43 m45920Hk(byte[] bArr, zy0 zy0) throws nt1 {
        return (e43) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ik */
    public static cz2<e43> m45921Ik() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: rk */
    public static e43 m45929rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: uk */
    public static C5078b m45930uk() {
        return (C5078b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: vk */
    public static C5078b m45931vk(e43 e43) {
        return (C5078b) DEFAULT_INSTANCE.mo43358gj(e43);
    }

    /* renamed from: wk */
    public static e43 m45932wk(InputStream inputStream) throws IOException {
        return (e43) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static e43 m45933xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (e43) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static e43 m45934yk(C5173er erVar) throws nt1 {
        return (e43) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: zk */
    public static e43 m45935zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (e43) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Jk */
    public final void mo34799Jk(int i) {
        mo34807qk();
        this.violations_.remove(i);
    }

    /* renamed from: Kk */
    public final void mo34800Kk(int i, C5079c cVar) {
        cVar.getClass();
        mo34807qk();
        this.violations_.set(i, cVar);
    }

    /* renamed from: Z0 */
    public List<C5079c> mo34801Z0() {
        return this.violations_;
    }

    /* renamed from: d5 */
    public C5079c mo34802d5(int i) {
        return this.violations_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5077a.f27692a[iVar.ordinal()]) {
            case 1:
                return new e43();
            case 2:
                return new C5078b((C5077a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", C5079c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<e43> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (e43.class) {
                        cz2 = PARSER;
                        if (cz2 == null) {
                            cz2 = new qe1.C6547c<>(DEFAULT_INSTANCE);
                            PARSER = cz2;
                        }
                    }
                }
                return cz2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: mk */
    public final void mo34803mk(Iterable<? extends C5079c> iterable) {
        mo34807qk();
        C7403z0.m72412X6(iterable, this.violations_);
    }

    /* renamed from: nk */
    public final void mo34804nk(int i, C5079c cVar) {
        cVar.getClass();
        mo34807qk();
        this.violations_.add(i, cVar);
    }

    /* renamed from: ok */
    public final void mo34805ok(C5079c cVar) {
        cVar.getClass();
        mo34807qk();
        this.violations_.add(cVar);
    }

    /* renamed from: pk */
    public final void mo34806pk() {
        this.violations_ = qe1.m62499pj();
    }

    /* renamed from: qk */
    public final void mo34807qk() {
        vs1.C7095k<C5079c> kVar = this.violations_;
        if (!kVar.mo36500p()) {
            this.violations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: sk */
    public C5081d mo34808sk(int i) {
        return this.violations_.get(i);
    }

    /* renamed from: tk */
    public List<? extends C5081d> mo34809tk() {
        return this.violations_;
    }

    /* renamed from: z1 */
    public int mo34810z1() {
        return this.violations_.size();
    }
}
