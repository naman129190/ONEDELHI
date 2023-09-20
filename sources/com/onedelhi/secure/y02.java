package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class y02 extends qe1<y02, C7291b> implements z02 {
    /* access modifiers changed from: private */
    public static final y02 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile cz2<y02> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String key_ = "";
    private int valueType_;

    /* renamed from: com.onedelhi.secure.y02$a */
    public static /* synthetic */ class C7290a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37740a;

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
                f37740a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37740a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.y02.C7290a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.y02$b */
    public static final class C7291b extends qe1.C6546b<y02, C7291b> implements z02 {
        public C7291b() {
            super(y02.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7291b(C7290a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7291b mo47520Gj() {
            mo43393xj();
            ((y02) this.f34068b).mo47516pk();
            return this;
        }

        /* renamed from: Hj */
        public C7291b mo47521Hj() {
            mo43393xj();
            ((y02) this.f34068b).mo47517qk();
            return this;
        }

        /* renamed from: I5 */
        public C7292c mo47505I5() {
            return ((y02) this.f34068b).mo47505I5();
        }

        /* renamed from: Ij */
        public C7291b mo47522Ij() {
            mo43393xj();
            ((y02) this.f34068b).mo47518rk();
            return this;
        }

        /* renamed from: Jj */
        public C7291b mo47523Jj(String str) {
            mo43393xj();
            ((y02) this.f34068b).mo47506Ik(str);
            return this;
        }

        /* renamed from: Kj */
        public C7291b mo47524Kj(C5173er erVar) {
            mo43393xj();
            ((y02) this.f34068b).mo47507Jk(erVar);
            return this;
        }

        /* renamed from: Lj */
        public C7291b mo47525Lj(String str) {
            mo43393xj();
            ((y02) this.f34068b).mo47508Kk(str);
            return this;
        }

        /* renamed from: Mj */
        public C7291b mo47526Mj(C5173er erVar) {
            mo43393xj();
            ((y02) this.f34068b).mo47509Lk(erVar);
            return this;
        }

        /* renamed from: Nj */
        public C7291b mo47527Nj(C7292c cVar) {
            mo43393xj();
            ((y02) this.f34068b).mo47510Mk(cVar);
            return this;
        }

        /* renamed from: Oj */
        public C7291b mo47528Oj(int i) {
            mo43393xj();
            ((y02) this.f34068b).mo47511Nk(i);
            return this;
        }

        /* renamed from: U2 */
        public String mo47512U2() {
            return ((y02) this.f34068b).mo47512U2();
        }

        /* renamed from: b */
        public C5173er mo47513b() {
            return ((y02) this.f34068b).mo47513b();
        }

        /* renamed from: c */
        public String mo47514c() {
            return ((y02) this.f34068b).mo47514c();
        }

        /* renamed from: j1 */
        public int mo47515j1() {
            return ((y02) this.f34068b).mo47515j1();
        }

        /* renamed from: th */
        public C5173er mo47519th() {
            return ((y02) this.f34068b).mo47519th();
        }
    }

    /* renamed from: com.onedelhi.secure.y02$c */
    public enum C7292c implements vs1.C7081c {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C7292c> f37741a = null;

        /* renamed from: o */
        public static final int f37747o = 0;

        /* renamed from: p */
        public static final int f37748p = 1;

        /* renamed from: q */
        public static final int f37749q = 2;

        /* renamed from: n */
        public final int f37750n;

        /* renamed from: com.onedelhi.secure.y02$c$a */
        public class C7293a implements vs1.C7082d<C7292c> {
            /* renamed from: b */
            public C7292c mo32393a(int i) {
                return C7292c.m71068a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.y02$c$b */
        public static final class C7294b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f37751a = null;

            static {
                f37751a = new C7294b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C7292c.m71068a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f37741a = new C7293a();
        }

        /* access modifiers changed from: public */
        C7292c(int i) {
            this.f37750n = i;
        }

        /* renamed from: a */
        public static C7292c m71068a(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return BOOL;
            }
            if (i != 2) {
                return null;
            }
            return INT64;
        }

        /* renamed from: b */
        public static vs1.C7082d<C7292c> m71069b() {
            return f37741a;
        }

        /* renamed from: e */
        public static vs1.C7083e m71070e() {
            return C7294b.f37751a;
        }

        @Deprecated
        /* renamed from: g */
        public static C7292c m71071g(int i) {
            return m71068a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f37750n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        y02 y02 = new y02();
        DEFAULT_INSTANCE = y02;
        qe1.m62492dk(y02.class, y02);
    }

    /* renamed from: Ak */
    public static y02 m71011Ak(g00 g00, zy0 zy0) throws IOException {
        return (y02) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static y02 m71012Bk(InputStream inputStream) throws IOException {
        return (y02) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static y02 m71013Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (y02) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static y02 m71014Dk(ByteBuffer byteBuffer) throws nt1 {
        return (y02) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static y02 m71015Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (y02) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static y02 m71016Fk(byte[] bArr) throws nt1 {
        return (y02) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static y02 m71017Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (y02) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<y02> m71018Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: sk */
    public static y02 m71029sk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C7291b m71030tk() {
        return (C7291b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C7291b m71031uk(y02 y02) {
        return (C7291b) DEFAULT_INSTANCE.mo43358gj(y02);
    }

    /* renamed from: vk */
    public static y02 m71032vk(InputStream inputStream) throws IOException {
        return (y02) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static y02 m71033wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (y02) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static y02 m71034xk(C5173er erVar) throws nt1 {
        return (y02) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static y02 m71035yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (y02) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static y02 m71036zk(g00 g00) throws IOException {
        return (y02) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: I5 */
    public C7292c mo47505I5() {
        C7292c a = C7292c.m71068a(this.valueType_);
        return a == null ? C7292c.UNRECOGNIZED : a;
    }

    /* renamed from: Ik */
    public final void mo47506Ik(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: Jk */
    public final void mo47507Jk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: Kk */
    public final void mo47508Kk(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* renamed from: Lk */
    public final void mo47509Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.key_ = erVar.mo35543k0();
    }

    /* renamed from: Mk */
    public final void mo47510Mk(C7292c cVar) {
        this.valueType_ = cVar.mo32392j();
    }

    /* renamed from: Nk */
    public final void mo47511Nk(int i) {
        this.valueType_ = i;
    }

    /* renamed from: U2 */
    public String mo47512U2() {
        return this.key_;
    }

    /* renamed from: b */
    public C5173er mo47513b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo47514c() {
        return this.description_;
    }

    /* renamed from: j1 */
    public int mo47515j1() {
        return this.valueType_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7290a.f37740a[iVar.ordinal()]) {
            case 1:
                return new y02();
            case 2:
                return new C7291b((C7290a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<y02> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (y02.class) {
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

    /* renamed from: pk */
    public final void mo47516pk() {
        this.description_ = m71029sk().mo47514c();
    }

    /* renamed from: qk */
    public final void mo47517qk() {
        this.key_ = m71029sk().mo47512U2();
    }

    /* renamed from: rk */
    public final void mo47518rk() {
        this.valueType_ = 0;
    }

    /* renamed from: th */
    public C5173er mo47519th() {
        return C5173er.m47136w(this.key_);
    }
}
