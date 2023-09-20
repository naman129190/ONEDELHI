package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.y84;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class b94 extends qe1<b94, C4658b> implements c94 {
    /* access modifiers changed from: private */
    public static final b94 DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile cz2<b94> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private vs1.C7095k<y84> parameters_ = qe1.m62499pj();
    private String selector_ = "";

    /* renamed from: com.onedelhi.secure.b94$a */
    public static /* synthetic */ class C4657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26243a;

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
                f26243a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26243a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b94.C4657a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.b94$b */
    public static final class C4658b extends qe1.C6546b<b94, C4658b> implements c94 {
        public C4658b() {
            super(b94.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C4658b(C4657a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C4658b mo31507Gj(Iterable<? extends y84> iterable) {
            mo43393xj();
            ((b94) this.f34068b).mo31499pk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C4658b mo31508Hj(int i, y84.C7316b bVar) {
            mo43393xj();
            ((b94) this.f34068b).mo31500qk(i, (y84) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ig */
        public int mo31490Ig() {
            return ((b94) this.f34068b).mo31490Ig();
        }

        /* renamed from: Ij */
        public C4658b mo31509Ij(int i, y84 y84) {
            mo43393xj();
            ((b94) this.f34068b).mo31500qk(i, y84);
            return this;
        }

        /* renamed from: Jj */
        public C4658b mo31510Jj(y84.C7316b bVar) {
            mo43393xj();
            ((b94) this.f34068b).mo31501rk((y84) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C4658b mo31511Kj(y84 y84) {
            mo43393xj();
            ((b94) this.f34068b).mo31501rk(y84);
            return this;
        }

        /* renamed from: Lj */
        public C4658b mo31512Lj() {
            mo43393xj();
            ((b94) this.f34068b).mo31502sk();
            return this;
        }

        /* renamed from: Mj */
        public C4658b mo31513Mj() {
            mo43393xj();
            ((b94) this.f34068b).mo31503tk();
            return this;
        }

        /* renamed from: Nj */
        public C4658b mo31514Nj(int i) {
            mo43393xj();
            ((b94) this.f34068b).mo31491Nk(i);
            return this;
        }

        /* renamed from: Oj */
        public C4658b mo31515Oj(int i, y84.C7316b bVar) {
            mo43393xj();
            ((b94) this.f34068b).mo31492Ok(i, (y84) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Pj */
        public C4658b mo31516Pj(int i, y84 y84) {
            mo43393xj();
            ((b94) this.f34068b).mo31492Ok(i, y84);
            return this;
        }

        /* renamed from: Qj */
        public C4658b mo31517Qj(String str) {
            mo43393xj();
            ((b94) this.f34068b).mo31493Pk(str);
            return this;
        }

        /* renamed from: Rj */
        public C4658b mo31518Rj(C5173er erVar) {
            mo43393xj();
            ((b94) this.f34068b).mo31494Qk(erVar);
            return this;
        }

        /* renamed from: k */
        public String mo31495k() {
            return ((b94) this.f34068b).mo31495k();
        }

        /* renamed from: l */
        public C5173er mo31496l() {
            return ((b94) this.f34068b).mo31496l();
        }

        /* renamed from: lf */
        public List<y84> mo31497lf() {
            return Collections.unmodifiableList(((b94) this.f34068b).mo31497lf());
        }

        /* renamed from: ni */
        public y84 mo31498ni(int i) {
            return ((b94) this.f34068b).mo31498ni(i);
        }
    }

    static {
        b94 b94 = new b94();
        DEFAULT_INSTANCE = b94;
        qe1.m62492dk(b94.class, b94);
    }

    /* renamed from: Ak */
    public static b94 m39599Ak(InputStream inputStream) throws IOException {
        return (b94) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Bk */
    public static b94 m39600Bk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b94) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ck */
    public static b94 m39601Ck(C5173er erVar) throws nt1 {
        return (b94) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Dk */
    public static b94 m39602Dk(C5173er erVar, zy0 zy0) throws nt1 {
        return (b94) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Ek */
    public static b94 m39603Ek(g00 g00) throws IOException {
        return (b94) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Fk */
    public static b94 m39604Fk(g00 g00, zy0 zy0) throws IOException {
        return (b94) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Gk */
    public static b94 m39605Gk(InputStream inputStream) throws IOException {
        return (b94) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Hk */
    public static b94 m39606Hk(InputStream inputStream, zy0 zy0) throws IOException {
        return (b94) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ik */
    public static b94 m39607Ik(ByteBuffer byteBuffer) throws nt1 {
        return (b94) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Jk */
    public static b94 m39608Jk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (b94) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Kk */
    public static b94 m39609Kk(byte[] bArr) throws nt1 {
        return (b94) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Lk */
    public static b94 m39610Lk(byte[] bArr, zy0 zy0) throws nt1 {
        return (b94) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Mk */
    public static cz2<b94> m39611Mk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: vk */
    public static b94 m39622vk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: yk */
    public static C4658b m39623yk() {
        return (C4658b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: zk */
    public static C4658b m39624zk(b94 b94) {
        return (C4658b) DEFAULT_INSTANCE.mo43358gj(b94);
    }

    /* renamed from: Ig */
    public int mo31490Ig() {
        return this.parameters_.size();
    }

    /* renamed from: Nk */
    public final void mo31491Nk(int i) {
        mo31504uk();
        this.parameters_.remove(i);
    }

    /* renamed from: Ok */
    public final void mo31492Ok(int i, y84 y84) {
        y84.getClass();
        mo31504uk();
        this.parameters_.set(i, y84);
    }

    /* renamed from: Pk */
    public final void mo31493Pk(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* renamed from: Qk */
    public final void mo31494Qk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.selector_ = erVar.mo35543k0();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C4657a.f26243a[iVar.ordinal()]) {
            case 1:
                return new b94();
            case 2:
                return new C4658b((C4657a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", y84.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<b94> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (b94.class) {
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

    /* renamed from: k */
    public String mo31495k() {
        return this.selector_;
    }

    /* renamed from: l */
    public C5173er mo31496l() {
        return C5173er.m47136w(this.selector_);
    }

    /* renamed from: lf */
    public List<y84> mo31497lf() {
        return this.parameters_;
    }

    /* renamed from: ni */
    public y84 mo31498ni(int i) {
        return this.parameters_.get(i);
    }

    /* renamed from: pk */
    public final void mo31499pk(Iterable<? extends y84> iterable) {
        mo31504uk();
        C7403z0.m72412X6(iterable, this.parameters_);
    }

    /* renamed from: qk */
    public final void mo31500qk(int i, y84 y84) {
        y84.getClass();
        mo31504uk();
        this.parameters_.add(i, y84);
    }

    /* renamed from: rk */
    public final void mo31501rk(y84 y84) {
        y84.getClass();
        mo31504uk();
        this.parameters_.add(y84);
    }

    /* renamed from: sk */
    public final void mo31502sk() {
        this.parameters_ = qe1.m62499pj();
    }

    /* renamed from: tk */
    public final void mo31503tk() {
        this.selector_ = m39622vk().mo31495k();
    }

    /* renamed from: uk */
    public final void mo31504uk() {
        vs1.C7095k<y84> kVar = this.parameters_;
        if (!kVar.mo36500p()) {
            this.parameters_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: wk */
    public z84 mo31505wk(int i) {
        return this.parameters_.get(i);
    }

    /* renamed from: xk */
    public List<? extends z84> mo31506xk() {
        return this.parameters_;
    }
}
