package com.onedelhi.secure;

import com.onedelhi.secure.pw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class q11 extends qe1<q11, C6494b> implements d21 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final q11 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile cz2<q11> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_ = "";
    private String jsonName_ = "";
    private int kind_;
    private String name_ = "";
    private int number_;
    private int oneofIndex_;
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();
    private boolean packed_;
    private String typeUrl_ = "";

    /* renamed from: com.onedelhi.secure.q11$a */
    public static /* synthetic */ class C6493a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33882a;

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
                f33882a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33882a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.q11.C6493a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.q11$b */
    public static final class C6494b extends qe1.C6546b<q11, C6494b> implements d21 {
        public C6494b() {
            super(q11.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6494b(C6493a aVar) {
            this();
        }

        /* renamed from: D0 */
        public String mo34132D0() {
            return ((q11) this.f34068b).mo34132D0();
        }

        /* renamed from: Ea */
        public C6498d mo34133Ea() {
            return ((q11) this.f34068b).mo34133Ea();
        }

        /* renamed from: Gj */
        public C6494b mo43040Gj(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((q11) this.f34068b).mo43014Kk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6494b mo43041Hj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43015Lk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6494b mo43042Ij(int i, pw2 pw2) {
            mo43393xj();
            ((q11) this.f34068b).mo43015Lk(i, pw2);
            return this;
        }

        /* renamed from: Jj */
        public C6494b mo43043Jj(pw2.C6483b bVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43016Mk((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: K4 */
        public int mo34134K4() {
            return ((q11) this.f34068b).mo34134K4();
        }

        /* renamed from: Kj */
        public C6494b mo43044Kj(pw2 pw2) {
            mo43393xj();
            ((q11) this.f34068b).mo43016Mk(pw2);
            return this;
        }

        /* renamed from: Lj */
        public C6494b mo43045Lj() {
            mo43393xj();
            ((q11) this.f34068b).mo43017Nk();
            return this;
        }

        /* renamed from: M0 */
        public int mo34135M0() {
            return ((q11) this.f34068b).mo34135M0();
        }

        /* renamed from: Mj */
        public C6494b mo43046Mj() {
            mo43393xj();
            ((q11) this.f34068b).mo43018Ok();
            return this;
        }

        /* renamed from: N0 */
        public C5173er mo34136N0() {
            return ((q11) this.f34068b).mo34136N0();
        }

        /* renamed from: Nj */
        public C6494b mo43047Nj() {
            mo43393xj();
            ((q11) this.f34068b).mo43019Pk();
            return this;
        }

        /* renamed from: Oj */
        public C6494b mo43048Oj() {
            mo43393xj();
            ((q11) this.f34068b).mo43020Qk();
            return this;
        }

        /* renamed from: Pj */
        public C6494b mo43049Pj() {
            mo43393xj();
            ((q11) this.f34068b).mo43021Rk();
            return this;
        }

        /* renamed from: Q1 */
        public C5173er mo34137Q1() {
            return ((q11) this.f34068b).mo34137Q1();
        }

        /* renamed from: Qj */
        public C6494b mo43050Qj() {
            mo43393xj();
            ((q11) this.f34068b).mo43022Sk();
            return this;
        }

        /* renamed from: Rj */
        public C6494b mo43051Rj() {
            mo43393xj();
            ((q11) this.f34068b).mo43023Tk();
            return this;
        }

        /* renamed from: Sj */
        public C6494b mo43052Sj() {
            mo43393xj();
            ((q11) this.f34068b).mo43024Uk();
            return this;
        }

        /* renamed from: Tj */
        public C6494b mo43053Tj() {
            mo43393xj();
            ((q11) this.f34068b).mo43025Vk();
            return this;
        }

        /* renamed from: Uj */
        public C6494b mo43054Uj() {
            mo43393xj();
            ((q11) this.f34068b).mo43026Wk();
            return this;
        }

        /* renamed from: Vj */
        public C6494b mo43055Vj(int i) {
            mo43393xj();
            ((q11) this.f34068b).mo43030ql(i);
            return this;
        }

        /* renamed from: Wj */
        public C6494b mo43056Wj(C6495c cVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43031rl(cVar);
            return this;
        }

        /* renamed from: X1 */
        public String mo34138X1() {
            return ((q11) this.f34068b).mo34138X1();
        }

        /* renamed from: Xj */
        public C6494b mo43057Xj(int i) {
            mo43393xj();
            ((q11) this.f34068b).mo43032sl(i);
            return this;
        }

        /* renamed from: Yj */
        public C6494b mo43058Yj(String str) {
            mo43393xj();
            ((q11) this.f34068b).mo43033tl(str);
            return this;
        }

        /* renamed from: Zj */
        public C6494b mo43059Zj(C5173er erVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43034ul(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo34139a() {
            return ((q11) this.f34068b).mo34139a();
        }

        /* renamed from: ak */
        public C6494b mo43060ak(String str) {
            mo43393xj();
            ((q11) this.f34068b).mo43035vl(str);
            return this;
        }

        /* renamed from: bk */
        public C6494b mo43061bk(C5173er erVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43036wl(erVar);
            return this;
        }

        /* renamed from: ck */
        public C6494b mo43062ck(C6498d dVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43037xl(dVar);
            return this;
        }

        /* renamed from: dk */
        public C6494b mo43063dk(int i) {
            mo43393xj();
            ((q11) this.f34068b).mo43038yl(i);
            return this;
        }

        /* renamed from: eg */
        public C6495c mo34140eg() {
            return ((q11) this.f34068b).mo34140eg();
        }

        /* renamed from: ek */
        public C6494b mo43064ek(String str) {
            mo43393xj();
            ((q11) this.f34068b).mo43039zl(str);
            return this;
        }

        /* renamed from: fk */
        public C6494b mo43065fk(C5173er erVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43007Al(erVar);
            return this;
        }

        /* renamed from: g2 */
        public C5173er mo34141g2() {
            return ((q11) this.f34068b).mo34141g2();
        }

        public String getName() {
            return ((q11) this.f34068b).getName();
        }

        /* renamed from: gk */
        public C6494b mo43066gk(int i) {
            mo43393xj();
            ((q11) this.f34068b).mo43008Bl(i);
            return this;
        }

        /* renamed from: hk */
        public C6494b mo43067hk(int i) {
            mo43393xj();
            ((q11) this.f34068b).mo43009Cl(i);
            return this;
        }

        /* renamed from: ik */
        public C6494b mo43068ik(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43010Dl(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: j */
        public int mo34143j() {
            return ((q11) this.f34068b).mo34143j();
        }

        /* renamed from: jk */
        public C6494b mo43069jk(int i, pw2 pw2) {
            mo43393xj();
            ((q11) this.f34068b).mo43010Dl(i, pw2);
            return this;
        }

        /* renamed from: k1 */
        public boolean mo34144k1() {
            return ((q11) this.f34068b).mo34144k1();
        }

        /* renamed from: kk */
        public C6494b mo43070kk(boolean z) {
            mo43393xj();
            ((q11) this.f34068b).mo43011El(z);
            return this;
        }

        /* renamed from: l1 */
        public String mo34145l1() {
            return ((q11) this.f34068b).mo34145l1();
        }

        /* renamed from: lk */
        public C6494b mo43071lk(String str) {
            mo43393xj();
            ((q11) this.f34068b).mo43012Fl(str);
            return this;
        }

        /* renamed from: mk */
        public C6494b mo43072mk(C5173er erVar) {
            mo43393xj();
            ((q11) this.f34068b).mo43013Gl(erVar);
            return this;
        }

        /* renamed from: s */
        public pw2 mo34146s(int i) {
            return ((q11) this.f34068b).mo34146s(i);
        }

        /* renamed from: t */
        public int mo34147t() {
            return ((q11) this.f34068b).mo34147t();
        }

        /* renamed from: u */
        public List<pw2> mo34148u() {
            return Collections.unmodifiableList(((q11) this.f34068b).mo34148u());
        }

        /* renamed from: ub */
        public int mo34149ub() {
            return ((q11) this.f34068b).mo34149ub();
        }
    }

    /* renamed from: com.onedelhi.secure.q11$c */
    public enum C6495c implements vs1.C7081c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public static final vs1.C7082d<C6495c> f33884a = null;

        /* renamed from: o */
        public static final int f33890o = 0;

        /* renamed from: p */
        public static final int f33891p = 1;

        /* renamed from: q */
        public static final int f33892q = 2;

        /* renamed from: r */
        public static final int f33893r = 3;

        /* renamed from: n */
        public final int f33894n;

        /* renamed from: com.onedelhi.secure.q11$c$a */
        public static class C6496a implements vs1.C7082d<C6495c> {
            /* renamed from: b */
            public C6495c mo32393a(int i) {
                return C6495c.m61962a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.q11$c$b */
        public static final class C6497b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f33895a = null;

            static {
                f33895a = new C6497b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6495c.m61962a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f33884a = new C6496a();
        }

        /* access modifiers changed from: public */
        C6495c(int i) {
            this.f33894n = i;
        }

        /* renamed from: a */
        public static C6495c m61962a(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        /* renamed from: b */
        public static vs1.C7082d<C6495c> m61963b() {
            return f33884a;
        }

        /* renamed from: e */
        public static vs1.C7083e m61964e() {
            return C6497b.f33895a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6495c m61965g(int i) {
            return m61962a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f33894n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.onedelhi.secure.q11$d */
    public enum C6498d implements vs1.C7081c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);
        

        /* renamed from: A */
        public static final int f33896A = 12;

        /* renamed from: B */
        public static final int f33897B = 13;

        /* renamed from: C */
        public static final int f33898C = 14;

        /* renamed from: D */
        public static final int f33899D = 15;

        /* renamed from: E */
        public static final int f33900E = 16;

        /* renamed from: F */
        public static final int f33901F = 17;

        /* renamed from: G */
        public static final int f33902G = 18;

        /* renamed from: a */
        public static final vs1.C7082d<C6498d> f33904a = null;

        /* renamed from: o */
        public static final int f33919o = 0;

        /* renamed from: p */
        public static final int f33921p = 1;

        /* renamed from: q */
        public static final int f33923q = 2;

        /* renamed from: r */
        public static final int f33925r = 3;

        /* renamed from: s */
        public static final int f33927s = 4;

        /* renamed from: t */
        public static final int f33929t = 5;

        /* renamed from: u */
        public static final int f33931u = 6;

        /* renamed from: v */
        public static final int f33932v = 7;

        /* renamed from: w */
        public static final int f33933w = 8;

        /* renamed from: x */
        public static final int f33934x = 9;

        /* renamed from: y */
        public static final int f33935y = 10;

        /* renamed from: z */
        public static final int f33936z = 11;

        /* renamed from: n */
        public final int f33937n;

        /* renamed from: com.onedelhi.secure.q11$d$a */
        public static class C6499a implements vs1.C7082d<C6498d> {
            /* renamed from: b */
            public C6498d mo32393a(int i) {
                return C6498d.m61970a(i);
            }
        }

        /* renamed from: com.onedelhi.secure.q11$d$b */
        public static final class C6500b implements vs1.C7083e {

            /* renamed from: a */
            public static final vs1.C7083e f33938a = null;

            static {
                f33938a = new C6500b();
            }

            /* renamed from: a */
            public boolean mo32395a(int i) {
                return C6498d.m61970a(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f33904a = new C6499a();
        }

        /* access modifiers changed from: public */
        C6498d(int i) {
            this.f33937n = i;
        }

        /* renamed from: a */
        public static C6498d m61970a(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static vs1.C7082d<C6498d> m61971b() {
            return f33904a;
        }

        /* renamed from: e */
        public static vs1.C7083e m61972e() {
            return C6500b.f33938a;
        }

        @Deprecated
        /* renamed from: g */
        public static C6498d m61973g(int i) {
            return m61970a(i);
        }

        /* renamed from: j */
        public final int mo32392j() {
            if (this != UNRECOGNIZED) {
                return this.f33937n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        q11 q11 = new q11();
        DEFAULT_INSTANCE = q11;
        qe1.m62492dk(q11.class, q11);
    }

    /* renamed from: Yk */
    public static q11 m61824Yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: bl */
    public static C6494b m61825bl() {
        return (C6494b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: cl */
    public static C6494b m61826cl(q11 q11) {
        return (C6494b) DEFAULT_INSTANCE.mo43358gj(q11);
    }

    /* renamed from: dl */
    public static q11 m61827dl(InputStream inputStream) throws IOException {
        return (q11) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: el */
    public static q11 m61828el(InputStream inputStream, zy0 zy0) throws IOException {
        return (q11) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: fl */
    public static q11 m61830fl(C5173er erVar) throws nt1 {
        return (q11) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: gl */
    public static q11 m61832gl(C5173er erVar, zy0 zy0) throws nt1 {
        return (q11) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: hl */
    public static q11 m61834hl(g00 g00) throws IOException {
        return (q11) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: il */
    public static q11 m61836il(g00 g00, zy0 zy0) throws IOException {
        return (q11) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: jl */
    public static q11 m61838jl(InputStream inputStream) throws IOException {
        return (q11) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: kl */
    public static q11 m61840kl(InputStream inputStream, zy0 zy0) throws IOException {
        return (q11) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ll */
    public static q11 m61842ll(ByteBuffer byteBuffer) throws nt1 {
        return (q11) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: ml */
    public static q11 m61844ml(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (q11) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: nl */
    public static q11 m61846nl(byte[] bArr) throws nt1 {
        return (q11) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: ol */
    public static q11 m61848ol(byte[] bArr, zy0 zy0) throws nt1 {
        return (q11) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: pl */
    public static cz2<q11> m61850pl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Al */
    public final void mo43007Al(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Bl */
    public final void mo43008Bl(int i) {
        this.number_ = i;
    }

    /* renamed from: Cl */
    public final void mo43009Cl(int i) {
        this.oneofIndex_ = i;
    }

    /* renamed from: D0 */
    public String mo34132D0() {
        return this.jsonName_;
    }

    /* renamed from: Dl */
    public final void mo43010Dl(int i, pw2 pw2) {
        pw2.getClass();
        mo43027Xk();
        this.options_.set(i, pw2);
    }

    /* renamed from: Ea */
    public C6498d mo34133Ea() {
        C6498d a = C6498d.m61970a(this.kind_);
        return a == null ? C6498d.UNRECOGNIZED : a;
    }

    /* renamed from: El */
    public final void mo43011El(boolean z) {
        this.packed_ = z;
    }

    /* renamed from: Fl */
    public final void mo43012Fl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Gl */
    public final void mo43013Gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.typeUrl_ = erVar.mo35543k0();
    }

    /* renamed from: K4 */
    public int mo34134K4() {
        return this.kind_;
    }

    /* renamed from: Kk */
    public final void mo43014Kk(Iterable<? extends pw2> iterable) {
        mo43027Xk();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: Lk */
    public final void mo43015Lk(int i, pw2 pw2) {
        pw2.getClass();
        mo43027Xk();
        this.options_.add(i, pw2);
    }

    /* renamed from: M0 */
    public int mo34135M0() {
        return this.oneofIndex_;
    }

    /* renamed from: Mk */
    public final void mo43016Mk(pw2 pw2) {
        pw2.getClass();
        mo43027Xk();
        this.options_.add(pw2);
    }

    /* renamed from: N0 */
    public C5173er mo34136N0() {
        return C5173er.m47136w(this.jsonName_);
    }

    /* renamed from: Nk */
    public final void mo43017Nk() {
        this.cardinality_ = 0;
    }

    /* renamed from: Ok */
    public final void mo43018Ok() {
        this.defaultValue_ = m61824Yk().mo34145l1();
    }

    /* renamed from: Pk */
    public final void mo43019Pk() {
        this.jsonName_ = m61824Yk().mo34132D0();
    }

    /* renamed from: Q1 */
    public C5173er mo34137Q1() {
        return C5173er.m47136w(this.typeUrl_);
    }

    /* renamed from: Qk */
    public final void mo43020Qk() {
        this.kind_ = 0;
    }

    /* renamed from: Rk */
    public final void mo43021Rk() {
        this.name_ = m61824Yk().getName();
    }

    /* renamed from: Sk */
    public final void mo43022Sk() {
        this.number_ = 0;
    }

    /* renamed from: Tk */
    public final void mo43023Tk() {
        this.oneofIndex_ = 0;
    }

    /* renamed from: Uk */
    public final void mo43024Uk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: Vk */
    public final void mo43025Vk() {
        this.packed_ = false;
    }

    /* renamed from: Wk */
    public final void mo43026Wk() {
        this.typeUrl_ = m61824Yk().mo34138X1();
    }

    /* renamed from: X1 */
    public String mo34138X1() {
        return this.typeUrl_;
    }

    /* renamed from: Xk */
    public final void mo43027Xk() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Zk */
    public qw2 mo43028Zk(int i) {
        return this.options_.get(i);
    }

    /* renamed from: a */
    public C5173er mo34139a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: al */
    public List<? extends qw2> mo43029al() {
        return this.options_;
    }

    /* renamed from: eg */
    public C6495c mo34140eg() {
        C6495c a = C6495c.m61962a(this.cardinality_);
        return a == null ? C6495c.UNRECOGNIZED : a;
    }

    /* renamed from: g2 */
    public C5173er mo34141g2() {
        return C5173er.m47136w(this.defaultValue_);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: j */
    public int mo34143j() {
        return this.number_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6493a.f33882a[iVar.ordinal()]) {
            case 1:
                return new q11();
            case 2:
                return new C6494b((C6493a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", pw2.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<q11> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (q11.class) {
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

    /* renamed from: k1 */
    public boolean mo34144k1() {
        return this.packed_;
    }

    /* renamed from: l1 */
    public String mo34145l1() {
        return this.defaultValue_;
    }

    /* renamed from: ql */
    public final void mo43030ql(int i) {
        mo43027Xk();
        this.options_.remove(i);
    }

    /* renamed from: rl */
    public final void mo43031rl(C6495c cVar) {
        this.cardinality_ = cVar.mo32392j();
    }

    /* renamed from: s */
    public pw2 mo34146s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: sl */
    public final void mo43032sl(int i) {
        this.cardinality_ = i;
    }

    /* renamed from: t */
    public int mo34147t() {
        return this.options_.size();
    }

    /* renamed from: tl */
    public final void mo43033tl(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* renamed from: u */
    public List<pw2> mo34148u() {
        return this.options_;
    }

    /* renamed from: ub */
    public int mo34149ub() {
        return this.cardinality_;
    }

    /* renamed from: ul */
    public final void mo43034ul(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.defaultValue_ = erVar.mo35543k0();
    }

    /* renamed from: vl */
    public final void mo43035vl(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* renamed from: wl */
    public final void mo43036wl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.jsonName_ = erVar.mo35543k0();
    }

    /* renamed from: xl */
    public final void mo43037xl(C6498d dVar) {
        this.kind_ = dVar.mo32392j();
    }

    /* renamed from: yl */
    public final void mo43038yl(int i) {
        this.kind_ = i;
    }

    /* renamed from: zl */
    public final void mo43039zl(String str) {
        str.getClass();
        this.name_ = str;
    }
}
