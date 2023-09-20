package com.onedelhi.secure;

import com.onedelhi.secure.C5074e4;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class v40 extends qe1<v40, C7010b> implements w40 {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final v40 DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile cz2<v40> PARSER;
    private vs1.C7095k<C5074e4> advices_ = qe1.m62499pj();
    private int changeType_;
    private String element_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";

    /* renamed from: com.onedelhi.secure.v40$a */
    public static /* synthetic */ class C7009a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36422a;

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
                f36422a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36422a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.v40.C7009a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.v40$b */
    public static final class C7010b extends qe1.C6546b<v40, C7010b> implements w40 {
        public C7010b() {
            super(v40.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C7010b(C7009a aVar) {
            this();
        }

        /* renamed from: A2 */
        public C5173er mo45944A2() {
            return ((v40) this.f34068b).mo45944A2();
        }

        /* renamed from: D9 */
        public String mo45948D9() {
            return ((v40) this.f34068b).mo45948D9();
        }

        /* renamed from: E6 */
        public int mo45950E6() {
            return ((v40) this.f34068b).mo45950E6();
        }

        /* renamed from: Gj */
        public C7010b mo45976Gj(int i, C5074e4.C5076b bVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45974yk(i, (C5074e4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: H3 */
        public String mo45954H3() {
            return ((v40) this.f34068b).mo45954H3();
        }

        /* renamed from: H8 */
        public List<C5074e4> mo45955H8() {
            return Collections.unmodifiableList(((v40) this.f34068b).mo45955H8());
        }

        /* renamed from: Hj */
        public C7010b mo45977Hj(int i, C5074e4 e4Var) {
            mo43393xj();
            ((v40) this.f34068b).mo45974yk(i, e4Var);
            return this;
        }

        /* renamed from: Ij */
        public C7010b mo45978Ij(C5074e4.C5076b bVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45975zk((C5074e4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Jj */
        public C7010b mo45979Jj(C5074e4 e4Var) {
            mo43393xj();
            ((v40) this.f34068b).mo45975zk(e4Var);
            return this;
        }

        /* renamed from: Kj */
        public C7010b mo45980Kj(Iterable<? extends C5074e4> iterable) {
            mo43393xj();
            ((v40) this.f34068b).mo45945Ak(iterable);
            return this;
        }

        /* renamed from: Lj */
        public C7010b mo45981Lj() {
            mo43393xj();
            ((v40) this.f34068b).mo45946Bk();
            return this;
        }

        /* renamed from: Mj */
        public C7010b mo45982Mj() {
            mo43393xj();
            ((v40) this.f34068b).mo45947Ck();
            return this;
        }

        /* renamed from: Nj */
        public C7010b mo45983Nj() {
            mo43393xj();
            ((v40) this.f34068b).mo45949Dk();
            return this;
        }

        /* renamed from: Oj */
        public C7010b mo45984Oj() {
            mo43393xj();
            ((v40) this.f34068b).mo45951Ek();
            return this;
        }

        /* renamed from: Pj */
        public C7010b mo45985Pj() {
            mo43393xj();
            ((v40) this.f34068b).mo45952Fk();
            return this;
        }

        /* renamed from: Qa */
        public C5173er mo45958Qa() {
            return ((v40) this.f34068b).mo45958Qa();
        }

        /* renamed from: Qj */
        public C7010b mo45986Qj(int i) {
            mo43393xj();
            ((v40) this.f34068b).mo45962Zk(i);
            return this;
        }

        /* renamed from: Rb */
        public int mo45959Rb() {
            return ((v40) this.f34068b).mo45959Rb();
        }

        /* renamed from: Rj */
        public C7010b mo45987Rj(int i, C5074e4.C5076b bVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45963al(i, (C5074e4) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Sj */
        public C7010b mo45988Sj(int i, C5074e4 e4Var) {
            mo43393xj();
            ((v40) this.f34068b).mo45963al(i, e4Var);
            return this;
        }

        /* renamed from: Tg */
        public String mo45960Tg() {
            return ((v40) this.f34068b).mo45960Tg();
        }

        /* renamed from: Tj */
        public C7010b mo45989Tj(C7097vv vvVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45964bl(vvVar);
            return this;
        }

        /* renamed from: Uj */
        public C7010b mo45990Uj(int i) {
            mo43393xj();
            ((v40) this.f34068b).mo45965cl(i);
            return this;
        }

        /* renamed from: Vj */
        public C7010b mo45991Vj(String str) {
            mo43393xj();
            ((v40) this.f34068b).mo45966dl(str);
            return this;
        }

        /* renamed from: Wj */
        public C7010b mo45992Wj(C5173er erVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45968el(erVar);
            return this;
        }

        /* renamed from: Xj */
        public C7010b mo45993Xj(String str) {
            mo43393xj();
            ((v40) this.f34068b).mo45969fl(str);
            return this;
        }

        /* renamed from: Ya */
        public C5173er mo45961Ya() {
            return ((v40) this.f34068b).mo45961Ya();
        }

        /* renamed from: Yj */
        public C7010b mo45994Yj(C5173er erVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45970gl(erVar);
            return this;
        }

        /* renamed from: Zj */
        public C7010b mo45995Zj(String str) {
            mo43393xj();
            ((v40) this.f34068b).mo45971hl(str);
            return this;
        }

        /* renamed from: ak */
        public C7010b mo45996ak(C5173er erVar) {
            mo43393xj();
            ((v40) this.f34068b).mo45972il(erVar);
            return this;
        }

        /* renamed from: e8 */
        public C5074e4 mo45967e8(int i) {
            return ((v40) this.f34068b).mo45967e8(i);
        }

        /* renamed from: nh */
        public C7097vv mo45973nh() {
            return ((v40) this.f34068b).mo45973nh();
        }
    }

    static {
        v40 v40 = new v40();
        DEFAULT_INSTANCE = v40;
        qe1.m62492dk(v40.class, v40);
    }

    /* renamed from: Jk */
    public static v40 m67610Jk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Kk */
    public static C7010b m67611Kk() {
        return (C7010b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Lk */
    public static C7010b m67612Lk(v40 v40) {
        return (C7010b) DEFAULT_INSTANCE.mo43358gj(v40);
    }

    /* renamed from: Mk */
    public static v40 m67613Mk(InputStream inputStream) throws IOException {
        return (v40) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Nk */
    public static v40 m67614Nk(InputStream inputStream, zy0 zy0) throws IOException {
        return (v40) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ok */
    public static v40 m67615Ok(C5173er erVar) throws nt1 {
        return (v40) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Pk */
    public static v40 m67616Pk(C5173er erVar, zy0 zy0) throws nt1 {
        return (v40) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Qk */
    public static v40 m67617Qk(g00 g00) throws IOException {
        return (v40) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Rk */
    public static v40 m67618Rk(g00 g00, zy0 zy0) throws IOException {
        return (v40) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Sk */
    public static v40 m67619Sk(InputStream inputStream) throws IOException {
        return (v40) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Tk */
    public static v40 m67620Tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (v40) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Uk */
    public static v40 m67621Uk(ByteBuffer byteBuffer) throws nt1 {
        return (v40) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Vk */
    public static v40 m67622Vk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (v40) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Wk */
    public static v40 m67623Wk(byte[] bArr) throws nt1 {
        return (v40) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Xk */
    public static v40 m67624Xk(byte[] bArr, zy0 zy0) throws nt1 {
        return (v40) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Yk */
    public static cz2<v40> m67625Yk() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A2 */
    public C5173er mo45944A2() {
        return C5173er.m47136w(this.oldValue_);
    }

    /* renamed from: Ak */
    public final void mo45945Ak(Iterable<? extends C5074e4> iterable) {
        mo45953Gk();
        C7403z0.m72412X6(iterable, this.advices_);
    }

    /* renamed from: Bk */
    public final void mo45946Bk() {
        this.advices_ = qe1.m62499pj();
    }

    /* renamed from: Ck */
    public final void mo45947Ck() {
        this.changeType_ = 0;
    }

    /* renamed from: D9 */
    public String mo45948D9() {
        return this.oldValue_;
    }

    /* renamed from: Dk */
    public final void mo45949Dk() {
        this.element_ = m67610Jk().mo45954H3();
    }

    /* renamed from: E6 */
    public int mo45950E6() {
        return this.advices_.size();
    }

    /* renamed from: Ek */
    public final void mo45951Ek() {
        this.newValue_ = m67610Jk().mo45960Tg();
    }

    /* renamed from: Fk */
    public final void mo45952Fk() {
        this.oldValue_ = m67610Jk().mo45948D9();
    }

    /* renamed from: Gk */
    public final void mo45953Gk() {
        vs1.C7095k<C5074e4> kVar = this.advices_;
        if (!kVar.mo36500p()) {
            this.advices_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: H3 */
    public String mo45954H3() {
        return this.element_;
    }

    /* renamed from: H8 */
    public List<C5074e4> mo45955H8() {
        return this.advices_;
    }

    /* renamed from: Hk */
    public C5211f4 mo45956Hk(int i) {
        return this.advices_.get(i);
    }

    /* renamed from: Ik */
    public List<? extends C5211f4> mo45957Ik() {
        return this.advices_;
    }

    /* renamed from: Qa */
    public C5173er mo45958Qa() {
        return C5173er.m47136w(this.newValue_);
    }

    /* renamed from: Rb */
    public int mo45959Rb() {
        return this.changeType_;
    }

    /* renamed from: Tg */
    public String mo45960Tg() {
        return this.newValue_;
    }

    /* renamed from: Ya */
    public C5173er mo45961Ya() {
        return C5173er.m47136w(this.element_);
    }

    /* renamed from: Zk */
    public final void mo45962Zk(int i) {
        mo45953Gk();
        this.advices_.remove(i);
    }

    /* renamed from: al */
    public final void mo45963al(int i, C5074e4 e4Var) {
        e4Var.getClass();
        mo45953Gk();
        this.advices_.set(i, e4Var);
    }

    /* renamed from: bl */
    public final void mo45964bl(C7097vv vvVar) {
        this.changeType_ = vvVar.mo32392j();
    }

    /* renamed from: cl */
    public final void mo45965cl(int i) {
        this.changeType_ = i;
    }

    /* renamed from: dl */
    public final void mo45966dl(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* renamed from: e8 */
    public C5074e4 mo45967e8(int i) {
        return this.advices_.get(i);
    }

    /* renamed from: el */
    public final void mo45968el(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.element_ = erVar.mo35543k0();
    }

    /* renamed from: fl */
    public final void mo45969fl(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* renamed from: gl */
    public final void mo45970gl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.newValue_ = erVar.mo35543k0();
    }

    /* renamed from: hl */
    public final void mo45971hl(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* renamed from: il */
    public final void mo45972il(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.oldValue_ = erVar.mo35543k0();
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C7009a.f36422a[iVar.ordinal()]) {
            case 1:
                return new v40();
            case 2:
                return new C7010b((C7009a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", C5074e4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<v40> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (v40.class) {
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

    /* renamed from: nh */
    public C7097vv mo45973nh() {
        C7097vv a = C7097vv.m68513a(this.changeType_);
        return a == null ? C7097vv.UNRECOGNIZED : a;
    }

    /* renamed from: yk */
    public final void mo45974yk(int i, C5074e4 e4Var) {
        e4Var.getClass();
        mo45953Gk();
        this.advices_.add(i, e4Var);
    }

    /* renamed from: zk */
    public final void mo45975zk(C5074e4 e4Var) {
        e4Var.getClass();
        mo45953Gk();
        this.advices_.add(e4Var);
    }
}
