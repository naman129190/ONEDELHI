package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class bt2 extends qe1<bt2, C4696b> implements ct2 {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final bt2 DEFAULT_INSTANCE;
    private static volatile cz2<bt2> PARSER;
    private String canonicalScopes_ = "";

    /* renamed from: com.onedelhi.secure.bt2$a */
    public static /* synthetic */ class C4695a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26530a;

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
                f26530a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26530a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bt2.C4695a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.bt2$b */
    public static final class C4696b extends qe1.C6546b<bt2, C4696b> implements ct2 {
        public C4696b() {
            super(bt2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4696b(C4695a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4696b mo32028Gj() {
            mo43393xj();
            ((bt2) this.f34068b).mo32027jk();
            return this;
        }

        /* renamed from: Hj */
        public C4696b mo32029Hj(String str) {
            mo43393xj();
            ((bt2) this.f34068b).mo32023Ak(str);
            return this;
        }

        /* renamed from: Ij */
        public C4696b mo32030Ij(C5173er erVar) {
            mo43393xj();
            ((bt2) this.f34068b).mo32024Bk(erVar);
            return this;
        }

        /* renamed from: X9 */
        public String mo32025X9() {
            return ((bt2) this.f34068b).mo32025X9();
        }

        /* renamed from: eh */
        public C5173er mo32026eh() {
            return ((bt2) this.f34068b).mo32026eh();
        }
    }

    static {
        bt2 bt2 = new bt2();
        DEFAULT_INSTANCE = bt2;
        qe1.m62492dk(bt2.class, bt2);
    }

    /* renamed from: kk */
    public static bt2 m40336kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C4696b m40337lk() {
        return (C4696b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C4696b m40338mk(bt2 bt2) {
        return (C4696b) DEFAULT_INSTANCE.mo43358gj(bt2);
    }

    /* renamed from: nk */
    public static bt2 m40339nk(InputStream inputStream) throws IOException {
        return (bt2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static bt2 m40340ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (bt2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static bt2 m40341pk(C5173er erVar) throws nt1 {
        return (bt2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static bt2 m40342qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (bt2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static bt2 m40343rk(g00 g00) throws IOException {
        return (bt2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static bt2 m40344sk(g00 g00, zy0 zy0) throws IOException {
        return (bt2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static bt2 m40345tk(InputStream inputStream) throws IOException {
        return (bt2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static bt2 m40346uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (bt2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static bt2 m40347vk(ByteBuffer byteBuffer) throws nt1 {
        return (bt2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static bt2 m40348wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (bt2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static bt2 m40349xk(byte[] bArr) throws nt1 {
        return (bt2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static bt2 m40350yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (bt2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<bt2> m40351zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo32023Ak(String str) {
        str.getClass();
        this.canonicalScopes_ = str;
    }

    /* renamed from: Bk */
    public final void mo32024Bk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.canonicalScopes_ = erVar.mo35543k0();
    }

    /* renamed from: X9 */
    public String mo32025X9() {
        return this.canonicalScopes_;
    }

    /* renamed from: eh */
    public C5173er mo32026eh() {
        return C5173er.m47136w(this.canonicalScopes_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4695a.f26530a[iVar.ordinal()]) {
            case 1:
                return new bt2();
            case 2:
                return new C4696b((C4695a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<bt2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (bt2.class) {
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
    public final void mo32027jk() {
        this.canonicalScopes_ = m40336kk().mo32025X9();
    }
}
