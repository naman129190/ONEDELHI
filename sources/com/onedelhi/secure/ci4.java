package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ci4 extends qe1<ci4, C4770b> implements di4 {
    /* access modifiers changed from: private */
    public static final ci4 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile cz2<ci4> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: com.onedelhi.secure.ci4$a */
    public static /* synthetic */ class C4769a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26765a;

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
                f26765a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26765a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ci4.C4769a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ci4$b */
    public static final class C4770b extends qe1.C6546b<ci4, C4770b> implements di4 {
        public C4770b() {
            super(ci4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4770b(C4769a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4770b mo32390Gj() {
            mo43393xj();
            ((ci4) this.f34068b).mo32386ik();
            return this;
        }

        /* renamed from: Hj */
        public C4770b mo32391Hj(C4771c cVar) {
            mo43393xj();
            ((ci4) this.f34068b).mo32389zk(cVar);
            return this;
        }

        /* renamed from: je */
        public boolean mo32387je() {
            return ((ci4) this.f34068b).mo32387je();
        }

        /* renamed from: q4 */
        public C4771c mo32388q4() {
            return ((ci4) this.f34068b).mo32388q4();
        }
    }

    /* renamed from: com.onedelhi.secure.ci4$c */
    public enum C4771c implements vs1.C7081c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C4771c> f26767a = null;

        /* renamed from: o */
        public static final int f26770o = 0;

        /* renamed from: p */
        public static final int f26771p = 1;

        /* renamed from: n */
        public final int f26772n;

        /* renamed from: com.onedelhi.secure.ci4$c$a */
        public class C4772a implements vs1.C7082d<C4771c> {
            /* renamed from: b */
            public C4771c mo32393a(int i) {
                return C4771c.m41026a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.ci4$c$b */
        public static final class C4773b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f26773a = null;

            static {
                f26773a = new C4773b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C4771c.m41026a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f26767a = new C4772a();
        }

        /* access modifiers changed from: public */
        C4771c(int i) {
            this.f26772n = i;
        }

        /* renamed from: a */
        public static C4771c m41026a(int i) {
            if (i == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        /* renamed from: b */
        public static vs1.C7082d<C4771c> m41027b() {
            return f26767a;
        }

        /* renamed from: e */
        public static vs1.C7083e m41028e() {
            return C4773b.f26773a;
        }

        @Deprecated
        /* renamed from: g */
        public static C4771c m41029g(int i) {
            return m41026a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            return this.f26772n;
        }
    }

    static {
        ci4 ci4 = new ci4();
        DEFAULT_INSTANCE = ci4;
        qe1.m62492dk(ci4.class, ci4);
    }

    /* renamed from: jk */
    public static ci4 m41001jk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: kk */
    public static C4770b m41002kk() {
        return (C4770b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: lk */
    public static C4770b m41003lk(ci4 ci4) {
        return (C4770b) DEFAULT_INSTANCE.mo43358gj(ci4);
    }

    /* renamed from: mk */
    public static ci4 m41004mk(InputStream inputStream) throws IOException {
        return (ci4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: nk */
    public static ci4 m41005nk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ci4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ok */
    public static ci4 m41006ok(C5173er erVar) throws nt1 {
        return (ci4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: pk */
    public static ci4 m41007pk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ci4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: qk */
    public static ci4 m41008qk(g00 g00) throws IOException {
        return (ci4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: rk */
    public static ci4 m41009rk(g00 g00, zy0 zy0) throws IOException {
        return (ci4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: sk */
    public static ci4 m41010sk(InputStream inputStream) throws IOException {
        return (ci4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: tk */
    public static ci4 m41011tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ci4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: uk */
    public static ci4 m41012uk(ByteBuffer byteBuffer) throws nt1 {
        return (ci4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: vk */
    public static ci4 m41013vk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ci4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: wk */
    public static ci4 m41014wk(byte[] bArr) throws nt1 {
        return (ci4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: xk */
    public static ci4 m41015xk(byte[] bArr, zy0 zy0) throws nt1 {
        return (ci4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: yk */
    public static cz2<ci4> m41016yk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: ik */
    public final void mo32386ik() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    /* renamed from: je */
    public boolean mo32387je() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4769a.f26765a[iVar.ordinal()]) {
            case 1:
                return new ci4();
            case 2:
                return new C4770b((C4769a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", C4771c.m41028e()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ci4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ci4.class) {
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

    /* renamed from: q4 */
    public C4771c mo32388q4() {
        C4771c a = C4771c.m41026a(this.dispatchDestination_);
        return a == null ? C4771c.SOURCE_UNKNOWN : a;
    }

    /* renamed from: zk */
    public final void mo32389zk(C4771c cVar) {
        this.dispatchDestination_ = cVar.mo32392j();
        this.bitField0_ |= 1;
    }
}
