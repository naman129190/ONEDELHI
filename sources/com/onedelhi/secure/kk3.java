package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class kk3 extends qe1<kk3, C5905b> implements lk3 {
    /* access modifiers changed from: private */
    public static final kk3 DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile cz2<kk3> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_ = "";
    private vs1.C7095k<String> pattern_ = qe1.m62499pj();
    private String plural_ = "";
    private String singular_ = "";
    private String type_ = "";

    /* renamed from: com.onedelhi.secure.kk3$a */
    public static /* synthetic */ class C5904a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31239a;

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
                f31239a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31239a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kk3.C5904a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.kk3$b */
    public static final class C5905b extends qe1.C6546b<kk3, C5905b> implements lk3 {
        public C5905b() {
            super(kk3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5905b(C5904a aVar) {
            this();
        }

        /* renamed from: Fa */
        public List<String> mo39283Fa() {
            return Collections.unmodifiableList(((kk3) this.f34068b).mo39283Fa());
        }

        /* renamed from: Ff */
        public String mo39284Ff() {
            return ((kk3) this.f34068b).mo39284Ff();
        }

        /* renamed from: Fg */
        public C5173er mo39285Fg() {
            return ((kk3) this.f34068b).mo39285Fg();
        }

        /* renamed from: Gd */
        public String mo39287Gd(int i) {
            return ((kk3) this.f34068b).mo39287Gd(i);
        }

        /* renamed from: Gj */
        public C5905b mo39313Gj(Iterable<String> iterable) {
            mo43393xj();
            ((kk3) this.f34068b).mo39278Ak(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5905b mo39314Hj(String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39279Bk(str);
            return this;
        }

        /* renamed from: Ij */
        public C5905b mo39315Ij(C5173er erVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39280Ck(erVar);
            return this;
        }

        /* renamed from: Jj */
        public C5905b mo39316Jj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39281Dk();
            return this;
        }

        /* renamed from: Kj */
        public C5905b mo39317Kj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39282Ek();
            return this;
        }

        /* renamed from: Ld */
        public int mo39292Ld() {
            return ((kk3) this.f34068b).mo39292Ld();
        }

        /* renamed from: Lj */
        public C5905b mo39318Lj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39286Fk();
            return this;
        }

        /* renamed from: Mj */
        public C5905b mo39319Mj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39288Gk();
            return this;
        }

        /* renamed from: Nj */
        public C5905b mo39320Nj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39289Hk();
            return this;
        }

        /* renamed from: Oj */
        public C5905b mo39321Oj() {
            mo43393xj();
            ((kk3) this.f34068b).mo39290Ik();
            return this;
        }

        /* renamed from: Pj */
        public C5905b mo39322Pj(C5906c cVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39296al(cVar);
            return this;
        }

        /* renamed from: Q4 */
        public C5173er mo39293Q4(int i) {
            return ((kk3) this.f34068b).mo39293Q4(i);
        }

        /* renamed from: Qj */
        public C5905b mo39323Qj(int i) {
            mo43393xj();
            ((kk3) this.f34068b).mo39298bl(i);
            return this;
        }

        /* renamed from: Rj */
        public C5905b mo39324Rj(String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39299cl(str);
            return this;
        }

        /* renamed from: Sj */
        public C5905b mo39325Sj(C5173er erVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39300dl(erVar);
            return this;
        }

        /* renamed from: Tj */
        public C5905b mo39326Tj(int i, String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39301el(i, str);
            return this;
        }

        /* renamed from: U5 */
        public C5906c mo39294U5() {
            return ((kk3) this.f34068b).mo39294U5();
        }

        /* renamed from: Uj */
        public C5905b mo39327Uj(String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39302fl(str);
            return this;
        }

        /* renamed from: Vg */
        public String mo39295Vg() {
            return ((kk3) this.f34068b).mo39295Vg();
        }

        /* renamed from: Vj */
        public C5905b mo39328Vj(C5173er erVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39303gl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5905b mo39329Wj(String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39305hl(str);
            return this;
        }

        /* renamed from: Xj */
        public C5905b mo39330Xj(C5173er erVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39306il(erVar);
            return this;
        }

        /* renamed from: Yj */
        public C5905b mo39331Yj(String str) {
            mo43393xj();
            ((kk3) this.f34068b).mo39307jl(str);
            return this;
        }

        /* renamed from: Zj */
        public C5905b mo39332Zj(C5173er erVar) {
            mo43393xj();
            ((kk3) this.f34068b).mo39309kl(erVar);
            return this;
        }

        /* renamed from: b5 */
        public C5173er mo39297b5() {
            return ((kk3) this.f34068b).mo39297b5();
        }

        /* renamed from: h */
        public String mo39304h() {
            return ((kk3) this.f34068b).mo39304h();
        }

        /* renamed from: k6 */
        public String mo39308k6() {
            return ((kk3) this.f34068b).mo39308k6();
        }

        /* renamed from: m */
        public C5173er mo39310m() {
            return ((kk3) this.f34068b).mo39310m();
        }

        /* renamed from: o4 */
        public int mo39311o4() {
            return ((kk3) this.f34068b).mo39311o4();
        }

        /* renamed from: oe */
        public C5173er mo39312oe() {
            return ((kk3) this.f34068b).mo39312oe();
        }
    }

    /* renamed from: com.onedelhi.secure.kk3$c */
    public enum C5906c implements vs1.C7081c {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C5906c> f31241a = null;

        /* renamed from: o */
        public static final int f31246o = 0;

        /* renamed from: p */
        public static final int f31247p = 1;

        /* renamed from: q */
        public static final int f31248q = 2;

        /* renamed from: n */
        public final int f31249n;

        /* renamed from: com.onedelhi.secure.kk3$c$a */
        public class C5907a implements vs1.C7082d<C5906c> {
            /* renamed from: b */
            public C5906c mo32393a(int i) {
                return C5906c.m54551a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.kk3$c$b */
        public static final class C5908b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f31250a = null;

            static {
                f31250a = new C5908b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C5906c.m54551a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f31241a = new C5907a();
        }

        /* access modifiers changed from: public */
        C5906c(int i) {
            this.f31249n = i;
        }

        /* renamed from: a */
        public static C5906c m54551a(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        /* renamed from: b */
        public static vs1.C7082d<C5906c> m54552b() {
            return f31241a;
        }

        /* renamed from: e */
        public static vs1.C7083e m54553e() {
            return C5908b.f31250a;
        }

        @Deprecated
        /* renamed from: g */
        public static C5906c m54554g(int i) {
            return m54551a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f31249n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        kk3 kk3 = new kk3();
        DEFAULT_INSTANCE = kk3;
        qe1.m62492dk(kk3.class, kk3);
    }

    /* renamed from: Kk */
    public static kk3 m54444Kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Lk */
    public static C5905b m54445Lk() {
        return (C5905b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Mk */
    public static C5905b m54446Mk(kk3 kk3) {
        return (C5905b) DEFAULT_INSTANCE.mo43358gj(kk3);
    }

    /* renamed from: Nk */
    public static kk3 m54447Nk(InputStream inputStream) throws IOException {
        return (kk3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ok */
    public static kk3 m54448Ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (kk3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Pk */
    public static kk3 m54449Pk(C5173er erVar) throws nt1 {
        return (kk3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Qk */
    public static kk3 m54450Qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (kk3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Rk */
    public static kk3 m54451Rk(g00 g00) throws IOException {
        return (kk3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Sk */
    public static kk3 m54452Sk(g00 g00, zy0 zy0) throws IOException {
        return (kk3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Tk */
    public static kk3 m54453Tk(InputStream inputStream) throws IOException {
        return (kk3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Uk */
    public static kk3 m54454Uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (kk3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Vk */
    public static kk3 m54455Vk(ByteBuffer byteBuffer) throws nt1 {
        return (kk3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Wk */
    public static kk3 m54456Wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (kk3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Xk */
    public static kk3 m54457Xk(byte[] bArr) throws nt1 {
        return (kk3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Yk */
    public static kk3 m54458Yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (kk3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Zk */
    public static cz2<kk3> m54459Zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo39278Ak(Iterable<String> iterable) {
        mo39291Jk();
        C7403z0.m72412X6(iterable, this.pattern_);
    }

    /* renamed from: Bk */
    public final void mo39279Bk(String str) {
        str.getClass();
        mo39291Jk();
        this.pattern_.add(str);
    }

    /* renamed from: Ck */
    public final void mo39280Ck(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo39291Jk();
        this.pattern_.add(erVar.mo35543k0());
    }

    /* renamed from: Dk */
    public final void mo39281Dk() {
        this.history_ = 0;
    }

    /* renamed from: Ek */
    public final void mo39282Ek() {
        this.nameField_ = m54444Kk().mo39308k6();
    }

    /* renamed from: Fa */
    public List<String> mo39283Fa() {
        return this.pattern_;
    }

    /* renamed from: Ff */
    public String mo39284Ff() {
        return this.plural_;
    }

    /* renamed from: Fg */
    public C5173er mo39285Fg() {
        return C5173er.m47136w(this.nameField_);
    }

    /* renamed from: Fk */
    public final void mo39286Fk() {
        this.pattern_ = qe1.m62499pj();
    }

    /* renamed from: Gd */
    public String mo39287Gd(int i) {
        return this.pattern_.get(i);
    }

    /* renamed from: Gk */
    public final void mo39288Gk() {
        this.plural_ = m54444Kk().mo39284Ff();
    }

    /* renamed from: Hk */
    public final void mo39289Hk() {
        this.singular_ = m54444Kk().mo39295Vg();
    }

    /* renamed from: Ik */
    public final void mo39290Ik() {
        this.type_ = m54444Kk().mo39304h();
    }

    /* renamed from: Jk */
    public final void mo39291Jk() {
        vs1.C7095k<String> kVar = this.pattern_;
        if (!kVar.mo36500p()) {
            this.pattern_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ld */
    public int mo39292Ld() {
        return this.pattern_.size();
    }

    /* renamed from: Q4 */
    public C5173er mo39293Q4(int i) {
        return C5173er.m47136w(this.pattern_.get(i));
    }

    /* renamed from: U5 */
    public C5906c mo39294U5() {
        C5906c a = C5906c.m54551a(this.history_);
        return a == null ? C5906c.UNRECOGNIZED : a;
    }

    /* renamed from: Vg */
    public String mo39295Vg() {
        return this.singular_;
    }

    /* renamed from: al */
    public final void mo39296al(C5906c cVar) {
        this.history_ = cVar.mo32392j();
    }

    /* renamed from: b5 */
    public C5173er mo39297b5() {
        return C5173er.m47136w(this.plural_);
    }

    /* renamed from: bl */
    public final void mo39298bl(int i) {
        this.history_ = i;
    }

    /* renamed from: cl */
    public final void mo39299cl(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* renamed from: dl */
    public final void mo39300dl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.nameField_ = erVar.mo35543k0();
    }

    /* renamed from: el */
    public final void mo39301el(int i, String str) {
        str.getClass();
        mo39291Jk();
        this.pattern_.set(i, str);
    }

    /* renamed from: fl */
    public final void mo39302fl(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* renamed from: gl */
    public final void mo39303gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.plural_ = erVar.mo35543k0();
    }

    /* renamed from: h */
    public String mo39304h() {
        return this.type_;
    }

    /* renamed from: hl */
    public final void mo39305hl(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* renamed from: il */
    public final void mo39306il(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.singular_ = erVar.mo35543k0();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5904a.f31239a[iVar.ordinal()]) {
            case 1:
                return new kk3();
            case 2:
                return new C5905b((C5904a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<kk3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (kk3.class) {
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
    public final void mo39307jl(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* renamed from: k6 */
    public String mo39308k6() {
        return this.nameField_;
    }

    /* renamed from: kl */
    public final void mo39309kl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.type_ = erVar.mo35543k0();
    }

    /* renamed from: m */
    public C5173er mo39310m() {
        return C5173er.m47136w(this.type_);
    }

    /* renamed from: o4 */
    public int mo39311o4() {
        return this.history_;
    }

    /* renamed from: oe */
    public C5173er mo39312oe() {
        return C5173er.m47136w(this.singular_);
    }
}
