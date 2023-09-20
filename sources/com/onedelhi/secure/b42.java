package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class b42 extends qe1<b42, C4622b> implements c42 {
    /* access modifiers changed from: private */
    public static final b42 DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile cz2<b42> PARSER;
    private String filter_ = "";
    private String name_ = "";
    private int pageSize_;
    private String pageToken_ = "";

    /* renamed from: com.onedelhi.secure.b42$a */
    public static /* synthetic */ class C4621a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26141a;

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
                f26141a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26141a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b42.C4621a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.b42$b */
    public static final class C4622b extends qe1.C6546b<b42, C4622b> implements c42 {
        public C4622b() {
            super(b42.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4622b(C4621a aVar) {
            this();
        }

        /* renamed from: Aa */
        public C5173er mo31368Aa() {
            return ((b42) this.f34068b).mo31368Aa();
        }

        /* renamed from: Gj */
        public C4622b mo31386Gj() {
            mo43393xj();
            ((b42) this.f34068b).mo31380rk();
            return this;
        }

        /* renamed from: Hj */
        public C4622b mo31387Hj() {
            mo43393xj();
            ((b42) this.f34068b).mo31381sk();
            return this;
        }

        /* renamed from: Ij */
        public C4622b mo31388Ij() {
            mo43393xj();
            ((b42) this.f34068b).mo31383tk();
            return this;
        }

        /* renamed from: Jj */
        public C4622b mo31389Jj() {
            mo43393xj();
            ((b42) this.f34068b).mo31384uk();
            return this;
        }

        /* renamed from: Kj */
        public C4622b mo31390Kj(String str) {
            mo43393xj();
            ((b42) this.f34068b).mo31369Lk(str);
            return this;
        }

        /* renamed from: Lj */
        public C4622b mo31391Lj(C5173er erVar) {
            mo43393xj();
            ((b42) this.f34068b).mo31370Mk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C4622b mo31392Mj(String str) {
            mo43393xj();
            ((b42) this.f34068b).mo31371Nk(str);
            return this;
        }

        /* renamed from: Nj */
        public C4622b mo31393Nj(C5173er erVar) {
            mo43393xj();
            ((b42) this.f34068b).mo31372Ok(erVar);
            return this;
        }

        /* renamed from: Oj */
        public C4622b mo31394Oj(int i) {
            mo43393xj();
            ((b42) this.f34068b).mo31373Pk(i);
            return this;
        }

        /* renamed from: Pj */
        public C4622b mo31395Pj(String str) {
            mo43393xj();
            ((b42) this.f34068b).mo31374Qk(str);
            return this;
        }

        /* renamed from: Qj */
        public C4622b mo31396Qj(C5173er erVar) {
            mo43393xj();
            ((b42) this.f34068b).mo31375Rk(erVar);
            return this;
        }

        /* renamed from: U7 */
        public C5173er mo31376U7() {
            return ((b42) this.f34068b).mo31376U7();
        }

        /* renamed from: a */
        public C5173er mo31377a() {
            return ((b42) this.f34068b).mo31377a();
        }

        /* renamed from: b9 */
        public String mo31378b9() {
            return ((b42) this.f34068b).mo31378b9();
        }

        public String getName() {
            return ((b42) this.f34068b).getName();
        }

        /* renamed from: t6 */
        public String mo31382t6() {
            return ((b42) this.f34068b).mo31382t6();
        }

        /* renamed from: va */
        public int mo31385va() {
            return ((b42) this.f34068b).mo31385va();
        }
    }

    static {
        b42 b42 = new b42();
        DEFAULT_INSTANCE = b42;
        qe1.m62492dk(b42.class, b42);
    }

    /* renamed from: Ak */
    public static b42 m39384Ak(C5173er erVar) throws nt1 {
        return (b42) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Bk */
    public static b42 m39385Bk(C5173er erVar, zy0 zy0) throws nt1 {
        return (b42) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Ck */
    public static b42 m39386Ck(g00 g00) throws IOException {
        return (b42) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Dk */
    public static b42 m39387Dk(g00 g00, zy0 zy0) throws IOException {
        return (b42) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ek */
    public static b42 m39388Ek(InputStream inputStream) throws IOException {
        return (b42) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Fk */
    public static b42 m39389Fk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b42) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Gk */
    public static b42 m39390Gk(ByteBuffer byteBuffer) throws nt1 {
        return (b42) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Hk */
    public static b42 m39391Hk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (b42) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ik */
    public static b42 m39392Ik(byte[] bArr) throws nt1 {
        return (b42) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Jk */
    public static b42 m39393Jk(byte[] bArr, zy0 zy0) throws nt1 {
        return (b42) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Kk */
    public static cz2<b42> m39394Kk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: vk */
    public static b42 m39407vk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: wk */
    public static C4622b m39408wk() {
        return (C4622b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: xk */
    public static C4622b m39409xk(b42 b42) {
        return (C4622b) DEFAULT_INSTANCE.mo43358gj(b42);
    }

    /* renamed from: yk */
    public static b42 m39410yk(InputStream inputStream) throws IOException {
        return (b42) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: zk */
    public static b42 m39411zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b42) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Aa */
    public C5173er mo31368Aa() {
        return C5173er.m47136w(this.filter_);
    }

    /* renamed from: Lk */
    public final void mo31369Lk(String str) {
        str.getClass();
        this.filter_ = str;
    }

    /* renamed from: Mk */
    public final void mo31370Mk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.filter_ = erVar.mo35543k0();
    }

    /* renamed from: Nk */
    public final void mo31371Nk(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Ok */
    public final void mo31372Ok(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Pk */
    public final void mo31373Pk(int i) {
        this.pageSize_ = i;
    }

    /* renamed from: Qk */
    public final void mo31374Qk(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* renamed from: Rk */
    public final void mo31375Rk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.pageToken_ = erVar.mo35543k0();
    }

    /* renamed from: U7 */
    public C5173er mo31376U7() {
        return C5173er.m47136w(this.pageToken_);
    }

    /* renamed from: a */
    public C5173er mo31377a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: b9 */
    public String mo31378b9() {
        return this.filter_;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4621a.f26141a[iVar.ordinal()]) {
            case 1:
                return new b42();
            case 2:
                return new C4622b((C4621a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<b42> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (b42.class) {
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

    /* renamed from: rk */
    public final void mo31380rk() {
        this.filter_ = m39407vk().mo31378b9();
    }

    /* renamed from: sk */
    public final void mo31381sk() {
        this.name_ = m39407vk().getName();
    }

    /* renamed from: t6 */
    public String mo31382t6() {
        return this.pageToken_;
    }

    /* renamed from: tk */
    public final void mo31383tk() {
        this.pageSize_ = 0;
    }

    /* renamed from: uk */
    public final void mo31384uk() {
        this.pageToken_ = m39407vk().mo31382t6();
    }

    /* renamed from: va */
    public int mo31385va() {
        return this.pageSize_;
    }
}
