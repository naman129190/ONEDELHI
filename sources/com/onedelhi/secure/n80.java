package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class n80 extends qe1<n80, C6178b> implements o80 {
    /* access modifiers changed from: private */
    public static final n80 DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile cz2<n80> PARSER;
    private String environment_ = "";

    /* renamed from: com.onedelhi.secure.n80$a */
    public static /* synthetic */ class C6177a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32455a;

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
                f32455a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32455a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n80.C6177a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.n80$b */
    public static final class C6178b extends qe1.C6546b<n80, C6178b> implements o80 {
        public C6178b() {
            super(n80.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6178b(C6177a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6178b mo40994Gj() {
            mo43393xj();
            ((n80) this.f34068b).mo40992jk();
            return this;
        }

        /* renamed from: Hj */
        public C6178b mo40995Hj(String str) {
            mo43393xj();
            ((n80) this.f34068b).mo40989Ak(str);
            return this;
        }

        /* renamed from: Ij */
        public C6178b mo40996Ij(C5173er erVar) {
            mo43393xj();
            ((n80) this.f34068b).mo40990Bk(erVar);
            return this;
        }

        /* renamed from: L6 */
        public String mo40991L6() {
            return ((n80) this.f34068b).mo40991L6();
        }

        /* renamed from: t4 */
        public C5173er mo40993t4() {
            return ((n80) this.f34068b).mo40993t4();
        }
    }

    static {
        n80 n80 = new n80();
        DEFAULT_INSTANCE = n80;
        qe1.m62492dk(n80.class, n80);
    }

    /* renamed from: kk */
    public static n80 m57973kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C6178b m57974lk() {
        return (C6178b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C6178b m57975mk(n80 n80) {
        return (C6178b) DEFAULT_INSTANCE.mo43358gj(n80);
    }

    /* renamed from: nk */
    public static n80 m57976nk(InputStream inputStream) throws IOException {
        return (n80) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static n80 m57977ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (n80) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static n80 m57978pk(C5173er erVar) throws nt1 {
        return (n80) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static n80 m57979qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (n80) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static n80 m57980rk(g00 g00) throws IOException {
        return (n80) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static n80 m57981sk(g00 g00, zy0 zy0) throws IOException {
        return (n80) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static n80 m57982tk(InputStream inputStream) throws IOException {
        return (n80) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static n80 m57983uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (n80) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static n80 m57984vk(ByteBuffer byteBuffer) throws nt1 {
        return (n80) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static n80 m57985wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (n80) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static n80 m57986xk(byte[] bArr) throws nt1 {
        return (n80) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static n80 m57987yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (n80) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<n80> m57988zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo40989Ak(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* renamed from: Bk */
    public final void mo40990Bk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.environment_ = erVar.mo35543k0();
    }

    /* renamed from: L6 */
    public String mo40991L6() {
        return this.environment_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6177a.f32455a[iVar.ordinal()]) {
            case 1:
                return new n80();
            case 2:
                return new C6178b((C6177a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<n80> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (n80.class) {
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
    public final void mo40992jk() {
        this.environment_ = m57973kk().mo40991L6();
    }

    /* renamed from: t4 */
    public C5173er mo40993t4() {
        return C5173er.m47136w(this.environment_);
    }
}
