package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class pk3 extends qe1<pk3, C6459b> implements qk3 {
    /* access modifiers changed from: private */
    public static final pk3 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile cz2<pk3> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String owner_ = "";
    private String resourceName_ = "";
    private String resourceType_ = "";

    /* renamed from: com.onedelhi.secure.pk3$a */
    public static /* synthetic */ class C6458a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33707a;

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
                f33707a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33707a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pk3.C6458a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.pk3$b */
    public static final class C6459b extends qe1.C6546b<pk3, C6459b> implements qk3 {
        public C6459b() {
            super(pk3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6459b(C6458a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6459b mo42792Gj() {
            mo43393xj();
            ((pk3) this.f34068b).mo42788sk();
            return this;
        }

        /* renamed from: Hh */
        public String mo42772Hh() {
            return ((pk3) this.f34068b).mo42772Hh();
        }

        /* renamed from: Hj */
        public C6459b mo42793Hj() {
            mo43393xj();
            ((pk3) this.f34068b).mo42789tk();
            return this;
        }

        /* renamed from: Ij */
        public C6459b mo42794Ij() {
            mo43393xj();
            ((pk3) this.f34068b).mo42790uk();
            return this;
        }

        /* renamed from: Jj */
        public C6459b mo42795Jj() {
            mo43393xj();
            ((pk3) this.f34068b).mo42791vk();
            return this;
        }

        /* renamed from: Kj */
        public C6459b mo42796Kj(String str) {
            mo43393xj();
            ((pk3) this.f34068b).mo42773Mk(str);
            return this;
        }

        /* renamed from: Lj */
        public C6459b mo42797Lj(C5173er erVar) {
            mo43393xj();
            ((pk3) this.f34068b).mo42774Nk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C6459b mo42798Mj(String str) {
            mo43393xj();
            ((pk3) this.f34068b).mo42775Ok(str);
            return this;
        }

        /* renamed from: Nj */
        public C6459b mo42799Nj(C5173er erVar) {
            mo43393xj();
            ((pk3) this.f34068b).mo42776Pk(erVar);
            return this;
        }

        /* renamed from: Oj */
        public C6459b mo42800Oj(String str) {
            mo43393xj();
            ((pk3) this.f34068b).mo42778Qk(str);
            return this;
        }

        /* renamed from: Pj */
        public C6459b mo42801Pj(C5173er erVar) {
            mo43393xj();
            ((pk3) this.f34068b).mo42779Rk(erVar);
            return this;
        }

        /* renamed from: Q5 */
        public String mo42777Q5() {
            return ((pk3) this.f34068b).mo42777Q5();
        }

        /* renamed from: Qj */
        public C6459b mo42802Qj(String str) {
            mo43393xj();
            ((pk3) this.f34068b).mo42780Sk(str);
            return this;
        }

        /* renamed from: Rj */
        public C6459b mo42803Rj(C5173er erVar) {
            mo43393xj();
            ((pk3) this.f34068b).mo42781Tk(erVar);
            return this;
        }

        /* renamed from: Y0 */
        public String mo42782Y0() {
            return ((pk3) this.f34068b).mo42782Y0();
        }

        /* renamed from: b */
        public C5173er mo42783b() {
            return ((pk3) this.f34068b).mo42783b();
        }

        /* renamed from: c */
        public String mo42784c() {
            return ((pk3) this.f34068b).mo42784c();
        }

        /* renamed from: dc */
        public C5173er mo42785dc() {
            return ((pk3) this.f34068b).mo42785dc();
        }

        /* renamed from: lg */
        public C5173er mo42786lg() {
            return ((pk3) this.f34068b).mo42786lg();
        }

        /* renamed from: p0 */
        public C5173er mo42787p0() {
            return ((pk3) this.f34068b).mo42787p0();
        }
    }

    static {
        pk3 pk3 = new pk3();
        DEFAULT_INSTANCE = pk3;
        qe1.m62492dk(pk3.class, pk3);
    }

    /* renamed from: Ak */
    public static pk3 m61331Ak(InputStream inputStream, zy0 zy0) throws IOException {
        return (pk3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Bk */
    public static pk3 m61332Bk(C5173er erVar) throws nt1 {
        return (pk3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Ck */
    public static pk3 m61333Ck(C5173er erVar, zy0 zy0) throws nt1 {
        return (pk3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Dk */
    public static pk3 m61334Dk(g00 g00) throws IOException {
        return (pk3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ek */
    public static pk3 m61335Ek(g00 g00, zy0 zy0) throws IOException {
        return (pk3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Fk */
    public static pk3 m61336Fk(InputStream inputStream) throws IOException {
        return (pk3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Gk */
    public static pk3 m61337Gk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pk3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Hk */
    public static pk3 m61338Hk(ByteBuffer byteBuffer) throws nt1 {
        return (pk3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ik */
    public static pk3 m61339Ik(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (pk3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Jk */
    public static pk3 m61340Jk(byte[] bArr) throws nt1 {
        return (pk3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Kk */
    public static pk3 m61341Kk(byte[] bArr, zy0 zy0) throws nt1 {
        return (pk3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Lk */
    public static cz2<pk3> m61342Lk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: wk */
    public static pk3 m61356wk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: xk */
    public static C6459b m61357xk() {
        return (C6459b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: yk */
    public static C6459b m61358yk(pk3 pk3) {
        return (C6459b) DEFAULT_INSTANCE.mo43358gj(pk3);
    }

    /* renamed from: zk */
    public static pk3 m61359zk(InputStream inputStream) throws IOException {
        return (pk3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Hh */
    public String mo42772Hh() {
        return this.resourceType_;
    }

    /* renamed from: Mk */
    public final void mo42773Mk(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: Nk */
    public final void mo42774Nk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: Ok */
    public final void mo42775Ok(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* renamed from: Pk */
    public final void mo42776Pk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.owner_ = erVar.mo35543k0();
    }

    /* renamed from: Q5 */
    public String mo42777Q5() {
        return this.owner_;
    }

    /* renamed from: Qk */
    public final void mo42778Qk(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* renamed from: Rk */
    public final void mo42779Rk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.resourceName_ = erVar.mo35543k0();
    }

    /* renamed from: Sk */
    public final void mo42780Sk(String str) {
        str.getClass();
        this.resourceType_ = str;
    }

    /* renamed from: Tk */
    public final void mo42781Tk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.resourceType_ = erVar.mo35543k0();
    }

    /* renamed from: Y0 */
    public String mo42782Y0() {
        return this.resourceName_;
    }

    /* renamed from: b */
    public C5173er mo42783b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo42784c() {
        return this.description_;
    }

    /* renamed from: dc */
    public C5173er mo42785dc() {
        return C5173er.m47136w(this.owner_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6458a.f33707a[iVar.ordinal()]) {
            case 1:
                return new pk3();
            case 2:
                return new C6459b((C6458a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<pk3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (pk3.class) {
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

    /* renamed from: lg */
    public C5173er mo42786lg() {
        return C5173er.m47136w(this.resourceType_);
    }

    /* renamed from: p0 */
    public C5173er mo42787p0() {
        return C5173er.m47136w(this.resourceName_);
    }

    /* renamed from: sk */
    public final void mo42788sk() {
        this.description_ = m61356wk().mo42784c();
    }

    /* renamed from: tk */
    public final void mo42789tk() {
        this.owner_ = m61356wk().mo42777Q5();
    }

    /* renamed from: uk */
    public final void mo42790uk() {
        this.resourceName_ = m61356wk().mo42782Y0();
    }

    /* renamed from: vk */
    public final void mo42791vk() {
        this.resourceType_ = m61356wk().mo42772Hh();
    }
}
