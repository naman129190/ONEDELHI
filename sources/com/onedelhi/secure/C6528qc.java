package com.onedelhi.secure;

import com.onedelhi.secure.C5882kc;
import com.onedelhi.secure.C7324yc;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.qc */
public final class C6528qc extends qe1<C6528qc, C6530b> implements C7230xc {
    /* access modifiers changed from: private */
    public static final C6528qc DEFAULT_INSTANCE;
    private static volatile cz2<C6528qc> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private vs1.C7095k<C5882kc> providers_ = qe1.m62499pj();
    private vs1.C7095k<C7324yc> rules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.qc$a */
    public static /* synthetic */ class C6529a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34059a;

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
                f34059a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34059a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6528qc.C6529a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.qc$b */
    public static final class C6530b extends qe1.C6546b<C6528qc, C6530b> implements C7230xc {
        public C6530b() {
            super(C6528qc.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6530b(C6529a aVar) {
            this();
        }

        /* renamed from: E3 */
        public C7324yc mo43301E3(int i) {
            return ((C6528qc) this.f34068b).mo43301E3(i);
        }

        /* renamed from: Gj */
        public C6530b mo43322Gj(Iterable<? extends C5882kc> iterable) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43313sk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6530b mo43323Hj(Iterable<? extends C7324yc> iterable) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43314tk(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C6530b mo43324Ij(int i, C5882kc.C5884b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43315uk(i, (C5882kc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jc */
        public C5882kc mo43305Jc(int i) {
            return ((C6528qc) this.f34068b).mo43305Jc(i);
        }

        /* renamed from: Jj */
        public C6530b mo43325Jj(int i, C5882kc kcVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43315uk(i, kcVar);
            return this;
        }

        /* renamed from: Kj */
        public C6530b mo43326Kj(C5882kc.C5884b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43316vk((C5882kc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C6530b mo43327Lj(C5882kc kcVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43316vk(kcVar);
            return this;
        }

        /* renamed from: Mj */
        public C6530b mo43328Mj(int i, C7324yc.C7326b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43317wk(i, (C7324yc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C6530b mo43329Nj(int i, C7324yc ycVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43317wk(i, ycVar);
            return this;
        }

        /* renamed from: Oj */
        public C6530b mo43330Oj(C7324yc.C7326b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43318xk((C7324yc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C6530b mo43331Pj(C7324yc ycVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43318xk(ycVar);
            return this;
        }

        /* renamed from: Qj */
        public C6530b mo43332Qj() {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43320yk();
            return this;
        }

        /* renamed from: Rj */
        public C6530b mo43333Rj() {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43321zk();
            return this;
        }

        /* renamed from: Sj */
        public C6530b mo43334Sj(int i) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43307Wk(i);
            return this;
        }

        /* renamed from: Tj */
        public C6530b mo43335Tj(int i) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43308Xk(i);
            return this;
        }

        /* renamed from: U3 */
        public List<C5882kc> mo43306U3() {
            return Collections.unmodifiableList(((C6528qc) this.f34068b).mo43306U3());
        }

        /* renamed from: Uj */
        public C6530b mo43336Uj(int i, C5882kc.C5884b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43309Yk(i, (C5882kc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C6530b mo43337Vj(int i, C5882kc kcVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43309Yk(i, kcVar);
            return this;
        }

        /* renamed from: Wj */
        public C6530b mo43338Wj(int i, C7324yc.C7326b bVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43310Zk(i, (C7324yc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C6530b mo43339Xj(int i, C7324yc ycVar) {
            mo43393xj();
            ((C6528qc) this.f34068b).mo43310Zk(i, ycVar);
            return this;
        }

        /* renamed from: o */
        public List<C7324yc> mo43311o() {
            return Collections.unmodifiableList(((C6528qc) this.f34068b).mo43311o());
        }

        /* renamed from: q */
        public int mo43312q() {
            return ((C6528qc) this.f34068b).mo43312q();
        }

        /* renamed from: ye */
        public int mo43319ye() {
            return ((C6528qc) this.f34068b).mo43319ye();
        }
    }

    static {
        C6528qc qcVar = new C6528qc();
        DEFAULT_INSTANCE = qcVar;
        qe1.m62492dk(C6528qc.class, qcVar);
    }

    /* renamed from: Ck */
    public static C6528qc m62372Ck() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Hk */
    public static C6530b m62373Hk() {
        return (C6530b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ik */
    public static C6530b m62374Ik(C6528qc qcVar) {
        return (C6530b) DEFAULT_INSTANCE.mo43358gj(qcVar);
    }

    /* renamed from: Jk */
    public static C6528qc m62375Jk(InputStream inputStream) throws IOException {
        return (C6528qc) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static C6528qc m62376Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6528qc) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static C6528qc m62377Lk(C5173er erVar) throws nt1 {
        return (C6528qc) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Mk */
    public static C6528qc m62378Mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6528qc) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Nk */
    public static C6528qc m62379Nk(g00 g00) throws IOException {
        return (C6528qc) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ok */
    public static C6528qc m62380Ok(g00 g00, zy0 zy0) throws IOException {
        return (C6528qc) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Pk */
    public static C6528qc m62381Pk(InputStream inputStream) throws IOException {
        return (C6528qc) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Qk */
    public static C6528qc m62382Qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6528qc) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Rk */
    public static C6528qc m62383Rk(ByteBuffer byteBuffer) throws nt1 {
        return (C6528qc) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Sk */
    public static C6528qc m62384Sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6528qc) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Tk */
    public static C6528qc m62385Tk(byte[] bArr) throws nt1 {
        return (C6528qc) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Uk */
    public static C6528qc m62386Uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6528qc) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Vk */
    public static cz2<C6528qc> m62387Vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo43298Ak() {
        vs1.C7095k<C5882kc> kVar = this.providers_;
        if (!kVar.mo36500p()) {
            this.providers_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Bk */
    public final void mo43299Bk() {
        vs1.C7095k<C7324yc> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Dk */
    public C5984lc mo43300Dk(int i) {
        return this.providers_.get(i);
    }

    /* renamed from: E3 */
    public C7324yc mo43301E3(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: Ek */
    public List<? extends C5984lc> mo43302Ek() {
        return this.providers_;
    }

    /* renamed from: Fk */
    public C7467zc mo43303Fk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: Gk */
    public List<? extends C7467zc> mo43304Gk() {
        return this.rules_;
    }

    /* renamed from: Jc */
    public C5882kc mo43305Jc(int i) {
        return this.providers_.get(i);
    }

    /* renamed from: U3 */
    public List<C5882kc> mo43306U3() {
        return this.providers_;
    }

    /* renamed from: Wk */
    public final void mo43307Wk(int i) {
        mo43298Ak();
        this.providers_.remove(i);
    }

    /* renamed from: Xk */
    public final void mo43308Xk(int i) {
        mo43299Bk();
        this.rules_.remove(i);
    }

    /* renamed from: Yk */
    public final void mo43309Yk(int i, C5882kc kcVar) {
        kcVar.getClass();
        mo43298Ak();
        this.providers_.set(i, kcVar);
    }

    /* renamed from: Zk */
    public final void mo43310Zk(int i, C7324yc ycVar) {
        ycVar.getClass();
        mo43299Bk();
        this.rules_.set(i, ycVar);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6529a.f34059a[iVar.ordinal()]) {
            case 1:
                return new C6528qc();
            case 2:
                return new C6530b((C6529a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", C7324yc.class, "providers_", C5882kc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6528qc> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6528qc.class) {
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

    /* renamed from: o */
    public List<C7324yc> mo43311o() {
        return this.rules_;
    }

    /* renamed from: q */
    public int mo43312q() {
        return this.rules_.size();
    }

    /* renamed from: sk */
    public final void mo43313sk(Iterable<? extends C5882kc> iterable) {
        mo43298Ak();
        C7403z0.m72412X6(iterable, this.providers_);
    }

    /* renamed from: tk */
    public final void mo43314tk(Iterable<? extends C7324yc> iterable) {
        mo43299Bk();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: uk */
    public final void mo43315uk(int i, C5882kc kcVar) {
        kcVar.getClass();
        mo43298Ak();
        this.providers_.add(i, kcVar);
    }

    /* renamed from: vk */
    public final void mo43316vk(C5882kc kcVar) {
        kcVar.getClass();
        mo43298Ak();
        this.providers_.add(kcVar);
    }

    /* renamed from: wk */
    public final void mo43317wk(int i, C7324yc ycVar) {
        ycVar.getClass();
        mo43299Bk();
        this.rules_.add(i, ycVar);
    }

    /* renamed from: xk */
    public final void mo43318xk(C7324yc ycVar) {
        ycVar.getClass();
        mo43299Bk();
        this.rules_.add(ycVar);
    }

    /* renamed from: ye */
    public int mo43319ye() {
        return this.providers_.size();
    }

    /* renamed from: yk */
    public final void mo43320yk() {
        this.providers_ = qe1.m62499pj();
    }

    /* renamed from: zk */
    public final void mo43321zk() {
        this.rules_ = qe1.m62499pj();
    }
}
