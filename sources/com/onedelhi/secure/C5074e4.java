package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.e4 */
public final class C5074e4 extends qe1<C5074e4, C5076b> implements C5211f4 {
    /* access modifiers changed from: private */
    public static final C5074e4 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile cz2<C5074e4> PARSER;
    private String description_ = "";

    /* renamed from: com.onedelhi.secure.e4$a */
    public static /* synthetic */ class C5075a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27691a;

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
                f27691a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27691a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5074e4.C5075a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.e4$b */
    public static final class C5076b extends qe1.C6546b<C5074e4, C5076b> implements C5211f4 {
        public C5076b() {
            super(C5074e4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5076b(C5075a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5076b mo34796Gj() {
            mo43393xj();
            ((C5074e4) this.f34068b).mo34795jk();
            return this;
        }

        /* renamed from: Hj */
        public C5076b mo34797Hj(String str) {
            mo43393xj();
            ((C5074e4) this.f34068b).mo34791Ak(str);
            return this;
        }

        /* renamed from: Ij */
        public C5076b mo34798Ij(C5173er erVar) {
            mo43393xj();
            ((C5074e4) this.f34068b).mo34792Bk(erVar);
            return this;
        }

        /* renamed from: b */
        public C5173er mo34793b() {
            return ((C5074e4) this.f34068b).mo34793b();
        }

        /* renamed from: c */
        public String mo34794c() {
            return ((C5074e4) this.f34068b).mo34794c();
        }
    }

    static {
        C5074e4 e4Var = new C5074e4();
        DEFAULT_INSTANCE = e4Var;
        qe1.m62492dk(C5074e4.class, e4Var);
    }

    /* renamed from: kk */
    public static C5074e4 m45881kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C5076b m45882lk() {
        return (C5076b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C5076b m45883mk(C5074e4 e4Var) {
        return (C5076b) DEFAULT_INSTANCE.mo43358gj(e4Var);
    }

    /* renamed from: nk */
    public static C5074e4 m45884nk(InputStream inputStream) throws IOException {
        return (C5074e4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static C5074e4 m45885ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5074e4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static C5074e4 m45886pk(C5173er erVar) throws nt1 {
        return (C5074e4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static C5074e4 m45887qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5074e4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static C5074e4 m45888rk(g00 g00) throws IOException {
        return (C5074e4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static C5074e4 m45889sk(g00 g00, zy0 zy0) throws IOException {
        return (C5074e4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static C5074e4 m45890tk(InputStream inputStream) throws IOException {
        return (C5074e4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static C5074e4 m45891uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5074e4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static C5074e4 m45892vk(ByteBuffer byteBuffer) throws nt1 {
        return (C5074e4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static C5074e4 m45893wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5074e4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static C5074e4 m45894xk(byte[] bArr) throws nt1 {
        return (C5074e4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static C5074e4 m45895yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5074e4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<C5074e4> m45896zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo34791Ak(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: Bk */
    public final void mo34792Bk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: b */
    public C5173er mo34793b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo34794c() {
        return this.description_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5075a.f27691a[iVar.ordinal()]) {
            case 1:
                return new C5074e4();
            case 2:
                return new C5076b((C5075a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5074e4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5074e4.class) {
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

    /* renamed from: jk */
    public final void mo34795jk() {
        this.description_ = m45881kk().mo34794c();
    }
}
