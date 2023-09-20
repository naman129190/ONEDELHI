package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.qk */
public final class C6583qk extends qe1<C6583qk, C6588d> implements C6704rk {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final C6583qk DEFAULT_INSTANCE;
    private static volatile cz2<C6583qk> PARSER;
    private vs1.C7095k<C6585b> consumerDestinations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.qk$a */
    public static /* synthetic */ class C6584a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34263a;

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
                f34263a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34263a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6583qk.C6584a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.qk$b */
    public static final class C6585b extends qe1<C6585b, C6586a> implements C6587c {
        /* access modifiers changed from: private */
        public static final C6585b DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile cz2<C6585b> PARSER;
        private vs1.C7095k<String> metrics_ = qe1.m62499pj();
        private String monitoredResource_ = "";

        /* renamed from: com.onedelhi.secure.qk$b$a */
        public static final class C6586a extends qe1.C6546b<C6585b, C6586a> implements C6587c {
            public C6586a() {
                super(C6585b.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6586a(C6584a aVar) {
                this();
            }

            /* renamed from: G0 */
            public String mo43608G0(int i) {
                return ((C6585b) this.f34068b).mo43608G0(i);
            }

            /* renamed from: Gj */
            public C6586a mo43623Gj(Iterable<String> iterable) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43617ok(iterable);
                return this;
            }

            /* renamed from: Hj */
            public C6586a mo43624Hj(String str) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43618pk(str);
                return this;
            }

            /* renamed from: Ij */
            public C6586a mo43625Ij(C5173er erVar) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43619qk(erVar);
                return this;
            }

            /* renamed from: Jj */
            public C6586a mo43626Jj() {
                mo43393xj();
                ((C6585b) this.f34068b).mo43620rk();
                return this;
            }

            /* renamed from: Kj */
            public C6586a mo43627Kj() {
                mo43393xj();
                ((C6585b) this.f34068b).mo43621sk();
                return this;
            }

            /* renamed from: Lj */
            public C6586a mo43628Lj(int i, String str) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43609Kk(i, str);
                return this;
            }

            /* renamed from: M */
            public List<String> mo43611M() {
                return Collections.unmodifiableList(((C6585b) this.f34068b).mo43611M());
            }

            /* renamed from: Mj */
            public C6586a mo43629Mj(String str) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43610Lk(str);
                return this;
            }

            /* renamed from: Nj */
            public C6586a mo43630Nj(C5173er erVar) {
                mo43393xj();
                ((C6585b) this.f34068b).mo43612Mk(erVar);
                return this;
            }

            /* renamed from: W */
            public String mo43613W() {
                return ((C6585b) this.f34068b).mo43613W();
            }

            /* renamed from: W0 */
            public C5173er mo43614W0(int i) {
                return ((C6585b) this.f34068b).mo43614W0(i);
            }

            /* renamed from: c0 */
            public int mo43615c0() {
                return ((C6585b) this.f34068b).mo43615c0();
            }

            /* renamed from: e0 */
            public C5173er mo43616e0() {
                return ((C6585b) this.f34068b).mo43616e0();
            }
        }

        static {
            C6585b bVar = new C6585b();
            DEFAULT_INSTANCE = bVar;
            qe1.m62492dk(C6585b.class, bVar);
        }

        /* renamed from: Ak */
        public static C6585b m62922Ak(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6585b) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Bk */
        public static C6585b m62923Bk(g00 g00) throws IOException {
            return (C6585b) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ck */
        public static C6585b m62924Ck(g00 g00, zy0 zy0) throws IOException {
            return (C6585b) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Dk */
        public static C6585b m62925Dk(InputStream inputStream) throws IOException {
            return (C6585b) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Ek */
        public static C6585b m62926Ek(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6585b) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Fk */
        public static C6585b m62927Fk(ByteBuffer byteBuffer) throws nt1 {
            return (C6585b) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Gk */
        public static C6585b m62928Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6585b) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Hk */
        public static C6585b m62929Hk(byte[] bArr) throws nt1 {
            return (C6585b) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ik */
        public static C6585b m62930Ik(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6585b) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Jk */
        public static cz2<C6585b> m62931Jk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: uk */
        public static C6585b m62941uk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: vk */
        public static C6586a m62942vk() {
            return (C6586a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: wk */
        public static C6586a m62943wk(C6585b bVar) {
            return (C6586a) DEFAULT_INSTANCE.mo43358gj(bVar);
        }

        /* renamed from: xk */
        public static C6585b m62944xk(InputStream inputStream) throws IOException {
            return (C6585b) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: yk */
        public static C6585b m62945yk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6585b) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: zk */
        public static C6585b m62946zk(C5173er erVar) throws nt1 {
            return (C6585b) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: G0 */
        public String mo43608G0(int i) {
            return this.metrics_.get(i);
        }

        /* renamed from: Kk */
        public final void mo43609Kk(int i, String str) {
            str.getClass();
            mo43622tk();
            this.metrics_.set(i, str);
        }

        /* renamed from: Lk */
        public final void mo43610Lk(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* renamed from: M */
        public List<String> mo43611M() {
            return this.metrics_;
        }

        /* renamed from: Mk */
        public final void mo43612Mk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.monitoredResource_ = erVar.mo35543k0();
        }

        /* renamed from: W */
        public String mo43613W() {
            return this.monitoredResource_;
        }

        /* renamed from: W0 */
        public C5173er mo43614W0(int i) {
            return C5173er.m47136w(this.metrics_.get(i));
        }

        /* renamed from: c0 */
        public int mo43615c0() {
            return this.metrics_.size();
        }

        /* renamed from: e0 */
        public C5173er mo43616e0() {
            return C5173er.m47136w(this.monitoredResource_);
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6584a.f34263a[iVar.ordinal()]) {
                case 1:
                    return new C6585b();
                case 2:
                    return new C6586a((C6584a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6585b> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6585b.class) {
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

        /* renamed from: ok */
        public final void mo43617ok(Iterable<String> iterable) {
            mo43622tk();
            C7403z0.m72412X6(iterable, this.metrics_);
        }

        /* renamed from: pk */
        public final void mo43618pk(String str) {
            str.getClass();
            mo43622tk();
            this.metrics_.add(str);
        }

        /* renamed from: qk */
        public final void mo43619qk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            mo43622tk();
            this.metrics_.add(erVar.mo35543k0());
        }

        /* renamed from: rk */
        public final void mo43620rk() {
            this.metrics_ = qe1.m62499pj();
        }

        /* renamed from: sk */
        public final void mo43621sk() {
            this.monitoredResource_ = m62941uk().mo43613W();
        }

        /* renamed from: tk */
        public final void mo43622tk() {
            vs1.C7095k<String> kVar = this.metrics_;
            if (!kVar.mo36500p()) {
                this.metrics_ = qe1.m62468Fj(kVar);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qk$c */
    public interface C6587c extends zh2 {
        /* renamed from: G0 */
        String mo43608G0(int i);

        /* renamed from: M */
        List<String> mo43611M();

        /* renamed from: W */
        String mo43613W();

        /* renamed from: W0 */
        C5173er mo43614W0(int i);

        /* renamed from: c0 */
        int mo43615c0();

        /* renamed from: e0 */
        C5173er mo43616e0();
    }

    /* renamed from: com.onedelhi.secure.qk$d */
    public static final class C6588d extends qe1.C6546b<C6583qk, C6588d> implements C6704rk {
        public C6588d() {
            super(C6583qk.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6588d(C6584a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6588d mo43631Gj(Iterable<? extends C6585b> iterable) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43601mk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6588d mo43632Hj(int i, C6585b.C6586a aVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43602nk(i, (C6585b) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6588d mo43633Ij(int i, C6585b bVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43602nk(i, bVar);
            return this;
        }

        /* renamed from: Jj */
        public C6588d mo43634Jj(C6585b.C6586a aVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43603ok((C6585b) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6588d mo43635Kj(C6585b bVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43603ok(bVar);
            return this;
        }

        /* renamed from: Lj */
        public C6588d mo43636Lj() {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43604pk();
            return this;
        }

        /* renamed from: Mj */
        public C6588d mo43637Mj(int i) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43596Jk(i);
            return this;
        }

        /* renamed from: Nj */
        public C6588d mo43638Nj(int i, C6585b.C6586a aVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43597Kk(i, (C6585b) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C6588d mo43639Oj(int i, C6585b bVar) {
            mo43393xj();
            ((C6583qk) this.f34068b).mo43597Kk(i, bVar);
            return this;
        }

        /* renamed from: R */
        public List<C6585b> mo43598R() {
            return Collections.unmodifiableList(((C6583qk) this.f34068b).mo43598R());
        }

        /* renamed from: R6 */
        public C6585b mo43599R6(int i) {
            return ((C6583qk) this.f34068b).mo43599R6(i);
        }

        /* renamed from: Y */
        public int mo43600Y() {
            return ((C6583qk) this.f34068b).mo43600Y();
        }
    }

    static {
        C6583qk qkVar = new C6583qk();
        DEFAULT_INSTANCE = qkVar;
        qe1.m62492dk(C6583qk.class, qkVar);
    }

    /* renamed from: Ak */
    public static C6583qk m62886Ak(g00 g00) throws IOException {
        return (C6583qk) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Bk */
    public static C6583qk m62887Bk(g00 g00, zy0 zy0) throws IOException {
        return (C6583qk) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ck */
    public static C6583qk m62888Ck(InputStream inputStream) throws IOException {
        return (C6583qk) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static C6583qk m62889Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6583qk) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static C6583qk m62890Ek(ByteBuffer byteBuffer) throws nt1 {
        return (C6583qk) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Fk */
    public static C6583qk m62891Fk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6583qk) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Gk */
    public static C6583qk m62892Gk(byte[] bArr) throws nt1 {
        return (C6583qk) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Hk */
    public static C6583qk m62893Hk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6583qk) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ik */
    public static cz2<C6583qk> m62894Ik() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: tk */
    public static C6583qk m62902tk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: uk */
    public static C6588d m62903uk() {
        return (C6588d) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: vk */
    public static C6588d m62904vk(C6583qk qkVar) {
        return (C6588d) DEFAULT_INSTANCE.mo43358gj(qkVar);
    }

    /* renamed from: wk */
    public static C6583qk m62905wk(InputStream inputStream) throws IOException {
        return (C6583qk) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static C6583qk m62906xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6583qk) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static C6583qk m62907yk(C5173er erVar) throws nt1 {
        return (C6583qk) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: zk */
    public static C6583qk m62908zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6583qk) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Jk */
    public final void mo43596Jk(int i) {
        mo43605qk();
        this.consumerDestinations_.remove(i);
    }

    /* renamed from: Kk */
    public final void mo43597Kk(int i, C6585b bVar) {
        bVar.getClass();
        mo43605qk();
        this.consumerDestinations_.set(i, bVar);
    }

    /* renamed from: R */
    public List<C6585b> mo43598R() {
        return this.consumerDestinations_;
    }

    /* renamed from: R6 */
    public C6585b mo43599R6(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: Y */
    public int mo43600Y() {
        return this.consumerDestinations_.size();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6584a.f34263a[iVar.ordinal()]) {
            case 1:
                return new C6583qk();
            case 2:
                return new C6588d((C6584a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", C6585b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6583qk> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6583qk.class) {
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
    public final void mo43601mk(Iterable<? extends C6585b> iterable) {
        mo43605qk();
        C7403z0.m72412X6(iterable, this.consumerDestinations_);
    }

    /* renamed from: nk */
    public final void mo43602nk(int i, C6585b bVar) {
        bVar.getClass();
        mo43605qk();
        this.consumerDestinations_.add(i, bVar);
    }

    /* renamed from: ok */
    public final void mo43603ok(C6585b bVar) {
        bVar.getClass();
        mo43605qk();
        this.consumerDestinations_.add(bVar);
    }

    /* renamed from: pk */
    public final void mo43604pk() {
        this.consumerDestinations_ = qe1.m62499pj();
    }

    /* renamed from: qk */
    public final void mo43605qk() {
        vs1.C7095k<C6585b> kVar = this.consumerDestinations_;
        if (!kVar.mo36500p()) {
            this.consumerDestinations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: rk */
    public C6587c mo43606rk(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: sk */
    public List<? extends C6587c> mo43607sk() {
        return this.consumerDestinations_;
    }
}
