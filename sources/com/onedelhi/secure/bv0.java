package com.onedelhi.secure;

import com.onedelhi.secure.pw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class bv0 extends qe1<bv0, C4701b> implements cv0 {
    /* access modifiers changed from: private */
    public static final bv0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile cz2<bv0> PARSER;
    private String name_ = "";
    private int number_;
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.bv0$a */
    public static /* synthetic */ class C4700a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26537a;

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
                f26537a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26537a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv0.C4700a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.bv0$b */
    public static final class C4701b extends qe1.C6546b<bv0, C4701b> implements cv0 {
        public C4701b() {
            super(bv0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4701b(C4700a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4701b mo32055Gj(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((bv0) this.f34068b).mo32044rk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C4701b mo32056Hj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((bv0) this.f34068b).mo32046sk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C4701b mo32057Ij(int i, pw2 pw2) {
            mo43393xj();
            ((bv0) this.f34068b).mo32046sk(i, pw2);
            return this;
        }

        /* renamed from: Jj */
        public C4701b mo32058Jj(pw2.C6483b bVar) {
            mo43393xj();
            ((bv0) this.f34068b).mo32048tk((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C4701b mo32059Kj(pw2 pw2) {
            mo43393xj();
            ((bv0) this.f34068b).mo32048tk(pw2);
            return this;
        }

        /* renamed from: Lj */
        public C4701b mo32060Lj() {
            mo43393xj();
            ((bv0) this.f34068b).mo32050uk();
            return this;
        }

        /* renamed from: Mj */
        public C4701b mo32061Mj() {
            mo43393xj();
            ((bv0) this.f34068b).mo32051vk();
            return this;
        }

        /* renamed from: Nj */
        public C4701b mo32062Nj() {
            mo43393xj();
            ((bv0) this.f34068b).mo32052wk();
            return this;
        }

        /* renamed from: Oj */
        public C4701b mo32063Oj(int i) {
            mo43393xj();
            ((bv0) this.f34068b).mo32036Qk(i);
            return this;
        }

        /* renamed from: Pj */
        public C4701b mo32064Pj(String str) {
            mo43393xj();
            ((bv0) this.f34068b).mo32037Rk(str);
            return this;
        }

        /* renamed from: Qj */
        public C4701b mo32065Qj(C5173er erVar) {
            mo43393xj();
            ((bv0) this.f34068b).mo32038Sk(erVar);
            return this;
        }

        /* renamed from: Rj */
        public C4701b mo32066Rj(int i) {
            mo43393xj();
            ((bv0) this.f34068b).mo32039Tk(i);
            return this;
        }

        /* renamed from: Sj */
        public C4701b mo32067Sj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((bv0) this.f34068b).mo32040Uk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tj */
        public C4701b mo32068Tj(int i, pw2 pw2) {
            mo43393xj();
            ((bv0) this.f34068b).mo32040Uk(i, pw2);
            return this;
        }

        /* renamed from: a */
        public C5173er mo32041a() {
            return ((bv0) this.f34068b).mo32041a();
        }

        public String getName() {
            return ((bv0) this.f34068b).getName();
        }

        /* renamed from: j */
        public int mo32043j() {
            return ((bv0) this.f34068b).mo32043j();
        }

        /* renamed from: s */
        public pw2 mo32045s(int i) {
            return ((bv0) this.f34068b).mo32045s(i);
        }

        /* renamed from: t */
        public int mo32047t() {
            return ((bv0) this.f34068b).mo32047t();
        }

        /* renamed from: u */
        public List<pw2> mo32049u() {
            return Collections.unmodifiableList(((bv0) this.f34068b).mo32049u());
        }
    }

    static {
        bv0 bv0 = new bv0();
        DEFAULT_INSTANCE = bv0;
        qe1.m62492dk(bv0.class, bv0);
    }

    /* renamed from: Bk */
    public static C4701b m40408Bk() {
        return (C4701b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ck */
    public static C4701b m40409Ck(bv0 bv0) {
        return (C4701b) DEFAULT_INSTANCE.mo43358gj(bv0);
    }

    /* renamed from: Dk */
    public static bv0 m40410Dk(InputStream inputStream) throws IOException {
        return (bv0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static bv0 m40411Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (bv0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static bv0 m40412Fk(C5173er erVar) throws nt1 {
        return (bv0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Gk */
    public static bv0 m40413Gk(C5173er erVar, zy0 zy0) throws nt1 {
        return (bv0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Hk */
    public static bv0 m40414Hk(g00 g00) throws IOException {
        return (bv0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ik */
    public static bv0 m40415Ik(g00 g00, zy0 zy0) throws IOException {
        return (bv0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Jk */
    public static bv0 m40416Jk(InputStream inputStream) throws IOException {
        return (bv0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static bv0 m40417Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (bv0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static bv0 m40418Lk(ByteBuffer byteBuffer) throws nt1 {
        return (bv0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Mk */
    public static bv0 m40419Mk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (bv0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Nk */
    public static bv0 m40420Nk(byte[] bArr) throws nt1 {
        return (bv0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ok */
    public static bv0 m40421Ok(byte[] bArr, zy0 zy0) throws nt1 {
        return (bv0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Pk */
    public static cz2<bv0> m40422Pk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: yk */
    public static bv0 m40435yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ak */
    public List<? extends qw2> mo32035Ak() {
        return this.options_;
    }

    /* renamed from: Qk */
    public final void mo32036Qk(int i) {
        mo32053xk();
        this.options_.remove(i);
    }

    /* renamed from: Rk */
    public final void mo32037Rk(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Sk */
    public final void mo32038Sk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Tk */
    public final void mo32039Tk(int i) {
        this.number_ = i;
    }

    /* renamed from: Uk */
    public final void mo32040Uk(int i, pw2 pw2) {
        pw2.getClass();
        mo32053xk();
        this.options_.set(i, pw2);
    }

    /* renamed from: a */
    public C5173er mo32041a() {
        return C5173er.m47136w(this.name_);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: j */
    public int mo32043j() {
        return this.number_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4700a.f26537a[iVar.ordinal()]) {
            case 1:
                return new bv0();
            case 2:
                return new C4701b((C4700a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", pw2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<bv0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (bv0.class) {
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
    public final void mo32044rk(Iterable<? extends pw2> iterable) {
        mo32053xk();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: s */
    public pw2 mo32045s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: sk */
    public final void mo32046sk(int i, pw2 pw2) {
        pw2.getClass();
        mo32053xk();
        this.options_.add(i, pw2);
    }

    /* renamed from: t */
    public int mo32047t() {
        return this.options_.size();
    }

    /* renamed from: tk */
    public final void mo32048tk(pw2 pw2) {
        pw2.getClass();
        mo32053xk();
        this.options_.add(pw2);
    }

    /* renamed from: u */
    public List<pw2> mo32049u() {
        return this.options_;
    }

    /* renamed from: uk */
    public final void mo32050uk() {
        this.name_ = m40435yk().getName();
    }

    /* renamed from: vk */
    public final void mo32051vk() {
        this.number_ = 0;
    }

    /* renamed from: wk */
    public final void mo32052wk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: xk */
    public final void mo32053xk() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: zk */
    public qw2 mo32054zk(int i) {
        return this.options_.get(i);
    }
}
