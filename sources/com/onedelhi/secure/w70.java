package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class w70 extends qe1<w70, C7145b> implements x70 {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final w70 DEFAULT_INSTANCE;
    private static volatile cz2<w70> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private vs1.C7095k<String> allowedRequestExtensions_ = qe1.m62499pj();
    private vs1.C7095k<String> allowedResponseExtensions_ = qe1.m62499pj();
    private vs1.C7095k<String> provided_ = qe1.m62499pj();
    private vs1.C7095k<String> requested_ = qe1.m62499pj();
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.w70$a */
    public static /* synthetic */ class C7144a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36913a;

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
                f36913a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36913a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w70.C7144a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.w70$b */
    public static final class C7145b extends qe1.C6546b<w70, C7145b> implements x70 {
        public C7145b() {
            super(w70.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7145b(C7144a aVar) {
            this();
        }

        /* renamed from: A3 */
        public String mo46561A3(int i) {
            return ((w70) this.f34068b).mo46561A3(i);
        }

        /* renamed from: Gj */
        public C7145b mo46606Gj(Iterable<String> iterable) {
            mo43393xj();
            ((w70) this.f34068b).mo46562Dk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7145b mo46607Hj(Iterable<String> iterable) {
            mo43393xj();
            ((w70) this.f34068b).mo46563Ek(iterable);
            return this;
        }

        /* renamed from: Ic */
        public List<String> mo46567Ic() {
            return Collections.unmodifiableList(((w70) this.f34068b).mo46567Ic());
        }

        /* renamed from: Ij */
        public C7145b mo46608Ij(Iterable<String> iterable) {
            mo43393xj();
            ((w70) this.f34068b).mo46564Fk(iterable);
            return this;
        }

        /* renamed from: Jj */
        public C7145b mo46609Jj(Iterable<String> iterable) {
            mo43393xj();
            ((w70) this.f34068b).mo46565Gk(iterable);
            return this;
        }

        /* renamed from: K2 */
        public String mo46570K2(int i) {
            return ((w70) this.f34068b).mo46570K2(i);
        }

        /* renamed from: Kj */
        public C7145b mo46610Kj(String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46566Hk(str);
            return this;
        }

        /* renamed from: Lj */
        public C7145b mo46611Lj(C5173er erVar) {
            mo43393xj();
            ((w70) this.f34068b).mo46568Ik(erVar);
            return this;
        }

        /* renamed from: M8 */
        public List<String> mo46573M8() {
            return Collections.unmodifiableList(((w70) this.f34068b).mo46573M8());
        }

        /* renamed from: Mj */
        public C7145b mo46612Mj(String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46569Jk(str);
            return this;
        }

        /* renamed from: N9 */
        public int mo46575N9() {
            return ((w70) this.f34068b).mo46575N9();
        }

        /* renamed from: Nj */
        public C7145b mo46613Nj(C5173er erVar) {
            mo43393xj();
            ((w70) this.f34068b).mo46571Kk(erVar);
            return this;
        }

        /* renamed from: O6 */
        public C5173er mo46577O6(int i) {
            return ((w70) this.f34068b).mo46577O6(i);
        }

        /* renamed from: Oj */
        public C7145b mo46614Oj(String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46572Lk(str);
            return this;
        }

        /* renamed from: Pj */
        public C7145b mo46615Pj(C5173er erVar) {
            mo43393xj();
            ((w70) this.f34068b).mo46574Mk(erVar);
            return this;
        }

        /* renamed from: Qj */
        public C7145b mo46616Qj(String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46576Nk(str);
            return this;
        }

        /* renamed from: Rj */
        public C7145b mo46617Rj(C5173er erVar) {
            mo43393xj();
            ((w70) this.f34068b).mo46578Ok(erVar);
            return this;
        }

        /* renamed from: Sj */
        public C7145b mo46618Sj() {
            mo43393xj();
            ((w70) this.f34068b).mo46579Pk();
            return this;
        }

        /* renamed from: T8 */
        public C5173er mo46583T8(int i) {
            return ((w70) this.f34068b).mo46583T8(i);
        }

        /* renamed from: Tb */
        public String mo46584Tb(int i) {
            return ((w70) this.f34068b).mo46584Tb(i);
        }

        /* renamed from: Tj */
        public C7145b mo46619Tj() {
            mo43393xj();
            ((w70) this.f34068b).mo46580Qk();
            return this;
        }

        /* renamed from: Uj */
        public C7145b mo46620Uj() {
            mo43393xj();
            ((w70) this.f34068b).mo46581Rk();
            return this;
        }

        /* renamed from: Vj */
        public C7145b mo46621Vj() {
            mo43393xj();
            ((w70) this.f34068b).mo46582Sk();
            return this;
        }

        /* renamed from: Wj */
        public C7145b mo46622Wj() {
            mo43393xj();
            ((w70) this.f34068b).mo46585Tk();
            return this;
        }

        /* renamed from: Xj */
        public C7145b mo46623Xj(int i, String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46595ol(i, str);
            return this;
        }

        /* renamed from: Yj */
        public C7145b mo46624Yj(int i, String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46596pl(i, str);
            return this;
        }

        /* renamed from: Zj */
        public C7145b mo46625Zj(int i, String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46597ql(i, str);
            return this;
        }

        /* renamed from: ak */
        public C7145b mo46626ak(int i, String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46598rl(i, str);
            return this;
        }

        /* renamed from: bk */
        public C7145b mo46627bk(String str) {
            mo43393xj();
            ((w70) this.f34068b).mo46599sl(str);
            return this;
        }

        /* renamed from: ck */
        public C7145b mo46628ck(C5173er erVar) {
            mo43393xj();
            ((w70) this.f34068b).mo46600tl(erVar);
            return this;
        }

        /* renamed from: h5 */
        public C5173er mo46590h5(int i) {
            return ((w70) this.f34068b).mo46590h5(i);
        }

        /* renamed from: ib */
        public int mo46591ib() {
            return ((w70) this.f34068b).mo46591ib();
        }

        /* renamed from: k */
        public String mo46592k() {
            return ((w70) this.f34068b).mo46592k();
        }

        /* renamed from: kd */
        public String mo46593kd(int i) {
            return ((w70) this.f34068b).mo46593kd(i);
        }

        /* renamed from: l */
        public C5173er mo46594l() {
            return ((w70) this.f34068b).mo46594l();
        }

        /* renamed from: ve */
        public List<String> mo46601ve() {
            return Collections.unmodifiableList(((w70) this.f34068b).mo46601ve());
        }

        /* renamed from: wd */
        public List<String> mo46602wd() {
            return Collections.unmodifiableList(((w70) this.f34068b).mo46602wd());
        }

        /* renamed from: x7 */
        public int mo46603x7() {
            return ((w70) this.f34068b).mo46603x7();
        }

        /* renamed from: xf */
        public int mo46604xf() {
            return ((w70) this.f34068b).mo46604xf();
        }

        /* renamed from: z9 */
        public C5173er mo46605z9(int i) {
            return ((w70) this.f34068b).mo46605z9(i);
        }
    }

    static {
        w70 w70 = new w70();
        DEFAULT_INSTANCE = w70;
        qe1.m62492dk(w70.class, w70);
    }

    /* renamed from: Yk */
    public static w70 m69064Yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Zk */
    public static C7145b m69065Zk() {
        return (C7145b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: al */
    public static C7145b m69066al(w70 w70) {
        return (C7145b) DEFAULT_INSTANCE.mo43358gj(w70);
    }

    /* renamed from: bl */
    public static w70 m69067bl(InputStream inputStream) throws IOException {
        return (w70) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: cl */
    public static w70 m69068cl(InputStream inputStream, zy0 zy0) throws IOException {
        return (w70) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: dl */
    public static w70 m69069dl(C5173er erVar) throws nt1 {
        return (w70) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: el */
    public static w70 m69070el(C5173er erVar, zy0 zy0) throws nt1 {
        return (w70) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: fl */
    public static w70 m69072fl(g00 g00) throws IOException {
        return (w70) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: gl */
    public static w70 m69074gl(g00 g00, zy0 zy0) throws IOException {
        return (w70) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: hl */
    public static w70 m69076hl(InputStream inputStream) throws IOException {
        return (w70) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: il */
    public static w70 m69078il(InputStream inputStream, zy0 zy0) throws IOException {
        return (w70) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: jl */
    public static w70 m69080jl(ByteBuffer byteBuffer) throws nt1 {
        return (w70) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: kl */
    public static w70 m69082kl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (w70) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: ll */
    public static w70 m69084ll(byte[] bArr) throws nt1 {
        return (w70) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: ml */
    public static w70 m69086ml(byte[] bArr, zy0 zy0) throws nt1 {
        return (w70) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: nl */
    public static cz2<w70> m69088nl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A3 */
    public String mo46561A3(int i) {
        return this.allowedRequestExtensions_.get(i);
    }

    /* renamed from: Dk */
    public final void mo46562Dk(Iterable<String> iterable) {
        mo46586Uk();
        C7403z0.m72412X6(iterable, this.allowedRequestExtensions_);
    }

    /* renamed from: Ek */
    public final void mo46563Ek(Iterable<String> iterable) {
        mo46587Vk();
        C7403z0.m72412X6(iterable, this.allowedResponseExtensions_);
    }

    /* renamed from: Fk */
    public final void mo46564Fk(Iterable<String> iterable) {
        mo46588Wk();
        C7403z0.m72412X6(iterable, this.provided_);
    }

    /* renamed from: Gk */
    public final void mo46565Gk(Iterable<String> iterable) {
        mo46589Xk();
        C7403z0.m72412X6(iterable, this.requested_);
    }

    /* renamed from: Hk */
    public final void mo46566Hk(String str) {
        str.getClass();
        mo46586Uk();
        this.allowedRequestExtensions_.add(str);
    }

    /* renamed from: Ic */
    public List<String> mo46567Ic() {
        return this.provided_;
    }

    /* renamed from: Ik */
    public final void mo46568Ik(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo46586Uk();
        this.allowedRequestExtensions_.add(erVar.mo35543k0());
    }

    /* renamed from: Jk */
    public final void mo46569Jk(String str) {
        str.getClass();
        mo46587Vk();
        this.allowedResponseExtensions_.add(str);
    }

    /* renamed from: K2 */
    public String mo46570K2(int i) {
        return this.provided_.get(i);
    }

    /* renamed from: Kk */
    public final void mo46571Kk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo46587Vk();
        this.allowedResponseExtensions_.add(erVar.mo35543k0());
    }

    /* renamed from: Lk */
    public final void mo46572Lk(String str) {
        str.getClass();
        mo46588Wk();
        this.provided_.add(str);
    }

    /* renamed from: M8 */
    public List<String> mo46573M8() {
        return this.requested_;
    }

    /* renamed from: Mk */
    public final void mo46574Mk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo46588Wk();
        this.provided_.add(erVar.mo35543k0());
    }

    /* renamed from: N9 */
    public int mo46575N9() {
        return this.requested_.size();
    }

    /* renamed from: Nk */
    public final void mo46576Nk(String str) {
        str.getClass();
        mo46589Xk();
        this.requested_.add(str);
    }

    /* renamed from: O6 */
    public C5173er mo46577O6(int i) {
        return C5173er.m47136w(this.requested_.get(i));
    }

    /* renamed from: Ok */
    public final void mo46578Ok(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo46589Xk();
        this.requested_.add(erVar.mo35543k0());
    }

    /* renamed from: Pk */
    public final void mo46579Pk() {
        this.allowedRequestExtensions_ = qe1.m62499pj();
    }

    /* renamed from: Qk */
    public final void mo46580Qk() {
        this.allowedResponseExtensions_ = qe1.m62499pj();
    }

    /* renamed from: Rk */
    public final void mo46581Rk() {
        this.provided_ = qe1.m62499pj();
    }

    /* renamed from: Sk */
    public final void mo46582Sk() {
        this.requested_ = qe1.m62499pj();
    }

    /* renamed from: T8 */
    public C5173er mo46583T8(int i) {
        return C5173er.m47136w(this.allowedRequestExtensions_.get(i));
    }

    /* renamed from: Tb */
    public String mo46584Tb(int i) {
        return this.requested_.get(i);
    }

    /* renamed from: Tk */
    public final void mo46585Tk() {
        this.selector_ = m69064Yk().mo46592k();
    }

    /* renamed from: Uk */
    public final void mo46586Uk() {
        vs1.C7095k<String> kVar = this.allowedRequestExtensions_;
        if (!kVar.mo36500p()) {
            this.allowedRequestExtensions_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Vk */
    public final void mo46587Vk() {
        vs1.C7095k<String> kVar = this.allowedResponseExtensions_;
        if (!kVar.mo36500p()) {
            this.allowedResponseExtensions_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Wk */
    public final void mo46588Wk() {
        vs1.C7095k<String> kVar = this.provided_;
        if (!kVar.mo36500p()) {
            this.provided_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Xk */
    public final void mo46589Xk() {
        vs1.C7095k<String> kVar = this.requested_;
        if (!kVar.mo36500p()) {
            this.requested_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: h5 */
    public C5173er mo46590h5(int i) {
        return C5173er.m47136w(this.provided_.get(i));
    }

    /* renamed from: ib */
    public int mo46591ib() {
        return this.allowedResponseExtensions_.size();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7144a.f36913a[iVar.ordinal()]) {
            case 1:
                return new w70();
            case 2:
                return new C7145b((C7144a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<w70> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (w70.class) {
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
    public String mo46592k() {
        return this.selector_;
    }

    /* renamed from: kd */
    public String mo46593kd(int i) {
        return this.allowedResponseExtensions_.get(i);
    }

    /* renamed from: l */
    public C5173er mo46594l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: ol */
    public final void mo46595ol(int i, String str) {
        str.getClass();
        mo46586Uk();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* renamed from: pl */
    public final void mo46596pl(int i, String str) {
        str.getClass();
        mo46587Vk();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* renamed from: ql */
    public final void mo46597ql(int i, String str) {
        str.getClass();
        mo46588Wk();
        this.provided_.set(i, str);
    }

    /* renamed from: rl */
    public final void mo46598rl(int i, String str) {
        str.getClass();
        mo46589Xk();
        this.requested_.set(i, str);
    }

    /* renamed from: sl */
    public final void mo46599sl(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: tl */
    public final void mo46600tl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: ve */
    public List<String> mo46601ve() {
        return this.allowedResponseExtensions_;
    }

    /* renamed from: wd */
    public List<String> mo46602wd() {
        return this.allowedRequestExtensions_;
    }

    /* renamed from: x7 */
    public int mo46603x7() {
        return this.allowedRequestExtensions_.size();
    }

    /* renamed from: xf */
    public int mo46604xf() {
        return this.provided_.size();
    }

    /* renamed from: z9 */
    public C5173er mo46605z9(int i) {
        return C5173er.m47136w(this.allowedResponseExtensions_.get(i));
    }
}
