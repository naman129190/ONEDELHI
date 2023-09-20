package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class mv0 extends qe1<mv0, C6146b> implements nv0 {
    /* access modifiers changed from: private */
    public static final mv0 DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile cz2<mv0> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private String domain_ = "";
    private rc2<String, String> metadata_ = rc2.m63481i();
    private String reason_ = "";

    /* renamed from: com.onedelhi.secure.mv0$a */
    public static /* synthetic */ class C6145a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32291a;

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
                f32291a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32291a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mv0.C6145a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.mv0$b */
    public static final class C6146b extends qe1.C6546b<mv0, C6146b> implements nv0 {
        public C6146b() {
            super(mv0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6146b(C6145a aVar) {
            this();
        }

        /* renamed from: Dc */
        public Map<String, String> mo40808Dc() {
            return Collections.unmodifiableMap(((mv0) this.f34068b).mo40808Dc());
        }

        @Deprecated
        /* renamed from: F2 */
        public Map<String, String> mo40809F2() {
            return mo40808Dc();
        }

        /* renamed from: Fh */
        public String mo40810Fh() {
            return ((mv0) this.f34068b).mo40810Fh();
        }

        /* renamed from: Gj */
        public C6146b mo40827Gj() {
            mo43393xj();
            ((mv0) this.f34068b).mo40822nk();
            return this;
        }

        /* renamed from: Hj */
        public C6146b mo40828Hj() {
            mo43393xj();
            ((mv0) this.f34068b).mo40824qk().clear();
            return this;
        }

        /* renamed from: Ij */
        public C6146b mo40829Ij() {
            mo43393xj();
            ((mv0) this.f34068b).mo40823ok();
            return this;
        }

        /* renamed from: J0 */
        public String mo40812J0() {
            return ((mv0) this.f34068b).mo40812J0();
        }

        /* renamed from: Jj */
        public C6146b mo40830Jj(Map<String, String> map) {
            mo43393xj();
            ((mv0) this.f34068b).mo40824qk().putAll(map);
            return this;
        }

        /* renamed from: Kj */
        public C6146b mo40831Kj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((mv0) this.f34068b).mo40824qk().put(str, str2);
            return this;
        }

        /* renamed from: Lf */
        public boolean mo40815Lf(String str) {
            str.getClass();
            return ((mv0) this.f34068b).mo40808Dc().containsKey(str);
        }

        /* renamed from: Lj */
        public C6146b mo40832Lj(String str) {
            str.getClass();
            mo43393xj();
            ((mv0) this.f34068b).mo40824qk().remove(str);
            return this;
        }

        /* renamed from: M2 */
        public String mo40817M2(String str) {
            str.getClass();
            Map<String, String> Dc = ((mv0) this.f34068b).mo40808Dc();
            if (Dc.containsKey(str)) {
                return Dc.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: Mj */
        public C6146b mo40833Mj(String str) {
            mo43393xj();
            ((mv0) this.f34068b).mo40811Ik(str);
            return this;
        }

        /* renamed from: Nh */
        public String mo40818Nh(String str, String str2) {
            str.getClass();
            Map<String, String> Dc = ((mv0) this.f34068b).mo40808Dc();
            return Dc.containsKey(str) ? Dc.get(str) : str2;
        }

        /* renamed from: Nj */
        public C6146b mo40834Nj(C5173er erVar) {
            mo43393xj();
            ((mv0) this.f34068b).mo40813Jk(erVar);
            return this;
        }

        /* renamed from: Oj */
        public C6146b mo40835Oj(String str) {
            mo43393xj();
            ((mv0) this.f34068b).mo40814Kk(str);
            return this;
        }

        /* renamed from: Pj */
        public C6146b mo40836Pj(C5173er erVar) {
            mo43393xj();
            ((mv0) this.f34068b).mo40816Lk(erVar);
            return this;
        }

        /* renamed from: Ra */
        public int mo40819Ra() {
            return ((mv0) this.f34068b).mo40808Dc().size();
        }

        /* renamed from: V0 */
        public C5173er mo40820V0() {
            return ((mv0) this.f34068b).mo40820V0();
        }

        /* renamed from: fa */
        public C5173er mo40821fa() {
            return ((mv0) this.f34068b).mo40821fa();
        }
    }

    /* renamed from: com.onedelhi.secure.mv0$c */
    public static final class C6147c {

        /* renamed from: a */
        public static final oc2<String, String> f32292a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f32292a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        mv0 mv0 = new mv0();
        DEFAULT_INSTANCE = mv0;
        qe1.m62492dk(mv0.class, mv0);
    }

    /* renamed from: Ak */
    public static mv0 m57578Ak(g00 g00, zy0 zy0) throws IOException {
        return (mv0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Bk */
    public static mv0 m57579Bk(InputStream inputStream) throws IOException {
        return (mv0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ck */
    public static mv0 m57580Ck(InputStream inputStream, zy0 zy0) throws IOException {
        return (mv0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Dk */
    public static mv0 m57581Dk(ByteBuffer byteBuffer) throws nt1 {
        return (mv0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Ek */
    public static mv0 m57582Ek(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (mv0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Fk */
    public static mv0 m57583Fk(byte[] bArr) throws nt1 {
        return (mv0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Gk */
    public static mv0 m57584Gk(byte[] bArr, zy0 zy0) throws nt1 {
        return (mv0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Hk */
    public static cz2<mv0> m57585Hk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: pk */
    public static mv0 m57594pk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: tk */
    public static C6146b m57595tk() {
        return (C6146b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: uk */
    public static C6146b m57596uk(mv0 mv0) {
        return (C6146b) DEFAULT_INSTANCE.mo43358gj(mv0);
    }

    /* renamed from: vk */
    public static mv0 m57597vk(InputStream inputStream) throws IOException {
        return (mv0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: wk */
    public static mv0 m57598wk(InputStream inputStream, zy0 zy0) throws IOException {
        return (mv0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: xk */
    public static mv0 m57599xk(C5173er erVar) throws nt1 {
        return (mv0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: yk */
    public static mv0 m57600yk(C5173er erVar, zy0 zy0) throws nt1 {
        return (mv0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: zk */
    public static mv0 m57601zk(g00 g00) throws IOException {
        return (mv0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Dc */
    public Map<String, String> mo40808Dc() {
        return Collections.unmodifiableMap(mo40825rk());
    }

    @Deprecated
    /* renamed from: F2 */
    public Map<String, String> mo40809F2() {
        return mo40808Dc();
    }

    /* renamed from: Fh */
    public String mo40810Fh() {
        return this.domain_;
    }

    /* renamed from: Ik */
    public final void mo40811Ik(String str) {
        str.getClass();
        this.domain_ = str;
    }

    /* renamed from: J0 */
    public String mo40812J0() {
        return this.reason_;
    }

    /* renamed from: Jk */
    public final void mo40813Jk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.domain_ = erVar.mo35543k0();
    }

    /* renamed from: Kk */
    public final void mo40814Kk(String str) {
        str.getClass();
        this.reason_ = str;
    }

    /* renamed from: Lf */
    public boolean mo40815Lf(String str) {
        str.getClass();
        return mo40825rk().containsKey(str);
    }

    /* renamed from: Lk */
    public final void mo40816Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.reason_ = erVar.mo35543k0();
    }

    /* renamed from: M2 */
    public String mo40817M2(String str) {
        str.getClass();
        rc2<String, String> rk = mo40825rk();
        if (rk.containsKey(str)) {
            return rk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Nh */
    public String mo40818Nh(String str, String str2) {
        str.getClass();
        rc2<String, String> rk = mo40825rk();
        return rk.containsKey(str) ? rk.get(str) : str2;
    }

    /* renamed from: Ra */
    public int mo40819Ra() {
        return mo40825rk().size();
    }

    /* renamed from: V0 */
    public C5173er mo40820V0() {
        return C5173er.m47136w(this.reason_);
    }

    /* renamed from: fa */
    public C5173er mo40821fa() {
        return C5173er.m47136w(this.domain_);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6145a.f32291a[iVar.ordinal()]) {
            case 1:
                return new mv0();
            case 2:
                return new C6146b((C6145a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", C6147c.f32292a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<mv0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (mv0.class) {
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

    /* renamed from: nk */
    public final void mo40822nk() {
        this.domain_ = m57594pk().mo40810Fh();
    }

    /* renamed from: ok */
    public final void mo40823ok() {
        this.reason_ = m57594pk().mo40812J0();
    }

    /* renamed from: qk */
    public final Map<String, String> mo40824qk() {
        return mo40826sk();
    }

    /* renamed from: rk */
    public final rc2<String, String> mo40825rk() {
        return this.metadata_;
    }

    /* renamed from: sk */
    public final rc2<String, String> mo40826sk() {
        if (!this.metadata_.mo43841n()) {
            this.metadata_ = this.metadata_.mo43846q();
        }
        return this.metadata_;
    }
}
