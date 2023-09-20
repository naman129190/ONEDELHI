package com.onedelhi.secure;

import com.onedelhi.secure.C6263oc;
import com.onedelhi.secure.bt2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.yc */
public final class C7324yc extends qe1<C7324yc, C7326b> implements C7467zc {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final C7324yc DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile cz2<C7324yc> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private bt2 oauth_;
    private vs1.C7095k<C6263oc> requirements_ = qe1.m62499pj();
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.yc$a */
    public static /* synthetic */ class C7325a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37860a;

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
                f37860a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37860a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7324yc.C7325a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.yc$b */
    public static final class C7326b extends qe1.C6546b<C7324yc, C7326b> implements C7467zc {
        public C7326b() {
            super(C7324yc.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7326b(C7325a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7326b mo47699Gj(Iterable<? extends C6263oc> iterable) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47692uk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7326b mo47700Hj(int i, C6263oc.C6265b bVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47693vk(i, (C6263oc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C7326b mo47701Ij(int i, C6263oc ocVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47693vk(i, ocVar);
            return this;
        }

        /* renamed from: Jj */
        public C7326b mo47702Jj(C6263oc.C6265b bVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47694wk((C6263oc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C7326b mo47703Kj(C6263oc ocVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47694wk(ocVar);
            return this;
        }

        /* renamed from: Lj */
        public C7326b mo47704Lj() {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47695xk();
            return this;
        }

        /* renamed from: Mj */
        public C7326b mo47705Mj() {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47696yk();
            return this;
        }

        /* renamed from: Nj */
        public C7326b mo47706Nj() {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47698zk();
            return this;
        }

        /* renamed from: Oj */
        public C7326b mo47707Oj() {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47674Ak();
            return this;
        }

        /* renamed from: Pj */
        public C7326b mo47708Pj(bt2 bt2) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47678Fk(bt2);
            return this;
        }

        /* renamed from: Qj */
        public C7326b mo47709Qj(int i) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47679Vk(i);
            return this;
        }

        /* renamed from: Rj */
        public C7326b mo47710Rj(boolean z) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47680Wk(z);
            return this;
        }

        /* renamed from: Sj */
        public C7326b mo47711Sj(bt2.C4696b bVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47682Xk((bt2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tj */
        public C7326b mo47712Tj(bt2 bt2) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47682Xk(bt2);
            return this;
        }

        /* renamed from: Uj */
        public C7326b mo47713Uj(int i, C6263oc.C6265b bVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47683Yk(i, (C6263oc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C7326b mo47714Vj(int i, C6263oc ocVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47683Yk(i, ocVar);
            return this;
        }

        /* renamed from: Wj */
        public C7326b mo47715Wj(String str) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47684Zk(str);
            return this;
        }

        /* renamed from: X0 */
        public List<C6263oc> mo47681X0() {
            return Collections.unmodifiableList(((C7324yc) this.f34068b).mo47681X0());
        }

        /* renamed from: Xj */
        public C7326b mo47716Xj(C5173er erVar) {
            mo43393xj();
            ((C7324yc) this.f34068b).mo47685al(erVar);
            return this;
        }

        /* renamed from: db */
        public C6263oc mo47686db(int i) {
            return ((C7324yc) this.f34068b).mo47686db(i);
        }

        /* renamed from: k */
        public String mo47687k() {
            return ((C7324yc) this.f34068b).mo47687k();
        }

        /* renamed from: k3 */
        public boolean mo47688k3() {
            return ((C7324yc) this.f34068b).mo47688k3();
        }

        /* renamed from: l */
        public C5173er mo47689l() {
            return ((C7324yc) this.f34068b).mo47689l();
        }

        /* renamed from: pa */
        public bt2 mo47690pa() {
            return ((C7324yc) this.f34068b).mo47690pa();
        }

        /* renamed from: qd */
        public boolean mo47691qd() {
            return ((C7324yc) this.f34068b).mo47691qd();
        }

        /* renamed from: z0 */
        public int mo47697z0() {
            return ((C7324yc) this.f34068b).mo47697z0();
        }
    }

    static {
        C7324yc ycVar = new C7324yc();
        DEFAULT_INSTANCE = ycVar;
        qe1.m62492dk(C7324yc.class, ycVar);
    }

    /* renamed from: Ck */
    public static C7324yc m71487Ck() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Gk */
    public static C7326b m71488Gk() {
        return (C7326b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Hk */
    public static C7326b m71489Hk(C7324yc ycVar) {
        return (C7326b) DEFAULT_INSTANCE.mo43358gj(ycVar);
    }

    /* renamed from: Ik */
    public static C7324yc m71490Ik(InputStream inputStream) throws IOException {
        return (C7324yc) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Jk */
    public static C7324yc m71491Jk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7324yc) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Kk */
    public static C7324yc m71492Kk(C5173er erVar) throws nt1 {
        return (C7324yc) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Lk */
    public static C7324yc m71493Lk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C7324yc) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Mk */
    public static C7324yc m71494Mk(g00 g00) throws IOException {
        return (C7324yc) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Nk */
    public static C7324yc m71495Nk(g00 g00, zy0 zy0) throws IOException {
        return (C7324yc) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ok */
    public static C7324yc m71496Ok(InputStream inputStream) throws IOException {
        return (C7324yc) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Pk */
    public static C7324yc m71497Pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C7324yc) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Qk */
    public static C7324yc m71498Qk(ByteBuffer byteBuffer) throws nt1 {
        return (C7324yc) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Rk */
    public static C7324yc m71499Rk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C7324yc) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Sk */
    public static C7324yc m71500Sk(byte[] bArr) throws nt1 {
        return (C7324yc) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Tk */
    public static C7324yc m71501Tk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C7324yc) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Uk */
    public static cz2<C7324yc> m71502Uk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo47674Ak() {
        this.selector_ = m71487Ck().mo47687k();
    }

    /* renamed from: Bk */
    public final void mo47675Bk() {
        vs1.C7095k<C6263oc> kVar = this.requirements_;
        if (!kVar.mo36500p()) {
            this.requirements_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Dk */
    public C6423pc mo47676Dk(int i) {
        return this.requirements_.get(i);
    }

    /* renamed from: Ek */
    public List<? extends C6423pc> mo47677Ek() {
        return this.requirements_;
    }

    /* renamed from: Fk */
    public final void mo47678Fk(bt2 bt2) {
        bt2.getClass();
        bt2 bt22 = this.oauth_;
        if (!(bt22 == null || bt22 == bt2.m40336kk())) {
            bt2 = (bt2) ((bt2.C4696b) bt2.m40338mk(this.oauth_).mo43372Cj(bt2)).mo43377Ja();
        }
        this.oauth_ = bt2;
    }

    /* renamed from: Vk */
    public final void mo47679Vk(int i) {
        mo47675Bk();
        this.requirements_.remove(i);
    }

    /* renamed from: Wk */
    public final void mo47680Wk(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    /* renamed from: X0 */
    public List<C6263oc> mo47681X0() {
        return this.requirements_;
    }

    /* renamed from: Xk */
    public final void mo47682Xk(bt2 bt2) {
        bt2.getClass();
        this.oauth_ = bt2;
    }

    /* renamed from: Yk */
    public final void mo47683Yk(int i, C6263oc ocVar) {
        ocVar.getClass();
        mo47675Bk();
        this.requirements_.set(i, ocVar);
    }

    /* renamed from: Zk */
    public final void mo47684Zk(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: al */
    public final void mo47685al(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: db */
    public C6263oc mo47686db(int i) {
        return this.requirements_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7325a.f37860a[iVar.ordinal()]) {
            case 1:
                return new C7324yc();
            case 2:
                return new C7326b((C7325a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", C6263oc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C7324yc> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C7324yc.class) {
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
    public String mo47687k() {
        return this.selector_;
    }

    /* renamed from: k3 */
    public boolean mo47688k3() {
        return this.oauth_ != null;
    }

    /* renamed from: l */
    public C5173er mo47689l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: pa */
    public bt2 mo47690pa() {
        bt2 bt2 = this.oauth_;
        return bt2 == null ? bt2.m40336kk() : bt2;
    }

    /* renamed from: qd */
    public boolean mo47691qd() {
        return this.allowWithoutCredential_;
    }

    /* renamed from: uk */
    public final void mo47692uk(Iterable<? extends C6263oc> iterable) {
        mo47675Bk();
        C7403z0.m72412X6(iterable, this.requirements_);
    }

    /* renamed from: vk */
    public final void mo47693vk(int i, C6263oc ocVar) {
        ocVar.getClass();
        mo47675Bk();
        this.requirements_.add(i, ocVar);
    }

    /* renamed from: wk */
    public final void mo47694wk(C6263oc ocVar) {
        ocVar.getClass();
        mo47675Bk();
        this.requirements_.add(ocVar);
    }

    /* renamed from: xk */
    public final void mo47695xk() {
        this.allowWithoutCredential_ = false;
    }

    /* renamed from: yk */
    public final void mo47696yk() {
        this.oauth_ = null;
    }

    /* renamed from: z0 */
    public int mo47697z0() {
        return this.requirements_.size();
    }

    /* renamed from: zk */
    public final void mo47698zk() {
        this.requirements_ = qe1.m62499pj();
    }
}
