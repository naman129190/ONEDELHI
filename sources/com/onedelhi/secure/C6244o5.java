package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.o5 */
public final class C6244o5 extends qe1<C6244o5, C6246b> implements C6365p5 {
    /* access modifiers changed from: private */
    public static final C6244o5 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile cz2<C6244o5> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: com.onedelhi.secure.o5$a */
    public static /* synthetic */ class C6245a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32886a;

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
                f32886a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32886a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6244o5.C6245a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.o5$b */
    public static final class C6246b extends qe1.C6546b<C6244o5, C6246b> implements C6365p5 {
        public C6246b() {
            super(C6244o5.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6246b(C6245a aVar) {
            this();
        }

        /* renamed from: Cc */
        public boolean mo41519Cc() {
            return ((C6244o5) this.f34068b).mo41519Cc();
        }

        /* renamed from: Gj */
        public C6246b mo41537Gj() {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41533pk();
            return this;
        }

        /* renamed from: Hj */
        public C6246b mo41538Hj() {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41534qk();
            return this;
        }

        /* renamed from: Ij */
        public C6246b mo41539Ij() {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41535rk();
            return this;
        }

        /* renamed from: J */
        public String mo41521J() {
            return ((C6244o5) this.f34068b).mo41521J();
        }

        /* renamed from: Jj */
        public C6246b mo41540Jj(String str) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41520Ik(str);
            return this;
        }

        /* renamed from: Kj */
        public C6246b mo41541Kj(C5173er erVar) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41522Jk(erVar);
            return this;
        }

        /* renamed from: Lj */
        public C6246b mo41542Lj(String str) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41523Kk(str);
            return this;
        }

        /* renamed from: Mj */
        public C6246b mo41543Mj(C5173er erVar) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41524Lk(erVar);
            return this;
        }

        /* renamed from: Nj */
        public C6246b mo41544Nj(String str) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41525Mk(str);
            return this;
        }

        /* renamed from: Oj */
        public C6246b mo41545Oj(C5173er erVar) {
            mo43393xj();
            ((C6244o5) this.f34068b).mo41526Nk(erVar);
            return this;
        }

        /* renamed from: Pd */
        public C5173er mo41527Pd() {
            return ((C6244o5) this.f34068b).mo41527Pd();
        }

        /* renamed from: T6 */
        public boolean mo41528T6() {
            return ((C6244o5) this.f34068b).mo41528T6();
        }

        /* renamed from: Vi */
        public String mo41529Vi() {
            return ((C6244o5) this.f34068b).mo41529Vi();
        }

        /* renamed from: Za */
        public C5173er mo41530Za() {
            return ((C6244o5) this.f34068b).mo41530Za();
        }

        /* renamed from: mg */
        public String mo41531mg() {
            return ((C6244o5) this.f34068b).mo41531mg();
        }

        /* renamed from: n8 */
        public boolean mo41532n8() {
            return ((C6244o5) this.f34068b).mo41532n8();
        }

        /* renamed from: vh */
        public C5173er mo41536vh() {
            return ((C6244o5) this.f34068b).mo41536vh();
        }
    }

    static {
        C6244o5 o5Var = new C6244o5();
        DEFAULT_INSTANCE = o5Var;
        qe1.m62492dk(C6244o5.class, o5Var);
    }

    /* renamed from: Ak */
    public static C6244o5 m58921Ak(g00 g00, zy0 zy0) throws IOException {
        return (C6244o5) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static C6244o5 m58922Bk(InputStream inputStream) throws IOException {
        return (C6244o5) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static C6244o5 m58923Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6244o5) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static C6244o5 m58924Dk(ByteBuffer byteBuffer) throws nt1 {
        return (C6244o5) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static C6244o5 m58925Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6244o5) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static C6244o5 m58926Fk(byte[] bArr) throws nt1 {
        return (C6244o5) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static C6244o5 m58927Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6244o5) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<C6244o5> m58928Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: sk */
    public static C6244o5 m58939sk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C6246b m58940tk() {
        return (C6246b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C6246b m58941uk(C6244o5 o5Var) {
        return (C6246b) DEFAULT_INSTANCE.mo43358gj(o5Var);
    }

    /* renamed from: vk */
    public static C6244o5 m58942vk(InputStream inputStream) throws IOException {
        return (C6244o5) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static C6244o5 m58943wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6244o5) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static C6244o5 m58944xk(C5173er erVar) throws nt1 {
        return (C6244o5) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static C6244o5 m58945yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6244o5) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static C6244o5 m58946zk(g00 g00) throws IOException {
        return (C6244o5) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Cc */
    public boolean mo41519Cc() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Ik */
    public final void mo41520Ik(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* renamed from: J */
    public String mo41521J() {
        return this.packageName_;
    }

    /* renamed from: Jk */
    public final void mo41522Jk(C5173er erVar) {
        this.packageName_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    /* renamed from: Kk */
    public final void mo41523Kk(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* renamed from: Lk */
    public final void mo41524Lk(C5173er erVar) {
        this.sdkVersion_ = erVar.mo35543k0();
        this.bitField0_ |= 2;
    }

    /* renamed from: Mk */
    public final void mo41525Mk(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* renamed from: Nk */
    public final void mo41526Nk(C5173er erVar) {
        this.versionName_ = erVar.mo35543k0();
        this.bitField0_ |= 4;
    }

    /* renamed from: Pd */
    public C5173er mo41527Pd() {
        return C5173er.m47136w(this.packageName_);
    }

    /* renamed from: T6 */
    public boolean mo41528T6() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: Vi */
    public String mo41529Vi() {
        return this.versionName_;
    }

    /* renamed from: Za */
    public C5173er mo41530Za() {
        return C5173er.m47136w(this.versionName_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6245a.f32886a[iVar.ordinal()]) {
            case 1:
                return new C6244o5();
            case 2:
                return new C6246b((C6245a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6244o5> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6244o5.class) {
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

    /* renamed from: mg */
    public String mo41531mg() {
        return this.sdkVersion_;
    }

    /* renamed from: n8 */
    public boolean mo41532n8() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: pk */
    public final void mo41533pk() {
        this.bitField0_ &= -2;
        this.packageName_ = m58939sk().mo41521J();
    }

    /* renamed from: qk */
    public final void mo41534qk() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = m58939sk().mo41531mg();
    }

    /* renamed from: rk */
    public final void mo41535rk() {
        this.bitField0_ &= -5;
        this.versionName_ = m58939sk().mo41529Vi();
    }

    /* renamed from: vh */
    public C5173er mo41536vh() {
        return C5173er.m47136w(this.sdkVersion_);
    }
}
