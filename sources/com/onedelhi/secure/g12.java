package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class g12 extends qe1<g12, C5353b> implements h12 {
    /* access modifiers changed from: private */
    public static final g12 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile cz2<g12> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: com.onedelhi.secure.g12$a */
    public static /* synthetic */ class C5352a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28857a;

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
                f28857a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28857a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g12.C5352a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.g12$b */
    public static final class C5353b extends qe1.C6546b<g12, C5353b> implements h12 {
        public C5353b() {
            super(g12.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5353b(C5352a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5353b mo36511Gj() {
            mo43393xj();
            ((g12) this.f34068b).mo36507kk();
            return this;
        }

        /* renamed from: Hj */
        public C5353b mo36512Hj() {
            mo43393xj();
            ((g12) this.f34068b).mo36508lk();
            return this;
        }

        /* renamed from: Ij */
        public C5353b mo36513Ij(double d) {
            mo43393xj();
            ((g12) this.f34068b).mo36505Ck(d);
            return this;
        }

        /* renamed from: Jj */
        public C5353b mo36514Jj(double d) {
            mo43393xj();
            ((g12) this.f34068b).mo36506Dk(d);
            return this;
        }

        /* renamed from: o0 */
        public double mo36509o0() {
            return ((g12) this.f34068b).mo36509o0();
        }

        /* renamed from: w1 */
        public double mo36510w1() {
            return ((g12) this.f34068b).mo36510w1();
        }
    }

    static {
        g12 g12 = new g12();
        DEFAULT_INSTANCE = g12;
        qe1.m62492dk(g12.class, g12);
    }

    /* renamed from: Ak */
    public static g12 m48964Ak(byte[] bArr, zy0 zy0) throws nt1 {
        return (g12) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public static cz2<g12> m48965Bk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: mk */
    public static g12 m48971mk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nk */
    public static C5353b m48972nk() {
        return (C5353b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ok */
    public static C5353b m48973ok(g12 g12) {
        return (C5353b) DEFAULT_INSTANCE.mo43358gj(g12);
    }

    /* renamed from: pk */
    public static g12 m48974pk(InputStream inputStream) throws IOException {
        return (g12) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static g12 m48975qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (g12) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static g12 m48976rk(C5173er erVar) throws nt1 {
        return (g12) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sk */
    public static g12 m48977sk(C5173er erVar, zy0 zy0) throws nt1 {
        return (g12) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tk */
    public static g12 m48978tk(g00 g00) throws IOException {
        return (g12) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: uk */
    public static g12 m48979uk(g00 g00, zy0 zy0) throws IOException {
        return (g12) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vk */
    public static g12 m48980vk(InputStream inputStream) throws IOException {
        return (g12) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static g12 m48981wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (g12) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static g12 m48982xk(ByteBuffer byteBuffer) throws nt1 {
        return (g12) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yk */
    public static g12 m48983yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (g12) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zk */
    public static g12 m48984zk(byte[] bArr) throws nt1 {
        return (g12) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public final void mo36505Ck(double d) {
        this.latitude_ = d;
    }

    /* renamed from: Dk */
    public final void mo36506Dk(double d) {
        this.longitude_ = d;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5352a.f28857a[iVar.ordinal()]) {
            case 1:
                return new g12();
            case 2:
                return new C5353b((C5352a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<g12> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (g12.class) {
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

    /* renamed from: kk */
    public final void mo36507kk() {
        this.latitude_ = 0.0d;
    }

    /* renamed from: lk */
    public final void mo36508lk() {
        this.longitude_ = 0.0d;
    }

    /* renamed from: o0 */
    public double mo36509o0() {
        return this.latitude_;
    }

    /* renamed from: w1 */
    public double mo36510w1() {
        return this.longitude_;
    }
}
