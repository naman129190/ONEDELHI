package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.yn0;
import com.onedelhi.secure.yx2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class vn0 extends qe1<vn0, C7064b> implements wn0 {
    /* access modifiers changed from: private */
    public static final vn0 DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile cz2<vn0> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private vs1.C7095k<yx2> pages_ = qe1.m62499pj();
    private vs1.C7095k<yn0> rules_ = qe1.m62499pj();
    private String summary_ = "";

    /* renamed from: com.onedelhi.secure.vn0$a */
    public static /* synthetic */ class C7063a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36596a;

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
                f36596a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36596a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vn0.C7063a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.vn0$b */
    public static final class C7064b extends qe1.C6546b<vn0, C7064b> implements wn0 {
        public C7064b() {
            super(vn0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7064b(C7063a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7064b mo46245Gj(Iterable<? extends yx2> iterable) {
            mo43393xj();
            ((vn0) this.f34068b).mo46206Bk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7064b mo46246Hj(Iterable<? extends yn0> iterable) {
            mo43393xj();
            ((vn0) this.f34068b).mo46207Ck(iterable);
            return this;
        }

        /* renamed from: I6 */
        public yn0 mo46213I6(int i) {
            return ((vn0) this.f34068b).mo46213I6(i);
        }

        /* renamed from: Ij */
        public C7064b mo46247Ij(int i, yx2.C7398b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46208Dk(i, (yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jh */
        public C5173er mo46215Jh() {
            return ((vn0) this.f34068b).mo46215Jh();
        }

        /* renamed from: Jj */
        public C7064b mo46248Jj(int i, yx2 yx2) {
            mo43393xj();
            ((vn0) this.f34068b).mo46208Dk(i, yx2);
            return this;
        }

        /* renamed from: Kf */
        public String mo46217Kf() {
            return ((vn0) this.f34068b).mo46217Kf();
        }

        /* renamed from: Kj */
        public C7064b mo46249Kj(yx2.C7398b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46209Ek((yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C7064b mo46250Lj(yx2 yx2) {
            mo43393xj();
            ((vn0) this.f34068b).mo46209Ek(yx2);
            return this;
        }

        /* renamed from: Mj */
        public C7064b mo46251Mj(int i, yn0.C7379b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46210Fk(i, (yn0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C7064b mo46252Nj(int i, yn0 yn0) {
            mo43393xj();
            ((vn0) this.f34068b).mo46210Fk(i, yn0);
            return this;
        }

        /* renamed from: Oj */
        public C7064b mo46253Oj(yn0.C7379b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46211Gk((yn0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pi */
        public C5173er mo46222Pi() {
            return ((vn0) this.f34068b).mo46222Pi();
        }

        /* renamed from: Pj */
        public C7064b mo46254Pj(yn0 yn0) {
            mo43393xj();
            ((vn0) this.f34068b).mo46211Gk(yn0);
            return this;
        }

        /* renamed from: Qj */
        public C7064b mo46255Qj() {
            mo43393xj();
            ((vn0) this.f34068b).mo46212Hk();
            return this;
        }

        /* renamed from: Rj */
        public C7064b mo46256Rj() {
            mo43393xj();
            ((vn0) this.f34068b).mo46214Ik();
            return this;
        }

        /* renamed from: Sj */
        public C7064b mo46257Sj() {
            mo43393xj();
            ((vn0) this.f34068b).mo46216Jk();
            return this;
        }

        /* renamed from: Tj */
        public C7064b mo46258Tj() {
            mo43393xj();
            ((vn0) this.f34068b).mo46218Kk();
            return this;
        }

        /* renamed from: Uc */
        public C5173er mo46227Uc() {
            return ((vn0) this.f34068b).mo46227Uc();
        }

        /* renamed from: Uj */
        public C7064b mo46259Uj() {
            mo43393xj();
            ((vn0) this.f34068b).mo46219Lk();
            return this;
        }

        /* renamed from: Vj */
        public C7064b mo46260Vj(int i) {
            mo43393xj();
            ((vn0) this.f34068b).mo46228il(i);
            return this;
        }

        /* renamed from: Wj */
        public C7064b mo46261Wj(int i) {
            mo43393xj();
            ((vn0) this.f34068b).mo46229jl(i);
            return this;
        }

        /* renamed from: Xj */
        public C7064b mo46262Xj(String str) {
            mo43393xj();
            ((vn0) this.f34068b).mo46230kl(str);
            return this;
        }

        /* renamed from: Yj */
        public C7064b mo46263Yj(C5173er erVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46231ll(erVar);
            return this;
        }

        /* renamed from: Zj */
        public C7064b mo46264Zj(String str) {
            mo43393xj();
            ((vn0) this.f34068b).mo46232ml(str);
            return this;
        }

        /* renamed from: ak */
        public C7064b mo46265ak(C5173er erVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46235nl(erVar);
            return this;
        }

        /* renamed from: bk */
        public C7064b mo46266bk(int i, yx2.C7398b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46237ol(i, (yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ck */
        public C7064b mo46267ck(int i, yx2 yx2) {
            mo43393xj();
            ((vn0) this.f34068b).mo46237ol(i, yx2);
            return this;
        }

        /* renamed from: dk */
        public C7064b mo46268dk(int i, yn0.C7379b bVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46238pl(i, (yn0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ek */
        public C7064b mo46269ek(int i, yn0 yn0) {
            mo43393xj();
            ((vn0) this.f34068b).mo46238pl(i, yn0);
            return this;
        }

        /* renamed from: fk */
        public C7064b mo46270fk(String str) {
            mo43393xj();
            ((vn0) this.f34068b).mo46240ql(str);
            return this;
        }

        /* renamed from: gk */
        public C7064b mo46271gk(C5173er erVar) {
            mo43393xj();
            ((vn0) this.f34068b).mo46242rl(erVar);
            return this;
        }

        /* renamed from: n6 */
        public String mo46233n6() {
            return ((vn0) this.f34068b).mo46233n6();
        }

        /* renamed from: ne */
        public List<yx2> mo46234ne() {
            return Collections.unmodifiableList(((vn0) this.f34068b).mo46234ne());
        }

        /* renamed from: o */
        public List<yn0> mo46236o() {
            return Collections.unmodifiableList(((vn0) this.f34068b).mo46236o());
        }

        /* renamed from: q */
        public int mo46239q() {
            return ((vn0) this.f34068b).mo46239q();
        }

        /* renamed from: ri */
        public yx2 mo46241ri(int i) {
            return ((vn0) this.f34068b).mo46241ri(i);
        }

        /* renamed from: w4 */
        public String mo46243w4() {
            return ((vn0) this.f34068b).mo46243w4();
        }

        /* renamed from: zh */
        public int mo46244zh() {
            return ((vn0) this.f34068b).mo46244zh();
        }
    }

    static {
        vn0 vn0 = new vn0();
        DEFAULT_INSTANCE = vn0;
        qe1.m62492dk(vn0.class, vn0);
    }

    /* renamed from: Ok */
    public static vn0 m68242Ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Tk */
    public static C7064b m68243Tk() {
        return (C7064b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Uk */
    public static C7064b m68244Uk(vn0 vn0) {
        return (C7064b) DEFAULT_INSTANCE.mo43358gj(vn0);
    }

    /* renamed from: Vk */
    public static vn0 m68245Vk(InputStream inputStream) throws IOException {
        return (vn0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Wk */
    public static vn0 m68246Wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (vn0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Xk */
    public static vn0 m68247Xk(C5173er erVar) throws nt1 {
        return (vn0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Yk */
    public static vn0 m68248Yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (vn0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Zk */
    public static vn0 m68249Zk(g00 g00) throws IOException {
        return (vn0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: al */
    public static vn0 m68250al(g00 g00, zy0 zy0) throws IOException {
        return (vn0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: bl */
    public static vn0 m68251bl(InputStream inputStream) throws IOException {
        return (vn0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: cl */
    public static vn0 m68252cl(InputStream inputStream, zy0 zy0) throws IOException {
        return (vn0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: dl */
    public static vn0 m68253dl(ByteBuffer byteBuffer) throws nt1 {
        return (vn0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: el */
    public static vn0 m68254el(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (vn0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: fl */
    public static vn0 m68256fl(byte[] bArr) throws nt1 {
        return (vn0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: gl */
    public static vn0 m68258gl(byte[] bArr, zy0 zy0) throws nt1 {
        return (vn0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: hl */
    public static cz2<vn0> m68260hl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bk */
    public final void mo46206Bk(Iterable<? extends yx2> iterable) {
        mo46220Mk();
        C7403z0.m72412X6(iterable, this.pages_);
    }

    /* renamed from: Ck */
    public final void mo46207Ck(Iterable<? extends yn0> iterable) {
        mo46221Nk();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: Dk */
    public final void mo46208Dk(int i, yx2 yx2) {
        yx2.getClass();
        mo46220Mk();
        this.pages_.add(i, yx2);
    }

    /* renamed from: Ek */
    public final void mo46209Ek(yx2 yx2) {
        yx2.getClass();
        mo46220Mk();
        this.pages_.add(yx2);
    }

    /* renamed from: Fk */
    public final void mo46210Fk(int i, yn0 yn0) {
        yn0.getClass();
        mo46221Nk();
        this.rules_.add(i, yn0);
    }

    /* renamed from: Gk */
    public final void mo46211Gk(yn0 yn0) {
        yn0.getClass();
        mo46221Nk();
        this.rules_.add(yn0);
    }

    /* renamed from: Hk */
    public final void mo46212Hk() {
        this.documentationRootUrl_ = m68242Ok().mo46217Kf();
    }

    /* renamed from: I6 */
    public yn0 mo46213I6(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: Ik */
    public final void mo46214Ik() {
        this.overview_ = m68242Ok().mo46233n6();
    }

    /* renamed from: Jh */
    public C5173er mo46215Jh() {
        return C5173er.m47136w(this.documentationRootUrl_);
    }

    /* renamed from: Jk */
    public final void mo46216Jk() {
        this.pages_ = qe1.m62499pj();
    }

    /* renamed from: Kf */
    public String mo46217Kf() {
        return this.documentationRootUrl_;
    }

    /* renamed from: Kk */
    public final void mo46218Kk() {
        this.rules_ = qe1.m62499pj();
    }

    /* renamed from: Lk */
    public final void mo46219Lk() {
        this.summary_ = m68242Ok().mo46243w4();
    }

    /* renamed from: Mk */
    public final void mo46220Mk() {
        vs1.C7095k<yx2> kVar = this.pages_;
        if (!kVar.mo36500p()) {
            this.pages_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Nk */
    public final void mo46221Nk() {
        vs1.C7095k<yn0> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Pi */
    public C5173er mo46222Pi() {
        return C5173er.m47136w(this.summary_);
    }

    /* renamed from: Pk */
    public zx2 mo46223Pk(int i) {
        return this.pages_.get(i);
    }

    /* renamed from: Qk */
    public List<? extends zx2> mo46224Qk() {
        return this.pages_;
    }

    /* renamed from: Rk */
    public zn0 mo46225Rk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: Sk */
    public List<? extends zn0> mo46226Sk() {
        return this.rules_;
    }

    /* renamed from: Uc */
    public C5173er mo46227Uc() {
        return C5173er.m47136w(this.overview_);
    }

    /* renamed from: il */
    public final void mo46228il(int i) {
        mo46220Mk();
        this.pages_.remove(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7063a.f36596a[iVar.ordinal()]) {
            case 1:
                return new vn0();
            case 2:
                return new C7064b((C7063a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", yn0.class, "documentationRootUrl_", "pages_", yx2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<vn0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (vn0.class) {
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
    public final void mo46229jl(int i) {
        mo46221Nk();
        this.rules_.remove(i);
    }

    /* renamed from: kl */
    public final void mo46230kl(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* renamed from: ll */
    public final void mo46231ll(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.documentationRootUrl_ = erVar.mo35543k0();
    }

    /* renamed from: ml */
    public final void mo46232ml(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* renamed from: n6 */
    public String mo46233n6() {
        return this.overview_;
    }

    /* renamed from: ne */
    public List<yx2> mo46234ne() {
        return this.pages_;
    }

    /* renamed from: nl */
    public final void mo46235nl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.overview_ = erVar.mo35543k0();
    }

    /* renamed from: o */
    public List<yn0> mo46236o() {
        return this.rules_;
    }

    /* renamed from: ol */
    public final void mo46237ol(int i, yx2 yx2) {
        yx2.getClass();
        mo46220Mk();
        this.pages_.set(i, yx2);
    }

    /* renamed from: pl */
    public final void mo46238pl(int i, yn0 yn0) {
        yn0.getClass();
        mo46221Nk();
        this.rules_.set(i, yn0);
    }

    /* renamed from: q */
    public int mo46239q() {
        return this.rules_.size();
    }

    /* renamed from: ql */
    public final void mo46240ql(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* renamed from: ri */
    public yx2 mo46241ri(int i) {
        return this.pages_.get(i);
    }

    /* renamed from: rl */
    public final void mo46242rl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.summary_ = erVar.mo35543k0();
    }

    /* renamed from: w4 */
    public String mo46243w4() {
        return this.summary_;
    }

    /* renamed from: zh */
    public int mo46244zh() {
        return this.pages_.size();
    }
}
