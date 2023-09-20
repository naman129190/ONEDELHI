package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class se4 extends qe1<se4, C6760b> implements te4 {
    /* access modifiers changed from: private */
    public static final se4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile cz2<se4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.onedelhi.secure.se4$a */
    public static /* synthetic */ class C6759a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35011a;

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
                f35011a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35011a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.se4.C6759a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.se4$b */
    public static final class C6760b extends qe1.C6546b<se4, C6760b> implements te4 {
        public C6760b() {
            super(se4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6760b(C6759a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6760b mo44313Gj() {
            mo43393xj();
            ((se4) this.f34068b).mo44310kk();
            return this;
        }

        /* renamed from: Hj */
        public C6760b mo44314Hj() {
            mo43393xj();
            ((se4) this.f34068b).mo44311lk();
            return this;
        }

        /* renamed from: Ij */
        public C6760b mo44315Ij(int i) {
            mo43393xj();
            ((se4) this.f34068b).mo44307Ck(i);
            return this;
        }

        /* renamed from: Jj */
        public C6760b mo44316Jj(long j) {
            mo43393xj();
            ((se4) this.f34068b).mo44308Dk(j);
            return this;
        }

        /* renamed from: M1 */
        public long mo44309M1() {
            return ((se4) this.f34068b).mo44309M1();
        }

        /* renamed from: v */
        public int mo44312v() {
            return ((se4) this.f34068b).mo44312v();
        }
    }

    static {
        se4 se4 = new se4();
        DEFAULT_INSTANCE = se4;
        qe1.m62492dk(se4.class, se4);
    }

    /* renamed from: Ak */
    public static se4 m64486Ak(byte[] bArr, zy0 zy0) throws nt1 {
        return (se4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public static cz2<se4> m64487Bk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: mk */
    public static se4 m64493mk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nk */
    public static C6760b m64494nk() {
        return (C6760b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ok */
    public static C6760b m64495ok(se4 se4) {
        return (C6760b) DEFAULT_INSTANCE.mo43358gj(se4);
    }

    /* renamed from: pk */
    public static se4 m64496pk(InputStream inputStream) throws IOException {
        return (se4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: qk */
    public static se4 m64497qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (se4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rk */
    public static se4 m64498rk(C5173er erVar) throws nt1 {
        return (se4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sk */
    public static se4 m64499sk(C5173er erVar, zy0 zy0) throws nt1 {
        return (se4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tk */
    public static se4 m64500tk(g00 g00) throws IOException {
        return (se4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: uk */
    public static se4 m64501uk(g00 g00, zy0 zy0) throws IOException {
        return (se4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vk */
    public static se4 m64502vk(InputStream inputStream) throws IOException {
        return (se4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static se4 m64503wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (se4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static se4 m64504xk(ByteBuffer byteBuffer) throws nt1 {
        return (se4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yk */
    public static se4 m64505yk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (se4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zk */
    public static se4 m64506zk(byte[] bArr) throws nt1 {
        return (se4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public final void mo44307Ck(int i) {
        this.nanos_ = i;
    }

    /* renamed from: Dk */
    public final void mo44308Dk(long j) {
        this.seconds_ = j;
    }

    /* renamed from: M1 */
    public long mo44309M1() {
        return this.seconds_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6759a.f35011a[iVar.ordinal()]) {
            case 1:
                return new se4();
            case 2:
                return new C6760b((C6759a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<se4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (se4.class) {
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
    public final void mo44310kk() {
        this.nanos_ = 0;
    }

    /* renamed from: lk */
    public final void mo44311lk() {
        this.seconds_ = 0;
    }

    /* renamed from: v */
    public int mo44312v() {
        return this.nanos_;
    }
}
