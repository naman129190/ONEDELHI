package com.onedelhi.secure;

import com.onedelhi.secure.ic0;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class zm1 extends qe1<zm1, C7505b> implements an1 {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final zm1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile cz2<zm1> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private vs1.C7095k<zm1> additionalBindings_ = qe1.m62499pj();
    private String body_ = "";
    private int patternCase_ = 0;
    private Object pattern_;
    private String responseBody_ = "";
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.zm1$a */
    public static /* synthetic */ class C7504a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38376a;

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
                f38376a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38376a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zm1.C7504a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.zm1$b */
    public static final class C7505b extends qe1.C6546b<zm1, C7505b> implements an1 {
        public C7505b() {
            super(zm1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7505b(C7504a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7505b mo48365Gj(int i, C7505b bVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48342Ok(i, (zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Hj */
        public C7505b mo48366Hj(int i, zm1 zm1) {
            mo43393xj();
            ((zm1) this.f34068b).mo48342Ok(i, zm1);
            return this;
        }

        /* renamed from: Ij */
        public C7505b mo48367Ij(C7505b bVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48344Pk((zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C7505b mo48368Jj(zm1 zm1) {
            mo43393xj();
            ((zm1) this.f34068b).mo48344Pk(zm1);
            return this;
        }

        /* renamed from: Kb */
        public String mo31041Kb() {
            return ((zm1) this.f34068b).mo31041Kb();
        }

        /* renamed from: Kj */
        public C7505b mo48369Kj(Iterable<? extends zm1> iterable) {
            mo43393xj();
            ((zm1) this.f34068b).mo48345Qk(iterable);
            return this;
        }

        /* renamed from: Lj */
        public C7505b mo48370Lj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48346Rk();
            return this;
        }

        /* renamed from: Md */
        public boolean mo31042Md() {
            return ((zm1) this.f34068b).mo31042Md();
        }

        /* renamed from: Mj */
        public C7505b mo48371Mj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48347Sk();
            return this;
        }

        /* renamed from: N3 */
        public ic0 mo31043N3() {
            return ((zm1) this.f34068b).mo31043N3();
        }

        /* renamed from: N7 */
        public String mo31044N7() {
            return ((zm1) this.f34068b).mo31044N7();
        }

        /* renamed from: Nb */
        public C5173er mo31045Nb() {
            return ((zm1) this.f34068b).mo31045Nb();
        }

        /* renamed from: Nj */
        public C7505b mo48372Nj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48348Tk();
            return this;
        }

        /* renamed from: Oc */
        public zm1 mo31046Oc(int i) {
            return ((zm1) this.f34068b).mo31046Oc(i);
        }

        /* renamed from: Oh */
        public String mo31047Oh() {
            return ((zm1) this.f34068b).mo31047Oh();
        }

        /* renamed from: Oj */
        public C7505b mo48373Oj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48349Uk();
            return this;
        }

        /* renamed from: Pj */
        public C7505b mo48374Pj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48350Vk();
            return this;
        }

        /* renamed from: Qj */
        public C7505b mo48375Qj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48351Wk();
            return this;
        }

        /* renamed from: Rj */
        public C7505b mo48376Rj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48352Xk();
            return this;
        }

        /* renamed from: Sj */
        public C7505b mo48377Sj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48353Yk();
            return this;
        }

        /* renamed from: T4 */
        public int mo31048T4() {
            return ((zm1) this.f34068b).mo31048T4();
        }

        /* renamed from: Tj */
        public C7505b mo48378Tj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48354Zk();
            return this;
        }

        /* renamed from: Uj */
        public C7505b mo48379Uj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48355al();
            return this;
        }

        /* renamed from: Vc */
        public String mo31049Vc() {
            return ((zm1) this.f34068b).mo31049Vc();
        }

        /* renamed from: Vj */
        public C7505b mo48380Vj() {
            mo43393xj();
            ((zm1) this.f34068b).mo48356bl();
            return this;
        }

        /* renamed from: Wd */
        public C5173er mo31050Wd() {
            return ((zm1) this.f34068b).mo31050Wd();
        }

        /* renamed from: Wj */
        public C7505b mo48381Wj(ic0 ic0) {
            mo43393xj();
            ((zm1) this.f34068b).mo48360gl(ic0);
            return this;
        }

        /* renamed from: Xf */
        public String mo31051Xf() {
            return ((zm1) this.f34068b).mo31051Xf();
        }

        /* renamed from: Xj */
        public C7505b mo48382Xj(int i) {
            mo43393xj();
            ((zm1) this.f34068b).mo48361wl(i);
            return this;
        }

        /* renamed from: Yj */
        public C7505b mo48383Yj(int i, C7505b bVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48362xl(i, (zm1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Zj */
        public C7505b mo48384Zj(int i, zm1 zm1) {
            mo43393xj();
            ((zm1) this.f34068b).mo48362xl(i, zm1);
            return this;
        }

        /* renamed from: ak */
        public C7505b mo48385ak(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48363yl(str);
            return this;
        }

        /* renamed from: bk */
        public C7505b mo48386bk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48364zl(erVar);
            return this;
        }

        /* renamed from: ck */
        public C7505b mo48387ck(ic0.C5708b bVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48328Al((ic0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: dk */
        public C7505b mo48388dk(ic0 ic0) {
            mo43393xj();
            ((zm1) this.f34068b).mo48328Al(ic0);
            return this;
        }

        /* renamed from: ek */
        public C7505b mo48389ek(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48329Bl(str);
            return this;
        }

        /* renamed from: f4 */
        public List<zm1> mo31052f4() {
            return Collections.unmodifiableList(((zm1) this.f34068b).mo31052f4());
        }

        /* renamed from: fk */
        public C7505b mo48390fk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48330Cl(erVar);
            return this;
        }

        /* renamed from: gk */
        public C7505b mo48391gk(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48331Dl(str);
            return this;
        }

        /* renamed from: hk */
        public C7505b mo48392hk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48332El(erVar);
            return this;
        }

        /* renamed from: ik */
        public C7505b mo48393ik(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48333Fl(str);
            return this;
        }

        /* renamed from: j6 */
        public C7506c mo31053j6() {
            return ((zm1) this.f34068b).mo31053j6();
        }

        /* renamed from: jf */
        public C5173er mo31054jf() {
            return ((zm1) this.f34068b).mo31054jf();
        }

        /* renamed from: jk */
        public C7505b mo48394jk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48334Gl(erVar);
            return this;
        }

        /* renamed from: k */
        public String mo31055k() {
            return ((zm1) this.f34068b).mo31055k();
        }

        /* renamed from: kb */
        public C5173er mo31056kb() {
            return ((zm1) this.f34068b).mo31056kb();
        }

        /* renamed from: kg */
        public C5173er mo31057kg() {
            return ((zm1) this.f34068b).mo31057kg();
        }

        /* renamed from: kk */
        public C7505b mo48395kk(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48335Hl(str);
            return this;
        }

        /* renamed from: l */
        public C5173er mo31058l() {
            return ((zm1) this.f34068b).mo31058l();
        }

        /* renamed from: lk */
        public C7505b mo48396lk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48336Il(erVar);
            return this;
        }

        /* renamed from: mk */
        public C7505b mo48397mk(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48337Jl(str);
            return this;
        }

        /* renamed from: nk */
        public C7505b mo48398nk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48338Kl(erVar);
            return this;
        }

        /* renamed from: ok */
        public C7505b mo48399ok(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48339Ll(str);
            return this;
        }

        /* renamed from: p2 */
        public C5173er mo31059p2() {
            return ((zm1) this.f34068b).mo31059p2();
        }

        /* renamed from: pk */
        public C7505b mo48400pk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48340Ml(erVar);
            return this;
        }

        /* renamed from: qk */
        public C7505b mo48401qk(String str) {
            mo43393xj();
            ((zm1) this.f34068b).mo48341Nl(str);
            return this;
        }

        /* renamed from: rk */
        public C7505b mo48402rk(C5173er erVar) {
            mo43393xj();
            ((zm1) this.f34068b).mo48343Ol(erVar);
            return this;
        }

        /* renamed from: t5 */
        public String mo31060t5() {
            return ((zm1) this.f34068b).mo31060t5();
        }

        /* renamed from: we */
        public String mo31061we() {
            return ((zm1) this.f34068b).mo31061we();
        }

        /* renamed from: y2 */
        public C5173er mo31062y2() {
            return ((zm1) this.f34068b).mo31062y2();
        }
    }

    /* renamed from: com.onedelhi.secure.zm1$c */
    public enum C7506c {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);
        

        /* renamed from: n */
        public final int f38385n;

        /* access modifiers changed from: public */
        C7506c(int i) {
            this.f38385n = i;
        }

        /* renamed from: a */
        public static C7506c m74178a(int i) {
            if (i == 0) {
                return PATTERN_NOT_SET;
            }
            if (i == 8) {
                return CUSTOM;
            }
            if (i == 2) {
                return GET;
            }
            if (i == 3) {
                return PUT;
            }
            if (i == 4) {
                return POST;
            }
            if (i == 5) {
                return DELETE;
            }
            if (i != 6) {
                return null;
            }
            return PATCH;
        }

        @Deprecated
        /* renamed from: b */
        public static C7506c m74179b(int i) {
            return m74178a(i);
        }

        /* renamed from: j */
        public int mo48403j() {
            return this.f38385n;
        }
    }

    static {
        zm1 zm1 = new zm1();
        DEFAULT_INSTANCE = zm1;
        qe1.m62492dk(zm1.class, zm1);
    }

    /* renamed from: fl */
    public static zm1 m74022fl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: hl */
    public static C7505b m74025hl() {
        return (C7505b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: il */
    public static C7505b m74027il(zm1 zm1) {
        return (C7505b) DEFAULT_INSTANCE.mo43358gj(zm1);
    }

    /* renamed from: jl */
    public static zm1 m74029jl(InputStream inputStream) throws IOException {
        return (zm1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: kl */
    public static zm1 m74031kl(InputStream inputStream, zy0 zy0) throws IOException {
        return (zm1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ll */
    public static zm1 m74033ll(C5173er erVar) throws nt1 {
        return (zm1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: ml */
    public static zm1 m74035ml(C5173er erVar, zy0 zy0) throws nt1 {
        return (zm1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: nl */
    public static zm1 m74037nl(g00 g00) throws IOException {
        return (zm1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ol */
    public static zm1 m74039ol(g00 g00, zy0 zy0) throws IOException {
        return (zm1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: pl */
    public static zm1 m74041pl(InputStream inputStream) throws IOException {
        return (zm1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ql */
    public static zm1 m74043ql(InputStream inputStream, zy0 zy0) throws IOException {
        return (zm1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rl */
    public static zm1 m74045rl(ByteBuffer byteBuffer) throws nt1 {
        return (zm1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: sl */
    public static zm1 m74047sl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (zm1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: tl */
    public static zm1 m74049tl(byte[] bArr) throws nt1 {
        return (zm1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: ul */
    public static zm1 m74051ul(byte[] bArr, zy0 zy0) throws nt1 {
        return (zm1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: vl */
    public static cz2<zm1> m74053vl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Al */
    public final void mo48328Al(ic0 ic0) {
        ic0.getClass();
        this.pattern_ = ic0;
        this.patternCase_ = 8;
    }

    /* renamed from: Bl */
    public final void mo48329Bl(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* renamed from: Cl */
    public final void mo48330Cl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pattern_ = erVar.mo35543k0();
        this.patternCase_ = 5;
    }

    /* renamed from: Dl */
    public final void mo48331Dl(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* renamed from: El */
    public final void mo48332El(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pattern_ = erVar.mo35543k0();
        this.patternCase_ = 2;
    }

    /* renamed from: Fl */
    public final void mo48333Fl(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* renamed from: Gl */
    public final void mo48334Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pattern_ = erVar.mo35543k0();
        this.patternCase_ = 6;
    }

    /* renamed from: Hl */
    public final void mo48335Hl(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* renamed from: Il */
    public final void mo48336Il(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pattern_ = erVar.mo35543k0();
        this.patternCase_ = 4;
    }

    /* renamed from: Jl */
    public final void mo48337Jl(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* renamed from: Kb */
    public String mo31041Kb() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    /* renamed from: Kl */
    public final void mo48338Kl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pattern_ = erVar.mo35543k0();
        this.patternCase_ = 3;
    }

    /* renamed from: Ll */
    public final void mo48339Ll(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* renamed from: Md */
    public boolean mo31042Md() {
        return this.patternCase_ == 8;
    }

    /* renamed from: Ml */
    public final void mo48340Ml(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.responseBody_ = erVar.mo35543k0();
    }

    /* renamed from: N3 */
    public ic0 mo31043N3() {
        return this.patternCase_ == 8 ? (ic0) this.pattern_ : ic0.m51990ok();
    }

    /* renamed from: N7 */
    public String mo31044N7() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    /* renamed from: Nb */
    public C5173er mo31045Nb() {
        return C5173er.m47136w(this.body_);
    }

    /* renamed from: Nl */
    public final void mo48341Nl(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: Oc */
    public zm1 mo31046Oc(int i) {
        return this.additionalBindings_.get(i);
    }

    /* renamed from: Oh */
    public String mo31047Oh() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }

    /* renamed from: Ok */
    public final void mo48342Ok(int i, zm1 zm1) {
        zm1.getClass();
        mo48357cl();
        this.additionalBindings_.add(i, zm1);
    }

    /* renamed from: Ol */
    public final void mo48343Ol(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: Pk */
    public final void mo48344Pk(zm1 zm1) {
        zm1.getClass();
        mo48357cl();
        this.additionalBindings_.add(zm1);
    }

    /* renamed from: Qk */
    public final void mo48345Qk(Iterable<? extends zm1> iterable) {
        mo48357cl();
        C7403z0.m72412X6(iterable, this.additionalBindings_);
    }

    /* renamed from: Rk */
    public final void mo48346Rk() {
        this.additionalBindings_ = qe1.m62499pj();
    }

    /* renamed from: Sk */
    public final void mo48347Sk() {
        this.body_ = m74022fl().mo31060t5();
    }

    /* renamed from: T4 */
    public int mo31048T4() {
        return this.additionalBindings_.size();
    }

    /* renamed from: Tk */
    public final void mo48348Tk() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: Uk */
    public final void mo48349Uk() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: Vc */
    public String mo31049Vc() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    /* renamed from: Vk */
    public final void mo48350Vk() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: Wd */
    public C5173er mo31050Wd() {
        return C5173er.m47136w(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    /* renamed from: Wk */
    public final void mo48351Wk() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: Xf */
    public String mo31051Xf() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    /* renamed from: Xk */
    public final void mo48352Xk() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* renamed from: Yk */
    public final void mo48353Yk() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: Zk */
    public final void mo48354Zk() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* renamed from: al */
    public final void mo48355al() {
        this.responseBody_ = m74022fl().mo31061we();
    }

    /* renamed from: bl */
    public final void mo48356bl() {
        this.selector_ = m74022fl().mo31055k();
    }

    /* renamed from: cl */
    public final void mo48357cl() {
        vs1.C7095k<zm1> kVar = this.additionalBindings_;
        if (!kVar.mo36500p()) {
            this.additionalBindings_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: dl */
    public an1 mo48358dl(int i) {
        return this.additionalBindings_.get(i);
    }

    /* renamed from: el */
    public List<? extends an1> mo48359el() {
        return this.additionalBindings_;
    }

    /* renamed from: f4 */
    public List<zm1> mo31052f4() {
        return this.additionalBindings_;
    }

    /* renamed from: gl */
    public final void mo48360gl(ic0 ic0) {
        ic0.getClass();
        zh2 zh2 = ic0;
        if (this.patternCase_ == 8) {
            zh2 = ic0;
            if (this.pattern_ != ic0.m51990ok()) {
                zh2 = ((ic0.C5708b) ic0.m51992qk((ic0) this.pattern_).mo43372Cj(ic0)).mo43377Ja();
            }
        }
        this.pattern_ = zh2;
        this.patternCase_ = 8;
    }

    /* renamed from: j6 */
    public C7506c mo31053j6() {
        return C7506c.m74178a(this.patternCase_);
    }

    /* renamed from: jf */
    public C5173er mo31054jf() {
        return C5173er.m47136w(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        Class<zm1> cls = zm1.class;
        switch (C7504a.f38376a[iVar.ordinal()]) {
            case 1:
                return new zm1();
            case 2:
                return new C7505b((C7504a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", ic0.class, "additionalBindings_", cls, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<zm1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (cls) {
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

    /* renamed from: k */
    public String mo31055k() {
        return this.selector_;
    }

    /* renamed from: kb */
    public C5173er mo31056kb() {
        return C5173er.m47136w(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    /* renamed from: kg */
    public C5173er mo31057kg() {
        return C5173er.m47136w(this.responseBody_);
    }

    /* renamed from: l */
    public C5173er mo31058l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: p2 */
    public C5173er mo31059p2() {
        return C5173er.m47136w(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    /* renamed from: t5 */
    public String mo31060t5() {
        return this.body_;
    }

    /* renamed from: we */
    public String mo31061we() {
        return this.responseBody_;
    }

    /* renamed from: wl */
    public final void mo48361wl(int i) {
        mo48357cl();
        this.additionalBindings_.remove(i);
    }

    /* renamed from: xl */
    public final void mo48362xl(int i, zm1 zm1) {
        zm1.getClass();
        mo48357cl();
        this.additionalBindings_.set(i, zm1);
    }

    /* renamed from: y2 */
    public C5173er mo31062y2() {
        return C5173er.m47136w(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    /* renamed from: yl */
    public final void mo48363yl(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* renamed from: zl */
    public final void mo48364zl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.body_ = erVar.mo35543k0();
    }
}
