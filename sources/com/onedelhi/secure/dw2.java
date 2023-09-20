package com.onedelhi.secure;

import com.onedelhi.secure.C6248o7;
import com.onedelhi.secure.q34;
import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class dw2 extends qe1<dw2, C5062b> implements iw2 {
    /* access modifiers changed from: private */
    public static final dw2 DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<dw2> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private C6248o7 metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    /* renamed from: com.onedelhi.secure.dw2$a */
    public static /* synthetic */ class C5061a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27633a;

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
                f27633a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27633a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dw2.C5061a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.dw2$b */
    public static final class C5062b extends qe1.C6546b<dw2, C5062b> implements iw2 {
        public C5062b() {
            super(dw2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5062b(C5061a aVar) {
            this();
        }

        /* renamed from: C5 */
        public boolean mo34642C5() {
            return ((dw2) this.f34068b).mo34642C5();
        }

        /* renamed from: Dh */
        public C6248o7 mo34644Dh() {
            return ((dw2) this.f34068b).mo34644Dh();
        }

        /* renamed from: Gj */
        public C5062b mo34666Gj() {
            mo43393xj();
            ((dw2) this.f34068b).mo34661vk();
            return this;
        }

        /* renamed from: Hj */
        public C5062b mo34667Hj() {
            mo43393xj();
            ((dw2) this.f34068b).mo34662wk();
            return this;
        }

        /* renamed from: I2 */
        public boolean mo34647I2() {
            return ((dw2) this.f34068b).mo34647I2();
        }

        /* renamed from: Ij */
        public C5062b mo34668Ij() {
            mo43393xj();
            ((dw2) this.f34068b).mo34663xk();
            return this;
        }

        /* renamed from: Jj */
        public C5062b mo34669Jj() {
            mo43393xj();
            ((dw2) this.f34068b).mo34664yk();
            return this;
        }

        /* renamed from: Kj */
        public C5062b mo34670Kj() {
            mo43393xj();
            ((dw2) this.f34068b).mo34665zk();
            return this;
        }

        /* renamed from: Lj */
        public C5062b mo34671Lj() {
            mo43393xj();
            ((dw2) this.f34068b).mo34641Ak();
            return this;
        }

        /* renamed from: Mj */
        public C5062b mo34672Mj(q34 q34) {
            mo43393xj();
            ((dw2) this.f34068b).mo34643Ck(q34);
            return this;
        }

        /* renamed from: Nj */
        public C5062b mo34673Nj(C6248o7 o7Var) {
            mo43393xj();
            ((dw2) this.f34068b).mo34645Dk(o7Var);
            return this;
        }

        /* renamed from: Oj */
        public C5062b mo34674Oj(C6248o7 o7Var) {
            mo43393xj();
            ((dw2) this.f34068b).mo34646Ek(o7Var);
            return this;
        }

        /* renamed from: Pj */
        public C5062b mo34675Pj(boolean z) {
            mo43393xj();
            ((dw2) this.f34068b).mo34648Uk(z);
            return this;
        }

        /* renamed from: Qj */
        public C5062b mo34676Qj(q34.C6504b bVar) {
            mo43393xj();
            ((dw2) this.f34068b).mo34649Vk((q34) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Rj */
        public C5062b mo34677Rj(q34 q34) {
            mo43393xj();
            ((dw2) this.f34068b).mo34649Vk(q34);
            return this;
        }

        /* renamed from: Sj */
        public C5062b mo34678Sj(C6248o7.C6250b bVar) {
            mo43393xj();
            ((dw2) this.f34068b).mo34650Wk((C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tj */
        public C5062b mo34679Tj(C6248o7 o7Var) {
            mo43393xj();
            ((dw2) this.f34068b).mo34650Wk(o7Var);
            return this;
        }

        /* renamed from: Uj */
        public C5062b mo34680Uj(String str) {
            mo43393xj();
            ((dw2) this.f34068b).mo34651Xk(str);
            return this;
        }

        /* renamed from: Vj */
        public C5062b mo34681Vj(C5173er erVar) {
            mo43393xj();
            ((dw2) this.f34068b).mo34653Yk(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5062b mo34682Wj(C6248o7.C6250b bVar) {
            mo43393xj();
            ((dw2) this.f34068b).mo34655Zk((C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C5062b mo34683Xj(C6248o7 o7Var) {
            mo43393xj();
            ((dw2) this.f34068b).mo34655Zk(o7Var);
            return this;
        }

        /* renamed from: Yi */
        public C5063c mo34652Yi() {
            return ((dw2) this.f34068b).mo34652Yi();
        }

        /* renamed from: Z */
        public boolean mo34654Z() {
            return ((dw2) this.f34068b).mo34654Z();
        }

        /* renamed from: a */
        public C5173er mo34656a() {
            return ((dw2) this.f34068b).mo34656a();
        }

        /* renamed from: c7 */
        public C6248o7 mo34657c7() {
            return ((dw2) this.f34068b).mo34657c7();
        }

        public String getName() {
            return ((dw2) this.f34068b).getName();
        }

        /* renamed from: m0 */
        public boolean mo34659m0() {
            return ((dw2) this.f34068b).mo34659m0();
        }

        /* renamed from: vi */
        public q34 mo34660vi() {
            return ((dw2) this.f34068b).mo34660vi();
        }
    }

    /* renamed from: com.onedelhi.secure.dw2$c */
    public enum C5063c {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);
        

        /* renamed from: n */
        public final int f27638n;

        /* access modifiers changed from: public */
        C5063c(int i) {
            this.f27638n = i;
        }

        /* renamed from: a */
        public static C5063c m45648a(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 4) {
                return ERROR;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Deprecated
        /* renamed from: b */
        public static C5063c m45649b(int i) {
            return m45648a(i);
        }

        /* renamed from: j */
        public int mo34684j() {
            return this.f27638n;
        }
    }

    static {
        dw2 dw2 = new dw2();
        DEFAULT_INSTANCE = dw2;
        qe1.m62492dk(dw2.class, dw2);
    }

    /* renamed from: Bk */
    public static dw2 m45564Bk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Fk */
    public static C5062b m45565Fk() {
        return (C5062b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Gk */
    public static C5062b m45566Gk(dw2 dw2) {
        return (C5062b) DEFAULT_INSTANCE.mo43358gj(dw2);
    }

    /* renamed from: Hk */
    public static dw2 m45567Hk(InputStream inputStream) throws IOException {
        return (dw2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ik */
    public static dw2 m45568Ik(InputStream inputStream, zy0 zy0) throws IOException {
        return (dw2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Jk */
    public static dw2 m45569Jk(C5173er erVar) throws nt1 {
        return (dw2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Kk */
    public static dw2 m45570Kk(C5173er erVar, zy0 zy0) throws nt1 {
        return (dw2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Lk */
    public static dw2 m45571Lk(g00 g00) throws IOException {
        return (dw2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Mk */
    public static dw2 m45572Mk(g00 g00, zy0 zy0) throws IOException {
        return (dw2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Nk */
    public static dw2 m45573Nk(InputStream inputStream) throws IOException {
        return (dw2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ok */
    public static dw2 m45574Ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (dw2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Pk */
    public static dw2 m45575Pk(ByteBuffer byteBuffer) throws nt1 {
        return (dw2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Qk */
    public static dw2 m45576Qk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (dw2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Rk */
    public static dw2 m45577Rk(byte[] bArr) throws nt1 {
        return (dw2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Sk */
    public static dw2 m45578Sk(byte[] bArr, zy0 zy0) throws nt1 {
        return (dw2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Tk */
    public static cz2<dw2> m45579Tk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo34641Ak() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* renamed from: C5 */
    public boolean mo34642C5() {
        return this.resultCase_ == 4;
    }

    /* renamed from: Ck */
    public final void mo34643Ck(q34 q34) {
        q34.getClass();
        zh2 zh2 = q34;
        if (this.resultCase_ == 4) {
            zh2 = q34;
            if (this.result_ != q34.m62048yk()) {
                zh2 = ((q34.C6504b) q34.m62022Ck((q34) this.result_).mo43372Cj(q34)).mo43377Ja();
            }
        }
        this.result_ = zh2;
        this.resultCase_ = 4;
    }

    /* renamed from: Dh */
    public C6248o7 mo34644Dh() {
        return this.resultCase_ == 5 ? (C6248o7) this.result_ : C6248o7.m59006nk();
    }

    /* renamed from: Dk */
    public final void mo34645Dk(C6248o7 o7Var) {
        o7Var.getClass();
        C6248o7 o7Var2 = this.metadata_;
        if (!(o7Var2 == null || o7Var2 == C6248o7.m59006nk())) {
            o7Var = (C6248o7) ((C6248o7.C6250b) C6248o7.m59008pk(this.metadata_).mo43372Cj(o7Var)).mo43377Ja();
        }
        this.metadata_ = o7Var;
    }

    /* renamed from: Ek */
    public final void mo34646Ek(C6248o7 o7Var) {
        o7Var.getClass();
        zh2 zh2 = o7Var;
        if (this.resultCase_ == 5) {
            zh2 = o7Var;
            if (this.result_ != C6248o7.m59006nk()) {
                zh2 = ((C6248o7.C6250b) C6248o7.m59008pk((C6248o7) this.result_).mo43372Cj(o7Var)).mo43377Ja();
            }
        }
        this.result_ = zh2;
        this.resultCase_ = 5;
    }

    /* renamed from: I2 */
    public boolean mo34647I2() {
        return this.done_;
    }

    /* renamed from: Uk */
    public final void mo34648Uk(boolean z) {
        this.done_ = z;
    }

    /* renamed from: Vk */
    public final void mo34649Vk(q34 q34) {
        q34.getClass();
        this.result_ = q34;
        this.resultCase_ = 4;
    }

    /* renamed from: Wk */
    public final void mo34650Wk(C6248o7 o7Var) {
        o7Var.getClass();
        this.metadata_ = o7Var;
    }

    /* renamed from: Xk */
    public final void mo34651Xk(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Yi */
    public C5063c mo34652Yi() {
        return C5063c.m45648a(this.resultCase_);
    }

    /* renamed from: Yk */
    public final void mo34653Yk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Z */
    public boolean mo34654Z() {
        return this.resultCase_ == 5;
    }

    /* renamed from: Zk */
    public final void mo34655Zk(C6248o7 o7Var) {
        o7Var.getClass();
        this.result_ = o7Var;
        this.resultCase_ = 5;
    }

    /* renamed from: a */
    public C5173er mo34656a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: c7 */
    public C6248o7 mo34657c7() {
        C6248o7 o7Var = this.metadata_;
        return o7Var == null ? C6248o7.m59006nk() : o7Var;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5061a.f27633a[iVar.ordinal()]) {
            case 1:
                return new dw2();
            case 2:
                return new C5062b((C5061a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", q34.class, C6248o7.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<dw2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (dw2.class) {
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

    /* renamed from: m0 */
    public boolean mo34659m0() {
        return this.metadata_ != null;
    }

    /* renamed from: vi */
    public q34 mo34660vi() {
        return this.resultCase_ == 4 ? (q34) this.result_ : q34.m62048yk();
    }

    /* renamed from: vk */
    public final void mo34661vk() {
        this.done_ = false;
    }

    /* renamed from: wk */
    public final void mo34662wk() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* renamed from: xk */
    public final void mo34663xk() {
        this.metadata_ = null;
    }

    /* renamed from: yk */
    public final void mo34664yk() {
        this.name_ = m45564Bk().getName();
    }

    /* renamed from: zk */
    public final void mo34665zk() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }
}
