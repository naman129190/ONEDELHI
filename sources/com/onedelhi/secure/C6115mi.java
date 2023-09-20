package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.mi */
public final class C6115mi extends qe1<C6115mi, C6118c> implements C6189ni {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C6115mi DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile cz2<C6115mi> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_ = "";
    private int authenticationCase_ = 0;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_ = "";
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.mi$a */
    public static /* synthetic */ class C6116a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32145a;

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
                f32145a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32145a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6115mi.C6116a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.mi$b */
    public enum C6117b {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);
        

        /* renamed from: n */
        public final int f32150n;

        /* access modifiers changed from: public */
        C6117b(int i) {
            this.f32150n = i;
        }

        /* renamed from: a */
        public static C6117b m57299a(int i) {
            if (i == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i == 7) {
                return JWT_AUDIENCE;
            }
            if (i != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }

        @Deprecated
        /* renamed from: b */
        public static C6117b m57300b(int i) {
            return m57299a(i);
        }

        /* renamed from: j */
        public int mo40636j() {
            return this.f32150n;
        }
    }

    /* renamed from: com.onedelhi.secure.mi$c */
    public static final class C6118c extends qe1.C6546b<C6115mi, C6118c> implements C6189ni {
        public C6118c() {
            super(C6115mi.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6118c(C6116a aVar) {
            this();
        }

        /* renamed from: C9 */
        public String mo40597C9() {
            return ((C6115mi) this.f34068b).mo40597C9();
        }

        /* renamed from: De */
        public C5173er mo40598De() {
            return ((C6115mi) this.f34068b).mo40598De();
        }

        /* renamed from: F */
        public String mo40600F() {
            return ((C6115mi) this.f34068b).mo40600F();
        }

        /* renamed from: Gj */
        public C6118c mo40637Gj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40599Ek();
            return this;
        }

        /* renamed from: Hj */
        public C6118c mo40638Hj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40601Fk();
            return this;
        }

        /* renamed from: Ij */
        public C6118c mo40639Ij() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40602Gk();
            return this;
        }

        /* renamed from: Jj */
        public C6118c mo40640Jj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40603Hk();
            return this;
        }

        /* renamed from: Kj */
        public C6118c mo40641Kj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40604Ik();
            return this;
        }

        /* renamed from: Lj */
        public C6118c mo40642Lj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40605Jk();
            return this;
        }

        /* renamed from: Mj */
        public C6118c mo40643Mj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40606Kk();
            return this;
        }

        /* renamed from: Nj */
        public C6118c mo40644Nj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40607Lk();
            return this;
        }

        /* renamed from: Oj */
        public C6118c mo40645Oj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40608Mk();
            return this;
        }

        /* renamed from: Ph */
        public boolean mo40610Ph() {
            return ((C6115mi) this.f34068b).mo40610Ph();
        }

        /* renamed from: Pj */
        public C6118c mo40646Pj() {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40609Nk();
            return this;
        }

        /* renamed from: Qj */
        public C6118c mo40647Qj(String str) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40615el(str);
            return this;
        }

        /* renamed from: Rj */
        public C6118c mo40648Rj(C5173er erVar) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40617fl(erVar);
            return this;
        }

        /* renamed from: Sj */
        public C6118c mo40649Sj(double d) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40618gl(d);
            return this;
        }

        /* renamed from: Tj */
        public C6118c mo40650Tj(boolean z) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40619hl(z);
            return this;
        }

        /* renamed from: Uj */
        public C6118c mo40651Uj(String str) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40620il(str);
            return this;
        }

        /* renamed from: Vj */
        public C6118c mo40652Vj(C5173er erVar) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40621jl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C6118c mo40653Wj(double d) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40623kl(d);
            return this;
        }

        /* renamed from: Xj */
        public C6118c mo40654Xj(double d) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40626ll(d);
            return this;
        }

        /* renamed from: Y4 */
        public String mo40611Y4() {
            return ((C6115mi) this.f34068b).mo40611Y4();
        }

        /* renamed from: Yj */
        public C6118c mo40655Yj(C6119d dVar) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40627ml(dVar);
            return this;
        }

        /* renamed from: Zj */
        public C6118c mo40656Zj(int i) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40629nl(i);
            return this;
        }

        /* renamed from: aj */
        public double mo40612aj() {
            return ((C6115mi) this.f34068b).mo40612aj();
        }

        /* renamed from: ak */
        public C6118c mo40657ak(String str) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40631ol(str);
            return this;
        }

        /* renamed from: bk */
        public C6118c mo40658bk(C5173er erVar) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40632pl(erVar);
            return this;
        }

        /* renamed from: ch */
        public double mo40613ch() {
            return ((C6115mi) this.f34068b).mo40613ch();
        }

        /* renamed from: ck */
        public C6118c mo40659ck(String str) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40633ql(str);
            return this;
        }

        /* renamed from: d7 */
        public C6119d mo40614d7() {
            return ((C6115mi) this.f34068b).mo40614d7();
        }

        /* renamed from: dk */
        public C6118c mo40660dk(C5173er erVar) {
            mo43393xj();
            ((C6115mi) this.f34068b).mo40634rl(erVar);
            return this;
        }

        /* renamed from: fg */
        public double mo40616fg() {
            return ((C6115mi) this.f34068b).mo40616fg();
        }

        /* renamed from: k */
        public String mo40622k() {
            return ((C6115mi) this.f34068b).mo40622k();
        }

        /* renamed from: l */
        public C5173er mo40624l() {
            return ((C6115mi) this.f34068b).mo40624l();
        }

        /* renamed from: le */
        public int mo40625le() {
            return ((C6115mi) this.f34068b).mo40625le();
        }

        /* renamed from: na */
        public C5173er mo40628na() {
            return ((C6115mi) this.f34068b).mo40628na();
        }

        /* renamed from: o8 */
        public C6117b mo40630o8() {
            return ((C6115mi) this.f34068b).mo40630o8();
        }

        /* renamed from: x */
        public C5173er mo40635x() {
            return ((C6115mi) this.f34068b).mo40635x();
        }
    }

    /* renamed from: com.onedelhi.secure.mi$d */
    public enum C6119d implements vs1.C7081c {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6119d> f32152a = null;

        /* renamed from: o */
        public static final int f32157o = 0;

        /* renamed from: p */
        public static final int f32158p = 1;

        /* renamed from: q */
        public static final int f32159q = 2;

        /* renamed from: n */
        public final int f32160n;

        /* renamed from: com.onedelhi.secure.mi$d$a */
        public class C6120a implements vs1.C7082d<C6119d> {
            /* renamed from: b */
            public C6119d mo32393a(int i) {
                return C6119d.m57341a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.mi$d$b */
        public static final class C6121b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f32161a = null;

            static {
                f32161a = new C6121b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6119d.m57341a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f32152a = new C6120a();
        }

        /* access modifiers changed from: public */
        C6119d(int i) {
            this.f32160n = i;
        }

        /* renamed from: a */
        public static C6119d m57341a(int i) {
            if (i == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        /* renamed from: b */
        public static vs1.C7082d<C6119d> m57342b() {
            return f32152a;
        }

        /* renamed from: e */
        public static vs1.C7083e m57343e() {
            return C6121b.f32161a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6119d m57344g(int i) {
            return m57341a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f32160n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C6115mi miVar = new C6115mi();
        DEFAULT_INSTANCE = miVar;
        qe1.m62492dk(C6115mi.class, miVar);
    }

    /* renamed from: Ok */
    public static C6115mi m57222Ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Pk */
    public static C6118c m57223Pk() {
        return (C6118c) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Qk */
    public static C6118c m57224Qk(C6115mi miVar) {
        return (C6118c) DEFAULT_INSTANCE.mo43358gj(miVar);
    }

    /* renamed from: Rk */
    public static C6115mi m57225Rk(InputStream inputStream) throws IOException {
        return (C6115mi) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Sk */
    public static C6115mi m57226Sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6115mi) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Tk */
    public static C6115mi m57227Tk(C5173er erVar) throws nt1 {
        return (C6115mi) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Uk */
    public static C6115mi m57228Uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6115mi) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Vk */
    public static C6115mi m57229Vk(g00 g00) throws IOException {
        return (C6115mi) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Wk */
    public static C6115mi m57230Wk(g00 g00, zy0 zy0) throws IOException {
        return (C6115mi) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Xk */
    public static C6115mi m57231Xk(InputStream inputStream) throws IOException {
        return (C6115mi) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Yk */
    public static C6115mi m57232Yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6115mi) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Zk */
    public static C6115mi m57233Zk(ByteBuffer byteBuffer) throws nt1 {
        return (C6115mi) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: al */
    public static C6115mi m57234al(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6115mi) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: bl */
    public static C6115mi m57235bl(byte[] bArr) throws nt1 {
        return (C6115mi) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: cl */
    public static C6115mi m57236cl(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6115mi) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: dl */
    public static cz2<C6115mi> m57237dl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: C9 */
    public String mo40597C9() {
        return this.address_;
    }

    /* renamed from: De */
    public C5173er mo40598De() {
        return C5173er.m47136w(this.address_);
    }

    /* renamed from: Ek */
    public final void mo40599Ek() {
        this.address_ = m57222Ok().mo40597C9();
    }

    /* renamed from: F */
    public String mo40600F() {
        return this.protocol_;
    }

    /* renamed from: Fk */
    public final void mo40601Fk() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    /* renamed from: Gk */
    public final void mo40602Gk() {
        this.deadline_ = 0.0d;
    }

    /* renamed from: Hk */
    public final void mo40603Hk() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* renamed from: Ik */
    public final void mo40604Ik() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* renamed from: Jk */
    public final void mo40605Jk() {
        this.minDeadline_ = 0.0d;
    }

    /* renamed from: Kk */
    public final void mo40606Kk() {
        this.operationDeadline_ = 0.0d;
    }

    /* renamed from: Lk */
    public final void mo40607Lk() {
        this.pathTranslation_ = 0;
    }

    /* renamed from: Mk */
    public final void mo40608Mk() {
        this.protocol_ = m57222Ok().mo40600F();
    }

    /* renamed from: Nk */
    public final void mo40609Nk() {
        this.selector_ = m57222Ok().mo40622k();
    }

    /* renamed from: Ph */
    public boolean mo40610Ph() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    /* renamed from: Y4 */
    public String mo40611Y4() {
        return this.authenticationCase_ == 7 ? (String) this.authentication_ : "";
    }

    /* renamed from: aj */
    public double mo40612aj() {
        return this.deadline_;
    }

    /* renamed from: ch */
    public double mo40613ch() {
        return this.operationDeadline_;
    }

    /* renamed from: d7 */
    public C6119d mo40614d7() {
        C6119d a = C6119d.m57341a(this.pathTranslation_);
        return a == null ? C6119d.UNRECOGNIZED : a;
    }

    /* renamed from: el */
    public final void mo40615el(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* renamed from: fg */
    public double mo40616fg() {
        return this.minDeadline_;
    }

    /* renamed from: fl */
    public final void mo40617fl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.address_ = erVar.mo35543k0();
    }

    /* renamed from: gl */
    public final void mo40618gl(double d) {
        this.deadline_ = d;
    }

    /* renamed from: hl */
    public final void mo40619hl(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    /* renamed from: il */
    public final void mo40620il(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6116a.f32145a[iVar.ordinal()]) {
            case 1:
                return new C6115mi();
            case 2:
                return new C6118c((C6116a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6115mi> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6115mi.class) {
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

    /* renamed from: jl */
    public final void mo40621jl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.authentication_ = erVar.mo35543k0();
        this.authenticationCase_ = 7;
    }

    /* renamed from: k */
    public String mo40622k() {
        return this.selector_;
    }

    /* renamed from: kl */
    public final void mo40623kl(double d) {
        this.minDeadline_ = d;
    }

    /* renamed from: l */
    public C5173er mo40624l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: le */
    public int mo40625le() {
        return this.pathTranslation_;
    }

    /* renamed from: ll */
    public final void mo40626ll(double d) {
        this.operationDeadline_ = d;
    }

    /* renamed from: ml */
    public final void mo40627ml(C6119d dVar) {
        this.pathTranslation_ = dVar.mo32392j();
    }

    /* renamed from: na */
    public C5173er mo40628na() {
        return C5173er.m47136w(this.authenticationCase_ == 7 ? (String) this.authentication_ : "");
    }

    /* renamed from: nl */
    public final void mo40629nl(int i) {
        this.pathTranslation_ = i;
    }

    /* renamed from: o8 */
    public C6117b mo40630o8() {
        return C6117b.m57299a(this.authenticationCase_);
    }

    /* renamed from: ol */
    public final void mo40631ol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* renamed from: pl */
    public final void mo40632pl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.protocol_ = erVar.mo35543k0();
    }

    /* renamed from: ql */
    public final void mo40633ql(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: rl */
    public final void mo40634rl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: x */
    public C5173er mo40635x() {
        return C5173er.m47136w(this.protocol_);
    }
}
