package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.cu */
public final class C4912cu extends qe1<C4912cu, C4914b> implements C5057du {
    /* access modifiers changed from: private */
    public static final C4912cu DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<C4912cu> PARSER;
    private String name_ = "";

    /* renamed from: com.onedelhi.secure.cu$a */
    public static /* synthetic */ class C4913a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27057a;

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
                f27057a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27057a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4912cu.C4913a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.cu$b */
    public static final class C4914b extends qe1.C6546b<C4912cu, C4914b> implements C5057du {
        public C4914b() {
            super(C4912cu.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4914b(C4913a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4914b mo33943Gj() {
            mo43393xj();
            ((C4912cu) this.f34068b).mo33942jk();
            return this;
        }

        /* renamed from: Hj */
        public C4914b mo33944Hj(String str) {
            mo43393xj();
            ((C4912cu) this.f34068b).mo33938Ak(str);
            return this;
        }

        /* renamed from: Ij */
        public C4914b mo33945Ij(C5173er erVar) {
            mo43393xj();
            ((C4912cu) this.f34068b).mo33939Bk(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo33940a() {
            return ((C4912cu) this.f34068b).mo33940a();
        }

        public String getName() {
            return ((C4912cu) this.f34068b).getName();
        }
    }

    static {
        C4912cu cuVar = new C4912cu();
        DEFAULT_INSTANCE = cuVar;
        qe1.m62492dk(C4912cu.class, cuVar);
    }

    /* renamed from: kk */
    public static C4912cu m44280kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C4914b m44281lk() {
        return (C4914b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C4914b m44282mk(C4912cu cuVar) {
        return (C4914b) DEFAULT_INSTANCE.mo43358gj(cuVar);
    }

    /* renamed from: nk */
    public static C4912cu m44283nk(InputStream inputStream) throws IOException {
        return (C4912cu) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static C4912cu m44284ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (C4912cu) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static C4912cu m44285pk(C5173er erVar) throws nt1 {
        return (C4912cu) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static C4912cu m44286qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C4912cu) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static C4912cu m44287rk(g00 g00) throws IOException {
        return (C4912cu) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static C4912cu m44288sk(g00 g00, zy0 zy0) throws IOException {
        return (C4912cu) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static C4912cu m44289tk(InputStream inputStream) throws IOException {
        return (C4912cu) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static C4912cu m44290uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C4912cu) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static C4912cu m44291vk(ByteBuffer byteBuffer) throws nt1 {
        return (C4912cu) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static C4912cu m44292wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C4912cu) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static C4912cu m44293xk(byte[] bArr) throws nt1 {
        return (C4912cu) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static C4912cu m44294yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C4912cu) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<C4912cu> m44295zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo33938Ak(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Bk */
    public final void mo33939Bk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: a */
    public C5173er mo33940a() {
        return C5173er.m47136w(this.name_);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4913a.f27057a[iVar.ordinal()]) {
            case 1:
                return new C4912cu();
            case 2:
                return new C4914b((C4913a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C4912cu> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C4912cu.class) {
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

    /* renamed from: jk */
    public final void mo33942jk() {
        this.name_ = m44280kk().getName();
    }
}
