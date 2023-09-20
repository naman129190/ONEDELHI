package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ku0 extends qe1<ku0, C5939b> implements lu0 {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final ku0 DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<ku0> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private vs1.C7095k<String> aliases_ = qe1.m62499pj();
    private boolean allowCors_;
    private vs1.C7095k<String> features_ = qe1.m62499pj();
    private String name_ = "";
    private String target_ = "";

    /* renamed from: com.onedelhi.secure.ku0$a */
    public static /* synthetic */ class C5938a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31434a;

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
                f31434a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31434a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ku0.C5938a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ku0$b */
    public static final class C5939b extends qe1.C6546b<ku0, C5939b> implements lu0 {
        public C5939b() {
            super(ku0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5939b(C5938a aVar) {
            this();
        }

        @Deprecated
        /* renamed from: Gj */
        public C5939b mo39496Gj(String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39494yk(str);
            return this;
        }

        @Deprecated
        /* renamed from: Hj */
        public C5939b mo39497Hj(C5173er erVar) {
            mo43393xj();
            ((ku0) this.f34068b).mo39495zk(erVar);
            return this;
        }

        /* renamed from: If */
        public int mo39471If() {
            return ((ku0) this.f34068b).mo39471If();
        }

        @Deprecated
        /* renamed from: Ij */
        public C5939b mo39498Ij(Iterable<String> iterable) {
            mo43393xj();
            ((ku0) this.f34068b).mo39463Ak(iterable);
            return this;
        }

        /* renamed from: Jj */
        public C5939b mo39499Jj(Iterable<String> iterable) {
            mo43393xj();
            ((ku0) this.f34068b).mo39464Bk(iterable);
            return this;
        }

        /* renamed from: Kj */
        public C5939b mo39500Kj(String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39465Ck(str);
            return this;
        }

        /* renamed from: Lj */
        public C5939b mo39501Lj(C5173er erVar) {
            mo43393xj();
            ((ku0) this.f34068b).mo39466Dk(erVar);
            return this;
        }

        @Deprecated
        /* renamed from: Mj */
        public C5939b mo39502Mj() {
            mo43393xj();
            ((ku0) this.f34068b).mo39467Ek();
            return this;
        }

        @Deprecated
        /* renamed from: Nd */
        public List<String> mo39475Nd() {
            return Collections.unmodifiableList(((ku0) this.f34068b).mo39475Nd());
        }

        /* renamed from: Nj */
        public C5939b mo39503Nj() {
            mo43393xj();
            ((ku0) this.f34068b).mo39468Fk();
            return this;
        }

        /* renamed from: Oj */
        public C5939b mo39504Oj() {
            mo43393xj();
            ((ku0) this.f34068b).mo39469Gk();
            return this;
        }

        /* renamed from: Pj */
        public C5939b mo39505Pj() {
            mo43393xj();
            ((ku0) this.f34068b).mo39470Hk();
            return this;
        }

        /* renamed from: Qj */
        public C5939b mo39506Qj() {
            mo43393xj();
            ((ku0) this.f34068b).mo39472Ik();
            return this;
        }

        @Deprecated
        /* renamed from: Re */
        public C5173er mo39476Re(int i) {
            return ((ku0) this.f34068b).mo39476Re(i);
        }

        @Deprecated
        /* renamed from: Rj */
        public C5939b mo39507Rj(int i, String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39480bl(i, str);
            return this;
        }

        /* renamed from: Sj */
        public C5939b mo39508Sj(boolean z) {
            mo43393xj();
            ((ku0) this.f34068b).mo39481cl(z);
            return this;
        }

        /* renamed from: Tj */
        public C5939b mo39509Tj(int i, String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39482dl(i, str);
            return this;
        }

        /* renamed from: Uj */
        public C5939b mo39510Uj(String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39484el(str);
            return this;
        }

        /* renamed from: Vb */
        public C5173er mo39477Vb(int i) {
            return ((ku0) this.f34068b).mo39477Vb(i);
        }

        /* renamed from: Vj */
        public C5939b mo39511Vj(C5173er erVar) {
            mo43393xj();
            ((ku0) this.f34068b).mo39485fl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5939b mo39512Wj(String str) {
            mo43393xj();
            ((ku0) this.f34068b).mo39488gl(str);
            return this;
        }

        @Deprecated
        /* renamed from: X8 */
        public int mo39478X8() {
            return ((ku0) this.f34068b).mo39478X8();
        }

        /* renamed from: Xj */
        public C5939b mo39513Xj(C5173er erVar) {
            mo43393xj();
            ((ku0) this.f34068b).mo39489hl(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo39479a() {
            return ((ku0) this.f34068b).mo39479a();
        }

        /* renamed from: e3 */
        public List<String> mo39483e3() {
            return Collections.unmodifiableList(((ku0) this.f34068b).mo39483e3());
        }

        public String getName() {
            return ((ku0) this.f34068b).getName();
        }

        /* renamed from: gh */
        public String mo39487gh(int i) {
            return ((ku0) this.f34068b).mo39487gh(i);
        }

        @Deprecated
        /* renamed from: ic */
        public String mo39490ic(int i) {
            return ((ku0) this.f34068b).mo39490ic(i);
        }

        /* renamed from: pg */
        public boolean mo39491pg() {
            return ((ku0) this.f34068b).mo39491pg();
        }

        /* renamed from: v2 */
        public String mo39492v2() {
            return ((ku0) this.f34068b).mo39492v2();
        }

        /* renamed from: yf */
        public C5173er mo39493yf() {
            return ((ku0) this.f34068b).mo39493yf();
        }
    }

    static {
        ku0 ku0 = new ku0();
        DEFAULT_INSTANCE = ku0;
        qe1.m62492dk(ku0.class, ku0);
    }

    /* renamed from: Lk */
    public static ku0 m54927Lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Mk */
    public static C5939b m54928Mk() {
        return (C5939b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Nk */
    public static C5939b m54929Nk(ku0 ku0) {
        return (C5939b) DEFAULT_INSTANCE.mo43358gj(ku0);
    }

    /* renamed from: Ok */
    public static ku0 m54930Ok(InputStream inputStream) throws IOException {
        return (ku0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Pk */
    public static ku0 m54931Pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ku0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Qk */
    public static ku0 m54932Qk(C5173er erVar) throws nt1 {
        return (ku0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Rk */
    public static ku0 m54933Rk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ku0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Sk */
    public static ku0 m54934Sk(g00 g00) throws IOException {
        return (ku0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Tk */
    public static ku0 m54935Tk(g00 g00, zy0 zy0) throws IOException {
        return (ku0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Uk */
    public static ku0 m54936Uk(InputStream inputStream) throws IOException {
        return (ku0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Vk */
    public static ku0 m54937Vk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ku0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Wk */
    public static ku0 m54938Wk(ByteBuffer byteBuffer) throws nt1 {
        return (ku0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Xk */
    public static ku0 m54939Xk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ku0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Yk */
    public static ku0 m54940Yk(byte[] bArr) throws nt1 {
        return (ku0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Zk */
    public static ku0 m54941Zk(byte[] bArr, zy0 zy0) throws nt1 {
        return (ku0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: al */
    public static cz2<ku0> m54942al() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo39463Ak(Iterable<String> iterable) {
        mo39473Jk();
        C7403z0.m72412X6(iterable, this.aliases_);
    }

    /* renamed from: Bk */
    public final void mo39464Bk(Iterable<String> iterable) {
        mo39474Kk();
        C7403z0.m72412X6(iterable, this.features_);
    }

    /* renamed from: Ck */
    public final void mo39465Ck(String str) {
        str.getClass();
        mo39474Kk();
        this.features_.add(str);
    }

    /* renamed from: Dk */
    public final void mo39466Dk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo39474Kk();
        this.features_.add(erVar.mo35543k0());
    }

    /* renamed from: Ek */
    public final void mo39467Ek() {
        this.aliases_ = qe1.m62499pj();
    }

    /* renamed from: Fk */
    public final void mo39468Fk() {
        this.allowCors_ = false;
    }

    /* renamed from: Gk */
    public final void mo39469Gk() {
        this.features_ = qe1.m62499pj();
    }

    /* renamed from: Hk */
    public final void mo39470Hk() {
        this.name_ = m54927Lk().getName();
    }

    /* renamed from: If */
    public int mo39471If() {
        return this.features_.size();
    }

    /* renamed from: Ik */
    public final void mo39472Ik() {
        this.target_ = m54927Lk().mo39492v2();
    }

    /* renamed from: Jk */
    public final void mo39473Jk() {
        vs1.C7095k<String> kVar = this.aliases_;
        if (!kVar.mo36500p()) {
            this.aliases_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Kk */
    public final void mo39474Kk() {
        vs1.C7095k<String> kVar = this.features_;
        if (!kVar.mo36500p()) {
            this.features_ = qe1.m62468Fj(kVar);
        }
    }

    @Deprecated
    /* renamed from: Nd */
    public List<String> mo39475Nd() {
        return this.aliases_;
    }

    @Deprecated
    /* renamed from: Re */
    public C5173er mo39476Re(int i) {
        return C5173er.m47136w(this.aliases_.get(i));
    }

    /* renamed from: Vb */
    public C5173er mo39477Vb(int i) {
        return C5173er.m47136w(this.features_.get(i));
    }

    @Deprecated
    /* renamed from: X8 */
    public int mo39478X8() {
        return this.aliases_.size();
    }

    /* renamed from: a */
    public C5173er mo39479a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: bl */
    public final void mo39480bl(int i, String str) {
        str.getClass();
        mo39473Jk();
        this.aliases_.set(i, str);
    }

    /* renamed from: cl */
    public final void mo39481cl(boolean z) {
        this.allowCors_ = z;
    }

    /* renamed from: dl */
    public final void mo39482dl(int i, String str) {
        str.getClass();
        mo39474Kk();
        this.features_.set(i, str);
    }

    /* renamed from: e3 */
    public List<String> mo39483e3() {
        return this.features_;
    }

    /* renamed from: el */
    public final void mo39484el(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: fl */
    public final void mo39485fl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: gh */
    public String mo39487gh(int i) {
        return this.features_.get(i);
    }

    /* renamed from: gl */
    public final void mo39488gl(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* renamed from: hl */
    public final void mo39489hl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.target_ = erVar.mo35543k0();
    }

    @Deprecated
    /* renamed from: ic */
    public String mo39490ic(int i) {
        return this.aliases_.get(i);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5938a.f31434a[iVar.ordinal()]) {
            case 1:
                return new ku0();
            case 2:
                return new C5939b((C5938a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ku0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ku0.class) {
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

    /* renamed from: pg */
    public boolean mo39491pg() {
        return this.allowCors_;
    }

    /* renamed from: v2 */
    public String mo39492v2() {
        return this.target_;
    }

    /* renamed from: yf */
    public C5173er mo39493yf() {
        return C5173er.m47136w(this.target_);
    }

    /* renamed from: yk */
    public final void mo39494yk(String str) {
        str.getClass();
        mo39473Jk();
        this.aliases_.add(str);
    }

    /* renamed from: zk */
    public final void mo39495zk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo39473Jk();
        this.aliases_.add(erVar.mo35543k0());
    }
}
