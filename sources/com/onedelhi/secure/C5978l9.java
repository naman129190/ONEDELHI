package com.onedelhi.secure;

import com.onedelhi.secure.C6244o5;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.onedelhi.secure.l9 */
public final class C5978l9 extends qe1<C5978l9, C5980b> implements C6098m9 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C5978l9 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile cz2<C5978l9> PARSER;
    private C6244o5 androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private rc2<String, String> customAttributes_ = rc2.m63481i();
    private String googleAppId_ = "";

    /* renamed from: com.onedelhi.secure.l9$a */
    public static /* synthetic */ class C5979a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31601a;

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
                f31601a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31601a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5978l9.C5979a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.l9$b */
    public static final class C5980b extends qe1.C6546b<C5978l9, C5980b> implements C6098m9 {
        public C5980b() {
            super(C5978l9.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5980b(C5979a aVar) {
            this();
        }

        /* renamed from: Ai */
        public boolean mo39716Ai() {
            return ((C5978l9) this.f34068b).mo39716Ai();
        }

        /* renamed from: Eg */
        public boolean mo39718Eg() {
            return ((C5978l9) this.f34068b).mo39718Eg();
        }

        /* renamed from: Gj */
        public C5980b mo39746Gj() {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39737sk();
            return this;
        }

        /* renamed from: Hj */
        public C5980b mo39747Hj() {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39738tk();
            return this;
        }

        /* renamed from: Ij */
        public C5980b mo39748Ij() {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39739uk();
            return this;
        }

        /* renamed from: Jj */
        public C5980b mo39749Jj() {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39742xk().clear();
            return this;
        }

        /* renamed from: Kj */
        public C5980b mo39750Kj() {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39740vk();
            return this;
        }

        /* renamed from: L5 */
        public boolean mo39719L5() {
            return ((C5978l9) this.f34068b).mo39719L5();
        }

        /* renamed from: Lj */
        public C5980b mo39751Lj(C6244o5 o5Var) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39717Ak(o5Var);
            return this;
        }

        /* renamed from: Mj */
        public C5980b mo39752Mj(Map<String, String> map) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39742xk().putAll(map);
            return this;
        }

        /* renamed from: N */
        public boolean mo39720N(String str) {
            str.getClass();
            return ((C5978l9) this.f34068b).mo39725S().containsKey(str);
        }

        /* renamed from: Nj */
        public C5980b mo39753Nj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((C5978l9) this.f34068b).mo39742xk().put(str, str2);
            return this;
        }

        /* renamed from: Ob */
        public C6244o5 mo39721Ob() {
            return ((C5978l9) this.f34068b).mo39721Ob();
        }

        /* renamed from: Oj */
        public C5980b mo39754Oj(String str) {
            str.getClass();
            mo43393xj();
            ((C5978l9) this.f34068b).mo39742xk().remove(str);
            return this;
        }

        /* renamed from: Pa */
        public C5173er mo39722Pa() {
            return ((C5978l9) this.f34068b).mo39722Pa();
        }

        /* renamed from: Pj */
        public C5980b mo39755Pj(C6244o5.C6246b bVar) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39723Qk((C6244o5) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Qj */
        public C5980b mo39756Qj(C6244o5 o5Var) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39723Qk(o5Var);
            return this;
        }

        /* renamed from: Rj */
        public C5980b mo39757Rj(String str) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39724Rk(str);
            return this;
        }

        /* renamed from: S */
        public Map<String, String> mo39725S() {
            return Collections.unmodifiableMap(((C5978l9) this.f34068b).mo39725S());
        }

        /* renamed from: Sj */
        public C5980b mo39758Sj(C5173er erVar) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39726Sk(erVar);
            return this;
        }

        /* renamed from: Tj */
        public C5980b mo39759Tj(C6256o9 o9Var) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39727Tk(o9Var);
            return this;
        }

        /* renamed from: Uj */
        public C5980b mo39760Uj(String str) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39728Uk(str);
            return this;
        }

        /* renamed from: Vj */
        public C5980b mo39761Vj(C5173er erVar) {
            mo43393xj();
            ((C5978l9) this.f34068b).mo39729Vk(erVar);
            return this;
        }

        @Deprecated
        /* renamed from: X */
        public Map<String, String> mo39730X() {
            return mo39725S();
        }

        /* renamed from: a0 */
        public String mo39731a0(String str, String str2) {
            str.getClass();
            Map<String, String> S = ((C5978l9) this.f34068b).mo39725S();
            return S.containsKey(str) ? S.get(str) : str2;
        }

        /* renamed from: h0 */
        public int mo39732h0() {
            return ((C5978l9) this.f34068b).mo39725S().size();
        }

        /* renamed from: ja */
        public String mo39733ja() {
            return ((C5978l9) this.f34068b).mo39733ja();
        }

        /* renamed from: l0 */
        public String mo39734l0(String str) {
            str.getClass();
            Map<String, String> S = ((C5978l9) this.f34068b).mo39725S();
            if (S.containsKey(str)) {
                return S.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: q9 */
        public String mo39735q9() {
            return ((C5978l9) this.f34068b).mo39735q9();
        }

        /* renamed from: qb */
        public C5173er mo39736qb() {
            return ((C5978l9) this.f34068b).mo39736qb();
        }

        /* renamed from: x9 */
        public boolean mo39741x9() {
            return ((C5978l9) this.f34068b).mo39741x9();
        }

        /* renamed from: y3 */
        public C6256o9 mo39743y3() {
            return ((C5978l9) this.f34068b).mo39743y3();
        }
    }

    /* renamed from: com.onedelhi.secure.l9$c */
    public static final class C5981c {

        /* renamed from: a */
        public static final oc2<String, String> f31602a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f31602a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        C5978l9 l9Var = new C5978l9();
        DEFAULT_INSTANCE = l9Var;
        qe1.m62492dk(C5978l9.class, l9Var);
    }

    /* renamed from: Bk */
    public static C5980b m55386Bk() {
        return (C5980b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ck */
    public static C5980b m55387Ck(C5978l9 l9Var) {
        return (C5980b) DEFAULT_INSTANCE.mo43358gj(l9Var);
    }

    /* renamed from: Dk */
    public static C5978l9 m55388Dk(InputStream inputStream) throws IOException {
        return (C5978l9) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static C5978l9 m55389Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5978l9) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static C5978l9 m55390Fk(C5173er erVar) throws nt1 {
        return (C5978l9) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Gk */
    public static C5978l9 m55391Gk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5978l9) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Hk */
    public static C5978l9 m55392Hk(g00 g00) throws IOException {
        return (C5978l9) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ik */
    public static C5978l9 m55393Ik(g00 g00, zy0 zy0) throws IOException {
        return (C5978l9) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Jk */
    public static C5978l9 m55394Jk(InputStream inputStream) throws IOException {
        return (C5978l9) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static C5978l9 m55395Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5978l9) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static C5978l9 m55396Lk(ByteBuffer byteBuffer) throws nt1 {
        return (C5978l9) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Mk */
    public static C5978l9 m55397Mk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5978l9) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Nk */
    public static C5978l9 m55398Nk(byte[] bArr) throws nt1 {
        return (C5978l9) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ok */
    public static C5978l9 m55399Ok(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5978l9) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Pk */
    public static cz2<C5978l9> m55400Pk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: wk */
    public static C5978l9 m55414wk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ai */
    public boolean mo39716Ai() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Ak */
    public final void mo39717Ak(C6244o5 o5Var) {
        o5Var.getClass();
        C6244o5 o5Var2 = this.androidAppInfo_;
        if (!(o5Var2 == null || o5Var2 == C6244o5.m58939sk())) {
            o5Var = (C6244o5) ((C6244o5.C6246b) C6244o5.m58941uk(this.androidAppInfo_).mo43372Cj(o5Var)).mo43377Ja();
        }
        this.androidAppInfo_ = o5Var;
        this.bitField0_ |= 4;
    }

    /* renamed from: Eg */
    public boolean mo39718Eg() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: L5 */
    public boolean mo39719L5() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: N */
    public boolean mo39720N(String str) {
        str.getClass();
        return mo39744yk().containsKey(str);
    }

    /* renamed from: Ob */
    public C6244o5 mo39721Ob() {
        C6244o5 o5Var = this.androidAppInfo_;
        return o5Var == null ? C6244o5.m58939sk() : o5Var;
    }

    /* renamed from: Pa */
    public C5173er mo39722Pa() {
        return C5173er.m47136w(this.appInstanceId_);
    }

    /* renamed from: Qk */
    public final void mo39723Qk(C6244o5 o5Var) {
        o5Var.getClass();
        this.androidAppInfo_ = o5Var;
        this.bitField0_ |= 4;
    }

    /* renamed from: Rk */
    public final void mo39724Rk(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* renamed from: S */
    public Map<String, String> mo39725S() {
        return Collections.unmodifiableMap(mo39744yk());
    }

    /* renamed from: Sk */
    public final void mo39726Sk(C5173er erVar) {
        this.appInstanceId_ = erVar.mo35543k0();
        this.bitField0_ |= 2;
    }

    /* renamed from: Tk */
    public final void mo39727Tk(C6256o9 o9Var) {
        this.applicationProcessState_ = o9Var.mo32392j();
        this.bitField0_ |= 8;
    }

    /* renamed from: Uk */
    public final void mo39728Uk(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* renamed from: Vk */
    public final void mo39729Vk(C5173er erVar) {
        this.googleAppId_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    @Deprecated
    /* renamed from: X */
    public Map<String, String> mo39730X() {
        return mo39725S();
    }

    /* renamed from: a0 */
    public String mo39731a0(String str, String str2) {
        str.getClass();
        rc2<String, String> yk = mo39744yk();
        return yk.containsKey(str) ? yk.get(str) : str2;
    }

    /* renamed from: h0 */
    public int mo39732h0() {
        return mo39744yk().size();
    }

    /* renamed from: ja */
    public String mo39733ja() {
        return this.appInstanceId_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5979a.f31601a[iVar.ordinal()]) {
            case 1:
                return new C5978l9();
            case 2:
                return new C5980b((C5979a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C6256o9.m59113e(), "customAttributes_", C5981c.f31602a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5978l9> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5978l9.class) {
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

    /* renamed from: l0 */
    public String mo39734l0(String str) {
        str.getClass();
        rc2<String, String> yk = mo39744yk();
        if (yk.containsKey(str)) {
            return yk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q9 */
    public String mo39735q9() {
        return this.googleAppId_;
    }

    /* renamed from: qb */
    public C5173er mo39736qb() {
        return C5173er.m47136w(this.googleAppId_);
    }

    /* renamed from: sk */
    public final void mo39737sk() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* renamed from: tk */
    public final void mo39738tk() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = m55414wk().mo39733ja();
    }

    /* renamed from: uk */
    public final void mo39739uk() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* renamed from: vk */
    public final void mo39740vk() {
        this.bitField0_ &= -2;
        this.googleAppId_ = m55414wk().mo39735q9();
    }

    /* renamed from: x9 */
    public boolean mo39741x9() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: xk */
    public final Map<String, String> mo39742xk() {
        return mo39745zk();
    }

    /* renamed from: y3 */
    public C6256o9 mo39743y3() {
        C6256o9 a = C6256o9.m59111a(this.applicationProcessState_);
        return a == null ? C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN : a;
    }

    /* renamed from: yk */
    public final rc2<String, String> mo39744yk() {
        return this.customAttributes_;
    }

    /* renamed from: zk */
    public final rc2<String, String> mo39745zk() {
        if (!this.customAttributes_.mo43841n()) {
            this.customAttributes_ = this.customAttributes_.mo43846q();
        }
        return this.customAttributes_;
    }
}
