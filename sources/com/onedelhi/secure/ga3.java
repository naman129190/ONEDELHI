package com.onedelhi.secure;

import com.onedelhi.secure.ja3;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.xi2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ga3 extends qe1<ga3, C5402b> implements la3 {
    /* access modifiers changed from: private */
    public static final ga3 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile cz2<ga3> PARSER;
    private vs1.C7095k<ja3> limits_ = qe1.m62499pj();
    private vs1.C7095k<xi2> metricRules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.ga3$a */
    public static /* synthetic */ class C5401a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29130a;

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
                f29130a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29130a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ga3.C5401a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ga3$b */
    public static final class C5402b extends qe1.C6546b<ga3, C5402b> implements la3 {
        public C5402b() {
            super(ga3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5402b(C5401a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5402b mo36639Gj(Iterable<? extends ja3> iterable) {
            mo43393xj();
            ((ga3) this.f34068b).mo36628sk(iterable);
            return this;
        }

        /* renamed from: H2 */
        public ja3 mo36621H2(int i) {
            return ((ga3) this.f34068b).mo36621H2(i);
        }

        /* renamed from: Hj */
        public C5402b mo36640Hj(Iterable<? extends xi2> iterable) {
            mo43393xj();
            ((ga3) this.f34068b).mo36629tk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C5402b mo36641Ij(int i, ja3.C5807b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36630uk(i, (ja3) bVar.mo43381ab());
            return this;
        }

        /* renamed from: J7 */
        public xi2 mo36622J7(int i) {
            return ((ga3) this.f34068b).mo36622J7(i);
        }

        /* renamed from: Jj */
        public C5402b mo36642Jj(int i, ja3 ja3) {
            mo43393xj();
            ((ga3) this.f34068b).mo36630uk(i, ja3);
            return this;
        }

        /* renamed from: Kj */
        public C5402b mo36643Kj(ja3.C5807b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36631vk((ja3) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C5402b mo36644Lj(ja3 ja3) {
            mo43393xj();
            ((ga3) this.f34068b).mo36631vk(ja3);
            return this;
        }

        /* renamed from: Mj */
        public C5402b mo36645Mj(int i, xi2.C7261b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36632wk(i, (xi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C5402b mo36646Nj(int i, xi2 xi2) {
            mo43393xj();
            ((ga3) this.f34068b).mo36632wk(i, xi2);
            return this;
        }

        /* renamed from: Oj */
        public C5402b mo36647Oj(xi2.C7261b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36634xk((xi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C5402b mo36648Pj(xi2 xi2) {
            mo43393xj();
            ((ga3) this.f34068b).mo36634xk(xi2);
            return this;
        }

        /* renamed from: Qj */
        public C5402b mo36649Qj() {
            mo43393xj();
            ((ga3) this.f34068b).mo36636yk();
            return this;
        }

        /* renamed from: Rj */
        public C5402b mo36650Rj() {
            mo43393xj();
            ((ga3) this.f34068b).mo36638zk();
            return this;
        }

        /* renamed from: Sj */
        public C5402b mo36651Sj(int i) {
            mo43393xj();
            ((ga3) this.f34068b).mo36623Wk(i);
            return this;
        }

        /* renamed from: Tj */
        public C5402b mo36652Tj(int i) {
            mo43393xj();
            ((ga3) this.f34068b).mo36624Xk(i);
            return this;
        }

        /* renamed from: Uj */
        public C5402b mo36653Uj(int i, ja3.C5807b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36625Yk(i, (ja3) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C5402b mo36654Vj(int i, ja3 ja3) {
            mo43393xj();
            ((ga3) this.f34068b).mo36625Yk(i, ja3);
            return this;
        }

        /* renamed from: Wj */
        public C5402b mo36655Wj(int i, xi2.C7261b bVar) {
            mo43393xj();
            ((ga3) this.f34068b).mo36626Zk(i, (xi2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C5402b mo36656Xj(int i, xi2 xi2) {
            mo43393xj();
            ((ga3) this.f34068b).mo36626Zk(i, xi2);
            return this;
        }

        /* renamed from: ii */
        public int mo36627ii() {
            return ((ga3) this.f34068b).mo36627ii();
        }

        /* renamed from: xg */
        public List<ja3> mo36633xg() {
            return Collections.unmodifiableList(((ga3) this.f34068b).mo36633xg());
        }

        /* renamed from: ya */
        public int mo36635ya() {
            return ((ga3) this.f34068b).mo36635ya();
        }

        /* renamed from: zd */
        public List<xi2> mo36637zd() {
            return Collections.unmodifiableList(((ga3) this.f34068b).mo36637zd());
        }
    }

    static {
        ga3 ga3 = new ga3();
        DEFAULT_INSTANCE = ga3;
        qe1.m62492dk(ga3.class, ga3);
    }

    /* renamed from: Ck */
    public static ga3 m49219Ck() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Hk */
    public static C5402b m49220Hk() {
        return (C5402b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ik */
    public static C5402b m49221Ik(ga3 ga3) {
        return (C5402b) DEFAULT_INSTANCE.mo43358gj(ga3);
    }

    /* renamed from: Jk */
    public static ga3 m49222Jk(InputStream inputStream) throws IOException {
        return (ga3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static ga3 m49223Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ga3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static ga3 m49224Lk(C5173er erVar) throws nt1 {
        return (ga3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Mk */
    public static ga3 m49225Mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ga3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Nk */
    public static ga3 m49226Nk(g00 g00) throws IOException {
        return (ga3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ok */
    public static ga3 m49227Ok(g00 g00, zy0 zy0) throws IOException {
        return (ga3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Pk */
    public static ga3 m49228Pk(InputStream inputStream) throws IOException {
        return (ga3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Qk */
    public static ga3 m49229Qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ga3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Rk */
    public static ga3 m49230Rk(ByteBuffer byteBuffer) throws nt1 {
        return (ga3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Sk */
    public static ga3 m49231Sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ga3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Tk */
    public static ga3 m49232Tk(byte[] bArr) throws nt1 {
        return (ga3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Uk */
    public static ga3 m49233Uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (ga3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Vk */
    public static cz2<ga3> m49234Vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo36615Ak() {
        vs1.C7095k<ja3> kVar = this.limits_;
        if (!kVar.mo36500p()) {
            this.limits_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Bk */
    public final void mo36616Bk() {
        vs1.C7095k<xi2> kVar = this.metricRules_;
        if (!kVar.mo36500p()) {
            this.metricRules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Dk */
    public ka3 mo36617Dk(int i) {
        return this.limits_.get(i);
    }

    /* renamed from: Ek */
    public List<? extends ka3> mo36618Ek() {
        return this.limits_;
    }

    /* renamed from: Fk */
    public yi2 mo36619Fk(int i) {
        return this.metricRules_.get(i);
    }

    /* renamed from: Gk */
    public List<? extends yi2> mo36620Gk() {
        return this.metricRules_;
    }

    /* renamed from: H2 */
    public ja3 mo36621H2(int i) {
        return this.limits_.get(i);
    }

    /* renamed from: J7 */
    public xi2 mo36622J7(int i) {
        return this.metricRules_.get(i);
    }

    /* renamed from: Wk */
    public final void mo36623Wk(int i) {
        mo36615Ak();
        this.limits_.remove(i);
    }

    /* renamed from: Xk */
    public final void mo36624Xk(int i) {
        mo36616Bk();
        this.metricRules_.remove(i);
    }

    /* renamed from: Yk */
    public final void mo36625Yk(int i, ja3 ja3) {
        ja3.getClass();
        mo36615Ak();
        this.limits_.set(i, ja3);
    }

    /* renamed from: Zk */
    public final void mo36626Zk(int i, xi2 xi2) {
        xi2.getClass();
        mo36616Bk();
        this.metricRules_.set(i, xi2);
    }

    /* renamed from: ii */
    public int mo36627ii() {
        return this.metricRules_.size();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5401a.f29130a[iVar.ordinal()]) {
            case 1:
                return new ga3();
            case 2:
                return new C5402b((C5401a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", ja3.class, "metricRules_", xi2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ga3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ga3.class) {
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
    public final void mo36628sk(Iterable<? extends ja3> iterable) {
        mo36615Ak();
        C7403z0.m72412X6(iterable, this.limits_);
    }

    /* renamed from: tk */
    public final void mo36629tk(Iterable<? extends xi2> iterable) {
        mo36616Bk();
        C7403z0.m72412X6(iterable, this.metricRules_);
    }

    /* renamed from: uk */
    public final void mo36630uk(int i, ja3 ja3) {
        ja3.getClass();
        mo36615Ak();
        this.limits_.add(i, ja3);
    }

    /* renamed from: vk */
    public final void mo36631vk(ja3 ja3) {
        ja3.getClass();
        mo36615Ak();
        this.limits_.add(ja3);
    }

    /* renamed from: wk */
    public final void mo36632wk(int i, xi2 xi2) {
        xi2.getClass();
        mo36616Bk();
        this.metricRules_.add(i, xi2);
    }

    /* renamed from: xg */
    public List<ja3> mo36633xg() {
        return this.limits_;
    }

    /* renamed from: xk */
    public final void mo36634xk(xi2 xi2) {
        xi2.getClass();
        mo36616Bk();
        this.metricRules_.add(xi2);
    }

    /* renamed from: ya */
    public int mo36635ya() {
        return this.limits_.size();
    }

    /* renamed from: yk */
    public final void mo36636yk() {
        this.limits_ = qe1.m62499pj();
    }

    /* renamed from: zd */
    public List<xi2> mo36637zd() {
        return this.metricRules_;
    }

    /* renamed from: zk */
    public final void mo36638zk() {
        this.metricRules_ = qe1.m62499pj();
    }
}
