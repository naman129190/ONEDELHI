package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class ja3 extends qe1<ja3, C5807b> implements ka3 {
    /* access modifiers changed from: private */
    public static final ja3 DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile cz2<ja3> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_ = "";
    private String displayName_ = "";
    private String duration_ = "";
    private long freeTier_;
    private long maxLimit_;
    private String metric_ = "";
    private String name_ = "";
    private String unit_ = "";
    private rc2<String, Long> values_ = rc2.m63481i();

    /* renamed from: com.onedelhi.secure.ja3$a */
    public static /* synthetic */ class C5806a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30718a;

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
                f30718a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30718a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ja3.C5806a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ja3$b */
    public static final class C5807b extends qe1.C6546b<ja3, C5807b> implements ka3 {
        public C5807b() {
            super(ja3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5807b(C5806a aVar) {
            this();
        }

        /* renamed from: Bf */
        public long mo38515Bf(String str, long j) {
            str.getClass();
            Map<String, Long> Mg = ((ja3) this.f34068b).mo38532Mg();
            return Mg.containsKey(str) ? Mg.get(str).longValue() : j;
        }

        /* renamed from: C */
        public String mo38516C() {
            return ((ja3) this.f34068b).mo38516C();
        }

        /* renamed from: E0 */
        public C5173er mo38517E0() {
            return ((ja3) this.f34068b).mo38517E0();
        }

        @Deprecated
        /* renamed from: E2 */
        public Map<String, Long> mo38518E2() {
            return mo38532Mg();
        }

        /* renamed from: Ei */
        public long mo38519Ei() {
            return ((ja3) this.f34068b).mo38519Ei();
        }

        /* renamed from: G */
        public C5173er mo38521G() {
            return ((ja3) this.f34068b).mo38521G();
        }

        /* renamed from: Gj */
        public C5807b mo38563Gj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38520Fk();
            return this;
        }

        /* renamed from: He */
        public long mo38523He() {
            return ((ja3) this.f34068b).mo38523He();
        }

        /* renamed from: Hj */
        public C5807b mo38564Hj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38522Gk();
            return this;
        }

        /* renamed from: Ij */
        public C5807b mo38565Ij() {
            mo43393xj();
            ((ja3) this.f34068b).mo38524Hk();
            return this;
        }

        /* renamed from: Jj */
        public C5807b mo38566Jj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38525Ik();
            return this;
        }

        /* renamed from: K1 */
        public int mo38527K1() {
            return ((ja3) this.f34068b).mo38532Mg().size();
        }

        /* renamed from: Kj */
        public C5807b mo38567Kj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38526Jk();
            return this;
        }

        /* renamed from: L8 */
        public long mo38529L8() {
            return ((ja3) this.f34068b).mo38529L8();
        }

        /* renamed from: Lj */
        public C5807b mo38568Lj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38528Kk();
            return this;
        }

        /* renamed from: M9 */
        public long mo38531M9(String str) {
            str.getClass();
            Map<String, Long> Mg = ((ja3) this.f34068b).mo38532Mg();
            if (Mg.containsKey(str)) {
                return Mg.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: Mg */
        public Map<String, Long> mo38532Mg() {
            return Collections.unmodifiableMap(((ja3) this.f34068b).mo38532Mg());
        }

        /* renamed from: Mj */
        public C5807b mo38569Mj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38530Lk();
            return this;
        }

        /* renamed from: Nj */
        public C5807b mo38570Nj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38533Mk();
            return this;
        }

        /* renamed from: O1 */
        public String mo38535O1() {
            return ((ja3) this.f34068b).mo38535O1();
        }

        /* renamed from: Of */
        public String mo38536Of() {
            return ((ja3) this.f34068b).mo38536Of();
        }

        /* renamed from: Oj */
        public C5807b mo38571Oj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38534Nk();
            return this;
        }

        /* renamed from: Pj */
        public C5807b mo38572Pj() {
            mo43393xj();
            ((ja3) this.f34068b).mo38537Pk().clear();
            return this;
        }

        /* renamed from: Qj */
        public C5807b mo38573Qj(Map<String, Long> map) {
            mo43393xj();
            ((ja3) this.f34068b).mo38537Pk().putAll(map);
            return this;
        }

        /* renamed from: Rj */
        public C5807b mo38574Rj(String str, long j) {
            str.getClass();
            mo43393xj();
            ((ja3) this.f34068b).mo38537Pk().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: Sj */
        public C5807b mo38575Sj(String str) {
            str.getClass();
            mo43393xj();
            ((ja3) this.f34068b).mo38537Pk().remove(str);
            return this;
        }

        /* renamed from: Tj */
        public C5807b mo38576Tj(long j) {
            mo43393xj();
            ((ja3) this.f34068b).mo38545hl(j);
            return this;
        }

        /* renamed from: U8 */
        public C5173er mo38540U8() {
            return ((ja3) this.f34068b).mo38540U8();
        }

        /* renamed from: Uj */
        public C5807b mo38577Uj(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38546il(str);
            return this;
        }

        /* renamed from: Vj */
        public C5807b mo38578Vj(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38547jl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5807b mo38579Wj(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38548kl(str);
            return this;
        }

        /* renamed from: Xj */
        public C5807b mo38580Xj(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38549ll(erVar);
            return this;
        }

        /* renamed from: Yj */
        public C5807b mo38581Yj(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38551ml(str);
            return this;
        }

        /* renamed from: Zj */
        public C5807b mo38582Zj(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38552nl(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo38541a() {
            return ((ja3) this.f34068b).mo38541a();
        }

        /* renamed from: ak */
        public C5807b mo38583ak(long j) {
            mo43393xj();
            ((ja3) this.f34068b).mo38553ol(j);
            return this;
        }

        /* renamed from: b */
        public C5173er mo38542b() {
            return ((ja3) this.f34068b).mo38542b();
        }

        /* renamed from: bk */
        public C5807b mo38584bk(long j) {
            mo43393xj();
            ((ja3) this.f34068b).mo38554pl(j);
            return this;
        }

        /* renamed from: c */
        public String mo38543c() {
            return ((ja3) this.f34068b).mo38543c();
        }

        /* renamed from: ck */
        public C5807b mo38585ck(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38555ql(str);
            return this;
        }

        /* renamed from: dk */
        public C5807b mo38586dk(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38556rl(erVar);
            return this;
        }

        /* renamed from: ek */
        public C5807b mo38587ek(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38557sl(str);
            return this;
        }

        /* renamed from: fk */
        public C5807b mo38588fk(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38558tl(erVar);
            return this;
        }

        public String getName() {
            return ((ja3) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C5807b mo38589gk(String str) {
            mo43393xj();
            ((ja3) this.f34068b).mo38560ul(str);
            return this;
        }

        /* renamed from: hk */
        public C5807b mo38590hk(C5173er erVar) {
            mo43393xj();
            ((ja3) this.f34068b).mo38561vl(erVar);
            return this;
        }

        /* renamed from: mf */
        public String mo38550mf() {
            return ((ja3) this.f34068b).mo38550mf();
        }

        /* renamed from: ue */
        public C5173er mo38559ue() {
            return ((ja3) this.f34068b).mo38559ue();
        }

        /* renamed from: xe */
        public boolean mo38562xe(String str) {
            str.getClass();
            return ((ja3) this.f34068b).mo38532Mg().containsKey(str);
        }
    }

    /* renamed from: com.onedelhi.secure.ja3$c */
    public static final class C5808c {

        /* renamed from: a */
        public static final oc2<String, Long> f30719a = oc2.m59242f(wx4.C7195b.STRING, "", wx4.C7195b.INT64, 0L);
    }

    static {
        ja3 ja3 = new ja3();
        DEFAULT_INSTANCE = ja3;
        qe1.m62492dk(ja3.class, ja3);
    }

    /* renamed from: Ok */
    public static ja3 m53107Ok() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Sk */
    public static C5807b m53108Sk() {
        return (C5807b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Tk */
    public static C5807b m53109Tk(ja3 ja3) {
        return (C5807b) DEFAULT_INSTANCE.mo43358gj(ja3);
    }

    /* renamed from: Uk */
    public static ja3 m53110Uk(InputStream inputStream) throws IOException {
        return (ja3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Vk */
    public static ja3 m53111Vk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ja3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Wk */
    public static ja3 m53112Wk(C5173er erVar) throws nt1 {
        return (ja3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Xk */
    public static ja3 m53113Xk(C5173er erVar, zy0 zy0) throws nt1 {
        return (ja3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Yk */
    public static ja3 m53114Yk(g00 g00) throws IOException {
        return (ja3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Zk */
    public static ja3 m53115Zk(g00 g00, zy0 zy0) throws IOException {
        return (ja3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: al */
    public static ja3 m53116al(InputStream inputStream) throws IOException {
        return (ja3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: bl */
    public static ja3 m53117bl(InputStream inputStream, zy0 zy0) throws IOException {
        return (ja3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: cl */
    public static ja3 m53118cl(ByteBuffer byteBuffer) throws nt1 {
        return (ja3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: dl */
    public static ja3 m53119dl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ja3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: el */
    public static ja3 m53120el(byte[] bArr) throws nt1 {
        return (ja3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: fl */
    public static ja3 m53122fl(byte[] bArr, zy0 zy0) throws nt1 {
        return (ja3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: gl */
    public static cz2<ja3> m53124gl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bf */
    public long mo38515Bf(String str, long j) {
        str.getClass();
        rc2<String, Long> Rk = mo38539Rk();
        return Rk.containsKey(str) ? Rk.get(str).longValue() : j;
    }

    /* renamed from: C */
    public String mo38516C() {
        return this.displayName_;
    }

    /* renamed from: E0 */
    public C5173er mo38517E0() {
        return C5173er.m47136w(this.unit_);
    }

    @Deprecated
    /* renamed from: E2 */
    public Map<String, Long> mo38518E2() {
        return mo38532Mg();
    }

    /* renamed from: Ei */
    public long mo38519Ei() {
        return this.defaultLimit_;
    }

    /* renamed from: Fk */
    public final void mo38520Fk() {
        this.defaultLimit_ = 0;
    }

    /* renamed from: G */
    public C5173er mo38521G() {
        return C5173er.m47136w(this.displayName_);
    }

    /* renamed from: Gk */
    public final void mo38522Gk() {
        this.description_ = m53107Ok().mo38543c();
    }

    /* renamed from: He */
    public long mo38523He() {
        return this.freeTier_;
    }

    /* renamed from: Hk */
    public final void mo38524Hk() {
        this.displayName_ = m53107Ok().mo38516C();
    }

    /* renamed from: Ik */
    public final void mo38525Ik() {
        this.duration_ = m53107Ok().mo38536Of();
    }

    /* renamed from: Jk */
    public final void mo38526Jk() {
        this.freeTier_ = 0;
    }

    /* renamed from: K1 */
    public int mo38527K1() {
        return mo38539Rk().size();
    }

    /* renamed from: Kk */
    public final void mo38528Kk() {
        this.maxLimit_ = 0;
    }

    /* renamed from: L8 */
    public long mo38529L8() {
        return this.maxLimit_;
    }

    /* renamed from: Lk */
    public final void mo38530Lk() {
        this.metric_ = m53107Ok().mo38550mf();
    }

    /* renamed from: M9 */
    public long mo38531M9(String str) {
        str.getClass();
        rc2<String, Long> Rk = mo38539Rk();
        if (Rk.containsKey(str)) {
            return Rk.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Mg */
    public Map<String, Long> mo38532Mg() {
        return Collections.unmodifiableMap(mo38539Rk());
    }

    /* renamed from: Mk */
    public final void mo38533Mk() {
        this.name_ = m53107Ok().getName();
    }

    /* renamed from: Nk */
    public final void mo38534Nk() {
        this.unit_ = m53107Ok().mo38535O1();
    }

    /* renamed from: O1 */
    public String mo38535O1() {
        return this.unit_;
    }

    /* renamed from: Of */
    public String mo38536Of() {
        return this.duration_;
    }

    /* renamed from: Pk */
    public final Map<String, Long> mo38537Pk() {
        return mo38538Qk();
    }

    /* renamed from: Qk */
    public final rc2<String, Long> mo38538Qk() {
        if (!this.values_.mo43841n()) {
            this.values_ = this.values_.mo43846q();
        }
        return this.values_;
    }

    /* renamed from: Rk */
    public final rc2<String, Long> mo38539Rk() {
        return this.values_;
    }

    /* renamed from: U8 */
    public C5173er mo38540U8() {
        return C5173er.m47136w(this.duration_);
    }

    /* renamed from: a */
    public C5173er mo38541a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: b */
    public C5173er mo38542b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo38543c() {
        return this.description_;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: hl */
    public final void mo38545hl(long j) {
        this.defaultLimit_ = j;
    }

    /* renamed from: il */
    public final void mo38546il(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5806a.f30718a[iVar.ordinal()]) {
            case 1:
                return new ja3();
            case 2:
                return new C5807b((C5806a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", C5808c.f30719a, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ja3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ja3.class) {
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

    /* renamed from: jl */
    public final void mo38547jl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: kl */
    public final void mo38548kl(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* renamed from: ll */
    public final void mo38549ll(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.displayName_ = erVar.mo35543k0();
    }

    /* renamed from: mf */
    public String mo38550mf() {
        return this.metric_;
    }

    /* renamed from: ml */
    public final void mo38551ml(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* renamed from: nl */
    public final void mo38552nl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.duration_ = erVar.mo35543k0();
    }

    /* renamed from: ol */
    public final void mo38553ol(long j) {
        this.freeTier_ = j;
    }

    /* renamed from: pl */
    public final void mo38554pl(long j) {
        this.maxLimit_ = j;
    }

    /* renamed from: ql */
    public final void mo38555ql(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* renamed from: rl */
    public final void mo38556rl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.metric_ = erVar.mo35543k0();
    }

    /* renamed from: sl */
    public final void mo38557sl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: tl */
    public final void mo38558tl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: ue */
    public C5173er mo38559ue() {
        return C5173er.m47136w(this.metric_);
    }

    /* renamed from: ul */
    public final void mo38560ul(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* renamed from: vl */
    public final void mo38561vl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.unit_ = erVar.mo35543k0();
    }

    /* renamed from: xe */
    public boolean mo38562xe(String str) {
        str.getClass();
        return mo38539Rk().containsKey(str);
    }
}
