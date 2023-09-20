package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.o7 */
public final class C6248o7 extends qe1<C6248o7, C6250b> implements C6514q7 {
    /* access modifiers changed from: private */
    public static final C6248o7 DEFAULT_INSTANCE;
    private static volatile cz2<C6248o7> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private C5173er value_ = C5173er.f28039a;

    /* renamed from: com.onedelhi.secure.o7$a */
    public static /* synthetic */ class C6249a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32893a;

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
                f32893a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32893a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6248o7.C6249a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.o7$b */
    public static final class C6250b extends qe1.C6546b<C6248o7, C6250b> implements C6514q7 {
        public C6250b() {
            super(C6248o7.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6250b(C6249a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6250b mo41559Gj() {
            mo43393xj();
            ((C6248o7) this.f34068b).mo41557lk();
            return this;
        }

        /* renamed from: H1 */
        public C5173er mo41554H1() {
            return ((C6248o7) this.f34068b).mo41554H1();
        }

        /* renamed from: Hj */
        public C6250b mo41560Hj() {
            mo43393xj();
            ((C6248o7) this.f34068b).mo41558mk();
            return this;
        }

        /* renamed from: Ij */
        public C6250b mo41561Ij(String str) {
            mo43393xj();
            ((C6248o7) this.f34068b).mo41551Dk(str);
            return this;
        }

        /* renamed from: Jj */
        public C6250b mo41562Jj(C5173er erVar) {
            mo43393xj();
            ((C6248o7) this.f34068b).mo41552Ek(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C6250b mo41563Kj(C5173er erVar) {
            mo43393xj();
            ((C6248o7) this.f34068b).mo41553Fk(erVar);
            return this;
        }

        /* renamed from: Q1 */
        public C5173er mo41555Q1() {
            return ((C6248o7) this.f34068b).mo41555Q1();
        }

        /* renamed from: X1 */
        public String mo41556X1() {
            return ((C6248o7) this.f34068b).mo41556X1();
        }
    }

    static {
        C6248o7 o7Var = new C6248o7();
        DEFAULT_INSTANCE = o7Var;
        qe1.m62492dk(C6248o7.class, o7Var);
    }

    /* renamed from: Ak */
    public static C6248o7 m58997Ak(byte[] bArr) throws nt1 {
        return (C6248o7) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Bk */
    public static C6248o7 m58998Bk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6248o7) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ck */
    public static cz2<C6248o7> m58999Ck() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: nk */
    public static C6248o7 m59006nk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ok */
    public static C6250b m59007ok() {
        return (C6250b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: pk */
    public static C6250b m59008pk(C6248o7 o7Var) {
        return (C6250b) DEFAULT_INSTANCE.mo43358gj(o7Var);
    }

    /* renamed from: qk */
    public static C6248o7 m59009qk(InputStream inputStream) throws IOException {
        return (C6248o7) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: rk */
    public static C6248o7 m59010rk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6248o7) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: sk */
    public static C6248o7 m59011sk(C5173er erVar) throws nt1 {
        return (C6248o7) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: tk */
    public static C6248o7 m59012tk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6248o7) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: uk */
    public static C6248o7 m59013uk(g00 g00) throws IOException {
        return (C6248o7) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: vk */
    public static C6248o7 m59014vk(g00 g00, zy0 zy0) throws IOException {
        return (C6248o7) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: wk */
    public static C6248o7 m59015wk(InputStream inputStream) throws IOException {
        return (C6248o7) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static C6248o7 m59016xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6248o7) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static C6248o7 m59017yk(ByteBuffer byteBuffer) throws nt1 {
        return (C6248o7) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: zk */
    public static C6248o7 m59018zk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6248o7) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Dk */
    public final void mo41551Dk(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Ek */
    public final void mo41552Ek(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.typeUrl_ = erVar.mo35543k0();
    }

    /* renamed from: Fk */
    public final void mo41553Fk(C5173er erVar) {
        erVar.getClass();
        this.value_ = erVar;
    }

    /* renamed from: H1 */
    public C5173er mo41554H1() {
        return this.value_;
    }

    /* renamed from: Q1 */
    public C5173er mo41555Q1() {
        return C5173er.m47136w(this.typeUrl_);
    }

    /* renamed from: X1 */
    public String mo41556X1() {
        return this.typeUrl_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6249a.f32893a[iVar.ordinal()]) {
            case 1:
                return new C6248o7();
            case 2:
                return new C6250b((C6249a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6248o7> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6248o7.class) {
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

    /* renamed from: lk */
    public final void mo41557lk() {
        this.typeUrl_ = m59006nk().mo41556X1();
    }

    /* renamed from: mk */
    public final void mo41558mk() {
        this.value_ = m59006nk().mo41554H1();
    }
}
