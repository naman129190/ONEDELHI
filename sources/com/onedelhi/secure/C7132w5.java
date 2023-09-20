package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.w5 */
public final class C7132w5 extends qe1<C7132w5, C7134b> implements C7217x5 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C7132w5 DEFAULT_INSTANCE;
    private static volatile cz2<C7132w5> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: com.onedelhi.secure.w5$a */
    public static /* synthetic */ class C7133a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36894a;

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
                f36894a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36894a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7132w5.C7133a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.w5$b */
    public static final class C7134b extends qe1.C6546b<C7132w5, C7134b> implements C7217x5 {
        public C7134b() {
            super(C7132w5.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7134b(C7133a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7134b mo46546Gj() {
            mo43393xj();
            ((C7132w5) this.f34068b).mo46542kk();
            return this;
        }

        /* renamed from: Hj */
        public C7134b mo46547Hj() {
            mo43393xj();
            ((C7132w5) this.f34068b).mo46543lk();
            return this;
        }

        /* renamed from: Ij */
        public C7134b mo46548Ij(long j) {
            mo43393xj();
            ((C7132w5) this.f34068b).mo46538Ck(j);
            return this;
        }

        /* renamed from: Jj */
        public C7134b mo46549Jj(int i) {
            mo43393xj();
            ((C7132w5) this.f34068b).mo46539Dk(i);
            return this;
        }

        /* renamed from: Ub */
        public boolean mo46540Ub() {
            return ((C7132w5) this.f34068b).mo46540Ub();
        }

        /* renamed from: a3 */
        public int mo46541a3() {
            return ((C7132w5) this.f34068b).mo46541a3();
        }

        /* renamed from: n0 */
        public boolean mo46544n0() {
            return ((C7132w5) this.f34068b).mo46544n0();
        }

        /* renamed from: r1 */
        public long mo46545r1() {
            return ((C7132w5) this.f34068b).mo46545r1();
        }
    }

    static {
        C7132w5 w5Var = new C7132w5();
        DEFAULT_INSTANCE = w5Var;
        qe1.m62492dk(C7132w5.class, w5Var);
    }

    /* renamed from: Ak */
    public static C7132w5 m68822Ak(byte[] bArr, zy0 zy0) throws nt1 {
        return (C7132w5) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public static cz2<C7132w5> m68823Bk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: mk */
    public static C7132w5 m68829mk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nk */
    public static C7134b m68830nk() {
        return (C7134b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ok */
    public static C7134b m68831ok(C7132w5 w5Var) {
        return (C7134b) DEFAULT_INSTANCE.mo43358gj(w5Var);
    }

    /* renamed from: pk */
    public static C7132w5 m68832pk(InputStream inputStream) throws IOException {
        return (C7132w5) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static C7132w5 m68833qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7132w5) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static C7132w5 m68834rk(C5173er erVar) throws nt1 {
        return (C7132w5) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sk */
    public static C7132w5 m68835sk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C7132w5) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tk */
    public static C7132w5 m68836tk(g00 g00) throws IOException {
        return (C7132w5) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: uk */
    public static C7132w5 m68837uk(g00 g00, zy0 zy0) throws IOException {
        return (C7132w5) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vk */
    public static C7132w5 m68838vk(InputStream inputStream) throws IOException {
        return (C7132w5) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static C7132w5 m68839wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7132w5) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static C7132w5 m68840xk(ByteBuffer byteBuffer) throws nt1 {
        return (C7132w5) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yk */
    public static C7132w5 m68841yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C7132w5) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zk */
    public static C7132w5 m68842zk(byte[] bArr) throws nt1 {
        return (C7132w5) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public final void mo46538Ck(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* renamed from: Dk */
    public final void mo46539Dk(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: Ub */
    public boolean mo46540Ub() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: a3 */
    public int mo46541a3() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7133a.f36894a[iVar.ordinal()]) {
            case 1:
                return new C7132w5();
            case 2:
                return new C7134b((C7133a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C7132w5> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C7132w5.class) {
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
    public final void mo46542kk() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0;
    }

    /* renamed from: lk */
    public final void mo46543lk() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    /* renamed from: n0 */
    public boolean mo46544n0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: r1 */
    public long mo46545r1() {
        return this.clientTimeUs_;
    }
}
