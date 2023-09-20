package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class dx1 extends qe1<dx1, C5065b> implements ex1 {
    /* access modifiers changed from: private */
    public static final dx1 DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile cz2<dx1> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_ = 0;
    private Object in_;
    private String valuePrefix_ = "";

    /* renamed from: com.onedelhi.secure.dx1$a */
    public static /* synthetic */ class C5064a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27640a;

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
                f27640a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27640a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dx1.C5064a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.dx1$b */
    public static final class C5065b extends qe1.C6546b<dx1, C5065b> implements ex1 {
        public C5065b() {
            super(dx1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5065b(C5064a aVar) {
            this();
        }

        /* renamed from: Gi */
        public C5066c mo34686Gi() {
            return ((dx1) this.f34068b).mo34686Gi();
        }

        /* renamed from: Gj */
        public C5065b mo34703Gj() {
            mo43393xj();
            ((dx1) this.f34068b).mo34698qk();
            return this;
        }

        /* renamed from: Hj */
        public C5065b mo34704Hj() {
            mo43393xj();
            ((dx1) this.f34068b).mo34700rk();
            return this;
        }

        /* renamed from: Ij */
        public C5065b mo34705Ij() {
            mo43393xj();
            ((dx1) this.f34068b).mo34701sk();
            return this;
        }

        /* renamed from: Jj */
        public C5065b mo34706Jj() {
            mo43393xj();
            ((dx1) this.f34068b).mo34702tk();
            return this;
        }

        /* renamed from: Kj */
        public C5065b mo34707Kj(String str) {
            mo43393xj();
            ((dx1) this.f34068b).mo34687Kk(str);
            return this;
        }

        /* renamed from: L0 */
        public C5173er mo34688L0() {
            return ((dx1) this.f34068b).mo34688L0();
        }

        /* renamed from: Lj */
        public C5065b mo34708Lj(C5173er erVar) {
            mo43393xj();
            ((dx1) this.f34068b).mo34689Lk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C5065b mo34709Mj(String str) {
            mo43393xj();
            ((dx1) this.f34068b).mo34690Mk(str);
            return this;
        }

        /* renamed from: Nj */
        public C5065b mo34710Nj(C5173er erVar) {
            mo43393xj();
            ((dx1) this.f34068b).mo34691Nk(erVar);
            return this;
        }

        /* renamed from: Oj */
        public C5065b mo34711Oj(String str) {
            mo43393xj();
            ((dx1) this.f34068b).mo34692Ok(str);
            return this;
        }

        /* renamed from: Pj */
        public C5065b mo34712Pj(C5173er erVar) {
            mo43393xj();
            ((dx1) this.f34068b).mo34693Pk(erVar);
            return this;
        }

        /* renamed from: Uf */
        public String mo34694Uf() {
            return ((dx1) this.f34068b).mo34694Uf();
        }

        /* renamed from: gg */
        public String mo34695gg() {
            return ((dx1) this.f34068b).mo34695gg();
        }

        /* renamed from: ih */
        public C5173er mo34696ih() {
            return ((dx1) this.f34068b).mo34696ih();
        }

        /* renamed from: p1 */
        public String mo34697p1() {
            return ((dx1) this.f34068b).mo34697p1();
        }

        /* renamed from: rc */
        public C5173er mo34699rc() {
            return ((dx1) this.f34068b).mo34699rc();
        }
    }

    /* renamed from: com.onedelhi.secure.dx1$c */
    public enum C5066c {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);
        

        /* renamed from: n */
        public final int f27645n;

        /* access modifiers changed from: public */
        C5066c(int i) {
            this.f27645n = i;
        }

        /* renamed from: a */
        public static C5066c m45717a(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }

        @Deprecated
        /* renamed from: b */
        public static C5066c m45718b(int i) {
            return m45717a(i);
        }

        /* renamed from: j */
        public int mo34713j() {
            return this.f27645n;
        }
    }

    static {
        dx1 dx1 = new dx1();
        DEFAULT_INSTANCE = dx1;
        qe1.m62492dk(dx1.class, dx1);
    }

    /* renamed from: Ak */
    public static dx1 m45655Ak(C5173er erVar, zy0 zy0) throws nt1 {
        return (dx1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Bk */
    public static dx1 m45656Bk(g00 g00) throws IOException {
        return (dx1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ck */
    public static dx1 m45657Ck(g00 g00, zy0 zy0) throws IOException {
        return (dx1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Dk */
    public static dx1 m45658Dk(InputStream inputStream) throws IOException {
        return (dx1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static dx1 m45659Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (dx1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static dx1 m45660Fk(ByteBuffer byteBuffer) throws nt1 {
        return (dx1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Gk */
    public static dx1 m45661Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (dx1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Hk */
    public static dx1 m45662Hk(byte[] bArr) throws nt1 {
        return (dx1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ik */
    public static dx1 m45663Ik(byte[] bArr, zy0 zy0) throws nt1 {
        return (dx1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Jk */
    public static cz2<dx1> m45664Jk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: uk */
    public static dx1 m45676uk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: vk */
    public static C5065b m45677vk() {
        return (C5065b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: wk */
    public static C5065b m45678wk(dx1 dx1) {
        return (C5065b) DEFAULT_INSTANCE.mo43358gj(dx1);
    }

    /* renamed from: xk */
    public static dx1 m45679xk(InputStream inputStream) throws IOException {
        return (dx1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static dx1 m45680yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (dx1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static dx1 m45681zk(C5173er erVar) throws nt1 {
        return (dx1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Gi */
    public C5066c mo34686Gi() {
        return C5066c.m45717a(this.inCase_);
    }

    /* renamed from: Kk */
    public final void mo34687Kk(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* renamed from: L0 */
    public C5173er mo34688L0() {
        return C5173er.m47136w(this.inCase_ == 2 ? (String) this.in_ : "");
    }

    /* renamed from: Lk */
    public final void mo34689Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.in_ = erVar.mo35543k0();
        this.inCase_ = 1;
    }

    /* renamed from: Mk */
    public final void mo34690Mk(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* renamed from: Nk */
    public final void mo34691Nk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.in_ = erVar.mo35543k0();
        this.inCase_ = 2;
    }

    /* renamed from: Ok */
    public final void mo34692Ok(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* renamed from: Pk */
    public final void mo34693Pk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.valuePrefix_ = erVar.mo35543k0();
    }

    /* renamed from: Uf */
    public String mo34694Uf() {
        return this.valuePrefix_;
    }

    /* renamed from: gg */
    public String mo34695gg() {
        return this.inCase_ == 1 ? (String) this.in_ : "";
    }

    /* renamed from: ih */
    public C5173er mo34696ih() {
        return C5173er.m47136w(this.valuePrefix_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5064a.f27640a[iVar.ordinal()]) {
            case 1:
                return new dx1();
            case 2:
                return new C5065b((C5064a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<dx1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (dx1.class) {
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

    /* renamed from: p1 */
    public String mo34697p1() {
        return this.inCase_ == 2 ? (String) this.in_ : "";
    }

    /* renamed from: qk */
    public final void mo34698qk() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* renamed from: rc */
    public C5173er mo34699rc() {
        return C5173er.m47136w(this.inCase_ == 1 ? (String) this.in_ : "");
    }

    /* renamed from: rk */
    public final void mo34700rk() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* renamed from: sk */
    public final void mo34701sk() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* renamed from: tk */
    public final void mo34702tk() {
        this.valuePrefix_ = m45676uk().mo34694Uf();
    }
}
