package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class yx2 extends qe1<yx2, C7398b> implements zx2 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final yx2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile cz2<yx2> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_ = "";
    private String name_ = "";
    private vs1.C7095k<yx2> subpages_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.yx2$a */
    public static /* synthetic */ class C7397a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38102a;

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
                f38102a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38102a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.yx2.C7397a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.yx2$b */
    public static final class C7398b extends qe1.C6546b<yx2, C7398b> implements zx2 {
        public C7398b() {
            super(yx2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7398b(C7397a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C7398b mo48059Gj(Iterable<? extends yx2> iterable) {
            mo43393xj();
            ((yx2) this.f34068b).mo48052sk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C7398b mo48060Hj(int i, C7398b bVar) {
            mo43393xj();
            ((yx2) this.f34068b).mo48053tk(i, (yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: I7 */
        public List<yx2> mo48039I7() {
            return Collections.unmodifiableList(((yx2) this.f34068b).mo48039I7());
        }

        /* renamed from: Ij */
        public C7398b mo48061Ij(int i, yx2 yx2) {
            mo43393xj();
            ((yx2) this.f34068b).mo48053tk(i, yx2);
            return this;
        }

        /* renamed from: Jj */
        public C7398b mo48062Jj(C7398b bVar) {
            mo43393xj();
            ((yx2) this.f34068b).mo48054uk((yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C7398b mo48063Kj(yx2 yx2) {
            mo43393xj();
            ((yx2) this.f34068b).mo48054uk(yx2);
            return this;
        }

        /* renamed from: Lj */
        public C7398b mo48064Lj() {
            mo43393xj();
            ((yx2) this.f34068b).mo48055vk();
            return this;
        }

        /* renamed from: Mj */
        public C7398b mo48065Mj() {
            mo43393xj();
            ((yx2) this.f34068b).mo48056wk();
            return this;
        }

        /* renamed from: Nj */
        public C7398b mo48066Nj() {
            mo43393xj();
            ((yx2) this.f34068b).mo48057xk();
            return this;
        }

        /* renamed from: Oj */
        public C7398b mo48067Oj(int i) {
            mo43393xj();
            ((yx2) this.f34068b).mo48040Rk(i);
            return this;
        }

        /* renamed from: Pj */
        public C7398b mo48068Pj(String str) {
            mo43393xj();
            ((yx2) this.f34068b).mo48041Sk(str);
            return this;
        }

        /* renamed from: Qj */
        public C7398b mo48069Qj(C5173er erVar) {
            mo43393xj();
            ((yx2) this.f34068b).mo48042Tk(erVar);
            return this;
        }

        /* renamed from: Rj */
        public C7398b mo48070Rj(String str) {
            mo43393xj();
            ((yx2) this.f34068b).mo48043Uk(str);
            return this;
        }

        /* renamed from: Sj */
        public C7398b mo48071Sj(C5173er erVar) {
            mo43393xj();
            ((yx2) this.f34068b).mo48045Vk(erVar);
            return this;
        }

        /* renamed from: Tj */
        public C7398b mo48072Tj(int i, C7398b bVar) {
            mo43393xj();
            ((yx2) this.f34068b).mo48046Wk(i, (yx2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Uj */
        public C7398b mo48073Uj(int i, yx2 yx2) {
            mo43393xj();
            ((yx2) this.f34068b).mo48046Wk(i, yx2);
            return this;
        }

        /* renamed from: Va */
        public yx2 mo48044Va(int i) {
            return ((yx2) this.f34068b).mo48044Va(i);
        }

        /* renamed from: a */
        public C5173er mo48047a() {
            return ((yx2) this.f34068b).mo48047a();
        }

        /* renamed from: a6 */
        public int mo48048a6() {
            return ((yx2) this.f34068b).mo48048a6();
        }

        public String getName() {
            return ((yx2) this.f34068b).getName();
        }

        /* renamed from: kc */
        public String mo48050kc() {
            return ((yx2) this.f34068b).mo48050kc();
        }

        /* renamed from: r9 */
        public C5173er mo48051r9() {
            return ((yx2) this.f34068b).mo48051r9();
        }
    }

    static {
        yx2 yx2 = new yx2();
        DEFAULT_INSTANCE = yx2;
        qe1.m62492dk(yx2.class, yx2);
    }

    /* renamed from: Ck */
    public static C7398b m72303Ck() {
        return (C7398b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Dk */
    public static C7398b m72304Dk(yx2 yx2) {
        return (C7398b) DEFAULT_INSTANCE.mo43358gj(yx2);
    }

    /* renamed from: Ek */
    public static yx2 m72305Ek(InputStream inputStream) throws IOException {
        return (yx2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Fk */
    public static yx2 m72306Fk(InputStream inputStream, zy0 zy0) throws IOException {
        return (yx2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Gk */
    public static yx2 m72307Gk(C5173er erVar) throws nt1 {
        return (yx2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Hk */
    public static yx2 m72308Hk(C5173er erVar, zy0 zy0) throws nt1 {
        return (yx2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Ik */
    public static yx2 m72309Ik(g00 g00) throws IOException {
        return (yx2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Jk */
    public static yx2 m72310Jk(g00 g00, zy0 zy0) throws IOException {
        return (yx2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Kk */
    public static yx2 m72311Kk(InputStream inputStream) throws IOException {
        return (yx2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Lk */
    public static yx2 m72312Lk(InputStream inputStream, zy0 zy0) throws IOException {
        return (yx2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Mk */
    public static yx2 m72313Mk(ByteBuffer byteBuffer) throws nt1 {
        return (yx2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Nk */
    public static yx2 m72314Nk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (yx2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Ok */
    public static yx2 m72315Ok(byte[] bArr) throws nt1 {
        return (yx2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Pk */
    public static yx2 m72316Pk(byte[] bArr, zy0 zy0) throws nt1 {
        return (yx2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Qk */
    public static cz2<yx2> m72317Qk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: zk */
    public static yx2 m72331zk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ak */
    public zx2 mo48037Ak(int i) {
        return this.subpages_.get(i);
    }

    /* renamed from: Bk */
    public List<? extends zx2> mo48038Bk() {
        return this.subpages_;
    }

    /* renamed from: I7 */
    public List<yx2> mo48039I7() {
        return this.subpages_;
    }

    /* renamed from: Rk */
    public final void mo48040Rk(int i) {
        mo48058yk();
        this.subpages_.remove(i);
    }

    /* renamed from: Sk */
    public final void mo48041Sk(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* renamed from: Tk */
    public final void mo48042Tk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.content_ = erVar.mo35543k0();
    }

    /* renamed from: Uk */
    public final void mo48043Uk(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Va */
    public yx2 mo48044Va(int i) {
        return this.subpages_.get(i);
    }

    /* renamed from: Vk */
    public final void mo48045Vk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: Wk */
    public final void mo48046Wk(int i, yx2 yx2) {
        yx2.getClass();
        mo48058yk();
        this.subpages_.set(i, yx2);
    }

    /* renamed from: a */
    public C5173er mo48047a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: a6 */
    public int mo48048a6() {
        return this.subpages_.size();
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        Class<yx2> cls = yx2.class;
        switch (C7397a.f38102a[iVar.ordinal()]) {
            case 1:
                return new yx2();
            case 2:
                return new C7398b((C7397a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<yx2> cz2 = PARSER;
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

    /* renamed from: kc */
    public String mo48050kc() {
        return this.content_;
    }

    /* renamed from: r9 */
    public C5173er mo48051r9() {
        return C5173er.m47136w(this.content_);
    }

    /* renamed from: sk */
    public final void mo48052sk(Iterable<? extends yx2> iterable) {
        mo48058yk();
        C7403z0.m72412X6(iterable, this.subpages_);
    }

    /* renamed from: tk */
    public final void mo48053tk(int i, yx2 yx2) {
        yx2.getClass();
        mo48058yk();
        this.subpages_.add(i, yx2);
    }

    /* renamed from: uk */
    public final void mo48054uk(yx2 yx2) {
        yx2.getClass();
        mo48058yk();
        this.subpages_.add(yx2);
    }

    /* renamed from: vk */
    public final void mo48055vk() {
        this.content_ = m72331zk().mo48050kc();
    }

    /* renamed from: wk */
    public final void mo48056wk() {
        this.name_ = m72331zk().getName();
    }

    /* renamed from: xk */
    public final void mo48057xk() {
        this.subpages_ = qe1.m62499pj();
    }

    /* renamed from: yk */
    public final void mo48058yk() {
        vs1.C7095k<yx2> kVar = this.subpages_;
        if (!kVar.mo36500p()) {
            this.subpages_ = qe1.m62468Fj(kVar);
        }
    }
}
