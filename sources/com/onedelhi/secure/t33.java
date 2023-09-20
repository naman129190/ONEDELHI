package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class t33 extends qe1<t33, C6835b> implements u33 {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final t33 DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile cz2<t33> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private vs1.C7095k<String> addressLines_ = qe1.m62499pj();
    private String administrativeArea_ = "";
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private vs1.C7095k<String> recipients_ = qe1.m62499pj();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    /* renamed from: com.onedelhi.secure.t33$a */
    public static /* synthetic */ class C6834a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35418a;

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
                f35418a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35418a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t33.C6834a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.t33$b */
    public static final class C6835b extends qe1.C6546b<t33, C6835b> implements u33 {
        public C6835b() {
            super(t33.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6835b(C6834a aVar) {
            this();
        }

        /* renamed from: D3 */
        public int mo44822D3() {
            return ((t33) this.f34068b).mo44822D3();
        }

        /* renamed from: Ec */
        public String mo44824Ec() {
            return ((t33) this.f34068b).mo44824Ec();
        }

        /* renamed from: Fd */
        public String mo44826Fd() {
            return ((t33) this.f34068b).mo44826Fd();
        }

        /* renamed from: Gj */
        public C6835b mo44882Gj(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44840Qk(str);
            return this;
        }

        /* renamed from: Hf */
        public C5173er mo44829Hf() {
            return ((t33) this.f34068b).mo44829Hf();
        }

        /* renamed from: Hj */
        public C6835b mo44883Hj(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44843Rk(erVar);
            return this;
        }

        /* renamed from: Ij */
        public C6835b mo44884Ij(Iterable<String> iterable) {
            mo43393xj();
            ((t33) this.f34068b).mo44846Sk(iterable);
            return this;
        }

        /* renamed from: Jj */
        public C6835b mo44885Jj(Iterable<String> iterable) {
            mo43393xj();
            ((t33) this.f34068b).mo44847Tk(iterable);
            return this;
        }

        /* renamed from: Kj */
        public C6835b mo44886Kj(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44848Uk(str);
            return this;
        }

        /* renamed from: Lj */
        public C6835b mo44887Lj(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44849Vk(erVar);
            return this;
        }

        /* renamed from: Mj */
        public C6835b mo44888Mj() {
            mo43393xj();
            ((t33) this.f34068b).mo44850Wk();
            return this;
        }

        /* renamed from: Nj */
        public C6835b mo44889Nj() {
            mo43393xj();
            ((t33) this.f34068b).mo44851Xk();
            return this;
        }

        /* renamed from: Oj */
        public C6835b mo44890Oj() {
            mo43393xj();
            ((t33) this.f34068b).mo44852Yk();
            return this;
        }

        /* renamed from: P6 */
        public List<String> mo44838P6() {
            return Collections.unmodifiableList(((t33) this.f34068b).mo44838P6());
        }

        /* renamed from: Pj */
        public C6835b mo44891Pj() {
            mo43393xj();
            ((t33) this.f34068b).mo44853Zk();
            return this;
        }

        /* renamed from: Qj */
        public C6835b mo44892Qj() {
            mo43393xj();
            ((t33) this.f34068b).mo44856al();
            return this;
        }

        /* renamed from: R2 */
        public int mo44842R2() {
            return ((t33) this.f34068b).mo44842R2();
        }

        /* renamed from: Rj */
        public C6835b mo44893Rj() {
            mo43393xj();
            ((t33) this.f34068b).mo44857bl();
            return this;
        }

        /* renamed from: S5 */
        public List<String> mo44845S5() {
            return Collections.unmodifiableList(((t33) this.f34068b).mo44845S5());
        }

        /* renamed from: Sj */
        public C6835b mo44894Sj() {
            mo43393xj();
            ((t33) this.f34068b).mo44859cl();
            return this;
        }

        /* renamed from: Tj */
        public C6835b mo44895Tj() {
            mo43393xj();
            ((t33) this.f34068b).mo44860dl();
            return this;
        }

        /* renamed from: Uj */
        public C6835b mo44896Uj() {
            mo43393xj();
            ((t33) this.f34068b).mo44861el();
            return this;
        }

        /* renamed from: Vj */
        public C6835b mo44897Vj() {
            mo43393xj();
            ((t33) this.f34068b).mo44862fl();
            return this;
        }

        /* renamed from: Wj */
        public C6835b mo44898Wj() {
            mo43393xj();
            ((t33) this.f34068b).mo44864gl();
            return this;
        }

        /* renamed from: Xj */
        public C6835b mo44899Xj(int i, String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44881zl(i, str);
            return this;
        }

        /* renamed from: Yj */
        public C6835b mo44900Yj(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44819Al(str);
            return this;
        }

        /* renamed from: Zj */
        public C6835b mo44901Zj(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44820Bl(erVar);
            return this;
        }

        /* renamed from: aa */
        public C5173er mo44854aa(int i) {
            return ((t33) this.f34068b).mo44854aa(i);
        }

        /* renamed from: ad */
        public String mo44855ad() {
            return ((t33) this.f34068b).mo44855ad();
        }

        /* renamed from: ak */
        public C6835b mo44902ak(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44821Cl(str);
            return this;
        }

        /* renamed from: bk */
        public C6835b mo44903bk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44823Dl(erVar);
            return this;
        }

        /* renamed from: c1 */
        public C5173er mo44858c1() {
            return ((t33) this.f34068b).mo44858c1();
        }

        /* renamed from: ck */
        public C6835b mo44904ck(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44825El(str);
            return this;
        }

        /* renamed from: dk */
        public C6835b mo44905dk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44827Fl(erVar);
            return this;
        }

        /* renamed from: ek */
        public C6835b mo44906ek(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44828Gl(str);
            return this;
        }

        /* renamed from: fk */
        public C6835b mo44907fk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44830Hl(erVar);
            return this;
        }

        /* renamed from: g1 */
        public String mo44863g1() {
            return ((t33) this.f34068b).mo44863g1();
        }

        /* renamed from: gk */
        public C6835b mo44908gk(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44831Il(str);
            return this;
        }

        /* renamed from: hi */
        public int mo44865hi() {
            return ((t33) this.f34068b).mo44865hi();
        }

        /* renamed from: hk */
        public C6835b mo44909hk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44832Jl(erVar);
            return this;
        }

        /* renamed from: i6 */
        public C5173er mo44867i6() {
            return ((t33) this.f34068b).mo44867i6();
        }

        /* renamed from: ik */
        public C6835b mo44910ik(int i, String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44833Kl(i, str);
            return this;
        }

        /* renamed from: ji */
        public String mo44869ji() {
            return ((t33) this.f34068b).mo44869ji();
        }

        /* renamed from: jk */
        public C6835b mo44911jk(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44834Ll(str);
            return this;
        }

        /* renamed from: k2 */
        public C5173er mo44870k2() {
            return ((t33) this.f34068b).mo44870k2();
        }

        /* renamed from: k4 */
        public String mo44871k4() {
            return ((t33) this.f34068b).mo44871k4();
        }

        /* renamed from: kk */
        public C6835b mo44912kk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44835Ml(erVar);
            return this;
        }

        /* renamed from: lk */
        public C6835b mo44913lk(int i) {
            mo43393xj();
            ((t33) this.f34068b).mo44836Nl(i);
            return this;
        }

        /* renamed from: mk */
        public C6835b mo44914mk(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44837Ol(str);
            return this;
        }

        /* renamed from: nk */
        public C6835b mo44915nk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44839Pl(erVar);
            return this;
        }

        /* renamed from: o5 */
        public C5173er mo44872o5() {
            return ((t33) this.f34068b).mo44872o5();
        }

        /* renamed from: ok */
        public C6835b mo44916ok(String str) {
            mo43393xj();
            ((t33) this.f34068b).mo44841Ql(str);
            return this;
        }

        /* renamed from: pk */
        public C6835b mo44917pk(C5173er erVar) {
            mo43393xj();
            ((t33) this.f34068b).mo44844Rl(erVar);
            return this;
        }

        /* renamed from: q2 */
        public String mo44873q2(int i) {
            return ((t33) this.f34068b).mo44873q2(i);
        }

        /* renamed from: qe */
        public String mo44874qe() {
            return ((t33) this.f34068b).mo44874qe();
        }

        /* renamed from: ud */
        public C5173er mo44875ud(int i) {
            return ((t33) this.f34068b).mo44875ud(i);
        }

        /* renamed from: vc */
        public String mo44876vc() {
            return ((t33) this.f34068b).mo44876vc();
        }

        /* renamed from: vf */
        public C5173er mo44877vf() {
            return ((t33) this.f34068b).mo44877vf();
        }

        /* renamed from: vg */
        public String mo44878vg(int i) {
            return ((t33) this.f34068b).mo44878vg(i);
        }

        /* renamed from: yb */
        public C5173er mo44879yb() {
            return ((t33) this.f34068b).mo44879yb();
        }

        /* renamed from: yd */
        public C5173er mo44880yd() {
            return ((t33) this.f34068b).mo44880yd();
        }
    }

    static {
        t33 t33 = new t33();
        DEFAULT_INSTANCE = t33;
        qe1.m62492dk(t33.class, t33);
    }

    /* renamed from: jl */
    public static t33 m65223jl() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: kl */
    public static C6835b m65225kl() {
        return (C6835b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: ll */
    public static C6835b m65227ll(t33 t33) {
        return (C6835b) DEFAULT_INSTANCE.mo43358gj(t33);
    }

    /* renamed from: ml */
    public static t33 m65229ml(InputStream inputStream) throws IOException {
        return (t33) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: nl */
    public static t33 m65231nl(InputStream inputStream, zy0 zy0) throws IOException {
        return (t33) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ol */
    public static t33 m65233ol(C5173er erVar) throws nt1 {
        return (t33) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: pl */
    public static t33 m65235pl(C5173er erVar, zy0 zy0) throws nt1 {
        return (t33) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: ql */
    public static t33 m65237ql(g00 g00) throws IOException {
        return (t33) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: rl */
    public static t33 m65239rl(g00 g00, zy0 zy0) throws IOException {
        return (t33) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: sl */
    public static t33 m65241sl(InputStream inputStream) throws IOException {
        return (t33) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: tl */
    public static t33 m65243tl(InputStream inputStream, zy0 zy0) throws IOException {
        return (t33) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: ul */
    public static t33 m65245ul(ByteBuffer byteBuffer) throws nt1 {
        return (t33) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: vl */
    public static t33 m65247vl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (t33) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: wl */
    public static t33 m65249wl(byte[] bArr) throws nt1 {
        return (t33) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: xl */
    public static t33 m65251xl(byte[] bArr, zy0 zy0) throws nt1 {
        return (t33) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: yl */
    public static cz2<t33> m65253yl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Al */
    public final void mo44819Al(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* renamed from: Bl */
    public final void mo44820Bl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.administrativeArea_ = erVar.mo35543k0();
    }

    /* renamed from: Cl */
    public final void mo44821Cl(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* renamed from: D3 */
    public int mo44822D3() {
        return this.revision_;
    }

    /* renamed from: Dl */
    public final void mo44823Dl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.languageCode_ = erVar.mo35543k0();
    }

    /* renamed from: Ec */
    public String mo44824Ec() {
        return this.administrativeArea_;
    }

    /* renamed from: El */
    public final void mo44825El(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* renamed from: Fd */
    public String mo44826Fd() {
        return this.locality_;
    }

    /* renamed from: Fl */
    public final void mo44827Fl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.locality_ = erVar.mo35543k0();
    }

    /* renamed from: Gl */
    public final void mo44828Gl(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* renamed from: Hf */
    public C5173er mo44829Hf() {
        return C5173er.m47136w(this.organization_);
    }

    /* renamed from: Hl */
    public final void mo44830Hl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.organization_ = erVar.mo35543k0();
    }

    /* renamed from: Il */
    public final void mo44831Il(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* renamed from: Jl */
    public final void mo44832Jl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.postalCode_ = erVar.mo35543k0();
    }

    /* renamed from: Kl */
    public final void mo44833Kl(int i, String str) {
        str.getClass();
        mo44868il();
        this.recipients_.set(i, str);
    }

    /* renamed from: Ll */
    public final void mo44834Ll(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* renamed from: Ml */
    public final void mo44835Ml(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.regionCode_ = erVar.mo35543k0();
    }

    /* renamed from: Nl */
    public final void mo44836Nl(int i) {
        this.revision_ = i;
    }

    /* renamed from: Ol */
    public final void mo44837Ol(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* renamed from: P6 */
    public List<String> mo44838P6() {
        return this.recipients_;
    }

    /* renamed from: Pl */
    public final void mo44839Pl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.sortingCode_ = erVar.mo35543k0();
    }

    /* renamed from: Qk */
    public final void mo44840Qk(String str) {
        str.getClass();
        mo44866hl();
        this.addressLines_.add(str);
    }

    /* renamed from: Ql */
    public final void mo44841Ql(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* renamed from: R2 */
    public int mo44842R2() {
        return this.recipients_.size();
    }

    /* renamed from: Rk */
    public final void mo44843Rk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo44866hl();
        this.addressLines_.add(erVar.mo35543k0());
    }

    /* renamed from: Rl */
    public final void mo44844Rl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.sublocality_ = erVar.mo35543k0();
    }

    /* renamed from: S5 */
    public List<String> mo44845S5() {
        return this.addressLines_;
    }

    /* renamed from: Sk */
    public final void mo44846Sk(Iterable<String> iterable) {
        mo44866hl();
        C7403z0.m72412X6(iterable, this.addressLines_);
    }

    /* renamed from: Tk */
    public final void mo44847Tk(Iterable<String> iterable) {
        mo44868il();
        C7403z0.m72412X6(iterable, this.recipients_);
    }

    /* renamed from: Uk */
    public final void mo44848Uk(String str) {
        str.getClass();
        mo44868il();
        this.recipients_.add(str);
    }

    /* renamed from: Vk */
    public final void mo44849Vk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo44868il();
        this.recipients_.add(erVar.mo35543k0());
    }

    /* renamed from: Wk */
    public final void mo44850Wk() {
        this.addressLines_ = qe1.m62499pj();
    }

    /* renamed from: Xk */
    public final void mo44851Xk() {
        this.administrativeArea_ = m65223jl().mo44824Ec();
    }

    /* renamed from: Yk */
    public final void mo44852Yk() {
        this.languageCode_ = m65223jl().mo44871k4();
    }

    /* renamed from: Zk */
    public final void mo44853Zk() {
        this.locality_ = m65223jl().mo44826Fd();
    }

    /* renamed from: aa */
    public C5173er mo44854aa(int i) {
        return C5173er.m47136w(this.recipients_.get(i));
    }

    /* renamed from: ad */
    public String mo44855ad() {
        return this.sortingCode_;
    }

    /* renamed from: al */
    public final void mo44856al() {
        this.organization_ = m65223jl().mo44869ji();
    }

    /* renamed from: bl */
    public final void mo44857bl() {
        this.postalCode_ = m65223jl().mo44876vc();
    }

    /* renamed from: c1 */
    public C5173er mo44858c1() {
        return C5173er.m47136w(this.regionCode_);
    }

    /* renamed from: cl */
    public final void mo44859cl() {
        this.recipients_ = qe1.m62499pj();
    }

    /* renamed from: dl */
    public final void mo44860dl() {
        this.regionCode_ = m65223jl().mo44863g1();
    }

    /* renamed from: el */
    public final void mo44861el() {
        this.revision_ = 0;
    }

    /* renamed from: fl */
    public final void mo44862fl() {
        this.sortingCode_ = m65223jl().mo44855ad();
    }

    /* renamed from: g1 */
    public String mo44863g1() {
        return this.regionCode_;
    }

    /* renamed from: gl */
    public final void mo44864gl() {
        this.sublocality_ = m65223jl().mo44874qe();
    }

    /* renamed from: hi */
    public int mo44865hi() {
        return this.addressLines_.size();
    }

    /* renamed from: hl */
    public final void mo44866hl() {
        vs1.C7095k<String> kVar = this.addressLines_;
        if (!kVar.mo36500p()) {
            this.addressLines_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: i6 */
    public C5173er mo44867i6() {
        return C5173er.m47136w(this.sublocality_);
    }

    /* renamed from: il */
    public final void mo44868il() {
        vs1.C7095k<String> kVar = this.recipients_;
        if (!kVar.mo36500p()) {
            this.recipients_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: ji */
    public String mo44869ji() {
        return this.organization_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6834a.f35418a[iVar.ordinal()]) {
            case 1:
                return new t33();
            case 2:
                return new C6835b((C6834a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<t33> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (t33.class) {
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

    /* renamed from: k2 */
    public C5173er mo44870k2() {
        return C5173er.m47136w(this.sortingCode_);
    }

    /* renamed from: k4 */
    public String mo44871k4() {
        return this.languageCode_;
    }

    /* renamed from: o5 */
    public C5173er mo44872o5() {
        return C5173er.m47136w(this.languageCode_);
    }

    /* renamed from: q2 */
    public String mo44873q2(int i) {
        return this.recipients_.get(i);
    }

    /* renamed from: qe */
    public String mo44874qe() {
        return this.sublocality_;
    }

    /* renamed from: ud */
    public C5173er mo44875ud(int i) {
        return C5173er.m47136w(this.addressLines_.get(i));
    }

    /* renamed from: vc */
    public String mo44876vc() {
        return this.postalCode_;
    }

    /* renamed from: vf */
    public C5173er mo44877vf() {
        return C5173er.m47136w(this.administrativeArea_);
    }

    /* renamed from: vg */
    public String mo44878vg(int i) {
        return this.addressLines_.get(i);
    }

    /* renamed from: yb */
    public C5173er mo44879yb() {
        return C5173er.m47136w(this.locality_);
    }

    /* renamed from: yd */
    public C5173er mo44880yd() {
        return C5173er.m47136w(this.postalCode_);
    }

    /* renamed from: zl */
    public final void mo44881zl(int i, String str) {
        str.getClass();
        mo44866hl();
        this.addressLines_.set(i, str);
    }
}
