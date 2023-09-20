package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class aj3 extends qe1<aj3, C4563b> implements bj3 {
    /* access modifiers changed from: private */
    public static final aj3 DEFAULT_INSTANCE;
    private static volatile cz2<aj3> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    /* renamed from: com.onedelhi.secure.aj3$a */
    public static /* synthetic */ class C4562a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25869a;

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
                f25869a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25869a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.aj3.C4562a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.aj3$b */
    public static final class C4563b extends qe1.C6546b<aj3, C4563b> implements bj3 {
        public C4563b() {
            super(aj3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4563b(C4562a aVar) {
            this();
        }

        /* renamed from: A1 */
        public String mo30948A1() {
            return ((aj3) this.f34068b).mo30948A1();
        }

        /* renamed from: Gj */
        public C4563b mo30958Gj() {
            mo43393xj();
            ((aj3) this.f34068b).mo30954mk();
            return this;
        }

        /* renamed from: Hj */
        public C4563b mo30959Hj() {
            mo43393xj();
            ((aj3) this.f34068b).mo30955nk();
            return this;
        }

        /* renamed from: Ij */
        public C4563b mo30960Ij(String str) {
            mo43393xj();
            ((aj3) this.f34068b).mo30949Ek(str);
            return this;
        }

        /* renamed from: Jj */
        public C4563b mo30961Jj(C5173er erVar) {
            mo43393xj();
            ((aj3) this.f34068b).mo30950Fk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C4563b mo30962Kj(String str) {
            mo43393xj();
            ((aj3) this.f34068b).mo30951Gk(str);
            return this;
        }

        /* renamed from: L3 */
        public String mo30953L3() {
            return ((aj3) this.f34068b).mo30953L3();
        }

        /* renamed from: Lj */
        public C4563b mo30963Lj(C5173er erVar) {
            mo43393xj();
            ((aj3) this.f34068b).mo30952Hk(erVar);
            return this;
        }

        /* renamed from: t9 */
        public C5173er mo30956t9() {
            return ((aj3) this.f34068b).mo30956t9();
        }

        /* renamed from: x5 */
        public C5173er mo30957x5() {
            return ((aj3) this.f34068b).mo30957x5();
        }
    }

    static {
        aj3 aj3 = new aj3();
        DEFAULT_INSTANCE = aj3;
        qe1.m62492dk(aj3.class, aj3);
    }

    /* renamed from: Ak */
    public static aj3 m38751Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (aj3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static aj3 m38752Bk(byte[] bArr) throws nt1 {
        return (aj3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static aj3 m38753Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (aj3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<aj3> m38754Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ok */
    public static aj3 m38762ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C4563b m38763pk() {
        return (C4563b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C4563b m38764qk(aj3 aj3) {
        return (C4563b) DEFAULT_INSTANCE.mo43358gj(aj3);
    }

    /* renamed from: rk */
    public static aj3 m38765rk(InputStream inputStream) throws IOException {
        return (aj3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static aj3 m38766sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (aj3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static aj3 m38767tk(C5173er erVar) throws nt1 {
        return (aj3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static aj3 m38768uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (aj3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static aj3 m38769vk(g00 g00) throws IOException {
        return (aj3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static aj3 m38770wk(g00 g00, zy0 zy0) throws IOException {
        return (aj3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static aj3 m38771xk(InputStream inputStream) throws IOException {
        return (aj3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static aj3 m38772yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (aj3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static aj3 m38773zk(ByteBuffer byteBuffer) throws nt1 {
        return (aj3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: A1 */
    public String mo30948A1() {
        return this.requestId_;
    }

    /* renamed from: Ek */
    public final void mo30949Ek(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* renamed from: Fk */
    public final void mo30950Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.requestId_ = erVar.mo35543k0();
    }

    /* renamed from: Gk */
    public final void mo30951Gk(String str) {
        str.getClass();
        this.servingData_ = str;
    }

    /* renamed from: Hk */
    public final void mo30952Hk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.servingData_ = erVar.mo35543k0();
    }

    /* renamed from: L3 */
    public String mo30953L3() {
        return this.servingData_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4562a.f25869a[iVar.ordinal()]) {
            case 1:
                return new aj3();
            case 2:
                return new C4563b((C4562a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<aj3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (aj3.class) {
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
    public final void mo30954mk() {
        this.requestId_ = m38762ok().mo30948A1();
    }

    /* renamed from: nk */
    public final void mo30955nk() {
        this.servingData_ = m38762ok().mo30953L3();
    }

    /* renamed from: t9 */
    public C5173er mo30956t9() {
        return C5173er.m47136w(this.servingData_);
    }

    /* renamed from: x5 */
    public C5173er mo30957x5() {
        return C5173er.m47136w(this.requestId_);
    }
}
