package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ee0 extends qe1<ee0, C5124b> implements he0 {
    public static final int DAY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final ee0 DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile cz2<ee0> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    /* renamed from: com.onedelhi.secure.ee0$a */
    public static /* synthetic */ class C5123a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27859a;

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
                f27859a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27859a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ee0.C5123a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ee0$b */
    public static final class C5124b extends qe1.C6546b<ee0, C5124b> implements he0 {
        public C5124b() {
            super(ee0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5124b(C5123a aVar) {
            this();
        }

        /* renamed from: F0 */
        public int mo35144F0() {
            return ((ee0) this.f34068b).mo35144F0();
        }

        /* renamed from: Gj */
        public C5124b mo35153Gj() {
            mo43393xj();
            ((ee0) this.f34068b).mo35150mk();
            return this;
        }

        /* renamed from: Hj */
        public C5124b mo35154Hj() {
            mo43393xj();
            ((ee0) this.f34068b).mo35151nk();
            return this;
        }

        /* renamed from: Ij */
        public C5124b mo35155Ij() {
            mo43393xj();
            ((ee0) this.f34068b).mo35152ok();
            return this;
        }

        /* renamed from: Jj */
        public C5124b mo35156Jj(int i) {
            mo43393xj();
            ((ee0) this.f34068b).mo35145Fk(i);
            return this;
        }

        /* renamed from: Kj */
        public C5124b mo35157Kj(int i) {
            mo43393xj();
            ((ee0) this.f34068b).mo35146Gk(i);
            return this;
        }

        /* renamed from: Lj */
        public C5124b mo35158Lj(int i) {
            mo43393xj();
            ((ee0) this.f34068b).mo35147Hk(i);
            return this;
        }

        /* renamed from: P0 */
        public int mo35148P0() {
            return ((ee0) this.f34068b).mo35148P0();
        }

        /* renamed from: f1 */
        public int mo35149f1() {
            return ((ee0) this.f34068b).mo35149f1();
        }
    }

    static {
        ee0 ee0 = new ee0();
        DEFAULT_INSTANCE = ee0;
        qe1.m62492dk(ee0.class, ee0);
    }

    /* renamed from: Ak */
    public static ee0 m46479Ak(ByteBuffer byteBuffer) throws nt1 {
        return (ee0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Bk */
    public static ee0 m46480Bk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ee0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ck */
    public static ee0 m46481Ck(byte[] bArr) throws nt1 {
        return (ee0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Dk */
    public static ee0 m46482Dk(byte[] bArr, zy0 zy0) throws nt1 {
        return (ee0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ek */
    public static cz2<ee0> m46483Ek() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: pk */
    public static ee0 m46491pk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: qk */
    public static C5124b m46492qk() {
        return (C5124b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: rk */
    public static C5124b m46493rk(ee0 ee0) {
        return (C5124b) DEFAULT_INSTANCE.mo43358gj(ee0);
    }

    /* renamed from: sk */
    public static ee0 m46494sk(InputStream inputStream) throws IOException {
        return (ee0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: tk */
    public static ee0 m46495tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ee0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: uk */
    public static ee0 m46496uk(C5173er erVar) throws nt1 {
        return (ee0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: vk */
    public static ee0 m46497vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ee0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: wk */
    public static ee0 m46498wk(g00 g00) throws IOException {
        return (ee0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: xk */
    public static ee0 m46499xk(g00 g00, zy0 zy0) throws IOException {
        return (ee0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: yk */
    public static ee0 m46500yk(InputStream inputStream) throws IOException {
        return (ee0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: zk */
    public static ee0 m46501zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ee0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: F0 */
    public int mo35144F0() {
        return this.month_;
    }

    /* renamed from: Fk */
    public final void mo35145Fk(int i) {
        this.day_ = i;
    }

    /* renamed from: Gk */
    public final void mo35146Gk(int i) {
        this.month_ = i;
    }

    /* renamed from: Hk */
    public final void mo35147Hk(int i) {
        this.year_ = i;
    }

    /* renamed from: P0 */
    public int mo35148P0() {
        return this.day_;
    }

    /* renamed from: f1 */
    public int mo35149f1() {
        return this.year_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5123a.f27859a[iVar.ordinal()]) {
            case 1:
                return new ee0();
            case 2:
                return new C5124b((C5123a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ee0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ee0.class) {
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
    public final void mo35150mk() {
        this.day_ = 0;
    }

    /* renamed from: nk */
    public final void mo35151nk() {
        this.month_ = 0;
    }

    /* renamed from: ok */
    public final void mo35152ok() {
        this.year_ = 0;
    }
}
