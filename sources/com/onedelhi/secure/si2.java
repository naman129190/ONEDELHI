package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class si2 extends qe1<si2, C6772b> implements vi2 {
    /* access modifiers changed from: private */
    public static final si2 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile cz2<si2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private rc2<String, String> labels_ = rc2.m63481i();
    private String type_ = "";

    /* renamed from: com.onedelhi.secure.si2$a */
    public static /* synthetic */ class C6771a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35095a;

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
                f35095a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35095a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.si2.C6771a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.si2$b */
    public static final class C6772b extends qe1.C6546b<si2, C6772b> implements vi2 {
        public C6772b() {
            super(si2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6772b(C6771a aVar) {
            this();
        }

        /* renamed from: B */
        public boolean mo44358B(String str) {
            str.getClass();
            return ((si2) this.f34068b).mo44363I().containsKey(str);
        }

        /* renamed from: D */
        public String mo44359D(String str) {
            str.getClass();
            Map<String, String> I = ((si2) this.f34068b).mo44363I();
            if (I.containsKey(str)) {
                return I.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: Gj */
        public C6772b mo44372Gj() {
            mo43393xj();
            ((si2) this.f34068b).mo44367mk().clear();
            return this;
        }

        /* renamed from: H */
        public String mo44362H(String str, String str2) {
            str.getClass();
            Map<String, String> I = ((si2) this.f34068b).mo44363I();
            return I.containsKey(str) ? I.get(str) : str2;
        }

        /* renamed from: Hj */
        public C6772b mo44373Hj() {
            mo43393xj();
            ((si2) this.f34068b).mo44365kk();
            return this;
        }

        /* renamed from: I */
        public Map<String, String> mo44363I() {
            return Collections.unmodifiableMap(((si2) this.f34068b).mo44363I());
        }

        /* renamed from: Ij */
        public C6772b mo44374Ij(Map<String, String> map) {
            mo43393xj();
            ((si2) this.f34068b).mo44367mk().putAll(map);
            return this;
        }

        /* renamed from: Jj */
        public C6772b mo44375Jj(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((si2) this.f34068b).mo44367mk().put(str, str2);
            return this;
        }

        /* renamed from: Kj */
        public C6772b mo44376Kj(String str) {
            str.getClass();
            mo43393xj();
            ((si2) this.f34068b).mo44367mk().remove(str);
            return this;
        }

        /* renamed from: Lj */
        public C6772b mo44377Lj(String str) {
            mo43393xj();
            ((si2) this.f34068b).mo44360Ek(str);
            return this;
        }

        /* renamed from: Mj */
        public C6772b mo44378Mj(C5173er erVar) {
            mo43393xj();
            ((si2) this.f34068b).mo44361Fk(erVar);
            return this;
        }

        /* renamed from: h */
        public String mo44364h() {
            return ((si2) this.f34068b).mo44364h();
        }

        /* renamed from: m */
        public C5173er mo44366m() {
            return ((si2) this.f34068b).mo44366m();
        }

        /* renamed from: r */
        public int mo44370r() {
            return ((si2) this.f34068b).mo44363I().size();
        }

        @Deprecated
        /* renamed from: z */
        public Map<String, String> mo44371z() {
            return mo44363I();
        }
    }

    /* renamed from: com.onedelhi.secure.si2$c */
    public static final class C6773c {

        /* renamed from: a */
        public static final oc2<String, String> f35096a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f35096a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        si2 si2 = new si2();
        DEFAULT_INSTANCE = si2;
        qe1.m62492dk(si2.class, si2);
    }

    /* renamed from: Ak */
    public static si2 m64603Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (si2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Bk */
    public static si2 m64604Bk(byte[] bArr) throws nt1 {
        return (si2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ck */
    public static si2 m64605Ck(byte[] bArr, zy0 zy0) throws nt1 {
        return (si2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Dk */
    public static cz2<si2> m64606Dk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: lk */
    public static si2 m64612lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: pk */
    public static C6772b m64613pk() {
        return (C6772b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: qk */
    public static C6772b m64614qk(si2 si2) {
        return (C6772b) DEFAULT_INSTANCE.mo43358gj(si2);
    }

    /* renamed from: rk */
    public static si2 m64615rk(InputStream inputStream) throws IOException {
        return (si2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: sk */
    public static si2 m64616sk(InputStream inputStream, zy0 zy0) throws IOException {
        return (si2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: tk */
    public static si2 m64617tk(C5173er erVar) throws nt1 {
        return (si2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: uk */
    public static si2 m64618uk(C5173er erVar, zy0 zy0) throws nt1 {
        return (si2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: vk */
    public static si2 m64619vk(g00 g00) throws IOException {
        return (si2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: wk */
    public static si2 m64620wk(g00 g00, zy0 zy0) throws IOException {
        return (si2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: xk */
    public static si2 m64621xk(InputStream inputStream) throws IOException {
        return (si2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static si2 m64622yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (si2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static si2 m64623zk(ByteBuffer byteBuffer) throws nt1 {
        return (si2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: B */
    public boolean mo44358B(String str) {
        str.getClass();
        return mo44368nk().containsKey(str);
    }

    /* renamed from: D */
    public String mo44359D(String str) {
        str.getClass();
        rc2<String, String> nk = mo44368nk();
        if (nk.containsKey(str)) {
            return nk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Ek */
    public final void mo44360Ek(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* renamed from: Fk */
    public final void mo44361Fk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.type_ = erVar.mo35543k0();
    }

    /* renamed from: H */
    public String mo44362H(String str, String str2) {
        str.getClass();
        rc2<String, String> nk = mo44368nk();
        return nk.containsKey(str) ? nk.get(str) : str2;
    }

    /* renamed from: I */
    public Map<String, String> mo44363I() {
        return Collections.unmodifiableMap(mo44368nk());
    }

    /* renamed from: h */
    public String mo44364h() {
        return this.type_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6771a.f35095a[iVar.ordinal()]) {
            case 1:
                return new si2();
            case 2:
                return new C6772b((C6771a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", C6773c.f35096a, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<si2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (si2.class) {
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
    public final void mo44365kk() {
        this.type_ = m64612lk().mo44364h();
    }

    /* renamed from: m */
    public C5173er mo44366m() {
        return C5173er.m47136w(this.type_);
    }

    /* renamed from: mk */
    public final Map<String, String> mo44367mk() {
        return mo44369ok();
    }

    /* renamed from: nk */
    public final rc2<String, String> mo44368nk() {
        return this.labels_;
    }

    /* renamed from: ok */
    public final rc2<String, String> mo44369ok() {
        if (!this.labels_.mo43841n()) {
            this.labels_ = this.labels_.mo43846q();
        }
        return this.labels_;
    }

    /* renamed from: r */
    public int mo44370r() {
        return mo44368nk().size();
    }

    @Deprecated
    /* renamed from: z */
    public Map<String, String> mo44371z() {
        return mo44363I();
    }
}
