package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class h54 extends qe1<h54, C5483b> implements i54 {
    /* access modifiers changed from: private */
    public static final h54 DEFAULT_INSTANCE;
    private static volatile cz2<h54> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: com.onedelhi.secure.h54$a */
    public static /* synthetic */ class C5482a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29481a;

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
                f29481a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29481a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h54.C5482a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.h54$b */
    public static final class C5483b extends qe1.C6546b<h54, C5483b> implements i54 {
        public C5483b() {
            super(h54.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5483b(C5482a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5483b mo37212Gj() {
            mo43393xj();
            ((h54) this.f34068b).mo37210jk();
            return this;
        }

        /* renamed from: Hj */
        public C5483b mo37213Hj(String str) {
            mo43393xj();
            ((h54) this.f34068b).mo37207Bk(str);
            return this;
        }

        /* renamed from: Ij */
        public C5483b mo37214Ij(C5173er erVar) {
            mo43393xj();
            ((h54) this.f34068b).mo37208Ck(erVar);
            return this;
        }

        /* renamed from: T0 */
        public String mo37209T0() {
            return ((h54) this.f34068b).mo37209T0();
        }

        /* renamed from: o3 */
        public C5173er mo37211o3() {
            return ((h54) this.f34068b).mo37211o3();
        }
    }

    static {
        h54 h54 = new h54();
        DEFAULT_INSTANCE = h54;
        qe1.m62492dk(h54.class, h54);
    }

    /* renamed from: Ak */
    public static cz2<h54> m50256Ak() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: kk */
    public static h54 m50261kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C5483b m50262lk() {
        return (C5483b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C5483b m50263mk(h54 h54) {
        return (C5483b) DEFAULT_INSTANCE.mo43358gj(h54);
    }

    /* renamed from: nk */
    public static h54 m50264nk(String str) {
        return (h54) m50262lk().mo37213Hj(str).mo43381ab();
    }

    /* renamed from: ok */
    public static h54 m50265ok(InputStream inputStream) throws IOException {
        return (h54) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: pk */
    public static h54 m50266pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (h54) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: qk */
    public static h54 m50267qk(C5173er erVar) throws nt1 {
        return (h54) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: rk */
    public static h54 m50268rk(C5173er erVar, zy0 zy0) throws nt1 {
        return (h54) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: sk */
    public static h54 m50269sk(g00 g00) throws IOException {
        return (h54) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: tk */
    public static h54 m50270tk(g00 g00, zy0 zy0) throws IOException {
        return (h54) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: uk */
    public static h54 m50271uk(InputStream inputStream) throws IOException {
        return (h54) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: vk */
    public static h54 m50272vk(InputStream inputStream, zy0 zy0) throws IOException {
        return (h54) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: wk */
    public static h54 m50273wk(ByteBuffer byteBuffer) throws nt1 {
        return (h54) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: xk */
    public static h54 m50274xk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (h54) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: yk */
    public static h54 m50275yk(byte[] bArr) throws nt1 {
        return (h54) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: zk */
    public static h54 m50276zk(byte[] bArr, zy0 zy0) throws nt1 {
        return (h54) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public final void mo37207Bk(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* renamed from: Ck */
    public final void mo37208Ck(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.value_ = erVar.mo35543k0();
    }

    /* renamed from: T0 */
    public String mo37209T0() {
        return this.value_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5482a.f29481a[iVar.ordinal()]) {
            case 1:
                return new h54();
            case 2:
                return new C5483b((C5482a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<h54> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (h54.class) {
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
    public final void mo37210jk() {
        this.value_ = m50261kk().mo37209T0();
    }

    /* renamed from: o3 */
    public C5173er mo37211o3() {
        return C5173er.m47136w(this.value_);
    }
}
