package com.onedelhi.secure;

import com.onedelhi.secure.h13;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class eg4 extends qe1<eg4, C5143b> implements gg4 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final eg4 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<eg4> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private rc2<String, Long> counters_ = rc2.m63481i();
    private rc2<String, String> customAttributes_ = rc2.m63481i();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private vs1.C7095k<h13> perfSessions_ = qe1.m62499pj();
    private vs1.C7095k<eg4> subtraces_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.eg4$a */
    public static /* synthetic */ class C5142a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27924a;

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
                f27924a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27924a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eg4.C5142a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.eg4$b */
    public static final class C5143b extends qe1.C6546b<eg4, C5143b> implements gg4 {
        public C5143b() {
            super(eg4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5143b(C5142a aVar) {
            this();
        }

        /* renamed from: B0 */
        public int mo35276B0() {
            return ((eg4) this.f34068b).mo35276B0();
        }

        /* renamed from: F6 */
        public boolean mo35279F6() {
            return ((eg4) this.f34068b).mo35279F6();
        }

        /* renamed from: Fb */
        public Map<String, Long> mo35280Fb() {
            return Collections.unmodifiableMap(((eg4) this.f34068b).mo35280Fb());
        }

        /* renamed from: Gj */
        public C5143b mo35336Gj(Iterable<? extends h13> iterable) {
            mo43393xj();
            ((eg4) this.f34068b).mo35277Dk(iterable);
            return this;
        }

        /* renamed from: H0 */
        public List<h13> mo35283H0() {
            return Collections.unmodifiableList(((eg4) this.f34068b).mo35283H0());
        }

        /* renamed from: Hj */
        public C5143b mo35337Hj(Iterable<? extends eg4> iterable) {
            mo43393xj();
            ((eg4) this.f34068b).mo35278Ek(iterable);
            return this;
        }

        /* renamed from: Ij */
        public C5143b mo35338Ij(int i, h13.C5473c cVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35281Fk(i, (h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C5143b mo35339Jj(int i, h13 h13) {
            mo43393xj();
            ((eg4) this.f34068b).mo35281Fk(i, h13);
            return this;
        }

        @Deprecated
        /* renamed from: Kg */
        public Map<String, Long> mo35287Kg() {
            return mo35280Fb();
        }

        /* renamed from: Kj */
        public C5143b mo35340Kj(h13.C5473c cVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35282Gk((h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: Lj */
        public C5143b mo35341Lj(h13 h13) {
            mo43393xj();
            ((eg4) this.f34068b).mo35282Gk(h13);
            return this;
        }

        /* renamed from: Mj */
        public C5143b mo35342Mj(int i, C5143b bVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35284Hk(i, (eg4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: N */
        public boolean mo35291N(String str) {
            str.getClass();
            return ((eg4) this.f34068b).mo35296S().containsKey(str);
        }

        /* renamed from: Nj */
        public C5143b mo35343Nj(int i, eg4 eg4) {
            mo43393xj();
            ((eg4) this.f34068b).mo35284Hk(i, eg4);
            return this;
        }

        /* renamed from: Oj */
        public C5143b mo35344Oj(C5143b bVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35285Ik((eg4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C5143b mo35345Pj(eg4 eg4) {
            mo43393xj();
            ((eg4) this.f34068b).mo35285Ik(eg4);
            return this;
        }

        /* renamed from: Qj */
        public C5143b mo35346Qj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35286Jk();
            return this;
        }

        /* renamed from: Rj */
        public C5143b mo35347Rj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35297Sk().clear();
            return this;
        }

        /* renamed from: S */
        public Map<String, String> mo35296S() {
            return Collections.unmodifiableMap(((eg4) this.f34068b).mo35296S());
        }

        /* renamed from: Sj */
        public C5143b mo35348Sj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35298Tk().clear();
            return this;
        }

        /* renamed from: Tj */
        public C5143b mo35349Tj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35288Kk();
            return this;
        }

        /* renamed from: Uj */
        public C5143b mo35350Uj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35289Lk();
            return this;
        }

        /* renamed from: Vj */
        public C5143b mo35351Vj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35290Mk();
            return this;
        }

        /* renamed from: Wi */
        public List<eg4> mo35301Wi() {
            return Collections.unmodifiableList(((eg4) this.f34068b).mo35301Wi());
        }

        /* renamed from: Wj */
        public C5143b mo35352Wj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35292Nk();
            return this;
        }

        @Deprecated
        /* renamed from: X */
        public Map<String, String> mo35303X() {
            return mo35296S();
        }

        /* renamed from: Xb */
        public boolean mo35304Xb(String str) {
            str.getClass();
            return ((eg4) this.f34068b).mo35280Fb().containsKey(str);
        }

        /* renamed from: Xj */
        public C5143b mo35353Xj() {
            mo43393xj();
            ((eg4) this.f34068b).mo35293Ok();
            return this;
        }

        /* renamed from: Y1 */
        public long mo35306Y1() {
            return ((eg4) this.f34068b).mo35306Y1();
        }

        /* renamed from: Yj */
        public C5143b mo35354Yj(Map<String, Long> map) {
            mo43393xj();
            ((eg4) this.f34068b).mo35297Sk().putAll(map);
            return this;
        }

        /* renamed from: Zf */
        public long mo35308Zf(String str, long j) {
            str.getClass();
            Map<String, Long> Fb = ((eg4) this.f34068b).mo35280Fb();
            return Fb.containsKey(str) ? Fb.get(str).longValue() : j;
        }

        /* renamed from: Zj */
        public C5143b mo35355Zj(Map<String, String> map) {
            mo43393xj();
            ((eg4) this.f34068b).mo35298Tk().putAll(map);
            return this;
        }

        /* renamed from: a */
        public C5173er mo35310a() {
            return ((eg4) this.f34068b).mo35310a();
        }

        /* renamed from: a0 */
        public String mo35311a0(String str, String str2) {
            str.getClass();
            Map<String, String> S = ((eg4) this.f34068b).mo35296S();
            return S.containsKey(str) ? S.get(str) : str2;
        }

        /* renamed from: a2 */
        public h13 mo35312a2(int i) {
            return ((eg4) this.f34068b).mo35312a2(i);
        }

        /* renamed from: ak */
        public C5143b mo35356ak(String str, long j) {
            str.getClass();
            mo43393xj();
            ((eg4) this.f34068b).mo35297Sk().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: bk */
        public C5143b mo35357bk(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo43393xj();
            ((eg4) this.f34068b).mo35298Tk().put(str, str2);
            return this;
        }

        /* renamed from: ci */
        public long mo35315ci() {
            return ((eg4) this.f34068b).mo35315ci();
        }

        /* renamed from: ck */
        public C5143b mo35358ck(String str) {
            str.getClass();
            mo43393xj();
            ((eg4) this.f34068b).mo35297Sk().remove(str);
            return this;
        }

        /* renamed from: dk */
        public C5143b mo35359dk(String str) {
            str.getClass();
            mo43393xj();
            ((eg4) this.f34068b).mo35298Tk().remove(str);
            return this;
        }

        /* renamed from: ek */
        public C5143b mo35360ek(int i) {
            mo43393xj();
            ((eg4) this.f34068b).mo35327rl(i);
            return this;
        }

        /* renamed from: f */
        public boolean mo35316f() {
            return ((eg4) this.f34068b).mo35316f();
        }

        /* renamed from: f2 */
        public boolean mo35317f2() {
            return ((eg4) this.f34068b).mo35317f2();
        }

        /* renamed from: f9 */
        public int mo35318f9() {
            return ((eg4) this.f34068b).mo35318f9();
        }

        /* renamed from: fe */
        public int mo35319fe() {
            return ((eg4) this.f34068b).mo35280Fb().size();
        }

        /* renamed from: fk */
        public C5143b mo35361fk(int i) {
            mo43393xj();
            ((eg4) this.f34068b).mo35328sl(i);
            return this;
        }

        public String getName() {
            return ((eg4) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C5143b mo35362gk(long j) {
            mo43393xj();
            ((eg4) this.f34068b).mo35329tl(j);
            return this;
        }

        /* renamed from: h0 */
        public int mo35321h0() {
            return ((eg4) this.f34068b).mo35296S().size();
        }

        /* renamed from: hk */
        public C5143b mo35363hk(long j) {
            mo43393xj();
            ((eg4) this.f34068b).mo35330ul(j);
            return this;
        }

        /* renamed from: if */
        public boolean mo35322if() {
            return ((eg4) this.f34068b).mo35322if();
        }

        /* renamed from: ik */
        public C5143b mo35364ik(boolean z) {
            mo43393xj();
            ((eg4) this.f34068b).mo35331vl(z);
            return this;
        }

        /* renamed from: jd */
        public long mo35323jd(String str) {
            str.getClass();
            Map<String, Long> Fb = ((eg4) this.f34068b).mo35280Fb();
            if (Fb.containsKey(str)) {
                return Fb.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: jk */
        public C5143b mo35365jk(String str) {
            mo43393xj();
            ((eg4) this.f34068b).mo35332wl(str);
            return this;
        }

        /* renamed from: kk */
        public C5143b mo35366kk(C5173er erVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35333xl(erVar);
            return this;
        }

        /* renamed from: l0 */
        public String mo35324l0(String str) {
            str.getClass();
            Map<String, String> S = ((eg4) this.f34068b).mo35296S();
            if (S.containsKey(str)) {
                return S.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: lk */
        public C5143b mo35367lk(int i, h13.C5473c cVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35334yl(i, (h13) cVar.mo43381ab());
            return this;
        }

        /* renamed from: m8 */
        public eg4 mo35325m8(int i) {
            return ((eg4) this.f34068b).mo35325m8(i);
        }

        /* renamed from: mk */
        public C5143b mo35368mk(int i, h13 h13) {
            mo43393xj();
            ((eg4) this.f34068b).mo35334yl(i, h13);
            return this;
        }

        /* renamed from: n5 */
        public boolean mo35326n5() {
            return ((eg4) this.f34068b).mo35326n5();
        }

        /* renamed from: nk */
        public C5143b mo35369nk(int i, C5143b bVar) {
            mo43393xj();
            ((eg4) this.f34068b).mo35335zl(i, (eg4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ok */
        public C5143b mo35370ok(int i, eg4 eg4) {
            mo43393xj();
            ((eg4) this.f34068b).mo35335zl(i, eg4);
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.eg4$c */
    public static final class C5144c {

        /* renamed from: a */
        public static final oc2<String, Long> f27925a = oc2.m59242f(wx4.C7195b.STRING, "", wx4.C7195b.INT64, 0L);
    }

    /* renamed from: com.onedelhi.secure.eg4$d */
    public static final class C5145d {

        /* renamed from: a */
        public static final oc2<String, String> f27926a;

        static {
            wx4.C7195b bVar = wx4.C7195b.STRING;
            f27926a = oc2.m59242f(bVar, "", bVar, "");
        }
    }

    static {
        eg4 eg4 = new eg4();
        DEFAULT_INSTANCE = eg4;
        qe1.m62492dk(eg4.class, eg4);
    }

    /* renamed from: Rk */
    public static eg4 m46645Rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: cl */
    public static C5143b m46646cl() {
        return (C5143b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: dl */
    public static C5143b m46647dl(eg4 eg4) {
        return (C5143b) DEFAULT_INSTANCE.mo43358gj(eg4);
    }

    /* renamed from: el */
    public static eg4 m46648el(InputStream inputStream) throws IOException {
        return (eg4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: fl */
    public static eg4 m46650fl(InputStream inputStream, zy0 zy0) throws IOException {
        return (eg4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: gl */
    public static eg4 m46652gl(C5173er erVar) throws nt1 {
        return (eg4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: hl */
    public static eg4 m46654hl(C5173er erVar, zy0 zy0) throws nt1 {
        return (eg4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: il */
    public static eg4 m46656il(g00 g00) throws IOException {
        return (eg4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: jl */
    public static eg4 m46658jl(g00 g00, zy0 zy0) throws IOException {
        return (eg4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: kl */
    public static eg4 m46660kl(InputStream inputStream) throws IOException {
        return (eg4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ll */
    public static eg4 m46662ll(InputStream inputStream, zy0 zy0) throws IOException {
        return (eg4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ml */
    public static eg4 m46664ml(ByteBuffer byteBuffer) throws nt1 {
        return (eg4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: nl */
    public static eg4 m46666nl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (eg4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: ol */
    public static eg4 m46668ol(byte[] bArr) throws nt1 {
        return (eg4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: pl */
    public static eg4 m46670pl(byte[] bArr, zy0 zy0) throws nt1 {
        return (eg4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: ql */
    public static cz2<eg4> m46672ql() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: B0 */
    public int mo35276B0() {
        return this.perfSessions_.size();
    }

    /* renamed from: Dk */
    public final void mo35277Dk(Iterable<? extends h13> iterable) {
        mo35294Pk();
        C7403z0.m72412X6(iterable, this.perfSessions_);
    }

    /* renamed from: Ek */
    public final void mo35278Ek(Iterable<? extends eg4> iterable) {
        mo35295Qk();
        C7403z0.m72412X6(iterable, this.subtraces_);
    }

    /* renamed from: F6 */
    public boolean mo35279F6() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: Fb */
    public Map<String, Long> mo35280Fb() {
        return Collections.unmodifiableMap(mo35307Yk());
    }

    /* renamed from: Fk */
    public final void mo35281Fk(int i, h13 h13) {
        h13.getClass();
        mo35294Pk();
        this.perfSessions_.add(i, h13);
    }

    /* renamed from: Gk */
    public final void mo35282Gk(h13 h13) {
        h13.getClass();
        mo35294Pk();
        this.perfSessions_.add(h13);
    }

    /* renamed from: H0 */
    public List<h13> mo35283H0() {
        return this.perfSessions_;
    }

    /* renamed from: Hk */
    public final void mo35284Hk(int i, eg4 eg4) {
        eg4.getClass();
        mo35295Qk();
        this.subtraces_.add(i, eg4);
    }

    /* renamed from: Ik */
    public final void mo35285Ik(eg4 eg4) {
        eg4.getClass();
        mo35295Qk();
        this.subtraces_.add(eg4);
    }

    /* renamed from: Jk */
    public final void mo35286Jk() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0;
    }

    @Deprecated
    /* renamed from: Kg */
    public Map<String, Long> mo35287Kg() {
        return mo35280Fb();
    }

    /* renamed from: Kk */
    public final void mo35288Kk() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0;
    }

    /* renamed from: Lk */
    public final void mo35289Lk() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* renamed from: Mk */
    public final void mo35290Mk() {
        this.bitField0_ &= -2;
        this.name_ = m46645Rk().getName();
    }

    /* renamed from: N */
    public boolean mo35291N(String str) {
        str.getClass();
        return mo35309Zk().containsKey(str);
    }

    /* renamed from: Nk */
    public final void mo35292Nk() {
        this.perfSessions_ = qe1.m62499pj();
    }

    /* renamed from: Ok */
    public final void mo35293Ok() {
        this.subtraces_ = qe1.m62499pj();
    }

    /* renamed from: Pk */
    public final void mo35294Pk() {
        vs1.C7095k<h13> kVar = this.perfSessions_;
        if (!kVar.mo36500p()) {
            this.perfSessions_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Qk */
    public final void mo35295Qk() {
        vs1.C7095k<eg4> kVar = this.subtraces_;
        if (!kVar.mo36500p()) {
            this.subtraces_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: S */
    public Map<String, String> mo35296S() {
        return Collections.unmodifiableMap(mo35309Zk());
    }

    /* renamed from: Sk */
    public final Map<String, Long> mo35297Sk() {
        return mo35313al();
    }

    /* renamed from: Tk */
    public final Map<String, String> mo35298Tk() {
        return mo35314bl();
    }

    /* renamed from: Uk */
    public i13 mo35299Uk(int i) {
        return this.perfSessions_.get(i);
    }

    /* renamed from: Vk */
    public List<? extends i13> mo35300Vk() {
        return this.perfSessions_;
    }

    /* renamed from: Wi */
    public List<eg4> mo35301Wi() {
        return this.subtraces_;
    }

    /* renamed from: Wk */
    public gg4 mo35302Wk(int i) {
        return this.subtraces_.get(i);
    }

    @Deprecated
    /* renamed from: X */
    public Map<String, String> mo35303X() {
        return mo35296S();
    }

    /* renamed from: Xb */
    public boolean mo35304Xb(String str) {
        str.getClass();
        return mo35307Yk().containsKey(str);
    }

    /* renamed from: Xk */
    public List<? extends gg4> mo35305Xk() {
        return this.subtraces_;
    }

    /* renamed from: Y1 */
    public long mo35306Y1() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: Yk */
    public final rc2<String, Long> mo35307Yk() {
        return this.counters_;
    }

    /* renamed from: Zf */
    public long mo35308Zf(String str, long j) {
        str.getClass();
        rc2<String, Long> Yk = mo35307Yk();
        return Yk.containsKey(str) ? Yk.get(str).longValue() : j;
    }

    /* renamed from: Zk */
    public final rc2<String, String> mo35309Zk() {
        return this.customAttributes_;
    }

    /* renamed from: a */
    public C5173er mo35310a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: a0 */
    public String mo35311a0(String str, String str2) {
        str.getClass();
        rc2<String, String> Zk = mo35309Zk();
        return Zk.containsKey(str) ? Zk.get(str) : str2;
    }

    /* renamed from: a2 */
    public h13 mo35312a2(int i) {
        return this.perfSessions_.get(i);
    }

    /* renamed from: al */
    public final rc2<String, Long> mo35313al() {
        if (!this.counters_.mo43841n()) {
            this.counters_ = this.counters_.mo43846q();
        }
        return this.counters_;
    }

    /* renamed from: bl */
    public final rc2<String, String> mo35314bl() {
        if (!this.customAttributes_.mo43841n()) {
            this.customAttributes_ = this.customAttributes_.mo43846q();
        }
        return this.customAttributes_;
    }

    /* renamed from: ci */
    public long mo35315ci() {
        return this.durationUs_;
    }

    /* renamed from: f */
    public boolean mo35316f() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: f2 */
    public boolean mo35317f2() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: f9 */
    public int mo35318f9() {
        return this.subtraces_.size();
    }

    /* renamed from: fe */
    public int mo35319fe() {
        return mo35307Yk().size();
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: h0 */
    public int mo35321h0() {
        return mo35309Zk().size();
    }

    /* renamed from: if */
    public boolean mo35322if() {
        return this.isAuto_;
    }

    /* renamed from: jd */
    public long mo35323jd(String str) {
        str.getClass();
        rc2<String, Long> Yk = mo35307Yk();
        if (Yk.containsKey(str)) {
            return Yk.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        Class<eg4> cls = eg4.class;
        switch (C5142a.f27924a[iVar.ordinal()]) {
            case 1:
                return new eg4();
            case 2:
                return new C5143b((C5142a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C5144c.f27925a, "subtraces_", cls, "customAttributes_", C5145d.f27926a, "perfSessions_", h13.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<eg4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (cls) {
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

    /* renamed from: l0 */
    public String mo35324l0(String str) {
        str.getClass();
        rc2<String, String> Zk = mo35309Zk();
        if (Zk.containsKey(str)) {
            return Zk.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m8 */
    public eg4 mo35325m8(int i) {
        return this.subtraces_.get(i);
    }

    /* renamed from: n5 */
    public boolean mo35326n5() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: rl */
    public final void mo35327rl(int i) {
        mo35294Pk();
        this.perfSessions_.remove(i);
    }

    /* renamed from: sl */
    public final void mo35328sl(int i) {
        mo35295Qk();
        this.subtraces_.remove(i);
    }

    /* renamed from: tl */
    public final void mo35329tl(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* renamed from: ul */
    public final void mo35330ul(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* renamed from: vl */
    public final void mo35331vl(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* renamed from: wl */
    public final void mo35332wl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* renamed from: xl */
    public final void mo35333xl(C5173er erVar) {
        this.name_ = erVar.mo35543k0();
        this.bitField0_ |= 1;
    }

    /* renamed from: yl */
    public final void mo35334yl(int i, h13 h13) {
        h13.getClass();
        mo35294Pk();
        this.perfSessions_.set(i, h13);
    }

    /* renamed from: zl */
    public final void mo35335zl(int i, eg4 eg4) {
        eg4.getClass();
        mo35295Qk();
        this.subtraces_.set(i, eg4);
    }
}
