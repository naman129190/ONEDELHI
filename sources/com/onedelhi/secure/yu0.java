package com.onedelhi.secure;

import com.onedelhi.secure.bv0;
import com.onedelhi.secure.pw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y04;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class yu0 extends qe1<yu0, C7390b> implements av0 {
    /* access modifiers changed from: private */
    public static final yu0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile cz2<yu0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private vs1.C7095k<bv0> enumvalue_ = qe1.m62499pj();
    private String name_ = "";
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();
    private y04 sourceContext_;
    private int syntax_;

    /* renamed from: com.onedelhi.secure.yu0$a */
    public static /* synthetic */ class C7389a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38056a;

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
                f38056a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38056a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.yu0.C7389a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.yu0$b */
    public static final class C7390b extends qe1.C6546b<yu0, C7390b> implements av0 {
        public C7390b() {
            super(yu0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7390b(C7389a aVar) {
            this();
        }

        /* renamed from: A */
        public u84 mo31199A() {
            return ((yu0) this.f34068b).mo31199A();
        }

        /* renamed from: F7 */
        public bv0 mo31200F7(int i) {
            return ((yu0) this.f34068b).mo31200F7(i);
        }

        /* renamed from: Gj */
        public C7390b mo47966Gj(Iterable<? extends bv0> iterable) {
            mo43393xj();
            ((yu0) this.f34068b).mo47939Bk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7390b mo47967Hj(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((yu0) this.f34068b).mo47940Ck(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C7390b mo47968Ij(int i, bv0.C4701b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47941Dk(i, (bv0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: J8 */
        public List<bv0> mo31201J8() {
            return Collections.unmodifiableList(((yu0) this.f34068b).mo31201J8());
        }

        /* renamed from: Jj */
        public C7390b mo47969Jj(int i, bv0 bv0) {
            mo43393xj();
            ((yu0) this.f34068b).mo47941Dk(i, bv0);
            return this;
        }

        /* renamed from: Kj */
        public C7390b mo47970Kj(bv0.C4701b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47942Ek((bv0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lb */
        public int mo31202Lb() {
            return ((yu0) this.f34068b).mo31202Lb();
        }

        /* renamed from: Lj */
        public C7390b mo47971Lj(bv0 bv0) {
            mo43393xj();
            ((yu0) this.f34068b).mo47942Ek(bv0);
            return this;
        }

        /* renamed from: Mj */
        public C7390b mo47972Mj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47943Fk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C7390b mo47973Nj(int i, pw2 pw2) {
            mo43393xj();
            ((yu0) this.f34068b).mo47943Fk(i, pw2);
            return this;
        }

        /* renamed from: Oj */
        public C7390b mo47974Oj(pw2.C6483b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47944Gk((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C7390b mo47975Pj(pw2 pw2) {
            mo43393xj();
            ((yu0) this.f34068b).mo47944Gk(pw2);
            return this;
        }

        /* renamed from: Qj */
        public C7390b mo47976Qj() {
            mo43393xj();
            ((yu0) this.f34068b).mo47945Hk();
            return this;
        }

        /* renamed from: Rj */
        public C7390b mo47977Rj() {
            mo43393xj();
            ((yu0) this.f34068b).mo47946Ik();
            return this;
        }

        /* renamed from: Sj */
        public C7390b mo47978Sj() {
            mo43393xj();
            ((yu0) this.f34068b).mo47947Jk();
            return this;
        }

        /* renamed from: Tj */
        public C7390b mo47979Tj() {
            mo43393xj();
            ((yu0) this.f34068b).mo47948Kk();
            return this;
        }

        /* renamed from: Uj */
        public C7390b mo47980Uj() {
            mo43393xj();
            ((yu0) this.f34068b).mo47949Lk();
            return this;
        }

        /* renamed from: Vj */
        public C7390b mo47981Vj(y04 y04) {
            mo43393xj();
            ((yu0) this.f34068b).mo47956Tk(y04);
            return this;
        }

        /* renamed from: Wj */
        public C7390b mo47982Wj(int i) {
            mo43393xj();
            ((yu0) this.f34068b).mo47957jl(i);
            return this;
        }

        /* renamed from: Xj */
        public C7390b mo47983Xj(int i) {
            mo43393xj();
            ((yu0) this.f34068b).mo47958kl(i);
            return this;
        }

        /* renamed from: Yj */
        public C7390b mo47984Yj(int i, bv0.C4701b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47959ll(i, (bv0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Zj */
        public C7390b mo47985Zj(int i, bv0 bv0) {
            mo43393xj();
            ((yu0) this.f34068b).mo47959ll(i, bv0);
            return this;
        }

        /* renamed from: a */
        public C5173er mo31203a() {
            return ((yu0) this.f34068b).mo31203a();
        }

        /* renamed from: ak */
        public C7390b mo47986ak(String str) {
            mo43393xj();
            ((yu0) this.f34068b).mo47960ml(str);
            return this;
        }

        /* renamed from: bk */
        public C7390b mo47987bk(C5173er erVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47961nl(erVar);
            return this;
        }

        /* renamed from: ck */
        public C7390b mo47988ck(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47962ol(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: dk */
        public C7390b mo47989dk(int i, pw2 pw2) {
            mo43393xj();
            ((yu0) this.f34068b).mo47962ol(i, pw2);
            return this;
        }

        /* renamed from: ek */
        public C7390b mo47990ek(y04.C7296b bVar) {
            mo43393xj();
            ((yu0) this.f34068b).mo47963pl((y04) bVar.mo43381ab());
            return this;
        }

        /* renamed from: fk */
        public C7390b mo47991fk(y04 y04) {
            mo43393xj();
            ((yu0) this.f34068b).mo47963pl(y04);
            return this;
        }

        public String getName() {
            return ((yu0) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C7390b mo47992gk(u84 u84) {
            mo43393xj();
            ((yu0) this.f34068b).mo47964ql(u84);
            return this;
        }

        /* renamed from: hk */
        public C7390b mo47993hk(int i) {
            mo43393xj();
            ((yu0) this.f34068b).mo47965rl(i);
            return this;
        }

        /* renamed from: j0 */
        public boolean mo31205j0() {
            return ((yu0) this.f34068b).mo31205j0();
        }

        /* renamed from: k0 */
        public y04 mo31206k0() {
            return ((yu0) this.f34068b).mo31206k0();
        }

        /* renamed from: s */
        public pw2 mo31207s(int i) {
            return ((yu0) this.f34068b).mo31207s(i);
        }

        /* renamed from: t */
        public int mo31208t() {
            return ((yu0) this.f34068b).mo31208t();
        }

        /* renamed from: u */
        public List<pw2> mo31209u() {
            return Collections.unmodifiableList(((yu0) this.f34068b).mo31209u());
        }

        /* renamed from: y */
        public int mo31210y() {
            return ((yu0) this.f34068b).mo31210y();
        }
    }

    static {
        yu0 yu0 = new yu0();
        DEFAULT_INSTANCE = yu0;
        qe1.m62492dk(yu0.class, yu0);
    }

    /* renamed from: Ok */
    public static yu0 m72087Ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Uk */
    public static C7390b m72088Uk() {
        return (C7390b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Vk */
    public static C7390b m72089Vk(yu0 yu0) {
        return (C7390b) DEFAULT_INSTANCE.mo43358gj(yu0);
    }

    /* renamed from: Wk */
    public static yu0 m72090Wk(InputStream inputStream) throws IOException {
        return (yu0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Xk */
    public static yu0 m72091Xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (yu0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Yk */
    public static yu0 m72092Yk(C5173er erVar) throws nt1 {
        return (yu0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Zk */
    public static yu0 m72093Zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (yu0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: al */
    public static yu0 m72094al(g00 g00) throws IOException {
        return (yu0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: bl */
    public static yu0 m72095bl(g00 g00, zy0 zy0) throws IOException {
        return (yu0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: cl */
    public static yu0 m72096cl(InputStream inputStream) throws IOException {
        return (yu0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: dl */
    public static yu0 m72097dl(InputStream inputStream, zy0 zy0) throws IOException {
        return (yu0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: el */
    public static yu0 m72098el(ByteBuffer byteBuffer) throws nt1 {
        return (yu0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: fl */
    public static yu0 m72100fl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (yu0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: gl */
    public static yu0 m72102gl(byte[] bArr) throws nt1 {
        return (yu0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: hl */
    public static yu0 m72104hl(byte[] bArr, zy0 zy0) throws nt1 {
        return (yu0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: il */
    public static cz2<yu0> m72106il() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A */
    public u84 mo31199A() {
        u84 a = u84.m66907a(this.syntax_);
        return a == null ? u84.UNRECOGNIZED : a;
    }

    /* renamed from: Bk */
    public final void mo47939Bk(Iterable<? extends bv0> iterable) {
        mo47950Mk();
        C7403z0.m72412X6(iterable, this.enumvalue_);
    }

    /* renamed from: Ck */
    public final void mo47940Ck(Iterable<? extends pw2> iterable) {
        mo47951Nk();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: Dk */
    public final void mo47941Dk(int i, bv0 bv0) {
        bv0.getClass();
        mo47950Mk();
        this.enumvalue_.add(i, bv0);
    }

    /* renamed from: Ek */
    public final void mo47942Ek(bv0 bv0) {
        bv0.getClass();
        mo47950Mk();
        this.enumvalue_.add(bv0);
    }

    /* renamed from: F7 */
    public bv0 mo31200F7(int i) {
        return this.enumvalue_.get(i);
    }

    /* renamed from: Fk */
    public final void mo47943Fk(int i, pw2 pw2) {
        pw2.getClass();
        mo47951Nk();
        this.options_.add(i, pw2);
    }

    /* renamed from: Gk */
    public final void mo47944Gk(pw2 pw2) {
        pw2.getClass();
        mo47951Nk();
        this.options_.add(pw2);
    }

    /* renamed from: Hk */
    public final void mo47945Hk() {
        this.enumvalue_ = qe1.m62499pj();
    }

    /* renamed from: Ik */
    public final void mo47946Ik() {
        this.name_ = m72087Ok().getName();
    }

    /* renamed from: J8 */
    public List<bv0> mo31201J8() {
        return this.enumvalue_;
    }

    /* renamed from: Jk */
    public final void mo47947Jk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: Kk */
    public final void mo47948Kk() {
        this.sourceContext_ = null;
    }

    /* renamed from: Lb */
    public int mo31202Lb() {
        return this.enumvalue_.size();
    }

    /* renamed from: Lk */
    public final void mo47949Lk() {
        this.syntax_ = 0;
    }

    /* renamed from: Mk */
    public final void mo47950Mk() {
        vs1.C7095k<bv0> kVar = this.enumvalue_;
        if (!kVar.mo36500p()) {
            this.enumvalue_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Nk */
    public final void mo47951Nk() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Pk */
    public cv0 mo47952Pk(int i) {
        return this.enumvalue_.get(i);
    }

    /* renamed from: Qk */
    public List<? extends cv0> mo47953Qk() {
        return this.enumvalue_;
    }

    /* renamed from: Rk */
    public qw2 mo47954Rk(int i) {
        return this.options_.get(i);
    }

    /* renamed from: Sk */
    public List<? extends qw2> mo47955Sk() {
        return this.options_;
    }

    /* renamed from: Tk */
    public final void mo47956Tk(y04 y04) {
        y04.getClass();
        y04 y042 = this.sourceContext_;
        if (!(y042 == null || y042 == y04.m71080kk())) {
            y04 = (y04) ((y04.C7296b) y04.m71082mk(this.sourceContext_).mo43372Cj(y04)).mo43377Ja();
        }
        this.sourceContext_ = y04;
    }

    /* renamed from: a */
    public C5173er mo31203a() {
        return C5173er.m47136w(this.name_);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: j0 */
    public boolean mo31205j0() {
        return this.sourceContext_ != null;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7389a.f38056a[iVar.ordinal()]) {
            case 1:
                return new yu0();
            case 2:
                return new C7390b((C7389a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", bv0.class, "options_", pw2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<yu0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (yu0.class) {
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
    public final void mo47957jl(int i) {
        mo47950Mk();
        this.enumvalue_.remove(i);
    }

    /* renamed from: k0 */
    public y04 mo31206k0() {
        y04 y04 = this.sourceContext_;
        return y04 == null ? y04.m71080kk() : y04;
    }

    /* renamed from: kl */
    public final void mo47958kl(int i) {
        mo47951Nk();
        this.options_.remove(i);
    }

    /* renamed from: ll */
    public final void mo47959ll(int i, bv0 bv0) {
        bv0.getClass();
        mo47950Mk();
        this.enumvalue_.set(i, bv0);
    }

    /* renamed from: ml */
    public final void mo47960ml(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: nl */
    public final void mo47961nl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: ol */
    public final void mo47962ol(int i, pw2 pw2) {
        pw2.getClass();
        mo47951Nk();
        this.options_.set(i, pw2);
    }

    /* renamed from: pl */
    public final void mo47963pl(y04 y04) {
        y04.getClass();
        this.sourceContext_ = y04;
    }

    /* renamed from: ql */
    public final void mo47964ql(u84 u84) {
        this.syntax_ = u84.mo32392j();
    }

    /* renamed from: rl */
    public final void mo47965rl(int i) {
        this.syntax_ = i;
    }

    /* renamed from: s */
    public pw2 mo31207s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: t */
    public int mo31208t() {
        return this.options_.size();
    }

    /* renamed from: u */
    public List<pw2> mo31209u() {
        return this.options_;
    }

    /* renamed from: y */
    public int mo31210y() {
        return this.syntax_;
    }
}
