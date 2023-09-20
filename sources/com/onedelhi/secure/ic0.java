package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ic0 extends qe1<ic0, C5708b> implements jc0 {
    /* access modifiers changed from: private */
    public static final ic0 DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile cz2<ic0> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    /* renamed from: com.onedelhi.secure.ic0$a */
    public static /* synthetic */ class C5707a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30245a;

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
                f30245a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30245a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ic0.C5707a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ic0$b */
    public static final class C5708b extends qe1.C6546b<ic0, C5708b> implements jc0 {
        public C5708b() {
            super(ic0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5708b(C5707a aVar) {
            this();
        }

        /* renamed from: Be */
        public C5173er mo37932Be() {
            return ((ic0) this.f34068b).mo37932Be();
        }

        /* renamed from: Gj */
        public C5708b mo37942Gj() {
            mo43393xj();
            ((ic0) this.f34068b).mo37939mk();
            return this;
        }

        /* renamed from: Hj */
        public C5708b mo37943Hj() {
            mo43393xj();
            ((ic0) this.f34068b).mo37940nk();
            return this;
        }

        /* renamed from: Ij */
        public C5708b mo37944Ij(String str) {
            mo43393xj();
            ((ic0) this.f34068b).mo37933Ek(str);
            return this;
        }

        /* renamed from: Jj */
        public C5708b mo37945Jj(C5173er erVar) {
            mo43393xj();
            ((ic0) this.f34068b).mo37934Fk(erVar);
            return this;
        }

        /* renamed from: Kj */
        public C5708b mo37946Kj(String str) {
            mo43393xj();
            ((ic0) this.f34068b).mo37935Gk(str);
            return this;
        }

        /* renamed from: Lj */
        public C5708b mo37947Lj(C5173er erVar) {
            mo43393xj();
            ((ic0) this.f34068b).mo37936Hk(erVar);
            return this;
        }

        /* renamed from: W6 */
        public String mo37937W6() {
            return ((ic0) this.f34068b).mo37937W6();
        }

        /* renamed from: f0 */
        public String mo37938f0() {
            return ((ic0) this.f34068b).mo37938f0();
        }

        /* renamed from: y1 */
        public C5173er mo37941y1() {
            return ((ic0) this.f34068b).mo37941y1();
        }
    }

    static {
        ic0 ic0 = new ic0();
        DEFAULT_INSTANCE = ic0;
        qe1.m62492dk(ic0.class, ic0);
    }

    /* renamed from: Ak */
    public static ic0 m51979Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ic0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static ic0 m51980Bk(byte[] bArr) throws nt1 {
        return (ic0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static ic0 m51981Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (ic0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<ic0> m51982Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ok */
    public static ic0 m51990ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C5708b m51991pk() {
        return (C5708b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C5708b m51992qk(ic0 ic0) {
        return (C5708b) DEFAULT_INSTANCE.mo43358gj(ic0);
    }

    /* renamed from: rk */
    public static ic0 m51993rk(InputStream inputStream) throws IOException {
        return (ic0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static ic0 m51994sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ic0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static ic0 m51995tk(C5173er erVar) throws nt1 {
        return (ic0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static ic0 m51996uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ic0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static ic0 m51997vk(g00 g00) throws IOException {
        return (ic0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static ic0 m51998wk(g00 g00, zy0 zy0) throws IOException {
        return (ic0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static ic0 m51999xk(InputStream inputStream) throws IOException {
        return (ic0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static ic0 m52000yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ic0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static ic0 m52001zk(ByteBuffer byteBuffer) throws nt1 {
        return (ic0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Be */
    public C5173er mo37932Be() {
        return C5173er.m47136w(this.kind_);
    }

    /* renamed from: Ek */
    public final void mo37933Ek(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* renamed from: Fk */
    public final void mo37934Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.kind_ = erVar.mo35543k0();
    }

    /* renamed from: Gk */
    public final void mo37935Gk(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* renamed from: Hk */
    public final void mo37936Hk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.path_ = erVar.mo35543k0();
    }

    /* renamed from: W6 */
    public String mo37937W6() {
        return this.kind_;
    }

    /* renamed from: f0 */
    public String mo37938f0() {
        return this.path_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5707a.f30245a[iVar.ordinal()]) {
            case 1:
                return new ic0();
            case 2:
                return new C5708b((C5707a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ic0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ic0.class) {
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
    public final void mo37939mk() {
        this.kind_ = m51990ok().mo37937W6();
    }

    /* renamed from: nk */
    public final void mo37940nk() {
        this.path_ = m51990ok().mo37938f0();
    }

    /* renamed from: y1 */
    public C5173er mo37941y1() {
        return C5173er.m47136w(this.path_);
    }
}
