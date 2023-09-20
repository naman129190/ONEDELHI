package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.vc */
public final class C7024vc extends qe1<C7024vc, C7026b> implements C7151wc {
    /* access modifiers changed from: private */
    public static final C7024vc DEFAULT_INSTANCE;
    private static volatile cz2<C7024vc> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    /* renamed from: com.onedelhi.secure.vc$a */
    public static /* synthetic */ class C7025a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36481a;

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
                f36481a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36481a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7024vc.C7025a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.vc$b */
    public static final class C7026b extends qe1.C6546b<C7024vc, C7026b> implements C7151wc {
        public C7026b() {
            super(C7024vc.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7026b(C7025a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7026b mo46080Gj() {
            mo43393xj();
            ((C7024vc) this.f34068b).mo46078jk();
            return this;
        }

        /* renamed from: Hj */
        public C7026b mo46081Hj(String str) {
            mo43393xj();
            ((C7024vc) this.f34068b).mo46075Ak(str);
            return this;
        }

        /* renamed from: Ij */
        public C7026b mo46082Ij(C5173er erVar) {
            mo43393xj();
            ((C7024vc) this.f34068b).mo46076Bk(erVar);
            return this;
        }

        /* renamed from: ge */
        public C5173er mo46077ge() {
            return ((C7024vc) this.f34068b).mo46077ge();
        }

        /* renamed from: xd */
        public String mo46079xd() {
            return ((C7024vc) this.f34068b).mo46079xd();
        }
    }

    static {
        C7024vc vcVar = new C7024vc();
        DEFAULT_INSTANCE = vcVar;
        qe1.m62492dk(C7024vc.class, vcVar);
    }

    /* renamed from: kk */
    public static C7024vc m67850kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: lk */
    public static C7026b m67851lk() {
        return (C7026b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: mk */
    public static C7026b m67852mk(C7024vc vcVar) {
        return (C7026b) DEFAULT_INSTANCE.mo43358gj(vcVar);
    }

    /* renamed from: nk */
    public static C7024vc m67853nk(InputStream inputStream) throws IOException {
        return (C7024vc) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ok */
    public static C7024vc m67854ok(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7024vc) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pk */
    public static C7024vc m67855pk(C5173er erVar) throws nt1 {
        return (C7024vc) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: qk */
    public static C7024vc m67856qk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C7024vc) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rk */
    public static C7024vc m67857rk(g00 g00) throws IOException {
        return (C7024vc) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sk */
    public static C7024vc m67858sk(g00 g00, zy0 zy0) throws IOException {
        return (C7024vc) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tk */
    public static C7024vc m67859tk(InputStream inputStream) throws IOException {
        return (C7024vc) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: uk */
    public static C7024vc m67860uk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7024vc) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vk */
    public static C7024vc m67861vk(ByteBuffer byteBuffer) throws nt1 {
        return (C7024vc) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wk */
    public static C7024vc m67862wk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C7024vc) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xk */
    public static C7024vc m67863xk(byte[] bArr) throws nt1 {
        return (C7024vc) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yk */
    public static C7024vc m67864yk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C7024vc) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zk */
    public static cz2<C7024vc> m67865zk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo46075Ak(String str) {
        str.getClass();
        this.principalEmail_ = str;
    }

    /* renamed from: Bk */
    public final void mo46076Bk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.principalEmail_ = erVar.mo35543k0();
    }

    /* renamed from: ge */
    public C5173er mo46077ge() {
        return C5173er.m47136w(this.principalEmail_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7025a.f36481a[iVar.ordinal()]) {
            case 1:
                return new C7024vc();
            case 2:
                return new C7026b((C7025a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C7024vc> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C7024vc.class) {
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
    public final void mo46078jk() {
        this.principalEmail_ = m67850kk().mo46079xd();
    }

    /* renamed from: xd */
    public String mo46079xd() {
        return this.principalEmail_;
    }
}
