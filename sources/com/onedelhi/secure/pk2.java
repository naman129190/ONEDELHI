package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class pk2 extends qe1<pk2, C6454b> implements qk2 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final pk2 DEFAULT_INSTANCE;
    private static volatile cz2<pk2> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private vs1.C7095k<C6455c> consumerDestinations_ = qe1.m62499pj();
    private vs1.C7095k<C6455c> producerDestinations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.pk2$a */
    public static /* synthetic */ class C6453a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33706a;

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
                f33706a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pk2.C6453a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.pk2$b */
    public static final class C6454b extends qe1.C6546b<pk2, C6454b> implements qk2 {
        public C6454b() {
            super(pk2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6454b(C6453a aVar) {
            this();
        }

        /* renamed from: A0 */
        public int mo42707A0() {
            return ((pk2) this.f34068b).mo42707A0();
        }

        /* renamed from: Gj */
        public C6454b mo42731Gj(Iterable<? extends C6455c> iterable) {
            mo43393xj();
            ((pk2) this.f34068b).mo42723sk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6454b mo42732Hj(Iterable<? extends C6455c> iterable) {
            mo43393xj();
            ((pk2) this.f34068b).mo42724tk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6454b mo42733Ij(int i, C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42725uk(i, (C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C6454b mo42734Jj(int i, C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42725uk(i, cVar);
            return this;
        }

        /* renamed from: Kj */
        public C6454b mo42735Kj(C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42726vk((C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C6454b mo42736Lj(C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42726vk(cVar);
            return this;
        }

        /* renamed from: Mj */
        public C6454b mo42737Mj(int i, C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42727wk(i, (C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C6454b mo42738Nj(int i, C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42727wk(i, cVar);
            return this;
        }

        /* renamed from: Oj */
        public C6454b mo42739Oj(C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42728xk((C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C6454b mo42740Pj(C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42728xk(cVar);
            return this;
        }

        /* renamed from: Q0 */
        public List<C6455c> mo42714Q0() {
            return Collections.unmodifiableList(((pk2) this.f34068b).mo42714Q0());
        }

        /* renamed from: Qj */
        public C6454b mo42741Qj() {
            mo43393xj();
            ((pk2) this.f34068b).mo42729yk();
            return this;
        }

        /* renamed from: R */
        public List<C6455c> mo42715R() {
            return Collections.unmodifiableList(((pk2) this.f34068b).mo42715R());
        }

        /* renamed from: Rj */
        public C6454b mo42742Rj() {
            mo43393xj();
            ((pk2) this.f34068b).mo42730zk();
            return this;
        }

        /* renamed from: Sj */
        public C6454b mo42743Sj(int i) {
            mo43393xj();
            ((pk2) this.f34068b).mo42716Wk(i);
            return this;
        }

        /* renamed from: Tj */
        public C6454b mo42744Tj(int i) {
            mo43393xj();
            ((pk2) this.f34068b).mo42718Xk(i);
            return this;
        }

        /* renamed from: Uj */
        public C6454b mo42745Uj(int i, C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42720Yk(i, (C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C6454b mo42746Vj(int i, C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42720Yk(i, cVar);
            return this;
        }

        /* renamed from: Wj */
        public C6454b mo42747Wj(int i, C6455c.C6456a aVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42721Zk(i, (C6455c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Xh */
        public C6455c mo42717Xh(int i) {
            return ((pk2) this.f34068b).mo42717Xh(i);
        }

        /* renamed from: Xj */
        public C6454b mo42748Xj(int i, C6455c cVar) {
            mo43393xj();
            ((pk2) this.f34068b).mo42721Zk(i, cVar);
            return this;
        }

        /* renamed from: Y */
        public int mo42719Y() {
            return ((pk2) this.f34068b).mo42719Y();
        }

        /* renamed from: hb */
        public C6455c mo42722hb(int i) {
            return ((pk2) this.f34068b).mo42722hb(i);
        }
    }

    /* renamed from: com.onedelhi.secure.pk2$c */
    public static final class C6455c extends qe1<C6455c, C6456a> implements C6457d {
        /* access modifiers changed from: private */
        public static final C6455c DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile cz2<C6455c> PARSER;
        private vs1.C7095k<String> metrics_ = qe1.m62499pj();
        private String monitoredResource_ = "";

        /* renamed from: com.onedelhi.secure.pk2$c$a */
        public static final class C6456a extends qe1.C6546b<C6455c, C6456a> implements C6457d {
            public C6456a() {
                super(C6455c.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6456a(C6453a aVar) {
                this();
            }

            /* renamed from: G0 */
            public String mo42749G0(int i) {
                return ((C6455c) this.f34068b).mo42749G0(i);
            }

            /* renamed from: Gj */
            public C6456a mo42764Gj(Iterable<String> iterable) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42758ok(iterable);
                return this;
            }

            /* renamed from: Hj */
            public C6456a mo42765Hj(String str) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42759pk(str);
                return this;
            }

            /* renamed from: Ij */
            public C6456a mo42766Ij(C5173er erVar) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42760qk(erVar);
                return this;
            }

            /* renamed from: Jj */
            public C6456a mo42767Jj() {
                mo43393xj();
                ((C6455c) this.f34068b).mo42761rk();
                return this;
            }

            /* renamed from: Kj */
            public C6456a mo42768Kj() {
                mo43393xj();
                ((C6455c) this.f34068b).mo42762sk();
                return this;
            }

            /* renamed from: Lj */
            public C6456a mo42769Lj(int i, String str) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42750Kk(i, str);
                return this;
            }

            /* renamed from: M */
            public List<String> mo42752M() {
                return Collections.unmodifiableList(((C6455c) this.f34068b).mo42752M());
            }

            /* renamed from: Mj */
            public C6456a mo42770Mj(String str) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42751Lk(str);
                return this;
            }

            /* renamed from: Nj */
            public C6456a mo42771Nj(C5173er erVar) {
                mo43393xj();
                ((C6455c) this.f34068b).mo42753Mk(erVar);
                return this;
            }

            /* renamed from: W */
            public String mo42754W() {
                return ((C6455c) this.f34068b).mo42754W();
            }

            /* renamed from: W0 */
            public C5173er mo42755W0(int i) {
                return ((C6455c) this.f34068b).mo42755W0(i);
            }

            /* renamed from: c0 */
            public int mo42756c0() {
                return ((C6455c) this.f34068b).mo42756c0();
            }

            /* renamed from: e0 */
            public C5173er mo42757e0() {
                return ((C6455c) this.f34068b).mo42757e0();
            }
        }

        static {
            C6455c cVar = new C6455c();
            DEFAULT_INSTANCE = cVar;
            qe1.m62492dk(C6455c.class, cVar);
        }

        /* renamed from: Ak */
        public static C6455c m61270Ak(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6455c) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Bk */
        public static C6455c m61271Bk(g00 g00) throws IOException {
            return (C6455c) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ck */
        public static C6455c m61272Ck(g00 g00, zy0 zy0) throws IOException {
            return (C6455c) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Dk */
        public static C6455c m61273Dk(InputStream inputStream) throws IOException {
            return (C6455c) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Ek */
        public static C6455c m61274Ek(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6455c) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Fk */
        public static C6455c m61275Fk(ByteBuffer byteBuffer) throws nt1 {
            return (C6455c) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Gk */
        public static C6455c m61276Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6455c) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Hk */
        public static C6455c m61277Hk(byte[] bArr) throws nt1 {
            return (C6455c) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ik */
        public static C6455c m61278Ik(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6455c) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Jk */
        public static cz2<C6455c> m61279Jk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: uk */
        public static C6455c m61289uk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: vk */
        public static C6456a m61290vk() {
            return (C6456a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: wk */
        public static C6456a m61291wk(C6455c cVar) {
            return (C6456a) DEFAULT_INSTANCE.mo43358gj(cVar);
        }

        /* renamed from: xk */
        public static C6455c m61292xk(InputStream inputStream) throws IOException {
            return (C6455c) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: yk */
        public static C6455c m61293yk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6455c) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: zk */
        public static C6455c m61294zk(C5173er erVar) throws nt1 {
            return (C6455c) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: G0 */
        public String mo42749G0(int i) {
            return this.metrics_.get(i);
        }

        /* renamed from: Kk */
        public final void mo42750Kk(int i, String str) {
            str.getClass();
            mo42763tk();
            this.metrics_.set(i, str);
        }

        /* renamed from: Lk */
        public final void mo42751Lk(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* renamed from: M */
        public List<String> mo42752M() {
            return this.metrics_;
        }

        /* renamed from: Mk */
        public final void mo42753Mk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.monitoredResource_ = erVar.mo35543k0();
        }

        /* renamed from: W */
        public String mo42754W() {
            return this.monitoredResource_;
        }

        /* renamed from: W0 */
        public C5173er mo42755W0(int i) {
            return C5173er.m47136w(this.metrics_.get(i));
        }

        /* renamed from: c0 */
        public int mo42756c0() {
            return this.metrics_.size();
        }

        /* renamed from: e0 */
        public C5173er mo42757e0() {
            return C5173er.m47136w(this.monitoredResource_);
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6453a.f33706a[iVar.ordinal()]) {
                case 1:
                    return new C6455c();
                case 2:
                    return new C6456a((C6453a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6455c> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6455c.class) {
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
        public final void mo42758ok(Iterable<String> iterable) {
            mo42763tk();
            C7403z0.m72412X6(iterable, this.metrics_);
        }

        /* renamed from: pk */
        public final void mo42759pk(String str) {
            str.getClass();
            mo42763tk();
            this.metrics_.add(str);
        }

        /* renamed from: qk */
        public final void mo42760qk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            mo42763tk();
            this.metrics_.add(erVar.mo35543k0());
        }

        /* renamed from: rk */
        public final void mo42761rk() {
            this.metrics_ = qe1.m62499pj();
        }

        /* renamed from: sk */
        public final void mo42762sk() {
            this.monitoredResource_ = m61289uk().mo42754W();
        }

        /* renamed from: tk */
        public final void mo42763tk() {
            vs1.C7095k<String> kVar = this.metrics_;
            if (!kVar.mo36500p()) {
                this.metrics_ = qe1.m62468Fj(kVar);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.pk2$d */
    public interface C6457d extends zh2 {
        /* renamed from: G0 */
        String mo42749G0(int i);

        /* renamed from: M */
        List<String> mo42752M();

        /* renamed from: W */
        String mo42754W();

        /* renamed from: W0 */
        C5173er mo42755W0(int i);

        /* renamed from: c0 */
        int mo42756c0();

        /* renamed from: e0 */
        C5173er mo42757e0();
    }

    static {
        pk2 pk2 = new pk2();
        DEFAULT_INSTANCE = pk2;
        qe1.m62492dk(pk2.class, pk2);
    }

    /* renamed from: Ek */
    public static pk2 m61192Ek() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Hk */
    public static C6454b m61193Hk() {
        return (C6454b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ik */
    public static C6454b m61194Ik(pk2 pk2) {
        return (C6454b) DEFAULT_INSTANCE.mo43358gj(pk2);
    }

    /* renamed from: Jk */
    public static pk2 m61195Jk(InputStream inputStream) throws IOException {
        return (pk2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static pk2 m61196Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pk2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static pk2 m61197Lk(C5173er erVar) throws nt1 {
        return (pk2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Mk */
    public static pk2 m61198Mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (pk2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Nk */
    public static pk2 m61199Nk(g00 g00) throws IOException {
        return (pk2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ok */
    public static pk2 m61200Ok(g00 g00, zy0 zy0) throws IOException {
        return (pk2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Pk */
    public static pk2 m61201Pk(InputStream inputStream) throws IOException {
        return (pk2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Qk */
    public static pk2 m61202Qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pk2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Rk */
    public static pk2 m61203Rk(ByteBuffer byteBuffer) throws nt1 {
        return (pk2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Sk */
    public static pk2 m61204Sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (pk2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Tk */
    public static pk2 m61205Tk(byte[] bArr) throws nt1 {
        return (pk2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Uk */
    public static pk2 m61206Uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (pk2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Vk */
    public static cz2<pk2> m61207Vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A0 */
    public int mo42707A0() {
        return this.producerDestinations_.size();
    }

    /* renamed from: Ak */
    public final void mo42708Ak() {
        vs1.C7095k<C6455c> kVar = this.consumerDestinations_;
        if (!kVar.mo36500p()) {
            this.consumerDestinations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Bk */
    public final void mo42709Bk() {
        vs1.C7095k<C6455c> kVar = this.producerDestinations_;
        if (!kVar.mo36500p()) {
            this.producerDestinations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ck */
    public C6457d mo42710Ck(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: Dk */
    public List<? extends C6457d> mo42711Dk() {
        return this.consumerDestinations_;
    }

    /* renamed from: Fk */
    public C6457d mo42712Fk(int i) {
        return this.producerDestinations_.get(i);
    }

    /* renamed from: Gk */
    public List<? extends C6457d> mo42713Gk() {
        return this.producerDestinations_;
    }

    /* renamed from: Q0 */
    public List<C6455c> mo42714Q0() {
        return this.producerDestinations_;
    }

    /* renamed from: R */
    public List<C6455c> mo42715R() {
        return this.consumerDestinations_;
    }

    /* renamed from: Wk */
    public final void mo42716Wk(int i) {
        mo42708Ak();
        this.consumerDestinations_.remove(i);
    }

    /* renamed from: Xh */
    public C6455c mo42717Xh(int i) {
        return this.producerDestinations_.get(i);
    }

    /* renamed from: Xk */
    public final void mo42718Xk(int i) {
        mo42709Bk();
        this.producerDestinations_.remove(i);
    }

    /* renamed from: Y */
    public int mo42719Y() {
        return this.consumerDestinations_.size();
    }

    /* renamed from: Yk */
    public final void mo42720Yk(int i, C6455c cVar) {
        cVar.getClass();
        mo42708Ak();
        this.consumerDestinations_.set(i, cVar);
    }

    /* renamed from: Zk */
    public final void mo42721Zk(int i, C6455c cVar) {
        cVar.getClass();
        mo42709Bk();
        this.producerDestinations_.set(i, cVar);
    }

    /* renamed from: hb */
    public C6455c mo42722hb(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        Class<C6455c> cls = C6455c.class;
        switch (C6453a.f33706a[iVar.ordinal()]) {
            case 1:
                return new pk2();
            case 2:
                return new C6454b((C6453a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", cls, "consumerDestinations_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<pk2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (pk2.class) {
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

    /* renamed from: sk */
    public final void mo42723sk(Iterable<? extends C6455c> iterable) {
        mo42708Ak();
        C7403z0.m72412X6(iterable, this.consumerDestinations_);
    }

    /* renamed from: tk */
    public final void mo42724tk(Iterable<? extends C6455c> iterable) {
        mo42709Bk();
        C7403z0.m72412X6(iterable, this.producerDestinations_);
    }

    /* renamed from: uk */
    public final void mo42725uk(int i, C6455c cVar) {
        cVar.getClass();
        mo42708Ak();
        this.consumerDestinations_.add(i, cVar);
    }

    /* renamed from: vk */
    public final void mo42726vk(C6455c cVar) {
        cVar.getClass();
        mo42708Ak();
        this.consumerDestinations_.add(cVar);
    }

    /* renamed from: wk */
    public final void mo42727wk(int i, C6455c cVar) {
        cVar.getClass();
        mo42709Bk();
        this.producerDestinations_.add(i, cVar);
    }

    /* renamed from: xk */
    public final void mo42728xk(C6455c cVar) {
        cVar.getClass();
        mo42709Bk();
        this.producerDestinations_.add(cVar);
    }

    /* renamed from: yk */
    public final void mo42729yk() {
        this.consumerDestinations_ = qe1.m62499pj();
    }

    /* renamed from: zk */
    public final void mo42730zk() {
        this.producerDestinations_ = qe1.m62499pj();
    }
}
