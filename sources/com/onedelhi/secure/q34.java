package com.onedelhi.secure;

import com.onedelhi.secure.C6248o7;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class q34 extends qe1<q34, C6504b> implements s34 {
    public static final int CODE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final q34 DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile cz2<q34> PARSER;
    private int code_;
    private vs1.C7095k<C6248o7> details_ = qe1.m62499pj();
    private String message_ = "";

    /* renamed from: com.onedelhi.secure.q34$a */
    public static /* synthetic */ class C6503a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33963a;

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
                f33963a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33963a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.q34.C6503a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.q34$b */
    public static final class C6504b extends qe1.C6546b<q34, C6504b> implements s34 {
        public C6504b() {
            super(q34.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6504b(C6503a aVar) {
            this();
        }

        /* renamed from: Bh */
        public List<C6248o7> mo43105Bh() {
            return Collections.unmodifiableList(((q34) this.f34068b).mo43105Bh());
        }

        /* renamed from: Gj */
        public C6504b mo43124Gj(Iterable<? extends C6248o7> iterable) {
            mo43393xj();
            ((q34) this.f34068b).mo43116rk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6504b mo43125Hj(int i, C6248o7.C6250b bVar) {
            mo43393xj();
            ((q34) this.f34068b).mo43117sk(i, (C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6504b mo43126Ij(int i, C6248o7 o7Var) {
            mo43393xj();
            ((q34) this.f34068b).mo43117sk(i, o7Var);
            return this;
        }

        /* renamed from: Jj */
        public C6504b mo43127Jj(C6248o7.C6250b bVar) {
            mo43393xj();
            ((q34) this.f34068b).mo43118tk((C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6504b mo43128Kj(C6248o7 o7Var) {
            mo43393xj();
            ((q34) this.f34068b).mo43118tk(o7Var);
            return this;
        }

        /* renamed from: Lj */
        public C6504b mo43129Lj() {
            mo43393xj();
            ((q34) this.f34068b).mo43119uk();
            return this;
        }

        /* renamed from: Mj */
        public C6504b mo43130Mj() {
            mo43393xj();
            ((q34) this.f34068b).mo43120vk();
            return this;
        }

        /* renamed from: Nj */
        public C6504b mo43131Nj() {
            mo43393xj();
            ((q34) this.f34068b).mo43121wk();
            return this;
        }

        /* renamed from: Oj */
        public C6504b mo43132Oj(int i) {
            mo43393xj();
            ((q34) this.f34068b).mo43107Qk(i);
            return this;
        }

        /* renamed from: Pj */
        public C6504b mo43133Pj(int i) {
            mo43393xj();
            ((q34) this.f34068b).mo43108Rk(i);
            return this;
        }

        /* renamed from: Qd */
        public int mo43106Qd() {
            return ((q34) this.f34068b).mo43106Qd();
        }

        /* renamed from: Qj */
        public C6504b mo43134Qj(int i, C6248o7.C6250b bVar) {
            mo43393xj();
            ((q34) this.f34068b).mo43109Sk(i, (C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Rj */
        public C6504b mo43135Rj(int i, C6248o7 o7Var) {
            mo43393xj();
            ((q34) this.f34068b).mo43109Sk(i, o7Var);
            return this;
        }

        /* renamed from: Sj */
        public C6504b mo43136Sj(String str) {
            mo43393xj();
            ((q34) this.f34068b).mo43110Tk(str);
            return this;
        }

        /* renamed from: Tj */
        public C6504b mo43137Tj(C5173er erVar) {
            mo43393xj();
            ((q34) this.f34068b).mo43111Uk(erVar);
            return this;
        }

        /* renamed from: h9 */
        public int mo43112h9() {
            return ((q34) this.f34068b).mo43112h9();
        }

        /* renamed from: n1 */
        public String mo43113n1() {
            return ((q34) this.f34068b).mo43113n1();
        }

        /* renamed from: r0 */
        public C5173er mo43114r0() {
            return ((q34) this.f34068b).mo43114r0();
        }

        /* renamed from: r3 */
        public C6248o7 mo43115r3(int i) {
            return ((q34) this.f34068b).mo43115r3(i);
        }
    }

    static {
        q34 q34 = new q34();
        DEFAULT_INSTANCE = q34;
        qe1.m62492dk(q34.class, q34);
    }

    /* renamed from: Bk */
    public static C6504b m62021Bk() {
        return (C6504b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ck */
    public static C6504b m62022Ck(q34 q34) {
        return (C6504b) DEFAULT_INSTANCE.mo43358gj(q34);
    }

    /* renamed from: Dk */
    public static q34 m62023Dk(InputStream inputStream) throws IOException {
        return (q34) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static q34 m62024Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (q34) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static q34 m62025Fk(C5173er erVar) throws nt1 {
        return (q34) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Gk */
    public static q34 m62026Gk(C5173er erVar, zy0 zy0) throws nt1 {
        return (q34) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Hk */
    public static q34 m62027Hk(g00 g00) throws IOException {
        return (q34) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ik */
    public static q34 m62028Ik(g00 g00, zy0 zy0) throws IOException {
        return (q34) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Jk */
    public static q34 m62029Jk(InputStream inputStream) throws IOException {
        return (q34) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static q34 m62030Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (q34) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static q34 m62031Lk(ByteBuffer byteBuffer) throws nt1 {
        return (q34) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Mk */
    public static q34 m62032Mk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (q34) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Nk */
    public static q34 m62033Nk(byte[] bArr) throws nt1 {
        return (q34) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ok */
    public static q34 m62034Ok(byte[] bArr, zy0 zy0) throws nt1 {
        return (q34) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Pk */
    public static cz2<q34> m62035Pk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: yk */
    public static q34 m62048yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ak */
    public List<? extends C6514q7> mo43104Ak() {
        return this.details_;
    }

    /* renamed from: Bh */
    public List<C6248o7> mo43105Bh() {
        return this.details_;
    }

    /* renamed from: Qd */
    public int mo43106Qd() {
        return this.code_;
    }

    /* renamed from: Qk */
    public final void mo43107Qk(int i) {
        mo43122xk();
        this.details_.remove(i);
    }

    /* renamed from: Rk */
    public final void mo43108Rk(int i) {
        this.code_ = i;
    }

    /* renamed from: Sk */
    public final void mo43109Sk(int i, C6248o7 o7Var) {
        o7Var.getClass();
        mo43122xk();
        this.details_.set(i, o7Var);
    }

    /* renamed from: Tk */
    public final void mo43110Tk(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* renamed from: Uk */
    public final void mo43111Uk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.message_ = erVar.mo35543k0();
    }

    /* renamed from: h9 */
    public int mo43112h9() {
        return this.details_.size();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6503a.f33963a[iVar.ordinal()]) {
            case 1:
                return new q34();
            case 2:
                return new C6504b((C6503a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C6248o7.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<q34> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (q34.class) {
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

    /* renamed from: n1 */
    public String mo43113n1() {
        return this.message_;
    }

    /* renamed from: r0 */
    public C5173er mo43114r0() {
        return C5173er.m47136w(this.message_);
    }

    /* renamed from: r3 */
    public C6248o7 mo43115r3(int i) {
        return this.details_.get(i);
    }

    /* renamed from: rk */
    public final void mo43116rk(Iterable<? extends C6248o7> iterable) {
        mo43122xk();
        C7403z0.m72412X6(iterable, this.details_);
    }

    /* renamed from: sk */
    public final void mo43117sk(int i, C6248o7 o7Var) {
        o7Var.getClass();
        mo43122xk();
        this.details_.add(i, o7Var);
    }

    /* renamed from: tk */
    public final void mo43118tk(C6248o7 o7Var) {
        o7Var.getClass();
        mo43122xk();
        this.details_.add(o7Var);
    }

    /* renamed from: uk */
    public final void mo43119uk() {
        this.code_ = 0;
    }

    /* renamed from: vk */
    public final void mo43120vk() {
        this.details_ = qe1.m62499pj();
    }

    /* renamed from: wk */
    public final void mo43121wk() {
        this.message_ = m62048yk().mo43113n1();
    }

    /* renamed from: xk */
    public final void mo43122xk() {
        vs1.C7095k<C6248o7> kVar = this.details_;
        if (!kVar.mo36500p()) {
            this.details_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: zk */
    public C6514q7 mo43123zk(int i) {
        return this.details_.get(i);
    }
}
