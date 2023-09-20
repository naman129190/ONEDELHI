package com.onedelhi.secure;

import com.onedelhi.secure.dx1;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.kc */
public final class C5882kc extends qe1<C5882kc, C5884b> implements C5984lc {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final C5882kc DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile cz2<C5882kc> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private vs1.C7095k<dx1> jwtLocations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.kc$a */
    public static /* synthetic */ class C5883a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31175a;

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
                f31175a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31175a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5882kc.C5883a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.kc$b */
    public static final class C5884b extends qe1.C6546b<C5882kc, C5884b> implements C5984lc {
        public C5884b() {
            super(C5882kc.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5884b(C5883a aVar) {
            this();
        }

        /* renamed from: Cf */
        public C5173er mo39139Cf() {
            return ((C5882kc) this.f34068b).mo39139Cf();
        }

        /* renamed from: E */
        public C5173er mo39142E() {
            return ((C5882kc) this.f34068b).mo39142E();
        }

        /* renamed from: E1 */
        public String mo39143E1() {
            return ((C5882kc) this.f34068b).mo39143E1();
        }

        /* renamed from: Ed */
        public C5173er mo39144Ed() {
            return ((C5882kc) this.f34068b).mo39144Ed();
        }

        /* renamed from: Gj */
        public C5884b mo39175Gj(Iterable<? extends dx1> iterable) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39138Bk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5884b mo39176Hj(int i, dx1.C5065b bVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39140Ck(i, (dx1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C5884b mo39177Ij(int i, dx1 dx1) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39140Ck(i, dx1);
            return this;
        }

        /* renamed from: Jj */
        public C5884b mo39178Jj(dx1.C5065b bVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39141Dk((dx1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C5884b mo39179Kj(dx1 dx1) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39141Dk(dx1);
            return this;
        }

        /* renamed from: Lj */
        public C5884b mo39180Lj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39145Ek();
            return this;
        }

        /* renamed from: Mj */
        public C5884b mo39181Mj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39146Fk();
            return this;
        }

        /* renamed from: Nc */
        public String mo39153Nc() {
            return ((C5882kc) this.f34068b).mo39153Nc();
        }

        /* renamed from: Nj */
        public C5884b mo39182Nj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39147Gk();
            return this;
        }

        /* renamed from: O9 */
        public String mo39155O9() {
            return ((C5882kc) this.f34068b).mo39155O9();
        }

        /* renamed from: Oj */
        public C5884b mo39183Oj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39148Hk();
            return this;
        }

        /* renamed from: Pj */
        public C5884b mo39184Pj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39149Ik();
            return this;
        }

        /* renamed from: Qj */
        public C5884b mo39185Qj() {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39150Jk();
            return this;
        }

        /* renamed from: Rj */
        public C5884b mo39186Rj(int i) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39157dl(i);
            return this;
        }

        /* renamed from: Sj */
        public C5884b mo39187Sj(String str) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39159el(str);
            return this;
        }

        /* renamed from: Tj */
        public C5884b mo39188Tj(C5173er erVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39160fl(erVar);
            return this;
        }

        /* renamed from: Uj */
        public C5884b mo39189Uj(String str) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39162gl(str);
            return this;
        }

        /* renamed from: Vj */
        public C5884b mo39190Vj(C5173er erVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39163hl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5884b mo39191Wj(String str) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39164il(str);
            return this;
        }

        /* renamed from: Xj */
        public C5884b mo39192Xj(C5173er erVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39165jl(erVar);
            return this;
        }

        /* renamed from: Y6 */
        public int mo39156Y6() {
            return ((C5882kc) this.f34068b).mo39156Y6();
        }

        /* renamed from: Yj */
        public C5884b mo39193Yj(String str) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39166kl(str);
            return this;
        }

        /* renamed from: Zj */
        public C5884b mo39194Zj(C5173er erVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39167ll(erVar);
            return this;
        }

        /* renamed from: ak */
        public C5884b mo39195ak(String str) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39168ml(str);
            return this;
        }

        /* renamed from: bk */
        public C5884b mo39196bk(C5173er erVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39169nl(erVar);
            return this;
        }

        /* renamed from: ck */
        public C5884b mo39197ck(int i, dx1.C5065b bVar) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39170ol(i, (dx1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: dk */
        public C5884b mo39198dk(int i, dx1 dx1) {
            mo43393xj();
            ((C5882kc) this.f34068b).mo39170ol(i, dx1);
            return this;
        }

        /* renamed from: e1 */
        public C5173er mo39158e1() {
            return ((C5882kc) this.f34068b).mo39158e1();
        }

        /* renamed from: g4 */
        public dx1 mo39161g4(int i) {
            return ((C5882kc) this.f34068b).mo39161g4(i);
        }

        /* renamed from: w */
        public String mo39171w() {
            return ((C5882kc) this.f34068b).mo39171w();
        }

        /* renamed from: wc */
        public C5173er mo39172wc() {
            return ((C5882kc) this.f34068b).mo39172wc();
        }

        /* renamed from: wg */
        public List<dx1> mo39173wg() {
            return Collections.unmodifiableList(((C5882kc) this.f34068b).mo39173wg());
        }

        /* renamed from: z4 */
        public String mo39174z4() {
            return ((C5882kc) this.f34068b).mo39174z4();
        }
    }

    static {
        C5882kc kcVar = new C5882kc();
        DEFAULT_INSTANCE = kcVar;
        qe1.m62492dk(C5882kc.class, kcVar);
    }

    /* renamed from: Lk */
    public static C5882kc m54197Lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ok */
    public static C5884b m54198Ok() {
        return (C5884b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Pk */
    public static C5884b m54199Pk(C5882kc kcVar) {
        return (C5884b) DEFAULT_INSTANCE.mo43358gj(kcVar);
    }

    /* renamed from: Qk */
    public static C5882kc m54200Qk(InputStream inputStream) throws IOException {
        return (C5882kc) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Rk */
    public static C5882kc m54201Rk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5882kc) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Sk */
    public static C5882kc m54202Sk(C5173er erVar) throws nt1 {
        return (C5882kc) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Tk */
    public static C5882kc m54203Tk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5882kc) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Uk */
    public static C5882kc m54204Uk(g00 g00) throws IOException {
        return (C5882kc) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Vk */
    public static C5882kc m54205Vk(g00 g00, zy0 zy0) throws IOException {
        return (C5882kc) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Wk */
    public static C5882kc m54206Wk(InputStream inputStream) throws IOException {
        return (C5882kc) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Xk */
    public static C5882kc m54207Xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5882kc) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Yk */
    public static C5882kc m54208Yk(ByteBuffer byteBuffer) throws nt1 {
        return (C5882kc) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Zk */
    public static C5882kc m54209Zk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5882kc) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: al */
    public static C5882kc m54210al(byte[] bArr) throws nt1 {
        return (C5882kc) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: bl */
    public static C5882kc m54211bl(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5882kc) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: cl */
    public static cz2<C5882kc> m54212cl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bk */
    public final void mo39138Bk(Iterable<? extends dx1> iterable) {
        mo39151Kk();
        C7403z0.m72412X6(iterable, this.jwtLocations_);
    }

    /* renamed from: Cf */
    public C5173er mo39139Cf() {
        return C5173er.m47136w(this.authorizationUrl_);
    }

    /* renamed from: Ck */
    public final void mo39140Ck(int i, dx1 dx1) {
        dx1.getClass();
        mo39151Kk();
        this.jwtLocations_.add(i, dx1);
    }

    /* renamed from: Dk */
    public final void mo39141Dk(dx1 dx1) {
        dx1.getClass();
        mo39151Kk();
        this.jwtLocations_.add(dx1);
    }

    /* renamed from: E */
    public C5173er mo39142E() {
        return C5173er.m47136w(this.id_);
    }

    /* renamed from: E1 */
    public String mo39143E1() {
        return this.audiences_;
    }

    /* renamed from: Ed */
    public C5173er mo39144Ed() {
        return C5173er.m47136w(this.jwksUri_);
    }

    /* renamed from: Ek */
    public final void mo39145Ek() {
        this.audiences_ = m54197Lk().mo39143E1();
    }

    /* renamed from: Fk */
    public final void mo39146Fk() {
        this.authorizationUrl_ = m54197Lk().mo39174z4();
    }

    /* renamed from: Gk */
    public final void mo39147Gk() {
        this.id_ = m54197Lk().mo39171w();
    }

    /* renamed from: Hk */
    public final void mo39148Hk() {
        this.issuer_ = m54197Lk().mo39153Nc();
    }

    /* renamed from: Ik */
    public final void mo39149Ik() {
        this.jwksUri_ = m54197Lk().mo39155O9();
    }

    /* renamed from: Jk */
    public final void mo39150Jk() {
        this.jwtLocations_ = qe1.m62499pj();
    }

    /* renamed from: Kk */
    public final void mo39151Kk() {
        vs1.C7095k<dx1> kVar = this.jwtLocations_;
        if (!kVar.mo36500p()) {
            this.jwtLocations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Mk */
    public ex1 mo39152Mk(int i) {
        return this.jwtLocations_.get(i);
    }

    /* renamed from: Nc */
    public String mo39153Nc() {
        return this.issuer_;
    }

    /* renamed from: Nk */
    public List<? extends ex1> mo39154Nk() {
        return this.jwtLocations_;
    }

    /* renamed from: O9 */
    public String mo39155O9() {
        return this.jwksUri_;
    }

    /* renamed from: Y6 */
    public int mo39156Y6() {
        return this.jwtLocations_.size();
    }

    /* renamed from: dl */
    public final void mo39157dl(int i) {
        mo39151Kk();
        this.jwtLocations_.remove(i);
    }

    /* renamed from: e1 */
    public C5173er mo39158e1() {
        return C5173er.m47136w(this.audiences_);
    }

    /* renamed from: el */
    public final void mo39159el(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* renamed from: fl */
    public final void mo39160fl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.audiences_ = erVar.mo35543k0();
    }

    /* renamed from: g4 */
    public dx1 mo39161g4(int i) {
        return this.jwtLocations_.get(i);
    }

    /* renamed from: gl */
    public final void mo39162gl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* renamed from: hl */
    public final void mo39163hl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.authorizationUrl_ = erVar.mo35543k0();
    }

    /* renamed from: il */
    public final void mo39164il(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5883a.f31175a[iVar.ordinal()]) {
            case 1:
                return new C5882kc();
            case 2:
                return new C5884b((C5883a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", dx1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5882kc> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5882kc.class) {
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
    public final void mo39165jl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.id_ = erVar.mo35543k0();
    }

    /* renamed from: kl */
    public final void mo39166kl(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* renamed from: ll */
    public final void mo39167ll(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.issuer_ = erVar.mo35543k0();
    }

    /* renamed from: ml */
    public final void mo39168ml(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* renamed from: nl */
    public final void mo39169nl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.jwksUri_ = erVar.mo35543k0();
    }

    /* renamed from: ol */
    public final void mo39170ol(int i, dx1 dx1) {
        dx1.getClass();
        mo39151Kk();
        this.jwtLocations_.set(i, dx1);
    }

    /* renamed from: w */
    public String mo39171w() {
        return this.id_;
    }

    /* renamed from: wc */
    public C5173er mo39172wc() {
        return C5173er.m47136w(this.issuer_);
    }

    /* renamed from: wg */
    public List<dx1> mo39173wg() {
        return this.jwtLocations_;
    }

    /* renamed from: z4 */
    public String mo39174z4() {
        return this.authorizationUrl_;
    }
}
