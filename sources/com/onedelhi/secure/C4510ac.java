package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.se4;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import com.onedelhi.secure.z54;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.ac */
public final class C4510ac extends qe1<C4510ac, C4518f> implements C4663bc {
    public static final int API_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C4510ac DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile cz2<C4510ac> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private C4512b api_;
    private C4519g destination_;
    private C4519g origin_;
    private C4523i request_;
    private C4527k resource_;
    private C4531m response_;
    private C4519g source_;

    /* renamed from: com.onedelhi.secure.ac$a */
    public static /* synthetic */ class C4511a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25809a;

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
                f25809a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25809a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4510ac.C4511a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ac$b */
    public static final class C4512b extends qe1<C4512b, C4513a> implements C4514c {
        /* access modifiers changed from: private */
        public static final C4512b DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile cz2<C4512b> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_ = "";
        private String protocol_ = "";
        private String service_ = "";
        private String version_ = "";

        /* renamed from: com.onedelhi.secure.ac$b$a */
        public static final class C4513a extends qe1.C6546b<C4512b, C4513a> implements C4514c {
            public C4513a() {
                super(C4512b.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4513a(C4511a aVar) {
                this();
            }

            /* renamed from: F */
            public String mo30555F() {
                return ((C4512b) this.f34068b).mo30555F();
            }

            /* renamed from: F4 */
            public String mo30556F4() {
                return ((C4512b) this.f34068b).mo30556F4();
            }

            /* renamed from: Gj */
            public C4513a mo30575Gj() {
                mo43393xj();
                ((C4512b) this.f34068b).mo30570sk();
                return this;
            }

            /* renamed from: Hj */
            public C4513a mo30576Hj() {
                mo43393xj();
                ((C4512b) this.f34068b).mo30571tk();
                return this;
            }

            /* renamed from: Ij */
            public C4513a mo30577Ij() {
                mo43393xj();
                ((C4512b) this.f34068b).mo30572uk();
                return this;
            }

            /* renamed from: Jj */
            public C4513a mo30578Jj() {
                mo43393xj();
                ((C4512b) this.f34068b).mo30573vk();
                return this;
            }

            /* renamed from: Kj */
            public C4513a mo30579Kj(String str) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30557Mk(str);
                return this;
            }

            /* renamed from: Lj */
            public C4513a mo30580Lj(C5173er erVar) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30558Nk(erVar);
                return this;
            }

            /* renamed from: Mj */
            public C4513a mo30581Mj(String str) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30559Ok(str);
                return this;
            }

            /* renamed from: Nj */
            public C4513a mo30582Nj(C5173er erVar) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30560Pk(erVar);
                return this;
            }

            /* renamed from: Oj */
            public C4513a mo30583Oj(String str) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30561Qk(str);
                return this;
            }

            /* renamed from: Pj */
            public C4513a mo30584Pj(C5173er erVar) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30562Rk(erVar);
                return this;
            }

            /* renamed from: Qj */
            public C4513a mo30585Qj(String str) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30564Sk(str);
                return this;
            }

            /* renamed from: Rj */
            public C4513a mo30586Rj(C5173er erVar) {
                mo43393xj();
                ((C4512b) this.f34068b).mo30565Tk(erVar);
                return this;
            }

            /* renamed from: S0 */
            public String mo30563S0() {
                return ((C4512b) this.f34068b).mo30563S0();
            }

            /* renamed from: V */
            public C5173er mo30566V() {
                return ((C4512b) this.f34068b).mo30566V();
            }

            /* renamed from: i0 */
            public String mo30567i0() {
                return ((C4512b) this.f34068b).mo30567i0();
            }

            /* renamed from: i1 */
            public C5173er mo30568i1() {
                return ((C4512b) this.f34068b).mo30568i1();
            }

            /* renamed from: jb */
            public C5173er mo30569jb() {
                return ((C4512b) this.f34068b).mo30569jb();
            }

            /* renamed from: x */
            public C5173er mo30574x() {
                return ((C4512b) this.f34068b).mo30574x();
            }
        }

        static {
            C4512b bVar = new C4512b();
            DEFAULT_INSTANCE = bVar;
            qe1.m62492dk(C4512b.class, bVar);
        }

        /* renamed from: Ak */
        public static C4512b m37862Ak(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4512b) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Bk */
        public static C4512b m37863Bk(C5173er erVar) throws nt1 {
            return (C4512b) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Ck */
        public static C4512b m37864Ck(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4512b) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Dk */
        public static C4512b m37865Dk(g00 g00) throws IOException {
            return (C4512b) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ek */
        public static C4512b m37866Ek(g00 g00, zy0 zy0) throws IOException {
            return (C4512b) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Fk */
        public static C4512b m37867Fk(InputStream inputStream) throws IOException {
            return (C4512b) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Gk */
        public static C4512b m37868Gk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4512b) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Hk */
        public static C4512b m37869Hk(ByteBuffer byteBuffer) throws nt1 {
            return (C4512b) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Ik */
        public static C4512b m37870Ik(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4512b) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Jk */
        public static C4512b m37871Jk(byte[] bArr) throws nt1 {
            return (C4512b) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Kk */
        public static C4512b m37872Kk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4512b) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Lk */
        public static cz2<C4512b> m37873Lk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: wk */
        public static C4512b m37887wk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: xk */
        public static C4513a m37888xk() {
            return (C4513a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: yk */
        public static C4513a m37889yk(C4512b bVar) {
            return (C4513a) DEFAULT_INSTANCE.mo43358gj(bVar);
        }

        /* renamed from: zk */
        public static C4512b m37890zk(InputStream inputStream) throws IOException {
            return (C4512b) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: F */
        public String mo30555F() {
            return this.protocol_;
        }

        /* renamed from: F4 */
        public String mo30556F4() {
            return this.operation_;
        }

        /* renamed from: Mk */
        public final void mo30557Mk(String str) {
            str.getClass();
            this.operation_ = str;
        }

        /* renamed from: Nk */
        public final void mo30558Nk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.operation_ = erVar.mo35543k0();
        }

        /* renamed from: Ok */
        public final void mo30559Ok(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* renamed from: Pk */
        public final void mo30560Pk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.protocol_ = erVar.mo35543k0();
        }

        /* renamed from: Qk */
        public final void mo30561Qk(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* renamed from: Rk */
        public final void mo30562Rk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.service_ = erVar.mo35543k0();
        }

        /* renamed from: S0 */
        public String mo30563S0() {
            return this.service_;
        }

        /* renamed from: Sk */
        public final void mo30564Sk(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* renamed from: Tk */
        public final void mo30565Tk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.version_ = erVar.mo35543k0();
        }

        /* renamed from: V */
        public C5173er mo30566V() {
            return C5173er.m47136w(this.version_);
        }

        /* renamed from: i0 */
        public String mo30567i0() {
            return this.version_;
        }

        /* renamed from: i1 */
        public C5173er mo30568i1() {
            return C5173er.m47136w(this.service_);
        }

        /* renamed from: jb */
        public C5173er mo30569jb() {
            return C5173er.m47136w(this.operation_);
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4512b();
                case 2:
                    return new C4513a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4512b> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4512b.class) {
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

        /* renamed from: sk */
        public final void mo30570sk() {
            this.operation_ = m37887wk().mo30556F4();
        }

        /* renamed from: tk */
        public final void mo30571tk() {
            this.protocol_ = m37887wk().mo30555F();
        }

        /* renamed from: uk */
        public final void mo30572uk() {
            this.service_ = m37887wk().mo30563S0();
        }

        /* renamed from: vk */
        public final void mo30573vk() {
            this.version_ = m37887wk().mo30567i0();
        }

        /* renamed from: x */
        public C5173er mo30574x() {
            return C5173er.m47136w(this.protocol_);
        }
    }

    /* renamed from: com.onedelhi.secure.ac$c */
    public interface C4514c extends zh2 {
        /* renamed from: F */
        String mo30555F();

        /* renamed from: F4 */
        String mo30556F4();

        /* renamed from: S0 */
        String mo30563S0();

        /* renamed from: V */
        C5173er mo30566V();

        /* renamed from: i0 */
        String mo30567i0();

        /* renamed from: i1 */
        C5173er mo30568i1();

        /* renamed from: jb */
        C5173er mo30569jb();

        /* renamed from: x */
        C5173er mo30574x();
    }

    /* renamed from: com.onedelhi.secure.ac$d */
    public static final class C4515d extends qe1<C4515d, C4516a> implements C4517e {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final C4515d DEFAULT_INSTANCE;
        private static volatile cz2<C4515d> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private vs1.C7095k<String> accessLevels_ = qe1.m62499pj();
        private vs1.C7095k<String> audiences_ = qe1.m62499pj();
        private z54 claims_;
        private String presenter_ = "";
        private String principal_ = "";

        /* renamed from: com.onedelhi.secure.ac$d$a */
        public static final class C4516a extends qe1.C6546b<C4515d, C4516a> implements C4517e {
            public C4516a() {
                super(C4515d.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4516a(C4511a aVar) {
                this();
            }

            /* renamed from: Ac */
            public List<String> mo30587Ac() {
                return Collections.unmodifiableList(((C4515d) this.f34068b).mo30587Ac());
            }

            /* renamed from: C4 */
            public String mo30590C4(int i) {
                return ((C4515d) this.f34068b).mo30590C4(i);
            }

            /* renamed from: F1 */
            public C5173er mo30594F1() {
                return ((C4515d) this.f34068b).mo30594F1();
            }

            /* renamed from: Gj */
            public C4516a mo30622Gj(String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30621zk(str);
                return this;
            }

            /* renamed from: Hj */
            public C4516a mo30623Hj(C5173er erVar) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30588Ak(erVar);
                return this;
            }

            /* renamed from: Ij */
            public C4516a mo30624Ij(Iterable<String> iterable) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30589Bk(iterable);
                return this;
            }

            /* renamed from: J5 */
            public boolean mo30599J5() {
                return ((C4515d) this.f34068b).mo30599J5();
            }

            /* renamed from: Jj */
            public C4516a mo30625Jj(Iterable<String> iterable) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30591Ck(iterable);
                return this;
            }

            /* renamed from: Kj */
            public C4516a mo30626Kj(String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30592Dk(str);
                return this;
            }

            /* renamed from: Lj */
            public C4516a mo30627Lj(C5173er erVar) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30593Ek(erVar);
                return this;
            }

            /* renamed from: Mj */
            public C4516a mo30628Mj() {
                mo43393xj();
                ((C4515d) this.f34068b).mo30595Fk();
                return this;
            }

            /* renamed from: Nj */
            public C4516a mo30629Nj() {
                mo43393xj();
                ((C4515d) this.f34068b).mo30596Gk();
                return this;
            }

            /* renamed from: Oj */
            public C4516a mo30630Oj() {
                mo43393xj();
                ((C4515d) this.f34068b).mo30597Hk();
                return this;
            }

            /* renamed from: Pg */
            public C5173er mo30604Pg(int i) {
                return ((C4515d) this.f34068b).mo30604Pg(i);
            }

            /* renamed from: Pj */
            public C4516a mo30631Pj() {
                mo43393xj();
                ((C4515d) this.f34068b).mo30598Ik();
                return this;
            }

            /* renamed from: Qj */
            public C4516a mo30632Qj() {
                mo43393xj();
                ((C4515d) this.f34068b).mo30600Jk();
                return this;
            }

            /* renamed from: Rj */
            public C4516a mo30633Rj(z54 z54) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30603Nk(z54);
                return this;
            }

            /* renamed from: Sb */
            public C5173er mo30605Sb() {
                return ((C4515d) this.f34068b).mo30605Sb();
            }

            /* renamed from: Sj */
            public C4516a mo30634Sj(int i, String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30606dl(i, str);
                return this;
            }

            /* renamed from: Tj */
            public C4516a mo30635Tj(int i, String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30607el(i, str);
                return this;
            }

            /* renamed from: Uj */
            public C4516a mo30636Uj(z54.C7435b bVar) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30608fl((z54) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Vj */
            public C4516a mo30637Vj(z54 z54) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30608fl(z54);
                return this;
            }

            /* renamed from: Wj */
            public C4516a mo30638Wj(String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30610gl(str);
                return this;
            }

            /* renamed from: Xj */
            public C4516a mo30639Xj(C5173er erVar) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30611hl(erVar);
                return this;
            }

            /* renamed from: Yj */
            public C4516a mo30640Yj(String str) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30612il(str);
                return this;
            }

            /* renamed from: Zj */
            public C4516a mo30641Zj(C5173er erVar) {
                mo43393xj();
                ((C4515d) this.f34068b).mo30613jl(erVar);
                return this;
            }

            /* renamed from: gb */
            public int mo30609gb() {
                return ((C4515d) this.f34068b).mo30609gb();
            }

            /* renamed from: pb */
            public C5173er mo30614pb(int i) {
                return ((C4515d) this.f34068b).mo30614pb(i);
            }

            /* renamed from: sg */
            public String mo30615sg() {
                return ((C4515d) this.f34068b).mo30615sg();
            }

            /* renamed from: v6 */
            public int mo30616v6() {
                return ((C4515d) this.f34068b).mo30616v6();
            }

            /* renamed from: w2 */
            public String mo30617w2(int i) {
                return ((C4515d) this.f34068b).mo30617w2(i);
            }

            /* renamed from: x0 */
            public String mo30618x0() {
                return ((C4515d) this.f34068b).mo30618x0();
            }

            /* renamed from: xh */
            public List<String> mo30619xh() {
                return Collections.unmodifiableList(((C4515d) this.f34068b).mo30619xh());
            }

            /* renamed from: z5 */
            public z54 mo30620z5() {
                return ((C4515d) this.f34068b).mo30620z5();
            }
        }

        static {
            C4515d dVar = new C4515d();
            DEFAULT_INSTANCE = dVar;
            qe1.m62492dk(C4515d.class, dVar);
        }

        /* renamed from: Mk */
        public static C4515d m37940Mk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: Ok */
        public static C4516a m37941Ok() {
            return (C4516a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: Pk */
        public static C4516a m37942Pk(C4515d dVar) {
            return (C4516a) DEFAULT_INSTANCE.mo43358gj(dVar);
        }

        /* renamed from: Qk */
        public static C4515d m37943Qk(InputStream inputStream) throws IOException {
            return (C4515d) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Rk */
        public static C4515d m37944Rk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4515d) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Sk */
        public static C4515d m37945Sk(C5173er erVar) throws nt1 {
            return (C4515d) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Tk */
        public static C4515d m37946Tk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4515d) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Uk */
        public static C4515d m37947Uk(g00 g00) throws IOException {
            return (C4515d) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Vk */
        public static C4515d m37948Vk(g00 g00, zy0 zy0) throws IOException {
            return (C4515d) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Wk */
        public static C4515d m37949Wk(InputStream inputStream) throws IOException {
            return (C4515d) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Xk */
        public static C4515d m37950Xk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4515d) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Yk */
        public static C4515d m37951Yk(ByteBuffer byteBuffer) throws nt1 {
            return (C4515d) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Zk */
        public static C4515d m37952Zk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4515d) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: al */
        public static C4515d m37953al(byte[] bArr) throws nt1 {
            return (C4515d) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: bl */
        public static C4515d m37954bl(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4515d) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: cl */
        public static cz2<C4515d> m37955cl() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: Ac */
        public List<String> mo30587Ac() {
            return this.audiences_;
        }

        /* renamed from: Ak */
        public final void mo30588Ak(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            mo30601Kk();
            this.accessLevels_.add(erVar.mo35543k0());
        }

        /* renamed from: Bk */
        public final void mo30589Bk(Iterable<String> iterable) {
            mo30601Kk();
            C7403z0.m72412X6(iterable, this.accessLevels_);
        }

        /* renamed from: C4 */
        public String mo30590C4(int i) {
            return this.accessLevels_.get(i);
        }

        /* renamed from: Ck */
        public final void mo30591Ck(Iterable<String> iterable) {
            mo30602Lk();
            C7403z0.m72412X6(iterable, this.audiences_);
        }

        /* renamed from: Dk */
        public final void mo30592Dk(String str) {
            str.getClass();
            mo30602Lk();
            this.audiences_.add(str);
        }

        /* renamed from: Ek */
        public final void mo30593Ek(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            mo30602Lk();
            this.audiences_.add(erVar.mo35543k0());
        }

        /* renamed from: F1 */
        public C5173er mo30594F1() {
            return C5173er.m47136w(this.principal_);
        }

        /* renamed from: Fk */
        public final void mo30595Fk() {
            this.accessLevels_ = qe1.m62499pj();
        }

        /* renamed from: Gk */
        public final void mo30596Gk() {
            this.audiences_ = qe1.m62499pj();
        }

        /* renamed from: Hk */
        public final void mo30597Hk() {
            this.claims_ = null;
        }

        /* renamed from: Ik */
        public final void mo30598Ik() {
            this.presenter_ = m37940Mk().mo30615sg();
        }

        /* renamed from: J5 */
        public boolean mo30599J5() {
            return this.claims_ != null;
        }

        /* renamed from: Jk */
        public final void mo30600Jk() {
            this.principal_ = m37940Mk().mo30618x0();
        }

        /* renamed from: Kk */
        public final void mo30601Kk() {
            vs1.C7095k<String> kVar = this.accessLevels_;
            if (!kVar.mo36500p()) {
                this.accessLevels_ = qe1.m62468Fj(kVar);
            }
        }

        /* renamed from: Lk */
        public final void mo30602Lk() {
            vs1.C7095k<String> kVar = this.audiences_;
            if (!kVar.mo36500p()) {
                this.audiences_ = qe1.m62468Fj(kVar);
            }
        }

        /* renamed from: Nk */
        public final void mo30603Nk(z54 z54) {
            z54.getClass();
            z54 z542 = this.claims_;
            if (!(z542 == null || z542 == z54.m72555hk())) {
                z54 = (z54) ((z54.C7435b) z54.m72557mk(this.claims_).mo43372Cj(z54)).mo43377Ja();
            }
            this.claims_ = z54;
        }

        /* renamed from: Pg */
        public C5173er mo30604Pg(int i) {
            return C5173er.m47136w(this.audiences_.get(i));
        }

        /* renamed from: Sb */
        public C5173er mo30605Sb() {
            return C5173er.m47136w(this.presenter_);
        }

        /* renamed from: dl */
        public final void mo30606dl(int i, String str) {
            str.getClass();
            mo30601Kk();
            this.accessLevels_.set(i, str);
        }

        /* renamed from: el */
        public final void mo30607el(int i, String str) {
            str.getClass();
            mo30602Lk();
            this.audiences_.set(i, str);
        }

        /* renamed from: fl */
        public final void mo30608fl(z54 z54) {
            z54.getClass();
            this.claims_ = z54;
        }

        /* renamed from: gb */
        public int mo30609gb() {
            return this.audiences_.size();
        }

        /* renamed from: gl */
        public final void mo30610gl(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        /* renamed from: hl */
        public final void mo30611hl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.presenter_ = erVar.mo35543k0();
        }

        /* renamed from: il */
        public final void mo30612il(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4515d();
                case 2:
                    return new C4516a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4515d> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4515d.class) {
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
        public final void mo30613jl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.principal_ = erVar.mo35543k0();
        }

        /* renamed from: pb */
        public C5173er mo30614pb(int i) {
            return C5173er.m47136w(this.accessLevels_.get(i));
        }

        /* renamed from: sg */
        public String mo30615sg() {
            return this.presenter_;
        }

        /* renamed from: v6 */
        public int mo30616v6() {
            return this.accessLevels_.size();
        }

        /* renamed from: w2 */
        public String mo30617w2(int i) {
            return this.audiences_.get(i);
        }

        /* renamed from: x0 */
        public String mo30618x0() {
            return this.principal_;
        }

        /* renamed from: xh */
        public List<String> mo30619xh() {
            return this.accessLevels_;
        }

        /* renamed from: z5 */
        public z54 mo30620z5() {
            z54 z54 = this.claims_;
            return z54 == null ? z54.m72555hk() : z54;
        }

        /* renamed from: zk */
        public final void mo30621zk(String str) {
            str.getClass();
            mo30601Kk();
            this.accessLevels_.add(str);
        }
    }

    /* renamed from: com.onedelhi.secure.ac$e */
    public interface C4517e extends zh2 {
        /* renamed from: Ac */
        List<String> mo30587Ac();

        /* renamed from: C4 */
        String mo30590C4(int i);

        /* renamed from: F1 */
        C5173er mo30594F1();

        /* renamed from: J5 */
        boolean mo30599J5();

        /* renamed from: Pg */
        C5173er mo30604Pg(int i);

        /* renamed from: Sb */
        C5173er mo30605Sb();

        /* renamed from: gb */
        int mo30609gb();

        /* renamed from: pb */
        C5173er mo30614pb(int i);

        /* renamed from: sg */
        String mo30615sg();

        /* renamed from: v6 */
        int mo30616v6();

        /* renamed from: w2 */
        String mo30617w2(int i);

        /* renamed from: x0 */
        String mo30618x0();

        /* renamed from: xh */
        List<String> mo30619xh();

        /* renamed from: z5 */
        z54 mo30620z5();
    }

    /* renamed from: com.onedelhi.secure.ac$f */
    public static final class C4518f extends qe1.C6546b<C4510ac, C4518f> implements C4663bc {
        public C4518f() {
            super(C4510ac.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4518f(C4511a aVar) {
            this();
        }

        /* renamed from: C6 */
        public boolean mo30520C6() {
            return ((C4510ac) this.f34068b).mo30520C6();
        }

        /* renamed from: Gj */
        public C4518f mo30642Gj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30519Bk();
            return this;
        }

        /* renamed from: Hj */
        public C4518f mo30643Hj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30521Ck();
            return this;
        }

        /* renamed from: Ij */
        public C4518f mo30644Ij() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30522Dk();
            return this;
        }

        /* renamed from: Jj */
        public C4518f mo30645Jj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30523Ek();
            return this;
        }

        /* renamed from: Kj */
        public C4518f mo30646Kj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30524Fk();
            return this;
        }

        /* renamed from: Lj */
        public C4518f mo30647Lj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30525Gk();
            return this;
        }

        /* renamed from: Mj */
        public C4518f mo30648Mj() {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30526Hk();
            return this;
        }

        /* renamed from: Nj */
        public C4518f mo30649Nj(C4512b bVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30527Jk(bVar);
            return this;
        }

        /* renamed from: Oj */
        public C4518f mo30650Oj(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30528Kk(gVar);
            return this;
        }

        /* renamed from: Pe */
        public boolean mo30533Pe() {
            return ((C4510ac) this.f34068b).mo30533Pe();
        }

        /* renamed from: Pj */
        public C4518f mo30651Pj(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30529Lk(gVar);
            return this;
        }

        /* renamed from: Qj */
        public C4518f mo30652Qj(C4523i iVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30530Mk(iVar);
            return this;
        }

        /* renamed from: Rd */
        public C4519g mo30535Rd() {
            return ((C4510ac) this.f34068b).mo30535Rd();
        }

        /* renamed from: Rh */
        public boolean mo30536Rh() {
            return ((C4510ac) this.f34068b).mo30536Rh();
        }

        /* renamed from: Rj */
        public C4518f mo30653Rj(C4527k kVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30531Nk(kVar);
            return this;
        }

        /* renamed from: S4 */
        public C4519g mo30537S4() {
            return ((C4510ac) this.f34068b).mo30537S4();
        }

        /* renamed from: Sj */
        public C4518f mo30654Sj(C4531m mVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30532Ok(mVar);
            return this;
        }

        /* renamed from: T5 */
        public C4523i mo30538T5() {
            return ((C4510ac) this.f34068b).mo30538T5();
        }

        /* renamed from: Tj */
        public C4518f mo30655Tj(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30534Pk(gVar);
            return this;
        }

        /* renamed from: Uj */
        public C4518f mo30656Uj(C4512b.C4513a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30544fl((C4512b) aVar.mo43381ab());
            return this;
        }

        /* renamed from: V7 */
        public C4519g mo30539V7() {
            return ((C4510ac) this.f34068b).mo30539V7();
        }

        /* renamed from: Vj */
        public C4518f mo30657Vj(C4512b bVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30544fl(bVar);
            return this;
        }

        /* renamed from: Wj */
        public C4518f mo30658Wj(C4519g.C4520a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30545gl((C4519g) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C4518f mo30659Xj(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30545gl(gVar);
            return this;
        }

        /* renamed from: Yj */
        public C4518f mo30660Yj(C4519g.C4520a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30546hl((C4519g) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Z */
        public boolean mo30540Z() {
            return ((C4510ac) this.f34068b).mo30540Z();
        }

        /* renamed from: Zj */
        public C4518f mo30661Zj(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30546hl(gVar);
            return this;
        }

        /* renamed from: a1 */
        public boolean mo30541a1() {
            return ((C4510ac) this.f34068b).mo30541a1();
        }

        /* renamed from: ak */
        public C4518f mo30662ak(C4523i.C4524a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30547il((C4523i) aVar.mo43381ab());
            return this;
        }

        /* renamed from: bk */
        public C4518f mo30663bk(C4523i iVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30547il(iVar);
            return this;
        }

        /* renamed from: cg */
        public boolean mo30542cg() {
            return ((C4510ac) this.f34068b).mo30542cg();
        }

        /* renamed from: ck */
        public C4518f mo30664ck(C4527k.C4528a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30549jl((C4527k) aVar.mo43381ab());
            return this;
        }

        /* renamed from: dk */
        public C4518f mo30665dk(C4527k kVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30549jl(kVar);
            return this;
        }

        /* renamed from: ec */
        public C4527k mo30543ec() {
            return ((C4510ac) this.f34068b).mo30543ec();
        }

        /* renamed from: ek */
        public C4518f mo30666ek(C4531m.C4532a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30550kl((C4531m) aVar.mo43381ab());
            return this;
        }

        /* renamed from: fk */
        public C4518f mo30667fk(C4531m mVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30550kl(mVar);
            return this;
        }

        /* renamed from: gk */
        public C4518f mo30668gk(C4519g.C4520a aVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30551ll((C4519g) aVar.mo43381ab());
            return this;
        }

        /* renamed from: hk */
        public C4518f mo30669hk(C4519g gVar) {
            mo43393xj();
            ((C4510ac) this.f34068b).mo30551ll(gVar);
            return this;
        }

        /* renamed from: r6 */
        public boolean mo30552r6() {
            return ((C4510ac) this.f34068b).mo30552r6();
        }

        /* renamed from: rd */
        public C4531m mo30553rd() {
            return ((C4510ac) this.f34068b).mo30553rd();
        }

        /* renamed from: td */
        public C4512b mo30554td() {
            return ((C4510ac) this.f34068b).mo30554td();
        }
    }

    /* renamed from: com.onedelhi.secure.ac$g */
    public static final class C4519g extends qe1<C4519g, C4520a> implements C4522h {
        /* access modifiers changed from: private */
        public static final C4519g DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile cz2<C4519g> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_ = "";
        private rc2<String, String> labels_ = rc2.m63481i();
        private long port_;
        private String principal_ = "";
        private String regionCode_ = "";

        /* renamed from: com.onedelhi.secure.ac$g$a */
        public static final class C4520a extends qe1.C6546b<C4519g, C4520a> implements C4522h {
            public C4520a() {
                super(C4519g.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4520a(C4511a aVar) {
                this();
            }

            /* renamed from: B */
            public boolean mo30670B(String str) {
                str.getClass();
                return ((C4519g) this.f34068b).mo30676I().containsKey(str);
            }

            /* renamed from: D */
            public String mo30671D(String str) {
                str.getClass();
                Map<String, String> I = ((C4519g) this.f34068b).mo30676I();
                if (I.containsKey(str)) {
                    return I.get(str);
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: E8 */
            public long mo30672E8() {
                return ((C4519g) this.f34068b).mo30672E8();
            }

            /* renamed from: F1 */
            public C5173er mo30673F1() {
                return ((C4519g) this.f34068b).mo30673F1();
            }

            /* renamed from: Gg */
            public C5173er mo30674Gg() {
                return ((C4519g) this.f34068b).mo30674Gg();
            }

            /* renamed from: Gj */
            public C4520a mo30697Gj() {
                mo43393xj();
                ((C4519g) this.f34068b).mo30688sk();
                return this;
            }

            /* renamed from: H */
            public String mo30675H(String str, String str2) {
                str.getClass();
                Map<String, String> I = ((C4519g) this.f34068b).mo30676I();
                return I.containsKey(str) ? I.get(str) : str2;
            }

            /* renamed from: Hj */
            public C4520a mo30698Hj() {
                mo43393xj();
                ((C4519g) this.f34068b).mo30693xk().clear();
                return this;
            }

            /* renamed from: I */
            public Map<String, String> mo30676I() {
                return Collections.unmodifiableMap(((C4519g) this.f34068b).mo30676I());
            }

            /* renamed from: Ij */
            public C4520a mo30699Ij() {
                mo43393xj();
                ((C4519g) this.f34068b).mo30689tk();
                return this;
            }

            /* renamed from: Jj */
            public C4520a mo30700Jj() {
                mo43393xj();
                ((C4519g) this.f34068b).mo30690uk();
                return this;
            }

            /* renamed from: Kj */
            public C4520a mo30701Kj() {
                mo43393xj();
                ((C4519g) this.f34068b).mo30691vk();
                return this;
            }

            /* renamed from: Lj */
            public C4520a mo30702Lj(Map<String, String> map) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30693xk().putAll(map);
                return this;
            }

            /* renamed from: Mj */
            public C4520a mo30703Mj(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo43393xj();
                ((C4519g) this.f34068b).mo30693xk().put(str, str2);
                return this;
            }

            /* renamed from: Nj */
            public C4520a mo30704Nj(String str) {
                str.getClass();
                mo43393xj();
                ((C4519g) this.f34068b).mo30693xk().remove(str);
                return this;
            }

            /* renamed from: Oj */
            public C4520a mo30705Oj(String str) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30678Pk(str);
                return this;
            }

            /* renamed from: P5 */
            public String mo30677P5() {
                return ((C4519g) this.f34068b).mo30677P5();
            }

            /* renamed from: Pj */
            public C4520a mo30706Pj(C5173er erVar) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30679Qk(erVar);
                return this;
            }

            /* renamed from: Qj */
            public C4520a mo30707Qj(long j) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30680Rk(j);
                return this;
            }

            /* renamed from: Rj */
            public C4520a mo30708Rj(String str) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30681Sk(str);
                return this;
            }

            /* renamed from: Sj */
            public C4520a mo30709Sj(C5173er erVar) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30682Tk(erVar);
                return this;
            }

            /* renamed from: Tj */
            public C4520a mo30710Tj(String str) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30683Uk(str);
                return this;
            }

            /* renamed from: Uj */
            public C4520a mo30711Uj(C5173er erVar) {
                mo43393xj();
                ((C4519g) this.f34068b).mo30684Vk(erVar);
                return this;
            }

            /* renamed from: c1 */
            public C5173er mo30685c1() {
                return ((C4519g) this.f34068b).mo30685c1();
            }

            /* renamed from: g1 */
            public String mo30686g1() {
                return ((C4519g) this.f34068b).mo30686g1();
            }

            /* renamed from: r */
            public int mo30687r() {
                return ((C4519g) this.f34068b).mo30676I().size();
            }

            /* renamed from: x0 */
            public String mo30692x0() {
                return ((C4519g) this.f34068b).mo30692x0();
            }

            @Deprecated
            /* renamed from: z */
            public Map<String, String> mo30695z() {
                return mo30676I();
            }
        }

        /* renamed from: com.onedelhi.secure.ac$g$b */
        public static final class C4521b {

            /* renamed from: a */
            public static final oc2<String, String> f25810a;

            static {
                wx4.C7195b bVar = wx4.C7195b.f37192i;
                f25810a = oc2.m59242f(bVar, "", bVar, "");
            }
        }

        static {
            C4519g gVar = new C4519g();
            DEFAULT_INSTANCE = gVar;
            qe1.m62492dk(C4519g.class, gVar);
        }

        /* renamed from: Ak */
        public static C4520a m38102Ak() {
            return (C4520a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: Bk */
        public static C4520a m38103Bk(C4519g gVar) {
            return (C4520a) DEFAULT_INSTANCE.mo43358gj(gVar);
        }

        /* renamed from: Ck */
        public static C4519g m38104Ck(InputStream inputStream) throws IOException {
            return (C4519g) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Dk */
        public static C4519g m38105Dk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4519g) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Ek */
        public static C4519g m38106Ek(C5173er erVar) throws nt1 {
            return (C4519g) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Fk */
        public static C4519g m38107Fk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4519g) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Gk */
        public static C4519g m38108Gk(g00 g00) throws IOException {
            return (C4519g) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Hk */
        public static C4519g m38109Hk(g00 g00, zy0 zy0) throws IOException {
            return (C4519g) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Ik */
        public static C4519g m38110Ik(InputStream inputStream) throws IOException {
            return (C4519g) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Jk */
        public static C4519g m38111Jk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4519g) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Kk */
        public static C4519g m38112Kk(ByteBuffer byteBuffer) throws nt1 {
            return (C4519g) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Lk */
        public static C4519g m38113Lk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4519g) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Mk */
        public static C4519g m38114Mk(byte[] bArr) throws nt1 {
            return (C4519g) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Nk */
        public static C4519g m38115Nk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4519g) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Ok */
        public static cz2<C4519g> m38116Ok() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: wk */
        public static C4519g m38130wk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: B */
        public boolean mo30670B(String str) {
            str.getClass();
            return mo30694yk().containsKey(str);
        }

        /* renamed from: D */
        public String mo30671D(String str) {
            str.getClass();
            rc2<String, String> yk = mo30694yk();
            if (yk.containsKey(str)) {
                return yk.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: E8 */
        public long mo30672E8() {
            return this.port_;
        }

        /* renamed from: F1 */
        public C5173er mo30673F1() {
            return C5173er.m47136w(this.principal_);
        }

        /* renamed from: Gg */
        public C5173er mo30674Gg() {
            return C5173er.m47136w(this.ip_);
        }

        /* renamed from: H */
        public String mo30675H(String str, String str2) {
            str.getClass();
            rc2<String, String> yk = mo30694yk();
            return yk.containsKey(str) ? yk.get(str) : str2;
        }

        /* renamed from: I */
        public Map<String, String> mo30676I() {
            return Collections.unmodifiableMap(mo30694yk());
        }

        /* renamed from: P5 */
        public String mo30677P5() {
            return this.ip_;
        }

        /* renamed from: Pk */
        public final void mo30678Pk(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* renamed from: Qk */
        public final void mo30679Qk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.ip_ = erVar.mo35543k0();
        }

        /* renamed from: Rk */
        public final void mo30680Rk(long j) {
            this.port_ = j;
        }

        /* renamed from: Sk */
        public final void mo30681Sk(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* renamed from: Tk */
        public final void mo30682Tk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.principal_ = erVar.mo35543k0();
        }

        /* renamed from: Uk */
        public final void mo30683Uk(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        /* renamed from: Vk */
        public final void mo30684Vk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.regionCode_ = erVar.mo35543k0();
        }

        /* renamed from: c1 */
        public C5173er mo30685c1() {
            return C5173er.m47136w(this.regionCode_);
        }

        /* renamed from: g1 */
        public String mo30686g1() {
            return this.regionCode_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4519g();
                case 2:
                    return new C4520a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", C4521b.f25810a, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4519g> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4519g.class) {
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

        /* renamed from: r */
        public int mo30687r() {
            return mo30694yk().size();
        }

        /* renamed from: sk */
        public final void mo30688sk() {
            this.ip_ = m38130wk().mo30677P5();
        }

        /* renamed from: tk */
        public final void mo30689tk() {
            this.port_ = 0;
        }

        /* renamed from: uk */
        public final void mo30690uk() {
            this.principal_ = m38130wk().mo30692x0();
        }

        /* renamed from: vk */
        public final void mo30691vk() {
            this.regionCode_ = m38130wk().mo30686g1();
        }

        /* renamed from: x0 */
        public String mo30692x0() {
            return this.principal_;
        }

        /* renamed from: xk */
        public final Map<String, String> mo30693xk() {
            return mo30696zk();
        }

        /* renamed from: yk */
        public final rc2<String, String> mo30694yk() {
            return this.labels_;
        }

        @Deprecated
        /* renamed from: z */
        public Map<String, String> mo30695z() {
            return mo30676I();
        }

        /* renamed from: zk */
        public final rc2<String, String> mo30696zk() {
            if (!this.labels_.mo43841n()) {
                this.labels_ = this.labels_.mo43846q();
            }
            return this.labels_;
        }
    }

    /* renamed from: com.onedelhi.secure.ac$h */
    public interface C4522h extends zh2 {
        /* renamed from: B */
        boolean mo30670B(String str);

        /* renamed from: D */
        String mo30671D(String str);

        /* renamed from: E8 */
        long mo30672E8();

        /* renamed from: F1 */
        C5173er mo30673F1();

        /* renamed from: Gg */
        C5173er mo30674Gg();

        /* renamed from: H */
        String mo30675H(String str, String str2);

        /* renamed from: I */
        Map<String, String> mo30676I();

        /* renamed from: P5 */
        String mo30677P5();

        /* renamed from: c1 */
        C5173er mo30685c1();

        /* renamed from: g1 */
        String mo30686g1();

        /* renamed from: r */
        int mo30687r();

        /* renamed from: x0 */
        String mo30692x0();

        @Deprecated
        /* renamed from: z */
        Map<String, String> mo30695z();
    }

    /* renamed from: com.onedelhi.secure.ac$i */
    public static final class C4523i extends qe1<C4523i, C4524a> implements C4526j {
        public static final int AUTH_FIELD_NUMBER = 13;
        /* access modifiers changed from: private */
        public static final C4523i DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile cz2<C4523i> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private C4515d auth_;
        private rc2<String, String> headers_ = rc2.m63481i();
        private String host_ = "";
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String protocol_ = "";
        private String query_ = "";
        private String reason_ = "";
        private String scheme_ = "";
        private long size_;
        private se4 time_;

        /* renamed from: com.onedelhi.secure.ac$i$a */
        public static final class C4524a extends qe1.C6546b<C4523i, C4524a> implements C4526j {
            public C4524a() {
                super(C4523i.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4524a(C4511a aVar) {
                this();
            }

            /* renamed from: C1 */
            public boolean mo30714C1() {
                return ((C4523i) this.f34068b).mo30714C1();
            }

            /* renamed from: E */
            public C5173er mo30717E() {
                return ((C4523i) this.f34068b).mo30717E();
            }

            /* renamed from: F */
            public String mo30719F() {
                return ((C4523i) this.f34068b).mo30719F();
            }

            /* renamed from: Gj */
            public C4524a mo30774Gj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30733Nk();
                return this;
            }

            /* renamed from: Hj */
            public C4524a mo30775Hj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30748Zk().clear();
                return this;
            }

            /* renamed from: I1 */
            public int mo30723I1() {
                return ((C4523i) this.f34068b).mo30729K0().size();
            }

            /* renamed from: Ij */
            public C4524a mo30776Ij() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30734Ok();
                return this;
            }

            /* renamed from: J0 */
            public String mo30725J0() {
                return ((C4523i) this.f34068b).mo30725J0();
            }

            /* renamed from: J1 */
            public boolean mo30726J1(String str) {
                str.getClass();
                return ((C4523i) this.f34068b).mo30729K0().containsKey(str);
            }

            /* renamed from: J4 */
            public C5173er mo30727J4() {
                return ((C4523i) this.f34068b).mo30727J4();
            }

            /* renamed from: Jj */
            public C4524a mo30777Jj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30735Pk();
                return this;
            }

            /* renamed from: K0 */
            public Map<String, String> mo30729K0() {
                return Collections.unmodifiableMap(((C4523i) this.f34068b).mo30729K0());
            }

            /* renamed from: Kj */
            public C4524a mo30778Kj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30736Qk();
                return this;
            }

            /* renamed from: L0 */
            public C5173er mo30731L0() {
                return ((C4523i) this.f34068b).mo30731L0();
            }

            /* renamed from: Lj */
            public C4524a mo30779Lj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30738Rk();
                return this;
            }

            /* renamed from: Mj */
            public C4524a mo30780Mj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30740Sk();
                return this;
            }

            /* renamed from: Nj */
            public C4524a mo30781Nj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30741Tk();
                return this;
            }

            /* renamed from: Oj */
            public C4524a mo30782Oj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30742Uk();
                return this;
            }

            /* renamed from: Pj */
            public C4524a mo30783Pj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30744Vk();
                return this;
            }

            /* renamed from: Qj */
            public C4524a mo30784Qj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30745Wk();
                return this;
            }

            /* renamed from: R9 */
            public C5173er mo30737R9() {
                return ((C4523i) this.f34068b).mo30737R9();
            }

            /* renamed from: Rj */
            public C4524a mo30785Rj() {
                mo43393xj();
                ((C4523i) this.f34068b).mo30746Xk();
                return this;
            }

            /* renamed from: S1 */
            public se4 mo30739S1() {
                return ((C4523i) this.f34068b).mo30739S1();
            }

            /* renamed from: Sj */
            public C4524a mo30786Sj(C4515d dVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30752cl(dVar);
                return this;
            }

            /* renamed from: Tj */
            public C4524a mo30787Tj(se4 se4) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30754dl(se4);
                return this;
            }

            /* renamed from: Uj */
            public C4524a mo30788Uj(Map<String, String> map) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30748Zk().putAll(map);
                return this;
            }

            /* renamed from: V0 */
            public C5173er mo30743V0() {
                return ((C4523i) this.f34068b).mo30743V0();
            }

            /* renamed from: Vj */
            public C4524a mo30789Vj(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo43393xj();
                ((C4523i) this.f34068b).mo30748Zk().put(str, str2);
                return this;
            }

            /* renamed from: Wj */
            public C4524a mo30790Wj(String str) {
                str.getClass();
                mo43393xj();
                ((C4523i) this.f34068b).mo30748Zk().remove(str);
                return this;
            }

            /* renamed from: Xj */
            public C4524a mo30791Xj(C4515d.C4516a aVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30761tl((C4515d) aVar.mo43381ab());
                return this;
            }

            /* renamed from: Y8 */
            public String mo30747Y8() {
                return ((C4523i) this.f34068b).mo30747Y8();
            }

            /* renamed from: Yj */
            public C4524a mo30792Yj(C4515d dVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30761tl(dVar);
                return this;
            }

            /* renamed from: Zj */
            public C4524a mo30793Zj(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30763ul(str);
                return this;
            }

            /* renamed from: ak */
            public C4524a mo30794ak(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30765vl(erVar);
                return this;
            }

            @Deprecated
            /* renamed from: b0 */
            public Map<String, String> mo30750b0() {
                return mo30729K0();
            }

            /* renamed from: bk */
            public C4524a mo30795bk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30767wl(str);
                return this;
            }

            /* renamed from: ck */
            public C4524a mo30796ck(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30769xl(erVar);
                return this;
            }

            /* renamed from: d9 */
            public C5173er mo30753d9() {
                return ((C4523i) this.f34068b).mo30753d9();
            }

            /* renamed from: dk */
            public C4524a mo30797dk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30771yl(str);
                return this;
            }

            /* renamed from: ek */
            public C4524a mo30798ek(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30773zl(erVar);
                return this;
            }

            /* renamed from: f0 */
            public String mo30755f0() {
                return ((C4523i) this.f34068b).mo30755f0();
            }

            /* renamed from: fk */
            public C4524a mo30799fk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30712Al(str);
                return this;
            }

            public long getSize() {
                return ((C4523i) this.f34068b).getSize();
            }

            /* renamed from: gk */
            public C4524a mo30800gk(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30713Bl(erVar);
                return this;
            }

            /* renamed from: hk */
            public C4524a mo30801hk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30715Cl(str);
                return this;
            }

            /* renamed from: ik */
            public C4524a mo30802ik(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30716Dl(erVar);
                return this;
            }

            /* renamed from: j3 */
            public String mo30757j3() {
                return ((C4523i) this.f34068b).mo30757j3();
            }

            /* renamed from: jk */
            public C4524a mo30803jk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30718El(str);
                return this;
            }

            /* renamed from: kk */
            public C4524a mo30804kk(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30720Fl(erVar);
                return this;
            }

            /* renamed from: lk */
            public C4524a mo30805lk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30721Gl(str);
                return this;
            }

            /* renamed from: mi */
            public String mo30758mi() {
                return ((C4523i) this.f34068b).mo30758mi();
            }

            /* renamed from: mk */
            public C4524a mo30806mk(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30722Hl(erVar);
                return this;
            }

            /* renamed from: nk */
            public C4524a mo30807nk(String str) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30724Il(str);
                return this;
            }

            /* renamed from: oh */
            public C4515d mo30759oh() {
                return ((C4523i) this.f34068b).mo30759oh();
            }

            /* renamed from: ok */
            public C4524a mo30808ok(C5173er erVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30728Jl(erVar);
                return this;
            }

            /* renamed from: p1 */
            public String mo30760p1() {
                return ((C4523i) this.f34068b).mo30760p1();
            }

            /* renamed from: pk */
            public C4524a mo30809pk(long j) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30730Kl(j);
                return this;
            }

            /* renamed from: qk */
            public C4524a mo30810qk(se4.C6760b bVar) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30732Ll((se4) bVar.mo43381ab());
                return this;
            }

            /* renamed from: rk */
            public C4524a mo30811rk(se4 se4) {
                mo43393xj();
                ((C4523i) this.f34068b).mo30732Ll(se4);
                return this;
            }

            /* renamed from: u0 */
            public String mo30762u0(String str) {
                str.getClass();
                Map<String, String> K0 = ((C4523i) this.f34068b).mo30729K0();
                if (K0.containsKey(str)) {
                    return K0.get(str);
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: v1 */
            public String mo30764v1(String str, String str2) {
                str.getClass();
                Map<String, String> K0 = ((C4523i) this.f34068b).mo30729K0();
                return K0.containsKey(str) ? K0.get(str) : str2;
            }

            /* renamed from: w */
            public String mo30766w() {
                return ((C4523i) this.f34068b).mo30766w();
            }

            /* renamed from: x */
            public C5173er mo30768x() {
                return ((C4523i) this.f34068b).mo30768x();
            }

            /* renamed from: y1 */
            public C5173er mo30770y1() {
                return ((C4523i) this.f34068b).mo30770y1();
            }

            /* renamed from: ze */
            public boolean mo30772ze() {
                return ((C4523i) this.f34068b).mo30772ze();
            }
        }

        /* renamed from: com.onedelhi.secure.ac$i$b */
        public static final class C4525b {

            /* renamed from: a */
            public static final oc2<String, String> f25811a;

            static {
                wx4.C7195b bVar = wx4.C7195b.f37192i;
                f25811a = oc2.m59242f(bVar, "", bVar, "");
            }
        }

        static {
            C4523i iVar = new C4523i();
            DEFAULT_INSTANCE = iVar;
            qe1.m62492dk(C4523i.class, iVar);
        }

        /* renamed from: Yk */
        public static C4523i m38213Yk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: el */
        public static C4524a m38214el() {
            return (C4524a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: fl */
        public static C4524a m38216fl(C4523i iVar) {
            return (C4524a) DEFAULT_INSTANCE.mo43358gj(iVar);
        }

        /* renamed from: gl */
        public static C4523i m38218gl(InputStream inputStream) throws IOException {
            return (C4523i) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: hl */
        public static C4523i m38220hl(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4523i) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: il */
        public static C4523i m38222il(C5173er erVar) throws nt1 {
            return (C4523i) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: jl */
        public static C4523i m38224jl(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4523i) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: kl */
        public static C4523i m38226kl(g00 g00) throws IOException {
            return (C4523i) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: ll */
        public static C4523i m38228ll(g00 g00, zy0 zy0) throws IOException {
            return (C4523i) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: ml */
        public static C4523i m38230ml(InputStream inputStream) throws IOException {
            return (C4523i) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: nl */
        public static C4523i m38232nl(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4523i) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: ol */
        public static C4523i m38234ol(ByteBuffer byteBuffer) throws nt1 {
            return (C4523i) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: pl */
        public static C4523i m38236pl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4523i) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: ql */
        public static C4523i m38238ql(byte[] bArr) throws nt1 {
            return (C4523i) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: rl */
        public static C4523i m38240rl(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4523i) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: sl */
        public static cz2<C4523i> m38242sl() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: Al */
        public final void mo30712Al(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* renamed from: Bl */
        public final void mo30713Bl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.path_ = erVar.mo35543k0();
        }

        /* renamed from: C1 */
        public boolean mo30714C1() {
            return this.time_ != null;
        }

        /* renamed from: Cl */
        public final void mo30715Cl(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* renamed from: Dl */
        public final void mo30716Dl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.protocol_ = erVar.mo35543k0();
        }

        /* renamed from: E */
        public C5173er mo30717E() {
            return C5173er.m47136w(this.id_);
        }

        /* renamed from: El */
        public final void mo30718El(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* renamed from: F */
        public String mo30719F() {
            return this.protocol_;
        }

        /* renamed from: Fl */
        public final void mo30720Fl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.query_ = erVar.mo35543k0();
        }

        /* renamed from: Gl */
        public final void mo30721Gl(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* renamed from: Hl */
        public final void mo30722Hl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.reason_ = erVar.mo35543k0();
        }

        /* renamed from: I1 */
        public int mo30723I1() {
            return mo30749al().size();
        }

        /* renamed from: Il */
        public final void mo30724Il(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* renamed from: J0 */
        public String mo30725J0() {
            return this.reason_;
        }

        /* renamed from: J1 */
        public boolean mo30726J1(String str) {
            str.getClass();
            return mo30749al().containsKey(str);
        }

        /* renamed from: J4 */
        public C5173er mo30727J4() {
            return C5173er.m47136w(this.method_);
        }

        /* renamed from: Jl */
        public final void mo30728Jl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.scheme_ = erVar.mo35543k0();
        }

        /* renamed from: K0 */
        public Map<String, String> mo30729K0() {
            return Collections.unmodifiableMap(mo30749al());
        }

        /* renamed from: Kl */
        public final void mo30730Kl(long j) {
            this.size_ = j;
        }

        /* renamed from: L0 */
        public C5173er mo30731L0() {
            return C5173er.m47136w(this.query_);
        }

        /* renamed from: Ll */
        public final void mo30732Ll(se4 se4) {
            se4.getClass();
            this.time_ = se4;
        }

        /* renamed from: Nk */
        public final void mo30733Nk() {
            this.auth_ = null;
        }

        /* renamed from: Ok */
        public final void mo30734Ok() {
            this.host_ = m38213Yk().mo30757j3();
        }

        /* renamed from: Pk */
        public final void mo30735Pk() {
            this.id_ = m38213Yk().mo30766w();
        }

        /* renamed from: Qk */
        public final void mo30736Qk() {
            this.method_ = m38213Yk().mo30747Y8();
        }

        /* renamed from: R9 */
        public C5173er mo30737R9() {
            return C5173er.m47136w(this.scheme_);
        }

        /* renamed from: Rk */
        public final void mo30738Rk() {
            this.path_ = m38213Yk().mo30755f0();
        }

        /* renamed from: S1 */
        public se4 mo30739S1() {
            se4 se4 = this.time_;
            return se4 == null ? se4.m64493mk() : se4;
        }

        /* renamed from: Sk */
        public final void mo30740Sk() {
            this.protocol_ = m38213Yk().mo30719F();
        }

        /* renamed from: Tk */
        public final void mo30741Tk() {
            this.query_ = m38213Yk().mo30760p1();
        }

        /* renamed from: Uk */
        public final void mo30742Uk() {
            this.reason_ = m38213Yk().mo30725J0();
        }

        /* renamed from: V0 */
        public C5173er mo30743V0() {
            return C5173er.m47136w(this.reason_);
        }

        /* renamed from: Vk */
        public final void mo30744Vk() {
            this.scheme_ = m38213Yk().mo30758mi();
        }

        /* renamed from: Wk */
        public final void mo30745Wk() {
            this.size_ = 0;
        }

        /* renamed from: Xk */
        public final void mo30746Xk() {
            this.time_ = null;
        }

        /* renamed from: Y8 */
        public String mo30747Y8() {
            return this.method_;
        }

        /* renamed from: Zk */
        public final Map<String, String> mo30748Zk() {
            return mo30751bl();
        }

        /* renamed from: al */
        public final rc2<String, String> mo30749al() {
            return this.headers_;
        }

        @Deprecated
        /* renamed from: b0 */
        public Map<String, String> mo30750b0() {
            return mo30729K0();
        }

        /* renamed from: bl */
        public final rc2<String, String> mo30751bl() {
            if (!this.headers_.mo43841n()) {
                this.headers_ = this.headers_.mo43846q();
            }
            return this.headers_;
        }

        /* renamed from: cl */
        public final void mo30752cl(C4515d dVar) {
            dVar.getClass();
            C4515d dVar2 = this.auth_;
            if (!(dVar2 == null || dVar2 == C4515d.m37940Mk())) {
                dVar = (C4515d) ((C4515d.C4516a) C4515d.m37942Pk(this.auth_).mo43372Cj(dVar)).mo43377Ja();
            }
            this.auth_ = dVar;
        }

        /* renamed from: d9 */
        public C5173er mo30753d9() {
            return C5173er.m47136w(this.host_);
        }

        /* renamed from: dl */
        public final void mo30754dl(se4 se4) {
            se4.getClass();
            se4 se42 = this.time_;
            if (!(se42 == null || se42 == se4.m64493mk())) {
                se4 = (se4) ((se4.C6760b) se4.m64495ok(this.time_).mo43372Cj(se4)).mo43377Ja();
            }
            this.time_ = se4;
        }

        /* renamed from: f0 */
        public String mo30755f0() {
            return this.path_;
        }

        public long getSize() {
            return this.size_;
        }

        /* renamed from: j3 */
        public String mo30757j3() {
            return this.host_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4523i();
                case 2:
                    return new C4524a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000bȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", C4525b.f25811a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4523i> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4523i.class) {
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

        /* renamed from: mi */
        public String mo30758mi() {
            return this.scheme_;
        }

        /* renamed from: oh */
        public C4515d mo30759oh() {
            C4515d dVar = this.auth_;
            return dVar == null ? C4515d.m37940Mk() : dVar;
        }

        /* renamed from: p1 */
        public String mo30760p1() {
            return this.query_;
        }

        /* renamed from: tl */
        public final void mo30761tl(C4515d dVar) {
            dVar.getClass();
            this.auth_ = dVar;
        }

        /* renamed from: u0 */
        public String mo30762u0(String str) {
            str.getClass();
            rc2<String, String> al = mo30749al();
            if (al.containsKey(str)) {
                return al.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: ul */
        public final void mo30763ul(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* renamed from: v1 */
        public String mo30764v1(String str, String str2) {
            str.getClass();
            rc2<String, String> al = mo30749al();
            return al.containsKey(str) ? al.get(str) : str2;
        }

        /* renamed from: vl */
        public final void mo30765vl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.host_ = erVar.mo35543k0();
        }

        /* renamed from: w */
        public String mo30766w() {
            return this.id_;
        }

        /* renamed from: wl */
        public final void mo30767wl(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* renamed from: x */
        public C5173er mo30768x() {
            return C5173er.m47136w(this.protocol_);
        }

        /* renamed from: xl */
        public final void mo30769xl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.id_ = erVar.mo35543k0();
        }

        /* renamed from: y1 */
        public C5173er mo30770y1() {
            return C5173er.m47136w(this.path_);
        }

        /* renamed from: yl */
        public final void mo30771yl(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* renamed from: ze */
        public boolean mo30772ze() {
            return this.auth_ != null;
        }

        /* renamed from: zl */
        public final void mo30773zl(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.method_ = erVar.mo35543k0();
        }
    }

    /* renamed from: com.onedelhi.secure.ac$j */
    public interface C4526j extends zh2 {
        /* renamed from: C1 */
        boolean mo30714C1();

        /* renamed from: E */
        C5173er mo30717E();

        /* renamed from: F */
        String mo30719F();

        /* renamed from: I1 */
        int mo30723I1();

        /* renamed from: J0 */
        String mo30725J0();

        /* renamed from: J1 */
        boolean mo30726J1(String str);

        /* renamed from: J4 */
        C5173er mo30727J4();

        /* renamed from: K0 */
        Map<String, String> mo30729K0();

        /* renamed from: L0 */
        C5173er mo30731L0();

        /* renamed from: R9 */
        C5173er mo30737R9();

        /* renamed from: S1 */
        se4 mo30739S1();

        /* renamed from: V0 */
        C5173er mo30743V0();

        /* renamed from: Y8 */
        String mo30747Y8();

        @Deprecated
        /* renamed from: b0 */
        Map<String, String> mo30750b0();

        /* renamed from: d9 */
        C5173er mo30753d9();

        /* renamed from: f0 */
        String mo30755f0();

        long getSize();

        /* renamed from: j3 */
        String mo30757j3();

        /* renamed from: mi */
        String mo30758mi();

        /* renamed from: oh */
        C4515d mo30759oh();

        /* renamed from: p1 */
        String mo30760p1();

        /* renamed from: u0 */
        String mo30762u0(String str);

        /* renamed from: v1 */
        String mo30764v1(String str, String str2);

        /* renamed from: w */
        String mo30766w();

        /* renamed from: x */
        C5173er mo30768x();

        /* renamed from: y1 */
        C5173er mo30770y1();

        /* renamed from: ze */
        boolean mo30772ze();
    }

    /* renamed from: com.onedelhi.secure.ac$k */
    public static final class C4527k extends qe1<C4527k, C4528a> implements C4530l {
        /* access modifiers changed from: private */
        public static final C4527k DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile cz2<C4527k> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private rc2<String, String> labels_ = rc2.m63481i();
        private String name_ = "";
        private String service_ = "";
        private String type_ = "";

        /* renamed from: com.onedelhi.secure.ac$k$a */
        public static final class C4528a extends qe1.C6546b<C4527k, C4528a> implements C4530l {
            public C4528a() {
                super(C4527k.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4528a(C4511a aVar) {
                this();
            }

            /* renamed from: B */
            public boolean mo30812B(String str) {
                str.getClass();
                return ((C4527k) this.f34068b).mo30815I().containsKey(str);
            }

            /* renamed from: D */
            public String mo30813D(String str) {
                str.getClass();
                Map<String, String> I = ((C4527k) this.f34068b).mo30815I();
                if (I.containsKey(str)) {
                    return I.get(str);
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: Gj */
            public C4528a mo30836Gj() {
                mo43393xj();
                ((C4527k) this.f34068b).mo30832uk().clear();
                return this;
            }

            /* renamed from: H */
            public String mo30814H(String str, String str2) {
                str.getClass();
                Map<String, String> I = ((C4527k) this.f34068b).mo30815I();
                return I.containsKey(str) ? I.get(str) : str2;
            }

            /* renamed from: Hj */
            public C4528a mo30837Hj() {
                mo43393xj();
                ((C4527k) this.f34068b).mo30828qk();
                return this;
            }

            /* renamed from: I */
            public Map<String, String> mo30815I() {
                return Collections.unmodifiableMap(((C4527k) this.f34068b).mo30815I());
            }

            /* renamed from: Ij */
            public C4528a mo30838Ij() {
                mo43393xj();
                ((C4527k) this.f34068b).mo30830rk();
                return this;
            }

            /* renamed from: Jj */
            public C4528a mo30839Jj() {
                mo43393xj();
                ((C4527k) this.f34068b).mo30831sk();
                return this;
            }

            /* renamed from: Kj */
            public C4528a mo30840Kj(Map<String, String> map) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30832uk().putAll(map);
                return this;
            }

            /* renamed from: Lj */
            public C4528a mo30841Lj(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo43393xj();
                ((C4527k) this.f34068b).mo30832uk().put(str, str2);
                return this;
            }

            /* renamed from: Mj */
            public C4528a mo30842Mj(String str) {
                str.getClass();
                mo43393xj();
                ((C4527k) this.f34068b).mo30832uk().remove(str);
                return this;
            }

            /* renamed from: Nj */
            public C4528a mo30843Nj(String str) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30816Mk(str);
                return this;
            }

            /* renamed from: Oj */
            public C4528a mo30844Oj(C5173er erVar) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30817Nk(erVar);
                return this;
            }

            /* renamed from: Pj */
            public C4528a mo30845Pj(String str) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30818Ok(str);
                return this;
            }

            /* renamed from: Qj */
            public C4528a mo30846Qj(C5173er erVar) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30819Pk(erVar);
                return this;
            }

            /* renamed from: Rj */
            public C4528a mo30847Rj(String str) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30820Qk(str);
                return this;
            }

            /* renamed from: S0 */
            public String mo30822S0() {
                return ((C4527k) this.f34068b).mo30822S0();
            }

            /* renamed from: Sj */
            public C4528a mo30848Sj(C5173er erVar) {
                mo43393xj();
                ((C4527k) this.f34068b).mo30821Rk(erVar);
                return this;
            }

            /* renamed from: a */
            public C5173er mo30823a() {
                return ((C4527k) this.f34068b).mo30823a();
            }

            public String getName() {
                return ((C4527k) this.f34068b).getName();
            }

            /* renamed from: h */
            public String mo30825h() {
                return ((C4527k) this.f34068b).mo30825h();
            }

            /* renamed from: i1 */
            public C5173er mo30826i1() {
                return ((C4527k) this.f34068b).mo30826i1();
            }

            /* renamed from: m */
            public C5173er mo30827m() {
                return ((C4527k) this.f34068b).mo30827m();
            }

            /* renamed from: r */
            public int mo30829r() {
                return ((C4527k) this.f34068b).mo30815I().size();
            }

            @Deprecated
            /* renamed from: z */
            public Map<String, String> mo30835z() {
                return mo30815I();
            }
        }

        /* renamed from: com.onedelhi.secure.ac$k$b */
        public static final class C4529b {

            /* renamed from: a */
            public static final oc2<String, String> f25812a;

            static {
                wx4.C7195b bVar = wx4.C7195b.f37192i;
                f25812a = oc2.m59242f(bVar, "", bVar, "");
            }
        }

        static {
            C4527k kVar = new C4527k();
            DEFAULT_INSTANCE = kVar;
            qe1.m62492dk(C4527k.class, kVar);
        }

        /* renamed from: Ak */
        public static C4527k m38402Ak(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4527k) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Bk */
        public static C4527k m38403Bk(C5173er erVar) throws nt1 {
            return (C4527k) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Ck */
        public static C4527k m38404Ck(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4527k) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Dk */
        public static C4527k m38405Dk(g00 g00) throws IOException {
            return (C4527k) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ek */
        public static C4527k m38406Ek(g00 g00, zy0 zy0) throws IOException {
            return (C4527k) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Fk */
        public static C4527k m38407Fk(InputStream inputStream) throws IOException {
            return (C4527k) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Gk */
        public static C4527k m38408Gk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4527k) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Hk */
        public static C4527k m38409Hk(ByteBuffer byteBuffer) throws nt1 {
            return (C4527k) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Ik */
        public static C4527k m38410Ik(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4527k) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Jk */
        public static C4527k m38411Jk(byte[] bArr) throws nt1 {
            return (C4527k) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Kk */
        public static C4527k m38412Kk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4527k) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Lk */
        public static cz2<C4527k> m38413Lk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: tk */
        public static C4527k m38425tk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: xk */
        public static C4528a m38426xk() {
            return (C4528a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: yk */
        public static C4528a m38427yk(C4527k kVar) {
            return (C4528a) DEFAULT_INSTANCE.mo43358gj(kVar);
        }

        /* renamed from: zk */
        public static C4527k m38428zk(InputStream inputStream) throws IOException {
            return (C4527k) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: B */
        public boolean mo30812B(String str) {
            str.getClass();
            return mo30833vk().containsKey(str);
        }

        /* renamed from: D */
        public String mo30813D(String str) {
            str.getClass();
            rc2<String, String> vk = mo30833vk();
            if (vk.containsKey(str)) {
                return vk.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: H */
        public String mo30814H(String str, String str2) {
            str.getClass();
            rc2<String, String> vk = mo30833vk();
            return vk.containsKey(str) ? vk.get(str) : str2;
        }

        /* renamed from: I */
        public Map<String, String> mo30815I() {
            return Collections.unmodifiableMap(mo30833vk());
        }

        /* renamed from: Mk */
        public final void mo30816Mk(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* renamed from: Nk */
        public final void mo30817Nk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.name_ = erVar.mo35543k0();
        }

        /* renamed from: Ok */
        public final void mo30818Ok(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* renamed from: Pk */
        public final void mo30819Pk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.service_ = erVar.mo35543k0();
        }

        /* renamed from: Qk */
        public final void mo30820Qk(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* renamed from: Rk */
        public final void mo30821Rk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.type_ = erVar.mo35543k0();
        }

        /* renamed from: S0 */
        public String mo30822S0() {
            return this.service_;
        }

        /* renamed from: a */
        public C5173er mo30823a() {
            return C5173er.m47136w(this.name_);
        }

        public String getName() {
            return this.name_;
        }

        /* renamed from: h */
        public String mo30825h() {
            return this.type_;
        }

        /* renamed from: i1 */
        public C5173er mo30826i1() {
            return C5173er.m47136w(this.service_);
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4527k();
                case 2:
                    return new C4528a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", C4529b.f25812a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4527k> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4527k.class) {
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

        /* renamed from: m */
        public C5173er mo30827m() {
            return C5173er.m47136w(this.type_);
        }

        /* renamed from: qk */
        public final void mo30828qk() {
            this.name_ = m38425tk().getName();
        }

        /* renamed from: r */
        public int mo30829r() {
            return mo30833vk().size();
        }

        /* renamed from: rk */
        public final void mo30830rk() {
            this.service_ = m38425tk().mo30822S0();
        }

        /* renamed from: sk */
        public final void mo30831sk() {
            this.type_ = m38425tk().mo30825h();
        }

        /* renamed from: uk */
        public final Map<String, String> mo30832uk() {
            return mo30834wk();
        }

        /* renamed from: vk */
        public final rc2<String, String> mo30833vk() {
            return this.labels_;
        }

        /* renamed from: wk */
        public final rc2<String, String> mo30834wk() {
            if (!this.labels_.mo43841n()) {
                this.labels_ = this.labels_.mo43846q();
            }
            return this.labels_;
        }

        @Deprecated
        /* renamed from: z */
        public Map<String, String> mo30835z() {
            return mo30815I();
        }
    }

    /* renamed from: com.onedelhi.secure.ac$l */
    public interface C4530l extends zh2 {
        /* renamed from: B */
        boolean mo30812B(String str);

        /* renamed from: D */
        String mo30813D(String str);

        /* renamed from: H */
        String mo30814H(String str, String str2);

        /* renamed from: I */
        Map<String, String> mo30815I();

        /* renamed from: S0 */
        String mo30822S0();

        /* renamed from: a */
        C5173er mo30823a();

        String getName();

        /* renamed from: h */
        String mo30825h();

        /* renamed from: i1 */
        C5173er mo30826i1();

        /* renamed from: m */
        C5173er mo30827m();

        /* renamed from: r */
        int mo30829r();

        @Deprecated
        /* renamed from: z */
        Map<String, String> mo30835z();
    }

    /* renamed from: com.onedelhi.secure.ac$m */
    public static final class C4531m extends qe1<C4531m, C4532a> implements C4534n {
        public static final int CODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C4531m DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile cz2<C4531m> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private rc2<String, String> headers_ = rc2.m63481i();
        private long size_;
        private se4 time_;

        /* renamed from: com.onedelhi.secure.ac$m$a */
        public static final class C4532a extends qe1.C6546b<C4531m, C4532a> implements C4534n {
            public C4532a() {
                super(C4531m.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C4532a(C4511a aVar) {
                this();
            }

            /* renamed from: C1 */
            public boolean mo30849C1() {
                return ((C4531m) this.f34068b).mo30849C1();
            }

            /* renamed from: Gj */
            public C4532a mo30869Gj() {
                mo43393xj();
                ((C4531m) this.f34068b).mo30860ok();
                return this;
            }

            /* renamed from: Hj */
            public C4532a mo30870Hj() {
                mo43393xj();
                ((C4531m) this.f34068b).mo30863sk().clear();
                return this;
            }

            /* renamed from: I1 */
            public int mo30850I1() {
                return ((C4531m) this.f34068b).mo30852K0().size();
            }

            /* renamed from: Ij */
            public C4532a mo30871Ij() {
                mo43393xj();
                ((C4531m) this.f34068b).mo30861pk();
                return this;
            }

            /* renamed from: J1 */
            public boolean mo30851J1(String str) {
                str.getClass();
                return ((C4531m) this.f34068b).mo30852K0().containsKey(str);
            }

            /* renamed from: Jj */
            public C4532a mo30872Jj() {
                mo43393xj();
                ((C4531m) this.f34068b).mo30862qk();
                return this;
            }

            /* renamed from: K0 */
            public Map<String, String> mo30852K0() {
                return Collections.unmodifiableMap(((C4531m) this.f34068b).mo30852K0());
            }

            /* renamed from: Kj */
            public C4532a mo30873Kj(se4 se4) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30868vk(se4);
                return this;
            }

            /* renamed from: Lj */
            public C4532a mo30874Lj(Map<String, String> map) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30863sk().putAll(map);
                return this;
            }

            /* renamed from: Mj */
            public C4532a mo30875Mj(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo43393xj();
                ((C4531m) this.f34068b).mo30863sk().put(str, str2);
                return this;
            }

            /* renamed from: Ne */
            public long mo30855Ne() {
                return ((C4531m) this.f34068b).mo30855Ne();
            }

            /* renamed from: Nj */
            public C4532a mo30876Nj(String str) {
                str.getClass();
                mo43393xj();
                ((C4531m) this.f34068b).mo30863sk().remove(str);
                return this;
            }

            /* renamed from: Oj */
            public C4532a mo30877Oj(long j) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30853Lk(j);
                return this;
            }

            /* renamed from: Pj */
            public C4532a mo30878Pj(long j) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30854Mk(j);
                return this;
            }

            /* renamed from: Qj */
            public C4532a mo30879Qj(se4.C6760b bVar) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30856Nk((se4) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Rj */
            public C4532a mo30880Rj(se4 se4) {
                mo43393xj();
                ((C4531m) this.f34068b).mo30856Nk(se4);
                return this;
            }

            /* renamed from: S1 */
            public se4 mo30857S1() {
                return ((C4531m) this.f34068b).mo30857S1();
            }

            @Deprecated
            /* renamed from: b0 */
            public Map<String, String> mo30858b0() {
                return mo30852K0();
            }

            public long getSize() {
                return ((C4531m) this.f34068b).getSize();
            }

            /* renamed from: u0 */
            public String mo30865u0(String str) {
                str.getClass();
                Map<String, String> K0 = ((C4531m) this.f34068b).mo30852K0();
                if (K0.containsKey(str)) {
                    return K0.get(str);
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: v1 */
            public String mo30867v1(String str, String str2) {
                str.getClass();
                Map<String, String> K0 = ((C4531m) this.f34068b).mo30852K0();
                return K0.containsKey(str) ? K0.get(str) : str2;
            }
        }

        /* renamed from: com.onedelhi.secure.ac$m$b */
        public static final class C4533b {

            /* renamed from: a */
            public static final oc2<String, String> f25813a;

            static {
                wx4.C7195b bVar = wx4.C7195b.f37192i;
                f25813a = oc2.m59242f(bVar, "", bVar, "");
            }
        }

        static {
            C4531m mVar = new C4531m();
            DEFAULT_INSTANCE = mVar;
            qe1.m62492dk(C4531m.class, mVar);
        }

        /* renamed from: Ak */
        public static C4531m m38488Ak(C5173er erVar) throws nt1 {
            return (C4531m) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Bk */
        public static C4531m m38489Bk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C4531m) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Ck */
        public static C4531m m38490Ck(g00 g00) throws IOException {
            return (C4531m) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Dk */
        public static C4531m m38491Dk(g00 g00, zy0 zy0) throws IOException {
            return (C4531m) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Ek */
        public static C4531m m38492Ek(InputStream inputStream) throws IOException {
            return (C4531m) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Fk */
        public static C4531m m38493Fk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4531m) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Gk */
        public static C4531m m38494Gk(ByteBuffer byteBuffer) throws nt1 {
            return (C4531m) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Hk */
        public static C4531m m38495Hk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C4531m) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Ik */
        public static C4531m m38496Ik(byte[] bArr) throws nt1 {
            return (C4531m) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Jk */
        public static C4531m m38497Jk(byte[] bArr, zy0 zy0) throws nt1 {
            return (C4531m) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Kk */
        public static cz2<C4531m> m38498Kk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: rk */
        public static C4531m m38508rk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: wk */
        public static C4532a m38509wk() {
            return (C4532a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: xk */
        public static C4532a m38510xk(C4531m mVar) {
            return (C4532a) DEFAULT_INSTANCE.mo43358gj(mVar);
        }

        /* renamed from: yk */
        public static C4531m m38511yk(InputStream inputStream) throws IOException {
            return (C4531m) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: zk */
        public static C4531m m38512zk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C4531m) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: C1 */
        public boolean mo30849C1() {
            return this.time_ != null;
        }

        /* renamed from: I1 */
        public int mo30850I1() {
            return mo30864tk().size();
        }

        /* renamed from: J1 */
        public boolean mo30851J1(String str) {
            str.getClass();
            return mo30864tk().containsKey(str);
        }

        /* renamed from: K0 */
        public Map<String, String> mo30852K0() {
            return Collections.unmodifiableMap(mo30864tk());
        }

        /* renamed from: Lk */
        public final void mo30853Lk(long j) {
            this.code_ = j;
        }

        /* renamed from: Mk */
        public final void mo30854Mk(long j) {
            this.size_ = j;
        }

        /* renamed from: Ne */
        public long mo30855Ne() {
            return this.code_;
        }

        /* renamed from: Nk */
        public final void mo30856Nk(se4 se4) {
            se4.getClass();
            this.time_ = se4;
        }

        /* renamed from: S1 */
        public se4 mo30857S1() {
            se4 se4 = this.time_;
            return se4 == null ? se4.m64493mk() : se4;
        }

        @Deprecated
        /* renamed from: b0 */
        public Map<String, String> mo30858b0() {
            return mo30852K0();
        }

        public long getSize() {
            return this.size_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C4511a.f25809a[iVar.ordinal()]) {
                case 1:
                    return new C4531m();
                case 2:
                    return new C4532a((C4511a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", C4533b.f25813a, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C4531m> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C4531m.class) {
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

        /* renamed from: ok */
        public final void mo30860ok() {
            this.code_ = 0;
        }

        /* renamed from: pk */
        public final void mo30861pk() {
            this.size_ = 0;
        }

        /* renamed from: qk */
        public final void mo30862qk() {
            this.time_ = null;
        }

        /* renamed from: sk */
        public final Map<String, String> mo30863sk() {
            return mo30866uk();
        }

        /* renamed from: tk */
        public final rc2<String, String> mo30864tk() {
            return this.headers_;
        }

        /* renamed from: u0 */
        public String mo30865u0(String str) {
            str.getClass();
            rc2<String, String> tk = mo30864tk();
            if (tk.containsKey(str)) {
                return tk.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: uk */
        public final rc2<String, String> mo30866uk() {
            if (!this.headers_.mo43841n()) {
                this.headers_ = this.headers_.mo43846q();
            }
            return this.headers_;
        }

        /* renamed from: v1 */
        public String mo30867v1(String str, String str2) {
            str.getClass();
            rc2<String, String> tk = mo30864tk();
            return tk.containsKey(str) ? tk.get(str) : str2;
        }

        /* renamed from: vk */
        public final void mo30868vk(se4 se4) {
            se4.getClass();
            se4 se42 = this.time_;
            if (!(se42 == null || se42 == se4.m64493mk())) {
                se4 = (se4) ((se4.C6760b) se4.m64495ok(this.time_).mo43372Cj(se4)).mo43377Ja();
            }
            this.time_ = se4;
        }
    }

    /* renamed from: com.onedelhi.secure.ac$n */
    public interface C4534n extends zh2 {
        /* renamed from: C1 */
        boolean mo30849C1();

        /* renamed from: I1 */
        int mo30850I1();

        /* renamed from: J1 */
        boolean mo30851J1(String str);

        /* renamed from: K0 */
        Map<String, String> mo30852K0();

        /* renamed from: Ne */
        long mo30855Ne();

        /* renamed from: S1 */
        se4 mo30857S1();

        @Deprecated
        /* renamed from: b0 */
        Map<String, String> mo30858b0();

        long getSize();

        /* renamed from: u0 */
        String mo30865u0(String str);

        /* renamed from: v1 */
        String mo30867v1(String str, String str2);
    }

    static {
        C4510ac acVar = new C4510ac();
        DEFAULT_INSTANCE = acVar;
        qe1.m62492dk(C4510ac.class, acVar);
    }

    /* renamed from: Ik */
    public static C4510ac m37789Ik() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Qk */
    public static C4518f m37790Qk() {
        return (C4518f) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Rk */
    public static C4518f m37791Rk(C4510ac acVar) {
        return (C4518f) DEFAULT_INSTANCE.mo43358gj(acVar);
    }

    /* renamed from: Sk */
    public static C4510ac m37792Sk(InputStream inputStream) throws IOException {
        return (C4510ac) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Tk */
    public static C4510ac m37793Tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C4510ac) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Uk */
    public static C4510ac m37794Uk(C5173er erVar) throws nt1 {
        return (C4510ac) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Vk */
    public static C4510ac m37795Vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C4510ac) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Wk */
    public static C4510ac m37796Wk(g00 g00) throws IOException {
        return (C4510ac) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Xk */
    public static C4510ac m37797Xk(g00 g00, zy0 zy0) throws IOException {
        return (C4510ac) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Yk */
    public static C4510ac m37798Yk(InputStream inputStream) throws IOException {
        return (C4510ac) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Zk */
    public static C4510ac m37799Zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C4510ac) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: al */
    public static C4510ac m37800al(ByteBuffer byteBuffer) throws nt1 {
        return (C4510ac) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: bl */
    public static C4510ac m37801bl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C4510ac) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: cl */
    public static C4510ac m37802cl(byte[] bArr) throws nt1 {
        return (C4510ac) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: dl */
    public static C4510ac m37803dl(byte[] bArr, zy0 zy0) throws nt1 {
        return (C4510ac) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: el */
    public static cz2<C4510ac> m37804el() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bk */
    public final void mo30519Bk() {
        this.api_ = null;
    }

    /* renamed from: C6 */
    public boolean mo30520C6() {
        return this.origin_ != null;
    }

    /* renamed from: Ck */
    public final void mo30521Ck() {
        this.destination_ = null;
    }

    /* renamed from: Dk */
    public final void mo30522Dk() {
        this.origin_ = null;
    }

    /* renamed from: Ek */
    public final void mo30523Ek() {
        this.request_ = null;
    }

    /* renamed from: Fk */
    public final void mo30524Fk() {
        this.resource_ = null;
    }

    /* renamed from: Gk */
    public final void mo30525Gk() {
        this.response_ = null;
    }

    /* renamed from: Hk */
    public final void mo30526Hk() {
        this.source_ = null;
    }

    /* renamed from: Jk */
    public final void mo30527Jk(C4512b bVar) {
        bVar.getClass();
        C4512b bVar2 = this.api_;
        if (!(bVar2 == null || bVar2 == C4512b.m37887wk())) {
            bVar = (C4512b) ((C4512b.C4513a) C4512b.m37889yk(this.api_).mo43372Cj(bVar)).mo43377Ja();
        }
        this.api_ = bVar;
    }

    /* renamed from: Kk */
    public final void mo30528Kk(C4519g gVar) {
        gVar.getClass();
        C4519g gVar2 = this.destination_;
        if (!(gVar2 == null || gVar2 == C4519g.m38130wk())) {
            gVar = (C4519g) ((C4519g.C4520a) C4519g.m38103Bk(this.destination_).mo43372Cj(gVar)).mo43377Ja();
        }
        this.destination_ = gVar;
    }

    /* renamed from: Lk */
    public final void mo30529Lk(C4519g gVar) {
        gVar.getClass();
        C4519g gVar2 = this.origin_;
        if (!(gVar2 == null || gVar2 == C4519g.m38130wk())) {
            gVar = (C4519g) ((C4519g.C4520a) C4519g.m38103Bk(this.origin_).mo43372Cj(gVar)).mo43377Ja();
        }
        this.origin_ = gVar;
    }

    /* renamed from: Mk */
    public final void mo30530Mk(C4523i iVar) {
        iVar.getClass();
        C4523i iVar2 = this.request_;
        if (!(iVar2 == null || iVar2 == C4523i.m38213Yk())) {
            iVar = (C4523i) ((C4523i.C4524a) C4523i.m38216fl(this.request_).mo43372Cj(iVar)).mo43377Ja();
        }
        this.request_ = iVar;
    }

    /* renamed from: Nk */
    public final void mo30531Nk(C4527k kVar) {
        kVar.getClass();
        C4527k kVar2 = this.resource_;
        if (!(kVar2 == null || kVar2 == C4527k.m38425tk())) {
            kVar = (C4527k) ((C4527k.C4528a) C4527k.m38427yk(this.resource_).mo43372Cj(kVar)).mo43377Ja();
        }
        this.resource_ = kVar;
    }

    /* renamed from: Ok */
    public final void mo30532Ok(C4531m mVar) {
        mVar.getClass();
        C4531m mVar2 = this.response_;
        if (!(mVar2 == null || mVar2 == C4531m.m38508rk())) {
            mVar = (C4531m) ((C4531m.C4532a) C4531m.m38510xk(this.response_).mo43372Cj(mVar)).mo43377Ja();
        }
        this.response_ = mVar;
    }

    /* renamed from: Pe */
    public boolean mo30533Pe() {
        return this.destination_ != null;
    }

    /* renamed from: Pk */
    public final void mo30534Pk(C4519g gVar) {
        gVar.getClass();
        C4519g gVar2 = this.source_;
        if (!(gVar2 == null || gVar2 == C4519g.m38130wk())) {
            gVar = (C4519g) ((C4519g.C4520a) C4519g.m38103Bk(this.source_).mo43372Cj(gVar)).mo43377Ja();
        }
        this.source_ = gVar;
    }

    /* renamed from: Rd */
    public C4519g mo30535Rd() {
        C4519g gVar = this.destination_;
        return gVar == null ? C4519g.m38130wk() : gVar;
    }

    /* renamed from: Rh */
    public boolean mo30536Rh() {
        return this.resource_ != null;
    }

    /* renamed from: S4 */
    public C4519g mo30537S4() {
        C4519g gVar = this.source_;
        return gVar == null ? C4519g.m38130wk() : gVar;
    }

    /* renamed from: T5 */
    public C4523i mo30538T5() {
        C4523i iVar = this.request_;
        return iVar == null ? C4523i.m38213Yk() : iVar;
    }

    /* renamed from: V7 */
    public C4519g mo30539V7() {
        C4519g gVar = this.origin_;
        return gVar == null ? C4519g.m38130wk() : gVar;
    }

    /* renamed from: Z */
    public boolean mo30540Z() {
        return this.response_ != null;
    }

    /* renamed from: a1 */
    public boolean mo30541a1() {
        return this.request_ != null;
    }

    /* renamed from: cg */
    public boolean mo30542cg() {
        return this.api_ != null;
    }

    /* renamed from: ec */
    public C4527k mo30543ec() {
        C4527k kVar = this.resource_;
        return kVar == null ? C4527k.m38425tk() : kVar;
    }

    /* renamed from: fl */
    public final void mo30544fl(C4512b bVar) {
        bVar.getClass();
        this.api_ = bVar;
    }

    /* renamed from: gl */
    public final void mo30545gl(C4519g gVar) {
        gVar.getClass();
        this.destination_ = gVar;
    }

    /* renamed from: hl */
    public final void mo30546hl(C4519g gVar) {
        gVar.getClass();
        this.origin_ = gVar;
    }

    /* renamed from: il */
    public final void mo30547il(C4523i iVar) {
        iVar.getClass();
        this.request_ = iVar;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4511a.f25809a[iVar.ordinal()]) {
            case 1:
                return new C4510ac();
            case 2:
                return new C4518f((C4511a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C4510ac> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C4510ac.class) {
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
    public final void mo30549jl(C4527k kVar) {
        kVar.getClass();
        this.resource_ = kVar;
    }

    /* renamed from: kl */
    public final void mo30550kl(C4531m mVar) {
        mVar.getClass();
        this.response_ = mVar;
    }

    /* renamed from: ll */
    public final void mo30551ll(C4519g gVar) {
        gVar.getClass();
        this.source_ = gVar;
    }

    /* renamed from: r6 */
    public boolean mo30552r6() {
        return this.source_ != null;
    }

    /* renamed from: rd */
    public C4531m mo30553rd() {
        C4531m mVar = this.response_;
        return mVar == null ? C4531m.m38508rk() : mVar;
    }

    /* renamed from: td */
    public C4512b mo30554td() {
        C4512b bVar = this.api_;
        return bVar == null ? C4512b.m37887wk() : bVar;
    }
}
