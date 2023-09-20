package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class eq0 extends qe1<eq0, C5172b> implements jq0 {
    /* access modifiers changed from: private */
    public static final eq0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile cz2<eq0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.onedelhi.secure.eq0$a */
    public static /* synthetic */ class C5171a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28032a;

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
                f28032a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28032a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eq0.C5171a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.eq0$b */
    public static final class C5172b extends qe1.C6546b<eq0, C5172b> implements jq0 {
        public C5172b() {
            super(eq0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5172b(C5171a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5172b mo35526Gj() {
            mo43393xj();
            ((eq0) this.f34068b).mo35523kk();
            return this;
        }

        /* renamed from: Hj */
        public C5172b mo35527Hj() {
            mo43393xj();
            ((eq0) this.f34068b).mo35524lk();
            return this;
        }

        /* renamed from: Ij */
        public C5172b mo35528Ij(int i) {
            mo43393xj();
            ((eq0) this.f34068b).mo35520Ck(i);
            return this;
        }

        /* renamed from: Jj */
        public C5172b mo35529Jj(long j) {
            mo43393xj();
            ((eq0) this.f34068b).mo35521Dk(j);
            return this;
        }

        /* renamed from: M1 */
        public long mo35522M1() {
            return ((eq0) this.f34068b).mo35522M1();
        }

        /* renamed from: v */
        public int mo35525v() {
            return ((eq0) this.f34068b).mo35525v();
        }
    }

    static {
        eq0 eq0 = new eq0();
        DEFAULT_INSTANCE = eq0;
        qe1.m62492dk(eq0.class, eq0);
    }

    /* renamed from: Ak */
    public static eq0 m47076Ak(byte[] bArr, zy0 zy0) throws nt1 {
        return (eq0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public static cz2<eq0> m47077Bk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: mk */
    public static eq0 m47083mk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nk */
    public static C5172b m47084nk() {
        return (C5172b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ok */
    public static C5172b m47085ok(eq0 eq0) {
        return (C5172b) DEFAULT_INSTANCE.mo43358gj(eq0);
    }

    /* renamed from: pk */
    public static eq0 m47086pk(InputStream inputStream) throws IOException {
        return (eq0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static eq0 m47087qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (eq0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static eq0 m47088rk(C5173er erVar) throws nt1 {
        return (eq0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sk */
    public static eq0 m47089sk(C5173er erVar, zy0 zy0) throws nt1 {
        return (eq0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tk */
    public static eq0 m47090tk(g00 g00) throws IOException {
        return (eq0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: uk */
    public static eq0 m47091uk(g00 g00, zy0 zy0) throws IOException {
        return (eq0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vk */
    public static eq0 m47092vk(InputStream inputStream) throws IOException {
        return (eq0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static eq0 m47093wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (eq0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static eq0 m47094xk(ByteBuffer byteBuffer) throws nt1 {
        return (eq0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yk */
    public static eq0 m47095yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (eq0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zk */
    public static eq0 m47096zk(byte[] bArr) throws nt1 {
        return (eq0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public final void mo35520Ck(int i) {
        this.nanos_ = i;
    }

    /* renamed from: Dk */
    public final void mo35521Dk(long j) {
        this.seconds_ = j;
    }

    /* renamed from: M1 */
    public long mo35522M1() {
        return this.seconds_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5171a.f28032a[iVar.ordinal()]) {
            case 1:
                return new eq0();
            case 2:
                return new C5172b((C5171a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<eq0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (eq0.class) {
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
    public final void mo35523kk() {
        this.nanos_ = 0;
    }

    /* renamed from: lk */
    public final void mo35524lk() {
        this.seconds_ = 0;
    }

    /* renamed from: v */
    public int mo35525v() {
        return this.nanos_;
    }
}
