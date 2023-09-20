package com.onedelhi.secure;

import com.onedelhi.secure.pw2;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class pi2 extends qe1<pi2, C6448b> implements ri2 {
    /* access modifiers changed from: private */
    public static final pi2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile cz2<pi2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_ = "";
    private vs1.C7095k<pw2> options_ = qe1.m62499pj();
    private boolean requestStreaming_;
    private String requestTypeUrl_ = "";
    private boolean responseStreaming_;
    private String responseTypeUrl_ = "";
    private int syntax_;

    /* renamed from: com.onedelhi.secure.pi2$a */
    public static /* synthetic */ class C6447a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33688a;

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
                f33688a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33688a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pi2.C6447a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.pi2$b */
    public static final class C6448b extends qe1.C6546b<pi2, C6448b> implements ri2 {
        public C6448b() {
            super(pi2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6448b(C6447a aVar) {
            this();
        }

        /* renamed from: A */
        public u84 mo42625A() {
            return ((pi2) this.f34068b).mo42625A();
        }

        /* renamed from: Gj */
        public C6448b mo42663Gj(Iterable<? extends pw2> iterable) {
            mo43393xj();
            ((pi2) this.f34068b).mo42626Ck(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6448b mo42664Hj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42627Dk(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: I9 */
        public boolean mo42632I9() {
            return ((pi2) this.f34068b).mo42632I9();
        }

        /* renamed from: Ij */
        public C6448b mo42665Ij(int i, pw2 pw2) {
            mo43393xj();
            ((pi2) this.f34068b).mo42627Dk(i, pw2);
            return this;
        }

        /* renamed from: Jj */
        public C6448b mo42666Jj(pw2.C6483b bVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42628Ek((pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6448b mo42667Kj(pw2 pw2) {
            mo43393xj();
            ((pi2) this.f34068b).mo42628Ek(pw2);
            return this;
        }

        /* renamed from: Lj */
        public C6448b mo42668Lj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42629Fk();
            return this;
        }

        /* renamed from: Mj */
        public C6448b mo42669Mj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42630Gk();
            return this;
        }

        /* renamed from: Nj */
        public C6448b mo42670Nj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42631Hk();
            return this;
        }

        /* renamed from: Oj */
        public C6448b mo42671Oj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42633Ik();
            return this;
        }

        /* renamed from: Pj */
        public C6448b mo42672Pj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42634Jk();
            return this;
        }

        /* renamed from: Qj */
        public C6448b mo42673Qj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42635Kk();
            return this;
        }

        /* renamed from: Rj */
        public C6448b mo42674Rj() {
            mo43393xj();
            ((pi2) this.f34068b).mo42636Lk();
            return this;
        }

        /* renamed from: Sj */
        public C6448b mo42675Sj(int i) {
            mo43393xj();
            ((pi2) this.f34068b).mo42641fl(i);
            return this;
        }

        /* renamed from: Tj */
        public C6448b mo42676Tj(String str) {
            mo43393xj();
            ((pi2) this.f34068b).mo42643gl(str);
            return this;
        }

        /* renamed from: Uj */
        public C6448b mo42677Uj(C5173er erVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42644hl(erVar);
            return this;
        }

        /* renamed from: Vj */
        public C6448b mo42678Vj(int i, pw2.C6483b bVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42645il(i, (pw2) bVar.mo43381ab());
            return this;
        }

        /* renamed from: Wj */
        public C6448b mo42679Wj(int i, pw2 pw2) {
            mo43393xj();
            ((pi2) this.f34068b).mo42645il(i, pw2);
            return this;
        }

        /* renamed from: Xj */
        public C6448b mo42680Xj(boolean z) {
            mo43393xj();
            ((pi2) this.f34068b).mo42646jl(z);
            return this;
        }

        /* renamed from: Yj */
        public C6448b mo42681Yj(String str) {
            mo43393xj();
            ((pi2) this.f34068b).mo42647kl(str);
            return this;
        }

        /* renamed from: Zj */
        public C6448b mo42682Zj(C5173er erVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42649ll(erVar);
            return this;
        }

        /* renamed from: a */
        public C5173er mo42640a() {
            return ((pi2) this.f34068b).mo42640a();
        }

        /* renamed from: ak */
        public C6448b mo42683ak(boolean z) {
            mo43393xj();
            ((pi2) this.f34068b).mo42650ml(z);
            return this;
        }

        /* renamed from: bk */
        public C6448b mo42684bk(String str) {
            mo43393xj();
            ((pi2) this.f34068b).mo42651nl(str);
            return this;
        }

        /* renamed from: ck */
        public C6448b mo42685ck(C5173er erVar) {
            mo43393xj();
            ((pi2) this.f34068b).mo42653ol(erVar);
            return this;
        }

        /* renamed from: dk */
        public C6448b mo42686dk(u84 u84) {
            mo43393xj();
            ((pi2) this.f34068b).mo42654pl(u84);
            return this;
        }

        /* renamed from: ek */
        public C6448b mo42687ek(int i) {
            mo43393xj();
            ((pi2) this.f34068b).mo42656ql(i);
            return this;
        }

        public String getName() {
            return ((pi2) this.f34068b).getName();
        }

        /* renamed from: lh */
        public String mo42648lh() {
            return ((pi2) this.f34068b).mo42648lh();
        }

        /* renamed from: od */
        public C5173er mo42652od() {
            return ((pi2) this.f34068b).mo42652od();
        }

        /* renamed from: qc */
        public String mo42655qc() {
            return ((pi2) this.f34068b).mo42655qc();
        }

        /* renamed from: s */
        public pw2 mo42657s(int i) {
            return ((pi2) this.f34068b).mo42657s(i);
        }

        /* renamed from: s5 */
        public C5173er mo42658s5() {
            return ((pi2) this.f34068b).mo42658s5();
        }

        /* renamed from: s8 */
        public boolean mo42659s8() {
            return ((pi2) this.f34068b).mo42659s8();
        }

        /* renamed from: t */
        public int mo42660t() {
            return ((pi2) this.f34068b).mo42660t();
        }

        /* renamed from: u */
        public List<pw2> mo42661u() {
            return Collections.unmodifiableList(((pi2) this.f34068b).mo42661u());
        }

        /* renamed from: y */
        public int mo42662y() {
            return ((pi2) this.f34068b).mo42662y();
        }
    }

    static {
        pi2 pi2 = new pi2();
        DEFAULT_INSTANCE = pi2;
        qe1.m62492dk(pi2.class, pi2);
    }

    /* renamed from: Nk */
    public static pi2 m61053Nk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Qk */
    public static C6448b m61054Qk() {
        return (C6448b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: Rk */
    public static C6448b m61055Rk(pi2 pi2) {
        return (C6448b) DEFAULT_INSTANCE.mo43358gj(pi2);
    }

    /* renamed from: Sk */
    public static pi2 m61056Sk(InputStream inputStream) throws IOException {
        return (pi2) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Tk */
    public static pi2 m61057Tk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pi2) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Uk */
    public static pi2 m61058Uk(C5173er erVar) throws nt1 {
        return (pi2) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: Vk */
    public static pi2 m61059Vk(C5173er erVar, zy0 zy0) throws nt1 {
        return (pi2) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Wk */
    public static pi2 m61060Wk(g00 g00) throws IOException {
        return (pi2) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Xk */
    public static pi2 m61061Xk(g00 g00, zy0 zy0) throws IOException {
        return (pi2) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Yk */
    public static pi2 m61062Yk(InputStream inputStream) throws IOException {
        return (pi2) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Zk */
    public static pi2 m61063Zk(InputStream inputStream, zy0 zy0) throws IOException {
        return (pi2) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: al */
    public static pi2 m61064al(ByteBuffer byteBuffer) throws nt1 {
        return (pi2) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: bl */
    public static pi2 m61065bl(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (pi2) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: cl */
    public static pi2 m61066cl(byte[] bArr) throws nt1 {
        return (pi2) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: dl */
    public static pi2 m61067dl(byte[] bArr, zy0 zy0) throws nt1 {
        return (pi2) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: el */
    public static cz2<pi2> m61068el() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: A */
    public u84 mo42625A() {
        u84 a = u84.m66907a(this.syntax_);
        return a == null ? u84.UNRECOGNIZED : a;
    }

    /* renamed from: Ck */
    public final void mo42626Ck(Iterable<? extends pw2> iterable) {
        mo42637Mk();
        C7403z0.m72412X6(iterable, this.options_);
    }

    /* renamed from: Dk */
    public final void mo42627Dk(int i, pw2 pw2) {
        pw2.getClass();
        mo42637Mk();
        this.options_.add(i, pw2);
    }

    /* renamed from: Ek */
    public final void mo42628Ek(pw2 pw2) {
        pw2.getClass();
        mo42637Mk();
        this.options_.add(pw2);
    }

    /* renamed from: Fk */
    public final void mo42629Fk() {
        this.name_ = m61053Nk().getName();
    }

    /* renamed from: Gk */
    public final void mo42630Gk() {
        this.options_ = qe1.m62499pj();
    }

    /* renamed from: Hk */
    public final void mo42631Hk() {
        this.requestStreaming_ = false;
    }

    /* renamed from: I9 */
    public boolean mo42632I9() {
        return this.responseStreaming_;
    }

    /* renamed from: Ik */
    public final void mo42633Ik() {
        this.requestTypeUrl_ = m61053Nk().mo42648lh();
    }

    /* renamed from: Jk */
    public final void mo42634Jk() {
        this.responseStreaming_ = false;
    }

    /* renamed from: Kk */
    public final void mo42635Kk() {
        this.responseTypeUrl_ = m61053Nk().mo42655qc();
    }

    /* renamed from: Lk */
    public final void mo42636Lk() {
        this.syntax_ = 0;
    }

    /* renamed from: Mk */
    public final void mo42637Mk() {
        vs1.C7095k<pw2> kVar = this.options_;
        if (!kVar.mo36500p()) {
            this.options_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: Ok */
    public qw2 mo42638Ok(int i) {
        return this.options_.get(i);
    }

    /* renamed from: Pk */
    public List<? extends qw2> mo42639Pk() {
        return this.options_;
    }

    /* renamed from: a */
    public C5173er mo42640a() {
        return C5173er.m47136w(this.name_);
    }

    /* renamed from: fl */
    public final void mo42641fl(int i) {
        mo42637Mk();
        this.options_.remove(i);
    }

    public String getName() {
        return this.name_;
    }

    /* renamed from: gl */
    public final void mo42643gl(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: hl */
    public final void mo42644hl(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.name_ = erVar.mo35543k0();
    }

    /* renamed from: il */
    public final void mo42645il(int i, pw2 pw2) {
        pw2.getClass();
        mo42637Mk();
        this.options_.set(i, pw2);
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6447a.f33688a[iVar.ordinal()]) {
            case 1:
                return new pi2();
            case 2:
                return new C6448b((C6447a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", pw2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<pi2> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (pi2.class) {
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
    public final void mo42646jl(boolean z) {
        this.requestStreaming_ = z;
    }

    /* renamed from: kl */
    public final void mo42647kl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* renamed from: lh */
    public String mo42648lh() {
        return this.requestTypeUrl_;
    }

    /* renamed from: ll */
    public final void mo42649ll(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.requestTypeUrl_ = erVar.mo35543k0();
    }

    /* renamed from: ml */
    public final void mo42650ml(boolean z) {
        this.responseStreaming_ = z;
    }

    /* renamed from: nl */
    public final void mo42651nl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* renamed from: od */
    public C5173er mo42652od() {
        return C5173er.m47136w(this.responseTypeUrl_);
    }

    /* renamed from: ol */
    public final void mo42653ol(C5173er erVar) {
        C7403z0.m72411F9(erVar);
        this.responseTypeUrl_ = erVar.mo35543k0();
    }

    /* renamed from: pl */
    public final void mo42654pl(u84 u84) {
        this.syntax_ = u84.mo32392j();
    }

    /* renamed from: qc */
    public String mo42655qc() {
        return this.responseTypeUrl_;
    }

    /* renamed from: ql */
    public final void mo42656ql(int i) {
        this.syntax_ = i;
    }

    /* renamed from: s */
    public pw2 mo42657s(int i) {
        return this.options_.get(i);
    }

    /* renamed from: s5 */
    public C5173er mo42658s5() {
        return C5173er.m47136w(this.requestTypeUrl_);
    }

    /* renamed from: s8 */
    public boolean mo42659s8() {
        return this.requestStreaming_;
    }

    /* renamed from: t */
    public int mo42660t() {
        return this.options_.size();
    }

    /* renamed from: u */
    public List<pw2> mo42661u() {
        return this.options_;
    }

    /* renamed from: y */
    public int mo42662y() {
        return this.syntax_;
    }
}
