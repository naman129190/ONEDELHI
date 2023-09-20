package com.onedelhi.secure;

import com.onedelhi.secure.dw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class d42 extends qe1<d42, C4955b> implements e42 {
    /* access modifiers changed from: private */
    public static final d42 DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile cz2<d42> PARSER;
    private String nextPageToken_ = "";
    private vs1.C7095k<dw2> operations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.d42$a */
    public static /* synthetic */ class C4954a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27243a;

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
                f27243a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27243a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d42.C4954a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.d42$b */
    public static final class C4955b extends qe1.C6546b<d42, C4955b> implements e42 {
        public C4955b() {
            super(d42.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4955b(C4954a aVar) {
            this();
        }

        /* renamed from: Ag */
        public List<dw2> mo34189Ag() {
            return Collections.unmodifiableList(((d42) this.f34068b).mo34189Ag());
        }

        /* renamed from: D5 */
        public String mo34190D5() {
            return ((d42) this.f34068b).mo34190D5();
        }

        /* renamed from: Gj */
        public C4955b mo34206Gj(Iterable<? extends dw2> iterable) {
            mo43393xj();
            ((d42) this.f34068b).mo34198pk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C4955b mo34207Hj(int i, dw2.C5062b bVar) {
            mo43393xj();
            ((d42) this.f34068b).mo34199qk(i, (dw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C4955b mo34208Ij(int i, dw2 dw2) {
            mo43393xj();
            ((d42) this.f34068b).mo34199qk(i, dw2);
            return this;
        }

        /* renamed from: Jj */
        public C4955b mo34209Jj(dw2.C5062b bVar) {
            mo43393xj();
            ((d42) this.f34068b).mo34200rk((dw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ke */
        public int mo34191Ke() {
            return ((d42) this.f34068b).mo34191Ke();
        }

        /* renamed from: Kj */
        public C4955b mo34210Kj(dw2 dw2) {
            mo43393xj();
            ((d42) this.f34068b).mo34200rk(dw2);
            return this;
        }

        /* renamed from: Lj */
        public C4955b mo34211Lj() {
            mo43393xj();
            ((d42) this.f34068b).mo34201sk();
            return this;
        }

        /* renamed from: Mj */
        public C4955b mo34212Mj() {
            mo43393xj();
            ((d42) this.f34068b).mo34202tk();
            return this;
        }

        /* renamed from: Nj */
        public C4955b mo34213Nj(int i) {
            mo43393xj();
            ((d42) this.f34068b).mo34192Nk(i);
            return this;
        }

        /* renamed from: Oj */
        public C4955b mo34214Oj(String str) {
            mo43393xj();
            ((d42) this.f34068b).mo34193Ok(str);
            return this;
        }

        /* renamed from: P9 */
        public C5173er mo34194P9() {
            return ((d42) this.f34068b).mo34194P9();
        }

        /* renamed from: Pj */
        public C4955b mo34215Pj(C5173er erVar) {
            mo43393xj();
            ((d42) this.f34068b).mo34195Pk(erVar);
            return this;
        }

        /* renamed from: Qj */
        public C4955b mo34216Qj(int i, dw2.C5062b bVar) {
            mo43393xj();
            ((d42) this.f34068b).mo34196Qk(i, (dw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Rj */
        public C4955b mo34217Rj(int i, dw2 dw2) {
            mo43393xj();
            ((d42) this.f34068b).mo34196Qk(i, dw2);
            return this;
        }

        /* renamed from: g5 */
        public dw2 mo34197g5(int i) {
            return ((d42) this.f34068b).mo34197g5(i);
        }
    }

    static {
        d42 d42 = new d42();
        DEFAULT_INSTANCE = d42;
        qe1.m62492dk(d42.class, d42);
    }

    /* renamed from: Ak */
    public static d42 m44677Ak(InputStream inputStream) throws IOException {
        return (d42) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Bk */
    public static d42 m44678Bk(InputStream inputStream, zy0 zy0) throws IOException {
        return (d42) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ck */
    public static d42 m44679Ck(C5173er erVar) throws nt1 {
        return (d42) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Dk */
    public static d42 m44680Dk(C5173er erVar, zy0 zy0) throws nt1 {
        return (d42) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Ek */
    public static d42 m44681Ek(g00 g00) throws IOException {
        return (d42) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Fk */
    public static d42 m44682Fk(g00 g00, zy0 zy0) throws IOException {
        return (d42) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Gk */
    public static d42 m44683Gk(InputStream inputStream) throws IOException {
        return (d42) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Hk */
    public static d42 m44684Hk(InputStream inputStream, zy0 zy0) throws IOException {
        return (d42) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ik */
    public static d42 m44685Ik(ByteBuffer byteBuffer) throws nt1 {
        return (d42) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Jk */
    public static d42 m44686Jk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (d42) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Kk */
    public static d42 m44687Kk(byte[] bArr) throws nt1 {
        return (d42) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Lk */
    public static d42 m44688Lk(byte[] bArr, zy0 zy0) throws nt1 {
        return (d42) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Mk */
    public static cz2<d42> m44689Mk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: vk */
    public static d42 m44700vk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: yk */
    public static C4955b m44701yk() {
        return (C4955b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: zk */
    public static C4955b m44702zk(d42 d42) {
        return (C4955b) DEFAULT_INSTANCE.mo43358gj(d42);
    }

    /* renamed from: Ag */
    public List<dw2> mo34189Ag() {
        return this.operations_;
    }

    /* renamed from: D5 */
    public String mo34190D5() {
        return this.nextPageToken_;
    }

    /* renamed from: Ke */
    public int mo34191Ke() {
        return this.operations_.size();
    }

    /* renamed from: Nk */
    public final void mo34192Nk(int i) {
        mo34203uk();
        this.operations_.remove(i);
    }

    /* renamed from: Ok */
    public final void mo34193Ok(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* renamed from: P9 */
    public C5173er mo34194P9() {
        return C5173er.m47136w(this.nextPageToken_);
    }

    /* renamed from: Pk */
    public final void mo34195Pk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.nextPageToken_ = erVar.mo35543k0();
    }

    /* renamed from: Qk */
    public final void mo34196Qk(int i, dw2 dw2) {
        dw2.getClass();
        mo34203uk();
        this.operations_.set(i, dw2);
    }

    /* renamed from: g5 */
    public dw2 mo34197g5(int i) {
        return this.operations_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4954a.f27243a[iVar.ordinal()]) {
            case 1:
                return new d42();
            case 2:
                return new C4955b((C4954a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", dw2.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<d42> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (d42.class) {
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

    /* renamed from: pk */
    public final void mo34198pk(Iterable<? extends dw2> iterable) {
        mo34203uk();
        C7403z0.m72412X6(iterable, this.operations_);
    }

    /* renamed from: qk */
    public final void mo34199qk(int i, dw2 dw2) {
        dw2.getClass();
        mo34203uk();
        this.operations_.add(i, dw2);
    }

    /* renamed from: rk */
    public final void mo34200rk(dw2 dw2) {
        dw2.getClass();
        mo34203uk();
        this.operations_.add(dw2);
    }

    /* renamed from: sk */
    public final void mo34201sk() {
        this.nextPageToken_ = m44700vk().mo34190D5();
    }

    /* renamed from: tk */
    public final void mo34202tk() {
        this.operations_ = qe1.m62499pj();
    }

    /* renamed from: uk */
    public final void mo34203uk() {
        vs1.C7095k<dw2> kVar = this.operations_;
        if (!kVar.mo36500p()) {
            this.operations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: wk */
    public iw2 mo34204wk(int i) {
        return this.operations_.get(i);
    }

    /* renamed from: xk */
    public List<? extends iw2> mo34205xk() {
        return this.operations_;
    }
}
