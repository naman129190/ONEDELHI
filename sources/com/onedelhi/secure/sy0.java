package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class sy0 extends qe1<sy0, C6799b> implements ty0 {
    /* access modifiers changed from: private */
    public static final sy0 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile cz2<sy0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String expression_ = "";
    private String location_ = "";
    private String title_ = "";

    /* renamed from: com.onedelhi.secure.sy0$a */
    public static /* synthetic */ class C6798a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35244a;

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
                f35244a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35244a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sy0.C6798a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.sy0$b */
    public static final class C6799b extends qe1.C6546b<sy0, C6799b> implements ty0 {
        public C6799b() {
            super(sy0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6799b(C6798a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6799b mo44609Gj() {
            mo43393xj();
            ((sy0) this.f34068b).mo44604sk();
            return this;
        }

        /* renamed from: Hj */
        public C6799b mo44610Hj() {
            mo43393xj();
            ((sy0) this.f34068b).mo44606tk();
            return this;
        }

        /* renamed from: Ij */
        public C6799b mo44611Ij() {
            mo43393xj();
            ((sy0) this.f34068b).mo44607uk();
            return this;
        }

        /* renamed from: Jj */
        public C6799b mo44612Jj() {
            mo43393xj();
            ((sy0) this.f34068b).mo44608vk();
            return this;
        }

        /* renamed from: Kj */
        public C6799b mo44613Kj(String str) {
            mo43393xj();
            ((sy0) this.f34068b).mo44589Mk(str);
            return this;
        }

        /* renamed from: Lj */
        public C6799b mo44614Lj(C5173er erVar) {
            mo43393xj();
            ((sy0) this.f34068b).mo44590Nk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C6799b mo44615Mj(String str) {
            mo43393xj();
            ((sy0) this.f34068b).mo44591Ok(str);
            return this;
        }

        /* renamed from: Nj */
        public C6799b mo44616Nj(C5173er erVar) {
            mo43393xj();
            ((sy0) this.f34068b).mo44592Pk(erVar);
            return this;
        }

        /* renamed from: Oj */
        public C6799b mo44617Oj(String str) {
            mo43393xj();
            ((sy0) this.f34068b).mo44593Qk(str);
            return this;
        }

        /* renamed from: Pj */
        public C6799b mo44618Pj(C5173er erVar) {
            mo43393xj();
            ((sy0) this.f34068b).mo44595Rk(erVar);
            return this;
        }

        /* renamed from: Qj */
        public C6799b mo44619Qj(String str) {
            mo43393xj();
            ((sy0) this.f34068b).mo44596Sk(str);
            return this;
        }

        /* renamed from: R1 */
        public String mo44594R1() {
            return ((sy0) this.f34068b).mo44594R1();
        }

        /* renamed from: Rj */
        public C6799b mo44620Rj(C5173er erVar) {
            mo43393xj();
            ((sy0) this.f34068b).mo44598Tk(erVar);
            return this;
        }

        /* renamed from: Td */
        public String mo44597Td() {
            return ((sy0) this.f34068b).mo44597Td();
        }

        /* renamed from: W1 */
        public C5173er mo44599W1() {
            return ((sy0) this.f34068b).mo44599W1();
        }

        /* renamed from: b */
        public C5173er mo44600b() {
            return ((sy0) this.f34068b).mo44600b();
        }

        /* renamed from: c */
        public String mo44601c() {
            return ((sy0) this.f34068b).mo44601c();
        }

        /* renamed from: g3 */
        public C5173er mo44602g3() {
            return ((sy0) this.f34068b).mo44602g3();
        }

        /* renamed from: i7 */
        public C5173er mo44603i7() {
            return ((sy0) this.f34068b).mo44603i7();
        }

        /* renamed from: tc */
        public String mo44605tc() {
            return ((sy0) this.f34068b).mo44605tc();
        }
    }

    static {
        sy0 sy0 = new sy0();
        DEFAULT_INSTANCE = sy0;
        qe1.m62492dk(sy0.class, sy0);
    }

    /* renamed from: Ak */
    public static sy0 m64950Ak(InputStream inputStream, zy0 zy0) throws IOException {
        return (sy0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Bk */
    public static sy0 m64951Bk(C5173er erVar) throws nt1 {
        return (sy0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Ck */
    public static sy0 m64952Ck(C5173er erVar, zy0 zy0) throws nt1 {
        return (sy0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Dk */
    public static sy0 m64953Dk(g00 g00) throws IOException {
        return (sy0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ek */
    public static sy0 m64954Ek(g00 g00, zy0 zy0) throws IOException {
        return (sy0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Fk */
    public static sy0 m64955Fk(InputStream inputStream) throws IOException {
        return (sy0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Gk */
    public static sy0 m64956Gk(InputStream inputStream, zy0 zy0) throws IOException {
        return (sy0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Hk */
    public static sy0 m64957Hk(ByteBuffer byteBuffer) throws nt1 {
        return (sy0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ik */
    public static sy0 m64958Ik(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (sy0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Jk */
    public static sy0 m64959Jk(byte[] bArr) throws nt1 {
        return (sy0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Kk */
    public static sy0 m64960Kk(byte[] bArr, zy0 zy0) throws nt1 {
        return (sy0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Lk */
    public static cz2<sy0> m64961Lk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: wk */
    public static sy0 m64975wk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: xk */
    public static C6799b m64976xk() {
        return (C6799b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: yk */
    public static C6799b m64977yk(sy0 sy0) {
        return (C6799b) DEFAULT_INSTANCE.mo43358gj(sy0);
    }

    /* renamed from: zk */
    public static sy0 m64978zk(InputStream inputStream) throws IOException {
        return (sy0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Mk */
    public final void mo44589Mk(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: Nk */
    public final void mo44590Nk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: Ok */
    public final void mo44591Ok(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* renamed from: Pk */
    public final void mo44592Pk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.expression_ = erVar.mo35543k0();
    }

    /* renamed from: Qk */
    public final void mo44593Qk(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* renamed from: R1 */
    public String mo44594R1() {
        return this.title_;
    }

    /* renamed from: Rk */
    public final void mo44595Rk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.location_ = erVar.mo35543k0();
    }

    /* renamed from: Sk */
    public final void mo44596Sk(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* renamed from: Td */
    public String mo44597Td() {
        return this.location_;
    }

    /* renamed from: Tk */
    public final void mo44598Tk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.title_ = erVar.mo35543k0();
    }

    /* renamed from: W1 */
    public C5173er mo44599W1() {
        return C5173er.m47136w(this.title_);
    }

    /* renamed from: b */
    public C5173er mo44600b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo44601c() {
        return this.description_;
    }

    /* renamed from: g3 */
    public C5173er mo44602g3() {
        return C5173er.m47136w(this.location_);
    }

    /* renamed from: i7 */
    public C5173er mo44603i7() {
        return C5173er.m47136w(this.expression_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6798a.f35244a[iVar.ordinal()]) {
            case 1:
                return new sy0();
            case 2:
                return new C6799b((C6798a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<sy0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (sy0.class) {
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
    public final void mo44604sk() {
        this.description_ = m64975wk().mo44601c();
    }

    /* renamed from: tc */
    public String mo44605tc() {
        return this.expression_;
    }

    /* renamed from: tk */
    public final void mo44606tk() {
        this.expression_ = m64975wk().mo44605tc();
    }

    /* renamed from: uk */
    public final void mo44607uk() {
        this.location_ = m64975wk().mo44597Td();
    }

    /* renamed from: vk */
    public final void mo44608vk() {
        this.title_ = m64975wk().mo44594R1();
    }
}
