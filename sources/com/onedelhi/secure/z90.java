package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class z90 extends qe1<z90, C7457b> implements aa0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final z90 DEFAULT_INSTANCE;
    private static volatile cz2<z90> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: com.onedelhi.secure.z90$a */
    public static /* synthetic */ class C7456a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38286a;

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
                f38286a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38286a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z90.C7456a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.z90$b */
    public static final class C7457b extends qe1.C6546b<z90, C7457b> implements aa0 {
        public C7457b() {
            super(z90.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7457b(C7456a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7457b mo48174Gj() {
            mo43393xj();
            ((z90) this.f34068b).mo48171mk();
            return this;
        }

        /* renamed from: Hj */
        public C7457b mo48175Hj() {
            mo43393xj();
            ((z90) this.f34068b).mo48172nk();
            return this;
        }

        /* renamed from: Ij */
        public C7457b mo48176Ij() {
            mo43393xj();
            ((z90) this.f34068b).mo48173ok();
            return this;
        }

        /* renamed from: Jj */
        public C7457b mo48177Jj(long j) {
            mo43393xj();
            ((z90) this.f34068b).mo48168Fk(j);
            return this;
        }

        /* renamed from: Kj */
        public C7457b mo48178Kj(long j) {
            mo43393xj();
            ((z90) this.f34068b).mo48169Gk(j);
            return this;
        }

        /* renamed from: Lj */
        public C7457b mo48179Lj(long j) {
            mo43393xj();
            ((z90) this.f34068b).mo48170Hk(j);
            return this;
        }

        /* renamed from: Xd */
        public long mo30491Xd() {
            return ((z90) this.f34068b).mo30491Xd();
        }

        /* renamed from: ae */
        public boolean mo30492ae() {
            return ((z90) this.f34068b).mo30492ae();
        }

        /* renamed from: ei */
        public long mo30493ei() {
            return ((z90) this.f34068b).mo30493ei();
        }

        /* renamed from: n0 */
        public boolean mo30494n0() {
            return ((z90) this.f34068b).mo30494n0();
        }

        /* renamed from: r1 */
        public long mo30495r1() {
            return ((z90) this.f34068b).mo30495r1();
        }

        /* renamed from: t2 */
        public boolean mo30496t2() {
            return ((z90) this.f34068b).mo30496t2();
        }
    }

    static {
        z90 z90 = new z90();
        DEFAULT_INSTANCE = z90;
        qe1.m62492dk(z90.class, z90);
    }

    /* renamed from: Ak */
    public static z90 m72657Ak(ByteBuffer byteBuffer) throws nt1 {
        return (z90) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Bk */
    public static z90 m72658Bk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (z90) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ck */
    public static z90 m72659Ck(byte[] bArr) throws nt1 {
        return (z90) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Dk */
    public static z90 m72660Dk(byte[] bArr, zy0 zy0) throws nt1 {
        return (z90) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ek */
    public static cz2<z90> m72661Ek() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: pk */
    public static z90 m72669pk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: qk */
    public static C7457b m72670qk() {
        return (C7457b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: rk */
    public static C7457b m72671rk(z90 z90) {
        return (C7457b) DEFAULT_INSTANCE.mo43358gj(z90);
    }

    /* renamed from: sk */
    public static z90 m72672sk(InputStream inputStream) throws IOException {
        return (z90) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: tk */
    public static z90 m72673tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (z90) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: uk */
    public static z90 m72674uk(C5173er erVar) throws nt1 {
        return (z90) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: vk */
    public static z90 m72675vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (z90) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: wk */
    public static z90 m72676wk(g00 g00) throws IOException {
        return (z90) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: xk */
    public static z90 m72677xk(g00 g00, zy0 zy0) throws IOException {
        return (z90) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: yk */
    public static z90 m72678yk(InputStream inputStream) throws IOException {
        return (z90) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: zk */
    public static z90 m72679zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (z90) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public final void mo48168Fk(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* renamed from: Gk */
    public final void mo48169Gk(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* renamed from: Hk */
    public final void mo48170Hk(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    /* renamed from: Xd */
    public long mo30491Xd() {
        return this.systemTimeUs_;
    }

    /* renamed from: ae */
    public boolean mo30492ae() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: ei */
    public long mo30493ei() {
        return this.userTimeUs_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7456a.f38286a[iVar.ordinal()]) {
            case 1:
                return new z90();
            case 2:
                return new C7457b((C7456a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<z90> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (z90.class) {
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
    public final void mo48171mk() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0;
    }

    /* renamed from: n0 */
    public boolean mo30494n0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: nk */
    public final void mo48172nk() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0;
    }

    /* renamed from: ok */
    public final void mo48173ok() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0;
    }

    /* renamed from: r1 */
    public long mo30495r1() {
        return this.clientTimeUs_;
    }

    /* renamed from: t2 */
    public boolean mo30496t2() {
        return (this.bitField0_ & 4) != 0;
    }
}
