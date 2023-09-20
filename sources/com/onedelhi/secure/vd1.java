package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class vd1 extends qe1<vd1, C7029b> implements xd1 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final vd1 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile cz2<vd1> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: com.onedelhi.secure.vd1$a */
    public static /* synthetic */ class C7028a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36488a;

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
                f36488a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36488a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vd1.C7028a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.vd1$b */
    public static final class C7029b extends qe1.C6546b<vd1, C7029b> implements xd1 {
        public C7029b() {
            super(vd1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7029b(C7028a aVar) {
            this();
        }

        /* renamed from: D4 */
        public int mo46084D4() {
            return ((vd1) this.f34068b).mo46084D4();
        }

        /* renamed from: Gj */
        public C7029b mo46110Gj() {
            mo43393xj();
            ((vd1) this.f34068b).mo46104tk();
            return this;
        }

        /* renamed from: Hj */
        public C7029b mo46111Hj() {
            mo43393xj();
            ((vd1) this.f34068b).mo46105uk();
            return this;
        }

        /* renamed from: Ih */
        public boolean mo46085Ih() {
            return ((vd1) this.f34068b).mo46085Ih();
        }

        /* renamed from: Ij */
        public C7029b mo46112Ij() {
            mo43393xj();
            ((vd1) this.f34068b).mo46106vk();
            return this;
        }

        @Deprecated
        /* renamed from: J2 */
        public String mo46086J2() {
            return ((vd1) this.f34068b).mo46086J2();
        }

        /* renamed from: Jj */
        public C7029b mo46113Jj() {
            mo43393xj();
            ((vd1) this.f34068b).mo46107wk();
            return this;
        }

        /* renamed from: Ka */
        public boolean mo46087Ka() {
            return ((vd1) this.f34068b).mo46087Ka();
        }

        /* renamed from: Kj */
        public C7029b mo46114Kj() {
            mo43393xj();
            ((vd1) this.f34068b).mo46108xk();
            return this;
        }

        @Deprecated
        /* renamed from: Lj */
        public C7029b mo46115Lj() {
            mo43393xj();
            ((vd1) this.f34068b).mo46109yk();
            return this;
        }

        /* renamed from: M3 */
        public int mo46088M3() {
            return ((vd1) this.f34068b).mo46088M3();
        }

        /* renamed from: Mj */
        public C7029b mo46116Mj(int i) {
            mo43393xj();
            ((vd1) this.f34068b).mo46090Pk(i);
            return this;
        }

        /* renamed from: Nj */
        public C7029b mo46117Nj(int i) {
            mo43393xj();
            ((vd1) this.f34068b).mo46092Qk(i);
            return this;
        }

        /* renamed from: O2 */
        public int mo46089O2() {
            return ((vd1) this.f34068b).mo46089O2();
        }

        /* renamed from: Oj */
        public C7029b mo46118Oj(int i) {
            mo43393xj();
            ((vd1) this.f34068b).mo46093Rk(i);
            return this;
        }

        /* renamed from: Pj */
        public C7029b mo46119Pj(int i) {
            mo43393xj();
            ((vd1) this.f34068b).mo46094Sk(i);
            return this;
        }

        @Deprecated
        /* renamed from: Qh */
        public boolean mo46091Qh() {
            return ((vd1) this.f34068b).mo46091Qh();
        }

        /* renamed from: Qj */
        public C7029b mo46120Qj(int i) {
            mo43393xj();
            ((vd1) this.f34068b).mo46095Tk(i);
            return this;
        }

        @Deprecated
        /* renamed from: Rj */
        public C7029b mo46121Rj(String str) {
            mo43393xj();
            ((vd1) this.f34068b).mo46096Uk(str);
            return this;
        }

        @Deprecated
        /* renamed from: Sj */
        public C7029b mo46122Sj(C5173er erVar) {
            mo43393xj();
            ((vd1) this.f34068b).mo46097Vk(erVar);
            return this;
        }

        @Deprecated
        /* renamed from: X7 */
        public C5173er mo46098X7() {
            return ((vd1) this.f34068b).mo46098X7();
        }

        /* renamed from: Zc */
        public int mo46099Zc() {
            return ((vd1) this.f34068b).mo46099Zc();
        }

        /* renamed from: ha */
        public boolean mo46100ha() {
            return ((vd1) this.f34068b).mo46100ha();
        }

        /* renamed from: l9 */
        public int mo46101l9() {
            return ((vd1) this.f34068b).mo46101l9();
        }

        /* renamed from: qa */
        public boolean mo46102qa() {
            return ((vd1) this.f34068b).mo46102qa();
        }

        /* renamed from: s2 */
        public boolean mo46103s2() {
            return ((vd1) this.f34068b).mo46103s2();
        }
    }

    static {
        vd1 vd1 = new vd1();
        DEFAULT_INSTANCE = vd1;
        qe1.m62492dk(vd1.class, vd1);
    }

    /* renamed from: Ak */
    public static C7029b m67879Ak() {
        return (C7029b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Bk */
    public static C7029b m67880Bk(vd1 vd1) {
        return (C7029b) DEFAULT_INSTANCE.mo43358gj(vd1);
    }

    /* renamed from: Ck */
    public static vd1 m67881Ck(InputStream inputStream) throws IOException {
        return (vd1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static vd1 m67882Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (vd1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static vd1 m67883Ek(C5173er erVar) throws nt1 {
        return (vd1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Fk */
    public static vd1 m67884Fk(C5173er erVar, zy0 zy0) throws nt1 {
        return (vd1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Gk */
    public static vd1 m67885Gk(g00 g00) throws IOException {
        return (vd1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Hk */
    public static vd1 m67886Hk(g00 g00, zy0 zy0) throws IOException {
        return (vd1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ik */
    public static vd1 m67887Ik(InputStream inputStream) throws IOException {
        return (vd1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Jk */
    public static vd1 m67888Jk(InputStream inputStream, zy0 zy0) throws IOException {
        return (vd1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Kk */
    public static vd1 m67889Kk(ByteBuffer byteBuffer) throws nt1 {
        return (vd1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Lk */
    public static vd1 m67890Lk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (vd1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Mk */
    public static vd1 m67891Mk(byte[] bArr) throws nt1 {
        return (vd1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Nk */
    public static vd1 m67892Nk(byte[] bArr, zy0 zy0) throws nt1 {
        return (vd1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ok */
    public static cz2<vd1> m67893Ok() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: zk */
    public static vd1 m67908zk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: D4 */
    public int mo46084D4() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    /* renamed from: Ih */
    public boolean mo46085Ih() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    /* renamed from: J2 */
    public String mo46086J2() {
        return this.processName_;
    }

    /* renamed from: Ka */
    public boolean mo46087Ka() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: M3 */
    public int mo46088M3() {
        return this.cpuProcessorCount_;
    }

    /* renamed from: O2 */
    public int mo46089O2() {
        return this.cpuClockRateKhz_;
    }

    /* renamed from: Pk */
    public final void mo46090Pk(int i) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i;
    }

    @Deprecated
    /* renamed from: Qh */
    public boolean mo46091Qh() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Qk */
    public final void mo46092Qk(int i) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i;
    }

    /* renamed from: Rk */
    public final void mo46093Rk(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* renamed from: Sk */
    public final void mo46094Sk(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: Tk */
    public final void mo46095Tk(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: Uk */
    public final void mo46096Uk(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* renamed from: Vk */
    public final void mo46097Vk(C5173er erVar) {
        this.processName_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    @Deprecated
    /* renamed from: X7 */
    public C5173er mo46098X7() {
        return C5173er.m47136w(this.processName_);
    }

    /* renamed from: Zc */
    public int mo46099Zc() {
        return this.deviceRamSizeKb_;
    }

    /* renamed from: ha */
    public boolean mo46100ha() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7028a.f36488a[iVar.ordinal()]) {
            case 1:
                return new vd1();
            case 2:
                return new C7029b((C7028a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<vd1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (vd1.class) {
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

    /* renamed from: l9 */
    public int mo46101l9() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    /* renamed from: qa */
    public boolean mo46102qa() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: s2 */
    public boolean mo46103s2() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: tk */
    public final void mo46104tk() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    /* renamed from: uk */
    public final void mo46105uk() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    /* renamed from: vk */
    public final void mo46106vk() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    /* renamed from: wk */
    public final void mo46107wk() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    /* renamed from: xk */
    public final void mo46108xk() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    /* renamed from: yk */
    public final void mo46109yk() {
        this.bitField0_ &= -2;
        this.processName_ = m67908zk().mo46086J2();
    }
}
