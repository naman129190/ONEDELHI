package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class y84 extends qe1<y84, C7316b> implements z84 {
    /* access modifiers changed from: private */
    public static final y84 DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<y84> PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_ = "";
    private String name_ = "";
    private String urlQueryParameter_ = "";

    /* renamed from: com.onedelhi.secure.y84$a */
    public static /* synthetic */ class C7315a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37829a;

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
                f37829a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37829a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.y84.C7315a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.y84$b */
    public static final class C7316b extends qe1.C6546b<y84, C7316b> implements z84 {
        public C7316b() {
            super(y84.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7316b(C7315a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7316b mo47620Gj() {
            mo43393xj();
            ((y84) this.f34068b).mo47617pk();
            return this;
        }

        /* renamed from: H6 */
        public C5173er mo47605H6() {
            return ((y84) this.f34068b).mo47605H6();
        }

        /* renamed from: Hg */
        public C5173er mo47606Hg() {
            return ((y84) this.f34068b).mo47606Hg();
        }

        /* renamed from: Hj */
        public C7316b mo47621Hj() {
            mo43393xj();
            ((y84) this.f34068b).mo47618qk();
            return this;
        }

        /* renamed from: Ij */
        public C7316b mo47622Ij() {
            mo43393xj();
            ((y84) this.f34068b).mo47619rk();
            return this;
        }

        /* renamed from: Jj */
        public C7316b mo47623Jj(String str) {
            mo43393xj();
            ((y84) this.f34068b).mo47607Ik(str);
            return this;
        }

        /* renamed from: Kj */
        public C7316b mo47624Kj(C5173er erVar) {
            mo43393xj();
            ((y84) this.f34068b).mo47608Jk(erVar);
            return this;
        }

        /* renamed from: Lj */
        public C7316b mo47625Lj(String str) {
            mo43393xj();
            ((y84) this.f34068b).mo47609Kk(str);
            return this;
        }

        /* renamed from: Mj */
        public C7316b mo47626Mj(C5173er erVar) {
            mo43393xj();
            ((y84) this.f34068b).mo47610Lk(erVar);
            return this;
        }

        /* renamed from: Nj */
        public C7316b mo47627Nj(String str) {
            mo43393xj();
            ((y84) this.f34068b).mo47611Mk(str);
            return this;
        }

        /* renamed from: Oj */
        public C7316b mo47628Oj(C5173er erVar) {
            mo43393xj();
            ((y84) this.f34068b).mo47612Nk(erVar);
            return this;
        }

        /* renamed from: W4 */
        public String mo47613W4() {
            return ((y84) this.f34068b).mo47613W4();
        }

        /* renamed from: a */
        public C5173er mo47614a() {
            return ((y84) this.f34068b).mo47614a();
        }

        public String getName() {
            return ((y84) this.f34068b).getName();
        }

        /* renamed from: ig */
        public String mo47616ig() {
            return ((y84) this.f34068b).mo47616ig();
        }
    }

    static {
        y84 y84 = new y84();
        DEFAULT_INSTANCE = y84;
        qe1.m62492dk(y84.class, y84);
    }

    /* renamed from: Ak */
    public static y84 m71319Ak(g00 g00, zy0 zy0) throws IOException {
        return (y84) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static y84 m71320Bk(InputStream inputStream) throws IOException {
        return (y84) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static y84 m71321Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (y84) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static y84 m71322Dk(ByteBuffer byteBuffer) throws nt1 {
        return (y84) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static y84 m71323Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (y84) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static y84 m71324Fk(byte[] bArr) throws nt1 {
        return (y84) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static y84 m71325Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (y84) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<y84> m71326Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: sk */
    public static y84 m71337sk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C7316b m71338tk() {
        return (C7316b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C7316b m71339uk(y84 y84) {
        return (C7316b) DEFAULT_INSTANCE.mo43358gj(y84);
    }

    /* renamed from: vk */
    public static y84 m71340vk(InputStream inputStream) throws IOException {
        return (y84) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static y84 m71341wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (y84) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static y84 m71342xk(C5173er erVar) throws nt1 {
        return (y84) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static y84 m71343yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (y84) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static y84 m71344zk(g00 g00) throws IOException {
        return (y84) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: H6 */
    public C5173er mo47605H6() {
        return C5173er.m47136w(this.httpHeader_);
    }

    /* renamed from: Hg */
    public C5173er mo47606Hg() {
        return C5173er.m47136w(this.urlQueryParameter_);
    }

    /* renamed from: Ik */
    public final void mo47607Ik(String str) {
        str.getClass();
        this.httpHeader_ = str;
    }

    /* renamed from: Jk */
    public final void mo47608Jk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.httpHeader_ = erVar.mo35543k0();
    }

    /* renamed from: Kk */
    public final void mo47609Kk(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Lk */
    public final void mo47610Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Mk */
    public final void mo47611Mk(String str) {
        str.getClass();
        this.urlQueryParameter_ = str;
    }

    /* renamed from: Nk */
    public final void mo47612Nk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.urlQueryParameter_ = erVar.mo35543k0();
    }

    /* renamed from: W4 */
    public String mo47613W4() {
        return this.urlQueryParameter_;
    }

    /* renamed from: a */
    public C5173er mo47614a() {
        return C5173er.m47136w(this.name_);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: ig */
    public String mo47616ig() {
        return this.httpHeader_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7315a.f37829a[iVar.ordinal()]) {
            case 1:
                return new y84();
            case 2:
                return new C7316b((C7315a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<y84> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (y84.class) {
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
    public final void mo47617pk() {
        this.httpHeader_ = m71337sk().mo47616ig();
    }

    /* renamed from: qk */
    public final void mo47618qk() {
        this.name_ = m71337sk().getName();
    }

    /* renamed from: rk */
    public final void mo47619rk() {
        this.urlQueryParameter_ = m71337sk().mo47613W4();
    }
}
