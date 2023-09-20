package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.gd */
public final class C5406gd extends qe1<C5406gd, C5408b> implements C5502hd {
    /* access modifiers changed from: private */
    public static final C5406gd DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile cz2<C5406gd> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_ = "";
    private String resource_ = "";

    /* renamed from: com.onedelhi.secure.gd$a */
    public static /* synthetic */ class C5407a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29132a;

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
                f29132a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29132a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5406gd.C5407a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.gd$b */
    public static final class C5408b extends qe1.C6546b<C5406gd, C5408b> implements C5502hd {
        public C5408b() {
            super(C5406gd.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5408b(C5407a aVar) {
            this();
        }

        /* renamed from: Ci */
        public String mo36659Ci() {
            return ((C5406gd) this.f34068b).mo36659Ci();
        }

        /* renamed from: E5 */
        public String mo36660E5() {
            return ((C5406gd) this.f34068b).mo36660E5();
        }

        /* renamed from: Gj */
        public C5408b mo36672Gj() {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36669ok();
            return this;
        }

        /* renamed from: Hj */
        public C5408b mo36673Hj() {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36670pk();
            return this;
        }

        /* renamed from: Ij */
        public C5408b mo36674Ij() {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36671qk();
            return this;
        }

        /* renamed from: Jj */
        public C5408b mo36675Jj(boolean z) {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36661Hk(z);
            return this;
        }

        /* renamed from: Kj */
        public C5408b mo36676Kj(String str) {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36662Ik(str);
            return this;
        }

        /* renamed from: Lj */
        public C5408b mo36677Lj(C5173er erVar) {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36663Jk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C5408b mo36678Mj(String str) {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36664Kk(str);
            return this;
        }

        /* renamed from: Nj */
        public C5408b mo36679Nj(C5173er erVar) {
            mo43393xj();
            ((C5406gd) this.f34068b).mo36665Lk(erVar);
            return this;
        }

        /* renamed from: b7 */
        public C5173er mo36666b7() {
            return ((C5406gd) this.f34068b).mo36666b7();
        }

        /* renamed from: hg */
        public C5173er mo36667hg() {
            return ((C5406gd) this.f34068b).mo36667hg();
        }

        /* renamed from: kh */
        public boolean mo36668kh() {
            return ((C5406gd) this.f34068b).mo36668kh();
        }
    }

    static {
        C5406gd gdVar = new C5406gd();
        DEFAULT_INSTANCE = gdVar;
        qe1.m62492dk(C5406gd.class, gdVar);
    }

    /* renamed from: Ak */
    public static C5406gd m49321Ak(InputStream inputStream) throws IOException {
        return (C5406gd) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Bk */
    public static C5406gd m49322Bk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5406gd) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ck */
    public static C5406gd m49323Ck(ByteBuffer byteBuffer) throws nt1 {
        return (C5406gd) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Dk */
    public static C5406gd m49324Dk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5406gd) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ek */
    public static C5406gd m49325Ek(byte[] bArr) throws nt1 {
        return (C5406gd) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Fk */
    public static C5406gd m49326Fk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5406gd) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Gk */
    public static cz2<C5406gd> m49327Gk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: rk */
    public static C5406gd m49337rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: sk */
    public static C5408b m49338sk() {
        return (C5408b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: tk */
    public static C5408b m49339tk(C5406gd gdVar) {
        return (C5408b) DEFAULT_INSTANCE.mo43358gj(gdVar);
    }

    /* renamed from: uk */
    public static C5406gd m49340uk(InputStream inputStream) throws IOException {
        return (C5406gd) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: vk */
    public static C5406gd m49341vk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5406gd) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: wk */
    public static C5406gd m49342wk(C5173er erVar) throws nt1 {
        return (C5406gd) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: xk */
    public static C5406gd m49343xk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5406gd) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: yk */
    public static C5406gd m49344yk(g00 g00) throws IOException {
        return (C5406gd) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: zk */
    public static C5406gd m49345zk(g00 g00, zy0 zy0) throws IOException {
        return (C5406gd) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ci */
    public String mo36659Ci() {
        return this.resource_;
    }

    /* renamed from: E5 */
    public String mo36660E5() {
        return this.permission_;
    }

    /* renamed from: Hk */
    public final void mo36661Hk(boolean z) {
        this.granted_ = z;
    }

    /* renamed from: Ik */
    public final void mo36662Ik(String str) {
        str.getClass();
        this.permission_ = str;
    }

    /* renamed from: Jk */
    public final void mo36663Jk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.permission_ = erVar.mo35543k0();
    }

    /* renamed from: Kk */
    public final void mo36664Kk(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* renamed from: Lk */
    public final void mo36665Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.resource_ = erVar.mo35543k0();
    }

    /* renamed from: b7 */
    public C5173er mo36666b7() {
        return C5173er.m47136w(this.resource_);
    }

    /* renamed from: hg */
    public C5173er mo36667hg() {
        return C5173er.m47136w(this.permission_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5407a.f29132a[iVar.ordinal()]) {
            case 1:
                return new C5406gd();
            case 2:
                return new C5408b((C5407a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5406gd> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5406gd.class) {
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

    /* renamed from: kh */
    public boolean mo36668kh() {
        return this.granted_;
    }

    /* renamed from: ok */
    public final void mo36669ok() {
        this.granted_ = false;
    }

    /* renamed from: pk */
    public final void mo36670pk() {
        this.permission_ = m49337rk().mo36660E5();
    }

    /* renamed from: qk */
    public final void mo36671qk() {
        this.resource_ = m49337rk().mo36659Ci();
    }
}
