package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class pa1 extends qe1<pa1, C6417b> implements qa1 {
    /* access modifiers changed from: private */
    public static final pa1 DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile cz2<pa1> PARSER;
    private long denominator_;
    private long numerator_;

    /* renamed from: com.onedelhi.secure.pa1$a */
    public static /* synthetic */ class C6416a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33504a;

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
                f33504a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33504a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pa1.C6416a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.pa1$b */
    public static final class C6417b extends qe1.C6546b<pa1, C6417b> implements qa1 {
        public C6417b() {
            super(pa1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6417b(C6416a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6417b mo42490Gj() {
            mo43393xj();
            ((pa1) this.f34068b).mo42488kk();
            return this;
        }

        /* renamed from: Hj */
        public C6417b mo42491Hj() {
            mo43393xj();
            ((pa1) this.f34068b).mo42489lk();
            return this;
        }

        /* renamed from: Ij */
        public C6417b mo42492Ij(long j) {
            mo43393xj();
            ((pa1) this.f34068b).mo42484Ck(j);
            return this;
        }

        /* renamed from: Jj */
        public C6417b mo42493Jj(long j) {
            mo43393xj();
            ((pa1) this.f34068b).mo42485Dk(j);
            return this;
        }

        /* renamed from: Mf */
        public long mo42486Mf() {
            return ((pa1) this.f34068b).mo42486Mf();
        }

        /* renamed from: Q9 */
        public long mo42487Q9() {
            return ((pa1) this.f34068b).mo42487Q9();
        }
    }

    static {
        pa1 pa1 = new pa1();
        DEFAULT_INSTANCE = pa1;
        qe1.m62492dk(pa1.class, pa1);
    }

    /* renamed from: Ak */
    public static pa1 m60798Ak(byte[] bArr, zy0 zy0) throws nt1 {
        return (pa1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public static cz2<pa1> m60799Bk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: mk */
    public static pa1 m60805mk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nk */
    public static C6417b m60806nk() {
        return (C6417b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ok */
    public static C6417b m60807ok(pa1 pa1) {
        return (C6417b) DEFAULT_INSTANCE.mo43358gj(pa1);
    }

    /* renamed from: pk */
    public static pa1 m60808pk(InputStream inputStream) throws IOException {
        return (pa1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static pa1 m60809qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pa1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static pa1 m60810rk(C5173er erVar) throws nt1 {
        return (pa1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sk */
    public static pa1 m60811sk(C5173er erVar, zy0 zy0) throws nt1 {
        return (pa1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tk */
    public static pa1 m60812tk(g00 g00) throws IOException {
        return (pa1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: uk */
    public static pa1 m60813uk(g00 g00, zy0 zy0) throws IOException {
        return (pa1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vk */
    public static pa1 m60814vk(InputStream inputStream) throws IOException {
        return (pa1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static pa1 m60815wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pa1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static pa1 m60816xk(ByteBuffer byteBuffer) throws nt1 {
        return (pa1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yk */
    public static pa1 m60817yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (pa1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zk */
    public static pa1 m60818zk(byte[] bArr) throws nt1 {
        return (pa1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public final void mo42484Ck(long j) {
        this.denominator_ = j;
    }

    /* renamed from: Dk */
    public final void mo42485Dk(long j) {
        this.numerator_ = j;
    }

    /* renamed from: Mf */
    public long mo42486Mf() {
        return this.numerator_;
    }

    /* renamed from: Q9 */
    public long mo42487Q9() {
        return this.denominator_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6416a.f33504a[iVar.ordinal()]) {
            case 1:
                return new pa1();
            case 2:
                return new C6417b((C6416a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<pa1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (pa1.class) {
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
    public final void mo42488kk() {
        this.denominator_ = 0;
    }

    /* renamed from: lk */
    public final void mo42489lk() {
        this.numerator_ = 0;
    }
}
