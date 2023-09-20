package com.onedelhi.secure;

import com.onedelhi.secure.C7132w5;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vd1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.z90;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class yd1 extends qe1<yd1, C7329b> implements zd1 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final yd1 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile cz2<yd1> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private vs1.C7095k<C7132w5> androidMemoryReadings_ = qe1.m62499pj();
    private int bitField0_;
    private vs1.C7095k<z90> cpuMetricReadings_ = qe1.m62499pj();
    private vd1 gaugeMetadata_;
    private String sessionId_ = "";

    /* renamed from: com.onedelhi.secure.yd1$a */
    public static /* synthetic */ class C7328a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37863a;

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
                f37863a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37863a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.yd1.C7328a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.yd1$b */
    public static final class C7329b extends qe1.C6546b<yd1, C7329b> implements zd1 {
        public C7329b() {
            super(yd1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7329b(C7328a aVar) {
            this();
        }

        /* renamed from: C0 */
        public String mo47719C0() {
            return ((yd1) this.f34068b).mo47719C0();
        }

        /* renamed from: F3 */
        public vd1 mo47723F3() {
            return ((yd1) this.f34068b).mo47723F3();
        }

        /* renamed from: Gj */
        public C7329b mo47752Gj(Iterable<? extends C7132w5> iterable) {
            mo43393xj();
            ((yd1) this.f34068b).mo47750yk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7329b mo47753Hj(Iterable<? extends z90> iterable) {
            mo43393xj();
            ((yd1) this.f34068b).mo47751zk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C7329b mo47754Ij(int i, C7132w5.C7134b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47717Ak(i, (C7132w5) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C7329b mo47755Jj(int i, C7132w5 w5Var) {
            mo43393xj();
            ((yd1) this.f34068b).mo47717Ak(i, w5Var);
            return this;
        }

        /* renamed from: Kj */
        public C7329b mo47756Kj(C7132w5.C7134b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47718Bk((C7132w5) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C7329b mo47757Lj(C7132w5 w5Var) {
            mo43393xj();
            ((yd1) this.f34068b).mo47718Bk(w5Var);
            return this;
        }

        /* renamed from: Mj */
        public C7329b mo47758Mj(int i, z90.C7457b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47720Ck(i, (z90) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C7329b mo47759Nj(int i, z90 z90) {
            mo43393xj();
            ((yd1) this.f34068b).mo47720Ck(i, z90);
            return this;
        }

        /* renamed from: Oj */
        public C7329b mo47760Oj(z90.C7457b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47721Dk((z90) bVar.mo43381ab());
            return this;
        }

        /* renamed from: P4 */
        public boolean mo47733P4() {
            return ((yd1) this.f34068b).mo47733P4();
        }

        /* renamed from: Pj */
        public C7329b mo47761Pj(z90 z90) {
            mo43393xj();
            ((yd1) this.f34068b).mo47721Dk(z90);
            return this;
        }

        /* renamed from: Qi */
        public List<z90> mo47735Qi() {
            return Collections.unmodifiableList(((yd1) this.f34068b).mo47735Qi());
        }

        /* renamed from: Qj */
        public C7329b mo47762Qj() {
            mo43393xj();
            ((yd1) this.f34068b).mo47722Ek();
            return this;
        }

        /* renamed from: R0 */
        public boolean mo47736R0() {
            return ((yd1) this.f34068b).mo47736R0();
        }

        /* renamed from: Rj */
        public C7329b mo47763Rj() {
            mo43393xj();
            ((yd1) this.f34068b).mo47724Fk();
            return this;
        }

        /* renamed from: Sj */
        public C7329b mo47764Sj() {
            mo43393xj();
            ((yd1) this.f34068b).mo47725Gk();
            return this;
        }

        /* renamed from: Tj */
        public C7329b mo47765Tj() {
            mo43393xj();
            ((yd1) this.f34068b).mo47726Hk();
            return this;
        }

        /* renamed from: Uj */
        public C7329b mo47766Uj(vd1 vd1) {
            mo43393xj();
            ((yd1) this.f34068b).mo47734Pk(vd1);
            return this;
        }

        /* renamed from: Vj */
        public C7329b mo47767Vj(int i) {
            mo43393xj();
            ((yd1) this.f34068b).mo47737fl(i);
            return this;
        }

        /* renamed from: Wj */
        public C7329b mo47768Wj(int i) {
            mo43393xj();
            ((yd1) this.f34068b).mo47738gl(i);
            return this;
        }

        /* renamed from: Xj */
        public C7329b mo47769Xj(int i, C7132w5.C7134b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47739hl(i, (C7132w5) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Yj */
        public C7329b mo47770Yj(int i, C7132w5 w5Var) {
            mo43393xj();
            ((yd1) this.f34068b).mo47739hl(i, w5Var);
            return this;
        }

        /* renamed from: Zj */
        public C7329b mo47771Zj(int i, z90.C7457b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47740il(i, (z90) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ak */
        public C7329b mo47772ak(int i, z90 z90) {
            mo43393xj();
            ((yd1) this.f34068b).mo47740il(i, z90);
            return this;
        }

        /* renamed from: bk */
        public C7329b mo47773bk(vd1.C7029b bVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47741jl((vd1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ck */
        public C7329b mo47774ck(vd1 vd1) {
            mo43393xj();
            ((yd1) this.f34068b).mo47741jl(vd1);
            return this;
        }

        /* renamed from: dk */
        public C7329b mo47775dk(String str) {
            mo43393xj();
            ((yd1) this.f34068b).mo47743kl(str);
            return this;
        }

        /* renamed from: ek */
        public C7329b mo47776ek(C5173er erVar) {
            mo43393xj();
            ((yd1) this.f34068b).mo47746ll(erVar);
            return this;
        }

        /* renamed from: kf */
        public z90 mo47742kf(int i) {
            return ((yd1) this.f34068b).mo47742kf(i);
        }

        /* renamed from: l5 */
        public C7132w5 mo47744l5(int i) {
            return ((yd1) this.f34068b).mo47744l5(i);
        }

        /* renamed from: l8 */
        public List<C7132w5> mo47745l8() {
            return Collections.unmodifiableList(((yd1) this.f34068b).mo47745l8());
        }

        /* renamed from: mc */
        public int mo47747mc() {
            return ((yd1) this.f34068b).mo47747mc();
        }

        /* renamed from: q1 */
        public C5173er mo47748q1() {
            return ((yd1) this.f34068b).mo47748q1();
        }

        /* renamed from: ra */
        public int mo47749ra() {
            return ((yd1) this.f34068b).mo47749ra();
        }
    }

    static {
        yd1 yd1 = new yd1();
        DEFAULT_INSTANCE = yd1;
        qe1.m62492dk(yd1.class, yd1);
    }

    /* renamed from: Ok */
    public static yd1 m71572Ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Qk */
    public static C7329b m71573Qk() {
        return (C7329b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Rk */
    public static C7329b m71574Rk(yd1 yd1) {
        return (C7329b) DEFAULT_INSTANCE.mo43358gj(yd1);
    }

    /* renamed from: Sk */
    public static yd1 m71575Sk(InputStream inputStream) throws IOException {
        return (yd1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Tk */
    public static yd1 m71576Tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (yd1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Uk */
    public static yd1 m71577Uk(C5173er erVar) throws nt1 {
        return (yd1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Vk */
    public static yd1 m71578Vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (yd1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Wk */
    public static yd1 m71579Wk(g00 g00) throws IOException {
        return (yd1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Xk */
    public static yd1 m71580Xk(g00 g00, zy0 zy0) throws IOException {
        return (yd1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Yk */
    public static yd1 m71581Yk(InputStream inputStream) throws IOException {
        return (yd1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Zk */
    public static yd1 m71582Zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (yd1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: al */
    public static yd1 m71583al(ByteBuffer byteBuffer) throws nt1 {
        return (yd1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: bl */
    public static yd1 m71584bl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (yd1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: cl */
    public static yd1 m71585cl(byte[] bArr) throws nt1 {
        return (yd1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: dl */
    public static yd1 m71586dl(byte[] bArr, zy0 zy0) throws nt1 {
        return (yd1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: el */
    public static cz2<yd1> m71587el() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo47717Ak(int i, C7132w5 w5Var) {
        w5Var.getClass();
        mo47727Ik();
        this.androidMemoryReadings_.add(i, w5Var);
    }

    /* renamed from: Bk */
    public final void mo47718Bk(C7132w5 w5Var) {
        w5Var.getClass();
        mo47727Ik();
        this.androidMemoryReadings_.add(w5Var);
    }

    /* renamed from: C0 */
    public String mo47719C0() {
        return this.sessionId_;
    }

    /* renamed from: Ck */
    public final void mo47720Ck(int i, z90 z90) {
        z90.getClass();
        mo47728Jk();
        this.cpuMetricReadings_.add(i, z90);
    }

    /* renamed from: Dk */
    public final void mo47721Dk(z90 z90) {
        z90.getClass();
        mo47728Jk();
        this.cpuMetricReadings_.add(z90);
    }

    /* renamed from: Ek */
    public final void mo47722Ek() {
        this.androidMemoryReadings_ = qe1.m62499pj();
    }

    /* renamed from: F3 */
    public vd1 mo47723F3() {
        vd1 vd1 = this.gaugeMetadata_;
        return vd1 == null ? vd1.m67908zk() : vd1;
    }

    /* renamed from: Fk */
    public final void mo47724Fk() {
        this.cpuMetricReadings_ = qe1.m62499pj();
    }

    /* renamed from: Gk */
    public final void mo47725Gk() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* renamed from: Hk */
    public final void mo47726Hk() {
        this.bitField0_ &= -2;
        this.sessionId_ = m71572Ok().mo47719C0();
    }

    /* renamed from: Ik */
    public final void mo47727Ik() {
        vs1.C7095k<C7132w5> kVar = this.androidMemoryReadings_;
        if (!kVar.mo36500p()) {
            this.androidMemoryReadings_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Jk */
    public final void mo47728Jk() {
        vs1.C7095k<z90> kVar = this.cpuMetricReadings_;
        if (!kVar.mo36500p()) {
            this.cpuMetricReadings_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Kk */
    public C7217x5 mo47729Kk(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    /* renamed from: Lk */
    public List<? extends C7217x5> mo47730Lk() {
        return this.androidMemoryReadings_;
    }

    /* renamed from: Mk */
    public aa0 mo47731Mk(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    /* renamed from: Nk */
    public List<? extends aa0> mo47732Nk() {
        return this.cpuMetricReadings_;
    }

    /* renamed from: P4 */
    public boolean mo47733P4() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: Pk */
    public final void mo47734Pk(vd1 vd1) {
        vd1.getClass();
        vd1 vd12 = this.gaugeMetadata_;
        if (!(vd12 == null || vd12 == vd1.m67908zk())) {
            vd1 = (vd1) ((vd1.C7029b) vd1.m67880Bk(this.gaugeMetadata_).mo43372Cj(vd1)).mo43377Ja();
        }
        this.gaugeMetadata_ = vd1;
        this.bitField0_ |= 2;
    }

    /* renamed from: Qi */
    public List<z90> mo47735Qi() {
        return this.cpuMetricReadings_;
    }

    /* renamed from: R0 */
    public boolean mo47736R0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: fl */
    public final void mo47737fl(int i) {
        mo47727Ik();
        this.androidMemoryReadings_.remove(i);
    }

    /* renamed from: gl */
    public final void mo47738gl(int i) {
        mo47728Jk();
        this.cpuMetricReadings_.remove(i);
    }

    /* renamed from: hl */
    public final void mo47739hl(int i, C7132w5 w5Var) {
        w5Var.getClass();
        mo47727Ik();
        this.androidMemoryReadings_.set(i, w5Var);
    }

    /* renamed from: il */
    public final void mo47740il(int i, z90 z90) {
        z90.getClass();
        mo47728Jk();
        this.cpuMetricReadings_.set(i, z90);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7328a.f37863a[iVar.ordinal()]) {
            case 1:
                return new yd1();
            case 2:
                return new C7329b((C7328a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", z90.class, "gaugeMetadata_", "androidMemoryReadings_", C7132w5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<yd1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (yd1.class) {
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

    /* renamed from: jl */
    public final void mo47741jl(vd1 vd1) {
        vd1.getClass();
        this.gaugeMetadata_ = vd1;
        this.bitField0_ |= 2;
    }

    /* renamed from: kf */
    public z90 mo47742kf(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    /* renamed from: kl */
    public final void mo47743kl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: l5 */
    public C7132w5 mo47744l5(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    /* renamed from: l8 */
    public List<C7132w5> mo47745l8() {
        return this.androidMemoryReadings_;
    }

    /* renamed from: ll */
    public final void mo47746ll(C5173er erVar) {
        this.sessionId_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    /* renamed from: mc */
    public int mo47747mc() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: q1 */
    public C5173er mo47748q1() {
        return C5173er.m47136w(this.sessionId_);
    }

    /* renamed from: ra */
    public int mo47749ra() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: yk */
    public final void mo47750yk(Iterable<? extends C7132w5> iterable) {
        mo47727Ik();
        C7403z0.m72412X6(iterable, this.androidMemoryReadings_);
    }

    /* renamed from: zk */
    public final void mo47751zk(Iterable<? extends z90> iterable) {
        mo47728Jk();
        C7403z0.m72412X6(iterable, this.cpuMetricReadings_);
    }
}
