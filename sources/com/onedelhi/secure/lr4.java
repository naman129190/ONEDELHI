package com.onedelhi.secure;

import com.onedelhi.secure.i42;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.z54;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class lr4 extends qe1<lr4, C6047b> implements hs4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final lr4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile cz2<lr4> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* renamed from: com.onedelhi.secure.lr4$a */
    public static /* synthetic */ class C6046a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31803a;

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
                f31803a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31803a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lr4.C6046a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.lr4$b */
    public static final class C6047b extends qe1.C6546b<lr4, C6047b> implements hs4 {
        public C6047b() {
            super(lr4.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6047b(C6046a aVar) {
            this();
        }

        /* renamed from: B8 */
        public int mo37530B8() {
            return ((lr4) this.f34068b).mo37530B8();
        }

        /* renamed from: Ce */
        public C6048c mo37531Ce() {
            return ((lr4) this.f34068b).mo37531Ce();
        }

        /* renamed from: E7 */
        public boolean mo37532E7() {
            return ((lr4) this.f34068b).mo37532E7();
        }

        /* renamed from: Gj */
        public C6047b mo40236Gj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40233xk();
            return this;
        }

        /* renamed from: Hj */
        public C6047b mo40237Hj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40234yk();
            return this;
        }

        /* renamed from: Ie */
        public boolean mo37533Ie() {
            return ((lr4) this.f34068b).mo37533Ie();
        }

        /* renamed from: Ij */
        public C6047b mo40238Ij() {
            mo43393xj();
            ((lr4) this.f34068b).mo40235zk();
            return this;
        }

        /* renamed from: J9 */
        public z54 mo37534J9() {
            return ((lr4) this.f34068b).mo37534J9();
        }

        /* renamed from: Jj */
        public C6047b mo40239Jj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40219Ak();
            return this;
        }

        /* renamed from: Kj */
        public C6047b mo40240Kj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40220Bk();
            return this;
        }

        /* renamed from: L9 */
        public rs2 mo37535L9() {
            return ((lr4) this.f34068b).mo37535L9();
        }

        /* renamed from: Lj */
        public C6047b mo40241Lj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40221Ck();
            return this;
        }

        /* renamed from: Mj */
        public C6047b mo40242Mj() {
            mo43393xj();
            ((lr4) this.f34068b).mo40222Dk();
            return this;
        }

        /* renamed from: Nj */
        public C6047b mo40243Nj(i42 i42) {
            mo43393xj();
            ((lr4) this.f34068b).mo40223Fk(i42);
            return this;
        }

        /* renamed from: Oj */
        public C6047b mo40244Oj(z54 z54) {
            mo43393xj();
            ((lr4) this.f34068b).mo40224Gk(z54);
            return this;
        }

        /* renamed from: Pj */
        public C6047b mo40245Pj(boolean z) {
            mo43393xj();
            ((lr4) this.f34068b).mo40225Wk(z);
            return this;
        }

        /* renamed from: Q8 */
        public C5173er mo37536Q8() {
            return ((lr4) this.f34068b).mo37536Q8();
        }

        /* renamed from: Qj */
        public C6047b mo40246Qj(i42.C5662b bVar) {
            mo43393xj();
            ((lr4) this.f34068b).mo40226Xk((i42) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Rj */
        public C6047b mo40247Rj(i42 i42) {
            mo43393xj();
            ((lr4) this.f34068b).mo40226Xk(i42);
            return this;
        }

        /* renamed from: Sj */
        public C6047b mo40248Sj(rs2 rs2) {
            mo43393xj();
            ((lr4) this.f34068b).mo40227Yk(rs2);
            return this;
        }

        /* renamed from: Tj */
        public C6047b mo40249Tj(int i) {
            mo43393xj();
            ((lr4) this.f34068b).mo40228Zk(i);
            return this;
        }

        /* renamed from: U1 */
        public boolean mo37537U1() {
            return ((lr4) this.f34068b).mo37537U1();
        }

        /* renamed from: Uj */
        public C6047b mo40250Uj(double d) {
            mo43393xj();
            ((lr4) this.f34068b).mo40229al(d);
            return this;
        }

        /* renamed from: Vj */
        public C6047b mo40251Vj(String str) {
            mo43393xj();
            ((lr4) this.f34068b).mo40230bl(str);
            return this;
        }

        /* renamed from: Wa */
        public String mo37538Wa() {
            return ((lr4) this.f34068b).mo37538Wa();
        }

        /* renamed from: Wj */
        public C6047b mo40252Wj(C5173er erVar) {
            mo43393xj();
            ((lr4) this.f34068b).mo40231cl(erVar);
            return this;
        }

        /* renamed from: Xj */
        public C6047b mo40253Xj(z54.C7435b bVar) {
            mo43393xj();
            ((lr4) this.f34068b).mo40232dl((z54) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Yj */
        public C6047b mo40254Yj(z54 z54) {
            mo43393xj();
            ((lr4) this.f34068b).mo40232dl(z54);
            return this;
        }

        /* renamed from: a4 */
        public i42 mo37539a4() {
            return ((lr4) this.f34068b).mo37539a4();
        }

        /* renamed from: ac */
        public double mo37540ac() {
            return ((lr4) this.f34068b).mo37540ac();
        }

        /* renamed from: d8 */
        public boolean mo37541d8() {
            return ((lr4) this.f34068b).mo37541d8();
        }

        /* renamed from: jg */
        public boolean mo37542jg() {
            return ((lr4) this.f34068b).mo37542jg();
        }

        /* renamed from: m4 */
        public boolean mo37543m4() {
            return ((lr4) this.f34068b).mo37543m4();
        }

        /* renamed from: m5 */
        public boolean mo37544m5() {
            return ((lr4) this.f34068b).mo37544m5();
        }
    }

    /* renamed from: com.onedelhi.secure.lr4$c */
    public enum C6048c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        

        /* renamed from: n */
        public final int f31812n;

        /* access modifiers changed from: public */
        C6048c(int i) {
            this.f31812n = i;
        }

        /* renamed from: a */
        public static C6048c m56449a(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        /* renamed from: b */
        public static C6048c m56450b(int i) {
            return m56449a(i);
        }

        /* renamed from: j */
        public int mo40255j() {
            return this.f31812n;
        }
    }

    static {
        lr4 lr4 = new lr4();
        DEFAULT_INSTANCE = lr4;
        qe1.m62492dk(lr4.class, lr4);
    }

    /* renamed from: Ek */
    public static lr4 m56348Ek() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Hk */
    public static C6047b m56349Hk() {
        return (C6047b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ik */
    public static C6047b m56350Ik(lr4 lr4) {
        return (C6047b) DEFAULT_INSTANCE.mo43358gj(lr4);
    }

    /* renamed from: Jk */
    public static lr4 m56351Jk(InputStream inputStream) throws IOException {
        return (lr4) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static lr4 m56352Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (lr4) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static lr4 m56353Lk(C5173er erVar) throws nt1 {
        return (lr4) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Mk */
    public static lr4 m56354Mk(C5173er erVar, zy0 zy0) throws nt1 {
        return (lr4) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Nk */
    public static lr4 m56355Nk(g00 g00) throws IOException {
        return (lr4) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ok */
    public static lr4 m56356Ok(g00 g00, zy0 zy0) throws IOException {
        return (lr4) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Pk */
    public static lr4 m56357Pk(InputStream inputStream) throws IOException {
        return (lr4) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Qk */
    public static lr4 m56358Qk(InputStream inputStream, zy0 zy0) throws IOException {
        return (lr4) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Rk */
    public static lr4 m56359Rk(ByteBuffer byteBuffer) throws nt1 {
        return (lr4) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Sk */
    public static lr4 m56360Sk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (lr4) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Tk */
    public static lr4 m56361Tk(byte[] bArr) throws nt1 {
        return (lr4) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Uk */
    public static lr4 m56362Uk(byte[] bArr, zy0 zy0) throws nt1 {
        return (lr4) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Vk */
    public static cz2<lr4> m56363Vk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo40219Ak() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: B8 */
    public int mo37530B8() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    /* renamed from: Bk */
    public final void mo40220Bk() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: Ce */
    public C6048c mo37531Ce() {
        return C6048c.m56449a(this.kindCase_);
    }

    /* renamed from: Ck */
    public final void mo40221Ck() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: Dk */
    public final void mo40222Dk() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: E7 */
    public boolean mo37532E7() {
        return this.kindCase_ == 6;
    }

    /* renamed from: Fk */
    public final void mo40223Fk(i42 i42) {
        i42.getClass();
        zh2 zh2 = i42;
        if (this.kindCase_ == 6) {
            zh2 = i42;
            if (this.kind_ != i42.m51805rk()) {
                zh2 = ((i42.C5662b) i42.m51807vk((i42) this.kind_).mo43372Cj(i42)).mo43377Ja();
            }
        }
        this.kind_ = zh2;
        this.kindCase_ = 6;
    }

    /* renamed from: Gk */
    public final void mo40224Gk(z54 z54) {
        z54.getClass();
        zh2 zh2 = z54;
        if (this.kindCase_ == 5) {
            zh2 = z54;
            if (this.kind_ != z54.m72555hk()) {
                zh2 = ((z54.C7435b) z54.m72557mk((z54) this.kind_).mo43372Cj(z54)).mo43377Ja();
            }
        }
        this.kind_ = zh2;
        this.kindCase_ = 5;
    }

    /* renamed from: Ie */
    public boolean mo37533Ie() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    /* renamed from: J9 */
    public z54 mo37534J9() {
        return this.kindCase_ == 5 ? (z54) this.kind_ : z54.m72555hk();
    }

    /* renamed from: L9 */
    public rs2 mo37535L9() {
        if (this.kindCase_ != 1) {
            return rs2.NULL_VALUE;
        }
        rs2 a = rs2.m63825a(((Integer) this.kind_).intValue());
        return a == null ? rs2.UNRECOGNIZED : a;
    }

    /* renamed from: Q8 */
    public C5173er mo37536Q8() {
        return C5173er.m47136w(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    /* renamed from: U1 */
    public boolean mo37537U1() {
        return this.kindCase_ == 3;
    }

    /* renamed from: Wa */
    public String mo37538Wa() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    /* renamed from: Wk */
    public final void mo40225Wk(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* renamed from: Xk */
    public final void mo40226Xk(i42 i42) {
        i42.getClass();
        this.kind_ = i42;
        this.kindCase_ = 6;
    }

    /* renamed from: Yk */
    public final void mo40227Yk(rs2 rs2) {
        this.kind_ = Integer.valueOf(rs2.mo32392j());
        this.kindCase_ = 1;
    }

    /* renamed from: Zk */
    public final void mo40228Zk(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* renamed from: a4 */
    public i42 mo37539a4() {
        return this.kindCase_ == 6 ? (i42) this.kind_ : i42.m51805rk();
    }

    /* renamed from: ac */
    public double mo37540ac() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: al */
    public final void mo40229al(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* renamed from: bl */
    public final void mo40230bl(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* renamed from: cl */
    public final void mo40231cl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.kind_ = erVar.mo35543k0();
        this.kindCase_ = 3;
    }

    /* renamed from: d8 */
    public boolean mo37541d8() {
        return this.kindCase_ == 4;
    }

    /* renamed from: dl */
    public final void mo40232dl(z54 z54) {
        z54.getClass();
        this.kind_ = z54;
        this.kindCase_ = 5;
    }

    /* renamed from: jg */
    public boolean mo37542jg() {
        return this.kindCase_ == 2;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6046a.f31803a[iVar.ordinal()]) {
            case 1:
                return new lr4();
            case 2:
                return new C6047b((C6046a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", z54.class, i42.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<lr4> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (lr4.class) {
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

    /* renamed from: m4 */
    public boolean mo37543m4() {
        return this.kindCase_ == 1;
    }

    /* renamed from: m5 */
    public boolean mo37544m5() {
        return this.kindCase_ == 5;
    }

    /* renamed from: xk */
    public final void mo40233xk() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: yk */
    public final void mo40234yk() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* renamed from: zk */
    public final void mo40235zk() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }
}
