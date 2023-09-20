package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class xi2 extends qe1<xi2, C7261b> implements yi2 {
    /* access modifiers changed from: private */
    public static final xi2 DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile cz2<xi2> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private rc2<String, Long> metricCosts_ = rc2.m63481i();
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.xi2$a */
    public static /* synthetic */ class C7260a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37480a;

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
                f37480a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37480a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xi2.C7260a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.xi2$b */
    public static final class C7261b extends qe1.C6546b<xi2, C7261b> implements yi2 {
        public C7261b() {
            super(xi2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7261b(C7260a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7261b mo47209Gj() {
            mo43393xj();
            ((xi2) this.f34068b).mo47205mk().clear();
            return this;
        }

        /* renamed from: Hj */
        public C7261b mo47210Hj() {
            mo43393xj();
            ((xi2) this.f34068b).mo47203kk();
            return this;
        }

        /* renamed from: Ij */
        public C7261b mo47211Ij(Map<String, Long> map) {
            mo43393xj();
            ((xi2) this.f34068b).mo47205mk().putAll(map);
            return this;
        }

        /* renamed from: Jj */
        public C7261b mo47212Jj(String str, long j) {
            str.getClass();
            mo43393xj();
            ((xi2) this.f34068b).mo47205mk().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: Kj */
        public C7261b mo47213Kj(String str) {
            str.getClass();
            mo43393xj();
            ((xi2) this.f34068b).mo47205mk().remove(str);
            return this;
        }

        /* renamed from: Lj */
        public C7261b mo47214Lj(String str) {
            mo43393xj();
            ((xi2) this.f34068b).mo47195Ek(str);
            return this;
        }

        /* renamed from: Mj */
        public C7261b mo47215Mj(C5173er erVar) {
            mo43393xj();
            ((xi2) this.f34068b).mo47196Fk(erVar);
            return this;
        }

        /* renamed from: Q7 */
        public long mo47197Q7(String str, long j) {
            str.getClass();
            Map<String, Long> yh = ((xi2) this.f34068b).mo47208yh();
            return yh.containsKey(str) ? yh.get(str).longValue() : j;
        }

        /* renamed from: Tf */
        public int mo47198Tf() {
            return ((xi2) this.f34068b).mo47208yh().size();
        }

        @Deprecated
        /* renamed from: ba */
        public Map<String, Long> mo47199ba() {
            return mo47208yh();
        }

        /* renamed from: ef */
        public long mo47200ef(String str) {
            str.getClass();
            Map<String, Long> yh = ((xi2) this.f34068b).mo47208yh();
            if (yh.containsKey(str)) {
                return yh.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g9 */
        public boolean mo47201g9(String str) {
            str.getClass();
            return ((xi2) this.f34068b).mo47208yh().containsKey(str);
        }

        /* renamed from: k */
        public String mo47202k() {
            return ((xi2) this.f34068b).mo47202k();
        }

        /* renamed from: l */
        public C5173er mo47204l() {
            return ((xi2) this.f34068b).mo47204l();
        }

        /* renamed from: yh */
        public Map<String, Long> mo47208yh() {
            return Collections.unmodifiableMap(((xi2) this.f34068b).mo47208yh());
        }
    }

    /* renamed from: com.onedelhi.secure.xi2$c */
    public static final class C7262c {

        /* renamed from: a */
        public static final oc2<String, Long> f37481a = oc2.m59242f(wx4.C7195b.STRING, "", wx4.C7195b.INT64, 0L);
    }

    static {
        xi2 xi2 = new xi2();
        DEFAULT_INSTANCE = xi2;
        qe1.m62492dk(xi2.class, xi2);
    }

    /* renamed from: Ak */
    public static xi2 m70292Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (xi2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static xi2 m70293Bk(byte[] bArr) throws nt1 {
        return (xi2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static xi2 m70294Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (xi2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<xi2> m70295Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: lk */
    public static xi2 m70301lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C7261b m70302pk() {
        return (C7261b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C7261b m70303qk(xi2 xi2) {
        return (C7261b) DEFAULT_INSTANCE.mo43358gj(xi2);
    }

    /* renamed from: rk */
    public static xi2 m70304rk(InputStream inputStream) throws IOException {
        return (xi2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static xi2 m70305sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (xi2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static xi2 m70306tk(C5173er erVar) throws nt1 {
        return (xi2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static xi2 m70307uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (xi2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static xi2 m70308vk(g00 g00) throws IOException {
        return (xi2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static xi2 m70309wk(g00 g00, zy0 zy0) throws IOException {
        return (xi2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static xi2 m70310xk(InputStream inputStream) throws IOException {
        return (xi2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static xi2 m70311yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (xi2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static xi2 m70312zk(ByteBuffer byteBuffer) throws nt1 {
        return (xi2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public final void mo47195Ek(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: Fk */
    public final void mo47196Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: Q7 */
    public long mo47197Q7(String str, long j) {
        str.getClass();
        rc2<String, Long> nk = mo47206nk();
        return nk.containsKey(str) ? nk.get(str).longValue() : j;
    }

    /* renamed from: Tf */
    public int mo47198Tf() {
        return mo47206nk().size();
    }

    @Deprecated
    /* renamed from: ba */
    public Map<String, Long> mo47199ba() {
        return mo47208yh();
    }

    /* renamed from: ef */
    public long mo47200ef(String str) {
        str.getClass();
        rc2<String, Long> nk = mo47206nk();
        if (nk.containsKey(str)) {
            return nk.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g9 */
    public boolean mo47201g9(String str) {
        str.getClass();
        return mo47206nk().containsKey(str);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7260a.f37480a[iVar.ordinal()]) {
            case 1:
                return new xi2();
            case 2:
                return new C7261b((C7260a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", C7262c.f37481a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<xi2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (xi2.class) {
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

    /* renamed from: k */
    public String mo47202k() {
        return this.selector_;
    }

    /* renamed from: kk */
    public final void mo47203kk() {
        this.selector_ = m70301lk().mo47202k();
    }

    /* renamed from: l */
    public C5173er mo47204l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: mk */
    public final Map<String, Long> mo47205mk() {
        return mo47207ok();
    }

    /* renamed from: nk */
    public final rc2<String, Long> mo47206nk() {
        return this.metricCosts_;
    }

    /* renamed from: ok */
    public final rc2<String, Long> mo47207ok() {
        if (!this.metricCosts_.mo43841n()) {
            this.metricCosts_ = this.metricCosts_.mo43846q();
        }
        return this.metricCosts_;
    }

    /* renamed from: yh */
    public Map<String, Long> mo47208yh() {
        return Collections.unmodifiableMap(mo47206nk());
    }
}
