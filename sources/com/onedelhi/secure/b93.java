package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class b93 extends qe1<b93, C4656b> implements c93 {
    /* access modifiers changed from: private */
    public static final b93 DEFAULT_INSTANCE;
    private static volatile cz2<b93> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;

    /* renamed from: w_ */
    private double f26238w_;

    /* renamed from: x_ */
    private double f26239x_;

    /* renamed from: y_ */
    private double f26240y_;

    /* renamed from: z_ */
    private double f26241z_;

    /* renamed from: com.onedelhi.secure.b93$a */
    public static /* synthetic */ class C4655a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26242a;

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
                f26242a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26242a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b93.C4655a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.b93$b */
    public static final class C4656b extends qe1.C6546b<b93, C4656b> implements c93 {
        public C4656b() {
            super(b93.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4656b(C4655a aVar) {
            this();
        }

        /* renamed from: D6 */
        public double mo31470D6() {
            return ((b93) this.f34068b).mo31470D6();
        }

        /* renamed from: Gj */
        public C4656b mo31482Gj() {
            mo43393xj();
            ((b93) this.f34068b).mo31477ok();
            return this;
        }

        /* renamed from: Hj */
        public C4656b mo31483Hj() {
            mo43393xj();
            ((b93) this.f34068b).mo31478pk();
            return this;
        }

        /* renamed from: Ij */
        public C4656b mo31484Ij() {
            mo43393xj();
            ((b93) this.f34068b).mo31479qk();
            return this;
        }

        /* renamed from: Jj */
        public C4656b mo31485Jj() {
            mo43393xj();
            ((b93) this.f34068b).mo31480rk();
            return this;
        }

        /* renamed from: Kj */
        public C4656b mo31486Kj(double d) {
            mo43393xj();
            ((b93) this.f34068b).mo31471Ik(d);
            return this;
        }

        /* renamed from: Lj */
        public C4656b mo31487Lj(double d) {
            mo43393xj();
            ((b93) this.f34068b).mo31472Jk(d);
            return this;
        }

        /* renamed from: Mj */
        public C4656b mo31488Mj(double d) {
            mo43393xj();
            ((b93) this.f34068b).mo31473Kk(d);
            return this;
        }

        /* renamed from: Nj */
        public C4656b mo31489Nj(double d) {
            mo43393xj();
            ((b93) this.f34068b).mo31474Lk(d);
            return this;
        }

        /* renamed from: O8 */
        public double mo31475O8() {
            return ((b93) this.f34068b).mo31475O8();
        }

        /* renamed from: V3 */
        public double mo31476V3() {
            return ((b93) this.f34068b).mo31476V3();
        }

        /* renamed from: sd */
        public double mo31481sd() {
            return ((b93) this.f34068b).mo31481sd();
        }
    }

    static {
        b93 b93 = new b93();
        DEFAULT_INSTANCE = b93;
        qe1.m62492dk(b93.class, b93);
    }

    /* renamed from: Ak */
    public static b93 m39549Ak(g00 g00, zy0 zy0) throws IOException {
        return (b93) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static b93 m39550Bk(InputStream inputStream) throws IOException {
        return (b93) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static b93 m39551Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (b93) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static b93 m39552Dk(ByteBuffer byteBuffer) throws nt1 {
        return (b93) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static b93 m39553Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (b93) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static b93 m39554Fk(byte[] bArr) throws nt1 {
        return (b93) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static b93 m39555Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (b93) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<b93> m39556Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: sk */
    public static b93 m39566sk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C4656b m39567tk() {
        return (C4656b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C4656b m39568uk(b93 b93) {
        return (C4656b) DEFAULT_INSTANCE.mo43358gj(b93);
    }

    /* renamed from: vk */
    public static b93 m39569vk(InputStream inputStream) throws IOException {
        return (b93) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static b93 m39570wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b93) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static b93 m39571xk(C5173er erVar) throws nt1 {
        return (b93) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static b93 m39572yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (b93) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static b93 m39573zk(g00 g00) throws IOException {
        return (b93) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: D6 */
    public double mo31470D6() {
        return this.f26239x_;
    }

    /* renamed from: Ik */
    public final void mo31471Ik(double d) {
        this.f26238w_ = d;
    }

    /* renamed from: Jk */
    public final void mo31472Jk(double d) {
        this.f26239x_ = d;
    }

    /* renamed from: Kk */
    public final void mo31473Kk(double d) {
        this.f26240y_ = d;
    }

    /* renamed from: Lk */
    public final void mo31474Lk(double d) {
        this.f26241z_ = d;
    }

    /* renamed from: O8 */
    public double mo31475O8() {
        return this.f26240y_;
    }

    /* renamed from: V3 */
    public double mo31476V3() {
        return this.f26241z_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4655a.f26242a[iVar.ordinal()]) {
            case 1:
                return new b93();
            case 2:
                return new C4656b((C4655a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<b93> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (b93.class) {
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

    /* renamed from: ok */
    public final void mo31477ok() {
        this.f26238w_ = 0.0d;
    }

    /* renamed from: pk */
    public final void mo31478pk() {
        this.f26239x_ = 0.0d;
    }

    /* renamed from: qk */
    public final void mo31479qk() {
        this.f26240y_ = 0.0d;
    }

    /* renamed from: rk */
    public final void mo31480rk() {
        this.f26241z_ = 0.0d;
    }

    /* renamed from: sd */
    public double mo31481sd() {
        return this.f26238w_;
    }
}
