package com.onedelhi.secure;

import com.onedelhi.secure.C5406gd;
import com.onedelhi.secure.C6248o7;
import com.onedelhi.secure.C7024vc;
import com.onedelhi.secure.jj3;
import com.onedelhi.secure.q34;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.z54;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.ec */
public final class C5117ec extends qe1<C5117ec, C5119b> implements C5238fc {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    /* access modifiers changed from: private */
    public static final C5117ec DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile cz2<C5117ec> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private C7024vc authenticationInfo_;
    private vs1.C7095k<C5406gd> authorizationInfo_ = qe1.m62499pj();
    private String methodName_ = "";
    private long numResponseItems_;
    private jj3 requestMetadata_;
    private z54 request_;
    private String resourceName_ = "";
    private z54 response_;
    private C6248o7 serviceData_;
    private String serviceName_ = "";
    private q34 status_;

    /* renamed from: com.onedelhi.secure.ec$a */
    public static /* synthetic */ class C5118a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27849a;

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
                f27849a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27849a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5117ec.C5118a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ec$b */
    public static final class C5119b extends qe1.C6546b<C5117ec, C5119b> implements C5238fc {
        public C5119b() {
            super(C5117ec.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5119b(C5118a aVar) {
            this();
        }

        /* renamed from: A8 */
        public C7024vc mo35014A8() {
            return ((C5117ec) this.f34068b).mo35014A8();
        }

        /* renamed from: Ah */
        public C6248o7 mo35015Ah() {
            return ((C5117ec) this.f34068b).mo35015Ah();
        }

        /* renamed from: D8 */
        public boolean mo35017D8() {
            return ((C5117ec) this.f34068b).mo35017D8();
        }

        /* renamed from: Gj */
        public C5119b mo35074Gj(Iterable<? extends C5406gd> iterable) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35035Pk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5119b mo35075Hj(int i, C5406gd.C5408b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35037Qk(i, (C5406gd) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ii */
        public String mo35023Ii() {
            return ((C5117ec) this.f34068b).mo35023Ii();
        }

        /* renamed from: Ij */
        public C5119b mo35076Ij(int i, C5406gd gdVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35037Qk(i, gdVar);
            return this;
        }

        /* renamed from: J6 */
        public jj3 mo35025J6() {
            return ((C5117ec) this.f34068b).mo35025J6();
        }

        /* renamed from: Jg */
        public int mo35026Jg() {
            return ((C5117ec) this.f34068b).mo35026Jg();
        }

        /* renamed from: Jj */
        public C5119b mo35077Jj(C5406gd.C5408b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35039Rk((C5406gd) bVar.mo43381ab());
            return this;
        }

        /* renamed from: K5 */
        public String mo35028K5() {
            return ((C5117ec) this.f34068b).mo35028K5();
        }

        /* renamed from: Kj */
        public C5119b mo35078Kj(C5406gd gdVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35039Rk(gdVar);
            return this;
        }

        /* renamed from: Lj */
        public C5119b mo35079Lj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35040Sk();
            return this;
        }

        /* renamed from: Mj */
        public C5119b mo35080Mj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35041Tk();
            return this;
        }

        /* renamed from: Nj */
        public C5119b mo35081Nj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35043Uk();
            return this;
        }

        /* renamed from: Oj */
        public C5119b mo35082Oj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35045Vk();
            return this;
        }

        /* renamed from: Pf */
        public List<C5406gd> mo35034Pf() {
            return Collections.unmodifiableList(((C5117ec) this.f34068b).mo35034Pf());
        }

        /* renamed from: Pj */
        public C5119b mo35083Pj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35046Wk();
            return this;
        }

        /* renamed from: Qj */
        public C5119b mo35084Qj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35047Xk();
            return this;
        }

        /* renamed from: Rj */
        public C5119b mo35085Rj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35049Yk();
            return this;
        }

        /* renamed from: Sj */
        public C5119b mo35086Sj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35051Zk();
            return this;
        }

        /* renamed from: Tj */
        public C5119b mo35087Tj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35054al();
            return this;
        }

        /* renamed from: U9 */
        public z54 mo35042U9() {
            return ((C5117ec) this.f34068b).mo35042U9();
        }

        /* renamed from: Uj */
        public C5119b mo35088Uj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35055bl();
            return this;
        }

        /* renamed from: V4 */
        public C5173er mo35044V4() {
            return ((C5117ec) this.f34068b).mo35044V4();
        }

        /* renamed from: Vj */
        public C5119b mo35089Vj() {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35056cl();
            return this;
        }

        /* renamed from: Wj */
        public C5119b mo35090Wj(C7024vc vcVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35061hl(vcVar);
            return this;
        }

        /* renamed from: Xj */
        public C5119b mo35091Xj(z54 z54) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35063il(z54);
            return this;
        }

        /* renamed from: Y0 */
        public String mo35048Y0() {
            return ((C5117ec) this.f34068b).mo35048Y0();
        }

        /* renamed from: Yj */
        public C5119b mo35092Yj(jj3 jj3) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35064jl(jj3);
            return this;
        }

        /* renamed from: Z */
        public boolean mo35050Z() {
            return ((C5117ec) this.f34068b).mo35050Z();
        }

        /* renamed from: Zj */
        public C5119b mo35093Zj(z54 z54) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35065kl(z54);
            return this;
        }

        /* renamed from: a1 */
        public boolean mo35052a1() {
            return ((C5117ec) this.f34068b).mo35052a1();
        }

        /* renamed from: af */
        public C5406gd mo35053af(int i) {
            return ((C5117ec) this.f34068b).mo35053af(i);
        }

        /* renamed from: ak */
        public C5119b mo35094ak(C6248o7 o7Var) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35066ll(o7Var);
            return this;
        }

        /* renamed from: bk */
        public C5119b mo35095bk(q34 q34) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35067ml(q34);
            return this;
        }

        /* renamed from: ck */
        public C5119b mo35096ck(int i) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35016Cl(i);
            return this;
        }

        /* renamed from: dk */
        public C5119b mo35097dk(C7024vc.C7026b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35018Dl((C7024vc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ek */
        public C5119b mo35098ek(C7024vc vcVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35018Dl(vcVar);
            return this;
        }

        /* renamed from: f7 */
        public z54 mo35059f7() {
            return ((C5117ec) this.f34068b).mo35059f7();
        }

        /* renamed from: fk */
        public C5119b mo35099fk(int i, C5406gd.C5408b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35019El(i, (C5406gd) bVar.mo43381ab());
            return this;
        }

        /* renamed from: gk */
        public C5119b mo35100gk(int i, C5406gd gdVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35019El(i, gdVar);
            return this;
        }

        /* renamed from: hk */
        public C5119b mo35101hk(String str) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35020Fl(str);
            return this;
        }

        /* renamed from: i9 */
        public C5173er mo35062i9() {
            return ((C5117ec) this.f34068b).mo35062i9();
        }

        /* renamed from: ik */
        public C5119b mo35102ik(C5173er erVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35021Gl(erVar);
            return this;
        }

        /* renamed from: jk */
        public C5119b mo35103jk(long j) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35022Hl(j);
            return this;
        }

        /* renamed from: kk */
        public C5119b mo35104kk(z54.C7435b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35024Il((z54) bVar.mo43381ab());
            return this;
        }

        /* renamed from: lk */
        public C5119b mo35105lk(z54 z54) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35024Il(z54);
            return this;
        }

        /* renamed from: mk */
        public C5119b mo35106mk(jj3.C5824b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35027Jl((jj3) bVar.mo43381ab());
            return this;
        }

        /* renamed from: nk */
        public C5119b mo35107nk(jj3 jj3) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35027Jl(jj3);
            return this;
        }

        /* renamed from: ok */
        public C5119b mo35108ok(String str) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35029Kl(str);
            return this;
        }

        /* renamed from: p0 */
        public C5173er mo35068p0() {
            return ((C5117ec) this.f34068b).mo35068p0();
        }

        /* renamed from: p8 */
        public boolean mo35069p8() {
            return ((C5117ec) this.f34068b).mo35069p8();
        }

        /* renamed from: pk */
        public C5119b mo35109pk(C5173er erVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35030Ll(erVar);
            return this;
        }

        /* renamed from: qk */
        public C5119b mo35110qk(z54.C7435b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35031Ml((z54) bVar.mo43381ab());
            return this;
        }

        /* renamed from: rk */
        public C5119b mo35111rk(z54 z54) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35031Ml(z54);
            return this;
        }

        /* renamed from: se */
        public q34 mo35070se() {
            return ((C5117ec) this.f34068b).mo35070se();
        }

        /* renamed from: sk */
        public C5119b mo35112sk(C6248o7.C6250b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35032Nl((C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: tk */
        public C5119b mo35113tk(C6248o7 o7Var) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35032Nl(o7Var);
            return this;
        }

        /* renamed from: uh */
        public boolean mo35071uh() {
            return ((C5117ec) this.f34068b).mo35071uh();
        }

        /* renamed from: uk */
        public C5119b mo35114uk(String str) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35033Ol(str);
            return this;
        }

        /* renamed from: vd */
        public boolean mo35072vd() {
            return ((C5117ec) this.f34068b).mo35072vd();
        }

        /* renamed from: vk */
        public C5119b mo35115vk(C5173er erVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35036Pl(erVar);
            return this;
        }

        /* renamed from: wk */
        public C5119b mo35116wk(q34.C6504b bVar) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35038Ql((q34) bVar.mo43381ab());
            return this;
        }

        /* renamed from: x4 */
        public long mo35073x4() {
            return ((C5117ec) this.f34068b).mo35073x4();
        }

        /* renamed from: xk */
        public C5119b mo35117xk(q34 q34) {
            mo43393xj();
            ((C5117ec) this.f34068b).mo35038Ql(q34);
            return this;
        }
    }

    static {
        C5117ec ecVar = new C5117ec();
        DEFAULT_INSTANCE = ecVar;
        qe1.m62492dk(C5117ec.class, ecVar);
    }

    /* renamed from: Al */
    public static C5117ec m46263Al(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5117ec) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bl */
    public static cz2<C5117ec> m46265Bl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: gl */
    public static C5117ec m46281gl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: nl */
    public static C5119b m46289nl() {
        return (C5119b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ol */
    public static C5119b m46291ol(C5117ec ecVar) {
        return (C5119b) DEFAULT_INSTANCE.mo43358gj(ecVar);
    }

    /* renamed from: pl */
    public static C5117ec m46293pl(InputStream inputStream) throws IOException {
        return (C5117ec) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ql */
    public static C5117ec m46295ql(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5117ec) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: rl */
    public static C5117ec m46297rl(C5173er erVar) throws nt1 {
        return (C5117ec) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: sl */
    public static C5117ec m46299sl(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5117ec) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: tl */
    public static C5117ec m46301tl(g00 g00) throws IOException {
        return (C5117ec) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ul */
    public static C5117ec m46303ul(g00 g00, zy0 zy0) throws IOException {
        return (C5117ec) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: vl */
    public static C5117ec m46305vl(InputStream inputStream) throws IOException {
        return (C5117ec) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wl */
    public static C5117ec m46307wl(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5117ec) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xl */
    public static C5117ec m46309xl(ByteBuffer byteBuffer) throws nt1 {
        return (C5117ec) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: yl */
    public static C5117ec m46311yl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5117ec) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: zl */
    public static C5117ec m46313zl(byte[] bArr) throws nt1 {
        return (C5117ec) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: A8 */
    public C7024vc mo35014A8() {
        C7024vc vcVar = this.authenticationInfo_;
        return vcVar == null ? C7024vc.m67850kk() : vcVar;
    }

    /* renamed from: Ah */
    public C6248o7 mo35015Ah() {
        C6248o7 o7Var = this.serviceData_;
        return o7Var == null ? C6248o7.m59006nk() : o7Var;
    }

    /* renamed from: Cl */
    public final void mo35016Cl(int i) {
        mo35057dl();
        this.authorizationInfo_.remove(i);
    }

    /* renamed from: D8 */
    public boolean mo35017D8() {
        return this.serviceData_ != null;
    }

    /* renamed from: Dl */
    public final void mo35018Dl(C7024vc vcVar) {
        vcVar.getClass();
        this.authenticationInfo_ = vcVar;
    }

    /* renamed from: El */
    public final void mo35019El(int i, C5406gd gdVar) {
        gdVar.getClass();
        mo35057dl();
        this.authorizationInfo_.set(i, gdVar);
    }

    /* renamed from: Fl */
    public final void mo35020Fl(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    /* renamed from: Gl */
    public final void mo35021Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.methodName_ = erVar.mo35543k0();
    }

    /* renamed from: Hl */
    public final void mo35022Hl(long j) {
        this.numResponseItems_ = j;
    }

    /* renamed from: Ii */
    public String mo35023Ii() {
        return this.methodName_;
    }

    /* renamed from: Il */
    public final void mo35024Il(z54 z54) {
        z54.getClass();
        this.request_ = z54;
    }

    /* renamed from: J6 */
    public jj3 mo35025J6() {
        jj3 jj3 = this.requestMetadata_;
        return jj3 == null ? jj3.m53420ok() : jj3;
    }

    /* renamed from: Jg */
    public int mo35026Jg() {
        return this.authorizationInfo_.size();
    }

    /* renamed from: Jl */
    public final void mo35027Jl(jj3 jj3) {
        jj3.getClass();
        this.requestMetadata_ = jj3;
    }

    /* renamed from: K5 */
    public String mo35028K5() {
        return this.serviceName_;
    }

    /* renamed from: Kl */
    public final void mo35029Kl(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* renamed from: Ll */
    public final void mo35030Ll(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.resourceName_ = erVar.mo35543k0();
    }

    /* renamed from: Ml */
    public final void mo35031Ml(z54 z54) {
        z54.getClass();
        this.response_ = z54;
    }

    /* renamed from: Nl */
    public final void mo35032Nl(C6248o7 o7Var) {
        o7Var.getClass();
        this.serviceData_ = o7Var;
    }

    /* renamed from: Ol */
    public final void mo35033Ol(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* renamed from: Pf */
    public List<C5406gd> mo35034Pf() {
        return this.authorizationInfo_;
    }

    /* renamed from: Pk */
    public final void mo35035Pk(Iterable<? extends C5406gd> iterable) {
        mo35057dl();
        C7403z0.m72412X6(iterable, this.authorizationInfo_);
    }

    /* renamed from: Pl */
    public final void mo35036Pl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.serviceName_ = erVar.mo35543k0();
    }

    /* renamed from: Qk */
    public final void mo35037Qk(int i, C5406gd gdVar) {
        gdVar.getClass();
        mo35057dl();
        this.authorizationInfo_.add(i, gdVar);
    }

    /* renamed from: Ql */
    public final void mo35038Ql(q34 q34) {
        q34.getClass();
        this.status_ = q34;
    }

    /* renamed from: Rk */
    public final void mo35039Rk(C5406gd gdVar) {
        gdVar.getClass();
        mo35057dl();
        this.authorizationInfo_.add(gdVar);
    }

    /* renamed from: Sk */
    public final void mo35040Sk() {
        this.authenticationInfo_ = null;
    }

    /* renamed from: Tk */
    public final void mo35041Tk() {
        this.authorizationInfo_ = qe1.m62499pj();
    }

    /* renamed from: U9 */
    public z54 mo35042U9() {
        z54 z54 = this.response_;
        return z54 == null ? z54.m72555hk() : z54;
    }

    /* renamed from: Uk */
    public final void mo35043Uk() {
        this.methodName_ = m46281gl().mo35023Ii();
    }

    /* renamed from: V4 */
    public C5173er mo35044V4() {
        return C5173er.m47136w(this.serviceName_);
    }

    /* renamed from: Vk */
    public final void mo35045Vk() {
        this.numResponseItems_ = 0;
    }

    /* renamed from: Wk */
    public final void mo35046Wk() {
        this.request_ = null;
    }

    /* renamed from: Xk */
    public final void mo35047Xk() {
        this.requestMetadata_ = null;
    }

    /* renamed from: Y0 */
    public String mo35048Y0() {
        return this.resourceName_;
    }

    /* renamed from: Yk */
    public final void mo35049Yk() {
        this.resourceName_ = m46281gl().mo35048Y0();
    }

    /* renamed from: Z */
    public boolean mo35050Z() {
        return this.response_ != null;
    }

    /* renamed from: Zk */
    public final void mo35051Zk() {
        this.response_ = null;
    }

    /* renamed from: a1 */
    public boolean mo35052a1() {
        return this.request_ != null;
    }

    /* renamed from: af */
    public C5406gd mo35053af(int i) {
        return this.authorizationInfo_.get(i);
    }

    /* renamed from: al */
    public final void mo35054al() {
        this.serviceData_ = null;
    }

    /* renamed from: bl */
    public final void mo35055bl() {
        this.serviceName_ = m46281gl().mo35028K5();
    }

    /* renamed from: cl */
    public final void mo35056cl() {
        this.status_ = null;
    }

    /* renamed from: dl */
    public final void mo35057dl() {
        vs1.C7095k<C5406gd> kVar = this.authorizationInfo_;
        if (!kVar.mo36500p()) {
            this.authorizationInfo_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: el */
    public C5502hd mo35058el(int i) {
        return this.authorizationInfo_.get(i);
    }

    /* renamed from: f7 */
    public z54 mo35059f7() {
        z54 z54 = this.request_;
        return z54 == null ? z54.m72555hk() : z54;
    }

    /* renamed from: fl */
    public List<? extends C5502hd> mo35060fl() {
        return this.authorizationInfo_;
    }

    /* renamed from: hl */
    public final void mo35061hl(C7024vc vcVar) {
        vcVar.getClass();
        C7024vc vcVar2 = this.authenticationInfo_;
        if (!(vcVar2 == null || vcVar2 == C7024vc.m67850kk())) {
            vcVar = (C7024vc) ((C7024vc.C7026b) C7024vc.m67852mk(this.authenticationInfo_).mo43372Cj(vcVar)).mo43377Ja();
        }
        this.authenticationInfo_ = vcVar;
    }

    /* renamed from: i9 */
    public C5173er mo35062i9() {
        return C5173er.m47136w(this.methodName_);
    }

    /* renamed from: il */
    public final void mo35063il(z54 z54) {
        z54.getClass();
        z54 z542 = this.request_;
        if (!(z542 == null || z542 == z54.m72555hk())) {
            z54 = (z54) ((z54.C7435b) z54.m72557mk(this.request_).mo43372Cj(z54)).mo43377Ja();
        }
        this.request_ = z54;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5118a.f27849a[iVar.ordinal()]) {
            case 1:
                return new C5117ec();
            case 2:
                return new C5119b((C5118a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", C5406gd.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5117ec> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5117ec.class) {
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
    public final void mo35064jl(jj3 jj3) {
        jj3.getClass();
        jj3 jj32 = this.requestMetadata_;
        if (!(jj32 == null || jj32 == jj3.m53420ok())) {
            jj3 = (jj3) ((jj3.C5824b) jj3.m53422qk(this.requestMetadata_).mo43372Cj(jj3)).mo43377Ja();
        }
        this.requestMetadata_ = jj3;
    }

    /* renamed from: kl */
    public final void mo35065kl(z54 z54) {
        z54.getClass();
        z54 z542 = this.response_;
        if (!(z542 == null || z542 == z54.m72555hk())) {
            z54 = (z54) ((z54.C7435b) z54.m72557mk(this.response_).mo43372Cj(z54)).mo43377Ja();
        }
        this.response_ = z54;
    }

    /* renamed from: ll */
    public final void mo35066ll(C6248o7 o7Var) {
        o7Var.getClass();
        C6248o7 o7Var2 = this.serviceData_;
        if (!(o7Var2 == null || o7Var2 == C6248o7.m59006nk())) {
            o7Var = (C6248o7) ((C6248o7.C6250b) C6248o7.m59008pk(this.serviceData_).mo43372Cj(o7Var)).mo43377Ja();
        }
        this.serviceData_ = o7Var;
    }

    /* renamed from: ml */
    public final void mo35067ml(q34 q34) {
        q34.getClass();
        q34 q342 = this.status_;
        if (!(q342 == null || q342 == q34.m62048yk())) {
            q34 = (q34) ((q34.C6504b) q34.m62022Ck(this.status_).mo43372Cj(q34)).mo43377Ja();
        }
        this.status_ = q34;
    }

    /* renamed from: p0 */
    public C5173er mo35068p0() {
        return C5173er.m47136w(this.resourceName_);
    }

    /* renamed from: p8 */
    public boolean mo35069p8() {
        return this.status_ != null;
    }

    /* renamed from: se */
    public q34 mo35070se() {
        q34 q34 = this.status_;
        return q34 == null ? q34.m62048yk() : q34;
    }

    /* renamed from: uh */
    public boolean mo35071uh() {
        return this.authenticationInfo_ != null;
    }

    /* renamed from: vd */
    public boolean mo35072vd() {
        return this.requestMetadata_ != null;
    }

    /* renamed from: x4 */
    public long mo35073x4() {
        return this.numResponseItems_;
    }
}
