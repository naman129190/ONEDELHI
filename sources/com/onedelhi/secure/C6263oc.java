package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.oc */
public final class C6263oc extends qe1<C6263oc, C6265b> implements C6423pc {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C6263oc DEFAULT_INSTANCE;
    private static volatile cz2<C6263oc> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_ = "";
    private String providerId_ = "";

    /* renamed from: com.onedelhi.secure.oc$a */
    public static /* synthetic */ class C6264a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32981a;

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
                f32981a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32981a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6263oc.C6264a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.oc$b */
    public static final class C6265b extends qe1.C6546b<C6263oc, C6265b> implements C6423pc {
        public C6265b() {
            super(C6263oc.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6265b(C6264a aVar) {
            this();
        }

        /* renamed from: E1 */
        public String mo41653E1() {
            return ((C6263oc) this.f34068b).mo41653E1();
        }

        /* renamed from: Gf */
        public C5173er mo41656Gf() {
            return ((C6263oc) this.f34068b).mo41656Gf();
        }

        /* renamed from: Gj */
        public C6265b mo41663Gj() {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41660mk();
            return this;
        }

        /* renamed from: Hj */
        public C6265b mo41664Hj() {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41661nk();
            return this;
        }

        /* renamed from: Ij */
        public C6265b mo41665Ij(String str) {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41654Ek(str);
            return this;
        }

        /* renamed from: Jj */
        public C6265b mo41666Jj(C5173er erVar) {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41655Fk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C6265b mo41667Kj(String str) {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41657Gk(str);
            return this;
        }

        /* renamed from: Lj */
        public C6265b mo41668Lj(C5173er erVar) {
            mo43393xj();
            ((C6263oc) this.f34068b).mo41658Hk(erVar);
            return this;
        }

        /* renamed from: e1 */
        public C5173er mo41659e1() {
            return ((C6263oc) this.f34068b).mo41659e1();
        }

        /* renamed from: o9 */
        public String mo41662o9() {
            return ((C6263oc) this.f34068b).mo41662o9();
        }
    }

    static {
        C6263oc ocVar = new C6263oc();
        DEFAULT_INSTANCE = ocVar;
        qe1.m62492dk(C6263oc.class, ocVar);
    }

    /* renamed from: Ak */
    public static C6263oc m59197Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6263oc) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static C6263oc m59198Bk(byte[] bArr) throws nt1 {
        return (C6263oc) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static C6263oc m59199Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6263oc) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<C6263oc> m59200Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ok */
    public static C6263oc m59208ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C6265b m59209pk() {
        return (C6265b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C6265b m59210qk(C6263oc ocVar) {
        return (C6265b) DEFAULT_INSTANCE.mo43358gj(ocVar);
    }

    /* renamed from: rk */
    public static C6263oc m59211rk(InputStream inputStream) throws IOException {
        return (C6263oc) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static C6263oc m59212sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6263oc) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static C6263oc m59213tk(C5173er erVar) throws nt1 {
        return (C6263oc) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static C6263oc m59214uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6263oc) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static C6263oc m59215vk(g00 g00) throws IOException {
        return (C6263oc) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static C6263oc m59216wk(g00 g00, zy0 zy0) throws IOException {
        return (C6263oc) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static C6263oc m59217xk(InputStream inputStream) throws IOException {
        return (C6263oc) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static C6263oc m59218yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6263oc) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static C6263oc m59219zk(ByteBuffer byteBuffer) throws nt1 {
        return (C6263oc) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: E1 */
    public String mo41653E1() {
        return this.audiences_;
    }

    /* renamed from: Ek */
    public final void mo41654Ek(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* renamed from: Fk */
    public final void mo41655Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.audiences_ = erVar.mo35543k0();
    }

    /* renamed from: Gf */
    public C5173er mo41656Gf() {
        return C5173er.m47136w(this.providerId_);
    }

    /* renamed from: Gk */
    public final void mo41657Gk(String str) {
        str.getClass();
        this.providerId_ = str;
    }

    /* renamed from: Hk */
    public final void mo41658Hk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.providerId_ = erVar.mo35543k0();
    }

    /* renamed from: e1 */
    public C5173er mo41659e1() {
        return C5173er.m47136w(this.audiences_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6264a.f32981a[iVar.ordinal()]) {
            case 1:
                return new C6263oc();
            case 2:
                return new C6265b((C6264a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6263oc> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6263oc.class) {
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
    public final void mo41660mk() {
        this.audiences_ = m59208ok().mo41653E1();
    }

    /* renamed from: nk */
    public final void mo41661nk() {
        this.providerId_ = m59208ok().mo41662o9();
    }

    /* renamed from: o9 */
    public String mo41662o9() {
        return this.providerId_;
    }
}
