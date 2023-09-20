package com.onedelhi.secure;

import com.onedelhi.secure.C6248o7;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class hm1 extends qe1<hm1, C5524b> implements im1 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final hm1 DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile cz2<hm1> PARSER;
    private String contentType_ = "";
    private C5173er data_ = C5173er.f28039a;
    private vs1.C7095k<C6248o7> extensions_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.hm1$a */
    public static /* synthetic */ class C5523a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29668a;

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
                f29668a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29668a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hm1.C5523a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.hm1$b */
    public static final class C5524b extends qe1.C6546b<hm1, C5524b> implements im1 {
        public C5524b() {
            super(hm1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C5524b(C5523a aVar) {
            this();
        }

        /* renamed from: Ch */
        public List<C6248o7> mo37380Ch() {
            return Collections.unmodifiableList(((hm1) this.f34068b).mo37380Ch());
        }

        /* renamed from: Gj */
        public C5524b mo37399Gj(Iterable<? extends C6248o7> iterable) {
            mo43393xj();
            ((hm1) this.f34068b).mo37389rk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C5524b mo37400Hj(int i, C6248o7.C6250b bVar) {
            mo43393xj();
            ((hm1) this.f34068b).mo37391sk(i, (C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C5524b mo37401Ij(int i, C6248o7 o7Var) {
            mo43393xj();
            ((hm1) this.f34068b).mo37391sk(i, o7Var);
            return this;
        }

        /* renamed from: Jj */
        public C5524b mo37402Jj(C6248o7.C6250b bVar) {
            mo43393xj();
            ((hm1) this.f34068b).mo37392tk((C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C5524b mo37403Kj(C6248o7 o7Var) {
            mo43393xj();
            ((hm1) this.f34068b).mo37392tk(o7Var);
            return this;
        }

        /* renamed from: Lj */
        public C5524b mo37404Lj() {
            mo43393xj();
            ((hm1) this.f34068b).mo37393uk();
            return this;
        }

        /* renamed from: Mj */
        public C5524b mo37405Mj() {
            mo43393xj();
            ((hm1) this.f34068b).mo37394vk();
            return this;
        }

        /* renamed from: Nj */
        public C5524b mo37406Nj() {
            mo43393xj();
            ((hm1) this.f34068b).mo37395wk();
            return this;
        }

        /* renamed from: Oj */
        public C5524b mo37407Oj(int i) {
            mo43393xj();
            ((hm1) this.f34068b).mo37381Qk(i);
            return this;
        }

        /* renamed from: Pj */
        public C5524b mo37408Pj(String str) {
            mo43393xj();
            ((hm1) this.f34068b).mo37382Rk(str);
            return this;
        }

        /* renamed from: Qj */
        public C5524b mo37409Qj(C5173er erVar) {
            mo43393xj();
            ((hm1) this.f34068b).mo37383Sk(erVar);
            return this;
        }

        /* renamed from: Rj */
        public C5524b mo37410Rj(C5173er erVar) {
            mo43393xj();
            ((hm1) this.f34068b).mo37384Tk(erVar);
            return this;
        }

        /* renamed from: Sj */
        public C5524b mo37411Sj(int i, C6248o7.C6250b bVar) {
            mo43393xj();
            ((hm1) this.f34068b).mo37385Uk(i, (C6248o7) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Tj */
        public C5524b mo37412Tj(int i, C6248o7 o7Var) {
            mo43393xj();
            ((hm1) this.f34068b).mo37385Uk(i, o7Var);
            return this;
        }

        /* renamed from: Y2 */
        public String mo37386Y2() {
            return ((hm1) this.f34068b).mo37386Y2();
        }

        /* renamed from: dg */
        public C5173er mo37387dg() {
            return ((hm1) this.f34068b).mo37387dg();
        }

        /* renamed from: nf */
        public C6248o7 mo37388nf(int i) {
            return ((hm1) this.f34068b).mo37388nf(i);
        }

        /* renamed from: sc */
        public int mo37390sc() {
            return ((hm1) this.f34068b).mo37390sc();
        }

        /* renamed from: y9 */
        public C5173er mo37397y9() {
            return ((hm1) this.f34068b).mo37397y9();
        }
    }

    static {
        hm1 hm1 = new hm1();
        DEFAULT_INSTANCE = hm1;
        qe1.m62492dk(hm1.class, hm1);
    }

    /* renamed from: Bk */
    public static C5524b m50607Bk() {
        return (C5524b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Ck */
    public static C5524b m50608Ck(hm1 hm1) {
        return (C5524b) DEFAULT_INSTANCE.mo43358gj(hm1);
    }

    /* renamed from: Dk */
    public static hm1 m50609Dk(InputStream inputStream) throws IOException {
        return (hm1) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Ek */
    public static hm1 m50610Ek(InputStream inputStream, zy0 zy0) throws IOException {
        return (hm1) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Fk */
    public static hm1 m50611Fk(C5173er erVar) throws nt1 {
        return (hm1) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Gk */
    public static hm1 m50612Gk(C5173er erVar, zy0 zy0) throws nt1 {
        return (hm1) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Hk */
    public static hm1 m50613Hk(g00 g00) throws IOException {
        return (hm1) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Ik */
    public static hm1 m50614Ik(g00 g00, zy0 zy0) throws IOException {
        return (hm1) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Jk */
    public static hm1 m50615Jk(InputStream inputStream) throws IOException {
        return (hm1) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Kk */
    public static hm1 m50616Kk(InputStream inputStream, zy0 zy0) throws IOException {
        return (hm1) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Lk */
    public static hm1 m50617Lk(ByteBuffer byteBuffer) throws nt1 {
        return (hm1) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Mk */
    public static hm1 m50618Mk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (hm1) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Nk */
    public static hm1 m50619Nk(byte[] bArr) throws nt1 {
        return (hm1) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Ok */
    public static hm1 m50620Ok(byte[] bArr, zy0 zy0) throws nt1 {
        return (hm1) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Pk */
    public static cz2<hm1> m50621Pk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: yk */
    public static hm1 m50634yk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Ak */
    public List<? extends C6514q7> mo37379Ak() {
        return this.extensions_;
    }

    /* renamed from: Ch */
    public List<C6248o7> mo37380Ch() {
        return this.extensions_;
    }

    /* renamed from: Qk */
    public final void mo37381Qk(int i) {
        mo37396xk();
        this.extensions_.remove(i);
    }

    /* renamed from: Rk */
    public final void mo37382Rk(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* renamed from: Sk */
    public final void mo37383Sk(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.contentType_ = erVar.mo35543k0();
    }

    /* renamed from: Tk */
    public final void mo37384Tk(C5173er erVar) {
        erVar.getClass();
        this.data_ = erVar;
    }

    /* renamed from: Uk */
    public final void mo37385Uk(int i, C6248o7 o7Var) {
        o7Var.getClass();
        mo37396xk();
        this.extensions_.set(i, o7Var);
    }

    /* renamed from: Y2 */
    public String mo37386Y2() {
        return this.contentType_;
    }

    /* renamed from: dg */
    public C5173er mo37387dg() {
        return this.data_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C5523a.f29668a[iVar.ordinal()]) {
            case 1:
                return new hm1();
            case 2:
                return new C5524b((C5523a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", C6248o7.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<hm1> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (hm1.class) {
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

    /* renamed from: nf */
    public C6248o7 mo37388nf(int i) {
        return this.extensions_.get(i);
    }

    /* renamed from: rk */
    public final void mo37389rk(Iterable<? extends C6248o7> iterable) {
        mo37396xk();
        C7403z0.m72412X6(iterable, this.extensions_);
    }

    /* renamed from: sc */
    public int mo37390sc() {
        return this.extensions_.size();
    }

    /* renamed from: sk */
    public final void mo37391sk(int i, C6248o7 o7Var) {
        o7Var.getClass();
        mo37396xk();
        this.extensions_.add(i, o7Var);
    }

    /* renamed from: tk */
    public final void mo37392tk(C6248o7 o7Var) {
        o7Var.getClass();
        mo37396xk();
        this.extensions_.add(o7Var);
    }

    /* renamed from: uk */
    public final void mo37393uk() {
        this.contentType_ = m50634yk().mo37386Y2();
    }

    /* renamed from: vk */
    public final void mo37394vk() {
        this.data_ = m50634yk().mo37387dg();
    }

    /* renamed from: wk */
    public final void mo37395wk() {
        this.extensions_ = qe1.m62499pj();
    }

    /* renamed from: xk */
    public final void mo37396xk() {
        vs1.C7095k<C6248o7> kVar = this.extensions_;
        if (!kVar.mo36500p()) {
            this.extensions_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: y9 */
    public C5173er mo37397y9() {
        return C5173er.m47136w(this.contentType_);
    }

    /* renamed from: zk */
    public C6514q7 mo37398zk(int i) {
        return this.extensions_.get(i);
    }
}
