package com.onedelhi.secure;

import com.onedelhi.secure.C6248o7;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.se4;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ln0 extends qe1<ln0, C6032d> implements mn0 {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final ln0 DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile cz2<ln0> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private vs1.C7088i bucketCounts_ = qe1.m62498oj();
    private C6019b bucketOptions_;
    private long count_;
    private vs1.C7095k<C6033e> exemplars_ = qe1.m62499pj();
    private double mean_;
    private C6036g range_;
    private double sumOfSquaredDeviation_;

    /* renamed from: com.onedelhi.secure.ln0$a */
    public static /* synthetic */ class C6018a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31731a;

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
                f31731a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31731a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ln0.C6018a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ln0$b */
    public static final class C6019b extends qe1<C6019b, C6020a> implements C6031c {
        /* access modifiers changed from: private */
        public static final C6019b DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile cz2<C6019b> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        /* renamed from: com.onedelhi.secure.ln0$b$a */
        public static final class C6020a extends qe1.C6546b<C6019b, C6020a> implements C6031c {
            public C6020a() {
                super(C6019b.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6020a(C6018a aVar) {
                this();
            }

            /* renamed from: B2 */
            public C6030h mo39990B2() {
                return ((C6019b) this.f34068b).mo39990B2();
            }

            /* renamed from: Gj */
            public C6020a mo40007Gj() {
                mo43393xj();
                ((C6019b) this.f34068b).mo40000qk();
                return this;
            }

            /* renamed from: Hj */
            public C6020a mo40008Hj() {
                mo43393xj();
                ((C6019b) this.f34068b).mo40001rk();
                return this;
            }

            /* renamed from: Ij */
            public C6020a mo40009Ij() {
                mo43393xj();
                ((C6019b) this.f34068b).mo40002sk();
                return this;
            }

            /* renamed from: Jj */
            public C6020a mo40010Jj() {
                mo43393xj();
                ((C6019b) this.f34068b).mo40003tk();
                return this;
            }

            /* renamed from: Kj */
            public C6020a mo40011Kj(C6021b bVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo40004vk(bVar);
                return this;
            }

            /* renamed from: Lj */
            public C6020a mo40012Lj(C6024d dVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo40005wk(dVar);
                return this;
            }

            /* renamed from: Mj */
            public C6020a mo40013Mj(C6027f fVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo40006xk(fVar);
                return this;
            }

            /* renamed from: Nj */
            public C6020a mo40014Nj(C6021b.C6022a aVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39991Nk((C6021b) aVar.mo43381ab());
                return this;
            }

            /* renamed from: Oj */
            public C6020a mo40015Oj(C6021b bVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39991Nk(bVar);
                return this;
            }

            /* renamed from: Pj */
            public C6020a mo40016Pj(C6024d.C6025a aVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39992Ok((C6024d) aVar.mo43381ab());
                return this;
            }

            /* renamed from: Qj */
            public C6020a mo40017Qj(C6024d dVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39992Ok(dVar);
                return this;
            }

            /* renamed from: Rj */
            public C6020a mo40018Rj(C6027f.C6028a aVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39993Pk((C6027f) aVar.mo43381ab());
                return this;
            }

            /* renamed from: Sj */
            public C6020a mo40019Sj(C6027f fVar) {
                mo43393xj();
                ((C6019b) this.f34068b).mo39993Pk(fVar);
                return this;
            }

            /* renamed from: bc */
            public boolean mo39994bc() {
                return ((C6019b) this.f34068b).mo39994bc();
            }

            /* renamed from: ee */
            public C6027f mo39995ee() {
                return ((C6019b) this.f34068b).mo39995ee();
            }

            /* renamed from: ga */
            public C6021b mo39996ga() {
                return ((C6019b) this.f34068b).mo39996ga();
            }

            /* renamed from: ie */
            public C6024d mo39997ie() {
                return ((C6019b) this.f34068b).mo39997ie();
            }

            /* renamed from: li */
            public boolean mo39998li() {
                return ((C6019b) this.f34068b).mo39998li();
            }

            /* renamed from: m9 */
            public boolean mo39999m9() {
                return ((C6019b) this.f34068b).mo39999m9();
            }
        }

        /* renamed from: com.onedelhi.secure.ln0$b$b */
        public static final class C6021b extends qe1<C6021b, C6022a> implements C6023c {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final C6021b DEFAULT_INSTANCE;
            private static volatile cz2<C6021b> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private vs1.C7080b bounds_ = qe1.m62495lj();

            /* renamed from: com.onedelhi.secure.ln0$b$b$a */
            public static final class C6022a extends qe1.C6546b<C6021b, C6022a> implements C6023c {
                public C6022a() {
                    super(C6021b.DEFAULT_INSTANCE);
                }

                public /* synthetic */ C6022a(C6018a aVar) {
                    this();
                }

                /* renamed from: Gj */
                public C6022a mo40028Gj(Iterable<? extends Double> iterable) {
                    mo43393xj();
                    ((C6021b) this.f34068b).mo40024kk(iterable);
                    return this;
                }

                /* renamed from: Hj */
                public C6022a mo40029Hj(double d) {
                    mo43393xj();
                    ((C6021b) this.f34068b).mo40025lk(d);
                    return this;
                }

                /* renamed from: Ij */
                public C6022a mo40030Ij() {
                    mo43393xj();
                    ((C6021b) this.f34068b).mo40026mk();
                    return this;
                }

                /* renamed from: Jj */
                public C6022a mo40031Jj(int i, double d) {
                    mo43393xj();
                    ((C6021b) this.f34068b).mo40020Ek(i, d);
                    return this;
                }

                /* renamed from: Pc */
                public double mo40021Pc(int i) {
                    return ((C6021b) this.f34068b).mo40021Pc(i);
                }

                /* renamed from: dh */
                public List<Double> mo40022dh() {
                    return Collections.unmodifiableList(((C6021b) this.f34068b).mo40022dh());
                }

                /* renamed from: j2 */
                public int mo40023j2() {
                    return ((C6021b) this.f34068b).mo40023j2();
                }
            }

            static {
                C6021b bVar = new C6021b();
                DEFAULT_INSTANCE = bVar;
                qe1.m62492dk(C6021b.class, bVar);
            }

            /* renamed from: Ak */
            public static C6021b m55988Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
                return (C6021b) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
            }

            /* renamed from: Bk */
            public static C6021b m55989Bk(byte[] bArr) throws nt1 {
                return (C6021b) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
            }

            /* renamed from: Ck */
            public static C6021b m55990Ck(byte[] bArr, zy0 zy0) throws nt1 {
                return (C6021b) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
            }

            /* renamed from: Dk */
            public static cz2<C6021b> m55991Dk() {
                return DEFAULT_INSTANCE.mo43348Tc();
            }

            /* renamed from: ok */
            public static C6021b m55997ok() {
                return DEFAULT_INSTANCE;
            }

            /* renamed from: pk */
            public static C6022a m55998pk() {
                return (C6022a) DEFAULT_INSTANCE.mo43357fj();
            }

            /* renamed from: qk */
            public static C6022a m55999qk(C6021b bVar) {
                return (C6022a) DEFAULT_INSTANCE.mo43358gj(bVar);
            }

            /* renamed from: rk */
            public static C6021b m56000rk(InputStream inputStream) throws IOException {
                return (C6021b) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: sk */
            public static C6021b m56001sk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6021b) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: tk */
            public static C6021b m56002tk(C5173er erVar) throws nt1 {
                return (C6021b) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
            }

            /* renamed from: uk */
            public static C6021b m56003uk(C5173er erVar, zy0 zy0) throws nt1 {
                return (C6021b) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
            }

            /* renamed from: vk */
            public static C6021b m56004vk(g00 g00) throws IOException {
                return (C6021b) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
            }

            /* renamed from: wk */
            public static C6021b m56005wk(g00 g00, zy0 zy0) throws IOException {
                return (C6021b) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
            }

            /* renamed from: xk */
            public static C6021b m56006xk(InputStream inputStream) throws IOException {
                return (C6021b) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: yk */
            public static C6021b m56007yk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6021b) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: zk */
            public static C6021b m56008zk(ByteBuffer byteBuffer) throws nt1 {
                return (C6021b) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
            }

            /* renamed from: Ek */
            public final void mo40020Ek(int i, double d) {
                mo40027nk();
                this.bounds_.mo34592q0(i, d);
            }

            /* renamed from: Pc */
            public double mo40021Pc(int i) {
                return this.bounds_.getDouble(i);
            }

            /* renamed from: dh */
            public List<Double> mo40022dh() {
                return this.bounds_;
            }

            /* renamed from: j2 */
            public int mo40023j2() {
                return this.bounds_.size();
            }

            /* renamed from: jj */
            public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
                switch (C6018a.f31731a[iVar.ordinal()]) {
                    case 1:
                        return new C6021b();
                    case 2:
                        return new C6022a((C6018a) null);
                    case 3:
                        return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        cz2<C6021b> cz2 = PARSER;
                        if (cz2 == null) {
                            synchronized (C6021b.class) {
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

            /* renamed from: kk */
            public final void mo40024kk(Iterable<? extends Double> iterable) {
                mo40027nk();
                C7403z0.m72412X6(iterable, this.bounds_);
            }

            /* renamed from: lk */
            public final void mo40025lk(double d) {
                mo40027nk();
                this.bounds_.mo34579V0(d);
            }

            /* renamed from: mk */
            public final void mo40026mk() {
                this.bounds_ = qe1.m62495lj();
            }

            /* renamed from: nk */
            public final void mo40027nk() {
                vs1.C7080b bVar = this.bounds_;
                if (!bVar.mo36500p()) {
                    this.bounds_ = qe1.m62464Bj(bVar);
                }
            }
        }

        /* renamed from: com.onedelhi.secure.ln0$b$c */
        public interface C6023c extends zh2 {
            /* renamed from: Pc */
            double mo40021Pc(int i);

            /* renamed from: dh */
            List<Double> mo40022dh();

            /* renamed from: j2 */
            int mo40023j2();
        }

        /* renamed from: com.onedelhi.secure.ln0$b$d */
        public static final class C6024d extends qe1<C6024d, C6025a> implements C6026e {
            /* access modifiers changed from: private */
            public static final C6024d DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile cz2<C6024d> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            /* renamed from: com.onedelhi.secure.ln0$b$d$a */
            public static final class C6025a extends qe1.C6546b<C6024d, C6025a> implements C6026e {
                public C6025a() {
                    super(C6024d.DEFAULT_INSTANCE);
                }

                public /* synthetic */ C6025a(C6018a aVar) {
                    this();
                }

                /* renamed from: B1 */
                public int mo40032B1() {
                    return ((C6024d) this.f34068b).mo40032B1();
                }

                /* renamed from: Gj */
                public C6025a mo40041Gj() {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40038mk();
                    return this;
                }

                /* renamed from: Hj */
                public C6025a mo40042Hj() {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40039nk();
                    return this;
                }

                /* renamed from: Ij */
                public C6025a mo40043Ij() {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40040ok();
                    return this;
                }

                /* renamed from: Jj */
                public C6025a mo40044Jj(double d) {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40033Fk(d);
                    return this;
                }

                /* renamed from: Kj */
                public C6025a mo40045Kj(int i) {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40034Gk(i);
                    return this;
                }

                /* renamed from: Lj */
                public C6025a mo40046Lj(double d) {
                    mo43393xj();
                    ((C6024d) this.f34068b).mo40035Hk(d);
                    return this;
                }

                /* renamed from: Yf */
                public double mo40036Yf() {
                    return ((C6024d) this.f34068b).mo40036Yf();
                }

                /* renamed from: m2 */
                public double mo40037m2() {
                    return ((C6024d) this.f34068b).mo40037m2();
                }
            }

            static {
                C6024d dVar = new C6024d();
                DEFAULT_INSTANCE = dVar;
                qe1.m62492dk(C6024d.class, dVar);
            }

            /* renamed from: Ak */
            public static C6024d m56028Ak(ByteBuffer byteBuffer) throws nt1 {
                return (C6024d) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
            }

            /* renamed from: Bk */
            public static C6024d m56029Bk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
                return (C6024d) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
            }

            /* renamed from: Ck */
            public static C6024d m56030Ck(byte[] bArr) throws nt1 {
                return (C6024d) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
            }

            /* renamed from: Dk */
            public static C6024d m56031Dk(byte[] bArr, zy0 zy0) throws nt1 {
                return (C6024d) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
            }

            /* renamed from: Ek */
            public static cz2<C6024d> m56032Ek() {
                return DEFAULT_INSTANCE.mo43348Tc();
            }

            /* renamed from: pk */
            public static C6024d m56040pk() {
                return DEFAULT_INSTANCE;
            }

            /* renamed from: qk */
            public static C6025a m56041qk() {
                return (C6025a) DEFAULT_INSTANCE.mo43357fj();
            }

            /* renamed from: rk */
            public static C6025a m56042rk(C6024d dVar) {
                return (C6025a) DEFAULT_INSTANCE.mo43358gj(dVar);
            }

            /* renamed from: sk */
            public static C6024d m56043sk(InputStream inputStream) throws IOException {
                return (C6024d) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: tk */
            public static C6024d m56044tk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6024d) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: uk */
            public static C6024d m56045uk(C5173er erVar) throws nt1 {
                return (C6024d) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
            }

            /* renamed from: vk */
            public static C6024d m56046vk(C5173er erVar, zy0 zy0) throws nt1 {
                return (C6024d) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
            }

            /* renamed from: wk */
            public static C6024d m56047wk(g00 g00) throws IOException {
                return (C6024d) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
            }

            /* renamed from: xk */
            public static C6024d m56048xk(g00 g00, zy0 zy0) throws IOException {
                return (C6024d) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
            }

            /* renamed from: yk */
            public static C6024d m56049yk(InputStream inputStream) throws IOException {
                return (C6024d) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: zk */
            public static C6024d m56050zk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6024d) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: B1 */
            public int mo40032B1() {
                return this.numFiniteBuckets_;
            }

            /* renamed from: Fk */
            public final void mo40033Fk(double d) {
                this.growthFactor_ = d;
            }

            /* renamed from: Gk */
            public final void mo40034Gk(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* renamed from: Hk */
            public final void mo40035Hk(double d) {
                this.scale_ = d;
            }

            /* renamed from: Yf */
            public double mo40036Yf() {
                return this.growthFactor_;
            }

            /* renamed from: jj */
            public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
                switch (C6018a.f31731a[iVar.ordinal()]) {
                    case 1:
                        return new C6024d();
                    case 2:
                        return new C6025a((C6018a) null);
                    case 3:
                        return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        cz2<C6024d> cz2 = PARSER;
                        if (cz2 == null) {
                            synchronized (C6024d.class) {
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

            /* renamed from: m2 */
            public double mo40037m2() {
                return this.scale_;
            }

            /* renamed from: mk */
            public final void mo40038mk() {
                this.growthFactor_ = 0.0d;
            }

            /* renamed from: nk */
            public final void mo40039nk() {
                this.numFiniteBuckets_ = 0;
            }

            /* renamed from: ok */
            public final void mo40040ok() {
                this.scale_ = 0.0d;
            }
        }

        /* renamed from: com.onedelhi.secure.ln0$b$e */
        public interface C6026e extends zh2 {
            /* renamed from: B1 */
            int mo40032B1();

            /* renamed from: Yf */
            double mo40036Yf();

            /* renamed from: m2 */
            double mo40037m2();
        }

        /* renamed from: com.onedelhi.secure.ln0$b$f */
        public static final class C6027f extends qe1<C6027f, C6028a> implements C6029g {
            /* access modifiers changed from: private */
            public static final C6027f DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile cz2<C6027f> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            /* renamed from: com.onedelhi.secure.ln0$b$f$a */
            public static final class C6028a extends qe1.C6546b<C6027f, C6028a> implements C6029g {
                public C6028a() {
                    super(C6027f.DEFAULT_INSTANCE);
                }

                public /* synthetic */ C6028a(C6018a aVar) {
                    this();
                }

                /* renamed from: B1 */
                public int mo40047B1() {
                    return ((C6027f) this.f34068b).mo40047B1();
                }

                /* renamed from: Gj */
                public C6028a mo40056Gj() {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40052mk();
                    return this;
                }

                /* renamed from: Hj */
                public C6028a mo40057Hj() {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40053nk();
                    return this;
                }

                /* renamed from: Ij */
                public C6028a mo40058Ij() {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40054ok();
                    return this;
                }

                /* renamed from: Jj */
                public C6028a mo40059Jj(int i) {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40048Fk(i);
                    return this;
                }

                /* renamed from: Kj */
                public C6028a mo40060Kj(double d) {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40049Gk(d);
                    return this;
                }

                /* renamed from: Lj */
                public C6028a mo40061Lj(double d) {
                    mo43393xj();
                    ((C6027f) this.f34068b).mo40050Hk(d);
                    return this;
                }

                /* renamed from: lb */
                public double mo40051lb() {
                    return ((C6027f) this.f34068b).mo40051lb();
                }

                /* renamed from: tf */
                public double mo40055tf() {
                    return ((C6027f) this.f34068b).mo40055tf();
                }
            }

            static {
                C6027f fVar = new C6027f();
                DEFAULT_INSTANCE = fVar;
                qe1.m62492dk(C6027f.class, fVar);
            }

            /* renamed from: Ak */
            public static C6027f m56073Ak(ByteBuffer byteBuffer) throws nt1 {
                return (C6027f) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
            }

            /* renamed from: Bk */
            public static C6027f m56074Bk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
                return (C6027f) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
            }

            /* renamed from: Ck */
            public static C6027f m56075Ck(byte[] bArr) throws nt1 {
                return (C6027f) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
            }

            /* renamed from: Dk */
            public static C6027f m56076Dk(byte[] bArr, zy0 zy0) throws nt1 {
                return (C6027f) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
            }

            /* renamed from: Ek */
            public static cz2<C6027f> m56077Ek() {
                return DEFAULT_INSTANCE.mo43348Tc();
            }

            /* renamed from: pk */
            public static C6027f m56085pk() {
                return DEFAULT_INSTANCE;
            }

            /* renamed from: qk */
            public static C6028a m56086qk() {
                return (C6028a) DEFAULT_INSTANCE.mo43357fj();
            }

            /* renamed from: rk */
            public static C6028a m56087rk(C6027f fVar) {
                return (C6028a) DEFAULT_INSTANCE.mo43358gj(fVar);
            }

            /* renamed from: sk */
            public static C6027f m56088sk(InputStream inputStream) throws IOException {
                return (C6027f) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: tk */
            public static C6027f m56089tk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6027f) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: uk */
            public static C6027f m56090uk(C5173er erVar) throws nt1 {
                return (C6027f) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
            }

            /* renamed from: vk */
            public static C6027f m56091vk(C5173er erVar, zy0 zy0) throws nt1 {
                return (C6027f) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
            }

            /* renamed from: wk */
            public static C6027f m56092wk(g00 g00) throws IOException {
                return (C6027f) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
            }

            /* renamed from: xk */
            public static C6027f m56093xk(g00 g00, zy0 zy0) throws IOException {
                return (C6027f) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
            }

            /* renamed from: yk */
            public static C6027f m56094yk(InputStream inputStream) throws IOException {
                return (C6027f) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
            }

            /* renamed from: zk */
            public static C6027f m56095zk(InputStream inputStream, zy0 zy0) throws IOException {
                return (C6027f) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
            }

            /* renamed from: B1 */
            public int mo40047B1() {
                return this.numFiniteBuckets_;
            }

            /* renamed from: Fk */
            public final void mo40048Fk(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* renamed from: Gk */
            public final void mo40049Gk(double d) {
                this.offset_ = d;
            }

            /* renamed from: Hk */
            public final void mo40050Hk(double d) {
                this.width_ = d;
            }

            /* renamed from: jj */
            public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
                switch (C6018a.f31731a[iVar.ordinal()]) {
                    case 1:
                        return new C6027f();
                    case 2:
                        return new C6028a((C6018a) null);
                    case 3:
                        return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        cz2<C6027f> cz2 = PARSER;
                        if (cz2 == null) {
                            synchronized (C6027f.class) {
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

            /* renamed from: lb */
            public double mo40051lb() {
                return this.offset_;
            }

            /* renamed from: mk */
            public final void mo40052mk() {
                this.numFiniteBuckets_ = 0;
            }

            /* renamed from: nk */
            public final void mo40053nk() {
                this.offset_ = 0.0d;
            }

            /* renamed from: ok */
            public final void mo40054ok() {
                this.width_ = 0.0d;
            }

            /* renamed from: tf */
            public double mo40055tf() {
                return this.width_;
            }
        }

        /* renamed from: com.onedelhi.secure.ln0$b$g */
        public interface C6029g extends zh2 {
            /* renamed from: B1 */
            int mo40047B1();

            /* renamed from: lb */
            double mo40051lb();

            /* renamed from: tf */
            double mo40055tf();
        }

        /* renamed from: com.onedelhi.secure.ln0$b$h */
        public enum C6030h {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);
            

            /* renamed from: n */
            public final int f31737n;

            /* access modifiers changed from: public */
            C6030h(int i) {
                this.f31737n = i;
            }

            /* renamed from: a */
            public static C6030h m56118a(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            @Deprecated
            /* renamed from: b */
            public static C6030h m56119b(int i) {
                return m56118a(i);
            }

            /* renamed from: j */
            public int mo40062j() {
                return this.f31737n;
            }
        }

        static {
            C6019b bVar = new C6019b();
            DEFAULT_INSTANCE = bVar;
            qe1.m62492dk(C6019b.class, bVar);
        }

        /* renamed from: Ak */
        public static C6019b m55923Ak(InputStream inputStream) throws IOException {
            return (C6019b) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Bk */
        public static C6019b m55924Bk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6019b) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Ck */
        public static C6019b m55925Ck(C5173er erVar) throws nt1 {
            return (C6019b) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Dk */
        public static C6019b m55926Dk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6019b) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Ek */
        public static C6019b m55927Ek(g00 g00) throws IOException {
            return (C6019b) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Fk */
        public static C6019b m55928Fk(g00 g00, zy0 zy0) throws IOException {
            return (C6019b) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Gk */
        public static C6019b m55929Gk(InputStream inputStream) throws IOException {
            return (C6019b) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Hk */
        public static C6019b m55930Hk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6019b) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Ik */
        public static C6019b m55931Ik(ByteBuffer byteBuffer) throws nt1 {
            return (C6019b) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Jk */
        public static C6019b m55932Jk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6019b) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Kk */
        public static C6019b m55933Kk(byte[] bArr) throws nt1 {
            return (C6019b) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Lk */
        public static C6019b m55934Lk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6019b) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Mk */
        public static cz2<C6019b> m55935Mk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: uk */
        public static C6019b m55947uk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: yk */
        public static C6020a m55948yk() {
            return (C6020a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: zk */
        public static C6020a m55949zk(C6019b bVar) {
            return (C6020a) DEFAULT_INSTANCE.mo43358gj(bVar);
        }

        /* renamed from: B2 */
        public C6030h mo39990B2() {
            return C6030h.m56118a(this.optionsCase_);
        }

        /* renamed from: Nk */
        public final void mo39991Nk(C6021b bVar) {
            bVar.getClass();
            this.options_ = bVar;
            this.optionsCase_ = 3;
        }

        /* renamed from: Ok */
        public final void mo39992Ok(C6024d dVar) {
            dVar.getClass();
            this.options_ = dVar;
            this.optionsCase_ = 2;
        }

        /* renamed from: Pk */
        public final void mo39993Pk(C6027f fVar) {
            fVar.getClass();
            this.options_ = fVar;
            this.optionsCase_ = 1;
        }

        /* renamed from: bc */
        public boolean mo39994bc() {
            return this.optionsCase_ == 3;
        }

        /* renamed from: ee */
        public C6027f mo39995ee() {
            return this.optionsCase_ == 1 ? (C6027f) this.options_ : C6027f.m56085pk();
        }

        /* renamed from: ga */
        public C6021b mo39996ga() {
            return this.optionsCase_ == 3 ? (C6021b) this.options_ : C6021b.m55997ok();
        }

        /* renamed from: ie */
        public C6024d mo39997ie() {
            return this.optionsCase_ == 2 ? (C6024d) this.options_ : C6024d.m56040pk();
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6018a.f31731a[iVar.ordinal()]) {
                case 1:
                    return new C6019b();
                case 2:
                    return new C6020a((C6018a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", C6027f.class, C6024d.class, C6021b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6019b> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6019b.class) {
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

        /* renamed from: li */
        public boolean mo39998li() {
            return this.optionsCase_ == 1;
        }

        /* renamed from: m9 */
        public boolean mo39999m9() {
            return this.optionsCase_ == 2;
        }

        /* renamed from: qk */
        public final void mo40000qk() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* renamed from: rk */
        public final void mo40001rk() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* renamed from: sk */
        public final void mo40002sk() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* renamed from: tk */
        public final void mo40003tk() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        /* renamed from: vk */
        public final void mo40004vk(C6021b bVar) {
            bVar.getClass();
            zh2 zh2 = bVar;
            if (this.optionsCase_ == 3) {
                zh2 = bVar;
                if (this.options_ != C6021b.m55997ok()) {
                    zh2 = ((C6021b.C6022a) C6021b.m55999qk((C6021b) this.options_).mo43372Cj(bVar)).mo43377Ja();
                }
            }
            this.options_ = zh2;
            this.optionsCase_ = 3;
        }

        /* renamed from: wk */
        public final void mo40005wk(C6024d dVar) {
            dVar.getClass();
            zh2 zh2 = dVar;
            if (this.optionsCase_ == 2) {
                zh2 = dVar;
                if (this.options_ != C6024d.m56040pk()) {
                    zh2 = ((C6024d.C6025a) C6024d.m56042rk((C6024d) this.options_).mo43372Cj(dVar)).mo43377Ja();
                }
            }
            this.options_ = zh2;
            this.optionsCase_ = 2;
        }

        /* renamed from: xk */
        public final void mo40006xk(C6027f fVar) {
            fVar.getClass();
            zh2 zh2 = fVar;
            if (this.optionsCase_ == 1) {
                zh2 = fVar;
                if (this.options_ != C6027f.m56085pk()) {
                    zh2 = ((C6027f.C6028a) C6027f.m56087rk((C6027f) this.options_).mo43372Cj(fVar)).mo43377Ja();
                }
            }
            this.options_ = zh2;
            this.optionsCase_ = 1;
        }
    }

    /* renamed from: com.onedelhi.secure.ln0$c */
    public interface C6031c extends zh2 {
        /* renamed from: B2 */
        C6019b.C6030h mo39990B2();

        /* renamed from: bc */
        boolean mo39994bc();

        /* renamed from: ee */
        C6019b.C6027f mo39995ee();

        /* renamed from: ga */
        C6019b.C6021b mo39996ga();

        /* renamed from: ie */
        C6019b.C6024d mo39997ie();

        /* renamed from: li */
        boolean mo39998li();

        /* renamed from: m9 */
        boolean mo39999m9();
    }

    /* renamed from: com.onedelhi.secure.ln0$d */
    public static final class C6032d extends qe1.C6546b<ln0, C6032d> implements mn0 {
        public C6032d() {
            super(ln0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6032d(C6018a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6032d mo40063Gj(Iterable<? extends Long> iterable) {
            mo43393xj();
            ((ln0) this.f34068b).mo39951Ck(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6032d mo40064Hj(Iterable<? extends C6033e> iterable) {
            mo43393xj();
            ((ln0) this.f34068b).mo39952Dk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6032d mo40065Ij(long j) {
            mo43393xj();
            ((ln0) this.f34068b).mo39953Ek(j);
            return this;
        }

        /* renamed from: Jj */
        public C6032d mo40066Jj(int i, C6033e.C6034a aVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39954Fk(i, (C6033e) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6032d mo40067Kj(int i, C6033e eVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39954Fk(i, eVar);
            return this;
        }

        /* renamed from: L7 */
        public int mo39960L7() {
            return ((ln0) this.f34068b).mo39960L7();
        }

        /* renamed from: Lj */
        public C6032d mo40068Lj(C6033e.C6034a aVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39955Gk((C6033e) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Mb */
        public List<Long> mo39962Mb() {
            return Collections.unmodifiableList(((ln0) this.f34068b).mo39962Mb());
        }

        /* renamed from: Mj */
        public C6032d mo40069Mj(C6033e eVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39955Gk(eVar);
            return this;
        }

        /* renamed from: Nj */
        public C6032d mo40070Nj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39956Hk();
            return this;
        }

        /* renamed from: Oi */
        public List<C6033e> mo39965Oi() {
            return Collections.unmodifiableList(((ln0) this.f34068b).mo39965Oi());
        }

        /* renamed from: Oj */
        public C6032d mo40071Oj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39957Ik();
            return this;
        }

        /* renamed from: Pj */
        public C6032d mo40072Pj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39958Jk();
            return this;
        }

        /* renamed from: Qj */
        public C6032d mo40073Qj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39959Kk();
            return this;
        }

        /* renamed from: Rj */
        public C6032d mo40074Rj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39961Lk();
            return this;
        }

        /* renamed from: Sj */
        public C6032d mo40075Sj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39963Mk();
            return this;
        }

        /* renamed from: Tj */
        public C6032d mo40076Tj() {
            mo43393xj();
            ((ln0) this.f34068b).mo39964Nk();
            return this;
        }

        /* renamed from: Uj */
        public C6032d mo40077Uj(C6019b bVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39970Tk(bVar);
            return this;
        }

        /* renamed from: Vj */
        public C6032d mo40078Vj(C6036g gVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39971Uk(gVar);
            return this;
        }

        /* renamed from: Wj */
        public C6032d mo40079Wj(int i) {
            mo43393xj();
            ((ln0) this.f34068b).mo39976kl(i);
            return this;
        }

        /* renamed from: Xj */
        public C6032d mo40080Xj(int i, long j) {
            mo43393xj();
            ((ln0) this.f34068b).mo39977ll(i, j);
            return this;
        }

        /* renamed from: Yj */
        public C6032d mo40081Yj(C6019b.C6020a aVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39980ml((C6019b) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Z6 */
        public boolean mo39972Z6() {
            return ((ln0) this.f34068b).mo39972Z6();
        }

        /* renamed from: Zj */
        public C6032d mo40082Zj(C6019b bVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39980ml(bVar);
            return this;
        }

        /* renamed from: ag */
        public double mo39973ag() {
            return ((ln0) this.f34068b).mo39973ag();
        }

        /* renamed from: ak */
        public C6032d mo40083ak(long j) {
            mo43393xj();
            ((ln0) this.f34068b).mo39981nl(j);
            return this;
        }

        /* renamed from: b3 */
        public C6036g mo39974b3() {
            return ((ln0) this.f34068b).mo39974b3();
        }

        /* renamed from: bk */
        public C6032d mo40084bk(int i, C6033e.C6034a aVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39982ol(i, (C6033e) aVar.mo43381ab());
            return this;
        }

        /* renamed from: ck */
        public C6032d mo40085ck(int i, C6033e eVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39982ol(i, eVar);
            return this;
        }

        /* renamed from: dk */
        public C6032d mo40086dk(double d) {
            mo43393xj();
            ((ln0) this.f34068b).mo39983pl(d);
            return this;
        }

        /* renamed from: e7 */
        public double mo39975e7() {
            return ((ln0) this.f34068b).mo39975e7();
        }

        /* renamed from: ek */
        public C6032d mo40087ek(C6036g.C6037a aVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39984ql((C6036g) aVar.mo43381ab());
            return this;
        }

        /* renamed from: fk */
        public C6032d mo40088fk(C6036g gVar) {
            mo43393xj();
            ((ln0) this.f34068b).mo39984ql(gVar);
            return this;
        }

        /* renamed from: gk */
        public C6032d mo40089gk(double d) {
            mo43393xj();
            ((ln0) this.f34068b).mo39986rl(d);
            return this;
        }

        /* renamed from: me */
        public long mo39978me() {
            return ((ln0) this.f34068b).mo39978me();
        }

        /* renamed from: mh */
        public boolean mo39979mh() {
            return ((ln0) this.f34068b).mo39979mh();
        }

        /* renamed from: rb */
        public C6033e mo39985rb(int i) {
            return ((ln0) this.f34068b).mo39985rb(i);
        }

        /* renamed from: v4 */
        public int mo39987v4() {
            return ((ln0) this.f34068b).mo39987v4();
        }

        /* renamed from: z8 */
        public C6019b mo39988z8() {
            return ((ln0) this.f34068b).mo39988z8();
        }

        /* renamed from: zf */
        public long mo39989zf(int i) {
            return ((ln0) this.f34068b).mo39989zf(i);
        }
    }

    /* renamed from: com.onedelhi.secure.ln0$e */
    public static final class C6033e extends qe1<C6033e, C6034a> implements C6035f {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final C6033e DEFAULT_INSTANCE;
        private static volatile cz2<C6033e> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private vs1.C7095k<C6248o7> attachments_ = qe1.m62499pj();
        private se4 timestamp_;
        private double value_;

        /* renamed from: com.onedelhi.secure.ln0$e$a */
        public static final class C6034a extends qe1.C6546b<C6033e, C6034a> implements C6035f {
            public C6034a() {
                super(C6033e.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6034a(C6018a aVar) {
                this();
            }

            /* renamed from: Gj */
            public C6034a mo40110Gj(Iterable<? extends C6248o7> iterable) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40101rk(iterable);
                return this;
            }

            /* renamed from: Hj */
            public C6034a mo40111Hj(int i, C6248o7.C6250b bVar) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40102sk(i, (C6248o7) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Ij */
            public C6034a mo40112Ij(int i, C6248o7 o7Var) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40102sk(i, o7Var);
                return this;
            }

            /* renamed from: Jj */
            public C6034a mo40113Jj(C6248o7.C6250b bVar) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40103tk((C6248o7) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Kj */
            public C6034a mo40114Kj(C6248o7 o7Var) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40103tk(o7Var);
                return this;
            }

            /* renamed from: Lj */
            public C6034a mo40115Lj() {
                mo43393xj();
                ((C6033e) this.f34068b).mo40104uk();
                return this;
            }

            /* renamed from: Mj */
            public C6034a mo40116Mj() {
                mo43393xj();
                ((C6033e) this.f34068b).mo40105vk();
                return this;
            }

            /* renamed from: Nj */
            public C6034a mo40117Nj() {
                mo43393xj();
                ((C6033e) this.f34068b).mo40106wk();
                return this;
            }

            /* renamed from: Oe */
            public List<C6248o7> mo40091Oe() {
                return Collections.unmodifiableList(((C6033e) this.f34068b).mo40091Oe());
            }

            /* renamed from: Oj */
            public C6034a mo40118Oj(se4 se4) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40090Bk(se4);
                return this;
            }

            /* renamed from: Pj */
            public C6034a mo40119Pj(int i) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40092Rk(i);
                return this;
            }

            /* renamed from: Qj */
            public C6034a mo40120Qj(int i, C6248o7.C6250b bVar) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40094Sk(i, (C6248o7) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Rj */
            public C6034a mo40121Rj(int i, C6248o7 o7Var) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40094Sk(i, o7Var);
                return this;
            }

            /* renamed from: Sa */
            public boolean mo40093Sa() {
                return ((C6033e) this.f34068b).mo40093Sa();
            }

            /* renamed from: Sj */
            public C6034a mo40122Sj(se4.C6760b bVar) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40095Tk((se4) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Tj */
            public C6034a mo40123Tj(se4 se4) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40095Tk(se4);
                return this;
            }

            /* renamed from: Uj */
            public C6034a mo40124Uj(double d) {
                mo43393xj();
                ((C6033e) this.f34068b).mo40096Uk(d);
                return this;
            }

            /* renamed from: c2 */
            public double mo40097c2() {
                return ((C6033e) this.f34068b).mo40097c2();
            }

            /* renamed from: c9 */
            public int mo40098c9() {
                return ((C6033e) this.f34068b).mo40098c9();
            }

            /* renamed from: cb */
            public se4 mo40099cb() {
                return ((C6033e) this.f34068b).mo40099cb();
            }

            /* renamed from: n3 */
            public C6248o7 mo40100n3(int i) {
                return ((C6033e) this.f34068b).mo40100n3(i);
            }
        }

        static {
            C6033e eVar = new C6033e();
            DEFAULT_INSTANCE = eVar;
            qe1.m62492dk(C6033e.class, eVar);
        }

        /* renamed from: Ak */
        public static C6033e m56168Ak() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: Ck */
        public static C6034a m56169Ck() {
            return (C6034a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: Dk */
        public static C6034a m56170Dk(C6033e eVar) {
            return (C6034a) DEFAULT_INSTANCE.mo43358gj(eVar);
        }

        /* renamed from: Ek */
        public static C6033e m56171Ek(InputStream inputStream) throws IOException {
            return (C6033e) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Fk */
        public static C6033e m56172Fk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6033e) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Gk */
        public static C6033e m56173Gk(C5173er erVar) throws nt1 {
            return (C6033e) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Hk */
        public static C6033e m56174Hk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6033e) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Ik */
        public static C6033e m56175Ik(g00 g00) throws IOException {
            return (C6033e) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Jk */
        public static C6033e m56176Jk(g00 g00, zy0 zy0) throws IOException {
            return (C6033e) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Kk */
        public static C6033e m56177Kk(InputStream inputStream) throws IOException {
            return (C6033e) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Lk */
        public static C6033e m56178Lk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6033e) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Mk */
        public static C6033e m56179Mk(ByteBuffer byteBuffer) throws nt1 {
            return (C6033e) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Nk */
        public static C6033e m56180Nk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6033e) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Ok */
        public static C6033e m56181Ok(byte[] bArr) throws nt1 {
            return (C6033e) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Pk */
        public static C6033e m56182Pk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6033e) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Qk */
        public static cz2<C6033e> m56183Qk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: Bk */
        public final void mo40090Bk(se4 se4) {
            se4.getClass();
            se4 se42 = this.timestamp_;
            if (!(se42 == null || se42 == se4.m64493mk())) {
                se4 = (se4) ((se4.C6760b) se4.m64495ok(this.timestamp_).mo43372Cj(se4)).mo43377Ja();
            }
            this.timestamp_ = se4;
        }

        /* renamed from: Oe */
        public List<C6248o7> mo40091Oe() {
            return this.attachments_;
        }

        /* renamed from: Rk */
        public final void mo40092Rk(int i) {
            mo40107xk();
            this.attachments_.remove(i);
        }

        /* renamed from: Sa */
        public boolean mo40093Sa() {
            return this.timestamp_ != null;
        }

        /* renamed from: Sk */
        public final void mo40094Sk(int i, C6248o7 o7Var) {
            o7Var.getClass();
            mo40107xk();
            this.attachments_.set(i, o7Var);
        }

        /* renamed from: Tk */
        public final void mo40095Tk(se4 se4) {
            se4.getClass();
            this.timestamp_ = se4;
        }

        /* renamed from: Uk */
        public final void mo40096Uk(double d) {
            this.value_ = d;
        }

        /* renamed from: c2 */
        public double mo40097c2() {
            return this.value_;
        }

        /* renamed from: c9 */
        public int mo40098c9() {
            return this.attachments_.size();
        }

        /* renamed from: cb */
        public se4 mo40099cb() {
            se4 se4 = this.timestamp_;
            return se4 == null ? se4.m64493mk() : se4;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6018a.f31731a[iVar.ordinal()]) {
                case 1:
                    return new C6033e();
                case 2:
                    return new C6034a((C6018a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", C6248o7.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6033e> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6033e.class) {
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

        /* renamed from: n3 */
        public C6248o7 mo40100n3(int i) {
            return this.attachments_.get(i);
        }

        /* renamed from: rk */
        public final void mo40101rk(Iterable<? extends C6248o7> iterable) {
            mo40107xk();
            C7403z0.m72412X6(iterable, this.attachments_);
        }

        /* renamed from: sk */
        public final void mo40102sk(int i, C6248o7 o7Var) {
            o7Var.getClass();
            mo40107xk();
            this.attachments_.add(i, o7Var);
        }

        /* renamed from: tk */
        public final void mo40103tk(C6248o7 o7Var) {
            o7Var.getClass();
            mo40107xk();
            this.attachments_.add(o7Var);
        }

        /* renamed from: uk */
        public final void mo40104uk() {
            this.attachments_ = qe1.m62499pj();
        }

        /* renamed from: vk */
        public final void mo40105vk() {
            this.timestamp_ = null;
        }

        /* renamed from: wk */
        public final void mo40106wk() {
            this.value_ = 0.0d;
        }

        /* renamed from: xk */
        public final void mo40107xk() {
            vs1.C7095k<C6248o7> kVar = this.attachments_;
            if (!kVar.mo36500p()) {
                this.attachments_ = qe1.m62468Fj(kVar);
            }
        }

        /* renamed from: yk */
        public C6514q7 mo40108yk(int i) {
            return this.attachments_.get(i);
        }

        /* renamed from: zk */
        public List<? extends C6514q7> mo40109zk() {
            return this.attachments_;
        }
    }

    /* renamed from: com.onedelhi.secure.ln0$f */
    public interface C6035f extends zh2 {
        /* renamed from: Oe */
        List<C6248o7> mo40091Oe();

        /* renamed from: Sa */
        boolean mo40093Sa();

        /* renamed from: c2 */
        double mo40097c2();

        /* renamed from: c9 */
        int mo40098c9();

        /* renamed from: cb */
        se4 mo40099cb();

        /* renamed from: n3 */
        C6248o7 mo40100n3(int i);
    }

    /* renamed from: com.onedelhi.secure.ln0$g */
    public static final class C6036g extends qe1<C6036g, C6037a> implements C6038h {
        /* access modifiers changed from: private */
        public static final C6036g DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile cz2<C6036g> PARSER;
        private double max_;
        private double min_;

        /* renamed from: com.onedelhi.secure.ln0$g$a */
        public static final class C6037a extends qe1.C6546b<C6036g, C6037a> implements C6038h {
            public C6037a() {
                super(C6036g.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6037a(C6018a aVar) {
                this();
            }

            /* renamed from: E9 */
            public double mo40127E9() {
                return ((C6036g) this.f34068b).mo40127E9();
            }

            /* renamed from: Gj */
            public C6037a mo40131Gj() {
                mo43393xj();
                ((C6036g) this.f34068b).mo40129kk();
                return this;
            }

            /* renamed from: Hj */
            public C6037a mo40132Hj() {
                mo43393xj();
                ((C6036g) this.f34068b).mo40130lk();
                return this;
            }

            /* renamed from: Ij */
            public C6037a mo40133Ij(double d) {
                mo43393xj();
                ((C6036g) this.f34068b).mo40125Ck(d);
                return this;
            }

            /* renamed from: Jj */
            public C6037a mo40134Jj(double d) {
                mo43393xj();
                ((C6036g) this.f34068b).mo40126Dk(d);
                return this;
            }

            /* renamed from: V9 */
            public double mo40128V9() {
                return ((C6036g) this.f34068b).mo40128V9();
            }
        }

        static {
            C6036g gVar = new C6036g();
            DEFAULT_INSTANCE = gVar;
            qe1.m62492dk(C6036g.class, gVar);
        }

        /* renamed from: Ak */
        public static C6036g m56244Ak(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6036g) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Bk */
        public static cz2<C6036g> m56245Bk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: mk */
        public static C6036g m56251mk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: nk */
        public static C6037a m56252nk() {
            return (C6037a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: ok */
        public static C6037a m56253ok(C6036g gVar) {
            return (C6037a) DEFAULT_INSTANCE.mo43358gj(gVar);
        }

        /* renamed from: pk */
        public static C6036g m56254pk(InputStream inputStream) throws IOException {
            return (C6036g) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: qk */
        public static C6036g m56255qk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6036g) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: rk */
        public static C6036g m56256rk(C5173er erVar) throws nt1 {
            return (C6036g) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: sk */
        public static C6036g m56257sk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6036g) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: tk */
        public static C6036g m56258tk(g00 g00) throws IOException {
            return (C6036g) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: uk */
        public static C6036g m56259uk(g00 g00, zy0 zy0) throws IOException {
            return (C6036g) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: vk */
        public static C6036g m56260vk(InputStream inputStream) throws IOException {
            return (C6036g) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: wk */
        public static C6036g m56261wk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6036g) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: xk */
        public static C6036g m56262xk(ByteBuffer byteBuffer) throws nt1 {
            return (C6036g) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: yk */
        public static C6036g m56263yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6036g) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: zk */
        public static C6036g m56264zk(byte[] bArr) throws nt1 {
            return (C6036g) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ck */
        public final void mo40125Ck(double d) {
            this.max_ = d;
        }

        /* renamed from: Dk */
        public final void mo40126Dk(double d) {
            this.min_ = d;
        }

        /* renamed from: E9 */
        public double mo40127E9() {
            return this.min_;
        }

        /* renamed from: V9 */
        public double mo40128V9() {
            return this.max_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6018a.f31731a[iVar.ordinal()]) {
                case 1:
                    return new C6036g();
                case 2:
                    return new C6037a((C6018a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6036g> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6036g.class) {
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

        /* renamed from: kk */
        public final void mo40129kk() {
            this.max_ = 0.0d;
        }

        /* renamed from: lk */
        public final void mo40130lk() {
            this.min_ = 0.0d;
        }
    }

    /* renamed from: com.onedelhi.secure.ln0$h */
    public interface C6038h extends zh2 {
        /* renamed from: E9 */
        double mo40127E9();

        /* renamed from: V9 */
        double mo40128V9();
    }

    static {
        ln0 ln0 = new ln0();
        DEFAULT_INSTANCE = ln0;
        qe1.m62492dk(ln0.class, ln0);
    }

    /* renamed from: Qk */
    public static ln0 m55846Qk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Vk */
    public static C6032d m55847Vk() {
        return (C6032d) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Wk */
    public static C6032d m55848Wk(ln0 ln0) {
        return (C6032d) DEFAULT_INSTANCE.mo43358gj(ln0);
    }

    /* renamed from: Xk */
    public static ln0 m55849Xk(InputStream inputStream) throws IOException {
        return (ln0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Yk */
    public static ln0 m55850Yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ln0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Zk */
    public static ln0 m55851Zk(C5173er erVar) throws nt1 {
        return (ln0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: al */
    public static ln0 m55852al(C5173er erVar, zy0 zy0) throws nt1 {
        return (ln0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: bl */
    public static ln0 m55853bl(g00 g00) throws IOException {
        return (ln0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: cl */
    public static ln0 m55854cl(g00 g00, zy0 zy0) throws IOException {
        return (ln0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: dl */
    public static ln0 m55855dl(InputStream inputStream) throws IOException {
        return (ln0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: el */
    public static ln0 m55856el(InputStream inputStream, zy0 zy0) throws IOException {
        return (ln0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: fl */
    public static ln0 m55858fl(ByteBuffer byteBuffer) throws nt1 {
        return (ln0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: gl */
    public static ln0 m55860gl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ln0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: hl */
    public static ln0 m55862hl(byte[] bArr) throws nt1 {
        return (ln0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: il */
    public static ln0 m55864il(byte[] bArr, zy0 zy0) throws nt1 {
        return (ln0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: jl */
    public static cz2<ln0> m55866jl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ck */
    public final void mo39951Ck(Iterable<? extends Long> iterable) {
        mo39966Ok();
        C7403z0.m72412X6(iterable, this.bucketCounts_);
    }

    /* renamed from: Dk */
    public final void mo39952Dk(Iterable<? extends C6033e> iterable) {
        mo39967Pk();
        C7403z0.m72412X6(iterable, this.exemplars_);
    }

    /* renamed from: Ek */
    public final void mo39953Ek(long j) {
        mo39966Ok();
        this.bucketCounts_.mo46036L1(j);
    }

    /* renamed from: Fk */
    public final void mo39954Fk(int i, C6033e eVar) {
        eVar.getClass();
        mo39967Pk();
        this.exemplars_.add(i, eVar);
    }

    /* renamed from: Gk */
    public final void mo39955Gk(C6033e eVar) {
        eVar.getClass();
        mo39967Pk();
        this.exemplars_.add(eVar);
    }

    /* renamed from: Hk */
    public final void mo39956Hk() {
        this.bucketCounts_ = qe1.m62498oj();
    }

    /* renamed from: Ik */
    public final void mo39957Ik() {
        this.bucketOptions_ = null;
    }

    /* renamed from: Jk */
    public final void mo39958Jk() {
        this.count_ = 0;
    }

    /* renamed from: Kk */
    public final void mo39959Kk() {
        this.exemplars_ = qe1.m62499pj();
    }

    /* renamed from: L7 */
    public int mo39960L7() {
        return this.exemplars_.size();
    }

    /* renamed from: Lk */
    public final void mo39961Lk() {
        this.mean_ = 0.0d;
    }

    /* renamed from: Mb */
    public List<Long> mo39962Mb() {
        return this.bucketCounts_;
    }

    /* renamed from: Mk */
    public final void mo39963Mk() {
        this.range_ = null;
    }

    /* renamed from: Nk */
    public final void mo39964Nk() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    /* renamed from: Oi */
    public List<C6033e> mo39965Oi() {
        return this.exemplars_;
    }

    /* renamed from: Ok */
    public final void mo39966Ok() {
        vs1.C7088i iVar = this.bucketCounts_;
        if (!iVar.mo36500p()) {
            this.bucketCounts_ = qe1.m62467Ej(iVar);
        }
    }

    /* renamed from: Pk */
    public final void mo39967Pk() {
        vs1.C7095k<C6033e> kVar = this.exemplars_;
        if (!kVar.mo36500p()) {
            this.exemplars_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Rk */
    public C6035f mo39968Rk(int i) {
        return this.exemplars_.get(i);
    }

    /* renamed from: Sk */
    public List<? extends C6035f> mo39969Sk() {
        return this.exemplars_;
    }

    /* renamed from: Tk */
    public final void mo39970Tk(C6019b bVar) {
        bVar.getClass();
        C6019b bVar2 = this.bucketOptions_;
        if (!(bVar2 == null || bVar2 == C6019b.m55947uk())) {
            bVar = (C6019b) ((C6019b.C6020a) C6019b.m55949zk(this.bucketOptions_).mo43372Cj(bVar)).mo43377Ja();
        }
        this.bucketOptions_ = bVar;
    }

    /* renamed from: Uk */
    public final void mo39971Uk(C6036g gVar) {
        gVar.getClass();
        C6036g gVar2 = this.range_;
        if (!(gVar2 == null || gVar2 == C6036g.m56251mk())) {
            gVar = (C6036g) ((C6036g.C6037a) C6036g.m56253ok(this.range_).mo43372Cj(gVar)).mo43377Ja();
        }
        this.range_ = gVar;
    }

    /* renamed from: Z6 */
    public boolean mo39972Z6() {
        return this.range_ != null;
    }

    /* renamed from: ag */
    public double mo39973ag() {
        return this.mean_;
    }

    /* renamed from: b3 */
    public C6036g mo39974b3() {
        C6036g gVar = this.range_;
        return gVar == null ? C6036g.m56251mk() : gVar;
    }

    /* renamed from: e7 */
    public double mo39975e7() {
        return this.sumOfSquaredDeviation_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6018a.f31731a[iVar.ordinal()]) {
            case 1:
                return new ln0();
            case 2:
                return new C6032d((C6018a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", C6033e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ln0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ln0.class) {
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

    /* renamed from: kl */
    public final void mo39976kl(int i) {
        mo39967Pk();
        this.exemplars_.remove(i);
    }

    /* renamed from: ll */
    public final void mo39977ll(int i, long j) {
        mo39966Ok();
        this.bucketCounts_.mo46037c0(i, j);
    }

    /* renamed from: me */
    public long mo39978me() {
        return this.count_;
    }

    /* renamed from: mh */
    public boolean mo39979mh() {
        return this.bucketOptions_ != null;
    }

    /* renamed from: ml */
    public final void mo39980ml(C6019b bVar) {
        bVar.getClass();
        this.bucketOptions_ = bVar;
    }

    /* renamed from: nl */
    public final void mo39981nl(long j) {
        this.count_ = j;
    }

    /* renamed from: ol */
    public final void mo39982ol(int i, C6033e eVar) {
        eVar.getClass();
        mo39967Pk();
        this.exemplars_.set(i, eVar);
    }

    /* renamed from: pl */
    public final void mo39983pl(double d) {
        this.mean_ = d;
    }

    /* renamed from: ql */
    public final void mo39984ql(C6036g gVar) {
        gVar.getClass();
        this.range_ = gVar;
    }

    /* renamed from: rb */
    public C6033e mo39985rb(int i) {
        return this.exemplars_.get(i);
    }

    /* renamed from: rl */
    public final void mo39986rl(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    /* renamed from: v4 */
    public int mo39987v4() {
        return this.bucketCounts_.size();
    }

    /* renamed from: z8 */
    public C6019b mo39988z8() {
        C6019b bVar = this.bucketOptions_;
        return bVar == null ? C6019b.m55947uk() : bVar;
    }

    /* renamed from: zf */
    public long mo39989zf(int i) {
        return this.bucketCounts_.getLong(i);
    }
}
