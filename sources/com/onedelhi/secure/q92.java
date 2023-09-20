package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class q92 extends qe1<q92, C6520b> implements t92 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final q92 DEFAULT_INSTANCE;
    private static volatile cz2<q92> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private vs1.C7095k<C6521c> consumerDestinations_ = qe1.m62499pj();
    private vs1.C7095k<C6521c> producerDestinations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.q92$a */
    public static /* synthetic */ class C6519a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34029a;

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
                f34029a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34029a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.q92.C6519a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.q92$b */
    public static final class C6520b extends qe1.C6546b<q92, C6520b> implements t92 {
        public C6520b() {
            super(q92.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6520b(C6519a aVar) {
            this();
        }

        /* renamed from: A0 */
        public int mo43179A0() {
            return ((q92) this.f34068b).mo43179A0();
        }

        /* renamed from: Gj */
        public C6520b mo43203Gj(Iterable<? extends C6521c> iterable) {
            mo43393xj();
            ((q92) this.f34068b).mo43193sk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6520b mo43204Hj(Iterable<? extends C6521c> iterable) {
            mo43393xj();
            ((q92) this.f34068b).mo43194tk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6520b mo43205Ij(int i, C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43195uk(i, (C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C6520b mo43206Jj(int i, C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43195uk(i, cVar);
            return this;
        }

        /* renamed from: Kj */
        public C6520b mo43207Kj(C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43196vk((C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C6520b mo43208Lj(C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43196vk(cVar);
            return this;
        }

        /* renamed from: Mj */
        public C6520b mo43209Mj(int i, C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43197wk(i, (C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C6520b mo43210Nj(int i, C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43197wk(i, cVar);
            return this;
        }

        /* renamed from: Oj */
        public C6520b mo43211Oj(C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43199xk((C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C6520b mo43212Pj(C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43199xk(cVar);
            return this;
        }

        /* renamed from: Q0 */
        public List<C6521c> mo43186Q0() {
            return Collections.unmodifiableList(((q92) this.f34068b).mo43186Q0());
        }

        /* renamed from: Qj */
        public C6520b mo43213Qj() {
            mo43393xj();
            ((q92) this.f34068b).mo43200yk();
            return this;
        }

        /* renamed from: R */
        public List<C6521c> mo43187R() {
            return Collections.unmodifiableList(((q92) this.f34068b).mo43187R());
        }

        /* renamed from: Rj */
        public C6520b mo43214Rj() {
            mo43393xj();
            ((q92) this.f34068b).mo43202zk();
            return this;
        }

        /* renamed from: Sj */
        public C6520b mo43215Sj(int i) {
            mo43393xj();
            ((q92) this.f34068b).mo43188Wk(i);
            return this;
        }

        /* renamed from: Tj */
        public C6520b mo43216Tj(int i) {
            mo43393xj();
            ((q92) this.f34068b).mo43189Xk(i);
            return this;
        }

        /* renamed from: Uj */
        public C6520b mo43217Uj(int i, C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43191Yk(i, (C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C6520b mo43218Vj(int i, C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43191Yk(i, cVar);
            return this;
        }

        /* renamed from: Wj */
        public C6520b mo43219Wj(int i, C6521c.C6522a aVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43192Zk(i, (C6521c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C6520b mo43220Xj(int i, C6521c cVar) {
            mo43393xj();
            ((q92) this.f34068b).mo43192Zk(i, cVar);
            return this;
        }

        /* renamed from: Y */
        public int mo43190Y() {
            return ((q92) this.f34068b).mo43190Y();
        }

        /* renamed from: x8 */
        public C6521c mo43198x8(int i) {
            return ((q92) this.f34068b).mo43198x8(i);
        }

        /* renamed from: z3 */
        public C6521c mo43201z3(int i) {
            return ((q92) this.f34068b).mo43201z3(i);
        }
    }

    /* renamed from: com.onedelhi.secure.q92$c */
    public static final class C6521c extends qe1<C6521c, C6522a> implements C6523d {
        /* access modifiers changed from: private */
        public static final C6521c DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile cz2<C6521c> PARSER;
        private vs1.C7095k<String> logs_ = qe1.m62499pj();
        private String monitoredResource_ = "";

        /* renamed from: com.onedelhi.secure.q92$c$a */
        public static final class C6522a extends qe1.C6546b<C6521c, C6522a> implements C6523d {
            public C6522a() {
                super(C6521c.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6522a(C6519a aVar) {
                this();
            }

            /* renamed from: Eb */
            public String mo43221Eb(int i) {
                return ((C6521c) this.f34068b).mo43221Eb(i);
            }

            /* renamed from: Gj */
            public C6522a mo43236Gj(Iterable<String> iterable) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43230ok(iterable);
                return this;
            }

            /* renamed from: Hj */
            public C6522a mo43237Hj(String str) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43231pk(str);
                return this;
            }

            /* renamed from: Ij */
            public C6522a mo43238Ij(C5173er erVar) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43232qk(erVar);
                return this;
            }

            /* renamed from: Jj */
            public C6522a mo43239Jj() {
                mo43393xj();
                ((C6521c) this.f34068b).mo43233rk();
                return this;
            }

            /* renamed from: Kj */
            public C6522a mo43240Kj() {
                mo43393xj();
                ((C6521c) this.f34068b).mo43234sk();
                return this;
            }

            /* renamed from: Lj */
            public C6522a mo43241Lj(int i, String str) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43222Kk(i, str);
                return this;
            }

            /* renamed from: Mj */
            public C6522a mo43242Mj(String str) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43223Lk(str);
                return this;
            }

            /* renamed from: Nf */
            public C5173er mo43225Nf(int i) {
                return ((C6521c) this.f34068b).mo43225Nf(i);
            }

            /* renamed from: Nj */
            public C6522a mo43243Nj(C5173er erVar) {
                mo43393xj();
                ((C6521c) this.f34068b).mo43224Mk(erVar);
                return this;
            }

            /* renamed from: V1 */
            public List<String> mo43226V1() {
                return Collections.unmodifiableList(((C6521c) this.f34068b).mo43226V1());
            }

            /* renamed from: W */
            public String mo43227W() {
                return ((C6521c) this.f34068b).mo43227W();
            }

            /* renamed from: b2 */
            public int mo43228b2() {
                return ((C6521c) this.f34068b).mo43228b2();
            }

            /* renamed from: e0 */
            public C5173er mo43229e0() {
                return ((C6521c) this.f34068b).mo43229e0();
            }
        }

        static {
            C6521c cVar = new C6521c();
            DEFAULT_INSTANCE = cVar;
            qe1.m62492dk(C6521c.class, cVar);
        }

        /* renamed from: Ak */
        public static C6521c m62257Ak(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6521c) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Bk */
        public static C6521c m62258Bk(g00 g00) throws IOException {
            return (C6521c) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ck */
        public static C6521c m62259Ck(g00 g00, zy0 zy0) throws IOException {
            return (C6521c) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Dk */
        public static C6521c m62260Dk(InputStream inputStream) throws IOException {
            return (C6521c) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Ek */
        public static C6521c m62261Ek(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6521c) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Fk */
        public static C6521c m62262Fk(ByteBuffer byteBuffer) throws nt1 {
            return (C6521c) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Gk */
        public static C6521c m62263Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6521c) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Hk */
        public static C6521c m62264Hk(byte[] bArr) throws nt1 {
            return (C6521c) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ik */
        public static C6521c m62265Ik(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6521c) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Jk */
        public static cz2<C6521c> m62266Jk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: uk */
        public static C6521c m62276uk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: vk */
        public static C6522a m62277vk() {
            return (C6522a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: wk */
        public static C6522a m62278wk(C6521c cVar) {
            return (C6522a) DEFAULT_INSTANCE.mo43358gj(cVar);
        }

        /* renamed from: xk */
        public static C6521c m62279xk(InputStream inputStream) throws IOException {
            return (C6521c) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: yk */
        public static C6521c m62280yk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6521c) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: zk */
        public static C6521c m62281zk(C5173er erVar) throws nt1 {
            return (C6521c) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Eb */
        public String mo43221Eb(int i) {
            return this.logs_.get(i);
        }

        /* renamed from: Kk */
        public final void mo43222Kk(int i, String str) {
            str.getClass();
            mo43235tk();
            this.logs_.set(i, str);
        }

        /* renamed from: Lk */
        public final void mo43223Lk(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* renamed from: Mk */
        public final void mo43224Mk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.monitoredResource_ = erVar.mo35543k0();
        }

        /* renamed from: Nf */
        public C5173er mo43225Nf(int i) {
            return C5173er.m47136w(this.logs_.get(i));
        }

        /* renamed from: V1 */
        public List<String> mo43226V1() {
            return this.logs_;
        }

        /* renamed from: W */
        public String mo43227W() {
            return this.monitoredResource_;
        }

        /* renamed from: b2 */
        public int mo43228b2() {
            return this.logs_.size();
        }

        /* renamed from: e0 */
        public C5173er mo43229e0() {
            return C5173er.m47136w(this.monitoredResource_);
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6519a.f34029a[iVar.ordinal()]) {
                case 1:
                    return new C6521c();
                case 2:
                    return new C6522a((C6519a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6521c> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6521c.class) {
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
        public final void mo43230ok(Iterable<String> iterable) {
            mo43235tk();
            C7403z0.m72412X6(iterable, this.logs_);
        }

        /* renamed from: pk */
        public final void mo43231pk(String str) {
            str.getClass();
            mo43235tk();
            this.logs_.add(str);
        }

        /* renamed from: qk */
        public final void mo43232qk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            mo43235tk();
            this.logs_.add(erVar.mo35543k0());
        }

        /* renamed from: rk */
        public final void mo43233rk() {
            this.logs_ = qe1.m62499pj();
        }

        /* renamed from: sk */
        public final void mo43234sk() {
            this.monitoredResource_ = m62276uk().mo43227W();
        }

        /* renamed from: tk */
        public final void mo43235tk() {
            vs1.C7095k<String> kVar = this.logs_;
            if (!kVar.mo36500p()) {
                this.logs_ = qe1.m62468Fj(kVar);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.q92$d */
    public interface C6523d extends zh2 {
        /* renamed from: Eb */
        String mo43221Eb(int i);

        /* renamed from: Nf */
        C5173er mo43225Nf(int i);

        /* renamed from: V1 */
        List<String> mo43226V1();

        /* renamed from: W */
        String mo43227W();

        /* renamed from: b2 */
        int mo43228b2();

        /* renamed from: e0 */
        C5173er mo43229e0();
    }

    static {
        q92 q92 = new q92();
        DEFAULT_INSTANCE = q92;
        qe1.m62492dk(q92.class, q92);
    }

    /* renamed from: Ek */
    public static q92 m62179Ek() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Hk */
    public static C6520b m62180Hk() {
        return (C6520b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ik */
    public static C6520b m62181Ik(q92 q92) {
        return (C6520b) DEFAULT_INSTANCE.mo43358gj(q92);
    }

    /* renamed from: Jk */
    public static q92 m62182Jk(InputStream inputStream) throws IOException {
        return (q92) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static q92 m62183Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (q92) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static q92 m62184Lk(C5173er erVar) throws nt1 {
        return (q92) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Mk */
    public static q92 m62185Mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (q92) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Nk */
    public static q92 m62186Nk(g00 g00) throws IOException {
        return (q92) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ok */
    public static q92 m62187Ok(g00 g00, zy0 zy0) throws IOException {
        return (q92) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Pk */
    public static q92 m62188Pk(InputStream inputStream) throws IOException {
        return (q92) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Qk */
    public static q92 m62189Qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (q92) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Rk */
    public static q92 m62190Rk(ByteBuffer byteBuffer) throws nt1 {
        return (q92) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Sk */
    public static q92 m62191Sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (q92) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Tk */
    public static q92 m62192Tk(byte[] bArr) throws nt1 {
        return (q92) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Uk */
    public static q92 m62193Uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (q92) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Vk */
    public static cz2<q92> m62194Vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A0 */
    public int mo43179A0() {
        return this.producerDestinations_.size();
    }

    /* renamed from: Ak */
    public final void mo43180Ak() {
        vs1.C7095k<C6521c> kVar = this.consumerDestinations_;
        if (!kVar.mo36500p()) {
            this.consumerDestinations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Bk */
    public final void mo43181Bk() {
        vs1.C7095k<C6521c> kVar = this.producerDestinations_;
        if (!kVar.mo36500p()) {
            this.producerDestinations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ck */
    public C6523d mo43182Ck(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: Dk */
    public List<? extends C6523d> mo43183Dk() {
        return this.consumerDestinations_;
    }

    /* renamed from: Fk */
    public C6523d mo43184Fk(int i) {
        return this.producerDestinations_.get(i);
    }

    /* renamed from: Gk */
    public List<? extends C6523d> mo43185Gk() {
        return this.producerDestinations_;
    }

    /* renamed from: Q0 */
    public List<C6521c> mo43186Q0() {
        return this.producerDestinations_;
    }

    /* renamed from: R */
    public List<C6521c> mo43187R() {
        return this.consumerDestinations_;
    }

    /* renamed from: Wk */
    public final void mo43188Wk(int i) {
        mo43180Ak();
        this.consumerDestinations_.remove(i);
    }

    /* renamed from: Xk */
    public final void mo43189Xk(int i) {
        mo43181Bk();
        this.producerDestinations_.remove(i);
    }

    /* renamed from: Y */
    public int mo43190Y() {
        return this.consumerDestinations_.size();
    }

    /* renamed from: Yk */
    public final void mo43191Yk(int i, C6521c cVar) {
        cVar.getClass();
        mo43180Ak();
        this.consumerDestinations_.set(i, cVar);
    }

    /* renamed from: Zk */
    public final void mo43192Zk(int i, C6521c cVar) {
        cVar.getClass();
        mo43181Bk();
        this.producerDestinations_.set(i, cVar);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        Class<C6521c> cls = C6521c.class;
        switch (C6519a.f34029a[iVar.ordinal()]) {
            case 1:
                return new q92();
            case 2:
                return new C6520b((C6519a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", cls, "consumerDestinations_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<q92> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (q92.class) {
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
    public final void mo43193sk(Iterable<? extends C6521c> iterable) {
        mo43180Ak();
        C7403z0.m72412X6(iterable, this.consumerDestinations_);
    }

    /* renamed from: tk */
    public final void mo43194tk(Iterable<? extends C6521c> iterable) {
        mo43181Bk();
        C7403z0.m72412X6(iterable, this.producerDestinations_);
    }

    /* renamed from: uk */
    public final void mo43195uk(int i, C6521c cVar) {
        cVar.getClass();
        mo43180Ak();
        this.consumerDestinations_.add(i, cVar);
    }

    /* renamed from: vk */
    public final void mo43196vk(C6521c cVar) {
        cVar.getClass();
        mo43180Ak();
        this.consumerDestinations_.add(cVar);
    }

    /* renamed from: wk */
    public final void mo43197wk(int i, C6521c cVar) {
        cVar.getClass();
        mo43181Bk();
        this.producerDestinations_.add(i, cVar);
    }

    /* renamed from: x8 */
    public C6521c mo43198x8(int i) {
        return this.consumerDestinations_.get(i);
    }

    /* renamed from: xk */
    public final void mo43199xk(C6521c cVar) {
        cVar.getClass();
        mo43181Bk();
        this.producerDestinations_.add(cVar);
    }

    /* renamed from: yk */
    public final void mo43200yk() {
        this.consumerDestinations_ = qe1.m62499pj();
    }

    /* renamed from: z3 */
    public C6521c mo43201z3(int i) {
        return this.producerDestinations_.get(i);
    }

    /* renamed from: zk */
    public final void mo43202zk() {
        this.producerDestinations_ = qe1.m62499pj();
    }
}
