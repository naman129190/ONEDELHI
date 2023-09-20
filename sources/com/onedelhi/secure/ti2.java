package com.onedelhi.secure;

import com.onedelhi.secure.eq0;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y02;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ti2 extends qe1<ti2, C6878b> implements ui2 {
    /* access modifiers changed from: private */
    public static final ti2 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<ti2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_ = "";
    private String displayName_ = "";
    private vs1.C7095k<y02> labels_ = qe1.m62499pj();
    private int launchStage_;
    private C6879c metadata_;
    private int metricKind_;
    private String name_ = "";
    private String type_ = "";
    private String unit_ = "";
    private int valueType_;

    /* renamed from: com.onedelhi.secure.ti2$a */
    public static /* synthetic */ class C6877a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35630a;

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
                f35630a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35630a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ti2.C6877a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ti2$b */
    public static final class C6878b extends qe1.C6546b<ti2, C6878b> implements ui2 {
        public C6878b() {
            super(ti2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6878b(C6877a aVar) {
            this();
        }

        /* renamed from: C */
        public String mo45035C() {
            return ((ti2) this.f34068b).mo45035C();
        }

        /* renamed from: E0 */
        public C5173er mo45038E0() {
            return ((ti2) this.f34068b).mo45038E0();
        }

        /* renamed from: G */
        public C5173er mo45041G() {
            return ((ti2) this.f34068b).mo45041G();
        }

        /* renamed from: Gj */
        public C6878b mo45090Gj(Iterable<? extends y02> iterable) {
            mo43393xj();
            ((ti2) this.f34068b).mo45050Nk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6878b mo45091Hj(int i, y02.C7291b bVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45052Ok(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6878b mo45092Ij(int i, y02 y02) {
            mo43393xj();
            ((ti2) this.f34068b).mo45052Ok(i, y02);
            return this;
        }

        /* renamed from: Jj */
        public C6878b mo45093Jj(y02.C7291b bVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45054Pk((y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6878b mo45094Kj(y02 y02) {
            mo43393xj();
            ((ti2) this.f34068b).mo45054Pk(y02);
            return this;
        }

        /* renamed from: Lj */
        public C6878b mo45095Lj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45056Qk();
            return this;
        }

        /* renamed from: Mj */
        public C6878b mo45096Mj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45057Rk();
            return this;
        }

        /* renamed from: N5 */
        public C6885f mo45049N5() {
            return ((ti2) this.f34068b).mo45049N5();
        }

        /* renamed from: Nj */
        public C6878b mo45097Nj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45058Sk();
            return this;
        }

        /* renamed from: O1 */
        public String mo45051O1() {
            return ((ti2) this.f34068b).mo45051O1();
        }

        /* renamed from: Oj */
        public C6878b mo45098Oj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45059Tk();
            return this;
        }

        /* renamed from: P */
        public int mo45053P() {
            return ((ti2) this.f34068b).mo45053P();
        }

        /* renamed from: Pj */
        public C6878b mo45099Pj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45060Uk();
            return this;
        }

        /* renamed from: Q */
        public k12 mo45055Q() {
            return ((ti2) this.f34068b).mo45055Q();
        }

        /* renamed from: Qj */
        public C6878b mo45100Qj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45061Vk();
            return this;
        }

        /* renamed from: Rj */
        public C6878b mo45101Rj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45062Wk();
            return this;
        }

        /* renamed from: Sj */
        public C6878b mo45102Sj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45063Xk();
            return this;
        }

        /* renamed from: Tj */
        public C6878b mo45103Tj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45064Yk();
            return this;
        }

        /* renamed from: Uj */
        public C6878b mo45104Uj() {
            mo43393xj();
            ((ti2) this.f34068b).mo45065Zk();
            return this;
        }

        /* renamed from: Vj */
        public C6878b mo45105Vj(C6879c cVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45075el(cVar);
            return this;
        }

        /* renamed from: Wj */
        public C6878b mo45106Wj(int i) {
            mo43393xj();
            ((ti2) this.f34068b).mo45083ul(i);
            return this;
        }

        /* renamed from: Xj */
        public C6878b mo45107Xj(String str) {
            mo43393xj();
            ((ti2) this.f34068b).mo45084vl(str);
            return this;
        }

        /* renamed from: Yj */
        public C6878b mo45108Yj(C5173er erVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45085wl(erVar);
            return this;
        }

        /* renamed from: Zj */
        public C6878b mo45109Zj(String str) {
            mo43393xj();
            ((ti2) this.f34068b).mo45086xl(str);
            return this;
        }

        /* renamed from: a */
        public C5173er mo45066a() {
            return ((ti2) this.f34068b).mo45066a();
        }

        /* renamed from: ak */
        public C6878b mo45110ak(C5173er erVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45087yl(erVar);
            return this;
        }

        /* renamed from: b */
        public C5173er mo45068b() {
            return ((ti2) this.f34068b).mo45068b();
        }

        /* renamed from: bi */
        public C6882e mo45069bi() {
            return ((ti2) this.f34068b).mo45069bi();
        }

        /* renamed from: bk */
        public C6878b mo45111bk(int i, y02.C7291b bVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45089zl(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: c */
        public String mo45070c() {
            return ((ti2) this.f34068b).mo45070c();
        }

        /* renamed from: ck */
        public C6878b mo45112ck(int i, y02 y02) {
            mo43393xj();
            ((ti2) this.f34068b).mo45089zl(i, y02);
            return this;
        }

        /* renamed from: d0 */
        public List<y02> mo45072d0() {
            return Collections.unmodifiableList(((ti2) this.f34068b).mo45072d0());
        }

        /* renamed from: dk */
        public C6878b mo45113dk(k12 k12) {
            mo43393xj();
            ((ti2) this.f34068b).mo45033Al(k12);
            return this;
        }

        /* renamed from: e5 */
        public C6879c mo45074e5() {
            return ((ti2) this.f34068b).mo45074e5();
        }

        /* renamed from: ek */
        public C6878b mo45114ek(int i) {
            mo43393xj();
            ((ti2) this.f34068b).mo45034Bl(i);
            return this;
        }

        /* renamed from: fk */
        public C6878b mo45115fk(C6879c.C6880a aVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45036Cl((C6879c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: g0 */
        public y02 mo45076g0(int i) {
            return ((ti2) this.f34068b).mo45076g0(i);
        }

        public String getName() {
            return ((ti2) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C6878b mo45116gk(C6879c cVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45036Cl(cVar);
            return this;
        }

        /* renamed from: h */
        public String mo45078h() {
            return ((ti2) this.f34068b).mo45078h();
        }

        /* renamed from: hk */
        public C6878b mo45117hk(C6882e eVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45037Dl(eVar);
            return this;
        }

        /* renamed from: ik */
        public C6878b mo45118ik(int i) {
            mo43393xj();
            ((ti2) this.f34068b).mo45039El(i);
            return this;
        }

        /* renamed from: j1 */
        public int mo45079j1() {
            return ((ti2) this.f34068b).mo45079j1();
        }

        /* renamed from: jk */
        public C6878b mo45119jk(String str) {
            mo43393xj();
            ((ti2) this.f34068b).mo45040Fl(str);
            return this;
        }

        /* renamed from: kk */
        public C6878b mo45120kk(C5173er erVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45042Gl(erVar);
            return this;
        }

        /* renamed from: lk */
        public C6878b mo45121lk(String str) {
            mo43393xj();
            ((ti2) this.f34068b).mo45043Hl(str);
            return this;
        }

        /* renamed from: m */
        public C5173er mo45080m() {
            return ((ti2) this.f34068b).mo45080m();
        }

        /* renamed from: m0 */
        public boolean mo45081m0() {
            return ((ti2) this.f34068b).mo45081m0();
        }

        /* renamed from: mk */
        public C6878b mo45122mk(C5173er erVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45044Il(erVar);
            return this;
        }

        /* renamed from: nk */
        public C6878b mo45123nk(String str) {
            mo43393xj();
            ((ti2) this.f34068b).mo45045Jl(str);
            return this;
        }

        /* renamed from: ok */
        public C6878b mo45124ok(C5173er erVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45046Kl(erVar);
            return this;
        }

        /* renamed from: pk */
        public C6878b mo45125pk(C6885f fVar) {
            mo43393xj();
            ((ti2) this.f34068b).mo45047Ll(fVar);
            return this;
        }

        /* renamed from: qk */
        public C6878b mo45126qk(int i) {
            mo43393xj();
            ((ti2) this.f34068b).mo45048Ml(i);
            return this;
        }

        /* renamed from: r */
        public int mo45082r() {
            return ((ti2) this.f34068b).mo45082r();
        }

        /* renamed from: z6 */
        public int mo45088z6() {
            return ((ti2) this.f34068b).mo45088z6();
        }
    }

    /* renamed from: com.onedelhi.secure.ti2$c */
    public static final class C6879c extends qe1<C6879c, C6880a> implements C6881d {
        /* access modifiers changed from: private */
        public static final C6879c DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile cz2<C6879c> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private eq0 ingestDelay_;
        private int launchStage_;
        private eq0 samplePeriod_;

        /* renamed from: com.onedelhi.secure.ti2$c$a */
        public static final class C6880a extends qe1.C6546b<C6879c, C6880a> implements C6881d {
            public C6880a() {
                super(C6879c.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6880a(C6877a aVar) {
                this();
            }

            /* renamed from: Gj */
            public C6880a mo45142Gj() {
                mo43393xj();
                ((C6879c) this.f34068b).mo45136pk();
                return this;
            }

            @Deprecated
            /* renamed from: Hj */
            public C6880a mo45143Hj() {
                mo43393xj();
                ((C6879c) this.f34068b).mo45137qk();
                return this;
            }

            /* renamed from: Ij */
            public C6880a mo45144Ij() {
                mo43393xj();
                ((C6879c) this.f34068b).mo45138rk();
                return this;
            }

            /* renamed from: Jj */
            public C6880a mo45145Jj(eq0 eq0) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45139tk(eq0);
                return this;
            }

            /* renamed from: Kj */
            public C6880a mo45146Kj(eq0 eq0) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45140uk(eq0);
                return this;
            }

            /* renamed from: Lj */
            public C6880a mo45147Lj(eq0.C5172b bVar) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45127Kk((eq0) bVar.mo43381ab());
                return this;
            }

            /* renamed from: Mj */
            public C6880a mo45148Mj(eq0 eq0) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45127Kk(eq0);
                return this;
            }

            @Deprecated
            /* renamed from: Nj */
            public C6880a mo45149Nj(k12 k12) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45128Lk(k12);
                return this;
            }

            @Deprecated
            /* renamed from: Oj */
            public C6880a mo45150Oj(int i) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45129Mk(i);
                return this;
            }

            @Deprecated
            /* renamed from: P */
            public int mo45131P() {
                return ((C6879c) this.f34068b).mo45131P();
            }

            /* renamed from: Pj */
            public C6880a mo45151Pj(eq0.C5172b bVar) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45130Nk((eq0) bVar.mo43381ab());
                return this;
            }

            @Deprecated
            /* renamed from: Q */
            public k12 mo45132Q() {
                return ((C6879c) this.f34068b).mo45132Q();
            }

            /* renamed from: Qj */
            public C6880a mo45152Qj(eq0 eq0) {
                mo43393xj();
                ((C6879c) this.f34068b).mo45130Nk(eq0);
                return this;
            }

            /* renamed from: V5 */
            public eq0 mo45133V5() {
                return ((C6879c) this.f34068b).mo45133V5();
            }

            /* renamed from: Y5 */
            public boolean mo45134Y5() {
                return ((C6879c) this.f34068b).mo45134Y5();
            }

            /* renamed from: h4 */
            public eq0 mo45135h4() {
                return ((C6879c) this.f34068b).mo45135h4();
            }

            /* renamed from: wb */
            public boolean mo45141wb() {
                return ((C6879c) this.f34068b).mo45141wb();
            }
        }

        static {
            C6879c cVar = new C6879c();
            DEFAULT_INSTANCE = cVar;
            qe1.m62492dk(C6879c.class, cVar);
        }

        /* renamed from: Ak */
        public static C6879c m65855Ak(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6879c) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: Bk */
        public static C6879c m65856Bk(g00 g00) throws IOException {
            return (C6879c) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: Ck */
        public static C6879c m65857Ck(g00 g00, zy0 zy0) throws IOException {
            return (C6879c) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: Dk */
        public static C6879c m65858Dk(InputStream inputStream) throws IOException {
            return (C6879c) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: Ek */
        public static C6879c m65859Ek(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6879c) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: Fk */
        public static C6879c m65860Fk(ByteBuffer byteBuffer) throws nt1 {
            return (C6879c) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Gk */
        public static C6879c m65861Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6879c) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Hk */
        public static C6879c m65862Hk(byte[] bArr) throws nt1 {
            return (C6879c) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ik */
        public static C6879c m65863Ik(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6879c) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Jk */
        public static cz2<C6879c> m65864Jk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: sk */
        public static C6879c m65875sk() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: vk */
        public static C6880a m65876vk() {
            return (C6880a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: wk */
        public static C6880a m65877wk(C6879c cVar) {
            return (C6880a) DEFAULT_INSTANCE.mo43358gj(cVar);
        }

        /* renamed from: xk */
        public static C6879c m65878xk(InputStream inputStream) throws IOException {
            return (C6879c) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: yk */
        public static C6879c m65879yk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6879c) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: zk */
        public static C6879c m65880zk(C5173er erVar) throws nt1 {
            return (C6879c) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: Kk */
        public final void mo45127Kk(eq0 eq0) {
            eq0.getClass();
            this.ingestDelay_ = eq0;
        }

        /* renamed from: Lk */
        public final void mo45128Lk(k12 k12) {
            this.launchStage_ = k12.mo32392j();
        }

        /* renamed from: Mk */
        public final void mo45129Mk(int i) {
            this.launchStage_ = i;
        }

        /* renamed from: Nk */
        public final void mo45130Nk(eq0 eq0) {
            eq0.getClass();
            this.samplePeriod_ = eq0;
        }

        @Deprecated
        /* renamed from: P */
        public int mo45131P() {
            return this.launchStage_;
        }

        @Deprecated
        /* renamed from: Q */
        public k12 mo45132Q() {
            k12 a = k12.m54001a(this.launchStage_);
            return a == null ? k12.UNRECOGNIZED : a;
        }

        /* renamed from: V5 */
        public eq0 mo45133V5() {
            eq0 eq0 = this.ingestDelay_;
            return eq0 == null ? eq0.m47083mk() : eq0;
        }

        /* renamed from: Y5 */
        public boolean mo45134Y5() {
            return this.samplePeriod_ != null;
        }

        /* renamed from: h4 */
        public eq0 mo45135h4() {
            eq0 eq0 = this.samplePeriod_;
            return eq0 == null ? eq0.m47083mk() : eq0;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6877a.f35630a[iVar.ordinal()]) {
                case 1:
                    return new C6879c();
                case 2:
                    return new C6880a((C6877a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6879c> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6879c.class) {
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
        public final void mo45136pk() {
            this.ingestDelay_ = null;
        }

        /* renamed from: qk */
        public final void mo45137qk() {
            this.launchStage_ = 0;
        }

        /* renamed from: rk */
        public final void mo45138rk() {
            this.samplePeriod_ = null;
        }

        /* renamed from: tk */
        public final void mo45139tk(eq0 eq0) {
            eq0.getClass();
            eq0 eq02 = this.ingestDelay_;
            if (!(eq02 == null || eq02 == eq0.m47083mk())) {
                eq0 = (eq0) ((eq0.C5172b) eq0.m47085ok(this.ingestDelay_).mo43372Cj(eq0)).mo43377Ja();
            }
            this.ingestDelay_ = eq0;
        }

        /* renamed from: uk */
        public final void mo45140uk(eq0 eq0) {
            eq0.getClass();
            eq0 eq02 = this.samplePeriod_;
            if (!(eq02 == null || eq02 == eq0.m47083mk())) {
                eq0 = (eq0) ((eq0.C5172b) eq0.m47085ok(this.samplePeriod_).mo43372Cj(eq0)).mo43377Ja();
            }
            this.samplePeriod_ = eq0;
        }

        /* renamed from: wb */
        public boolean mo45141wb() {
            return this.ingestDelay_ != null;
        }
    }

    /* renamed from: com.onedelhi.secure.ti2$d */
    public interface C6881d extends zh2 {
        @Deprecated
        /* renamed from: P */
        int mo45131P();

        @Deprecated
        /* renamed from: Q */
        k12 mo45132Q();

        /* renamed from: V5 */
        eq0 mo45133V5();

        /* renamed from: Y5 */
        boolean mo45134Y5();

        /* renamed from: h4 */
        eq0 mo45135h4();

        /* renamed from: wb */
        boolean mo45141wb();
    }

    /* renamed from: com.onedelhi.secure.ti2$e */
    public enum C6882e implements vs1.C7081c {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6882e> f35632a = null;

        /* renamed from: o */
        public static final int f35638o = 0;

        /* renamed from: p */
        public static final int f35639p = 1;

        /* renamed from: q */
        public static final int f35640q = 2;

        /* renamed from: r */
        public static final int f35641r = 3;

        /* renamed from: n */
        public final int f35642n;

        /* renamed from: com.onedelhi.secure.ti2$e$a */
        public class C6883a implements vs1.C7082d<C6882e> {
            /* renamed from: b */
            public C6882e mo32393a(int i) {
                return C6882e.m65920a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.ti2$e$b */
        public static final class C6884b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f35643a = null;

            static {
                f35643a = new C6884b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6882e.m65920a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f35632a = new C6883a();
        }

        /* access modifiers changed from: public */
        C6882e(int i) {
            this.f35642n = i;
        }

        /* renamed from: a */
        public static C6882e m65920a(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        /* renamed from: b */
        public static vs1.C7082d<C6882e> m65921b() {
            return f35632a;
        }

        /* renamed from: e */
        public static vs1.C7083e m65922e() {
            return C6884b.f35643a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6882e m65923g(int i) {
            return m65920a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f35642n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.onedelhi.secure.ti2$f */
    public enum C6885f implements vs1.C7081c {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6885f> f35645a = null;

        /* renamed from: o */
        public static final int f35654o = 0;

        /* renamed from: p */
        public static final int f35655p = 1;

        /* renamed from: q */
        public static final int f35656q = 2;

        /* renamed from: r */
        public static final int f35657r = 3;

        /* renamed from: s */
        public static final int f35658s = 4;

        /* renamed from: t */
        public static final int f35659t = 5;

        /* renamed from: u */
        public static final int f35660u = 6;

        /* renamed from: n */
        public final int f35661n;

        /* renamed from: com.onedelhi.secure.ti2$f$a */
        public class C6886a implements vs1.C7082d<C6885f> {
            /* renamed from: b */
            public C6885f mo32393a(int i) {
                return C6885f.m65928a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.ti2$f$b */
        public static final class C6887b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f35662a = null;

            static {
                f35662a = new C6887b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6885f.m65928a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f35645a = new C6886a();
        }

        /* access modifiers changed from: public */
        C6885f(int i) {
            this.f35661n = i;
        }

        /* renamed from: a */
        public static C6885f m65928a(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static vs1.C7082d<C6885f> m65929b() {
            return f35645a;
        }

        /* renamed from: e */
        public static vs1.C7083e m65930e() {
            return C6887b.f35662a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6885f m65931g(int i) {
            return m65928a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f35661n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        ti2 ti2 = new ti2();
        DEFAULT_INSTANCE = ti2;
        qe1.m62492dk(ti2.class, ti2);
    }

    /* renamed from: bl */
    public static ti2 m65704bl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: fl */
    public static C6878b m65706fl() {
        return (C6878b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: gl */
    public static C6878b m65708gl(ti2 ti2) {
        return (C6878b) DEFAULT_INSTANCE.mo43358gj(ti2);
    }

    /* renamed from: hl */
    public static ti2 m65710hl(InputStream inputStream) throws IOException {
        return (ti2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: il */
    public static ti2 m65712il(InputStream inputStream, zy0 zy0) throws IOException {
        return (ti2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: jl */
    public static ti2 m65714jl(C5173er erVar) throws nt1 {
        return (ti2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: kl */
    public static ti2 m65716kl(C5173er erVar, zy0 zy0) throws nt1 {
        return (ti2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: ll */
    public static ti2 m65718ll(g00 g00) throws IOException {
        return (ti2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: ml */
    public static ti2 m65720ml(g00 g00, zy0 zy0) throws IOException {
        return (ti2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: nl */
    public static ti2 m65722nl(InputStream inputStream) throws IOException {
        return (ti2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: ol */
    public static ti2 m65724ol(InputStream inputStream, zy0 zy0) throws IOException {
        return (ti2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: pl */
    public static ti2 m65726pl(ByteBuffer byteBuffer) throws nt1 {
        return (ti2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: ql */
    public static ti2 m65728ql(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ti2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: rl */
    public static ti2 m65730rl(byte[] bArr) throws nt1 {
        return (ti2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: sl */
    public static ti2 m65732sl(byte[] bArr, zy0 zy0) throws nt1 {
        return (ti2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: tl */
    public static cz2<ti2> m65734tl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Al */
    public final void mo45033Al(k12 k12) {
        this.launchStage_ = k12.mo32392j();
    }

    /* renamed from: Bl */
    public final void mo45034Bl(int i) {
        this.launchStage_ = i;
    }

    /* renamed from: C */
    public String mo45035C() {
        return this.displayName_;
    }

    /* renamed from: Cl */
    public final void mo45036Cl(C6879c cVar) {
        cVar.getClass();
        this.metadata_ = cVar;
    }

    /* renamed from: Dl */
    public final void mo45037Dl(C6882e eVar) {
        this.metricKind_ = eVar.mo32392j();
    }

    /* renamed from: E0 */
    public C5173er mo45038E0() {
        return C5173er.m47136w(this.unit_);
    }

    /* renamed from: El */
    public final void mo45039El(int i) {
        this.metricKind_ = i;
    }

    /* renamed from: Fl */
    public final void mo45040Fl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: G */
    public C5173er mo45041G() {
        return C5173er.m47136w(this.displayName_);
    }

    /* renamed from: Gl */
    public final void mo45042Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Hl */
    public final void mo45043Hl(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* renamed from: Il */
    public final void mo45044Il(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.type_ = erVar.mo35543k0();
    }

    /* renamed from: Jl */
    public final void mo45045Jl(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* renamed from: Kl */
    public final void mo45046Kl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.unit_ = erVar.mo35543k0();
    }

    /* renamed from: Ll */
    public final void mo45047Ll(C6885f fVar) {
        this.valueType_ = fVar.mo32392j();
    }

    /* renamed from: Ml */
    public final void mo45048Ml(int i) {
        this.valueType_ = i;
    }

    /* renamed from: N5 */
    public C6885f mo45049N5() {
        C6885f a = C6885f.m65928a(this.valueType_);
        return a == null ? C6885f.UNRECOGNIZED : a;
    }

    /* renamed from: Nk */
    public final void mo45050Nk(Iterable<? extends y02> iterable) {
        mo45067al();
        C7403z0.m72412X6(iterable, this.labels_);
    }

    /* renamed from: O1 */
    public String mo45051O1() {
        return this.unit_;
    }

    /* renamed from: Ok */
    public final void mo45052Ok(int i, y02 y02) {
        y02.getClass();
        mo45067al();
        this.labels_.add(i, y02);
    }

    /* renamed from: P */
    public int mo45053P() {
        return this.launchStage_;
    }

    /* renamed from: Pk */
    public final void mo45054Pk(y02 y02) {
        y02.getClass();
        mo45067al();
        this.labels_.add(y02);
    }

    /* renamed from: Q */
    public k12 mo45055Q() {
        k12 a = k12.m54001a(this.launchStage_);
        return a == null ? k12.UNRECOGNIZED : a;
    }

    /* renamed from: Qk */
    public final void mo45056Qk() {
        this.description_ = m65704bl().mo45070c();
    }

    /* renamed from: Rk */
    public final void mo45057Rk() {
        this.displayName_ = m65704bl().mo45035C();
    }

    /* renamed from: Sk */
    public final void mo45058Sk() {
        this.labels_ = qe1.m62499pj();
    }

    /* renamed from: Tk */
    public final void mo45059Tk() {
        this.launchStage_ = 0;
    }

    /* renamed from: Uk */
    public final void mo45060Uk() {
        this.metadata_ = null;
    }

    /* renamed from: Vk */
    public final void mo45061Vk() {
        this.metricKind_ = 0;
    }

    /* renamed from: Wk */
    public final void mo45062Wk() {
        this.name_ = m65704bl().getName();
    }

    /* renamed from: Xk */
    public final void mo45063Xk() {
        this.type_ = m65704bl().mo45078h();
    }

    /* renamed from: Yk */
    public final void mo45064Yk() {
        this.unit_ = m65704bl().mo45051O1();
    }

    /* renamed from: Zk */
    public final void mo45065Zk() {
        this.valueType_ = 0;
    }

    /* renamed from: a */
    public C5173er mo45066a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: al */
    public final void mo45067al() {
        vs1.C7095k<y02> kVar = this.labels_;
        if (!kVar.mo36500p()) {
            this.labels_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: b */
    public C5173er mo45068b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: bi */
    public C6882e mo45069bi() {
        C6882e a = C6882e.m65920a(this.metricKind_);
        return a == null ? C6882e.UNRECOGNIZED : a;
    }

    /* renamed from: c */
    public String mo45070c() {
        return this.description_;
    }

    /* renamed from: cl */
    public z02 mo45071cl(int i) {
        return this.labels_.get(i);
    }

    /* renamed from: d0 */
    public List<y02> mo45072d0() {
        return this.labels_;
    }

    /* renamed from: dl */
    public List<? extends z02> mo45073dl() {
        return this.labels_;
    }

    /* renamed from: e5 */
    public C6879c mo45074e5() {
        C6879c cVar = this.metadata_;
        return cVar == null ? C6879c.m65875sk() : cVar;
    }

    /* renamed from: el */
    public final void mo45075el(C6879c cVar) {
        cVar.getClass();
        C6879c cVar2 = this.metadata_;
        if (!(cVar2 == null || cVar2 == C6879c.m65875sk())) {
            cVar = (C6879c) ((C6879c.C6880a) C6879c.m65877wk(this.metadata_).mo43372Cj(cVar)).mo43377Ja();
        }
        this.metadata_ = cVar;
    }

    /* renamed from: g0 */
    public y02 mo45076g0(int i) {
        return this.labels_.get(i);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: h */
    public String mo45078h() {
        return this.type_;
    }

    /* renamed from: j1 */
    public int mo45079j1() {
        return this.valueType_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6877a.f35630a[iVar.ordinal()]) {
            case 1:
                return new ti2();
            case 2:
                return new C6878b((C6877a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", y02.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ti2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ti2.class) {
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

    /* renamed from: m */
    public C5173er mo45080m() {
        return C5173er.m47136w(this.type_);
    }

    /* renamed from: m0 */
    public boolean mo45081m0() {
        return this.metadata_ != null;
    }

    /* renamed from: r */
    public int mo45082r() {
        return this.labels_.size();
    }

    /* renamed from: ul */
    public final void mo45083ul(int i) {
        mo45067al();
        this.labels_.remove(i);
    }

    /* renamed from: vl */
    public final void mo45084vl(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: wl */
    public final void mo45085wl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: xl */
    public final void mo45086xl(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* renamed from: yl */
    public final void mo45087yl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.displayName_ = erVar.mo35543k0();
    }

    /* renamed from: z6 */
    public int mo45088z6() {
        return this.metricKind_;
    }

    /* renamed from: zl */
    public final void mo45089zl(int i, y02 y02) {
        y02.getClass();
        mo45067al();
        this.labels_.set(i, y02);
    }
}
