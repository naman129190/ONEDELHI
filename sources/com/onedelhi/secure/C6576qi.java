package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.qi */
public final class C6576qi extends qe1<C6576qi, C6578b> implements C6700ri {
    /* access modifiers changed from: private */
    public static final C6576qi DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile cz2<C6576qi> PARSER;
    private vs1.C7095k<C6579c> fieldViolations_ = qe1.m62499pj();

    /* renamed from: com.onedelhi.secure.qi$a */
    public static /* synthetic */ class C6577a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34252a;

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
                f34252a = r0
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34252a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.qe1$i r1 = com.onedelhi.secure.qe1.C6554i.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6576qi.C6577a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.qi$b */
    public static final class C6578b extends qe1.C6546b<C6576qi, C6578b> implements C6700ri {
        public C6578b() {
            super(C6576qi.DEFAULT_INSTANCE);
        }

        public /* synthetic */ C6578b(C6577a aVar) {
            this();
        }

        /* renamed from: Gj */
        public C6578b mo43569Gj(Iterable<? extends C6579c> iterable) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43562mk(iterable);
            return this;
        }

        /* renamed from: Hj */
        public C6578b mo43570Hj(int i, C6579c.C6580a aVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43563nk(i, (C6579c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Ij */
        public C6578b mo43571Ij(int i, C6579c cVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43563nk(i, cVar);
            return this;
        }

        /* renamed from: Jd */
        public C6579c mo43557Jd(int i) {
            return ((C6576qi) this.f34068b).mo43557Jd(i);
        }

        /* renamed from: Jj */
        public C6578b mo43572Jj(C6579c.C6580a aVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43564ok((C6579c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Kj */
        public C6578b mo43573Kj(C6579c cVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43564ok(cVar);
            return this;
        }

        /* renamed from: Lj */
        public C6578b mo43574Lj() {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43565pk();
            return this;
        }

        /* renamed from: Mj */
        public C6578b mo43575Mj(int i) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43558Jk(i);
            return this;
        }

        /* renamed from: Nj */
        public C6578b mo43576Nj(int i, C6579c.C6580a aVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43559Kk(i, (C6579c) aVar.mo43381ab());
            return this;
        }

        /* renamed from: Oj */
        public C6578b mo43577Oj(int i, C6579c cVar) {
            mo43393xj();
            ((C6576qi) this.f34068b).mo43559Kk(i, cVar);
            return this;
        }

        /* renamed from: Qc */
        public int mo43560Qc() {
            return ((C6576qi) this.f34068b).mo43560Qc();
        }

        /* renamed from: ea */
        public List<C6579c> mo43561ea() {
            return Collections.unmodifiableList(((C6576qi) this.f34068b).mo43561ea());
        }
    }

    /* renamed from: com.onedelhi.secure.qi$c */
    public static final class C6579c extends qe1<C6579c, C6580a> implements C6581d {
        /* access modifiers changed from: private */
        public static final C6579c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile cz2<C6579c> PARSER;
        private String description_ = "";
        private String field_ = "";

        /* renamed from: com.onedelhi.secure.qi$c$a */
        public static final class C6580a extends qe1.C6546b<C6579c, C6580a> implements C6581d {
            public C6580a() {
                super(C6579c.DEFAULT_INSTANCE);
            }

            public /* synthetic */ C6580a(C6577a aVar) {
                this();
            }

            /* renamed from: Gj */
            public C6580a mo43588Gj() {
                mo43393xj();
                ((C6579c) this.f34068b).mo43585mk();
                return this;
            }

            /* renamed from: Hj */
            public C6580a mo43589Hj() {
                mo43393xj();
                ((C6579c) this.f34068b).mo43586nk();
                return this;
            }

            /* renamed from: Ij */
            public C6580a mo43590Ij(String str) {
                mo43393xj();
                ((C6579c) this.f34068b).mo43578Ek(str);
                return this;
            }

            /* renamed from: Jj */
            public C6580a mo43591Jj(C5173er erVar) {
                mo43393xj();
                ((C6579c) this.f34068b).mo43579Fk(erVar);
                return this;
            }

            /* renamed from: Kj */
            public C6580a mo43592Kj(String str) {
                mo43393xj();
                ((C6579c) this.f34068b).mo43580Gk(str);
                return this;
            }

            /* renamed from: Lj */
            public C6580a mo43593Lj(C5173er erVar) {
                mo43393xj();
                ((C6579c) this.f34068b).mo43581Hk(erVar);
                return this;
            }

            /* renamed from: b */
            public C5173er mo43582b() {
                return ((C6579c) this.f34068b).mo43582b();
            }

            /* renamed from: c */
            public String mo43583c() {
                return ((C6579c) this.f34068b).mo43583c();
            }

            /* renamed from: cc */
            public String mo43584cc() {
                return ((C6579c) this.f34068b).mo43584cc();
            }

            /* renamed from: wi */
            public C5173er mo43587wi() {
                return ((C6579c) this.f34068b).mo43587wi();
            }
        }

        static {
            C6579c cVar = new C6579c();
            DEFAULT_INSTANCE = cVar;
            qe1.m62492dk(C6579c.class, cVar);
        }

        /* renamed from: Ak */
        public static C6579c m62834Ak(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
            return (C6579c) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
        }

        /* renamed from: Bk */
        public static C6579c m62835Bk(byte[] bArr) throws nt1 {
            return (C6579c) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: Ck */
        public static C6579c m62836Ck(byte[] bArr, zy0 zy0) throws nt1 {
            return (C6579c) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
        }

        /* renamed from: Dk */
        public static cz2<C6579c> m62837Dk() {
            return DEFAULT_INSTANCE.mo43348Tc();
        }

        /* renamed from: ok */
        public static C6579c m62845ok() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: pk */
        public static C6580a m62846pk() {
            return (C6580a) DEFAULT_INSTANCE.mo43357fj();
        }

        /* renamed from: qk */
        public static C6580a m62847qk(C6579c cVar) {
            return (C6580a) DEFAULT_INSTANCE.mo43358gj(cVar);
        }

        /* renamed from: rk */
        public static C6579c m62848rk(InputStream inputStream) throws IOException {
            return (C6579c) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: sk */
        public static C6579c m62849sk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6579c) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: tk */
        public static C6579c m62850tk(C5173er erVar) throws nt1 {
            return (C6579c) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
        }

        /* renamed from: uk */
        public static C6579c m62851uk(C5173er erVar, zy0 zy0) throws nt1 {
            return (C6579c) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
        }

        /* renamed from: vk */
        public static C6579c m62852vk(g00 g00) throws IOException {
            return (C6579c) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
        }

        /* renamed from: wk */
        public static C6579c m62853wk(g00 g00, zy0 zy0) throws IOException {
            return (C6579c) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
        }

        /* renamed from: xk */
        public static C6579c m62854xk(InputStream inputStream) throws IOException {
            return (C6579c) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: yk */
        public static C6579c m62855yk(InputStream inputStream, zy0 zy0) throws IOException {
            return (C6579c) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
        }

        /* renamed from: zk */
        public static C6579c m62856zk(ByteBuffer byteBuffer) throws nt1 {
            return (C6579c) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: Ek */
        public final void mo43578Ek(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* renamed from: Fk */
        public final void mo43579Fk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.description_ = erVar.mo35543k0();
        }

        /* renamed from: Gk */
        public final void mo43580Gk(String str) {
            str.getClass();
            this.field_ = str;
        }

        /* renamed from: Hk */
        public final void mo43581Hk(C5173er erVar) {
            C7403z0.m72411F9(erVar);
            this.field_ = erVar.mo35543k0();
        }

        /* renamed from: b */
        public C5173er mo43582b() {
            return C5173er.m47136w(this.description_);
        }

        /* renamed from: c */
        public String mo43583c() {
            return this.description_;
        }

        /* renamed from: cc */
        public String mo43584cc() {
            return this.field_;
        }

        /* renamed from: jj */
        public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
            switch (C6577a.f34252a[iVar.ordinal()]) {
                case 1:
                    return new C6579c();
                case 2:
                    return new C6580a((C6577a) null);
                case 3:
                    return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cz2<C6579c> cz2 = PARSER;
                    if (cz2 == null) {
                        synchronized (C6579c.class) {
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

        /* renamed from: mk */
        public final void mo43585mk() {
            this.description_ = m62845ok().mo43583c();
        }

        /* renamed from: nk */
        public final void mo43586nk() {
            this.field_ = m62845ok().mo43584cc();
        }

        /* renamed from: wi */
        public C5173er mo43587wi() {
            return C5173er.m47136w(this.field_);
        }
    }

    /* renamed from: com.onedelhi.secure.qi$d */
    public interface C6581d extends zh2 {
        /* renamed from: b */
        C5173er mo43582b();

        /* renamed from: c */
        String mo43583c();

        /* renamed from: cc */
        String mo43584cc();

        /* renamed from: wi */
        C5173er mo43587wi();
    }

    static {
        C6576qi qiVar = new C6576qi();
        DEFAULT_INSTANCE = qiVar;
        qe1.m62492dk(C6576qi.class, qiVar);
    }

    /* renamed from: Ak */
    public static C6576qi m62786Ak(g00 g00) throws IOException {
        return (C6576qi) qe1.m62476Oj(DEFAULT_INSTANCE, g00);
    }

    /* renamed from: Bk */
    public static C6576qi m62787Bk(g00 g00, zy0 zy0) throws IOException {
        return (C6576qi) qe1.m62477Pj(DEFAULT_INSTANCE, g00, zy0);
    }

    /* renamed from: Ck */
    public static C6576qi m62788Ck(InputStream inputStream) throws IOException {
        return (C6576qi) qe1.m62478Qj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Dk */
    public static C6576qi m62789Dk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6576qi) qe1.m62479Rj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: Ek */
    public static C6576qi m62790Ek(ByteBuffer byteBuffer) throws nt1 {
        return (C6576qi) qe1.m62480Sj(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: Fk */
    public static C6576qi m62791Fk(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return (C6576qi) qe1.m62481Tj(DEFAULT_INSTANCE, byteBuffer, zy0);
    }

    /* renamed from: Gk */
    public static C6576qi m62792Gk(byte[] bArr) throws nt1 {
        return (C6576qi) qe1.m62482Uj(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: Hk */
    public static C6576qi m62793Hk(byte[] bArr, zy0 zy0) throws nt1 {
        return (C6576qi) qe1.m62483Vj(DEFAULT_INSTANCE, bArr, zy0);
    }

    /* renamed from: Ik */
    public static cz2<C6576qi> m62794Ik() {
        return DEFAULT_INSTANCE.mo43348Tc();
    }

    /* renamed from: rk */
    public static C6576qi m62802rk() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: uk */
    public static C6578b m62803uk() {
        return (C6578b) DEFAULT_INSTANCE.mo43357fj();
    }

    /* renamed from: vk */
    public static C6578b m62804vk(C6576qi qiVar) {
        return (C6578b) DEFAULT_INSTANCE.mo43358gj(qiVar);
    }

    /* renamed from: wk */
    public static C6576qi m62805wk(InputStream inputStream) throws IOException {
        return (C6576qi) qe1.m62472Kj(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: xk */
    public static C6576qi m62806xk(InputStream inputStream, zy0 zy0) throws IOException {
        return (C6576qi) qe1.m62473Lj(DEFAULT_INSTANCE, inputStream, zy0);
    }

    /* renamed from: yk */
    public static C6576qi m62807yk(C5173er erVar) throws nt1 {
        return (C6576qi) qe1.m62474Mj(DEFAULT_INSTANCE, erVar);
    }

    /* renamed from: zk */
    public static C6576qi m62808zk(C5173er erVar, zy0 zy0) throws nt1 {
        return (C6576qi) qe1.m62475Nj(DEFAULT_INSTANCE, erVar, zy0);
    }

    /* renamed from: Jd */
    public C6579c mo43557Jd(int i) {
        return this.fieldViolations_.get(i);
    }

    /* renamed from: Jk */
    public final void mo43558Jk(int i) {
        mo43566qk();
        this.fieldViolations_.remove(i);
    }

    /* renamed from: Kk */
    public final void mo43559Kk(int i, C6579c cVar) {
        cVar.getClass();
        mo43566qk();
        this.fieldViolations_.set(i, cVar);
    }

    /* renamed from: Qc */
    public int mo43560Qc() {
        return this.fieldViolations_.size();
    }

    /* renamed from: ea */
    public List<C6579c> mo43561ea() {
        return this.fieldViolations_;
    }

    /* renamed from: jj */
    public final Object mo30548jj(qe1.C6554i iVar, Object obj, Object obj2) {
        switch (C6577a.f34252a[iVar.ordinal()]) {
            case 1:
                return new C6576qi();
            case 2:
                return new C6578b((C6577a) null);
            case 3:
                return qe1.m62469Hj(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", C6579c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cz2<C6576qi> cz2 = PARSER;
                if (cz2 == null) {
                    synchronized (C6576qi.class) {
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

    /* renamed from: mk */
    public final void mo43562mk(Iterable<? extends C6579c> iterable) {
        mo43566qk();
        C7403z0.m72412X6(iterable, this.fieldViolations_);
    }

    /* renamed from: nk */
    public final void mo43563nk(int i, C6579c cVar) {
        cVar.getClass();
        mo43566qk();
        this.fieldViolations_.add(i, cVar);
    }

    /* renamed from: ok */
    public final void mo43564ok(C6579c cVar) {
        cVar.getClass();
        mo43566qk();
        this.fieldViolations_.add(cVar);
    }

    /* renamed from: pk */
    public final void mo43565pk() {
        this.fieldViolations_ = qe1.m62499pj();
    }

    /* renamed from: qk */
    public final void mo43566qk() {
        vs1.C7095k<C6579c> kVar = this.fieldViolations_;
        if (!kVar.mo36500p()) {
            this.fieldViolations_ = qe1.m62468Fj(kVar);
        }
    }

    /* renamed from: sk */
    public C6581d mo43567sk(int i) {
        return this.fieldViolations_.get(i);
    }

    /* renamed from: tk */
    public List<? extends C6581d> mo43568tk() {
        return this.fieldViolations_;
    }
}
