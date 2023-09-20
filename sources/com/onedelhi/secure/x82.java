package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y02;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class x82 extends qe1<x82, C7227b> implements y82 {
    /* access modifiers changed from: private */
    public static final x82 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<x82> PARSER;
    private String description_ = "";
    private String displayName_ = "";
    private vs1.C7095k<y02> labels_ = qe1.m62499pj();
    private String name_ = "";

    /* renamed from: com.onedelhi.secure.x82$a */
    public static /* synthetic */ class C7226a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37369a;

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
                f37369a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x82.C7226a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.x82$b */
    public static final class C7227b extends qe1.C6546b<x82, C7227b> implements y82 {
        public C7227b() {
            super(x82.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7227b(C7226a aVar) {
            this();
        }

        /* renamed from: C */
        public String mo47075C() {
            return ((x82) this.f34068b).mo47075C();
        }

        /* renamed from: G */
        public C5173er mo47079G() {
            return ((x82) this.f34068b).mo47079G();
        }

        /* renamed from: Gj */
        public C7227b mo47100Gj(Iterable<? extends y02> iterable) {
            mo43393xj();
            ((x82) this.f34068b).mo47095vk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7227b mo47101Hj(int i, y02.C7291b bVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47096wk(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C7227b mo47102Ij(int i, y02 y02) {
            mo43393xj();
            ((x82) this.f34068b).mo47096wk(i, y02);
            return this;
        }

        /* renamed from: Jj */
        public C7227b mo47103Jj(y02.C7291b bVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47097xk((y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C7227b mo47104Kj(y02 y02) {
            mo43393xj();
            ((x82) this.f34068b).mo47097xk(y02);
            return this;
        }

        /* renamed from: Lj */
        public C7227b mo47105Lj() {
            mo43393xj();
            ((x82) this.f34068b).mo47098yk();
            return this;
        }

        /* renamed from: Mj */
        public C7227b mo47106Mj() {
            mo43393xj();
            ((x82) this.f34068b).mo47099zk();
            return this;
        }

        /* renamed from: Nj */
        public C7227b mo47107Nj() {
            mo43393xj();
            ((x82) this.f34068b).mo47073Ak();
            return this;
        }

        /* renamed from: Oj */
        public C7227b mo47108Oj() {
            mo43393xj();
            ((x82) this.f34068b).mo47074Bk();
            return this;
        }

        /* renamed from: Pj */
        public C7227b mo47109Pj(int i) {
            mo43393xj();
            ((x82) this.f34068b).mo47080Vk(i);
            return this;
        }

        /* renamed from: Qj */
        public C7227b mo47110Qj(String str) {
            mo43393xj();
            ((x82) this.f34068b).mo47081Wk(str);
            return this;
        }

        /* renamed from: Rj */
        public C7227b mo47111Rj(C5173er erVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47082Xk(erVar);
            return this;
        }

        /* renamed from: Sj */
        public C7227b mo47112Sj(String str) {
            mo43393xj();
            ((x82) this.f34068b).mo47083Yk(str);
            return this;
        }

        /* renamed from: Tj */
        public C7227b mo47113Tj(C5173er erVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47084Zk(erVar);
            return this;
        }

        /* renamed from: Uj */
        public C7227b mo47114Uj(int i, y02.C7291b bVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47086al(i, (y02) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Vj */
        public C7227b mo47115Vj(int i, y02 y02) {
            mo43393xj();
            ((x82) this.f34068b).mo47086al(i, y02);
            return this;
        }

        /* renamed from: Wj */
        public C7227b mo47116Wj(String str) {
            mo43393xj();
            ((x82) this.f34068b).mo47088bl(str);
            return this;
        }

        /* renamed from: Xj */
        public C7227b mo47117Xj(C5173er erVar) {
            mo43393xj();
            ((x82) this.f34068b).mo47090cl(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo47085a() {
            return ((x82) this.f34068b).mo47085a();
        }

        /* renamed from: b */
        public C5173er mo47087b() {
            return ((x82) this.f34068b).mo47087b();
        }

        /* renamed from: c */
        public String mo47089c() {
            return ((x82) this.f34068b).mo47089c();
        }

        /* renamed from: d0 */
        public List<y02> mo47091d0() {
            return Collections.unmodifiableList(((x82) this.f34068b).mo47091d0());
        }

        /* renamed from: g0 */
        public y02 mo47092g0(int i) {
            return ((x82) this.f34068b).mo47092g0(i);
        }

        public String getName() {
            return ((x82) this.f34068b).getName();
        }

        /* renamed from: r */
        public int mo47094r() {
            return ((x82) this.f34068b).mo47094r();
        }
    }

    static {
        x82 x82 = new x82();
        DEFAULT_INSTANCE = x82;
        qe1.m62492dk(x82.class, x82);
    }

    /* renamed from: Dk */
    public static x82 m70020Dk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Gk */
    public static C7227b m70021Gk() {
        return (C7227b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Hk */
    public static C7227b m70022Hk(x82 x82) {
        return (C7227b) DEFAULT_INSTANCE.mo43358gj(x82);
    }

    /* renamed from: Ik */
    public static x82 m70023Ik(InputStream inputStream) throws IOException {
        return (x82) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Jk */
    public static x82 m70024Jk(InputStream inputStream, zy0 zy0) throws IOException {
        return (x82) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Kk */
    public static x82 m70025Kk(C5173er erVar) throws nt1 {
        return (x82) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Lk */
    public static x82 m70026Lk(C5173er erVar, zy0 zy0) throws nt1 {
        return (x82) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Mk */
    public static x82 m70027Mk(g00 g00) throws IOException {
        return (x82) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Nk */
    public static x82 m70028Nk(g00 g00, zy0 zy0) throws IOException {
        return (x82) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ok */
    public static x82 m70029Ok(InputStream inputStream) throws IOException {
        return (x82) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Pk */
    public static x82 m70030Pk(InputStream inputStream, zy0 zy0) throws IOException {
        return (x82) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Qk */
    public static x82 m70031Qk(ByteBuffer byteBuffer) throws nt1 {
        return (x82) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Rk */
    public static x82 m70032Rk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (x82) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Sk */
    public static x82 m70033Sk(byte[] bArr) throws nt1 {
        return (x82) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Tk */
    public static x82 m70034Tk(byte[] bArr, zy0 zy0) throws nt1 {
        return (x82) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Uk */
    public static cz2<x82> m70035Uk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: Ak */
    public final void mo47073Ak() {
        this.labels_ = qe1.m62499pj();
    }

    /* renamed from: Bk */
    public final void mo47074Bk() {
        this.name_ = m70020Dk().getName();
    }

    /* renamed from: C */
    public String mo47075C() {
        return this.displayName_;
    }

    /* renamed from: Ck */
    public final void mo47076Ck() {
        vs1.C7095k<y02> kVar = this.labels_;
        if (!kVar.mo36500p()) {
            this.labels_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ek */
    public z02 mo47077Ek(int i) {
        return this.labels_.get(i);
    }

    /* renamed from: Fk */
    public List<? extends z02> mo47078Fk() {
        return this.labels_;
    }

    /* renamed from: G */
    public C5173er mo47079G() {
        return C5173er.m47136w(this.displayName_);
    }

    /* renamed from: Vk */
    public final void mo47080Vk(int i) {
        mo47076Ck();
        this.labels_.remove(i);
    }

    /* renamed from: Wk */
    public final void mo47081Wk(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* renamed from: Xk */
    public final void mo47082Xk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.description_ = erVar.mo35543k0();
    }

    /* renamed from: Yk */
    public final void mo47083Yk(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* renamed from: Zk */
    public final void mo47084Zk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.displayName_ = erVar.mo35543k0();
    }

    /* renamed from: a */
    public C5173er mo47085a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: al */
    public final void mo47086al(int i, y02 y02) {
        y02.getClass();
        mo47076Ck();
        this.labels_.set(i, y02);
    }

    /* renamed from: b */
    public C5173er mo47087b() {
        return C5173er.m47136w(this.description_);
    }

    /* renamed from: bl */
    public final void mo47088bl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: c */
    public String mo47089c() {
        return this.description_;
    }

    /* renamed from: cl */
    public final void mo47090cl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: d0 */
    public List<y02> mo47091d0() {
        return this.labels_;
    }

    /* renamed from: g0 */
    public y02 mo47092g0(int i) {
        return this.labels_.get(i);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7226a.f37369a[iVar.ordinal()]) {
            case 1:
                return new x82();
            case 2:
                return new C7227b((C7226a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", y02.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<x82> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (x82.class) {
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

    /* renamed from: r */
    public int mo47094r() {
        return this.labels_.size();
    }

    /* renamed from: vk */
    public final void mo47095vk(Iterable<? extends y02> iterable) {
        mo47076Ck();
        C7403z0.m72412X6(iterable, this.labels_);
    }

    /* renamed from: wk */
    public final void mo47096wk(int i, y02 y02) {
        y02.getClass();
        mo47076Ck();
        this.labels_.add(i, y02);
    }

    /* renamed from: xk */
    public final void mo47097xk(y02 y02) {
        y02.getClass();
        mo47076Ck();
        this.labels_.add(y02);
    }

    /* renamed from: yk */
    public final void mo47098yk() {
        this.description_ = m70020Dk().mo47089c();
    }

    /* renamed from: zk */
    public final void mo47099zk() {
        this.displayName_ = m70020Dk().mo47075C();
    }
}
