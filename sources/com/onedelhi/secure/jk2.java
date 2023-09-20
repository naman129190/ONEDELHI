package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y02;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class jk2 extends qe1<jk2, C5828b> implements kk2 {
    /* access modifiers changed from: private */
    public static final jk2 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile cz2<jk2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String displayName_ = "";
    private vs1.C7095k<y02> labels_ = qe1.m62499pj();
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";

    /* renamed from: com.onedelhi.secure.jk2$a */
    public static /* synthetic */ class C5827a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30856a;

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
                f30856a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30856a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jk2.C5827a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.jk2$b */
    public static final class C5828b extends qe1.C6546b<jk2, C5828b> implements kk2 {
        public C5828b() {
            super(jk2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5828b(C5827a aVar) {
            this();
        }

        /* renamed from: C */
        public String mo38719C() {
            return ((jk2) this.f34068b).mo38719C();
        }

        /* renamed from: G */
        public C5173er mo38724G() {
            return ((jk2) this.f34068b).mo38724G();
        }

        /* renamed from: Gj */
        public C5828b mo38755Gj(Iterable<? extends y02> iterable) {
            mo43393xj();
            ((jk2) this.f34068b).mo38718Bk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5828b mo38756Hj(int i, y02.C7291b bVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38720Ck(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C5828b mo38757Ij(int i, y02 y02) {
            mo43393xj();
            ((jk2) this.f34068b).mo38720Ck(i, y02);
            return this;
        }

        /* renamed from: Jj */
        public C5828b mo38758Jj(y02.C7291b bVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38721Dk((y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C5828b mo38759Kj(y02 y02) {
            mo43393xj();
            ((jk2) this.f34068b).mo38721Dk(y02);
            return this;
        }

        /* renamed from: Lj */
        public C5828b mo38760Lj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38722Ek();
            return this;
        }

        /* renamed from: Mj */
        public C5828b mo38761Mj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38723Fk();
            return this;
        }

        /* renamed from: Nj */
        public C5828b mo38762Nj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38725Gk();
            return this;
        }

        /* renamed from: Oj */
        public C5828b mo38763Oj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38726Hk();
            return this;
        }

        /* renamed from: P */
        public int mo38732P() {
            return ((jk2) this.f34068b).mo38732P();
        }

        /* renamed from: Pj */
        public C5828b mo38764Pj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38727Ik();
            return this;
        }

        /* renamed from: Q */
        public k12 mo38733Q() {
            return ((jk2) this.f34068b).mo38733Q();
        }

        /* renamed from: Qj */
        public C5828b mo38765Qj() {
            mo43393xj();
            ((jk2) this.f34068b).mo38728Jk();
            return this;
        }

        /* renamed from: Rj */
        public C5828b mo38766Rj(int i) {
            mo43393xj();
            ((jk2) this.f34068b).mo38738dl(i);
            return this;
        }

        /* renamed from: Sj */
        public C5828b mo38767Sj(String str) {
            mo43393xj();
            ((jk2) this.f34068b).mo38739el(str);
            return this;
        }

        /* renamed from: Tj */
        public C5828b mo38768Tj(C5173er erVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38740fl(erVar);
            return this;
        }

        /* renamed from: Uj */
        public C5828b mo38769Uj(String str) {
            mo43393xj();
            ((jk2) this.f34068b).mo38743gl(str);
            return this;
        }

        /* renamed from: Vj */
        public C5828b mo38770Vj(C5173er erVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38745hl(erVar);
            return this;
        }

        /* renamed from: Wj */
        public C5828b mo38771Wj(int i, y02.C7291b bVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38746il(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Xj */
        public C5828b mo38772Xj(int i, y02 y02) {
            mo43393xj();
            ((jk2) this.f34068b).mo38746il(i, y02);
            return this;
        }

        /* renamed from: Yj */
        public C5828b mo38773Yj(k12 k12) {
            mo43393xj();
            ((jk2) this.f34068b).mo38747jl(k12);
            return this;
        }

        /* renamed from: Zj */
        public C5828b mo38774Zj(int i) {
            mo43393xj();
            ((jk2) this.f34068b).mo38748kl(i);
            return this;
        }

        /* renamed from: a */
        public C5173er mo38734a() {
            return ((jk2) this.f34068b).mo38734a();
        }

        /* renamed from: ak */
        public C5828b mo38775ak(String str) {
            mo43393xj();
            ((jk2) this.f34068b).mo38749ll(str);
            return this;
        }

        /* renamed from: b */
        public C5173er mo38735b() {
            return ((jk2) this.f34068b).mo38735b();
        }

        /* renamed from: bk */
        public C5828b mo38776bk(C5173er erVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38751ml(erVar);
            return this;
        }

        /* renamed from: c */
        public String mo38736c() {
            return ((jk2) this.f34068b).mo38736c();
        }

        /* renamed from: ck */
        public C5828b mo38777ck(String str) {
            mo43393xj();
            ((jk2) this.f34068b).mo38752nl(str);
            return this;
        }

        /* renamed from: d0 */
        public List<y02> mo38737d0() {
            return Collections.unmodifiableList(((jk2) this.f34068b).mo38737d0());
        }

        /* renamed from: dk */
        public C5828b mo38778dk(C5173er erVar) {
            mo43393xj();
            ((jk2) this.f34068b).mo38753ol(erVar);
            return this;
        }

        /* renamed from: g0 */
        public y02 mo38741g0(int i) {
            return ((jk2) this.f34068b).mo38741g0(i);
        }

        public String getName() {
            return ((jk2) this.f34068b).getName();
        }

        /* renamed from: h */
        public String mo38744h() {
            return ((jk2) this.f34068b).mo38744h();
        }

        /* renamed from: m */
        public C5173er mo38750m() {
            return ((jk2) this.f34068b).mo38750m();
        }

        /* renamed from: r */
        public int mo38754r() {
            return ((jk2) this.f34068b).mo38754r();
        }
    }

    static {
        jk2 jk2 = new jk2();
        DEFAULT_INSTANCE = jk2;
        qe1.m62492dk(jk2.class, jk2);
    }

    /* renamed from: Lk */
    public static jk2 m53476Lk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ok */
    public static C5828b m53477Ok() {
        return (C5828b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Pk */
    public static C5828b m53478Pk(jk2 jk2) {
        return (C5828b) DEFAULT_INSTANCE.mo43358gj(jk2);
    }

    /* renamed from: Qk */
    public static jk2 m53479Qk(InputStream inputStream) throws IOException {
        return (jk2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Rk */
    public static jk2 m53480Rk(InputStream inputStream, zy0 zy0) throws IOException {
        return (jk2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Sk */
    public static jk2 m53481Sk(C5173er erVar) throws nt1 {
        return (jk2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Tk */
    public static jk2 m53482Tk(C5173er erVar, zy0 zy0) throws nt1 {
        return (jk2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Uk */
    public static jk2 m53483Uk(g00 g00) throws IOException {
        return (jk2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Vk */
    public static jk2 m53484Vk(g00 g00, zy0 zy0) throws IOException {
        return (jk2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Wk */
    public static jk2 m53485Wk(InputStream inputStream) throws IOException {
        return (jk2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Xk */
    public static jk2 m53486Xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (jk2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Yk */
    public static jk2 m53487Yk(ByteBuffer byteBuffer) throws nt1 {
        return (jk2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Zk */
    public static jk2 m53488Zk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (jk2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: al */
    public static jk2 m53489al(byte[] bArr) throws nt1 {
        return (jk2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: bl */
    public static jk2 m53490bl(byte[] bArr, zy0 zy0) throws nt1 {
        return (jk2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: cl */
    public static cz2<jk2> m53491cl() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Bk */
    public final void mo38718Bk(Iterable<? extends y02> iterable) {
        mo38729Kk();
        C7403z0.m72412X6(iterable, this.labels_);
    }

    /* renamed from: C */
    public String mo38719C() {
        return this.displayName_;
    }

    /* renamed from: Ck */
    public final void mo38720Ck(int i, y02 y02) {
        y02.getClass();
        mo38729Kk();
        this.labels_.add(i, y02);
    }

    /* renamed from: Dk */
    public final void mo38721Dk(y02 y02) {
        y02.getClass();
        mo38729Kk();
        this.labels_.add(y02);
    }

    /* renamed from: Ek */
    public final void mo38722Ek() {
        this.description_ = m53476Lk().mo38736c();
    }

    /* renamed from: Fk */
    public final void mo38723Fk() {
        this.displayName_ = m53476Lk().mo38719C();
    }

    /* renamed from: G */
    public C5173er mo38724G() {
        return C5173er.m47136w(this.displayName_);
    }

    /* renamed from: Gk */
    public final void mo38725Gk() {
        this.labels_ = qe1.m62499pj();
    }

    /* renamed from: Hk */
    public final void mo38726Hk() {
        this.launchStage_ = 0;
    }

    /* renamed from: Ik */
    public final void mo38727Ik() {
        this.name_ = m53476Lk().getName();
    }

    /* renamed from: Jk */
    public final void mo38728Jk() {
        this.type_ = m53476Lk().mo38744h();
    }

    /* renamed from: Kk */
    public final void mo38729Kk() {
        vs1.C7095k<y02> kVar = this.labels_;
        if (!kVar.mo36500p()) {
            this.labels_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Mk */
    public z02 mo38730Mk(int i) {
        return this.labels_.get(i);
    }

    /* renamed from: Nk */
    public List<? extends z02> mo38731Nk() {
        return this.labels_;
    }

    /* renamed from: P */
    public int mo38732P() {
        return this.launchStage_;
    }

    /* renamed from: Q */
    public k12 mo38733Q() {
        k12 a = k12.m54001a(this.launchStage_);
        return a == null ? k12.UNRECOGNIZED : a;
    }

    /* renamed from: a */
    public C5173er mo38734a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: b */
    public C5173er mo38735b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: c */
    public String mo38736c() {
        return this.description_;
    }

    /* renamed from: d0 */
    public List<y02> mo38737d0() {
        return this.labels_;
    }

    /* renamed from: dl */
    public final void mo38738dl(int i) {
        mo38729Kk();
        this.labels_.remove(i);
    }

    /* renamed from: el */
    public final void mo38739el(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: fl */
    public final void mo38740fl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: g0 */
    public y02 mo38741g0(int i) {
        return this.labels_.get(i);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: gl */
    public final void mo38743gl(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* renamed from: h */
    public String mo38744h() {
        return this.type_;
    }

    /* renamed from: hl */
    public final void mo38745hl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.displayName_ = erVar.mo35543k0();
    }

    /* renamed from: il */
    public final void mo38746il(int i, y02 y02) {
        y02.getClass();
        mo38729Kk();
        this.labels_.set(i, y02);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5827a.f30856a[iVar.ordinal()]) {
            case 1:
                return new jk2();
            case 2:
                return new C5828b((C5827a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", y02.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<jk2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (jk2.class) {
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
    public final void mo38747jl(k12 k12) {
        this.launchStage_ = k12.mo32392j();
    }

    /* renamed from: kl */
    public final void mo38748kl(int i) {
        this.launchStage_ = i;
    }

    /* renamed from: ll */
    public final void mo38749ll(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: m */
    public C5173er mo38750m() {
        return C5173er.m47136w(this.type_);
    }

    /* renamed from: ml */
    public final void mo38751ml(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: nl */
    public final void mo38752nl(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* renamed from: ol */
    public final void mo38753ol(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.type_ = erVar.mo35543k0();
    }

    /* renamed from: r */
    public int mo38754r() {
        return this.labels_.size();
    }
}
