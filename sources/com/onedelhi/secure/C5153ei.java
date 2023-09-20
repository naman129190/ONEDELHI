package com.onedelhi.secure;

import com.onedelhi.secure.C6115mi;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.ei */
public final class C5153ei extends qe1<C5153ei, C5155b> implements C5434gi {
    /* access modifiers changed from: private */
    public static final C5153ei DEFAULT_INSTANCE;
    private static volatile cz2<C5153ei> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private vs1.C7095k<C6115mi> rules_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.ei$a */
    public static /* synthetic */ class C5154a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27948a;

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
                f27948a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27948a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5153ei.C5154a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ei$b */
    public static final class C5155b extends qe1.C6546b<C5153ei, C5155b> implements C5434gi {
        public C5155b() {
            super(C5153ei.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5155b(C5154a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C5155b mo35412Gj(Iterable<? extends C6115mi> iterable) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35403mk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5155b mo35413Hj(int i, C6115mi.C6118c cVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35404nk(i, (C6115mi) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C5155b mo35414Ij(int i, C6115mi miVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35404nk(i, miVar);
            return this;
        }

        /* renamed from: Jj */
        public C5155b mo35415Jj(C6115mi.C6118c cVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35406ok((C6115mi) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C5155b mo35416Kj(C6115mi miVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35406ok(miVar);
            return this;
        }

        /* renamed from: Lj */
        public C5155b mo35417Lj() {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35407pk();
            return this;
        }

        /* renamed from: Mj */
        public C5155b mo35418Mj(int i) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35400Jk(i);
            return this;
        }

        /* renamed from: Nj */
        public C5155b mo35419Nj(int i, C6115mi.C6118c cVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35401Kk(i, (C6115mi) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C5155b mo35420Oj(int i, C6115mi miVar) {
            mo43393xj();
            ((C5153ei) this.f34068b).mo35401Kk(i, miVar);
            return this;
        }

        /* renamed from: W9 */
        public C6115mi mo35402W9(int i) {
            return ((C5153ei) this.f34068b).mo35402W9(i);
        }

        /* renamed from: o */
        public List<C6115mi> mo35405o() {
            return Collections.unmodifiableList(((C5153ei) this.f34068b).mo35405o());
        }

        /* renamed from: q */
        public int mo35408q() {
            return ((C5153ei) this.f34068b).mo35408q();
        }
    }

    static {
        C5153ei eiVar = new C5153ei();
        DEFAULT_INSTANCE = eiVar;
        qe1.m62492dk(C5153ei.class, eiVar);
    }

    /* renamed from: Ak */
    public static C5153ei m46841Ak(g00 g00) throws IOException {
        return (C5153ei) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Bk */
    public static C5153ei m46842Bk(g00 g00, zy0 zy0) throws IOException {
        return (C5153ei) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ck */
    public static C5153ei m46843Ck(InputStream inputStream) throws IOException {
        return (C5153ei) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static C5153ei m46844Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5153ei) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static C5153ei m46845Ek(ByteBuffer byteBuffer) throws nt1 {
        return (C5153ei) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Fk */
    public static C5153ei m46846Fk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C5153ei) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Gk */
    public static C5153ei m46847Gk(byte[] bArr) throws nt1 {
        return (C5153ei) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Hk */
    public static C5153ei m46848Hk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C5153ei) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ik */
    public static cz2<C5153ei> m46849Ik() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: rk */
    public static C5153ei m46857rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: uk */
    public static C5155b m46858uk() {
        return (C5155b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: vk */
    public static C5155b m46859vk(C5153ei eiVar) {
        return (C5155b) DEFAULT_INSTANCE.mo43358gj(eiVar);
    }

    /* renamed from: wk */
    public static C5153ei m46860wk(InputStream inputStream) throws IOException {
        return (C5153ei) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static C5153ei m46861xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C5153ei) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static C5153ei m46862yk(C5173er erVar) throws nt1 {
        return (C5153ei) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: zk */
    public static C5153ei m46863zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C5153ei) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Jk */
    public final void mo35400Jk(int i) {
        mo35409qk();
        this.rules_.remove(i);
    }

    /* renamed from: Kk */
    public final void mo35401Kk(int i, C6115mi miVar) {
        miVar.getClass();
        mo35409qk();
        this.rules_.set(i, miVar);
    }

    /* renamed from: W9 */
    public C6115mi mo35402W9(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5154a.f27948a[iVar.ordinal()]) {
            case 1:
                return new C5153ei();
            case 2:
                return new C5155b((C5154a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", C6115mi.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C5153ei> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C5153ei.class) {
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
    public final void mo35403mk(Iterable<? extends C6115mi> iterable) {
        mo35409qk();
        C7403z0.m72412X6(iterable, this.rules_);
    }

    /* renamed from: nk */
    public final void mo35404nk(int i, C6115mi miVar) {
        miVar.getClass();
        mo35409qk();
        this.rules_.add(i, miVar);
    }

    /* renamed from: o */
    public List<C6115mi> mo35405o() {
        return this.rules_;
    }

    /* renamed from: ok */
    public final void mo35406ok(C6115mi miVar) {
        miVar.getClass();
        mo35409qk();
        this.rules_.add(miVar);
    }

    /* renamed from: pk */
    public final void mo35407pk() {
        this.rules_ = qe1.m62499pj();
    }

    /* renamed from: q */
    public int mo35408q() {
        return this.rules_.size();
    }

    /* renamed from: qk */
    public final void mo35409qk() {
        vs1.C7095k<C6115mi> kVar = this.rules_;
        if (!kVar.mo36500p()) {
            this.rules_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: sk */
    public C6189ni mo35410sk(int i) {
        return this.rules_.get(i);
    }

    /* renamed from: tk */
    public List<? extends C6189ni> mo35411tk() {
        return this.rules_;
    }
}
