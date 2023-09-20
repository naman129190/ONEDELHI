package com.onedelhi.secure;

import com.onedelhi.secure.C5153ei;
import com.onedelhi.secure.C6528qc;
import com.onedelhi.secure.C6583qk;
import com.onedelhi.secure.C6937u7;
import com.onedelhi.secure.bj4;
import com.onedelhi.secure.d14;
import com.onedelhi.secure.d94;
import com.onedelhi.secure.ga3;
import com.onedelhi.secure.jk2;
import com.onedelhi.secure.jl4;
import com.onedelhi.secure.ku0;
import com.onedelhi.secure.n80;
import com.onedelhi.secure.o70;
import com.onedelhi.secure.pk2;
import com.onedelhi.secure.pp4;
import com.onedelhi.secure.q92;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.ti2;
import com.onedelhi.secure.vn0;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.x82;
import com.onedelhi.secure.yu0;
import com.onedelhi.secure.zl1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ou3 extends qe1<ou3, C6307b> implements ru3 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    /* access modifiers changed from: private */
    public static final ou3 DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<ou3> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private vs1.C7095k<C6937u7> apis_ = qe1.m62499pj();
    private C6528qc authentication_;
    private C5153ei backend_;
    private C6583qk billing_;
    private jl4 configVersion_;
    private o70 context_;
    private n80 control_;
    private vn0 documentation_;
    private vs1.C7095k<ku0> endpoints_ = qe1.m62499pj();
    private vs1.C7095k<yu0> enums_ = qe1.m62499pj();
    private zl1 http_;
    private String id_ = "";
    private q92 logging_;
    private vs1.C7095k<x82> logs_ = qe1.m62499pj();
    private vs1.C7095k<ti2> metrics_ = qe1.m62499pj();
    private vs1.C7095k<jk2> monitoredResources_ = qe1.m62499pj();
    private pk2 monitoring_;
    private String name_ = "";
    private String producerProjectId_ = "";
    private ga3 quota_;
    private d14 sourceInfo_;
    private d94 systemParameters_;
    private String title_ = "";
    private vs1.C7095k<bj4> types_ = qe1.m62499pj();
    private pp4 usage_;

    /* renamed from: com.onedelhi.secure.ou3$a */
    public static /* synthetic */ class C6306a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33186a;

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
                f33186a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33186a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ou3.C6306a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ou3$b */
    public static final class C6307b extends qe1.C6546b<ou3, C6307b> implements ru3 {
        public C6307b() {
            super(ou3.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6307b(C6306a aVar) {
            this();
        }

        /* renamed from: A9 */
        public boolean mo41969A9() {
            return ((ou3) this.f34068b).mo41969A9();
        }

        /* renamed from: Af */
        public boolean mo41970Af() {
            return ((ou3) this.f34068b).mo41970Af();
        }

        /* renamed from: Ak */
        public C6307b mo42143Ak() {
            mo43393xj();
            ((ou3) this.f34068b).mo41981Em();
            return this;
        }

        /* renamed from: Al */
        public C6307b mo42144Al(int i, ku0 ku0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42070go(i, ku0);
            return this;
        }

        /* renamed from: Bc */
        public int mo41974Bc() {
            return ((ou3) this.f34068b).mo41974Bc();
        }

        /* renamed from: Bk */
        public C6307b mo42145Bk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41983Fm();
            return this;
        }

        /* renamed from: Bl */
        public C6307b mo42146Bl(int i, yu0.C7390b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42075ho(i, (yu0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: C2 */
        public boolean mo41977C2() {
            return ((ou3) this.f34068b).mo41977C2();
        }

        /* renamed from: Ck */
        public C6307b mo42147Ck() {
            mo43393xj();
            ((ou3) this.f34068b).mo41986Gm();
            return this;
        }

        /* renamed from: Cl */
        public C6307b mo42148Cl(int i, yu0 yu0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42075ho(i, yu0);
            return this;
        }

        /* renamed from: Dk */
        public C6307b mo42149Dk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41988Hm();
            return this;
        }

        /* renamed from: Dl */
        public C6307b mo42150Dl(zl1.C7501b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42078io((zl1) bVar.mo43381ab());
            return this;
        }

        /* renamed from: E */
        public C5173er mo41980E() {
            return ((ou3) this.f34068b).mo41980E();
        }

        /* renamed from: Ek */
        public C6307b mo42151Ek() {
            mo43393xj();
            ((ou3) this.f34068b).mo41989Im();
            return this;
        }

        /* renamed from: El */
        public C6307b mo42152El(zl1 zl1) {
            mo43393xj();
            ((ou3) this.f34068b).mo42078io(zl1);
            return this;
        }

        /* renamed from: Fe */
        public jk2 mo41982Fe(int i) {
            return ((ou3) this.f34068b).mo41982Fe(i);
        }

        /* renamed from: Fk */
        public C6307b mo42153Fk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41990Jm();
            return this;
        }

        /* renamed from: Fl */
        public C6307b mo42154Fl(String str) {
            mo43393xj();
            ((ou3) this.f34068b).mo42082jo(str);
            return this;
        }

        /* renamed from: G2 */
        public yu0 mo41984G2(int i) {
            return ((ou3) this.f34068b).mo41984G2(i);
        }

        /* renamed from: Gh */
        public boolean mo41985Gh() {
            return ((ou3) this.f34068b).mo41985Gh();
        }

        /* renamed from: Gj */
        public C6307b mo42155Gj(Iterable<? extends C6937u7> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42031Yl(iterable);
            return this;
        }

        /* renamed from: Gk */
        public C6307b mo42156Gk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41992Km();
            return this;
        }

        /* renamed from: Gl */
        public C6307b mo42157Gl(C5173er erVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42086ko(erVar);
            return this;
        }

        /* renamed from: Hd */
        public C6937u7 mo41987Hd(int i) {
            return ((ou3) this.f34068b).mo41987Hd(i);
        }

        /* renamed from: Hj */
        public C6307b mo42158Hj(Iterable<? extends ku0> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42036Zl(iterable);
            return this;
        }

        /* renamed from: Hk */
        public C6307b mo42159Hk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41994Lm();
            return this;
        }

        /* renamed from: Hl */
        public C6307b mo42160Hl(q92.C6520b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42090lo((q92) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6307b mo42161Ij(Iterable<? extends yu0> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42040am(iterable);
            return this;
        }

        /* renamed from: Ik */
        public C6307b mo42162Ik() {
            mo43393xj();
            ((ou3) this.f34068b).mo41998Mm();
            return this;
        }

        /* renamed from: Il */
        public C6307b mo42163Il(q92 q92) {
            mo43393xj();
            ((ou3) this.f34068b).mo42090lo(q92);
            return this;
        }

        /* renamed from: Jj */
        public C6307b mo42164Jj(Iterable<? extends x82> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42044bm(iterable);
            return this;
        }

        /* renamed from: Jk */
        public C6307b mo42165Jk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41999Nm();
            return this;
        }

        /* renamed from: Jl */
        public C6307b mo42166Jl(int i, x82.C7227b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42094mo(i, (x82) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kh */
        public boolean mo41991Kh() {
            return ((ou3) this.f34068b).mo41991Kh();
        }

        /* renamed from: Kj */
        public C6307b mo42167Kj(Iterable<? extends ti2> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42050cm(iterable);
            return this;
        }

        /* renamed from: Kk */
        public C6307b mo42168Kk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42000Om();
            return this;
        }

        /* renamed from: Kl */
        public C6307b mo42169Kl(int i, x82 x82) {
            mo43393xj();
            ((ou3) this.f34068b).mo42094mo(i, x82);
            return this;
        }

        /* renamed from: L2 */
        public n80 mo41993L2() {
            return ((ou3) this.f34068b).mo41993L2();
        }

        /* renamed from: Lj */
        public C6307b mo42170Lj(Iterable<? extends jk2> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42055dm(iterable);
            return this;
        }

        /* renamed from: Lk */
        public C6307b mo42171Lk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42002Pm();
            return this;
        }

        /* renamed from: Ll */
        public C6307b mo42172Ll(int i, ti2.C6878b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42098no(i, (ti2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: M */
        public List<ti2> mo41995M() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo41995M());
        }

        /* renamed from: Mh */
        public ga3 mo41996Mh() {
            return ((ou3) this.f34068b).mo41996Mh();
        }

        /* renamed from: Mi */
        public boolean mo41997Mi() {
            return ((ou3) this.f34068b).mo41997Mi();
        }

        /* renamed from: Mj */
        public C6307b mo42173Mj(Iterable<? extends bj4> iterable) {
            mo43393xj();
            ((ou3) this.f34068b).mo42059em(iterable);
            return this;
        }

        /* renamed from: Mk */
        public C6307b mo42174Mk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42004Qm();
            return this;
        }

        /* renamed from: Ml */
        public C6307b mo42175Ml(int i, ti2 ti2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42098no(i, ti2);
            return this;
        }

        /* renamed from: Nj */
        public C6307b mo42176Nj(int i, C6937u7.C6939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42063fm(i, (C6937u7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Nk */
        public C6307b mo42177Nk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42006Rm();
            return this;
        }

        /* renamed from: Nl */
        public C6307b mo42178Nl(int i, jk2.C5828b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42101oo(i, (jk2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C6307b mo42179Oj(int i, C6937u7 u7Var) {
            mo43393xj();
            ((ou3) this.f34068b).mo42063fm(i, u7Var);
            return this;
        }

        /* renamed from: Ok */
        public C6307b mo42180Ok(C6528qc qcVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42100on(qcVar);
            return this;
        }

        /* renamed from: Ol */
        public C6307b mo42181Ol(int i, jk2 jk2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42101oo(i, jk2);
            return this;
        }

        /* renamed from: P3 */
        public zl1 mo42001P3() {
            return ((ou3) this.f34068b).mo42001P3();
        }

        /* renamed from: Pj */
        public C6307b mo42182Pj(C6937u7.C6939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42068gm((C6937u7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pk */
        public C6307b mo42183Pk(C5153ei eiVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42103pn(eiVar);
            return this;
        }

        /* renamed from: Pl */
        public C6307b mo42184Pl(pk2.C6454b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42104po((pk2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Qf */
        public int mo42003Qf() {
            return ((ou3) this.f34068b).mo42003Qf();
        }

        /* renamed from: Qj */
        public C6307b mo42185Qj(C6937u7 u7Var) {
            mo43393xj();
            ((ou3) this.f34068b).mo42068gm(u7Var);
            return this;
        }

        /* renamed from: Qk */
        public C6307b mo42186Qk(C6583qk qkVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42106qn(qkVar);
            return this;
        }

        /* renamed from: Ql */
        public C6307b mo42187Ql(pk2 pk2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42104po(pk2);
            return this;
        }

        /* renamed from: R1 */
        public String mo42005R1() {
            return ((ou3) this.f34068b).mo42005R1();
        }

        /* renamed from: Rj */
        public C6307b mo42188Rj(int i, ku0.C5939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42073hm(i, (ku0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Rk */
        public C6307b mo42189Rk(jl4 jl4) {
            mo43393xj();
            ((ou3) this.f34068b).mo42111rn(jl4);
            return this;
        }

        /* renamed from: Rl */
        public C6307b mo42190Rl(String str) {
            mo43393xj();
            ((ou3) this.f34068b).mo42107qo(str);
            return this;
        }

        /* renamed from: Sf */
        public boolean mo42008Sf() {
            return ((ou3) this.f34068b).mo42008Sf();
        }

        /* renamed from: Sh */
        public List<jk2> mo42009Sh() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42009Sh());
        }

        /* renamed from: Sj */
        public C6307b mo42191Sj(int i, ku0 ku0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42073hm(i, ku0);
            return this;
        }

        /* renamed from: Sk */
        public C6307b mo42192Sk(o70 o70) {
            mo43393xj();
            ((ou3) this.f34068b).mo42115sn(o70);
            return this;
        }

        /* renamed from: Sl */
        public C6307b mo42193Sl(C5173er erVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42112ro(erVar);
            return this;
        }

        /* renamed from: Ta */
        public ku0 mo42012Ta(int i) {
            return ((ou3) this.f34068b).mo42012Ta(i);
        }

        /* renamed from: Ti */
        public C5173er mo42013Ti() {
            return ((ou3) this.f34068b).mo42013Ti();
        }

        /* renamed from: Tj */
        public C6307b mo42194Tj(ku0.C5939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42076im((ku0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tk */
        public C6307b mo42195Tk(n80 n80) {
            mo43393xj();
            ((ou3) this.f34068b).mo42120tn(n80);
            return this;
        }

        /* renamed from: Tl */
        public C6307b mo42196Tl(String str) {
            mo43393xj();
            ((ou3) this.f34068b).mo42116so(str);
            return this;
        }

        /* renamed from: Uj */
        public C6307b mo42197Uj(ku0 ku0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42076im(ku0);
            return this;
        }

        /* renamed from: Uk */
        public C6307b mo42198Uk(vn0 vn0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42125un(vn0);
            return this;
        }

        /* renamed from: Ul */
        public C6307b mo42199Ul(C5173er erVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42121to(erVar);
            return this;
        }

        /* renamed from: V1 */
        public List<x82> mo42018V1() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42018V1());
        }

        /* renamed from: Vj */
        public C6307b mo42200Vj(int i, yu0.C7390b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42080jm(i, (yu0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vk */
        public C6307b mo42201Vk(zl1 zl1) {
            mo43393xj();
            ((ou3) this.f34068b).mo42128vn(zl1);
            return this;
        }

        /* renamed from: Vl */
        public C6307b mo42202Vl(ga3.C5402b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42126uo((ga3) bVar.mo43381ab());
            return this;
        }

        /* renamed from: W1 */
        public C5173er mo42021W1() {
            return ((ou3) this.f34068b).mo42021W1();
        }

        /* renamed from: W5 */
        public int mo42022W5() {
            return ((ou3) this.f34068b).mo42022W5();
        }

        /* renamed from: Wj */
        public C6307b mo42203Wj(int i, yu0 yu0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42080jm(i, yu0);
            return this;
        }

        /* renamed from: Wk */
        public C6307b mo42204Wk(q92 q92) {
            mo43393xj();
            ((ou3) this.f34068b).mo42132wn(q92);
            return this;
        }

        /* renamed from: Wl */
        public C6307b mo42205Wl(ga3 ga3) {
            mo43393xj();
            ((ou3) this.f34068b).mo42126uo(ga3);
            return this;
        }

        /* renamed from: X2 */
        public o70 mo42025X2() {
            return ((ou3) this.f34068b).mo42025X2();
        }

        /* renamed from: Xj */
        public C6307b mo42206Xj(yu0.C7390b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42084km((yu0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xk */
        public C6307b mo42207Xk(pk2 pk2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42135xn(pk2);
            return this;
        }

        /* renamed from: Xl */
        public C6307b mo42208Xl(d14.C4949b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42129vo((d14) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Yc */
        public jl4 mo42028Yc() {
            return ((ou3) this.f34068b).mo42028Yc();
        }

        /* renamed from: Ye */
        public boolean mo42029Ye() {
            return ((ou3) this.f34068b).mo42029Ye();
        }

        /* renamed from: Yh */
        public x82 mo42030Yh(int i) {
            return ((ou3) this.f34068b).mo42030Yh(i);
        }

        /* renamed from: Yj */
        public C6307b mo42209Yj(yu0 yu0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42084km(yu0);
            return this;
        }

        /* renamed from: Yk */
        public C6307b mo42210Yk(ga3 ga3) {
            mo43393xj();
            ((ou3) this.f34068b).mo42138yn(ga3);
            return this;
        }

        /* renamed from: Yl */
        public C6307b mo42211Yl(d14 d14) {
            mo43393xj();
            ((ou3) this.f34068b).mo42129vo(d14);
            return this;
        }

        /* renamed from: Z2 */
        public bj4 mo42034Z2(int i) {
            return ((ou3) this.f34068b).mo42034Z2(i);
        }

        /* renamed from: Z9 */
        public q92 mo42035Z9() {
            return ((ou3) this.f34068b).mo42035Z9();
        }

        /* renamed from: Zj */
        public C6307b mo42212Zj(int i, x82.C7227b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42088lm(i, (x82) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Zk */
        public C6307b mo42213Zk(d14 d14) {
            mo43393xj();
            ((ou3) this.f34068b).mo42141zn(d14);
            return this;
        }

        /* renamed from: Zl */
        public C6307b mo42214Zl(d94.C4991b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42133wo((d94) bVar.mo43381ab());
            return this;
        }

        /* renamed from: a */
        public C5173er mo42039a() {
            return ((ou3) this.f34068b).mo42039a();
        }

        /* renamed from: ak */
        public C6307b mo42215ak(int i, x82 x82) {
            mo43393xj();
            ((ou3) this.f34068b).mo42088lm(i, x82);
            return this;
        }

        /* renamed from: al */
        public C6307b mo42216al(d94 d94) {
            mo43393xj();
            ((ou3) this.f34068b).mo41972An(d94);
            return this;
        }

        /* renamed from: am */
        public C6307b mo42217am(d94 d94) {
            mo43393xj();
            ((ou3) this.f34068b).mo42133wo(d94);
            return this;
        }

        /* renamed from: b2 */
        public int mo42043b2() {
            return ((ou3) this.f34068b).mo42043b2();
        }

        /* renamed from: bk */
        public C6307b mo42218bk(x82.C7227b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42092mm((x82) bVar.mo43381ab());
            return this;
        }

        /* renamed from: bl */
        public C6307b mo42219bl(pp4 pp4) {
            mo43393xj();
            ((ou3) this.f34068b).mo41976Bn(pp4);
            return this;
        }

        /* renamed from: bm */
        public C6307b mo42220bm(String str) {
            mo43393xj();
            ((ou3) this.f34068b).mo42136xo(str);
            return this;
        }

        /* renamed from: c0 */
        public int mo42046c0() {
            return ((ou3) this.f34068b).mo42046c0();
        }

        /* renamed from: c4 */
        public C6583qk mo42047c4() {
            return ((ou3) this.f34068b).mo42047c4();
        }

        /* renamed from: c6 */
        public boolean mo42048c6() {
            return ((ou3) this.f34068b).mo42048c6();
        }

        /* renamed from: ca */
        public List<yu0> mo42049ca() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42049ca());
        }

        /* renamed from: ck */
        public C6307b mo42221ck(x82 x82) {
            mo43393xj();
            ((ou3) this.f34068b).mo42092mm(x82);
            return this;
        }

        /* renamed from: cl */
        public C6307b mo42222cl(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42007Rn(i);
            return this;
        }

        /* renamed from: cm */
        public C6307b mo42223cm(C5173er erVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42139yo(erVar);
            return this;
        }

        /* renamed from: da */
        public boolean mo42053da() {
            return ((ou3) this.f34068b).mo42053da();
        }

        /* renamed from: de */
        public boolean mo42054de() {
            return ((ou3) this.f34068b).mo42054de();
        }

        /* renamed from: dk */
        public C6307b mo42224dk(int i, ti2.C6878b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42096nm(i, (ti2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: dl */
        public C6307b mo42225dl(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42011Sn(i);
            return this;
        }

        /* renamed from: dm */
        public C6307b mo42226dm(int i, bj4.C4677b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42142zo(i, (bj4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: e6 */
        public boolean mo42058e6() {
            return ((ou3) this.f34068b).mo42058e6();
        }

        /* renamed from: ek */
        public C6307b mo42227ek(int i, ti2 ti2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42096nm(i, ti2);
            return this;
        }

        /* renamed from: el */
        public C6307b mo42228el(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42015Tn(i);
            return this;
        }

        /* renamed from: em */
        public C6307b mo42229em(int i, bj4 bj4) {
            mo43393xj();
            ((ou3) this.f34068b).mo42142zo(i, bj4);
            return this;
        }

        /* renamed from: fd */
        public int mo42062fd() {
            return ((ou3) this.f34068b).mo42062fd();
        }

        /* renamed from: fk */
        public C6307b mo42230fk(ti2.C6878b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42099om((ti2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: fl */
        public C6307b mo42231fl(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42017Un(i);
            return this;
        }

        /* renamed from: fm */
        public C6307b mo42232fm(pp4.C6469b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo41973Ao((pp4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: gc */
        public pk2 mo42066gc() {
            return ((ou3) this.f34068b).mo42066gc();
        }

        public String getName() {
            return ((ou3) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C6307b mo42233gk(ti2 ti2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42099om(ti2);
            return this;
        }

        /* renamed from: gl */
        public C6307b mo42234gl(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42020Vn(i);
            return this;
        }

        /* renamed from: gm */
        public C6307b mo42235gm(pp4 pp4) {
            mo43393xj();
            ((ou3) this.f34068b).mo41973Ao(pp4);
            return this;
        }

        /* renamed from: hd */
        public List<ku0> mo42071hd() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42071hd());
        }

        /* renamed from: he */
        public List<bj4> mo42072he() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42072he());
        }

        /* renamed from: hk */
        public C6307b mo42236hk(int i, jk2.C5828b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42102pm(i, (jk2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: hl */
        public C6307b mo42237hl(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42024Wn(i);
            return this;
        }

        /* renamed from: ik */
        public C6307b mo42238ik(int i, jk2 jk2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42102pm(i, jk2);
            return this;
        }

        /* renamed from: il */
        public C6307b mo42239il(int i) {
            mo43393xj();
            ((ou3) this.f34068b).mo42027Xn(i);
            return this;
        }

        /* renamed from: j9 */
        public List<C6937u7> mo42079j9() {
            return Collections.unmodifiableList(((ou3) this.f34068b).mo42079j9());
        }

        /* renamed from: jk */
        public C6307b mo42240jk(jk2.C5828b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42105qm((jk2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: jl */
        public C6307b mo42241jl(int i, C6937u7.C6939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42033Yn(i, (C6937u7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ke */
        public int mo42083ke() {
            return ((ou3) this.f34068b).mo42083ke();
        }

        /* renamed from: kk */
        public C6307b mo42242kk(jk2 jk2) {
            mo43393xj();
            ((ou3) this.f34068b).mo42105qm(jk2);
            return this;
        }

        /* renamed from: kl */
        public C6307b mo42243kl(int i, C6937u7 u7Var) {
            mo43393xj();
            ((ou3) this.f34068b).mo42033Yn(i, u7Var);
            return this;
        }

        /* renamed from: l4 */
        public boolean mo42087l4() {
            return ((ou3) this.f34068b).mo42087l4();
        }

        /* renamed from: lk */
        public C6307b mo42244lk(int i, bj4.C4677b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42110rm(i, (bj4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ll */
        public C6307b mo42245ll(C6528qc.C6530b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42038Zn((C6528qc) bVar.mo43381ab());
            return this;
        }

        /* renamed from: m7 */
        public ti2 mo42091m7(int i) {
            return ((ou3) this.f34068b).mo42091m7(i);
        }

        /* renamed from: mk */
        public C6307b mo42246mk(int i, bj4 bj4) {
            mo43393xj();
            ((ou3) this.f34068b).mo42110rm(i, bj4);
            return this;
        }

        /* renamed from: ml */
        public C6307b mo42247ml(C6528qc qcVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42038Zn(qcVar);
            return this;
        }

        /* renamed from: n9 */
        public pp4 mo42095n9() {
            return ((ou3) this.f34068b).mo42095n9();
        }

        /* renamed from: nk */
        public C6307b mo42248nk(bj4.C4677b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42114sm((bj4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: nl */
        public C6307b mo42249nl(C5153ei.C5155b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42042ao((C5153ei) bVar.mo43381ab());
            return this;
        }

        /* renamed from: ok */
        public C6307b mo42250ok(bj4 bj4) {
            mo43393xj();
            ((ou3) this.f34068b).mo42114sm(bj4);
            return this;
        }

        /* renamed from: ol */
        public C6307b mo42251ol(C5153ei eiVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42042ao(eiVar);
            return this;
        }

        /* renamed from: pk */
        public C6307b mo42252pk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42119tm();
            return this;
        }

        /* renamed from: pl */
        public C6307b mo42253pl(C6583qk.C6588d dVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42045bo((C6583qk) dVar.mo43381ab());
            return this;
        }

        /* renamed from: qk */
        public C6307b mo42254qk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42124um();
            return this;
        }

        /* renamed from: ql */
        public C6307b mo42255ql(C6583qk qkVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42045bo(qkVar);
            return this;
        }

        /* renamed from: r4 */
        public d14 mo42108r4() {
            return ((ou3) this.f34068b).mo42108r4();
        }

        /* renamed from: rh */
        public C6528qc mo42109rh() {
            return ((ou3) this.f34068b).mo42109rh();
        }

        /* renamed from: rk */
        public C6307b mo42256rk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42127vm();
            return this;
        }

        /* renamed from: rl */
        public C6307b mo42257rl(jl4.C5832b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42052co((jl4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: s3 */
        public String mo42113s3() {
            return ((ou3) this.f34068b).mo42113s3();
        }

        /* renamed from: sk */
        public C6307b mo42258sk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42131wm();
            return this;
        }

        /* renamed from: sl */
        public C6307b mo42259sl(jl4 jl4) {
            mo43393xj();
            ((ou3) this.f34068b).mo42052co(jl4);
            return this;
        }

        /* renamed from: t8 */
        public vn0 mo42117t8() {
            return ((ou3) this.f34068b).mo42117t8();
        }

        /* renamed from: tb */
        public C5153ei mo42118tb() {
            return ((ou3) this.f34068b).mo42118tb();
        }

        /* renamed from: tk */
        public C6307b mo42260tk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42134xm();
            return this;
        }

        /* renamed from: tl */
        public C6307b mo42261tl(o70.C6252b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42057do((o70) bVar.mo43381ab());
            return this;
        }

        /* renamed from: uf */
        public d94 mo42122uf() {
            return ((ou3) this.f34068b).mo42122uf();
        }

        /* renamed from: ui */
        public boolean mo42123ui() {
            return ((ou3) this.f34068b).mo42123ui();
        }

        /* renamed from: uk */
        public C6307b mo42262uk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42137ym();
            return this;
        }

        /* renamed from: ul */
        public C6307b mo42263ul(o70 o70) {
            mo43393xj();
            ((ou3) this.f34068b).mo42057do(o70);
            return this;
        }

        /* renamed from: vk */
        public C6307b mo42264vk() {
            mo43393xj();
            ((ou3) this.f34068b).mo42140zm();
            return this;
        }

        /* renamed from: vl */
        public C6307b mo42265vl(n80.C6178b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42061eo((n80) bVar.mo43381ab());
            return this;
        }

        /* renamed from: w */
        public String mo42130w() {
            return ((ou3) this.f34068b).mo42130w();
        }

        /* renamed from: wk */
        public C6307b mo42266wk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41971Am();
            return this;
        }

        /* renamed from: wl */
        public C6307b mo42267wl(n80 n80) {
            mo43393xj();
            ((ou3) this.f34068b).mo42061eo(n80);
            return this;
        }

        /* renamed from: xk */
        public C6307b mo42268xk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41975Bm();
            return this;
        }

        /* renamed from: xl */
        public C6307b mo42269xl(vn0.C7064b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42065fo((vn0) bVar.mo43381ab());
            return this;
        }

        /* renamed from: yk */
        public C6307b mo42270yk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41978Cm();
            return this;
        }

        /* renamed from: yl */
        public C6307b mo42271yl(vn0 vn0) {
            mo43393xj();
            ((ou3) this.f34068b).mo42065fo(vn0);
            return this;
        }

        /* renamed from: zk */
        public C6307b mo42272zk() {
            mo43393xj();
            ((ou3) this.f34068b).mo41979Dm();
            return this;
        }

        /* renamed from: zl */
        public C6307b mo42273zl(int i, ku0.C5939b bVar) {
            mo43393xj();
            ((ou3) this.f34068b).mo42070go(i, (ku0) bVar.mo43381ab());
            return this;
        }
    }

    static {
        ou3 ou3 = new ou3();
        DEFAULT_INSTANCE = ou3;
        qe1.m62492dk(ou3.class, ou3);
    }

    /* renamed from: Cn */
    public static C6307b m59653Cn() {
        return (C6307b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Dn */
    public static C6307b m59656Dn(ou3 ou3) {
        return (C6307b) DEFAULT_INSTANCE.mo43358gj(ou3);
    }

    /* renamed from: En */
    public static ou3 m59659En(InputStream inputStream) throws IOException {
        return (ou3) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Fn */
    public static ou3 m59662Fn(InputStream inputStream, zy0 zy0) throws IOException {
        return (ou3) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Gn */
    public static ou3 m59665Gn(C5173er erVar) throws nt1 {
        return (ou3) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Hn */
    public static ou3 m59668Hn(C5173er erVar, zy0 zy0) throws nt1 {
        return (ou3) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: In */
    public static ou3 m59671In(g00 g00) throws IOException {
        return (ou3) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Jn */
    public static ou3 m59674Jn(g00 g00, zy0 zy0) throws IOException {
        return (ou3) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Kn */
    public static ou3 m59677Kn(InputStream inputStream) throws IOException {
        return (ou3) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ln */
    public static ou3 m59680Ln(InputStream inputStream, zy0 zy0) throws IOException {
        return (ou3) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Mn */
    public static ou3 m59683Mn(ByteBuffer byteBuffer) throws nt1 {
        return (ou3) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Nn */
    public static ou3 m59686Nn(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ou3) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: On */
    public static ou3 m59689On(byte[] bArr) throws nt1 {
        return (ou3) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Pn */
    public static ou3 m59692Pn(byte[] bArr, zy0 zy0) throws nt1 {
        return (ou3) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Qn */
    public static cz2<ou3> m59695Qn() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: bn */
    public static ou3 m59714bn() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A9 */
    public boolean mo41969A9() {
        return this.configVersion_ != null;
    }

    /* renamed from: Af */
    public boolean mo41970Af() {
        return this.authentication_ != null;
    }

    /* renamed from: Am */
    public final void mo41971Am() {
        this.documentation_ = null;
    }

    /* renamed from: An */
    public final void mo41972An(d94 d94) {
        d94.getClass();
        d94 d942 = this.systemParameters_;
        if (!(d942 == null || d942 == d94.m44872rk())) {
            d94 = (d94) ((d94.C4991b) d94.m44874vk(this.systemParameters_).mo43372Cj(d94)).mo43377Ja();
        }
        this.systemParameters_ = d94;
    }

    /* renamed from: Ao */
    public final void mo41973Ao(pp4 pp4) {
        pp4.getClass();
        this.usage_ = pp4;
    }

    /* renamed from: Bc */
    public int mo41974Bc() {
        return this.types_.size();
    }

    /* renamed from: Bm */
    public final void mo41975Bm() {
        this.endpoints_ = qe1.m62499pj();
    }

    /* renamed from: Bn */
    public final void mo41976Bn(pp4 pp4) {
        pp4.getClass();
        pp4 pp42 = this.usage_;
        if (!(pp42 == null || pp42 == pp4.m61539Fk())) {
            pp4 = (pp4) ((pp4.C6469b) pp4.m61541Jk(this.usage_).mo43372Cj(pp4)).mo43377Ja();
        }
        this.usage_ = pp4;
    }

    /* renamed from: C2 */
    public boolean mo41977C2() {
        return this.context_ != null;
    }

    /* renamed from: Cm */
    public final void mo41978Cm() {
        this.enums_ = qe1.m62499pj();
    }

    /* renamed from: Dm */
    public final void mo41979Dm() {
        this.http_ = null;
    }

    /* renamed from: E */
    public C5173er mo41980E() {
        return C5173er.m47136w(this.id_);
    }

    /* renamed from: Em */
    public final void mo41981Em() {
        this.id_ = m59714bn().mo42130w();
    }

    /* renamed from: Fe */
    public jk2 mo41982Fe(int i) {
        return this.monitoredResources_.get(i);
    }

    /* renamed from: Fm */
    public final void mo41983Fm() {
        this.logging_ = null;
    }

    /* renamed from: G2 */
    public yu0 mo41984G2(int i) {
        return this.enums_.get(i);
    }

    /* renamed from: Gh */
    public boolean mo41985Gh() {
        return this.backend_ != null;
    }

    /* renamed from: Gm */
    public final void mo41986Gm() {
        this.logs_ = qe1.m62499pj();
    }

    /* renamed from: Hd */
    public C6937u7 mo41987Hd(int i) {
        return this.apis_.get(i);
    }

    /* renamed from: Hm */
    public final void mo41988Hm() {
        this.metrics_ = qe1.m62499pj();
    }

    /* renamed from: Im */
    public final void mo41989Im() {
        this.monitoredResources_ = qe1.m62499pj();
    }

    /* renamed from: Jm */
    public final void mo41990Jm() {
        this.monitoring_ = null;
    }

    /* renamed from: Kh */
    public boolean mo41991Kh() {
        return this.logging_ != null;
    }

    /* renamed from: Km */
    public final void mo41992Km() {
        this.name_ = m59714bn().getName();
    }

    /* renamed from: L2 */
    public n80 mo41993L2() {
        n80 n80 = this.control_;
        return n80 == null ? n80.m57973kk() : n80;
    }

    /* renamed from: Lm */
    public final void mo41994Lm() {
        this.producerProjectId_ = m59714bn().mo42113s3();
    }

    /* renamed from: M */
    public List<ti2> mo41995M() {
        return this.metrics_;
    }

    /* renamed from: Mh */
    public ga3 mo41996Mh() {
        ga3 ga3 = this.quota_;
        return ga3 == null ? ga3.m49219Ck() : ga3;
    }

    /* renamed from: Mi */
    public boolean mo41997Mi() {
        return this.systemParameters_ != null;
    }

    /* renamed from: Mm */
    public final void mo41998Mm() {
        this.quota_ = null;
    }

    /* renamed from: Nm */
    public final void mo41999Nm() {
        this.sourceInfo_ = null;
    }

    /* renamed from: Om */
    public final void mo42000Om() {
        this.systemParameters_ = null;
    }

    /* renamed from: P3 */
    public zl1 mo42001P3() {
        zl1 zl1 = this.http_;
        return zl1 == null ? zl1.m73953uk() : zl1;
    }

    /* renamed from: Pm */
    public final void mo42002Pm() {
        this.title_ = m59714bn().mo42005R1();
    }

    /* renamed from: Qf */
    public int mo42003Qf() {
        return this.endpoints_.size();
    }

    /* renamed from: Qm */
    public final void mo42004Qm() {
        this.types_ = qe1.m62499pj();
    }

    /* renamed from: R1 */
    public String mo42005R1() {
        return this.title_;
    }

    /* renamed from: Rm */
    public final void mo42006Rm() {
        this.usage_ = null;
    }

    /* renamed from: Rn */
    public final void mo42007Rn(int i) {
        mo42010Sm();
        this.apis_.remove(i);
    }

    /* renamed from: Sf */
    public boolean mo42008Sf() {
        return this.usage_ != null;
    }

    /* renamed from: Sh */
    public List<jk2> mo42009Sh() {
        return this.monitoredResources_;
    }

    /* renamed from: Sm */
    public final void mo42010Sm() {
        vs1.C7095k<C6937u7> kVar = this.apis_;
        if (!kVar.mo36500p()) {
            this.apis_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Sn */
    public final void mo42011Sn(int i) {
        mo42014Tm();
        this.endpoints_.remove(i);
    }

    /* renamed from: Ta */
    public ku0 mo42012Ta(int i) {
        return this.endpoints_.get(i);
    }

    /* renamed from: Ti */
    public C5173er mo42013Ti() {
        return C5173er.m47136w(this.producerProjectId_);
    }

    /* renamed from: Tm */
    public final void mo42014Tm() {
        vs1.C7095k<ku0> kVar = this.endpoints_;
        if (!kVar.mo36500p()) {
            this.endpoints_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Tn */
    public final void mo42015Tn(int i) {
        mo42016Um();
        this.enums_.remove(i);
    }

    /* renamed from: Um */
    public final void mo42016Um() {
        vs1.C7095k<yu0> kVar = this.enums_;
        if (!kVar.mo36500p()) {
            this.enums_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Un */
    public final void mo42017Un(int i) {
        mo42019Vm();
        this.logs_.remove(i);
    }

    /* renamed from: V1 */
    public List<x82> mo42018V1() {
        return this.logs_;
    }

    /* renamed from: Vm */
    public final void mo42019Vm() {
        vs1.C7095k<x82> kVar = this.logs_;
        if (!kVar.mo36500p()) {
            this.logs_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Vn */
    public final void mo42020Vn(int i) {
        mo42023Wm();
        this.metrics_.remove(i);
    }

    /* renamed from: W1 */
    public C5173er mo42021W1() {
        return C5173er.m47136w(this.title_);
    }

    /* renamed from: W5 */
    public int mo42022W5() {
        return this.monitoredResources_.size();
    }

    /* renamed from: Wm */
    public final void mo42023Wm() {
        vs1.C7095k<ti2> kVar = this.metrics_;
        if (!kVar.mo36500p()) {
            this.metrics_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Wn */
    public final void mo42024Wn(int i) {
        mo42026Xm();
        this.monitoredResources_.remove(i);
    }

    /* renamed from: X2 */
    public o70 mo42025X2() {
        o70 o70 = this.context_;
        return o70 == null ? o70.m59052rk() : o70;
    }

    /* renamed from: Xm */
    public final void mo42026Xm() {
        vs1.C7095k<jk2> kVar = this.monitoredResources_;
        if (!kVar.mo36500p()) {
            this.monitoredResources_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Xn */
    public final void mo42027Xn(int i) {
        mo42032Ym();
        this.types_.remove(i);
    }

    /* renamed from: Yc */
    public jl4 mo42028Yc() {
        jl4 jl4 = this.configVersion_;
        return jl4 == null ? jl4.m53601jk() : jl4;
    }

    /* renamed from: Ye */
    public boolean mo42029Ye() {
        return this.http_ != null;
    }

    /* renamed from: Yh */
    public x82 mo42030Yh(int i) {
        return this.logs_.get(i);
    }

    /* renamed from: Yl */
    public final void mo42031Yl(Iterable<? extends C6937u7> iterable) {
        mo42010Sm();
        C7403z0.m72412X6(iterable, this.apis_);
    }

    /* renamed from: Ym */
    public final void mo42032Ym() {
        vs1.C7095k<bj4> kVar = this.types_;
        if (!kVar.mo36500p()) {
            this.types_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Yn */
    public final void mo42033Yn(int i, C6937u7 u7Var) {
        u7Var.getClass();
        mo42010Sm();
        this.apis_.set(i, u7Var);
    }

    /* renamed from: Z2 */
    public bj4 mo42034Z2(int i) {
        return this.types_.get(i);
    }

    /* renamed from: Z9 */
    public q92 mo42035Z9() {
        q92 q92 = this.logging_;
        return q92 == null ? q92.m62179Ek() : q92;
    }

    /* renamed from: Zl */
    public final void mo42036Zl(Iterable<? extends ku0> iterable) {
        mo42014Tm();
        C7403z0.m72412X6(iterable, this.endpoints_);
    }

    /* renamed from: Zm */
    public C7309y7 mo42037Zm(int i) {
        return this.apis_.get(i);
    }

    /* renamed from: Zn */
    public final void mo42038Zn(C6528qc qcVar) {
        qcVar.getClass();
        this.authentication_ = qcVar;
    }

    /* renamed from: a */
    public C5173er mo42039a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: am */
    public final void mo42040am(Iterable<? extends yu0> iterable) {
        mo42016Um();
        C7403z0.m72412X6(iterable, this.enums_);
    }

    /* renamed from: an */
    public List<? extends C7309y7> mo42041an() {
        return this.apis_;
    }

    /* renamed from: ao */
    public final void mo42042ao(C5153ei eiVar) {
        eiVar.getClass();
        this.backend_ = eiVar;
    }

    /* renamed from: b2 */
    public int mo42043b2() {
        return this.logs_.size();
    }

    /* renamed from: bm */
    public final void mo42044bm(Iterable<? extends x82> iterable) {
        mo42019Vm();
        C7403z0.m72412X6(iterable, this.logs_);
    }

    /* renamed from: bo */
    public final void mo42045bo(C6583qk qkVar) {
        qkVar.getClass();
        this.billing_ = qkVar;
    }

    /* renamed from: c0 */
    public int mo42046c0() {
        return this.metrics_.size();
    }

    /* renamed from: c4 */
    public C6583qk mo42047c4() {
        C6583qk qkVar = this.billing_;
        return qkVar == null ? C6583qk.m62902tk() : qkVar;
    }

    /* renamed from: c6 */
    public boolean mo42048c6() {
        return this.sourceInfo_ != null;
    }

    /* renamed from: ca */
    public List<yu0> mo42049ca() {
        return this.enums_;
    }

    /* renamed from: cm */
    public final void mo42050cm(Iterable<? extends ti2> iterable) {
        mo42023Wm();
        C7403z0.m72412X6(iterable, this.metrics_);
    }

    /* renamed from: cn */
    public lu0 mo42051cn(int i) {
        return this.endpoints_.get(i);
    }

    /* renamed from: co */
    public final void mo42052co(jl4 jl4) {
        jl4.getClass();
        this.configVersion_ = jl4;
    }

    /* renamed from: da */
    public boolean mo42053da() {
        return this.documentation_ != null;
    }

    /* renamed from: de */
    public boolean mo42054de() {
        return this.quota_ != null;
    }

    /* renamed from: dm */
    public final void mo42055dm(Iterable<? extends jk2> iterable) {
        mo42026Xm();
        C7403z0.m72412X6(iterable, this.monitoredResources_);
    }

    /* renamed from: dn */
    public List<? extends lu0> mo42056dn() {
        return this.endpoints_;
    }

    /* renamed from: do */
    public final void mo42057do(o70 o70) {
        o70.getClass();
        this.context_ = o70;
    }

    /* renamed from: e6 */
    public boolean mo42058e6() {
        return this.control_ != null;
    }

    /* renamed from: em */
    public final void mo42059em(Iterable<? extends bj4> iterable) {
        mo42032Ym();
        C7403z0.m72412X6(iterable, this.types_);
    }

    /* renamed from: en */
    public av0 mo42060en(int i) {
        return this.enums_.get(i);
    }

    /* renamed from: eo */
    public final void mo42061eo(n80 n80) {
        n80.getClass();
        this.control_ = n80;
    }

    /* renamed from: fd */
    public int mo42062fd() {
        return this.apis_.size();
    }

    /* renamed from: fm */
    public final void mo42063fm(int i, C6937u7 u7Var) {
        u7Var.getClass();
        mo42010Sm();
        this.apis_.add(i, u7Var);
    }

    /* renamed from: fn */
    public List<? extends av0> mo42064fn() {
        return this.enums_;
    }

    /* renamed from: fo */
    public final void mo42065fo(vn0 vn0) {
        vn0.getClass();
        this.documentation_ = vn0;
    }

    /* renamed from: gc */
    public pk2 mo42066gc() {
        pk2 pk2 = this.monitoring_;
        return pk2 == null ? pk2.m61192Ek() : pk2;
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: gm */
    public final void mo42068gm(C6937u7 u7Var) {
        u7Var.getClass();
        mo42010Sm();
        this.apis_.add(u7Var);
    }

    /* renamed from: gn */
    public y82 mo42069gn(int i) {
        return this.logs_.get(i);
    }

    /* renamed from: go */
    public final void mo42070go(int i, ku0 ku0) {
        ku0.getClass();
        mo42014Tm();
        this.endpoints_.set(i, ku0);
    }

    /* renamed from: hd */
    public List<ku0> mo42071hd() {
        return this.endpoints_;
    }

    /* renamed from: he */
    public List<bj4> mo42072he() {
        return this.types_;
    }

    /* renamed from: hm */
    public final void mo42073hm(int i, ku0 ku0) {
        ku0.getClass();
        mo42014Tm();
        this.endpoints_.add(i, ku0);
    }

    /* renamed from: hn */
    public List<? extends y82> mo42074hn() {
        return this.logs_;
    }

    /* renamed from: ho */
    public final void mo42075ho(int i, yu0 yu0) {
        yu0.getClass();
        mo42016Um();
        this.enums_.set(i, yu0);
    }

    /* renamed from: im */
    public final void mo42076im(ku0 ku0) {
        ku0.getClass();
        mo42014Tm();
        this.endpoints_.add(ku0);
    }

    /* renamed from: in */
    public ui2 mo42077in(int i) {
        return this.metrics_.get(i);
    }

    /* renamed from: io */
    public final void mo42078io(zl1 zl1) {
        zl1.getClass();
        this.http_ = zl1;
    }

    /* renamed from: j9 */
    public List<C6937u7> mo42079j9() {
        return this.apis_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6306a.f33186a[iVar.ordinal()]) {
            case 1:
                return new ou3();
            case 2:
                return new C6307b((C6306a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", C6937u7.class, "types_", bj4.class, "enums_", yu0.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", ku0.class, "configVersion_", "control_", "producerProjectId_", "logs_", x82.class, "metrics_", ti2.class, "monitoredResources_", jk2.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ou3> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ou3.class) {
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

    /* renamed from: jm */
    public final void mo42080jm(int i, yu0 yu0) {
        yu0.getClass();
        mo42016Um();
        this.enums_.add(i, yu0);
    }

    /* renamed from: jn */
    public List<? extends ui2> mo42081jn() {
        return this.metrics_;
    }

    /* renamed from: jo */
    public final void mo42082jo(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* renamed from: ke */
    public int mo42083ke() {
        return this.enums_.size();
    }

    /* renamed from: km */
    public final void mo42084km(yu0 yu0) {
        yu0.getClass();
        mo42016Um();
        this.enums_.add(yu0);
    }

    /* renamed from: kn */
    public kk2 mo42085kn(int i) {
        return this.monitoredResources_.get(i);
    }

    /* renamed from: ko */
    public final void mo42086ko(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.id_ = erVar.mo35543k0();
    }

    /* renamed from: l4 */
    public boolean mo42087l4() {
        return this.billing_ != null;
    }

    /* renamed from: lm */
    public final void mo42088lm(int i, x82 x82) {
        x82.getClass();
        mo42019Vm();
        this.logs_.add(i, x82);
    }

    /* renamed from: ln */
    public List<? extends kk2> mo42089ln() {
        return this.monitoredResources_;
    }

    /* renamed from: lo */
    public final void mo42090lo(q92 q92) {
        q92.getClass();
        this.logging_ = q92;
    }

    /* renamed from: m7 */
    public ti2 mo42091m7(int i) {
        return this.metrics_.get(i);
    }

    /* renamed from: mm */
    public final void mo42092mm(x82 x82) {
        x82.getClass();
        mo42019Vm();
        this.logs_.add(x82);
    }

    /* renamed from: mn */
    public nj4 mo42093mn(int i) {
        return this.types_.get(i);
    }

    /* renamed from: mo */
    public final void mo42094mo(int i, x82 x82) {
        x82.getClass();
        mo42019Vm();
        this.logs_.set(i, x82);
    }

    /* renamed from: n9 */
    public pp4 mo42095n9() {
        pp4 pp4 = this.usage_;
        return pp4 == null ? pp4.m61539Fk() : pp4;
    }

    /* renamed from: nm */
    public final void mo42096nm(int i, ti2 ti2) {
        ti2.getClass();
        mo42023Wm();
        this.metrics_.add(i, ti2);
    }

    /* renamed from: nn */
    public List<? extends nj4> mo42097nn() {
        return this.types_;
    }

    /* renamed from: no */
    public final void mo42098no(int i, ti2 ti2) {
        ti2.getClass();
        mo42023Wm();
        this.metrics_.set(i, ti2);
    }

    /* renamed from: om */
    public final void mo42099om(ti2 ti2) {
        ti2.getClass();
        mo42023Wm();
        this.metrics_.add(ti2);
    }

    /* renamed from: on */
    public final void mo42100on(C6528qc qcVar) {
        qcVar.getClass();
        C6528qc qcVar2 = this.authentication_;
        if (!(qcVar2 == null || qcVar2 == C6528qc.m62372Ck())) {
            qcVar = (C6528qc) ((C6528qc.C6530b) C6528qc.m62374Ik(this.authentication_).mo43372Cj(qcVar)).mo43377Ja();
        }
        this.authentication_ = qcVar;
    }

    /* renamed from: oo */
    public final void mo42101oo(int i, jk2 jk2) {
        jk2.getClass();
        mo42026Xm();
        this.monitoredResources_.set(i, jk2);
    }

    /* renamed from: pm */
    public final void mo42102pm(int i, jk2 jk2) {
        jk2.getClass();
        mo42026Xm();
        this.monitoredResources_.add(i, jk2);
    }

    /* renamed from: pn */
    public final void mo42103pn(C5153ei eiVar) {
        eiVar.getClass();
        C5153ei eiVar2 = this.backend_;
        if (!(eiVar2 == null || eiVar2 == C5153ei.m46857rk())) {
            eiVar = (C5153ei) ((C5153ei.C5155b) C5153ei.m46859vk(this.backend_).mo43372Cj(eiVar)).mo43377Ja();
        }
        this.backend_ = eiVar;
    }

    /* renamed from: po */
    public final void mo42104po(pk2 pk2) {
        pk2.getClass();
        this.monitoring_ = pk2;
    }

    /* renamed from: qm */
    public final void mo42105qm(jk2 jk2) {
        jk2.getClass();
        mo42026Xm();
        this.monitoredResources_.add(jk2);
    }

    /* renamed from: qn */
    public final void mo42106qn(C6583qk qkVar) {
        qkVar.getClass();
        C6583qk qkVar2 = this.billing_;
        if (!(qkVar2 == null || qkVar2 == C6583qk.m62902tk())) {
            qkVar = (C6583qk) ((C6583qk.C6588d) C6583qk.m62904vk(this.billing_).mo43372Cj(qkVar)).mo43377Ja();
        }
        this.billing_ = qkVar;
    }

    /* renamed from: qo */
    public final void mo42107qo(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: r4 */
    public d14 mo42108r4() {
        d14 d14 = this.sourceInfo_;
        return d14 == null ? d14.m44540rk() : d14;
    }

    /* renamed from: rh */
    public C6528qc mo42109rh() {
        C6528qc qcVar = this.authentication_;
        return qcVar == null ? C6528qc.m62372Ck() : qcVar;
    }

    /* renamed from: rm */
    public final void mo42110rm(int i, bj4 bj4) {
        bj4.getClass();
        mo42032Ym();
        this.types_.add(i, bj4);
    }

    /* renamed from: rn */
    public final void mo42111rn(jl4 jl4) {
        jl4.getClass();
        jl4 jl42 = this.configVersion_;
        if (!(jl42 == null || jl42 == jl4.m53601jk())) {
            jl4 = (jl4) ((jl4.C5832b) jl4.m53603lk(this.configVersion_).mo43372Cj(jl4)).mo43377Ja();
        }
        this.configVersion_ = jl4;
    }

    /* renamed from: ro */
    public final void mo42112ro(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: s3 */
    public String mo42113s3() {
        return this.producerProjectId_;
    }

    /* renamed from: sm */
    public final void mo42114sm(bj4 bj4) {
        bj4.getClass();
        mo42032Ym();
        this.types_.add(bj4);
    }

    /* renamed from: sn */
    public final void mo42115sn(o70 o70) {
        o70.getClass();
        o70 o702 = this.context_;
        if (!(o702 == null || o702 == o70.m59052rk())) {
            o70 = (o70) ((o70.C6252b) o70.m59054vk(this.context_).mo43372Cj(o70)).mo43377Ja();
        }
        this.context_ = o70;
    }

    /* renamed from: so */
    public final void mo42116so(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* renamed from: t8 */
    public vn0 mo42117t8() {
        vn0 vn0 = this.documentation_;
        return vn0 == null ? vn0.m68242Ok() : vn0;
    }

    /* renamed from: tb */
    public C5153ei mo42118tb() {
        C5153ei eiVar = this.backend_;
        return eiVar == null ? C5153ei.m46857rk() : eiVar;
    }

    /* renamed from: tm */
    public final void mo42119tm() {
        this.apis_ = qe1.m62499pj();
    }

    /* renamed from: tn */
    public final void mo42120tn(n80 n80) {
        n80.getClass();
        n80 n802 = this.control_;
        if (!(n802 == null || n802 == n80.m57973kk())) {
            n80 = (n80) ((n80.C6178b) n80.m57975mk(this.control_).mo43372Cj(n80)).mo43377Ja();
        }
        this.control_ = n80;
    }

    /* renamed from: to */
    public final void mo42121to(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.producerProjectId_ = erVar.mo35543k0();
    }

    /* renamed from: uf */
    public d94 mo42122uf() {
        d94 d94 = this.systemParameters_;
        return d94 == null ? d94.m44872rk() : d94;
    }

    /* renamed from: ui */
    public boolean mo42123ui() {
        return this.monitoring_ != null;
    }

    /* renamed from: um */
    public final void mo42124um() {
        this.authentication_ = null;
    }

    /* renamed from: un */
    public final void mo42125un(vn0 vn0) {
        vn0.getClass();
        vn0 vn02 = this.documentation_;
        if (!(vn02 == null || vn02 == vn0.m68242Ok())) {
            vn0 = (vn0) ((vn0.C7064b) vn0.m68244Uk(this.documentation_).mo43372Cj(vn0)).mo43377Ja();
        }
        this.documentation_ = vn0;
    }

    /* renamed from: uo */
    public final void mo42126uo(ga3 ga3) {
        ga3.getClass();
        this.quota_ = ga3;
    }

    /* renamed from: vm */
    public final void mo42127vm() {
        this.backend_ = null;
    }

    /* renamed from: vn */
    public final void mo42128vn(zl1 zl1) {
        zl1.getClass();
        zl1 zl12 = this.http_;
        if (!(zl12 == null || zl12 == zl1.m73953uk())) {
            zl1 = (zl1) ((zl1.C7501b) zl1.m73955yk(this.http_).mo43372Cj(zl1)).mo43377Ja();
        }
        this.http_ = zl1;
    }

    /* renamed from: vo */
    public final void mo42129vo(d14 d14) {
        d14.getClass();
        this.sourceInfo_ = d14;
    }

    /* renamed from: w */
    public String mo42130w() {
        return this.id_;
    }

    /* renamed from: wm */
    public final void mo42131wm() {
        this.billing_ = null;
    }

    /* renamed from: wn */
    public final void mo42132wn(q92 q92) {
        q92.getClass();
        q92 q922 = this.logging_;
        if (!(q922 == null || q922 == q92.m62179Ek())) {
            q92 = (q92) ((q92.C6520b) q92.m62181Ik(this.logging_).mo43372Cj(q92)).mo43377Ja();
        }
        this.logging_ = q92;
    }

    /* renamed from: wo */
    public final void mo42133wo(d94 d94) {
        d94.getClass();
        this.systemParameters_ = d94;
    }

    /* renamed from: xm */
    public final void mo42134xm() {
        this.configVersion_ = null;
    }

    /* renamed from: xn */
    public final void mo42135xn(pk2 pk2) {
        pk2.getClass();
        pk2 pk22 = this.monitoring_;
        if (!(pk22 == null || pk22 == pk2.m61192Ek())) {
            pk2 = (pk2) ((pk2.C6454b) pk2.m61194Ik(this.monitoring_).mo43372Cj(pk2)).mo43377Ja();
        }
        this.monitoring_ = pk2;
    }

    /* renamed from: xo */
    public final void mo42136xo(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* renamed from: ym */
    public final void mo42137ym() {
        this.context_ = null;
    }

    /* renamed from: yn */
    public final void mo42138yn(ga3 ga3) {
        ga3.getClass();
        ga3 ga32 = this.quota_;
        if (!(ga32 == null || ga32 == ga3.m49219Ck())) {
            ga3 = (ga3) ((ga3.C5402b) ga3.m49221Ik(this.quota_).mo43372Cj(ga3)).mo43377Ja();
        }
        this.quota_ = ga3;
    }

    /* renamed from: yo */
    public final void mo42139yo(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.title_ = erVar.mo35543k0();
    }

    /* renamed from: zm */
    public final void mo42140zm() {
        this.control_ = null;
    }

    /* renamed from: zn */
    public final void mo42141zn(d14 d14) {
        d14.getClass();
        d14 d142 = this.sourceInfo_;
        if (!(d142 == null || d142 == d14.m44540rk())) {
            d14 = (d14) ((d14.C4949b) d14.m44542vk(this.sourceInfo_).mo43372Cj(d14)).mo43377Ja();
        }
        this.sourceInfo_ = d14;
    }

    /* renamed from: zo */
    public final void mo42142zo(int i, bj4 bj4) {
        bj4.getClass();
        mo42032Ym();
        this.types_.set(i, bj4);
    }
}
