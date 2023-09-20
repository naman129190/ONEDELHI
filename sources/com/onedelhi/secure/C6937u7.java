package com.onedelhi.secure;

import com.onedelhi.secure.mj2;
import com.onedelhi.secure.pi2;
import com.onedelhi.secure.pw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y04;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.u7 */
public final class C6937u7 extends qe1<C6937u7, C6939b> implements C7309y7 {
    /* access modifiers changed from: private */
    public static final C6937u7 DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile cz2<C6937u7> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private vs1.C7095k<pi2> methods_ = qe1.m62499pj();
    private vs1.C7095k<mj2> mixins_ = qe1.m62499pj();
    private String name_ = "";
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();
    private y04 sourceContext_;
    private int syntax_;
    private String version_ = "";

    /* renamed from: com.onedelhi.secure.u7$a */
    public static /* synthetic */ class C6938a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35992a;

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
                f35992a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35992a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6937u7.C6938a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.u7$b */
    public static final class C6939b extends qe1.C6546b<C6937u7, C6939b> implements C7309y7 {
        public C6939b() {
            super(C6937u7.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6939b(C6938a aVar) {
            this();
        }

        /* renamed from: A */
        public u84 mo45441A() {
            return ((C6937u7) this.f34068b).mo45441A();
        }

        /* renamed from: Ba */
        public int mo45443Ba() {
            return ((C6937u7) this.f34068b).mo45443Ba();
        }

        /* renamed from: Gj */
        public C6939b mo45497Gj(Iterable<? extends pi2> iterable) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45453Kk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6939b mo45498Hj(Iterable<? extends mj2> iterable) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45456Lk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6939b mo45499Ij(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45458Mk(iterable);
            return this;
        }

        /* renamed from: Jj */
        public C6939b mo45500Jj(int i, pi2.C6448b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45460Nk(i, (pi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6939b mo45501Kj(int i, pi2 pi2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45460Nk(i, pi2);
            return this;
        }

        /* renamed from: Lg */
        public int mo45455Lg() {
            return ((C6937u7) this.f34068b).mo45455Lg();
        }

        /* renamed from: Lj */
        public C6939b mo45502Lj(pi2.C6448b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45461Ok((pi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Mj */
        public C6939b mo45503Mj(pi2 pi2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45461Ok(pi2);
            return this;
        }

        /* renamed from: Nj */
        public C6939b mo45504Nj(int i, mj2.C6123b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45462Pk(i, (mj2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C6939b mo45505Oj(int i, mj2 mj2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45462Pk(i, mj2);
            return this;
        }

        /* renamed from: Pj */
        public C6939b mo45506Pj(mj2.C6123b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45463Qk((mj2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Qj */
        public C6939b mo45507Qj(mj2 mj2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45463Qk(mj2);
            return this;
        }

        /* renamed from: Rj */
        public C6939b mo45508Rj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45464Rk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Sj */
        public C6939b mo45509Sj(int i, pw2 pw2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45464Rk(i, pw2);
            return this;
        }

        /* renamed from: Tj */
        public C6939b mo45510Tj(pw2.C6483b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45465Sk((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Uj */
        public C6939b mo45511Uj(pw2 pw2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45465Sk(pw2);
            return this;
        }

        /* renamed from: V */
        public C5173er mo45468V() {
            return ((C6937u7) this.f34068b).mo45468V();
        }

        /* renamed from: Vj */
        public C6939b mo45512Vj() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45466Tk();
            return this;
        }

        /* renamed from: Wj */
        public C6939b mo45513Wj() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45467Uk();
            return this;
        }

        /* renamed from: Xj */
        public C6939b mo45514Xj() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45469Vk();
            return this;
        }

        /* renamed from: Yj */
        public C6939b mo45515Yj() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45470Wk();
            return this;
        }

        /* renamed from: Zj */
        public C6939b mo45516Zj() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45471Xk();
            return this;
        }

        /* renamed from: a */
        public C5173er mo45474a() {
            return ((C6937u7) this.f34068b).mo45474a();
        }

        /* renamed from: a5 */
        public pi2 mo45475a5(int i) {
            return ((C6937u7) this.f34068b).mo45475a5(i);
        }

        /* renamed from: ak */
        public C6939b mo45517ak() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45472Yk();
            return this;
        }

        /* renamed from: bk */
        public C6939b mo45518bk() {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45473Zk();
            return this;
        }

        /* renamed from: ck */
        public C6939b mo45519ck(y04 y04) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45490kl(y04);
            return this;
        }

        /* renamed from: dk */
        public C6939b mo45520dk(int i) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45442Al(i);
            return this;
        }

        /* renamed from: ek */
        public C6939b mo45521ek(int i) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45444Bl(i);
            return this;
        }

        /* renamed from: fk */
        public C6939b mo45522fk(int i) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45445Cl(i);
            return this;
        }

        /* renamed from: g8 */
        public List<pi2> mo45481g8() {
            return Collections.unmodifiableList(((C6937u7) this.f34068b).mo45481g8());
        }

        public String getName() {
            return ((C6937u7) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C6939b mo45523gk(int i, pi2.C6448b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45446Dl(i, (pi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: hk */
        public C6939b mo45524hk(int i, pi2 pi2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45446Dl(i, pi2);
            return this;
        }

        /* renamed from: i0 */
        public String mo45485i0() {
            return ((C6937u7) this.f34068b).mo45485i0();
        }

        /* renamed from: ik */
        public C6939b mo45525ik(int i, mj2.C6123b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45447El(i, (mj2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: j0 */
        public boolean mo45487j0() {
            return ((C6937u7) this.f34068b).mo45487j0();
        }

        /* renamed from: jk */
        public C6939b mo45526jk(int i, mj2 mj2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45447El(i, mj2);
            return this;
        }

        /* renamed from: k0 */
        public y04 mo45489k0() {
            return ((C6937u7) this.f34068b).mo45489k0();
        }

        /* renamed from: kk */
        public C6939b mo45527kk(String str) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45448Fl(str);
            return this;
        }

        /* renamed from: lk */
        public C6939b mo45528lk(C5173er erVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45449Gl(erVar);
            return this;
        }

        /* renamed from: ma */
        public List<mj2> mo45491ma() {
            return Collections.unmodifiableList(((C6937u7) this.f34068b).mo45491ma());
        }

        /* renamed from: mk */
        public C6939b mo45529mk(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45450Hl(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: nk */
        public C6939b mo45530nk(int i, pw2 pw2) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45450Hl(i, pw2);
            return this;
        }

        /* renamed from: ok */
        public C6939b mo45531ok(y04.C7296b bVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45451Il((y04) bVar.mo43381ab());
            return this;
        }

        /* renamed from: pk */
        public C6939b mo45532pk(y04 y04) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45451Il(y04);
            return this;
        }

        /* renamed from: qk */
        public C6939b mo45533qk(u84 u84) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45452Jl(u84);
            return this;
        }

        /* renamed from: rk */
        public C6939b mo45534rk(int i) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45454Kl(i);
            return this;
        }

        /* renamed from: s */
        public pw2 mo45492s(int i) {
            return ((C6937u7) this.f34068b).mo45492s(i);
        }

        /* renamed from: sk */
        public C6939b mo45535sk(String str) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45457Ll(str);
            return this;
        }

        /* renamed from: t */
        public int mo45493t() {
            return ((C6937u7) this.f34068b).mo45493t();
        }

        /* renamed from: tk */
        public C6939b mo45536tk(C5173er erVar) {
            mo43393xj();
            ((C6937u7) this.f34068b).mo45459Ml(erVar);
            return this;
        }

        /* renamed from: u */
        public List<pw2> mo45494u() {
            return Collections.unmodifiableList(((C6937u7) this.f34068b).mo45494u());
        }

        /* renamed from: u5 */
        public mj2 mo45495u5(int i) {
            return ((C6937u7) this.f34068b).mo45495u5(i);
        }

        /* renamed from: y */
        public int mo45496y() {
            return ((C6937u7) this.f34068b).mo45496y();
        }
    }

    static {
        C6937u7 u7Var = new C6937u7();
        DEFAULT_INSTANCE = u7Var;
        qe1.m62492dk(C6937u7.class, u7Var);
    }

    /* renamed from: dl */
    public static C6937u7 m66735dl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ll */
    public static C6939b m66743ll() {
        return (C6939b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ml */
    public static C6939b m66745ml(C6937u7 u7Var) {
        return (C6939b) DEFAULT_INSTANCE.mo43358gj(u7Var);
    }

    /* renamed from: nl */
    public static C6937u7 m66747nl(InputStream inputStream) throws IOException {
        return (C6937u7) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ol */
    public static C6937u7 m66749ol(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6937u7) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pl */
    public static C6937u7 m66751pl(C5173er erVar) throws nt1 {
        return (C6937u7) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: ql */
    public static C6937u7 m66753ql(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6937u7) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: rl */
    public static C6937u7 m66755rl(g00 g00) throws IOException {
        return (C6937u7) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: sl */
    public static C6937u7 m66757sl(g00 g00, zy0 zy0) throws IOException {
        return (C6937u7) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: tl */
    public static C6937u7 m66759tl(InputStream inputStream) throws IOException {
        return (C6937u7) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ul */
    public static C6937u7 m66761ul(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6937u7) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: vl */
    public static C6937u7 m66763vl(ByteBuffer byteBuffer) throws nt1 {
        return (C6937u7) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: wl */
    public static C6937u7 m66765wl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6937u7) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: xl */
    public static C6937u7 m66767xl(byte[] bArr) throws nt1 {
        return (C6937u7) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: yl */
    public static C6937u7 m66769yl(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6937u7) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: zl */
    public static cz2<C6937u7> m66771zl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A */
    public u84 mo45441A() {
        u84 a = u84.m66907a(this.syntax_);
        return a == null ? u84.UNRECOGNIZED : a;
    }

    /* renamed from: Al */
    public final void mo45442Al(int i) {
        mo45476al();
        this.methods_.remove(i);
    }

    /* renamed from: Ba */
    public int mo45443Ba() {
        return this.methods_.size();
    }

    /* renamed from: Bl */
    public final void mo45444Bl(int i) {
        mo45477bl();
        this.mixins_.remove(i);
    }

    /* renamed from: Cl */
    public final void mo45445Cl(int i) {
        mo45478cl();
        this.options_.remove(i);
    }

    /* renamed from: Dl */
    public final void mo45446Dl(int i, pi2 pi2) {
        pi2.getClass();
        mo45476al();
        this.methods_.set(i, pi2);
    }

    /* renamed from: El */
    public final void mo45447El(int i, mj2 mj2) {
        mj2.getClass();
        mo45477bl();
        this.mixins_.set(i, mj2);
    }

    /* renamed from: Fl */
    public final void mo45448Fl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Gl */
    public final void mo45449Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Hl */
    public final void mo45450Hl(int i, pw2 pw2) {
        pw2.getClass();
        mo45478cl();
        this.options_.set(i, pw2);
    }

    /* renamed from: Il */
    public final void mo45451Il(y04 y04) {
        y04.getClass();
        this.sourceContext_ = y04;
    }

    /* renamed from: Jl */
    public final void mo45452Jl(u84 u84) {
        this.syntax_ = u84.mo32392j();
    }

    /* renamed from: Kk */
    public final void mo45453Kk(Iterable<? extends pi2> iterable) {
        mo45476al();
        C7403z0.m72412X6(iterable, this.methods_);
    }

    /* renamed from: Kl */
    public final void mo45454Kl(int i) {
        this.syntax_ = i;
    }

    /* renamed from: Lg */
    public int mo45455Lg() {
        return this.mixins_.size();
    }

    /* renamed from: Lk */
    public final void mo45456Lk(Iterable<? extends mj2> iterable) {
        mo45477bl();
        C7403z0.m72412X6(iterable, this.mixins_);
    }

    /* renamed from: Ll */
    public final void mo45457Ll(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* renamed from: Mk */
    public final void mo45458Mk(Iterable<? extends pw2> iterable) {
        mo45478cl();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: Ml */
    public final void mo45459Ml(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.version_ = erVar.mo35543k0();
    }

    /* renamed from: Nk */
    public final void mo45460Nk(int i, pi2 pi2) {
        pi2.getClass();
        mo45476al();
        this.methods_.add(i, pi2);
    }

    /* renamed from: Ok */
    public final void mo45461Ok(pi2 pi2) {
        pi2.getClass();
        mo45476al();
        this.methods_.add(pi2);
    }

    /* renamed from: Pk */
    public final void mo45462Pk(int i, mj2 mj2) {
        mj2.getClass();
        mo45477bl();
        this.mixins_.add(i, mj2);
    }

    /* renamed from: Qk */
    public final void mo45463Qk(mj2 mj2) {
        mj2.getClass();
        mo45477bl();
        this.mixins_.add(mj2);
    }

    /* renamed from: Rk */
    public final void mo45464Rk(int i, pw2 pw2) {
        pw2.getClass();
        mo45478cl();
        this.options_.add(i, pw2);
    }

    /* renamed from: Sk */
    public final void mo45465Sk(pw2 pw2) {
        pw2.getClass();
        mo45478cl();
        this.options_.add(pw2);
    }

    /* renamed from: Tk */
    public final void mo45466Tk() {
        this.methods_ = qe1.m62499pj();
    }

    /* renamed from: Uk */
    public final void mo45467Uk() {
        this.mixins_ = qe1.m62499pj();
    }

    /* renamed from: V */
    public C5173er mo45468V() {
        return C5173er.m47136w(this.version_);
    }

    /* renamed from: Vk */
    public final void mo45469Vk() {
        this.name_ = m66735dl().getName();
    }

    /* renamed from: Wk */
    public final void mo45470Wk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: Xk */
    public final void mo45471Xk() {
        this.sourceContext_ = null;
    }

    /* renamed from: Yk */
    public final void mo45472Yk() {
        this.syntax_ = 0;
    }

    /* renamed from: Zk */
    public final void mo45473Zk() {
        this.version_ = m66735dl().mo45485i0();
    }

    /* renamed from: a */
    public C5173er mo45474a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: a5 */
    public pi2 mo45475a5(int i) {
        return this.methods_.get(i);
    }

    /* renamed from: al */
    public final void mo45476al() {
        vs1.C7095k<pi2> kVar = this.methods_;
        if (!kVar.mo36500p()) {
            this.methods_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: bl */
    public final void mo45477bl() {
        vs1.C7095k<mj2> kVar = this.mixins_;
        if (!kVar.mo36500p()) {
            this.mixins_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: cl */
    public final void mo45478cl() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: el */
    public ri2 mo45479el(int i) {
        return this.methods_.get(i);
    }

    /* renamed from: fl */
    public List<? extends ri2> mo45480fl() {
        return this.methods_;
    }

    /* renamed from: g8 */
    public List<pi2> mo45481g8() {
        return this.methods_;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: gl */
    public nj2 mo45483gl(int i) {
        return this.mixins_.get(i);
    }

    /* renamed from: hl */
    public List<? extends nj2> mo45484hl() {
        return this.mixins_;
    }

    /* renamed from: i0 */
    public String mo45485i0() {
        return this.version_;
    }

    /* renamed from: il */
    public qw2 mo45486il(int i) {
        return this.options_.get(i);
    }

    /* renamed from: j0 */
    public boolean mo45487j0() {
        return this.sourceContext_ != null;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6938a.f35992a[iVar.ordinal()]) {
            case 1:
                return new C6937u7();
            case 2:
                return new C6939b((C6938a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", pi2.class, "options_", pw2.class, "version_", "sourceContext_", "mixins_", mj2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6937u7> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6937u7.class) {
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
    public List<? extends qw2> mo45488jl() {
        return this.options_;
    }

    /* renamed from: k0 */
    public y04 mo45489k0() {
        y04 y04 = this.sourceContext_;
        return y04 == null ? y04.m71080kk() : y04;
    }

    /* renamed from: kl */
    public final void mo45490kl(y04 y04) {
        y04.getClass();
        y04 y042 = this.sourceContext_;
        if (!(y042 == null || y042 == y04.m71080kk())) {
            y04 = (y04) ((y04.C7296b) y04.m71082mk(this.sourceContext_).mo43372Cj(y04)).mo43377Ja();
        }
        this.sourceContext_ = y04;
    }

    /* renamed from: ma */
    public List<mj2> mo45491ma() {
        return this.mixins_;
    }

    /* renamed from: s */
    public pw2 mo45492s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: t */
    public int mo45493t() {
        return this.options_.size();
    }

    /* renamed from: u */
    public List<pw2> mo45494u() {
        return this.options_;
    }

    /* renamed from: u5 */
    public mj2 mo45495u5(int i) {
        return this.mixins_.get(i);
    }

    /* renamed from: y */
    public int mo45496y() {
        return this.syntax_;
    }
}
