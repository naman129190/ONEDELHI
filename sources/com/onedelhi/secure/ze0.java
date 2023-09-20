package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ze0 extends qe1<ze0, C7485b> implements af0 {
    /* access modifiers changed from: private */
    public static final ze0 DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile cz2<ze0> PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private String detail_ = "";
    private vs1.C7095k<String> stackEntries_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.ze0$a */
    public static /* synthetic */ class C7484a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38319a;

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
                f38319a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38319a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ze0.C7484a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ze0$b */
    public static final class C7485b extends qe1.C6546b<ze0, C7485b> implements af0 {
        public C7485b() {
            super(ze0.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7485b(C7484a aVar) {
            this();
        }

        /* renamed from: D2 */
        public C5173er mo30891D2() {
            return ((ze0) this.f34068b).mo30891D2();
        }

        /* renamed from: Gj */
        public C7485b mo48238Gj(Iterable<String> iterable) {
            mo43393xj();
            ((ze0) this.f34068b).mo48232ok(iterable);
            return this;
        }

        /* renamed from: Ha */
        public int mo30892Ha() {
            return ((ze0) this.f34068b).mo30892Ha();
        }

        /* renamed from: Hj */
        public C7485b mo48239Hj(String str) {
            mo43393xj();
            ((ze0) this.f34068b).mo48233pk(str);
            return this;
        }

        /* renamed from: Ij */
        public C7485b mo48240Ij(C5173er erVar) {
            mo43393xj();
            ((ze0) this.f34068b).mo48234qk(erVar);
            return this;
        }

        /* renamed from: Jj */
        public C7485b mo48241Jj() {
            mo43393xj();
            ((ze0) this.f34068b).mo48235rk();
            return this;
        }

        /* renamed from: Kj */
        public C7485b mo48242Kj() {
            mo43393xj();
            ((ze0) this.f34068b).mo48236sk();
            return this;
        }

        /* renamed from: Lj */
        public C7485b mo48243Lj(String str) {
            mo43393xj();
            ((ze0) this.f34068b).mo48229Kk(str);
            return this;
        }

        /* renamed from: Mj */
        public C7485b mo48244Mj(C5173er erVar) {
            mo43393xj();
            ((ze0) this.f34068b).mo48230Lk(erVar);
            return this;
        }

        /* renamed from: Nj */
        public C7485b mo48245Nj(int i, String str) {
            mo43393xj();
            ((ze0) this.f34068b).mo48231Mk(i, str);
            return this;
        }

        /* renamed from: bb */
        public List<String> mo30893bb() {
            return Collections.unmodifiableList(((ze0) this.f34068b).mo30893bb());
        }

        /* renamed from: ua */
        public String mo30894ua() {
            return ((ze0) this.f34068b).mo30894ua();
        }

        /* renamed from: v3 */
        public C5173er mo30895v3(int i) {
            return ((ze0) this.f34068b).mo30895v3(i);
        }

        /* renamed from: w7 */
        public String mo30896w7(int i) {
            return ((ze0) this.f34068b).mo30896w7(i);
        }
    }

    static {
        ze0 ze0 = new ze0();
        DEFAULT_INSTANCE = ze0;
        qe1.m62492dk(ze0.class, ze0);
    }

    /* renamed from: Ak */
    public static ze0 m73102Ak(C5173er erVar, zy0 zy0) throws nt1 {
        return (ze0) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Bk */
    public static ze0 m73103Bk(g00 g00) throws IOException {
        return (ze0) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ck */
    public static ze0 m73104Ck(g00 g00, zy0 zy0) throws IOException {
        return (ze0) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Dk */
    public static ze0 m73105Dk(InputStream inputStream) throws IOException {
        return (ze0) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static ze0 m73106Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (ze0) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static ze0 m73107Fk(ByteBuffer byteBuffer) throws nt1 {
        return (ze0) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Gk */
    public static ze0 m73108Gk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (ze0) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Hk */
    public static ze0 m73109Hk(byte[] bArr) throws nt1 {
        return (ze0) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ik */
    public static ze0 m73110Ik(byte[] bArr, zy0 zy0) throws nt1 {
        return (ze0) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Jk */
    public static cz2<ze0> m73111Jk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: uk */
    public static ze0 m73121uk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: vk */
    public static C7485b m73122vk() {
        return (C7485b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: wk */
    public static C7485b m73123wk(ze0 ze0) {
        return (C7485b) DEFAULT_INSTANCE.mo43358gj(ze0);
    }

    /* renamed from: xk */
    public static ze0 m73124xk(InputStream inputStream) throws IOException {
        return (ze0) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: yk */
    public static ze0 m73125yk(InputStream inputStream, zy0 zy0) throws IOException {
        return (ze0) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: zk */
    public static ze0 m73126zk(C5173er erVar) throws nt1 {
        return (ze0) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: D2 */
    public C5173er mo30891D2() {
        return C5173er.m47136w(this.detail_);
    }

    /* renamed from: Ha */
    public int mo30892Ha() {
        return this.stackEntries_.size();
    }

    /* renamed from: Kk */
    public final void mo48229Kk(String str) {
        str.getClass();
        this.detail_ = str;
    }

    /* renamed from: Lk */
    public final void mo48230Lk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.detail_ = erVar.mo35543k0();
    }

    /* renamed from: Mk */
    public final void mo48231Mk(int i, String str) {
        str.getClass();
        mo48237tk();
        this.stackEntries_.set(i, str);
    }

    /* renamed from: bb */
    public List<String> mo30893bb() {
        return this.stackEntries_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7484a.f38319a[iVar.ordinal()]) {
            case 1:
                return new ze0();
            case 2:
                return new C7485b((C7484a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<ze0> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (ze0.class) {
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

    /* renamed from: ok */
    public final void mo48232ok(Iterable<String> iterable) {
        mo48237tk();
        C7403z0.m72412X6(iterable, this.stackEntries_);
    }

    /* renamed from: pk */
    public final void mo48233pk(String str) {
        str.getClass();
        mo48237tk();
        this.stackEntries_.add(str);
    }

    /* renamed from: qk */
    public final void mo48234qk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        mo48237tk();
        this.stackEntries_.add(erVar.mo35543k0());
    }

    /* renamed from: rk */
    public final void mo48235rk() {
        this.detail_ = m73121uk().mo30894ua();
    }

    /* renamed from: sk */
    public final void mo48236sk() {
        this.stackEntries_ = qe1.m62499pj();
    }

    /* renamed from: tk */
    public final void mo48237tk() {
        vs1.C7095k<String> kVar = this.stackEntries_;
        if (!kVar.mo36500p()) {
            this.stackEntries_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: ua */
    public String mo30894ua() {
        return this.detail_;
    }

    /* renamed from: v3 */
    public C5173er mo30895v3(int i) {
        return C5173er.m47136w(this.stackEntries_.get(i));
    }

    /* renamed from: w7 */
    public String mo30896w7(int i) {
        return this.stackEntries_.get(i);
    }
}
