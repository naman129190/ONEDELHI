package com.onedelhi.secure;

import com.onedelhi.secure.eq0;
import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class um1 extends qe1<um1, C6974b> implements wm1 {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final um1 DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile cz2<um1> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private eq0 latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    /* renamed from: com.onedelhi.secure.um1$a */
    public static /* synthetic */ class C6973a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36188a;

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
                f36188a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36188a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.um1.C6973a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.um1$b */
    public static final class C6974b extends qe1.C6546b<um1, C6974b> implements wm1 {
        public C6974b() {
            super(um1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6974b(C6973a aVar) {
            this();
        }

        /* renamed from: A6 */
        public C5173er mo45673A6() {
            return ((um1) this.f34068b).mo45673A6();
        }

        /* renamed from: Bd */
        public boolean mo45675Bd() {
            return ((um1) this.f34068b).mo45675Bd();
        }

        /* renamed from: E4 */
        public C5173er mo45679E4() {
            return ((um1) this.f34068b).mo45679E4();
        }

        /* renamed from: F */
        public String mo45681F() {
            return ((um1) this.f34068b).mo45681F();
        }

        /* renamed from: Ga */
        public C5173er mo45683Ga() {
            return ((um1) this.f34068b).mo45683Ga();
        }

        /* renamed from: Gc */
        public String mo45684Gc() {
            return ((um1) this.f34068b).mo45684Gc();
        }

        /* renamed from: Gj */
        public C6974b mo45734Gj() {
            mo43393xj();
            ((um1) this.f34068b).mo45700Sk();
            return this;
        }

        /* renamed from: Hj */
        public C6974b mo45735Hj() {
            mo43393xj();
            ((um1) this.f34068b).mo45702Tk();
            return this;
        }

        /* renamed from: Ij */
        public C6974b mo45736Ij() {
            mo43393xj();
            ((um1) this.f34068b).mo45704Uk();
            return this;
        }

        /* renamed from: Jj */
        public C6974b mo45737Jj() {
            mo43393xj();
            ((um1) this.f34068b).mo45705Vk();
            return this;
        }

        /* renamed from: Kj */
        public C6974b mo45738Kj() {
            mo43393xj();
            ((um1) this.f34068b).mo45707Wk();
            return this;
        }

        /* renamed from: Lh */
        public boolean mo45690Lh() {
            return ((um1) this.f34068b).mo45690Lh();
        }

        /* renamed from: Lj */
        public C6974b mo45739Lj() {
            mo43393xj();
            ((um1) this.f34068b).mo45708Xk();
            return this;
        }

        /* renamed from: Mj */
        public C6974b mo45740Mj() {
            mo43393xj();
            ((um1) this.f34068b).mo45709Yk();
            return this;
        }

        /* renamed from: Nj */
        public C6974b mo45741Nj() {
            mo43393xj();
            ((um1) this.f34068b).mo45712Zk();
            return this;
        }

        /* renamed from: Oj */
        public C6974b mo45742Oj() {
            mo43393xj();
            ((um1) this.f34068b).mo45713al();
            return this;
        }

        /* renamed from: P2 */
        public long mo45695P2() {
            return ((um1) this.f34068b).mo45695P2();
        }

        /* renamed from: Pj */
        public C6974b mo45743Pj() {
            mo43393xj();
            ((um1) this.f34068b).mo45715bl();
            return this;
        }

        /* renamed from: Qj */
        public C6974b mo45744Qj() {
            mo43393xj();
            ((um1) this.f34068b).mo45716cl();
            return this;
        }

        /* renamed from: Rj */
        public C6974b mo45745Rj() {
            mo43393xj();
            ((um1) this.f34068b).mo45717dl();
            return this;
        }

        /* renamed from: S3 */
        public String mo45699S3() {
            return ((um1) this.f34068b).mo45699S3();
        }

        /* renamed from: Sj */
        public C6974b mo45746Sj() {
            mo43393xj();
            ((um1) this.f34068b).mo45719el();
            return this;
        }

        /* renamed from: Tj */
        public C6974b mo45747Tj() {
            mo43393xj();
            ((um1) this.f34068b).mo45721fl();
            return this;
        }

        /* renamed from: Uj */
        public C6974b mo45748Uj() {
            mo43393xj();
            ((um1) this.f34068b).mo45722gl();
            return this;
        }

        /* renamed from: Vj */
        public C6974b mo45749Vj(eq0 eq0) {
            mo43393xj();
            ((um1) this.f34068b).mo45724il(eq0);
            return this;
        }

        /* renamed from: Wh */
        public eq0 mo45706Wh() {
            return ((um1) this.f34068b).mo45706Wh();
        }

        /* renamed from: Wj */
        public C6974b mo45750Wj(long j) {
            mo43393xj();
            ((um1) this.f34068b).mo45732yl(j);
            return this;
        }

        /* renamed from: Xj */
        public C6974b mo45751Xj(boolean z) {
            mo43393xj();
            ((um1) this.f34068b).mo45733zl(z);
            return this;
        }

        /* renamed from: Yj */
        public C6974b mo45752Yj(boolean z) {
            mo43393xj();
            ((um1) this.f34068b).mo45674Al(z);
            return this;
        }

        /* renamed from: Z3 */
        public String mo45710Z3() {
            return ((um1) this.f34068b).mo45710Z3();
        }

        /* renamed from: Z8 */
        public boolean mo45711Z8() {
            return ((um1) this.f34068b).mo45711Z8();
        }

        /* renamed from: Zj */
        public C6974b mo45753Zj(boolean z) {
            mo43393xj();
            ((um1) this.f34068b).mo45676Bl(z);
            return this;
        }

        /* renamed from: ak */
        public C6974b mo45754ak(eq0.C5172b bVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45677Cl((eq0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: b1 */
        public String mo45714b1() {
            return ((um1) this.f34068b).mo45714b1();
        }

        /* renamed from: bk */
        public C6974b mo45755bk(eq0 eq0) {
            mo43393xj();
            ((um1) this.f34068b).mo45677Cl(eq0);
            return this;
        }

        /* renamed from: ck */
        public C6974b mo45756ck(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45678Dl(str);
            return this;
        }

        /* renamed from: dk */
        public C6974b mo45757dk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45680El(erVar);
            return this;
        }

        /* renamed from: e9 */
        public String mo45718e9() {
            return ((um1) this.f34068b).mo45718e9();
        }

        /* renamed from: ek */
        public C6974b mo45758ek(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45682Fl(str);
            return this;
        }

        /* renamed from: ff */
        public long mo45720ff() {
            return ((um1) this.f34068b).mo45720ff();
        }

        /* renamed from: fk */
        public C6974b mo45759fk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45685Gl(erVar);
            return this;
        }

        /* renamed from: gk */
        public C6974b mo45760gk(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45686Hl(str);
            return this;
        }

        /* renamed from: hk */
        public C6974b mo45761hk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45687Il(erVar);
            return this;
        }

        /* renamed from: i2 */
        public boolean mo45723i2() {
            return ((um1) this.f34068b).mo45723i2();
        }

        /* renamed from: ik */
        public C6974b mo45762ik(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45688Jl(str);
            return this;
        }

        /* renamed from: jk */
        public C6974b mo45763jk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45689Kl(erVar);
            return this;
        }

        /* renamed from: k5 */
        public C5173er mo45725k5() {
            return ((um1) this.f34068b).mo45725k5();
        }

        /* renamed from: kk */
        public C6974b mo45764kk(long j) {
            mo43393xj();
            ((um1) this.f34068b).mo45691Ll(j);
            return this;
        }

        /* renamed from: l6 */
        public C5173er mo45726l6() {
            return ((um1) this.f34068b).mo45726l6();
        }

        /* renamed from: lk */
        public C6974b mo45765lk(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45692Ml(str);
            return this;
        }

        /* renamed from: mk */
        public C6974b mo45766mk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45693Nl(erVar);
            return this;
        }

        /* renamed from: n4 */
        public C5173er mo45727n4() {
            return ((um1) this.f34068b).mo45727n4();
        }

        /* renamed from: nk */
        public C6974b mo45767nk(long j) {
            mo43393xj();
            ((um1) this.f34068b).mo45694Ol(j);
            return this;
        }

        /* renamed from: o1 */
        public int mo45728o1() {
            return ((um1) this.f34068b).mo45728o1();
        }

        /* renamed from: oc */
        public long mo45729oc() {
            return ((um1) this.f34068b).mo45729oc();
        }

        /* renamed from: ok */
        public C6974b mo45768ok(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45696Pl(str);
            return this;
        }

        /* renamed from: p7 */
        public String mo45730p7() {
            return ((um1) this.f34068b).mo45730p7();
        }

        /* renamed from: pk */
        public C6974b mo45769pk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45697Ql(erVar);
            return this;
        }

        /* renamed from: qk */
        public C6974b mo45770qk(int i) {
            mo43393xj();
            ((um1) this.f34068b).mo45698Rl(i);
            return this;
        }

        /* renamed from: rk */
        public C6974b mo45771rk(String str) {
            mo43393xj();
            ((um1) this.f34068b).mo45701Sl(str);
            return this;
        }

        /* renamed from: sk */
        public C6974b mo45772sk(C5173er erVar) {
            mo43393xj();
            ((um1) this.f34068b).mo45703Tl(erVar);
            return this;
        }

        /* renamed from: x */
        public C5173er mo45731x() {
            return ((um1) this.f34068b).mo45731x();
        }
    }

    static {
        um1 um1 = new um1();
        DEFAULT_INSTANCE = um1;
        qe1.m62492dk(um1.class, um1);
    }

    /* renamed from: hl */
    public static um1 m67158hl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: jl */
    public static C6974b m67161jl() {
        return (C6974b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: kl */
    public static C6974b m67163kl(um1 um1) {
        return (C6974b) DEFAULT_INSTANCE.mo43358gj(um1);
    }

    /* renamed from: ll */
    public static um1 m67165ll(InputStream inputStream) throws IOException {
        return (um1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ml */
    public static um1 m67167ml(InputStream inputStream, zy0 zy0) throws IOException {
        return (um1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: nl */
    public static um1 m67169nl(C5173er erVar) throws nt1 {
        return (um1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: ol */
    public static um1 m67171ol(C5173er erVar, zy0 zy0) throws nt1 {
        return (um1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: pl */
    public static um1 m67173pl(g00 g00) throws IOException {
        return (um1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ql */
    public static um1 m67175ql(g00 g00, zy0 zy0) throws IOException {
        return (um1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: rl */
    public static um1 m67177rl(InputStream inputStream) throws IOException {
        return (um1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sl */
    public static um1 m67179sl(InputStream inputStream, zy0 zy0) throws IOException {
        return (um1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tl */
    public static um1 m67181tl(ByteBuffer byteBuffer) throws nt1 {
        return (um1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: ul */
    public static um1 m67183ul(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (um1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: vl */
    public static um1 m67185vl(byte[] bArr) throws nt1 {
        return (um1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: wl */
    public static um1 m67187wl(byte[] bArr, zy0 zy0) throws nt1 {
        return (um1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: xl */
    public static cz2<um1> m67189xl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A6 */
    public C5173er mo45673A6() {
        return C5173er.m47136w(this.referer_);
    }

    /* renamed from: Al */
    public final void mo45674Al(boolean z) {
        this.cacheLookup_ = z;
    }

    /* renamed from: Bd */
    public boolean mo45675Bd() {
        return this.latency_ != null;
    }

    /* renamed from: Bl */
    public final void mo45676Bl(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    /* renamed from: Cl */
    public final void mo45677Cl(eq0 eq0) {
        eq0.getClass();
        this.latency_ = eq0;
    }

    /* renamed from: Dl */
    public final void mo45678Dl(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* renamed from: E4 */
    public C5173er mo45679E4() {
        return C5173er.m47136w(this.requestMethod_);
    }

    /* renamed from: El */
    public final void mo45680El(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.protocol_ = erVar.mo35543k0();
    }

    /* renamed from: F */
    public String mo45681F() {
        return this.protocol_;
    }

    /* renamed from: Fl */
    public final void mo45682Fl(String str) {
        str.getClass();
        this.referer_ = str;
    }

    /* renamed from: Ga */
    public C5173er mo45683Ga() {
        return C5173er.m47136w(this.serverIp_);
    }

    /* renamed from: Gc */
    public String mo45684Gc() {
        return this.requestMethod_;
    }

    /* renamed from: Gl */
    public final void mo45685Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.referer_ = erVar.mo35543k0();
    }

    /* renamed from: Hl */
    public final void mo45686Hl(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* renamed from: Il */
    public final void mo45687Il(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.remoteIp_ = erVar.mo35543k0();
    }

    /* renamed from: Jl */
    public final void mo45688Jl(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    /* renamed from: Kl */
    public final void mo45689Kl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.requestMethod_ = erVar.mo35543k0();
    }

    /* renamed from: Lh */
    public boolean mo45690Lh() {
        return this.cacheHit_;
    }

    /* renamed from: Ll */
    public final void mo45691Ll(long j) {
        this.requestSize_ = j;
    }

    /* renamed from: Ml */
    public final void mo45692Ml(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    /* renamed from: Nl */
    public final void mo45693Nl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.requestUrl_ = erVar.mo35543k0();
    }

    /* renamed from: Ol */
    public final void mo45694Ol(long j) {
        this.responseSize_ = j;
    }

    /* renamed from: P2 */
    public long mo45695P2() {
        return this.requestSize_;
    }

    /* renamed from: Pl */
    public final void mo45696Pl(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    /* renamed from: Ql */
    public final void mo45697Ql(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.serverIp_ = erVar.mo35543k0();
    }

    /* renamed from: Rl */
    public final void mo45698Rl(int i) {
        this.status_ = i;
    }

    /* renamed from: S3 */
    public String mo45699S3() {
        return this.requestUrl_;
    }

    /* renamed from: Sk */
    public final void mo45700Sk() {
        this.cacheFillBytes_ = 0;
    }

    /* renamed from: Sl */
    public final void mo45701Sl(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* renamed from: Tk */
    public final void mo45702Tk() {
        this.cacheHit_ = false;
    }

    /* renamed from: Tl */
    public final void mo45703Tl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.userAgent_ = erVar.mo35543k0();
    }

    /* renamed from: Uk */
    public final void mo45704Uk() {
        this.cacheLookup_ = false;
    }

    /* renamed from: Vk */
    public final void mo45705Vk() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    /* renamed from: Wh */
    public eq0 mo45706Wh() {
        eq0 eq0 = this.latency_;
        return eq0 == null ? eq0.m47083mk() : eq0;
    }

    /* renamed from: Wk */
    public final void mo45707Wk() {
        this.latency_ = null;
    }

    /* renamed from: Xk */
    public final void mo45708Xk() {
        this.protocol_ = m67158hl().mo45681F();
    }

    /* renamed from: Yk */
    public final void mo45709Yk() {
        this.referer_ = m67158hl().mo45730p7();
    }

    /* renamed from: Z3 */
    public String mo45710Z3() {
        return this.serverIp_;
    }

    /* renamed from: Z8 */
    public boolean mo45711Z8() {
        return this.cacheValidatedWithOriginServer_;
    }

    /* renamed from: Zk */
    public final void mo45712Zk() {
        this.remoteIp_ = m67158hl().mo45718e9();
    }

    /* renamed from: al */
    public final void mo45713al() {
        this.requestMethod_ = m67158hl().mo45684Gc();
    }

    /* renamed from: b1 */
    public String mo45714b1() {
        return this.userAgent_;
    }

    /* renamed from: bl */
    public final void mo45715bl() {
        this.requestSize_ = 0;
    }

    /* renamed from: cl */
    public final void mo45716cl() {
        this.requestUrl_ = m67158hl().mo45699S3();
    }

    /* renamed from: dl */
    public final void mo45717dl() {
        this.responseSize_ = 0;
    }

    /* renamed from: e9 */
    public String mo45718e9() {
        return this.remoteIp_;
    }

    /* renamed from: el */
    public final void mo45719el() {
        this.serverIp_ = m67158hl().mo45710Z3();
    }

    /* renamed from: ff */
    public long mo45720ff() {
        return this.cacheFillBytes_;
    }

    /* renamed from: fl */
    public final void mo45721fl() {
        this.status_ = 0;
    }

    /* renamed from: gl */
    public final void mo45722gl() {
        this.userAgent_ = m67158hl().mo45714b1();
    }

    /* renamed from: i2 */
    public boolean mo45723i2() {
        return this.cacheLookup_;
    }

    /* renamed from: il */
    public final void mo45724il(eq0 eq0) {
        eq0.getClass();
        eq0 eq02 = this.latency_;
        if (!(eq02 == null || eq02 == eq0.m47083mk())) {
            eq0 = (eq0) ((eq0.C5172b) eq0.m47085ok(this.latency_).mo43372Cj(eq0)).mo43377Ja();
        }
        this.latency_ = eq0;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6973a.f36188a[iVar.ordinal()]) {
            case 1:
                return new um1();
            case 2:
                return new C6974b((C6973a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<um1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (um1.class) {
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

    /* renamed from: k5 */
    public C5173er mo45725k5() {
        return C5173er.m47136w(this.requestUrl_);
    }

    /* renamed from: l6 */
    public C5173er mo45726l6() {
        return C5173er.m47136w(this.userAgent_);
    }

    /* renamed from: n4 */
    public C5173er mo45727n4() {
        return C5173er.m47136w(this.remoteIp_);
    }

    /* renamed from: o1 */
    public int mo45728o1() {
        return this.status_;
    }

    /* renamed from: oc */
    public long mo45729oc() {
        return this.responseSize_;
    }

    /* renamed from: p7 */
    public String mo45730p7() {
        return this.referer_;
    }

    /* renamed from: x */
    public C5173er mo45731x() {
        return C5173er.m47136w(this.protocol_);
    }

    /* renamed from: yl */
    public final void mo45732yl(long j) {
        this.cacheFillBytes_ = j;
    }

    /* renamed from: zl */
    public final void mo45733zl(boolean z) {
        this.cacheHit_ = z;
    }
}
