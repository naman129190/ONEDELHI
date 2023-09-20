package com.onedelhi.secure;

import com.onedelhi.secure.eq0;
import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class fm3 extends qe1<fm3, C5293b> implements gm3 {
    /* access modifiers changed from: private */
    public static final fm3 DEFAULT_INSTANCE;
    private static volatile cz2<fm3> PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private eq0 retryDelay_;

    /* renamed from: com.onedelhi.secure.fm3$a */
    public static /* synthetic */ class C5292a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28598a;

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
                f28598a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28598a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fm3.C5292a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.fm3$b */
    public static final class C5293b extends qe1.C6546b<fm3, C5293b> implements gm3 {
        public C5293b() {
            super(fm3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5293b(C5292a aVar) {
            this();
        }

        /* renamed from: C7 */
        public boolean mo36134C7() {
            return ((fm3) this.f34068b).mo36134C7();
        }

        /* renamed from: Gj */
        public C5293b mo36138Gj() {
            mo43393xj();
            ((fm3) this.f34068b).mo36135jk();
            return this;
        }

        /* renamed from: Hj */
        public C5293b mo36139Hj(eq0 eq0) {
            mo43393xj();
            ((fm3) this.f34068b).mo36136lk(eq0);
            return this;
        }

        /* renamed from: Ij */
        public C5293b mo36140Ij(eq0.C5172b bVar) {
            mo43393xj();
            ((fm3) this.f34068b).mo36133Bk((eq0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C5293b mo36141Jj(eq0 eq0) {
            mo43393xj();
            ((fm3) this.f34068b).mo36133Bk(eq0);
            return this;
        }

        /* renamed from: pf */
        public eq0 mo36137pf() {
            return ((fm3) this.f34068b).mo36137pf();
        }
    }

    static {
        fm3 fm3 = new fm3();
        DEFAULT_INSTANCE = fm3;
        qe1.m62492dk(fm3.class, fm3);
    }

    /* renamed from: Ak */
    public static cz2<fm3> m48160Ak() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: kk */
    public static fm3 m48165kk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: mk */
    public static C5293b m48166mk() {
        return (C5293b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: nk */
    public static C5293b m48167nk(fm3 fm3) {
        return (C5293b) DEFAULT_INSTANCE.mo43358gj(fm3);
    }

    /* renamed from: ok */
    public static fm3 m48168ok(InputStream inputStream) throws IOException {
        return (fm3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: pk */
    public static fm3 m48169pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (fm3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: qk */
    public static fm3 m48170qk(C5173er erVar) throws nt1 {
        return (fm3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: rk */
    public static fm3 m48171rk(C5173er erVar, zy0 zy0) throws nt1 {
        return (fm3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: sk */
    public static fm3 m48172sk(g00 g00) throws IOException {
        return (fm3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: tk */
    public static fm3 m48173tk(g00 g00, zy0 zy0) throws IOException {
        return (fm3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: uk */
    public static fm3 m48174uk(InputStream inputStream) throws IOException {
        return (fm3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: vk */
    public static fm3 m48175vk(InputStream inputStream, zy0 zy0) throws IOException {
        return (fm3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: wk */
    public static fm3 m48176wk(ByteBuffer byteBuffer) throws nt1 {
        return (fm3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: xk */
    public static fm3 m48177xk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (fm3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: yk */
    public static fm3 m48178yk(byte[] bArr) throws nt1 {
        return (fm3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: zk */
    public static fm3 m48179zk(byte[] bArr, zy0 zy0) throws nt1 {
        return (fm3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Bk */
    public final void mo36133Bk(eq0 eq0) {
        eq0.getClass();
        this.retryDelay_ = eq0;
    }

    /* renamed from: C7 */
    public boolean mo36134C7() {
        return this.retryDelay_ != null;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5292a.f28598a[iVar.ordinal()]) {
            case 1:
                return new fm3();
            case 2:
                return new C5293b((C5292a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"retryDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<fm3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (fm3.class) {
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

    /* renamed from: jk */
    public final void mo36135jk() {
        this.retryDelay_ = null;
    }

    /* renamed from: lk */
    public final void mo36136lk(eq0 eq0) {
        eq0.getClass();
        eq0 eq02 = this.retryDelay_;
        if (!(eq02 == null || eq02 == eq0.m47083mk())) {
            eq0 = (eq0) ((eq0.C5172b) eq0.m47085ok(this.retryDelay_).mo43372Cj(eq0)).mo43377Ja();
        }
        this.retryDelay_ = eq0;
    }

    /* renamed from: pf */
    public eq0 mo36137pf() {
        eq0 eq0 = this.retryDelay_;
        return eq0 == null ? eq0.m47083mk() : eq0;
    }
}
