package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class x62 extends qe1<x62, C7224b> implements y62 {
    /* access modifiers changed from: private */
    public static final x62 DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile cz2<x62> PARSER;
    private String locale_ = "";
    private String message_ = "";

    /* renamed from: com.onedelhi.secure.x62$a */
    public static /* synthetic */ class C7223a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37348a;

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
                f37348a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37348a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x62.C7223a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.x62$b */
    public static final class C7224b extends qe1.C6546b<x62, C7224b> implements y62 {
        public C7224b() {
            super(x62.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7224b(C7223a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7224b mo47061Gj() {
            mo43393xj();
            ((x62) this.f34068b).mo47057mk();
            return this;
        }

        /* renamed from: Hj */
        public C7224b mo47062Hj() {
            mo43393xj();
            ((x62) this.f34068b).mo47059nk();
            return this;
        }

        /* renamed from: I3 */
        public String mo47055I3() {
            return ((x62) this.f34068b).mo47055I3();
        }

        /* renamed from: Ij */
        public C7224b mo47063Ij(String str) {
            mo43393xj();
            ((x62) this.f34068b).mo47051Ek(str);
            return this;
        }

        /* renamed from: Jj */
        public C7224b mo47064Jj(C5173er erVar) {
            mo43393xj();
            ((x62) this.f34068b).mo47052Fk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C7224b mo47065Kj(String str) {
            mo43393xj();
            ((x62) this.f34068b).mo47053Gk(str);
            return this;
        }

        /* renamed from: Lj */
        public C7224b mo47066Lj(C5173er erVar) {
            mo43393xj();
            ((x62) this.f34068b).mo47054Hk(erVar);
            return this;
        }

        /* renamed from: c5 */
        public C5173er mo47056c5() {
            return ((x62) this.f34068b).mo47056c5();
        }

        /* renamed from: n1 */
        public String mo47058n1() {
            return ((x62) this.f34068b).mo47058n1();
        }

        /* renamed from: r0 */
        public C5173er mo47060r0() {
            return ((x62) this.f34068b).mo47060r0();
        }
    }

    static {
        x62 x62 = new x62();
        DEFAULT_INSTANCE = x62;
        qe1.m62492dk(x62.class, x62);
    }

    /* renamed from: Ak */
    public static x62 m69934Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (x62) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static x62 m69935Bk(byte[] bArr) throws nt1 {
        return (x62) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static x62 m69936Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (x62) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<x62> m69937Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ok */
    public static x62 m69945ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C7224b m69946pk() {
        return (C7224b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C7224b m69947qk(x62 x62) {
        return (C7224b) DEFAULT_INSTANCE.mo43358gj(x62);
    }

    /* renamed from: rk */
    public static x62 m69948rk(InputStream inputStream) throws IOException {
        return (x62) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static x62 m69949sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (x62) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static x62 m69950tk(C5173er erVar) throws nt1 {
        return (x62) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static x62 m69951uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (x62) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static x62 m69952vk(g00 g00) throws IOException {
        return (x62) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static x62 m69953wk(g00 g00, zy0 zy0) throws IOException {
        return (x62) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static x62 m69954xk(InputStream inputStream) throws IOException {
        return (x62) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static x62 m69955yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (x62) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static x62 m69956zk(ByteBuffer byteBuffer) throws nt1 {
        return (x62) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public final void mo47051Ek(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* renamed from: Fk */
    public final void mo47052Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.locale_ = erVar.mo35543k0();
    }

    /* renamed from: Gk */
    public final void mo47053Gk(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* renamed from: Hk */
    public final void mo47054Hk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.message_ = erVar.mo35543k0();
    }

    /* renamed from: I3 */
    public String mo47055I3() {
        return this.locale_;
    }

    /* renamed from: c5 */
    public C5173er mo47056c5() {
        return C5173er.m47136w(this.locale_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7223a.f37348a[iVar.ordinal()]) {
            case 1:
                return new x62();
            case 2:
                return new C7224b((C7223a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<x62> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (x62.class) {
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
    public final void mo47057mk() {
        this.locale_ = m69945ok().mo47055I3();
    }

    /* renamed from: n1 */
    public String mo47058n1() {
        return this.message_;
    }

    /* renamed from: nk */
    public final void mo47059nk() {
        this.message_ = m69945ok().mo47058n1();
    }

    /* renamed from: r0 */
    public C5173er mo47060r0() {
        return C5173er.m47136w(this.message_);
    }
}
