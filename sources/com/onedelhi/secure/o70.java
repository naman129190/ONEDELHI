package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.w70;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class o70 extends qe1<o70, C6252b> implements u70 {
    /* access modifiers changed from: private */
    public static final o70 DEFAULT_INSTANCE;
    private static volatile cz2<o70> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private vs1.C7095k<w70> rules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.o70$a */
    public static /* synthetic */ class C6251a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32894a;

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
                f32894a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32894a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o70.C6251a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.o70$b */
    public static final class C6252b extends qe1.C6546b<o70, C6252b> implements u70 {
        public C6252b() {
            super(o70.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6252b(C6251a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6252b mo41576Gj(Iterable<? extends w70> iterable) {
            mo43393xj();
            ((o70) this.f34068b).mo41567mk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6252b mo41577Hj(int i, w70.C7145b bVar) {
            mo43393xj();
            ((o70) this.f34068b).mo41568nk(i, (w70) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6252b mo41578Ij(int i, w70 w70) {
            mo43393xj();
            ((o70) this.f34068b).mo41568nk(i, w70);
            return this;
        }

        /* renamed from: Jj */
        public C6252b mo41579Jj(w70.C7145b bVar) {
            mo43393xj();
            ((o70) this.f34068b).mo41570ok((w70) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6252b mo41580Kj(w70 w70) {
            mo43393xj();
            ((o70) this.f34068b).mo41570ok(w70);
            return this;
        }

        /* renamed from: Lj */
        public C6252b mo41581Lj() {
            mo43393xj();
            ((o70) this.f34068b).mo41571pk();
            return this;
        }

        /* renamed from: Mj */
        public C6252b mo41582Mj(int i) {
            mo43393xj();
            ((o70) this.f34068b).mo41564Jk(i);
            return this;
        }

        /* renamed from: Nj */
        public C6252b mo41583Nj(int i, w70.C7145b bVar) {
            mo43393xj();
            ((o70) this.f34068b).mo41565Kk(i, (w70) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C6252b mo41584Oj(int i, w70 w70) {
            mo43393xj();
            ((o70) this.f34068b).mo41565Kk(i, w70);
            return this;
        }

        /* renamed from: W2 */
        public w70 mo41566W2(int i) {
            return ((o70) this.f34068b).mo41566W2(i);
        }

        /* renamed from: o */
        public List<w70> mo41569o() {
            return Collections.unmodifiableList(((o70) this.f34068b).mo41569o());
        }

        /* renamed from: q */
        public int mo41572q() {
            return ((o70) this.f34068b).mo41572q();
        }
    }

    static {
        o70 o70 = new o70();
        DEFAULT_INSTANCE = o70;
        qe1.m62492dk(o70.class, o70);
    }

    /* renamed from: Ak */
    public static o70 m59036Ak(g00 g00) throws IOException {
        return (o70) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Bk */
    public static o70 m59037Bk(g00 g00, zy0 zy0) throws IOException {
        return (o70) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ck */
    public static o70 m59038Ck(InputStream inputStream) throws IOException {
        return (o70) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static o70 m59039Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (o70) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static o70 m59040Ek(ByteBuffer byteBuffer) throws nt1 {
        return (o70) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Fk */
    public static o70 m59041Fk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (o70) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Gk */
    public static o70 m59042Gk(byte[] bArr) throws nt1 {
        return (o70) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Hk */
    public static o70 m59043Hk(byte[] bArr, zy0 zy0) throws nt1 {
        return (o70) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ik */
    public static cz2<o70> m59044Ik() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: rk */
    public static o70 m59052rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: uk */
    public static C6252b m59053uk() {
        return (C6252b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: vk */
    public static C6252b m59054vk(o70 o70) {
        return (C6252b) DEFAULT_INSTANCE.mo43358gj(o70);
    }

    /* renamed from: wk */
    public static o70 m59055wk(InputStream inputStream) throws IOException {
        return (o70) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static o70 m59056xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (o70) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static o70 m59057yk(C5173er erVar) throws nt1 {
        return (o70) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: zk */
    public static o70 m59058zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (o70) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Jk */
    public final void mo41564Jk(int i) {
        mo41573qk();
        this.rules_.remove(i);
    }

    /* renamed from: Kk */
    public final void mo41565Kk(int i, w70 w70) {
        w70.getClass();
        mo41573qk();
        this.rules_.set(i, w70);
    }

    /* renamed from: W2 */
    public w70 mo41566W2(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6251a.f32894a[iVar.ordinal()]) {
            case 1:
                return new o70();
            case 2:
                return new C6252b((C6251a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", w70.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<o70> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (o70.class) {
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

    /* renamed from: mk */
    public final void mo41567mk(Iterable<? extends w70> iterable) {
        mo41573qk();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: nk */
    public final void mo41568nk(int i, w70 w70) {
        w70.getClass();
        mo41573qk();
        this.rules_.add(i, w70);
    }

    /* renamed from: o */
    public List<w70> mo41569o() {
        return this.rules_;
    }

    /* renamed from: ok */
    public final void mo41570ok(w70 w70) {
        w70.getClass();
        mo41573qk();
        this.rules_.add(w70);
    }

    /* renamed from: pk */
    public final void mo41571pk() {
        this.rules_ = qe1.m62499pj();
    }

    /* renamed from: q */
    public int mo41572q() {
        return this.rules_.size();
    }

    /* renamed from: qk */
    public final void mo41573qk() {
        vs1.C7095k<w70> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: sk */
    public x70 mo41574sk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: tk */
    public List<? extends x70> mo41575tk() {
        return this.rules_;
    }
}
