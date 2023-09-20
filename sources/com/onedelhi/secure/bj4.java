package com.onedelhi.secure;

import com.onedelhi.secure.pw2;
import com.onedelhi.secure.q11;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y04;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class bj4 extends qe1<bj4, C4677b> implements nj4 {
    /* access modifiers changed from: private */
    public static final bj4 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile cz2<bj4> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private vs1.C7095k<q11> fields_ = qe1.m62499pj();
    private String name_ = "";
    private vs1.C7095k<String> oneofs_ = qe1.m62499pj();
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();
    private y04 sourceContext_;
    private int syntax_;

    /* renamed from: com.onedelhi.secure.bj4$a */
    public static /* synthetic */ class C4676a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26386a;

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
                f26386a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26386a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bj4.C4676a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.bj4$b */
    public static final class C4677b extends qe1.C6546b<bj4, C4677b> implements nj4 {
        public C4677b() {
            super(bj4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4677b(C4676a aVar) {
            this();
        }

        /* renamed from: A */
        public u84 mo31819A() {
            return ((bj4) this.f34068b).mo31819A();
        }

        /* renamed from: Ge */
        public q11 mo31823Ge(int i) {
            return ((bj4) this.f34068b).mo31823Ge(i);
        }

        /* renamed from: Gj */
        public C4677b mo31868Gj(Iterable<? extends q11> iterable) {
            mo43393xj();
            ((bj4) this.f34068b).mo31824Gk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C4677b mo31869Hj(Iterable<String> iterable) {
            mo43393xj();
            ((bj4) this.f34068b).mo31825Hk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C4677b mo31870Ij(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((bj4) this.f34068b).mo31826Ik(iterable);
            return this;
        }

        /* renamed from: Jj */
        public C4677b mo31871Jj(int i, q11.C6494b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31827Jk(i, (q11) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kc */
        public int mo31828Kc() {
            return ((bj4) this.f34068b).mo31828Kc();
        }

        /* renamed from: Kj */
        public C4677b mo31872Kj(int i, q11 q11) {
            mo43393xj();
            ((bj4) this.f34068b).mo31827Jk(i, q11);
            return this;
        }

        /* renamed from: Lj */
        public C4677b mo31873Lj(q11.C6494b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31829Kk((q11) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Mj */
        public C4677b mo31874Mj(q11 q11) {
            mo43393xj();
            ((bj4) this.f34068b).mo31829Kk(q11);
            return this;
        }

        /* renamed from: Nj */
        public C4677b mo31875Nj(String str) {
            mo43393xj();
            ((bj4) this.f34068b).mo31830Lk(str);
            return this;
        }

        /* renamed from: O5 */
        public List<q11> mo31833O5() {
            return Collections.unmodifiableList(((bj4) this.f34068b).mo31833O5());
        }

        /* renamed from: Oj */
        public C4677b mo31876Oj(C5173er erVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31831Mk(erVar);
            return this;
        }

        /* renamed from: P7 */
        public String mo31835P7(int i) {
            return ((bj4) this.f34068b).mo31835P7(i);
        }

        /* renamed from: Pj */
        public C4677b mo31877Pj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31832Nk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Qj */
        public C4677b mo31878Qj(int i, pw2 pw2) {
            mo43393xj();
            ((bj4) this.f34068b).mo31832Nk(i, pw2);
            return this;
        }

        /* renamed from: Rj */
        public C4677b mo31879Rj(pw2.C6483b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31834Ok((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Sj */
        public C4677b mo31880Sj(pw2 pw2) {
            mo43393xj();
            ((bj4) this.f34068b).mo31834Ok(pw2);
            return this;
        }

        /* renamed from: Tj */
        public C4677b mo31881Tj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31836Pk();
            return this;
        }

        /* renamed from: Ui */
        public C5173er mo31841Ui(int i) {
            return ((bj4) this.f34068b).mo31841Ui(i);
        }

        /* renamed from: Uj */
        public C4677b mo31882Uj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31837Qk();
            return this;
        }

        /* renamed from: Vj */
        public C4677b mo31883Vj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31838Rk();
            return this;
        }

        /* renamed from: Wj */
        public C4677b mo31884Wj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31839Sk();
            return this;
        }

        /* renamed from: Xj */
        public C4677b mo31885Xj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31840Tk();
            return this;
        }

        /* renamed from: Yj */
        public C4677b mo31886Yj() {
            mo43393xj();
            ((bj4) this.f34068b).mo31842Uk();
            return this;
        }

        /* renamed from: Zj */
        public C4677b mo31887Zj(y04 y04) {
            mo43393xj();
            ((bj4) this.f34068b).mo31852dl(y04);
            return this;
        }

        /* renamed from: a */
        public C5173er mo31847a() {
            return ((bj4) this.f34068b).mo31847a();
        }

        /* renamed from: ak */
        public C4677b mo31888ak(int i) {
            mo43393xj();
            ((bj4) this.f34068b).mo31859tl(i);
            return this;
        }

        /* renamed from: bk */
        public C4677b mo31889bk(int i) {
            mo43393xj();
            ((bj4) this.f34068b).mo31861ul(i);
            return this;
        }

        /* renamed from: ck */
        public C4677b mo31890ck(int i, q11.C6494b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31862vl(i, (q11) bVar.mo43381ab());
            return this;
        }

        /* renamed from: df */
        public List<String> mo31851df() {
            return Collections.unmodifiableList(((bj4) this.f34068b).mo31851df());
        }

        /* renamed from: dk */
        public C4677b mo31891dk(int i, q11 q11) {
            mo43393xj();
            ((bj4) this.f34068b).mo31862vl(i, q11);
            return this;
        }

        /* renamed from: ek */
        public C4677b mo31892ek(String str) {
            mo43393xj();
            ((bj4) this.f34068b).mo31863wl(str);
            return this;
        }

        /* renamed from: fk */
        public C4677b mo31893fk(C5173er erVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31864xl(erVar);
            return this;
        }

        public String getName() {
            return ((bj4) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C4677b mo31894gk(int i, String str) {
            mo43393xj();
            ((bj4) this.f34068b).mo31866yl(i, str);
            return this;
        }

        /* renamed from: hk */
        public C4677b mo31895hk(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31867zl(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ik */
        public C4677b mo31896ik(int i, pw2 pw2) {
            mo43393xj();
            ((bj4) this.f34068b).mo31867zl(i, pw2);
            return this;
        }

        /* renamed from: j0 */
        public boolean mo31854j0() {
            return ((bj4) this.f34068b).mo31854j0();
        }

        /* renamed from: jk */
        public C4677b mo31897jk(y04.C7296b bVar) {
            mo43393xj();
            ((bj4) this.f34068b).mo31820Al((y04) bVar.mo43381ab());
            return this;
        }

        /* renamed from: k0 */
        public y04 mo31855k0() {
            return ((bj4) this.f34068b).mo31855k0();
        }

        /* renamed from: kk */
        public C4677b mo31898kk(y04 y04) {
            mo43393xj();
            ((bj4) this.f34068b).mo31820Al(y04);
            return this;
        }

        /* renamed from: lk */
        public C4677b mo31899lk(u84 u84) {
            mo43393xj();
            ((bj4) this.f34068b).mo31821Bl(u84);
            return this;
        }

        /* renamed from: m1 */
        public int mo31856m1() {
            return ((bj4) this.f34068b).mo31856m1();
        }

        /* renamed from: mk */
        public C4677b mo31900mk(int i) {
            mo43393xj();
            ((bj4) this.f34068b).mo31822Cl(i);
            return this;
        }

        /* renamed from: s */
        public pw2 mo31857s(int i) {
            return ((bj4) this.f34068b).mo31857s(i);
        }

        /* renamed from: t */
        public int mo31858t() {
            return ((bj4) this.f34068b).mo31858t();
        }

        /* renamed from: u */
        public List<pw2> mo31860u() {
            return Collections.unmodifiableList(((bj4) this.f34068b).mo31860u());
        }

        /* renamed from: y */
        public int mo31865y() {
            return ((bj4) this.f34068b).mo31865y();
        }
    }

    static {
        bj4 bj4 = new bj4();
        DEFAULT_INSTANCE = bj4;
        qe1.m62492dk(bj4.class, bj4);
    }

    /* renamed from: Yk */
    public static bj4 m39993Yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: el */
    public static C4677b m39994el() {
        return (C4677b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: fl */
    public static C4677b m39996fl(bj4 bj4) {
        return (C4677b) DEFAULT_INSTANCE.mo43358gj(bj4);
    }

    /* renamed from: gl */
    public static bj4 m39998gl(InputStream inputStream) throws IOException {
        return (bj4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: hl */
    public static bj4 m40000hl(InputStream inputStream, zy0 zy0) throws IOException {
        return (bj4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: il */
    public static bj4 m40002il(C5173er erVar) throws nt1 {
        return (bj4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: jl */
    public static bj4 m40004jl(C5173er erVar, zy0 zy0) throws nt1 {
        return (bj4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: kl */
    public static bj4 m40006kl(g00 g00) throws IOException {
        return (bj4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ll */
    public static bj4 m40008ll(g00 g00, zy0 zy0) throws IOException {
        return (bj4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: ml */
    public static bj4 m40010ml(InputStream inputStream) throws IOException {
        return (bj4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: nl */
    public static bj4 m40012nl(InputStream inputStream, zy0 zy0) throws IOException {
        return (bj4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ol */
    public static bj4 m40014ol(ByteBuffer byteBuffer) throws nt1 {
        return (bj4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: pl */
    public static bj4 m40016pl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (bj4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: ql */
    public static bj4 m40018ql(byte[] bArr) throws nt1 {
        return (bj4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: rl */
    public static bj4 m40020rl(byte[] bArr, zy0 zy0) throws nt1 {
        return (bj4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: sl */
    public static cz2<bj4> m40022sl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A */
    public u84 mo31819A() {
        u84 a = u84.m66907a(this.syntax_);
        return a == null ? u84.UNRECOGNIZED : a;
    }

    /* renamed from: Al */
    public final void mo31820Al(y04 y04) {
        y04.getClass();
        this.sourceContext_ = y04;
    }

    /* renamed from: Bl */
    public final void mo31821Bl(u84 u84) {
        this.syntax_ = u84.mo32392j();
    }

    /* renamed from: Cl */
    public final void mo31822Cl(int i) {
        this.syntax_ = i;
    }

    /* renamed from: Ge */
    public q11 mo31823Ge(int i) {
        return this.fields_.get(i);
    }

    /* renamed from: Gk */
    public final void mo31824Gk(Iterable<? extends q11> iterable) {
        mo31843Vk();
        C7403z0.m72412X6(iterable, this.fields_);
    }

    /* renamed from: Hk */
    public final void mo31825Hk(Iterable<String> iterable) {
        mo31844Wk();
        C7403z0.m72412X6(iterable, this.oneofs_);
    }

    /* renamed from: Ik */
    public final void mo31826Ik(Iterable<? extends pw2> iterable) {
        mo31845Xk();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: Jk */
    public final void mo31827Jk(int i, q11 q11) {
        q11.getClass();
        mo31843Vk();
        this.fields_.add(i, q11);
    }

    /* renamed from: Kc */
    public int mo31828Kc() {
        return this.oneofs_.size();
    }

    /* renamed from: Kk */
    public final void mo31829Kk(q11 q11) {
        q11.getClass();
        mo31843Vk();
        this.fields_.add(q11);
    }

    /* renamed from: Lk */
    public final void mo31830Lk(String str) {
        str.getClass();
        mo31844Wk();
        this.oneofs_.add(str);
    }

    /* renamed from: Mk */
    public final void mo31831Mk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo31844Wk();
        this.oneofs_.add(erVar.mo35543k0());
    }

    /* renamed from: Nk */
    public final void mo31832Nk(int i, pw2 pw2) {
        pw2.getClass();
        mo31845Xk();
        this.options_.add(i, pw2);
    }

    /* renamed from: O5 */
    public List<q11> mo31833O5() {
        return this.fields_;
    }

    /* renamed from: Ok */
    public final void mo31834Ok(pw2 pw2) {
        pw2.getClass();
        mo31845Xk();
        this.options_.add(pw2);
    }

    /* renamed from: P7 */
    public String mo31835P7(int i) {
        return this.oneofs_.get(i);
    }

    /* renamed from: Pk */
    public final void mo31836Pk() {
        this.fields_ = qe1.m62499pj();
    }

    /* renamed from: Qk */
    public final void mo31837Qk() {
        this.name_ = m39993Yk().getName();
    }

    /* renamed from: Rk */
    public final void mo31838Rk() {
        this.oneofs_ = qe1.m62499pj();
    }

    /* renamed from: Sk */
    public final void mo31839Sk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: Tk */
    public final void mo31840Tk() {
        this.sourceContext_ = null;
    }

    /* renamed from: Ui */
    public C5173er mo31841Ui(int i) {
        return C5173er.m47136w(this.oneofs_.get(i));
    }

    /* renamed from: Uk */
    public final void mo31842Uk() {
        this.syntax_ = 0;
    }

    /* renamed from: Vk */
    public final void mo31843Vk() {
        vs1.C7095k<q11> kVar = this.fields_;
        if (!kVar.mo36500p()) {
            this.fields_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Wk */
    public final void mo31844Wk() {
        vs1.C7095k<String> kVar = this.oneofs_;
        if (!kVar.mo36500p()) {
            this.oneofs_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Xk */
    public final void mo31845Xk() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Zk */
    public d21 mo31846Zk(int i) {
        return this.fields_.get(i);
    }

    /* renamed from: a */
    public C5173er mo31847a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: al */
    public List<? extends d21> mo31848al() {
        return this.fields_;
    }

    /* renamed from: bl */
    public qw2 mo31849bl(int i) {
        return this.options_.get(i);
    }

    /* renamed from: cl */
    public List<? extends qw2> mo31850cl() {
        return this.options_;
    }

    /* renamed from: df */
    public List<String> mo31851df() {
        return this.oneofs_;
    }

    /* renamed from: dl */
    public final void mo31852dl(y04 y04) {
        y04.getClass();
        y04 y042 = this.sourceContext_;
        if (!(y042 == null || y042 == y04.m71080kk())) {
            y04 = (y04) ((y04.C7296b) y04.m71082mk(this.sourceContext_).mo43372Cj(y04)).mo43377Ja();
        }
        this.sourceContext_ = y04;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: j0 */
    public boolean mo31854j0() {
        return this.sourceContext_ != null;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4676a.f26386a[iVar.ordinal()]) {
            case 1:
                return new bj4();
            case 2:
                return new C4677b((C4676a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", q11.class, "oneofs_", "options_", pw2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<bj4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (bj4.class) {
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

    /* renamed from: k0 */
    public y04 mo31855k0() {
        y04 y04 = this.sourceContext_;
        return y04 == null ? y04.m71080kk() : y04;
    }

    /* renamed from: m1 */
    public int mo31856m1() {
        return this.fields_.size();
    }

    /* renamed from: s */
    public pw2 mo31857s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: t */
    public int mo31858t() {
        return this.options_.size();
    }

    /* renamed from: tl */
    public final void mo31859tl(int i) {
        mo31843Vk();
        this.fields_.remove(i);
    }

    /* renamed from: u */
    public List<pw2> mo31860u() {
        return this.options_;
    }

    /* renamed from: ul */
    public final void mo31861ul(int i) {
        mo31845Xk();
        this.options_.remove(i);
    }

    /* renamed from: vl */
    public final void mo31862vl(int i, q11 q11) {
        q11.getClass();
        mo31843Vk();
        this.fields_.set(i, q11);
    }

    /* renamed from: wl */
    public final void mo31863wl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: xl */
    public final void mo31864xl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: y */
    public int mo31865y() {
        return this.syntax_;
    }

    /* renamed from: yl */
    public final void mo31866yl(int i, String str) {
        str.getClass();
        mo31844Wk();
        this.oneofs_.set(i, str);
    }

    /* renamed from: zl */
    public final void mo31867zl(int i, pw2 pw2) {
        pw2.getClass();
        mo31845Xk();
        this.options_.set(i, pw2);
    }
}
