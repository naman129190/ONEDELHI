package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import com.onedelhi.secure.z54;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class lk2 extends qe1<lk2, C6012b> implements mk2 {
    /* access modifiers changed from: private */
    public static final lk2 DEFAULT_INSTANCE;
    private static volatile cz2<lk2> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private z54 systemLabels_;
    private rc2<String, String> userLabels_ = rc2.m63481i();

    /* renamed from: com.onedelhi.secure.lk2$a */
    public static /* synthetic */ class C6011a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31723a;

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
                f31723a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31723a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lk2.C6011a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.lk2$b */
    public static final class C6012b extends qe1.C6546b<lk2, C6012b> implements mk2 {
        public C6012b() {
            super(lk2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6012b(C6011a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6012b mo39913Gj() {
            mo43393xj();
            ((lk2) this.f34068b).mo39904kk();
            return this;
        }

        /* renamed from: Hj */
        public C6012b mo39914Hj() {
            mo43393xj();
            ((lk2) this.f34068b).mo39905mk().clear();
            return this;
        }

        /* renamed from: Ij */
        public C6012b mo39915Ij(z54 z54) {
            mo43393xj();
            ((lk2) this.f34068b).mo39908pk(z54);
            return this;
        }

        /* renamed from: Jj */
        public C6012b mo39916Jj(Map<String, String> map) {
            mo43393xj();
            ((lk2) this.f34068b).mo39905mk().putAll(map);
            return this;
        }

        /* renamed from: Kj */
        public C6012b mo39917Kj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((lk2) this.f34068b).mo39905mk().put(str, str2);
            return this;
        }

        /* renamed from: Lj */
        public C6012b mo39918Lj(String str) {
            str.getClass();
            mo43393xj();
            ((lk2) this.f34068b).mo39905mk().remove(str);
            return this;
        }

        /* renamed from: M4 */
        public int mo39900M4() {
            return ((lk2) this.f34068b).mo39911xa().size();
        }

        /* renamed from: Mj */
        public C6012b mo39919Mj(z54.C7435b bVar) {
            mo43393xj();
            ((lk2) this.f34068b).mo39899Fk((z54) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nj */
        public C6012b mo39920Nj(z54 z54) {
            mo43393xj();
            ((lk2) this.f34068b).mo39899Fk(z54);
            return this;
        }

        /* renamed from: T3 */
        public String mo39901T3(String str, String str2) {
            str.getClass();
            Map<String, String> xa = ((lk2) this.f34068b).mo39911xa();
            return xa.containsKey(str) ? xa.get(str) : str2;
        }

        /* renamed from: V2 */
        public z54 mo39902V2() {
            return ((lk2) this.f34068b).mo39902V2();
        }

        @Deprecated
        /* renamed from: Y7 */
        public Map<String, String> mo39903Y7() {
            return mo39911xa();
        }

        /* renamed from: u3 */
        public String mo39909u3(String str) {
            str.getClass();
            Map<String, String> xa = ((lk2) this.f34068b).mo39911xa();
            if (xa.containsKey(str)) {
                return xa.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: w3 */
        public boolean mo39910w3() {
            return ((lk2) this.f34068b).mo39910w3();
        }

        /* renamed from: xa */
        public Map<String, String> mo39911xa() {
            return Collections.unmodifiableMap(((lk2) this.f34068b).mo39911xa());
        }

        /* renamed from: zb */
        public boolean mo39912zb(String str) {
            str.getClass();
            return ((lk2) this.f34068b).mo39911xa().containsKey(str);
        }
    }

    /* renamed from: com.onedelhi.secure.lk2$c */
    public static final class C6013c {

        /* renamed from: a */
        public static final oc2<String, String> f31724a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f31724a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        lk2 lk2 = new lk2();
        DEFAULT_INSTANCE = lk2;
        qe1.m62492dk(lk2.class, lk2);
    }

    /* renamed from: Ak */
    public static lk2 m55729Ak(ByteBuffer byteBuffer) throws nt1 {
        return (lk2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Bk */
    public static lk2 m55730Bk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (lk2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ck */
    public static lk2 m55731Ck(byte[] bArr) throws nt1 {
        return (lk2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Dk */
    public static lk2 m55732Dk(byte[] bArr, zy0 zy0) throws nt1 {
        return (lk2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ek */
    public static cz2<lk2> m55733Ek() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: lk */
    public static lk2 m55739lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: qk */
    public static C6012b m55740qk() {
        return (C6012b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: rk */
    public static C6012b m55741rk(lk2 lk2) {
        return (C6012b) DEFAULT_INSTANCE.mo43358gj(lk2);
    }

    /* renamed from: sk */
    public static lk2 m55742sk(InputStream inputStream) throws IOException {
        return (lk2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: tk */
    public static lk2 m55743tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (lk2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: uk */
    public static lk2 m55744uk(C5173er erVar) throws nt1 {
        return (lk2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: vk */
    public static lk2 m55745vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (lk2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: wk */
    public static lk2 m55746wk(g00 g00) throws IOException {
        return (lk2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: xk */
    public static lk2 m55747xk(g00 g00, zy0 zy0) throws IOException {
        return (lk2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: yk */
    public static lk2 m55748yk(InputStream inputStream) throws IOException {
        return (lk2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: zk */
    public static lk2 m55749zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (lk2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public final void mo39899Fk(z54 z54) {
        z54.getClass();
        this.systemLabels_ = z54;
    }

    /* renamed from: M4 */
    public int mo39900M4() {
        return mo39907ok().size();
    }

    /* renamed from: T3 */
    public String mo39901T3(String str, String str2) {
        str.getClass();
        rc2<String, String> ok = mo39907ok();
        return ok.containsKey(str) ? ok.get(str) : str2;
    }

    /* renamed from: V2 */
    public z54 mo39902V2() {
        z54 z54 = this.systemLabels_;
        return z54 == null ? z54.m72555hk() : z54;
    }

    @Deprecated
    /* renamed from: Y7 */
    public Map<String, String> mo39903Y7() {
        return mo39911xa();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6011a.f31723a[iVar.ordinal()]) {
            case 1:
                return new lk2();
            case 2:
                return new C6012b((C6011a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"systemLabels_", "userLabels_", C6013c.f31724a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<lk2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (lk2.class) {
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

    /* renamed from: kk */
    public final void mo39904kk() {
        this.systemLabels_ = null;
    }

    /* renamed from: mk */
    public final Map<String, String> mo39905mk() {
        return mo39906nk();
    }

    /* renamed from: nk */
    public final rc2<String, String> mo39906nk() {
        if (!this.userLabels_.mo43841n()) {
            this.userLabels_ = this.userLabels_.mo43846q();
        }
        return this.userLabels_;
    }

    /* renamed from: ok */
    public final rc2<String, String> mo39907ok() {
        return this.userLabels_;
    }

    /* renamed from: pk */
    public final void mo39908pk(z54 z54) {
        z54.getClass();
        z54 z542 = this.systemLabels_;
        if (!(z542 == null || z542 == z54.m72555hk())) {
            z54 = (z54) ((z54.C7435b) z54.m72557mk(this.systemLabels_).mo43372Cj(z54)).mo43377Ja();
        }
        this.systemLabels_ = z54;
    }

    /* renamed from: u3 */
    public String mo39909u3(String str) {
        str.getClass();
        rc2<String, String> ok = mo39907ok();
        if (ok.containsKey(str)) {
            return ok.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w3 */
    public boolean mo39910w3() {
        return this.systemLabels_ != null;
    }

    /* renamed from: xa */
    public Map<String, String> mo39911xa() {
        return Collections.unmodifiableMap(mo39907ok());
    }

    /* renamed from: zb */
    public boolean mo39912zb(String str) {
        str.getClass();
        return mo39907ok().containsKey(str);
    }
}
